// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firestore;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.firestore.BackupScheduleArgs;
import com.pulumi.gcp.firestore.inputs.BackupScheduleState;
import com.pulumi.gcp.firestore.outputs.BackupScheduleDailyRecurrence;
import com.pulumi.gcp.firestore.outputs.BackupScheduleWeeklyRecurrence;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A backup schedule for a Cloud Firestore Database.
 * This resource is owned by the database it is backing up, and is deleted along with the database.
 * The actual backups are not though.
 * 
 * To get more information about BackupSchedule, see:
 * 
 * * [API documentation](https://cloud.google.com/firestore/docs/reference/rest/v1/projects.databases.backupSchedules)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/firestore/docs/backups)
 * 
 * &gt; **Warning:** This resource creates a Firestore Backup Schedule on a project that already has
 * a Firestore database.
 * This resource is owned by the database it is backing up, and is deleted along
 * with the database. The actual backups are not though.
 * 
 * ## Example Usage
 * ### Firestore Backup Schedule Daily
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firestore.BackupSchedule;
 * import com.pulumi.gcp.firestore.BackupScheduleArgs;
 * import com.pulumi.gcp.firestore.inputs.BackupScheduleDailyRecurrenceArgs;
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
 *         var daily_backup = new BackupSchedule(&#34;daily-backup&#34;, BackupScheduleArgs.builder()        
 *             .dailyRecurrence()
 *             .project(&#34;my-project-name&#34;)
 *             .retention(&#34;604800s&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Firestore Backup Schedule Weekly
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.firestore.BackupSchedule;
 * import com.pulumi.gcp.firestore.BackupScheduleArgs;
 * import com.pulumi.gcp.firestore.inputs.BackupScheduleWeeklyRecurrenceArgs;
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
 *         var weekly_backup = new BackupSchedule(&#34;weekly-backup&#34;, BackupScheduleArgs.builder()        
 *             .database(&#34;(default)&#34;)
 *             .project(&#34;my-project-name&#34;)
 *             .retention(&#34;8467200s&#34;)
 *             .weeklyRecurrence(BackupScheduleWeeklyRecurrenceArgs.builder()
 *                 .day(&#34;SUNDAY&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * BackupSchedule can be imported using any of these accepted formats* `projects/{{project}}/databases/{{database}}/backupSchedules/{{name}}` * `{{project}}/{{database}}/{{name}}` * `{{database}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import BackupSchedule using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/databases/{{database}}/backupSchedules/{{name}}&#34;
 * 
 *  to = google_firestore_backup_schedule.default }
 * 
 * ```sh
 *  $ pulumi import gcp:firestore/backupSchedule:BackupSchedule When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), BackupSchedule can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firestore/backupSchedule:BackupSchedule default projects/{{project}}/databases/{{database}}/backupSchedules/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firestore/backupSchedule:BackupSchedule default {{project}}/{{database}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:firestore/backupSchedule:BackupSchedule default {{database}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:firestore/backupSchedule:BackupSchedule")
public class BackupSchedule extends com.pulumi.resources.CustomResource {
    /**
     * For a schedule that runs daily at a specified time.
     * 
     */
    @Export(name="dailyRecurrence", refs={BackupScheduleDailyRecurrence.class}, tree="[0]")
    private Output</* @Nullable */ BackupScheduleDailyRecurrence> dailyRecurrence;

    /**
     * @return For a schedule that runs daily at a specified time.
     * 
     */
    public Output<Optional<BackupScheduleDailyRecurrence>> dailyRecurrence() {
        return Codegen.optional(this.dailyRecurrence);
    }
    /**
     * The Firestore database id. Defaults to `&#34;(default)&#34;`.
     * 
     */
    @Export(name="database", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> database;

    /**
     * @return The Firestore database id. Defaults to `&#34;(default)&#34;`.
     * 
     */
    public Output<Optional<String>> database() {
        return Codegen.optional(this.database);
    }
    /**
     * The unique backup schedule identifier across all locations and databases for the given project. Format:
     * `projects/{{project}}/databases/{{database}}/backupSchedules/{{backupSchedule}}
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The unique backup schedule identifier across all locations and databases for the given project. Format:
     * `projects/{{project}}/databases/{{database}}/backupSchedules/{{backupSchedule}}
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
     * At what relative time in the future, compared to its creation time, the backup should be deleted, e.g. keep backups for 7 days.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * For a daily backup recurrence, set this to a value up to 7 days. If you set a weekly backup recurrence, set this to a value up to 14 weeks.
     * 
     * ***
     * 
     */
    @Export(name="retention", refs={String.class}, tree="[0]")
    private Output<String> retention;

    /**
     * @return At what relative time in the future, compared to its creation time, the backup should be deleted, e.g. keep backups for 7 days.
     * A duration in seconds with up to nine fractional digits, ending with &#39;s&#39;. Example: &#34;3.5s&#34;.
     * For a daily backup recurrence, set this to a value up to 7 days. If you set a weekly backup recurrence, set this to a value up to 14 weeks.
     * 
     * ***
     * 
     */
    public Output<String> retention() {
        return this.retention;
    }
    /**
     * For a schedule that runs weekly on a specific day and time.
     * Structure is documented below.
     * 
     */
    @Export(name="weeklyRecurrence", refs={BackupScheduleWeeklyRecurrence.class}, tree="[0]")
    private Output</* @Nullable */ BackupScheduleWeeklyRecurrence> weeklyRecurrence;

    /**
     * @return For a schedule that runs weekly on a specific day and time.
     * Structure is documented below.
     * 
     */
    public Output<Optional<BackupScheduleWeeklyRecurrence>> weeklyRecurrence() {
        return Codegen.optional(this.weeklyRecurrence);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupSchedule(String name) {
        this(name, BackupScheduleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupSchedule(String name, BackupScheduleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupSchedule(String name, BackupScheduleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firestore/backupSchedule:BackupSchedule", name, args == null ? BackupScheduleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupSchedule(String name, Output<String> id, @Nullable BackupScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:firestore/backupSchedule:BackupSchedule", name, state, makeResourceOptions(options, id));
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
    public static BackupSchedule get(String name, Output<String> id, @Nullable BackupScheduleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackupSchedule(name, id, state, options);
    }
}
