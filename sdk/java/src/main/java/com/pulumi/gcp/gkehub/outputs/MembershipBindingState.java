// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MembershipBindingState {
    /**
     * @return (Output)
     * Code describes the state of a MembershipBinding resource.
     * 
     */
    private @Nullable String code;

    private MembershipBindingState() {}
    /**
     * @return (Output)
     * Code describes the state of a MembershipBinding resource.
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MembershipBindingState defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String code;
        public Builder() {}
        public Builder(MembershipBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        @CustomType.Setter
        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public MembershipBindingState build() {
            final var o = new MembershipBindingState();
            o.code = code;
            return o;
        }
    }
}
