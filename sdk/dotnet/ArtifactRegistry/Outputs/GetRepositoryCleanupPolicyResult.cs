// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.ArtifactRegistry.Outputs
{

    [OutputType]
    public sealed class GetRepositoryCleanupPolicyResult
    {
        public readonly string Action;
        public readonly ImmutableArray<Outputs.GetRepositoryCleanupPolicyConditionResult> Conditions;
        public readonly string Id;
        public readonly ImmutableArray<Outputs.GetRepositoryCleanupPolicyMostRecentVersionResult> MostRecentVersions;

        [OutputConstructor]
        private GetRepositoryCleanupPolicyResult(
            string action,

            ImmutableArray<Outputs.GetRepositoryCleanupPolicyConditionResult> conditions,

            string id,

            ImmutableArray<Outputs.GetRepositoryCleanupPolicyMostRecentVersionResult> mostRecentVersions)
        {
            Action = action;
            Conditions = conditions;
            Id = id;
            MostRecentVersions = mostRecentVersions;
        }
    }
}
