// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionAuthConfigSshPublicKeySshClientCertPass {
    /**
     * @return The resource name of the secret version in the format,
     * format as: projects/*{@literal /}secrets/*{@literal /}versions/*.
     * 
     * &lt;a name=&#34;nested_oauth2_auth_code_flow&#34;&gt;&lt;/a&gt;The `oauth2_auth_code_flow` block supports:
     * 
     */
    private String secretVersion;

    private ConnectionAuthConfigSshPublicKeySshClientCertPass() {}
    /**
     * @return The resource name of the secret version in the format,
     * format as: projects/*{@literal /}secrets/*{@literal /}versions/*.
     * 
     * &lt;a name=&#34;nested_oauth2_auth_code_flow&#34;&gt;&lt;/a&gt;The `oauth2_auth_code_flow` block supports:
     * 
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAuthConfigSshPublicKeySshClientCertPass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretVersion;
        public Builder() {}
        public Builder(ConnectionAuthConfigSshPublicKeySshClientCertPass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        @CustomType.Setter
        public Builder secretVersion(String secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }
        public ConnectionAuthConfigSshPublicKeySshClientCertPass build() {
            final var o = new ConnectionAuthConfigSshPublicKeySshClientCertPass();
            o.secretVersion = secretVersion;
            return o;
        }
    }
}
