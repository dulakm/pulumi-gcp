// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalClusterNodeConfig {
    /**
     * @return The available runtimes that can be used to run containers in a Bare Metal User Cluster.
     * Possible values are: `CONTAINER_RUNTIME_UNSPECIFIED`, `DOCKER`, `CONTAINERD`.
     * 
     */
    private @Nullable String containerRuntime;
    /**
     * @return The maximum number of pods a node can run. The size of the CIDR range
     * assigned to the node will be derived from this parameter.
     * 
     */
    private @Nullable Integer maxPodsPerNode;

    private BareMetalClusterNodeConfig() {}
    /**
     * @return The available runtimes that can be used to run containers in a Bare Metal User Cluster.
     * Possible values are: `CONTAINER_RUNTIME_UNSPECIFIED`, `DOCKER`, `CONTAINERD`.
     * 
     */
    public Optional<String> containerRuntime() {
        return Optional.ofNullable(this.containerRuntime);
    }
    /**
     * @return The maximum number of pods a node can run. The size of the CIDR range
     * assigned to the node will be derived from this parameter.
     * 
     */
    public Optional<Integer> maxPodsPerNode() {
        return Optional.ofNullable(this.maxPodsPerNode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalClusterNodeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String containerRuntime;
        private @Nullable Integer maxPodsPerNode;
        public Builder() {}
        public Builder(BareMetalClusterNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerRuntime = defaults.containerRuntime;
    	      this.maxPodsPerNode = defaults.maxPodsPerNode;
        }

        @CustomType.Setter
        public Builder containerRuntime(@Nullable String containerRuntime) {
            this.containerRuntime = containerRuntime;
            return this;
        }
        @CustomType.Setter
        public Builder maxPodsPerNode(@Nullable Integer maxPodsPerNode) {
            this.maxPodsPerNode = maxPodsPerNode;
            return this;
        }
        public BareMetalClusterNodeConfig build() {
            final var o = new BareMetalClusterNodeConfig();
            o.containerRuntime = containerRuntime;
            o.maxPodsPerNode = maxPodsPerNode;
            return o;
        }
    }
}
