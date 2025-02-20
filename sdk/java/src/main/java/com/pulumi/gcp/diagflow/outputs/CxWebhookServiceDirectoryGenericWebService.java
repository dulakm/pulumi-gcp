// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CxWebhookServiceDirectoryGenericWebService {
    /**
     * @return Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification.
     * 
     */
    private @Nullable List<String> allowedCaCerts;
    /**
     * @return The HTTP request headers to send together with webhook requests.
     * 
     */
    private @Nullable Map<String,String> requestHeaders;
    /**
     * @return Whether to use speech adaptation for speech recognition.
     * 
     */
    private String uri;

    private CxWebhookServiceDirectoryGenericWebService() {}
    /**
     * @return Specifies a list of allowed custom CA certificates (in DER format) for HTTPS verification.
     * 
     */
    public List<String> allowedCaCerts() {
        return this.allowedCaCerts == null ? List.of() : this.allowedCaCerts;
    }
    /**
     * @return The HTTP request headers to send together with webhook requests.
     * 
     */
    public Map<String,String> requestHeaders() {
        return this.requestHeaders == null ? Map.of() : this.requestHeaders;
    }
    /**
     * @return Whether to use speech adaptation for speech recognition.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxWebhookServiceDirectoryGenericWebService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedCaCerts;
        private @Nullable Map<String,String> requestHeaders;
        private String uri;
        public Builder() {}
        public Builder(CxWebhookServiceDirectoryGenericWebService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedCaCerts = defaults.allowedCaCerts;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder allowedCaCerts(@Nullable List<String> allowedCaCerts) {
            this.allowedCaCerts = allowedCaCerts;
            return this;
        }
        public Builder allowedCaCerts(String... allowedCaCerts) {
            return allowedCaCerts(List.of(allowedCaCerts));
        }
        @CustomType.Setter
        public Builder requestHeaders(@Nullable Map<String,String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public CxWebhookServiceDirectoryGenericWebService build() {
            final var o = new CxWebhookServiceDirectoryGenericWebService();
            o.allowedCaCerts = allowedCaCerts;
            o.requestHeaders = requestHeaders;
            o.uri = uri;
            return o;
        }
    }
}
