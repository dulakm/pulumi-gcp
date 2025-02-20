// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterNodePoolPlacementPolicy {
    private String policyName;
    private String tpuTopology;
    private String type;

    private GetClusterNodePoolPlacementPolicy() {}
    public String policyName() {
        return this.policyName;
    }
    public String tpuTopology() {
        return this.tpuTopology;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterNodePoolPlacementPolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String policyName;
        private String tpuTopology;
        private String type;
        public Builder() {}
        public Builder(GetClusterNodePoolPlacementPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyName = defaults.policyName;
    	      this.tpuTopology = defaults.tpuTopology;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        @CustomType.Setter
        public Builder tpuTopology(String tpuTopology) {
            this.tpuTopology = Objects.requireNonNull(tpuTopology);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetClusterNodePoolPlacementPolicy build() {
            final var o = new GetClusterNodePoolPlacementPolicy();
            o.policyName = policyName;
            o.tpuTopology = tpuTopology;
            o.type = type;
            return o;
        }
    }
}
