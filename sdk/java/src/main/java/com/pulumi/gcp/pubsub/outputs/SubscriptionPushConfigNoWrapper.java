// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class SubscriptionPushConfigNoWrapper {
    /**
     * @return When true, writes the Pub/Sub message metadata to
     * `x-goog-pubsub-&lt;KEY&gt;:&lt;VAL&gt;` headers of the HTTP request. Writes the
     * Pub/Sub message attributes to `&lt;KEY&gt;:&lt;VAL&gt;` headers of the HTTP request.
     * 
     */
    private Boolean writeMetadata;

    private SubscriptionPushConfigNoWrapper() {}
    /**
     * @return When true, writes the Pub/Sub message metadata to
     * `x-goog-pubsub-&lt;KEY&gt;:&lt;VAL&gt;` headers of the HTTP request. Writes the
     * Pub/Sub message attributes to `&lt;KEY&gt;:&lt;VAL&gt;` headers of the HTTP request.
     * 
     */
    public Boolean writeMetadata() {
        return this.writeMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionPushConfigNoWrapper defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean writeMetadata;
        public Builder() {}
        public Builder(SubscriptionPushConfigNoWrapper defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.writeMetadata = defaults.writeMetadata;
        }

        @CustomType.Setter
        public Builder writeMetadata(Boolean writeMetadata) {
            this.writeMetadata = Objects.requireNonNull(writeMetadata);
            return this;
        }
        public SubscriptionPushConfigNoWrapper build() {
            final var o = new SubscriptionPushConfigNoWrapper();
            o.writeMetadata = writeMetadata;
            return o;
        }
    }
}
