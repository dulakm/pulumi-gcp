// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAiFeaturestoreIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAiFeaturestoreIamPolicyArgs Empty = new GetAiFeaturestoreIamPolicyArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="featurestore", required=true)
    private Output<String> featurestore;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> featurestore() {
        return this.featurestore;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The region of the dataset. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return The region of the dataset. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
     * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
     * region is specified, it is taken from the provider configuration.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    private GetAiFeaturestoreIamPolicyArgs() {}

    private GetAiFeaturestoreIamPolicyArgs(GetAiFeaturestoreIamPolicyArgs $) {
        this.featurestore = $.featurestore;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAiFeaturestoreIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAiFeaturestoreIamPolicyArgs $;

        public Builder() {
            $ = new GetAiFeaturestoreIamPolicyArgs();
        }

        public Builder(GetAiFeaturestoreIamPolicyArgs defaults) {
            $ = new GetAiFeaturestoreIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param featurestore Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder featurestore(Output<String> featurestore) {
            $.featurestore = featurestore;
            return this;
        }

        /**
         * @param featurestore Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder featurestore(String featurestore) {
            return featurestore(Output.of(featurestore));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
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
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region The region of the dataset. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
         * region is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The region of the dataset. eg us-central1 Used to find the parent resource to bind the IAM policy to. If not specified,
         * the value will be parsed from the identifier of the parent resource. If no region is provided in the parent identifier and no
         * region is specified, it is taken from the provider configuration.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        public GetAiFeaturestoreIamPolicyArgs build() {
            $.featurestore = Objects.requireNonNull($.featurestore, "expected parameter 'featurestore' to be non-null");
            return $;
        }
    }

}
