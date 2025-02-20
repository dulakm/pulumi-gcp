// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.vertex.outputs.GetAiIndexMetadataConfigAlgorithmConfigBruteForceConfig;
import com.pulumi.gcp.vertex.outputs.GetAiIndexMetadataConfigAlgorithmConfigTreeAhConfig;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAiIndexMetadataConfigAlgorithmConfig {
    private List<GetAiIndexMetadataConfigAlgorithmConfigBruteForceConfig> bruteForceConfigs;
    private List<GetAiIndexMetadataConfigAlgorithmConfigTreeAhConfig> treeAhConfigs;

    private GetAiIndexMetadataConfigAlgorithmConfig() {}
    public List<GetAiIndexMetadataConfigAlgorithmConfigBruteForceConfig> bruteForceConfigs() {
        return this.bruteForceConfigs;
    }
    public List<GetAiIndexMetadataConfigAlgorithmConfigTreeAhConfig> treeAhConfigs() {
        return this.treeAhConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAiIndexMetadataConfigAlgorithmConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAiIndexMetadataConfigAlgorithmConfigBruteForceConfig> bruteForceConfigs;
        private List<GetAiIndexMetadataConfigAlgorithmConfigTreeAhConfig> treeAhConfigs;
        public Builder() {}
        public Builder(GetAiIndexMetadataConfigAlgorithmConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bruteForceConfigs = defaults.bruteForceConfigs;
    	      this.treeAhConfigs = defaults.treeAhConfigs;
        }

        @CustomType.Setter
        public Builder bruteForceConfigs(List<GetAiIndexMetadataConfigAlgorithmConfigBruteForceConfig> bruteForceConfigs) {
            this.bruteForceConfigs = Objects.requireNonNull(bruteForceConfigs);
            return this;
        }
        public Builder bruteForceConfigs(GetAiIndexMetadataConfigAlgorithmConfigBruteForceConfig... bruteForceConfigs) {
            return bruteForceConfigs(List.of(bruteForceConfigs));
        }
        @CustomType.Setter
        public Builder treeAhConfigs(List<GetAiIndexMetadataConfigAlgorithmConfigTreeAhConfig> treeAhConfigs) {
            this.treeAhConfigs = Objects.requireNonNull(treeAhConfigs);
            return this;
        }
        public Builder treeAhConfigs(GetAiIndexMetadataConfigAlgorithmConfigTreeAhConfig... treeAhConfigs) {
            return treeAhConfigs(List.of(treeAhConfigs));
        }
        public GetAiIndexMetadataConfigAlgorithmConfig build() {
            final var o = new GetAiIndexMetadataConfigAlgorithmConfig();
            o.bruteForceConfigs = bruteForceConfigs;
            o.treeAhConfigs = treeAhConfigs;
            return o;
        }
    }
}
