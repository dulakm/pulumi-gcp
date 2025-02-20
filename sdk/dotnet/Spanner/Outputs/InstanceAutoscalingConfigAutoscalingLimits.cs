// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Spanner.Outputs
{

    [OutputType]
    public sealed class InstanceAutoscalingConfigAutoscalingLimits
    {
        /// <summary>
        /// Specifies maximum number of processing units allocated to the instance.
        /// If set, this number should be multiples of 1000 and be greater than or equal to
        /// min_processing_units.
        /// </summary>
        public readonly int? MaxProcessingUnits;
        /// <summary>
        /// Specifies minimum number of processing units allocated to the instance.
        /// If set, this number should be multiples of 1000.
        /// </summary>
        public readonly int? MinProcessingUnits;

        [OutputConstructor]
        private InstanceAutoscalingConfigAutoscalingLimits(
            int? maxProcessingUnits,

            int? minProcessingUnits)
        {
            MaxProcessingUnits = maxProcessingUnits;
            MinProcessingUnits = minProcessingUnits;
        }
    }
}
