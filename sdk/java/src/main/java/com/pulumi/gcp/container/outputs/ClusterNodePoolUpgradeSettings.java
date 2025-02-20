// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.ClusterNodePoolUpgradeSettingsBlueGreenSettings;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterNodePoolUpgradeSettings {
    /**
     * @return Settings for blue-green upgrade strategy. To be specified when strategy is set to BLUE_GREEN. Structure is documented below.
     * 
     */
    private @Nullable ClusterNodePoolUpgradeSettingsBlueGreenSettings blueGreenSettings;
    /**
     * @return The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process. To be used when strategy is set to SURGE. Default is 0.
     * 
     */
    private @Nullable Integer maxSurge;
    /**
     * @return The maximum number of nodes that can be simultaneously unavailable during the upgrade process. To be used when strategy is set to SURGE. Default is 0.
     * 
     */
    private @Nullable Integer maxUnavailable;
    /**
     * @return Strategy used for node pool update. Strategy can only be one of BLUE_GREEN or SURGE. The default is value is SURGE.
     * 
     */
    private @Nullable String strategy;

    private ClusterNodePoolUpgradeSettings() {}
    /**
     * @return Settings for blue-green upgrade strategy. To be specified when strategy is set to BLUE_GREEN. Structure is documented below.
     * 
     */
    public Optional<ClusterNodePoolUpgradeSettingsBlueGreenSettings> blueGreenSettings() {
        return Optional.ofNullable(this.blueGreenSettings);
    }
    /**
     * @return The maximum number of nodes that can be created beyond the current size of the node pool during the upgrade process. To be used when strategy is set to SURGE. Default is 0.
     * 
     */
    public Optional<Integer> maxSurge() {
        return Optional.ofNullable(this.maxSurge);
    }
    /**
     * @return The maximum number of nodes that can be simultaneously unavailable during the upgrade process. To be used when strategy is set to SURGE. Default is 0.
     * 
     */
    public Optional<Integer> maxUnavailable() {
        return Optional.ofNullable(this.maxUnavailable);
    }
    /**
     * @return Strategy used for node pool update. Strategy can only be one of BLUE_GREEN or SURGE. The default is value is SURGE.
     * 
     */
    public Optional<String> strategy() {
        return Optional.ofNullable(this.strategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterNodePoolUpgradeSettings defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterNodePoolUpgradeSettingsBlueGreenSettings blueGreenSettings;
        private @Nullable Integer maxSurge;
        private @Nullable Integer maxUnavailable;
        private @Nullable String strategy;
        public Builder() {}
        public Builder(ClusterNodePoolUpgradeSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blueGreenSettings = defaults.blueGreenSettings;
    	      this.maxSurge = defaults.maxSurge;
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.strategy = defaults.strategy;
        }

        @CustomType.Setter
        public Builder blueGreenSettings(@Nullable ClusterNodePoolUpgradeSettingsBlueGreenSettings blueGreenSettings) {
            this.blueGreenSettings = blueGreenSettings;
            return this;
        }
        @CustomType.Setter
        public Builder maxSurge(@Nullable Integer maxSurge) {
            this.maxSurge = maxSurge;
            return this;
        }
        @CustomType.Setter
        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        @CustomType.Setter
        public Builder strategy(@Nullable String strategy) {
            this.strategy = strategy;
            return this;
        }
        public ClusterNodePoolUpgradeSettings build() {
            final var o = new ClusterNodePoolUpgradeSettings();
            o.blueGreenSettings = blueGreenSettings;
            o.maxSurge = maxSurge;
            o.maxUnavailable = maxUnavailable;
            o.strategy = strategy;
            return o;
        }
    }
}
