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
    /// An inspect job template.
    /// 
    /// To get more information about InspectTemplate, see:
    /// 
    /// * [API documentation](https://cloud.google.com/dlp/docs/reference/rest/v2/projects.inspectTemplates)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/dlp/docs/creating-templates-inspect)
    /// 
    /// ## Example Usage
    /// ### Dlp Inspect Template Custom Type
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var custom = new Gcp.DataLoss.PreventionInspectTemplate("custom", new()
    ///     {
    ///         Description = "My description",
    ///         DisplayName = "display_name",
    ///         InspectConfig = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigArgs
    ///         {
    ///             CustomInfoTypes = new[]
    ///             {
    ///                 new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs
    ///                 {
    ///                     InfoType = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs
    ///                     {
    ///                         Name = "MY_CUSTOM_TYPE",
    ///                     },
    ///                     Likelihood = "UNLIKELY",
    ///                     Regex = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeRegexArgs
    ///                     {
    ///                         Pattern = "test*",
    ///                     },
    ///                 },
    ///             },
    ///             InfoTypes = new[]
    ///             {
    ///                 new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigInfoTypeArgs
    ///                 {
    ///                     Name = "EMAIL_ADDRESS",
    ///                 },
    ///             },
    ///             Limits = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigLimitsArgs
    ///             {
    ///                 MaxFindingsPerItem = 10,
    ///                 MaxFindingsPerRequest = 50,
    ///             },
    ///             MinLikelihood = "UNLIKELY",
    ///             RuleSets = new[]
    ///             {
    ///                 new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetArgs
    ///                 {
    ///                     InfoTypes = new[]
    ///                     {
    ///                         new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs
    ///                         {
    ///                             Name = "EMAIL_ADDRESS",
    ///                         },
    ///                     },
    ///                     Rules = new[]
    ///                     {
    ///                         new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs
    ///                         {
    ///                             ExclusionRule = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs
    ///                             {
    ///                                 MatchingType = "MATCHING_TYPE_FULL_MATCH",
    ///                                 Regex = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs
    ///                                 {
    ///                                     Pattern = ".+@example.com",
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetArgs
    ///                 {
    ///                     InfoTypes = new[]
    ///                     {
    ///                         new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs
    ///                         {
    ///                             Name = "MY_CUSTOM_TYPE",
    ///                         },
    ///                     },
    ///                     Rules = new[]
    ///                     {
    ///                         new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs
    ///                         {
    ///                             HotwordRule = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs
    ///                             {
    ///                                 HotwordRegex = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs
    ///                                 {
    ///                                     Pattern = "example*",
    ///                                 },
    ///                                 LikelihoodAdjustment = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs
    ///                                 {
    ///                                     FixedLikelihood = "VERY_LIKELY",
    ///                                 },
    ///                                 Proximity = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs
    ///                                 {
    ///                                     WindowBefore = 50,
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Parent = "projects/my-project-name",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Dlp Inspect Template Custom Type Surrogate
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var customTypeSurrogate = new Gcp.DataLoss.PreventionInspectTemplate("customTypeSurrogate", new()
    ///     {
    ///         Description = "My description",
    ///         DisplayName = "display_name",
    ///         InspectConfig = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigArgs
    ///         {
    ///             CustomInfoTypes = new[]
    ///             {
    ///                 new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeArgs
    ///                 {
    ///                     InfoType = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigCustomInfoTypeInfoTypeArgs
    ///                     {
    ///                         Name = "MY_CUSTOM_TYPE",
    ///                     },
    ///                     Likelihood = "UNLIKELY",
    ///                     SurrogateType = null,
    ///                 },
    ///             },
    ///             InfoTypes = new[]
    ///             {
    ///                 new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigInfoTypeArgs
    ///                 {
    ///                     Name = "EMAIL_ADDRESS",
    ///                 },
    ///             },
    ///             Limits = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigLimitsArgs
    ///             {
    ///                 MaxFindingsPerItem = 10,
    ///                 MaxFindingsPerRequest = 50,
    ///             },
    ///             MinLikelihood = "UNLIKELY",
    ///             RuleSets = new[]
    ///             {
    ///                 new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetArgs
    ///                 {
    ///                     InfoTypes = new[]
    ///                     {
    ///                         new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs
    ///                         {
    ///                             Name = "EMAIL_ADDRESS",
    ///                         },
    ///                     },
    ///                     Rules = new[]
    ///                     {
    ///                         new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs
    ///                         {
    ///                             ExclusionRule = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleArgs
    ///                             {
    ///                                 MatchingType = "MATCHING_TYPE_FULL_MATCH",
    ///                                 Regex = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleRegexArgs
    ///                                 {
    ///                                     Pattern = ".+@example.com",
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///                 new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetArgs
    ///                 {
    ///                     InfoTypes = new[]
    ///                     {
    ///                         new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetInfoTypeArgs
    ///                         {
    ///                             Name = "MY_CUSTOM_TYPE",
    ///                         },
    ///                     },
    ///                     Rules = new[]
    ///                     {
    ///                         new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleArgs
    ///                         {
    ///                             HotwordRule = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleArgs
    ///                             {
    ///                                 HotwordRegex = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleHotwordRegexArgs
    ///                                 {
    ///                                     Pattern = "example*",
    ///                                 },
    ///                                 LikelihoodAdjustment = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleLikelihoodAdjustmentArgs
    ///                                 {
    ///                                     FixedLikelihood = "VERY_LIKELY",
    ///                                 },
    ///                                 Proximity = new Gcp.DataLoss.Inputs.PreventionInspectTemplateInspectConfigRuleSetRuleHotwordRuleProximityArgs
    ///                                 {
    ///                                     WindowBefore = 50,
    ///                                 },
    ///                             },
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Parent = "projects/my-project-name",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// InspectTemplate can be imported using any of these accepted formats* `{{parent}}/inspectTemplates/{{name}}` * `{{parent}}/{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import InspectTemplate using one of the formats above. For exampletf import {
    /// 
    ///  id = "{{parent}}/inspectTemplates/{{name}}"
    /// 
    ///  to = google_data_loss_prevention_inspect_template.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), InspectTemplate can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate default {{parent}}/inspectTemplates/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate default {{parent}}/{{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate")]
    public partial class PreventionInspectTemplate : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A description of the inspect template.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// User set display name of the inspect template.
        /// </summary>
        [Output("displayName")]
        public Output<string?> DisplayName { get; private set; } = null!;

        /// <summary>
        /// The core content of the template.
        /// Structure is documented below.
        /// </summary>
        [Output("inspectConfig")]
        public Output<Outputs.PreventionInspectTemplateInspectConfig?> InspectConfig { get; private set; } = null!;

        /// <summary>
        /// Name of the information type. Either a name of your choosing when creating a CustomInfoType, or one of the names
        /// listed at https://cloud.google.com/dlp/docs/infotypes-reference when specifying a built-in type.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The parent of the inspect template in any of the following formats:
        /// * `projects/{{project}}`
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// 
        /// 
        /// - - -
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
        /// Create a PreventionInspectTemplate resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PreventionInspectTemplate(string name, PreventionInspectTemplateArgs args, CustomResourceOptions? options = null)
            : base("gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate", name, args ?? new PreventionInspectTemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PreventionInspectTemplate(string name, Input<string> id, PreventionInspectTemplateState? state = null, CustomResourceOptions? options = null)
            : base("gcp:dataloss/preventionInspectTemplate:PreventionInspectTemplate", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PreventionInspectTemplate resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PreventionInspectTemplate Get(string name, Input<string> id, PreventionInspectTemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new PreventionInspectTemplate(name, id, state, options);
        }
    }

    public sealed class PreventionInspectTemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description of the inspect template.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// User set display name of the inspect template.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The core content of the template.
        /// Structure is documented below.
        /// </summary>
        [Input("inspectConfig")]
        public Input<Inputs.PreventionInspectTemplateInspectConfigArgs>? InspectConfig { get; set; }

        /// <summary>
        /// The parent of the inspect template in any of the following formats:
        /// * `projects/{{project}}`
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// 
        /// 
        /// - - -
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

        public PreventionInspectTemplateArgs()
        {
        }
        public static new PreventionInspectTemplateArgs Empty => new PreventionInspectTemplateArgs();
    }

    public sealed class PreventionInspectTemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A description of the inspect template.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// User set display name of the inspect template.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// The core content of the template.
        /// Structure is documented below.
        /// </summary>
        [Input("inspectConfig")]
        public Input<Inputs.PreventionInspectTemplateInspectConfigGetArgs>? InspectConfig { get; set; }

        /// <summary>
        /// Name of the information type. Either a name of your choosing when creating a CustomInfoType, or one of the names
        /// listed at https://cloud.google.com/dlp/docs/infotypes-reference when specifying a built-in type.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The parent of the inspect template in any of the following formats:
        /// * `projects/{{project}}`
        /// * `projects/{{project}}/locations/{{location}}`
        /// * `organizations/{{organization_id}}`
        /// * `organizations/{{organization_id}}/locations/{{location}}`
        /// 
        /// 
        /// - - -
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

        public PreventionInspectTemplateState()
        {
        }
        public static new PreventionInspectTemplateState Empty => new PreventionInspectTemplateState();
    }
}
