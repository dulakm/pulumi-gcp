// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.logging;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FolderExclusionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FolderExclusionArgs Empty = new FolderExclusionArgs();

    /**
     * A human-readable description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A human-readable description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @Import(name="filter", required=true)
    private Output<String> filter;

    /**
     * @return The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    public Output<String> filter() {
        return this.filter;
    }

    /**
     * The folder to be exported to the sink. Note that either [FOLDER_ID] or &#34;folders/[FOLDER_ID]&#34; is
     * accepted.
     * 
     */
    @Import(name="folder", required=true)
    private Output<String> folder;

    /**
     * @return The folder to be exported to the sink. Note that either [FOLDER_ID] or &#34;folders/[FOLDER_ID]&#34; is
     * accepted.
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }

    /**
     * The name of the logging exclusion.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the logging exclusion.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private FolderExclusionArgs() {}

    private FolderExclusionArgs(FolderExclusionArgs $) {
        this.description = $.description;
        this.disabled = $.disabled;
        this.filter = $.filter;
        this.folder = $.folder;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FolderExclusionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FolderExclusionArgs $;

        public Builder() {
            $ = new FolderExclusionArgs();
        }

        public Builder(FolderExclusionArgs defaults) {
            $ = new FolderExclusionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A human-readable description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A human-readable description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disabled Whether this exclusion rule should be disabled or not. This defaults to
         * false.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Whether this exclusion rule should be disabled or not. This defaults to
         * false.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param filter The filter to apply when excluding logs. Only log entries that match the filter are excluded.
         * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
         * write a filter.
         * 
         * @return builder
         * 
         */
        public Builder filter(Output<String> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter The filter to apply when excluding logs. Only log entries that match the filter are excluded.
         * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
         * write a filter.
         * 
         * @return builder
         * 
         */
        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        /**
         * @param folder The folder to be exported to the sink. Note that either [FOLDER_ID] or &#34;folders/[FOLDER_ID]&#34; is
         * accepted.
         * 
         * @return builder
         * 
         */
        public Builder folder(Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The folder to be exported to the sink. Note that either [FOLDER_ID] or &#34;folders/[FOLDER_ID]&#34; is
         * accepted.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param name The name of the logging exclusion.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the logging exclusion.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public FolderExclusionArgs build() {
            $.filter = Objects.requireNonNull($.filter, "expected parameter 'filter' to be non-null");
            $.folder = Objects.requireNonNull($.folder, "expected parameter 'folder' to be non-null");
            return $;
        }
    }

}
