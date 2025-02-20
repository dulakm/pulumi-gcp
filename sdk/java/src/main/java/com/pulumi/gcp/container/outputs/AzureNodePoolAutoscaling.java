// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class AzureNodePoolAutoscaling {
    /**
     * @return Maximum number of nodes in the node pool. Must be &gt;= min_node_count.
     * 
     */
    private Integer maxNodeCount;
    /**
     * @return Minimum number of nodes in the node pool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    private Integer minNodeCount;

    private AzureNodePoolAutoscaling() {}
    /**
     * @return Maximum number of nodes in the node pool. Must be &gt;= min_node_count.
     * 
     */
    public Integer maxNodeCount() {
        return this.maxNodeCount;
    }
    /**
     * @return Minimum number of nodes in the node pool. Must be &gt;= 1 and &lt;= max_node_count.
     * 
     */
    public Integer minNodeCount() {
        return this.minNodeCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolAutoscaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxNodeCount;
        private Integer minNodeCount;
        public Builder() {}
        public Builder(AzureNodePoolAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxNodeCount = defaults.maxNodeCount;
    	      this.minNodeCount = defaults.minNodeCount;
        }

        @CustomType.Setter
        public Builder maxNodeCount(Integer maxNodeCount) {
            this.maxNodeCount = Objects.requireNonNull(maxNodeCount);
            return this;
        }
        @CustomType.Setter
        public Builder minNodeCount(Integer minNodeCount) {
            this.minNodeCount = Objects.requireNonNull(minNodeCount);
            return this;
        }
        public AzureNodePoolAutoscaling build() {
            final var o = new AzureNodePoolAutoscaling();
            o.maxNodeCount = maxNodeCount;
            o.minNodeCount = minNodeCount;
            return o;
        }
    }
}
