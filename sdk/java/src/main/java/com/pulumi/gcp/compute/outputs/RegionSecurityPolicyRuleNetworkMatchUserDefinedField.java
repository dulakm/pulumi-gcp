// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RegionSecurityPolicyRuleNetworkMatchUserDefinedField {
    /**
     * @return Name of the user-defined field, as given in the definition.
     * 
     */
    private @Nullable String name;
    /**
     * @return Matching values of the field. Each element can be a 32-bit unsigned decimal or hexadecimal (starting with &#34;0x&#34;) number (e.g. &#34;64&#34;) or range (e.g. &#34;0x400-0x7ff&#34;).
     * 
     */
    private @Nullable List<String> values;

    private RegionSecurityPolicyRuleNetworkMatchUserDefinedField() {}
    /**
     * @return Name of the user-defined field, as given in the definition.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Matching values of the field. Each element can be a 32-bit unsigned decimal or hexadecimal (starting with &#34;0x&#34;) number (e.g. &#34;64&#34;) or range (e.g. &#34;0x400-0x7ff&#34;).
     * 
     */
    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSecurityPolicyRuleNetworkMatchUserDefinedField defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<String> values;
        public Builder() {}
        public Builder(RegionSecurityPolicyRuleNetworkMatchUserDefinedField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public RegionSecurityPolicyRuleNetworkMatchUserDefinedField build() {
            final var o = new RegionSecurityPolicyRuleNetworkMatchUserDefinedField();
            o.name = name;
            o.values = values;
            return o;
        }
    }
}
