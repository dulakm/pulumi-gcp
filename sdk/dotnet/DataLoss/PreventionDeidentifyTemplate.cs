// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss
{
    /// <summary>
    /// Allows creation of templates to de-identify content.
    /// 
    /// To get more information about DeidentifyTemplate, see:
    /// 
    /// * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.deidentifyTemplates)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/dlp/docs/concepts-templates)
    /// 
    /// &gt; **Warning:** All arguments including the following potentially sensitive
    /// values will be stored in the raw state as plain text: `deidentify_config.record_transformations.field_transformations.field_transformations.info_type_transformations.transformations.transformations.primitive_transformation.crypto_replace_ffx_fpe_config.crypto_key.unwrapped.key`, `deidentify_config.record_transformations.field_transformations.field_transformations.info_type_transformations.transformations.transformations.primitive_transformation.crypto_hash_config.crypto_key.unwrapped.key`, `deidentify_config.record_transformations.field_transformations.field_transformations.info_type_transformations.transformations.transformations.primitive_transformation.date_shift_config.crypto_key.unwrapped.key`, `deidentify_config.record_transformations.field_transformations.field_transformations.info_type_transformations.transformations.transformations.primitive_transformation.crypto_deterministic_config.crypto_key.unwrapped.key`.
    /// Read more about sensitive data in state.
    /// 
    /// ## Example Usage
    /// ### Dlp Deidentify Template Image Transformations
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var basic = new Gcp.DataLoss.PreventionDeidentifyTemplate("basic", new()
    ///     {
    ///         DeidentifyConfig = new Gcp.DataLoss.Inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs
    ///         {
    ///             ImageTransformations = new Gcp.DataLoss.Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsArgs
    ///             {
    ///                 Transforms = new[]
    ///                 {
    ///                     new Gcp.DataLoss.Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs
    ///                     {
    ///                         RedactionColor = new Gcp.DataLoss.Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformRedactionColorArgs
    ///                         {
    ///                             Blue = 1,
    ///                             Green = 0.2,
    ///                             Red = 0.5,
    ///                         },
    ///                         SelectedInfoTypes = new Gcp.DataLoss.Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesArgs
    ///                         {
    ///                             InfoTypes = new[]
    ///                             {
    ///                                 new Gcp.DataLoss.Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformSelectedInfoTypesInfoTypeArgs
    ///                                 {
    ///                                     Name = "COLOR_INFO",
    ///                                     Version = "latest",
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                     new Gcp.DataLoss.Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs
    ///                     {
    ///                         AllInfoTypes = null,
    ///                     },
    ///                     new Gcp.DataLoss.Inputs.PreventionDeidentifyTemplateDeidentifyConfigImageTransformationsTransformArgs
    ///                     {
    ///                         AllText = null,
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Description = "Description",
    ///         DisplayName = "Displayname",
    ///         Parent = "projects/my-project-name",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// DeidentifyTemplate can be imported using any of these accepted formats* `{{parent}}/deidentifyTemplates/{{name}}` * `{{parent}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import DeidentifyTemplate using one of the formats above. For exampletf import {
    /// 
    ///  id = "{{parent}}/deidentifyTemplates/{{name}}"
    /// 
    ///  to = google_data_loss_prevention_deidentify_template.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), DeidentifyTemplate can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate default {{parent}}/deidentifyTemplates/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate default {{parent}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate")]
    public partial class PreventionDeidentifyTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The creation timestamp of an deidentifyTemplate. Set by the server.
        /// </summary>
        [Output("createTime")]
        public Output<string> CreateTime { get; private set; } = null!;

        /// <summary>
        /// Configuration of the deidentify template
        /// Structure is documented below.
        /// </summary>
        [Output("deidentifyConfig")]
        public Output<Outputs.PreventionDeidentifyTemplateDeidentifyConfig> DeidentifyConfig { get; private set; } = null!;

        /// <summary>
        /// A description of the template.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// User set display name of the template.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Name describing the field.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The parent of the template in any of the following formats:
        /// * `projects/{{project}}`
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// </summary>
        [Output("parent")]
        public Output<string> Parent { get; private set; } = null!;

        /// <summary>
        /// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
        /// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
        /// 100 characters. Can be empty to allow the system to generate one.
        /// </summary>
        [Output("templateId")]
        public Output<string> TemplateId { get; private set; } = null!;

        /// <summary>
        /// The last update timestamp of an deidentifyTemplate. Set by the server.
        /// </summary>
        [Output("updateTime")]
        public Output<string> UpdateTime { get; private set; } = null!;


        /// <summary>
        /// Create a PreventionDeidentifyTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PreventionDeidentifyTemplate(string name, PreventionDeidentifyTemplateArgs args, CustomResourceOptions? options = null)
            : base("gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate", name, args ?? new PreventionDeidentifyTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PreventionDeidentifyTemplate(string name, Input<string> id, PreventionDeidentifyTemplateState? state = null, CustomResourceOptions? options = null)
            : base("gcp:dataloss/preventionDeidentifyTemplate:PreventionDeidentifyTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PreventionDeidentifyTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PreventionDeidentifyTemplate Get(string name, Input<string> id, PreventionDeidentifyTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new PreventionDeidentifyTemplate(name, id, state, options);
        }
    }

    public sealed class PreventionDeidentifyTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration of the deidentify template
        /// Structure is documented below.
        /// </summary>
        [Input("deidentifyConfig", required: true)]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigArgs> DeidentifyConfig { get; set; } = null!;

        /// <summary>
        /// A description of the template.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// User set display name of the template.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The parent of the template in any of the following formats:
        /// * `projects/{{project}}`
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// </summary>
        [Input("parent", required: true)]
        public Input<string> Parent { get; set; } = null!;

        /// <summary>
        /// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
        /// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
        /// 100 characters. Can be empty to allow the system to generate one.
        /// </summary>
        [Input("templateId")]
        public Input<string>? TemplateId { get; set; }

        public PreventionDeidentifyTemplateArgs()
        {
        }
        public static new PreventionDeidentifyTemplateArgs Empty => new PreventionDeidentifyTemplateArgs();
    }

    public sealed class PreventionDeidentifyTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The creation timestamp of an deidentifyTemplate. Set by the server.
        /// </summary>
        [Input("createTime")]
        public Input<string>? CreateTime { get; set; }

        /// <summary>
        /// Configuration of the deidentify template
        /// Structure is documented below.
        /// </summary>
        [Input("deidentifyConfig")]
        public Input<Inputs.PreventionDeidentifyTemplateDeidentifyConfigGetArgs>? DeidentifyConfig { get; set; }

        /// <summary>
        /// A description of the template.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// User set display name of the template.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Name describing the field.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The parent of the template in any of the following formats:
        /// * `projects/{{project}}`
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// </summary>
        [Input("parent")]
        public Input<string>? Parent { get; set; }

        /// <summary>
        /// The template id can contain uppercase and lowercase letters, numbers, and hyphens;
        /// that is, it must match the regular expression: [a-zA-Z\d-_]+. The maximum length is
        /// 100 characters. Can be empty to allow the system to generate one.
        /// </summary>
        [Input("templateId")]
        public Input<string>? TemplateId { get; set; }

        /// <summary>
        /// The last update timestamp of an deidentifyTemplate. Set by the server.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public PreventionDeidentifyTemplateState()
        {
        }
        public static new PreventionDeidentifyTemplateState Empty => new PreventionDeidentifyTemplateState();
    }
}
