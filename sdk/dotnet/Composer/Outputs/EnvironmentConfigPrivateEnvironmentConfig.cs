// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Composer.Outputs
{

    [OutputType]
    public sealed class EnvironmentConfigPrivateEnvironmentConfig
    {
        public readonly string? CloudComposerConnectionSubnetwork;
        public readonly string? CloudComposerNetworkIpv4CidrBlock;
        public readonly string? CloudSqlIpv4CidrBlock;
        public readonly string? ConnectionType;
        public readonly bool? EnablePrivateEndpoint;
        public readonly bool? EnablePrivatelyUsedPublicIps;
        public readonly string? MasterIpv4CidrBlock;
        public readonly string? WebServerIpv4CidrBlock;

        [OutputConstructor]
        private EnvironmentConfigPrivateEnvironmentConfig(
            string? cloudComposerConnectionSubnetwork,

            string? cloudComposerNetworkIpv4CidrBlock,

            string? cloudSqlIpv4CidrBlock,

            string? connectionType,

            bool? enablePrivateEndpoint,

            bool? enablePrivatelyUsedPublicIps,

            string? masterIpv4CidrBlock,

            string? webServerIpv4CidrBlock)
        {
            CloudComposerConnectionSubnetwork = cloudComposerConnectionSubnetwork;
            CloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
            CloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
            ConnectionType = connectionType;
            EnablePrivateEndpoint = enablePrivateEndpoint;
            EnablePrivatelyUsedPublicIps = enablePrivatelyUsedPublicIps;
            MasterIpv4CidrBlock = masterIpv4CidrBlock;
            WebServerIpv4CidrBlock = webServerIpv4CidrBlock;
        }
    }
}
