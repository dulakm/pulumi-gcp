// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs Empty = new ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs();

    /**
     * Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size. If zero, it means no raw-block local NVMe SSD disks to be attached to the node.
     * &gt; Note: Local NVMe SSD storage available in GKE versions v1.25.3-gke.1800 and later.
     * 
     */
    @Import(name="localSsdCount", required=true)
    private Output<Integer> localSsdCount;

    /**
     * @return Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size. If zero, it means no raw-block local NVMe SSD disks to be attached to the node.
     * &gt; Note: Local NVMe SSD storage available in GKE versions v1.25.3-gke.1800 and later.
     * 
     */
    public Output<Integer> localSsdCount() {
        return this.localSsdCount;
    }

    private ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs() {}

    private ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs(ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs $) {
        this.localSsdCount = $.localSsdCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs $;

        public Builder() {
            $ = new ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs();
        }

        public Builder(ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs defaults) {
            $ = new ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param localSsdCount Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size. If zero, it means no raw-block local NVMe SSD disks to be attached to the node.
         * &gt; Note: Local NVMe SSD storage available in GKE versions v1.25.3-gke.1800 and later.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Output<Integer> localSsdCount) {
            $.localSsdCount = localSsdCount;
            return this;
        }

        /**
         * @param localSsdCount Number of raw-block local NVMe SSD disks to be attached to the node. Each local SSD is 375 GB in size. If zero, it means no raw-block local NVMe SSD disks to be attached to the node.
         * &gt; Note: Local NVMe SSD storage available in GKE versions v1.25.3-gke.1800 and later.
         * 
         * @return builder
         * 
         */
        public Builder localSsdCount(Integer localSsdCount) {
            return localSsdCount(Output.of(localSsdCount));
        }

        public ClusterNodePoolNodeConfigLocalNvmeSsdBlockConfigArgs build() {
            $.localSsdCount = Objects.requireNonNull($.localSsdCount, "expected parameter 'localSsdCount' to be non-null");
            return $;
        }
    }

}
