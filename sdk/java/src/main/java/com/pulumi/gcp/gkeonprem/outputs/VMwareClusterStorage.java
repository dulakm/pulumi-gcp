// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class VMwareClusterStorage {
    /**
     * @return Whether or not to deploy vSphere CSI components in the VMware User Cluster.
     * Enabled by default.
     * 
     */
    private Boolean vsphereCsiDisabled;

    private VMwareClusterStorage() {}
    /**
     * @return Whether or not to deploy vSphere CSI components in the VMware User Cluster.
     * Enabled by default.
     * 
     */
    public Boolean vsphereCsiDisabled() {
        return this.vsphereCsiDisabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareClusterStorage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean vsphereCsiDisabled;
        public Builder() {}
        public Builder(VMwareClusterStorage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vsphereCsiDisabled = defaults.vsphereCsiDisabled;
        }

        @CustomType.Setter
        public Builder vsphereCsiDisabled(Boolean vsphereCsiDisabled) {
            this.vsphereCsiDisabled = Objects.requireNonNull(vsphereCsiDisabled);
            return this;
        }
        public VMwareClusterStorage build() {
            final var o = new VMwareClusterStorage();
            o.vsphereCsiDisabled = vsphereCsiDisabled;
            return o;
        }
    }
}
