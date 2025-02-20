// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.identityplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ConfigSmsRegionConfigAllowlistOnly {
    /**
     * @return Two letter unicode region codes to allow as defined by https://cldr.unicode.org/ The full list of these region codes is here: https://github.com/unicode-cldr/cldr-localenames-full/blob/master/main/en/territories.json
     * 
     */
    private @Nullable List<String> allowedRegions;

    private ConfigSmsRegionConfigAllowlistOnly() {}
    /**
     * @return Two letter unicode region codes to allow as defined by https://cldr.unicode.org/ The full list of these region codes is here: https://github.com/unicode-cldr/cldr-localenames-full/blob/master/main/en/territories.json
     * 
     */
    public List<String> allowedRegions() {
        return this.allowedRegions == null ? List.of() : this.allowedRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigSmsRegionConfigAllowlistOnly defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> allowedRegions;
        public Builder() {}
        public Builder(ConfigSmsRegionConfigAllowlistOnly defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRegions = defaults.allowedRegions;
        }

        @CustomType.Setter
        public Builder allowedRegions(@Nullable List<String> allowedRegions) {
            this.allowedRegions = allowedRegions;
            return this;
        }
        public Builder allowedRegions(String... allowedRegions) {
            return allowedRegions(List.of(allowedRegions));
        }
        public ConfigSmsRegionConfigAllowlistOnly build() {
            final var o = new ConfigSmsRegionConfigAllowlistOnly();
            o.allowedRegions = allowedRegions;
            return o;
        }
    }
}
