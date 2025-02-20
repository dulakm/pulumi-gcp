// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageAdvancedMachineFeaturesArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageAdvancedMachineFeaturesArgs Empty = new InstanceFromMachineImageAdvancedMachineFeaturesArgs();

    @Import(name="enableNestedVirtualization")
    private @Nullable Output<Boolean> enableNestedVirtualization;

    public Optional<Output<Boolean>> enableNestedVirtualization() {
        return Optional.ofNullable(this.enableNestedVirtualization);
    }

    @Import(name="threadsPerCore")
    private @Nullable Output<Integer> threadsPerCore;

    public Optional<Output<Integer>> threadsPerCore() {
        return Optional.ofNullable(this.threadsPerCore);
    }

    @Import(name="visibleCoreCount")
    private @Nullable Output<Integer> visibleCoreCount;

    public Optional<Output<Integer>> visibleCoreCount() {
        return Optional.ofNullable(this.visibleCoreCount);
    }

    private InstanceFromMachineImageAdvancedMachineFeaturesArgs() {}

    private InstanceFromMachineImageAdvancedMachineFeaturesArgs(InstanceFromMachineImageAdvancedMachineFeaturesArgs $) {
        this.enableNestedVirtualization = $.enableNestedVirtualization;
        this.threadsPerCore = $.threadsPerCore;
        this.visibleCoreCount = $.visibleCoreCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceFromMachineImageAdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceFromMachineImageAdvancedMachineFeaturesArgs $;

        public Builder() {
            $ = new InstanceFromMachineImageAdvancedMachineFeaturesArgs();
        }

        public Builder(InstanceFromMachineImageAdvancedMachineFeaturesArgs defaults) {
            $ = new InstanceFromMachineImageAdvancedMachineFeaturesArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableNestedVirtualization(@Nullable Output<Boolean> enableNestedVirtualization) {
            $.enableNestedVirtualization = enableNestedVirtualization;
            return this;
        }

        public Builder enableNestedVirtualization(Boolean enableNestedVirtualization) {
            return enableNestedVirtualization(Output.of(enableNestedVirtualization));
        }

        public Builder threadsPerCore(@Nullable Output<Integer> threadsPerCore) {
            $.threadsPerCore = threadsPerCore;
            return this;
        }

        public Builder threadsPerCore(Integer threadsPerCore) {
            return threadsPerCore(Output.of(threadsPerCore));
        }

        public Builder visibleCoreCount(@Nullable Output<Integer> visibleCoreCount) {
            $.visibleCoreCount = visibleCoreCount;
            return this;
        }

        public Builder visibleCoreCount(Integer visibleCoreCount) {
            return visibleCoreCount(Output.of(visibleCoreCount));
        }

        public InstanceFromMachineImageAdvancedMachineFeaturesArgs build() {
            return $;
        }
    }

}
