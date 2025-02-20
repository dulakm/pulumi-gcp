// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.iam;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs;
import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderState;
import com.pulumi.gcp.iam.outputs.WorkloadIdentityPoolProviderAws;
import com.pulumi.gcp.iam.outputs.WorkloadIdentityPoolProviderOidc;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A configuration for an external identity provider.
 * 
 * To get more information about WorkloadIdentityPoolProvider, see:
 * 
 * * [API documentation](https://cloud.google.com/iam/docs/reference/rest/v1/projects.locations.workloadIdentityPools.providers)
 * * How-to Guides
 *     * [Managing workload identity providers](https://cloud.google.com/iam/docs/manage-workload-identity-pools-providers#managing_workload_identity_providers)
 * 
 * ## Example Usage
 * ### Iam Workload Identity Pool Provider Aws Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iam.WorkloadIdentityPool;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolArgs;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProvider;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs;
 * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs;
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
 *         var pool = new WorkloadIdentityPool(&#34;pool&#34;, WorkloadIdentityPoolArgs.builder()        
 *             .workloadIdentityPoolId(&#34;example-pool&#34;)
 *             .build());
 * 
 *         var example = new WorkloadIdentityPoolProvider(&#34;example&#34;, WorkloadIdentityPoolProviderArgs.builder()        
 *             .workloadIdentityPoolId(pool.workloadIdentityPoolId())
 *             .workloadIdentityPoolProviderId(&#34;example-prvdr&#34;)
 *             .aws(WorkloadIdentityPoolProviderAwsArgs.builder()
 *                 .accountId(&#34;999999999999&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Iam Workload Identity Pool Provider Aws Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iam.WorkloadIdentityPool;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolArgs;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProvider;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs;
 * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderAwsArgs;
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
 *         var pool = new WorkloadIdentityPool(&#34;pool&#34;, WorkloadIdentityPoolArgs.builder()        
 *             .workloadIdentityPoolId(&#34;example-pool&#34;)
 *             .build());
 * 
 *         var example = new WorkloadIdentityPoolProvider(&#34;example&#34;, WorkloadIdentityPoolProviderArgs.builder()        
 *             .workloadIdentityPoolId(pool.workloadIdentityPoolId())
 *             .workloadIdentityPoolProviderId(&#34;example-prvdr&#34;)
 *             .displayName(&#34;Name of provider&#34;)
 *             .description(&#34;AWS identity pool provider for automated test&#34;)
 *             .disabled(true)
 *             .attributeCondition(&#34;attribute.aws_role==\&#34;arn:aws:sts::999999999999:assumed-role/stack-eu-central-1-lambdaRole\&#34;&#34;)
 *             .attributeMapping(Map.ofEntries(
 *                 Map.entry(&#34;google.subject&#34;, &#34;assertion.arn&#34;),
 *                 Map.entry(&#34;attribute.aws_account&#34;, &#34;assertion.account&#34;),
 *                 Map.entry(&#34;attribute.environment&#34;, &#34;assertion.arn.contains(\&#34;:instance-profile/Production\&#34;) ? \&#34;prod\&#34; : \&#34;test\&#34;&#34;)
 *             ))
 *             .aws(WorkloadIdentityPoolProviderAwsArgs.builder()
 *                 .accountId(&#34;999999999999&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Iam Workload Identity Pool Provider Oidc Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iam.WorkloadIdentityPool;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolArgs;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProvider;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs;
 * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs;
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
 *         var pool = new WorkloadIdentityPool(&#34;pool&#34;, WorkloadIdentityPoolArgs.builder()        
 *             .workloadIdentityPoolId(&#34;example-pool&#34;)
 *             .build());
 * 
 *         var example = new WorkloadIdentityPoolProvider(&#34;example&#34;, WorkloadIdentityPoolProviderArgs.builder()        
 *             .workloadIdentityPoolId(pool.workloadIdentityPoolId())
 *             .workloadIdentityPoolProviderId(&#34;example-prvdr&#34;)
 *             .attributeMapping(Map.of(&#34;google.subject&#34;, &#34;assertion.sub&#34;))
 *             .oidc(WorkloadIdentityPoolProviderOidcArgs.builder()
 *                 .issuerUri(&#34;https://sts.windows.net/azure-tenant-id&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Iam Workload Identity Pool Provider Oidc Full
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iam.WorkloadIdentityPool;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolArgs;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProvider;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs;
 * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs;
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
 *         var pool = new WorkloadIdentityPool(&#34;pool&#34;, WorkloadIdentityPoolArgs.builder()        
 *             .workloadIdentityPoolId(&#34;example-pool&#34;)
 *             .build());
 * 
 *         var example = new WorkloadIdentityPoolProvider(&#34;example&#34;, WorkloadIdentityPoolProviderArgs.builder()        
 *             .workloadIdentityPoolId(pool.workloadIdentityPoolId())
 *             .workloadIdentityPoolProviderId(&#34;example-prvdr&#34;)
 *             .displayName(&#34;Name of provider&#34;)
 *             .description(&#34;OIDC identity pool provider for automated test&#34;)
 *             .disabled(true)
 *             .attributeCondition(&#34;\&#34;e968c2ef-047c-498d-8d79-16ca1b61e77e\&#34; in assertion.groups&#34;)
 *             .attributeMapping(Map.ofEntries(
 *                 Map.entry(&#34;google.subject&#34;, &#34;\&#34;azure::\&#34; + assertion.tid + \&#34;::\&#34; + assertion.sub&#34;),
 *                 Map.entry(&#34;attribute.tid&#34;, &#34;assertion.tid&#34;),
 *                 Map.entry(&#34;attribute.managed_identity_name&#34;, &#34;&#34;&#34;
 *       {
 *         &#34;8bb39bdb-1cc5-4447-b7db-a19e920eb111&#34;:&#34;workload1&#34;,
 *         &#34;55d36609-9bcf-48e0-a366-a3cf19027d2a&#34;:&#34;workload2&#34;
 *       }[assertion.oid]
 *                 &#34;&#34;&#34;)
 *             ))
 *             .oidc(WorkloadIdentityPoolProviderOidcArgs.builder()
 *                 .allowedAudiences(                
 *                     &#34;https://example.com/gcp-oidc-federation&#34;,
 *                     &#34;example.com/gcp-oidc-federation&#34;)
 *                 .issuerUri(&#34;https://sts.windows.net/azure-tenant-id&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Iam Workload Identity Pool Provider Oidc Upload Key
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.iam.WorkloadIdentityPool;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolArgs;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProvider;
 * import com.pulumi.gcp.iam.WorkloadIdentityPoolProviderArgs;
 * import com.pulumi.gcp.iam.inputs.WorkloadIdentityPoolProviderOidcArgs;
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
 *         var pool = new WorkloadIdentityPool(&#34;pool&#34;, WorkloadIdentityPoolArgs.builder()        
 *             .workloadIdentityPoolId(&#34;example-pool&#34;)
 *             .build());
 * 
 *         var example = new WorkloadIdentityPoolProvider(&#34;example&#34;, WorkloadIdentityPoolProviderArgs.builder()        
 *             .workloadIdentityPoolId(pool.workloadIdentityPoolId())
 *             .workloadIdentityPoolProviderId(&#34;example-prvdr&#34;)
 *             .displayName(&#34;Name of provider&#34;)
 *             .description(&#34;OIDC identity pool provider for automated test&#34;)
 *             .disabled(true)
 *             .attributeCondition(&#34;\&#34;e968c2ef-047c-498d-8d79-16ca1b61e77e\&#34; in assertion.groups&#34;)
 *             .attributeMapping(Map.ofEntries(
 *                 Map.entry(&#34;google.subject&#34;, &#34;\&#34;azure::\&#34; + assertion.tid + \&#34;::\&#34; + assertion.sub&#34;),
 *                 Map.entry(&#34;attribute.tid&#34;, &#34;assertion.tid&#34;),
 *                 Map.entry(&#34;attribute.managed_identity_name&#34;, &#34;&#34;&#34;
 *       {
 *         &#34;8bb39bdb-1cc5-4447-b7db-a19e920eb111&#34;:&#34;workload1&#34;,
 *         &#34;55d36609-9bcf-48e0-a366-a3cf19027d2a&#34;:&#34;workload2&#34;
 *       }[assertion.oid]
 *                 &#34;&#34;&#34;)
 *             ))
 *             .oidc(WorkloadIdentityPoolProviderOidcArgs.builder()
 *                 .allowedAudiences(                
 *                     &#34;https://example.com/gcp-oidc-federation&#34;,
 *                     &#34;example.com/gcp-oidc-federation&#34;)
 *                 .issuerUri(&#34;https://sts.windows.net/azure-tenant-id&#34;)
 *                 .jwksJson(&#34;{\&#34;keys\&#34;:[{\&#34;kty\&#34;:\&#34;RSA\&#34;,\&#34;alg\&#34;:\&#34;RS256\&#34;,\&#34;kid\&#34;:\&#34;sif0AR-F6MuvksAyAOv-Pds08Bcf2eUMlxE30NofddA\&#34;,\&#34;use\&#34;:\&#34;sig\&#34;,\&#34;e\&#34;:\&#34;AQAB\&#34;,\&#34;n\&#34;:\&#34;ylH1Chl1tpfti3lh51E1g5dPogzXDaQseqjsefGLknaNl5W6Wd4frBhHyE2t41Q5zgz_Ll0-NvWm0FlaG6brhrN9QZu6sJP1bM8WPfJVPgXOanxi7d7TXCkeNubGeiLTf5R3UXtS9Lm_guemU7MxDjDTelxnlgGCihOVTcL526suNJUdfXtpwUsvdU6_ZnAp9IpsuYjCtwPm9hPumlcZGMbxstdh07O4y4O90cVQClJOKSGQjAUCKJWXIQ0cqffGS_HuS_725CPzQ85SzYZzaNpgfhAER7kx_9P16ARM3BJz0PI5fe2hECE61J4GYU_BY43sxDfs7HyJpEXKLU9eWw\&#34;}]}&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * WorkloadIdentityPoolProvider can be imported using any of these accepted formats* `projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}/providers/{{workload_identity_pool_provider_id}}` * `{{project}}/{{workload_identity_pool_id}}/{{workload_identity_pool_provider_id}}` * `{{workload_identity_pool_id}}/{{workload_identity_pool_provider_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import WorkloadIdentityPoolProvider using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}/providers/{{workload_identity_pool_provider_id}}&#34;
 * 
 *  to = google_iam_workload_identity_pool_provider.default }
 * 
 * ```sh
 *  $ pulumi import gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), WorkloadIdentityPoolProvider can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider default projects/{{project}}/locations/global/workloadIdentityPools/{{workload_identity_pool_id}}/providers/{{workload_identity_pool_provider_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider default {{project}}/{{workload_identity_pool_id}}/{{workload_identity_pool_provider_id}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider default {{workload_identity_pool_id}}/{{workload_identity_pool_provider_id}}
 * ```
 * 
 */
@ResourceType(type="gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider")
public class WorkloadIdentityPoolProvider extends com.pulumi.resources.CustomResource {
    /**
     * [A Common Expression Language](https://opensource.google/projects/cel) expression, in
     * plain text, to restrict what otherwise valid authentication credentials issued by the
     * provider should not be accepted.
     * The expression must output a boolean representing whether to allow the federation.
     * The following keywords may be referenced in the expressions:
     * 
     */
    @Export(name="attributeCondition", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> attributeCondition;

    /**
     * @return [A Common Expression Language](https://opensource.google/projects/cel) expression, in
     * plain text, to restrict what otherwise valid authentication credentials issued by the
     * provider should not be accepted.
     * The expression must output a boolean representing whether to allow the federation.
     * The following keywords may be referenced in the expressions:
     * 
     */
    public Output<Optional<String>> attributeCondition() {
        return Codegen.optional(this.attributeCondition);
    }
    /**
     * Maps attributes from authentication credentials issued by an external identity provider
     * to Google Cloud attributes, such as `subject` and `segment`.
     * Each key must be a string specifying the Google Cloud IAM attribute to map to.
     * The following keys are supported:
     * * `google.subject`: The principal IAM is authenticating. You can reference this value
     *   in IAM bindings. This is also the subject that appears in Cloud Logging logs.
     *   Cannot exceed 127 characters.
     * * `google.groups`: Groups the external identity belongs to. You can grant groups
     *   access to resources using an IAM `principalSet` binding; access applies to all
     *   members of the group.
     *   You can also provide custom attributes by specifying `attribute.{custom_attribute}`,
     *   where `{custom_attribute}` is the name of the custom attribute to be mapped. You can
     *   define a maximum of 50 custom attributes. The maximum length of a mapped attribute key
     *   is 100 characters, and the key may only contain the characters [a-z0-9_].
     *   You can reference these attributes in IAM policies to define fine-grained access for a
     *   workload to Google Cloud resources. For example:
     * * `google.subject`:
     *   `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
     * * `google.groups`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
     * * `attribute.{custom_attribute}`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
     *   Each value must be a [Common Expression Language](https://opensource.google/projects/cel)
     *   function that maps an identity provider credential to the normalized attribute specified
     *   by the corresponding map key.
     *   You can use the `assertion` keyword in the expression to access a JSON representation of
     *   the authentication credential issued by the provider.
     *   The maximum length of an attribute mapping expression is 2048 characters. When evaluated,
     *   the total size of all mapped attributes must not exceed 8KB.
     *   For AWS providers, the following rules apply:
     * - If no attribute mapping is defined, the following default mapping applies:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * - If any custom attribute mappings are defined, they must include a mapping to the
     *   `google.subject` attribute.
     *   For OIDC providers, the following rules apply:
     * - Custom attribute mappings must be defined, and must include a mapping to the
     *   `google.subject` attribute. For example, the following maps the `sub` claim of the
     *   incoming credential to the `subject` attribute on a Google token.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * 
     */
    @Export(name="attributeMapping", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> attributeMapping;

    /**
     * @return Maps attributes from authentication credentials issued by an external identity provider
     * to Google Cloud attributes, such as `subject` and `segment`.
     * Each key must be a string specifying the Google Cloud IAM attribute to map to.
     * The following keys are supported:
     * * `google.subject`: The principal IAM is authenticating. You can reference this value
     *   in IAM bindings. This is also the subject that appears in Cloud Logging logs.
     *   Cannot exceed 127 characters.
     * * `google.groups`: Groups the external identity belongs to. You can grant groups
     *   access to resources using an IAM `principalSet` binding; access applies to all
     *   members of the group.
     *   You can also provide custom attributes by specifying `attribute.{custom_attribute}`,
     *   where `{custom_attribute}` is the name of the custom attribute to be mapped. You can
     *   define a maximum of 50 custom attributes. The maximum length of a mapped attribute key
     *   is 100 characters, and the key may only contain the characters [a-z0-9_].
     *   You can reference these attributes in IAM policies to define fine-grained access for a
     *   workload to Google Cloud resources. For example:
     * * `google.subject`:
     *   `principal://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/subject/{value}`
     * * `google.groups`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/group/{value}`
     * * `attribute.{custom_attribute}`:
     *   `principalSet://iam.googleapis.com/projects/{project}/locations/{location}/workloadIdentityPools/{pool}/attribute.{custom_attribute}/{value}`
     *   Each value must be a [Common Expression Language](https://opensource.google/projects/cel)
     *   function that maps an identity provider credential to the normalized attribute specified
     *   by the corresponding map key.
     *   You can use the `assertion` keyword in the expression to access a JSON representation of
     *   the authentication credential issued by the provider.
     *   The maximum length of an attribute mapping expression is 2048 characters. When evaluated,
     *   the total size of all mapped attributes must not exceed 8KB.
     *   For AWS providers, the following rules apply:
     * - If no attribute mapping is defined, the following default mapping applies:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * - If any custom attribute mappings are defined, they must include a mapping to the
     *   `google.subject` attribute.
     *   For OIDC providers, the following rules apply:
     * - Custom attribute mappings must be defined, and must include a mapping to the
     *   `google.subject` attribute. For example, the following maps the `sub` claim of the
     *   incoming credential to the `subject` attribute on a Google token.
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
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
     *     }
     * }
     * ```
     * 
     */
    public Output<Optional<Map<String,String>>> attributeMapping() {
        return Codegen.optional(this.attributeMapping);
    }
    /**
     * An Amazon Web Services identity provider. Not compatible with the property oidc.
     * Structure is documented below.
     * 
     */
    @Export(name="aws", refs={WorkloadIdentityPoolProviderAws.class}, tree="[0]")
    private Output</* @Nullable */ WorkloadIdentityPoolProviderAws> aws;

    /**
     * @return An Amazon Web Services identity provider. Not compatible with the property oidc.
     * Structure is documented below.
     * 
     */
    public Output<Optional<WorkloadIdentityPoolProviderAws>> aws() {
        return Codegen.optional(this.aws);
    }
    /**
     * A description for the provider. Cannot exceed 256 characters.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description for the provider. Cannot exceed 256 characters.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the provider is disabled. You cannot use a disabled provider to exchange tokens.
     * However, existing tokens still grant access.
     * 
     */
    @Export(name="disabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> disabled;

    /**
     * @return Whether the provider is disabled. You cannot use a disabled provider to exchange tokens.
     * However, existing tokens still grant access.
     * 
     */
    public Output<Optional<Boolean>> disabled() {
        return Codegen.optional(this.disabled);
    }
    /**
     * A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return A display name for the provider. Cannot exceed 32 characters.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The resource name of the provider as
     * `projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/providers/{workload_identity_pool_provider_id}`.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The resource name of the provider as
     * `projects/{project_number}/locations/global/workloadIdentityPools/{workload_identity_pool_id}/providers/{workload_identity_pool_provider_id}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * An OpenId Connect 1.0 identity provider. Not compatible with the property aws.
     * Structure is documented below.
     * 
     */
    @Export(name="oidc", refs={WorkloadIdentityPoolProviderOidc.class}, tree="[0]")
    private Output</* @Nullable */ WorkloadIdentityPoolProviderOidc> oidc;

    /**
     * @return An OpenId Connect 1.0 identity provider. Not compatible with the property aws.
     * Structure is documented below.
     * 
     */
    public Output<Optional<WorkloadIdentityPoolProviderOidc>> oidc() {
        return Codegen.optional(this.oidc);
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
     * The state of the provider.
     * * STATE_UNSPECIFIED: State unspecified.
     * * ACTIVE: The provider is active, and may be used to validate authentication credentials.
     * * DELETED: The provider is soft-deleted. Soft-deleted providers are permanently deleted
     *   after approximately 30 days. You can restore a soft-deleted provider using
     *   UndeleteWorkloadIdentityPoolProvider. You cannot reuse the ID of a soft-deleted provider
     *   until it is permanently deleted.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the provider.
     * * STATE_UNSPECIFIED: State unspecified.
     * * ACTIVE: The provider is active, and may be used to validate authentication credentials.
     * * DELETED: The provider is soft-deleted. Soft-deleted providers are permanently deleted
     *   after approximately 30 days. You can restore a soft-deleted provider using
     *   UndeleteWorkloadIdentityPoolProvider. You cannot reuse the ID of a soft-deleted provider
     *   until it is permanently deleted.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The ID used for the pool, which is the final component of the pool resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    @Export(name="workloadIdentityPoolId", refs={String.class}, tree="[0]")
    private Output<String> workloadIdentityPoolId;

    /**
     * @return The ID used for the pool, which is the final component of the pool resource name. This
     * value should be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     */
    public Output<String> workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }
    /**
     * The ID for the provider, which becomes the final component of the resource name. This
     * value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     * ***
     * 
     */
    @Export(name="workloadIdentityPoolProviderId", refs={String.class}, tree="[0]")
    private Output<String> workloadIdentityPoolProviderId;

    /**
     * @return The ID for the provider, which becomes the final component of the resource name. This
     * value must be 4-32 characters, and may contain the characters [a-z0-9-]. The prefix
     * `gcp-` is reserved for use by Google, and may not be specified.
     * 
     * ***
     * 
     */
    public Output<String> workloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WorkloadIdentityPoolProvider(String name) {
        this(name, WorkloadIdentityPoolProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WorkloadIdentityPoolProvider(String name, WorkloadIdentityPoolProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WorkloadIdentityPoolProvider(String name, WorkloadIdentityPoolProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider", name, args == null ? WorkloadIdentityPoolProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WorkloadIdentityPoolProvider(String name, Output<String> id, @Nullable WorkloadIdentityPoolProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:iam/workloadIdentityPoolProvider:WorkloadIdentityPoolProvider", name, state, makeResourceOptions(options, id));
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
    public static WorkloadIdentityPoolProvider get(String name, Output<String> id, @Nullable WorkloadIdentityPoolProviderState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WorkloadIdentityPoolProvider(name, id, state, options);
    }
}
