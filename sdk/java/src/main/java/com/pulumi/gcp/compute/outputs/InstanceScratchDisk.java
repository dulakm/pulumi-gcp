// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceScratchDisk {
    /**
     * @return Name with which the attached disk will be accessible
     * under `/dev/disk/by-id/google-*`
     * 
     */
    private @Nullable String deviceName;
    /**
     * @return The disk interface to use for attaching this disk; either SCSI or NVME.
     * 
     */
    private String interface_;
    /**
     * @return The size of the image in gigabytes. If not specified, it
     * will inherit the size of its base image.
     * 
     */
    private @Nullable Integer size;

    private InstanceScratchDisk() {}
    /**
     * @return Name with which the attached disk will be accessible
     * under `/dev/disk/by-id/google-*`
     * 
     */
    public Optional<String> deviceName() {
        return Optional.ofNullable(this.deviceName);
    }
    /**
     * @return The disk interface to use for attaching this disk; either SCSI or NVME.
     * 
     */
    public String interface_() {
        return this.interface_;
    }
    /**
     * @return The size of the image in gigabytes. If not specified, it
     * will inherit the size of its base image.
     * 
     */
    public Optional<Integer> size() {
        return Optional.ofNullable(this.size);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceScratchDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String deviceName;
        private String interface_;
        private @Nullable Integer size;
        public Builder() {}
        public Builder(InstanceScratchDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.interface_ = defaults.interface_;
    	      this.size = defaults.size;
        }

        @CustomType.Setter
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        @CustomType.Setter("interface")
        public Builder interface_(String interface_) {
            this.interface_ = Objects.requireNonNull(interface_);
            return this;
        }
        @CustomType.Setter
        public Builder size(@Nullable Integer size) {
            this.size = size;
            return this;
        }
        public InstanceScratchDisk build() {
            final var o = new InstanceScratchDisk();
            o.deviceName = deviceName;
            o.interface_ = interface_;
            o.size = size;
            return o;
        }
    }
}
