// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.NodePoolNodeConfigSoleTenantConfigNodeAffinity;
import java.util.List;
import java.util.Objects;

@CustomType
public final class NodePoolNodeConfigSoleTenantConfig {
    private List<NodePoolNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities;

    private NodePoolNodeConfigSoleTenantConfig() {}
    public List<NodePoolNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities() {
        return this.nodeAffinities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigSoleTenantConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<NodePoolNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities;
        public Builder() {}
        public Builder(NodePoolNodeConfigSoleTenantConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeAffinities = defaults.nodeAffinities;
        }

        @CustomType.Setter
        public Builder nodeAffinities(List<NodePoolNodeConfigSoleTenantConfigNodeAffinity> nodeAffinities) {
            this.nodeAffinities = Objects.requireNonNull(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(NodePoolNodeConfigSoleTenantConfigNodeAffinity... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public NodePoolNodeConfigSoleTenantConfig build() {
            final var o = new NodePoolNodeConfigSoleTenantConfig();
            o.nodeAffinities = nodeAffinities;
            return o;
        }
    }
}
