// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.identityplatform.inputs.InboundSamlConfigIdpConfigIdpCertificateArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InboundSamlConfigIdpConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InboundSamlConfigIdpConfigArgs Empty = new InboundSamlConfigIdpConfigArgs();

    /**
     * The IdP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    @Import(name="idpCertificates", required=true)
    private Output<List<InboundSamlConfigIdpConfigIdpCertificateArgs>> idpCertificates;

    /**
     * @return The IdP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
     * Structure is documented below.
     * 
     */
    public Output<List<InboundSamlConfigIdpConfigIdpCertificateArgs>> idpCertificates() {
        return this.idpCertificates;
    }

    /**
     * Unique identifier for all SAML entities
     * 
     */
    @Import(name="idpEntityId", required=true)
    private Output<String> idpEntityId;

    /**
     * @return Unique identifier for all SAML entities
     * 
     */
    public Output<String> idpEntityId() {
        return this.idpEntityId;
    }

    /**
     * Indicates if outbounding SAMLRequest should be signed.
     * 
     */
    @Import(name="signRequest")
    private @Nullable Output<Boolean> signRequest;

    /**
     * @return Indicates if outbounding SAMLRequest should be signed.
     * 
     */
    public Optional<Output<Boolean>> signRequest() {
        return Optional.ofNullable(this.signRequest);
    }

    /**
     * URL to send Authentication request to.
     * 
     */
    @Import(name="ssoUrl", required=true)
    private Output<String> ssoUrl;

    /**
     * @return URL to send Authentication request to.
     * 
     */
    public Output<String> ssoUrl() {
        return this.ssoUrl;
    }

    private InboundSamlConfigIdpConfigArgs() {}

    private InboundSamlConfigIdpConfigArgs(InboundSamlConfigIdpConfigArgs $) {
        this.idpCertificates = $.idpCertificates;
        this.idpEntityId = $.idpEntityId;
        this.signRequest = $.signRequest;
        this.ssoUrl = $.ssoUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InboundSamlConfigIdpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InboundSamlConfigIdpConfigArgs $;

        public Builder() {
            $ = new InboundSamlConfigIdpConfigArgs();
        }

        public Builder(InboundSamlConfigIdpConfigArgs defaults) {
            $ = new InboundSamlConfigIdpConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param idpCertificates The IdP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder idpCertificates(Output<List<InboundSamlConfigIdpConfigIdpCertificateArgs>> idpCertificates) {
            $.idpCertificates = idpCertificates;
            return this;
        }

        /**
         * @param idpCertificates The IdP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder idpCertificates(List<InboundSamlConfigIdpConfigIdpCertificateArgs> idpCertificates) {
            return idpCertificates(Output.of(idpCertificates));
        }

        /**
         * @param idpCertificates The IdP&#39;s certificate data to verify the signature in the SAMLResponse issued by the IDP.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder idpCertificates(InboundSamlConfigIdpConfigIdpCertificateArgs... idpCertificates) {
            return idpCertificates(List.of(idpCertificates));
        }

        /**
         * @param idpEntityId Unique identifier for all SAML entities
         * 
         * @return builder
         * 
         */
        public Builder idpEntityId(Output<String> idpEntityId) {
            $.idpEntityId = idpEntityId;
            return this;
        }

        /**
         * @param idpEntityId Unique identifier for all SAML entities
         * 
         * @return builder
         * 
         */
        public Builder idpEntityId(String idpEntityId) {
            return idpEntityId(Output.of(idpEntityId));
        }

        /**
         * @param signRequest Indicates if outbounding SAMLRequest should be signed.
         * 
         * @return builder
         * 
         */
        public Builder signRequest(@Nullable Output<Boolean> signRequest) {
            $.signRequest = signRequest;
            return this;
        }

        /**
         * @param signRequest Indicates if outbounding SAMLRequest should be signed.
         * 
         * @return builder
         * 
         */
        public Builder signRequest(Boolean signRequest) {
            return signRequest(Output.of(signRequest));
        }

        /**
         * @param ssoUrl URL to send Authentication request to.
         * 
         * @return builder
         * 
         */
        public Builder ssoUrl(Output<String> ssoUrl) {
            $.ssoUrl = ssoUrl;
            return this;
        }

        /**
         * @param ssoUrl URL to send Authentication request to.
         * 
         * @return builder
         * 
         */
        public Builder ssoUrl(String ssoUrl) {
            return ssoUrl(Output.of(ssoUrl));
        }

        public InboundSamlConfigIdpConfigArgs build() {
            $.idpCertificates = Objects.requireNonNull($.idpCertificates, "expected parameter 'idpCertificates' to be non-null");
            $.idpEntityId = Objects.requireNonNull($.idpEntityId, "expected parameter 'idpEntityId' to be non-null");
            $.ssoUrl = Objects.requireNonNull($.ssoUrl, "expected parameter 'ssoUrl' to be non-null");
            return $;
        }
    }

}
