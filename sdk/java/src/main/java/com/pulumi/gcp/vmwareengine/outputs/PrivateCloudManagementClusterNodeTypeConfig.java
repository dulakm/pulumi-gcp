// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vmwareengine.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PrivateCloudManagementClusterNodeTypeConfig {
    /**
     * @return Customized number of cores available to each node of the type.
     * This number must always be one of `nodeType.availableCustomCoreCounts`.
     * If zero is provided max value from `nodeType.availableCustomCoreCounts` will be used.
     * This cannot be changed once the PrivateCloud is created.
     * 
     * ***
     * 
     */
    private @Nullable Integer customCoreCount;
    /**
     * @return The number of nodes of this type in the cluster.
     * 
     */
    private Integer nodeCount;
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    private String nodeTypeId;

    private PrivateCloudManagementClusterNodeTypeConfig() {}
    /**
     * @return Customized number of cores available to each node of the type.
     * This number must always be one of `nodeType.availableCustomCoreCounts`.
     * If zero is provided max value from `nodeType.availableCustomCoreCounts` will be used.
     * This cannot be changed once the PrivateCloud is created.
     * 
     * ***
     * 
     */
    public Optional<Integer> customCoreCount() {
        return Optional.ofNullable(this.customCoreCount);
    }
    /**
     * @return The number of nodes of this type in the cluster.
     * 
     */
    public Integer nodeCount() {
        return this.nodeCount;
    }
    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public String nodeTypeId() {
        return this.nodeTypeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateCloudManagementClusterNodeTypeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer customCoreCount;
        private Integer nodeCount;
        private String nodeTypeId;
        public Builder() {}
        public Builder(PrivateCloudManagementClusterNodeTypeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customCoreCount = defaults.customCoreCount;
    	      this.nodeCount = defaults.nodeCount;
    	      this.nodeTypeId = defaults.nodeTypeId;
        }

        @CustomType.Setter
        public Builder customCoreCount(@Nullable Integer customCoreCount) {
            this.customCoreCount = customCoreCount;
            return this;
        }
        @CustomType.Setter
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        @CustomType.Setter
        public Builder nodeTypeId(String nodeTypeId) {
            this.nodeTypeId = Objects.requireNonNull(nodeTypeId);
            return this;
        }
        public PrivateCloudManagementClusterNodeTypeConfig build() {
            final var o = new PrivateCloudManagementClusterNodeTypeConfig();
            o.customCoreCount = customCoreCount;
            o.nodeCount = nodeCount;
            o.nodeTypeId = nodeTypeId;
            return o;
        }
    }
}
