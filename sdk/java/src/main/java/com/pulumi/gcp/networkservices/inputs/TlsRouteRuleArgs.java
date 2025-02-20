// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleActionArgs;
import com.pulumi.gcp.networkservices.inputs.TlsRouteRuleMatchArgs;
import java.util.List;
import java.util.Objects;


public final class TlsRouteRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final TlsRouteRuleArgs Empty = new TlsRouteRuleArgs();

    /**
     * Required. A detailed rule defining how to route traffic.
     * Structure is documented below.
     * 
     */
    @Import(name="action", required=true)
    private Output<TlsRouteRuleActionArgs> action;

    /**
     * @return Required. A detailed rule defining how to route traffic.
     * Structure is documented below.
     * 
     */
    public Output<TlsRouteRuleActionArgs> action() {
        return this.action;
    }

    /**
     * Matches define the predicate used to match requests to a given action.
     * Structure is documented below.
     * 
     */
    @Import(name="matches", required=true)
    private Output<List<TlsRouteRuleMatchArgs>> matches;

    /**
     * @return Matches define the predicate used to match requests to a given action.
     * Structure is documented below.
     * 
     */
    public Output<List<TlsRouteRuleMatchArgs>> matches() {
        return this.matches;
    }

    private TlsRouteRuleArgs() {}

    private TlsRouteRuleArgs(TlsRouteRuleArgs $) {
        this.action = $.action;
        this.matches = $.matches;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TlsRouteRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TlsRouteRuleArgs $;

        public Builder() {
            $ = new TlsRouteRuleArgs();
        }

        public Builder(TlsRouteRuleArgs defaults) {
            $ = new TlsRouteRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param action Required. A detailed rule defining how to route traffic.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder action(Output<TlsRouteRuleActionArgs> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action Required. A detailed rule defining how to route traffic.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder action(TlsRouteRuleActionArgs action) {
            return action(Output.of(action));
        }

        /**
         * @param matches Matches define the predicate used to match requests to a given action.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder matches(Output<List<TlsRouteRuleMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches Matches define the predicate used to match requests to a given action.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder matches(List<TlsRouteRuleMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches Matches define the predicate used to match requests to a given action.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder matches(TlsRouteRuleMatchArgs... matches) {
            return matches(List.of(matches));
        }

        public TlsRouteRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.matches = Objects.requireNonNull($.matches, "expected parameter 'matches' to be non-null");
            return $;
        }
    }

}
