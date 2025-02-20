// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Outputs
{

    [OutputType]
    public sealed class FeatureFleetDefaultMemberConfigConfigmanagementConfigSync
    {
        /// <summary>
        /// Git repo configuration for the cluster
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit? Git;
        /// <summary>
        /// OCI repo configuration for the cluster
        /// Structure is documented below.
        /// </summary>
        public readonly Outputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci? Oci;
        /// <summary>
        /// Specifies whether the Config Sync Repo is in hierarchical or unstructured mode
        /// </summary>
        public readonly string? SourceFormat;

        [OutputConstructor]
        private FeatureFleetDefaultMemberConfigConfigmanagementConfigSync(
            Outputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncGit? git,

            Outputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncOci? oci,

            string? sourceFormat)
        {
            Git = git;
            Oci = oci;
            SourceFormat = sourceFormat;
        }
    }
}
