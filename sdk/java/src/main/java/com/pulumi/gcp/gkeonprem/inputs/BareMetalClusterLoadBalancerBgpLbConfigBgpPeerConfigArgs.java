// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs Empty = new BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs();

    /**
     * BGP autonomous system number (ASN) for the network that contains the
     * external peer device.
     * 
     */
    @Import(name="asn", required=true)
    private Output<Integer> asn;

    /**
     * @return BGP autonomous system number (ASN) for the network that contains the
     * external peer device.
     * 
     */
    public Output<Integer> asn() {
        return this.asn;
    }

    /**
     * The IP address of the control plane node that connects to the external
     * peer.
     * If you don&#39;t specify any control plane nodes, all control plane nodes
     * can connect to the external peer. If you specify one or more IP addresses,
     * only the nodes specified participate in peering sessions.
     * 
     */
    @Import(name="controlPlaneNodes")
    private @Nullable Output<List<String>> controlPlaneNodes;

    /**
     * @return The IP address of the control plane node that connects to the external
     * peer.
     * If you don&#39;t specify any control plane nodes, all control plane nodes
     * can connect to the external peer. If you specify one or more IP addresses,
     * only the nodes specified participate in peering sessions.
     * 
     */
    public Optional<Output<List<String>>> controlPlaneNodes() {
        return Optional.ofNullable(this.controlPlaneNodes);
    }

    /**
     * The IP address of the external peer device.
     * 
     */
    @Import(name="ipAddress", required=true)
    private Output<String> ipAddress;

    /**
     * @return The IP address of the external peer device.
     * 
     */
    public Output<String> ipAddress() {
        return this.ipAddress;
    }

    private BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs() {}

    private BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs(BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs $) {
        this.asn = $.asn;
        this.controlPlaneNodes = $.controlPlaneNodes;
        this.ipAddress = $.ipAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs $;

        public Builder() {
            $ = new BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs();
        }

        public Builder(BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs defaults) {
            $ = new BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param asn BGP autonomous system number (ASN) for the network that contains the
         * external peer device.
         * 
         * @return builder
         * 
         */
        public Builder asn(Output<Integer> asn) {
            $.asn = asn;
            return this;
        }

        /**
         * @param asn BGP autonomous system number (ASN) for the network that contains the
         * external peer device.
         * 
         * @return builder
         * 
         */
        public Builder asn(Integer asn) {
            return asn(Output.of(asn));
        }

        /**
         * @param controlPlaneNodes The IP address of the control plane node that connects to the external
         * peer.
         * If you don&#39;t specify any control plane nodes, all control plane nodes
         * can connect to the external peer. If you specify one or more IP addresses,
         * only the nodes specified participate in peering sessions.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneNodes(@Nullable Output<List<String>> controlPlaneNodes) {
            $.controlPlaneNodes = controlPlaneNodes;
            return this;
        }

        /**
         * @param controlPlaneNodes The IP address of the control plane node that connects to the external
         * peer.
         * If you don&#39;t specify any control plane nodes, all control plane nodes
         * can connect to the external peer. If you specify one or more IP addresses,
         * only the nodes specified participate in peering sessions.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneNodes(List<String> controlPlaneNodes) {
            return controlPlaneNodes(Output.of(controlPlaneNodes));
        }

        /**
         * @param controlPlaneNodes The IP address of the control plane node that connects to the external
         * peer.
         * If you don&#39;t specify any control plane nodes, all control plane nodes
         * can connect to the external peer. If you specify one or more IP addresses,
         * only the nodes specified participate in peering sessions.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneNodes(String... controlPlaneNodes) {
            return controlPlaneNodes(List.of(controlPlaneNodes));
        }

        /**
         * @param ipAddress The IP address of the external peer device.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(Output<String> ipAddress) {
            $.ipAddress = ipAddress;
            return this;
        }

        /**
         * @param ipAddress The IP address of the external peer device.
         * 
         * @return builder
         * 
         */
        public Builder ipAddress(String ipAddress) {
            return ipAddress(Output.of(ipAddress));
        }

        public BareMetalClusterLoadBalancerBgpLbConfigBgpPeerConfigArgs build() {
            $.asn = Objects.requireNonNull($.asn, "expected parameter 'asn' to be non-null");
            $.ipAddress = Objects.requireNonNull($.ipAddress, "expected parameter 'ipAddress' to be non-null");
            return $;
        }
    }

}
