// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MetricMetricDescriptorLabel {
    /**
     * @return A human-readable description for the label.
     * 
     */
    private @Nullable String description;
    /**
     * @return The label key.
     * 
     */
    private String key;
    /**
     * @return The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are: `BOOL`, `INT64`, `STRING`.
     * 
     */
    private @Nullable String valueType;

    private MetricMetricDescriptorLabel() {}
    /**
     * @return A human-readable description for the label.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The label key.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return The type of data that can be assigned to the label.
     * Default value is `STRING`.
     * Possible values are: `BOOL`, `INT64`, `STRING`.
     * 
     */
    public Optional<String> valueType() {
        return Optional.ofNullable(this.valueType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricMetricDescriptorLabel defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private String key;
        private @Nullable String valueType;
        public Builder() {}
        public Builder(MetricMetricDescriptorLabel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.key = defaults.key;
    	      this.valueType = defaults.valueType;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder valueType(@Nullable String valueType) {
            this.valueType = valueType;
            return this;
        }
        public MetricMetricDescriptorLabel build() {
            final var o = new MetricMetricDescriptorLabel();
            o.description = description;
            o.key = key;
            o.valueType = valueType;
            return o;
        }
    }
}
