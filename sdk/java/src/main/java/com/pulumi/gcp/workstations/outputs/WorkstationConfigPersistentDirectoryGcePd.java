// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkstationConfigPersistentDirectoryGcePd {
    /**
     * @return The type of the persistent disk for the home directory. Defaults to `pd-standard`.
     * 
     */
    private @Nullable String diskType;
    /**
     * @return Type of file system that the disk should be formatted with. The workstation image must support this file system type. Must be empty if `sourceSnapshot` is set. Defaults to `ext4`.
     * 
     */
    private @Nullable String fsType;
    /**
     * @return Whether the persistent disk should be deleted when the workstation is deleted. Valid values are `DELETE` and `RETAIN`. Defaults to `DELETE`.
     * Possible values are: `DELETE`, `RETAIN`.
     * 
     */
    private @Nullable String reclaimPolicy;
    /**
     * @return The GB capacity of a persistent home directory for each workstation created with this configuration. Must be empty if `sourceSnapshot` is set.
     * Valid values are `10`, `50`, `100`, `200`, `500`, or `1000`. Defaults to `200`. If less than `200` GB, the `diskType` must be `pd-balanced` or `pd-ssd`.
     * 
     */
    private @Nullable Integer sizeGb;
    /**
     * @return Name of the snapshot to use as the source for the disk. This can be the snapshot&#39;s `self_link`, `id`, or a string in the format of `projects/{project}/global/snapshots/{snapshot}`. If set, `sizeGb` and `fsType` must be empty. Can only be updated if it has an existing value.
     * 
     */
    private @Nullable String sourceSnapshot;

    private WorkstationConfigPersistentDirectoryGcePd() {}
    /**
     * @return The type of the persistent disk for the home directory. Defaults to `pd-standard`.
     * 
     */
    public Optional<String> diskType() {
        return Optional.ofNullable(this.diskType);
    }
    /**
     * @return Type of file system that the disk should be formatted with. The workstation image must support this file system type. Must be empty if `sourceSnapshot` is set. Defaults to `ext4`.
     * 
     */
    public Optional<String> fsType() {
        return Optional.ofNullable(this.fsType);
    }
    /**
     * @return Whether the persistent disk should be deleted when the workstation is deleted. Valid values are `DELETE` and `RETAIN`. Defaults to `DELETE`.
     * Possible values are: `DELETE`, `RETAIN`.
     * 
     */
    public Optional<String> reclaimPolicy() {
        return Optional.ofNullable(this.reclaimPolicy);
    }
    /**
     * @return The GB capacity of a persistent home directory for each workstation created with this configuration. Must be empty if `sourceSnapshot` is set.
     * Valid values are `10`, `50`, `100`, `200`, `500`, or `1000`. Defaults to `200`. If less than `200` GB, the `diskType` must be `pd-balanced` or `pd-ssd`.
     * 
     */
    public Optional<Integer> sizeGb() {
        return Optional.ofNullable(this.sizeGb);
    }
    /**
     * @return Name of the snapshot to use as the source for the disk. This can be the snapshot&#39;s `self_link`, `id`, or a string in the format of `projects/{project}/global/snapshots/{snapshot}`. If set, `sizeGb` and `fsType` must be empty. Can only be updated if it has an existing value.
     * 
     */
    public Optional<String> sourceSnapshot() {
        return Optional.ofNullable(this.sourceSnapshot);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkstationConfigPersistentDirectoryGcePd defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String diskType;
        private @Nullable String fsType;
        private @Nullable String reclaimPolicy;
        private @Nullable Integer sizeGb;
        private @Nullable String sourceSnapshot;
        public Builder() {}
        public Builder(WorkstationConfigPersistentDirectoryGcePd defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskType = defaults.diskType;
    	      this.fsType = defaults.fsType;
    	      this.reclaimPolicy = defaults.reclaimPolicy;
    	      this.sizeGb = defaults.sizeGb;
    	      this.sourceSnapshot = defaults.sourceSnapshot;
        }

        @CustomType.Setter
        public Builder diskType(@Nullable String diskType) {
            this.diskType = diskType;
            return this;
        }
        @CustomType.Setter
        public Builder fsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }
        @CustomType.Setter
        public Builder reclaimPolicy(@Nullable String reclaimPolicy) {
            this.reclaimPolicy = reclaimPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder sizeGb(@Nullable Integer sizeGb) {
            this.sizeGb = sizeGb;
            return this;
        }
        @CustomType.Setter
        public Builder sourceSnapshot(@Nullable String sourceSnapshot) {
            this.sourceSnapshot = sourceSnapshot;
            return this;
        }
        public WorkstationConfigPersistentDirectoryGcePd build() {
            final var o = new WorkstationConfigPersistentDirectoryGcePd();
            o.diskType = diskType;
            o.fsType = fsType;
            o.reclaimPolicy = reclaimPolicy;
            o.sizeGb = sizeGb;
            o.sourceSnapshot = sourceSnapshot;
            return o;
        }
    }
}
