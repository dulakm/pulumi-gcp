// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A managed alloydb cluster.
 *
 * To get more information about Cluster, see:
 *
 * * [API documentation](https://cloud.google.com/alloydb/docs/reference/rest/v1/projects.locations.clusters/create)
 * * How-to Guides
 *     * [AlloyDB](https://cloud.google.com/alloydb/docs/)
 *
 * > **Warning:** All arguments including the following potentially sensitive
 * values will be stored in the raw state as plain text: `initial_user.password`.
 * Read more about sensitive data in state.
 *
 * ## Example Usage
 * ### Alloydb Cluster Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultNetwork = new gcp.compute.Network("defaultNetwork", {});
 * const defaultCluster = new gcp.alloydb.Cluster("defaultCluster", {
 *     clusterId: "alloydb-cluster",
 *     location: "us-central1",
 *     network: defaultNetwork.id,
 * });
 * const project = gcp.organizations.getProject({});
 * ```
 * ### Alloydb Cluster Full
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {});
 * const full = new gcp.alloydb.Cluster("full", {
 *     clusterId: "alloydb-cluster-full",
 *     location: "us-central1",
 *     network: _default.id,
 *     initialUser: {
 *         user: "alloydb-cluster-full",
 *         password: "alloydb-cluster-full",
 *     },
 *     continuousBackupConfig: {
 *         enabled: true,
 *         recoveryWindowDays: 14,
 *     },
 *     automatedBackupPolicy: {
 *         location: "us-central1",
 *         backupWindow: "1800s",
 *         enabled: true,
 *         weeklySchedule: {
 *             daysOfWeeks: ["MONDAY"],
 *             startTimes: [{
 *                 hours: 23,
 *                 minutes: 0,
 *                 seconds: 0,
 *                 nanos: 0,
 *             }],
 *         },
 *         quantityBasedRetention: {
 *             count: 1,
 *         },
 *         labels: {
 *             test: "alloydb-cluster-full",
 *         },
 *     },
 *     labels: {
 *         test: "alloydb-cluster-full",
 *     },
 * });
 * const project = gcp.organizations.getProject({});
 * ```
 * ### Alloydb Cluster Restore
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const default = gcp.compute.getNetwork({
 *     name: "alloydb-network",
 * });
 * const sourceCluster = new gcp.alloydb.Cluster("sourceCluster", {
 *     clusterId: "alloydb-source-cluster",
 *     location: "us-central1",
 *     network: _default.then(_default => _default.id),
 *     initialUser: {
 *         password: "alloydb-source-cluster",
 *     },
 * });
 * const privateIpAlloc = new gcp.compute.GlobalAddress("privateIpAlloc", {
 *     addressType: "INTERNAL",
 *     purpose: "VPC_PEERING",
 *     prefixLength: 16,
 *     network: _default.then(_default => _default.id),
 * });
 * const vpcConnection = new gcp.servicenetworking.Connection("vpcConnection", {
 *     network: _default.then(_default => _default.id),
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * const sourceInstance = new gcp.alloydb.Instance("sourceInstance", {
 *     cluster: sourceCluster.name,
 *     instanceId: "alloydb-instance",
 *     instanceType: "PRIMARY",
 *     machineConfig: {
 *         cpuCount: 2,
 *     },
 * }, {
 *     dependsOn: [vpcConnection],
 * });
 * const sourceBackup = new gcp.alloydb.Backup("sourceBackup", {
 *     backupId: "alloydb-backup",
 *     location: "us-central1",
 *     clusterName: sourceCluster.name,
 * }, {
 *     dependsOn: [sourceInstance],
 * });
 * const restoredFromBackup = new gcp.alloydb.Cluster("restoredFromBackup", {
 *     clusterId: "alloydb-backup-restored",
 *     location: "us-central1",
 *     network: _default.then(_default => _default.id),
 *     restoreBackupSource: {
 *         backupName: sourceBackup.name,
 *     },
 * });
 * const restoredViaPitr = new gcp.alloydb.Cluster("restoredViaPitr", {
 *     clusterId: "alloydb-pitr-restored",
 *     location: "us-central1",
 *     network: _default.then(_default => _default.id),
 *     restoreContinuousBackupSource: {
 *         cluster: sourceCluster.name,
 *         pointInTime: "2023-08-03T19:19:00.094Z",
 *     },
 * });
 * const project = gcp.organizations.getProject({});
 * ```
 * ### Alloydb Secondary Cluster Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.compute.Network("default", {});
 * const primaryCluster = new gcp.alloydb.Cluster("primaryCluster", {
 *     clusterId: "alloydb-primary-cluster",
 *     location: "us-central1",
 *     network: _default.id,
 * });
 * const privateIpAlloc = new gcp.compute.GlobalAddress("privateIpAlloc", {
 *     addressType: "INTERNAL",
 *     purpose: "VPC_PEERING",
 *     prefixLength: 16,
 *     network: _default.id,
 * });
 * const vpcConnection = new gcp.servicenetworking.Connection("vpcConnection", {
 *     network: _default.id,
 *     service: "servicenetworking.googleapis.com",
 *     reservedPeeringRanges: [privateIpAlloc.name],
 * });
 * const primaryInstance = new gcp.alloydb.Instance("primaryInstance", {
 *     cluster: primaryCluster.name,
 *     instanceId: "alloydb-primary-instance",
 *     instanceType: "PRIMARY",
 *     machineConfig: {
 *         cpuCount: 2,
 *     },
 * }, {
 *     dependsOn: [vpcConnection],
 * });
 * const secondary = new gcp.alloydb.Cluster("secondary", {
 *     clusterId: "alloydb-secondary-cluster",
 *     location: "us-east1",
 *     network: _default.id,
 *     clusterType: "SECONDARY",
 *     continuousBackupConfig: {
 *         enabled: false,
 *     },
 *     secondaryConfig: {
 *         primaryClusterName: primaryCluster.name,
 *     },
 * }, {
 *     dependsOn: [primaryInstance],
 * });
 * const project = gcp.organizations.getProject({});
 * ```
 *
 * ## Import
 *
 * Cluster can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/clusters/{{cluster_id}}` * `{{project}}/{{location}}/{{cluster_id}}` * `{{location}}/{{cluster_id}}` * `{{cluster_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Cluster using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/locations/{{location}}/clusters/{{cluster_id}}"
 *
 *  to = google_alloydb_cluster.default }
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Cluster can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default projects/{{project}}/locations/{{location}}/clusters/{{cluster_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{project}}/{{location}}/{{cluster_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{location}}/{{cluster_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:alloydb/cluster:Cluster default {{cluster_id}}
 * ```
 */
export class Cluster extends pulumi.CustomResource {
    /**
     * Get an existing Cluster resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ClusterState, opts?: pulumi.CustomResourceOptions): Cluster {
        return new Cluster(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:alloydb/cluster:Cluster';

    /**
     * Returns true if the given object is an instance of Cluster.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Cluster {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Cluster.__pulumiType;
    }

    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels. https://google.aip.dev/128
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    public readonly annotations!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The automated backup policy for this cluster. AutomatedBackupPolicy is disabled by default.
     * Structure is documented below.
     */
    public readonly automatedBackupPolicy!: pulumi.Output<outputs.alloydb.ClusterAutomatedBackupPolicy>;
    /**
     * Cluster created from backup.
     * Structure is documented below.
     */
    public /*out*/ readonly backupSources!: pulumi.Output<outputs.alloydb.ClusterBackupSource[]>;
    /**
     * The ID of the alloydb cluster.
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The type of cluster. If not set, defaults to PRIMARY.
     * Default value is `PRIMARY`.
     * Possible values are: `PRIMARY`, `SECONDARY`.
     */
    public readonly clusterType!: pulumi.Output<string | undefined>;
    /**
     * The continuous backup config for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day and retains backups for 14 days.
     * Structure is documented below.
     */
    public readonly continuousBackupConfig!: pulumi.Output<outputs.alloydb.ClusterContinuousBackupConfig>;
    /**
     * ContinuousBackupInfo describes the continuous backup properties of a cluster.
     * Structure is documented below.
     */
    public /*out*/ readonly continuousBackupInfos!: pulumi.Output<outputs.alloydb.ClusterContinuousBackupInfo[]>;
    /**
     * The database engine major version. This is an output-only field and it's populated at the Cluster creation time. This field cannot be changed after cluster creation.
     */
    public /*out*/ readonly databaseVersion!: pulumi.Output<string>;
    /**
     * Policy to determine if the cluster should be deleted forcefully.
     * Deleting a cluster forcefully, deletes the cluster and all its associated instances within the cluster.
     * Deleting a Secondary cluster with a secondary instance REQUIRES setting deletionPolicy = "FORCE" otherwise an error is returned. This is needed as there is no support to delete just the secondary instance, and the only way to delete secondary instance is to delete the associated secondary cluster forcefully which also deletes the secondary instance.
     */
    public readonly deletionPolicy!: pulumi.Output<string | undefined>;
    /**
     * User-settable and human-readable display name for the Cluster.
     */
    public readonly displayName!: pulumi.Output<string | undefined>;
    /**
     * All of annotations (key/value pairs) present on the resource in GCP, including the annotations configured through
     * Terraform, other clients and services.
     */
    public /*out*/ readonly effectiveAnnotations!: pulumi.Output<{[key: string]: string}>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     */
    public readonly encryptionConfig!: pulumi.Output<outputs.alloydb.ClusterEncryptionConfig | undefined>;
    /**
     * (Output)
     * Output only. The encryption information for the WALs and backups required for ContinuousBackup.
     * Structure is documented below.
     */
    public /*out*/ readonly encryptionInfos!: pulumi.Output<outputs.alloydb.ClusterEncryptionInfo[]>;
    /**
     * For Resource freshness validation (https://google.aip.dev/154)
     */
    public readonly etag!: pulumi.Output<string | undefined>;
    /**
     * Initial user to setup during cluster creation.
     * Structure is documented below.
     */
    public readonly initialUser!: pulumi.Output<outputs.alloydb.ClusterInitialUser | undefined>;
    /**
     * User-defined labels for the alloydb cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The location where the alloydb cluster should reside.
     *
     *
     * - - -
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Cluster created via DMS migration.
     * Structure is documented below.
     */
    public /*out*/ readonly migrationSources!: pulumi.Output<outputs.alloydb.ClusterMigrationSource[]>;
    /**
     * The name of the cluster resource.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * (Optional, Deprecated)
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     *
     * > **Warning:** `network` is deprecated and will be removed in a future major release. Instead, use `networkConfig` to define the network configuration.
     *
     * @deprecated `network` is deprecated and will be removed in a future major release. Instead, use `network_config` to define the network configuration.
     */
    public readonly network!: pulumi.Output<string>;
    /**
     * Metadata related to network configuration.
     * Structure is documented below.
     */
    public readonly networkConfig!: pulumi.Output<outputs.alloydb.ClusterNetworkConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Output only. Reconciling (https://google.aip.dev/128#reconciliation).
     * Set to true if the current state of Cluster does not match the user's intended state, and the service is actively updating the resource to reconcile them.
     * This can happen due to user-triggered updates or system actions like failover or maintenance.
     */
    public /*out*/ readonly reconciling!: pulumi.Output<boolean>;
    /**
     * The source when restoring from a backup. Conflicts with 'restore_continuous_backup_source', both can't be set together.
     * Structure is documented below.
     */
    public readonly restoreBackupSource!: pulumi.Output<outputs.alloydb.ClusterRestoreBackupSource | undefined>;
    /**
     * The source when restoring via point in time recovery (PITR). Conflicts with 'restore_backup_source', both can't be set together.
     * Structure is documented below.
     */
    public readonly restoreContinuousBackupSource!: pulumi.Output<outputs.alloydb.ClusterRestoreContinuousBackupSource | undefined>;
    /**
     * Configuration of the secondary cluster for Cross Region Replication. This should be set if and only if the cluster is of type SECONDARY.
     * Structure is documented below.
     */
    public readonly secondaryConfig!: pulumi.Output<outputs.alloydb.ClusterSecondaryConfig | undefined>;
    /**
     * Output only. The current serving state of the cluster.
     */
    public /*out*/ readonly state!: pulumi.Output<string>;
    /**
     * The system-generated UID of the resource.
     */
    public /*out*/ readonly uid!: pulumi.Output<string>;

    /**
     * Create a Cluster resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ClusterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ClusterArgs | ClusterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ClusterState | undefined;
            resourceInputs["annotations"] = state ? state.annotations : undefined;
            resourceInputs["automatedBackupPolicy"] = state ? state.automatedBackupPolicy : undefined;
            resourceInputs["backupSources"] = state ? state.backupSources : undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["clusterType"] = state ? state.clusterType : undefined;
            resourceInputs["continuousBackupConfig"] = state ? state.continuousBackupConfig : undefined;
            resourceInputs["continuousBackupInfos"] = state ? state.continuousBackupInfos : undefined;
            resourceInputs["databaseVersion"] = state ? state.databaseVersion : undefined;
            resourceInputs["deletionPolicy"] = state ? state.deletionPolicy : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["effectiveAnnotations"] = state ? state.effectiveAnnotations : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["encryptionConfig"] = state ? state.encryptionConfig : undefined;
            resourceInputs["encryptionInfos"] = state ? state.encryptionInfos : undefined;
            resourceInputs["etag"] = state ? state.etag : undefined;
            resourceInputs["initialUser"] = state ? state.initialUser : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["migrationSources"] = state ? state.migrationSources : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["network"] = state ? state.network : undefined;
            resourceInputs["networkConfig"] = state ? state.networkConfig : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["reconciling"] = state ? state.reconciling : undefined;
            resourceInputs["restoreBackupSource"] = state ? state.restoreBackupSource : undefined;
            resourceInputs["restoreContinuousBackupSource"] = state ? state.restoreContinuousBackupSource : undefined;
            resourceInputs["secondaryConfig"] = state ? state.secondaryConfig : undefined;
            resourceInputs["state"] = state ? state.state : undefined;
            resourceInputs["uid"] = state ? state.uid : undefined;
        } else {
            const args = argsOrState as ClusterArgs | undefined;
            if ((!args || args.clusterId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clusterId'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["annotations"] = args ? args.annotations : undefined;
            resourceInputs["automatedBackupPolicy"] = args ? args.automatedBackupPolicy : undefined;
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["clusterType"] = args ? args.clusterType : undefined;
            resourceInputs["continuousBackupConfig"] = args ? args.continuousBackupConfig : undefined;
            resourceInputs["deletionPolicy"] = args ? args.deletionPolicy : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["encryptionConfig"] = args ? args.encryptionConfig : undefined;
            resourceInputs["etag"] = args ? args.etag : undefined;
            resourceInputs["initialUser"] = args ? args.initialUser : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["network"] = args ? args.network : undefined;
            resourceInputs["networkConfig"] = args ? args.networkConfig : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["restoreBackupSource"] = args ? args.restoreBackupSource : undefined;
            resourceInputs["restoreContinuousBackupSource"] = args ? args.restoreContinuousBackupSource : undefined;
            resourceInputs["secondaryConfig"] = args ? args.secondaryConfig : undefined;
            resourceInputs["backupSources"] = undefined /*out*/;
            resourceInputs["continuousBackupInfos"] = undefined /*out*/;
            resourceInputs["databaseVersion"] = undefined /*out*/;
            resourceInputs["effectiveAnnotations"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["encryptionInfos"] = undefined /*out*/;
            resourceInputs["migrationSources"] = undefined /*out*/;
            resourceInputs["name"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["reconciling"] = undefined /*out*/;
            resourceInputs["state"] = undefined /*out*/;
            resourceInputs["uid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Cluster.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Cluster resources.
 */
export interface ClusterState {
    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels. https://google.aip.dev/128
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The automated backup policy for this cluster. AutomatedBackupPolicy is disabled by default.
     * Structure is documented below.
     */
    automatedBackupPolicy?: pulumi.Input<inputs.alloydb.ClusterAutomatedBackupPolicy>;
    /**
     * Cluster created from backup.
     * Structure is documented below.
     */
    backupSources?: pulumi.Input<pulumi.Input<inputs.alloydb.ClusterBackupSource>[]>;
    /**
     * The ID of the alloydb cluster.
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The type of cluster. If not set, defaults to PRIMARY.
     * Default value is `PRIMARY`.
     * Possible values are: `PRIMARY`, `SECONDARY`.
     */
    clusterType?: pulumi.Input<string>;
    /**
     * The continuous backup config for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day and retains backups for 14 days.
     * Structure is documented below.
     */
    continuousBackupConfig?: pulumi.Input<inputs.alloydb.ClusterContinuousBackupConfig>;
    /**
     * ContinuousBackupInfo describes the continuous backup properties of a cluster.
     * Structure is documented below.
     */
    continuousBackupInfos?: pulumi.Input<pulumi.Input<inputs.alloydb.ClusterContinuousBackupInfo>[]>;
    /**
     * The database engine major version. This is an output-only field and it's populated at the Cluster creation time. This field cannot be changed after cluster creation.
     */
    databaseVersion?: pulumi.Input<string>;
    /**
     * Policy to determine if the cluster should be deleted forcefully.
     * Deleting a cluster forcefully, deletes the cluster and all its associated instances within the cluster.
     * Deleting a Secondary cluster with a secondary instance REQUIRES setting deletionPolicy = "FORCE" otherwise an error is returned. This is needed as there is no support to delete just the secondary instance, and the only way to delete secondary instance is to delete the associated secondary cluster forcefully which also deletes the secondary instance.
     */
    deletionPolicy?: pulumi.Input<string>;
    /**
     * User-settable and human-readable display name for the Cluster.
     */
    displayName?: pulumi.Input<string>;
    /**
     * All of annotations (key/value pairs) present on the resource in GCP, including the annotations configured through
     * Terraform, other clients and services.
     */
    effectiveAnnotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     */
    encryptionConfig?: pulumi.Input<inputs.alloydb.ClusterEncryptionConfig>;
    /**
     * (Output)
     * Output only. The encryption information for the WALs and backups required for ContinuousBackup.
     * Structure is documented below.
     */
    encryptionInfos?: pulumi.Input<pulumi.Input<inputs.alloydb.ClusterEncryptionInfo>[]>;
    /**
     * For Resource freshness validation (https://google.aip.dev/154)
     */
    etag?: pulumi.Input<string>;
    /**
     * Initial user to setup during cluster creation.
     * Structure is documented below.
     */
    initialUser?: pulumi.Input<inputs.alloydb.ClusterInitialUser>;
    /**
     * User-defined labels for the alloydb cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the alloydb cluster should reside.
     *
     *
     * - - -
     */
    location?: pulumi.Input<string>;
    /**
     * Cluster created via DMS migration.
     * Structure is documented below.
     */
    migrationSources?: pulumi.Input<pulumi.Input<inputs.alloydb.ClusterMigrationSource>[]>;
    /**
     * The name of the cluster resource.
     */
    name?: pulumi.Input<string>;
    /**
     * (Optional, Deprecated)
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     *
     * > **Warning:** `network` is deprecated and will be removed in a future major release. Instead, use `networkConfig` to define the network configuration.
     *
     * @deprecated `network` is deprecated and will be removed in a future major release. Instead, use `network_config` to define the network configuration.
     */
    network?: pulumi.Input<string>;
    /**
     * Metadata related to network configuration.
     * Structure is documented below.
     */
    networkConfig?: pulumi.Input<inputs.alloydb.ClusterNetworkConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Output only. Reconciling (https://google.aip.dev/128#reconciliation).
     * Set to true if the current state of Cluster does not match the user's intended state, and the service is actively updating the resource to reconcile them.
     * This can happen due to user-triggered updates or system actions like failover or maintenance.
     */
    reconciling?: pulumi.Input<boolean>;
    /**
     * The source when restoring from a backup. Conflicts with 'restore_continuous_backup_source', both can't be set together.
     * Structure is documented below.
     */
    restoreBackupSource?: pulumi.Input<inputs.alloydb.ClusterRestoreBackupSource>;
    /**
     * The source when restoring via point in time recovery (PITR). Conflicts with 'restore_backup_source', both can't be set together.
     * Structure is documented below.
     */
    restoreContinuousBackupSource?: pulumi.Input<inputs.alloydb.ClusterRestoreContinuousBackupSource>;
    /**
     * Configuration of the secondary cluster for Cross Region Replication. This should be set if and only if the cluster is of type SECONDARY.
     * Structure is documented below.
     */
    secondaryConfig?: pulumi.Input<inputs.alloydb.ClusterSecondaryConfig>;
    /**
     * Output only. The current serving state of the cluster.
     */
    state?: pulumi.Input<string>;
    /**
     * The system-generated UID of the resource.
     */
    uid?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Cluster resource.
 */
export interface ClusterArgs {
    /**
     * Annotations to allow client tools to store small amount of arbitrary data. This is distinct from labels. https://google.aip.dev/128
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     *
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effectiveAnnotations` for all of the annotations present on the resource.
     */
    annotations?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The automated backup policy for this cluster. AutomatedBackupPolicy is disabled by default.
     * Structure is documented below.
     */
    automatedBackupPolicy?: pulumi.Input<inputs.alloydb.ClusterAutomatedBackupPolicy>;
    /**
     * The ID of the alloydb cluster.
     */
    clusterId: pulumi.Input<string>;
    /**
     * The type of cluster. If not set, defaults to PRIMARY.
     * Default value is `PRIMARY`.
     * Possible values are: `PRIMARY`, `SECONDARY`.
     */
    clusterType?: pulumi.Input<string>;
    /**
     * The continuous backup config for this cluster.
     * If no policy is provided then the default policy will be used. The default policy takes one backup a day and retains backups for 14 days.
     * Structure is documented below.
     */
    continuousBackupConfig?: pulumi.Input<inputs.alloydb.ClusterContinuousBackupConfig>;
    /**
     * Policy to determine if the cluster should be deleted forcefully.
     * Deleting a cluster forcefully, deletes the cluster and all its associated instances within the cluster.
     * Deleting a Secondary cluster with a secondary instance REQUIRES setting deletionPolicy = "FORCE" otherwise an error is returned. This is needed as there is no support to delete just the secondary instance, and the only way to delete secondary instance is to delete the associated secondary cluster forcefully which also deletes the secondary instance.
     */
    deletionPolicy?: pulumi.Input<string>;
    /**
     * User-settable and human-readable display name for the Cluster.
     */
    displayName?: pulumi.Input<string>;
    /**
     * EncryptionConfig describes the encryption config of a cluster or a backup that is encrypted with a CMEK (customer-managed encryption key).
     * Structure is documented below.
     */
    encryptionConfig?: pulumi.Input<inputs.alloydb.ClusterEncryptionConfig>;
    /**
     * For Resource freshness validation (https://google.aip.dev/154)
     */
    etag?: pulumi.Input<string>;
    /**
     * Initial user to setup during cluster creation.
     * Structure is documented below.
     */
    initialUser?: pulumi.Input<inputs.alloydb.ClusterInitialUser>;
    /**
     * User-defined labels for the alloydb cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The location where the alloydb cluster should reside.
     *
     *
     * - - -
     */
    location: pulumi.Input<string>;
    /**
     * (Optional, Deprecated)
     * The relative resource name of the VPC network on which the instance can be accessed. It is specified in the following form:
     * "projects/{projectNumber}/global/networks/{network_id}".
     *
     * > **Warning:** `network` is deprecated and will be removed in a future major release. Instead, use `networkConfig` to define the network configuration.
     *
     * @deprecated `network` is deprecated and will be removed in a future major release. Instead, use `network_config` to define the network configuration.
     */
    network?: pulumi.Input<string>;
    /**
     * Metadata related to network configuration.
     * Structure is documented below.
     */
    networkConfig?: pulumi.Input<inputs.alloydb.ClusterNetworkConfig>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The source when restoring from a backup. Conflicts with 'restore_continuous_backup_source', both can't be set together.
     * Structure is documented below.
     */
    restoreBackupSource?: pulumi.Input<inputs.alloydb.ClusterRestoreBackupSource>;
    /**
     * The source when restoring via point in time recovery (PITR). Conflicts with 'restore_backup_source', both can't be set together.
     * Structure is documented below.
     */
    restoreContinuousBackupSource?: pulumi.Input<inputs.alloydb.ClusterRestoreContinuousBackupSource>;
    /**
     * Configuration of the secondary cluster for Cross Region Replication. This should be set if and only if the cluster is of type SECONDARY.
     * Structure is documented below.
     */
    secondaryConfig?: pulumi.Input<inputs.alloydb.ClusterSecondaryConfig>;
}
