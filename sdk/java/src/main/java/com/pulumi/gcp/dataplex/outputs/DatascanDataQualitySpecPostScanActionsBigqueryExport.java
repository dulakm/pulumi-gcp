// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanDataQualitySpecPostScanActionsBigqueryExport {
    /**
     * @return The BigQuery table to export DataProfileScan results to.
     * Format://bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID
     * 
     */
    private @Nullable String resultsTable;

    private DatascanDataQualitySpecPostScanActionsBigqueryExport() {}
    /**
     * @return The BigQuery table to export DataProfileScan results to.
     * Format://bigquery.googleapis.com/projects/PROJECT_ID/datasets/DATASET_ID/tables/TABLE_ID
     * 
     */
    public Optional<String> resultsTable() {
        return Optional.ofNullable(this.resultsTable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanDataQualitySpecPostScanActionsBigqueryExport defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String resultsTable;
        public Builder() {}
        public Builder(DatascanDataQualitySpecPostScanActionsBigqueryExport defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resultsTable = defaults.resultsTable;
        }

        @CustomType.Setter
        public Builder resultsTable(@Nullable String resultsTable) {
            this.resultsTable = resultsTable;
            return this;
        }
        public DatascanDataQualitySpecPostScanActionsBigqueryExport build() {
            final var o = new DatascanDataQualitySpecPostScanActionsBigqueryExport();
            o.resultsTable = resultsTable;
            return o;
        }
    }
}
