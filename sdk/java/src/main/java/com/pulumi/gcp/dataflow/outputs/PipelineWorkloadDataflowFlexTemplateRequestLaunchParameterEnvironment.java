// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment {
    /**
     * @return Additional experiment flags for the job.
     * 
     */
    private @Nullable List<String> additionalExperiments;
    /**
     * @return Additional user labels to be specified for the job. Keys and values should follow the restrictions specified in the labeling restrictions page. An object containing a list of key/value pairs.
     * &#39;Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * &#39;An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * 
     */
    private @Nullable Map<String,String> additionalUserLabels;
    /**
     * @return Whether to enable Streaming Engine for the job.
     * 
     */
    private @Nullable Boolean enableStreamingEngine;
    /**
     * @return Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#FlexResourceSchedulingGoal
     * Possible values are: `FLEXRS_UNSPECIFIED`, `FLEXRS_SPEED_OPTIMIZED`, `FLEXRS_COST_OPTIMIZED`.
     * 
     */
    private @Nullable String flexrsGoal;
    /**
     * @return Configuration for VM IPs.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#WorkerIPAddressConfiguration
     * Possible values are: `WORKER_IP_UNSPECIFIED`, `WORKER_IP_PUBLIC`, `WORKER_IP_PRIVATE`.
     * 
     */
    private @Nullable String ipConfiguration;
    /**
     * @return &#39;Name for the Cloud KMS key for the job. The key format is: projects//locations//keyRings//cryptoKeys/&#39;
     * 
     */
    private @Nullable String kmsKeyName;
    /**
     * @return The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    private @Nullable String machineType;
    /**
     * @return The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    private @Nullable Integer maxWorkers;
    /**
     * @return Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    private @Nullable String network;
    /**
     * @return The initial number of Compute Engine instances for the job.
     * 
     */
    private @Nullable Integer numWorkers;
    /**
     * @return The email address of the service account to run the job as.
     * 
     */
    private @Nullable String serviceAccountEmail;
    /**
     * @return Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form &#34;https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK&#34; or &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    private @Nullable String subnetwork;
    /**
     * @return The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with gs://.
     * 
     */
    private @Nullable String tempLocation;
    /**
     * @return The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with workerZone. If neither workerRegion nor workerZone is specified, default to the control plane&#39;s region.
     * 
     */
    private @Nullable String workerRegion;
    /**
     * @return The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with workerRegion. If neither workerRegion nor workerZone is specified, a zone in the control plane&#39;s region is chosen based on available capacity. If both workerZone and zone are set, workerZone takes precedence.
     * 
     */
    private @Nullable String workerZone;
    /**
     * @return The Compute Engine availability zone for launching worker instances to run your pipeline. In the future, workerZone will take precedence.
     * 
     */
    private @Nullable String zone;

    private PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment() {}
    /**
     * @return Additional experiment flags for the job.
     * 
     */
    public List<String> additionalExperiments() {
        return this.additionalExperiments == null ? List.of() : this.additionalExperiments;
    }
    /**
     * @return Additional user labels to be specified for the job. Keys and values should follow the restrictions specified in the labeling restrictions page. An object containing a list of key/value pairs.
     * &#39;Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * &#39;An object containing a list of &#34;key&#34;: value pairs. Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.&#39;
     * 
     */
    public Map<String,String> additionalUserLabels() {
        return this.additionalUserLabels == null ? Map.of() : this.additionalUserLabels;
    }
    /**
     * @return Whether to enable Streaming Engine for the job.
     * 
     */
    public Optional<Boolean> enableStreamingEngine() {
        return Optional.ofNullable(this.enableStreamingEngine);
    }
    /**
     * @return Set FlexRS goal for the job. https://cloud.google.com/dataflow/docs/guides/flexrs
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#FlexResourceSchedulingGoal
     * Possible values are: `FLEXRS_UNSPECIFIED`, `FLEXRS_SPEED_OPTIMIZED`, `FLEXRS_COST_OPTIMIZED`.
     * 
     */
    public Optional<String> flexrsGoal() {
        return Optional.ofNullable(this.flexrsGoal);
    }
    /**
     * @return Configuration for VM IPs.
     * https://cloud.google.com/dataflow/docs/reference/data-pipelines/rest/v1/projects.locations.pipelines#WorkerIPAddressConfiguration
     * Possible values are: `WORKER_IP_UNSPECIFIED`, `WORKER_IP_PUBLIC`, `WORKER_IP_PRIVATE`.
     * 
     */
    public Optional<String> ipConfiguration() {
        return Optional.ofNullable(this.ipConfiguration);
    }
    /**
     * @return &#39;Name for the Cloud KMS key for the job. The key format is: projects//locations//keyRings//cryptoKeys/&#39;
     * 
     */
    public Optional<String> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }
    /**
     * @return The machine type to use for the job. Defaults to the value from the template if not specified.
     * 
     */
    public Optional<String> machineType() {
        return Optional.ofNullable(this.machineType);
    }
    /**
     * @return The maximum number of Compute Engine instances to be made available to your pipeline during execution, from 1 to 1000.
     * 
     */
    public Optional<Integer> maxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }
    /**
     * @return Network to which VMs will be assigned. If empty or unspecified, the service will use the network &#34;default&#34;.
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return The initial number of Compute Engine instances for the job.
     * 
     */
    public Optional<Integer> numWorkers() {
        return Optional.ofNullable(this.numWorkers);
    }
    /**
     * @return The email address of the service account to run the job as.
     * 
     */
    public Optional<String> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }
    /**
     * @return Subnetwork to which VMs will be assigned, if desired. You can specify a subnetwork using either a complete URL or an abbreviated path. Expected to be of the form &#34;https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK&#34; or &#34;regions/REGION/subnetworks/SUBNETWORK&#34;. If the subnetwork is located in a Shared VPC network, you must use the complete URL.
     * 
     */
    public Optional<String> subnetwork() {
        return Optional.ofNullable(this.subnetwork);
    }
    /**
     * @return The Cloud Storage path to use for temporary files. Must be a valid Cloud Storage URL, beginning with gs://.
     * 
     */
    public Optional<String> tempLocation() {
        return Optional.ofNullable(this.tempLocation);
    }
    /**
     * @return The Compute Engine region (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1&#34;. Mutually exclusive with workerZone. If neither workerRegion nor workerZone is specified, default to the control plane&#39;s region.
     * 
     */
    public Optional<String> workerRegion() {
        return Optional.ofNullable(this.workerRegion);
    }
    /**
     * @return The Compute Engine zone (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in which worker processing should occur, e.g. &#34;us-west1-a&#34;. Mutually exclusive with workerRegion. If neither workerRegion nor workerZone is specified, a zone in the control plane&#39;s region is chosen based on available capacity. If both workerZone and zone are set, workerZone takes precedence.
     * 
     */
    public Optional<String> workerZone() {
        return Optional.ofNullable(this.workerZone);
    }
    /**
     * @return The Compute Engine availability zone for launching worker instances to run your pipeline. In the future, workerZone will take precedence.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> additionalExperiments;
        private @Nullable Map<String,String> additionalUserLabels;
        private @Nullable Boolean enableStreamingEngine;
        private @Nullable String flexrsGoal;
        private @Nullable String ipConfiguration;
        private @Nullable String kmsKeyName;
        private @Nullable String machineType;
        private @Nullable Integer maxWorkers;
        private @Nullable String network;
        private @Nullable Integer numWorkers;
        private @Nullable String serviceAccountEmail;
        private @Nullable String subnetwork;
        private @Nullable String tempLocation;
        private @Nullable String workerRegion;
        private @Nullable String workerZone;
        private @Nullable String zone;
        public Builder() {}
        public Builder(PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalExperiments = defaults.additionalExperiments;
    	      this.additionalUserLabels = defaults.additionalUserLabels;
    	      this.enableStreamingEngine = defaults.enableStreamingEngine;
    	      this.flexrsGoal = defaults.flexrsGoal;
    	      this.ipConfiguration = defaults.ipConfiguration;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.machineType = defaults.machineType;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.network = defaults.network;
    	      this.numWorkers = defaults.numWorkers;
    	      this.serviceAccountEmail = defaults.serviceAccountEmail;
    	      this.subnetwork = defaults.subnetwork;
    	      this.tempLocation = defaults.tempLocation;
    	      this.workerRegion = defaults.workerRegion;
    	      this.workerZone = defaults.workerZone;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder additionalExperiments(@Nullable List<String> additionalExperiments) {
            this.additionalExperiments = additionalExperiments;
            return this;
        }
        public Builder additionalExperiments(String... additionalExperiments) {
            return additionalExperiments(List.of(additionalExperiments));
        }
        @CustomType.Setter
        public Builder additionalUserLabels(@Nullable Map<String,String> additionalUserLabels) {
            this.additionalUserLabels = additionalUserLabels;
            return this;
        }
        @CustomType.Setter
        public Builder enableStreamingEngine(@Nullable Boolean enableStreamingEngine) {
            this.enableStreamingEngine = enableStreamingEngine;
            return this;
        }
        @CustomType.Setter
        public Builder flexrsGoal(@Nullable String flexrsGoal) {
            this.flexrsGoal = flexrsGoal;
            return this;
        }
        @CustomType.Setter
        public Builder ipConfiguration(@Nullable String ipConfiguration) {
            this.ipConfiguration = ipConfiguration;
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyName(@Nullable String kmsKeyName) {
            this.kmsKeyName = kmsKeyName;
            return this;
        }
        @CustomType.Setter
        public Builder machineType(@Nullable String machineType) {
            this.machineType = machineType;
            return this;
        }
        @CustomType.Setter
        public Builder maxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder numWorkers(@Nullable Integer numWorkers) {
            this.numWorkers = numWorkers;
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountEmail(@Nullable String serviceAccountEmail) {
            this.serviceAccountEmail = serviceAccountEmail;
            return this;
        }
        @CustomType.Setter
        public Builder subnetwork(@Nullable String subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }
        @CustomType.Setter
        public Builder tempLocation(@Nullable String tempLocation) {
            this.tempLocation = tempLocation;
            return this;
        }
        @CustomType.Setter
        public Builder workerRegion(@Nullable String workerRegion) {
            this.workerRegion = workerRegion;
            return this;
        }
        @CustomType.Setter
        public Builder workerZone(@Nullable String workerZone) {
            this.workerZone = workerZone;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment build() {
            final var o = new PipelineWorkloadDataflowFlexTemplateRequestLaunchParameterEnvironment();
            o.additionalExperiments = additionalExperiments;
            o.additionalUserLabels = additionalUserLabels;
            o.enableStreamingEngine = enableStreamingEngine;
            o.flexrsGoal = flexrsGoal;
            o.ipConfiguration = ipConfiguration;
            o.kmsKeyName = kmsKeyName;
            o.machineType = machineType;
            o.maxWorkers = maxWorkers;
            o.network = network;
            o.numWorkers = numWorkers;
            o.serviceAccountEmail = serviceAccountEmail;
            o.subnetwork = subnetwork;
            o.tempLocation = tempLocation;
            o.workerRegion = workerRegion;
            o.workerZone = workerZone;
            o.zone = zone;
            return o;
        }
    }
}
