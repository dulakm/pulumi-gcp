// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class VMwareNodePoolNodePoolAutoscaling {
    /**
     * @return Maximum number of replicas in the NodePool.
     * 
     */
    private Integer maxReplicas;
    /**
     * @return Minimum number of replicas in the NodePool.
     * 
     */
    private Integer minReplicas;

    private VMwareNodePoolNodePoolAutoscaling() {}
    /**
     * @return Maximum number of replicas in the NodePool.
     * 
     */
    public Integer maxReplicas() {
        return this.maxReplicas;
    }
    /**
     * @return Minimum number of replicas in the NodePool.
     * 
     */
    public Integer minReplicas() {
        return this.minReplicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareNodePoolNodePoolAutoscaling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxReplicas;
        private Integer minReplicas;
        public Builder() {}
        public Builder(VMwareNodePoolNodePoolAutoscaling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
        }

        @CustomType.Setter
        public Builder maxReplicas(Integer maxReplicas) {
            this.maxReplicas = Objects.requireNonNull(maxReplicas);
            return this;
        }
        @CustomType.Setter
        public Builder minReplicas(Integer minReplicas) {
            this.minReplicas = Objects.requireNonNull(minReplicas);
            return this;
        }
        public VMwareNodePoolNodePoolAutoscaling build() {
            final var o = new VMwareNodePoolNodePoolAutoscaling();
            o.maxReplicas = maxReplicas;
            o.minReplicas = minReplicas;
            return o;
        }
    }
}
