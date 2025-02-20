// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.compute.NetworkAttachmentArgs;
import com.pulumi.gcp.compute.inputs.NetworkAttachmentState;
import com.pulumi.gcp.compute.outputs.NetworkAttachmentConnectionEndpoint;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Network Attachment Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.Subnetwork;
 * import com.pulumi.gcp.compute.SubnetworkArgs;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.compute.NetworkAttachment;
 * import com.pulumi.gcp.compute.NetworkAttachmentArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultSubnetwork = new Subnetwork(&#34;defaultSubnetwork&#34;, SubnetworkArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .network(defaultNetwork.id())
 *             .ipCidrRange(&#34;10.0.0.0/16&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var rejectedProducerProject = new Project(&#34;rejectedProducerProject&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;prj-rejected&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .billingAccount(&#34;000000-0000000-0000000-000000&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var acceptedProducerProject = new Project(&#34;acceptedProducerProject&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;prj-accepted&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .billingAccount(&#34;000000-0000000-0000000-000000&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultNetworkAttachment = new NetworkAttachment(&#34;defaultNetworkAttachment&#34;, NetworkAttachmentArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .description(&#34;basic network attachment description&#34;)
 *             .connectionPreference(&#34;ACCEPT_MANUAL&#34;)
 *             .subnetworks(defaultSubnetwork.selfLink())
 *             .producerAcceptLists(acceptedProducerProject.projectId())
 *             .producerRejectLists(rejectedProducerProject.projectId())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Network Attachment Instance Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.Subnetwork;
 * import com.pulumi.gcp.compute.SubnetworkArgs;
 * import com.pulumi.gcp.compute.NetworkAttachment;
 * import com.pulumi.gcp.compute.NetworkAttachmentArgs;
 * import com.pulumi.gcp.compute.Instance;
 * import com.pulumi.gcp.compute.InstanceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs;
 * import com.pulumi.resources.CustomResourceOptions;
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
 *         var defaultNetwork = new Network(&#34;defaultNetwork&#34;, NetworkArgs.builder()        
 *             .autoCreateSubnetworks(false)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultSubnetwork = new Subnetwork(&#34;defaultSubnetwork&#34;, SubnetworkArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .network(defaultNetwork.id())
 *             .ipCidrRange(&#34;10.0.0.0/16&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultNetworkAttachment = new NetworkAttachment(&#34;defaultNetworkAttachment&#34;, NetworkAttachmentArgs.builder()        
 *             .region(&#34;us-central1&#34;)
 *             .description(&#34;my basic network attachment&#34;)
 *             .subnetworks(defaultSubnetwork.id())
 *             .connectionPreference(&#34;ACCEPT_AUTOMATIC&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultInstance = new Instance(&#34;defaultInstance&#34;, InstanceArgs.builder()        
 *             .zone(&#34;us-central1-a&#34;)
 *             .machineType(&#34;e2-micro&#34;)
 *             .bootDisk(InstanceBootDiskArgs.builder()
 *                 .initializeParams(InstanceBootDiskInitializeParamsArgs.builder()
 *                     .image(&#34;debian-cloud/debian-11&#34;)
 *                     .build())
 *                 .build())
 *             .networkInterfaces(            
 *                 InstanceNetworkInterfaceArgs.builder()
 *                     .network(&#34;default&#34;)
 *                     .build(),
 *                 InstanceNetworkInterfaceArgs.builder()
 *                     .networkAttachment(defaultNetworkAttachment.selfLink())
 *                     .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * NetworkAttachment can be imported using any of these accepted formats* `projects/{{project}}/regions/{{region}}/networkAttachments/{{name}}` * `{{project}}/{{region}}/{{name}}` * `{{region}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import NetworkAttachment using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/regions/{{region}}/networkAttachments/{{name}}&#34;
 * 
 *  to = google_compute_network_attachment.default }
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkAttachment:NetworkAttachment When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), NetworkAttachment can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkAttachment:NetworkAttachment default projects/{{project}}/regions/{{region}}/networkAttachments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkAttachment:NetworkAttachment default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkAttachment:NetworkAttachment default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/networkAttachment:NetworkAttachment default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/networkAttachment:NetworkAttachment")
public class NetworkAttachment extends com.pulumi.resources.CustomResource {
    /**
     * An array of connections for all the producers connected to this network attachment.
     * Structure is documented below.
     * 
     */
    @Export(name="connectionEndpoints", refs={List.class,NetworkAttachmentConnectionEndpoint.class}, tree="[0,1]")
    private Output<List<NetworkAttachmentConnectionEndpoint>> connectionEndpoints;

    /**
     * @return An array of connections for all the producers connected to this network attachment.
     * Structure is documented below.
     * 
     */
    public Output<List<NetworkAttachmentConnectionEndpoint>> connectionEndpoints() {
        return this.connectionEndpoints;
    }
    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * Possible values are: `ACCEPT_AUTOMATIC`, `ACCEPT_MANUAL`, `INVALID`.
     * 
     */
    @Export(name="connectionPreference", refs={String.class}, tree="[0]")
    private Output<String> connectionPreference;

    /**
     * @return The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * Possible values are: `ACCEPT_AUTOMATIC`, `ACCEPT_MANUAL`, `INVALID`.
     * 
     */
    public Output<String> connectionPreference() {
        return this.connectionPreference;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Export(name="creationTimestamp", refs={String.class}, tree="[0]")
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This
     * field is used in optimistic locking. An up-to-date fingerprint must be provided in order to patch.
     * 
     */
    @Export(name="fingerprint", refs={String.class}, tree="[0]")
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This
     * field is used in optimistic locking. An up-to-date fingerprint must be provided in order to patch.
     * 
     */
    public Output<String> fingerprint() {
        return this.fingerprint;
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="kind", refs={String.class}, tree="[0]")
    private Output<String> kind;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression a-z? which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The URL of the network which the Network Attachment belongs to. Practically it is inferred by fetching the network of the first subnetwork associated.
     * Because it is required that all the subnetworks must be from the same network, it is assured that the Network Attachment belongs to the same network as all the subnetworks.
     * 
     */
    @Export(name="network", refs={String.class}, tree="[0]")
    private Output<String> network;

    /**
     * @return The URL of the network which the Network Attachment belongs to. Practically it is inferred by fetching the network of the first subnetwork associated.
     * Because it is required that all the subnetworks must be from the same network, it is assured that the Network Attachment belongs to the same network as all the subnetworks.
     * 
     */
    public Output<String> network() {
        return this.network;
    }
    /**
     * Projects that are allowed to connect to this network attachment. The project can be specified using its id or number.
     * 
     */
    @Export(name="producerAcceptLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> producerAcceptLists;

    /**
     * @return Projects that are allowed to connect to this network attachment. The project can be specified using its id or number.
     * 
     */
    public Output<Optional<List<String>>> producerAcceptLists() {
        return Codegen.optional(this.producerAcceptLists);
    }
    /**
     * Projects that are not allowed to connect to this network attachment. The project can be specified using its id or number.
     * 
     */
    @Export(name="producerRejectLists", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> producerRejectLists;

    /**
     * @return Projects that are not allowed to connect to this network attachment. The project can be specified using its id or number.
     * 
     */
    public Output<Optional<List<String>>> producerRejectLists() {
        return Codegen.optional(this.producerRejectLists);
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
     * URL of the region where the network attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     * ***
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return URL of the region where the network attachment resides. This field applies only to the region resource. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     * ***
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource&#39;s resource id.
     * 
     */
    @Export(name="selfLinkWithId", refs={String.class}, tree="[0]")
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource&#39;s resource id.
     * 
     */
    public Output<String> selfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * An array of URLs where each entry is the URL of a subnet provided by the service consumer to use for endpoints in the producers that connect to this network attachment.
     * 
     */
    @Export(name="subnetworks", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetworks;

    /**
     * @return An array of URLs where each entry is the URL of a subnet provided by the service consumer to use for endpoints in the producers that connect to this network attachment.
     * 
     */
    public Output<List<String>> subnetworks() {
        return this.subnetworks;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NetworkAttachment(String name) {
        this(name, NetworkAttachmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NetworkAttachment(String name, NetworkAttachmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NetworkAttachment(String name, NetworkAttachmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkAttachment:NetworkAttachment", name, args == null ? NetworkAttachmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NetworkAttachment(String name, Output<String> id, @Nullable NetworkAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/networkAttachment:NetworkAttachment", name, state, makeResourceOptions(options, id));
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
    public static NetworkAttachment get(String name, Output<String> id, @Nullable NetworkAttachmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NetworkAttachment(name, id, state, options);
    }
}
