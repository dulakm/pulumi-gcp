// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.gkehub.outputs.FeatureFleetDefaultMemberConfigConfigmanagement;
import com.pulumi.gcp.gkehub.outputs.FeatureFleetDefaultMemberConfigMesh;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureFleetDefaultMemberConfig {
    /**
     * @return Config Management spec
     * Structure is documented below.
     * 
     */
    private @Nullable FeatureFleetDefaultMemberConfigConfigmanagement configmanagement;
    /**
     * @return Service Mesh spec
     * Structure is documented below.
     * 
     */
    private @Nullable FeatureFleetDefaultMemberConfigMesh mesh;

    private FeatureFleetDefaultMemberConfig() {}
    /**
     * @return Config Management spec
     * Structure is documented below.
     * 
     */
    public Optional<FeatureFleetDefaultMemberConfigConfigmanagement> configmanagement() {
        return Optional.ofNullable(this.configmanagement);
    }
    /**
     * @return Service Mesh spec
     * Structure is documented below.
     * 
     */
    public Optional<FeatureFleetDefaultMemberConfigMesh> mesh() {
        return Optional.ofNullable(this.mesh);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureFleetDefaultMemberConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FeatureFleetDefaultMemberConfigConfigmanagement configmanagement;
        private @Nullable FeatureFleetDefaultMemberConfigMesh mesh;
        public Builder() {}
        public Builder(FeatureFleetDefaultMemberConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configmanagement = defaults.configmanagement;
    	      this.mesh = defaults.mesh;
        }

        @CustomType.Setter
        public Builder configmanagement(@Nullable FeatureFleetDefaultMemberConfigConfigmanagement configmanagement) {
            this.configmanagement = configmanagement;
            return this;
        }
        @CustomType.Setter
        public Builder mesh(@Nullable FeatureFleetDefaultMemberConfigMesh mesh) {
            this.mesh = mesh;
            return this;
        }
        public FeatureFleetDefaultMemberConfig build() {
            final var o = new FeatureFleetDefaultMemberConfig();
            o.configmanagement = configmanagement;
            o.mesh = mesh;
            return o;
        }
    }
}
