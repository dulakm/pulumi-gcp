// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsState;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevel;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Replace all existing Access Levels in an Access Policy with the Access Levels provided. This is done atomically.
 * This is a bulk edit of all Access Levels and may override existing Access Levels created by `gcp.accesscontextmanager.AccessLevel`,
 * thus causing a permadiff if used alongside `gcp.accesscontextmanager.AccessLevel` on the same parent.
 * 
 * To get more information about AccessLevels, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.accessLevels)
 * * How-to Guides
 *     * [Access Policy Quickstart](https://cloud.google.com/access-context-manager/docs/quickstart)
 * 
 * ## Example Usage
 * ### Access Context Manager Access Levels Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.accesscontextmanager.AccessPolicy;
 * import com.pulumi.gcp.accesscontextmanager.AccessPolicyArgs;
 * import com.pulumi.gcp.accesscontextmanager.AccessLevels;
 * import com.pulumi.gcp.accesscontextmanager.AccessLevelsArgs;
 * import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelArgs;
 * import com.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelBasicArgs;
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
 *         var access_policy = new AccessPolicy(&#34;access-policy&#34;, AccessPolicyArgs.builder()        
 *             .parent(&#34;organizations/123456789&#34;)
 *             .title(&#34;my policy&#34;)
 *             .build());
 * 
 *         var access_levels = new AccessLevels(&#34;access-levels&#34;, AccessLevelsArgs.builder()        
 *             .accessLevels(            
 *                 AccessLevelsAccessLevelArgs.builder()
 *                     .basic(AccessLevelsAccessLevelBasicArgs.builder()
 *                         .conditions(AccessLevelsAccessLevelBasicConditionArgs.builder()
 *                             .devicePolicy(AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.builder()
 *                                 .osConstraints(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs.builder()
 *                                     .osType(&#34;DESKTOP_CHROME_OS&#34;)
 *                                     .build())
 *                                 .requireScreenLock(true)
 *                                 .build())
 *                             .regions(                            
 *                                 &#34;CH&#34;,
 *                                 &#34;IT&#34;,
 *                                 &#34;US&#34;)
 *                             .build())
 *                         .build())
 *                     .name(access_policy.name().applyValue(name -&gt; String.format(&#34;accessPolicies/%s/accessLevels/chromeos_no_lock&#34;, name)))
 *                     .title(&#34;chromeos_no_lock&#34;)
 *                     .build(),
 *                 AccessLevelsAccessLevelArgs.builder()
 *                     .basic(AccessLevelsAccessLevelBasicArgs.builder()
 *                         .conditions(AccessLevelsAccessLevelBasicConditionArgs.builder()
 *                             .devicePolicy(AccessLevelsAccessLevelBasicConditionDevicePolicyArgs.builder()
 *                                 .osConstraints(AccessLevelsAccessLevelBasicConditionDevicePolicyOsConstraintArgs.builder()
 *                                     .osType(&#34;DESKTOP_MAC&#34;)
 *                                     .build())
 *                                 .requireScreenLock(true)
 *                                 .build())
 *                             .regions(                            
 *                                 &#34;CH&#34;,
 *                                 &#34;IT&#34;,
 *                                 &#34;US&#34;)
 *                             .build())
 *                         .build())
 *                     .name(access_policy.name().applyValue(name -&gt; String.format(&#34;accessPolicies/%s/accessLevels/mac_no_lock&#34;, name)))
 *                     .title(&#34;mac_no_lock&#34;)
 *                     .build())
 *             .parent(access_policy.name().applyValue(name -&gt; String.format(&#34;accessPolicies/%s&#34;, name)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AccessLevels can be imported using any of these accepted formats* `{{parent}}/accessLevels` * `{{parent}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import AccessLevels using one of the formats above. For exampletf import {
 * 
 *  id = &#34;{{parent}}/accessLevels&#34;
 * 
 *  to = google_access_context_manager_access_levels.default }
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevels:AccessLevels When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), AccessLevels can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevels:AccessLevels default {{parent}}/accessLevels
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/accessLevels:AccessLevels default {{parent}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/accessLevels:AccessLevels")
public class AccessLevels extends com.pulumi.resources.CustomResource {
    /**
     * The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    @Export(name="accessLevels", refs={List.class,AccessLevelsAccessLevel.class}, tree="[0,1]")
    private Output</* @Nullable */ List<AccessLevelsAccessLevel>> accessLevels;

    /**
     * @return The desired Access Levels that should replace all existing Access Levels in the Access Policy.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<AccessLevelsAccessLevel>>> accessLevels() {
        return Codegen.optional(this.accessLevels);
    }
    /**
     * The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     * ***
     * 
     */
    @Export(name="parent", refs={String.class}, tree="[0]")
    private Output<String> parent;

    /**
     * @return The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     * ***
     * 
     */
    public Output<String> parent() {
        return this.parent;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AccessLevels(String name) {
        this(name, AccessLevelsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AccessLevels(String name, AccessLevelsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AccessLevels(String name, AccessLevelsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevels:AccessLevels", name, args == null ? AccessLevelsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AccessLevels(String name, Output<String> id, @Nullable AccessLevelsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/accessLevels:AccessLevels", name, state, makeResourceOptions(options, id));
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
    public static AccessLevels get(String name, Output<String> id, @Nullable AccessLevelsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AccessLevels(name, id, state, options);
    }
}
