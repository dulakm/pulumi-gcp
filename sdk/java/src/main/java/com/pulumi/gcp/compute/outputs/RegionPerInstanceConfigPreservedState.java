// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.RegionPerInstanceConfigPreservedStateDisk;
import com.pulumi.gcp.compute.outputs.RegionPerInstanceConfigPreservedStateExternalIp;
import com.pulumi.gcp.compute.outputs.RegionPerInstanceConfigPreservedStateInternalIp;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RegionPerInstanceConfigPreservedState {
    /**
     * @return Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RegionPerInstanceConfigPreservedStateDisk> disks;
    /**
     * @return Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RegionPerInstanceConfigPreservedStateExternalIp> externalIps;
    /**
     * @return Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RegionPerInstanceConfigPreservedStateInternalIp> internalIps;
    /**
     * @return Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
     * 
     */
    private @Nullable Map<String,String> metadata;

    private RegionPerInstanceConfigPreservedState() {}
    /**
     * @return Stateful disks for the instance.
     * Structure is documented below.
     * 
     */
    public List<RegionPerInstanceConfigPreservedStateDisk> disks() {
        return this.disks == null ? List.of() : this.disks;
    }
    /**
     * @return Preserved external IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * 
     */
    public List<RegionPerInstanceConfigPreservedStateExternalIp> externalIps() {
        return this.externalIps == null ? List.of() : this.externalIps;
    }
    /**
     * @return Preserved internal IPs defined for this instance. This map is keyed with the name of the network interface.
     * Structure is documented below.
     * 
     */
    public List<RegionPerInstanceConfigPreservedStateInternalIp> internalIps() {
        return this.internalIps == null ? List.of() : this.internalIps;
    }
    /**
     * @return Preserved metadata defined for this instance. This is a list of key-&gt;value pairs.
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionPerInstanceConfigPreservedState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<RegionPerInstanceConfigPreservedStateDisk> disks;
        private @Nullable List<RegionPerInstanceConfigPreservedStateExternalIp> externalIps;
        private @Nullable List<RegionPerInstanceConfigPreservedStateInternalIp> internalIps;
        private @Nullable Map<String,String> metadata;
        public Builder() {}
        public Builder(RegionPerInstanceConfigPreservedState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disks = defaults.disks;
    	      this.externalIps = defaults.externalIps;
    	      this.internalIps = defaults.internalIps;
    	      this.metadata = defaults.metadata;
        }

        @CustomType.Setter
        public Builder disks(@Nullable List<RegionPerInstanceConfigPreservedStateDisk> disks) {
            this.disks = disks;
            return this;
        }
        public Builder disks(RegionPerInstanceConfigPreservedStateDisk... disks) {
            return disks(List.of(disks));
        }
        @CustomType.Setter
        public Builder externalIps(@Nullable List<RegionPerInstanceConfigPreservedStateExternalIp> externalIps) {
            this.externalIps = externalIps;
            return this;
        }
        public Builder externalIps(RegionPerInstanceConfigPreservedStateExternalIp... externalIps) {
            return externalIps(List.of(externalIps));
        }
        @CustomType.Setter
        public Builder internalIps(@Nullable List<RegionPerInstanceConfigPreservedStateInternalIp> internalIps) {
            this.internalIps = internalIps;
            return this;
        }
        public Builder internalIps(RegionPerInstanceConfigPreservedStateInternalIp... internalIps) {
            return internalIps(List.of(internalIps));
        }
        @CustomType.Setter
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        public RegionPerInstanceConfigPreservedState build() {
            final var o = new RegionPerInstanceConfigPreservedState();
            o.disks = disks;
            o.externalIps = externalIps;
            o.internalIps = internalIps;
            o.metadata = metadata;
            return o;
        }
    }
}
