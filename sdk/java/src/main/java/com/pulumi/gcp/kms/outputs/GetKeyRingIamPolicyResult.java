// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKeyRingIamPolicyResult {
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
    private String keyRingId;
    /**
     * @return (Computed) The policy data
     * 
     */
    private String policyData;

    private GetKeyRingIamPolicyResult() {}
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
    public String keyRingId() {
        return this.keyRingId;
    }
    /**
     * @return (Computed) The policy data
     * 
     */
    public String policyData() {
        return this.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyRingIamPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String etag;
        private String id;
        private String keyRingId;
        private String policyData;
        public Builder() {}
        public Builder(GetKeyRingIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.keyRingId = defaults.keyRingId;
    	      this.policyData = defaults.policyData;
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
        public Builder keyRingId(String keyRingId) {
            this.keyRingId = Objects.requireNonNull(keyRingId);
            return this;
        }
        @CustomType.Setter
        public Builder policyData(String policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }
        public GetKeyRingIamPolicyResult build() {
            final var o = new GetKeyRingIamPolicyResult();
            o.etag = etag;
            o.id = id;
            o.keyRingId = keyRingId;
            o.policyData = policyData;
            return o;
        }
    }
}
