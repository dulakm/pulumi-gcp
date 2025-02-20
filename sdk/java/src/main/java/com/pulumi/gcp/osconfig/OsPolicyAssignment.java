// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentState;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentInstanceFilter;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentOsPolicy;
import com.pulumi.gcp.osconfig.outputs.OsPolicyAssignmentRollout;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * OS policy assignment is an API resource that is used to apply a set of OS
 * policies to a dynamically targeted group of Compute Engine VM instances. An OS
 * policy is used to define the desired state configuration for a Compute Engine VM
 * instance through a set of configuration resources that provide capabilities such
 * as installing or removing software packages, or executing a script. For more
 * information about the OS policy resource definitions and examples, see
 * [OS policy and OS policy assignment](https://cloud.google.com/compute/docs/os-configuration-management/working-with-os-policies).
 * 
 * To get more information about OSPolicyAssignment, see:
 * 
 * *   [API documentation](https://cloud.google.com/compute/docs/osconfig/rest/v1/projects.locations.osPolicyAssignments)
 * *   How-to Guides
 *     *   [Official Documentation](https://cloud.google.com/compute/docs/os-configuration-management/create-os-policy-assignment)
 * 
 * ## Example Usage
 * ### Os Config Os Policy Assignment Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.osconfig.OsPolicyAssignment;
 * import com.pulumi.gcp.osconfig.OsPolicyAssignmentArgs;
 * import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentInstanceFilterArgs;
 * import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyArgs;
 * import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutArgs;
 * import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentRolloutDisruptionBudgetArgs;
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
 *         var primary = new OsPolicyAssignment(&#34;primary&#34;, OsPolicyAssignmentArgs.builder()        
 *             .description(&#34;A test os policy assignment&#34;)
 *             .instanceFilter(OsPolicyAssignmentInstanceFilterArgs.builder()
 *                 .all(false)
 *                 .exclusionLabels(OsPolicyAssignmentInstanceFilterExclusionLabelArgs.builder()
 *                     .labels(Map.of(&#34;label-two&#34;, &#34;value-two&#34;))
 *                     .build())
 *                 .inclusionLabels(OsPolicyAssignmentInstanceFilterInclusionLabelArgs.builder()
 *                     .labels(Map.of(&#34;label-one&#34;, &#34;value-one&#34;))
 *                     .build())
 *                 .inventories(OsPolicyAssignmentInstanceFilterInventoryArgs.builder()
 *                     .osShortName(&#34;centos&#34;)
 *                     .osVersion(&#34;8.*&#34;)
 *                     .build())
 *                 .build())
 *             .location(&#34;us-central1-a&#34;)
 *             .osPolicies(OsPolicyAssignmentOsPolicyArgs.builder()
 *                 .allowNoResourceGroupMatch(false)
 *                 .description(&#34;A test os policy&#34;)
 *                 .id(&#34;policy&#34;)
 *                 .mode(&#34;VALIDATION&#34;)
 *                 .resourceGroups(OsPolicyAssignmentOsPolicyResourceGroupArgs.builder()
 *                     .inventoryFilters(OsPolicyAssignmentOsPolicyResourceGroupInventoryFilterArgs.builder()
 *                         .osShortName(&#34;centos&#34;)
 *                         .osVersion(&#34;8.*&#34;)
 *                         .build())
 *                     .resources(                    
 *                         OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.builder()
 *                             .id(&#34;apt-to-yum&#34;)
 *                             .repository(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryArgs.builder()
 *                                 .apt(OsPolicyAssignmentOsPolicyResourceGroupResourceRepositoryAptArgs.builder()
 *                                     .archiveType(&#34;DEB&#34;)
 *                                     .components(&#34;doc&#34;)
 *                                     .distribution(&#34;debian&#34;)
 *                                     .gpgKey(&#34;.gnupg/pubring.kbx&#34;)
 *                                     .uri(&#34;https://atl.mirrors.clouvider.net/debian&#34;)
 *                                     .build())
 *                                 .build())
 *                             .build(),
 *                         OsPolicyAssignmentOsPolicyResourceGroupResourceArgs.builder()
 *                             .exec(OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs.builder()
 *                                 .enforce(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs.builder()
 *                                     .args(&#34;arg1&#34;)
 *                                     .file(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileArgs.builder()
 *                                         .allowInsecure(true)
 *                                         .remote(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceFileRemoteArgs.builder()
 *                                             .sha256Checksum(&#34;c7938fed83afdccbb0e86a2a2e4cad7d5035012ca3214b4a61268393635c3063&#34;)
 *                                             .uri(&#34;https://www.example.com/script.sh&#34;)
 *                                             .build())
 *                                         .build())
 *                                     .interpreter(&#34;SHELL&#34;)
 *                                     .outputFilePath(&#34;$HOME/out&#34;)
 *                                     .build())
 *                                 .validate(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs.builder()
 *                                     .args(&#34;arg1&#34;)
 *                                     .file(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateFileArgs.builder()
 *                                         .localPath(&#34;$HOME/script.sh&#34;)
 *                                         .build())
 *                                     .interpreter(&#34;SHELL&#34;)
 *                                     .outputFilePath(&#34;$HOME/out&#34;)
 *                                     .build())
 *                                 .build())
 *                             .id(&#34;exec1&#34;)
 *                             .build())
 *                     .build())
 *                 .build())
 *             .rollout(OsPolicyAssignmentRolloutArgs.builder()
 *                 .disruptionBudget(OsPolicyAssignmentRolloutDisruptionBudgetArgs.builder()
 *                     .percent(100)
 *                     .build())
 *                 .minWaitDuration(&#34;3s&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * OSPolicyAssignment can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/osPolicyAssignments/{{name}}` * `{{project}}/{{location}}/{{name}}` * `{{location}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import OSPolicyAssignment using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{location}}/osPolicyAssignments/{{name}}&#34;
 * 
 *  to = google_os_config_os_policy_assignment.default }
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/osPolicyAssignment:OsPolicyAssignment When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), OSPolicyAssignment can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/osPolicyAssignment:OsPolicyAssignment default projects/{{project}}/locations/{{location}}/osPolicyAssignments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/osPolicyAssignment:OsPolicyAssignment default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:osconfig/osPolicyAssignment:OsPolicyAssignment default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:osconfig/osPolicyAssignment:OsPolicyAssignment")
public class OsPolicyAssignment extends com.pulumi.resources.CustomResource {
    /**
     * Output only. Indicates that this revision has been successfully
     * rolled out in this zone and new VMs will be assigned OS policies from this
     * revision. For a given OS policy assignment, there is only one revision with
     * a value of `true` for this field.
     * 
     */
    @Export(name="baseline", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> baseline;

    /**
     * @return Output only. Indicates that this revision has been successfully
     * rolled out in this zone and new VMs will be assigned OS policies from this
     * revision. For a given OS policy assignment, there is only one revision with
     * a value of `true` for this field.
     * 
     */
    public Output<Boolean> baseline() {
        return this.baseline;
    }
    /**
     * Output only. Indicates that this revision deletes the OS policy
     * assignment.
     * 
     */
    @Export(name="deleted", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> deleted;

    /**
     * @return Output only. Indicates that this revision deletes the OS policy
     * assignment.
     * 
     */
    public Output<Boolean> deleted() {
        return this.deleted;
    }
    /**
     * OS policy assignment description. Length of the
     * description is limited to 1024 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return OS policy assignment description. Length of the
     * description is limited to 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The etag for this OS policy assignment. If this is provided on
     * update, it must match the server&#39;s etag.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return The etag for this OS policy assignment. If this is provided on
     * update, it must match the server&#39;s etag.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * Filter to select VMs. Structure is
     * documented below.
     * 
     */
    @Export(name="instanceFilter", refs={OsPolicyAssignmentInstanceFilter.class}, tree="[0]")
    private Output<OsPolicyAssignmentInstanceFilter> instanceFilter;

    /**
     * @return Filter to select VMs. Structure is
     * documented below.
     * 
     */
    public Output<OsPolicyAssignmentInstanceFilter> instanceFilter() {
        return this.instanceFilter;
    }
    /**
     * The location for the resource
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * List of OS policies to be applied to the VMs.
     * Structure is documented below.
     * 
     */
    @Export(name="osPolicies", refs={List.class,OsPolicyAssignmentOsPolicy.class}, tree="[0,1]")
    private Output<List<OsPolicyAssignmentOsPolicy>> osPolicies;

    /**
     * @return List of OS policies to be applied to the VMs.
     * Structure is documented below.
     * 
     */
    public Output<List<OsPolicyAssignmentOsPolicy>> osPolicies() {
        return this.osPolicies;
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
     * Output only. Indicates that reconciliation is in progress
     * for the revision. This value is `true` when the `rollout_state` is one of:
     * 
     */
    @Export(name="reconciling", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> reconciling;

    /**
     * @return Output only. Indicates that reconciliation is in progress
     * for the revision. This value is `true` when the `rollout_state` is one of:
     * 
     */
    public Output<Boolean> reconciling() {
        return this.reconciling;
    }
    /**
     * Output only. The timestamp that the revision was
     * created.
     * 
     */
    @Export(name="revisionCreateTime", refs={String.class}, tree="[0]")
    private Output<String> revisionCreateTime;

    /**
     * @return Output only. The timestamp that the revision was
     * created.
     * 
     */
    public Output<String> revisionCreateTime() {
        return this.revisionCreateTime;
    }
    /**
     * Output only. The assignment revision ID A new revision is
     * committed whenever a rollout is triggered for a OS policy assignment
     * 
     */
    @Export(name="revisionId", refs={String.class}, tree="[0]")
    private Output<String> revisionId;

    /**
     * @return Output only. The assignment revision ID A new revision is
     * committed whenever a rollout is triggered for a OS policy assignment
     * 
     */
    public Output<String> revisionId() {
        return this.revisionId;
    }
    /**
     * Rollout to deploy the OS policy assignment. A rollout
     * is triggered in the following situations: 1) OSPolicyAssignment is created.
     * 2) OSPolicyAssignment is updated and the update contains changes to one of
     * the following fields: - instance_filter - os_policies 3) OSPolicyAssignment
     * is deleted. Structure is documented below.
     * 
     */
    @Export(name="rollout", refs={OsPolicyAssignmentRollout.class}, tree="[0]")
    private Output<OsPolicyAssignmentRollout> rollout;

    /**
     * @return Rollout to deploy the OS policy assignment. A rollout
     * is triggered in the following situations: 1) OSPolicyAssignment is created.
     * 2) OSPolicyAssignment is updated and the update contains changes to one of
     * the following fields: - instance_filter - os_policies 3) OSPolicyAssignment
     * is deleted. Structure is documented below.
     * 
     */
    public Output<OsPolicyAssignmentRollout> rollout() {
        return this.rollout;
    }
    /**
     * Output only. OS policy assignment rollout state
     * 
     */
    @Export(name="rolloutState", refs={String.class}, tree="[0]")
    private Output<String> rolloutState;

    /**
     * @return Output only. OS policy assignment rollout state
     * 
     */
    public Output<String> rolloutState() {
        return this.rolloutState;
    }
    /**
     * Set to true to skip awaiting rollout
     * during resource creation and update.
     * 
     */
    @Export(name="skipAwaitRollout", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipAwaitRollout;

    /**
     * @return Set to true to skip awaiting rollout
     * during resource creation and update.
     * 
     */
    public Output<Optional<Boolean>> skipAwaitRollout() {
        return Codegen.optional(this.skipAwaitRollout);
    }
    /**
     * Output only. Server generated unique id for the OS policy assignment
     * resource.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return Output only. Server generated unique id for the OS policy assignment
     * resource.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OsPolicyAssignment(String name) {
        this(name, OsPolicyAssignmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OsPolicyAssignment(String name, OsPolicyAssignmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OsPolicyAssignment(String name, OsPolicyAssignmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/osPolicyAssignment:OsPolicyAssignment", name, args == null ? OsPolicyAssignmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OsPolicyAssignment(String name, Output<String> id, @Nullable OsPolicyAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:osconfig/osPolicyAssignment:OsPolicyAssignment", name, state, makeResourceOptions(options, id));
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
    public static OsPolicyAssignment get(String name, Output<String> id, @Nullable OsPolicyAssignmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OsPolicyAssignment(name, id, state, options);
    }
}
