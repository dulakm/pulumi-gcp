// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobAction;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfig;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfig;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJob {
    /**
     * @return A task to execute on the completion of a job.
     * Structure is documented below.
     * 
     */
    private @Nullable List<PreventionJobTriggerInspectJobAction> actions;
    /**
     * @return The core content of the template.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfig inspectConfig;
    /**
     * @return The name of the template to run when this job is triggered.
     * 
     */
    private @Nullable String inspectTemplateName;
    /**
     * @return Information on where to inspect
     * Structure is documented below.
     * 
     */
    private PreventionJobTriggerInspectJobStorageConfig storageConfig;

    private PreventionJobTriggerInspectJob() {}
    /**
     * @return A task to execute on the completion of a job.
     * Structure is documented below.
     * 
     */
    public List<PreventionJobTriggerInspectJobAction> actions() {
        return this.actions == null ? List.of() : this.actions;
    }
    /**
     * @return The core content of the template.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionJobTriggerInspectJobInspectConfig> inspectConfig() {
        return Optional.ofNullable(this.inspectConfig);
    }
    /**
     * @return The name of the template to run when this job is triggered.
     * 
     */
    public Optional<String> inspectTemplateName() {
        return Optional.ofNullable(this.inspectTemplateName);
    }
    /**
     * @return Information on where to inspect
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobStorageConfig storageConfig() {
        return this.storageConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJob defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PreventionJobTriggerInspectJobAction> actions;
        private @Nullable PreventionJobTriggerInspectJobInspectConfig inspectConfig;
        private @Nullable String inspectTemplateName;
        private PreventionJobTriggerInspectJobStorageConfig storageConfig;
        public Builder() {}
        public Builder(PreventionJobTriggerInspectJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.inspectConfig = defaults.inspectConfig;
    	      this.inspectTemplateName = defaults.inspectTemplateName;
    	      this.storageConfig = defaults.storageConfig;
        }

        @CustomType.Setter
        public Builder actions(@Nullable List<PreventionJobTriggerInspectJobAction> actions) {
            this.actions = actions;
            return this;
        }
        public Builder actions(PreventionJobTriggerInspectJobAction... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder inspectConfig(@Nullable PreventionJobTriggerInspectJobInspectConfig inspectConfig) {
            this.inspectConfig = inspectConfig;
            return this;
        }
        @CustomType.Setter
        public Builder inspectTemplateName(@Nullable String inspectTemplateName) {
            this.inspectTemplateName = inspectTemplateName;
            return this;
        }
        @CustomType.Setter
        public Builder storageConfig(PreventionJobTriggerInspectJobStorageConfig storageConfig) {
            this.storageConfig = Objects.requireNonNull(storageConfig);
            return this;
        }
        public PreventionJobTriggerInspectJob build() {
            final var o = new PreventionJobTriggerInspectJob();
            o.actions = actions;
            o.inspectConfig = inspectConfig;
            o.inspectTemplateName = inspectTemplateName;
            o.storageConfig = storageConfig;
            return o;
        }
    }
}
