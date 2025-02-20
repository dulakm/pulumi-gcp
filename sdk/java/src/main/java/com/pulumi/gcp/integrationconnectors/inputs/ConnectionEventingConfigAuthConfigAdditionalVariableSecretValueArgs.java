// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs Empty = new ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs();

    /**
     * Secret version of Secret Value for Config variable.
     * 
     */
    @Import(name="secretVersion", required=true)
    private Output<String> secretVersion;

    /**
     * @return Secret version of Secret Value for Config variable.
     * 
     */
    public Output<String> secretVersion() {
        return this.secretVersion;
    }

    private ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs() {}

    private ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs(ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs $) {
        this.secretVersion = $.secretVersion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs $;

        public Builder() {
            $ = new ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs();
        }

        public Builder(ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs defaults) {
            $ = new ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param secretVersion Secret version of Secret Value for Config variable.
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(Output<String> secretVersion) {
            $.secretVersion = secretVersion;
            return this;
        }

        /**
         * @param secretVersion Secret version of Secret Value for Config variable.
         * 
         * @return builder
         * 
         */
        public Builder secretVersion(String secretVersion) {
            return secretVersion(Output.of(secretVersion));
        }

        public ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs build() {
            $.secretVersion = Objects.requireNonNull($.secretVersion, "expected parameter 'secretVersion' to be non-null");
            return $;
        }
    }

}
