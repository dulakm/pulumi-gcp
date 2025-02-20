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
    public sealed class GetTriggerBuildStepResult
    {
        public readonly ImmutableArray<int> AllowExitCodes;
        public readonly bool AllowFailure;
        public readonly ImmutableArray<string> Args;
        public readonly string Dir;
        public readonly string Entrypoint;
        public readonly ImmutableArray<string> Envs;
        public readonly string Id;
        public readonly string Name;
        public readonly string Script;
        public readonly ImmutableArray<string> SecretEnvs;
        public readonly string Timeout;
        public readonly string Timing;
        public readonly ImmutableArray<Outputs.GetTriggerBuildStepVolumeResult> Volumes;
        public readonly ImmutableArray<string> WaitFors;

        [OutputConstructor]
        private GetTriggerBuildStepResult(
            ImmutableArray<int> allowExitCodes,

            bool allowFailure,

            ImmutableArray<string> args,

            string dir,

            string entrypoint,

            ImmutableArray<string> envs,

            string id,

            string name,

            string script,

            ImmutableArray<string> secretEnvs,

            string timeout,

            string timing,

            ImmutableArray<Outputs.GetTriggerBuildStepVolumeResult> volumes,

            ImmutableArray<string> waitFors)
        {
            AllowExitCodes = allowExitCodes;
            AllowFailure = allowFailure;
            Args = args;
            Dir = dir;
            Entrypoint = entrypoint;
            Envs = envs;
            Id = id;
            Name = name;
            Script = script;
            SecretEnvs = secretEnvs;
            Timeout = timeout;
            Timing = timing;
            Volumes = volumes;
            WaitFors = waitFors;
        }
    }
}
