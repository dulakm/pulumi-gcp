// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelConditionVpcNetworkSourceVpcSubnetwork;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessLevelConditionVpcNetworkSource {
    /**
     * @return Sub networks within a VPC network.
     * Structure is documented below.
     * 
     */
    private @Nullable AccessLevelConditionVpcNetworkSourceVpcSubnetwork vpcSubnetwork;

    private AccessLevelConditionVpcNetworkSource() {}
    /**
     * @return Sub networks within a VPC network.
     * Structure is documented below.
     * 
     */
    public Optional<AccessLevelConditionVpcNetworkSourceVpcSubnetwork> vpcSubnetwork() {
        return Optional.ofNullable(this.vpcSubnetwork);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelConditionVpcNetworkSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AccessLevelConditionVpcNetworkSourceVpcSubnetwork vpcSubnetwork;
        public Builder() {}
        public Builder(AccessLevelConditionVpcNetworkSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcSubnetwork = defaults.vpcSubnetwork;
        }

        @CustomType.Setter
        public Builder vpcSubnetwork(@Nullable AccessLevelConditionVpcNetworkSourceVpcSubnetwork vpcSubnetwork) {
            this.vpcSubnetwork = vpcSubnetwork;
            return this;
        }
        public AccessLevelConditionVpcNetworkSource build() {
            final var o = new AccessLevelConditionVpcNetworkSource();
            o.vpcSubnetwork = vpcSubnetwork;
            return o;
        }
    }
}
