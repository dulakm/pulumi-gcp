// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.pubsub.outputs.SubscriptionCloudStorageConfigAvroConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SubscriptionCloudStorageConfig {
    /**
     * @return If set, message data will be written to Cloud Storage in Avro format.
     * Structure is documented below.
     * 
     */
    private @Nullable SubscriptionCloudStorageConfigAvroConfig avroConfig;
    /**
     * @return User-provided name for the Cloud Storage bucket. The bucket must be created by the user. The bucket name must be without any prefix like &#34;gs://&#34;.
     * 
     */
    private String bucket;
    /**
     * @return User-provided prefix for Cloud Storage filename.
     * 
     */
    private @Nullable String filenamePrefix;
    /**
     * @return User-provided suffix for Cloud Storage filename. Must not end in &#34;/&#34;.
     * 
     */
    private @Nullable String filenameSuffix;
    /**
     * @return The maximum bytes that can be written to a Cloud Storage file before a new file is created. Min 1 KB, max 10 GiB.
     * The maxBytes limit may be exceeded in cases where messages are larger than the limit.
     * 
     */
    private @Nullable Integer maxBytes;
    /**
     * @return The maximum duration that can elapse before a new Cloud Storage file is created. Min 1 minute, max 10 minutes, default 5 minutes.
     * May not exceed the subscription&#39;s acknowledgement deadline.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    private @Nullable String maxDuration;
    /**
     * @return (Output)
     * An output-only field that indicates whether or not the subscription can receive messages.
     * 
     */
    private @Nullable String state;

    private SubscriptionCloudStorageConfig() {}
    /**
     * @return If set, message data will be written to Cloud Storage in Avro format.
     * Structure is documented below.
     * 
     */
    public Optional<SubscriptionCloudStorageConfigAvroConfig> avroConfig() {
        return Optional.ofNullable(this.avroConfig);
    }
    /**
     * @return User-provided name for the Cloud Storage bucket. The bucket must be created by the user. The bucket name must be without any prefix like &#34;gs://&#34;.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return User-provided prefix for Cloud Storage filename.
     * 
     */
    public Optional<String> filenamePrefix() {
        return Optional.ofNullable(this.filenamePrefix);
    }
    /**
     * @return User-provided suffix for Cloud Storage filename. Must not end in &#34;/&#34;.
     * 
     */
    public Optional<String> filenameSuffix() {
        return Optional.ofNullable(this.filenameSuffix);
    }
    /**
     * @return The maximum bytes that can be written to a Cloud Storage file before a new file is created. Min 1 KB, max 10 GiB.
     * The maxBytes limit may be exceeded in cases where messages are larger than the limit.
     * 
     */
    public Optional<Integer> maxBytes() {
        return Optional.ofNullable(this.maxBytes);
    }
    /**
     * @return The maximum duration that can elapse before a new Cloud Storage file is created. Min 1 minute, max 10 minutes, default 5 minutes.
     * May not exceed the subscription&#39;s acknowledgement deadline.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * 
     */
    public Optional<String> maxDuration() {
        return Optional.ofNullable(this.maxDuration);
    }
    /**
     * @return (Output)
     * An output-only field that indicates whether or not the subscription can receive messages.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionCloudStorageConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SubscriptionCloudStorageConfigAvroConfig avroConfig;
        private String bucket;
        private @Nullable String filenamePrefix;
        private @Nullable String filenameSuffix;
        private @Nullable Integer maxBytes;
        private @Nullable String maxDuration;
        private @Nullable String state;
        public Builder() {}
        public Builder(SubscriptionCloudStorageConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.avroConfig = defaults.avroConfig;
    	      this.bucket = defaults.bucket;
    	      this.filenamePrefix = defaults.filenamePrefix;
    	      this.filenameSuffix = defaults.filenameSuffix;
    	      this.maxBytes = defaults.maxBytes;
    	      this.maxDuration = defaults.maxDuration;
    	      this.state = defaults.state;
        }

        @CustomType.Setter
        public Builder avroConfig(@Nullable SubscriptionCloudStorageConfigAvroConfig avroConfig) {
            this.avroConfig = avroConfig;
            return this;
        }
        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder filenamePrefix(@Nullable String filenamePrefix) {
            this.filenamePrefix = filenamePrefix;
            return this;
        }
        @CustomType.Setter
        public Builder filenameSuffix(@Nullable String filenameSuffix) {
            this.filenameSuffix = filenameSuffix;
            return this;
        }
        @CustomType.Setter
        public Builder maxBytes(@Nullable Integer maxBytes) {
            this.maxBytes = maxBytes;
            return this;
        }
        @CustomType.Setter
        public Builder maxDuration(@Nullable String maxDuration) {
            this.maxDuration = maxDuration;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public SubscriptionCloudStorageConfig build() {
            final var o = new SubscriptionCloudStorageConfig();
            o.avroConfig = avroConfig;
            o.bucket = bucket;
            o.filenamePrefix = filenamePrefix;
            o.filenameSuffix = filenameSuffix;
            o.maxBytes = maxBytes;
            o.maxDuration = maxDuration;
            o.state = state;
            return o;
        }
    }
}
