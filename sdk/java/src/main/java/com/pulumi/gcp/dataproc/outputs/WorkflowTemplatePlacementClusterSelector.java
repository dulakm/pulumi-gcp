// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementClusterSelector {
    /**
     * @return Required. The cluster labels. Cluster must have all labels to match.
     * 
     */
    private Map<String,String> clusterLabels;
    /**
     * @return The zone where workflow process executes. This parameter does not affect the selection of the cluster. If unspecified, the zone of the first cluster matching the selector is used.
     * 
     */
    private @Nullable String zone;

    private WorkflowTemplatePlacementClusterSelector() {}
    /**
     * @return Required. The cluster labels. Cluster must have all labels to match.
     * 
     */
    public Map<String,String> clusterLabels() {
        return this.clusterLabels;
    }
    /**
     * @return The zone where workflow process executes. This parameter does not affect the selection of the cluster. If unspecified, the zone of the first cluster matching the selector is used.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementClusterSelector defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> clusterLabels;
        private @Nullable String zone;
        public Builder() {}
        public Builder(WorkflowTemplatePlacementClusterSelector defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder clusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public WorkflowTemplatePlacementClusterSelector build() {
            final var o = new WorkflowTemplatePlacementClusterSelector();
            o.clusterLabels = clusterLabels;
            o.zone = zone;
            return o;
        }
    }
}
