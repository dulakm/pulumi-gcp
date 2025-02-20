// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionInstanceTemplateNetworkInterfaceAccessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionInstanceTemplateNetworkInterfaceAccessConfigArgs Empty = new RegionInstanceTemplateNetworkInterfaceAccessConfigArgs();

    /**
     * The IP address that will be 1:1 mapped to the instance&#39;s
     * network ip. If not given, one will be generated.
     * 
     */
    @Import(name="natIp")
    private @Nullable Output<String> natIp;

    /**
     * @return The IP address that will be 1:1 mapped to the instance&#39;s
     * network ip. If not given, one will be generated.
     * 
     */
    public Optional<Output<String>> natIp() {
        return Optional.ofNullable(this.natIp);
    }

    /**
     * The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM and STANDARD tier is valid for IPv6.
     * 
     */
    @Import(name="networkTier")
    private @Nullable Output<String> networkTier;

    /**
     * @return The service-level to be provided for IPv6 traffic when the
     * subnet has an external subnet. Only PREMIUM and STANDARD tier is valid for IPv6.
     * 
     */
    public Optional<Output<String>> networkTier() {
        return Optional.ofNullable(this.networkTier);
    }

    @Import(name="publicPtrDomainName")
    private @Nullable Output<String> publicPtrDomainName;

    public Optional<Output<String>> publicPtrDomainName() {
        return Optional.ofNullable(this.publicPtrDomainName);
    }

    private RegionInstanceTemplateNetworkInterfaceAccessConfigArgs() {}

    private RegionInstanceTemplateNetworkInterfaceAccessConfigArgs(RegionInstanceTemplateNetworkInterfaceAccessConfigArgs $) {
        this.natIp = $.natIp;
        this.networkTier = $.networkTier;
        this.publicPtrDomainName = $.publicPtrDomainName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionInstanceTemplateNetworkInterfaceAccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionInstanceTemplateNetworkInterfaceAccessConfigArgs $;

        public Builder() {
            $ = new RegionInstanceTemplateNetworkInterfaceAccessConfigArgs();
        }

        public Builder(RegionInstanceTemplateNetworkInterfaceAccessConfigArgs defaults) {
            $ = new RegionInstanceTemplateNetworkInterfaceAccessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param natIp The IP address that will be 1:1 mapped to the instance&#39;s
         * network ip. If not given, one will be generated.
         * 
         * @return builder
         * 
         */
        public Builder natIp(@Nullable Output<String> natIp) {
            $.natIp = natIp;
            return this;
        }

        /**
         * @param natIp The IP address that will be 1:1 mapped to the instance&#39;s
         * network ip. If not given, one will be generated.
         * 
         * @return builder
         * 
         */
        public Builder natIp(String natIp) {
            return natIp(Output.of(natIp));
        }

        /**
         * @param networkTier The service-level to be provided for IPv6 traffic when the
         * subnet has an external subnet. Only PREMIUM and STANDARD tier is valid for IPv6.
         * 
         * @return builder
         * 
         */
        public Builder networkTier(@Nullable Output<String> networkTier) {
            $.networkTier = networkTier;
            return this;
        }

        /**
         * @param networkTier The service-level to be provided for IPv6 traffic when the
         * subnet has an external subnet. Only PREMIUM and STANDARD tier is valid for IPv6.
         * 
         * @return builder
         * 
         */
        public Builder networkTier(String networkTier) {
            return networkTier(Output.of(networkTier));
        }

        public Builder publicPtrDomainName(@Nullable Output<String> publicPtrDomainName) {
            $.publicPtrDomainName = publicPtrDomainName;
            return this;
        }

        public Builder publicPtrDomainName(String publicPtrDomainName) {
            return publicPtrDomainName(Output.of(publicPtrDomainName));
        }

        public RegionInstanceTemplateNetworkInterfaceAccessConfigArgs build() {
            return $;
        }
    }

}
