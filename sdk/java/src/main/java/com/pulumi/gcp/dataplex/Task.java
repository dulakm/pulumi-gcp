// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataplex;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataplex.TaskArgs;
import com.pulumi.gcp.dataplex.inputs.TaskState;
import com.pulumi.gcp.dataplex.outputs.TaskExecutionSpec;
import com.pulumi.gcp.dataplex.outputs.TaskExecutionStatus;
import com.pulumi.gcp.dataplex.outputs.TaskNotebook;
import com.pulumi.gcp.dataplex.outputs.TaskSpark;
import com.pulumi.gcp.dataplex.outputs.TaskTriggerSpec;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Dataplex task represents the work that you want Dataplex to do on a schedule. It encapsulates code, parameters, and the schedule.
 * 
 * To get more information about Task, see:
 * 
 * * [API documentation](https://cloud.google.com/dataplex/docs/reference/rest/v1/projects.locations.lakes.tasks)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dataplex/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Task can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}` * `{{project}}/{{location}}/{{lake}}/{{task_id}}` * `{{location}}/{{lake}}/{{task_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Task using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}&#34;
 * 
 *  to = google_dataplex_task.default }
 * 
 * ```sh
 *  $ pulumi import gcp:dataplex/task:Task When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Task can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataplex/task:Task default projects/{{project}}/locations/{{location}}/lakes/{{lake}}/tasks/{{task_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataplex/task:Task default {{project}}/{{location}}/{{lake}}/{{task_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataplex/task:Task default {{location}}/{{lake}}/{{task_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataplex/task:Task")
public class Task extends com.pulumi.resources.CustomResource {
    /**
     * The time when the task was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the task was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * User-provided description of the task.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return User-provided description of the task.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * User friendly display name.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return User friendly display name.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Configuration for the cluster
     * Structure is documented below.
     * 
     */
    @Export(name="executionSpec", refs={TaskExecutionSpec.class}, tree="[0]")
    private Output<TaskExecutionSpec> executionSpec;

    /**
     * @return Configuration for the cluster
     * Structure is documented below.
     * 
     */
    public Output<TaskExecutionSpec> executionSpec() {
        return this.executionSpec;
    }
    /**
     * Configuration for the cluster
     * Structure is documented below.
     * 
     */
    @Export(name="executionStatuses", refs={List.class,TaskExecutionStatus.class}, tree="[0,1]")
    private Output<List<TaskExecutionStatus>> executionStatuses;

    /**
     * @return Configuration for the cluster
     * Structure is documented below.
     * 
     */
    public Output<List<TaskExecutionStatus>> executionStatuses() {
        return this.executionStatuses;
    }
    /**
     * User-defined labels for the task.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return User-defined labels for the task.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The lake in which the task will be created in.
     * 
     */
    @Export(name="lake", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lake;

    /**
     * @return The lake in which the task will be created in.
     * 
     */
    public Output<Optional<String>> lake() {
        return Codegen.optional(this.lake);
    }
    /**
     * The location in which the task will be created in.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> location;

    /**
     * @return The location in which the task will be created in.
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * (Output)
     * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return (Output)
     * The relative resource name of the job, of the form: projects/{project_number}/locations/{locationId}/lakes/{lakeId}/tasks/{taskId}/jobs/{jobId}.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    @Export(name="notebook", refs={TaskNotebook.class}, tree="[0]")
    private Output</* @Nullable */ TaskNotebook> notebook;

    /**
     * @return A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    public Output<Optional<TaskNotebook>> notebook() {
        return Codegen.optional(this.notebook);
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    @Export(name="spark", refs={TaskSpark.class}, tree="[0]")
    private Output</* @Nullable */ TaskSpark> spark;

    /**
     * @return A service with manual scaling runs continuously, allowing you to perform complex initialization and rely on the state of its memory over time.
     * Structure is documented below.
     * 
     */
    public Output<Optional<TaskSpark>> spark() {
        return Codegen.optional(this.spark);
    }
    /**
     * (Output)
     * Execution state for the job.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return (Output)
     * Execution state for the job.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The task Id of the task.
     * 
     */
    @Export(name="taskId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> taskId;

    /**
     * @return The task Id of the task.
     * 
     */
    public Output<Optional<String>> taskId() {
        return Codegen.optional(this.taskId);
    }
    /**
     * Configuration for the cluster
     * Structure is documented below.
     * 
     */
    @Export(name="triggerSpec", refs={TaskTriggerSpec.class}, tree="[0]")
    private Output<TaskTriggerSpec> triggerSpec;

    /**
     * @return Configuration for the cluster
     * Structure is documented below.
     * 
     */
    public Output<TaskTriggerSpec> triggerSpec() {
        return this.triggerSpec;
    }
    /**
     * (Output)
     * System generated globally unique ID for the job.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return (Output)
     * System generated globally unique ID for the job.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }
    /**
     * (Output)
     * Last update time of the status.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return (Output)
     * Last update time of the status.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Task(String name) {
        this(name, TaskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Task(String name, TaskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Task(String name, TaskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataplex/task:Task", name, args == null ? TaskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Task(String name, Output<String> id, @Nullable TaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataplex/task:Task", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
            ))
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
    public static Task get(String name, Output<String> id, @Nullable TaskState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Task(name, id, state, options);
    }
}
