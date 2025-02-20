// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeploymentCloudBuildOptions;
import com.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeploymentContainer;
import com.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeploymentFile;
import com.pulumi.gcp.appengine.outputs.FlexibleAppVersionDeploymentZip;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlexibleAppVersionDeployment {
    /**
     * @return Options for the build operations performed as a part of the version deployment. Only applicable when creating a version using source code directly.
     * Structure is documented below.
     * 
     */
    private @Nullable FlexibleAppVersionDeploymentCloudBuildOptions cloudBuildOptions;
    /**
     * @return The Docker image for the container that runs the version.
     * Structure is documented below.
     * 
     */
    private @Nullable FlexibleAppVersionDeploymentContainer container;
    /**
     * @return Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    private @Nullable List<FlexibleAppVersionDeploymentFile> files;
    /**
     * @return Zip File
     * Structure is documented below.
     * 
     */
    private @Nullable FlexibleAppVersionDeploymentZip zip;

    private FlexibleAppVersionDeployment() {}
    /**
     * @return Options for the build operations performed as a part of the version deployment. Only applicable when creating a version using source code directly.
     * Structure is documented below.
     * 
     */
    public Optional<FlexibleAppVersionDeploymentCloudBuildOptions> cloudBuildOptions() {
        return Optional.ofNullable(this.cloudBuildOptions);
    }
    /**
     * @return The Docker image for the container that runs the version.
     * Structure is documented below.
     * 
     */
    public Optional<FlexibleAppVersionDeploymentContainer> container() {
        return Optional.ofNullable(this.container);
    }
    /**
     * @return Manifest of the files stored in Google Cloud Storage that are included as part of this version.
     * All files must be readable using the credentials supplied with this call.
     * Structure is documented below.
     * 
     */
    public List<FlexibleAppVersionDeploymentFile> files() {
        return this.files == null ? List.of() : this.files;
    }
    /**
     * @return Zip File
     * Structure is documented below.
     * 
     */
    public Optional<FlexibleAppVersionDeploymentZip> zip() {
        return Optional.ofNullable(this.zip);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexibleAppVersionDeployment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable FlexibleAppVersionDeploymentCloudBuildOptions cloudBuildOptions;
        private @Nullable FlexibleAppVersionDeploymentContainer container;
        private @Nullable List<FlexibleAppVersionDeploymentFile> files;
        private @Nullable FlexibleAppVersionDeploymentZip zip;
        public Builder() {}
        public Builder(FlexibleAppVersionDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudBuildOptions = defaults.cloudBuildOptions;
    	      this.container = defaults.container;
    	      this.files = defaults.files;
    	      this.zip = defaults.zip;
        }

        @CustomType.Setter
        public Builder cloudBuildOptions(@Nullable FlexibleAppVersionDeploymentCloudBuildOptions cloudBuildOptions) {
            this.cloudBuildOptions = cloudBuildOptions;
            return this;
        }
        @CustomType.Setter
        public Builder container(@Nullable FlexibleAppVersionDeploymentContainer container) {
            this.container = container;
            return this;
        }
        @CustomType.Setter
        public Builder files(@Nullable List<FlexibleAppVersionDeploymentFile> files) {
            this.files = files;
            return this;
        }
        public Builder files(FlexibleAppVersionDeploymentFile... files) {
            return files(List.of(files));
        }
        @CustomType.Setter
        public Builder zip(@Nullable FlexibleAppVersionDeploymentZip zip) {
            this.zip = zip;
            return this;
        }
        public FlexibleAppVersionDeployment build() {
            final var o = new FlexibleAppVersionDeployment();
            o.cloudBuildOptions = cloudBuildOptions;
            o.container = container;
            o.files = files;
            o.zip = zip;
            return o;
        }
    }
}
