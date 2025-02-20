// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataflow.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataflow.outputs.PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineWorkloadDataflowFlexTemplateRequest {
    /**
     * @return Parameter to launch a job from a Flex Template.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplateparameter
     * Structure is documented below.
     * 
     */
    private PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter launchParameter;
    /**
     * @return The regional endpoint to which to direct the request. For example, us-central1, us-west1.
     * 
     */
    private String location;
    /**
     * @return The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    private String projectId;
    /**
     * @return If true, the request is validated but not actually executed. Defaults to false.
     * 
     */
    private @Nullable Boolean validateOnly;

    private PipelineWorkloadDataflowFlexTemplateRequest() {}
    /**
     * @return Parameter to launch a job from a Flex Template.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#launchflextemplateparameter
     * Structure is documented below.
     * 
     */
    public PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter launchParameter() {
        return this.launchParameter;
    }
    /**
     * @return The regional endpoint to which to direct the request. For example, us-central1, us-west1.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The ID of the Cloud Platform project that the job belongs to.
     * 
     */
    public String projectId() {
        return this.projectId;
    }
    /**
     * @return If true, the request is validated but not actually executed. Defaults to false.
     * 
     */
    public Optional<Boolean> validateOnly() {
        return Optional.ofNullable(this.validateOnly);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineWorkloadDataflowFlexTemplateRequest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter launchParameter;
        private String location;
        private String projectId;
        private @Nullable Boolean validateOnly;
        public Builder() {}
        public Builder(PipelineWorkloadDataflowFlexTemplateRequest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.launchParameter = defaults.launchParameter;
    	      this.location = defaults.location;
    	      this.projectId = defaults.projectId;
    	      this.validateOnly = defaults.validateOnly;
        }

        @CustomType.Setter
        public Builder launchParameter(PipelineWorkloadDataflowFlexTemplateRequestLaunchParameter launchParameter) {
            this.launchParameter = Objects.requireNonNull(launchParameter);
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder validateOnly(@Nullable Boolean validateOnly) {
            this.validateOnly = validateOnly;
            return this;
        }
        public PipelineWorkloadDataflowFlexTemplateRequest build() {
            final var o = new PipelineWorkloadDataflowFlexTemplateRequest();
            o.launchParameter = launchParameter;
            o.location = location;
            o.projectId = projectId;
            o.validateOnly = validateOnly;
            return o;
        }
    }
}
