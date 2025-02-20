// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.artifactregistry.RepositoryArgs;
import com.pulumi.gcp.artifactregistry.inputs.RepositoryState;
import com.pulumi.gcp.artifactregistry.outputs.RepositoryCleanupPolicy;
import com.pulumi.gcp.artifactregistry.outputs.RepositoryDockerConfig;
import com.pulumi.gcp.artifactregistry.outputs.RepositoryMavenConfig;
import com.pulumi.gcp.artifactregistry.outputs.RepositoryRemoteRepositoryConfig;
import com.pulumi.gcp.artifactregistry.outputs.RepositoryVirtualRepositoryConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A repository for storing artifacts
 * 
 * To get more information about Repository, see:
 * 
 * * [API documentation](https://cloud.google.com/artifact-registry/docs/reference/rest/v1/projects.locations.repositories)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/artifact-registry/docs/overview)
 * 
 * ## Example Usage
 * ### Artifact Registry Repository Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.artifactregistry.Repository;
 * import com.pulumi.gcp.artifactregistry.RepositoryArgs;
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
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .description(&#34;example docker repository&#34;)
 *             .format(&#34;DOCKER&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .repositoryId(&#34;my-repository&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Artifact Registry Repository Docker
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.artifactregistry.Repository;
 * import com.pulumi.gcp.artifactregistry.RepositoryArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryDockerConfigArgs;
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
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .description(&#34;example docker repository&#34;)
 *             .dockerConfig(RepositoryDockerConfigArgs.builder()
 *                 .immutableTags(true)
 *                 .build())
 *             .format(&#34;DOCKER&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .repositoryId(&#34;my-repository&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Artifact Registry Repository Cmek
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.kms.CryptoKeyIAMMember;
 * import com.pulumi.gcp.kms.CryptoKeyIAMMemberArgs;
 * import com.pulumi.gcp.artifactregistry.Repository;
 * import com.pulumi.gcp.artifactregistry.RepositoryArgs;
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
 *         final var project = OrganizationsFunctions.getProject();
 * 
 *         var cryptoKey = new CryptoKeyIAMMember(&#34;cryptoKey&#34;, CryptoKeyIAMMemberArgs.builder()        
 *             .cryptoKeyId(&#34;kms-key&#34;)
 *             .role(&#34;roles/cloudkms.cryptoKeyEncrypterDecrypter&#34;)
 *             .member(String.format(&#34;serviceAccount:service-%s@gcp-sa-artifactregistry.iam.gserviceaccount.com&#34;, project.applyValue(getProjectResult -&gt; getProjectResult.number())))
 *             .build());
 * 
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .repositoryId(&#34;my-repository&#34;)
 *             .description(&#34;example docker repository with cmek&#34;)
 *             .format(&#34;DOCKER&#34;)
 *             .kmsKeyName(&#34;kms-key&#34;)
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(cryptoKey)
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Artifact Registry Repository Virtual
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.artifactregistry.Repository;
 * import com.pulumi.gcp.artifactregistry.RepositoryArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryVirtualRepositoryConfigArgs;
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
 *         var my_repo_upstream = new Repository(&#34;my-repo-upstream&#34;, RepositoryArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .repositoryId(&#34;my-repository-upstream&#34;)
 *             .description(&#34;example docker repository (upstream source)&#34;)
 *             .format(&#34;DOCKER&#34;)
 *             .build());
 * 
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .repositoryId(&#34;my-repository&#34;)
 *             .description(&#34;example virtual docker repository&#34;)
 *             .format(&#34;DOCKER&#34;)
 *             .mode(&#34;VIRTUAL_REPOSITORY&#34;)
 *             .virtualRepositoryConfig(RepositoryVirtualRepositoryConfigArgs.builder()
 *                 .upstreamPolicies(RepositoryVirtualRepositoryConfigUpstreamPolicyArgs.builder()
 *                     .id(&#34;my-repository-upstream&#34;)
 *                     .repository(my_repo_upstream.id())
 *                     .priority(1)
 *                     .build())
 *                 .build())
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn()
 *                 .build());
 * 
 *     }
 * }
 * ```
 * ### Artifact Registry Repository Remote
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.artifactregistry.Repository;
 * import com.pulumi.gcp.artifactregistry.RepositoryArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigDockerRepositoryArgs;
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
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .description(&#34;example remote docker repository&#34;)
 *             .format(&#34;DOCKER&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .mode(&#34;REMOTE_REPOSITORY&#34;)
 *             .remoteRepositoryConfig(RepositoryRemoteRepositoryConfigArgs.builder()
 *                 .description(&#34;docker hub&#34;)
 *                 .dockerRepository(RepositoryRemoteRepositoryConfigDockerRepositoryArgs.builder()
 *                     .publicRepository(&#34;DOCKER_HUB&#34;)
 *                     .build())
 *                 .build())
 *             .repositoryId(&#34;my-repository&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Artifact Registry Repository Remote Apt
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.artifactregistry.Repository;
 * import com.pulumi.gcp.artifactregistry.RepositoryArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigAptRepositoryPublicRepositoryArgs;
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
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .description(&#34;example remote apt repository&#34;)
 *             .format(&#34;APT&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .mode(&#34;REMOTE_REPOSITORY&#34;)
 *             .remoteRepositoryConfig(RepositoryRemoteRepositoryConfigArgs.builder()
 *                 .aptRepository(RepositoryRemoteRepositoryConfigAptRepositoryArgs.builder()
 *                     .publicRepository(RepositoryRemoteRepositoryConfigAptRepositoryPublicRepositoryArgs.builder()
 *                         .repositoryBase(&#34;DEBIAN&#34;)
 *                         .repositoryPath(&#34;debian/dists/buster&#34;)
 *                         .build())
 *                     .build())
 *                 .description(&#34;Debian buster remote repository&#34;)
 *                 .build())
 *             .repositoryId(&#34;debian-buster&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Artifact Registry Repository Remote Yum
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.artifactregistry.Repository;
 * import com.pulumi.gcp.artifactregistry.RepositoryArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs;
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
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .description(&#34;example remote yum repository&#34;)
 *             .format(&#34;YUM&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .mode(&#34;REMOTE_REPOSITORY&#34;)
 *             .remoteRepositoryConfig(RepositoryRemoteRepositoryConfigArgs.builder()
 *                 .description(&#34;Centos 8 remote repository&#34;)
 *                 .yumRepository(RepositoryRemoteRepositoryConfigYumRepositoryArgs.builder()
 *                     .publicRepository(RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs.builder()
 *                         .repositoryBase(&#34;CENTOS&#34;)
 *                         .repositoryPath(&#34;centos/8-stream/BaseOS/x86_64/os&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .repositoryId(&#34;centos-8&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Artifact Registry Repository Cleanup
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.artifactregistry.Repository;
 * import com.pulumi.gcp.artifactregistry.RepositoryArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyConditionArgs;
 * import com.pulumi.gcp.artifactregistry.inputs.RepositoryCleanupPolicyMostRecentVersionsArgs;
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
 *         var my_repo = new Repository(&#34;my-repo&#34;, RepositoryArgs.builder()        
 *             .location(&#34;us-central1&#34;)
 *             .repositoryId(&#34;my-repository&#34;)
 *             .description(&#34;example docker repository with cleanup policies&#34;)
 *             .format(&#34;DOCKER&#34;)
 *             .cleanupPolicyDryRun(false)
 *             .cleanupPolicies(            
 *                 RepositoryCleanupPolicyArgs.builder()
 *                     .id(&#34;delete-prerelease&#34;)
 *                     .action(&#34;DELETE&#34;)
 *                     .condition(RepositoryCleanupPolicyConditionArgs.builder()
 *                         .tagState(&#34;TAGGED&#34;)
 *                         .tagPrefixes(                        
 *                             &#34;alpha&#34;,
 *                             &#34;v0&#34;)
 *                         .olderThan(&#34;2592000s&#34;)
 *                         .build())
 *                     .build(),
 *                 RepositoryCleanupPolicyArgs.builder()
 *                     .id(&#34;keep-tagged-release&#34;)
 *                     .action(&#34;KEEP&#34;)
 *                     .condition(RepositoryCleanupPolicyConditionArgs.builder()
 *                         .tagState(&#34;TAGGED&#34;)
 *                         .tagPrefixes(&#34;release&#34;)
 *                         .packageNamePrefixes(                        
 *                             &#34;webapp&#34;,
 *                             &#34;mobile&#34;)
 *                         .build())
 *                     .build(),
 *                 RepositoryCleanupPolicyArgs.builder()
 *                     .id(&#34;keep-minimum-versions&#34;)
 *                     .action(&#34;KEEP&#34;)
 *                     .mostRecentVersions(RepositoryCleanupPolicyMostRecentVersionsArgs.builder()
 *                         .packageNamePrefixes(                        
 *                             &#34;webapp&#34;,
 *                             &#34;mobile&#34;,
 *                             &#34;sandbox&#34;)
 *                         .keepCount(5)
 *                         .build())
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
 * Repository can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}` * `{{project}}/{{location}}/{{repository_id}}` * `{{location}}/{{repository_id}}` * `{{repository_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Repository using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}&#34;
 * 
 *  to = google_artifact_registry_repository.default }
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Repository can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository default projects/{{project}}/locations/{{location}}/repositories/{{repository_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository default {{project}}/{{location}}/{{repository_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository default {{location}}/{{repository_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:artifactregistry/repository:Repository default {{repository_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:artifactregistry/repository:Repository")
public class Repository extends com.pulumi.resources.CustomResource {
    /**
     * Cleanup policies for this repository. Cleanup policies indicate when certain package versions can be automatically
     * deleted. Map keys are policy IDs supplied by users during policy creation. They must unique within a repository and be
     * under 128 characters in length.
     * 
     */
    @Export(name="cleanupPolicies", refs={List.class,RepositoryCleanupPolicy.class}, tree="[0,1]")
    private Output</* @Nullable */ List<RepositoryCleanupPolicy>> cleanupPolicies;

    /**
     * @return Cleanup policies for this repository. Cleanup policies indicate when certain package versions can be automatically
     * deleted. Map keys are policy IDs supplied by users during policy creation. They must unique within a repository and be
     * under 128 characters in length.
     * 
     */
    public Output<Optional<List<RepositoryCleanupPolicy>>> cleanupPolicies() {
        return Codegen.optional(this.cleanupPolicies);
    }
    /**
     * If true, the cleanup pipeline is prevented from deleting versions in this repository.
     * 
     */
    @Export(name="cleanupPolicyDryRun", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> cleanupPolicyDryRun;

    /**
     * @return If true, the cleanup pipeline is prevented from deleting versions in this repository.
     * 
     */
    public Output<Optional<Boolean>> cleanupPolicyDryRun() {
        return Codegen.optional(this.cleanupPolicyDryRun);
    }
    /**
     * The time when the repository was created.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return The time when the repository was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The user-provided description of the repository.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The user-provided description of the repository.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Docker repository config contains repository level configuration for the repositories of docker type.
     * Structure is documented below.
     * 
     */
    @Export(name="dockerConfig", refs={RepositoryDockerConfig.class}, tree="[0]")
    private Output</* @Nullable */ RepositoryDockerConfig> dockerConfig;

    /**
     * @return Docker repository config contains repository level configuration for the repositories of docker type.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RepositoryDockerConfig>> dockerConfig() {
        return Codegen.optional(this.dockerConfig);
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
     * The format of packages that are stored in the repository. Supported formats
     * can be found [here](https://cloud.google.com/artifact-registry/docs/supported-formats).
     * You can only create alpha formats if you are a member of the
     * [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
     * 
     * ***
     * 
     */
    @Export(name="format", refs={String.class}, tree="[0]")
    private Output<String> format;

    /**
     * @return The format of packages that are stored in the repository. Supported formats
     * can be found [here](https://cloud.google.com/artifact-registry/docs/supported-formats).
     * You can only create alpha formats if you are a member of the
     * [alpha user group](https://cloud.google.com/artifact-registry/docs/supported-formats#alpha-access).
     * 
     * ***
     * 
     */
    public Output<String> format() {
        return this.format;
    }
    /**
     * The Cloud KMS resource name of the customer managed encryption key that’s
     * used to encrypt the contents of the Repository. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * This value may not be changed after the Repository has been created.
     * 
     */
    @Export(name="kmsKeyName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyName;

    /**
     * @return The Cloud KMS resource name of the customer managed encryption key that’s
     * used to encrypt the contents of the Repository. Has the form:
     * `projects/my-project/locations/my-region/keyRings/my-kr/cryptoKeys/my-key`.
     * This value may not be changed after the Repository has been created.
     * 
     */
    public Output<Optional<String>> kmsKeyName() {
        return Codegen.optional(this.kmsKeyName);
    }
    /**
     * Labels with user-defined metadata.
     * This field may contain up to 64 entries. Label keys and values may be no
     * longer than 63 characters. Label keys must begin with a lowercase letter
     * and may only contain lowercase letters, numeric characters, underscores,
     * and dashes.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Labels with user-defined metadata.
     * This field may contain up to 64 entries. Label keys and values may be no
     * longer than 63 characters. Label keys must begin with a lowercase letter
     * and may only contain lowercase letters, numeric characters, underscores,
     * and dashes.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * The name of the location this repository is located in.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The name of the location this repository is located in.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * MavenRepositoryConfig is maven related repository details.
     * Provides additional configuration details for repositories of the maven
     * format type.
     * Structure is documented below.
     * 
     */
    @Export(name="mavenConfig", refs={RepositoryMavenConfig.class}, tree="[0]")
    private Output</* @Nullable */ RepositoryMavenConfig> mavenConfig;

    /**
     * @return MavenRepositoryConfig is maven related repository details.
     * Provides additional configuration details for repositories of the maven
     * format type.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RepositoryMavenConfig>> mavenConfig() {
        return Codegen.optional(this.mavenConfig);
    }
    /**
     * The mode configures the repository to serve artifacts from different sources.
     * Default value is `STANDARD_REPOSITORY`.
     * Possible values are: `STANDARD_REPOSITORY`, `VIRTUAL_REPOSITORY`, `REMOTE_REPOSITORY`.
     * 
     */
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mode;

    /**
     * @return The mode configures the repository to serve artifacts from different sources.
     * Default value is `STANDARD_REPOSITORY`.
     * Possible values are: `STANDARD_REPOSITORY`, `VIRTUAL_REPOSITORY`, `REMOTE_REPOSITORY`.
     * 
     */
    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    /**
     * The name of the repository, for example:
     * &#34;repo1&#34;
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the repository, for example:
     * &#34;repo1&#34;
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
     * Configuration specific for a Remote Repository.
     * Structure is documented below.
     * 
     */
    @Export(name="remoteRepositoryConfig", refs={RepositoryRemoteRepositoryConfig.class}, tree="[0]")
    private Output</* @Nullable */ RepositoryRemoteRepositoryConfig> remoteRepositoryConfig;

    /**
     * @return Configuration specific for a Remote Repository.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RepositoryRemoteRepositoryConfig>> remoteRepositoryConfig() {
        return Codegen.optional(this.remoteRepositoryConfig);
    }
    /**
     * The last part of the repository name, for example:
     * &#34;repo1&#34;
     * 
     */
    @Export(name="repositoryId", refs={String.class}, tree="[0]")
    private Output<String> repositoryId;

    /**
     * @return The last part of the repository name, for example:
     * &#34;repo1&#34;
     * 
     */
    public Output<String> repositoryId() {
        return this.repositoryId;
    }
    /**
     * The time when the repository was last updated.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return The time when the repository was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }
    /**
     * Configuration specific for a Virtual Repository.
     * Structure is documented below.
     * 
     */
    @Export(name="virtualRepositoryConfig", refs={RepositoryVirtualRepositoryConfig.class}, tree="[0]")
    private Output</* @Nullable */ RepositoryVirtualRepositoryConfig> virtualRepositoryConfig;

    /**
     * @return Configuration specific for a Virtual Repository.
     * Structure is documented below.
     * 
     */
    public Output<Optional<RepositoryVirtualRepositoryConfig>> virtualRepositoryConfig() {
        return Codegen.optional(this.virtualRepositoryConfig);
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
        super("gcp:artifactregistry/repository:Repository", name, args == null ? RepositoryArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Repository(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:artifactregistry/repository:Repository", name, state, makeResourceOptions(options, id));
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
    public static Repository get(String name, Output<String> id, @Nullable RepositoryState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Repository(name, id, state, options);
    }
}
