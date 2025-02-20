// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.RegionNetworkFirewallPolicyRuleArgs;
import com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleState;
import com.pulumi.gcp.compute.outputs.RegionNetworkFirewallPolicyRuleMatch;
import com.pulumi.gcp.compute.outputs.RegionNetworkFirewallPolicyRuleTargetSecureTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Compute NetworkFirewallPolicyRule resource
 * 
 * ## Example Usage
 * ### Regional
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networksecurity.AddressGroup;
 * import com.pulumi.gcp.networksecurity.AddressGroupArgs;
 * import com.pulumi.gcp.compute.RegionNetworkFirewallPolicy;
 * import com.pulumi.gcp.compute.RegionNetworkFirewallPolicyArgs;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.tags.TagKey;
 * import com.pulumi.gcp.tags.TagKeyArgs;
 * import com.pulumi.gcp.tags.TagValue;
 * import com.pulumi.gcp.tags.TagValueArgs;
 * import com.pulumi.gcp.compute.RegionNetworkFirewallPolicyRule;
 * import com.pulumi.gcp.compute.RegionNetworkFirewallPolicyRuleArgs;
 * import com.pulumi.gcp.compute.inputs.RegionNetworkFirewallPolicyRuleMatchArgs;
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
 *         var basicRegionalNetworksecurityAddressGroup = new AddressGroup(&#34;basicRegionalNetworksecurityAddressGroup&#34;, AddressGroupArgs.builder()        
 *             .parent(&#34;projects/my-project-name&#34;)
 *             .description(&#34;Sample regional networksecurity_address_group&#34;)
 *             .location(&#34;us-west1&#34;)
 *             .items(&#34;208.80.154.224/32&#34;)
 *             .type(&#34;IPV4&#34;)
 *             .capacity(100)
 *             .build());
 * 
 *         var basicRegionalNetworkFirewallPolicy = new RegionNetworkFirewallPolicy(&#34;basicRegionalNetworkFirewallPolicy&#34;, RegionNetworkFirewallPolicyArgs.builder()        
 *             .description(&#34;Sample regional network firewall policy&#34;)
 *             .project(&#34;my-project-name&#34;)
 *             .region(&#34;us-west1&#34;)
 *             .build());
 * 
 *         var basicNetwork = new Network(&#34;basicNetwork&#34;);
 * 
 *         var basicKey = new TagKey(&#34;basicKey&#34;, TagKeyArgs.builder()        
 *             .description(&#34;For keyname resources.&#34;)
 *             .parent(&#34;organizations/123456789&#34;)
 *             .purpose(&#34;GCE_FIREWALL&#34;)
 *             .shortName(&#34;tagkey&#34;)
 *             .purposeData(Map.of(&#34;network&#34;, basicNetwork.name().applyValue(name -&gt; String.format(&#34;my-project-name/%s&#34;, name))))
 *             .build());
 * 
 *         var basicValue = new TagValue(&#34;basicValue&#34;, TagValueArgs.builder()        
 *             .description(&#34;For valuename resources.&#34;)
 *             .parent(basicKey.name().applyValue(name -&gt; String.format(&#34;tagKeys/%s&#34;, name)))
 *             .shortName(&#34;tagvalue&#34;)
 *             .build());
 * 
 *         var primary = new RegionNetworkFirewallPolicyRule(&#34;primary&#34;, RegionNetworkFirewallPolicyRuleArgs.builder()        
 *             .action(&#34;allow&#34;)
 *             .description(&#34;This is a simple rule description&#34;)
 *             .direction(&#34;INGRESS&#34;)
 *             .disabled(false)
 *             .enableLogging(true)
 *             .firewallPolicy(basicRegionalNetworkFirewallPolicy.name())
 *             .priority(1000)
 *             .region(&#34;us-west1&#34;)
 *             .ruleName(&#34;test-rule&#34;)
 *             .targetServiceAccounts(&#34;my@service-account.com&#34;)
 *             .match(RegionNetworkFirewallPolicyRuleMatchArgs.builder()
 *                 .srcIpRanges(&#34;10.100.0.1/32&#34;)
 *                 .srcFqdns(&#34;example.com&#34;)
 *                 .srcRegionCodes(&#34;US&#34;)
 *                 .srcThreatIntelligences(&#34;iplist-known-malicious-ips&#34;)
 *                 .layer4Configs(RegionNetworkFirewallPolicyRuleMatchLayer4ConfigArgs.builder()
 *                     .ipProtocol(&#34;all&#34;)
 *                     .build())
 *                 .srcSecureTags(RegionNetworkFirewallPolicyRuleMatchSrcSecureTagArgs.builder()
 *                     .name(basicValue.name().applyValue(name -&gt; String.format(&#34;tagValues/%s&#34;, name)))
 *                     .build())
 *                 .srcAddressGroups(basicRegionalNetworksecurityAddressGroup.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NetworkFirewallPolicyRule can be imported using any of these accepted formats* `projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/{{priority}}` * `{{project}}/{{region}}/{{firewall_policy}}/{{priority}}` * `{{region}}/{{firewall_policy}}/{{priority}}` * `{{firewall_policy}}/{{priority}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import NetworkFirewallPolicyRule using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/{{priority}}&#34;
 * 
 *  to = google_compute_region_network_firewall_policy_rule.default }
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), NetworkFirewallPolicyRule can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule default projects/{{project}}/regions/{{region}}/firewallPolicies/{{firewall_policy}}/{{priority}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule default {{project}}/{{region}}/{{firewall_policy}}/{{priority}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule default {{region}}/{{firewall_policy}}/{{priority}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule default {{firewall_policy}}/{{priority}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule")
public class RegionNetworkFirewallPolicyRule extends com.pulumi.resources.CustomResource {
    /**
     * The Action to perform when the client connection triggers the rule. Valid actions are &#34;allow&#34;, &#34;deny&#34; and &#34;goto_next&#34;.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return The Action to perform when the client connection triggers the rule. Valid actions are &#34;allow&#34;, &#34;deny&#34; and &#34;goto_next&#34;.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * An optional description for this resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description for this resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The direction in which this rule applies. Possible values: INGRESS, EGRESS
     * 
     */
    @Export(name="direction", refs={String.class}, tree="[0]")
    private Output<String> direction;

    /**
     * @return The direction in which this rule applies. Possible values: INGRESS, EGRESS
     * 
     */
    public Output<String> direction() {
        return this.direction;
    }
    /**
     * Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Denotes whether the firewall policy rule is disabled. When set to true, the firewall policy rule is not enforced and traffic behaves as if it did not exist. If this is unspecified, the firewall policy rule will be enabled.
     * 
     */
    public Output<Optional<Boolean>> disabled() {
        return Codegen.optional(this.disabled);
    }
    /**
     * Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules.
     * 
     */
    @Export(name="enableLogging", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableLogging;

    /**
     * @return Denotes whether to enable logging for a particular rule. If logging is enabled, logs will be exported to the configured export destination in Stackdriver. Logs may be exported to BigQuery or Pub/Sub. Note: you cannot enable logging on &#34;goto_next&#34; rules.
     * 
     */
    public Output<Optional<Boolean>> enableLogging() {
        return Codegen.optional(this.enableLogging);
    }
    /**
     * The firewall policy of the resource.
     * 
     */
    @Export(name="firewallPolicy", refs={String.class}, tree="[0]")
    private Output<String> firewallPolicy;

    /**
     * @return The firewall policy of the resource.
     * 
     */
    public Output<String> firewallPolicy() {
        return this.firewallPolicy;
    }
    /**
     * Type of the resource. Always `compute#firewallPolicyRule` for firewall policy rules
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return Type of the resource. Always `compute#firewallPolicyRule` for firewall policy rules
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    @Export(name="match", refs={RegionNetworkFirewallPolicyRuleMatch.class}, tree="[0]")
    private Output<RegionNetworkFirewallPolicyRuleMatch> match;

    /**
     * @return A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding &#39;action&#39; is enforced.
     * 
     */
    public Output<RegionNetworkFirewallPolicyRuleMatch> match() {
        return this.match;
    }
    /**
     * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    @Export(name="priority", refs={Integer.class}, tree="[0]")
    private Output<Integer> priority;

    /**
     * @return An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0 is the highest priority and 2147483647 is the lowest prority.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
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
     * An optional name for the rule. This field is not a unique identifier and can be updated.
     * 
     */
    @Export(name="ruleName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ruleName;

    /**
     * @return An optional name for the rule. This field is not a unique identifier and can be updated.
     * 
     */
    public Output<Optional<String>> ruleName() {
        return Codegen.optional(this.ruleName);
    }
    /**
     * Calculation of the complexity of a single firewall policy rule.
     * 
     */
    @Export(name="ruleTupleCount", refs={Integer.class}, tree="[0]")
    private Output<Integer> ruleTupleCount;

    /**
     * @return Calculation of the complexity of a single firewall policy rule.
     * 
     */
    public Output<Integer> ruleTupleCount() {
        return this.ruleTupleCount;
    }
    /**
     * A list of secure tags that controls which instances the firewall rule applies to. If &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the target_secure_tag are in INEFFECTIVE state, then this rule will be ignored. &lt;code&gt;targetSecureTag&lt;/code&gt; may not be set at the same time as &lt;code&gt;targetServiceAccounts&lt;/code&gt;. If neither &lt;code&gt;targetServiceAccounts&lt;/code&gt; nor &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * 
     */
    @Export(name="targetSecureTags", refs={List.class,RegionNetworkFirewallPolicyRuleTargetSecureTag.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RegionNetworkFirewallPolicyRuleTargetSecureTag>> targetSecureTags;

    /**
     * @return A list of secure tags that controls which instances the firewall rule applies to. If &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, then the firewall rule applies only to instances in the VPC network that have one of those EFFECTIVE secure tags, if all the target_secure_tag are in INEFFECTIVE state, then this rule will be ignored. &lt;code&gt;targetSecureTag&lt;/code&gt; may not be set at the same time as &lt;code&gt;targetServiceAccounts&lt;/code&gt;. If neither &lt;code&gt;targetServiceAccounts&lt;/code&gt; nor &lt;code&gt;targetSecureTag&lt;/code&gt; are specified, the firewall rule applies to all instances on the specified network. Maximum number of target label tags allowed is 256.
     * 
     */
    public Output<Optional<List<RegionNetworkFirewallPolicyRuleTargetSecureTag>>> targetSecureTags() {
        return Codegen.optional(this.targetSecureTags);
    }
    /**
     * A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    @Export(name="targetServiceAccounts", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> targetServiceAccounts;

    /**
     * @return A list of service accounts indicating the sets of instances that are applied with this rule.
     * 
     */
    public Output<Optional<List<String>>> targetServiceAccounts() {
        return Codegen.optional(this.targetServiceAccounts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionNetworkFirewallPolicyRule(String name) {
        this(name, RegionNetworkFirewallPolicyRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionNetworkFirewallPolicyRule(String name, RegionNetworkFirewallPolicyRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionNetworkFirewallPolicyRule(String name, RegionNetworkFirewallPolicyRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule", name, args == null ? RegionNetworkFirewallPolicyRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegionNetworkFirewallPolicyRule(String name, Output<String> id, @Nullable RegionNetworkFirewallPolicyRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/regionNetworkFirewallPolicyRule:RegionNetworkFirewallPolicyRule", name, state, makeResourceOptions(options, id));
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
    public static RegionNetworkFirewallPolicyRule get(String name, Output<String> id, @Nullable RegionNetworkFirewallPolicyRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegionNetworkFirewallPolicyRule(name, id, state, options);
    }
}
