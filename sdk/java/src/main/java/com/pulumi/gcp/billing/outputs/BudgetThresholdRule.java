// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BudgetThresholdRule {
    /**
     * @return The type of basis used to determine if spend has passed
     * the threshold.
     * Default value is `CURRENT_SPEND`.
     * Possible values are: `CURRENT_SPEND`, `FORECASTED_SPEND`.
     * 
     */
    private @Nullable String spendBasis;
    /**
     * @return Send an alert when this threshold is exceeded. This is a
     * 1.0-based percentage, so 0.5 = 50%. Must be &gt;= 0.
     * 
     */
    private Double thresholdPercent;

    private BudgetThresholdRule() {}
    /**
     * @return The type of basis used to determine if spend has passed
     * the threshold.
     * Default value is `CURRENT_SPEND`.
     * Possible values are: `CURRENT_SPEND`, `FORECASTED_SPEND`.
     * 
     */
    public Optional<String> spendBasis() {
        return Optional.ofNullable(this.spendBasis);
    }
    /**
     * @return Send an alert when this threshold is exceeded. This is a
     * 1.0-based percentage, so 0.5 = 50%. Must be &gt;= 0.
     * 
     */
    public Double thresholdPercent() {
        return this.thresholdPercent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetThresholdRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String spendBasis;
        private Double thresholdPercent;
        public Builder() {}
        public Builder(BudgetThresholdRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spendBasis = defaults.spendBasis;
    	      this.thresholdPercent = defaults.thresholdPercent;
        }

        @CustomType.Setter
        public Builder spendBasis(@Nullable String spendBasis) {
            this.spendBasis = spendBasis;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdPercent(Double thresholdPercent) {
            this.thresholdPercent = Objects.requireNonNull(thresholdPercent);
            return this;
        }
        public BudgetThresholdRule build() {
            final var o = new BudgetThresholdRule();
            o.spendBasis = spendBasis;
            o.thresholdPercent = thresholdPercent;
            return o;
        }
    }
}
