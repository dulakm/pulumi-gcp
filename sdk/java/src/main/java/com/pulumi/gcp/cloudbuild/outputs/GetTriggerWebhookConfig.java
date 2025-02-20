// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTriggerWebhookConfig {
    private String secret;
    private String state;

    private GetTriggerWebhookConfig() {}
    public String secret() {
        return this.secret;
    }
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerWebhookConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secret;
        private String state;
        public Builder() {}
        public Builder(GetTriggerWebhookConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secret = defaults.secret;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        @CustomType.Setter
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetTriggerWebhookConfig build() {
            final var o = new GetTriggerWebhookConfig();
            o.secret = secret;
            o.state = state;
            return o;
        }
    }
}
