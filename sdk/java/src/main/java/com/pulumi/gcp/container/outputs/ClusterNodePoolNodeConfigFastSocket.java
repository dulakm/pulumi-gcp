// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ClusterNodePoolNodeConfigFastSocket {
    /**
     * @return Whether or not the NCCL Fast Socket is enabled
     * 
     */
    private Boolean enabled;

    private ClusterNodePoolNodeConfigFastSocket() {}
    /**
     * @return Whether or not the NCCL Fast Socket is enabled
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolNodeConfigFastSocket defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(ClusterNodePoolNodeConfigFastSocket defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public ClusterNodePoolNodeConfigFastSocket build() {
            final var o = new ClusterNodePoolNodeConfigFastSocket();
            o.enabled = enabled;
            return o;
        }
    }
}
