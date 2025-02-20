// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.container.AzureClientArgs;
import com.pulumi.gcp.container.inputs.AzureClientState;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * AzureClient resources hold client authentication information needed by the Anthos Multi-Cloud API to manage Azure resources on your Azure subscription.When an AzureCluster is created, an AzureClient resource needs to be provided and all operations on Azure resources associated to that cluster will authenticate to Azure services using the given client.AzureClient resources are immutable and cannot be modified upon creation.Each AzureClient resource is bound to a single Azure Active Directory Application and tenant.
 * 
 * For more information, see:
 * * [Multicloud overview](https://cloud.google.com/anthos/clusters/docs/multi-cloud)
 * ## Example Usage
 * ### Basic_azure_client
 * A basic example of a containerazure azure client
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.container.AzureClient;
 * import com.pulumi.gcp.container.AzureClientArgs;
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
 *         var primary = new AzureClient(&#34;primary&#34;, AzureClientArgs.builder()        
 *             .applicationId(&#34;12345678-1234-1234-1234-123456789111&#34;)
 *             .location(&#34;us-west1&#34;)
 *             .project(&#34;my-project-name&#34;)
 *             .tenantId(&#34;12345678-1234-1234-1234-123456789111&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Client can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/azureClients/{{name}}` * `{{project}}/{{location}}/{{name}}` * `{{location}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Client using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{location}}/azureClients/{{name}}&#34;
 * 
 *  to = google_container_azure_client.default }
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureClient:AzureClient When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Client can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureClient:AzureClient default projects/{{project}}/locations/{{location}}/azureClients/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureClient:AzureClient default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:container/azureClient:AzureClient default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:container/azureClient:AzureClient")
public class AzureClient extends com.pulumi.resources.CustomResource {
    /**
     * The Azure Active Directory Application ID.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return The Azure Active Directory Application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * Output only. The PEM encoded x509 certificate.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return Output only. The PEM encoded x509 certificate.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * Output only. The time at which this resource was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Output only. The time at which this resource was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The location for the resource
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The location for the resource
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The name of this resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of this resource.
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
     * The Azure Active Directory Tenant ID.
     * 
     * ***
     * 
     */
    @Export(name="tenantId", refs={String.class}, tree="[0]")
    private Output<String> tenantId;

    /**
     * @return The Azure Active Directory Tenant ID.
     * 
     * ***
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }
    /**
     * Output only. A globally unique identifier for the client.
     * 
     */
    @Export(name="uid", refs={String.class}, tree="[0]")
    private Output<String> uid;

    /**
     * @return Output only. A globally unique identifier for the client.
     * 
     */
    public Output<String> uid() {
        return this.uid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzureClient(String name) {
        this(name, AzureClientArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzureClient(String name, AzureClientArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureClient(String name, AzureClientArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/azureClient:AzureClient", name, args == null ? AzureClientArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AzureClient(String name, Output<String> id, @Nullable AzureClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:container/azureClient:AzureClient", name, state, makeResourceOptions(options, id));
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
    public static AzureClient get(String name, Output<String> id, @Nullable AzureClientState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AzureClient(name, id, state, options);
    }
}
