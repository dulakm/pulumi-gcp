// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegionDiskAsyncPrimaryDisk {
    /**
     * @return Primary disk for asynchronous disk replication.
     * 
     */
    private String disk;

    private RegionDiskAsyncPrimaryDisk() {}
    /**
     * @return Primary disk for asynchronous disk replication.
     * 
     */
    public String disk() {
        return this.disk;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionDiskAsyncPrimaryDisk defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String disk;
        public Builder() {}
        public Builder(RegionDiskAsyncPrimaryDisk defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disk = defaults.disk;
        }

        @CustomType.Setter
        public Builder disk(String disk) {
            this.disk = Objects.requireNonNull(disk);
            return this;
        }
        public RegionDiskAsyncPrimaryDisk build() {
            final var o = new RegionDiskAsyncPrimaryDisk();
            o.disk = disk;
            return o;
        }
    }
}
