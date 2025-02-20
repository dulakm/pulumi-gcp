// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotword {
    /**
     * @return Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex hotwordRegex;
    /**
     * @return Proximity of the finding within which the entire hotword must reside. The total length of the window cannot
     * exceed 1000 characters. Note that the finding itself will be included in the window, so that hotwords may be
     * used to match substrings of the finding itself. For example, the certainty of a phone number regex
     * `(\d{3}) \d{3}-\d{4}` could be adjusted upwards if the area code is known to be the local area code of a company
     * office using the hotword regex `(xxx)`, where `xxx` is the area code in question.
     * Structure is documented below.
     * 
     */
    private @Nullable PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity proximity;

    private PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotword() {}
    /**
     * @return Regular expression pattern defining what qualifies as a hotword.
     * Structure is documented below.
     * 
     */
    public Optional<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex> hotwordRegex() {
        return Optional.ofNullable(this.hotwordRegex);
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
    public Optional<PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity> proximity() {
        return Optional.ofNullable(this.proximity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex hotwordRegex;
        private @Nullable PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity proximity;
        public Builder() {}
        public Builder(PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hotwordRegex = defaults.hotwordRegex;
    	      this.proximity = defaults.proximity;
        }

        @CustomType.Setter
        public Builder hotwordRegex(@Nullable PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordHotwordRegex hotwordRegex) {
            this.hotwordRegex = hotwordRegex;
            return this;
        }
        @CustomType.Setter
        public Builder proximity(@Nullable PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotwordProximity proximity) {
            this.proximity = proximity;
            return this;
        }
        public PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotword build() {
            final var o = new PreventionJobTriggerInspectJobInspectConfigRuleSetRuleExclusionRuleExcludeByHotword();
            o.hotwordRegex = hotwordRegex;
            o.proximity = proximity;
            return o;
        }
    }
}
