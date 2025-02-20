// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs extends com.pulumi.resources.ResourceArgs {

    public static final VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs Empty = new VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs();

    /**
     * The network gateway used by the VMware User Cluster.
     * 
     */
    @Import(name="gateway", required=true)
    private Output<String> gateway;

    /**
     * @return The network gateway used by the VMware User Cluster.
     * 
     */
    public Output<String> gateway() {
        return this.gateway;
    }

    /**
     * The node&#39;s network configurations used by the VMware User Cluster.
     * Structure is documented below.
     * 
     */
    @Import(name="ips", required=true)
    private Output<List<VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs>> ips;

    /**
     * @return The node&#39;s network configurations used by the VMware User Cluster.
     * Structure is documented below.
     * 
     */
    public Output<List<VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs>> ips() {
        return this.ips;
    }

    /**
     * The netmask used by the VMware User Cluster.
     * 
     */
    @Import(name="netmask", required=true)
    private Output<String> netmask;

    /**
     * @return The netmask used by the VMware User Cluster.
     * 
     */
    public Output<String> netmask() {
        return this.netmask;
    }

    private VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs() {}

    private VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs(VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs $) {
        this.gateway = $.gateway;
        this.ips = $.ips;
        this.netmask = $.netmask;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs $;

        public Builder() {
            $ = new VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs();
        }

        public Builder(VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs defaults) {
            $ = new VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param gateway The network gateway used by the VMware User Cluster.
         * 
         * @return builder
         * 
         */
        public Builder gateway(Output<String> gateway) {
            $.gateway = gateway;
            return this;
        }

        /**
         * @param gateway The network gateway used by the VMware User Cluster.
         * 
         * @return builder
         * 
         */
        public Builder gateway(String gateway) {
            return gateway(Output.of(gateway));
        }

        /**
         * @param ips The node&#39;s network configurations used by the VMware User Cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ips(Output<List<VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs>> ips) {
            $.ips = ips;
            return this;
        }

        /**
         * @param ips The node&#39;s network configurations used by the VMware User Cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ips(List<VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs> ips) {
            return ips(Output.of(ips));
        }

        /**
         * @param ips The node&#39;s network configurations used by the VMware User Cluster.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder ips(VMwareClusterNetworkConfigStaticIpConfigIpBlockIpArgs... ips) {
            return ips(List.of(ips));
        }

        /**
         * @param netmask The netmask used by the VMware User Cluster.
         * 
         * @return builder
         * 
         */
        public Builder netmask(Output<String> netmask) {
            $.netmask = netmask;
            return this;
        }

        /**
         * @param netmask The netmask used by the VMware User Cluster.
         * 
         * @return builder
         * 
         */
        public Builder netmask(String netmask) {
            return netmask(Output.of(netmask));
        }

        public VMwareClusterNetworkConfigStaticIpConfigIpBlockArgs build() {
            $.gateway = Objects.requireNonNull($.gateway, "expected parameter 'gateway' to be non-null");
            $.ips = Objects.requireNonNull($.ips, "expected parameter 'ips' to be non-null");
            $.netmask = Objects.requireNonNull($.netmask, "expected parameter 'netmask' to be non-null");
            return $;
        }
    }

}
