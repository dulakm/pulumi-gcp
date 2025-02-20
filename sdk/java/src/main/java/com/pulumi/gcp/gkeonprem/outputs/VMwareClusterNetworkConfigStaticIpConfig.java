// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkeonprem.outputs.VMwareClusterNetworkConfigStaticIpConfigIpBlock;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VMwareClusterNetworkConfigStaticIpConfig {
    /**
     * @return Represents the configuration values for static IP allocation to nodes.
     * Structure is documented below.
     * 
     */
    private List<VMwareClusterNetworkConfigStaticIpConfigIpBlock> ipBlocks;

    private VMwareClusterNetworkConfigStaticIpConfig() {}
    /**
     * @return Represents the configuration values for static IP allocation to nodes.
     * Structure is documented below.
     * 
     */
    public List<VMwareClusterNetworkConfigStaticIpConfigIpBlock> ipBlocks() {
        return this.ipBlocks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareClusterNetworkConfigStaticIpConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<VMwareClusterNetworkConfigStaticIpConfigIpBlock> ipBlocks;
        public Builder() {}
        public Builder(VMwareClusterNetworkConfigStaticIpConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipBlocks = defaults.ipBlocks;
        }

        @CustomType.Setter
        public Builder ipBlocks(List<VMwareClusterNetworkConfigStaticIpConfigIpBlock> ipBlocks) {
            this.ipBlocks = Objects.requireNonNull(ipBlocks);
            return this;
        }
        public Builder ipBlocks(VMwareClusterNetworkConfigStaticIpConfigIpBlock... ipBlocks) {
            return ipBlocks(List.of(ipBlocks));
        }
        public VMwareClusterNetworkConfigStaticIpConfig build() {
            final var o = new VMwareClusterNetworkConfigStaticIpConfig();
            o.ipBlocks = ipBlocks;
            return o;
        }
    }
}
