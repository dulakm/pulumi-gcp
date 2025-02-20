// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Vertex.Outputs
{

    [OutputType]
    public sealed class GetAiIndexMetadataResult
    {
        public readonly ImmutableArray<Outputs.GetAiIndexMetadataConfigResult> Configs;
        public readonly string ContentsDeltaUri;
        public readonly bool IsCompleteOverwrite;

        [OutputConstructor]
        private GetAiIndexMetadataResult(
            ImmutableArray<Outputs.GetAiIndexMetadataConfigResult> configs,

            string contentsDeltaUri,

            bool isCompleteOverwrite)
        {
            Configs = configs;
            ContentsDeltaUri = contentsDeltaUri;
            IsCompleteOverwrite = isCompleteOverwrite;
        }
    }
}
