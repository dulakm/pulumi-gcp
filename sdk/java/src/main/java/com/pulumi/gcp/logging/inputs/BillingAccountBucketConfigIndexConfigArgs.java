// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BillingAccountBucketConfigIndexConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final BillingAccountBucketConfigIndexConfigArgs Empty = new BillingAccountBucketConfigIndexConfigArgs();

    /**
     * The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not eligible for indexing. See indexing documentation for details.
     * 
     */
    @Import(name="fieldPath", required=true)
    private Output<String> fieldPath;

    /**
     * @return The LogEntry field path to index.
     * Note that some paths are automatically indexed, and other paths are not eligible for indexing. See indexing documentation for details.
     * 
     */
    public Output<String> fieldPath() {
        return this.fieldPath;
    }

    /**
     * The type of data in this index. Allowed types include `INDEX_TYPE_UNSPECIFIED`, `INDEX_TYPE_STRING` and `INDEX_TYPE_INTEGER`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of data in this index. Allowed types include `INDEX_TYPE_UNSPECIFIED`, `INDEX_TYPE_STRING` and `INDEX_TYPE_INTEGER`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private BillingAccountBucketConfigIndexConfigArgs() {}

    private BillingAccountBucketConfigIndexConfigArgs(BillingAccountBucketConfigIndexConfigArgs $) {
        this.fieldPath = $.fieldPath;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BillingAccountBucketConfigIndexConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BillingAccountBucketConfigIndexConfigArgs $;

        public Builder() {
            $ = new BillingAccountBucketConfigIndexConfigArgs();
        }

        public Builder(BillingAccountBucketConfigIndexConfigArgs defaults) {
            $ = new BillingAccountBucketConfigIndexConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fieldPath The LogEntry field path to index.
         * Note that some paths are automatically indexed, and other paths are not eligible for indexing. See indexing documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldPath(Output<String> fieldPath) {
            $.fieldPath = fieldPath;
            return this;
        }

        /**
         * @param fieldPath The LogEntry field path to index.
         * Note that some paths are automatically indexed, and other paths are not eligible for indexing. See indexing documentation for details.
         * 
         * @return builder
         * 
         */
        public Builder fieldPath(String fieldPath) {
            return fieldPath(Output.of(fieldPath));
        }

        /**
         * @param type The type of data in this index. Allowed types include `INDEX_TYPE_UNSPECIFIED`, `INDEX_TYPE_STRING` and `INDEX_TYPE_INTEGER`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of data in this index. Allowed types include `INDEX_TYPE_UNSPECIFIED`, `INDEX_TYPE_STRING` and `INDEX_TYPE_INTEGER`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public BillingAccountBucketConfigIndexConfigArgs build() {
            $.fieldPath = Objects.requireNonNull($.fieldPath, "expected parameter 'fieldPath' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
