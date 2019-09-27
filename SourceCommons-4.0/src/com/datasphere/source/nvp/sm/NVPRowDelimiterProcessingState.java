package com.datasphere.source.nvp.sm;

import com.datasphere.source.lib.constant.*;
import com.datasphere.source.lib.prop.*;
import com.datasphere.source.nvp.*;

public class NVPRowDelimiterProcessingState extends NVPDelimiterProcessingState
{
    int length;
    byte[] tmp;
    Delimiter[] delimiterList;
    Delimiter matchedDelimiter;
    
    public NVPRowDelimiterProcessingState(final NVPStateMachine stateMachine, final NVPProperty prop) {
        super(stateMachine, prop);
        final String[] rList = prop.nvprecorddelimiter;
        this.delimiterList = new Delimiter[rList.length];
        for (int idx = 0; idx < rList.length; ++idx) {
            this.delimiterList[idx] = new Delimiter(rList[idx]);
        }
    }
    
    @Override
    public Constant.status process(final char inputChar) {
        boolean delimiterFound = false;
        boolean doneWithValidation = false;
        for (int idx = 0; idx < this.delimiterList.length; ++idx) {
            if (this.delimiterList[idx].compare(inputChar) && this.delimiterList[idx].isCompleted()) {
                doneWithValidation = true;
                if (this.delimiterList[idx].isMatched()) {
                    delimiterFound = true;
                    this.matchedDelimiter = this.delimiterList[idx];
                    break;
                }
            }
        }
        for (int idx = 0; idx < this.delimiterList.length; ++idx) {
            this.delimiterList[idx].reset(false);
        }
        if (doneWithValidation) {
            if (delimiterFound) {
                for (int idx = 0; idx < this.delimiterList.length; ++idx) {
                    this.delimiterList[idx].reset(true);
                }
                if (this.stateMachine.currentState == this.stateMachine.getSpecialState()) {
                    if (this.stateMachine.getDelimiterProcessingState().hasEventTobePublished()) {
                        this.stateMachine.eventQueue.add(Constant.status.END_OF_COLUMN);
                    }
                    this.stateMachine.eventQueue.add(Constant.status.END_OF_ROW);
                    return Constant.status.MULTIPLE_STATUS;
                }
                this.stateMachine.setCurrentState(this.stateMachine.previousState);
                return this.getStatusToPublish();
            }
            else {
                if (this.isCanAcceptanaceCheck) {
                    this.isCanAcceptanaceCheck = false;
                    return Constant.status.NOT_ACCEPTED;
                }
                this.stateMachine.setCurrentState(this.stateMachine.previousState);
                return Constant.status.NORMAL;
            }
        }
        else {
            if (this.isCanAcceptanaceCheck) {
                this.isCanAcceptanaceCheck = false;
                return Constant.status.NOT_ACCEPTED;
            }
            this.stateMachine.setCurrentState(this.stateMachine.getStartState());
            return Constant.status.NORMAL;
        }
    }
    
    @Override
    public Constant.status getStatusToPublish() {
        return Constant.status.END_OF_ROW;
    }
    
    @Override
    public int getMatchedDelimiterLength() {
        return this.matchedDelimiter.length();
    }
    
    public boolean isEscapeSequence() {
        return false;
    }
}
