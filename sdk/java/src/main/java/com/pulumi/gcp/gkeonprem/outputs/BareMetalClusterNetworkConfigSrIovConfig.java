// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalClusterNetworkConfigSrIovConfig {
    /**
     * @return Whether to install the SR-IOV operator.
     * 
     */
    private @Nullable Boolean enabled;

    private BareMetalClusterNetworkConfigSrIovConfig() {}
    /**
     * @return Whether to install the SR-IOV operator.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalClusterNetworkConfigSrIovConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(BareMetalClusterNetworkConfigSrIovConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public BareMetalClusterNetworkConfigSrIovConfig build() {
            final var o = new BareMetalClusterNetworkConfigSrIovConfig();
            o.enabled = enabled;
            return o;
        }
    }
}
