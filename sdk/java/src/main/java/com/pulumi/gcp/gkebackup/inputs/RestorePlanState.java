// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestorePlanState extends com.pulumi.resources.ResourceArgs {

    public static final RestorePlanState Empty = new RestorePlanState();

    /**
     * A reference to the BackupPlan from which Backups may be used
     * as the source for Restores created via this RestorePlan.
     * 
     */
    @Import(name="backupPlan")
    private @Nullable Output<String> backupPlan;

    /**
     * @return A reference to the BackupPlan from which Backups may be used
     * as the source for Restores created via this RestorePlan.
     * 
     */
    public Optional<Output<String>> backupPlan() {
        return Optional.ofNullable(this.backupPlan);
    }

    /**
     * The source cluster from which Restores will be created via this RestorePlan.
     * 
     */
    @Import(name="cluster")
    private @Nullable Output<String> cluster;

    /**
     * @return The source cluster from which Restores will be created via this RestorePlan.
     * 
     */
    public Optional<Output<String>> cluster() {
        return Optional.ofNullable(this.cluster);
    }

    /**
     * User specified descriptive string for this RestorePlan.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User specified descriptive string for this RestorePlan.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * Description: A set of custom labels supplied by the user.
     * A list of key-&gt;value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Description: A set of custom labels supplied by the user.
     * A list of key-&gt;value pairs.
     * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
     * 
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The region of the Restore Plan.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The region of the Restore Plan.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The full name of the BackupPlan Resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The full name of the BackupPlan Resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * Defines the configuration of Restores created via this RestorePlan.
     * Structure is documented below.
     * 
     */
    @Import(name="restoreConfig")
    private @Nullable Output<RestorePlanRestoreConfigArgs> restoreConfig;

    /**
     * @return Defines the configuration of Restores created via this RestorePlan.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RestorePlanRestoreConfigArgs>> restoreConfig() {
        return Optional.ofNullable(this.restoreConfig);
    }

    /**
     * The State of the RestorePlan.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The State of the RestorePlan.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Detailed description of why RestorePlan is in its current state.
     * 
     */
    @Import(name="stateReason")
    private @Nullable Output<String> stateReason;

    /**
     * @return Detailed description of why RestorePlan is in its current state.
     * 
     */
    public Optional<Output<String>> stateReason() {
        return Optional.ofNullable(this.stateReason);
    }

    /**
     * Server generated, unique identifier of UUID format.
     * 
     */
    @Import(name="uid")
    private @Nullable Output<String> uid;

    /**
     * @return Server generated, unique identifier of UUID format.
     * 
     */
    public Optional<Output<String>> uid() {
        return Optional.ofNullable(this.uid);
    }

    private RestorePlanState() {}

    private RestorePlanState(RestorePlanState $) {
        this.backupPlan = $.backupPlan;
        this.cluster = $.cluster;
        this.description = $.description;
        this.effectiveLabels = $.effectiveLabels;
        this.labels = $.labels;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.restoreConfig = $.restoreConfig;
        this.state = $.state;
        this.stateReason = $.stateReason;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePlanState $;

        public Builder() {
            $ = new RestorePlanState();
        }

        public Builder(RestorePlanState defaults) {
            $ = new RestorePlanState(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupPlan A reference to the BackupPlan from which Backups may be used
         * as the source for Restores created via this RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder backupPlan(@Nullable Output<String> backupPlan) {
            $.backupPlan = backupPlan;
            return this;
        }

        /**
         * @param backupPlan A reference to the BackupPlan from which Backups may be used
         * as the source for Restores created via this RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder backupPlan(String backupPlan) {
            return backupPlan(Output.of(backupPlan));
        }

        /**
         * @param cluster The source cluster from which Restores will be created via this RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder cluster(@Nullable Output<String> cluster) {
            $.cluster = cluster;
            return this;
        }

        /**
         * @param cluster The source cluster from which Restores will be created via this RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder cluster(String cluster) {
            return cluster(Output.of(cluster));
        }

        /**
         * @param description User specified descriptive string for this RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User specified descriptive string for this RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param labels Description: A set of custom labels supplied by the user.
         * A list of key-&gt;value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Description: A set of custom labels supplied by the user.
         * A list of key-&gt;value pairs.
         * Example: { &#34;name&#34;: &#34;wrench&#34;, &#34;mass&#34;: &#34;1.3kg&#34;, &#34;count&#34;: &#34;3&#34; }.
         * 
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The region of the Restore Plan.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The region of the Restore Plan.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The full name of the BackupPlan Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The full name of the BackupPlan Resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param restoreConfig Defines the configuration of Restores created via this RestorePlan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder restoreConfig(@Nullable Output<RestorePlanRestoreConfigArgs> restoreConfig) {
            $.restoreConfig = restoreConfig;
            return this;
        }

        /**
         * @param restoreConfig Defines the configuration of Restores created via this RestorePlan.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder restoreConfig(RestorePlanRestoreConfigArgs restoreConfig) {
            return restoreConfig(Output.of(restoreConfig));
        }

        /**
         * @param state The State of the RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The State of the RestorePlan.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param stateReason Detailed description of why RestorePlan is in its current state.
         * 
         * @return builder
         * 
         */
        public Builder stateReason(@Nullable Output<String> stateReason) {
            $.stateReason = stateReason;
            return this;
        }

        /**
         * @param stateReason Detailed description of why RestorePlan is in its current state.
         * 
         * @return builder
         * 
         */
        public Builder stateReason(String stateReason) {
            return stateReason(Output.of(stateReason));
        }

        /**
         * @param uid Server generated, unique identifier of UUID format.
         * 
         * @return builder
         * 
         */
        public Builder uid(@Nullable Output<String> uid) {
            $.uid = uid;
            return this;
        }

        /**
         * @param uid Server generated, unique identifier of UUID format.
         * 
         * @return builder
         * 
         */
        public Builder uid(String uid) {
            return uid(Output.of(uid));
        }

        public RestorePlanState build() {
            return $;
        }
    }

}
