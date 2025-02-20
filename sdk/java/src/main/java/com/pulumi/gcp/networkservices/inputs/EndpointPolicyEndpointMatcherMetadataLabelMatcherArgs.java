// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.networkservices.inputs.EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs Empty = new EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs();

    /**
     * Specifies how matching should be done.
     * Possible values are: `MATCH_ANY`, `MATCH_ALL`.
     * 
     */
    @Import(name="metadataLabelMatchCriteria", required=true)
    private Output<String> metadataLabelMatchCriteria;

    /**
     * @return Specifies how matching should be done.
     * Possible values are: `MATCH_ANY`, `MATCH_ALL`.
     * 
     */
    public Output<String> metadataLabelMatchCriteria() {
        return this.metadataLabelMatchCriteria;
    }

    /**
     * The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
     * Structure is documented below.
     * 
     */
    @Import(name="metadataLabels")
    private @Nullable Output<List<EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs>> metadataLabels;

    /**
     * @return The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs>>> metadataLabels() {
        return Optional.ofNullable(this.metadataLabels);
    }

    private EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs() {}

    private EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs(EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs $) {
        this.metadataLabelMatchCriteria = $.metadataLabelMatchCriteria;
        this.metadataLabels = $.metadataLabels;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs $;

        public Builder() {
            $ = new EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs();
        }

        public Builder(EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs defaults) {
            $ = new EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadataLabelMatchCriteria Specifies how matching should be done.
         * Possible values are: `MATCH_ANY`, `MATCH_ALL`.
         * 
         * @return builder
         * 
         */
        public Builder metadataLabelMatchCriteria(Output<String> metadataLabelMatchCriteria) {
            $.metadataLabelMatchCriteria = metadataLabelMatchCriteria;
            return this;
        }

        /**
         * @param metadataLabelMatchCriteria Specifies how matching should be done.
         * Possible values are: `MATCH_ANY`, `MATCH_ALL`.
         * 
         * @return builder
         * 
         */
        public Builder metadataLabelMatchCriteria(String metadataLabelMatchCriteria) {
            return metadataLabelMatchCriteria(Output.of(metadataLabelMatchCriteria));
        }

        /**
         * @param metadataLabels The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadataLabels(@Nullable Output<List<EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs>> metadataLabels) {
            $.metadataLabels = metadataLabels;
            return this;
        }

        /**
         * @param metadataLabels The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadataLabels(List<EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs> metadataLabels) {
            return metadataLabels(Output.of(metadataLabels));
        }

        /**
         * @param metadataLabels The list of label value pairs that must match labels in the provided metadata based on filterMatchCriteria
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder metadataLabels(EndpointPolicyEndpointMatcherMetadataLabelMatcherMetadataLabelArgs... metadataLabels) {
            return metadataLabels(List.of(metadataLabels));
        }

        public EndpointPolicyEndpointMatcherMetadataLabelMatcherArgs build() {
            $.metadataLabelMatchCriteria = Objects.requireNonNull($.metadataLabelMatchCriteria, "expected parameter 'metadataLabelMatchCriteria' to be non-null");
            return $;
        }
    }

}
