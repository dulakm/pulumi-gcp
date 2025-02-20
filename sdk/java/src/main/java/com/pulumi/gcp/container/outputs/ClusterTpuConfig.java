// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterTpuConfig {
    /**
     * @return Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
     * 
     */
    private Boolean enabled;
    private @Nullable String ipv4CidrBlock;
    private @Nullable Boolean useServiceNetworking;

    private ClusterTpuConfig() {}
    /**
     * @return Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    public Optional<String> ipv4CidrBlock() {
        return Optional.ofNullable(this.ipv4CidrBlock);
    }
    public Optional<Boolean> useServiceNetworking() {
        return Optional.ofNullable(this.useServiceNetworking);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterTpuConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable String ipv4CidrBlock;
        private @Nullable Boolean useServiceNetworking;
        public Builder() {}
        public Builder(ClusterTpuConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.ipv4CidrBlock = defaults.ipv4CidrBlock;
    	      this.useServiceNetworking = defaults.useServiceNetworking;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4CidrBlock(@Nullable String ipv4CidrBlock) {
            this.ipv4CidrBlock = ipv4CidrBlock;
            return this;
        }
        @CustomType.Setter
        public Builder useServiceNetworking(@Nullable Boolean useServiceNetworking) {
            this.useServiceNetworking = useServiceNetworking;
            return this;
        }
        public ClusterTpuConfig build() {
            final var o = new ClusterTpuConfig();
            o.enabled = enabled;
            o.ipv4CidrBlock = ipv4CidrBlock;
            o.useServiceNetworking = useServiceNetworking;
            return o;
        }
    }
}
