// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.networkservices.outputs.EndpointPolicyEndpointMatcherMetadataLabelMatcher;
import java.util.Objects;

@CustomType
public final class EndpointPolicyEndpointMatcher {
    /**
     * @return The matcher is based on node metadata presented by xDS clients.
     * Structure is documented below.
     * 
     */
    private EndpointPolicyEndpointMatcherMetadataLabelMatcher metadataLabelMatcher;

    private EndpointPolicyEndpointMatcher() {}
    /**
     * @return The matcher is based on node metadata presented by xDS clients.
     * Structure is documented below.
     * 
     */
    public EndpointPolicyEndpointMatcherMetadataLabelMatcher metadataLabelMatcher() {
        return this.metadataLabelMatcher;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointPolicyEndpointMatcher defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private EndpointPolicyEndpointMatcherMetadataLabelMatcher metadataLabelMatcher;
        public Builder() {}
        public Builder(EndpointPolicyEndpointMatcher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataLabelMatcher = defaults.metadataLabelMatcher;
        }

        @CustomType.Setter
        public Builder metadataLabelMatcher(EndpointPolicyEndpointMatcherMetadataLabelMatcher metadataLabelMatcher) {
            this.metadataLabelMatcher = Objects.requireNonNull(metadataLabelMatcher);
            return this;
        }
        public EndpointPolicyEndpointMatcher build() {
            final var o = new EndpointPolicyEndpointMatcher();
            o.metadataLabelMatcher = metadataLabelMatcher;
            return o;
        }
    }
}
