// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Retrieves the current IAM policy data for connection
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.bigquery.getConnectionIamPolicy({
 *     project: google_bigquery_connection.connection.project,
 *     location: google_bigquery_connection.connection.location,
 *     connectionId: google_bigquery_connection.connection.connection_id,
 * });
 * ```
 */
export function getConnectionIamPolicy(args: GetConnectionIamPolicyArgs, opts?: pulumi.InvokeOptions): Promise<GetConnectionIamPolicyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("gcp:bigquery/getConnectionIamPolicy:getConnectionIamPolicy", {
        "connectionId": args.connectionId,
        "location": args.location,
        "project": args.project,
    }, opts);
}

/**
 * A collection of arguments for invoking getConnectionIamPolicy.
 */
export interface GetConnectionIamPolicyArgs {
    /**
     * Optional connection id that should be assigned to the created connection.
     * Used to find the parent resource to bind the IAM policy to
     */
    connectionId: string;
    /**
     * The geographic location where the connection should reside.
     * Cloud SQL instance must be in the same location as the connection
     * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
     * Examples: US, EU, asia-northeast1, us-central1, europe-west1.
     * Spanner Connections same as spanner region
     * AWS allowed regions are aws-us-east-1
     * Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
     */
    location?: string;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: string;
}

/**
 * A collection of values returned by getConnectionIamPolicy.
 */
export interface GetConnectionIamPolicyResult {
    readonly connectionId: string;
    /**
     * (Computed) The etag of the IAM policy.
     */
    readonly etag: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly location: string;
    /**
     * (Required only by `gcp.bigquery.ConnectionIamPolicy`) The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     */
    readonly policyData: string;
    readonly project: string;
}
/**
 * Retrieves the current IAM policy data for connection
 *
 * ## example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const policy = gcp.bigquery.getConnectionIamPolicy({
 *     project: google_bigquery_connection.connection.project,
 *     location: google_bigquery_connection.connection.location,
 *     connectionId: google_bigquery_connection.connection.connection_id,
 * });
 * ```
 */
export function getConnectionIamPolicyOutput(args: GetConnectionIamPolicyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetConnectionIamPolicyResult> {
    return pulumi.output(args).apply((a: any) => getConnectionIamPolicy(a, opts))
}

/**
 * A collection of arguments for invoking getConnectionIamPolicy.
 */
export interface GetConnectionIamPolicyOutputArgs {
    /**
     * Optional connection id that should be assigned to the created connection.
     * Used to find the parent resource to bind the IAM policy to
     */
    connectionId: pulumi.Input<string>;
    /**
     * The geographic location where the connection should reside.
     * Cloud SQL instance must be in the same location as the connection
     * with following exceptions: Cloud SQL us-central1 maps to BigQuery US, Cloud SQL europe-west1 maps to BigQuery EU.
     * Examples: US, EU, asia-northeast1, us-central1, europe-west1.
     * Spanner Connections same as spanner region
     * AWS allowed regions are aws-us-east-1
     * Azure allowed regions are azure-eastus2 Used to find the parent resource to bind the IAM policy to
     */
    location?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     */
    project?: pulumi.Input<string>;
}
