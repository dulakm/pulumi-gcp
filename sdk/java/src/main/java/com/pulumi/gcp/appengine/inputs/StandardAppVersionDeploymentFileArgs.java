// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.appengine.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardAppVersionDeploymentFileArgs extends com.pulumi.resources.ResourceArgs {

    public static final StandardAppVersionDeploymentFileArgs Empty = new StandardAppVersionDeploymentFileArgs();

    /**
     * The identifier for this object. Format specified above.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The identifier for this object. Format specified above.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * SHA1 checksum of the file
     * 
     */
    @Import(name="sha1Sum")
    private @Nullable Output<String> sha1Sum;

    /**
     * @return SHA1 checksum of the file
     * 
     */
    public Optional<Output<String>> sha1Sum() {
        return Optional.ofNullable(this.sha1Sum);
    }

    /**
     * Source URL
     * 
     */
    @Import(name="sourceUrl", required=true)
    private Output<String> sourceUrl;

    /**
     * @return Source URL
     * 
     */
    public Output<String> sourceUrl() {
        return this.sourceUrl;
    }

    private StandardAppVersionDeploymentFileArgs() {}

    private StandardAppVersionDeploymentFileArgs(StandardAppVersionDeploymentFileArgs $) {
        this.name = $.name;
        this.sha1Sum = $.sha1Sum;
        this.sourceUrl = $.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StandardAppVersionDeploymentFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StandardAppVersionDeploymentFileArgs $;

        public Builder() {
            $ = new StandardAppVersionDeploymentFileArgs();
        }

        public Builder(StandardAppVersionDeploymentFileArgs defaults) {
            $ = new StandardAppVersionDeploymentFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The identifier for this object. Format specified above.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param sha1Sum SHA1 checksum of the file
         * 
         * @return builder
         * 
         */
        public Builder sha1Sum(@Nullable Output<String> sha1Sum) {
            $.sha1Sum = sha1Sum;
            return this;
        }

        /**
         * @param sha1Sum SHA1 checksum of the file
         * 
         * @return builder
         * 
         */
        public Builder sha1Sum(String sha1Sum) {
            return sha1Sum(Output.of(sha1Sum));
        }

        /**
         * @param sourceUrl Source URL
         * 
         * @return builder
         * 
         */
        public Builder sourceUrl(Output<String> sourceUrl) {
            $.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * @param sourceUrl Source URL
         * 
         * @return builder
         * 
         */
        public Builder sourceUrl(String sourceUrl) {
            return sourceUrl(Output.of(sourceUrl));
        }

        public StandardAppVersionDeploymentFileArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.sourceUrl = Objects.requireNonNull($.sourceUrl, "expected parameter 'sourceUrl' to be non-null");
            return $;
        }
    }

}
