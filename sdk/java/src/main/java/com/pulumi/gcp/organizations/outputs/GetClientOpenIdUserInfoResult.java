// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClientOpenIdUserInfoResult {
    /**
     * @return The email of the account used by the provider to authenticate with GCP.
     * 
     */
    private String email;
    private String id;

    private GetClientOpenIdUserInfoResult() {}
    /**
     * @return The email of the account used by the provider to authenticate with GCP.
     * 
     */
    public String email() {
        return this.email;
    }
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientOpenIdUserInfoResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String email;
        private String id;
        public Builder() {}
        public Builder(GetClientOpenIdUserInfoResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetClientOpenIdUserInfoResult build() {
            final var o = new GetClientOpenIdUserInfoResult();
            o.email = email;
            o.id = id;
            return o;
        }
    }
}
