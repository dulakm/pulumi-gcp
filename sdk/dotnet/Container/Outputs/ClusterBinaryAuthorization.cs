// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Container.Outputs
{

    [OutputType]
    public sealed class ClusterBinaryAuthorization
    {
        /// <summary>
        /// Enable Binary Authorization for this cluster. Deprecated in favor of `evaluation_mode`.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// Mode of operation for Binary Authorization policy evaluation. Valid values are `DISABLED`
        /// and `PROJECT_SINGLETON_POLICY_ENFORCE`.
        /// </summary>
        public readonly string? EvaluationMode;

        [OutputConstructor]
        private ClusterBinaryAuthorization(
            bool? enabled,

            string? evaluationMode)
        {
            Enabled = enabled;
            EvaluationMode = evaluationMode;
        }
    }
}
