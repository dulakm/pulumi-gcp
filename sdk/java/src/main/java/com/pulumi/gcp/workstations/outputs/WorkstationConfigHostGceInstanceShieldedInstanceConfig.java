// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkstationConfigHostGceInstanceShieldedInstanceConfig {
    /**
     * @return Whether the instance has integrity monitoring enabled.
     * 
     */
    private @Nullable Boolean enableIntegrityMonitoring;
    /**
     * @return Whether the instance has Secure Boot enabled.
     * 
     */
    private @Nullable Boolean enableSecureBoot;
    /**
     * @return Whether the instance has the vTPM enabled.
     * 
     */
    private @Nullable Boolean enableVtpm;

    private WorkstationConfigHostGceInstanceShieldedInstanceConfig() {}
    /**
     * @return Whether the instance has integrity monitoring enabled.
     * 
     */
    public Optional<Boolean> enableIntegrityMonitoring() {
        return Optional.ofNullable(this.enableIntegrityMonitoring);
    }
    /**
     * @return Whether the instance has Secure Boot enabled.
     * 
     */
    public Optional<Boolean> enableSecureBoot() {
        return Optional.ofNullable(this.enableSecureBoot);
    }
    /**
     * @return Whether the instance has the vTPM enabled.
     * 
     */
    public Optional<Boolean> enableVtpm() {
        return Optional.ofNullable(this.enableVtpm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkstationConfigHostGceInstanceShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enableIntegrityMonitoring;
        private @Nullable Boolean enableSecureBoot;
        private @Nullable Boolean enableVtpm;
        public Builder() {}
        public Builder(WorkstationConfigHostGceInstanceShieldedInstanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableIntegrityMonitoring = defaults.enableIntegrityMonitoring;
    	      this.enableSecureBoot = defaults.enableSecureBoot;
    	      this.enableVtpm = defaults.enableVtpm;
        }

        @CustomType.Setter
        public Builder enableIntegrityMonitoring(@Nullable Boolean enableIntegrityMonitoring) {
            this.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }
        @CustomType.Setter
        public Builder enableSecureBoot(@Nullable Boolean enableSecureBoot) {
            this.enableSecureBoot = enableSecureBoot;
            return this;
        }
        @CustomType.Setter
        public Builder enableVtpm(@Nullable Boolean enableVtpm) {
            this.enableVtpm = enableVtpm;
            return this;
        }
        public WorkstationConfigHostGceInstanceShieldedInstanceConfig build() {
            final var o = new WorkstationConfigHostGceInstanceShieldedInstanceConfig();
            o.enableIntegrityMonitoring = enableIntegrityMonitoring;
            o.enableSecureBoot = enableSecureBoot;
            o.enableVtpm = enableVtpm;
            return o;
        }
    }
}
