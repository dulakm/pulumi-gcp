// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterIngressPolicyIngressFromSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterIngressPolicyIngressFrom {
    /**
     * @return A list of identities that are allowed access through this ingress policy.
     * Should be in the format of email address. The email address should represent
     * individual user or service account only.
     * 
     */
    private @Nullable List<String> identities;
    /**
     * @return Specifies the type of identities that are allowed access from outside the
     * perimeter. If left unspecified, then members of `identities` field will be
     * allowed access.
     * Possible values are: `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, `ANY_SERVICE_ACCOUNT`.
     * 
     */
    private @Nullable String identityType;
    /**
     * @return Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ServicePerimeterIngressPolicyIngressFromSource> sources;

    private ServicePerimeterIngressPolicyIngressFrom() {}
    /**
     * @return A list of identities that are allowed access through this ingress policy.
     * Should be in the format of email address. The email address should represent
     * individual user or service account only.
     * 
     */
    public List<String> identities() {
        return this.identities == null ? List.of() : this.identities;
    }
    /**
     * @return Specifies the type of identities that are allowed access from outside the
     * perimeter. If left unspecified, then members of `identities` field will be
     * allowed access.
     * Possible values are: `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, `ANY_SERVICE_ACCOUNT`.
     * 
     */
    public Optional<String> identityType() {
        return Optional.ofNullable(this.identityType);
    }
    /**
     * @return Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * 
     */
    public List<ServicePerimeterIngressPolicyIngressFromSource> sources() {
        return this.sources == null ? List.of() : this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterIngressPolicyIngressFrom defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> identities;
        private @Nullable String identityType;
        private @Nullable List<ServicePerimeterIngressPolicyIngressFromSource> sources;
        public Builder() {}
        public Builder(ServicePerimeterIngressPolicyIngressFrom defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identities = defaults.identities;
    	      this.identityType = defaults.identityType;
    	      this.sources = defaults.sources;
        }

        @CustomType.Setter
        public Builder identities(@Nullable List<String> identities) {
            this.identities = identities;
            return this;
        }
        public Builder identities(String... identities) {
            return identities(List.of(identities));
        }
        @CustomType.Setter
        public Builder identityType(@Nullable String identityType) {
            this.identityType = identityType;
            return this;
        }
        @CustomType.Setter
        public Builder sources(@Nullable List<ServicePerimeterIngressPolicyIngressFromSource> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(ServicePerimeterIngressPolicyIngressFromSource... sources) {
            return sources(List.of(sources));
        }
        public ServicePerimeterIngressPolicyIngressFrom build() {
            final var o = new ServicePerimeterIngressPolicyIngressFrom();
            o.identities = identities;
            o.identityType = identityType;
            o.sources = sources;
            return o;
        }
    }
}
