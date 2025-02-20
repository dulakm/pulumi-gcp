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
    public sealed class GetServiceTemplateContainerLivenessProbeResult
    {
        public readonly int FailureThreshold;
        public readonly ImmutableArray<Outputs.GetServiceTemplateContainerLivenessProbeGrpcResult> Grpcs;
        public readonly ImmutableArray<Outputs.GetServiceTemplateContainerLivenessProbeHttpGetResult> HttpGets;
        public readonly int InitialDelaySeconds;
        public readonly int PeriodSeconds;
        public readonly int TimeoutSeconds;

        [OutputConstructor]
        private GetServiceTemplateContainerLivenessProbeResult(
            int failureThreshold,

            ImmutableArray<Outputs.GetServiceTemplateContainerLivenessProbeGrpcResult> grpcs,

            ImmutableArray<Outputs.GetServiceTemplateContainerLivenessProbeHttpGetResult> httpGets,

            int initialDelaySeconds,

            int periodSeconds,

            int timeoutSeconds)
        {
            FailureThreshold = failureThreshold;
            Grpcs = grpcs;
            HttpGets = httpGets;
            InitialDelaySeconds = initialDelaySeconds;
            PeriodSeconds = periodSeconds;
            TimeoutSeconds = timeoutSeconds;
        }
    }
}
