// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class NodePoolNodeConfig {
    /**
     * @return &#34;The Kubernetes node labels&#34;
     * 
     */
    private @Nullable Map<String,String> labels;

    private NodePoolNodeConfig() {}
    /**
     * @return &#34;The Kubernetes node labels&#34;
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodePoolNodeConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> labels;
        public Builder() {}
        public Builder(NodePoolNodeConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labels = defaults.labels;
        }

        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        public NodePoolNodeConfig build() {
            final var o = new NodePoolNodeConfig();
            o.labels = labels;
            return o;
        }
    }
}
