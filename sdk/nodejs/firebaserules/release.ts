// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * For more information, see:
 * * [Get started with Firebase Security Rules](https://firebase.google.com/docs/rules/get-started)
 * ## Example Usage
 * ### Firestore_release
 * Creates a Firebase Rules Release to Cloud Firestore
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const firestore = new gcp.firebaserules.Ruleset("firestore", {
 *     source: {
 *         files: [{
 *             content: "service cloud.firestore {match /databases/{database}/documents { match /{document=**} { allow read, write: if false; } } }",
 *             name: "firestore.rules",
 *         }],
 *     },
 *     project: "my-project-name",
 * });
 * const primary = new gcp.firebaserules.Release("primary", {
 *     rulesetName: pulumi.interpolate`projects/my-project-name/rulesets/${firestore.name}`,
 *     project: "my-project-name",
 * });
 * ```
 * ### Storage_release
 * Creates a Firebase Rules Release for a Storage bucket
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * // Provision a non-default Cloud Storage bucket.
 * const bucketBucket = new gcp.storage.Bucket("bucketBucket", {
 *     project: "my-project-name",
 *     location: "us-west1",
 * }, {
 *     provider: google_beta,
 * });
 * // Make the Storage bucket accessible for Firebase SDKs, authentication, and Firebase Security Rules.
 * const bucketStorageBucket = new gcp.firebase.StorageBucket("bucketStorageBucket", {
 *     project: "my-project-name",
 *     bucketId: bucketBucket.name,
 * }, {
 *     provider: google_beta,
 * });
 * // Create a ruleset of Firebase Security Rules from a local file.
 * const storage = new gcp.firebaserules.Ruleset("storage", {
 *     project: "my-project-name",
 *     source: {
 *         files: [{
 *             name: "storage.rules",
 *             content: "service firebase.storage {match /b/{bucket}/o {match /{allPaths=**} {allow read, write: if request.auth != null;}}}",
 *         }],
 *     },
 * }, {
 *     provider: google_beta,
 *     dependsOn: [bucketStorageBucket],
 * });
 * const primary = new gcp.firebaserules.Release("primary", {
 *     rulesetName: pulumi.interpolate`projects/my-project-name/rulesets/${storage.name}`,
 *     project: "my-project-name",
 * }, {
 *     provider: google_beta,
 * });
 * ```
 *
 * ## Import
 *
 * Release can be imported using any of these accepted formats* `projects/{{project}}/releases/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Release using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/releases/{{name}}"
 *
 *  to = google_firebaserules_release.default }
 *
 * ```sh
 *  $ pulumi import gcp:firebaserules/release:Release When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Release can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:firebaserules/release:Release default projects/{{project}}/releases/{{name}}
 * ```
 */
export class Release extends pulumi.CustomResource {
    /**
     * Get an existing Release resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ReleaseState, opts?: pulumi.CustomResourceOptions): Release {
        return new Release(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:firebaserules/release:Release';

    /**
     * Returns true if the given object is an instance of Release.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Release {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Release.__pulumiType;
    }

    /**
     * Output only. Time the release was created.
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * Disable the release to keep it from being served. The response code of NOT_FOUND will be given for executables generated from this Release.
     */
    public /*out*/ readonly disabled!: pulumi.Output<boolean>;
    /**
     * Format: `projects/{project_id}/releases/{release_id}`\Firestore Rules Releases will **always** have the name 'cloud.firestore'
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project for the resource
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist for the `Release` to be created.
     *
     *
     *
     * - - -
     */
    public readonly rulesetName!: pulumi.Output<string>;
    /**
     * Output only. Time the release was updated.
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a Release resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ReleaseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ReleaseArgs | ReleaseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ReleaseState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["disabled"] = state ? state.disabled : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["rulesetName"] = state ? state.rulesetName : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as ReleaseArgs | undefined;
            if ((!args || args.rulesetName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'rulesetName'");
            }
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["rulesetName"] = args ? args.rulesetName : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["disabled"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Release.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Release resources.
 */
export interface ReleaseState {
    /**
     * Output only. Time the release was created.
     */
    createTime?: pulumi.Input<string>;
    /**
     * Disable the release to keep it from being served. The response code of NOT_FOUND will be given for executables generated from this Release.
     */
    disabled?: pulumi.Input<boolean>;
    /**
     * Format: `projects/{project_id}/releases/{release_id}`\Firestore Rules Releases will **always** have the name 'cloud.firestore'
     */
    name?: pulumi.Input<string>;
    /**
     * The project for the resource
     */
    project?: pulumi.Input<string>;
    /**
     * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist for the `Release` to be created.
     *
     *
     *
     * - - -
     */
    rulesetName?: pulumi.Input<string>;
    /**
     * Output only. Time the release was updated.
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Release resource.
 */
export interface ReleaseArgs {
    /**
     * Format: `projects/{project_id}/releases/{release_id}`\Firestore Rules Releases will **always** have the name 'cloud.firestore'
     */
    name?: pulumi.Input<string>;
    /**
     * The project for the resource
     */
    project?: pulumi.Input<string>;
    /**
     * Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist for the `Release` to be created.
     *
     *
     *
     * - - -
     */
    rulesetName: pulumi.Input<string>;
}
