// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * TrustConfig represents a resource that represents your Public Key Infrastructure (PKI) configuration in Certificate Manager for use in mutual TLS authentication scenarios.
 *
 * To get more information about TrustConfig, see:
 *
 * * [API documentation](https://cloud.google.com/certificate-manager/docs/reference/certificate-manager/rest/v1/projects.locations.trustConfigs/create)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/certificate-manager/docs)
 *
 * > **Warning:** All arguments including the following potentially sensitive
 * values will be stored in the raw state as plain text: `trust_stores.trust_stores.trust_anchors.trust_anchors.pem_certificate`, `trust_stores.trust_stores.intermediate_cas.intermediate_cas.pem_certificate`.
 * Read more about sensitive data in state.
 *
 * ## Example Usage
 * ### Certificate Manager Trust Config
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const _default = new gcp.certificatemanager.TrustConfig("default", {
 *     description: "sample description for the trust config",
 *     location: "us-central1",
 *     trustStores: [{
 *         trustAnchors: [{
 *             pemCertificate: fs.readFileSync("test-fixtures/cert.pem"),
 *         }],
 *         intermediateCas: [{
 *             pemCertificate: fs.readFileSync("test-fixtures/cert.pem"),
 *         }],
 *     }],
 *     labels: {
 *         foo: "bar",
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * TrustConfig can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/trustConfigs/{{name}}` * `{{project}}/{{location}}/{{name}}` * `{{location}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import TrustConfig using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/locations/{{location}}/trustConfigs/{{name}}"
 *
 *  to = google_certificate_manager_trust_config.default }
 *
 * ```sh
 *  $ pulumi import gcp:certificatemanager/trustConfig:TrustConfig When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), TrustConfig can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:certificatemanager/trustConfig:TrustConfig default projects/{{project}}/locations/{{location}}/trustConfigs/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:certificatemanager/trustConfig:TrustConfig default {{project}}/{{location}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:certificatemanager/trustConfig:TrustConfig default {{location}}/{{name}}
 * ```
 */
export class TrustConfig extends pulumi.CustomResource {
    /**
     * Get an existing TrustConfig resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TrustConfigState, opts?: pulumi.CustomResourceOptions): TrustConfig {
        return new TrustConfig(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:certificatemanager/trustConfig:TrustConfig';

    /**
     * Returns true if the given object is an instance of TrustConfig.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TrustConfig {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TrustConfig.__pulumiType;
    }

    /**
     * The creation timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     * Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly createTime!: pulumi.Output<string>;
    /**
     * One or more paragraphs of text description of a trust config.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * Set of label tags associated with the trust config.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The trust config location.
     *
     *
     * - - -
     */
    public readonly location!: pulumi.Output<string>;
    /**
     * A user-defined name of the trust config. Trust config names must be unique globally.
     */
    public readonly name!: pulumi.Output<string>;
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
     * Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     */
    public readonly trustStores!: pulumi.Output<outputs.certificatemanager.TrustConfigTrustStore[] | undefined>;
    /**
     * The last update timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     * Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    public /*out*/ readonly updateTime!: pulumi.Output<string>;

    /**
     * Create a TrustConfig resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TrustConfigArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TrustConfigArgs | TrustConfigState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TrustConfigState | undefined;
            resourceInputs["createTime"] = state ? state.createTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["location"] = state ? state.location : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["trustStores"] = state ? state.trustStores : undefined;
            resourceInputs["updateTime"] = state ? state.updateTime : undefined;
        } else {
            const args = argsOrState as TrustConfigArgs | undefined;
            if ((!args || args.location === undefined) && !opts.urn) {
                throw new Error("Missing required property 'location'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["location"] = args ? args.location : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["trustStores"] = args ? args.trustStores : undefined;
            resourceInputs["createTime"] = undefined /*out*/;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["updateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(TrustConfig.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TrustConfig resources.
 */
export interface TrustConfigState {
    /**
     * The creation timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     * Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    createTime?: pulumi.Input<string>;
    /**
     * One or more paragraphs of text description of a trust config.
     */
    description?: pulumi.Input<string>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Set of label tags associated with the trust config.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The trust config location.
     *
     *
     * - - -
     */
    location?: pulumi.Input<string>;
    /**
     * A user-defined name of the trust config. Trust config names must be unique globally.
     */
    name?: pulumi.Input<string>;
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
     * Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     */
    trustStores?: pulumi.Input<pulumi.Input<inputs.certificatemanager.TrustConfigTrustStore>[]>;
    /**
     * The last update timestamp of a TrustConfig.
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     * Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     */
    updateTime?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TrustConfig resource.
 */
export interface TrustConfigArgs {
    /**
     * One or more paragraphs of text description of a trust config.
     */
    description?: pulumi.Input<string>;
    /**
     * Set of label tags associated with the trust config.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effectiveLabels` for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The trust config location.
     *
     *
     * - - -
     */
    location: pulumi.Input<string>;
    /**
     * A user-defined name of the trust config. Trust config names must be unique globally.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * Set of trust stores to perform validation against.
     * This field is supported when TrustConfig is configured with Load Balancers, currently not supported for SPIFFE certificate validation.
     * Structure is documented below.
     */
    trustStores?: pulumi.Input<pulumi.Input<inputs.certificatemanager.TrustConfigTrustStore>[]>;
}
