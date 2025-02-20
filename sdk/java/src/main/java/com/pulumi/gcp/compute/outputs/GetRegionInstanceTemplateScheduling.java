// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateSchedulingMaxRunDuration;
import com.pulumi.gcp.compute.outputs.GetRegionInstanceTemplateSchedulingNodeAffinity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceTemplateScheduling {
    /**
     * @return Specifies whether the instance should be
     * automatically restarted if it is terminated by Compute Engine (not
     * terminated by a user). This defaults to true.
     * 
     */
    private Boolean automaticRestart;
    /**
     * @return Describe the type of termination action for `SPOT` VM. Can be `STOP` or `DELETE`.  Read more on [here](https://cloud.google.com/compute/docs/instances/create-use-spot)
     * 
     */
    private String instanceTerminationAction;
    private List<GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout> localSsdRecoveryTimeouts;
    private String maintenanceInterval;
    private List<GetRegionInstanceTemplateSchedulingMaxRunDuration> maxRunDurations;
    private Integer minNodeCpus;
    /**
     * @return Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    private List<GetRegionInstanceTemplateSchedulingNodeAffinity> nodeAffinities;
    /**
     * @return Defines the maintenance behavior for this
     * instance.
     * 
     */
    private String onHostMaintenance;
    /**
     * @return Allows instance to be preempted. This defaults to
     * false. Read more on this
     * [here](https://cloud.google.com/compute/docs/instances/preemptible).
     * 
     */
    private Boolean preemptible;
    /**
     * @return Describe the type of preemptible VM.
     * 
     */
    private String provisioningModel;

    private GetRegionInstanceTemplateScheduling() {}
    /**
     * @return Specifies whether the instance should be
     * automatically restarted if it is terminated by Compute Engine (not
     * terminated by a user). This defaults to true.
     * 
     */
    public Boolean automaticRestart() {
        return this.automaticRestart;
    }
    /**
     * @return Describe the type of termination action for `SPOT` VM. Can be `STOP` or `DELETE`.  Read more on [here](https://cloud.google.com/compute/docs/instances/create-use-spot)
     * 
     */
    public String instanceTerminationAction() {
        return this.instanceTerminationAction;
    }
    public List<GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout> localSsdRecoveryTimeouts() {
        return this.localSsdRecoveryTimeouts;
    }
    public String maintenanceInterval() {
        return this.maintenanceInterval;
    }
    public List<GetRegionInstanceTemplateSchedulingMaxRunDuration> maxRunDurations() {
        return this.maxRunDurations;
    }
    public Integer minNodeCpus() {
        return this.minNodeCpus;
    }
    /**
     * @return Specifies node affinities or anti-affinities
     * to determine which sole-tenant nodes your instances and managed instance
     * groups will use as host systems. Read more on sole-tenant node creation
     * [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
     * Structure documented below.
     * 
     */
    public List<GetRegionInstanceTemplateSchedulingNodeAffinity> nodeAffinities() {
        return this.nodeAffinities;
    }
    /**
     * @return Defines the maintenance behavior for this
     * instance.
     * 
     */
    public String onHostMaintenance() {
        return this.onHostMaintenance;
    }
    /**
     * @return Allows instance to be preempted. This defaults to
     * false. Read more on this
     * [here](https://cloud.google.com/compute/docs/instances/preemptible).
     * 
     */
    public Boolean preemptible() {
        return this.preemptible;
    }
    /**
     * @return Describe the type of preemptible VM.
     * 
     */
    public String provisioningModel() {
        return this.provisioningModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceTemplateScheduling defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean automaticRestart;
        private String instanceTerminationAction;
        private List<GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout> localSsdRecoveryTimeouts;
        private String maintenanceInterval;
        private List<GetRegionInstanceTemplateSchedulingMaxRunDuration> maxRunDurations;
        private Integer minNodeCpus;
        private List<GetRegionInstanceTemplateSchedulingNodeAffinity> nodeAffinities;
        private String onHostMaintenance;
        private Boolean preemptible;
        private String provisioningModel;
        public Builder() {}
        public Builder(GetRegionInstanceTemplateScheduling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.localSsdRecoveryTimeouts = defaults.localSsdRecoveryTimeouts;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.maxRunDurations = defaults.maxRunDurations;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        @CustomType.Setter
        public Builder automaticRestart(Boolean automaticRestart) {
            this.automaticRestart = Objects.requireNonNull(automaticRestart);
            return this;
        }
        @CustomType.Setter
        public Builder instanceTerminationAction(String instanceTerminationAction) {
            this.instanceTerminationAction = Objects.requireNonNull(instanceTerminationAction);
            return this;
        }
        @CustomType.Setter
        public Builder localSsdRecoveryTimeouts(List<GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout> localSsdRecoveryTimeouts) {
            this.localSsdRecoveryTimeouts = Objects.requireNonNull(localSsdRecoveryTimeouts);
            return this;
        }
        public Builder localSsdRecoveryTimeouts(GetRegionInstanceTemplateSchedulingLocalSsdRecoveryTimeout... localSsdRecoveryTimeouts) {
            return localSsdRecoveryTimeouts(List.of(localSsdRecoveryTimeouts));
        }
        @CustomType.Setter
        public Builder maintenanceInterval(String maintenanceInterval) {
            this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval);
            return this;
        }
        @CustomType.Setter
        public Builder maxRunDurations(List<GetRegionInstanceTemplateSchedulingMaxRunDuration> maxRunDurations) {
            this.maxRunDurations = Objects.requireNonNull(maxRunDurations);
            return this;
        }
        public Builder maxRunDurations(GetRegionInstanceTemplateSchedulingMaxRunDuration... maxRunDurations) {
            return maxRunDurations(List.of(maxRunDurations));
        }
        @CustomType.Setter
        public Builder minNodeCpus(Integer minNodeCpus) {
            this.minNodeCpus = Objects.requireNonNull(minNodeCpus);
            return this;
        }
        @CustomType.Setter
        public Builder nodeAffinities(List<GetRegionInstanceTemplateSchedulingNodeAffinity> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(GetRegionInstanceTemplateSchedulingNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        @CustomType.Setter
        public Builder onHostMaintenance(String onHostMaintenance) {
            this.onHostMaintenance = Objects.requireNonNull(onHostMaintenance);
            return this;
        }
        @CustomType.Setter
        public Builder preemptible(Boolean preemptible) {
            this.preemptible = Objects.requireNonNull(preemptible);
            return this;
        }
        @CustomType.Setter
        public Builder provisioningModel(String provisioningModel) {
            this.provisioningModel = Objects.requireNonNull(provisioningModel);
            return this;
        }
        public GetRegionInstanceTemplateScheduling build() {
            final var o = new GetRegionInstanceTemplateScheduling();
            o.automaticRestart = automaticRestart;
            o.instanceTerminationAction = instanceTerminationAction;
            o.localSsdRecoveryTimeouts = localSsdRecoveryTimeouts;
            o.maintenanceInterval = maintenanceInterval;
            o.maxRunDurations = maxRunDurations;
            o.minNodeCpus = minNodeCpus;
            o.nodeAffinities = nodeAffinities;
            o.onHostMaintenance = onHostMaintenance;
            o.preemptible = preemptible;
            o.provisioningModel = provisioningModel;
            return o;
        }
    }
}
