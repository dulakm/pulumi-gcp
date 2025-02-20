// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex;
import com.pulumi.gcp.dataloss.outputs.PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity;
import java.util.Objects;

@CustomType
public final class PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotword {
    /**
     * @return Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex hotwordRegex;
    /**
     * @return Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     * used to match substrings of the finding itself. For example, the certainty of a phone number regex
     * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     * Structure is documented below.
     * 
     */
    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity proximity;

    private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotword() {}
    /**
     * @return Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex hotwordRegex() {
        return this.hotwordRegex;
    }
    /**
     * @return Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     * used to match substrings of the finding itself. For example, the certainty of a phone number regex
     * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     * Structure is documented below.
     * 
     */
    public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity proximity() {
        return this.proximity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex hotwordRegex;
        private PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity proximity;
        public Builder() {}
        public Builder(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hotwordRegex = defaults.hotwordRegex;
    	      this.proximity = defaults.proximity;
        }

        @CustomType.Setter
        public Builder hotwordRegex(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex hotwordRegex) {
            this.hotwordRegex = Objects.requireNonNull(hotwordRegex);
            return this;
        }
        @CustomType.Setter
        public Builder proximity(PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity proximity) {
            this.proximity = Objects.requireNonNull(proximity);
            return this;
        }
        public PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotword build() {
            final var o = new PreventionInspectTemplateInspectConfigRuleSetRuleExclusionRuleExcludeByHotword();
            o.hotwordRegex = hotwordRegex;
            o.proximity = proximity;
            return o;
        }
    }
}
