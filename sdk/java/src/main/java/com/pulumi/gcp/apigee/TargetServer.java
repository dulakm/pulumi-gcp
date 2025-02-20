// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigee.TargetServerArgs;
import com.pulumi.gcp.apigee.inputs.TargetServerState;
import com.pulumi.gcp.apigee.outputs.TargetServerSSlInfo;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * TargetServer configuration. TargetServers are used to decouple a proxy TargetEndpoint HTTPTargetConnections from concrete URLs for backend services.
 * 
 * To get more information about TargetServer, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments.targetservers/create)
 * * How-to Guides
 *     * [Load balancing across backend servers](https://cloud.google.com/apigee/docs/api-platform/deploy/load-balancing-across-backend-servers)
 * 
 * ## Example Usage
 * ### Apigee Target Server Test Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.Project;
 * import com.pulumi.gcp.organizations.ProjectArgs;
 * import com.pulumi.gcp.projects.Service;
 * import com.pulumi.gcp.projects.ServiceArgs;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.NetworkArgs;
 * import com.pulumi.gcp.compute.GlobalAddress;
 * import com.pulumi.gcp.compute.GlobalAddressArgs;
 * import com.pulumi.gcp.servicenetworking.Connection;
 * import com.pulumi.gcp.servicenetworking.ConnectionArgs;
 * import com.pulumi.gcp.apigee.Organization;
 * import com.pulumi.gcp.apigee.OrganizationArgs;
 * import com.pulumi.gcp.apigee.Environment;
 * import com.pulumi.gcp.apigee.EnvironmentArgs;
 * import com.pulumi.gcp.apigee.TargetServer;
 * import com.pulumi.gcp.apigee.TargetServerArgs;
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
 *         var project = new Project(&#34;project&#34;, ProjectArgs.builder()        
 *             .projectId(&#34;my-project&#34;)
 *             .orgId(&#34;123456789&#34;)
 *             .billingAccount(&#34;000000-0000000-0000000-000000&#34;)
 *             .build());
 * 
 *         var apigee = new Service(&#34;apigee&#34;, ServiceArgs.builder()        
 *             .project(project.projectId())
 *             .service(&#34;apigee.googleapis.com&#34;)
 *             .build());
 * 
 *         var servicenetworking = new Service(&#34;servicenetworking&#34;, ServiceArgs.builder()        
 *             .project(project.projectId())
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(apigee)
 *                 .build());
 * 
 *         var compute = new Service(&#34;compute&#34;, ServiceArgs.builder()        
 *             .project(project.projectId())
 *             .service(&#34;compute.googleapis.com&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(servicenetworking)
 *                 .build());
 * 
 *         var apigeeNetwork = new Network(&#34;apigeeNetwork&#34;, NetworkArgs.builder()        
 *             .project(project.projectId())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(compute)
 *                 .build());
 * 
 *         var apigeeRange = new GlobalAddress(&#34;apigeeRange&#34;, GlobalAddressArgs.builder()        
 *             .purpose(&#34;VPC_PEERING&#34;)
 *             .addressType(&#34;INTERNAL&#34;)
 *             .prefixLength(16)
 *             .network(apigeeNetwork.id())
 *             .project(project.projectId())
 *             .build());
 * 
 *         var apigeeVpcConnection = new Connection(&#34;apigeeVpcConnection&#34;, ConnectionArgs.builder()        
 *             .network(apigeeNetwork.id())
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .reservedPeeringRanges(apigeeRange.name())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(servicenetworking)
 *                 .build());
 * 
 *         var apigeeOrg = new Organization(&#34;apigeeOrg&#34;, OrganizationArgs.builder()        
 *             .analyticsRegion(&#34;us-central1&#34;)
 *             .projectId(project.projectId())
 *             .authorizedNetwork(apigeeNetwork.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     apigeeVpcConnection,
 *                     apigee)
 *                 .build());
 * 
 *         var apigeeEnvironment = new Environment(&#34;apigeeEnvironment&#34;, EnvironmentArgs.builder()        
 *             .orgId(apigeeOrg.id())
 *             .description(&#34;Apigee Environment&#34;)
 *             .displayName(&#34;environment-1&#34;)
 *             .build());
 * 
 *         var apigeeTargetServer = new TargetServer(&#34;apigeeTargetServer&#34;, TargetServerArgs.builder()        
 *             .description(&#34;Apigee Target Server&#34;)
 *             .protocol(&#34;HTTP&#34;)
 *             .host(&#34;abc.foo.com&#34;)
 *             .port(8080)
 *             .envId(apigeeEnvironment.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * TargetServer can be imported using any of these accepted formats* `{{env_id}}/targetservers/{{name}}` * `{{env_id}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import TargetServer using one of the formats above. For exampletf import {
 * 
 *  id = &#34;{{env_id}}/targetservers/{{name}}&#34;
 * 
 *  to = google_apigee_target_server.default }
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/targetServer:TargetServer When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), TargetServer can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/targetServer:TargetServer default {{env_id}}/targetservers/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/targetServer:TargetServer default {{env_id}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/targetServer:TargetServer")
public class TargetServer extends com.pulumi.resources.CustomResource {
    /**
     * A human-readable description of this TargetServer.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A human-readable description of this TargetServer.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/environments/{{env_name}}`.
     * 
     * ***
     * 
     */
    @Export(name="envId", refs={String.class}, tree="[0]")
    private Output<String> envId;

    /**
     * @return The Apigee environment group associated with the Apigee environment,
     * in the format `organizations/{{org_name}}/environments/{{env_name}}`.
     * 
     * ***
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }
    /**
     * The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    @Export(name="host", refs={String.class}, tree="[0]")
    private Output<String> host;

    /**
     * @return The host name this target connects to. Value must be a valid hostname as described by RFC-1123.
     * 
     */
    public Output<String> host() {
        return this.host;
    }
    /**
     * Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    @Export(name="isEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Enabling/disabling a TargetServer is useful when TargetServers are used in load balancing configurations, and one or more TargetServers need to taken out of rotation periodically. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> isEnabled() {
        return Codegen.optional(this.isEnabled);
    }
    /**
     * The resource id of this reference. Values must match the regular expression [\w\s-.]+.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource id of this reference. Values must match the regular expression [\w\s-.]+.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return The port number this target connects to on the given host. Value must be between 1 and 65535, inclusive.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * Immutable. The protocol used by this TargetServer.
     * Possible values are: `HTTP`, `HTTP2`, `GRPC_TARGET`, `GRPC`, `EXTERNAL_CALLOUT`.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output<String> protocol;

    /**
     * @return Immutable. The protocol used by this TargetServer.
     * Possible values are: `HTTP`, `HTTP2`, `GRPC_TARGET`, `GRPC`, `EXTERNAL_CALLOUT`.
     * 
     */
    public Output<String> protocol() {
        return this.protocol;
    }
    /**
     * Specifies TLS configuration info for this TargetServer. The JSON name is sSLInfo for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * Structure is documented below.
     * 
     */
    @Export(name="sSlInfo", refs={TargetServerSSlInfo.class}, tree="[0]")
    private Output</* @Nullable */ TargetServerSSlInfo> sSlInfo;

    /**
     * @return Specifies TLS configuration info for this TargetServer. The JSON name is sSLInfo for legacy/backwards compatibility reasons -- Edge originally supported SSL, and the name is still used for TLS configuration.
     * Structure is documented below.
     * 
     */
    public Output<Optional<TargetServerSSlInfo>> sSlInfo() {
        return Codegen.optional(this.sSlInfo);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TargetServer(String name) {
        this(name, TargetServerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TargetServer(String name, TargetServerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TargetServer(String name, TargetServerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/targetServer:TargetServer", name, args == null ? TargetServerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TargetServer(String name, Output<String> id, @Nullable TargetServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/targetServer:TargetServer", name, state, makeResourceOptions(options, id));
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
    public static TargetServer get(String name, Output<String> id, @Nullable TargetServerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TargetServer(name, id, state, options);
    }
}
