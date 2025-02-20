// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkeonprem.outputs.BareMetalAdminClusterStorageLvpShareConfigLvpConfig;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalAdminClusterStorageLvpShareConfig {
    /**
     * @return Defines the machine path and storage class for the LVP Share.
     * Structure is documented below.
     * 
     */
    private BareMetalAdminClusterStorageLvpShareConfigLvpConfig lvpConfig;
    /**
     * @return The number of subdirectories to create under path.
     * 
     */
    private @Nullable Integer sharedPathPvCount;

    private BareMetalAdminClusterStorageLvpShareConfig() {}
    /**
     * @return Defines the machine path and storage class for the LVP Share.
     * Structure is documented below.
     * 
     */
    public BareMetalAdminClusterStorageLvpShareConfigLvpConfig lvpConfig() {
        return this.lvpConfig;
    }
    /**
     * @return The number of subdirectories to create under path.
     * 
     */
    public Optional<Integer> sharedPathPvCount() {
        return Optional.ofNullable(this.sharedPathPvCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalAdminClusterStorageLvpShareConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private BareMetalAdminClusterStorageLvpShareConfigLvpConfig lvpConfig;
        private @Nullable Integer sharedPathPvCount;
        public Builder() {}
        public Builder(BareMetalAdminClusterStorageLvpShareConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lvpConfig = defaults.lvpConfig;
    	      this.sharedPathPvCount = defaults.sharedPathPvCount;
        }

        @CustomType.Setter
        public Builder lvpConfig(BareMetalAdminClusterStorageLvpShareConfigLvpConfig lvpConfig) {
            this.lvpConfig = Objects.requireNonNull(lvpConfig);
            return this;
        }
        @CustomType.Setter
        public Builder sharedPathPvCount(@Nullable Integer sharedPathPvCount) {
            this.sharedPathPvCount = sharedPathPvCount;
            return this;
        }
        public BareMetalAdminClusterStorageLvpShareConfig build() {
            final var o = new BareMetalAdminClusterStorageLvpShareConfig();
            o.lvpConfig = lvpConfig;
            o.sharedPathPvCount = sharedPathPvCount;
            return o;
        }
    }
}
