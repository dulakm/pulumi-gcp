// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskExecutionStatusLatestJob {
    /**
     * @return (Output)
     * The time when the job ended.
     * 
     */
    private @Nullable String endTime;
    /**
     * @return (Output)
     * Additional information about the current state.
     * 
     */
    private @Nullable String message;
    /**
     * @return (Output)
     * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
     * 
     */
    private @Nullable String name;
    /**
     * @return (Output)
     * The number of times the job has been retried (excluding the initial attempt).
     * 
     */
    private @Nullable Integer retryCount;
    /**
     * @return (Output)
     * The underlying service running a job.
     * 
     */
    private @Nullable String service;
    /**
     * @return (Output)
     * The full resource name for the job run under a particular service.
     * 
     */
    private @Nullable String serviceJob;
    /**
     * @return The first run of the task will be after this time. If not specified, the task will run shortly after being submitted if ON_DEMAND and based on the schedule if RECURRING.
     * 
     */
    private @Nullable String startTime;
    /**
     * @return (Output)
     * Execution state for the job.
     * 
     */
    private @Nullable String state;
    /**
     * @return (Output)
     * System generated globally unique ID for the job.
     * 
     */
    private @Nullable String uid;

    private TaskExecutionStatusLatestJob() {}
    /**
     * @return (Output)
     * The time when the job ended.
     * 
     */
    public Optional<String> endTime() {
        return Optional.ofNullable(this.endTime);
    }
    /**
     * @return (Output)
     * Additional information about the current state.
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return (Output)
     * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return (Output)
     * The number of times the job has been retried (excluding the initial attempt).
     * 
     */
    public Optional<Integer> retryCount() {
        return Optional.ofNullable(this.retryCount);
    }
    /**
     * @return (Output)
     * The underlying service running a job.
     * 
     */
    public Optional<String> service() {
        return Optional.ofNullable(this.service);
    }
    /**
     * @return (Output)
     * The full resource name for the job run under a particular service.
     * 
     */
    public Optional<String> serviceJob() {
        return Optional.ofNullable(this.serviceJob);
    }
    /**
     * @return The first run of the task will be after this time. If not specified, the task will run shortly after being submitted if ON_DEMAND and based on the schedule if RECURRING.
     * 
     */
    public Optional<String> startTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * @return (Output)
     * Execution state for the job.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return (Output)
     * System generated globally unique ID for the job.
     * 
     */
    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskExecutionStatusLatestJob defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String endTime;
        private @Nullable String message;
        private @Nullable String name;
        private @Nullable Integer retryCount;
        private @Nullable String service;
        private @Nullable String serviceJob;
        private @Nullable String startTime;
        private @Nullable String state;
        private @Nullable String uid;
        public Builder() {}
        public Builder(TaskExecutionStatusLatestJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTime = defaults.endTime;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.retryCount = defaults.retryCount;
    	      this.service = defaults.service;
    	      this.serviceJob = defaults.serviceJob;
    	      this.startTime = defaults.startTime;
    	      this.state = defaults.state;
    	      this.uid = defaults.uid;
        }

        @CustomType.Setter
        public Builder endTime(@Nullable String endTime) {
            this.endTime = endTime;
            return this;
        }
        @CustomType.Setter
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder retryCount(@Nullable Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        @CustomType.Setter
        public Builder service(@Nullable String service) {
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder serviceJob(@Nullable String serviceJob) {
            this.serviceJob = serviceJob;
            return this;
        }
        @CustomType.Setter
        public Builder startTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder uid(@Nullable String uid) {
            this.uid = uid;
            return this;
        }
        public TaskExecutionStatusLatestJob build() {
            final var o = new TaskExecutionStatusLatestJob();
            o.endTime = endTime;
            o.message = message;
            o.name = name;
            o.retryCount = retryCount;
            o.service = service;
            o.serviceJob = serviceJob;
            o.startTime = startTime;
            o.state = state;
            o.uid = uid;
            return o;
        }
    }
}
