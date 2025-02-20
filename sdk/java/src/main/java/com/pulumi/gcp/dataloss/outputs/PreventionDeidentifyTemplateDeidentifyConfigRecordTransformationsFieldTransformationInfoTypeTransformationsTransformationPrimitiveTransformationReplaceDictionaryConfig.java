// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordList;
import java.util.Objects;

@CustomType
public final class PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfig {
    /**
     * @return A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * Structure is documented below.
     * 
     */
    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordList wordList;

    private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfig() {}
    /**
     * @return A list of words to select from for random replacement. The [limits](https://cloud.google.com/dlp/limits) page contains details about the size limits of dictionaries.
     * Structure is documented below.
     * 
     */
    public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordList wordList() {
        return this.wordList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordList wordList;
        public Builder() {}
        public Builder(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.wordList = defaults.wordList;
        }

        @CustomType.Setter
        public Builder wordList(PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfigWordList wordList) {
            this.wordList = Objects.requireNonNull(wordList);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfig build() {
            final var o = new PreventionDeidentifyTemplateDeidentifyConfigRecordTransformationsFieldTransformationInfoTypeTransformationsTransformationPrimitiveTransformationReplaceDictionaryConfig();
            o.wordList = wordList;
            return o;
        }
    }
}
