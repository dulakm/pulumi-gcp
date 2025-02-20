// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterMasterAuthGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("clientCertificate")]
        public Input<string>? ClientCertificate { get; set; }

        /// <summary>
        /// Whether client certificate authorization is enabled for this cluster.  For example:
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        /// });
        /// ```
        /// 
        /// This block also contains several computed attributes, documented below.
        /// </summary>
        [Input("clientCertificateConfig", required: true)]
        public Input<Inputs.ClusterMasterAuthClientCertificateConfigGetArgs> ClientCertificateConfig { get; set; } = null!;

        [Input("clientKey")]
        private Input<string>? _clientKey;
        public Input<string>? ClientKey
        {
            get => _clientKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _clientKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("clusterCaCertificate")]
        public Input<string>? ClusterCaCertificate { get; set; }

        public ClusterMasterAuthGetArgs()
        {
        }
        public static new ClusterMasterAuthGetArgs Empty => new ClusterMasterAuthGetArgs();
    }
}
