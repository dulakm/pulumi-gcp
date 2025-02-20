// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    public static class GetHcVpnGateway
    {
        /// <summary>
        /// Get a HA VPN Gateway within GCE from its name.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var gateway = Gcp.Compute.GetHcVpnGateway.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetHcVpnGatewayResult> InvokeAsync(GetHcVpnGatewayArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetHcVpnGatewayResult>("gcp:compute/getHcVpnGateway:getHcVpnGateway", args ?? new GetHcVpnGatewayArgs(), options.WithDefaults());

        /// <summary>
        /// Get a HA VPN Gateway within GCE from its name.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Gcp = Pulumi.Gcp;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var gateway = Gcp.Compute.GetHcVpnGateway.Invoke(new()
        ///     {
        ///         Name = "foobar",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetHcVpnGatewayResult> Invoke(GetHcVpnGatewayInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetHcVpnGatewayResult>("gcp:compute/getHcVpnGateway:getHcVpnGateway", args ?? new GetHcVpnGatewayInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetHcVpnGatewayArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the forwarding rule.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        /// <summary>
        /// The region in which the resource belongs. If it
        /// is not provided, the project region is used.
        /// </summary>
        [Input("region")]
        public string? Region { get; set; }

        public GetHcVpnGatewayArgs()
        {
        }
        public static new GetHcVpnGatewayArgs Empty => new GetHcVpnGatewayArgs();
    }

    public sealed class GetHcVpnGatewayInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the forwarding rule.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The region in which the resource belongs. If it
        /// is not provided, the project region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        public GetHcVpnGatewayInvokeArgs()
        {
        }
        public static new GetHcVpnGatewayInvokeArgs Empty => new GetHcVpnGatewayInvokeArgs();
    }


    [OutputType]
    public sealed class GetHcVpnGatewayResult
    {
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;
        public readonly string Network;
        public readonly string? Project;
        public readonly string? Region;
        public readonly string SelfLink;
        public readonly string StackType;
        public readonly ImmutableArray<Outputs.GetHcVpnGatewayVpnInterfaceResult> VpnInterfaces;

        [OutputConstructor]
        private GetHcVpnGatewayResult(
            string description,

            string id,

            string name,

            string network,

            string? project,

            string? region,

            string selfLink,

            string stackType,

            ImmutableArray<Outputs.GetHcVpnGatewayVpnInterfaceResult> vpnInterfaces)
        {
            Description = description;
            Id = id;
            Name = name;
            Network = network;
            Project = project;
            Region = region;
            SelfLink = selfLink;
            StackType = stackType;
            VpnInterfaces = vpnInterfaces;
        }
    }
}
