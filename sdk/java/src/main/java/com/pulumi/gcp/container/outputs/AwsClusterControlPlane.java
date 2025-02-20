// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneAwsServicesAuthentication;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneConfigEncryption;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneDatabaseEncryption;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneInstancePlacement;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneMainVolume;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneProxyConfig;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneRootVolume;
import com.pulumi.gcp.container.outputs.AwsClusterControlPlaneSshConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsClusterControlPlane {
    /**
     * @return Authentication configuration for management of AWS resources.
     * 
     */
    private AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication;
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    private AwsClusterControlPlaneConfigEncryption configEncryption;
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    private AwsClusterControlPlaneDatabaseEncryption databaseEncryption;
    /**
     * @return The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
     */
    private String iamInstanceProfile;
    /**
     * @return (Beta only) Details of placement information for an instance.
     * 
     */
    private @Nullable AwsClusterControlPlaneInstancePlacement instancePlacement;
    /**
     * @return Optional. The AWS instance type. When unspecified, it defaults to `m5.large`.
     * 
     */
    private @Nullable String instanceType;
    /**
     * @return Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    private @Nullable AwsClusterControlPlaneMainVolume mainVolume;
    /**
     * @return Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    private @Nullable AwsClusterControlPlaneProxyConfig proxyConfig;
    /**
     * @return Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    private @Nullable AwsClusterControlPlaneRootVolume rootVolume;
    /**
     * @return Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    private @Nullable List<String> securityGroupIds;
    /**
     * @return Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    private @Nullable AwsClusterControlPlaneSshConfig sshConfig;
    /**
     * @return The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    private List<String> subnetIds;
    /**
     * @return Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    private @Nullable Map<String,String> tags;
    /**
     * @return The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    private String version;

    private AwsClusterControlPlane() {}
    /**
     * @return Authentication configuration for management of AWS resources.
     * 
     */
    public AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication() {
        return this.awsServicesAuthentication;
    }
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster configuration.
     * 
     */
    public AwsClusterControlPlaneConfigEncryption configEncryption() {
        return this.configEncryption;
    }
    /**
     * @return The ARN of the AWS KMS key used to encrypt cluster secrets.
     * 
     */
    public AwsClusterControlPlaneDatabaseEncryption databaseEncryption() {
        return this.databaseEncryption;
    }
    /**
     * @return The name of the AWS IAM instance pofile to assign to each control plane replica.
     * 
     */
    public String iamInstanceProfile() {
        return this.iamInstanceProfile;
    }
    /**
     * @return (Beta only) Details of placement information for an instance.
     * 
     */
    public Optional<AwsClusterControlPlaneInstancePlacement> instancePlacement() {
        return Optional.ofNullable(this.instancePlacement);
    }
    /**
     * @return Optional. The AWS instance type. When unspecified, it defaults to `m5.large`.
     * 
     */
    public Optional<String> instanceType() {
        return Optional.ofNullable(this.instanceType);
    }
    /**
     * @return Optional. Configuration related to the main volume provisioned for each control plane replica. The main volume is in charge of storing all of the cluster&#39;s etcd state. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 8 GiB with the GP2 volume type.
     * 
     */
    public Optional<AwsClusterControlPlaneMainVolume> mainVolume() {
        return Optional.ofNullable(this.mainVolume);
    }
    /**
     * @return Proxy configuration for outbound HTTP(S) traffic.
     * 
     */
    public Optional<AwsClusterControlPlaneProxyConfig> proxyConfig() {
        return Optional.ofNullable(this.proxyConfig);
    }
    /**
     * @return Optional. Configuration related to the root volume provisioned for each control plane replica. Volumes will be provisioned in the availability zone associated with the corresponding subnet. When unspecified, it defaults to 32 GiB with the GP2 volume type.
     * 
     */
    public Optional<AwsClusterControlPlaneRootVolume> rootVolume() {
        return Optional.ofNullable(this.rootVolume);
    }
    /**
     * @return Optional. The IDs of additional security groups to add to control plane replicas. The Anthos Multi-Cloud API will automatically create and manage security groups with the minimum rules needed for a functioning cluster.
     * 
     */
    public List<String> securityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * @return Optional. SSH configuration for how to access the underlying control plane machines.
     * 
     */
    public Optional<AwsClusterControlPlaneSshConfig> sshConfig() {
        return Optional.ofNullable(this.sshConfig);
    }
    /**
     * @return The list of subnets where control plane replicas will run. A replica will be provisioned on each subnet and up to three values can be provided. Each subnet must be in a different AWS Availability Zone (AZ).
     * 
     */
    public List<String> subnetIds() {
        return this.subnetIds;
    }
    /**
     * @return Optional. A set of AWS resource tags to propagate to all underlying managed AWS resources. Specify at most 50 pairs containing alphanumerics, spaces, and symbols (.+-=_:@/). Keys can be up to 127 Unicode characters. Values can be up to 255 Unicode characters.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return The Kubernetes version to run on control plane replicas (e.g. `1.19.10-gke.1000`). You can list all supported versions on a given Google Cloud region by calling .
     * 
     */
    public String version() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsClusterControlPlane defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication;
        private AwsClusterControlPlaneConfigEncryption configEncryption;
        private AwsClusterControlPlaneDatabaseEncryption databaseEncryption;
        private String iamInstanceProfile;
        private @Nullable AwsClusterControlPlaneInstancePlacement instancePlacement;
        private @Nullable String instanceType;
        private @Nullable AwsClusterControlPlaneMainVolume mainVolume;
        private @Nullable AwsClusterControlPlaneProxyConfig proxyConfig;
        private @Nullable AwsClusterControlPlaneRootVolume rootVolume;
        private @Nullable List<String> securityGroupIds;
        private @Nullable AwsClusterControlPlaneSshConfig sshConfig;
        private List<String> subnetIds;
        private @Nullable Map<String,String> tags;
        private String version;
        public Builder() {}
        public Builder(AwsClusterControlPlane defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsServicesAuthentication = defaults.awsServicesAuthentication;
    	      this.configEncryption = defaults.configEncryption;
    	      this.databaseEncryption = defaults.databaseEncryption;
    	      this.iamInstanceProfile = defaults.iamInstanceProfile;
    	      this.instancePlacement = defaults.instancePlacement;
    	      this.instanceType = defaults.instanceType;
    	      this.mainVolume = defaults.mainVolume;
    	      this.proxyConfig = defaults.proxyConfig;
    	      this.rootVolume = defaults.rootVolume;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.sshConfig = defaults.sshConfig;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder awsServicesAuthentication(AwsClusterControlPlaneAwsServicesAuthentication awsServicesAuthentication) {
            this.awsServicesAuthentication = Objects.requireNonNull(awsServicesAuthentication);
            return this;
        }
        @CustomType.Setter
        public Builder configEncryption(AwsClusterControlPlaneConfigEncryption configEncryption) {
            this.configEncryption = Objects.requireNonNull(configEncryption);
            return this;
        }
        @CustomType.Setter
        public Builder databaseEncryption(AwsClusterControlPlaneDatabaseEncryption databaseEncryption) {
            this.databaseEncryption = Objects.requireNonNull(databaseEncryption);
            return this;
        }
        @CustomType.Setter
        public Builder iamInstanceProfile(String iamInstanceProfile) {
            this.iamInstanceProfile = Objects.requireNonNull(iamInstanceProfile);
            return this;
        }
        @CustomType.Setter
        public Builder instancePlacement(@Nullable AwsClusterControlPlaneInstancePlacement instancePlacement) {
            this.instancePlacement = instancePlacement;
            return this;
        }
        @CustomType.Setter
        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        @CustomType.Setter
        public Builder mainVolume(@Nullable AwsClusterControlPlaneMainVolume mainVolume) {
            this.mainVolume = mainVolume;
            return this;
        }
        @CustomType.Setter
        public Builder proxyConfig(@Nullable AwsClusterControlPlaneProxyConfig proxyConfig) {
            this.proxyConfig = proxyConfig;
            return this;
        }
        @CustomType.Setter
        public Builder rootVolume(@Nullable AwsClusterControlPlaneRootVolume rootVolume) {
            this.rootVolume = rootVolume;
            return this;
        }
        @CustomType.Setter
        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }
        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }
        @CustomType.Setter
        public Builder sshConfig(@Nullable AwsClusterControlPlaneSshConfig sshConfig) {
            this.sshConfig = sshConfig;
            return this;
        }
        @CustomType.Setter
        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public AwsClusterControlPlane build() {
            final var o = new AwsClusterControlPlane();
            o.awsServicesAuthentication = awsServicesAuthentication;
            o.configEncryption = configEncryption;
            o.databaseEncryption = databaseEncryption;
            o.iamInstanceProfile = iamInstanceProfile;
            o.instancePlacement = instancePlacement;
            o.instanceType = instanceType;
            o.mainVolume = mainVolume;
            o.proxyConfig = proxyConfig;
            o.rootVolume = rootVolume;
            o.securityGroupIds = securityGroupIds;
            o.sshConfig = sshConfig;
            o.subnetIds = subnetIds;
            o.tags = tags;
            o.version = version;
            return o;
        }
    }
}
