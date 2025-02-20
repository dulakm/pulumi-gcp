// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iap;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.iap.ClientArgs;
import com.pulumi.gcp.iap.inputs.ClientState;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Contains the data that describes an Identity Aware Proxy owned client.
 * 
 * &gt; **Note:** Only internal org clients can be created via declarative tools. External clients must be
 * manually created via the GCP console. This restriction is due to the existing APIs and not lack of support
 * in this tool.
 * 
 * To get more information about Client, see:
 * 
 * * [API documentation](https://cloud.google.com/iap/docs/reference/rest/v1/projects.brands.identityAwareProxyClients)
 * * How-to Guides
 *     * [Setting up IAP Client](https://cloud.google.com/iap/docs/authentication-howto)
 * 
 * &gt; **Warning:** All arguments including `secret` will be stored in the raw
 * state as plain-text.
 * 
 * ## Example Usage
 * ### Iap Client
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
 * import com.pulumi.gcp.iap.Brand;
 * import com.pulumi.gcp.iap.BrandArgs;
 * import com.pulumi.gcp.iap.Client;
 * import com.pulumi.gcp.iap.ClientArgs;
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
 *             .build());
 * 
 *         var projectService = new Service(&#34;projectService&#34;, ServiceArgs.builder()        
 *             .project(project.projectId())
 *             .service(&#34;iap.googleapis.com&#34;)
 *             .build());
 * 
 *         var projectBrand = new Brand(&#34;projectBrand&#34;, BrandArgs.builder()        
 *             .supportEmail(&#34;support@example.com&#34;)
 *             .applicationTitle(&#34;Cloud IAP protected Application&#34;)
 *             .project(projectService.project())
 *             .build());
 * 
 *         var projectClient = new Client(&#34;projectClient&#34;, ClientArgs.builder()        
 *             .displayName(&#34;Test Client&#34;)
 *             .brand(projectBrand.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Client can be imported using any of these accepted formats* `{{brand}}/identityAwareProxyClients/{{client_id}}` * `{{brand}}/{{client_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Client using one of the formats above. For exampletf import {
 * 
 *  id = &#34;{{brand}}/identityAwareProxyClients/{{client_id}}&#34;
 * 
 *  to = google_iap_client.default }
 * 
 * ```sh
 *  $ pulumi import gcp:iap/client:Client When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Client can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iap/client:Client default {{brand}}/identityAwareProxyClients/{{client_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iap/client:Client default {{brand}}/{{client_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:iap/client:Client")
public class Client extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     * ***
     * 
     */
    @Export(name="brand", refs={String.class}, tree="[0]")
    private Output<String> brand;

    /**
     * @return Identifier of the brand to which this client
     * is attached to. The format is
     * `projects/{project_number}/brands/{brand_id}/identityAwareProxyClients/{client_id}`.
     * 
     * ***
     * 
     */
    public Output<String> brand() {
        return this.brand;
    }
    /**
     * The OAuth2 ID of the client.
     * 
     */
    @Export(name="clientId", refs={String.class}, tree="[0]")
    private Output<String> clientId;

    /**
     * @return The OAuth2 ID of the client.
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * Human-friendly name given to the OAuth client.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output<String> displayName;

    /**
     * @return Human-friendly name given to the OAuth client.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * Output only. Client secret of the OAuth client.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="secret", refs={String.class}, tree="[0]")
    private Output<String> secret;

    /**
     * @return Output only. Client secret of the OAuth client.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> secret() {
        return this.secret;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Client(String name) {
        this(name, ClientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Client(String name, ClientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Client(String name, ClientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/client:Client", name, args == null ? ClientArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Client(String name, Output<String> id, @Nullable ClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iap/client:Client", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "secret"
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
    public static Client get(String name, Output<String> id, @Nullable ClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Client(name, id, state, options);
    }
}
