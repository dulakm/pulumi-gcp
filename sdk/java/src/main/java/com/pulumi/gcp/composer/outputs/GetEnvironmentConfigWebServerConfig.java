// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.composer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentConfigWebServerConfig {
    private String machineType;

    private GetEnvironmentConfigWebServerConfig() {}
    public String machineType() {
        return this.machineType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWebServerConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String machineType;
        public Builder() {}
        public Builder(GetEnvironmentConfigWebServerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.machineType = defaults.machineType;
        }

        @CustomType.Setter
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        public GetEnvironmentConfigWebServerConfig build() {
            final var o = new GetEnvironmentConfigWebServerConfig();
            o.machineType = machineType;
            return o;
        }
    }
}
