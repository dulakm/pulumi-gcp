// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("natIp")]
        public Input<string>? NatIp { get; set; }

        [Input("networkTier")]
        public Input<string>? NetworkTier { get; set; }

        [Input("publicPtrDomainName")]
        public Input<string>? PublicPtrDomainName { get; set; }

        [Input("securityPolicy")]
        public Input<string>? SecurityPolicy { get; set; }

        public InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs()
        {
        }
        public static new InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs Empty => new InstanceFromTemplateNetworkInterfaceAccessConfigGetArgs();
    }
}
