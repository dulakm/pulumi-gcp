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
    public sealed class EnvironmentConfig
    {
        public readonly string? AirflowUri;
        public readonly string? DagGcsPrefix;
        public readonly Outputs.EnvironmentConfigDatabaseConfig? DatabaseConfig;
        public readonly Outputs.EnvironmentConfigEncryptionConfig? EncryptionConfig;
        public readonly string? EnvironmentSize;
        public readonly string? GkeCluster;
        public readonly Outputs.EnvironmentConfigMaintenanceWindow? MaintenanceWindow;
        public readonly Outputs.EnvironmentConfigMasterAuthorizedNetworksConfig? MasterAuthorizedNetworksConfig;
        public readonly Outputs.EnvironmentConfigNodeConfig? NodeConfig;
        public readonly int? NodeCount;
        public readonly Outputs.EnvironmentConfigPrivateEnvironmentConfig? PrivateEnvironmentConfig;
        public readonly Outputs.EnvironmentConfigRecoveryConfig? RecoveryConfig;
        public readonly string? ResilienceMode;
        public readonly Outputs.EnvironmentConfigSoftwareConfig? SoftwareConfig;
        public readonly Outputs.EnvironmentConfigWebServerConfig? WebServerConfig;
        public readonly Outputs.EnvironmentConfigWebServerNetworkAccessControl? WebServerNetworkAccessControl;
        public readonly Outputs.EnvironmentConfigWorkloadsConfig? WorkloadsConfig;

        [OutputConstructor]
        private EnvironmentConfig(
            string? airflowUri,

            string? dagGcsPrefix,

            Outputs.EnvironmentConfigDatabaseConfig? databaseConfig,

            Outputs.EnvironmentConfigEncryptionConfig? encryptionConfig,

            string? environmentSize,

            string? gkeCluster,

            Outputs.EnvironmentConfigMaintenanceWindow? maintenanceWindow,

            Outputs.EnvironmentConfigMasterAuthorizedNetworksConfig? masterAuthorizedNetworksConfig,

            Outputs.EnvironmentConfigNodeConfig? nodeConfig,

            int? nodeCount,

            Outputs.EnvironmentConfigPrivateEnvironmentConfig? privateEnvironmentConfig,

            Outputs.EnvironmentConfigRecoveryConfig? recoveryConfig,

            string? resilienceMode,

            Outputs.EnvironmentConfigSoftwareConfig? softwareConfig,

            Outputs.EnvironmentConfigWebServerConfig? webServerConfig,

            Outputs.EnvironmentConfigWebServerNetworkAccessControl? webServerNetworkAccessControl,

            Outputs.EnvironmentConfigWorkloadsConfig? workloadsConfig)
        {
            AirflowUri = airflowUri;
            DagGcsPrefix = dagGcsPrefix;
            DatabaseConfig = databaseConfig;
            EncryptionConfig = encryptionConfig;
            EnvironmentSize = environmentSize;
            GkeCluster = gkeCluster;
            MaintenanceWindow = maintenanceWindow;
            MasterAuthorizedNetworksConfig = masterAuthorizedNetworksConfig;
            NodeConfig = nodeConfig;
            NodeCount = nodeCount;
            PrivateEnvironmentConfig = privateEnvironmentConfig;
            RecoveryConfig = recoveryConfig;
            ResilienceMode = resilienceMode;
            SoftwareConfig = softwareConfig;
            WebServerConfig = webServerConfig;
            WebServerNetworkAccessControl = webServerNetworkAccessControl;
            WorkloadsConfig = workloadsConfig;
        }
    }
}
