// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CaPoolIssuancePolicyAllowedKeyTypeRsa {
    /**
     * @return The maximum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service will not enforce an explicit upper bound on RSA modulus sizes.
     * 
     */
    private @Nullable String maxModulusSize;
    /**
     * @return The minimum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service-level min RSA modulus size will continue to apply.
     * 
     */
    private @Nullable String minModulusSize;

    private CaPoolIssuancePolicyAllowedKeyTypeRsa() {}
    /**
     * @return The maximum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service will not enforce an explicit upper bound on RSA modulus sizes.
     * 
     */
    public Optional<String> maxModulusSize() {
        return Optional.ofNullable(this.maxModulusSize);
    }
    /**
     * @return The minimum allowed RSA modulus size, in bits. If this is not set, or if set to zero, the
     * service-level min RSA modulus size will continue to apply.
     * 
     */
    public Optional<String> minModulusSize() {
        return Optional.ofNullable(this.minModulusSize);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolIssuancePolicyAllowedKeyTypeRsa defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maxModulusSize;
        private @Nullable String minModulusSize;
        public Builder() {}
        public Builder(CaPoolIssuancePolicyAllowedKeyTypeRsa defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxModulusSize = defaults.maxModulusSize;
    	      this.minModulusSize = defaults.minModulusSize;
        }

        @CustomType.Setter
        public Builder maxModulusSize(@Nullable String maxModulusSize) {
            this.maxModulusSize = maxModulusSize;
            return this;
        }
        @CustomType.Setter
        public Builder minModulusSize(@Nullable String minModulusSize) {
            this.minModulusSize = minModulusSize;
            return this;
        }
        public CaPoolIssuancePolicyAllowedKeyTypeRsa build() {
            final var o = new CaPoolIssuancePolicyAllowedKeyTypeRsa();
            o.maxModulusSize = maxModulusSize;
            o.minModulusSize = minModulusSize;
            return o;
        }
    }
}
