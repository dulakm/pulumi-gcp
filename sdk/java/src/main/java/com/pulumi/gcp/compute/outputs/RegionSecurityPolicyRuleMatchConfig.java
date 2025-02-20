// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RegionSecurityPolicyRuleMatchConfig {
    /**
     * @return CIDR IP address range. Maximum number of srcIpRanges allowed is 10.
     * 
     */
    private @Nullable List<String> srcIpRanges;

    private RegionSecurityPolicyRuleMatchConfig() {}
    /**
     * @return CIDR IP address range. Maximum number of srcIpRanges allowed is 10.
     * 
     */
    public List<String> srcIpRanges() {
        return this.srcIpRanges == null ? List.of() : this.srcIpRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionSecurityPolicyRuleMatchConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> srcIpRanges;
        public Builder() {}
        public Builder(RegionSecurityPolicyRuleMatchConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.srcIpRanges = defaults.srcIpRanges;
        }

        @CustomType.Setter
        public Builder srcIpRanges(@Nullable List<String> srcIpRanges) {
            this.srcIpRanges = srcIpRanges;
            return this;
        }
        public Builder srcIpRanges(String... srcIpRanges) {
            return srcIpRanges(List.of(srcIpRanges));
        }
        public RegionSecurityPolicyRuleMatchConfig build() {
            final var o = new RegionSecurityPolicyRuleMatchConfig();
            o.srcIpRanges = srcIpRanges;
            return o;
        }
    }
}
