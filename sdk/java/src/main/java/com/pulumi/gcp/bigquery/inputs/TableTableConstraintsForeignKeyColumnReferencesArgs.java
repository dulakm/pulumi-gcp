// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TableTableConstraintsForeignKeyColumnReferencesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableTableConstraintsForeignKeyColumnReferencesArgs Empty = new TableTableConstraintsForeignKeyColumnReferencesArgs();

    /**
     * The column in the primary key that are
     * referenced by the referencingColumn
     * 
     */
    @Import(name="referencedColumn", required=true)
    private Output<String> referencedColumn;

    /**
     * @return The column in the primary key that are
     * referenced by the referencingColumn
     * 
     */
    public Output<String> referencedColumn() {
        return this.referencedColumn;
    }

    /**
     * The column that composes the foreign key.
     * 
     */
    @Import(name="referencingColumn", required=true)
    private Output<String> referencingColumn;

    /**
     * @return The column that composes the foreign key.
     * 
     */
    public Output<String> referencingColumn() {
        return this.referencingColumn;
    }

    private TableTableConstraintsForeignKeyColumnReferencesArgs() {}

    private TableTableConstraintsForeignKeyColumnReferencesArgs(TableTableConstraintsForeignKeyColumnReferencesArgs $) {
        this.referencedColumn = $.referencedColumn;
        this.referencingColumn = $.referencingColumn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableTableConstraintsForeignKeyColumnReferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableTableConstraintsForeignKeyColumnReferencesArgs $;

        public Builder() {
            $ = new TableTableConstraintsForeignKeyColumnReferencesArgs();
        }

        public Builder(TableTableConstraintsForeignKeyColumnReferencesArgs defaults) {
            $ = new TableTableConstraintsForeignKeyColumnReferencesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param referencedColumn The column in the primary key that are
         * referenced by the referencingColumn
         * 
         * @return builder
         * 
         */
        public Builder referencedColumn(Output<String> referencedColumn) {
            $.referencedColumn = referencedColumn;
            return this;
        }

        /**
         * @param referencedColumn The column in the primary key that are
         * referenced by the referencingColumn
         * 
         * @return builder
         * 
         */
        public Builder referencedColumn(String referencedColumn) {
            return referencedColumn(Output.of(referencedColumn));
        }

        /**
         * @param referencingColumn The column that composes the foreign key.
         * 
         * @return builder
         * 
         */
        public Builder referencingColumn(Output<String> referencingColumn) {
            $.referencingColumn = referencingColumn;
            return this;
        }

        /**
         * @param referencingColumn The column that composes the foreign key.
         * 
         * @return builder
         * 
         */
        public Builder referencingColumn(String referencingColumn) {
            return referencingColumn(Output.of(referencingColumn));
        }

        public TableTableConstraintsForeignKeyColumnReferencesArgs build() {
            $.referencedColumn = Objects.requireNonNull($.referencedColumn, "expected parameter 'referencedColumn' to be non-null");
            $.referencingColumn = Objects.requireNonNull($.referencingColumn, "expected parameter 'referencingColumn' to be non-null");
            return $;
        }
    }

}
