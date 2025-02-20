// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
import com.pulumi.gcp.healthcare.inputs.DicomStoreIamMemberState;
import com.pulumi.gcp.healthcare.outputs.DicomStoreIamMemberCondition;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Three different resources help you manage your IAM policy for Healthcare DICOM store. Each of these resources serves a different use case:
 * 
 * * `gcp.healthcare.DicomStoreIamPolicy`: Authoritative. Sets the IAM policy for the DICOM store and replaces any existing policy already attached.
 * * `gcp.healthcare.DicomStoreIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the DICOM store are preserved.
 * * `gcp.healthcare.DicomStoreIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the DICOM store are preserved.
 * 
 * &gt; **Note:** `gcp.healthcare.DicomStoreIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DicomStoreIamBinding` and `gcp.healthcare.DicomStoreIamMember` or they will fight over what your policy should be.
 * 
 * &gt; **Note:** `gcp.healthcare.DicomStoreIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DicomStoreIamMember` resources **only if** they do not grant privilege to the same role.
 * 
 * ## google\_healthcare\_dicom\_store\_iam\_policy
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
 * import com.pulumi.gcp.healthcare.DicomStoreIamPolicy;
 * import com.pulumi.gcp.healthcare.DicomStoreIamPolicyArgs;
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
 *         var dicomStore = new DicomStoreIamPolicy(&#34;dicomStore&#34;, DicomStoreIamPolicyArgs.builder()        
 *             .dicomStoreId(&#34;your-dicom-store-id&#34;)
 *             .policyData(admin.applyValue(getIAMPolicyResult -&gt; getIAMPolicyResult.policyData()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_healthcare\_dicom\_store\_iam\_binding
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.healthcare.DicomStoreIamBinding;
 * import com.pulumi.gcp.healthcare.DicomStoreIamBindingArgs;
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
 *         var dicomStore = new DicomStoreIamBinding(&#34;dicomStore&#34;, DicomStoreIamBindingArgs.builder()        
 *             .dicomStoreId(&#34;your-dicom-store-id&#34;)
 *             .members(&#34;user:jane@example.com&#34;)
 *             .role(&#34;roles/editor&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## google\_healthcare\_dicom\_store\_iam\_member
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.healthcare.DicomStoreIamMember;
 * import com.pulumi.gcp.healthcare.DicomStoreIamMemberArgs;
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
 *         var dicomStore = new DicomStoreIamMember(&#34;dicomStore&#34;, DicomStoreIamMemberArgs.builder()        
 *             .dicomStoreId(&#34;your-dicom-store-id&#34;)
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
 * ### Importing IAM policies IAM policy imports use the identifier of the Healthcare DICOM store resource. For example* `&#34;{{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}&#34;` An [`import` block](https://developer.hashicorp.com/terraform/language/import) (Terraform v1.5.0 and later) can be used to import IAM policiestf import {
 * 
 *  id = &#34;{{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}&#34;
 * 
 *  to = google_healthcare_dicom_store_iam_policy.default }
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember The [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import) can also be used
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember default {{project_id}}/{{location}}/{{dataset}}/{{dicom_store}}
 * ```
 * 
 */
@ResourceType(type="gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember")
public class DicomStoreIamMember extends com.pulumi.resources.CustomResource {
    @Export(name="condition", refs={DicomStoreIamMemberCondition.class}, tree="[0]")
    private Output</* @Nullable */ DicomStoreIamMemberCondition> condition;

    public Output<Optional<DicomStoreIamMemberCondition>> condition() {
        return Codegen.optional(this.condition);
    }
    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider&#39;s
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
    @Export(name="dicomStoreId", refs={String.class}, tree="[0]")
    private Output<String> dicomStoreId;

    /**
     * @return The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider&#39;s
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
    public Output<String> dicomStoreId() {
        return this.dicomStoreId;
    }
    /**
     * (Computed) The etag of the DICOM store&#39;s IAM policy.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return (Computed) The etag of the DICOM store&#39;s IAM policy.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="member", refs={String.class}, tree="[0]")
    private Output<String> member;

    public Output<String> member() {
        return this.member;
    }
    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
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
    public DicomStoreIamMember(String name) {
        this(name, DicomStoreIamMemberArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DicomStoreIamMember(String name, DicomStoreIamMemberArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DicomStoreIamMember(String name, DicomStoreIamMemberArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember", name, args == null ? DicomStoreIamMemberArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DicomStoreIamMember(String name, Output<String> id, @Nullable DicomStoreIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:healthcare/dicomStoreIamMember:DicomStoreIamMember", name, state, makeResourceOptions(options, id));
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
    public static DicomStoreIamMember get(String name, Output<String> id, @Nullable DicomStoreIamMemberState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DicomStoreIamMember(name, id, state, options);
    }
}
