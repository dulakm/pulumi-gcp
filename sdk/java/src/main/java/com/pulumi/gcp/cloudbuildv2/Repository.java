// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuildv2;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.cloudbuildv2.RepositoryArgs;
import com.pulumi.gcp.cloudbuildv2.inputs.RepositoryState;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The Cloudbuildv2 Repository resource
 * 
 * ## Example Usage
 * ### Ghe
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.secretmanager.Secret;
 * import com.pulumi.gcp.secretmanager.SecretArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs;
 * import com.pulumi.gcp.secretmanager.SecretVersion;
 * import com.pulumi.gcp.secretmanager.SecretVersionArgs;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
 * import com.pulumi.gcp.secretmanager.SecretIamPolicy;
 * import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
 * import com.pulumi.gcp.cloudbuildv2.Connection;
 * import com.pulumi.gcp.cloudbuildv2.ConnectionArgs;
 * import com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubEnterpriseConfigArgs;
 * import com.pulumi.gcp.cloudbuildv2.Repository;
 * import com.pulumi.gcp.cloudbuildv2.RepositoryArgs;
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
 *         var private_key_secret = new Secret(&#34;private-key-secret&#34;, SecretArgs.builder()        
 *             .secretId(&#34;ghe-pk-secret&#34;)
 *             .replication(SecretReplicationArgs.builder()
 *                 .auto()
 *                 .build())
 *             .build());
 * 
 *         var private_key_secret_version = new SecretVersion(&#34;private-key-secret-version&#34;, SecretVersionArgs.builder()        
 *             .secret(private_key_secret.id())
 *             .secretData(Files.readString(Paths.get(&#34;private-key.pem&#34;)))
 *             .build());
 * 
 *         var webhook_secret_secret = new Secret(&#34;webhook-secret-secret&#34;, SecretArgs.builder()        
 *             .secretId(&#34;github-token-secret&#34;)
 *             .replication(SecretReplicationArgs.builder()
 *                 .auto()
 *                 .build())
 *             .build());
 * 
 *         var webhook_secret_secret_version = new SecretVersion(&#34;webhook-secret-secret-version&#34;, SecretVersionArgs.builder()        
 *             .secret(webhook_secret_secret.id())
 *             .secretData(&#34;&lt;webhook-secret-data&gt;&#34;)
 *             .build());
 * 
 *         final var p4sa-secretAccessor = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role(&#34;roles/secretmanager.secretAccessor&#34;)
 *                 .members(&#34;serviceAccount:service-123456789@gcp-sa-cloudbuild.iam.gserviceaccount.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var policy_pk = new SecretIamPolicy(&#34;policy-pk&#34;, SecretIamPolicyArgs.builder()        
 *             .secretId(private_key_secret.secretId())
 *             .policyData(p4sa_secretAccessor.policyData())
 *             .build());
 * 
 *         var policy_whs = new SecretIamPolicy(&#34;policy-whs&#34;, SecretIamPolicyArgs.builder()        
 *             .secretId(webhook_secret_secret.secretId())
 *             .policyData(p4sa_secretAccessor.policyData())
 *             .build());
 * 
 *         var my_connection = new Connection(&#34;my-connection&#34;, ConnectionArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .githubEnterpriseConfig(ConnectionGithubEnterpriseConfigArgs.builder()
 *                 .hostUri(&#34;https://ghe.com&#34;)
 *                 .privateKeySecretVersion(private_key_secret_version.id())
 *                 .webhookSecretSecretVersion(webhook_secret_secret_version.id())
 *                 .appId(200)
 *                 .appSlug(&#34;gcb-app&#34;)
 *                 .appInstallationId(300)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(                
 *                     policy_pk,
 *                     policy_whs)
 *                 .build());
 * 
 *         var my_repository = new Repository(&#34;my-repository&#34;, RepositoryArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .parentConnection(my_connection.id())
 *             .remoteUri(&#34;https://ghe.com/hashicorp/terraform-provider-google.git&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Repository In GitHub Connection
 * Creates a Repository resource inside a Connection to github.com
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.secretmanager.Secret;
 * import com.pulumi.gcp.secretmanager.SecretArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs;
 * import com.pulumi.gcp.secretmanager.SecretVersion;
 * import com.pulumi.gcp.secretmanager.SecretVersionArgs;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetIAMPolicyArgs;
 * import com.pulumi.gcp.secretmanager.SecretIamPolicy;
 * import com.pulumi.gcp.secretmanager.SecretIamPolicyArgs;
 * import com.pulumi.gcp.cloudbuildv2.Connection;
 * import com.pulumi.gcp.cloudbuildv2.ConnectionArgs;
 * import com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigArgs;
 * import com.pulumi.gcp.cloudbuildv2.inputs.ConnectionGithubConfigAuthorizerCredentialArgs;
 * import com.pulumi.gcp.cloudbuildv2.Repository;
 * import com.pulumi.gcp.cloudbuildv2.RepositoryArgs;
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
 *         var github_token_secret = new Secret(&#34;github-token-secret&#34;, SecretArgs.builder()        
 *             .secretId(&#34;github-token-secret&#34;)
 *             .replication(SecretReplicationArgs.builder()
 *                 .auto()
 *                 .build())
 *             .build());
 * 
 *         var github_token_secret_version = new SecretVersion(&#34;github-token-secret-version&#34;, SecretVersionArgs.builder()        
 *             .secret(github_token_secret.id())
 *             .secretData(Files.readString(Paths.get(&#34;my-github-token.txt&#34;)))
 *             .build());
 * 
 *         final var p4sa-secretAccessor = OrganizationsFunctions.getIAMPolicy(GetIAMPolicyArgs.builder()
 *             .bindings(GetIAMPolicyBindingArgs.builder()
 *                 .role(&#34;roles/secretmanager.secretAccessor&#34;)
 *                 .members(&#34;serviceAccount:service-123456789@gcp-sa-cloudbuild.iam.gserviceaccount.com&#34;)
 *                 .build())
 *             .build());
 * 
 *         var policy = new SecretIamPolicy(&#34;policy&#34;, SecretIamPolicyArgs.builder()        
 *             .secretId(github_token_secret.secretId())
 *             .policyData(p4sa_secretAccessor.policyData())
 *             .build());
 * 
 *         var my_connection = new Connection(&#34;my-connection&#34;, ConnectionArgs.builder()        
 *             .location(&#34;us-west1&#34;)
 *             .githubConfig(ConnectionGithubConfigArgs.builder()
 *                 .appInstallationId(123123)
 *                 .authorizerCredential(ConnectionGithubConfigAuthorizerCredentialArgs.builder()
 *                     .oauthTokenSecretVersion(github_token_secret_version.id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var my_repository = new Repository(&#34;my-repository&#34;, RepositoryArgs.builder()        
 *             .location(&#34;us-west1&#34;)
 *             .parentConnection(my_connection.name())
 *             .remoteUri(&#34;https://github.com/myuser/myrepo.git&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Repository can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/connections/{{parent_connection}}/repositories/{{name}}` * `{{project}}/{{location}}/{{parent_connection}}/{{name}}` * `{{location}}/{{parent_connection}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Repository using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{location}}/connections/{{parent_connection}}/repositories/{{name}}&#34;
 * 
 *  to = google_cloudbuildv2_repository.default }
 * 
 * ```sh
 *  $ pulumi import gcp:cloudbuildv2/repository:Repository When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Repository can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudbuildv2/repository:Repository default projects/{{project}}/locations/{{location}}/connections/{{parent_connection}}/repositories/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudbuildv2/repository:Repository default {{project}}/{{location}}/{{parent_connection}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:cloudbuildv2/repository:Repository default {{location}}/{{parent_connection}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:cloudbuildv2/repository:Repository")
public class Repository extends com.pulumi.resources.CustomResource {
    /**
     * Allows clients to store small amounts of arbitrary data.
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    @Export(name="annotations", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> annotations;

    /**
     * @return Allows clients to store small amounts of arbitrary data.
     * 
     * **Note**: This field is non-authoritative, and will only manage the annotations present in your configuration.
     * Please refer to the field `effective_annotations` for all of the annotations present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> annotations() {
        return Codegen.optional(this.annotations);
    }
    /**
     * Output only. Server assigned timestamp for when the connection was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Output only. Server assigned timestamp for when the connection was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * All of annotations (key/value pairs) present on the resource in GCP, including the annotations configured through
     * Terraform, other clients and services.
     * 
     */
    @Export(name="effectiveAnnotations", refs={Map.class,String.class,Object.class}, tree="[0,1,2]")
    private Output<Map<String,Object>> effectiveAnnotations;

    /**
     * @return All of annotations (key/value pairs) present on the resource in GCP, including the annotations configured through
     * Terraform, other clients and services.
     * 
     */
    public Output<Map<String,Object>> effectiveAnnotations() {
        return this.effectiveAnnotations;
    }
    /**
     * This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return This checksum is computed by the server based on the value of other fields, and may be sent on update and delete requests to ensure the client has an up-to-date value before proceeding.
     * 
     */
    public Output<String> etag() {
        return this.etag;
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
     * Name of the repository.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the repository.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The connection for the resource
     * 
     */
    @Export(name="parentConnection", refs={String.class}, tree="[0]")
    private Output<String> parentConnection;

    /**
     * @return The connection for the resource
     * 
     */
    public Output<String> parentConnection() {
        return this.parentConnection;
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
     * Required. Git Clone HTTPS URI.
     * 
     * ***
     * 
     */
    @Export(name="remoteUri", refs={String.class}, tree="[0]")
    private Output<String> remoteUri;

    /**
     * @return Required. Git Clone HTTPS URI.
     * 
     * ***
     * 
     */
    public Output<String> remoteUri() {
        return this.remoteUri;
    }
    /**
     * Output only. Server assigned timestamp for when the connection was updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Output only. Server assigned timestamp for when the connection was updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Repository(String name) {
        this(name, RepositoryArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Repository(String name, RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, RepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudbuildv2/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:cloudbuildv2/repository:Repository", name, state, makeResourceOptions(options, id));
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
    public static Repository get(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, state, options);
    }
}
