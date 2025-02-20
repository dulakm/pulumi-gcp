// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs;
import com.pulumi.gcp.clouddeploy.inputs.DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPredeployArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs Empty = new DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs();

    /**
     * Required. The percentage based deployments that will occur as a part of a `Rollout`. List is expected in ascending order and each integer n is 0 &lt;= n &lt; 100.
     * 
     */
    @Import(name="percentages", required=true)
    private Output<List<Integer>> percentages;

    /**
     * @return Required. The percentage based deployments that will occur as a part of a `Rollout`. List is expected in ascending order and each integer n is 0 &lt;= n &lt; 100.
     * 
     */
    public Output<List<Integer>> percentages() {
        return this.percentages;
    }

    /**
     * (Beta only) Optional. Configuration for the postdeploy job of the last phase. If this is not configured, postdeploy job will not be present.
     * 
     */
    @Import(name="postdeploy")
    private @Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs> postdeploy;

    /**
     * @return (Beta only) Optional. Configuration for the postdeploy job of the last phase. If this is not configured, postdeploy job will not be present.
     * 
     */
    public Optional<Output<DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs>> postdeploy() {
        return Optional.ofNullable(this.postdeploy);
    }

    /**
     * (Beta only) Optional. Configuration for the predeploy job of the first phase. If this is not configured, predeploy job will not be present.
     * 
     */
    @Import(name="predeploy")
    private @Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPredeployArgs> predeploy;

    /**
     * @return (Beta only) Optional. Configuration for the predeploy job of the first phase. If this is not configured, predeploy job will not be present.
     * 
     */
    public Optional<Output<DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPredeployArgs>> predeploy() {
        return Optional.ofNullable(this.predeploy);
    }

    /**
     * Whether to run verify tests after each percentage deployment.
     * 
     */
    @Import(name="verify")
    private @Nullable Output<Boolean> verify;

    /**
     * @return Whether to run verify tests after each percentage deployment.
     * 
     */
    public Optional<Output<Boolean>> verify() {
        return Optional.ofNullable(this.verify);
    }

    private DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs() {}

    private DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs $) {
        this.percentages = $.percentages;
        this.postdeploy = $.postdeploy;
        this.predeploy = $.predeploy;
        this.verify = $.verify;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs $;

        public Builder() {
            $ = new DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs();
        }

        public Builder(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs defaults) {
            $ = new DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param percentages Required. The percentage based deployments that will occur as a part of a `Rollout`. List is expected in ascending order and each integer n is 0 &lt;= n &lt; 100.
         * 
         * @return builder
         * 
         */
        public Builder percentages(Output<List<Integer>> percentages) {
            $.percentages = percentages;
            return this;
        }

        /**
         * @param percentages Required. The percentage based deployments that will occur as a part of a `Rollout`. List is expected in ascending order and each integer n is 0 &lt;= n &lt; 100.
         * 
         * @return builder
         * 
         */
        public Builder percentages(List<Integer> percentages) {
            return percentages(Output.of(percentages));
        }

        /**
         * @param percentages Required. The percentage based deployments that will occur as a part of a `Rollout`. List is expected in ascending order and each integer n is 0 &lt;= n &lt; 100.
         * 
         * @return builder
         * 
         */
        public Builder percentages(Integer... percentages) {
            return percentages(List.of(percentages));
        }

        /**
         * @param postdeploy (Beta only) Optional. Configuration for the postdeploy job of the last phase. If this is not configured, postdeploy job will not be present.
         * 
         * @return builder
         * 
         */
        public Builder postdeploy(@Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs> postdeploy) {
            $.postdeploy = postdeploy;
            return this;
        }

        /**
         * @param postdeploy (Beta only) Optional. Configuration for the postdeploy job of the last phase. If this is not configured, postdeploy job will not be present.
         * 
         * @return builder
         * 
         */
        public Builder postdeploy(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPostdeployArgs postdeploy) {
            return postdeploy(Output.of(postdeploy));
        }

        /**
         * @param predeploy (Beta only) Optional. Configuration for the predeploy job of the first phase. If this is not configured, predeploy job will not be present.
         * 
         * @return builder
         * 
         */
        public Builder predeploy(@Nullable Output<DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPredeployArgs> predeploy) {
            $.predeploy = predeploy;
            return this;
        }

        /**
         * @param predeploy (Beta only) Optional. Configuration for the predeploy job of the first phase. If this is not configured, predeploy job will not be present.
         * 
         * @return builder
         * 
         */
        public Builder predeploy(DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentPredeployArgs predeploy) {
            return predeploy(Output.of(predeploy));
        }

        /**
         * @param verify Whether to run verify tests after each percentage deployment.
         * 
         * @return builder
         * 
         */
        public Builder verify(@Nullable Output<Boolean> verify) {
            $.verify = verify;
            return this;
        }

        /**
         * @param verify Whether to run verify tests after each percentage deployment.
         * 
         * @return builder
         * 
         */
        public Builder verify(Boolean verify) {
            return verify(Output.of(verify));
        }

        public DeliveryPipelineSerialPipelineStageStrategyCanaryCanaryDeploymentArgs build() {
            $.percentages = Objects.requireNonNull($.percentages, "expected parameter 'percentages' to be non-null");
            return $;
        }
    }

}
