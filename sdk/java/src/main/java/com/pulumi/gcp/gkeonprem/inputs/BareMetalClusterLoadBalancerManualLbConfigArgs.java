// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class BareMetalClusterLoadBalancerManualLbConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalClusterLoadBalancerManualLbConfigArgs Empty = new BareMetalClusterLoadBalancerManualLbConfigArgs();

    /**
     * Whether manual load balancing is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether manual load balancing is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    private BareMetalClusterLoadBalancerManualLbConfigArgs() {}

    private BareMetalClusterLoadBalancerManualLbConfigArgs(BareMetalClusterLoadBalancerManualLbConfigArgs $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalClusterLoadBalancerManualLbConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalClusterLoadBalancerManualLbConfigArgs $;

        public Builder() {
            $ = new BareMetalClusterLoadBalancerManualLbConfigArgs();
        }

        public Builder(BareMetalClusterLoadBalancerManualLbConfigArgs defaults) {
            $ = new BareMetalClusterLoadBalancerManualLbConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether manual load balancing is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether manual load balancing is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public BareMetalClusterLoadBalancerManualLbConfigArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
