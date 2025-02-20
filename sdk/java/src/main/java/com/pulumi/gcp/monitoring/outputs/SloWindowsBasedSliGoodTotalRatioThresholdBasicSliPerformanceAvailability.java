// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability {
    /**
     * @return Whether an availability SLI is enabled or not. Must be set to ` true. Defaults to  `true`.
     * 
     */
    private @Nullable Boolean enabled;

    private SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability() {}
    /**
     * @return Whether an availability SLI is enabled or not. Must be set to ` true. Defaults to  `true`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability build() {
            final var o = new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailability();
            o.enabled = enabled;
            return o;
        }
    }
}
