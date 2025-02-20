// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.projects.outputs.GetOrganizationPolicyListPolicyAllow;
import com.pulumi.gcp.projects.outputs.GetOrganizationPolicyListPolicyDeny;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetOrganizationPolicyListPolicy {
    private List<GetOrganizationPolicyListPolicyAllow> allows;
    private List<GetOrganizationPolicyListPolicyDeny> denies;
    private Boolean inheritFromParent;
    private String suggestedValue;

    private GetOrganizationPolicyListPolicy() {}
    public List<GetOrganizationPolicyListPolicyAllow> allows() {
        return this.allows;
    }
    public List<GetOrganizationPolicyListPolicyDeny> denies() {
        return this.denies;
    }
    public Boolean inheritFromParent() {
        return this.inheritFromParent;
    }
    public String suggestedValue() {
        return this.suggestedValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationPolicyListPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetOrganizationPolicyListPolicyAllow> allows;
        private List<GetOrganizationPolicyListPolicyDeny> denies;
        private Boolean inheritFromParent;
        private String suggestedValue;
        public Builder() {}
        public Builder(GetOrganizationPolicyListPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allows = defaults.allows;
    	      this.denies = defaults.denies;
    	      this.inheritFromParent = defaults.inheritFromParent;
    	      this.suggestedValue = defaults.suggestedValue;
        }

        @CustomType.Setter
        public Builder allows(List<GetOrganizationPolicyListPolicyAllow> allows) {
            this.allows = Objects.requireNonNull(allows);
            return this;
        }
        public Builder allows(GetOrganizationPolicyListPolicyAllow... allows) {
            return allows(List.of(allows));
        }
        @CustomType.Setter
        public Builder denies(List<GetOrganizationPolicyListPolicyDeny> denies) {
            this.denies = Objects.requireNonNull(denies);
            return this;
        }
        public Builder denies(GetOrganizationPolicyListPolicyDeny... denies) {
            return denies(List.of(denies));
        }
        @CustomType.Setter
        public Builder inheritFromParent(Boolean inheritFromParent) {
            this.inheritFromParent = Objects.requireNonNull(inheritFromParent);
            return this;
        }
        @CustomType.Setter
        public Builder suggestedValue(String suggestedValue) {
            this.suggestedValue = Objects.requireNonNull(suggestedValue);
            return this;
        }
        public GetOrganizationPolicyListPolicy build() {
            final var o = new GetOrganizationPolicyListPolicy();
            o.allows = allows;
            o.denies = denies;
            o.inheritFromParent = inheritFromParent;
            o.suggestedValue = suggestedValue;
            return o;
        }
    }
}
