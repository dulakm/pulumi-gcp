// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionNetworkFirewallPolicyAssociationArgs;
import com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyAssociationState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * The Compute NetworkFirewallPolicyAssociation resource
 * 
 * ## Example Usage
 * ### Regional
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.RegionNetworkFirewallPolicy;
 * import com.pulumi.gcp.compute.RegionNetworkFirewallPolicyArgs;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.RegionNetworkFirewallPolicyAssociation;
 * import com.pulumi.gcp.compute.RegionNetworkFirewallPolicyAssociationArgs;
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
 *         var basicRegionalNetworkFirewallPolicy = new RegionNetworkFirewallPolicy(&#34;basicRegionalNetworkFirewallPolicy&#34;, RegionNetworkFirewallPolicyArgs.builder()        
 *             .project(&#34;my-project-name&#34;)
 *             .description(&#34;Sample global network firewall policy&#34;)
 *             .region(&#34;us-west1&#34;)
 *             .build());
 * 
 *         var basicNetwork = new Network(&#34;basicNetwork&#34;);
 * 
 *         var primary = new RegionNetworkFirewallPolicyAssociation(&#34;primary&#34;, RegionNetworkFirewallPolicyAssociationArgs.builder()        
 *             .attachmentTarget(basicNetwork.id())
 *             .firewallPolicy(basicRegionalNetworkFirewallPolicy.name())
 *             .project(&#34;my-project-name&#34;)
 *             .region(&#34;us-west1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NetworkFirewallPolicyAssociation can be imported using any of these accepted formats* `projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/associations/{{name}}` * `{{project}}/{{region}}/{{firewall_policy}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import NetworkFirewallPolicyAssociation using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/associations/{{name}}&#34;
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
 * 
 */
@ResourceType(type="gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation")
public class RegionNetworkFirewallPolicyAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The target that the firewall policy is attached to.
     * 
     */
    @Export(name="attachmentTarget", refs={String.class}, tree="[0]")
    private Output<String> attachmentTarget;

    /**
     * @return The target that the firewall policy is attached to.
     * 
     */
    public Output<String> attachmentTarget() {
        return this.attachmentTarget;
    }
    /**
     * The firewall policy ID of the association.
     * 
     */
    @Export(name="firewallPolicy", refs={String.class}, tree="[0]")
    private Output<String> firewallPolicy;

    /**
     * @return The firewall policy ID of the association.
     * 
     */
    public Output<String> firewallPolicy() {
        return this.firewallPolicy;
    }
    /**
     * The name for an association.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for an association.
     * 
     * ***
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The project for the resource
     * 
     */
    @Export(name="project", refs={String.class}, tree="[0]")
    private Output<String> project;

    /**
     * @return The project for the resource
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The location of this resource.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return The location of this resource.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * The short name of the firewall policy of the association.
     * 
     */
    @Export(name="shortName", refs={String.class}, tree="[0]")
    private Output<String> shortName;

    /**
     * @return The short name of the firewall policy of the association.
     * 
     */
    public Output<String> shortName() {
        return this.shortName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionNetworkFirewallPolicyAssociation(String name) {
        this(name, RegionNetworkFirewallPolicyAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionNetworkFirewallPolicyAssociation(String name, RegionNetworkFirewallPolicyAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionNetworkFirewallPolicyAssociation(String name, RegionNetworkFirewallPolicyAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation", name, args == null ? RegionNetworkFirewallPolicyAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionNetworkFirewallPolicyAssociation(String name, Output<String> id, @Nullable RegionNetworkFirewallPolicyAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkFirewallPolicyAssociation:RegionNetworkFirewallPolicyAssociation", name, state, makeResourceOptions(options, id));
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
    public static RegionNetworkFirewallPolicyAssociation get(String name, Output<String> id, @Nullable RegionNetworkFirewallPolicyAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionNetworkFirewallPolicyAssociation(name, id, state, options);
    }
}
