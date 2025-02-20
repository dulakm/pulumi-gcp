// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataplex.outputs.TaskExecutionStatusLatestJob;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskExecutionStatus {
    /**
     * @return (Output)
     * latest job execution.
     * Structure is documented below.
     * 
     */
    private @Nullable List<TaskExecutionStatusLatestJob> latestJobs;
    /**
     * @return (Output)
     * Last update time of the status.
     * 
     */
    private @Nullable String updateTime;

    private TaskExecutionStatus() {}
    /**
     * @return (Output)
     * latest job execution.
     * Structure is documented below.
     * 
     */
    public List<TaskExecutionStatusLatestJob> latestJobs() {
        return this.latestJobs == null ? List.of() : this.latestJobs;
    }
    /**
     * @return (Output)
     * Last update time of the status.
     * 
     */
    public Optional<String> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskExecutionStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<TaskExecutionStatusLatestJob> latestJobs;
        private @Nullable String updateTime;
        public Builder() {}
        public Builder(TaskExecutionStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.latestJobs = defaults.latestJobs;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder latestJobs(@Nullable List<TaskExecutionStatusLatestJob> latestJobs) {
            this.latestJobs = latestJobs;
            return this;
        }
        public Builder latestJobs(TaskExecutionStatusLatestJob... latestJobs) {
            return latestJobs(List.of(latestJobs));
        }
        @CustomType.Setter
        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public TaskExecutionStatus build() {
            final var o = new TaskExecutionStatus();
            o.latestJobs = latestJobs;
            o.updateTime = updateTime;
            return o;
        }
    }
}
