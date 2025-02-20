// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceTemplateServiceAccount {
    /**
     * @return The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
     */
    private @Nullable String email;
    /**
     * @return A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     * The [service accounts documentation](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam)
     * explains that access scopes are the legacy method of specifying permissions for your instance.
     * To follow best practices you should create a dedicated service account with the minimum permissions the VM requires.
     * To use a dedicated service account this field should be configured as a list containing the `cloud-platform` scope.
     * See [Authenticate workloads using service accounts best practices](https://cloud.google.com/compute/docs/access/create-enable-service-accounts-for-instances#best_practices)
     * and [Best practices for using service accounts](https://cloud.google.com/iam/docs/best-practices-service-accounts#single-purpose).
     * 
     */
    private List<String> scopes;

    private InstanceTemplateServiceAccount() {}
    /**
     * @return The service account e-mail address. If not given, the
     * default Google Compute Engine service account is used.
     * 
     */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * @return A list of service scopes. Both OAuth2 URLs and gcloud
     * short names are supported. To allow full access to all Cloud APIs, use the
     * `cloud-platform` scope. See a complete list of scopes [here](https://cloud.google.com/sdk/gcloud/reference/alpha/compute/instances/set-scopes#--scopes).
     * 
     * The [service accounts documentation](https://cloud.google.com/compute/docs/access/service-accounts#accesscopesiam)
     * explains that access scopes are the legacy method of specifying permissions for your instance.
     * To follow best practices you should create a dedicated service account with the minimum permissions the VM requires.
     * To use a dedicated service account this field should be configured as a list containing the `cloud-platform` scope.
     * See [Authenticate workloads using service accounts best practices](https://cloud.google.com/compute/docs/access/create-enable-service-accounts-for-instances#best_practices)
     * and [Best practices for using service accounts](https://cloud.google.com/iam/docs/best-practices-service-accounts#single-purpose).
     * 
     */
    public List<String> scopes() {
        return this.scopes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceTemplateServiceAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String email;
        private List<String> scopes;
        public Builder() {}
        public Builder(InstanceTemplateServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.scopes = defaults.scopes;
        }

        @CustomType.Setter
        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        @CustomType.Setter
        public Builder scopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }
        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }
        public InstanceTemplateServiceAccount build() {
            final var o = new InstanceTemplateServiceAccount();
            o.email = email;
            o.scopes = scopes;
            return o;
        }
    }
}
