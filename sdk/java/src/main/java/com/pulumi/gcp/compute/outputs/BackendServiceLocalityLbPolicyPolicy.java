// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackendServiceLocalityLbPolicyPolicy {
    /**
     * @return The name of a locality load balancer policy to be used. The value
     * should be one of the predefined ones as supported by localityLbPolicy,
     * although at the moment only ROUND_ROBIN is supported.
     * This field should only be populated when the customPolicy field is not
     * used.
     * Note that specifying the same policy more than once for a backend is
     * not a valid configuration and will be rejected.
     * The possible values are:
     * 
     */
    private String name;

    private BackendServiceLocalityLbPolicyPolicy() {}
    /**
     * @return The name of a locality load balancer policy to be used. The value
     * should be one of the predefined ones as supported by localityLbPolicy,
     * although at the moment only ROUND_ROBIN is supported.
     * This field should only be populated when the customPolicy field is not
     * used.
     * Note that specifying the same policy more than once for a backend is
     * not a valid configuration and will be rejected.
     * The possible values are:
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceLocalityLbPolicyPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(BackendServiceLocalityLbPolicyPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public BackendServiceLocalityLbPolicyPolicy build() {
            final var o = new BackendServiceLocalityLbPolicyPolicy();
            o.name = name;
            return o;
        }
    }
}
