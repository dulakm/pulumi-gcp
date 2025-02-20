// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDatasetAccessDatasetDataset {
    /**
     * @return The dataset ID.
     * 
     */
    private String datasetId;
    private String projectId;

    private GetDatasetAccessDatasetDataset() {}
    /**
     * @return The dataset ID.
     * 
     */
    public String datasetId() {
        return this.datasetId;
    }
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetAccessDatasetDataset defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String datasetId;
        private String projectId;
        public Builder() {}
        public Builder(GetDatasetAccessDatasetDataset defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public GetDatasetAccessDatasetDataset build() {
            final var o = new GetDatasetAccessDatasetDataset();
            o.datasetId = datasetId;
            o.projectId = projectId;
            return o;
        }
    }
}
