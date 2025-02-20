// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Inputs
{

    public sealed class ClusterAddonsConfigGkeBackupAgentConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
        /// </summary>
        [Input("enabled", required: true)]
        public Input<bool> Enabled { get; set; } = null!;

        public ClusterAddonsConfigGkeBackupAgentConfigArgs()
        {
        }
        public static new ClusterAddonsConfigGkeBackupAgentConfigArgs Empty => new ClusterAddonsConfigGkeBackupAgentConfigArgs();
    }
}
