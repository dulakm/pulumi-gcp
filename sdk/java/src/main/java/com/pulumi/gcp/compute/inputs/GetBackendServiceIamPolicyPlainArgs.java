// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackendServiceIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackendServiceIamPolicyPlainArgs Empty = new GetBackendServiceIamPolicyPlainArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetBackendServiceIamPolicyPlainArgs() {}

    private GetBackendServiceIamPolicyPlainArgs(GetBackendServiceIamPolicyPlainArgs $) {
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBackendServiceIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBackendServiceIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetBackendServiceIamPolicyPlainArgs();
        }

        public Builder(GetBackendServiceIamPolicyPlainArgs defaults) {
            $ = new GetBackendServiceIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetBackendServiceIamPolicyPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
