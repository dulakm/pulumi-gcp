// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FeatureMembershipConfigmanagementConfigSyncOci {
    /**
     * @return The GCP Service Account Email used for auth when secret_type is gcpserviceaccount.
     * 
     */
    private @Nullable String gcpServiceAccountEmail;
    /**
     * @return The absolute path of the directory that contains the local resources. Default: the root directory of the image.
     * 
     */
    private @Nullable String policyDir;
    /**
     * @return Type of secret configured for access to the OCI Image. Must be one of gcenode, gcpserviceaccount or none.
     * 
     */
    private @Nullable String secretType;
    /**
     * @return The OCI image repository URL for the package to sync from. e.g. LOCATION-docker.pkg.dev/PROJECT_ID/REPOSITORY_NAME/PACKAGE_NAME.
     * 
     */
    private @Nullable String syncRepo;
    /**
     * @return Period in seconds(int64 format) between consecutive syncs. Default: 15.
     * 
     */
    private @Nullable String syncWaitSecs;

    private FeatureMembershipConfigmanagementConfigSyncOci() {}
    /**
     * @return The GCP Service Account Email used for auth when secret_type is gcpserviceaccount.
     * 
     */
    public Optional<String> gcpServiceAccountEmail() {
        return Optional.ofNullable(this.gcpServiceAccountEmail);
    }
    /**
     * @return The absolute path of the directory that contains the local resources. Default: the root directory of the image.
     * 
     */
    public Optional<String> policyDir() {
        return Optional.ofNullable(this.policyDir);
    }
    /**
     * @return Type of secret configured for access to the OCI Image. Must be one of gcenode, gcpserviceaccount or none.
     * 
     */
    public Optional<String> secretType() {
        return Optional.ofNullable(this.secretType);
    }
    /**
     * @return The OCI image repository URL for the package to sync from. e.g. LOCATION-docker.pkg.dev/PROJECT_ID/REPOSITORY_NAME/PACKAGE_NAME.
     * 
     */
    public Optional<String> syncRepo() {
        return Optional.ofNullable(this.syncRepo);
    }
    /**
     * @return Period in seconds(int64 format) between consecutive syncs. Default: 15.
     * 
     */
    public Optional<String> syncWaitSecs() {
        return Optional.ofNullable(this.syncWaitSecs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureMembershipConfigmanagementConfigSyncOci defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String gcpServiceAccountEmail;
        private @Nullable String policyDir;
        private @Nullable String secretType;
        private @Nullable String syncRepo;
        private @Nullable String syncWaitSecs;
        public Builder() {}
        public Builder(FeatureMembershipConfigmanagementConfigSyncOci defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcpServiceAccountEmail = defaults.gcpServiceAccountEmail;
    	      this.policyDir = defaults.policyDir;
    	      this.secretType = defaults.secretType;
    	      this.syncRepo = defaults.syncRepo;
    	      this.syncWaitSecs = defaults.syncWaitSecs;
        }

        @CustomType.Setter
        public Builder gcpServiceAccountEmail(@Nullable String gcpServiceAccountEmail) {
            this.gcpServiceAccountEmail = gcpServiceAccountEmail;
            return this;
        }
        @CustomType.Setter
        public Builder policyDir(@Nullable String policyDir) {
            this.policyDir = policyDir;
            return this;
        }
        @CustomType.Setter
        public Builder secretType(@Nullable String secretType) {
            this.secretType = secretType;
            return this;
        }
        @CustomType.Setter
        public Builder syncRepo(@Nullable String syncRepo) {
            this.syncRepo = syncRepo;
            return this;
        }
        @CustomType.Setter
        public Builder syncWaitSecs(@Nullable String syncWaitSecs) {
            this.syncWaitSecs = syncWaitSecs;
            return this;
        }
        public FeatureMembershipConfigmanagementConfigSyncOci build() {
            final var o = new FeatureMembershipConfigmanagementConfigSyncOci();
            o.gcpServiceAccountEmail = gcpServiceAccountEmail;
            o.policyDir = policyDir;
            o.secretType = secretType;
            o.syncRepo = syncRepo;
            o.syncWaitSecs = syncWaitSecs;
            return o;
        }
    }
}
