// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// BGP information that must be configured into the routing stack to
    /// establish BGP peering. This information must specify the peer ASN
    /// and either the interface name, IP address, or peer IP address.
    /// Please refer to RFC4273.
    /// 
    /// To get more information about RouterBgpPeer, see:
    /// 
    /// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/routers)
    /// * How-to Guides
    ///     * [Google Cloud Router](https://cloud.google.com/router/docs/)
    /// 
    /// ## Example Usage
    /// ### Router Peer Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var peer = new Gcp.Compute.RouterPeer("peer", new()
    ///     {
    ///         AdvertisedRoutePriority = 100,
    ///         Interface = "interface-1",
    ///         PeerAsn = 65513,
    ///         Region = "us-central1",
    ///         Router = "my-router",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Router Peer Disabled
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var peer = new Gcp.Compute.RouterPeer("peer", new()
    ///     {
    ///         AdvertisedRoutePriority = 100,
    ///         Enable = false,
    ///         Interface = "interface-1",
    ///         PeerAsn = 65513,
    ///         PeerIpAddress = "169.254.1.2",
    ///         Region = "us-central1",
    ///         Router = "my-router",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Router Peer Bfd
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var peer = new Gcp.Compute.RouterPeer("peer", new()
    ///     {
    ///         AdvertisedRoutePriority = 100,
    ///         Bfd = new Gcp.Compute.Inputs.RouterPeerBfdArgs
    ///         {
    ///             MinReceiveInterval = 1000,
    ///             MinTransmitInterval = 1000,
    ///             Multiplier = 5,
    ///             SessionInitializationMode = "ACTIVE",
    ///         },
    ///         Interface = "interface-1",
    ///         PeerAsn = 65513,
    ///         PeerIpAddress = "169.254.1.2",
    ///         Region = "us-central1",
    ///         Router = "my-router",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Router Peer Router Appliance
    /// 
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
    ///         Network = network.SelfLink,
    ///         IpCidrRange = "10.0.0.0/16",
    ///         Region = "us-central1",
    ///     });
    /// 
    ///     var addrIntf = new Gcp.Compute.Address("addrIntf", new()
    ///     {
    ///         Region = subnetwork.Region,
    ///         Subnetwork = subnetwork.Id,
    ///         AddressType = "INTERNAL",
    ///     });
    /// 
    ///     var addrIntfRedundant = new Gcp.Compute.Address("addrIntfRedundant", new()
    ///     {
    ///         Region = subnetwork.Region,
    ///         Subnetwork = subnetwork.Id,
    ///         AddressType = "INTERNAL",
    ///     });
    /// 
    ///     var addrPeer = new Gcp.Compute.Address("addrPeer", new()
    ///     {
    ///         Region = subnetwork.Region,
    ///         Subnetwork = subnetwork.Id,
    ///         AddressType = "INTERNAL",
    ///     });
    /// 
    ///     var instance = new Gcp.Compute.Instance("instance", new()
    ///     {
    ///         Zone = "us-central1-a",
    ///         MachineType = "e2-medium",
    ///         CanIpForward = true,
    ///         BootDisk = new Gcp.Compute.Inputs.InstanceBootDiskArgs
    ///         {
    ///             InitializeParams = new Gcp.Compute.Inputs.InstanceBootDiskInitializeParamsArgs
    ///             {
    ///                 Image = "debian-cloud/debian-11",
    ///             },
    ///         },
    ///         NetworkInterfaces = new[]
    ///         {
    ///             new Gcp.Compute.Inputs.InstanceNetworkInterfaceArgs
    ///             {
    ///                 NetworkIp = addrPeer.IPAddress,
    ///                 Subnetwork = subnetwork.SelfLink,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var hub = new Gcp.NetworkConnectivity.Hub("hub");
    /// 
    ///     var spoke = new Gcp.NetworkConnectivity.Spoke("spoke", new()
    ///     {
    ///         Location = subnetwork.Region,
    ///         Hub = hub.Id,
    ///         LinkedRouterApplianceInstances = new Gcp.NetworkConnectivity.Inputs.SpokeLinkedRouterApplianceInstancesArgs
    ///         {
    ///             Instances = new[]
    ///             {
    ///                 new Gcp.NetworkConnectivity.Inputs.SpokeLinkedRouterApplianceInstancesInstanceArgs
    ///                 {
    ///                     VirtualMachine = instance.SelfLink,
    ///                     IpAddress = addrPeer.IPAddress,
    ///                 },
    ///             },
    ///             SiteToSiteDataTransfer = false,
    ///         },
    ///     });
    /// 
    ///     var router = new Gcp.Compute.Router("router", new()
    ///     {
    ///         Region = subnetwork.Region,
    ///         Network = network.SelfLink,
    ///         Bgp = new Gcp.Compute.Inputs.RouterBgpArgs
    ///         {
    ///             Asn = 64514,
    ///         },
    ///     });
    /// 
    ///     var interfaceRedundant = new Gcp.Compute.RouterInterface("interfaceRedundant", new()
    ///     {
    ///         Region = router.Region,
    ///         Router = router.Name,
    ///         Subnetwork = subnetwork.SelfLink,
    ///         PrivateIpAddress = addrIntfRedundant.IPAddress,
    ///     });
    /// 
    ///     var @interface = new Gcp.Compute.RouterInterface("interface", new()
    ///     {
    ///         Region = router.Region,
    ///         Router = router.Name,
    ///         Subnetwork = subnetwork.SelfLink,
    ///         PrivateIpAddress = addrIntf.IPAddress,
    ///         RedundantInterface = interfaceRedundant.Name,
    ///     });
    /// 
    ///     var peer = new Gcp.Compute.RouterPeer("peer", new()
    ///     {
    ///         Router = router.Name,
    ///         Region = router.Region,
    ///         Interface = @interface.Name,
    ///         RouterApplianceInstance = instance.SelfLink,
    ///         PeerAsn = 65513,
    ///         PeerIpAddress = addrPeer.IPAddress,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// RouterBgpPeer can be imported using any of these accepted formats* `projects/{{project}}/regions/{{region}}/routers/{{router}}/{{name}}` * `{{project}}/{{region}}/{{router}}/{{name}}` * `{{region}}/{{router}}/{{name}}` * `{{router}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import RouterBgpPeer using one of the formats above. For exampletf import {
    /// 
    ///  id = "projects/{{project}}/regions/{{region}}/routers/{{router}}/{{name}}"
    /// 
    ///  to = google_compute_router_peer.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/routerPeer:RouterPeer When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), RouterBgpPeer can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/routerPeer:RouterPeer default projects/{{project}}/regions/{{region}}/routers/{{router}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/routerPeer:RouterPeer default {{project}}/{{region}}/{{router}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/routerPeer:RouterPeer default {{region}}/{{router}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/routerPeer:RouterPeer default {{router}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/routerPeer:RouterPeer")]
    public partial class RouterPeer : global::Pulumi.CustomResource
    {
        /// <summary>
        /// User-specified flag to indicate which mode to use for advertisement.
        /// Valid values of this enum field are: `DEFAULT`, `CUSTOM`
        /// Default value is `DEFAULT`.
        /// Possible values are: `DEFAULT`, `CUSTOM`.
        /// </summary>
        [Output("advertiseMode")]
        public Output<string?> AdvertiseMode { get; private set; } = null!;

        /// <summary>
        /// User-specified list of prefix groups to advertise in custom
        /// mode, which currently supports the following option:
        /// </summary>
        [Output("advertisedGroups")]
        public Output<ImmutableArray<string>> AdvertisedGroups { get; private set; } = null!;

        /// <summary>
        /// User-specified list of individual IP ranges to advertise in
        /// custom mode. This field can only be populated if advertiseMode
        /// is `CUSTOM` and is advertised to all peers of the router. These IP
        /// ranges will be advertised in addition to any specified groups.
        /// Leave this field blank to advertise no custom IP ranges.
        /// Structure is documented below.
        /// </summary>
        [Output("advertisedIpRanges")]
        public Output<ImmutableArray<Outputs.RouterPeerAdvertisedIpRange>> AdvertisedIpRanges { get; private set; } = null!;

        /// <summary>
        /// The priority of routes advertised to this BGP peer.
        /// Where there is more than one matching route of maximum
        /// length, the routes with the lowest priority value win.
        /// </summary>
        [Output("advertisedRoutePriority")]
        public Output<int?> AdvertisedRoutePriority { get; private set; } = null!;

        /// <summary>
        /// BFD configuration for the BGP peering.
        /// Structure is documented below.
        /// </summary>
        [Output("bfd")]
        public Output<Outputs.RouterPeerBfd> Bfd { get; private set; } = null!;

        /// <summary>
        /// The status of the BGP peer connection. If set to false, any active session
        /// with the peer is terminated and all associated routing information is removed.
        /// If set to true, the peer connection can be established with routing information.
        /// The default is true.
        /// </summary>
        [Output("enable")]
        public Output<bool?> Enable { get; private set; } = null!;

        /// <summary>
        /// Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
        /// </summary>
        [Output("enableIpv6")]
        public Output<bool?> EnableIpv6 { get; private set; } = null!;

        /// <summary>
        /// Name of the interface the BGP peer is associated with.
        /// </summary>
        [Output("interface")]
        public Output<string> Interface { get; private set; } = null!;

        /// <summary>
        /// IP address of the interface inside Google Cloud Platform.
        /// Only IPv4 is supported.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// IPv6 address of the interface inside Google Cloud Platform.
        /// The address must be in the range 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64.
        /// If you do not specify the next hop addresses, Google Cloud automatically
        /// assigns unused addresses from the 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64 range for you.
        /// </summary>
        [Output("ipv6NexthopAddress")]
        public Output<string> Ipv6NexthopAddress { get; private set; } = null!;

        /// <summary>
        /// The resource that configures and manages this BGP peer.
        /// </summary>
        [Output("managementType")]
        public Output<string> ManagementType { get; private set; } = null!;

        /// <summary>
        /// Name of this BGP peer. The name must be 1-63 characters long,
        /// and comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?` which
        /// means the first character must be a lowercase letter, and all
        /// following characters must be a dash, lowercase letter, or digit,
        /// except the last character, which cannot be a dash.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Peer BGP Autonomous System Number (ASN).
        /// Each BGP interface may use a different value.
        /// </summary>
        [Output("peerAsn")]
        public Output<int> PeerAsn { get; private set; } = null!;

        /// <summary>
        /// IP address of the BGP interface outside Google Cloud Platform.
        /// Only IPv4 is supported. Required if `ip_address` is set.
        /// </summary>
        [Output("peerIpAddress")]
        public Output<string> PeerIpAddress { get; private set; } = null!;

        /// <summary>
        /// IPv6 address of the BGP interface outside Google Cloud Platform.
        /// The address must be in the range 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64.
        /// If you do not specify the next hop addresses, Google Cloud automatically
        /// assigns unused addresses from the 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64 range for you.
        /// </summary>
        [Output("peerIpv6NexthopAddress")]
        public Output<string> PeerIpv6NexthopAddress { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// Region where the router and BgpPeer reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The name of the Cloud Router in which this BgpPeer will be configured.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Output("router")]
        public Output<string> Router { get; private set; } = null!;

        /// <summary>
        /// The URI of the VM instance that is used as third-party router appliances
        /// such as Next Gen Firewalls, Virtual Routers, or Router Appliances.
        /// The VM instance must be located in zones contained in the same region as
        /// this Cloud Router. The VM instance is the peer side of the BGP session.
        /// </summary>
        [Output("routerApplianceInstance")]
        public Output<string?> RouterApplianceInstance { get; private set; } = null!;


        /// <summary>
        /// Create a RouterPeer resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RouterPeer(string name, RouterPeerArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/routerPeer:RouterPeer", name, args ?? new RouterPeerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RouterPeer(string name, Input<string> id, RouterPeerState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/routerPeer:RouterPeer", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing RouterPeer resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RouterPeer Get(string name, Input<string> id, RouterPeerState? state = null, CustomResourceOptions? options = null)
        {
            return new RouterPeer(name, id, state, options);
        }
    }

    public sealed class RouterPeerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-specified flag to indicate which mode to use for advertisement.
        /// Valid values of this enum field are: `DEFAULT`, `CUSTOM`
        /// Default value is `DEFAULT`.
        /// Possible values are: `DEFAULT`, `CUSTOM`.
        /// </summary>
        [Input("advertiseMode")]
        public Input<string>? AdvertiseMode { get; set; }

        [Input("advertisedGroups")]
        private InputList<string>? _advertisedGroups;

        /// <summary>
        /// User-specified list of prefix groups to advertise in custom
        /// mode, which currently supports the following option:
        /// </summary>
        public InputList<string> AdvertisedGroups
        {
            get => _advertisedGroups ?? (_advertisedGroups = new InputList<string>());
            set => _advertisedGroups = value;
        }

        [Input("advertisedIpRanges")]
        private InputList<Inputs.RouterPeerAdvertisedIpRangeArgs>? _advertisedIpRanges;

        /// <summary>
        /// User-specified list of individual IP ranges to advertise in
        /// custom mode. This field can only be populated if advertiseMode
        /// is `CUSTOM` and is advertised to all peers of the router. These IP
        /// ranges will be advertised in addition to any specified groups.
        /// Leave this field blank to advertise no custom IP ranges.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RouterPeerAdvertisedIpRangeArgs> AdvertisedIpRanges
        {
            get => _advertisedIpRanges ?? (_advertisedIpRanges = new InputList<Inputs.RouterPeerAdvertisedIpRangeArgs>());
            set => _advertisedIpRanges = value;
        }

        /// <summary>
        /// The priority of routes advertised to this BGP peer.
        /// Where there is more than one matching route of maximum
        /// length, the routes with the lowest priority value win.
        /// </summary>
        [Input("advertisedRoutePriority")]
        public Input<int>? AdvertisedRoutePriority { get; set; }

        /// <summary>
        /// BFD configuration for the BGP peering.
        /// Structure is documented below.
        /// </summary>
        [Input("bfd")]
        public Input<Inputs.RouterPeerBfdArgs>? Bfd { get; set; }

        /// <summary>
        /// The status of the BGP peer connection. If set to false, any active session
        /// with the peer is terminated and all associated routing information is removed.
        /// If set to true, the peer connection can be established with routing information.
        /// The default is true.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
        /// </summary>
        [Input("enableIpv6")]
        public Input<bool>? EnableIpv6 { get; set; }

        /// <summary>
        /// Name of the interface the BGP peer is associated with.
        /// </summary>
        [Input("interface", required: true)]
        public Input<string> Interface { get; set; } = null!;

        /// <summary>
        /// IP address of the interface inside Google Cloud Platform.
        /// Only IPv4 is supported.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// IPv6 address of the interface inside Google Cloud Platform.
        /// The address must be in the range 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64.
        /// If you do not specify the next hop addresses, Google Cloud automatically
        /// assigns unused addresses from the 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64 range for you.
        /// </summary>
        [Input("ipv6NexthopAddress")]
        public Input<string>? Ipv6NexthopAddress { get; set; }

        /// <summary>
        /// Name of this BGP peer. The name must be 1-63 characters long,
        /// and comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?` which
        /// means the first character must be a lowercase letter, and all
        /// following characters must be a dash, lowercase letter, or digit,
        /// except the last character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Peer BGP Autonomous System Number (ASN).
        /// Each BGP interface may use a different value.
        /// </summary>
        [Input("peerAsn", required: true)]
        public Input<int> PeerAsn { get; set; } = null!;

        /// <summary>
        /// IP address of the BGP interface outside Google Cloud Platform.
        /// Only IPv4 is supported. Required if `ip_address` is set.
        /// </summary>
        [Input("peerIpAddress")]
        public Input<string>? PeerIpAddress { get; set; }

        /// <summary>
        /// IPv6 address of the BGP interface outside Google Cloud Platform.
        /// The address must be in the range 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64.
        /// If you do not specify the next hop addresses, Google Cloud automatically
        /// assigns unused addresses from the 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64 range for you.
        /// </summary>
        [Input("peerIpv6NexthopAddress")]
        public Input<string>? PeerIpv6NexthopAddress { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Region where the router and BgpPeer reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The name of the Cloud Router in which this BgpPeer will be configured.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("router", required: true)]
        public Input<string> Router { get; set; } = null!;

        /// <summary>
        /// The URI of the VM instance that is used as third-party router appliances
        /// such as Next Gen Firewalls, Virtual Routers, or Router Appliances.
        /// The VM instance must be located in zones contained in the same region as
        /// this Cloud Router. The VM instance is the peer side of the BGP session.
        /// </summary>
        [Input("routerApplianceInstance")]
        public Input<string>? RouterApplianceInstance { get; set; }

        public RouterPeerArgs()
        {
        }
        public static new RouterPeerArgs Empty => new RouterPeerArgs();
    }

    public sealed class RouterPeerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// User-specified flag to indicate which mode to use for advertisement.
        /// Valid values of this enum field are: `DEFAULT`, `CUSTOM`
        /// Default value is `DEFAULT`.
        /// Possible values are: `DEFAULT`, `CUSTOM`.
        /// </summary>
        [Input("advertiseMode")]
        public Input<string>? AdvertiseMode { get; set; }

        [Input("advertisedGroups")]
        private InputList<string>? _advertisedGroups;

        /// <summary>
        /// User-specified list of prefix groups to advertise in custom
        /// mode, which currently supports the following option:
        /// </summary>
        public InputList<string> AdvertisedGroups
        {
            get => _advertisedGroups ?? (_advertisedGroups = new InputList<string>());
            set => _advertisedGroups = value;
        }

        [Input("advertisedIpRanges")]
        private InputList<Inputs.RouterPeerAdvertisedIpRangeGetArgs>? _advertisedIpRanges;

        /// <summary>
        /// User-specified list of individual IP ranges to advertise in
        /// custom mode. This field can only be populated if advertiseMode
        /// is `CUSTOM` and is advertised to all peers of the router. These IP
        /// ranges will be advertised in addition to any specified groups.
        /// Leave this field blank to advertise no custom IP ranges.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.RouterPeerAdvertisedIpRangeGetArgs> AdvertisedIpRanges
        {
            get => _advertisedIpRanges ?? (_advertisedIpRanges = new InputList<Inputs.RouterPeerAdvertisedIpRangeGetArgs>());
            set => _advertisedIpRanges = value;
        }

        /// <summary>
        /// The priority of routes advertised to this BGP peer.
        /// Where there is more than one matching route of maximum
        /// length, the routes with the lowest priority value win.
        /// </summary>
        [Input("advertisedRoutePriority")]
        public Input<int>? AdvertisedRoutePriority { get; set; }

        /// <summary>
        /// BFD configuration for the BGP peering.
        /// Structure is documented below.
        /// </summary>
        [Input("bfd")]
        public Input<Inputs.RouterPeerBfdGetArgs>? Bfd { get; set; }

        /// <summary>
        /// The status of the BGP peer connection. If set to false, any active session
        /// with the peer is terminated and all associated routing information is removed.
        /// If set to true, the peer connection can be established with routing information.
        /// The default is true.
        /// </summary>
        [Input("enable")]
        public Input<bool>? Enable { get; set; }

        /// <summary>
        /// Enable IPv6 traffic over BGP Peer. If not specified, it is disabled by default.
        /// </summary>
        [Input("enableIpv6")]
        public Input<bool>? EnableIpv6 { get; set; }

        /// <summary>
        /// Name of the interface the BGP peer is associated with.
        /// </summary>
        [Input("interface")]
        public Input<string>? Interface { get; set; }

        /// <summary>
        /// IP address of the interface inside Google Cloud Platform.
        /// Only IPv4 is supported.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// IPv6 address of the interface inside Google Cloud Platform.
        /// The address must be in the range 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64.
        /// If you do not specify the next hop addresses, Google Cloud automatically
        /// assigns unused addresses from the 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64 range for you.
        /// </summary>
        [Input("ipv6NexthopAddress")]
        public Input<string>? Ipv6NexthopAddress { get; set; }

        /// <summary>
        /// The resource that configures and manages this BGP peer.
        /// </summary>
        [Input("managementType")]
        public Input<string>? ManagementType { get; set; }

        /// <summary>
        /// Name of this BGP peer. The name must be 1-63 characters long,
        /// and comply with RFC1035. Specifically, the name must be 1-63 characters
        /// long and match the regular expression `a-z?` which
        /// means the first character must be a lowercase letter, and all
        /// following characters must be a dash, lowercase letter, or digit,
        /// except the last character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Peer BGP Autonomous System Number (ASN).
        /// Each BGP interface may use a different value.
        /// </summary>
        [Input("peerAsn")]
        public Input<int>? PeerAsn { get; set; }

        /// <summary>
        /// IP address of the BGP interface outside Google Cloud Platform.
        /// Only IPv4 is supported. Required if `ip_address` is set.
        /// </summary>
        [Input("peerIpAddress")]
        public Input<string>? PeerIpAddress { get; set; }

        /// <summary>
        /// IPv6 address of the BGP interface outside Google Cloud Platform.
        /// The address must be in the range 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64.
        /// If you do not specify the next hop addresses, Google Cloud automatically
        /// assigns unused addresses from the 2600:2d00:0:2::/64 or 2600:2d00:0:3::/64 range for you.
        /// </summary>
        [Input("peerIpv6NexthopAddress")]
        public Input<string>? PeerIpv6NexthopAddress { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// Region where the router and BgpPeer reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The name of the Cloud Router in which this BgpPeer will be configured.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("router")]
        public Input<string>? Router { get; set; }

        /// <summary>
        /// The URI of the VM instance that is used as third-party router appliances
        /// such as Next Gen Firewalls, Virtual Routers, or Router Appliances.
        /// The VM instance must be located in zones contained in the same region as
        /// this Cloud Router. The VM instance is the peer side of the BGP session.
        /// </summary>
        [Input("routerApplianceInstance")]
        public Input<string>? RouterApplianceInstance { get; set; }

        public RouterPeerState()
        {
        }
        public static new RouterPeerState Empty => new RouterPeerState();
    }
}
