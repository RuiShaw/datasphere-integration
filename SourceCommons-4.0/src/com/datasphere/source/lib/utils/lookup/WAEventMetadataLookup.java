package com.datasphere.source.lib.utils.lookup;

import com.datasphere.event.*;
import com.datasphere.proc.events.*;

import java.util.*;

public class HDEventMetadataLookup extends MetadataLookup
{
    public HDEventMetadataLookup(final String dataToBeLookedUp) {
        super(dataToBeLookedUp);
    }
    
    @Override
    public List<Object> get(final Event event) {
        final HDEvent waEvent = (HDEvent)event;
        if (waEvent.metadata == null) {
            throw new RuntimeException("metadata field of HDEvent to be looked up is not intialized");
        }
        if (!waEvent.metadata.containsKey(this.dataToBeLookedUp)) {
            throw new RuntimeException("metadata field of HDEvent to be looked up doesn't contain specified key " + this.dataToBeLookedUp);
        }
        final List<Object> dataList = new ArrayList<Object>();
        dataList.add(waEvent.metadata.get(this.dataToBeLookedUp));
        return dataList;
    }
}
