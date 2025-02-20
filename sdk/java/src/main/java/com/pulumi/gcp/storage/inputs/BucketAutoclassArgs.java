// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BucketAutoclassArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketAutoclassArgs Empty = new BucketAutoclassArgs();

    /**
     * While set to `true`, autoclass automatically transitions objects in your bucket to appropriate storage classes based on each object&#39;s access pattern.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return While set to `true`, autoclass automatically transitions objects in your bucket to appropriate storage classes based on each object&#39;s access pattern.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * The storage class that objects in the bucket eventually transition to if they are not read for a certain length of time. Supported values include: `NEARLINE`, `ARCHIVE`.
     * 
     */
    @Import(name="terminalStorageClass")
    private @Nullable Output<String> terminalStorageClass;

    /**
     * @return The storage class that objects in the bucket eventually transition to if they are not read for a certain length of time. Supported values include: `NEARLINE`, `ARCHIVE`.
     * 
     */
    public Optional<Output<String>> terminalStorageClass() {
        return Optional.ofNullable(this.terminalStorageClass);
    }

    private BucketAutoclassArgs() {}

    private BucketAutoclassArgs(BucketAutoclassArgs $) {
        this.enabled = $.enabled;
        this.terminalStorageClass = $.terminalStorageClass;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketAutoclassArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketAutoclassArgs $;

        public Builder() {
            $ = new BucketAutoclassArgs();
        }

        public Builder(BucketAutoclassArgs defaults) {
            $ = new BucketAutoclassArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled While set to `true`, autoclass automatically transitions objects in your bucket to appropriate storage classes based on each object&#39;s access pattern.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled While set to `true`, autoclass automatically transitions objects in your bucket to appropriate storage classes based on each object&#39;s access pattern.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param terminalStorageClass The storage class that objects in the bucket eventually transition to if they are not read for a certain length of time. Supported values include: `NEARLINE`, `ARCHIVE`.
         * 
         * @return builder
         * 
         */
        public Builder terminalStorageClass(@Nullable Output<String> terminalStorageClass) {
            $.terminalStorageClass = terminalStorageClass;
            return this;
        }

        /**
         * @param terminalStorageClass The storage class that objects in the bucket eventually transition to if they are not read for a certain length of time. Supported values include: `NEARLINE`, `ARCHIVE`.
         * 
         * @return builder
         * 
         */
        public Builder terminalStorageClass(String terminalStorageClass) {
            return terminalStorageClass(Output.of(terminalStorageClass));
        }

        public BucketAutoclassArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
