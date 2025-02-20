// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDescArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.AuthorizedOrgsDescState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An authorized organizations description describes a list of organizations
 * (1) that have been authorized to use certain asset (for example, device) data
 * owned by different organizations at the enforcement points, or (2) with certain
 * asset (for example, device) have been authorized to access the resources in
 * another organization at the enforcement points.
 * 
 * To get more information about AuthorizedOrgsDesc, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.authorizedOrgsDescs)
 * * How-to Guides
 *     * [gcloud docs](https://cloud.google.com/beyondcorp-enterprise/docs/cross-org-authorization)
 * 
 * &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
 * you must specify a `billing_project` and set `user_project_override` to true
 * in the provider configuration. Otherwise the ACM API will return a 403 error.
 * Your account must have the `serviceusage.services.use` permission on the
 * `billing_project` you defined.
 * 
 * ## Example Usage
 * ### Access Context Manager Authorized Orgs Desc Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.accesscontextmanager.AccessPolicy;
 * import com.pulumi.gcp.accesscontextmanager.AccessPolicyArgs;
 * import com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDesc;
 * import com.pulumi.gcp.accesscontextmanager.AuthorizedOrgsDescArgs;
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
 *         var test_access = new AccessPolicy(&#34;test-access&#34;, AccessPolicyArgs.builder()        
 *             .parent(&#34;organizations/&#34;)
 *             .title(&#34;my policy&#34;)
 *             .build());
 * 
 *         var authorized_orgs_desc = new AuthorizedOrgsDesc(&#34;authorized-orgs-desc&#34;, AuthorizedOrgsDescArgs.builder()        
 *             .assetType(&#34;ASSET_TYPE_CREDENTIAL_STRENGTH&#34;)
 *             .authorizationDirection(&#34;AUTHORIZATION_DIRECTION_TO&#34;)
 *             .authorizationType(&#34;AUTHORIZATION_TYPE_TRUST&#34;)
 *             .orgs(            
 *                 &#34;organizations/12345&#34;,
 *                 &#34;organizations/98765&#34;)
 *             .parent(test_access.name().applyValue(name -&gt; String.format(&#34;accessPolicies/%s&#34;, name)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AuthorizedOrgsDesc can be imported using any of these accepted formats* `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import AuthorizedOrgsDesc using one of the formats above. For exampletf import {
 * 
 *  id = &#34;{{name}}&#34;
 * 
 *  to = google_access_context_manager_authorized_orgs_desc.default }
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/authorizedOrgsDesc:AuthorizedOrgsDesc When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), AuthorizedOrgsDesc can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/authorizedOrgsDesc:AuthorizedOrgsDesc default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/authorizedOrgsDesc:AuthorizedOrgsDesc")
public class AuthorizedOrgsDesc extends com.pulumi.resources.CustomResource {
    /**
     * The type of entities that need to use the authorization relationship during
     * evaluation, such as a device. Valid values are &#34;ASSET_TYPE_DEVICE&#34; and
     * &#34;ASSET_TYPE_CREDENTIAL_STRENGTH&#34;.
     * Possible values are: `ASSET_TYPE_DEVICE`, `ASSET_TYPE_CREDENTIAL_STRENGTH`.
     * 
     */
    @Export(name="assetType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> assetType;

    /**
     * @return The type of entities that need to use the authorization relationship during
     * evaluation, such as a device. Valid values are &#34;ASSET_TYPE_DEVICE&#34; and
     * &#34;ASSET_TYPE_CREDENTIAL_STRENGTH&#34;.
     * Possible values are: `ASSET_TYPE_DEVICE`, `ASSET_TYPE_CREDENTIAL_STRENGTH`.
     * 
     */
    public Output<Optional<String>> assetType() {
        return Codegen.optional(this.assetType);
    }
    /**
     * The direction of the authorization relationship between this organization
     * and the organizations listed in the &#34;orgs&#34; field. The valid values for this
     * field include the following:
     * AUTHORIZATION_DIRECTION_FROM: Allows this organization to evaluate traffic
     * in the organizations listed in the `orgs` field.
     * AUTHORIZATION_DIRECTION_TO: Allows the organizations listed in the `orgs`
     * field to evaluate the traffic in this organization.
     * For the authorization relationship to take effect, all of the organizations
     * must authorize and specify the appropriate relationship direction. For
     * example, if organization A authorized organization B and C to evaluate its
     * traffic, by specifying &#34;AUTHORIZATION_DIRECTION_TO&#34; as the authorization
     * direction, organizations B and C must specify
     * &#34;AUTHORIZATION_DIRECTION_FROM&#34; as the authorization direction in their
     * &#34;AuthorizedOrgsDesc&#34; resource.
     * Possible values are: `AUTHORIZATION_DIRECTION_TO`, `AUTHORIZATION_DIRECTION_FROM`.
     * 
     */
    @Export(name="authorizationDirection", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizationDirection;

    /**
     * @return The direction of the authorization relationship between this organization
     * and the organizations listed in the &#34;orgs&#34; field. The valid values for this
     * field include the following:
     * AUTHORIZATION_DIRECTION_FROM: Allows this organization to evaluate traffic
     * in the organizations listed in the `orgs` field.
     * AUTHORIZATION_DIRECTION_TO: Allows the organizations listed in the `orgs`
     * field to evaluate the traffic in this organization.
     * For the authorization relationship to take effect, all of the organizations
     * must authorize and specify the appropriate relationship direction. For
     * example, if organization A authorized organization B and C to evaluate its
     * traffic, by specifying &#34;AUTHORIZATION_DIRECTION_TO&#34; as the authorization
     * direction, organizations B and C must specify
     * &#34;AUTHORIZATION_DIRECTION_FROM&#34; as the authorization direction in their
     * &#34;AuthorizedOrgsDesc&#34; resource.
     * Possible values are: `AUTHORIZATION_DIRECTION_TO`, `AUTHORIZATION_DIRECTION_FROM`.
     * 
     */
    public Output<Optional<String>> authorizationDirection() {
        return Codegen.optional(this.authorizationDirection);
    }
    /**
     * A granular control type for authorization levels. Valid value is &#34;AUTHORIZATION_TYPE_TRUST&#34;.
     * Possible values are: `AUTHORIZATION_TYPE_TRUST`.
     * 
     */
    @Export(name="authorizationType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> authorizationType;

    /**
     * @return A granular control type for authorization levels. Valid value is &#34;AUTHORIZATION_TYPE_TRUST&#34;.
     * Possible values are: `AUTHORIZATION_TYPE_TRUST`.
     * 
     */
    public Output<Optional<String>> authorizationType() {
        return Codegen.optional(this.authorizationType);
    }
    /**
     * Time the AuthorizedOrgsDesc was created in UTC.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time the AuthorizedOrgsDesc was created in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Resource name for the `AuthorizedOrgsDesc`. Format:
     * `accessPolicies/{access_policy}/authorizedOrgsDescs/{authorized_orgs_desc}`.
     * The `authorized_orgs_desc` component must begin with a letter, followed by
     * alphanumeric characters or `_`.
     * After you create an `AuthorizedOrgsDesc`, you cannot change its `name`.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Resource name for the `AuthorizedOrgsDesc`. Format:
     * `accessPolicies/{access_policy}/authorizedOrgsDescs/{authorized_orgs_desc}`.
     * The `authorized_orgs_desc` component must begin with a letter, followed by
     * alphanumeric characters or `_`.
     * After you create an `AuthorizedOrgsDesc`, you cannot change its `name`.
     * 
     * ***
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The list of organization ids in this AuthorizedOrgsDesc.
     * Format: `organizations/&lt;org_number&gt;`
     * Example: `organizations/123456`
     * 
     */
    @Export(name="orgs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> orgs;

    /**
     * @return The list of organization ids in this AuthorizedOrgsDesc.
     * Format: `organizations/&lt;org_number&gt;`
     * Example: `organizations/123456`
     * 
     */
    public Output<Optional<List<String>>> orgs() {
        return Codegen.optional(this.orgs);
    }
    /**
     * Required. Resource name for the access policy which owns this `AuthorizedOrgsDesc`.
     * 
     */
    @Export(name="parent", refs={String.class}, tree="[0]")
    private Output<String> parent;

    /**
     * @return Required. Resource name for the access policy which owns this `AuthorizedOrgsDesc`.
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }
    /**
     * Time the AuthorizedOrgsDesc was updated in UTC.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Time the AuthorizedOrgsDesc was updated in UTC.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AuthorizedOrgsDesc(String name) {
        this(name, AuthorizedOrgsDescArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AuthorizedOrgsDesc(String name, AuthorizedOrgsDescArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AuthorizedOrgsDesc(String name, AuthorizedOrgsDescArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/authorizedOrgsDesc:AuthorizedOrgsDesc", name, args == null ? AuthorizedOrgsDescArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AuthorizedOrgsDesc(String name, Output<String> id, @Nullable AuthorizedOrgsDescState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/authorizedOrgsDesc:AuthorizedOrgsDesc", name, state, makeResourceOptions(options, id));
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
    public static AuthorizedOrgsDesc get(String name, Output<String> id, @Nullable AuthorizedOrgsDescState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AuthorizedOrgsDesc(name, id, state, options);
    }
}
