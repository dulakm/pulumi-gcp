// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.iam.outputs.DenyPolicyRuleDenyRule;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DenyPolicyRule {
    /**
     * @return A deny rule in an IAM deny policy.
     * Structure is documented below.
     * 
     */
    private @Nullable DenyPolicyRuleDenyRule denyRule;
    /**
     * @return The description of the rule.
     * 
     */
    private @Nullable String description;

    private DenyPolicyRule() {}
    /**
     * @return A deny rule in an IAM deny policy.
     * Structure is documented below.
     * 
     */
    public Optional<DenyPolicyRuleDenyRule> denyRule() {
        return Optional.ofNullable(this.denyRule);
    }
    /**
     * @return The description of the rule.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DenyPolicyRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DenyPolicyRuleDenyRule denyRule;
        private @Nullable String description;
        public Builder() {}
        public Builder(DenyPolicyRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.denyRule = defaults.denyRule;
    	      this.description = defaults.description;
        }

        @CustomType.Setter
        public Builder denyRule(@Nullable DenyPolicyRuleDenyRule denyRule) {
            this.denyRule = denyRule;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public DenyPolicyRule build() {
            final var o = new DenyPolicyRule();
            o.denyRule = denyRule;
            o.description = description;
            return o;
        }
    }
}
