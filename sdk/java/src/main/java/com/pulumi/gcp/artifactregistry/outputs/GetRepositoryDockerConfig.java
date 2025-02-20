// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetRepositoryDockerConfig {
    private Boolean immutableTags;

    private GetRepositoryDockerConfig() {}
    public Boolean immutableTags() {
        return this.immutableTags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRepositoryDockerConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean immutableTags;
        public Builder() {}
        public Builder(GetRepositoryDockerConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immutableTags = defaults.immutableTags;
        }

        @CustomType.Setter
        public Builder immutableTags(Boolean immutableTags) {
            this.immutableTags = Objects.requireNonNull(immutableTags);
            return this;
        }
        public GetRepositoryDockerConfig build() {
            final var o = new GetRepositoryDockerConfig();
            o.immutableTags = immutableTags;
            return o;
        }
    }
}
