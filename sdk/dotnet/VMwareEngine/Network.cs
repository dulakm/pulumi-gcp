// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Network can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/vmwareEngineNetworks/{{name}}` * `{{project}}/{{location}}/{{name}}` * `{{location}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Network using one of the formats above. For exampletf import {
    /// 
    ///  id = "projects/{{project}}/locations/{{location}}/vmwareEngineNetworks/{{name}}"
    /// 
    ///  to = google_vmwareengine_network.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:vmwareengine/network:Network When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Network can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:vmwareengine/network:Network default projects/{{project}}/locations/{{location}}/vmwareEngineNetworks/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:vmwareengine/network:Network default {{project}}/{{location}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:vmwareengine/network:Network default {{location}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:vmwareengine/network:Network")]
    public partial class Network : global::Pulumi.CustomResource
    {
        /// <summary>
        /// User-provided description for this VMware Engine network.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The location where the VMwareEngineNetwork should reside.
        /// </summary>
        [Output("location")]
        public Output<string> Location { get; private set; } = null!;

        /// <summary>
        /// The ID of the VMwareEngineNetwork.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// State of the VMware Engine network.
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// VMware Engine network type.
        /// Possible values are: `LEGACY`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// System-generated unique identifier for the resource.
        /// </summary>
        [Output("uid")]
        public Output<string> Uid { get; private set; } = null!;

        /// <summary>
        /// VMware Engine service VPC networks that provide connectivity from a private cloud to customer projects,
        /// the internet, and other Google Cloud services.
        /// Structure is documented below.
        /// </summary>
        [Output("vpcNetworks")]
        public Output<ImmutableArray<Outputs.NetworkVpcNetwork>> VpcNetworks { get; private set; } = null!;


        /// <summary>
        /// Create a Network resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Network(string name, NetworkArgs args, CustomResourceOptions? options = null)
            : base("gcp:vmwareengine/network:Network", name, args ?? new NetworkArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Network(string name, Input<string> id, NetworkState? state = null, CustomResourceOptions? options = null)
            : base("gcp:vmwareengine/network:Network", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Network resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Network Get(string name, Input<string> id, NetworkState? state = null, CustomResourceOptions? options = null)
        {
            return new Network(name, id, state, options);
        }
    }

    public sealed class NetworkArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-provided description for this VMware Engine network.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The location where the VMwareEngineNetwork should reside.
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// The ID of the VMwareEngineNetwork.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// VMware Engine network type.
        /// Possible values are: `LEGACY`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public NetworkArgs()
        {
        }
        public static new NetworkArgs Empty => new NetworkArgs();
    }

    public sealed class NetworkState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-provided description for this VMware Engine network.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The location where the VMwareEngineNetwork should reside.
        /// </summary>
        [Input("location")]
        public Input<string>? Location { get; set; }

        /// <summary>
        /// The ID of the VMwareEngineNetwork.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// State of the VMware Engine network.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// VMware Engine network type.
        /// Possible values are: `LEGACY`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// System-generated unique identifier for the resource.
        /// </summary>
        [Input("uid")]
        public Input<string>? Uid { get; set; }

        [Input("vpcNetworks")]
        private InputList<Inputs.NetworkVpcNetworkGetArgs>? _vpcNetworks;

        /// <summary>
        /// VMware Engine service VPC networks that provide connectivity from a private cloud to customer projects,
        /// the internet, and other Google Cloud services.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.NetworkVpcNetworkGetArgs> VpcNetworks
        {
            get => _vpcNetworks ?? (_vpcNetworks = new InputList<Inputs.NetworkVpcNetworkGetArgs>());
            set => _vpcNetworks = value;
        }

        public NetworkState()
        {
        }
        public static new NetworkState Empty => new NetworkState();
    }
}
