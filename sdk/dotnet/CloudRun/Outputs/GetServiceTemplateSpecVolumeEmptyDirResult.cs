// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudRun.Outputs
{

    [OutputType]
    public sealed class GetServiceTemplateSpecVolumeEmptyDirResult
    {
        public readonly string Medium;
        public readonly string SizeLimit;

        [OutputConstructor]
        private GetServiceTemplateSpecVolumeEmptyDirResult(
            string medium,

            string sizeLimit)
        {
            Medium = medium;
            SizeLimit = sizeLimit;
        }
    }
}
