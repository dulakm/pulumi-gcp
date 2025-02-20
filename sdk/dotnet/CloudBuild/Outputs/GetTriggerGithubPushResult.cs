// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.CloudBuild.Outputs
{

    [OutputType]
    public sealed class GetTriggerGithubPushResult
    {
        public readonly string Branch;
        public readonly bool InvertRegex;
        public readonly string Tag;

        [OutputConstructor]
        private GetTriggerGithubPushResult(
            string branch,

            bool invertRegex,

            string tag)
        {
            Branch = branch;
            InvertRegex = invertRegex;
            Tag = tag;
        }
    }
}
