// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAiFeaturestoreEntitytypeIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAiFeaturestoreEntitytypeIamPolicyPlainArgs Empty = new GetAiFeaturestoreEntitytypeIamPolicyPlainArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="entitytype", required=true)
    private String entitytype;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String entitytype() {
        return this.entitytype;
    }

    /**
     * The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="featurestore", required=true)
    private String featurestore;

    /**
     * @return The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String featurestore() {
        return this.featurestore;
    }

    private GetAiFeaturestoreEntitytypeIamPolicyPlainArgs() {}

    private GetAiFeaturestoreEntitytypeIamPolicyPlainArgs(GetAiFeaturestoreEntitytypeIamPolicyPlainArgs $) {
        this.entitytype = $.entitytype;
        this.featurestore = $.featurestore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAiFeaturestoreEntitytypeIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAiFeaturestoreEntitytypeIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetAiFeaturestoreEntitytypeIamPolicyPlainArgs();
        }

        public Builder(GetAiFeaturestoreEntitytypeIamPolicyPlainArgs defaults) {
            $ = new GetAiFeaturestoreEntitytypeIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entitytype Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder entitytype(String entitytype) {
            $.entitytype = entitytype;
            return this;
        }

        /**
         * @param featurestore The name of the Featurestore to use, in the format projects/{project}/locations/{location}/featurestores/{featurestore}. Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder featurestore(String featurestore) {
            $.featurestore = featurestore;
            return this;
        }

        public GetAiFeaturestoreEntitytypeIamPolicyPlainArgs build() {
            $.entitytype = Objects.requireNonNull($.entitytype, "expected parameter 'entitytype' to be non-null");
            $.featurestore = Objects.requireNonNull($.featurestore, "expected parameter 'featurestore' to be non-null");
            return $;
        }
    }

}
