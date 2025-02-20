// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datastream.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.datastream.outputs.StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumn;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable {
    /**
     * @return MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * Structure is documented below.
     * 
     */
    private @Nullable List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumn> mysqlColumns;
    /**
     * @return Table name.
     * 
     */
    private String table;

    private StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable() {}
    /**
     * @return MySQL columns in the schema. When unspecified as part of include/exclude objects, includes/excludes everything.
     * Structure is documented below.
     * 
     */
    public List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumn> mysqlColumns() {
        return this.mysqlColumns == null ? List.of() : this.mysqlColumns;
    }
    /**
     * @return Table name.
     * 
     */
    public String table() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumn> mysqlColumns;
        private String table;
        public Builder() {}
        public Builder(StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlColumns = defaults.mysqlColumns;
    	      this.table = defaults.table;
        }

        @CustomType.Setter
        public Builder mysqlColumns(@Nullable List<StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumn> mysqlColumns) {
            this.mysqlColumns = mysqlColumns;
            return this;
        }
        public Builder mysqlColumns(StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTableMysqlColumn... mysqlColumns) {
            return mysqlColumns(List.of(mysqlColumns));
        }
        @CustomType.Setter
        public Builder table(String table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }
        public StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable build() {
            final var o = new StreamBackfillAllMysqlExcludedObjectsMysqlDatabaseMysqlTable();
            o.mysqlColumns = mysqlColumns;
            o.table = table;
            return o;
        }
    }
}
