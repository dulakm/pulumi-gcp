// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigee;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.apigee.EnvironmentArgs;
import com.pulumi.gcp.apigee.inputs.EnvironmentState;
import com.pulumi.gcp.apigee.outputs.EnvironmentNodeConfig;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An `Environment` in Apigee.
 * 
 * To get more information about Environment, see:
 * 
 * * [API documentation](https://cloud.google.com/apigee/docs/reference/apis/apigee/rest/v1/organizations.environments/create)
 * * How-to Guides
 *     * [Creating an environment](https://cloud.google.com/apigee/docs/api-platform/get-started/create-environment)
 * 
 * ## Example Usage
 * ### Apigee Environment Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.compute.Network;
 * import com.pulumi.gcp.compute.GlobalAddress;
 * import com.pulumi.gcp.compute.GlobalAddressArgs;
 * import com.pulumi.gcp.servicenetworking.Connection;
 * import com.pulumi.gcp.servicenetworking.ConnectionArgs;
 * import com.pulumi.gcp.apigee.Organization;
 * import com.pulumi.gcp.apigee.OrganizationArgs;
 * import com.pulumi.gcp.apigee.Environment;
 * import com.pulumi.gcp.apigee.EnvironmentArgs;
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
 *         final var current = OrganizationsFunctions.getClientConfig();
 * 
 *         var apigeeNetwork = new Network(&#34;apigeeNetwork&#34;);
 * 
 *         var apigeeRange = new GlobalAddress(&#34;apigeeRange&#34;, GlobalAddressArgs.builder()        
 *             .purpose(&#34;VPC_PEERING&#34;)
 *             .addressType(&#34;INTERNAL&#34;)
 *             .prefixLength(16)
 *             .network(apigeeNetwork.id())
 *             .build());
 * 
 *         var apigeeVpcConnection = new Connection(&#34;apigeeVpcConnection&#34;, ConnectionArgs.builder()        
 *             .network(apigeeNetwork.id())
 *             .service(&#34;servicenetworking.googleapis.com&#34;)
 *             .reservedPeeringRanges(apigeeRange.name())
 *             .build());
 * 
 *         var apigeeOrg = new Organization(&#34;apigeeOrg&#34;, OrganizationArgs.builder()        
 *             .analyticsRegion(&#34;us-central1&#34;)
 *             .projectId(current.applyValue(getClientConfigResult -&gt; getClientConfigResult.project()))
 *             .authorizedNetwork(apigeeNetwork.id())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(apigeeVpcConnection)
 *                 .build());
 * 
 *         var env = new Environment(&#34;env&#34;, EnvironmentArgs.builder()        
 *             .description(&#34;Apigee Environment&#34;)
 *             .displayName(&#34;environment-1&#34;)
 *             .orgId(apigeeOrg.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Environment can be imported using any of these accepted formats* `{{org_id}}/environments/{{name}}` * `{{org_id}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Environment using one of the formats above. For exampletf import {
 * 
 *  id = &#34;{{org_id}}/environments/{{name}}&#34;
 * 
 *  to = google_apigee_environment.default }
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/environment:Environment When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Environment can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/environment:Environment default {{org_id}}/environments/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:apigee/environment:Environment default {{org_id}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:apigee/environment:Environment")
public class Environment extends com.pulumi.resources.CustomResource {
    /**
     * Optional. API Proxy type supported by the environment. The type can be set when creating
     * the Environment and cannot be changed.
     * Possible values are: `API_PROXY_TYPE_UNSPECIFIED`, `PROGRAMMABLE`, `CONFIGURABLE`.
     * 
     */
    @Export(name="apiProxyType", refs={String.class}, tree="[0]")
    private Output<String> apiProxyType;

    /**
     * @return Optional. API Proxy type supported by the environment. The type can be set when creating
     * the Environment and cannot be changed.
     * Possible values are: `API_PROXY_TYPE_UNSPECIFIED`, `PROGRAMMABLE`, `CONFIGURABLE`.
     * 
     */
    public Output<String> apiProxyType() {
        return this.apiProxyType;
    }
    /**
     * Optional. Deployment type supported by the environment. The deployment type can be
     * set when creating the environment and cannot be changed. When you enable archive
     * deployment, you will be prevented from performing a subset of actions within the
     * environment, including:
     * Managing the deployment of API proxy or shared flow revisions;
     * Creating, updating, or deleting resource files;
     * Creating, updating, or deleting target servers.
     * Possible values are: `DEPLOYMENT_TYPE_UNSPECIFIED`, `PROXY`, `ARCHIVE`.
     * 
     */
    @Export(name="deploymentType", refs={String.class}, tree="[0]")
    private Output<String> deploymentType;

    /**
     * @return Optional. Deployment type supported by the environment. The deployment type can be
     * set when creating the environment and cannot be changed. When you enable archive
     * deployment, you will be prevented from performing a subset of actions within the
     * environment, including:
     * Managing the deployment of API proxy or shared flow revisions;
     * Creating, updating, or deleting resource files;
     * Creating, updating, or deleting target servers.
     * Possible values are: `DEPLOYMENT_TYPE_UNSPECIFIED`, `PROXY`, `ARCHIVE`.
     * 
     */
    public Output<String> deploymentType() {
        return this.deploymentType;
    }
    /**
     * Description of the environment.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the environment.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Display name of the environment.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return Display name of the environment.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The resource ID of the environment.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource ID of the environment.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * NodeConfig for setting the min/max number of nodes associated with the environment.
     * Structure is documented below.
     * 
     */
    @Export(name="nodeConfig", refs={EnvironmentNodeConfig.class}, tree="[0]")
    private Output<EnvironmentNodeConfig> nodeConfig;

    /**
     * @return NodeConfig for setting the min/max number of nodes associated with the environment.
     * Structure is documented below.
     * 
     */
    public Output<EnvironmentNodeConfig> nodeConfig() {
        return this.nodeConfig;
    }
    /**
     * The Apigee Organization associated with the Apigee environment,
     * in the format `organizations/{{org_name}}`.
     * 
     * ***
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return The Apigee Organization associated with the Apigee environment,
     * in the format `organizations/{{org_name}}`.
     * 
     * ***
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Types that can be selected for an Environment. Each of the types are
     * limited by capability and capacity. Refer to Apigee&#39;s public documentation
     * to understand about each of these types in details.
     * An Apigee org can support heterogeneous Environments.
     * Possible values are: `ENVIRONMENT_TYPE_UNSPECIFIED`, `BASE`, `INTERMEDIATE`, `COMPREHENSIVE`.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return Types that can be selected for an Environment. Each of the types are
     * limited by capability and capacity. Refer to Apigee&#39;s public documentation
     * to understand about each of these types in details.
     * An Apigee org can support heterogeneous Environments.
     * Possible values are: `ENVIRONMENT_TYPE_UNSPECIFIED`, `BASE`, `INTERMEDIATE`, `COMPREHENSIVE`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Environment(String name) {
        this(name, EnvironmentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Environment(String name, EnvironmentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Environment(String name, EnvironmentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/environment:Environment", name, args == null ? EnvironmentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Environment(String name, Output<String> id, @Nullable EnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:apigee/environment:Environment", name, state, makeResourceOptions(options, id));
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
    public static Environment get(String name, Output<String> id, @Nullable EnvironmentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Environment(name, id, state, options);
    }
}
