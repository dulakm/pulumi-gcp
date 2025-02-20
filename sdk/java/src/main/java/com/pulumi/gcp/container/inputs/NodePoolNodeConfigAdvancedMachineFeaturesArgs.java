// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class NodePoolNodeConfigAdvancedMachineFeaturesArgs extends com.pulumi.resources.ResourceArgs {

    public static final NodePoolNodeConfigAdvancedMachineFeaturesArgs Empty = new NodePoolNodeConfigAdvancedMachineFeaturesArgs();

    @Import(name="threadsPerCore", required=true)
    private Output<Integer> threadsPerCore;

    public Output<Integer> threadsPerCore() {
        return this.threadsPerCore;
    }

    private NodePoolNodeConfigAdvancedMachineFeaturesArgs() {}

    private NodePoolNodeConfigAdvancedMachineFeaturesArgs(NodePoolNodeConfigAdvancedMachineFeaturesArgs $) {
        this.threadsPerCore = $.threadsPerCore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NodePoolNodeConfigAdvancedMachineFeaturesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NodePoolNodeConfigAdvancedMachineFeaturesArgs $;

        public Builder() {
            $ = new NodePoolNodeConfigAdvancedMachineFeaturesArgs();
        }

        public Builder(NodePoolNodeConfigAdvancedMachineFeaturesArgs defaults) {
            $ = new NodePoolNodeConfigAdvancedMachineFeaturesArgs(Objects.requireNonNull(defaults));
        }

        public Builder threadsPerCore(Output<Integer> threadsPerCore) {
            $.threadsPerCore = threadsPerCore;
            return this;
        }

        public Builder threadsPerCore(Integer threadsPerCore) {
            return threadsPerCore(Output.of(threadsPerCore));
        }

        public NodePoolNodeConfigAdvancedMachineFeaturesArgs build() {
            $.threadsPerCore = Objects.requireNonNull($.threadsPerCore, "expected parameter 'threadsPerCore' to be non-null");
            return $;
        }
    }

}
