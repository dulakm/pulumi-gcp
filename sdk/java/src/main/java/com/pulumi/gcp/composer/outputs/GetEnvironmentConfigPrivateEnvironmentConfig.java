// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigPrivateEnvironmentConfig {
    private String cloudComposerConnectionSubnetwork;
    private String cloudComposerNetworkIpv4CidrBlock;
    private String cloudSqlIpv4CidrBlock;
    private String connectionType;
    private Boolean enablePrivateEndpoint;
    private Boolean enablePrivatelyUsedPublicIps;
    private String masterIpv4CidrBlock;
    private String webServerIpv4CidrBlock;

    private GetEnvironmentConfigPrivateEnvironmentConfig() {}
    public String cloudComposerConnectionSubnetwork() {
        return this.cloudComposerConnectionSubnetwork;
    }
    public String cloudComposerNetworkIpv4CidrBlock() {
        return this.cloudComposerNetworkIpv4CidrBlock;
    }
    public String cloudSqlIpv4CidrBlock() {
        return this.cloudSqlIpv4CidrBlock;
    }
    public String connectionType() {
        return this.connectionType;
    }
    public Boolean enablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }
    public Boolean enablePrivatelyUsedPublicIps() {
        return this.enablePrivatelyUsedPublicIps;
    }
    public String masterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }
    public String webServerIpv4CidrBlock() {
        return this.webServerIpv4CidrBlock;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigPrivateEnvironmentConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String cloudComposerConnectionSubnetwork;
        private String cloudComposerNetworkIpv4CidrBlock;
        private String cloudSqlIpv4CidrBlock;
        private String connectionType;
        private Boolean enablePrivateEndpoint;
        private Boolean enablePrivatelyUsedPublicIps;
        private String masterIpv4CidrBlock;
        private String webServerIpv4CidrBlock;
        public Builder() {}
        public Builder(GetEnvironmentConfigPrivateEnvironmentConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudComposerConnectionSubnetwork = defaults.cloudComposerConnectionSubnetwork;
    	      this.cloudComposerNetworkIpv4CidrBlock = defaults.cloudComposerNetworkIpv4CidrBlock;
    	      this.cloudSqlIpv4CidrBlock = defaults.cloudSqlIpv4CidrBlock;
    	      this.connectionType = defaults.connectionType;
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivatelyUsedPublicIps = defaults.enablePrivatelyUsedPublicIps;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.webServerIpv4CidrBlock = defaults.webServerIpv4CidrBlock;
        }

        @CustomType.Setter
        public Builder cloudComposerConnectionSubnetwork(String cloudComposerConnectionSubnetwork) {
            this.cloudComposerConnectionSubnetwork = Objects.requireNonNull(cloudComposerConnectionSubnetwork);
            return this;
        }
        @CustomType.Setter
        public Builder cloudComposerNetworkIpv4CidrBlock(String cloudComposerNetworkIpv4CidrBlock) {
            this.cloudComposerNetworkIpv4CidrBlock = Objects.requireNonNull(cloudComposerNetworkIpv4CidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder cloudSqlIpv4CidrBlock(String cloudSqlIpv4CidrBlock) {
            this.cloudSqlIpv4CidrBlock = Objects.requireNonNull(cloudSqlIpv4CidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        @CustomType.Setter
        public Builder enablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }
        @CustomType.Setter
        public Builder enablePrivatelyUsedPublicIps(Boolean enablePrivatelyUsedPublicIps) {
            this.enablePrivatelyUsedPublicIps = Objects.requireNonNull(enablePrivatelyUsedPublicIps);
            return this;
        }
        @CustomType.Setter
        public Builder masterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }
        @CustomType.Setter
        public Builder webServerIpv4CidrBlock(String webServerIpv4CidrBlock) {
            this.webServerIpv4CidrBlock = Objects.requireNonNull(webServerIpv4CidrBlock);
            return this;
        }
        public GetEnvironmentConfigPrivateEnvironmentConfig build() {
            final var o = new GetEnvironmentConfigPrivateEnvironmentConfig();
            o.cloudComposerConnectionSubnetwork = cloudComposerConnectionSubnetwork;
            o.cloudComposerNetworkIpv4CidrBlock = cloudComposerNetworkIpv4CidrBlock;
            o.cloudSqlIpv4CidrBlock = cloudSqlIpv4CidrBlock;
            o.connectionType = connectionType;
            o.enablePrivateEndpoint = enablePrivateEndpoint;
            o.enablePrivatelyUsedPublicIps = enablePrivatelyUsedPublicIps;
            o.masterIpv4CidrBlock = masterIpv4CidrBlock;
            o.webServerIpv4CidrBlock = webServerIpv4CidrBlock;
            return o;
        }
    }
}
