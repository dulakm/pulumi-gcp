// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigOauth2ClientCredentialsClientSecretArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConnectionAuthConfigOauth2ClientCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConnectionAuthConfigOauth2ClientCredentialsArgs Empty = new ConnectionAuthConfigOauth2ClientCredentialsArgs();

    /**
     * Secret version of Password for Authentication.
     * 
     */
    @Import(name="clientId", required=true)
    private Output<String> clientId;

    /**
     * @return Secret version of Password for Authentication.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }

    /**
     * Secret version reference containing the client secret.
     * Structure is documented below.
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<ConnectionAuthConfigOauth2ClientCredentialsClientSecretArgs> clientSecret;

    /**
     * @return Secret version reference containing the client secret.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ConnectionAuthConfigOauth2ClientCredentialsClientSecretArgs>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    private ConnectionAuthConfigOauth2ClientCredentialsArgs() {}

    private ConnectionAuthConfigOauth2ClientCredentialsArgs(ConnectionAuthConfigOauth2ClientCredentialsArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionAuthConfigOauth2ClientCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionAuthConfigOauth2ClientCredentialsArgs $;

        public Builder() {
            $ = new ConnectionAuthConfigOauth2ClientCredentialsArgs();
        }

        public Builder(ConnectionAuthConfigOauth2ClientCredentialsArgs defaults) {
            $ = new ConnectionAuthConfigOauth2ClientCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId Secret version of Password for Authentication.
         * 
         * @return builder
         * 
         */
        public Builder clientId(Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId Secret version of Password for Authentication.
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret Secret version reference containing the client secret.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<ConnectionAuthConfigOauth2ClientCredentialsClientSecretArgs> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret Secret version reference containing the client secret.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(ConnectionAuthConfigOauth2ClientCredentialsClientSecretArgs clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        public ConnectionAuthConfigOauth2ClientCredentialsArgs build() {
            $.clientId = Objects.requireNonNull($.clientId, "expected parameter 'clientId' to be non-null");
            return $;
        }
    }

}
