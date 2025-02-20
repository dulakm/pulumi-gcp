// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class InstanceTemplateConfidentialInstanceConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final InstanceTemplateConfidentialInstanceConfigArgs Empty = new InstanceTemplateConfidentialInstanceConfigArgs();

    /**
     * Defines whether the instance should have confidential compute enabled. `on_host_maintenance` has to be set to TERMINATE or this will fail to create the VM.
     * 
     */
    @Import(name="enableConfidentialCompute", required=true)
    private Output<Boolean> enableConfidentialCompute;

    /**
     * @return Defines whether the instance should have confidential compute enabled. `on_host_maintenance` has to be set to TERMINATE or this will fail to create the VM.
     * 
     */
    public Output<Boolean> enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }

    private InstanceTemplateConfidentialInstanceConfigArgs() {}

    private InstanceTemplateConfidentialInstanceConfigArgs(InstanceTemplateConfidentialInstanceConfigArgs $) {
        this.enableConfidentialCompute = $.enableConfidentialCompute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InstanceTemplateConfidentialInstanceConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InstanceTemplateConfidentialInstanceConfigArgs $;

        public Builder() {
            $ = new InstanceTemplateConfidentialInstanceConfigArgs();
        }

        public Builder(InstanceTemplateConfidentialInstanceConfigArgs defaults) {
            $ = new InstanceTemplateConfidentialInstanceConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableConfidentialCompute Defines whether the instance should have confidential compute enabled. `on_host_maintenance` has to be set to TERMINATE or this will fail to create the VM.
         * 
         * @return builder
         * 
         */
        public Builder enableConfidentialCompute(Output<Boolean> enableConfidentialCompute) {
            $.enableConfidentialCompute = enableConfidentialCompute;
            return this;
        }

        /**
         * @param enableConfidentialCompute Defines whether the instance should have confidential compute enabled. `on_host_maintenance` has to be set to TERMINATE or this will fail to create the VM.
         * 
         * @return builder
         * 
         */
        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            return enableConfidentialCompute(Output.of(enableConfidentialCompute));
        }

        public InstanceTemplateConfidentialInstanceConfigArgs build() {
            $.enableConfidentialCompute = Objects.requireNonNull($.enableConfidentialCompute, "expected parameter 'enableConfidentialCompute' to be non-null");
            return $;
        }
    }

}
