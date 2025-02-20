// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodePoolNodeConfigHostMaintenancePolicy {
    private String maintenanceInterval;

    private NodePoolNodeConfigHostMaintenancePolicy() {}
    public String maintenanceInterval() {
        return this.maintenanceInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigHostMaintenancePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String maintenanceInterval;
        public Builder() {}
        public Builder(NodePoolNodeConfigHostMaintenancePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maintenanceInterval = defaults.maintenanceInterval;
        }

        @CustomType.Setter
        public Builder maintenanceInterval(String maintenanceInterval) {
            this.maintenanceInterval = Objects.requireNonNull(maintenanceInterval);
            return this;
        }
        public NodePoolNodeConfigHostMaintenancePolicy build() {
            final var o = new NodePoolNodeConfigHostMaintenancePolicy();
            o.maintenanceInterval = maintenanceInterval;
            return o;
        }
    }
}
