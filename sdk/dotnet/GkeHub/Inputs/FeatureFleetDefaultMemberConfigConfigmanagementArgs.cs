// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeHub.Inputs
{

    public sealed class FeatureFleetDefaultMemberConfigConfigmanagementArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ConfigSync configuration for the cluster
        /// Structure is documented below.
        /// </summary>
        [Input("configSync")]
        public Input<Inputs.FeatureFleetDefaultMemberConfigConfigmanagementConfigSyncArgs>? ConfigSync { get; set; }

        public FeatureFleetDefaultMemberConfigConfigmanagementArgs()
        {
        }
        public static new FeatureFleetDefaultMemberConfigConfigmanagementArgs Empty => new FeatureFleetDefaultMemberConfigConfigmanagementArgs();
    }
}
