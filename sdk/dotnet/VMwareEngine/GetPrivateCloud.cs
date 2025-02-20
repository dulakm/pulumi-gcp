// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.VMwareEngine
{
    public static class GetPrivateCloud
    {
        /// <summary>
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
        ///     var myPc = Gcp.VMwareEngine.GetPrivateCloud.Invoke(new()
        ///     {
        ///         Name = "my-pc",
        ///         Location = "us-central1-a",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetPrivateCloudResult> InvokeAsync(GetPrivateCloudArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetPrivateCloudResult>("gcp:vmwareengine/getPrivateCloud:getPrivateCloud", args ?? new GetPrivateCloudArgs(), options.WithDefaults());

        /// <summary>
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
        ///     var myPc = Gcp.VMwareEngine.GetPrivateCloud.Invoke(new()
        ///     {
        ///         Name = "my-pc",
        ///         Location = "us-central1-a",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetPrivateCloudResult> Invoke(GetPrivateCloudInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetPrivateCloudResult>("gcp:vmwareengine/getPrivateCloud:getPrivateCloud", args ?? new GetPrivateCloudInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetPrivateCloudArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Location of the resource.
        /// 
        /// - - -
        /// </summary>
        [Input("location", required: true)]
        public string Location { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public string? Project { get; set; }

        public GetPrivateCloudArgs()
        {
        }
        public static new GetPrivateCloudArgs Empty => new GetPrivateCloudArgs();
    }

    public sealed class GetPrivateCloudInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Location of the resource.
        /// 
        /// - - -
        /// </summary>
        [Input("location", required: true)]
        public Input<string> Location { get; set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs. If it
        /// is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        public GetPrivateCloudInvokeArgs()
        {
        }
        public static new GetPrivateCloudInvokeArgs Empty => new GetPrivateCloudInvokeArgs();
    }


    [OutputType]
    public sealed class GetPrivateCloudResult
    {
        public readonly string Description;
        public readonly ImmutableArray<Outputs.GetPrivateCloudHcxResult> Hcxes;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Location;
        public readonly ImmutableArray<Outputs.GetPrivateCloudManagementClusterResult> ManagementClusters;
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetPrivateCloudNetworkConfigResult> NetworkConfigs;
        public readonly ImmutableArray<Outputs.GetPrivateCloudNsxResult> Nsxes;
        public readonly string? Project;
        public readonly string State;
        public readonly string Uid;
        public readonly ImmutableArray<Outputs.GetPrivateCloudVcenterResult> Vcenters;

        [OutputConstructor]
        private GetPrivateCloudResult(
            string description,

            ImmutableArray<Outputs.GetPrivateCloudHcxResult> hcxes,

            string id,

            string location,

            ImmutableArray<Outputs.GetPrivateCloudManagementClusterResult> managementClusters,

            string name,

            ImmutableArray<Outputs.GetPrivateCloudNetworkConfigResult> networkConfigs,

            ImmutableArray<Outputs.GetPrivateCloudNsxResult> nsxes,

            string? project,

            string state,

            string uid,

            ImmutableArray<Outputs.GetPrivateCloudVcenterResult> vcenters)
        {
            Description = description;
            Hcxes = hcxes;
            Id = id;
            Location = location;
            ManagementClusters = managementClusters;
            Name = name;
            NetworkConfigs = networkConfigs;
            Nsxes = nsxes;
            Project = project;
            State = state;
            Uid = uid;
            Vcenters = vcenters;
        }
    }
}
