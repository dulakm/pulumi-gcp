// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dataform.RepositoryArgs;
import com.pulumi.gcp.dataform.inputs.RepositoryState;
import com.pulumi.gcp.dataform.outputs.RepositoryGitRemoteSettings;
import com.pulumi.gcp.dataform.outputs.RepositoryWorkspaceCompilationOverrides;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Dataform Repository
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.sourcerepo.Repository;
 * import com.pulumi.gcp.sourcerepo.RepositoryArgs;
 * import com.pulumi.gcp.secretmanager.Secret;
 * import com.pulumi.gcp.secretmanager.SecretArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs;
 * import com.pulumi.gcp.secretmanager.SecretVersion;
 * import com.pulumi.gcp.secretmanager.SecretVersionArgs;
 * import com.pulumi.gcp.dataform.Repository;
 * import com.pulumi.gcp.dataform.RepositoryArgs;
 * import com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs;
 * import com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs;
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
 *         var gitRepository = new Repository(&#34;gitRepository&#34;, RepositoryArgs.Empty, CustomResourceOptions.builder()
 *             .provider(google_beta)
 *             .build());
 * 
 *         var secret = new Secret(&#34;secret&#34;, SecretArgs.builder()        
 *             .secretId(&#34;secret&#34;)
 *             .replication(SecretReplicationArgs.builder()
 *                 .auto()
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var secretVersion = new SecretVersion(&#34;secretVersion&#34;, SecretVersionArgs.builder()        
 *             .secret(secret.id())
 *             .secretData(&#34;secret-data&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var dataformRespository = new Repository(&#34;dataformRespository&#34;, RepositoryArgs.builder()        
 *             .gitRemoteSettings(RepositoryGitRemoteSettingsArgs.builder()
 *                 .url(gitRepository.url())
 *                 .defaultBranch(&#34;main&#34;)
 *                 .authenticationTokenSecretVersion(secretVersion.id())
 *                 .build())
 *             .workspaceCompilationOverrides(RepositoryWorkspaceCompilationOverridesArgs.builder()
 *                 .defaultDatabase(&#34;database&#34;)
 *                 .schemaSuffix(&#34;_suffix&#34;)
 *                 .tablePrefix(&#34;prefix_&#34;)
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Dataform Repository Ssh
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.sourcerepo.Repository;
 * import com.pulumi.gcp.sourcerepo.RepositoryArgs;
 * import com.pulumi.gcp.secretmanager.Secret;
 * import com.pulumi.gcp.secretmanager.SecretArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationAutoArgs;
 * import com.pulumi.gcp.secretmanager.SecretVersion;
 * import com.pulumi.gcp.secretmanager.SecretVersionArgs;
 * import com.pulumi.gcp.dataform.Repository;
 * import com.pulumi.gcp.dataform.RepositoryArgs;
 * import com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsArgs;
 * import com.pulumi.gcp.dataform.inputs.RepositoryGitRemoteSettingsSshAuthenticationConfigArgs;
 * import com.pulumi.gcp.dataform.inputs.RepositoryWorkspaceCompilationOverridesArgs;
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
 *         var gitRepository = new Repository(&#34;gitRepository&#34;, RepositoryArgs.Empty, CustomResourceOptions.builder()
 *             .provider(google_beta)
 *             .build());
 * 
 *         var secret = new Secret(&#34;secret&#34;, SecretArgs.builder()        
 *             .secretId(&#34;secret&#34;)
 *             .replication(SecretReplicationArgs.builder()
 *                 .auto()
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var secretVersion = new SecretVersion(&#34;secretVersion&#34;, SecretVersionArgs.builder()        
 *             .secret(secret.id())
 *             .secretData(&#34;secret-data&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .provider(google_beta)
 *                 .build());
 * 
 *         var dataformRespository = new Repository(&#34;dataformRespository&#34;, RepositoryArgs.builder()        
 *             .gitRemoteSettings(RepositoryGitRemoteSettingsArgs.builder()
 *                 .url(gitRepository.url())
 *                 .defaultBranch(&#34;main&#34;)
 *                 .sshAuthenticationConfig(RepositoryGitRemoteSettingsSshAuthenticationConfigArgs.builder()
 *                     .userPrivateKeySecretVersion(secretVersion.id())
 *                     .hostPublicKey(&#34;ssh-rsa AAAAB3NzaC1yc2EAAAABIwAAAQEAklOUpkDHrfHY17SbrmTIpNLTGK9Tjom/BWDSU&#34;)
 *                     .build())
 *                 .build())
 *             .workspaceCompilationOverrides(RepositoryWorkspaceCompilationOverridesArgs.builder()
 *                 .defaultDatabase(&#34;database&#34;)
 *                 .schemaSuffix(&#34;_suffix&#34;)
 *                 .tablePrefix(&#34;prefix_&#34;)
 *                 .build())
 *             .serviceAccount(&#34;1234567890-compute@developer.gserviceaccount.com&#34;)
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
 * Repository can be imported using any of these accepted formats* `projects/{{project}}/locations/{{region}}/repositories/{{name}}` * `{{project}}/{{region}}/{{name}}` * `{{region}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Repository using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{region}}/repositories/{{name}}&#34;
 * 
 *  to = google_dataform_repository.default }
 * 
 * ```sh
 *  $ pulumi import gcp:dataform/repository:Repository When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Repository can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataform/repository:Repository default projects/{{project}}/locations/{{region}}/repositories/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataform/repository:Repository default {{project}}/{{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataform/repository:Repository default {{region}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dataform/repository:Repository default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:dataform/repository:Repository")
public class Repository extends com.pulumi.resources.CustomResource {
    /**
     * Optional. If set, configures this repository to be linked to a Git remote.
     * Structure is documented below.
     * 
     */
    @Export(name="gitRemoteSettings", refs={RepositoryGitRemoteSettings.class}, tree="[0]")
    private Output</* @Nullable */ RepositoryGitRemoteSettings> gitRemoteSettings;

    /**
     * @return Optional. If set, configures this repository to be linked to a Git remote.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RepositoryGitRemoteSettings>> gitRemoteSettings() {
        return Codegen.optional(this.gitRemoteSettings);
    }
    /**
     * The repository&#39;s name.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The repository&#39;s name.
     * 
     * ***
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
     * A reference to the region
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> region;

    /**
     * @return A reference to the region
     * 
     */
    public Output<Optional<String>> region() {
        return Codegen.optional(this.region);
    }
    /**
     * The service account to run workflow invocations under.
     * 
     */
    @Export(name="serviceAccount", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> serviceAccount;

    /**
     * @return The service account to run workflow invocations under.
     * 
     */
    public Output<Optional<String>> serviceAccount() {
        return Codegen.optional(this.serviceAccount);
    }
    /**
     * If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
     * Structure is documented below.
     * 
     */
    @Export(name="workspaceCompilationOverrides", refs={RepositoryWorkspaceCompilationOverrides.class}, tree="[0]")
    private Output</* @Nullable */ RepositoryWorkspaceCompilationOverrides> workspaceCompilationOverrides;

    /**
     * @return If set, fields of workspaceCompilationOverrides override the default compilation settings that are specified in dataform.json when creating workspace-scoped compilation results.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RepositoryWorkspaceCompilationOverrides>> workspaceCompilationOverrides() {
        return Codegen.optional(this.workspaceCompilationOverrides);
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
    public Repository(String name, @Nullable RepositoryArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Repository(String name, @Nullable RepositoryArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataform/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:dataform/repository:Repository", name, state, makeResourceOptions(options, id));
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
