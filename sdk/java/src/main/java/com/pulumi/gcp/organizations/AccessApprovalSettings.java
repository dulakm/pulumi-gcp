// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.organizations.AccessApprovalSettingsArgs;
import com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsState;
import com.pulumi.gcp.organizations.outputs.AccessApprovalSettingsEnrolledService;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Access Approval enables you to require your explicit approval whenever Google support and engineering need to access your customer content.
 * 
 * To get more information about OrganizationSettings, see:
 * 
 * * [API documentation](https://cloud.google.com/access-approval/docs/reference/rest/v1/organizations)
 * 
 * ## Example Usage
 * ### Organization Access Approval Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.AccessApprovalSettings;
 * import com.pulumi.gcp.organizations.AccessApprovalSettingsArgs;
 * import com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs;
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
 *         var organizationAccessApproval = new AccessApprovalSettings(&#34;organizationAccessApproval&#34;, AccessApprovalSettingsArgs.builder()        
 *             .enrolledServices(            
 *                 AccessApprovalSettingsEnrolledServiceArgs.builder()
 *                     .cloudProduct(&#34;appengine.googleapis.com&#34;)
 *                     .build(),
 *                 AccessApprovalSettingsEnrolledServiceArgs.builder()
 *                     .cloudProduct(&#34;dataflow.googleapis.com&#34;)
 *                     .enrollmentLevel(&#34;BLOCK_ALL&#34;)
 *                     .build())
 *             .notificationEmails(            
 *                 &#34;testuser@example.com&#34;,
 *                 &#34;example.user@example.com&#34;)
 *             .organizationId(&#34;123456789&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Organization Access Approval Active Key Version
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.kms.KeyRing;
 * import com.pulumi.gcp.kms.KeyRingArgs;
 * import com.pulumi.gcp.kms.CryptoKey;
 * import com.pulumi.gcp.kms.CryptoKeyArgs;
 * import com.pulumi.gcp.kms.inputs.CryptoKeyVersionTemplateArgs;
 * import com.pulumi.gcp.accessapproval.AccessapprovalFunctions;
 * import com.pulumi.gcp.accessapproval.inputs.GetOrganizationServiceAccountArgs;
 * import com.pulumi.gcp.kms.CryptoKeyIAMMember;
 * import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
 * import com.pulumi.gcp.kms.KmsFunctions;
 * import com.pulumi.gcp.kms.inputs.GetKMSCryptoKeyVersionArgs;
 * import com.pulumi.gcp.organizations.AccessApprovalSettings;
 * import com.pulumi.gcp.organizations.AccessApprovalSettingsArgs;
 * import com.pulumi.gcp.organizations.inputs.AccessApprovalSettingsEnrolledServiceArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var myProject = new Project(&#34;myProject&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;your-project-id&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .build());
 * 
 *         var keyRing = new KeyRing(&#34;keyRing&#34;, KeyRingArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .project(myProject.projectId())
 *             .build());
 * 
 *         var cryptoKey = new CryptoKey(&#34;cryptoKey&#34;, CryptoKeyArgs.builder()        
 *             .keyRing(keyRing.id())
 *             .purpose(&#34;ASYMMETRIC_SIGN&#34;)
 *             .versionTemplate(CryptoKeyVersionTemplateArgs.builder()
 *                 .algorithm(&#34;EC_SIGN_P384_SHA384&#34;)
 *                 .build())
 *             .build());
 * 
 *         final var serviceAccount = AccessapprovalFunctions.getOrganizationServiceAccount(GetOrganizationServiceAccountArgs.builder()
 *             .organizationId(&#34;123456789&#34;)
 *             .build());
 * 
 *         var iam = new CryptoKeyIAMMember(&#34;iam&#34;, CryptoKeyIAMMemberArgs.builder()        
 *             .cryptoKeyId(cryptoKey.id())
 *             .role(&#34;roles/cloudkms.signerVerifier&#34;)
 *             .member(String.format(&#34;serviceAccount:%s&#34;, serviceAccount.applyValue(getOrganizationServiceAccountResult -&gt; getOrganizationServiceAccountResult.accountEmail())))
 *             .build());
 * 
 *         final var cryptoKeyVersion = KmsFunctions.getKMSCryptoKeyVersion(GetKMSCryptoKeyVersionArgs.builder()
 *             .cryptoKey(cryptoKey.id())
 *             .build());
 * 
 *         var organizationAccessApproval = new AccessApprovalSettings(&#34;organizationAccessApproval&#34;, AccessApprovalSettingsArgs.builder()        
 *             .organizationId(&#34;123456789&#34;)
 *             .activeKeyVersion(cryptoKeyVersion.applyValue(getKMSCryptoKeyVersionResult -&gt; getKMSCryptoKeyVersionResult).applyValue(cryptoKeyVersion -&gt; cryptoKeyVersion.applyValue(getKMSCryptoKeyVersionResult -&gt; getKMSCryptoKeyVersionResult.name())))
 *             .enrolledServices(AccessApprovalSettingsEnrolledServiceArgs.builder()
 *                 .cloudProduct(&#34;all&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(iam)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * OrganizationSettings can be imported using any of these accepted formats* `organizations/{{organization_id}}/accessApprovalSettings` * `{{organization_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import OrganizationSettings using one of the formats above. For exampletf import {
 * 
 *  id = &#34;organizations/{{organization_id}}/accessApprovalSettings&#34;
 * 
 *  to = google_organization_access_approval_settings.default }
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), OrganizationSettings can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings default organizations/{{organization_id}}/accessApprovalSettings
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:organizations/accessApprovalSettings:AccessApprovalSettings default {{organization_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:organizations/accessApprovalSettings:AccessApprovalSettings")
public class AccessApprovalSettings extends com.pulumi.resources.CustomResource {
    /**
     * The asymmetric crypto key version to use for signing approval requests.
     * Empty active_key_version indicates that a Google-managed key should be used for signing.
     * 
     */
    @Export(name="activeKeyVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> activeKeyVersion;

    /**
     * @return The asymmetric crypto key version to use for signing approval requests.
     * Empty active_key_version indicates that a Google-managed key should be used for signing.
     * 
     */
    public Output<Optional<String>> activeKeyVersion() {
        return Codegen.optional(this.activeKeyVersion);
    }
    /**
     * This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    @Export(name="ancestorHasActiveKeyVersion", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> ancestorHasActiveKeyVersion;

    /**
     * @return This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    public Output<Boolean> ancestorHasActiveKeyVersion() {
        return this.ancestorHasActiveKeyVersion;
    }
    /**
     * This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    @Export(name="enrolledAncestor", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enrolledAncestor;

    /**
     * @return This field will always be unset for the organization since organizations do not have ancestors.
     * 
     */
    public Output<Boolean> enrolledAncestor() {
        return this.enrolledAncestor;
    }
    /**
     * A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    @Export(name="enrolledServices", refs={List.class,AccessApprovalSettingsEnrolledService.class}, tree="[0,1]")
    private Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices;

    /**
     * @return A list of Google Cloud Services for which the given resource has Access Approval enrolled.
     * Access requests for the resource given by name against any of these services contained here will be required
     * to have explicit approval. Enrollment can be done for individual services.
     * A maximum of 10 enrolled services will be enforced, to be expanded as the set of supported services is expanded.
     * Structure is documented below.
     * 
     */
    public Output<List<AccessApprovalSettingsEnrolledService>> enrolledServices() {
        return this.enrolledServices;
    }
    /**
     * If the field is true, that indicates that there is some configuration issue with the active_key_version
     * configured on this Organization (e.g. it doesn&#39;t exist or the Access Approval service account doesn&#39;t have the
     * correct permissions on it, etc.).
     * 
     */
    @Export(name="invalidKeyVersion", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> invalidKeyVersion;

    /**
     * @return If the field is true, that indicates that there is some configuration issue with the active_key_version
     * configured on this Organization (e.g. it doesn&#39;t exist or the Access Approval service account doesn&#39;t have the
     * correct permissions on it, etc.).
     * 
     */
    public Output<Boolean> invalidKeyVersion() {
        return this.invalidKeyVersion;
    }
    /**
     * The resource name of the settings. Format is &#34;organizations/{organization_id}/accessApprovalSettings&#34;
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the settings. Format is &#34;organizations/{organization_id}/accessApprovalSettings&#34;
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    @Export(name="notificationEmails", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> notificationEmails;

    /**
     * @return A list of email addresses to which notifications relating to approval requests should be sent.
     * Notifications relating to a resource will be sent to all emails in the settings of ancestor
     * resources of that resource. A maximum of 50 email addresses are allowed.
     * 
     */
    public Output<List<String>> notificationEmails() {
        return this.notificationEmails;
    }
    /**
     * ID of the organization of the access approval settings.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output<String> organizationId;

    /**
     * @return ID of the organization of the access approval settings.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessApprovalSettings(String name) {
        this(name, AccessApprovalSettingsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessApprovalSettings(String name, AccessApprovalSettingsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessApprovalSettings(String name, AccessApprovalSettingsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/accessApprovalSettings:AccessApprovalSettings", name, args == null ? AccessApprovalSettingsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessApprovalSettings(String name, Output<String> id, @Nullable AccessApprovalSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:organizations/accessApprovalSettings:AccessApprovalSettings", name, state, makeResourceOptions(options, id));
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
    public static AccessApprovalSettings get(String name, Output<String> id, @Nullable AccessApprovalSettingsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessApprovalSettings(name, id, state, options);
    }
}
