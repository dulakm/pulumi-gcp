// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNotificationChannelSensitiveLabel {
    private String authToken;
    private String password;
    private String serviceKey;

    private GetNotificationChannelSensitiveLabel() {}
    public String authToken() {
        return this.authToken;
    }
    public String password() {
        return this.password;
    }
    public String serviceKey() {
        return this.serviceKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationChannelSensitiveLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authToken;
        private String password;
        private String serviceKey;
        public Builder() {}
        public Builder(GetNotificationChannelSensitiveLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authToken = defaults.authToken;
    	      this.password = defaults.password;
    	      this.serviceKey = defaults.serviceKey;
        }

        @CustomType.Setter
        public Builder authToken(String authToken) {
            this.authToken = Objects.requireNonNull(authToken);
            return this;
        }
        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder serviceKey(String serviceKey) {
            this.serviceKey = Objects.requireNonNull(serviceKey);
            return this;
        }
        public GetNotificationChannelSensitiveLabel build() {
            final var o = new GetNotificationChannelSensitiveLabel();
            o.authToken = authToken;
            o.password = password;
            o.serviceKey = serviceKey;
            return o;
        }
    }
}
