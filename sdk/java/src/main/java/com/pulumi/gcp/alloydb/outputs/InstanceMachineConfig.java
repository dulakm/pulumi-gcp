// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceMachineConfig {
    /**
     * @return The number of CPU&#39;s in the VM instance.
     * 
     */
    private @Nullable Integer cpuCount;

    private InstanceMachineConfig() {}
    /**
     * @return The number of CPU&#39;s in the VM instance.
     * 
     */
    public Optional<Integer> cpuCount() {
        return Optional.ofNullable(this.cpuCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMachineConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer cpuCount;
        public Builder() {}
        public Builder(InstanceMachineConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCount = defaults.cpuCount;
        }

        @CustomType.Setter
        public Builder cpuCount(@Nullable Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public InstanceMachineConfig build() {
            final var o = new InstanceMachineConfig();
            o.cpuCount = cpuCount;
            return o;
        }
    }
}
