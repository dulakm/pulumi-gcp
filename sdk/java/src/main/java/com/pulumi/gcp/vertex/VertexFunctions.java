// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyArgs;
import com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreEntitytypeIamPolicyPlainArgs;
import com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyArgs;
import com.pulumi.gcp.vertex.inputs.GetAiFeaturestoreIamPolicyPlainArgs;
import com.pulumi.gcp.vertex.inputs.GetAiIndexArgs;
import com.pulumi.gcp.vertex.inputs.GetAiIndexPlainArgs;
import com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreEntitytypeIamPolicyResult;
import com.pulumi.gcp.vertex.outputs.GetAiFeaturestoreIamPolicyResult;
import com.pulumi.gcp.vertex.outputs.GetAiIndexResult;
import java.util.concurrent.CompletableFuture;

public final class VertexFunctions {
    public static Output<GetAiFeaturestoreEntitytypeIamPolicyResult> getAiFeaturestoreEntitytypeIamPolicy(GetAiFeaturestoreEntitytypeIamPolicyArgs args) {
        return getAiFeaturestoreEntitytypeIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAiFeaturestoreEntitytypeIamPolicyResult> getAiFeaturestoreEntitytypeIamPolicyPlain(GetAiFeaturestoreEntitytypeIamPolicyPlainArgs args) {
        return getAiFeaturestoreEntitytypeIamPolicyPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetAiFeaturestoreEntitytypeIamPolicyResult> getAiFeaturestoreEntitytypeIamPolicy(GetAiFeaturestoreEntitytypeIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:vertex/getAiFeaturestoreEntitytypeIamPolicy:getAiFeaturestoreEntitytypeIamPolicy", TypeShape.of(GetAiFeaturestoreEntitytypeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetAiFeaturestoreEntitytypeIamPolicyResult> getAiFeaturestoreEntitytypeIamPolicyPlain(GetAiFeaturestoreEntitytypeIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:vertex/getAiFeaturestoreEntitytypeIamPolicy:getAiFeaturestoreEntitytypeIamPolicy", TypeShape.of(GetAiFeaturestoreEntitytypeIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    public static Output<GetAiFeaturestoreIamPolicyResult> getAiFeaturestoreIamPolicy(GetAiFeaturestoreIamPolicyArgs args) {
        return getAiFeaturestoreIamPolicy(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAiFeaturestoreIamPolicyResult> getAiFeaturestoreIamPolicyPlain(GetAiFeaturestoreIamPolicyPlainArgs args) {
        return getAiFeaturestoreIamPolicyPlain(args, InvokeOptions.Empty);
    }
    public static Output<GetAiFeaturestoreIamPolicyResult> getAiFeaturestoreIamPolicy(GetAiFeaturestoreIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:vertex/getAiFeaturestoreIamPolicy:getAiFeaturestoreIamPolicy", TypeShape.of(GetAiFeaturestoreIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetAiFeaturestoreIamPolicyResult> getAiFeaturestoreIamPolicyPlain(GetAiFeaturestoreIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:vertex/getAiFeaturestoreIamPolicy:getAiFeaturestoreIamPolicy", TypeShape.of(GetAiFeaturestoreIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search.
     * 
     */
    public static Output<GetAiIndexResult> getAiIndex(GetAiIndexArgs args) {
        return getAiIndex(args, InvokeOptions.Empty);
    }
    /**
     * A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search.
     * 
     */
    public static CompletableFuture<GetAiIndexResult> getAiIndexPlain(GetAiIndexPlainArgs args) {
        return getAiIndexPlain(args, InvokeOptions.Empty);
    }
    /**
     * A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search.
     * 
     */
    public static Output<GetAiIndexResult> getAiIndex(GetAiIndexArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:vertex/getAiIndex:getAiIndex", TypeShape.of(GetAiIndexResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A representation of a collection of database items organized in a way that allows for approximate nearest neighbor (a.k.a ANN) algorithms search.
     * 
     */
    public static CompletableFuture<GetAiIndexResult> getAiIndexPlain(GetAiIndexPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:vertex/getAiIndex:getAiIndex", TypeShape.of(GetAiIndexResult.class), args, Utilities.withVersion(options));
    }
}
