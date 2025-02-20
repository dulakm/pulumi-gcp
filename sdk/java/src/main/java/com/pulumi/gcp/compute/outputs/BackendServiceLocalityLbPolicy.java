// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.BackendServiceLocalityLbPolicyCustomPolicy;
import com.pulumi.gcp.compute.outputs.BackendServiceLocalityLbPolicyPolicy;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendServiceLocalityLbPolicy {
    /**
     * @return The configuration for a custom policy implemented by the user and
     * deployed with the client.
     * Structure is documented below.
     * 
     */
    private @Nullable BackendServiceLocalityLbPolicyCustomPolicy customPolicy;
    /**
     * @return The configuration for a built-in load balancing policy.
     * Structure is documented below.
     * 
     */
    private @Nullable BackendServiceLocalityLbPolicyPolicy policy;

    private BackendServiceLocalityLbPolicy() {}
    /**
     * @return The configuration for a custom policy implemented by the user and
     * deployed with the client.
     * Structure is documented below.
     * 
     */
    public Optional<BackendServiceLocalityLbPolicyCustomPolicy> customPolicy() {
        return Optional.ofNullable(this.customPolicy);
    }
    /**
     * @return The configuration for a built-in load balancing policy.
     * Structure is documented below.
     * 
     */
    public Optional<BackendServiceLocalityLbPolicyPolicy> policy() {
        return Optional.ofNullable(this.policy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceLocalityLbPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable BackendServiceLocalityLbPolicyCustomPolicy customPolicy;
        private @Nullable BackendServiceLocalityLbPolicyPolicy policy;
        public Builder() {}
        public Builder(BackendServiceLocalityLbPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customPolicy = defaults.customPolicy;
    	      this.policy = defaults.policy;
        }

        @CustomType.Setter
        public Builder customPolicy(@Nullable BackendServiceLocalityLbPolicyCustomPolicy customPolicy) {
            this.customPolicy = customPolicy;
            return this;
        }
        @CustomType.Setter
        public Builder policy(@Nullable BackendServiceLocalityLbPolicyPolicy policy) {
            this.policy = policy;
            return this;
        }
        public BackendServiceLocalityLbPolicy build() {
            final var o = new BackendServiceLocalityLbPolicy();
            o.customPolicy = customPolicy;
            o.policy = policy;
            return o;
        }
    }
}
