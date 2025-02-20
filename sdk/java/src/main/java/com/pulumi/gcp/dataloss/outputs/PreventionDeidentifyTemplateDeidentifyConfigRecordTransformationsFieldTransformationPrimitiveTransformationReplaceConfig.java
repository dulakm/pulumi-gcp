// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValue;
import java.util.Objects;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfig {
    /**
     * @return Replace each input value with a given value.
     * The `new_value` block must only contain one argument. For example when replacing the contents of a string-type field, only `string_value` should be set.
     * Structure is documented below.
     * 
     */
    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValue newValue;

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfig() {}
    /**
     * @return Replace each input value with a given value.
     * The `new_value` block must only contain one argument. For example when replacing the contents of a string-type field, only `string_value` should be set.
     * Structure is documented below.
     * 
     */
    public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValue newValue() {
        return this.newValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValue newValue;
        public Builder() {}
        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newValue = defaults.newValue;
        }

        @CustomType.Setter
        public Builder newValue(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfigNewValue newValue) {
            this.newValue = Objects.requireNonNull(newValue);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfig build() {
            final var o = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationPrimitiveTransformationReplaceConfig();
            o.newValue = newValue;
            return o;
        }
    }
}
