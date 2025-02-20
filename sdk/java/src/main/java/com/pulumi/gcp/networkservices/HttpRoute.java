// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.networkservices.HttpRouteArgs;
import com.pulumi.gcp.networkservices.inputs.HttpRouteState;
import com.pulumi.gcp.networkservices.outputs.HttpRouteRule;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Network Services Http Route Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkservices.HttpRoute;
 * import com.pulumi.gcp.networkservices.HttpRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs;
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
 *         var default_ = new HttpRoute(&#34;default&#34;, HttpRouteArgs.builder()        
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .description(&#34;my description&#34;)
 *             .hostnames(&#34;example&#34;)
 *             .rules(HttpRouteRuleArgs.builder()
 *                 .matches(HttpRouteRuleMatchArgs.builder()
 *                     .queryParameters(HttpRouteRuleMatchQueryParameterArgs.builder()
 *                         .queryParameter(&#34;key&#34;)
 *                         .exactMatch(&#34;value&#34;)
 *                         .build())
 *                     .fullPathMatch(&#34;example&#34;)
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Network Services Http Route Matches And Actions
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkservices.HttpRoute;
 * import com.pulumi.gcp.networkservices.HttpRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRedirectArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionUrlRewriteArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRetryPolicyArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyDestinationArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionCorsPolicyArgs;
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
 *         var default_ = new HttpRoute(&#34;default&#34;, HttpRouteArgs.builder()        
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .description(&#34;my description&#34;)
 *             .hostnames(&#34;example&#34;)
 *             .rules(HttpRouteRuleArgs.builder()
 *                 .matches(                
 *                     HttpRouteRuleMatchArgs.builder()
 *                         .headers(HttpRouteRuleMatchHeaderArgs.builder()
 *                             .header(&#34;header&#34;)
 *                             .invertMatch(false)
 *                             .regexMatch(&#34;header-value&#34;)
 *                             .build())
 *                         .queryParameters(HttpRouteRuleMatchQueryParameterArgs.builder()
 *                             .queryParameter(&#34;key&#34;)
 *                             .exactMatch(&#34;value&#34;)
 *                             .build())
 *                         .prefixMatch(&#34;example&#34;)
 *                         .ignoreCase(false)
 *                         .build(),
 *                     HttpRouteRuleMatchArgs.builder()
 *                         .headers(HttpRouteRuleMatchHeaderArgs.builder()
 *                             .header(&#34;header&#34;)
 *                             .invertMatch(false)
 *                             .presentMatch(true)
 *                             .build())
 *                         .queryParameters(HttpRouteRuleMatchQueryParameterArgs.builder()
 *                             .queryParameter(&#34;key&#34;)
 *                             .regexMatch(&#34;value&#34;)
 *                             .build())
 *                         .regexMatch(&#34;example&#34;)
 *                         .ignoreCase(false)
 *                         .build(),
 *                     HttpRouteRuleMatchArgs.builder()
 *                         .headers(HttpRouteRuleMatchHeaderArgs.builder()
 *                             .header(&#34;header&#34;)
 *                             .invertMatch(false)
 *                             .presentMatch(true)
 *                             .build())
 *                         .queryParameters(HttpRouteRuleMatchQueryParameterArgs.builder()
 *                             .queryParameter(&#34;key&#34;)
 *                             .presentMatch(true)
 *                             .build())
 *                         .fullPathMatch(&#34;example&#34;)
 *                         .ignoreCase(false)
 *                         .build())
 *                 .action(HttpRouteRuleActionArgs.builder()
 *                     .redirect(HttpRouteRuleActionRedirectArgs.builder()
 *                         .hostRedirect(&#34;new-host&#34;)
 *                         .pathRedirect(&#34;new-path&#34;)
 *                         .prefixRewrite(&#34;new-prefix&#34;)
 *                         .httpsRedirect(true)
 *                         .stripQuery(true)
 *                         .portRedirect(8081)
 *                         .build())
 *                     .urlRewrite(HttpRouteRuleActionUrlRewriteArgs.builder()
 *                         .pathPrefixRewrite(&#34;new-prefix&#34;)
 *                         .hostRewrite(&#34;new-host&#34;)
 *                         .build())
 *                     .retryPolicy(HttpRouteRuleActionRetryPolicyArgs.builder()
 *                         .retryConditions(&#34;server_error&#34;)
 *                         .numRetries(1)
 *                         .perTryTimeout(&#34;1s&#34;)
 *                         .build())
 *                     .requestMirrorPolicy(HttpRouteRuleActionRequestMirrorPolicyArgs.builder()
 *                         .destination(HttpRouteRuleActionRequestMirrorPolicyDestinationArgs.builder()
 *                             .serviceName(&#34;new&#34;)
 *                             .weight(1)
 *                             .build())
 *                         .build())
 *                     .corsPolicy(HttpRouteRuleActionCorsPolicyArgs.builder()
 *                         .allowOrigins(&#34;example&#34;)
 *                         .allowMethods(                        
 *                             &#34;GET&#34;,
 *                             &#34;PUT&#34;)
 *                         .allowHeaders(                        
 *                             &#34;version&#34;,
 *                             &#34;type&#34;)
 *                         .exposeHeaders(                        
 *                             &#34;version&#34;,
 *                             &#34;type&#34;)
 *                         .maxAge(&#34;1s&#34;)
 *                         .allowCredentials(true)
 *                         .disabled(false)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Network Services Http Route Actions
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkservices.HttpRoute;
 * import com.pulumi.gcp.networkservices.HttpRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyDelayArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionFaultInjectionPolicyAbortArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionUrlRewriteArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRetryPolicyArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestMirrorPolicyDestinationArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionCorsPolicyArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionRequestHeaderModifierArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleActionResponseHeaderModifierArgs;
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
 *         var default_ = new HttpRoute(&#34;default&#34;, HttpRouteArgs.builder()        
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .description(&#34;my description&#34;)
 *             .hostnames(&#34;example&#34;)
 *             .rules(HttpRouteRuleArgs.builder()
 *                 .action(HttpRouteRuleActionArgs.builder()
 *                     .faultInjectionPolicy(HttpRouteRuleActionFaultInjectionPolicyArgs.builder()
 *                         .delay(HttpRouteRuleActionFaultInjectionPolicyDelayArgs.builder()
 *                             .fixedDelay(&#34;1s&#34;)
 *                             .percentage(1)
 *                             .build())
 *                         .abort(HttpRouteRuleActionFaultInjectionPolicyAbortArgs.builder()
 *                             .httpStatus(500)
 *                             .percentage(1)
 *                             .build())
 *                         .build())
 *                     .urlRewrite(HttpRouteRuleActionUrlRewriteArgs.builder()
 *                         .pathPrefixRewrite(&#34;new-prefix&#34;)
 *                         .hostRewrite(&#34;new-host&#34;)
 *                         .build())
 *                     .retryPolicy(HttpRouteRuleActionRetryPolicyArgs.builder()
 *                         .retryConditions(&#34;server_error&#34;)
 *                         .numRetries(1)
 *                         .perTryTimeout(&#34;1s&#34;)
 *                         .build())
 *                     .requestMirrorPolicy(HttpRouteRuleActionRequestMirrorPolicyArgs.builder()
 *                         .destination(HttpRouteRuleActionRequestMirrorPolicyDestinationArgs.builder()
 *                             .serviceName(&#34;new&#34;)
 *                             .weight(1)
 *                             .build())
 *                         .build())
 *                     .corsPolicy(HttpRouteRuleActionCorsPolicyArgs.builder()
 *                         .allowOrigins(&#34;example&#34;)
 *                         .allowMethods(                        
 *                             &#34;GET&#34;,
 *                             &#34;PUT&#34;)
 *                         .allowHeaders(                        
 *                             &#34;version&#34;,
 *                             &#34;type&#34;)
 *                         .exposeHeaders(                        
 *                             &#34;version&#34;,
 *                             &#34;type&#34;)
 *                         .maxAge(&#34;1s&#34;)
 *                         .allowCredentials(true)
 *                         .disabled(false)
 *                         .build())
 *                     .requestHeaderModifier(HttpRouteRuleActionRequestHeaderModifierArgs.builder()
 *                         .set(Map.ofEntries(
 *                             Map.entry(&#34;version&#34;, &#34;1&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;json&#34;)
 *                         ))
 *                         .add(Map.of(&#34;minor-version&#34;, &#34;1&#34;))
 *                         .removes(&#34;arg&#34;)
 *                         .build())
 *                     .responseHeaderModifier(HttpRouteRuleActionResponseHeaderModifierArgs.builder()
 *                         .set(Map.ofEntries(
 *                             Map.entry(&#34;version&#34;, &#34;1&#34;),
 *                             Map.entry(&#34;type&#34;, &#34;json&#34;)
 *                         ))
 *                         .add(Map.of(&#34;minor-version&#34;, &#34;1&#34;))
 *                         .removes(&#34;removearg&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Network Services Http Route Mesh Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.networkservices.Mesh;
 * import com.pulumi.gcp.networkservices.MeshArgs;
 * import com.pulumi.gcp.networkservices.HttpRoute;
 * import com.pulumi.gcp.networkservices.HttpRouteArgs;
 * import com.pulumi.gcp.networkservices.inputs.HttpRouteRuleArgs;
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
 *         var defaultMesh = new Mesh(&#34;defaultMesh&#34;, MeshArgs.builder()        
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .description(&#34;my description&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var defaultHttpRoute = new HttpRoute(&#34;defaultHttpRoute&#34;, HttpRouteArgs.builder()        
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .description(&#34;my description&#34;)
 *             .hostnames(&#34;example&#34;)
 *             .meshes(defaultMesh.id())
 *             .rules(HttpRouteRuleArgs.builder()
 *                 .matches(HttpRouteRuleMatchArgs.builder()
 *                     .queryParameters(HttpRouteRuleMatchQueryParameterArgs.builder()
 *                         .queryParameter(&#34;key&#34;)
 *                         .exactMatch(&#34;value&#34;)
 *                         .build())
 *                     .fullPathMatch(&#34;example&#34;)
 *                     .build())
 *                 .build())
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
 * HttpRoute can be imported using any of these accepted formats* `projects/{{project}}/locations/global/httpRoutes/{{name}}` * `{{project}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import HttpRoute using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/global/httpRoutes/{{name}}&#34;
 * 
 *  to = google_network_services_http_route.default }
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/httpRoute:HttpRoute When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), HttpRoute can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/httpRoute:HttpRoute default projects/{{project}}/locations/global/httpRoutes/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/httpRoute:HttpRoute default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:networkservices/httpRoute:HttpRoute default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:networkservices/httpRoute:HttpRoute")
public class HttpRoute extends com.pulumi.resources.CustomResource {
    /**
     * Time the HttpRoute was created in UTC.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time the HttpRoute was created in UTC.
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
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Export(name="effectiveLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Output<Map<String,String>> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway.
     * Each gateway reference should match the pattern: projects/*{@literal /}locations/global/gateways/&lt;gateway_name&gt;
     * 
     */
    @Export(name="gateways", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> gateways;

    /**
     * @return Gateways defines a list of gateways this HttpRoute is attached to, as one of the routing rules to route the requests served by the gateway.
     * Each gateway reference should match the pattern: projects/*{@literal /}locations/global/gateways/&lt;gateway_name&gt;
     * 
     */
    public Output<Optional<List<String>>> gateways() {
        return Codegen.optional(this.gateways);
    }
    /**
     * Set of hosts that should match against the HTTP host header to select a HttpRoute to process the request.
     * 
     */
    @Export(name="hostnames", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> hostnames;

    /**
     * @return Set of hosts that should match against the HTTP host header to select a HttpRoute to process the request.
     * 
     */
    public Output<List<String>> hostnames() {
        return this.hostnames;
    }
    /**
     * Set of label tags associated with the HttpRoute resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Set of label tags associated with the HttpRoute resource.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh.
     * Each mesh reference should match the pattern: projects/*{@literal /}locations/global/meshes/&lt;mesh_name&gt;.
     * The attached Mesh should be of a type SIDECAR.
     * 
     */
    @Export(name="meshes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> meshes;

    /**
     * @return Meshes defines a list of meshes this HttpRoute is attached to, as one of the routing rules to route the requests served by the mesh.
     * Each mesh reference should match the pattern: projects/*{@literal /}locations/global/meshes/&lt;mesh_name&gt;.
     * The attached Mesh should be of a type SIDECAR.
     * 
     */
    public Output<Optional<List<String>>> meshes() {
        return Codegen.optional(this.meshes);
    }
    /**
     * Name of the HttpRoute resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the HttpRoute resource.
     * 
     */
    public Output<String> name() {
        return this.name;
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
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Export(name="pulumiLabels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Output<Map<String,String>> pulumiLabels() {
        return this.pulumiLabels;
    }
    /**
     * Rules that define how traffic is routed and handled.
     * Structure is documented below.
     * 
     */
    @Export(name="rules", refs={List.class,HttpRouteRule.class}, tree="[0,1]")
    private Output<List<HttpRouteRule>> rules;

    /**
     * @return Rules that define how traffic is routed and handled.
     * Structure is documented below.
     * 
     */
    public Output<List<HttpRouteRule>> rules() {
        return this.rules;
    }
    /**
     * Server-defined URL of this resource.
     * 
     */
    @Export(name="selfLink", refs={String.class}, tree="[0]")
    private Output<String> selfLink;

    /**
     * @return Server-defined URL of this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Time the HttpRoute was updated in UTC.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Time the HttpRoute was updated in UTC.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public HttpRoute(String name) {
        this(name, HttpRouteArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public HttpRoute(String name, HttpRouteArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public HttpRoute(String name, HttpRouteArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/httpRoute:HttpRoute", name, args == null ? HttpRouteArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private HttpRoute(String name, Output<String> id, @Nullable HttpRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:networkservices/httpRoute:HttpRoute", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "effectiveLabels",
                "pulumiLabels"
            ))
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
    public static HttpRoute get(String name, Output<String> id, @Nullable HttpRouteState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new HttpRoute(name, id, state, options);
    }
}
