// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InboundSamlConfigIdpConfigIdpCertificate {
    /**
     * @return The IdP&#39;s x509 certificate.
     * 
     */
    private @Nullable String x509Certificate;

    private InboundSamlConfigIdpConfigIdpCertificate() {}
    /**
     * @return The IdP&#39;s x509 certificate.
     * 
     */
    public Optional<String> x509Certificate() {
        return Optional.ofNullable(this.x509Certificate);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InboundSamlConfigIdpConfigIdpCertificate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String x509Certificate;
        public Builder() {}
        public Builder(InboundSamlConfigIdpConfigIdpCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.x509Certificate = defaults.x509Certificate;
        }

        @CustomType.Setter
        public Builder x509Certificate(@Nullable String x509Certificate) {
            this.x509Certificate = x509Certificate;
            return this;
        }
        public InboundSamlConfigIdpConfigIdpCertificate build() {
            final var o = new InboundSamlConfigIdpConfigIdpCertificate();
            o.x509Certificate = x509Certificate;
            return o;
        }
    }
}
