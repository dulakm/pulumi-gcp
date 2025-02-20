// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs;
import com.pulumi.gcp.healthcare.inputs.Hl7StoreIamBindingState;
import com.pulumi.gcp.healthcare.outputs.Hl7StoreIamBindingCondition;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Healthcare HL7v2 store. Each of these resources serves a different use case:
 * 
 * * `gcp.healthcare.Hl7StoreIamPolicy`: Authoritative. Sets the IAM policy for the HL7v2 store and replaces any existing policy already attached.
 * * `gcp.healthcare.Hl7StoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the HL7v2 store are preserved.
 * * `gcp.healthcare.Hl7StoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the HL7v2 store are preserved.
 * 
 * &gt; **Note:** `gcp.healthcare.Hl7StoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.Hl7StoreIamBinding` and `gcp.healthcare.Hl7StoreIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.healthcare.Hl7StoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.Hl7StoreIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_healthcare\_hl7\_v2\_store\_iam\_policy
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
 * import com.pulumi.gcp.healthcare.Hl7StoreIamPolicy;
 * import com.pulumi.gcp.healthcare.Hl7StoreIamPolicyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         final var admin = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role(&#34;roles/editor&#34;)
 *                 .members(&#34;user:jane@example.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var hl7V2Store = new Hl7StoreIamPolicy(&#34;hl7V2Store&#34;, Hl7StoreIamPolicyArgs.builder()        
 *             .hl7V2StoreId(&#34;your-hl7-v2-store-id&#34;)
 *             .policyData(admin.applyValue(getIAMPolicyResult -&gt; getIAMPolicyResult.policyData()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_healthcare\_hl7\_v2\_store\_iam\_binding
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.healthcare.Hl7StoreIamBinding;
 * import com.pulumi.gcp.healthcare.Hl7StoreIamBindingArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var hl7V2Store = new Hl7StoreIamBinding(&#34;hl7V2Store&#34;, Hl7StoreIamBindingArgs.builder()        
 *             .hl7V2StoreId(&#34;your-hl7-v2-store-id&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_healthcare\_hl7\_v2\_store\_iam\_member
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.healthcare.Hl7StoreIamMember;
 * import com.pulumi.gcp.healthcare.Hl7StoreIamMemberArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var hl7V2Store = new Hl7StoreIamMember(&#34;hl7V2Store&#34;, Hl7StoreIamMemberArgs.builder()        
 *             .hl7V2StoreId(&#34;your-hl7-v2-store-id&#34;)
 *             .member(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ### Importing IAM policies IAM policy imports use the identifier of the Google Cloud Healthcare HL7v2 store resource. For example* `&#34;{{project_id}}/{{location}}/{{dataset}}/{{hl7_v2_store}}&#34;` An [`import` block](https://developer.hashicorp.com/terraform/language/import) (Terraform v1.5.0 and later) can be used to import IAM policiestf import {
 * 
 *  id = &#34;{{project_id}}/{{location}}/{{dataset}}/{{hl7_v2_store}}&#34;
 * 
 *  to = google_healthcare_hl7_v2_store_iam_policy.default }
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7StoreIamBinding:Hl7StoreIamBinding The [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import) can also be used
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/hl7StoreIamBinding:Hl7StoreIamBinding default {{project_id}}/{{location}}/{{dataset}}/{{hl7_v2_store}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/hl7StoreIamBinding:Hl7StoreIamBinding")
public class Hl7StoreIamBinding extends com.pulumi.resources.CustomResource {
    @Export(name="condition", refs={Hl7StoreIamBindingCondition.class}, tree="[0]")
    private Output</* @Nullable */ Hl7StoreIamBindingCondition> condition;

    public Output<Optional<Hl7StoreIamBindingCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * (Computed) The etag of the HL7v2 store&#39;s IAM policy.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the HL7v2 store&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
     *   Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    @Export(name="hl7V2StoreId", refs={String.class}, tree="[0]")
    private Output<String> hl7V2StoreId;

    /**
     * @return The HL7v2 store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{hl7_v2_store_name}` or
     * `{location_name}/{dataset_name}/{hl7_v2_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
     *   Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    public Output<String> hl7V2StoreId() {
        return this.hl7V2StoreId;
    }
    @Export(name="members", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.healthcare.Hl7StoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Hl7StoreIamBinding(String name) {
        this(name, Hl7StoreIamBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Hl7StoreIamBinding(String name, Hl7StoreIamBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Hl7StoreIamBinding(String name, Hl7StoreIamBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/hl7StoreIamBinding:Hl7StoreIamBinding", name, args == null ? Hl7StoreIamBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Hl7StoreIamBinding(String name, Output<String> id, @Nullable Hl7StoreIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/hl7StoreIamBinding:Hl7StoreIamBinding", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Hl7StoreIamBinding get(String name, Output<String> id, @Nullable Hl7StoreIamBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Hl7StoreIamBinding(name, id, state, options);
    }
}
