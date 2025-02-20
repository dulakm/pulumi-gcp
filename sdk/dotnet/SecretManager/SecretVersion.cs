// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.SecretManager
{
    /// <summary>
    /// A secret version resource.
    /// 
    /// &gt; **Warning:** All arguments including `payload.secret_data` will be stored in the raw
    /// state as plain-text.
    /// 
    /// ## Example Usage
    /// ### Secret Version Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var secret_basic = new Gcp.SecretManager.Secret("secret-basic", new()
    ///     {
    ///         SecretId = "secret-version",
    ///         Labels = 
    ///         {
    ///             { "label", "my-label" },
    ///         },
    ///         Replication = new Gcp.SecretManager.Inputs.SecretReplicationArgs
    ///         {
    ///             Auto = null,
    ///         },
    ///     });
    /// 
    ///     var secret_version_basic = new Gcp.SecretManager.SecretVersion("secret-version-basic", new()
    ///     {
    ///         Secret = secret_basic.Id,
    ///         SecretData = "secret-data",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Secret Version Deletion Policy Abandon
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var secret_basic = new Gcp.SecretManager.Secret("secret-basic", new()
    ///     {
    ///         SecretId = "secret-version",
    ///         Replication = new Gcp.SecretManager.Inputs.SecretReplicationArgs
    ///         {
    ///             UserManaged = new Gcp.SecretManager.Inputs.SecretReplicationUserManagedArgs
    ///             {
    ///                 Replicas = new[]
    ///                 {
    ///                     new Gcp.SecretManager.Inputs.SecretReplicationUserManagedReplicaArgs
    ///                     {
    ///                         Location = "us-central1",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var secret_version_deletion_policy = new Gcp.SecretManager.SecretVersion("secret-version-deletion-policy", new()
    ///     {
    ///         Secret = secret_basic.Id,
    ///         SecretData = "secret-data",
    ///         DeletionPolicy = "ABANDON",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Secret Version Deletion Policy Disable
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var secret_basic = new Gcp.SecretManager.Secret("secret-basic", new()
    ///     {
    ///         SecretId = "secret-version",
    ///         Replication = new Gcp.SecretManager.Inputs.SecretReplicationArgs
    ///         {
    ///             UserManaged = new Gcp.SecretManager.Inputs.SecretReplicationUserManagedArgs
    ///             {
    ///                 Replicas = new[]
    ///                 {
    ///                     new Gcp.SecretManager.Inputs.SecretReplicationUserManagedReplicaArgs
    ///                     {
    ///                         Location = "us-central1",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var secret_version_deletion_policy = new Gcp.SecretManager.SecretVersion("secret-version-deletion-policy", new()
    ///     {
    ///         Secret = secret_basic.Id,
    ///         SecretData = "secret-data",
    ///         DeletionPolicy = "DISABLE",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Secret Version With Base64 String Secret Data
    /// 
    /// ```csharp
    /// using System;
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// 	private static string ReadFileBase64(string path) {
    /// 		return Convert.ToBase64String(System.Text.Encoding.UTF8.GetBytes(File.ReadAllText(path)));
    /// 	}
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var secret_basic = new Gcp.SecretManager.Secret("secret-basic", new()
    ///     {
    ///         SecretId = "secret-version",
    ///         Replication = new Gcp.SecretManager.Inputs.SecretReplicationArgs
    ///         {
    ///             UserManaged = new Gcp.SecretManager.Inputs.SecretReplicationUserManagedArgs
    ///             {
    ///                 Replicas = new[]
    ///                 {
    ///                     new Gcp.SecretManager.Inputs.SecretReplicationUserManagedReplicaArgs
    ///                     {
    ///                         Location = "us-central1",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var secret_version_base64 = new Gcp.SecretManager.SecretVersion("secret-version-base64", new()
    ///     {
    ///         Secret = secret_basic.Id,
    ///         IsSecretDataBase64 = true,
    ///         SecretData = ReadFileBase64("secret-data.pfx"),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// SecretVersion can be imported using any of these accepted formats* `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import SecretVersion using one of the formats above. For exampletf import {
    /// 
    ///  id = "projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}"
    /// 
    ///  to = google_secret_manager_secret_version.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:secretmanager/secretVersion:SecretVersion When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), SecretVersion can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:secretmanager/secretVersion:SecretVersion default projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:secretmanager/secretVersion:SecretVersion")]
    public partial class SecretVersion : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The time at which the Secret was created.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// The deletion policy for the secret version. Setting `ABANDON` allows the resource
        /// to be abandoned rather than deleted. Setting `DISABLE` allows the resource to be
        /// disabled rather than deleted. Default is `DELETE`. Possible values are:
        /// * DELETE
        /// * DISABLE
        /// * ABANDON
        /// </summary>
        [Output("deletionPolicy")]
        public Output<string?> DeletionPolicy { get; private set; } = null!;

        /// <summary>
        /// The time at which the Secret was destroyed. Only present if state is DESTROYED.
        /// </summary>
        [Output("destroyTime")]
        public Output<string> DestroyTime { get; private set; } = null!;

        /// <summary>
        /// The current state of the SecretVersion.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// If set to 'true', the secret data is expected to be base64-encoded string and would be sent as is.
        /// </summary>
        [Output("isSecretDataBase64")]
        public Output<bool?> IsSecretDataBase64 { get; private set; } = null!;

        /// <summary>
        /// The resource name of the SecretVersion. Format:
        /// `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Secret Manager secret resource
        /// 
        /// 
        /// - - -
        /// </summary>
        [Output("secret")]
        public Output<string> Secret { get; private set; } = null!;

        /// <summary>
        /// The secret data. Must be no larger than 64KiB.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        [Output("secretData")]
        public Output<string> SecretData { get; private set; } = null!;

        /// <summary>
        /// The version of the Secret.
        /// </summary>
        [Output("version")]
        public Output<string> Version { get; private set; } = null!;


        /// <summary>
        /// Create a SecretVersion resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretVersion(string name, SecretVersionArgs args, CustomResourceOptions? options = null)
            : base("gcp:secretmanager/secretVersion:SecretVersion", name, args ?? new SecretVersionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretVersion(string name, Input<string> id, SecretVersionState? state = null, CustomResourceOptions? options = null)
            : base("gcp:secretmanager/secretVersion:SecretVersion", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "secretData",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretVersion resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretVersion Get(string name, Input<string> id, SecretVersionState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretVersion(name, id, state, options);
        }
    }

    public sealed class SecretVersionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The deletion policy for the secret version. Setting `ABANDON` allows the resource
        /// to be abandoned rather than deleted. Setting `DISABLE` allows the resource to be
        /// disabled rather than deleted. Default is `DELETE`. Possible values are:
        /// * DELETE
        /// * DISABLE
        /// * ABANDON
        /// </summary>
        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// The current state of the SecretVersion.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// If set to 'true', the secret data is expected to be base64-encoded string and would be sent as is.
        /// </summary>
        [Input("isSecretDataBase64")]
        public Input<bool>? IsSecretDataBase64 { get; set; }

        /// <summary>
        /// Secret Manager secret resource
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("secret", required: true)]
        public Input<string> Secret { get; set; } = null!;

        [Input("secretData", required: true)]
        private Input<string>? _secretData;

        /// <summary>
        /// The secret data. Must be no larger than 64KiB.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? SecretData
        {
            get => _secretData;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretData = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public SecretVersionArgs()
        {
        }
        public static new SecretVersionArgs Empty => new SecretVersionArgs();
    }

    public sealed class SecretVersionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The time at which the Secret was created.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// The deletion policy for the secret version. Setting `ABANDON` allows the resource
        /// to be abandoned rather than deleted. Setting `DISABLE` allows the resource to be
        /// disabled rather than deleted. Default is `DELETE`. Possible values are:
        /// * DELETE
        /// * DISABLE
        /// * ABANDON
        /// </summary>
        [Input("deletionPolicy")]
        public Input<string>? DeletionPolicy { get; set; }

        /// <summary>
        /// The time at which the Secret was destroyed. Only present if state is DESTROYED.
        /// </summary>
        [Input("destroyTime")]
        public Input<string>? DestroyTime { get; set; }

        /// <summary>
        /// The current state of the SecretVersion.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// If set to 'true', the secret data is expected to be base64-encoded string and would be sent as is.
        /// </summary>
        [Input("isSecretDataBase64")]
        public Input<bool>? IsSecretDataBase64 { get; set; }

        /// <summary>
        /// The resource name of the SecretVersion. Format:
        /// `projects/{{project}}/secrets/{{secret_id}}/versions/{{version}}`
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Secret Manager secret resource
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("secret")]
        public Input<string>? Secret { get; set; }

        [Input("secretData")]
        private Input<string>? _secretData;

        /// <summary>
        /// The secret data. Must be no larger than 64KiB.
        /// **Note**: This property is sensitive and will not be displayed in the plan.
        /// </summary>
        public Input<string>? SecretData
        {
            get => _secretData;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secretData = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The version of the Secret.
        /// </summary>
        [Input("version")]
        public Input<string>? Version { get; set; }

        public SecretVersionState()
        {
        }
        public static new SecretVersionState Empty => new SecretVersionState();
    }
}
