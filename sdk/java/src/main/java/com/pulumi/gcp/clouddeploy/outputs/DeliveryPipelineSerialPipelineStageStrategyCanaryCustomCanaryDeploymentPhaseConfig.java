// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.clouddeploy.outputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPostdeploy;
import com.pulumi.gcp.clouddeploy.outputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPredeploy;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfig {
    /**
     * @return Required. Percentage deployment for the phase.
     * 
     */
    private Integer percentage;
    /**
     * @return Required. The ID to assign to the `Rollout` phase. This value must consist of lower-case letters, numbers, and hyphens, start with a letter and end with a letter or a number, and have a max length of 63 characters. In other words, it must match the following regex: `^a-z?$`.
     * 
     */
    private String phaseId;
    /**
     * @return (Beta only) Optional. Configuration for the postdeploy job of this phase. If this is not configured, postdeploy job will not be present for this phase.
     * 
     */
    private @Nullable DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPostdeploy postdeploy;
    /**
     * @return (Beta only) Optional. Configuration for the predeploy job of this phase. If this is not configured, predeploy job will not be present for this phase.
     * 
     */
    private @Nullable DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPredeploy predeploy;
    /**
     * @return Skaffold profiles to use when rendering the manifest for this phase. These are in addition to the profiles list specified in the `DeliveryPipeline` stage.
     * 
     */
    private @Nullable List<String> profiles;
    /**
     * @return Whether to run verify tests after the deployment.
     * 
     * ***
     * 
     */
    private @Nullable Boolean verify;

    private DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfig() {}
    /**
     * @return Required. Percentage deployment for the phase.
     * 
     */
    public Integer percentage() {
        return this.percentage;
    }
    /**
     * @return Required. The ID to assign to the `Rollout` phase. This value must consist of lower-case letters, numbers, and hyphens, start with a letter and end with a letter or a number, and have a max length of 63 characters. In other words, it must match the following regex: `^a-z?$`.
     * 
     */
    public String phaseId() {
        return this.phaseId;
    }
    /**
     * @return (Beta only) Optional. Configuration for the postdeploy job of this phase. If this is not configured, postdeploy job will not be present for this phase.
     * 
     */
    public Optional<DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPostdeploy> postdeploy() {
        return Optional.ofNullable(this.postdeploy);
    }
    /**
     * @return (Beta only) Optional. Configuration for the predeploy job of this phase. If this is not configured, predeploy job will not be present for this phase.
     * 
     */
    public Optional<DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPredeploy> predeploy() {
        return Optional.ofNullable(this.predeploy);
    }
    /**
     * @return Skaffold profiles to use when rendering the manifest for this phase. These are in addition to the profiles list specified in the `DeliveryPipeline` stage.
     * 
     */
    public List<String> profiles() {
        return this.profiles == null ? List.of() : this.profiles;
    }
    /**
     * @return Whether to run verify tests after the deployment.
     * 
     * ***
     * 
     */
    public Optional<Boolean> verify() {
        return Optional.ofNullable(this.verify);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer percentage;
        private String phaseId;
        private @Nullable DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPostdeploy postdeploy;
        private @Nullable DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPredeploy predeploy;
        private @Nullable List<String> profiles;
        private @Nullable Boolean verify;
        public Builder() {}
        public Builder(DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentage = defaults.percentage;
    	      this.phaseId = defaults.phaseId;
    	      this.postdeploy = defaults.postdeploy;
    	      this.predeploy = defaults.predeploy;
    	      this.profiles = defaults.profiles;
    	      this.verify = defaults.verify;
        }

        @CustomType.Setter
        public Builder percentage(Integer percentage) {
            this.percentage = Objects.requireNonNull(percentage);
            return this;
        }
        @CustomType.Setter
        public Builder phaseId(String phaseId) {
            this.phaseId = Objects.requireNonNull(phaseId);
            return this;
        }
        @CustomType.Setter
        public Builder postdeploy(@Nullable DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPostdeploy postdeploy) {
            this.postdeploy = postdeploy;
            return this;
        }
        @CustomType.Setter
        public Builder predeploy(@Nullable DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfigPredeploy predeploy) {
            this.predeploy = predeploy;
            return this;
        }
        @CustomType.Setter
        public Builder profiles(@Nullable List<String> profiles) {
            this.profiles = profiles;
            return this;
        }
        public Builder profiles(String... profiles) {
            return profiles(List.of(profiles));
        }
        @CustomType.Setter
        public Builder verify(@Nullable Boolean verify) {
            this.verify = verify;
            return this;
        }
        public DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfig build() {
            final var o = new DeliveryPipelineSerialPipelineStageStrategyCanaryCustomCanaryDeploymentPhaseConfig();
            o.percentage = percentage;
            o.phaseId = phaseId;
            o.postdeploy = postdeploy;
            o.predeploy = predeploy;
            o.profiles = profiles;
            o.verify = verify;
            return o;
        }
    }
}
