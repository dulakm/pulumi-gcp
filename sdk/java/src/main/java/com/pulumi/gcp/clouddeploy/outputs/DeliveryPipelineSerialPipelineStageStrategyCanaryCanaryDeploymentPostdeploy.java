// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeploy {
    /**
     * @return Optional. A sequence of skaffold custom actions to invoke during execution of the postdeploy job.
     * 
     */
    private @Nullable List<String> actions;

    private DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeploy() {}
    /**
     * @return Optional. A sequence of skaffold custom actions to invoke during execution of the postdeploy job.
     * 
     */
    public List<String> actions() {
        return this.actions == null ? List.of() : this.actions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeploy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> actions;
        public Builder() {}
        public Builder(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeploy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
        }

        @CustomType.Setter
        public Builder actions(@Nullable List<String> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        public DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeploy build() {
            final var o = new DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeploy();
            o.actions = actions;
            return o;
        }
    }
}
