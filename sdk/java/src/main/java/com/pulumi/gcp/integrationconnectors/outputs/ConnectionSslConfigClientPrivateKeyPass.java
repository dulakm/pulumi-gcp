// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectionSslConfigClientPrivateKeyPass {
    /**
     * @return Secret version of Secret Value for Config variable.
     * 
     */
    private String secretVersion;

    private ConnectionSslConfigClientPrivateKeyPass() {}
    /**
     * @return Secret version of Secret Value for Config variable.
     * 
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionSslConfigClientPrivateKeyPass defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretVersion;
        public Builder() {}
        public Builder(ConnectionSslConfigClientPrivateKeyPass defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretVersion = defaults.secretVersion;
        }

        @CustomType.Setter
        public Builder secretVersion(String secretVersion) {
            this.secretVersion = Objects.requireNonNull(secretVersion);
            return this;
        }
        public ConnectionSslConfigClientPrivateKeyPass build() {
            final var o = new ConnectionSslConfigClientPrivateKeyPass();
            o.secretVersion = secretVersion;
            return o;
        }
    }
}
