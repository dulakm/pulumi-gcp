// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.bigquery.AppProfileArgs;
import com.pulumi.gcp.bigquery.inputs.AppProfileState;
import com.pulumi.gcp.bigquery.outputs.AppProfileSingleClusterRouting;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * App profile is a configuration object describing how Cloud Bigtable should treat traffic from a particular end user application.
 * 
 * To get more information about AppProfile, see:
 * 
 * * [API documentation](https://cloud.google.com/bigtable/docs/reference/admin/rest/v2/projects.instances.appProfiles)
 * 
 * ## Example Usage
 * ### Bigtable App Profile Anycluster
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
 * import com.pulumi.gcp.bigquery.AppProfile;
 * import com.pulumi.gcp.bigquery.AppProfileArgs;
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
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .clusters(            
 *                 InstanceClusterArgs.builder()
 *                     .clusterId(&#34;cluster-1&#34;)
 *                     .zone(&#34;us-central1-a&#34;)
 *                     .numNodes(3)
 *                     .storageType(&#34;HDD&#34;)
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId(&#34;cluster-2&#34;)
 *                     .zone(&#34;us-central1-b&#34;)
 *                     .numNodes(3)
 *                     .storageType(&#34;HDD&#34;)
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId(&#34;cluster-3&#34;)
 *                     .zone(&#34;us-central1-c&#34;)
 *                     .numNodes(3)
 *                     .storageType(&#34;HDD&#34;)
 *                     .build())
 *             .deletionProtection(&#34;true&#34;)
 *             .build());
 * 
 *         var ap = new AppProfile(&#34;ap&#34;, AppProfileArgs.builder()        
 *             .instance(instance.name())
 *             .appProfileId(&#34;bt-profile&#34;)
 *             .multiClusterRoutingUseAny(true)
 *             .ignoreWarnings(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Bigtable App Profile Singlecluster
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
 * import com.pulumi.gcp.bigquery.AppProfile;
 * import com.pulumi.gcp.bigquery.AppProfileArgs;
 * import com.pulumi.gcp.bigquery.inputs.AppProfileSingleClusterRoutingArgs;
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
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .clusters(InstanceClusterArgs.builder()
 *                 .clusterId(&#34;cluster-1&#34;)
 *                 .zone(&#34;us-central1-b&#34;)
 *                 .numNodes(3)
 *                 .storageType(&#34;HDD&#34;)
 *                 .build())
 *             .deletionProtection(&#34;true&#34;)
 *             .build());
 * 
 *         var ap = new AppProfile(&#34;ap&#34;, AppProfileArgs.builder()        
 *             .instance(instance.name())
 *             .appProfileId(&#34;bt-profile&#34;)
 *             .singleClusterRouting(AppProfileSingleClusterRoutingArgs.builder()
 *                 .clusterId(&#34;cluster-1&#34;)
 *                 .allowTransactionalWrites(true)
 *                 .build())
 *             .ignoreWarnings(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Bigtable App Profile Multicluster
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.bigtable.Instance;
 * import com.pulumi.gcp.bigtable.InstanceArgs;
 * import com.pulumi.gcp.bigtable.inputs.InstanceClusterArgs;
 * import com.pulumi.gcp.bigquery.AppProfile;
 * import com.pulumi.gcp.bigquery.AppProfileArgs;
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
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .clusters(            
 *                 InstanceClusterArgs.builder()
 *                     .clusterId(&#34;cluster-1&#34;)
 *                     .zone(&#34;us-central1-a&#34;)
 *                     .numNodes(3)
 *                     .storageType(&#34;HDD&#34;)
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId(&#34;cluster-2&#34;)
 *                     .zone(&#34;us-central1-b&#34;)
 *                     .numNodes(3)
 *                     .storageType(&#34;HDD&#34;)
 *                     .build(),
 *                 InstanceClusterArgs.builder()
 *                     .clusterId(&#34;cluster-3&#34;)
 *                     .zone(&#34;us-central1-c&#34;)
 *                     .numNodes(3)
 *                     .storageType(&#34;HDD&#34;)
 *                     .build())
 *             .deletionProtection(&#34;true&#34;)
 *             .build());
 * 
 *         var ap = new AppProfile(&#34;ap&#34;, AppProfileArgs.builder()        
 *             .instance(instance.name())
 *             .appProfileId(&#34;bt-profile&#34;)
 *             .multiClusterRoutingUseAny(true)
 *             .multiClusterRoutingClusterIds(            
 *                 &#34;cluster-1&#34;,
 *                 &#34;cluster-2&#34;)
 *             .ignoreWarnings(true)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * AppProfile can be imported using any of these accepted formats* `projects/{{project}}/instances/{{instance}}/appProfiles/{{app_profile_id}}` * `{{project}}/{{instance}}/{{app_profile_id}}` * `{{instance}}/{{app_profile_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import AppProfile using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/instances/{{instance}}/appProfiles/{{app_profile_id}}&#34;
 * 
 *  to = google_bigtable_app_profile.default }
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/appProfile:AppProfile When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), AppProfile can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/appProfile:AppProfile default projects/{{project}}/instances/{{instance}}/appProfiles/{{app_profile_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/appProfile:AppProfile default {{project}}/{{instance}}/{{app_profile_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:bigquery/appProfile:AppProfile default {{instance}}/{{app_profile_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:bigquery/appProfile:AppProfile")
public class AppProfile extends com.pulumi.resources.CustomResource {
    /**
     * The unique name of the app profile in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     * 
     * ***
     * 
     */
    @Export(name="appProfileId", refs={String.class}, tree="[0]")
    private Output<String> appProfileId;

    /**
     * @return The unique name of the app profile in the form `[_a-zA-Z0-9][-_.a-zA-Z0-9]*`.
     * 
     * ***
     * 
     */
    public Output<String> appProfileId() {
        return this.appProfileId;
    }
    /**
     * Long form description of the use case for this app profile.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Long form description of the use case for this app profile.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * If true, ignore safety checks when deleting/updating the app profile.
     * 
     */
    @Export(name="ignoreWarnings", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> ignoreWarnings;

    /**
     * @return If true, ignore safety checks when deleting/updating the app profile.
     * 
     */
    public Output<Optional<Boolean>> ignoreWarnings() {
        return Codegen.optional(this.ignoreWarnings);
    }
    /**
     * The name of the instance to create the app profile within.
     * 
     */
    @Export(name="instance", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> instance;

    /**
     * @return The name of the instance to create the app profile within.
     * 
     */
    public Output<Optional<String>> instance() {
        return Codegen.optional(this.instance);
    }
    /**
     * The set of clusters to route to. The order is ignored; clusters will be tried in order of distance. If left empty, all
     * clusters are eligible.
     * 
     */
    @Export(name="multiClusterRoutingClusterIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> multiClusterRoutingClusterIds;

    /**
     * @return The set of clusters to route to. The order is ignored; clusters will be tried in order of distance. If left empty, all
     * clusters are eligible.
     * 
     */
    public Output<Optional<List<String>>> multiClusterRoutingClusterIds() {
        return Codegen.optional(this.multiClusterRoutingClusterIds);
    }
    /**
     * If true, read/write requests are routed to the nearest cluster in the instance, and will fail over to the nearest cluster that is available
     * in the event of transient errors or delays. Clusters in a region are considered equidistant. Choosing this option sacrifices read-your-writes
     * consistency to improve availability.
     * 
     */
    @Export(name="multiClusterRoutingUseAny", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> multiClusterRoutingUseAny;

    /**
     * @return If true, read/write requests are routed to the nearest cluster in the instance, and will fail over to the nearest cluster that is available
     * in the event of transient errors or delays. Clusters in a region are considered equidistant. Choosing this option sacrifices read-your-writes
     * consistency to improve availability.
     * 
     */
    public Output<Optional<Boolean>> multiClusterRoutingUseAny() {
        return Codegen.optional(this.multiClusterRoutingUseAny);
    }
    /**
     * The unique name of the requested app profile. Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/appProfiles/&lt;appProfileId&gt;`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The unique name of the requested app profile. Values are of the form `projects/&lt;project&gt;/instances/&lt;instance&gt;/appProfiles/&lt;appProfileId&gt;`.
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
     * Use a single-cluster routing policy.
     * Structure is documented below.
     * 
     */
    @Export(name="singleClusterRouting", refs={AppProfileSingleClusterRouting.class}, tree="[0]")
    private Output</* @Nullable */ AppProfileSingleClusterRouting> singleClusterRouting;

    /**
     * @return Use a single-cluster routing policy.
     * Structure is documented below.
     * 
     */
    public Output<Optional<AppProfileSingleClusterRouting>> singleClusterRouting() {
        return Codegen.optional(this.singleClusterRouting);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AppProfile(String name) {
        this(name, AppProfileArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AppProfile(String name, AppProfileArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AppProfile(String name, AppProfileArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/appProfile:AppProfile", name, args == null ? AppProfileArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AppProfile(String name, Output<String> id, @Nullable AppProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:bigquery/appProfile:AppProfile", name, state, makeResourceOptions(options, id));
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
    public static AppProfile get(String name, Output<String> id, @Nullable AppProfileState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AppProfile(name, id, state, options);
    }
}
