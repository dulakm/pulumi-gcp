// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgenetwork;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.edgenetwork.SubnetArgs;
import com.pulumi.gcp.edgenetwork.inputs.SubnetState;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Distributed Cloud Edge subnet, which provides L2 isolation within a network.
 * 
 * To get more information about Subnet, see:
 * 
 * * [API documentation](https://cloud.google.com/distributed-cloud/edge/latest/docs/reference/network/rest/v1/projects.locations.zones.subnets)
 * * How-to Guides
 *     * [Create and manage subnetworks](https://cloud.google.com/distributed-cloud/edge/latest/docs/subnetworks#api)
 * 
 * ## Example Usage
 * ### Edgenetwork Subnet
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.edgenetwork.Network;
 * import com.pulumi.gcp.edgenetwork.NetworkArgs;
 * import com.pulumi.gcp.edgenetwork.Subnet;
 * import com.pulumi.gcp.edgenetwork.SubnetArgs;
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
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .networkId(&#34;example-network&#34;)
 *             .location(&#34;us-west1&#34;)
 *             .zone(&#34;&#34;)
 *             .description(&#34;Example network.&#34;)
 *             .mtu(9000)
 *             .build());
 * 
 *         var exampleSubnet = new Subnet(&#34;exampleSubnet&#34;, SubnetArgs.builder()        
 *             .subnetId(&#34;example-subnet&#34;)
 *             .location(&#34;us-west1&#34;)
 *             .zone(&#34;&#34;)
 *             .description(&#34;Example subnet.&#34;)
 *             .network(exampleNetwork.id())
 *             .ipv4Cidrs(&#34;4.4.4.1/24&#34;)
 *             .labels(Map.of(&#34;environment&#34;, &#34;dev&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Edgenetwork Subnet With Vlan Id
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.edgenetwork.Network;
 * import com.pulumi.gcp.edgenetwork.NetworkArgs;
 * import com.pulumi.gcp.edgenetwork.Subnet;
 * import com.pulumi.gcp.edgenetwork.SubnetArgs;
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
 *         var exampleNetwork = new Network(&#34;exampleNetwork&#34;, NetworkArgs.builder()        
 *             .networkId(&#34;example-network&#34;)
 *             .location(&#34;us-west1&#34;)
 *             .zone(&#34;&#34;)
 *             .description(&#34;Example network.&#34;)
 *             .mtu(9000)
 *             .build());
 * 
 *         var exampleSubnetWithVlanId = new Subnet(&#34;exampleSubnetWithVlanId&#34;, SubnetArgs.builder()        
 *             .subnetId(&#34;example-subnet-with-vlan-id&#34;)
 *             .location(&#34;us-west1&#34;)
 *             .zone(&#34;&#34;)
 *             .description(&#34;Example subnet with VLAN ID.&#34;)
 *             .network(exampleNetwork.id())
 *             .ipv6Cidrs(&#34;4444:4444:4444:4444::1/64&#34;)
 *             .vlanId(44)
 *             .labels(Map.of(&#34;environment&#34;, &#34;dev&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Subnet can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/zones/{{zone}}/subnets/{{subnet_id}}` * `{{project}}/{{location}}/{{zone}}/{{subnet_id}}` * `{{location}}/{{zone}}/{{subnet_id}}` * `{{location}}/{{subnet_id}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Subnet using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{location}}/zones/{{zone}}/subnets/{{subnet_id}}&#34;
 * 
 *  to = google_edgenetwork_subnet.default }
 * 
 * ```sh
 *  $ pulumi import gcp:edgenetwork/subnet:Subnet When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Subnet can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:edgenetwork/subnet:Subnet default projects/{{project}}/locations/{{location}}/zones/{{zone}}/subnets/{{subnet_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:edgenetwork/subnet:Subnet default {{project}}/{{location}}/{{zone}}/{{subnet_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:edgenetwork/subnet:Subnet default {{location}}/{{zone}}/{{subnet_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:edgenetwork/subnet:Subnet default {{location}}/{{subnet_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:edgenetwork/subnet:Subnet default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:edgenetwork/subnet:Subnet")
public class Subnet extends com.pulumi.resources.CustomResource {
    /**
     * The time when the subnet was created.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: `2014-10-02T15:01:23Z` and `2014-10-02T15:01:23.045123456Z`.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the subnet was created.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: `2014-10-02T15:01:23Z` and `2014-10-02T15:01:23.045123456Z`.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * A free-text description of the resource. Max length 1024 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A free-text description of the resource. Max length 1024 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The ranges of ipv4 addresses that are owned by this subnetwork, in CIDR format.
     * 
     */
    @Export(name="ipv4Cidrs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ipv4Cidrs;

    /**
     * @return The ranges of ipv4 addresses that are owned by this subnetwork, in CIDR format.
     * 
     */
    public Output<Optional<List<String>>> ipv4Cidrs() {
        return Codegen.optional(this.ipv4Cidrs);
    }
    /**
     * The ranges of ipv6 addresses that are owned by this subnetwork, in CIDR format.
     * 
     */
    @Export(name="ipv6Cidrs", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> ipv6Cidrs;

    /**
     * @return The ranges of ipv6 addresses that are owned by this subnetwork, in CIDR format.
     * 
     */
    public Output<Optional<List<String>>> ipv6Cidrs() {
        return Codegen.optional(this.ipv6Cidrs);
    }
    /**
     * Labels associated with this resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels associated with this resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The Google Cloud region to which the target Distributed Cloud Edge zone belongs.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The Google Cloud region to which the target Distributed Cloud Edge zone belongs.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The canonical name of this resource, with format
     * `projects/{{project}}/locations/{{location}}/zones/{{zone}}/subnets/{{subnet_id}}`
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The canonical name of this resource, with format
     * `projects/{{project}}/locations/{{location}}/zones/{{zone}}/subnets/{{subnet_id}}`
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the network to which this router belongs.
     * Must be of the form: `projects/{{project}}/locations/{{location}}/zones/{{zone}}/networks/{{network_id}}`
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return The ID of the network to which this router belongs.
     * Must be of the form: `projects/{{project}}/locations/{{location}}/zones/{{zone}}/networks/{{network_id}}`
     * 
     */
    public Output<String> network() {
        return this.network;
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
     * Current stage of the resource to the device by config push.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return Current stage of the resource to the device by config push.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * A unique ID that identifies this subnet.
     * 
     * ***
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output<String> subnetId;

    /**
     * @return A unique ID that identifies this subnet.
     * 
     * ***
     * 
     */
    public Output<String> subnetId() {
        return this.subnetId;
    }
    /**
     * The time when the subnet was last updated.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: `2014-10-02T15:01:23Z` and `2014-10-02T15:01:23.045123456Z`.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The time when the subnet was last updated.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine
     * fractional digits. Examples: `2014-10-02T15:01:23Z` and `2014-10-02T15:01:23.045123456Z`.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * VLAN ID for this subnetwork. If not specified, one is assigned automatically.
     * 
     */
    @Export(name="vlanId", refs={Integer.class}, tree="[0]")
    private Output<Integer> vlanId;

    /**
     * @return VLAN ID for this subnetwork. If not specified, one is assigned automatically.
     * 
     */
    public Output<Integer> vlanId() {
        return this.vlanId;
    }
    /**
     * The name of the target Distributed Cloud Edge zone.
     * 
     */
    @Export(name="zone", refs={String.class}, tree="[0]")
    private Output<String> zone;

    /**
     * @return The name of the target Distributed Cloud Edge zone.
     * 
     */
    public Output<String> zone() {
        return this.zone;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Subnet(String name) {
        this(name, SubnetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Subnet(String name, SubnetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Subnet(String name, SubnetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:edgenetwork/subnet:Subnet", name, args == null ? SubnetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Subnet(String name, Output<String> id, @Nullable SubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:edgenetwork/subnet:Subnet", name, state, makeResourceOptions(options, id));
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
    public static Subnet get(String name, Output<String> id, @Nullable SubnetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Subnet(name, id, state, options);
    }
}
