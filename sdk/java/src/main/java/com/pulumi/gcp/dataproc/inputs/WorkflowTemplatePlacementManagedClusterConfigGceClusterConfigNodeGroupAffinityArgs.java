// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs();

    /**
     * Required. The URI of a sole-tenant /zones/us-central1-a/nodeGroups/node-group-1`*`node-group-1`
     * 
     */
    @Import(name="nodeGroup", required=true)
    private Output<String> nodeGroup;

    /**
     * @return Required. The URI of a sole-tenant /zones/us-central1-a/nodeGroups/node-group-1`*`node-group-1`
     * 
     */
    public Output<String> nodeGroup() {
        return this.nodeGroup;
    }

    private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs() {}

    private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs $) {
        this.nodeGroup = $.nodeGroup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs $;

        public Builder() {
            $ = new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs();
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs defaults) {
            $ = new WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nodeGroup Required. The URI of a sole-tenant /zones/us-central1-a/nodeGroups/node-group-1`*`node-group-1`
         * 
         * @return builder
         * 
         */
        public Builder nodeGroup(Output<String> nodeGroup) {
            $.nodeGroup = nodeGroup;
            return this;
        }

        /**
         * @param nodeGroup Required. The URI of a sole-tenant /zones/us-central1-a/nodeGroups/node-group-1`*`node-group-1`
         * 
         * @return builder
         * 
         */
        public Builder nodeGroup(String nodeGroup) {
            return nodeGroup(Output.of(nodeGroup));
        }

        public WorkflowTemplatePlacementManagedClusterConfigGceClusterConfigNodeGroupAffinityArgs build() {
            $.nodeGroup = Objects.requireNonNull($.nodeGroup, "expected parameter 'nodeGroup' to be non-null");
            return $;
        }
    }

}
