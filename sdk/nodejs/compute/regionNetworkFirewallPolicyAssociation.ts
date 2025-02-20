// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * The Compute NetworkFirewallPolicyAssociation resource
 *
 * ## Example Usage
 * ### Regional
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const basicRegionalNetworkFirewallPolicy = new gcp.compute.RegionNetworkFirewallPolicy("basicRegionalNetworkFirewallPolicy", {
 *     project: "my-project-name",
 *     description: "Sample global network firewall policy",
 *     region: "us-west1",
 * });
 * const basicNetwork = new gcp.compute.Network("basicNetwork", {});
 * const primary = new gcp.compute.RegionNetworkFirewallPolicyAssociation("primary", {
 *     attachmentTarget: basicNetwork.id,
 *     firewallPolicy: basicRegionalNetworkFirewallPolicy.name,
 *     project: "my-project-name",
 *     region: "us-west1",
 * });
 * ```
 *
 * ## Import
 *
 * NetworkFirewallPolicyAssociation can be imported using any of these accepted formats* `projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/associations/{{name}}` * `{{project}}/{{region}}/{{firewall_policy}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import NetworkFirewallPolicyAssociation using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/associations/{{name}}"
 *
 *  to = google_compute_region_network_firewall_policy_association.default }
 *
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), NetworkFirewallPolicyAssociation can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation default projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/associations/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation default {{project}}/{{region}}/{{firewall_policy}}/{{name}}
 * ```
 */
export class RegionNetworkFirewallPolicyAssociation extends pulumi.CustomResource {
    /**
     * Get an existing RegionNetworkFirewallPolicyAssociation resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: RegionNetworkFirewallPolicyAssociationState, opts?: pulumi.CustomResourceOptions): RegionNetworkFirewallPolicyAssociation {
        return new RegionNetworkFirewallPolicyAssociation(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation';

    /**
     * Returns true if the given object is an instance of RegionNetworkFirewallPolicyAssociation.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is RegionNetworkFirewallPolicyAssociation {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === RegionNetworkFirewallPolicyAssociation.__pulumiType;
    }

    /**
     * The target that the firewall policy is attached to.
     */
    public readonly attachmentTarget!: pulumi.Output<string>;
    /**
     * The firewall policy ID of the association.
     */
    public readonly firewallPolicy!: pulumi.Output<string>;
    /**
     * The name for an association.
     *
     *
     *
     * - - -
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The project for the resource
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The location of this resource.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * The short name of the firewall policy of the association.
     */
    public /*out*/ readonly shortName!: pulumi.Output<string>;

    /**
     * Create a RegionNetworkFirewallPolicyAssociation resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: RegionNetworkFirewallPolicyAssociationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: RegionNetworkFirewallPolicyAssociationArgs | RegionNetworkFirewallPolicyAssociationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as RegionNetworkFirewallPolicyAssociationState | undefined;
            resourceInputs["attachmentTarget"] = state ? state.attachmentTarget : undefined;
            resourceInputs["firewallPolicy"] = state ? state.firewallPolicy : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["shortName"] = state ? state.shortName : undefined;
        } else {
            const args = argsOrState as RegionNetworkFirewallPolicyAssociationArgs | undefined;
            if ((!args || args.attachmentTarget === undefined) && !opts.urn) {
                throw new Error("Missing required property 'attachmentTarget'");
            }
            if ((!args || args.firewallPolicy === undefined) && !opts.urn) {
                throw new Error("Missing required property 'firewallPolicy'");
            }
            resourceInputs["attachmentTarget"] = args ? args.attachmentTarget : undefined;
            resourceInputs["firewallPolicy"] = args ? args.firewallPolicy : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["shortName"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(RegionNetworkFirewallPolicyAssociation.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering RegionNetworkFirewallPolicyAssociation resources.
 */
export interface RegionNetworkFirewallPolicyAssociationState {
    /**
     * The target that the firewall policy is attached to.
     */
    attachmentTarget?: pulumi.Input<string>;
    /**
     * The firewall policy ID of the association.
     */
    firewallPolicy?: pulumi.Input<string>;
    /**
     * The name for an association.
     *
     *
     *
     * - - -
     */
    name?: pulumi.Input<string>;
    /**
     * The project for the resource
     */
    project?: pulumi.Input<string>;
    /**
     * The location of this resource.
     */
    region?: pulumi.Input<string>;
    /**
     * The short name of the firewall policy of the association.
     */
    shortName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a RegionNetworkFirewallPolicyAssociation resource.
 */
export interface RegionNetworkFirewallPolicyAssociationArgs {
    /**
     * The target that the firewall policy is attached to.
     */
    attachmentTarget: pulumi.Input<string>;
    /**
     * The firewall policy ID of the association.
     */
    firewallPolicy: pulumi.Input<string>;
    /**
     * The name for an association.
     *
     *
     *
     * - - -
     */
    name?: pulumi.Input<string>;
    /**
     * The project for the resource
     */
    project?: pulumi.Input<string>;
    /**
     * The location of this resource.
     */
    region?: pulumi.Input<string>;
}
