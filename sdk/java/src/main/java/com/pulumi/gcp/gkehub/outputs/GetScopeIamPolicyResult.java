// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetScopeIamPolicyResult {
    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    private String etag;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Required only by `gcp.gkehub.ScopeIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    private String policyData;
    private String project;
    private String scopeId;

    private GetScopeIamPolicyResult() {}
    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public String etag() {
        return this.etag;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required only by `gcp.gkehub.ScopeIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public String policyData() {
        return this.policyData;
    }
    public String project() {
        return this.project;
    }
    public String scopeId() {
        return this.scopeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetScopeIamPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String etag;
        private String id;
        private String policyData;
        private String project;
        private String scopeId;
        public Builder() {}
        public Builder(GetScopeIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.scopeId = defaults.scopeId;
        }

        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder policyData(String policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder scopeId(String scopeId) {
            this.scopeId = Objects.requireNonNull(scopeId);
            return this;
        }
        public GetScopeIamPolicyResult build() {
            final var o = new GetScopeIamPolicyResult();
            o.etag = etag;
            o.id = id;
            o.policyData = policyData;
            o.project = project;
            o.scopeId = scopeId;
            return o;
        }
    }
}
