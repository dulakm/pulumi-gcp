// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig {
    /**
     * @return Rules are only automatically deployed for alerts on potential attacks with confidence scores greater than this threshold.
     * 
     */
    private @Nullable Double confidenceThreshold;
    /**
     * @return Google Cloud Armor stops applying the action in the automatically deployed rule to an identified attacker after this duration. The rule continues to operate against new requests.
     * 
     */
    private @Nullable Integer expirationSec;
    /**
     * @return Rules are only automatically deployed when the estimated impact to baseline traffic from the suggested mitigation is below this threshold.
     * 
     */
    private @Nullable Double impactedBaselineThreshold;
    /**
     * @return Identifies new attackers only when the load to the backend service that is under attack exceeds this threshold.
     * 
     */
    private @Nullable Double loadThreshold;

    private SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig() {}
    /**
     * @return Rules are only automatically deployed for alerts on potential attacks with confidence scores greater than this threshold.
     * 
     */
    public Optional<Double> confidenceThreshold() {
        return Optional.ofNullable(this.confidenceThreshold);
    }
    /**
     * @return Google Cloud Armor stops applying the action in the automatically deployed rule to an identified attacker after this duration. The rule continues to operate against new requests.
     * 
     */
    public Optional<Integer> expirationSec() {
        return Optional.ofNullable(this.expirationSec);
    }
    /**
     * @return Rules are only automatically deployed when the estimated impact to baseline traffic from the suggested mitigation is below this threshold.
     * 
     */
    public Optional<Double> impactedBaselineThreshold() {
        return Optional.ofNullable(this.impactedBaselineThreshold);
    }
    /**
     * @return Identifies new attackers only when the load to the backend service that is under attack exceeds this threshold.
     * 
     */
    public Optional<Double> loadThreshold() {
        return Optional.ofNullable(this.loadThreshold);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double confidenceThreshold;
        private @Nullable Integer expirationSec;
        private @Nullable Double impactedBaselineThreshold;
        private @Nullable Double loadThreshold;
        public Builder() {}
        public Builder(SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceThreshold = defaults.confidenceThreshold;
    	      this.expirationSec = defaults.expirationSec;
    	      this.impactedBaselineThreshold = defaults.impactedBaselineThreshold;
    	      this.loadThreshold = defaults.loadThreshold;
        }

        @CustomType.Setter
        public Builder confidenceThreshold(@Nullable Double confidenceThreshold) {
            this.confidenceThreshold = confidenceThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder expirationSec(@Nullable Integer expirationSec) {
            this.expirationSec = expirationSec;
            return this;
        }
        @CustomType.Setter
        public Builder impactedBaselineThreshold(@Nullable Double impactedBaselineThreshold) {
            this.impactedBaselineThreshold = impactedBaselineThreshold;
            return this;
        }
        @CustomType.Setter
        public Builder loadThreshold(@Nullable Double loadThreshold) {
            this.loadThreshold = loadThreshold;
            return this;
        }
        public SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig build() {
            final var o = new SecurityPolicyAdaptiveProtectionConfigAutoDeployConfig();
            o.confidenceThreshold = confidenceThreshold;
            o.expirationSec = expirationSec;
            o.impactedBaselineThreshold = impactedBaselineThreshold;
            o.loadThreshold = loadThreshold;
            return o;
        }
    }
}
