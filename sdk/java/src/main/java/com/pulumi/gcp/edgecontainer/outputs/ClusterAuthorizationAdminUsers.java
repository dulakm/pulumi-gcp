// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterAuthorizationAdminUsers {
    /**
     * @return An active Google username.
     * 
     * ***
     * 
     */
    private String username;

    private ClusterAuthorizationAdminUsers() {}
    /**
     * @return An active Google username.
     * 
     * ***
     * 
     */
    public String username() {
        return this.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAuthorizationAdminUsers defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String username;
        public Builder() {}
        public Builder(ClusterAuthorizationAdminUsers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder username(String username) {
            this.username = Objects.requireNonNull(username);
            return this;
        }
        public ClusterAuthorizationAdminUsers build() {
            final var o = new ClusterAuthorizationAdminUsers();
            o.username = username;
            return o;
        }
    }
}
