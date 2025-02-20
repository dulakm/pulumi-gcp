// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceContainerImage {
    /**
     * @return The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    private String repository;
    /**
     * @return The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    private @Nullable String tag;

    private InstanceContainerImage() {}
    /**
     * @return The path to the container image repository.
     * For example: gcr.io/{project_id}/{imageName}
     * 
     */
    public String repository() {
        return this.repository;
    }
    /**
     * @return The tag of the container image. If not specified, this defaults to the latest tag.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceContainerImage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String repository;
        private @Nullable String tag;
        public Builder() {}
        public Builder(InstanceContainerImage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repository = defaults.repository;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder repository(String repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        public InstanceContainerImage build() {
            final var o = new InstanceContainerImage();
            o.repository = repository;
            o.tag = tag;
            return o;
        }
    }
}
