// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A job trigger configuration.
 *
 * To get more information about JobTrigger, see:
 *
 * * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.jobTriggers)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dlp/docs/creating-job-triggers)
 *
 * ## Example Usage
 * ### Dlp Job Trigger Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basic = new gcp.dataloss.PreventionJobTrigger("basic", {
 *     description: "Description",
 *     displayName: "Displayname",
 *     inspectJob: {
 *         actions: [{
 *             saveFindings: {
 *                 outputConfig: {
 *                     table: {
 *                         datasetId: "dataset",
 *                         projectId: "project",
 *                     },
 *                 },
 *             },
 *         }],
 *         inspectTemplateName: "fake",
 *         storageConfig: {
 *             cloudStorageOptions: {
 *                 fileSet: {
 *                     url: "gs://mybucket/directory/",
 *                 },
 *             },
 *         },
 *     },
 *     parent: "projects/my-project-name",
 *     triggers: [{
 *         schedule: {
 *             recurrencePeriodDuration: "86400s",
 *         },
 *     }],
 * });
 * ```
 * ### Dlp Job Trigger Bigquery Row Limit
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const bigqueryRowLimit = new gcp.dataloss.PreventionJobTrigger("bigqueryRowLimit", {
 *     description: "Description",
 *     displayName: "Displayname",
 *     inspectJob: {
 *         actions: [{
 *             saveFindings: {
 *                 outputConfig: {
 *                     table: {
 *                         datasetId: "dataset",
 *                         projectId: "project",
 *                     },
 *                 },
 *             },
 *         }],
 *         inspectTemplateName: "fake",
 *         storageConfig: {
 *             bigQueryOptions: {
 *                 rowsLimit: 1000,
 *                 sampleMethod: "RANDOM_START",
 *                 tableReference: {
 *                     datasetId: "dataset",
 *                     projectId: "project",
 *                     tableId: "table_to_scan",
 *                 },
 *             },
 *         },
 *     },
 *     parent: "projects/my-project-name",
 *     triggers: [{
 *         schedule: {
 *             recurrencePeriodDuration: "86400s",
 *         },
 *     }],
 * });
 * ```
 * ### Dlp Job Trigger Bigquery Row Limit Percentage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const bigqueryRowLimitPercentage = new gcp.dataloss.PreventionJobTrigger("bigqueryRowLimitPercentage", {
 *     description: "Description",
 *     displayName: "Displayname",
 *     inspectJob: {
 *         actions: [{
 *             saveFindings: {
 *                 outputConfig: {
 *                     table: {
 *                         datasetId: "dataset",
 *                         projectId: "project",
 *                     },
 *                 },
 *             },
 *         }],
 *         inspectTemplateName: "fake",
 *         storageConfig: {
 *             bigQueryOptions: {
 *                 rowsLimitPercent: 50,
 *                 sampleMethod: "RANDOM_START",
 *                 tableReference: {
 *                     datasetId: "dataset",
 *                     projectId: "project",
 *                     tableId: "table_to_scan",
 *                 },
 *             },
 *         },
 *     },
 *     parent: "projects/my-project-name",
 *     triggers: [{
 *         schedule: {
 *             recurrencePeriodDuration: "86400s",
 *         },
 *     }],
 * });
 * ```
 * ### Dlp Job Trigger Job Notification Emails
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const jobNotificationEmails = new gcp.dataloss.PreventionJobTrigger("jobNotificationEmails", {
 *     description: "Description for the job_trigger created by terraform",
 *     displayName: "TerraformDisplayName",
 *     inspectJob: {
 *         actions: [{
 *             jobNotificationEmails: {},
 *         }],
 *         inspectTemplateName: "sample-inspect-template",
 *         storageConfig: {
 *             cloudStorageOptions: {
 *                 fileSet: {
 *                     url: "gs://mybucket/directory/",
 *                 },
 *             },
 *         },
 *     },
 *     parent: "projects/my-project-name",
 *     triggers: [{
 *         schedule: {
 *             recurrencePeriodDuration: "86400s",
 *         },
 *     }],
 * });
 * ```
 * ### Dlp Job Trigger Deidentify
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultDataset = new gcp.bigquery.Dataset("defaultDataset", {
 *     datasetId: "tf_test",
 *     friendlyName: "terraform-test",
 *     description: "Description for the dataset created by terraform",
 *     location: "US",
 *     defaultTableExpirationMs: 3600000,
 *     labels: {
 *         env: "default",
 *     },
 * });
 * const defaultTable = new gcp.bigquery.Table("defaultTable", {
 *     datasetId: defaultDataset.datasetId,
 *     tableId: "tf_test",
 *     deletionProtection: false,
 *     timePartitioning: {
 *         type: "DAY",
 *     },
 *     labels: {
 *         env: "default",
 *     },
 *     schema: `    [
 *     {
 *       "name": "quantity",
 *       "type": "NUMERIC",
 *       "mode": "NULLABLE",
 *       "description": "The quantity"
 *     },
 *     {
 *       "name": "name",
 *       "type": "STRING",
 *       "mode": "NULLABLE",
 *       "description": "Name of the object"
 *     }
 *     ]
 * `,
 * });
 * const deidentify = new gcp.dataloss.PreventionJobTrigger("deidentify", {
 *     parent: "projects/my-project-name",
 *     description: "Description for the job_trigger created by terraform",
 *     displayName: "TerraformDisplayName",
 *     triggers: [{
 *         schedule: {
 *             recurrencePeriodDuration: "86400s",
 *         },
 *     }],
 *     inspectJob: {
 *         inspectTemplateName: "sample-inspect-template",
 *         actions: [{
 *             deidentify: {
 *                 cloudStorageOutput: "gs://samplebucket/dir/",
 *                 fileTypesToTransforms: [
 *                     "CSV",
 *                     "TSV",
 *                 ],
 *                 transformationDetailsStorageConfig: {
 *                     table: {
 *                         projectId: "my-project-name",
 *                         datasetId: defaultDataset.datasetId,
 *                         tableId: defaultTable.tableId,
 *                     },
 *                 },
 *                 transformationConfig: {
 *                     deidentifyTemplate: "sample-deidentify-template",
 *                     imageRedactTemplate: "sample-image-redact-template",
 *                     structuredDeidentifyTemplate: "sample-structured-deidentify-template",
 *                 },
 *             },
 *         }],
 *         storageConfig: {
 *             cloudStorageOptions: {
 *                 fileSet: {
 *                     url: "gs://mybucket/directory/",
 *                 },
 *             },
 *         },
 *     },
 * });
 * ```
 * ### Dlp Job Trigger Hybrid
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const hybridTrigger = new gcp.dataloss.PreventionJobTrigger("hybridTrigger", {
 *     inspectJob: {
 *         actions: [{
 *             saveFindings: {
 *                 outputConfig: {
 *                     table: {
 *                         datasetId: "dataset",
 *                         projectId: "project",
 *                     },
 *                 },
 *             },
 *         }],
 *         inspectTemplateName: "fake",
 *         storageConfig: {
 *             hybridOptions: {
 *                 description: "Hybrid job trigger for data from the comments field of a table that contains customer appointment bookings",
 *                 labels: {
 *                     env: "prod",
 *                 },
 *                 requiredFindingLabelKeys: ["appointment-bookings-comments"],
 *                 tableOptions: {
 *                     identifyingFields: [{
 *                         name: "booking_id",
 *                     }],
 *                 },
 *             },
 *         },
 *     },
 *     parent: "projects/my-project-name",
 *     triggers: [{
 *         manual: {},
 *     }],
 * });
 * ```
 * ### Dlp Job Trigger Publish To Stackdriver
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const publishToStackdriver = new gcp.dataloss.PreventionJobTrigger("publishToStackdriver", {
 *     description: "Description for the job_trigger created by terraform",
 *     displayName: "TerraformDisplayName",
 *     inspectJob: {
 *         actions: [{
 *             publishToStackdriver: {},
 *         }],
 *         inspectTemplateName: "sample-inspect-template",
 *         storageConfig: {
 *             cloudStorageOptions: {
 *                 fileSet: {
 *                     url: "gs://mybucket/directory/",
 *                 },
 *             },
 *         },
 *     },
 *     parent: "projects/my-project-name",
 *     triggers: [{
 *         schedule: {
 *             recurrencePeriodDuration: "86400s",
 *         },
 *     }],
 * });
 * ```
 * ### Dlp Job Trigger With Id
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const withTriggerId = new gcp.dataloss.PreventionJobTrigger("withTriggerId", {
 *     description: "Starting description",
 *     displayName: "display",
 *     inspectJob: {
 *         actions: [{
 *             saveFindings: {
 *                 outputConfig: {
 *                     table: {
 *                         datasetId: "dataset123",
 *                         projectId: "project",
 *                     },
 *                 },
 *             },
 *         }],
 *         inspectTemplateName: "fake",
 *         storageConfig: {
 *             cloudStorageOptions: {
 *                 fileSet: {
 *                     url: "gs://mybucket/directory/",
 *                 },
 *             },
 *         },
 *     },
 *     parent: "projects/my-project-name",
 *     triggerId: "id-",
 *     triggers: [{
 *         schedule: {
 *             recurrencePeriodDuration: "86400s",
 *         },
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * JobTrigger can be imported using any of these accepted formats* `{{parent}}/jobTriggers/{{name}}` * `{{parent}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import JobTrigger using one of the formats above. For exampletf import {
 *
 *  id = "{{parent}}/jobTriggers/{{name}}"
 *
 *  to = google_data_loss_prevention_job_trigger.default }
 *
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionJobTrigger:PreventionJobTrigger When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), JobTrigger can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionJobTrigger:PreventionJobTrigger default {{parent}}/jobTriggers/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:dataloss/preventionJobTrigger:PreventionJobTrigger default {{parent}}/{{name}}
 * ```
 */
export class PreventionJobTrigger extends pulumi.CustomResource {
    /**
     * Get an existing PreventionJobTrigger resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PreventionJobTriggerState, opts?: pulumi.CustomResourceOptions): PreventionJobTrigger {
        return new PreventionJobTrigger(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:dataloss/preventionJobTrigger:PreventionJobTrigger';

    /**
     * Returns true if the given object is an instance of PreventionJobTrigger.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is PreventionJobTrigger {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === PreventionJobTrigger.__pulumiType;
    }

    /**
     * (Output)
     * The creation timestamp of an inspectTemplate. Set by the server.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * User set display name of the job trigger.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * Controls what and how to inspect for findings.
     * Structure is documented below.
     */
    public readonly inspectJob!: pulumi.Output<outputs.dataloss.PreventionJobTriggerInspectJob | undefined>;
    /**
     * The timestamp of the last time this trigger executed.
     */
    public /*out*/ readonly lastRunTime!: pulumi.Output<string>;
    /**
     * Name describing the field excluded from scanning.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * The parent of the trigger, either in the format `projects/{{project}}`
     * or `projects/{{project}}/locations/{{location}}`
     */
    public readonly parent!: pulumi.Output<string>;
    /**
     * Whether the trigger is currently active.
     * Default value is `HEALTHY`.
     * Possible values are: `PAUSED`, `HEALTHY`, `CANCELLED`.
     */
    public readonly status!: pulumi.Output<string | undefined>;
    /**
     * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens;
     * that is, it must match the regular expression: [a-zA-Z\d-_]+.
     * The maximum length is 100 characters. Can be empty to allow the system to generate one.
     */
    public readonly triggerId!: pulumi.Output<string>;
    /**
     * What event needs to occur for a new job to be started.
     * Structure is documented below.
     */
    public readonly triggers!: pulumi.Output<outputs.dataloss.PreventionJobTriggerTrigger[]>;
    /**
     * The last update timestamp of an inspectTemplate. Set by the server.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a PreventionJobTrigger resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PreventionJobTriggerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PreventionJobTriggerArgs | PreventionJobTriggerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PreventionJobTriggerState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["inspectJob"] = state ? state.inspectJob : undefined;
            resourceInputs["lastRunTime"] = state ? state.lastRunTime : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["parent"] = state ? state.parent : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["triggerId"] = state ? state.triggerId : undefined;
            resourceInputs["triggers"] = state ? state.triggers : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as PreventionJobTriggerArgs | undefined;
            if ((!args || args.parent === undefined) && !opts.urn) {
                throw new Error("Missing required property 'parent'");
            }
            if ((!args || args.triggers === undefined) && !opts.urn) {
                throw new Error("Missing required property 'triggers'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["inspectJob"] = args ? args.inspectJob : undefined;
            resourceInputs["parent"] = args ? args.parent : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["triggerId"] = args ? args.triggerId : undefined;
            resourceInputs["triggers"] = args ? args.triggers : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["lastRunTime"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(PreventionJobTrigger.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering PreventionJobTrigger resources.
 */
export interface PreventionJobTriggerState {
    /**
     * (Output)
     * The creation timestamp of an inspectTemplate. Set by the server.
     */
    createTime?: pulumi.Input<string>;
    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     */
    description?: pulumi.Input<string>;
    /**
     * User set display name of the job trigger.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Controls what and how to inspect for findings.
     * Structure is documented below.
     */
    inspectJob?: pulumi.Input<inputs.dataloss.PreventionJobTriggerInspectJob>;
    /**
     * The timestamp of the last time this trigger executed.
     */
    lastRunTime?: pulumi.Input<string>;
    /**
     * Name describing the field excluded from scanning.
     */
    name?: pulumi.Input<string>;
    /**
     * The parent of the trigger, either in the format `projects/{{project}}`
     * or `projects/{{project}}/locations/{{location}}`
     */
    parent?: pulumi.Input<string>;
    /**
     * Whether the trigger is currently active.
     * Default value is `HEALTHY`.
     * Possible values are: `PAUSED`, `HEALTHY`, `CANCELLED`.
     */
    status?: pulumi.Input<string>;
    /**
     * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens;
     * that is, it must match the regular expression: [a-zA-Z\d-_]+.
     * The maximum length is 100 characters. Can be empty to allow the system to generate one.
     */
    triggerId?: pulumi.Input<string>;
    /**
     * What event needs to occur for a new job to be started.
     * Structure is documented below.
     */
    triggers?: pulumi.Input<pulumi.Input<inputs.dataloss.PreventionJobTriggerTrigger>[]>;
    /**
     * The last update timestamp of an inspectTemplate. Set by the server.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a PreventionJobTrigger resource.
 */
export interface PreventionJobTriggerArgs {
    /**
     * A short description of where the data is coming from. Will be stored once in the job. 256 max length.
     */
    description?: pulumi.Input<string>;
    /**
     * User set display name of the job trigger.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Controls what and how to inspect for findings.
     * Structure is documented below.
     */
    inspectJob?: pulumi.Input<inputs.dataloss.PreventionJobTriggerInspectJob>;
    /**
     * The parent of the trigger, either in the format `projects/{{project}}`
     * or `projects/{{project}}/locations/{{location}}`
     */
    parent: pulumi.Input<string>;
    /**
     * Whether the trigger is currently active.
     * Default value is `HEALTHY`.
     * Possible values are: `PAUSED`, `HEALTHY`, `CANCELLED`.
     */
    status?: pulumi.Input<string>;
    /**
     * The trigger id can contain uppercase and lowercase letters, numbers, and hyphens;
     * that is, it must match the regular expression: [a-zA-Z\d-_]+.
     * The maximum length is 100 characters. Can be empty to allow the system to generate one.
     */
    triggerId?: pulumi.Input<string>;
    /**
     * What event needs to occur for a new job to be started.
     * Structure is documented below.
     */
    triggers: pulumi.Input<pulumi.Input<inputs.dataloss.PreventionJobTriggerTrigger>[]>;
}
