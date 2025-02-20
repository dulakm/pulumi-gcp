// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterNodeConfigKubeletConfig {
    private Boolean cpuCfsQuota;
    private String cpuCfsQuotaPeriod;
    private String cpuManagerPolicy;
    private Integer podPidsLimit;

    private GetClusterNodeConfigKubeletConfig() {}
    public Boolean cpuCfsQuota() {
        return this.cpuCfsQuota;
    }
    public String cpuCfsQuotaPeriod() {
        return this.cpuCfsQuotaPeriod;
    }
    public String cpuManagerPolicy() {
        return this.cpuManagerPolicy;
    }
    public Integer podPidsLimit() {
        return this.podPidsLimit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodeConfigKubeletConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean cpuCfsQuota;
        private String cpuCfsQuotaPeriod;
        private String cpuManagerPolicy;
        private Integer podPidsLimit;
        public Builder() {}
        public Builder(GetClusterNodeConfigKubeletConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuCfsQuota = defaults.cpuCfsQuota;
    	      this.cpuCfsQuotaPeriod = defaults.cpuCfsQuotaPeriod;
    	      this.cpuManagerPolicy = defaults.cpuManagerPolicy;
    	      this.podPidsLimit = defaults.podPidsLimit;
        }

        @CustomType.Setter
        public Builder cpuCfsQuota(Boolean cpuCfsQuota) {
            this.cpuCfsQuota = Objects.requireNonNull(cpuCfsQuota);
            return this;
        }
        @CustomType.Setter
        public Builder cpuCfsQuotaPeriod(String cpuCfsQuotaPeriod) {
            this.cpuCfsQuotaPeriod = Objects.requireNonNull(cpuCfsQuotaPeriod);
            return this;
        }
        @CustomType.Setter
        public Builder cpuManagerPolicy(String cpuManagerPolicy) {
            this.cpuManagerPolicy = Objects.requireNonNull(cpuManagerPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder podPidsLimit(Integer podPidsLimit) {
            this.podPidsLimit = Objects.requireNonNull(podPidsLimit);
            return this;
        }
        public GetClusterNodeConfigKubeletConfig build() {
            final var o = new GetClusterNodeConfigKubeletConfig();
            o.cpuCfsQuota = cpuCfsQuota;
            o.cpuCfsQuotaPeriod = cpuCfsQuotaPeriod;
            o.cpuManagerPolicy = cpuManagerPolicy;
            o.podPidsLimit = podPidsLimit;
            return o;
        }
    }
}
