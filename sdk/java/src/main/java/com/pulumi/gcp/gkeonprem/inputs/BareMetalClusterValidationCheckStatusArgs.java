// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkeonprem.inputs.BareMetalClusterValidationCheckStatusResultArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BareMetalClusterValidationCheckStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final BareMetalClusterValidationCheckStatusArgs Empty = new BareMetalClusterValidationCheckStatusArgs();

    /**
     * (Output)
     * Individual checks which failed as part of the Preflight check execution.
     * Structure is documented below.
     * 
     */
    @Import(name="results")
    private @Nullable Output<List<BareMetalClusterValidationCheckStatusResultArgs>> results;

    /**
     * @return (Output)
     * Individual checks which failed as part of the Preflight check execution.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<BareMetalClusterValidationCheckStatusResultArgs>>> results() {
        return Optional.ofNullable(this.results);
    }

    private BareMetalClusterValidationCheckStatusArgs() {}

    private BareMetalClusterValidationCheckStatusArgs(BareMetalClusterValidationCheckStatusArgs $) {
        this.results = $.results;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BareMetalClusterValidationCheckStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BareMetalClusterValidationCheckStatusArgs $;

        public Builder() {
            $ = new BareMetalClusterValidationCheckStatusArgs();
        }

        public Builder(BareMetalClusterValidationCheckStatusArgs defaults) {
            $ = new BareMetalClusterValidationCheckStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param results (Output)
         * Individual checks which failed as part of the Preflight check execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder results(@Nullable Output<List<BareMetalClusterValidationCheckStatusResultArgs>> results) {
            $.results = results;
            return this;
        }

        /**
         * @param results (Output)
         * Individual checks which failed as part of the Preflight check execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder results(List<BareMetalClusterValidationCheckStatusResultArgs> results) {
            return results(Output.of(results));
        }

        /**
         * @param results (Output)
         * Individual checks which failed as part of the Preflight check execution.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder results(BareMetalClusterValidationCheckStatusResultArgs... results) {
            return results(List.of(results));
        }

        public BareMetalClusterValidationCheckStatusArgs build() {
            return $;
        }
    }

}
