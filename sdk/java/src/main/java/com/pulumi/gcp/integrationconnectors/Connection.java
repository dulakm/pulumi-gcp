// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.integrationconnectors;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.integrationconnectors.ConnectionArgs;
import com.pulumi.gcp.integrationconnectors.inputs.ConnectionState;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionAuthConfig;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionConfigVariable;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionConnectorVersionInfraConfig;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionDestinationConfig;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionEventingConfig;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionEventingRuntimeData;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionLockConfig;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionLogConfig;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionNodeConfig;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionSslConfig;
import com.pulumi.gcp.integrationconnectors.outputs.ConnectionStatus;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * An Integration connectors Connection.
 * 
 * To get more information about Connection, see:
 * 
 * * [API documentation](https://cloud.google.com/integration-connectors/docs/reference/rest/v1/projects.locations.connections)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/integration-connectors/docs/createconnection)
 * 
 * ## Example Usage
 * ### Integration Connectors Connection Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.integrationconnectors.Connection;
 * import com.pulumi.gcp.integrationconnectors.ConnectionArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs;
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
 *         final var testProject = OrganizationsFunctions.getProject();
 * 
 *         var pubsubconnection = new Connection(&#34;pubsubconnection&#34;, ConnectionArgs.builder()        
 *             .configVariables(            
 *                 ConnectionConfigVariableArgs.builder()
 *                     .key(&#34;project_id&#34;)
 *                     .stringValue(&#34;connectors-example&#34;)
 *                     .build(),
 *                 ConnectionConfigVariableArgs.builder()
 *                     .key(&#34;topic_id&#34;)
 *                     .stringValue(&#34;test&#34;)
 *                     .build())
 *             .connectorVersion(String.format(&#34;projects/%s/locations/global/providers/gcp/connectors/pubsub/versions/1&#34;, testProject.applyValue(getProjectResult -&gt; getProjectResult.projectId())))
 *             .description(&#34;tf created description&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Integration Connectors Connection Advanced
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.organizations.OrganizationsFunctions;
 * import com.pulumi.gcp.organizations.inputs.GetProjectArgs;
 * import com.pulumi.gcp.secretmanager.Secret;
 * import com.pulumi.gcp.secretmanager.SecretArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationArgs;
 * import com.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedArgs;
 * import com.pulumi.gcp.secretmanager.SecretVersion;
 * import com.pulumi.gcp.secretmanager.SecretVersionArgs;
 * import com.pulumi.gcp.secretmanager.SecretIamMember;
 * import com.pulumi.gcp.secretmanager.SecretIamMemberArgs;
 * import com.pulumi.gcp.integrationconnectors.Connection;
 * import com.pulumi.gcp.integrationconnectors.ConnectionArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableEncryptionKeyValueArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionConfigVariableSecretValueArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionAuthConfigUserPasswordPasswordArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionDestinationConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionLockConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionLogConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionNodeConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientCertificateArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientPrivateKeyArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigClientPrivateKeyPassArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionSslConfigPrivateServerCertificateArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigRegistrationDestinationConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigUserPasswordArgs;
 * import com.pulumi.gcp.integrationconnectors.inputs.ConnectionEventingConfigAuthConfigUserPasswordPasswordArgs;
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
 *         final var testProject = OrganizationsFunctions.getProject();
 * 
 *         var secret_basic = new Secret(&#34;secret-basic&#34;, SecretArgs.builder()        
 *             .secretId(&#34;test-secret&#34;)
 *             .replication(SecretReplicationArgs.builder()
 *                 .userManaged(SecretReplicationUserManagedArgs.builder()
 *                     .replicas(SecretReplicationUserManagedReplicaArgs.builder()
 *                         .location(&#34;us-central1&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var secret_version_basic = new SecretVersion(&#34;secret-version-basic&#34;, SecretVersionArgs.builder()        
 *             .secret(secret_basic.id())
 *             .secretData(&#34;dummypassword&#34;)
 *             .build());
 * 
 *         var secretIam = new SecretIamMember(&#34;secretIam&#34;, SecretIamMemberArgs.builder()        
 *             .secretId(secret_basic.id())
 *             .role(&#34;roles/secretmanager.admin&#34;)
 *             .member(String.format(&#34;serviceAccount:%s-compute@developer.gserviceaccount.com&#34;, testProject.applyValue(getProjectResult -&gt; getProjectResult.number())))
 *             .build(), CustomResourceOptions.builder()
 *                 .dependsOn(secret_version_basic)
 *                 .build());
 * 
 *         var zendeskconnection = new Connection(&#34;zendeskconnection&#34;, ConnectionArgs.builder()        
 *             .description(&#34;tf updated description&#34;)
 *             .location(&#34;us-central1&#34;)
 *             .serviceAccount(String.format(&#34;%s-compute@developer.gserviceaccount.com&#34;, testProject.applyValue(getProjectResult -&gt; getProjectResult.number())))
 *             .connectorVersion(String.format(&#34;projects/%s/locations/global/providers/zendesk/connectors/zendesk/versions/1&#34;, testProject.applyValue(getProjectResult -&gt; getProjectResult.projectId())))
 *             .configVariables(            
 *                 ConnectionConfigVariableArgs.builder()
 *                     .key(&#34;proxy_enabled&#34;)
 *                     .booleanValue(false)
 *                     .build(),
 *                 ConnectionConfigVariableArgs.builder()
 *                     .key(&#34;sample_integer_value&#34;)
 *                     .integerValue(1)
 *                     .build(),
 *                 ConnectionConfigVariableArgs.builder()
 *                     .key(&#34;sample_encryption_key_value&#34;)
 *                     .encryptionKeyValue(ConnectionConfigVariableEncryptionKeyValueArgs.builder()
 *                         .type(&#34;GOOGLE_MANAGED&#34;)
 *                         .kmsKeyName(&#34;sampleKMSKkey&#34;)
 *                         .build())
 *                     .build(),
 *                 ConnectionConfigVariableArgs.builder()
 *                     .key(&#34;sample_secret_value&#34;)
 *                     .secretValue(ConnectionConfigVariableSecretValueArgs.builder()
 *                         .secretVersion(secret_version_basic.name())
 *                         .build())
 *                     .build())
 *             .suspended(false)
 *             .authConfig(ConnectionAuthConfigArgs.builder()
 *                 .additionalVariables(                
 *                     ConnectionAuthConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_string&#34;)
 *                         .stringValue(&#34;sampleString&#34;)
 *                         .build(),
 *                     ConnectionAuthConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_boolean&#34;)
 *                         .booleanValue(false)
 *                         .build(),
 *                     ConnectionAuthConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_integer&#34;)
 *                         .integerValue(1)
 *                         .build(),
 *                     ConnectionAuthConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_secret_value&#34;)
 *                         .secretValue(ConnectionAuthConfigAdditionalVariableSecretValueArgs.builder()
 *                             .secretVersion(secret_version_basic.name())
 *                             .build())
 *                         .build(),
 *                     ConnectionAuthConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_encryption_key_value&#34;)
 *                         .encryptionKeyValue(ConnectionAuthConfigAdditionalVariableEncryptionKeyValueArgs.builder()
 *                             .type(&#34;GOOGLE_MANAGED&#34;)
 *                             .kmsKeyName(&#34;sampleKMSKkey&#34;)
 *                             .build())
 *                         .build())
 *                 .authType(&#34;USER_PASSWORD&#34;)
 *                 .authKey(&#34;sampleAuthKey&#34;)
 *                 .userPassword(ConnectionAuthConfigUserPasswordArgs.builder()
 *                     .username(&#34;user@xyz.com&#34;)
 *                     .password(ConnectionAuthConfigUserPasswordPasswordArgs.builder()
 *                         .secretVersion(secret_version_basic.name())
 *                         .build())
 *                     .build())
 *                 .build())
 *             .destinationConfigs(ConnectionDestinationConfigArgs.builder()
 *                 .key(&#34;url&#34;)
 *                 .destinations(ConnectionDestinationConfigDestinationArgs.builder()
 *                     .host(&#34;https://test.zendesk.com&#34;)
 *                     .port(80)
 *                     .build())
 *                 .build())
 *             .lockConfig(ConnectionLockConfigArgs.builder()
 *                 .locked(false)
 *                 .reason(&#34;Its not locked&#34;)
 *                 .build())
 *             .logConfig(ConnectionLogConfigArgs.builder()
 *                 .enabled(true)
 *                 .build())
 *             .nodeConfig(ConnectionNodeConfigArgs.builder()
 *                 .minNodeCount(2)
 *                 .maxNodeCount(50)
 *                 .build())
 *             .labels(Map.of(&#34;foo&#34;, &#34;bar&#34;))
 *             .sslConfig(ConnectionSslConfigArgs.builder()
 *                 .additionalVariables(                
 *                     ConnectionSslConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_string&#34;)
 *                         .stringValue(&#34;sampleString&#34;)
 *                         .build(),
 *                     ConnectionSslConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_boolean&#34;)
 *                         .booleanValue(false)
 *                         .build(),
 *                     ConnectionSslConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_integer&#34;)
 *                         .integerValue(1)
 *                         .build(),
 *                     ConnectionSslConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_secret_value&#34;)
 *                         .secretValue(ConnectionSslConfigAdditionalVariableSecretValueArgs.builder()
 *                             .secretVersion(secret_version_basic.name())
 *                             .build())
 *                         .build(),
 *                     ConnectionSslConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_encryption_key_value&#34;)
 *                         .encryptionKeyValue(ConnectionSslConfigAdditionalVariableEncryptionKeyValueArgs.builder()
 *                             .type(&#34;GOOGLE_MANAGED&#34;)
 *                             .kmsKeyName(&#34;sampleKMSKkey&#34;)
 *                             .build())
 *                         .build())
 *                 .clientCertType(&#34;PEM&#34;)
 *                 .clientCertificate(ConnectionSslConfigClientCertificateArgs.builder()
 *                     .secretVersion(secret_version_basic.name())
 *                     .build())
 *                 .clientPrivateKey(ConnectionSslConfigClientPrivateKeyArgs.builder()
 *                     .secretVersion(secret_version_basic.name())
 *                     .build())
 *                 .clientPrivateKeyPass(ConnectionSslConfigClientPrivateKeyPassArgs.builder()
 *                     .secretVersion(secret_version_basic.name())
 *                     .build())
 *                 .privateServerCertificate(ConnectionSslConfigPrivateServerCertificateArgs.builder()
 *                     .secretVersion(secret_version_basic.name())
 *                     .build())
 *                 .serverCertType(&#34;PEM&#34;)
 *                 .trustModel(&#34;PRIVATE&#34;)
 *                 .type(&#34;TLS&#34;)
 *                 .useSsl(true)
 *                 .build())
 *             .eventingEnablementType(&#34;EVENTING_AND_CONNECTION&#34;)
 *             .eventingConfig(ConnectionEventingConfigArgs.builder()
 *                 .additionalVariables(                
 *                     ConnectionEventingConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_string&#34;)
 *                         .stringValue(&#34;sampleString&#34;)
 *                         .build(),
 *                     ConnectionEventingConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_boolean&#34;)
 *                         .booleanValue(false)
 *                         .build(),
 *                     ConnectionEventingConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_integer&#34;)
 *                         .integerValue(1)
 *                         .build(),
 *                     ConnectionEventingConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_secret_value&#34;)
 *                         .secretValue(ConnectionEventingConfigAdditionalVariableSecretValueArgs.builder()
 *                             .secretVersion(secret_version_basic.name())
 *                             .build())
 *                         .build(),
 *                     ConnectionEventingConfigAdditionalVariableArgs.builder()
 *                         .key(&#34;sample_encryption_key_value&#34;)
 *                         .encryptionKeyValue(ConnectionEventingConfigAdditionalVariableEncryptionKeyValueArgs.builder()
 *                             .type(&#34;GOOGLE_MANAGED&#34;)
 *                             .kmsKeyName(&#34;sampleKMSKkey&#34;)
 *                             .build())
 *                         .build())
 *                 .registrationDestinationConfig(ConnectionEventingConfigRegistrationDestinationConfigArgs.builder()
 *                     .key(&#34;registration_destination_config&#34;)
 *                     .destinations(ConnectionEventingConfigRegistrationDestinationConfigDestinationArgs.builder()
 *                         .host(&#34;https://test.zendesk.com&#34;)
 *                         .port(80)
 *                         .build())
 *                     .build())
 *                 .authConfig(ConnectionEventingConfigAuthConfigArgs.builder()
 *                     .authType(&#34;USER_PASSWORD&#34;)
 *                     .authKey(&#34;sampleAuthKey&#34;)
 *                     .userPassword(ConnectionEventingConfigAuthConfigUserPasswordArgs.builder()
 *                         .username(&#34;user@xyz.com&#34;)
 *                         .password(ConnectionEventingConfigAuthConfigUserPasswordPasswordArgs.builder()
 *                             .secretVersion(secret_version_basic.name())
 *                             .build())
 *                         .build())
 *                     .additionalVariables(                    
 *                         ConnectionEventingConfigAuthConfigAdditionalVariableArgs.builder()
 *                             .key(&#34;sample_string&#34;)
 *                             .stringValue(&#34;sampleString&#34;)
 *                             .build(),
 *                         ConnectionEventingConfigAuthConfigAdditionalVariableArgs.builder()
 *                             .key(&#34;sample_boolean&#34;)
 *                             .booleanValue(false)
 *                             .build(),
 *                         ConnectionEventingConfigAuthConfigAdditionalVariableArgs.builder()
 *                             .key(&#34;sample_integer&#34;)
 *                             .integerValue(1)
 *                             .build(),
 *                         ConnectionEventingConfigAuthConfigAdditionalVariableArgs.builder()
 *                             .key(&#34;sample_secret_value&#34;)
 *                             .secretValue(ConnectionEventingConfigAuthConfigAdditionalVariableSecretValueArgs.builder()
 *                                 .secretVersion(secret_version_basic.name())
 *                                 .build())
 *                             .build(),
 *                         ConnectionEventingConfigAuthConfigAdditionalVariableArgs.builder()
 *                             .key(&#34;sample_encryption_key_value&#34;)
 *                             .encryptionKeyValue(ConnectionEventingConfigAuthConfigAdditionalVariableEncryptionKeyValueArgs.builder()
 *                                 .type(&#34;GOOGLE_MANAGED&#34;)
 *                                 .kmsKeyName(&#34;sampleKMSKkey&#34;)
 *                                 .build())
 *                             .build())
 *                     .build())
 *                 .enrichmentEnabled(true)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Connection can be imported using any of these accepted formats* `projects/{{project}}/locations/{{location}}/connections/{{name}}` * `{{project}}/{{location}}/{{name}}` * `{{location}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Connection using one of the formats above. For exampletf import {
 * 
 *  id = &#34;projects/{{project}}/locations/{{location}}/connections/{{name}}&#34;
 * 
 *  to = google_integration_connectors_connection.default }
 * 
 * ```sh
 *  $ pulumi import gcp:integrationconnectors/connection:Connection When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Connection can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:integrationconnectors/connection:Connection default projects/{{project}}/locations/{{location}}/connections/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:integrationconnectors/connection:Connection default {{project}}/{{location}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:integrationconnectors/connection:Connection default {{location}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:integrationconnectors/connection:Connection")
public class Connection extends com.pulumi.resources.CustomResource {
    /**
     * authConfig for the connection.
     * Structure is documented below.
     * 
     */
    @Export(name="authConfig", refs={ConnectionAuthConfig.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionAuthConfig> authConfig;

    /**
     * @return authConfig for the connection.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionAuthConfig>> authConfig() {
        return Codegen.optional(this.authConfig);
    }
    /**
     * Config Variables for the connection.
     * Structure is documented below.
     * 
     */
    @Export(name="configVariables", refs={List.class,ConnectionConfigVariable.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ConnectionConfigVariable>> configVariables;

    /**
     * @return Config Variables for the connection.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<ConnectionConfigVariable>>> configVariables() {
        return Codegen.optional(this.configVariables);
    }
    /**
     * Connection revision. This field is only updated when the connection is created or updated by User.
     * 
     */
    @Export(name="connectionRevision", refs={String.class}, tree="[0]")
    private Output<String> connectionRevision;

    /**
     * @return Connection revision. This field is only updated when the connection is created or updated by User.
     * 
     */
    public Output<String> connectionRevision() {
        return this.connectionRevision;
    }
    /**
     * connectorVersion of the Connector.
     * 
     */
    @Export(name="connectorVersion", refs={String.class}, tree="[0]")
    private Output<String> connectorVersion;

    /**
     * @return connectorVersion of the Connector.
     * 
     */
    public Output<String> connectorVersion() {
        return this.connectorVersion;
    }
    /**
     * This cofiguration provides infra configs like rate limit threshold which need to be configurable for every connector version.
     * Structure is documented below.
     * 
     */
    @Export(name="connectorVersionInfraConfigs", refs={List.class,ConnectionConnectorVersionInfraConfig.class}, tree="[0,1]")
    private Output<List<ConnectionConnectorVersionInfraConfig>> connectorVersionInfraConfigs;

    /**
     * @return This cofiguration provides infra configs like rate limit threshold which need to be configurable for every connector version.
     * Structure is documented below.
     * 
     */
    public Output<List<ConnectionConnectorVersionInfraConfig>> connectorVersionInfraConfigs() {
        return this.connectorVersionInfraConfigs;
    }
    /**
     * Flag to mark the version indicating the launch stage.
     * 
     */
    @Export(name="connectorVersionLaunchStage", refs={String.class}, tree="[0]")
    private Output<String> connectorVersionLaunchStage;

    /**
     * @return Flag to mark the version indicating the launch stage.
     * 
     */
    public Output<String> connectorVersionLaunchStage() {
        return this.connectorVersionLaunchStage;
    }
    /**
     * Time the Namespace was created in UTC.
     * 
     */
    @Export(name="createTime", refs={String.class}, tree="[0]")
    private Output<String> createTime;

    /**
     * @return Time the Namespace was created in UTC.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * An arbitrary description for the Conection.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return An arbitrary description for the Conection.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Define the Connectors target endpoint.
     * Structure is documented below.
     * 
     */
    @Export(name="destinationConfigs", refs={List.class,ConnectionDestinationConfig.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ConnectionDestinationConfig>> destinationConfigs;

    /**
     * @return Define the Connectors target endpoint.
     * Structure is documented below.
     * 
     */
    public Output<Optional<List<ConnectionDestinationConfig>>> destinationConfigs() {
        return Codegen.optional(this.destinationConfigs);
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
     * Eventing Configuration of a connection
     * Structure is documented below.
     * 
     */
    @Export(name="eventingConfig", refs={ConnectionEventingConfig.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionEventingConfig> eventingConfig;

    /**
     * @return Eventing Configuration of a connection
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionEventingConfig>> eventingConfig() {
        return Codegen.optional(this.eventingConfig);
    }
    /**
     * Eventing enablement type. Will be nil if eventing is not enabled.
     * Possible values are: `EVENTING_AND_CONNECTION`, `ONLY_EVENTING`.
     * 
     */
    @Export(name="eventingEnablementType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventingEnablementType;

    /**
     * @return Eventing enablement type. Will be nil if eventing is not enabled.
     * Possible values are: `EVENTING_AND_CONNECTION`, `ONLY_EVENTING`.
     * 
     */
    public Output<Optional<String>> eventingEnablementType() {
        return Codegen.optional(this.eventingEnablementType);
    }
    /**
     * Eventing Runtime Data.
     * Structure is documented below.
     * 
     */
    @Export(name="eventingRuntimeDatas", refs={List.class,ConnectionEventingRuntimeData.class}, tree="[0,1]")
    private Output<List<ConnectionEventingRuntimeData>> eventingRuntimeDatas;

    /**
     * @return Eventing Runtime Data.
     * Structure is documented below.
     * 
     */
    public Output<List<ConnectionEventingRuntimeData>> eventingRuntimeDatas() {
        return this.eventingRuntimeDatas;
    }
    /**
     * Resource labels to represent user provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Export(name="labels", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> labels;

    /**
     * @return Resource labels to represent user provided metadata.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> labels() {
        return Codegen.optional(this.labels);
    }
    /**
     * Location in which Connection needs to be created.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return Location in which Connection needs to be created.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Determines whether or no a connection is locked. If locked, a reason must be specified.
     * Structure is documented below.
     * 
     */
    @Export(name="lockConfig", refs={ConnectionLockConfig.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionLockConfig> lockConfig;

    /**
     * @return Determines whether or no a connection is locked. If locked, a reason must be specified.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionLockConfig>> lockConfig() {
        return Codegen.optional(this.lockConfig);
    }
    /**
     * Log configuration for the connection.
     * Structure is documented below.
     * 
     */
    @Export(name="logConfig", refs={ConnectionLogConfig.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionLogConfig> logConfig;

    /**
     * @return Log configuration for the connection.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionLogConfig>> logConfig() {
        return Codegen.optional(this.logConfig);
    }
    /**
     * Name of Connection needs to be created.
     * 
     * ***
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of Connection needs to be created.
     * 
     * ***
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Node configuration for the connection.
     * Structure is documented below.
     * 
     */
    @Export(name="nodeConfig", refs={ConnectionNodeConfig.class}, tree="[0]")
    private Output<ConnectionNodeConfig> nodeConfig;

    /**
     * @return Node configuration for the connection.
     * Structure is documented below.
     * 
     */
    public Output<ConnectionNodeConfig> nodeConfig() {
        return this.nodeConfig;
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
     * Service account needed for runtime plane to access Google Cloud resources.
     * 
     */
    @Export(name="serviceAccount", refs={String.class}, tree="[0]")
    private Output<String> serviceAccount;

    /**
     * @return Service account needed for runtime plane to access Google Cloud resources.
     * 
     */
    public Output<String> serviceAccount() {
        return this.serviceAccount;
    }
    /**
     * The name of the Service Directory service name. Used for Private Harpoon to resolve the ILB address.
     * e.g. &#34;projects/cloud-connectors-e2e-testing/locations/us-central1/namespaces/istio-system/services/istio-ingressgateway-connectors&#34;
     * 
     */
    @Export(name="serviceDirectory", refs={String.class}, tree="[0]")
    private Output<String> serviceDirectory;

    /**
     * @return The name of the Service Directory service name. Used for Private Harpoon to resolve the ILB address.
     * e.g. &#34;projects/cloud-connectors-e2e-testing/locations/us-central1/namespaces/istio-system/services/istio-ingressgateway-connectors&#34;
     * 
     */
    public Output<String> serviceDirectory() {
        return this.serviceDirectory;
    }
    /**
     * SSL Configuration of a connection
     * Structure is documented below.
     * 
     */
    @Export(name="sslConfig", refs={ConnectionSslConfig.class}, tree="[0]")
    private Output</* @Nullable */ ConnectionSslConfig> sslConfig;

    /**
     * @return SSL Configuration of a connection
     * Structure is documented below.
     * 
     */
    public Output<Optional<ConnectionSslConfig>> sslConfig() {
        return Codegen.optional(this.sslConfig);
    }
    /**
     * (Output)
     * Current status of eventing.
     * Structure is documented below.
     * 
     */
    @Export(name="statuses", refs={List.class,ConnectionStatus.class}, tree="[0,1]")
    private Output<List<ConnectionStatus>> statuses;

    /**
     * @return (Output)
     * Current status of eventing.
     * Structure is documented below.
     * 
     */
    public Output<List<ConnectionStatus>> statuses() {
        return this.statuses;
    }
    /**
     * This subscription type enum states the subscription type of the project.
     * 
     */
    @Export(name="subscriptionType", refs={String.class}, tree="[0]")
    private Output<String> subscriptionType;

    /**
     * @return This subscription type enum states the subscription type of the project.
     * 
     */
    public Output<String> subscriptionType() {
        return this.subscriptionType;
    }
    /**
     * Suspended indicates if a user has suspended a connection or not.
     * 
     */
    @Export(name="suspended", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> suspended;

    /**
     * @return Suspended indicates if a user has suspended a connection or not.
     * 
     */
    public Output<Optional<Boolean>> suspended() {
        return Codegen.optional(this.suspended);
    }
    /**
     * Time the Namespace was updated in UTC.
     * 
     */
    @Export(name="updateTime", refs={String.class}, tree="[0]")
    private Output<String> updateTime;

    /**
     * @return Time the Namespace was updated in UTC.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Connection(String name) {
        this(name, ConnectionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Connection(String name, ConnectionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Connection(String name, ConnectionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:integrationconnectors/connection:Connection", name, args == null ? ConnectionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Connection(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:integrationconnectors/connection:Connection", name, state, makeResourceOptions(options, id));
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
    public static Connection get(String name, Output<String> id, @Nullable ConnectionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Connection(name, id, state, options);
    }
}
