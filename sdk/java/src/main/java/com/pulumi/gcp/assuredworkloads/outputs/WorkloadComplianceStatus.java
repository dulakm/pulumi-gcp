// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.assuredworkloads.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadComplianceStatus {
    private @Nullable List<Integer> acknowledgedViolationCounts;
    private @Nullable List<Integer> activeViolationCounts;

    private WorkloadComplianceStatus() {}
    public List<Integer> acknowledgedViolationCounts() {
        return this.acknowledgedViolationCounts == null ? List.of() : this.acknowledgedViolationCounts;
    }
    public List<Integer> activeViolationCounts() {
        return this.activeViolationCounts == null ? List.of() : this.activeViolationCounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadComplianceStatus defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<Integer> acknowledgedViolationCounts;
        private @Nullable List<Integer> activeViolationCounts;
        public Builder() {}
        public Builder(WorkloadComplianceStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgedViolationCounts = defaults.acknowledgedViolationCounts;
    	      this.activeViolationCounts = defaults.activeViolationCounts;
        }

        @CustomType.Setter
        public Builder acknowledgedViolationCounts(@Nullable List<Integer> acknowledgedViolationCounts) {
            this.acknowledgedViolationCounts = acknowledgedViolationCounts;
            return this;
        }
        public Builder acknowledgedViolationCounts(Integer... acknowledgedViolationCounts) {
            return acknowledgedViolationCounts(List.of(acknowledgedViolationCounts));
        }
        @CustomType.Setter
        public Builder activeViolationCounts(@Nullable List<Integer> activeViolationCounts) {
            this.activeViolationCounts = activeViolationCounts;
            return this;
        }
        public Builder activeViolationCounts(Integer... activeViolationCounts) {
            return activeViolationCounts(List.of(activeViolationCounts));
        }
        public WorkloadComplianceStatus build() {
            final var o = new WorkloadComplianceStatus();
            o.acknowledgedViolationCounts = acknowledgedViolationCounts;
            o.activeViolationCounts = activeViolationCounts;
            return o;
        }
    }
}
