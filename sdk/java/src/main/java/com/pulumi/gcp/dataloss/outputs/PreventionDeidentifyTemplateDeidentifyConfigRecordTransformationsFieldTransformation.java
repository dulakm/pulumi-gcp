// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationCondition;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationField;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformations;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformation;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformation {
    /**
     * @return Only apply the transformation if the condition evaluates to true for the given RecordCondition. The conditions are allowed to reference fields that are not used in the actual transformation.
     * Example Use Cases:
     * - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range.
     * - Redact a field if the date of birth field is greater than 85.
     *   Structure is documented below.
     * 
     */
    private @Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationCondition condition;
    /**
     * @return Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId.
     * FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
     * Structure is documented below.
     * 
     */
    private List<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationField> fields;
    /**
     * @return Treat the contents of the field as free text, and selectively transform content that matches an InfoType.
     * Only one of `primitive_transformation` or `info_type_transformations` must be specified.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformations infoTypeTransformations;
    /**
     * @return Apply the transformation to the entire field.
     * The `primitive_transformation` block must only contain one argument, corresponding to the type of transformation.
     * Only one of `primitive_transformation` or `info_type_transformations` must be specified.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformation primitiveTransformation;

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformation() {}
    /**
     * @return Only apply the transformation if the condition evaluates to true for the given RecordCondition. The conditions are allowed to reference fields that are not used in the actual transformation.
     * Example Use Cases:
     * - Apply a different bucket transformation to an age column if the zip code column for the same record is within a specific range.
     * - Redact a field if the date of birth field is greater than 85.
     *   Structure is documented below.
     * 
     */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationCondition> condition() {
        return Optional.ofNullable(this.condition);
    }
    /**
     * @return Input field(s) to apply the transformation to. When you have columns that reference their position within a list, omit the index from the FieldId.
     * FieldId name matching ignores the index. For example, instead of &#34;contact.nums[0].type&#34;, use &#34;contact.nums.type&#34;.
     * Structure is documented below.
     * 
     */
    public List<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationField> fields() {
        return this.fields;
    }
    /**
     * @return Treat the contents of the field as free text, and selectively transform content that matches an InfoType.
     * Only one of `primitive_transformation` or `info_type_transformations` must be specified.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformations> infoTypeTransformations() {
        return Optional.ofNullable(this.infoTypeTransformations);
    }
    /**
     * @return Apply the transformation to the entire field.
     * The `primitive_transformation` block must only contain one argument, corresponding to the type of transformation.
     * Only one of `primitive_transformation` or `info_type_transformations` must be specified.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformation> primitiveTransformation() {
        return Optional.ofNullable(this.primitiveTransformation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationCondition condition;
        private List<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationField> fields;
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformations infoTypeTransformations;
        private @Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformation primitiveTransformation;
        public Builder() {}
        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.fields = defaults.fields;
    	      this.infoTypeTransformations = defaults.infoTypeTransformations;
    	      this.primitiveTransformation = defaults.primitiveTransformation;
        }

        @CustomType.Setter
        public Builder condition(@Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationCondition condition) {
            this.condition = condition;
            return this;
        }
        @CustomType.Setter
        public Builder fields(List<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationField> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }
        public Builder fields(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationField... fields) {
            return fields(List.of(fields));
        }
        @CustomType.Setter
        public Builder infoTypeTransformations(@Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformations infoTypeTransformations) {
            this.infoTypeTransformations = infoTypeTransformations;
            return this;
        }
        @CustomType.Setter
        public Builder primitiveTransformation(@Nullable PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformation primitiveTransformation) {
            this.primitiveTransformation = primitiveTransformation;
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformation build() {
            final var o = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformation();
            o.condition = condition;
            o.fields = fields;
            o.infoTypeTransformations = infoTypeTransformations;
            o.primitiveTransformation = primitiveTransformation;
            return o;
        }
    }
}
