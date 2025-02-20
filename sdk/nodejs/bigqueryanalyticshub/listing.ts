// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * A Bigquery Analytics Hub data exchange listing
 *
 * To get more information about Listing, see:
 *
 * * [API documentation](https://cloud.google.com/bigquery/docs/reference/analytics-hub/rest/v1/projects.locations.dataExchanges.listings)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/bigquery/docs/analytics-hub-introduction)
 *
 * ## Example Usage
 * ### Bigquery Analyticshub Listing Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const listingDataExchange = new gcp.bigqueryanalyticshub.DataExchange("listingDataExchange", {
 *     location: "US",
 *     dataExchangeId: "my_data_exchange",
 *     displayName: "my_data_exchange",
 *     description: "example data exchange",
 * });
 * const listingDataset = new gcp.bigquery.Dataset("listingDataset", {
 *     datasetId: "my_listing",
 *     friendlyName: "my_listing",
 *     description: "example data exchange",
 *     location: "US",
 * });
 * const listingListing = new gcp.bigqueryanalyticshub.Listing("listingListing", {
 *     location: "US",
 *     dataExchangeId: listingDataExchange.dataExchangeId,
 *     listingId: "my_listing",
 *     displayName: "my_listing",
 *     description: "example data exchange",
 *     bigqueryDataset: {
 *         dataset: listingDataset.id,
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Listing can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}` * `{{project}}/{{location}}/{{data_exchange_id}}/{{listing_id}}` * `{{location}}/{{data_exchange_id}}/{{listing_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Listing using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}"
 *
 *  to = google_bigquery_analytics_hub_listing.default }
 *
 * ```sh
 *  $ pulumi import gcp:bigqueryanalyticshub/listing:Listing When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Listing can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:bigqueryanalyticshub/listing:Listing default projects/{{project}}/locations/{{location}}/dataExchanges/{{data_exchange_id}}/listings/{{listing_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:bigqueryanalyticshub/listing:Listing default {{project}}/{{location}}/{{data_exchange_id}}/{{listing_id}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:bigqueryanalyticshub/listing:Listing default {{location}}/{{data_exchange_id}}/{{listing_id}}
 * ```
 */
export class Listing extends pulumi.CustomResource {
    /**
     * Get an existing Listing resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ListingState, opts?: pulumi.CustomResourceOptions): Listing {
        return new Listing(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:bigqueryanalyticshub/listing:Listing';

    /**
     * Returns true if the given object is an instance of Listing.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Listing {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Listing.__pulumiType;
    }

    /**
     * Shared dataset i.e. BigQuery dataset source.
     * Structure is documented below.
     */
    public readonly bigqueryDataset!: pulumi.Output<outputs.bigqueryanalyticshub.ListingBigqueryDataset>;
    /**
     * Categories of the listing. Up to two categories are allowed.
     */
    public readonly categories!: pulumi.Output<string[] | undefined>;
    /**
     * The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
     */
    public readonly dataExchangeId!: pulumi.Output<string>;
    /**
     * Details of the data provider who owns the source data.
     * Structure is documented below.
     */
    public readonly dataProvider!: pulumi.Output<outputs.bigqueryanalyticshub.ListingDataProvider | undefined>;
    /**
     * Short description of the listing. The description must not contain Unicode non-characters and C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF).
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Human-readable display name of the listing. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&) and can't start or end with spaces.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Documentation describing the listing.
     */
    public readonly documentation!: pulumi.Output<string | undefined>;
    /**
     * Base64 encoded image representing the listing.
     */
    public readonly icon!: pulumi.Output<string | undefined>;
    /**
     * The ID of the listing. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
     */
    public readonly listingId!: pulumi.Output<string>;
    /**
     * The name of the location this data exchange listing.
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * Name of the data provider.
     */
    public /*out*/ readonly name!: pulumi.Output<string>;
    /**
     * Email or URL of the primary point of contact of the listing.
     */
    public readonly primaryContact!: pulumi.Output<string | undefined>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * Details of the publisher who owns the listing and who can share the source data.
     * Structure is documented below.
     */
    public readonly publisher!: pulumi.Output<outputs.bigqueryanalyticshub.ListingPublisher | undefined>;
    /**
     * Email or URL of the request access of the listing. Subscribers can use this reference to request access.
     */
    public readonly requestAccess!: pulumi.Output<string | undefined>;

    /**
     * Create a Listing resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ListingArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ListingArgs | ListingState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ListingState | undefined;
            resourceInputs["bigqueryDataset"] = state ? state.bigqueryDataset : undefined;
            resourceInputs["categories"] = state ? state.categories : undefined;
            resourceInputs["dataExchangeId"] = state ? state.dataExchangeId : undefined;
            resourceInputs["dataProvider"] = state ? state.dataProvider : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["documentation"] = state ? state.documentation : undefined;
            resourceInputs["icon"] = state ? state.icon : undefined;
            resourceInputs["listingId"] = state ? state.listingId : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["primaryContact"] = state ? state.primaryContact : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["publisher"] = state ? state.publisher : undefined;
            resourceInputs["requestAccess"] = state ? state.requestAccess : undefined;
        } else {
            const args = argsOrState as ListingArgs | undefined;
            if ((!args || args.bigqueryDataset === undefined) && !opts.urn) {
                throw new Error("Missing required property 'bigqueryDataset'");
            }
            if ((!args || args.dataExchangeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'dataExchangeId'");
            }
            if ((!args || args.displayName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'displayName'");
            }
            if ((!args || args.listingId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'listingId'");
            }
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["bigqueryDataset"] = args ? args.bigqueryDataset : undefined;
            resourceInputs["categories"] = args ? args.categories : undefined;
            resourceInputs["dataExchangeId"] = args ? args.dataExchangeId : undefined;
            resourceInputs["dataProvider"] = args ? args.dataProvider : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["documentation"] = args ? args.documentation : undefined;
            resourceInputs["icon"] = args ? args.icon : undefined;
            resourceInputs["listingId"] = args ? args.listingId : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["primaryContact"] = args ? args.primaryContact : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["publisher"] = args ? args.publisher : undefined;
            resourceInputs["requestAccess"] = args ? args.requestAccess : undefined;
            resourceInputs["name"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Listing.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Listing resources.
 */
export interface ListingState {
    /**
     * Shared dataset i.e. BigQuery dataset source.
     * Structure is documented below.
     */
    bigqueryDataset?: pulumi.Input<inputs.bigqueryanalyticshub.ListingBigqueryDataset>;
    /**
     * Categories of the listing. Up to two categories are allowed.
     */
    categories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
     */
    dataExchangeId?: pulumi.Input<string>;
    /**
     * Details of the data provider who owns the source data.
     * Structure is documented below.
     */
    dataProvider?: pulumi.Input<inputs.bigqueryanalyticshub.ListingDataProvider>;
    /**
     * Short description of the listing. The description must not contain Unicode non-characters and C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF).
     */
    description?: pulumi.Input<string>;
    /**
     * Human-readable display name of the listing. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&) and can't start or end with spaces.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Documentation describing the listing.
     */
    documentation?: pulumi.Input<string>;
    /**
     * Base64 encoded image representing the listing.
     */
    icon?: pulumi.Input<string>;
    /**
     * The ID of the listing. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
     */
    listingId?: pulumi.Input<string>;
    /**
     * The name of the location this data exchange listing.
     */
    location?: pulumi.Input<string>;
    /**
     * Name of the data provider.
     */
    name?: pulumi.Input<string>;
    /**
     * Email or URL of the primary point of contact of the listing.
     */
    primaryContact?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Details of the publisher who owns the listing and who can share the source data.
     * Structure is documented below.
     */
    publisher?: pulumi.Input<inputs.bigqueryanalyticshub.ListingPublisher>;
    /**
     * Email or URL of the request access of the listing. Subscribers can use this reference to request access.
     */
    requestAccess?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Listing resource.
 */
export interface ListingArgs {
    /**
     * Shared dataset i.e. BigQuery dataset source.
     * Structure is documented below.
     */
    bigqueryDataset: pulumi.Input<inputs.bigqueryanalyticshub.ListingBigqueryDataset>;
    /**
     * Categories of the listing. Up to two categories are allowed.
     */
    categories?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the data exchange. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
     */
    dataExchangeId: pulumi.Input<string>;
    /**
     * Details of the data provider who owns the source data.
     * Structure is documented below.
     */
    dataProvider?: pulumi.Input<inputs.bigqueryanalyticshub.ListingDataProvider>;
    /**
     * Short description of the listing. The description must not contain Unicode non-characters and C0 and C1 control codes except tabs (HT), new lines (LF), carriage returns (CR), and page breaks (FF).
     */
    description?: pulumi.Input<string>;
    /**
     * Human-readable display name of the listing. The display name must contain only Unicode letters, numbers (0-9), underscores (_), dashes (-), spaces ( ), ampersands (&) and can't start or end with spaces.
     */
    displayName: pulumi.Input<string>;
    /**
     * Documentation describing the listing.
     */
    documentation?: pulumi.Input<string>;
    /**
     * Base64 encoded image representing the listing.
     */
    icon?: pulumi.Input<string>;
    /**
     * The ID of the listing. Must contain only Unicode letters, numbers (0-9), underscores (_). Should not use characters that require URL-escaping, or characters outside of ASCII, spaces.
     */
    listingId: pulumi.Input<string>;
    /**
     * The name of the location this data exchange listing.
     */
    location: pulumi.Input<string>;
    /**
     * Email or URL of the primary point of contact of the listing.
     */
    primaryContact?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Details of the publisher who owns the listing and who can share the source data.
     * Structure is documented below.
     */
    publisher?: pulumi.Input<inputs.bigqueryanalyticshub.ListingPublisher>;
    /**
     * Email or URL of the request access of the listing. Subscribers can use this reference to request access.
     */
    requestAccess?: pulumi.Input<string>;
}
