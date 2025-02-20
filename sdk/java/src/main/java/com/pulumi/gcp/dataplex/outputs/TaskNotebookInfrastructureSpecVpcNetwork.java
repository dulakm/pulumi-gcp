// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskNotebookInfrastructureSpecVpcNetwork {
    /**
     * @return The Cloud VPC network in which the job is run. By default, the Cloud VPC network named Default within the project is used.
     * 
     */
    private @Nullable String network;
    /**
     * @return List of network tags to apply to the job.
     * 
     */
    private @Nullable List<String> networkTags;
    /**
     * @return The Cloud VPC sub-network in which the job is run.
     * 
     */
    private @Nullable String subNetwork;

    private TaskNotebookInfrastructureSpecVpcNetwork() {}
    /**
     * @return The Cloud VPC network in which the job is run. By default, the Cloud VPC network named Default within the project is used.
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return List of network tags to apply to the job.
     * 
     */
    public List<String> networkTags() {
        return this.networkTags == null ? List.of() : this.networkTags;
    }
    /**
     * @return The Cloud VPC sub-network in which the job is run.
     * 
     */
    public Optional<String> subNetwork() {
        return Optional.ofNullable(this.subNetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskNotebookInfrastructureSpecVpcNetwork defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String network;
        private @Nullable List<String> networkTags;
        private @Nullable String subNetwork;
        public Builder() {}
        public Builder(TaskNotebookInfrastructureSpecVpcNetwork defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.network = defaults.network;
    	      this.networkTags = defaults.networkTags;
    	      this.subNetwork = defaults.subNetwork;
        }

        @CustomType.Setter
        public Builder network(@Nullable String network) {
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder networkTags(@Nullable List<String> networkTags) {
            this.networkTags = networkTags;
            return this;
        }
        public Builder networkTags(String... networkTags) {
            return networkTags(List.of(networkTags));
        }
        @CustomType.Setter
        public Builder subNetwork(@Nullable String subNetwork) {
            this.subNetwork = subNetwork;
            return this;
        }
        public TaskNotebookInfrastructureSpecVpcNetwork build() {
            final var o = new TaskNotebookInfrastructureSpecVpcNetwork();
            o.network = network;
            o.networkTags = networkTags;
            o.subNetwork = subNetwork;
            return o;
        }
    }
}
