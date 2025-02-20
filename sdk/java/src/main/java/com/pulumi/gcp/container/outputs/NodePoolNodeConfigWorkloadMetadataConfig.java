// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class NodePoolNodeConfigWorkloadMetadataConfig {
    private String mode;

    private NodePoolNodeConfigWorkloadMetadataConfig() {}
    public String mode() {
        return this.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfigWorkloadMetadataConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        public Builder() {}
        public Builder(NodePoolNodeConfigWorkloadMetadataConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public NodePoolNodeConfigWorkloadMetadataConfig build() {
            final var o = new NodePoolNodeConfigWorkloadMetadataConfig();
            o.mode = mode;
            return o;
        }
    }
}
