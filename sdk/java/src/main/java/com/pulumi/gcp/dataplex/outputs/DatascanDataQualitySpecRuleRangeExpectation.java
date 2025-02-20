// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatascanDataQualitySpecRuleRangeExpectation {
    /**
     * @return The maximum column value allowed for a row to pass this validation. At least one of minValue and maxValue need to be provided.
     * 
     */
    private @Nullable String maxValue;
    /**
     * @return The minimum column value allowed for a row to pass this validation. At least one of minValue and maxValue need to be provided.
     * 
     */
    private @Nullable String minValue;
    /**
     * @return Whether each value needs to be strictly lesser than (&#39;&lt;&#39;) the maximum, or if equality is allowed.
     * Only relevant if a maxValue has been defined. Default = false.
     * 
     */
    private @Nullable Boolean strictMaxEnabled;
    /**
     * @return Whether each value needs to be strictly greater than (&#39;&gt;&#39;) the minimum, or if equality is allowed.
     * Only relevant if a minValue has been defined. Default = false.
     * 
     */
    private @Nullable Boolean strictMinEnabled;

    private DatascanDataQualitySpecRuleRangeExpectation() {}
    /**
     * @return The maximum column value allowed for a row to pass this validation. At least one of minValue and maxValue need to be provided.
     * 
     */
    public Optional<String> maxValue() {
        return Optional.ofNullable(this.maxValue);
    }
    /**
     * @return The minimum column value allowed for a row to pass this validation. At least one of minValue and maxValue need to be provided.
     * 
     */
    public Optional<String> minValue() {
        return Optional.ofNullable(this.minValue);
    }
    /**
     * @return Whether each value needs to be strictly lesser than (&#39;&lt;&#39;) the maximum, or if equality is allowed.
     * Only relevant if a maxValue has been defined. Default = false.
     * 
     */
    public Optional<Boolean> strictMaxEnabled() {
        return Optional.ofNullable(this.strictMaxEnabled);
    }
    /**
     * @return Whether each value needs to be strictly greater than (&#39;&gt;&#39;) the minimum, or if equality is allowed.
     * Only relevant if a minValue has been defined. Default = false.
     * 
     */
    public Optional<Boolean> strictMinEnabled() {
        return Optional.ofNullable(this.strictMinEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatascanDataQualitySpecRuleRangeExpectation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String maxValue;
        private @Nullable String minValue;
        private @Nullable Boolean strictMaxEnabled;
        private @Nullable Boolean strictMinEnabled;
        public Builder() {}
        public Builder(DatascanDataQualitySpecRuleRangeExpectation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxValue = defaults.maxValue;
    	      this.minValue = defaults.minValue;
    	      this.strictMaxEnabled = defaults.strictMaxEnabled;
    	      this.strictMinEnabled = defaults.strictMinEnabled;
        }

        @CustomType.Setter
        public Builder maxValue(@Nullable String maxValue) {
            this.maxValue = maxValue;
            return this;
        }
        @CustomType.Setter
        public Builder minValue(@Nullable String minValue) {
            this.minValue = minValue;
            return this;
        }
        @CustomType.Setter
        public Builder strictMaxEnabled(@Nullable Boolean strictMaxEnabled) {
            this.strictMaxEnabled = strictMaxEnabled;
            return this;
        }
        @CustomType.Setter
        public Builder strictMinEnabled(@Nullable Boolean strictMinEnabled) {
            this.strictMinEnabled = strictMinEnabled;
            return this;
        }
        public DatascanDataQualitySpecRuleRangeExpectation build() {
            final var o = new DatascanDataQualitySpecRuleRangeExpectation();
            o.maxValue = maxValue;
            o.minValue = minValue;
            o.strictMaxEnabled = strictMaxEnabled;
            o.strictMinEnabled = strictMinEnabled;
            return o;
        }
    }
}
