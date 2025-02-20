// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.NetworkConnectivity
{
    /// <summary>
    /// The NetworkConnectivity Spoke resource
    /// 
    /// ## Example Usage
    /// ### Linked_vpc_network
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var basicHub = new Gcp.NetworkConnectivity.Hub("basicHub", new()
    ///     {
    ///         Description = "A sample hub",
    ///         Labels = 
    ///         {
    ///             { "label-two", "value-one" },
    ///         },
    ///     });
    /// 
    ///     var primary = new Gcp.NetworkConnectivity.Spoke("primary", new()
    ///     {
    ///         Location = "global",
    ///         Description = "A sample spoke with a linked routher appliance instance",
    ///         Labels = 
    ///         {
    ///             { "label-one", "value-one" },
    ///         },
    ///         Hub = basicHub.Id,
    ///         LinkedVpcNetwork = new Gcp.NetworkConnectivity.Inputs.SpokeLinkedVpcNetworkArgs
    ///         {
    ///             ExcludeExportRanges = new[]
    ///             {
    ///                 "198.51.100.0/24",
    ///                 "10.10.0.0/16",
    ///             },
    ///             Uri = network.SelfLink,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Router_appliance
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var network = new Gcp.Compute.Network("network", new()
    ///     {
    ///         AutoCreateSubnetworks = false,
    ///     });
    /// 
    ///     var subnetwork = new Gcp.Compute.Subnetwork("subnetwork", new()
    ///     {
    ///         IpCidrRange = "10.0.0.0/28",
    ///         Region = "us-west1",
    ///         Network = network.SelfLink,
    ///     });
    /// 
    ///     var instance = new Gcp.Compute.Instance("instance", new()
    ///     {
    ///         MachineType = "e2-medium",
    ///         CanIpForward = true,
    ///         Zone = "us-west1-a",
    ///         BootDisk = new Gcp.Compute.Inputs.InstanceBootDiskArgs
    ///         {
    ///             InitializeParams = new Gcp.Compute.Inputs.InstanceBootDiskInitializeParamsArgs
    ///             {
    ///                 Image = "projects/debian-cloud/global/images/debian-10-buster-v20210817",
    ///             },
    ///         },
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.InstanceNetworkInterfaceArgs
    ///             {
    ///                 Subnetwork = subnetwork.Name,
    ///                 NetworkIp = "10.0.0.2",
    ///                 AccessConfigs = new[]
    ///                 {
    ///                     new Gcp.Compute.Inputs.InstanceNetworkInterfaceAccessConfigArgs
    ///                     {
    ///                         NetworkTier = "PREMIUM",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var basicHub = new Gcp.NetworkConnectivity.Hub("basicHub", new()
    ///     {
    ///         Description = "A sample hub",
    ///         Labels = 
    ///         {
    ///             { "label-two", "value-one" },
    ///         },
    ///     });
    /// 
    ///     var primary = new Gcp.NetworkConnectivity.Spoke("primary", new()
    ///     {
    ///         Location = "us-west1",
    ///         Description = "A sample spoke with a linked routher appliance instance",
    ///         Labels = 
    ///         {
    ///             { "label-one", "value-one" },
    ///         },
    ///         Hub = basicHub.Id,
    ///         LinkedRouterApplianceInstances = new Gcp.NetworkConnectivity.Inputs.SpokeLinkedRouterApplianceInstancesArgs
    ///         {
    ///             Instances = new[]
    ///             {
    ///                 new Gcp.NetworkConnectivity.Inputs.SpokeLinkedRouterApplianceInstancesInstanceArgs
    ///                 {
    ///                     VirtualMachine = instance.SelfLink,
    ///                     IpAddress = "10.0.0.2",
    ///                 },
    ///             },
    ///             SiteToSiteDataTransfer = true,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Spoke can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/spokes/{{name}}` * `{{project}}/{{location}}/{{name}}` * `{{location}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Spoke using one of the formats above. For exampletf import {
    /// 
    ///  id = "projects/{{project}}/locations/{{location}}/spokes/{{name}}"
    /// 
    ///  to = google_network_connectivity_spoke.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:networkconnectivity/spoke:Spoke When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Spoke can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:networkconnectivity/spoke:Spoke default projects/{{project}}/locations/{{location}}/spokes/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:networkconnectivity/spoke:Spoke default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:networkconnectivity/spoke:Spoke default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:networkconnectivity/spoke:Spoke")]
    public partial class Spoke : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Output only. The time the spoke was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// An optional description of the spoke.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        [Output("effectiveLabels")]
        public Output<ImmutableDictionary<string, object>> EffectiveLabels { get; private set; } = null!;

        /// <summary>
        /// Immutable. The URI of the hub that this spoke is attached to.
        /// </summary>
        [Output("hub")]
        public Output<string> Hub { get; private set; } = null!;

        /// <summary>
        /// Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        /// <summary>
        /// A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
        /// </summary>
        [Output("linkedInterconnectAttachments")]
        public Output<Outputs.SpokeLinkedInterconnectAttachments?> LinkedInterconnectAttachments { get; private set; } = null!;

        /// <summary>
        /// The URIs of linked Router appliance resources
        /// </summary>
        [Output("linkedRouterApplianceInstances")]
        public Output<Outputs.SpokeLinkedRouterApplianceInstances?> LinkedRouterApplianceInstances { get; private set; } = null!;

        /// <summary>
        /// VPC network that is associated with the spoke.
        /// </summary>
        [Output("linkedVpcNetwork")]
        public Output<Outputs.SpokeLinkedVpcNetwork?> LinkedVpcNetwork { get; private set; } = null!;

        /// <summary>
        /// The URIs of linked VPN tunnel resources
        /// </summary>
        [Output("linkedVpnTunnels")]
        public Output<Outputs.SpokeLinkedVpnTunnels?> LinkedVpnTunnels { get; private set; } = null!;

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// Immutable. The name of the spoke. Spoke names must be unique.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The combination of labels configured directly on the resource and default labels configured on the provider.
        /// </summary>
        [Output("pulumiLabels")]
        public Output<ImmutableDictionary<string, object>> PulumiLabels { get; private set; } = null!;

        /// <summary>
        /// Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is deleted and another with the same name is created, the new spoke is assigned a different unique_id.
        /// </summary>
        [Output("uniqueId")]
        public Output<string> UniqueId { get; private set; } = null!;

        /// <summary>
        /// Output only. The time the spoke was last updated.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a Spoke resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Spoke(string name, SpokeArgs args, CustomResourceOptions? options = null)
            : base("gcp:networkconnectivity/spoke:Spoke", name, args ?? new SpokeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Spoke(string name, Input<string> id, SpokeState? state = null, CustomResourceOptions? options = null)
            : base("gcp:networkconnectivity/spoke:Spoke", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "effectiveLabels",
                    "pulumiLabels",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Spoke resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Spoke Get(string name, Input<string> id, SpokeState? state = null, CustomResourceOptions? options = null)
        {
            return new Spoke(name, id, state, options);
        }
    }

    public sealed class SpokeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional description of the spoke.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Immutable. The URI of the hub that this spoke is attached to.
        /// </summary>
        [Input("hub", required: true)]
        public Input<string> Hub { get; set; } = null!;

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
        /// </summary>
        [Input("linkedInterconnectAttachments")]
        public Input<Inputs.SpokeLinkedInterconnectAttachmentsArgs>? LinkedInterconnectAttachments { get; set; }

        /// <summary>
        /// The URIs of linked Router appliance resources
        /// </summary>
        [Input("linkedRouterApplianceInstances")]
        public Input<Inputs.SpokeLinkedRouterApplianceInstancesArgs>? LinkedRouterApplianceInstances { get; set; }

        /// <summary>
        /// VPC network that is associated with the spoke.
        /// </summary>
        [Input("linkedVpcNetwork")]
        public Input<Inputs.SpokeLinkedVpcNetworkArgs>? LinkedVpcNetwork { get; set; }

        /// <summary>
        /// The URIs of linked VPN tunnel resources
        /// </summary>
        [Input("linkedVpnTunnels")]
        public Input<Inputs.SpokeLinkedVpnTunnelsArgs>? LinkedVpnTunnels { get; set; }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Immutable. The name of the spoke. Spoke names must be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public SpokeArgs()
        {
        }
        public static new SpokeArgs Empty => new SpokeArgs();
    }

    public sealed class SpokeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Output only. The time the spoke was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// An optional description of the spoke.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("effectiveLabels")]
        private InputMap<object>? _effectiveLabels;

        /// <summary>
        /// All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
        /// </summary>
        public InputMap<object> EffectiveLabels
        {
            get => _effectiveLabels ?? (_effectiveLabels = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _effectiveLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Immutable. The URI of the hub that this spoke is attached to.
        /// </summary>
        [Input("hub")]
        public Input<string>? Hub { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;

        /// <summary>
        /// Optional labels in key:value format. For more information about labels, see [Requirements for labels](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements).
        /// 
        /// **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
        /// Please refer to the field `effective_labels` for all of the labels present on the resource.
        /// </summary>
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        /// <summary>
        /// A collection of VLAN attachment resources. These resources should be redundant attachments that all advertise the same prefixes to Google Cloud. Alternatively, in active/passive configurations, all attachments should be capable of advertising the same prefixes.
        /// </summary>
        [Input("linkedInterconnectAttachments")]
        public Input<Inputs.SpokeLinkedInterconnectAttachmentsGetArgs>? LinkedInterconnectAttachments { get; set; }

        /// <summary>
        /// The URIs of linked Router appliance resources
        /// </summary>
        [Input("linkedRouterApplianceInstances")]
        public Input<Inputs.SpokeLinkedRouterApplianceInstancesGetArgs>? LinkedRouterApplianceInstances { get; set; }

        /// <summary>
        /// VPC network that is associated with the spoke.
        /// </summary>
        [Input("linkedVpcNetwork")]
        public Input<Inputs.SpokeLinkedVpcNetworkGetArgs>? LinkedVpcNetwork { get; set; }

        /// <summary>
        /// The URIs of linked VPN tunnel resources
        /// </summary>
        [Input("linkedVpnTunnels")]
        public Input<Inputs.SpokeLinkedVpnTunnelsGetArgs>? LinkedVpnTunnels { get; set; }

        /// <summary>
        /// The location for the resource
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// Immutable. The name of the spoke. Spoke names must be unique.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The project for the resource
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        [Input("pulumiLabels")]
        private InputMap<object>? _pulumiLabels;

        /// <summary>
        /// The combination of labels configured directly on the resource and default labels configured on the provider.
        /// </summary>
        public InputMap<object> PulumiLabels
        {
            get => _pulumiLabels ?? (_pulumiLabels = new InputMap<object>());
            set
            {
                var emptySecret = Output.CreateSecret(ImmutableDictionary.Create<string, object>());
                _pulumiLabels = Output.All(value, emptySecret).Apply(v => v[0]);
            }
        }

        /// <summary>
        /// Output only. The current lifecycle state of this spoke. Possible values: STATE_UNSPECIFIED, CREATING, ACTIVE, DELETING
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// Output only. The Google-generated UUID for the spoke. This value is unique across all spoke resources. If a spoke is deleted and another with the same name is created, the new spoke is assigned a different unique_id.
        /// </summary>
        [Input("uniqueId")]
        public Input<string>? UniqueId { get; set; }

        /// <summary>
        /// Output only. The time the spoke was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public SpokeState()
        {
        }
        public static new SpokeState Empty => new SpokeState();
    }
}
