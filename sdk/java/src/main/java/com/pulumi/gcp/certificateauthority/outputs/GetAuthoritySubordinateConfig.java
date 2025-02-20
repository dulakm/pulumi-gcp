// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.certificateauthority.outputs.GetAuthoritySubordinateConfigPemIssuerChain;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAuthoritySubordinateConfig {
    private String certificateAuthority;
    private List<GetAuthoritySubordinateConfigPemIssuerChain> pemIssuerChains;

    private GetAuthoritySubordinateConfig() {}
    public String certificateAuthority() {
        return this.certificateAuthority;
    }
    public List<GetAuthoritySubordinateConfigPemIssuerChain> pemIssuerChains() {
        return this.pemIssuerChains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthoritySubordinateConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String certificateAuthority;
        private List<GetAuthoritySubordinateConfigPemIssuerChain> pemIssuerChains;
        public Builder() {}
        public Builder(GetAuthoritySubordinateConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.pemIssuerChains = defaults.pemIssuerChains;
        }

        @CustomType.Setter
        public Builder certificateAuthority(String certificateAuthority) {
            this.certificateAuthority = Objects.requireNonNull(certificateAuthority);
            return this;
        }
        @CustomType.Setter
        public Builder pemIssuerChains(List<GetAuthoritySubordinateConfigPemIssuerChain> pemIssuerChains) {
            this.pemIssuerChains = Objects.requireNonNull(pemIssuerChains);
            return this;
        }
        public Builder pemIssuerChains(GetAuthoritySubordinateConfigPemIssuerChain... pemIssuerChains) {
            return pemIssuerChains(List.of(pemIssuerChains));
        }
        public GetAuthoritySubordinateConfig build() {
            final var o = new GetAuthoritySubordinateConfig();
            o.certificateAuthority = certificateAuthority;
            o.pemIssuerChains = pemIssuerChains;
            return o;
        }
    }
}
