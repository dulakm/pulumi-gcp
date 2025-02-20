// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfig {
    private @Nullable String instanceGroupManagerName;
    private @Nullable String instanceTemplateName;

    private WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfig() {}
    public Optional<String> instanceGroupManagerName() {
        return Optional.ofNullable(this.instanceGroupManagerName);
    }
    public Optional<String> instanceTemplateName() {
        return Optional.ofNullable(this.instanceTemplateName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String instanceGroupManagerName;
        private @Nullable String instanceTemplateName;
        public Builder() {}
        public Builder(WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceGroupManagerName = defaults.instanceGroupManagerName;
    	      this.instanceTemplateName = defaults.instanceTemplateName;
        }

        @CustomType.Setter
        public Builder instanceGroupManagerName(@Nullable String instanceGroupManagerName) {
            this.instanceGroupManagerName = instanceGroupManagerName;
            return this;
        }
        @CustomType.Setter
        public Builder instanceTemplateName(@Nullable String instanceTemplateName) {
            this.instanceTemplateName = instanceTemplateName;
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfig build() {
            final var o = new WorkflowTemplatePlacementManagedClusterConfigSecondaryWorkerConfigManagedGroupConfig();
            o.instanceGroupManagerName = instanceGroupManagerName;
            o.instanceTemplateName = instanceTemplateName;
            return o;
        }
    }
}
