// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Outputs
{

    [OutputType]
    public sealed class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig
    {
        /// <summary>
        /// Characters to skip when doing de-identification of a value. These will be left alone and skipped.
        /// Structure is documented below.
        /// </summary>
        public readonly ImmutableArray<Outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> CharactersToIgnores;
        /// <summary>
        /// is *
        /// </summary>
        public readonly string? MaskingCharacter;
        /// <summary>
        /// is -4
        /// </summary>
        public readonly int? NumberToMask;
        /// <summary>
        /// Mask characters in reverse order. For example, if masking_character is 0, number_to_mask is 14, and reverse_order is `false`, then the
        /// input string `1234-5678-9012-3456` is masked as `00000000000000-3456`.
        /// </summary>
        public readonly bool? ReverseOrder;

        [OutputConstructor]
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig(
            ImmutableArray<Outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores,

            string? maskingCharacter,

            int? numberToMask,

            bool? reverseOrder)
        {
            CharactersToIgnores = charactersToIgnores;
            MaskingCharacter = maskingCharacter;
            NumberToMask = numberToMask;
            ReverseOrder = reverseOrder;
        }
    }
}
