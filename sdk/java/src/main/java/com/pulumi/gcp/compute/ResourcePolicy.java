// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.ResourcePolicyArgs;
import com.pulumi.gcp.compute.inputs.ResourcePolicyState;
import com.pulumi.gcp.compute.outputs.ResourcePolicyDiskConsistencyGroupPolicy;
import com.pulumi.gcp.compute.outputs.ResourcePolicyGroupPlacementPolicy;
import com.pulumi.gcp.compute.outputs.ResourcePolicyInstanceSchedulePolicy;
import com.pulumi.gcp.compute.outputs.ResourcePolicySnapshotSchedulePolicy;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A policy that can be attached to a resource to specify or schedule actions on that resource.
 * 
 * To get more information about ResourcePolicy, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/resourcePolicies)
 * 
 * ## Example Usage
 * ### Resource Policy Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ResourcePolicy;
 * import com.pulumi.gcp.compute.ResourcePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs;
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
 *         var foo = new ResourcePolicy(&#34;foo&#34;, ResourcePolicyArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .snapshotSchedulePolicy(ResourcePolicySnapshotSchedulePolicyArgs.builder()
 *                 .schedule(ResourcePolicySnapshotSchedulePolicyScheduleArgs.builder()
 *                     .dailySchedule(ResourcePolicySnapshotSchedulePolicyScheduleDailyScheduleArgs.builder()
 *                         .daysInCycle(1)
 *                         .startTime(&#34;04:00&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Resource Policy Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ResourcePolicy;
 * import com.pulumi.gcp.compute.ResourcePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs;
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
 *         var bar = new ResourcePolicy(&#34;bar&#34;, ResourcePolicyArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .snapshotSchedulePolicy(ResourcePolicySnapshotSchedulePolicyArgs.builder()
 *                 .retentionPolicy(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs.builder()
 *                     .maxRetentionDays(10)
 *                     .onSourceDiskDelete(&#34;KEEP_AUTO_SNAPSHOTS&#34;)
 *                     .build())
 *                 .schedule(ResourcePolicySnapshotSchedulePolicyScheduleArgs.builder()
 *                     .hourlySchedule(ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs.builder()
 *                         .hoursInCycle(20)
 *                         .startTime(&#34;23:00&#34;)
 *                         .build())
 *                     .build())
 *                 .snapshotProperties(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs.builder()
 *                     .guestFlush(true)
 *                     .labels(Map.of(&#34;myLabel&#34;, &#34;value&#34;))
 *                     .storageLocations(&#34;us&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Resource Policy Placement Policy
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ResourcePolicy;
 * import com.pulumi.gcp.compute.ResourcePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicyGroupPlacementPolicyArgs;
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
 *         var baz = new ResourcePolicy(&#34;baz&#34;, ResourcePolicyArgs.builder()        
 *             .groupPlacementPolicy(ResourcePolicyGroupPlacementPolicyArgs.builder()
 *                 .collocation(&#34;COLLOCATED&#34;)
 *                 .vmCount(2)
 *                 .build())
 *             .region(&#34;us-central1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Resource Policy Placement Policy Max Distance
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ResourcePolicy;
 * import com.pulumi.gcp.compute.ResourcePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicyGroupPlacementPolicyArgs;
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
 *         var baz = new ResourcePolicy(&#34;baz&#34;, ResourcePolicyArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .groupPlacementPolicy(ResourcePolicyGroupPlacementPolicyArgs.builder()
 *                 .vmCount(2)
 *                 .collocation(&#34;COLLOCATED&#34;)
 *                 .maxDistance(2)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Resource Policy Instance Schedule Policy
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ResourcePolicy;
 * import com.pulumi.gcp.compute.ResourcePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyVmStartScheduleArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs;
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
 *         var hourly = new ResourcePolicy(&#34;hourly&#34;, ResourcePolicyArgs.builder()        
 *             .description(&#34;Start and stop instances&#34;)
 *             .instanceSchedulePolicy(ResourcePolicyInstanceSchedulePolicyArgs.builder()
 *                 .timeZone(&#34;US/Central&#34;)
 *                 .vmStartSchedule(ResourcePolicyInstanceSchedulePolicyVmStartScheduleArgs.builder()
 *                     .schedule(&#34;0 * * * *&#34;)
 *                     .build())
 *                 .vmStopSchedule(ResourcePolicyInstanceSchedulePolicyVmStopScheduleArgs.builder()
 *                     .schedule(&#34;15 * * * *&#34;)
 *                     .build())
 *                 .build())
 *             .region(&#34;us-central1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Resource Policy Snapshot Schedule Chain Name
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ResourcePolicy;
 * import com.pulumi.gcp.compute.ResourcePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs;
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
 *         var hourly = new ResourcePolicy(&#34;hourly&#34;, ResourcePolicyArgs.builder()        
 *             .description(&#34;chain name snapshot&#34;)
 *             .region(&#34;us-central1&#34;)
 *             .snapshotSchedulePolicy(ResourcePolicySnapshotSchedulePolicyArgs.builder()
 *                 .retentionPolicy(ResourcePolicySnapshotSchedulePolicyRetentionPolicyArgs.builder()
 *                     .maxRetentionDays(14)
 *                     .onSourceDiskDelete(&#34;KEEP_AUTO_SNAPSHOTS&#34;)
 *                     .build())
 *                 .schedule(ResourcePolicySnapshotSchedulePolicyScheduleArgs.builder()
 *                     .hourlySchedule(ResourcePolicySnapshotSchedulePolicyScheduleHourlyScheduleArgs.builder()
 *                         .hoursInCycle(20)
 *                         .startTime(&#34;23:00&#34;)
 *                         .build())
 *                     .build())
 *                 .snapshotProperties(ResourcePolicySnapshotSchedulePolicySnapshotPropertiesArgs.builder()
 *                     .chainName(&#34;test-schedule-chain-name&#34;)
 *                     .guestFlush(true)
 *                     .labels(Map.of(&#34;myLabel&#34;, &#34;value&#34;))
 *                     .storageLocations(&#34;us&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Resource Policy Consistency Group
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ResourcePolicy;
 * import com.pulumi.gcp.compute.ResourcePolicyArgs;
 * import com.pulumi.gcp.compute.inputs.ResourcePolicyDiskConsistencyGroupPolicyArgs;
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
 *         var cgroup = new ResourcePolicy(&#34;cgroup&#34;, ResourcePolicyArgs.builder()        
 *             .diskConsistencyGroupPolicy(ResourcePolicyDiskConsistencyGroupPolicyArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .region(&#34;europe-west1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * ResourcePolicy can be imported using any of these accepted formats* `projects/{{project}}/regions/{{region}}/resourcePolicies/{{name}}` * `{{project}}/{{region}}/{{name}}` * `{{region}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import ResourcePolicy using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/regions/{{region}}/resourcePolicies/{{name}}&#34;
 * 
 *  to = google_compute_resource_policy.default }
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), ResourcePolicy can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy default projects/{{project}}/regions/{{region}}/resourcePolicies/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/resourcePolicy:ResourcePolicy default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/resourcePolicy:ResourcePolicy")
public class ResourcePolicy extends com.pulumi.resources.CustomResource {
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Replication consistency group for asynchronous disk replication.
     * Structure is documented below.
     * 
     */
    @Export(name="diskConsistencyGroupPolicy", refs={ResourcePolicyDiskConsistencyGroupPolicy.class}, tree="[0]")
    private Output</* @Nullable */ ResourcePolicyDiskConsistencyGroupPolicy> diskConsistencyGroupPolicy;

    /**
     * @return Replication consistency group for asynchronous disk replication.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ResourcePolicyDiskConsistencyGroupPolicy>> diskConsistencyGroupPolicy() {
        return Codegen.optional(this.diskConsistencyGroupPolicy);
    }
    /**
     * Resource policy for instances used for placement configuration.
     * Structure is documented below.
     * 
     */
    @Export(name="groupPlacementPolicy", refs={ResourcePolicyGroupPlacementPolicy.class}, tree="[0]")
    private Output</* @Nullable */ ResourcePolicyGroupPlacementPolicy> groupPlacementPolicy;

    /**
     * @return Resource policy for instances used for placement configuration.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ResourcePolicyGroupPlacementPolicy>> groupPlacementPolicy() {
        return Codegen.optional(this.groupPlacementPolicy);
    }
    /**
     * Resource policy for scheduling instance operations.
     * Structure is documented below.
     * 
     */
    @Export(name="instanceSchedulePolicy", refs={ResourcePolicyInstanceSchedulePolicy.class}, tree="[0]")
    private Output</* @Nullable */ ResourcePolicyInstanceSchedulePolicy> instanceSchedulePolicy;

    /**
     * @return Resource policy for scheduling instance operations.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ResourcePolicyInstanceSchedulePolicy>> instanceSchedulePolicy() {
        return Codegen.optional(this.instanceSchedulePolicy);
    }
    /**
     * The name of the resource, provided by the client when initially creating
     * the resource. The resource name must be 1-63 characters long, and comply
     * with RFC1035. Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z`? which means the
     * first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character,
     * which cannot be a dash.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the resource, provided by the client when initially creating
     * the resource. The resource name must be 1-63 characters long, and comply
     * with RFC1035. Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z`? which means the
     * first character must be a lowercase letter, and all following characters
     * must be a dash, lowercase letter, or digit, except the last character,
     * which cannot be a dash.
     * 
     * ***
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
     * Region where resource policy resides.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region where resource policy resides.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Policy for creating snapshots of persistent disks.
     * Structure is documented below.
     * 
     */
    @Export(name="snapshotSchedulePolicy", refs={ResourcePolicySnapshotSchedulePolicy.class}, tree="[0]")
    private Output</* @Nullable */ ResourcePolicySnapshotSchedulePolicy> snapshotSchedulePolicy;

    /**
     * @return Policy for creating snapshots of persistent disks.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ResourcePolicySnapshotSchedulePolicy>> snapshotSchedulePolicy() {
        return Codegen.optional(this.snapshotSchedulePolicy);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourcePolicy(String name) {
        this(name, ResourcePolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourcePolicy(String name, @Nullable ResourcePolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourcePolicy(String name, @Nullable ResourcePolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/resourcePolicy:ResourcePolicy", name, args == null ? ResourcePolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourcePolicy(String name, Output<String> id, @Nullable ResourcePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/resourcePolicy:ResourcePolicy", name, state, makeResourceOptions(options, id));
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
    public static ResourcePolicy get(String name, Output<String> id, @Nullable ResourcePolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourcePolicy(name, id, state, options);
    }
}
