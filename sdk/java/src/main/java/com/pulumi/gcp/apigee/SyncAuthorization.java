// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigee.SyncAuthorizationArgs;
import com.pulumi.gcp.apigee.inputs.SyncAuthorizationState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Authorize the Synchronizer to download environment data from the control plane.
 * 
 * To get more information about SyncAuthorization, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations#getsyncauthorization)
 * * How-to Guides
 *     * [Enable Synchronizer access](https://cloud.google.com/apigee/docs/hybrid/v1.8/synchronizer-access#enable-synchronizer-access)
 * 
 * ## Example Usage
 * ### Apigee Sync Authorization Basic Test
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.projects.Service;
 * import com.pulumi.gcp.projects.ServiceArgs;
 * import com.pulumi.gcp.apigee.Organization;
 * import com.pulumi.gcp.apigee.OrganizationArgs;
 * import com.pulumi.gcp.serviceaccount.Account;
 * import com.pulumi.gcp.serviceaccount.AccountArgs;
 * import com.pulumi.gcp.projects.IAMBinding;
 * import com.pulumi.gcp.projects.IAMBindingArgs;
 * import com.pulumi.gcp.apigee.SyncAuthorization;
 * import com.pulumi.gcp.apigee.SyncAuthorizationArgs;
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
 *         var project = new Project(&#34;project&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;my-project&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .billingAccount(&#34;000000-0000000-0000000-000000&#34;)
 *             .build());
 * 
 *         var apigee = new Service(&#34;apigee&#34;, ServiceArgs.builder()        
 *             .project(project.projectId())
 *             .service(&#34;apigee.googleapis.com&#34;)
 *             .build());
 * 
 *         var apigeeOrg = new Organization(&#34;apigeeOrg&#34;, OrganizationArgs.builder()        
 *             .analyticsRegion(&#34;us-central1&#34;)
 *             .projectId(project.projectId())
 *             .runtimeType(&#34;HYBRID&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(apigee)
 *                 .build());
 * 
 *         var serviceAccount = new Account(&#34;serviceAccount&#34;, AccountArgs.builder()        
 *             .accountId(&#34;my-account&#34;)
 *             .displayName(&#34;Service Account&#34;)
 *             .build());
 * 
 *         var synchronizer_iam = new IAMBinding(&#34;synchronizer-iam&#34;, IAMBindingArgs.builder()        
 *             .project(project.projectId())
 *             .role(&#34;roles/apigee.synchronizerManager&#34;)
 *             .members(serviceAccount.email().applyValue(email -&gt; String.format(&#34;serviceAccount:%s&#34;, email)))
 *             .build());
 * 
 *         var apigeeSyncAuthorization = new SyncAuthorization(&#34;apigeeSyncAuthorization&#34;, SyncAuthorizationArgs.builder()        
 *             .identities(serviceAccount.email().applyValue(email -&gt; String.format(&#34;serviceAccount:%s&#34;, email)))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(synchronizer_iam)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * SyncAuthorization can be imported using any of these accepted formats* `organizations/{{name}}/syncAuthorization` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import SyncAuthorization using one of the formats above. For exampletf import {
 * 
 *  id = &#34;organizations/{{name}}/syncAuthorization&#34;
 * 
 *  to = google_apigee_sync_authorization.default }
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/syncAuthorization:SyncAuthorization When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), SyncAuthorization can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/syncAuthorization:SyncAuthorization default organizations/{{name}}/syncAuthorization
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/syncAuthorization:SyncAuthorization default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/syncAuthorization:SyncAuthorization")
public class SyncAuthorization extends com.pulumi.resources.CustomResource {
    /**
     * Entity tag (ETag) used for optimistic concurrency control as a way to help prevent simultaneous updates from overwriting each other.
     * Used internally during updates.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return Entity tag (ETag) used for optimistic concurrency control as a way to help prevent simultaneous updates from overwriting each other.
     * Used internally during updates.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Array of service accounts to grant access to control plane resources, each specified using the following format: `serviceAccount:service-account-name`.
     * The `service-account-name` is formatted like an email address. For example: my-synchronizer-manager-serviceAccount@my_project_id.iam.gserviceaccount.com
     * You might specify multiple service accounts, for example, if you have multiple environments and wish to assign a unique service account to each one.
     * The service accounts must have **Apigee Synchronizer Manager** role. See also [Create service accounts](https://cloud.google.com/apigee/docs/hybrid/v1.8/sa-about#create-the-service-accounts).
     * 
     */
    @Export(name="identities", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> identities;

    /**
     * @return Array of service accounts to grant access to control plane resources, each specified using the following format: `serviceAccount:service-account-name`.
     * The `service-account-name` is formatted like an email address. For example: my-synchronizer-manager-serviceAccount@my_project_id.iam.gserviceaccount.com
     * You might specify multiple service accounts, for example, if you have multiple environments and wish to assign a unique service account to each one.
     * The service accounts must have **Apigee Synchronizer Manager** role. See also [Create service accounts](https://cloud.google.com/apigee/docs/hybrid/v1.8/sa-about#create-the-service-accounts).
     * 
     */
    public Output<List<String>> identities() {
        return this.identities;
    }
    /**
     * Name of the Apigee organization.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the Apigee organization.
     * 
     * ***
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SyncAuthorization(String name) {
        this(name, SyncAuthorizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SyncAuthorization(String name, SyncAuthorizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SyncAuthorization(String name, SyncAuthorizationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/syncAuthorization:SyncAuthorization", name, args == null ? SyncAuthorizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SyncAuthorization(String name, Output<String> id, @Nullable SyncAuthorizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/syncAuthorization:SyncAuthorization", name, state, makeResourceOptions(options, id));
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
    public static SyncAuthorization get(String name, Output<String> id, @Nullable SyncAuthorizationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SyncAuthorization(name, id, state, options);
    }
}
