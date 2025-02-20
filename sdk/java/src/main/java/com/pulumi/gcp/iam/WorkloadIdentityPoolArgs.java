// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadIdentityPoolArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadIdentityPoolArgs Empty = new WorkloadIdentityPoolArgs();

    /**
     * A description of the pool. Cannot exceed 256 characters.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the pool. Cannot exceed 256 characters.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use
     * existing tokens to access resources. If the pool is re-enabled, existing tokens grant
     * access again.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use
     * existing tokens to access resources. If the pool is re-enabled, existing tokens grant
     * access again.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * A display name for the pool. Cannot exceed 32 characters.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return A display name for the pool. Cannot exceed 32 characters.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The ID to use for the pool, which becomes the final component of the resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     * ***
     * 
     */
    @Import(name="workloadIdentityPoolId", required=true)
    private Output<String> workloadIdentityPoolId;

    /**
     * @return The ID to use for the pool, which becomes the final component of the resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     * ***
     * 
     */
    public Output<String> workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    private WorkloadIdentityPoolArgs() {}

    private WorkloadIdentityPoolArgs(WorkloadIdentityPoolArgs $) {
        this.description = $.description;
        this.disabled = $.disabled;
        this.displayName = $.displayName;
        this.project = $.project;
        this.workloadIdentityPoolId = $.workloadIdentityPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadIdentityPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadIdentityPoolArgs $;

        public Builder() {
            $ = new WorkloadIdentityPoolArgs();
        }

        public Builder(WorkloadIdentityPoolArgs defaults) {
            $ = new WorkloadIdentityPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description A description of the pool. Cannot exceed 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the pool. Cannot exceed 256 characters.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param disabled Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use
         * existing tokens to access resources. If the pool is re-enabled, existing tokens grant
         * access again.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Whether the pool is disabled. You cannot use a disabled pool to exchange tokens, or use
         * existing tokens to access resources. If the pool is re-enabled, existing tokens grant
         * access again.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param displayName A display name for the pool. Cannot exceed 32 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName A display name for the pool. Cannot exceed 32 characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param workloadIdentityPoolId The ID to use for the pool, which becomes the final component of the resource name. This
         * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
         * `gcp-` is reserved for use by Google, and may not be specified.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPoolId(Output<String> workloadIdentityPoolId) {
            $.workloadIdentityPoolId = workloadIdentityPoolId;
            return this;
        }

        /**
         * @param workloadIdentityPoolId The ID to use for the pool, which becomes the final component of the resource name. This
         * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
         * `gcp-` is reserved for use by Google, and may not be specified.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            return workloadIdentityPoolId(Output.of(workloadIdentityPoolId));
        }

        public WorkloadIdentityPoolArgs build() {
            $.workloadIdentityPoolId = Objects.requireNonNull($.workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
            return $;
        }
    }

}
