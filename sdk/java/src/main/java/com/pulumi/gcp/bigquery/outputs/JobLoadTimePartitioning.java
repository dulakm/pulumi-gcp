// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobLoadTimePartitioning {
    /**
     * @return Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
     * 
     */
    private @Nullable String expirationMs;
    /**
     * @return If not set, the table is partitioned by pseudo column &#39;_PARTITIONTIME&#39;; if set, the table is partitioned by this field.
     * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * A wrapper is used here because an empty string is an invalid value.
     * 
     */
    private @Nullable String field;
    /**
     * @return The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
     * but in OnePlatform the field will be treated as unset.
     * 
     */
    private String type;

    private JobLoadTimePartitioning() {}
    /**
     * @return Number of milliseconds for which to keep the storage for a partition. A wrapper is used here because 0 is an invalid value.
     * 
     */
    public Optional<String> expirationMs() {
        return Optional.ofNullable(this.expirationMs);
    }
    /**
     * @return If not set, the table is partitioned by pseudo column &#39;_PARTITIONTIME&#39;; if set, the table is partitioned by this field.
     * The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * A wrapper is used here because an empty string is an invalid value.
     * 
     */
    public Optional<String> field() {
        return Optional.ofNullable(this.field);
    }
    /**
     * @return The only type supported is DAY, which will generate one partition per day. Providing an empty string used to cause an error,
     * but in OnePlatform the field will be treated as unset.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobLoadTimePartitioning defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String expirationMs;
        private @Nullable String field;
        private String type;
        public Builder() {}
        public Builder(JobLoadTimePartitioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder expirationMs(@Nullable String expirationMs) {
            this.expirationMs = expirationMs;
            return this;
        }
        @CustomType.Setter
        public Builder field(@Nullable String field) {
            this.field = field;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public JobLoadTimePartitioning build() {
            final var o = new JobLoadTimePartitioning();
            o.expirationMs = expirationMs;
            o.field = field;
            o.type = type;
            return o;
        }
    }
}
