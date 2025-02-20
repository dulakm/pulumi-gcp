// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNetworksPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNetworksPlainArgs Empty = new GetNetworksPlainArgs();

    /**
     * The name of the project.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The name of the project.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNetworksPlainArgs() {}

    private GetNetworksPlainArgs(GetNetworksPlainArgs $) {
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNetworksPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNetworksPlainArgs $;

        public Builder() {
            $ = new GetNetworksPlainArgs();
        }

        public Builder(GetNetworksPlainArgs defaults) {
            $ = new GetNetworksPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param project The name of the project.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetNetworksPlainArgs build() {
            return $;
        }
    }

}
