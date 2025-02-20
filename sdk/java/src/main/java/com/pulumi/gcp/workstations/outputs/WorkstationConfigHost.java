// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.workstations.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.workstations.outputs.WorkstationConfigHostGceInstance;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkstationConfigHost {
    /**
     * @return A runtime using a Compute Engine instance.
     * Structure is documented below.
     * 
     */
    private @Nullable WorkstationConfigHostGceInstance gceInstance;

    private WorkstationConfigHost() {}
    /**
     * @return A runtime using a Compute Engine instance.
     * Structure is documented below.
     * 
     */
    public Optional<WorkstationConfigHostGceInstance> gceInstance() {
        return Optional.ofNullable(this.gceInstance);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkstationConfigHost defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WorkstationConfigHostGceInstance gceInstance;
        public Builder() {}
        public Builder(WorkstationConfigHost defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gceInstance = defaults.gceInstance;
        }

        @CustomType.Setter
        public Builder gceInstance(@Nullable WorkstationConfigHostGceInstance gceInstance) {
            this.gceInstance = gceInstance;
            return this;
        }
        public WorkstationConfigHost build() {
            final var o = new WorkstationConfigHost();
            o.gceInstance = gceInstance;
            return o;
        }
    }
}
