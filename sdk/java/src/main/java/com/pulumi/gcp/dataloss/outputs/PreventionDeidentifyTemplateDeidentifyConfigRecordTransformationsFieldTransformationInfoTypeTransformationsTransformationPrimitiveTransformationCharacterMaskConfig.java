// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig {
    /**
     * @return Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     * Structure is documented below.
     * 
     */
    private @Nullable List<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores;
    /**
     * @return is *
     * 
     */
    private @Nullable String maskingCharacter;
    /**
     * @return is -4
     * 
     */
    private @Nullable Integer numberToMask;
    /**
     * @return Mask characters in reverse order. For example, if masking_character is 0, number_to_mask is 14, and reverse_order is `false`, then the
     * input string `1234-5678-9012-3456` is masked as `00000000000000-3456`.
     * 
     */
    private @Nullable Boolean reverseOrder;

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig() {}
    /**
     * @return Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     * Structure is documented below.
     * 
     */
    public List<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores() {
        return this.charactersToIgnores == null ? List.of() : this.charactersToIgnores;
    }
    /**
     * @return is *
     * 
     */
    public Optional<String> maskingCharacter() {
        return Optional.ofNullable(this.maskingCharacter);
    }
    /**
     * @return is -4
     * 
     */
    public Optional<Integer> numberToMask() {
        return Optional.ofNullable(this.numberToMask);
    }
    /**
     * @return Mask characters in reverse order. For example, if masking_character is 0, number_to_mask is 14, and reverse_order is `false`, then the
     * input string `1234-5678-9012-3456` is masked as `00000000000000-3456`.
     * 
     */
    public Optional<Boolean> reverseOrder() {
        return Optional.ofNullable(this.reverseOrder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores;
        private @Nullable String maskingCharacter;
        private @Nullable Integer numberToMask;
        private @Nullable Boolean reverseOrder;
        public Builder() {}
        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToIgnores = defaults.charactersToIgnores;
    	      this.maskingCharacter = defaults.maskingCharacter;
    	      this.numberToMask = defaults.numberToMask;
    	      this.reverseOrder = defaults.reverseOrder;
        }

        @CustomType.Setter
        public Builder charactersToIgnores(@Nullable List<PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore> charactersToIgnores) {
            this.charactersToIgnores = charactersToIgnores;
            return this;
        }
        public Builder charactersToIgnores(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnore... charactersToIgnores) {
            return charactersToIgnores(List.of(charactersToIgnores));
        }
        @CustomType.Setter
        public Builder maskingCharacter(@Nullable String maskingCharacter) {
            this.maskingCharacter = maskingCharacter;
            return this;
        }
        @CustomType.Setter
        public Builder numberToMask(@Nullable Integer numberToMask) {
            this.numberToMask = numberToMask;
            return this;
        }
        @CustomType.Setter
        public Builder reverseOrder(@Nullable Boolean reverseOrder) {
            this.reverseOrder = reverseOrder;
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig build() {
            final var o = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfig();
            o.charactersToIgnores = charactersToIgnores;
            o.maskingCharacter = maskingCharacter;
            o.numberToMask = numberToMask;
            o.reverseOrder = reverseOrder;
            return o;
        }
    }
}
