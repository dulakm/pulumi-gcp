// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.clouddeploy.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryPipelineConditionTargetsPresentCondition {
    private @Nullable List<String> missingTargets;
    private @Nullable Boolean status;
    /**
     * @return Output only. Most recent time at which the pipeline was updated.
     * 
     */
    private @Nullable String updateTime;

    private DeliveryPipelineConditionTargetsPresentCondition() {}
    public List<String> missingTargets() {
        return this.missingTargets == null ? List.of() : this.missingTargets;
    }
    public Optional<Boolean> status() {
        return Optional.ofNullable(this.status);
    }
    /**
     * @return Output only. Most recent time at which the pipeline was updated.
     * 
     */
    public Optional<String> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryPipelineConditionTargetsPresentCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> missingTargets;
        private @Nullable Boolean status;
        private @Nullable String updateTime;
        public Builder() {}
        public Builder(DeliveryPipelineConditionTargetsPresentCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.missingTargets = defaults.missingTargets;
    	      this.status = defaults.status;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder missingTargets(@Nullable List<String> missingTargets) {
            this.missingTargets = missingTargets;
            return this;
        }
        public Builder missingTargets(String... missingTargets) {
            return missingTargets(List.of(missingTargets));
        }
        @CustomType.Setter
        public Builder status(@Nullable Boolean status) {
            this.status = status;
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public DeliveryPipelineConditionTargetsPresentCondition build() {
            final var o = new DeliveryPipelineConditionTargetsPresentCondition();
            o.missingTargets = missingTargets;
            o.status = status;
            o.updateTime = updateTime;
            return o;
        }
    }
}
