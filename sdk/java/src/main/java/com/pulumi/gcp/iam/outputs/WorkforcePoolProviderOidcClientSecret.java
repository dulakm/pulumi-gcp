// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.iam.outputs.WorkforcePoolProviderOidcClientSecretValue;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkforcePoolProviderOidcClientSecret {
    /**
     * @return The value of the client secret.
     * Structure is documented below.
     * 
     */
    private @Nullable WorkforcePoolProviderOidcClientSecretValue value;

    private WorkforcePoolProviderOidcClientSecret() {}
    /**
     * @return The value of the client secret.
     * Structure is documented below.
     * 
     */
    public Optional<WorkforcePoolProviderOidcClientSecretValue> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkforcePoolProviderOidcClientSecret defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable WorkforcePoolProviderOidcClientSecretValue value;
        public Builder() {}
        public Builder(WorkforcePoolProviderOidcClientSecret defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(@Nullable WorkforcePoolProviderOidcClientSecretValue value) {
            this.value = value;
            return this;
        }
        public WorkforcePoolProviderOidcClientSecret build() {
            final var o = new WorkforcePoolProviderOidcClientSecret();
            o.value = value;
            return o;
        }
    }
}
