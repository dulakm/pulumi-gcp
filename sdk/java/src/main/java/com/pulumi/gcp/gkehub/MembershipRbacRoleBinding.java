// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkehub;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.gkehub.MembershipRbacRoleBindingArgs;
import com.pulumi.gcp.gkehub.outputs.MembershipRbacRoleBindingRole;
import com.pulumi.gcp.gkehub.outputs.MembershipRbacRoleBindingState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * ## Import
 * 
 * MembershipRBACRoleBinding can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}/rbacrolebindings/{{membership_rbac_role_binding_id}}` * `{{project}}/{{location}}/{{membership_id}}/{{membership_rbac_role_binding_id}}` * `{{location}}/{{membership_id}}/{{membership_rbac_role_binding_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import MembershipRBACRoleBinding using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}/rbacrolebindings/{{membership_rbac_role_binding_id}}&#34;
 * 
 *  to = google_gke_hub_membership_rbac_role_binding.default }
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipRbacRoleBinding:MembershipRbacRoleBinding When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), MembershipRBACRoleBinding can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipRbacRoleBinding:MembershipRbacRoleBinding default projects/{{project}}/locations/{{location}}/memberships/{{membership_id}}/rbacrolebindings/{{membership_rbac_role_binding_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipRbacRoleBinding:MembershipRbacRoleBinding default {{project}}/{{location}}/{{membership_id}}/{{membership_rbac_role_binding_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:gkehub/membershipRbacRoleBinding:MembershipRbacRoleBinding default {{location}}/{{membership_id}}/{{membership_rbac_role_binding_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:gkehub/membershipRbacRoleBinding:MembershipRbacRoleBinding")
public class MembershipRbacRoleBinding extends com.pulumi.resources.CustomResource {
    /**
     * Time the RBAC Role Binding was created in UTC.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time the RBAC Role Binding was created in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * Time the RBAC Role Binding was deleted in UTC.
     * 
     */
    @Export(name="deleteTime", refs={String.class}, tree="[0]")
    private Output<String> deleteTime;

    /**
     * @return Time the RBAC Role Binding was deleted in UTC.
     * 
     */
    public Output<String> deleteTime() {
        return this.deleteTime;
    }
    /**
     * Location of the Membership
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Location of the Membership
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Id of the membership
     * 
     */
    @Export(name="membershipId", refs={String.class}, tree="[0]")
    private Output<String> membershipId;

    /**
     * @return Id of the membership
     * 
     */
    public Output<String> membershipId() {
        return this.membershipId;
    }
    /**
     * The client-provided identifier of the RBAC Role Binding.
     * 
     */
    @Export(name="membershipRbacRoleBindingId", refs={String.class}, tree="[0]")
    private Output<String> membershipRbacRoleBindingId;

    /**
     * @return The client-provided identifier of the RBAC Role Binding.
     * 
     */
    public Output<String> membershipRbacRoleBindingId() {
        return this.membershipRbacRoleBindingId;
    }
    /**
     * The resource name for the RBAC Role Binding
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name for the RBAC Role Binding
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Role to bind to the principal.
     * Structure is documented below.
     * 
     */
    @Export(name="role", refs={MembershipRbacRoleBindingRole.class}, tree="[0]")
    private Output<MembershipRbacRoleBindingRole> role;

    /**
     * @return Role to bind to the principal.
     * Structure is documented below.
     * 
     */
    public Output<MembershipRbacRoleBindingRole> role() {
        return this.role;
    }
    /**
     * State of the RBAC Role Binding resource.
     * Structure is documented below.
     * 
     */
    @Export(name="states", refs={List.class,MembershipRbacRoleBindingState.class}, tree="[0,1]")
    private Output<List<MembershipRbacRoleBindingState>> states;

    /**
     * @return State of the RBAC Role Binding resource.
     * Structure is documented below.
     * 
     */
    public Output<List<MembershipRbacRoleBindingState>> states() {
        return this.states;
    }
    /**
     * Google-generated UUID for this resource.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return Google-generated UUID for this resource.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * Time the RBAC Role Binding was updated in UTC.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Time the RBAC Role Binding was updated in UTC.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Principal that is be authorized in the cluster (at least of one the oneof
     * is required). Updating one will unset the other automatically.
     * user is the name of the user as seen by the kubernetes cluster, example
     * &#34;alice&#34; or &#34;alice@domain.tld&#34;
     * 
     */
    @Export(name="user", refs={String.class}, tree="[0]")
    private Output<String> user;

    /**
     * @return Principal that is be authorized in the cluster (at least of one the oneof
     * is required). Updating one will unset the other automatically.
     * user is the name of the user as seen by the kubernetes cluster, example
     * &#34;alice&#34; or &#34;alice@domain.tld&#34;
     * 
     */
    public Output<String> user() {
        return this.user;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MembershipRbacRoleBinding(String name) {
        this(name, MembershipRbacRoleBindingArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MembershipRbacRoleBinding(String name, MembershipRbacRoleBindingArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MembershipRbacRoleBinding(String name, MembershipRbacRoleBindingArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/membershipRbacRoleBinding:MembershipRbacRoleBinding", name, args == null ? MembershipRbacRoleBindingArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MembershipRbacRoleBinding(String name, Output<String> id, @Nullable com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:gkehub/membershipRbacRoleBinding:MembershipRbacRoleBinding", name, state, makeResourceOptions(options, id));
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
    public static MembershipRbacRoleBinding get(String name, Output<String> id, @Nullable com.pulumi.gcp.gkehub.inputs.MembershipRbacRoleBindingState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MembershipRbacRoleBinding(name, id, state, options);
    }
}
