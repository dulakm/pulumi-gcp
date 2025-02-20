// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BareMetalAdminClusterSecurityConfigAuthorizationAdminUser {
    /**
     * @return The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    private String username;

    private BareMetalAdminClusterSecurityConfigAuthorizationAdminUser() {}
    /**
     * @return The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalAdminClusterSecurityConfigAuthorizationAdminUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String username;
        public Builder() {}
        public Builder(BareMetalAdminClusterSecurityConfigAuthorizationAdminUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public BareMetalAdminClusterSecurityConfigAuthorizationAdminUser build() {
            final var o = new BareMetalAdminClusterSecurityConfigAuthorizationAdminUser();
            o.username = username;
            return o;
        }
    }
}
