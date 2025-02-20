// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.spanner.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class GetInstanceAutoscalingConfigAutoscalingLimit {
    private Integer maxProcessingUnits;
    private Integer minProcessingUnits;

    private GetInstanceAutoscalingConfigAutoscalingLimit() {}
    public Integer maxProcessingUnits() {
        return this.maxProcessingUnits;
    }
    public Integer minProcessingUnits() {
        return this.minProcessingUnits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceAutoscalingConfigAutoscalingLimit defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer maxProcessingUnits;
        private Integer minProcessingUnits;
        public Builder() {}
        public Builder(GetInstanceAutoscalingConfigAutoscalingLimit defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxProcessingUnits = defaults.maxProcessingUnits;
    	      this.minProcessingUnits = defaults.minProcessingUnits;
        }

        @CustomType.Setter
        public Builder maxProcessingUnits(Integer maxProcessingUnits) {
            this.maxProcessingUnits = Objects.requireNonNull(maxProcessingUnits);
            return this;
        }
        @CustomType.Setter
        public Builder minProcessingUnits(Integer minProcessingUnits) {
            this.minProcessingUnits = Objects.requireNonNull(minProcessingUnits);
            return this;
        }
        public GetInstanceAutoscalingConfigAutoscalingLimit build() {
            final var o = new GetInstanceAutoscalingConfigAutoscalingLimit();
            o.maxProcessingUnits = maxProcessingUnits;
            o.minProcessingUnits = minProcessingUnits;
            return o;
        }
    }
}
