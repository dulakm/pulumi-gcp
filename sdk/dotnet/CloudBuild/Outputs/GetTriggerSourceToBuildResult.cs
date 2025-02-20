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
    public sealed class GetTriggerSourceToBuildResult
    {
        public readonly string BitbucketServerConfig;
        public readonly string GithubEnterpriseConfig;
        public readonly string Ref;
        public readonly string RepoType;
        public readonly string Repository;
        public readonly string Uri;

        [OutputConstructor]
        private GetTriggerSourceToBuildResult(
            string bitbucketServerConfig,

            string githubEnterpriseConfig,

            string @ref,

            string repoType,

            string repository,

            string uri)
        {
            BitbucketServerConfig = bitbucketServerConfig;
            GithubEnterpriseConfig = githubEnterpriseConfig;
            Ref = @ref;
            RepoType = repoType;
            Repository = repository;
            Uri = uri;
        }
    }
}
