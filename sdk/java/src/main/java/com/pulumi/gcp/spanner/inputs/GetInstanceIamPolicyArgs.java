// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceIamPolicyArgs Empty = new GetInstanceIamPolicyArgs();

    /**
     * The name of the instance.
     * 
     */
    @Import(name="instance", required=true)
    private Output<String> instance;

    /**
     * @return The name of the instance.
     * 
     */
    public Output<String> instance() {
        return this.instance;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstanceIamPolicyArgs() {}

    private GetInstanceIamPolicyArgs(GetInstanceIamPolicyArgs $) {
        this.instance = $.instance;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceIamPolicyArgs $;

        public Builder() {
            $ = new GetInstanceIamPolicyArgs();
        }

        public Builder(GetInstanceIamPolicyArgs defaults) {
            $ = new GetInstanceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instance The name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instance(Output<String> instance) {
            $.instance = instance;
            return this;
        }

        /**
         * @param instance The name of the instance.
         * 
         * @return builder
         * 
         */
        public Builder instance(String instance) {
            return instance(Output.of(instance));
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetInstanceIamPolicyArgs build() {
            $.instance = Objects.requireNonNull($.instance, "expected parameter 'instance' to be non-null");
            return $;
        }
    }

}
