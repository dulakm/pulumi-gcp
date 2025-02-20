// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Sql.Outputs
{

    [OutputType]
    public sealed class GetDatabaseInstanceReplicaConfigurationResult
    {
        public readonly string CaCertificate;
        public readonly string ClientCertificate;
        public readonly string ClientKey;
        public readonly int ConnectRetryInterval;
        public readonly string DumpFilePath;
        public readonly bool FailoverTarget;
        public readonly int MasterHeartbeatPeriod;
        public readonly string Password;
        public readonly string SslCipher;
        public readonly string Username;
        public readonly bool VerifyServerCertificate;

        [OutputConstructor]
        private GetDatabaseInstanceReplicaConfigurationResult(
            string caCertificate,

            string clientCertificate,

            string clientKey,

            int connectRetryInterval,

            string dumpFilePath,

            bool failoverTarget,

            int masterHeartbeatPeriod,

            string password,

            string sslCipher,

            string username,

            bool verifyServerCertificate)
        {
            CaCertificate = caCertificate;
            ClientCertificate = clientCertificate;
            ClientKey = clientKey;
            ConnectRetryInterval = connectRetryInterval;
            DumpFilePath = dumpFilePath;
            FailoverTarget = failoverTarget;
            MasterHeartbeatPeriod = masterHeartbeatPeriod;
            Password = password;
            SslCipher = sslCipher;
            Username = username;
            VerifyServerCertificate = verifyServerCertificate;
        }
    }
}
