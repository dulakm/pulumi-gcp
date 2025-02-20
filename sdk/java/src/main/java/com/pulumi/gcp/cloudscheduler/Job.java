// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudscheduler;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.cloudscheduler.JobArgs;
import com.pulumi.gcp.cloudscheduler.inputs.JobState;
import com.pulumi.gcp.cloudscheduler.outputs.JobAppEngineHttpTarget;
import com.pulumi.gcp.cloudscheduler.outputs.JobHttpTarget;
import com.pulumi.gcp.cloudscheduler.outputs.JobPubsubTarget;
import com.pulumi.gcp.cloudscheduler.outputs.JobRetryConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A scheduled job that can publish a PubSub message or an HTTP request
 * every X interval of time, using a crontab format string.
 * 
 * To get more information about Job, see:
 * 
 * * [API documentation](https://cloud.google.com/scheduler/docs/reference/rest/)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/scheduler/)
 * 
 * ## Example Usage
 * ### Scheduler Job App Engine
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.cloudscheduler.Job;
 * import com.pulumi.gcp.cloudscheduler.JobArgs;
 * import com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetArgs;
 * import com.pulumi.gcp.cloudscheduler.inputs.JobAppEngineHttpTargetAppEngineRoutingArgs;
 * import com.pulumi.gcp.cloudscheduler.inputs.JobRetryConfigArgs;
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
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .appEngineHttpTarget(JobAppEngineHttpTargetArgs.builder()
 *                 .appEngineRouting(JobAppEngineHttpTargetAppEngineRoutingArgs.builder()
 *                     .instance(&#34;my-instance-001&#34;)
 *                     .service(&#34;web&#34;)
 *                     .version(&#34;prod&#34;)
 *                     .build())
 *                 .httpMethod(&#34;POST&#34;)
 *                 .relativeUri(&#34;/ping&#34;)
 *                 .build())
 *             .attemptDeadline(&#34;320s&#34;)
 *             .description(&#34;test app engine job&#34;)
 *             .retryConfig(JobRetryConfigArgs.builder()
 *                 .maxDoublings(2)
 *                 .maxRetryDuration(&#34;10s&#34;)
 *                 .minBackoffDuration(&#34;1s&#34;)
 *                 .retryCount(3)
 *                 .build())
 *             .schedule(&#34;*{@literal /}4 * * * *&#34;)
 *             .timeZone(&#34;Europe/London&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Scheduler Job Oauth
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ComputeFunctions;
 * import com.pulumi.gcp.compute.inputs.GetDefaultServiceAccountArgs;
 * import com.pulumi.gcp.cloudscheduler.Job;
 * import com.pulumi.gcp.cloudscheduler.JobArgs;
 * import com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs;
 * import com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOauthTokenArgs;
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
 *         final var default = ComputeFunctions.getDefaultServiceAccount();
 * 
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .description(&#34;test http job&#34;)
 *             .schedule(&#34;*{@literal /}8 * * * *&#34;)
 *             .timeZone(&#34;America/New_York&#34;)
 *             .attemptDeadline(&#34;320s&#34;)
 *             .httpTarget(JobHttpTargetArgs.builder()
 *                 .httpMethod(&#34;GET&#34;)
 *                 .uri(&#34;https://cloudscheduler.googleapis.com/v1/projects/my-project-name/locations/us-west1/jobs&#34;)
 *                 .oauthToken(JobHttpTargetOauthTokenArgs.builder()
 *                     .serviceAccountEmail(default_.email())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Scheduler Job Oidc
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.ComputeFunctions;
 * import com.pulumi.gcp.compute.inputs.GetDefaultServiceAccountArgs;
 * import com.pulumi.gcp.cloudscheduler.Job;
 * import com.pulumi.gcp.cloudscheduler.JobArgs;
 * import com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetArgs;
 * import com.pulumi.gcp.cloudscheduler.inputs.JobHttpTargetOidcTokenArgs;
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
 *         final var default = ComputeFunctions.getDefaultServiceAccount();
 * 
 *         var job = new Job(&#34;job&#34;, JobArgs.builder()        
 *             .description(&#34;test http job&#34;)
 *             .schedule(&#34;*{@literal /}8 * * * *&#34;)
 *             .timeZone(&#34;America/New_York&#34;)
 *             .attemptDeadline(&#34;320s&#34;)
 *             .httpTarget(JobHttpTargetArgs.builder()
 *                 .httpMethod(&#34;GET&#34;)
 *                 .uri(&#34;https://example.com/ping&#34;)
 *                 .oidcToken(JobHttpTargetOidcTokenArgs.builder()
 *                     .serviceAccountEmail(default_.email())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Job can be imported using any of these accepted formats* `projects/{{project}}/locations/{{region}}/jobs/{{name}}` * `{{project}}/{{region}}/{{name}}` * `{{region}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Job using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{region}}/jobs/{{name}}&#34;
 * 
 *  to = google_cloud_scheduler_job.default }
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Job can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job default projects/{{project}}/locations/{{region}}/jobs/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudscheduler/job:Job default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudscheduler/job:Job")
public class Job extends com.pulumi.resources.CustomResource {
    /**
     * App Engine HTTP target.
     * If the job providers a App Engine HTTP target the cron will
     * send a request to the service instance
     * Structure is documented below.
     * 
     */
    @Export(name="appEngineHttpTarget", refs={JobAppEngineHttpTarget.class}, tree="[0]")
    private Output</* @Nullable */ JobAppEngineHttpTarget> appEngineHttpTarget;

    /**
     * @return App Engine HTTP target.
     * If the job providers a App Engine HTTP target the cron will
     * send a request to the service instance
     * Structure is documented below.
     * 
     */
    public Output<Optional<JobAppEngineHttpTarget>> appEngineHttpTarget() {
        return Codegen.optional(this.appEngineHttpTarget);
    }
    /**
     * The deadline for job attempts. If the request handler does not respond by this deadline then the request is
     * cancelled and the attempt is marked as a DEADLINE_EXCEEDED failure. The failed attempt can be viewed in
     * execution logs. Cloud Scheduler will retry the job according to the RetryConfig.
     * The allowed duration for this deadline is:
     * * For HTTP targets, between 15 seconds and 30 minutes.
     * * For App Engine HTTP targets, between 15 seconds and 24 hours.
     * * **Note**: For PubSub targets, this field is ignored - setting it will introduce an unresolvable diff.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;
     * 
     */
    @Export(name="attemptDeadline", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> attemptDeadline;

    /**
     * @return The deadline for job attempts. If the request handler does not respond by this deadline then the request is
     * cancelled and the attempt is marked as a DEADLINE_EXCEEDED failure. The failed attempt can be viewed in
     * execution logs. Cloud Scheduler will retry the job according to the RetryConfig.
     * The allowed duration for this deadline is:
     * * For HTTP targets, between 15 seconds and 30 minutes.
     * * For App Engine HTTP targets, between 15 seconds and 24 hours.
     * * **Note**: For PubSub targets, this field is ignored - setting it will introduce an unresolvable diff.
     *   A duration in seconds with up to nine fractional digits, terminated by &#39;s&#39;. Example: &#34;3.5s&#34;
     * 
     */
    public Output<Optional<String>> attemptDeadline() {
        return Codegen.optional(this.attemptDeadline);
    }
    /**
     * A human-readable description for the job.
     * This string must not contain more than 500 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description for the job.
     * This string must not contain more than 500 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * HTTP target.
     * If the job providers a http_target the cron will
     * send a request to the targeted url
     * Structure is documented below.
     * 
     */
    @Export(name="httpTarget", refs={JobHttpTarget.class}, tree="[0]")
    private Output</* @Nullable */ JobHttpTarget> httpTarget;

    /**
     * @return HTTP target.
     * If the job providers a http_target the cron will
     * send a request to the targeted url
     * Structure is documented below.
     * 
     */
    public Output<Optional<JobHttpTarget>> httpTarget() {
        return Codegen.optional(this.httpTarget);
    }
    /**
     * The name of the job.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the job.
     * 
     * ***
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Sets the job to a paused state. Jobs default to being enabled when this property is not set.
     * 
     */
    @Export(name="paused", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> paused;

    /**
     * @return Sets the job to a paused state. Jobs default to being enabled when this property is not set.
     * 
     */
    public Output<Boolean> paused() {
        return this.paused;
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
     * Pub/Sub target
     * If the job providers a Pub/Sub target the cron will publish
     * a message to the provided topic
     * Structure is documented below.
     * 
     */
    @Export(name="pubsubTarget", refs={JobPubsubTarget.class}, tree="[0]")
    private Output</* @Nullable */ JobPubsubTarget> pubsubTarget;

    /**
     * @return Pub/Sub target
     * If the job providers a Pub/Sub target the cron will publish
     * a message to the provided topic
     * Structure is documented below.
     * 
     */
    public Output<Optional<JobPubsubTarget>> pubsubTarget() {
        return Codegen.optional(this.pubsubTarget);
    }
    /**
     * Region where the scheduler job resides. If it is not provided, this provider will use the provider default.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return Region where the scheduler job resides. If it is not provided, this provider will use the provider default.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * By default, if a job does not complete successfully,
     * meaning that an acknowledgement is not received from the handler,
     * then it will be retried with exponential backoff according to the settings
     * Structure is documented below.
     * 
     */
    @Export(name="retryConfig", refs={JobRetryConfig.class}, tree="[0]")
    private Output</* @Nullable */ JobRetryConfig> retryConfig;

    /**
     * @return By default, if a job does not complete successfully,
     * meaning that an acknowledgement is not received from the handler,
     * then it will be retried with exponential backoff according to the settings
     * Structure is documented below.
     * 
     */
    public Output<Optional<JobRetryConfig>> retryConfig() {
        return Codegen.optional(this.retryConfig);
    }
    /**
     * Describes the schedule on which the job will be executed.
     * 
     */
    @Export(name="schedule", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> schedule;

    /**
     * @return Describes the schedule on which the job will be executed.
     * 
     */
    public Output<Optional<String>> schedule() {
        return Codegen.optional(this.schedule);
    }
    /**
     * State of the job.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return State of the job.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Specifies the time zone to be used in interpreting schedule.
     * The value of this field must be a time zone name from the tz database.
     * 
     */
    @Export(name="timeZone", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> timeZone;

    /**
     * @return Specifies the time zone to be used in interpreting schedule.
     * The value of this field must be a time zone name from the tz database.
     * 
     */
    public Output<Optional<String>> timeZone() {
        return Codegen.optional(this.timeZone);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Job(String name) {
        this(name, JobArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Job(String name, @Nullable JobArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Job(String name, @Nullable JobArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudscheduler/job:Job", name, args == null ? JobArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Job(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudscheduler/job:Job", name, state, makeResourceOptions(options, id));
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
    public static Job get(String name, Output<String> id, @Nullable JobState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Job(name, id, state, options);
    }
}
