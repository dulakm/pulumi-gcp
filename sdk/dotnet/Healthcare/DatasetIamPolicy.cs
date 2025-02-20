// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Healthcare
{
    /// <summary>
    /// Three different resources help you manage your IAM policy for Healthcare dataset. Each of these resources serves a different use case:
    /// 
    /// * `gcp.healthcare.DatasetIamPolicy`: Authoritative. Sets the IAM policy for the dataset and replaces any existing policy already attached.
    /// * `gcp.healthcare.DatasetIamBinding`: Authoritative for a given role. Updates the IAM policy to grant a role to a list of members. Other roles within the IAM policy for the dataset are preserved.
    /// * `gcp.healthcare.DatasetIamMember`: Non-authoritative. Updates the IAM policy to grant a role to a new member. Other members for the role for the dataset are preserved.
    /// 
    /// &gt; **Note:** `gcp.healthcare.DatasetIamPolicy` **cannot** be used in conjunction with `gcp.healthcare.DatasetIamBinding` and `gcp.healthcare.DatasetIamMember` or they will fight over what your policy should be.
    /// 
    /// &gt; **Note:** `gcp.healthcare.DatasetIamBinding` resources **can be** used in conjunction with `gcp.healthcare.DatasetIamMember` resources **only if** they do not grant privilege to the same role.
    /// 
    /// ## google\_healthcare\_dataset\_iam\_policy
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var admin = Gcp.Organizations.GetIAMPolicy.Invoke(new()
    ///     {
    ///         Bindings = new[]
    ///         {
    ///             new Gcp.Organizations.Inputs.GetIAMPolicyBindingInputArgs
    ///             {
    ///                 Role = "roles/editor",
    ///                 Members = new[]
    ///                 {
    ///                     "user:jane@example.com",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    ///     var dataset = new Gcp.Healthcare.DatasetIamPolicy("dataset", new()
    ///     {
    ///         DatasetId = "your-dataset-id",
    ///         PolicyData = admin.Apply(getIAMPolicyResult =&gt; getIAMPolicyResult.PolicyData),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## google\_healthcare\_dataset\_iam\_binding
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dataset = new Gcp.Healthcare.DatasetIamBinding("dataset", new()
    ///     {
    ///         DatasetId = "your-dataset-id",
    ///         Members = new[]
    ///         {
    ///             "user:jane@example.com",
    ///         },
    ///         Role = "roles/editor",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## google\_healthcare\_dataset\_iam\_member
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var dataset = new Gcp.Healthcare.DatasetIamMember("dataset", new()
    ///     {
    ///         DatasetId = "your-dataset-id",
    ///         Member = "user:jane@example.com",
    ///         Role = "roles/editor",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ### Importing IAM policies IAM policy imports use the identifier of the Healthcase Dataset resource. For example* `"{{project_id}}/{{location}}/{{dataset}}"` An [`import` block](https://developer.hashicorp.com/terraform/language/import) (Terraform v1.5.0 and later) can be used to import IAM policiestf import {
    /// 
    ///  id = "{{project_id}}/{{location}}/{{dataset}}"
    /// 
    ///  to = google_healthcare_dataset_iam_policy.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:healthcare/datasetIamPolicy:DatasetIamPolicy The [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import) can also be used
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:healthcare/datasetIamPolicy:DatasetIamPolicy default {{project_id}}/{{location}}/{{dataset}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:healthcare/datasetIamPolicy:DatasetIamPolicy")]
    public partial class DatasetIamPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The dataset ID, in the form
        /// `{project_id}/{location_name}/{dataset_name}` or
        /// `{location_name}/{dataset_name}`. In the second form, the provider's
        /// project setting will be used as a fallback.
        /// 
        /// * `member/members` - (Required) Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        /// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// </summary>
        [Output("datasetId")]
        public Output<string> DatasetId { get; private set; } = null!;

        /// <summary>
        /// (Computed) The etag of the dataset's IAM policy.
        /// </summary>
        [Output("etag")]
        public Output<string> Etag { get; private set; } = null!;

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Output("policyData")]
        public Output<string> PolicyData { get; private set; } = null!;


        /// <summary>
        /// Create a DatasetIamPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DatasetIamPolicy(string name, DatasetIamPolicyArgs args, CustomResourceOptions? options = null)
            : base("gcp:healthcare/datasetIamPolicy:DatasetIamPolicy", name, args ?? new DatasetIamPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DatasetIamPolicy(string name, Input<string> id, DatasetIamPolicyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:healthcare/datasetIamPolicy:DatasetIamPolicy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DatasetIamPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DatasetIamPolicy Get(string name, Input<string> id, DatasetIamPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new DatasetIamPolicy(name, id, state, options);
        }
    }

    public sealed class DatasetIamPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dataset ID, in the form
        /// `{project_id}/{location_name}/{dataset_name}` or
        /// `{location_name}/{dataset_name}`. In the second form, the provider's
        /// project setting will be used as a fallback.
        /// 
        /// * `member/members` - (Required) Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        /// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// </summary>
        [Input("datasetId", required: true)]
        public Input<string> DatasetId { get; set; } = null!;

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Input("policyData", required: true)]
        public Input<string> PolicyData { get; set; } = null!;

        public DatasetIamPolicyArgs()
        {
        }
        public static new DatasetIamPolicyArgs Empty => new DatasetIamPolicyArgs();
    }

    public sealed class DatasetIamPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The dataset ID, in the form
        /// `{project_id}/{location_name}/{dataset_name}` or
        /// `{location_name}/{dataset_name}`. In the second form, the provider's
        /// project setting will be used as a fallback.
        /// 
        /// * `member/members` - (Required) Identities that will be granted the privilege in `role`.
        /// Each entry can have one of the following values:
        /// * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
        /// * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
        /// * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
        /// * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
        /// * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
        /// * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
        /// </summary>
        [Input("datasetId")]
        public Input<string>? DatasetId { get; set; }

        /// <summary>
        /// (Computed) The etag of the dataset's IAM policy.
        /// </summary>
        [Input("etag")]
        public Input<string>? Etag { get; set; }

        /// <summary>
        /// The policy data generated by
        /// a `gcp.organizations.getIAMPolicy` data source.
        /// </summary>
        [Input("policyData")]
        public Input<string>? PolicyData { get; set; }

        public DatasetIamPolicyState()
        {
        }
        public static new DatasetIamPolicyState Empty => new DatasetIamPolicyState();
    }
}
