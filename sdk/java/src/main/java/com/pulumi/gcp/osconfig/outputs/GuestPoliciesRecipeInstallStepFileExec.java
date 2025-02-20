// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestPoliciesRecipeInstallStepFileExec {
    /**
     * @return A list of possible return values that the program can return to indicate a success. Defaults to [0].
     * 
     */
    private @Nullable String allowedExitCodes;
    /**
     * @return Arguments to be passed to the provided executable.
     * 
     */
    private @Nullable List<String> args;
    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    private @Nullable String artifactId;
    /**
     * @return The absolute path of the file on the local filesystem.
     * 
     */
    private @Nullable String localPath;

    private GuestPoliciesRecipeInstallStepFileExec() {}
    /**
     * @return A list of possible return values that the program can return to indicate a success. Defaults to [0].
     * 
     */
    public Optional<String> allowedExitCodes() {
        return Optional.ofNullable(this.allowedExitCodes);
    }
    /**
     * @return Arguments to be passed to the provided executable.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return The id of the relevant artifact in the recipe.
     * 
     */
    public Optional<String> artifactId() {
        return Optional.ofNullable(this.artifactId);
    }
    /**
     * @return The absolute path of the file on the local filesystem.
     * 
     */
    public Optional<String> localPath() {
        return Optional.ofNullable(this.localPath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeInstallStepFileExec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String allowedExitCodes;
        private @Nullable List<String> args;
        private @Nullable String artifactId;
        private @Nullable String localPath;
        public Builder() {}
        public Builder(GuestPoliciesRecipeInstallStepFileExec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedExitCodes = defaults.allowedExitCodes;
    	      this.args = defaults.args;
    	      this.artifactId = defaults.artifactId;
    	      this.localPath = defaults.localPath;
        }

        @CustomType.Setter
        public Builder allowedExitCodes(@Nullable String allowedExitCodes) {
            this.allowedExitCodes = allowedExitCodes;
            return this;
        }
        @CustomType.Setter
        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder artifactId(@Nullable String artifactId) {
            this.artifactId = artifactId;
            return this;
        }
        @CustomType.Setter
        public Builder localPath(@Nullable String localPath) {
            this.localPath = localPath;
            return this;
        }
        public GuestPoliciesRecipeInstallStepFileExec build() {
            final var o = new GuestPoliciesRecipeInstallStepFileExec();
            o.allowedExitCodes = allowedExitCodes;
            o.args = args;
            o.artifactId = artifactId;
            o.localPath = localPath;
            return o;
        }
    }
}
