// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ClusterNodeConfigFastSocketArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodeConfigFastSocketArgs Empty = new ClusterNodeConfigFastSocketArgs();

    /**
     * Whether or not the NCCL Fast Socket is enabled
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether or not the NCCL Fast Socket is enabled
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private ClusterNodeConfigFastSocketArgs() {}

    private ClusterNodeConfigFastSocketArgs(ClusterNodeConfigFastSocketArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodeConfigFastSocketArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodeConfigFastSocketArgs $;

        public Builder() {
            $ = new ClusterNodeConfigFastSocketArgs();
        }

        public Builder(ClusterNodeConfigFastSocketArgs defaults) {
            $ = new ClusterNodeConfigFastSocketArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether or not the NCCL Fast Socket is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether or not the NCCL Fast Socket is enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public ClusterNodeConfigFastSocketArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
