// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GuestPoliciesRecipeUpdateStepArchiveExtractionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GuestPoliciesRecipeUpdateStepArchiveExtractionArgs Empty = new GuestPoliciesRecipeUpdateStepArchiveExtractionArgs();

    /**
     * The id of the relevant artifact in the recipe.
     * 
     */
    @Import(name="artifactId", required=true)
    private Output<String> artifactId;

    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    public Output<String> artifactId() {
        return this.artifactId;
    }

    /**
     * Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
     * 
     */
    @Import(name="destination")
    private @Nullable Output<String> destination;

    /**
     * @return Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
     * 
     */
    public Optional<Output<String>> destination() {
        return Optional.ofNullable(this.destination);
    }

    /**
     * The type of the archive to extract.
     * Possible values are: `TAR`, `TAR_GZIP`, `TAR_BZIP`, `TAR_LZMA`, `TAR_XZ`, `ZIP`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the archive to extract.
     * Possible values are: `TAR`, `TAR_GZIP`, `TAR_BZIP`, `TAR_LZMA`, `TAR_XZ`, `ZIP`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private GuestPoliciesRecipeUpdateStepArchiveExtractionArgs() {}

    private GuestPoliciesRecipeUpdateStepArchiveExtractionArgs(GuestPoliciesRecipeUpdateStepArchiveExtractionArgs $) {
        this.artifactId = $.artifactId;
        this.destination = $.destination;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GuestPoliciesRecipeUpdateStepArchiveExtractionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GuestPoliciesRecipeUpdateStepArchiveExtractionArgs $;

        public Builder() {
            $ = new GuestPoliciesRecipeUpdateStepArchiveExtractionArgs();
        }

        public Builder(GuestPoliciesRecipeUpdateStepArchiveExtractionArgs defaults) {
            $ = new GuestPoliciesRecipeUpdateStepArchiveExtractionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param artifactId The id of the relevant artifact in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifactId(Output<String> artifactId) {
            $.artifactId = artifactId;
            return this;
        }

        /**
         * @param artifactId The id of the relevant artifact in the recipe.
         * 
         * @return builder
         * 
         */
        public Builder artifactId(String artifactId) {
            return artifactId(Output.of(artifactId));
        }

        /**
         * @param destination Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
         * 
         * @return builder
         * 
         */
        public Builder destination(@Nullable Output<String> destination) {
            $.destination = destination;
            return this;
        }

        /**
         * @param destination Directory to extract archive to. Defaults to / on Linux or C:\ on Windows.
         * 
         * @return builder
         * 
         */
        public Builder destination(String destination) {
            return destination(Output.of(destination));
        }

        /**
         * @param type The type of the archive to extract.
         * Possible values are: `TAR`, `TAR_GZIP`, `TAR_BZIP`, `TAR_LZMA`, `TAR_XZ`, `ZIP`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the archive to extract.
         * Possible values are: `TAR`, `TAR_GZIP`, `TAR_BZIP`, `TAR_LZMA`, `TAR_XZ`, `ZIP`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GuestPoliciesRecipeUpdateStepArchiveExtractionArgs build() {
            $.artifactId = Objects.requireNonNull($.artifactId, "expected parameter 'artifactId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
