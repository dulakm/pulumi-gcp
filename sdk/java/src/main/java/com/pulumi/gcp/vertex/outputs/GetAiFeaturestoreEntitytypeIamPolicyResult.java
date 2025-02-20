// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAiFeaturestoreEntitytypeIamPolicyResult {
    private String entitytype;
    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    private String etag;
    private String featurestore;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return (Required only by `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    private String policyData;

    private GetAiFeaturestoreEntitytypeIamPolicyResult() {}
    public String entitytype() {
        return this.entitytype;
    }
    /**
     * @return (Computed) The etag of the IAM policy.
     * 
     */
    public String etag() {
        return this.etag;
    }
    public String featurestore() {
        return this.featurestore;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return (Required only by `gcp.vertex.AiFeatureStoreEntityTypeIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    public String policyData() {
        return this.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAiFeaturestoreEntitytypeIamPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String entitytype;
        private String etag;
        private String featurestore;
        private String id;
        private String policyData;
        public Builder() {}
        public Builder(GetAiFeaturestoreEntitytypeIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entitytype = defaults.entitytype;
    	      this.etag = defaults.etag;
    	      this.featurestore = defaults.featurestore;
    	      this.id = defaults.id;
    	      this.policyData = defaults.policyData;
        }

        @CustomType.Setter
        public Builder entitytype(String entitytype) {
            this.entitytype = Objects.requireNonNull(entitytype);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder featurestore(String featurestore) {
            this.featurestore = Objects.requireNonNull(featurestore);
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
        public GetAiFeaturestoreEntitytypeIamPolicyResult build() {
            final var o = new GetAiFeaturestoreEntitytypeIamPolicyResult();
            o.entitytype = entitytype;
            o.etag = etag;
            o.featurestore = featurestore;
            o.id = id;
            o.policyData = policyData;
            return o;
        }
    }
}
