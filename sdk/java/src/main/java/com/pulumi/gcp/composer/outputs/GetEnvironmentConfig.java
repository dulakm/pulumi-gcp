// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigDatabaseConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigEncryptionConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigMaintenanceWindow;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigMasterAuthorizedNetworksConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigNodeConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigPrivateEnvironmentConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigRecoveryConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigSoftwareConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWebServerConfig;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWebServerNetworkAccessControl;
import com.pulumi.gcp.composer.outputs.GetEnvironmentConfigWorkloadsConfig;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfig {
    private String airflowUri;
    private String dagGcsPrefix;
    private List<GetEnvironmentConfigDatabaseConfig> databaseConfigs;
    private List<GetEnvironmentConfigEncryptionConfig> encryptionConfigs;
    private String environmentSize;
    private String gkeCluster;
    private List<GetEnvironmentConfigMaintenanceWindow> maintenanceWindows;
    private List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfigs;
    private List<GetEnvironmentConfigNodeConfig> nodeConfigs;
    private Integer nodeCount;
    private List<GetEnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfigs;
    private List<GetEnvironmentConfigRecoveryConfig> recoveryConfigs;
    private String resilienceMode;
    private List<GetEnvironmentConfigSoftwareConfig> softwareConfigs;
    private List<GetEnvironmentConfigWebServerConfig> webServerConfigs;
    private List<GetEnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControls;
    private List<GetEnvironmentConfigWorkloadsConfig> workloadsConfigs;

    private GetEnvironmentConfig() {}
    public String airflowUri() {
        return this.airflowUri;
    }
    public String dagGcsPrefix() {
        return this.dagGcsPrefix;
    }
    public List<GetEnvironmentConfigDatabaseConfig> databaseConfigs() {
        return this.databaseConfigs;
    }
    public List<GetEnvironmentConfigEncryptionConfig> encryptionConfigs() {
        return this.encryptionConfigs;
    }
    public String environmentSize() {
        return this.environmentSize;
    }
    public String gkeCluster() {
        return this.gkeCluster;
    }
    public List<GetEnvironmentConfigMaintenanceWindow> maintenanceWindows() {
        return this.maintenanceWindows;
    }
    public List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfigs() {
        return this.masterAuthorizedNetworksConfigs;
    }
    public List<GetEnvironmentConfigNodeConfig> nodeConfigs() {
        return this.nodeConfigs;
    }
    public Integer nodeCount() {
        return this.nodeCount;
    }
    public List<GetEnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfigs() {
        return this.privateEnvironmentConfigs;
    }
    public List<GetEnvironmentConfigRecoveryConfig> recoveryConfigs() {
        return this.recoveryConfigs;
    }
    public String resilienceMode() {
        return this.resilienceMode;
    }
    public List<GetEnvironmentConfigSoftwareConfig> softwareConfigs() {
        return this.softwareConfigs;
    }
    public List<GetEnvironmentConfigWebServerConfig> webServerConfigs() {
        return this.webServerConfigs;
    }
    public List<GetEnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControls() {
        return this.webServerNetworkAccessControls;
    }
    public List<GetEnvironmentConfigWorkloadsConfig> workloadsConfigs() {
        return this.workloadsConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String airflowUri;
        private String dagGcsPrefix;
        private List<GetEnvironmentConfigDatabaseConfig> databaseConfigs;
        private List<GetEnvironmentConfigEncryptionConfig> encryptionConfigs;
        private String environmentSize;
        private String gkeCluster;
        private List<GetEnvironmentConfigMaintenanceWindow> maintenanceWindows;
        private List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfigs;
        private List<GetEnvironmentConfigNodeConfig> nodeConfigs;
        private Integer nodeCount;
        private List<GetEnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfigs;
        private List<GetEnvironmentConfigRecoveryConfig> recoveryConfigs;
        private String resilienceMode;
        private List<GetEnvironmentConfigSoftwareConfig> softwareConfigs;
        private List<GetEnvironmentConfigWebServerConfig> webServerConfigs;
        private List<GetEnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControls;
        private List<GetEnvironmentConfigWorkloadsConfig> workloadsConfigs;
        public Builder() {}
        public Builder(GetEnvironmentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowUri = defaults.airflowUri;
    	      this.dagGcsPrefix = defaults.dagGcsPrefix;
    	      this.databaseConfigs = defaults.databaseConfigs;
    	      this.encryptionConfigs = defaults.encryptionConfigs;
    	      this.environmentSize = defaults.environmentSize;
    	      this.gkeCluster = defaults.gkeCluster;
    	      this.maintenanceWindows = defaults.maintenanceWindows;
    	      this.masterAuthorizedNetworksConfigs = defaults.masterAuthorizedNetworksConfigs;
    	      this.nodeConfigs = defaults.nodeConfigs;
    	      this.nodeCount = defaults.nodeCount;
    	      this.privateEnvironmentConfigs = defaults.privateEnvironmentConfigs;
    	      this.recoveryConfigs = defaults.recoveryConfigs;
    	      this.resilienceMode = defaults.resilienceMode;
    	      this.softwareConfigs = defaults.softwareConfigs;
    	      this.webServerConfigs = defaults.webServerConfigs;
    	      this.webServerNetworkAccessControls = defaults.webServerNetworkAccessControls;
    	      this.workloadsConfigs = defaults.workloadsConfigs;
        }

        @CustomType.Setter
        public Builder airflowUri(String airflowUri) {
            this.airflowUri = Objects.requireNonNull(airflowUri);
            return this;
        }
        @CustomType.Setter
        public Builder dagGcsPrefix(String dagGcsPrefix) {
            this.dagGcsPrefix = Objects.requireNonNull(dagGcsPrefix);
            return this;
        }
        @CustomType.Setter
        public Builder databaseConfigs(List<GetEnvironmentConfigDatabaseConfig> databaseConfigs) {
            this.databaseConfigs = Objects.requireNonNull(databaseConfigs);
            return this;
        }
        public Builder databaseConfigs(GetEnvironmentConfigDatabaseConfig... databaseConfigs) {
            return databaseConfigs(List.of(databaseConfigs));
        }
        @CustomType.Setter
        public Builder encryptionConfigs(List<GetEnvironmentConfigEncryptionConfig> encryptionConfigs) {
            this.encryptionConfigs = Objects.requireNonNull(encryptionConfigs);
            return this;
        }
        public Builder encryptionConfigs(GetEnvironmentConfigEncryptionConfig... encryptionConfigs) {
            return encryptionConfigs(List.of(encryptionConfigs));
        }
        @CustomType.Setter
        public Builder environmentSize(String environmentSize) {
            this.environmentSize = Objects.requireNonNull(environmentSize);
            return this;
        }
        @CustomType.Setter
        public Builder gkeCluster(String gkeCluster) {
            this.gkeCluster = Objects.requireNonNull(gkeCluster);
            return this;
        }
        @CustomType.Setter
        public Builder maintenanceWindows(List<GetEnvironmentConfigMaintenanceWindow> maintenanceWindows) {
            this.maintenanceWindows = Objects.requireNonNull(maintenanceWindows);
            return this;
        }
        public Builder maintenanceWindows(GetEnvironmentConfigMaintenanceWindow... maintenanceWindows) {
            return maintenanceWindows(List.of(maintenanceWindows));
        }
        @CustomType.Setter
        public Builder masterAuthorizedNetworksConfigs(List<GetEnvironmentConfigMasterAuthorizedNetworksConfig> masterAuthorizedNetworksConfigs) {
            this.masterAuthorizedNetworksConfigs = Objects.requireNonNull(masterAuthorizedNetworksConfigs);
            return this;
        }
        public Builder masterAuthorizedNetworksConfigs(GetEnvironmentConfigMasterAuthorizedNetworksConfig... masterAuthorizedNetworksConfigs) {
            return masterAuthorizedNetworksConfigs(List.of(masterAuthorizedNetworksConfigs));
        }
        @CustomType.Setter
        public Builder nodeConfigs(List<GetEnvironmentConfigNodeConfig> nodeConfigs) {
            this.nodeConfigs = Objects.requireNonNull(nodeConfigs);
            return this;
        }
        public Builder nodeConfigs(GetEnvironmentConfigNodeConfig... nodeConfigs) {
            return nodeConfigs(List.of(nodeConfigs));
        }
        @CustomType.Setter
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = Objects.requireNonNull(nodeCount);
            return this;
        }
        @CustomType.Setter
        public Builder privateEnvironmentConfigs(List<GetEnvironmentConfigPrivateEnvironmentConfig> privateEnvironmentConfigs) {
            this.privateEnvironmentConfigs = Objects.requireNonNull(privateEnvironmentConfigs);
            return this;
        }
        public Builder privateEnvironmentConfigs(GetEnvironmentConfigPrivateEnvironmentConfig... privateEnvironmentConfigs) {
            return privateEnvironmentConfigs(List.of(privateEnvironmentConfigs));
        }
        @CustomType.Setter
        public Builder recoveryConfigs(List<GetEnvironmentConfigRecoveryConfig> recoveryConfigs) {
            this.recoveryConfigs = Objects.requireNonNull(recoveryConfigs);
            return this;
        }
        public Builder recoveryConfigs(GetEnvironmentConfigRecoveryConfig... recoveryConfigs) {
            return recoveryConfigs(List.of(recoveryConfigs));
        }
        @CustomType.Setter
        public Builder resilienceMode(String resilienceMode) {
            this.resilienceMode = Objects.requireNonNull(resilienceMode);
            return this;
        }
        @CustomType.Setter
        public Builder softwareConfigs(List<GetEnvironmentConfigSoftwareConfig> softwareConfigs) {
            this.softwareConfigs = Objects.requireNonNull(softwareConfigs);
            return this;
        }
        public Builder softwareConfigs(GetEnvironmentConfigSoftwareConfig... softwareConfigs) {
            return softwareConfigs(List.of(softwareConfigs));
        }
        @CustomType.Setter
        public Builder webServerConfigs(List<GetEnvironmentConfigWebServerConfig> webServerConfigs) {
            this.webServerConfigs = Objects.requireNonNull(webServerConfigs);
            return this;
        }
        public Builder webServerConfigs(GetEnvironmentConfigWebServerConfig... webServerConfigs) {
            return webServerConfigs(List.of(webServerConfigs));
        }
        @CustomType.Setter
        public Builder webServerNetworkAccessControls(List<GetEnvironmentConfigWebServerNetworkAccessControl> webServerNetworkAccessControls) {
            this.webServerNetworkAccessControls = Objects.requireNonNull(webServerNetworkAccessControls);
            return this;
        }
        public Builder webServerNetworkAccessControls(GetEnvironmentConfigWebServerNetworkAccessControl... webServerNetworkAccessControls) {
            return webServerNetworkAccessControls(List.of(webServerNetworkAccessControls));
        }
        @CustomType.Setter
        public Builder workloadsConfigs(List<GetEnvironmentConfigWorkloadsConfig> workloadsConfigs) {
            this.workloadsConfigs = Objects.requireNonNull(workloadsConfigs);
            return this;
        }
        public Builder workloadsConfigs(GetEnvironmentConfigWorkloadsConfig... workloadsConfigs) {
            return workloadsConfigs(List.of(workloadsConfigs));
        }
        public GetEnvironmentConfig build() {
            final var o = new GetEnvironmentConfig();
            o.airflowUri = airflowUri;
            o.dagGcsPrefix = dagGcsPrefix;
            o.databaseConfigs = databaseConfigs;
            o.encryptionConfigs = encryptionConfigs;
            o.environmentSize = environmentSize;
            o.gkeCluster = gkeCluster;
            o.maintenanceWindows = maintenanceWindows;
            o.masterAuthorizedNetworksConfigs = masterAuthorizedNetworksConfigs;
            o.nodeConfigs = nodeConfigs;
            o.nodeCount = nodeCount;
            o.privateEnvironmentConfigs = privateEnvironmentConfigs;
            o.recoveryConfigs = recoveryConfigs;
            o.resilienceMode = resilienceMode;
            o.softwareConfigs = softwareConfigs;
            o.webServerConfigs = webServerConfigs;
            o.webServerNetworkAccessControls = webServerNetworkAccessControls;
            o.workloadsConfigs = workloadsConfigs;
            return o;
        }
    }
}
