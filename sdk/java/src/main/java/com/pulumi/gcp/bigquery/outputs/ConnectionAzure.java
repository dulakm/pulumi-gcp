// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionAzure {
    /**
     * @return (Output)
     * The name of the Azure Active Directory Application.
     * 
     */
    private @Nullable String application;
    /**
     * @return (Output)
     * The client id of the Azure Active Directory Application.
     * 
     */
    private @Nullable String clientId;
    /**
     * @return The id of customer&#39;s directory that host the data.
     * 
     */
    private String customerTenantId;
    /**
     * @return The Azure Application (client) ID where the federated credentials will be hosted.
     * 
     */
    private @Nullable String federatedApplicationClientId;
    /**
     * @return (Output)
     * A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user&#39;s Azure Active Directory Application.
     * 
     */
    private @Nullable String identity;
    /**
     * @return (Output)
     * The object id of the Azure Active Directory Application.
     * 
     */
    private @Nullable String objectId;
    /**
     * @return (Output)
     * The URL user will be redirected to after granting consent during connection setup.
     * 
     */
    private @Nullable String redirectUri;

    private ConnectionAzure() {}
    /**
     * @return (Output)
     * The name of the Azure Active Directory Application.
     * 
     */
    public Optional<String> application() {
        return Optional.ofNullable(this.application);
    }
    /**
     * @return (Output)
     * The client id of the Azure Active Directory Application.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The id of customer&#39;s directory that host the data.
     * 
     */
    public String customerTenantId() {
        return this.customerTenantId;
    }
    /**
     * @return The Azure Application (client) ID where the federated credentials will be hosted.
     * 
     */
    public Optional<String> federatedApplicationClientId() {
        return Optional.ofNullable(this.federatedApplicationClientId);
    }
    /**
     * @return (Output)
     * A unique Google-owned and Google-generated identity for the Connection. This identity will be used to access the user&#39;s Azure Active Directory Application.
     * 
     */
    public Optional<String> identity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * @return (Output)
     * The object id of the Azure Active Directory Application.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * @return (Output)
     * The URL user will be redirected to after granting consent during connection setup.
     * 
     */
    public Optional<String> redirectUri() {
        return Optional.ofNullable(this.redirectUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAzure defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String application;
        private @Nullable String clientId;
        private String customerTenantId;
        private @Nullable String federatedApplicationClientId;
        private @Nullable String identity;
        private @Nullable String objectId;
        private @Nullable String redirectUri;
        public Builder() {}
        public Builder(ConnectionAzure defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.clientId = defaults.clientId;
    	      this.customerTenantId = defaults.customerTenantId;
    	      this.federatedApplicationClientId = defaults.federatedApplicationClientId;
    	      this.identity = defaults.identity;
    	      this.objectId = defaults.objectId;
    	      this.redirectUri = defaults.redirectUri;
        }

        @CustomType.Setter
        public Builder application(@Nullable String application) {
            this.application = application;
            return this;
        }
        @CustomType.Setter
        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        @CustomType.Setter
        public Builder customerTenantId(String customerTenantId) {
            this.customerTenantId = Objects.requireNonNull(customerTenantId);
            return this;
        }
        @CustomType.Setter
        public Builder federatedApplicationClientId(@Nullable String federatedApplicationClientId) {
            this.federatedApplicationClientId = federatedApplicationClientId;
            return this;
        }
        @CustomType.Setter
        public Builder identity(@Nullable String identity) {
            this.identity = identity;
            return this;
        }
        @CustomType.Setter
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        @CustomType.Setter
        public Builder redirectUri(@Nullable String redirectUri) {
            this.redirectUri = redirectUri;
            return this;
        }
        public ConnectionAzure build() {
            final var o = new ConnectionAzure();
            o.application = application;
            o.clientId = clientId;
            o.customerTenantId = customerTenantId;
            o.federatedApplicationClientId = federatedApplicationClientId;
            o.identity = identity;
            o.objectId = objectId;
            o.redirectUri = redirectUri;
            return o;
        }
    }
}
