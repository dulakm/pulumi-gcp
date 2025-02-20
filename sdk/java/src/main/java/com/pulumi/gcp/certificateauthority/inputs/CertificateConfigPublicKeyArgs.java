// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertificateConfigPublicKeyArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigPublicKeyArgs Empty = new CertificateConfigPublicKeyArgs();

    /**
     * The format of the public key. Currently, only PEM format is supported.
     * Possible values are: `KEY_TYPE_UNSPECIFIED`, `PEM`.
     * 
     */
    @Import(name="format", required=true)
    private Output<String> format;

    /**
     * @return The format of the public key. Currently, only PEM format is supported.
     * Possible values are: `KEY_TYPE_UNSPECIFIED`, `PEM`.
     * 
     */
    public Output<String> format() {
        return this.format;
    }

    /**
     * Required. A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective &#39;KeyType&#39; value. When this is generated by the service, it will always be an RFC 5280 SubjectPublicKeyInfo structure containing an algorithm identifier and a key. A base64-encoded string.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Required. A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective &#39;KeyType&#39; value. When this is generated by the service, it will always be an RFC 5280 SubjectPublicKeyInfo structure containing an algorithm identifier and a key. A base64-encoded string.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    private CertificateConfigPublicKeyArgs() {}

    private CertificateConfigPublicKeyArgs(CertificateConfigPublicKeyArgs $) {
        this.format = $.format;
        this.key = $.key;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigPublicKeyArgs $;

        public Builder() {
            $ = new CertificateConfigPublicKeyArgs();
        }

        public Builder(CertificateConfigPublicKeyArgs defaults) {
            $ = new CertificateConfigPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param format The format of the public key. Currently, only PEM format is supported.
         * Possible values are: `KEY_TYPE_UNSPECIFIED`, `PEM`.
         * 
         * @return builder
         * 
         */
        public Builder format(Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format The format of the public key. Currently, only PEM format is supported.
         * Possible values are: `KEY_TYPE_UNSPECIFIED`, `PEM`.
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param key Required. A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective &#39;KeyType&#39; value. When this is generated by the service, it will always be an RFC 5280 SubjectPublicKeyInfo structure containing an algorithm identifier and a key. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Required. A public key. When this is specified in a request, the padding and encoding can be any of the options described by the respective &#39;KeyType&#39; value. When this is generated by the service, it will always be an RFC 5280 SubjectPublicKeyInfo structure containing an algorithm identifier and a key. A base64-encoded string.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        public CertificateConfigPublicKeyArgs build() {
            $.format = Objects.requireNonNull($.format, "expected parameter 'format' to be non-null");
            return $;
        }
    }

}
