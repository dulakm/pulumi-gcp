// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterNodePoolGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("autoscaling")]
        public Input<Inputs.ClusterNodePoolAutoscalingGetArgs>? Autoscaling { get; set; }

        /// <summary>
        /// The number of nodes to create in this
        /// cluster's default node pool. In regional or multi-zonal clusters, this is the
        /// number of nodes per zone. Must be set if `node_pool` is not set. If you're using
        /// `gcp.container.NodePool` objects with no default node pool, you'll need to
        /// set this to a value of at least `1`, alongside setting
        /// `remove_default_node_pool` to `true`.
        /// </summary>
        [Input("initialNodeCount")]
        public Input<int>? InitialNodeCount { get; set; }

        [Input("instanceGroupUrls")]
        private InputList<string>? _instanceGroupUrls;
        public InputList<string> InstanceGroupUrls
        {
            get => _instanceGroupUrls ?? (_instanceGroupUrls = new InputList<string>());
            set => _instanceGroupUrls = value;
        }

        [Input("managedInstanceGroupUrls")]
        private InputList<string>? _managedInstanceGroupUrls;
        public InputList<string> ManagedInstanceGroupUrls
        {
            get => _managedInstanceGroupUrls ?? (_managedInstanceGroupUrls = new InputList<string>());
            set => _managedInstanceGroupUrls = value;
        }

        /// <summary>
        /// NodeManagement configuration for this NodePool. Structure is documented below.
        /// </summary>
        [Input("management")]
        public Input<Inputs.ClusterNodePoolManagementGetArgs>? Management { get; set; }

        [Input("maxPodsPerNode")]
        public Input<int>? MaxPodsPerNode { get; set; }

        /// <summary>
        /// The name of the cluster, unique within the project and
        /// location.
        /// 
        /// - - -
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        /// <summary>
        /// Configuration for
        /// [Adding Pod IP address ranges](https://cloud.google.com/kubernetes-engine/docs/how-to/multi-pod-cidr)) to the node pool. Structure is documented below
        /// </summary>
        [Input("networkConfig")]
        public Input<Inputs.ClusterNodePoolNetworkConfigGetArgs>? NetworkConfig { get; set; }

        /// <summary>
        /// Parameters used in creating the default node pool.
        /// Generally, this field should not be used at the same time as a
        /// `gcp.container.NodePool` or a `node_pool` block; this configuration
        /// manages the default node pool, which isn't recommended to be used.
        /// Structure is documented below.
        /// </summary>
        [Input("nodeConfig")]
        public Input<Inputs.ClusterNodePoolNodeConfigGetArgs>? NodeConfig { get; set; }

        [Input("nodeCount")]
        public Input<int>? NodeCount { get; set; }

        [Input("nodeLocations")]
        private InputList<string>? _nodeLocations;

        /// <summary>
        /// The list of zones in which the cluster's nodes
        /// are located. Nodes must be in the region of their regional cluster or in the
        /// same region as their cluster's zone for zonal clusters. If this is specified for
        /// a zonal cluster, omit the cluster's zone.
        /// 
        /// &gt; A "multi-zonal" cluster is a zonal cluster with at least one additional zone
        /// defined; in a multi-zonal cluster, the cluster master is only present in a
        /// single zone while nodes are present in each of the primary zone and the node
        /// locations. In contrast, in a regional cluster, cluster master nodes are present
        /// in multiple zones in the region. For that reason, regional clusters should be
        /// preferred.
        /// </summary>
        public InputList<string> NodeLocations
        {
            get => _nodeLocations ?? (_nodeLocations = new InputList<string>());
            set => _nodeLocations = value;
        }

        [Input("placementPolicy")]
        public Input<Inputs.ClusterNodePoolPlacementPolicyGetArgs>? PlacementPolicy { get; set; }

        /// <summary>
        /// Specifies the upgrade settings for NAP created node pools. Structure is documented below.
        /// </summary>
        [Input("upgradeSettings")]
        public Input<Inputs.ClusterNodePoolUpgradeSettingsGetArgs>? UpgradeSettings { get; set; }

        [Input("version")]
        public Input<string>? Version { get; set; }

        public ClusterNodePoolGetArgs()
        {
        }
        public static new ClusterNodePoolGetArgs Empty => new ClusterNodePoolGetArgs();
    }
}
