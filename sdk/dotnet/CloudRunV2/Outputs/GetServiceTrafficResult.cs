// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRunV2.Outputs
{

    [OutputType]
    public sealed class GetServiceTrafficResult
    {
        public readonly int Percent;
        public readonly string Revision;
        public readonly string Tag;
        public readonly string Type;

        [OutputConstructor]
        private GetServiceTrafficResult(
            int percent,

            string revision,

            string tag,

            string type)
        {
            Percent = percent;
            Revision = revision;
            Tag = tag;
            Type = type;
        }
    }
}
