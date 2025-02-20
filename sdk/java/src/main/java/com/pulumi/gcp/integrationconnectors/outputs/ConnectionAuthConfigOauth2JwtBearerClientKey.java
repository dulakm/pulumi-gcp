// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionAuthConfigOauth2JwtBearerClientKey {
    /**
     * @return The resource name of the secret version in the format,
     * format as: projects/*{@literal /}secrets/*{@literal /}versions/*.
     * 
     */
    private String secretVersion;

    private ConnectionAuthConfigOauth2JwtBearerClientKey() {}
    /**
     * @return The resource name of the secret version in the format,
     * format as: projects/*{@literal /}secrets/*{@literal /}versions/*.
     * 
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAuthConfigOauth2JwtBearerClientKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretVersion;
        public Builder() {}
        public Builder(ConnectionAuthConfigOauth2JwtBearerClientKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        @CustomType.Setter
        public Builder secretVersion(String secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }
        public ConnectionAuthConfigOauth2JwtBearerClientKey build() {
            final var o = new ConnectionAuthConfigOauth2JwtBearerClientKey();
            o.secretVersion = secretVersion;
            return o;
        }
    }
}
