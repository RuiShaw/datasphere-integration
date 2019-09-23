package com.datasphere.hdstore.constants;

public final class Constants
{
    public static final String JAVA_TYPE_BYTE = "byte";
    public static final String JAVA_TYPE_BYTE_NULLABLE = "java.lang.Byte";
    public static final String JAVA_TYPE_SHORT = "short";
    public static final String JAVA_TYPE_SHORT_NULLABLE = "java.lang.Short";
    public static final String JAVA_TYPE_INTEGER = "int";
    public static final String JAVA_TYPE_INTEGER_NULLABLE = "java.lang.Integer";
    public static final String JAVA_TYPE_LONG = "long";
    public static final String JAVA_TYPE_LONG_NULLABLE = "java.lang.Long";
    public static final String JAVA_TYPE_FLOAT = "float";
    public static final String JAVA_TYPE_FLOAT_NULLABLE = "java.lang.Float";
    public static final String JAVA_TYPE_DOUBLE = "double";
    public static final String JAVA_TYPE_DOUBLE_NULLABLE = "java.lang.Double";
    public static final String JAVA_TYPE_NUMBER_NULLABLE = "java.lang.Number";
    public static final String JAVA_TYPE_BOOLEAN = "boolean";
    public static final String JAVA_TYPE_BOOLEAN_NULLABLE = "java.lang.Boolean";
    public static final String JAVA_TYPE_STRING = "string";
    public static final String JAVA_TYPE_STRING_NULLABLE = "java.lang.String";
    public static final String JAVA_TYPE_DATETIME = "datetime";
    public static final String JAVA_TYPE_DATETIME_NULLABLE = "org.joda.time.DateTime";
    public static final String JSON_SCHEMA_TAG = "$schema";
    public static final String JSON_SCHEMA_LEVEL = "http://json-schema.org/draft-04/schema#";
    public static final String JSON_SCHEMA_TITLE = "title";
    public static final String JSON_SCHEMA_TYPE = "type";
    public static final String JSON_SCHEMA_TYPE_ARRAY = "array";
    public static final String JSON_SCHEMA_TYPE_BOOLEAN = "boolean";
    public static final String JSON_SCHEMA_TYPE_INTEGER = "integer";
    public static final String JSON_SCHEMA_TYPE_NULL = "null";
    public static final String JSON_SCHEMA_TYPE_NUMBER = "number";
    public static final String JSON_SCHEMA_TYPE_OBJECT = "object";
    public static final String JSON_SCHEMA_TYPE_STRING = "string";
    public static final String JSON_SCHEMA_PROPERTIES = "properties";
    public static final String JSON_SCHEMA_ITEMS = "items";
    public static final String JSON_SCHEMA_REQUIRED = "required";
    public static final String JSON_SCHEMA_ADDITIONAL = "additionalProperties";
    public static final String HDSTORE_SCHEMA_NAME = "/HDStore.json";
    public static final String HDSTORE_QUERY_SCHEMA_NAME = "/HDStoreQuery.json";
    public static final char HDSTORE_TYPENAME_SEPARATOR = ':';
    public static final char HDSTORE_NAME_SEPARATOR = '.';
    public static final String HD_CONTEXT = "context";
    public static final String HD_CONTEXT_NAME = "name";
    public static final String HD_CONTEXT_TYPE = "type";
    public static final String HD_CONTEXT_INDEX = "index";
    public static final String HD_CONTEXT_NULLABLE = "nullable";
    public static final String HD_METADATA = "metadata";
    public static final String HD_METADATA_ID = "id";
    public static final String HD_METADATA_CHECKPOINT_ID = "checkpoint";
    public static final String HD_METADATA_ANY = "any";
    public static final String HD_EVENT_TYPES = "events";
    public static final String HD_EVENT_NAME = "name";
    public static final String HD_EVENT_TYPE = "type";
    public static final String HD_TYPE_STRING = "string";
    public static final String HD_TYPE_TEXT = "text";
    public static final String HD_TYPE_BINARY = "binary64";
    public static final String HD_TYPE_BOOLEAN = "boolean";
    public static final String HD_TYPE_INTEGER = "integer";
    public static final String HD_TYPE_LONG = "long";
    public static final String HD_TYPE_DOUBLE = "double";
    public static final String HD_TYPE_DATE = "date";
    public static final String HD_TYPE_TIME = "time";
    public static final String HD_TYPE_DATETIME = "datetime";
    public static final String HD_CONTEXT_ID = "$id";
    public static final String HD_CONTEXT_TIMESTAMP = "$timestamp";
    public static final String HD_CONTEXT_NODE_NAME = "$node_name";
    public static final String HD_CONTEXT_CHECKPOINT_SEQ = "$checkpoint";
    public static final String ES_PROPERTIES = "properties";
    public static final String ES_TYPE = "type";
    public static final String ES_TYPE_TEXT = "text";
    public static final String ES_TYPE_KEYWORD = "keyword";
    public static final String ES_INDEX_VALUE = "true";
    public static final String ES_TYPE_BINARY = "binary";
    public static final String ES_TYPE_BOOLEAN = "boolean";
    public static final String ES_TYPE_INTEGER = "integer";
    public static final String ES_TYPE_LONG = "long";
    public static final String ES_TYPE_DOUBLE = "double";
    public static final String ES_TYPE_DATE = "date";
    public static final String ES_TYPE_NESTED = "nested";
    public static final String ES_COLUMN_INDEX = "index";
    public static final String ES_DATE_FORMAT = "format";
    public static final String ES_DATE_FORMAT_DATE = "basic_date";
    public static final String ES_DATE_FORMAT_TIME = "basic_time";
    public static final String ES_DATE_FORMAT_DATETIME = "basic_date_time || epoch_millis";
    public static final String ES_METADATA_ID = "_id";
    public static final String ES_METADATA_PATH = "path";
    public static final String ES_METADATA_ALL = "_all";
    public static final String ES_ATTRIBUTE_ANY = "_all";
    public static final String ES_METADATA_CHECKPOINT_SEQ_TYPE = "long";
    public static final String ES_LOCAL_CLUSTER_NAME = "<Local>";
    public static final int ES_DEFAULT_PORT = 9300;
    public static final String ES_SETTING_CLUSTER_SNIFF = "client.transport.sniff";
    public static final String ES_SETTING_CLUSTER_NAME = "cluster.name";
    public static final String ES_SETTING_PATH_DATA = "path.data";
    public static final String ES_SETTING_REINDEX_WHITELIST = "reindex.remote.whitelist";
    public static final String ES_SETTING_DEFAULT_PATH_HOME = "./elasticsearch";
    public static final String ES_SETTING_PATH_HOME = "path.home";
    public static final String ES_SETTING_NODE_NAME = "node.name";
    public static final String ES_SETTING_NETWORK_HOST = "network.host";
    public static final String ES_SETTING_INDEX_REPLICAS = "number_of_replicas";
    public static final String ES_SETTING_MERGE_THREAD_COUNT = "index.merge.scheduler.max_thread_count";
    public static final String ES_SETTING_INDEX_REFRESH_INTERVAL = "index.refresh_interval";
    public static final String ES_SETTING_FLUSH_SIZE = "index.translog.flush_threshold_size";
    public static final String ES_SETTING_INDEX_SHARDS = "number_of_shards";
    public static final String ES_SETTING_INDEX_STORE_TYPE = "index.store.type";
    public static final String ES_SETTING_INDEX_TIME_TO_LIVE = "_ttl";
    public static final String ES_SETTING_UNICAST_HOSTS = "discovery.zen.ping.unicast.hosts";
    public static final String ES_SETTING_TRANSPORT_TYPE = "transport.type";
    public static final String ES_SETTING_HTTP_ENABLED = "http.enabled";
    public static final String ES_SETTING_HTTP_TYPE = "http.type";
    public static final String ES_INDEX_STORE_TYPE_MEMORY = "memory";
    public static final String ES_INDEX_STORE_TYPE_DISK = "fs";
    public static final String ES_MAX_LOCAL_STORAGE_NODES = "node.max_local_storage_nodes";
    public static final int ES_ALL_RESULTS = Integer.MAX_VALUE;
    public static final String QUERY_ATTRIBUTE = "attr";
    public static final String QUERY_FEATURE_SELECT = "select";
    public static final String QUERY_FEATURE_DELETE = "delete";
    public static final String QUERY_SELECT_ALL = "*";
    public static final String QUERY_DELETE_ALL = "*";
    public static final String QUERY_ATTRIBUTE_ANY = "*any";
    public static final String QUERY_FEATURE_FROM = "from";
    public static final String QUERY_FEATURE_WHERE = "where";
    public static final String QUERY_WHERE_AND = "and";
    public static final String QUERY_WHERE_OR = "or";
    public static final String QUERY_WHERE_NOT = "not";
    public static final String QUERY_WHERE_OPER = "oper";
    public static final String QUERY_WHERE_GT = "gt";
    public static final String QUERY_WHERE_LT = "lt";
    public static final String QUERY_WHERE_GTE = "gte";
    public static final String QUERY_WHERE_LTE = "lte";
    public static final String QUERY_WHERE_EQ = "eq";
    public static final String QUERY_WHERE_NEQ = "neq";
    public static final String QUERY_WHERE_LIKE = "like";
    public static final String QUERY_WHERE_REGEX = "regex";
    public static final String QUERY_WHERE_BETWEEN = "between";
    public static final String QUERY_WHERE_IN_SET = "in";
    public static final String QUERY_WHERE_VALUE = "value";
    public static final String QUERY_WHERE_VALUES = "values";
    public static final String QUERY_FEATURE_ORDER_BY = "orderby";
    public static final String QUERY_ORDER_BY_ASCENDING = "ascending";
    public static final String QUERY_FEATURE_GROUP_BY = "groupby";
    public static final String QUERY_FEATURE_HAVING = "having";
    public static final String QUERY_FUNCTION_MIN = "min";
    public static final String QUERY_FUNCTION_MAX = "max";
    public static final String QUERY_FUNCTION_COUNT = "count";
    public static final String QUERY_FUNCTION_SUM = "sum";
    public static final String QUERY_FUNCTION_AVG = "avg";
    public static final String QUERY_FUNCTION_FIRST = "first";
    public static final String QUERY_FUNCTION_LAST = "last";
    public static final char AGGREGATION_SEPARATOR = ':';
    public static final String STATEMENT_RESULT = "Result";
    public static final String BACKGROUND_TASK_NAME_FORMAT = "BackgroundTask-%s-%s";
    public static final char PROVIDER_NAME_SEPARATOR = '.';
    public static final char INSTANCE_NAME_SEPARATOR = '$';
    public static final String ES_SCROLL_SIZE_PROPERTY = "com.datasphere.config.elasticsearch.scrollsize";
    public static final String ES_HTTP_ENABLED_PROPERTY = "com.datasphere.config.es.http.enabled";
    public static final String INTERNAL_NAMESPACE_NAME = "$Internal";
    public static final String INTERNAL_CHECKPOINT_NAME = "$Internal.CHECKPOINT";
    public static final String INTERNAL_MONITORING_NAME = "$Internal.MONITORING";
    public static final String INTERNAL_HEALTH_NAME = "$Internal.HEALTH";
    public static final String HDSTORE_PROVIDER_NAME = "storageProvider";
    public static final String HDSTORE_PROVIDER_ELASTICSEARCH = "elasticsearch";
    public static final String HDSTORE_PROVIDER_HD_ELASTICSEARCH = "hd_elasticsearch";
    public static final String HDSTORE_RELAX_SCHEMA = "elasticsearch.relax_schema";
    public static final String HDSTORE_DEFAULT_PROVIDER = "elasticsearch";
    public static final String HDSTORE_PROVIDER_JDBC = "jdbc";
    public static final String HDSTORE_PROVIDER_INMEMORY = "inmemory";
    public static final String HDSTORE_UNKNOWN_PROVIDER = "<Unknown>";
    public static final String HDSTORE_JDBC_INTERVAL = "persistence_interval";
    public static final String HDSTORE_JDBC_INTERVAL_REGEX = "(\\s*)([0-9]+)(\\s+)(sec.*|min.*)";
    public static final String ELASTICSEARCH_CLUSTER_NAME = "elasticsearch.cluster_name";
    public static final String ELASTICSEARCH_DATA_PATH = "elasticsearch.data_path";
    public static final String ELASTICSEARCH_HOME_PATH = "elasticsearch.home_path";
    public static final String ELASTICSEARCH_REPLICAS = "elasticsearch.replicas";
    public static final String ELASTICSEARCH_INDEX_REFRESH_INTERVAL = "elasticsearch.refresh_interval";
    public static final String ELASTICSEARCH_INDEX_FLUSH_SIZE = "elasticsearch.flush_size";
    public static final String ELASTICSEARCH_INDEX_MERGE_NUM_THREADS = "elasticsearch.merge_num_threads";
    public static final String ELASTICSEARCH_SHARDS = "elasticsearch.shards";
    public static final String ELASTICSEARCH_STORAGE_TYPE = "elasticsearch.storage_type";
    public static final String ELASTICSEARCH_STORAGE_TYPE_ANY = "any";
    public static final String ELASTICSEARCH_STORAGE_TYPE_DISK = "disk";
    public static final String ELASTICSEARCH_STORAGE_TYPE_MEMORY = "memory";
    public static final String ELASTICSEARCH_MAX_LOCAL_STORAGE_NODES = "elasticsearch.max_local_storage_nodes";
    public static final String ELASTICSEARCH_TIME_TO_LIVE = "elasticsearch.time_to_live";
    public static final String ELASTICSEARCH_INTIAL_TIME_TO_WAIT_UNTIL_INDEX_IS_READY_STRING;
    public static final long ELASTICSEARCH_INTIAL_TIME_TO_WAIT_UNTIL_INDEX_IS_READY;
    public static final String HD_ES_TIME_TO_LIVE = "hd_elasticsearch.time_to_live";
    public static final String SEARCH_ALIAS = "search_alias_";
    public static final String IsEsRollingIndexEnabled;
    public static final String ELASTICSEARCH_ROLLING_INDEX_DELIMITER = "%";
    public static final String CHECKPOINT_ID = "$id";
    public static final String CHECKPOINT_TIMESTAMP = "$timestamp";
    public static final String CHECKPOINT_NODE_NAME = "NodeName";
    public static final String CHECKPOINT_HDSTORE_NAME = "HDStoreName";
    public static final String CHECKPOINT_HD_COUNT = "HDCount";
    public static final String CHECKPOINT_PATH_COUNT = "PathCount";
    public static final String CHECKPOINT_PATHS = "Paths";
    public static final String CHECKPOINT_HASH_ALGORITHM = "MD5";
    public static final String CHECKPOINT_SCHEMA = "{  \"context\": [     { \"name\": \"$id\", \"type\": \"string\", \"nullable\": false },    { \"name\": \"$timestamp\", \"type\": \"datetime\", \"nullable\": false },    { \"name\": \"NodeName\", \"type\": \"string\", \"nullable\": false },    { \"name\": \"HDStoreName\", \"type\": \"string\", \"nullable\": false },    { \"name\": \"HDCount\", \"type\": \"long\", \"nullable\": false },    { \"name\": \"PathCount\", \"type\": \"long\", \"nullable\": false },    { \"name\": \"Paths\", \"type\": \"binary64\", \"nullable\": false }  ],  \"metadata\": [ \"id\" ]}";
    public static final String CHECKPOINT_QUERY = "{ \"select\":[ \"Paths\" ],  \"from\":  [ \"$Internal.CHECKPOINT\" ],  \"where\":   { \"oper\": \"eq\",    \"attr\": \"HDStoreName\",    \"value\": \"%s\" } },  \"orderby\": [    { \"attr\": \"$timestamp\", \"ascending\": true }  ]}";
    public static final String CHECKPOINT_TIMESTAMP_QUERY = "{ \"select\":[ \"$timestamp\" ],  \"from\":  [ \"$Internal.CHECKPOINT\" ],  \"where\": {     \"and\": [    { \"oper\": \"eq\",      \"attr\": \"NodeName\",      \"value\": \"%s\" },    { \"oper\": \"eq\",      \"attr\": \"HDStoreName\",      \"value\": \"%s\" }    ]  },  \"orderby\": [    { \"attr\": \"$timestamp\", \"ascending\": false }  ]}";
    public static final String CHECKPOINT_DELETE = "{ \"delete\": [ \"*\" ],  \"from\":  [ \"$Internal.CHECKPOINT\" ],  \"where\": {     \"oper\": \"eq\",    \"attr\": \"HDStoreName\",    \"value\": \"%s\" }}";
    public static final String INVALID_HD_DELETE = "{ \"delete\": [ \"*\" ],  \"from\":  [ \"%s\" ],  \"where\": {     \"and\": [    { \"oper\": \"eq\",      \"attr\": \"$node_name\",      \"value\": \"%s\" },    { \"oper\": \"gt\",      \"attr\": \"$checkpoint\",      \"value\": %d }    ]  }}";
    
    static {
        ELASTICSEARCH_INTIAL_TIME_TO_WAIT_UNTIL_INDEX_IS_READY_STRING = System.getProperty("com.datasphere.config.ESIndexWaitTimeForRecovery", "2");
        ELASTICSEARCH_INTIAL_TIME_TO_WAIT_UNTIL_INDEX_IS_READY = Long.valueOf(Constants.ELASTICSEARCH_INTIAL_TIME_TO_WAIT_UNTIL_INDEX_IS_READY_STRING);
        IsEsRollingIndexEnabled = System.getProperty("com.datasphere.config.isRollingIndexEnabled", "true");
    }
}
