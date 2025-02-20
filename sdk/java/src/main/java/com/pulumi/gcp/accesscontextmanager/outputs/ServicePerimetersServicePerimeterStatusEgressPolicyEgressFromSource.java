// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSource {
    /**
     * @return An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
     * 
     */
    private @Nullable String accessLevel;

    private ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSource() {}
    /**
     * @return An AccessLevel resource name that allows resources outside the ServicePerimeter to be accessed from the inside.
     * 
     */
    public Optional<String> accessLevel() {
        return Optional.ofNullable(this.accessLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String accessLevel;
        public Builder() {}
        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
        }

        @CustomType.Setter
        public Builder accessLevel(@Nullable String accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }
        public ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSource build() {
            final var o = new ServicePerimetersServicePerimeterStatusEgressPolicyEgressFromSource();
            o.accessLevel = accessLevel;
            return o;
        }
    }
}
