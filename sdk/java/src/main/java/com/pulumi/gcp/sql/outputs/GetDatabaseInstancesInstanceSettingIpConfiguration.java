// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork;
import com.pulumi.gcp.sql.outputs.GetDatabaseInstancesInstanceSettingIpConfigurationPscConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabaseInstancesInstanceSettingIpConfiguration {
    private String allocatedIpRange;
    private List<GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks;
    private Boolean enablePrivatePathForGoogleCloudServices;
    private Boolean ipv4Enabled;
    private String privateNetwork;
    private List<GetDatabaseInstancesInstanceSettingIpConfigurationPscConfig> pscConfigs;
    private Boolean requireSsl;
    private String sslMode;

    private GetDatabaseInstancesInstanceSettingIpConfiguration() {}
    public String allocatedIpRange() {
        return this.allocatedIpRange;
    }
    public List<GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks() {
        return this.authorizedNetworks;
    }
    public Boolean enablePrivatePathForGoogleCloudServices() {
        return this.enablePrivatePathForGoogleCloudServices;
    }
    public Boolean ipv4Enabled() {
        return this.ipv4Enabled;
    }
    public String privateNetwork() {
        return this.privateNetwork;
    }
    public List<GetDatabaseInstancesInstanceSettingIpConfigurationPscConfig> pscConfigs() {
        return this.pscConfigs;
    }
    public Boolean requireSsl() {
        return this.requireSsl;
    }
    public String sslMode() {
        return this.sslMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstancesInstanceSettingIpConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String allocatedIpRange;
        private List<GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks;
        private Boolean enablePrivatePathForGoogleCloudServices;
        private Boolean ipv4Enabled;
        private String privateNetwork;
        private List<GetDatabaseInstancesInstanceSettingIpConfigurationPscConfig> pscConfigs;
        private Boolean requireSsl;
        private String sslMode;
        public Builder() {}
        public Builder(GetDatabaseInstancesInstanceSettingIpConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocatedIpRange = defaults.allocatedIpRange;
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.enablePrivatePathForGoogleCloudServices = defaults.enablePrivatePathForGoogleCloudServices;
    	      this.ipv4Enabled = defaults.ipv4Enabled;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.pscConfigs = defaults.pscConfigs;
    	      this.requireSsl = defaults.requireSsl;
    	      this.sslMode = defaults.sslMode;
        }

        @CustomType.Setter
        public Builder allocatedIpRange(String allocatedIpRange) {
            this.allocatedIpRange = Objects.requireNonNull(allocatedIpRange);
            return this;
        }
        @CustomType.Setter
        public Builder authorizedNetworks(List<GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork> authorizedNetworks) {
            this.authorizedNetworks = Objects.requireNonNull(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(GetDatabaseInstancesInstanceSettingIpConfigurationAuthorizedNetwork... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        @CustomType.Setter
        public Builder enablePrivatePathForGoogleCloudServices(Boolean enablePrivatePathForGoogleCloudServices) {
            this.enablePrivatePathForGoogleCloudServices = Objects.requireNonNull(enablePrivatePathForGoogleCloudServices);
            return this;
        }
        @CustomType.Setter
        public Builder ipv4Enabled(Boolean ipv4Enabled) {
            this.ipv4Enabled = Objects.requireNonNull(ipv4Enabled);
            return this;
        }
        @CustomType.Setter
        public Builder privateNetwork(String privateNetwork) {
            this.privateNetwork = Objects.requireNonNull(privateNetwork);
            return this;
        }
        @CustomType.Setter
        public Builder pscConfigs(List<GetDatabaseInstancesInstanceSettingIpConfigurationPscConfig> pscConfigs) {
            this.pscConfigs = Objects.requireNonNull(pscConfigs);
            return this;
        }
        public Builder pscConfigs(GetDatabaseInstancesInstanceSettingIpConfigurationPscConfig... pscConfigs) {
            return pscConfigs(List.of(pscConfigs));
        }
        @CustomType.Setter
        public Builder requireSsl(Boolean requireSsl) {
            this.requireSsl = Objects.requireNonNull(requireSsl);
            return this;
        }
        @CustomType.Setter
        public Builder sslMode(String sslMode) {
            this.sslMode = Objects.requireNonNull(sslMode);
            return this;
        }
        public GetDatabaseInstancesInstanceSettingIpConfiguration build() {
            final var o = new GetDatabaseInstancesInstanceSettingIpConfiguration();
            o.allocatedIpRange = allocatedIpRange;
            o.authorizedNetworks = authorizedNetworks;
            o.enablePrivatePathForGoogleCloudServices = enablePrivatePathForGoogleCloudServices;
            o.ipv4Enabled = ipv4Enabled;
            o.privateNetwork = privateNetwork;
            o.pscConfigs = pscConfigs;
            o.requireSsl = requireSsl;
            o.sslMode = sslMode;
            return o;
        }
    }
}
