// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalAdminClusterStorageLvpNodeMountsConfig;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalAdminClusterStorageLvpShareConfig;
import java.util.Objects;

@CustomType
public final class BareMetalAdminClusterStorage {
    /**
     * @return Specifies the config for local PersistentVolumes backed
     * by mounted node disks. These disks need to be formatted and mounted by the
     * user, which can be done before or after cluster creation.
     * Structure is documented below.
     * 
     */
    private BareMetalAdminClusterStorageLvpNodeMountsConfig lvpNodeMountsConfig;
    /**
     * @return Specifies the config for local PersistentVolumes backed by
     * subdirectories in a shared filesystem. These subdirectores are
     * automatically created during cluster creation.
     * Structure is documented below.
     * 
     */
    private BareMetalAdminClusterStorageLvpShareConfig lvpShareConfig;

    private BareMetalAdminClusterStorage() {}
    /**
     * @return Specifies the config for local PersistentVolumes backed
     * by mounted node disks. These disks need to be formatted and mounted by the
     * user, which can be done before or after cluster creation.
     * Structure is documented below.
     * 
     */
    public BareMetalAdminClusterStorageLvpNodeMountsConfig lvpNodeMountsConfig() {
        return this.lvpNodeMountsConfig;
    }
    /**
     * @return Specifies the config for local PersistentVolumes backed by
     * subdirectories in a shared filesystem. These subdirectores are
     * automatically created during cluster creation.
     * Structure is documented below.
     * 
     */
    public BareMetalAdminClusterStorageLvpShareConfig lvpShareConfig() {
        return this.lvpShareConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalAdminClusterStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BareMetalAdminClusterStorageLvpNodeMountsConfig lvpNodeMountsConfig;
        private BareMetalAdminClusterStorageLvpShareConfig lvpShareConfig;
        public Builder() {}
        public Builder(BareMetalAdminClusterStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lvpNodeMountsConfig = defaults.lvpNodeMountsConfig;
    	      this.lvpShareConfig = defaults.lvpShareConfig;
        }

        @CustomType.Setter
        public Builder lvpNodeMountsConfig(BareMetalAdminClusterStorageLvpNodeMountsConfig lvpNodeMountsConfig) {
            this.lvpNodeMountsConfig = Objects.requireNonNull(lvpNodeMountsConfig);
            return this;
        }
        @CustomType.Setter
        public Builder lvpShareConfig(BareMetalAdminClusterStorageLvpShareConfig lvpShareConfig) {
            this.lvpShareConfig = Objects.requireNonNull(lvpShareConfig);
            return this;
        }
        public BareMetalAdminClusterStorage build() {
            final var o = new BareMetalAdminClusterStorage();
            o.lvpNodeMountsConfig = lvpNodeMountsConfig;
            o.lvpShareConfig = lvpShareConfig;
            return o;
        }
    }
}
