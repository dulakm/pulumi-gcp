// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BareMetalAdminClusterMaintenanceConfig {
    /**
     * @return All IPv4 address from these ranges will be placed into maintenance mode.
     * Nodes in maintenance mode will be cordoned and drained. When both of these
     * are true, the &#34;baremetal.cluster.gke.io/maintenance&#34; annotation will be set
     * on the node resource.
     * 
     */
    private List<String> maintenanceAddressCidrBlocks;

    private BareMetalAdminClusterMaintenanceConfig() {}
    /**
     * @return All IPv4 address from these ranges will be placed into maintenance mode.
     * Nodes in maintenance mode will be cordoned and drained. When both of these
     * are true, the &#34;baremetal.cluster.gke.io/maintenance&#34; annotation will be set
     * on the node resource.
     * 
     */
    public List<String> maintenanceAddressCidrBlocks() {
        return this.maintenanceAddressCidrBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalAdminClusterMaintenanceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> maintenanceAddressCidrBlocks;
        public Builder() {}
        public Builder(BareMetalAdminClusterMaintenanceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maintenanceAddressCidrBlocks = defaults.maintenanceAddressCidrBlocks;
        }

        @CustomType.Setter
        public Builder maintenanceAddressCidrBlocks(List<String> maintenanceAddressCidrBlocks) {
            this.maintenanceAddressCidrBlocks = Objects.requireNonNull(maintenanceAddressCidrBlocks);
            return this;
        }
        public Builder maintenanceAddressCidrBlocks(String... maintenanceAddressCidrBlocks) {
            return maintenanceAddressCidrBlocks(List.of(maintenanceAddressCidrBlocks));
        }
        public BareMetalAdminClusterMaintenanceConfig build() {
            final var o = new BareMetalAdminClusterMaintenanceConfig();
            o.maintenanceAddressCidrBlocks = maintenanceAddressCidrBlocks;
            return o;
        }
    }
}
