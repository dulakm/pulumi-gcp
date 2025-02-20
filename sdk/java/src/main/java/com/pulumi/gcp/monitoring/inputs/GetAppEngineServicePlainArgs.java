// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppEngineServicePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppEngineServicePlainArgs Empty = new GetAppEngineServicePlainArgs();

    /**
     * The ID of the App Engine module underlying this
     * service. Corresponds to the moduleId resource label in the [gae_app](https://cloud.google.com/monitoring/api/resources#tag_gae_app) monitored resource, or the service/module name.
     * 
     * ***
     * 
     * Other optional fields include:
     * 
     */
    @Import(name="moduleId", required=true)
    private String moduleId;

    /**
     * @return The ID of the App Engine module underlying this
     * service. Corresponds to the moduleId resource label in the [gae_app](https://cloud.google.com/monitoring/api/resources#tag_gae_app) monitored resource, or the service/module name.
     * 
     * ***
     * 
     * Other optional fields include:
     * 
     */
    public String moduleId() {
        return this.moduleId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAppEngineServicePlainArgs() {}

    private GetAppEngineServicePlainArgs(GetAppEngineServicePlainArgs $) {
        this.moduleId = $.moduleId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppEngineServicePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppEngineServicePlainArgs $;

        public Builder() {
            $ = new GetAppEngineServicePlainArgs();
        }

        public Builder(GetAppEngineServicePlainArgs defaults) {
            $ = new GetAppEngineServicePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param moduleId The ID of the App Engine module underlying this
         * service. Corresponds to the moduleId resource label in the [gae_app](https://cloud.google.com/monitoring/api/resources#tag_gae_app) monitored resource, or the service/module name.
         * 
         * ***
         * 
         * Other optional fields include:
         * 
         * @return builder
         * 
         */
        public Builder moduleId(String moduleId) {
            $.moduleId = moduleId;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAppEngineServicePlainArgs build() {
            $.moduleId = Objects.requireNonNull($.moduleId, "expected parameter 'moduleId' to be non-null");
            return $;
        }
    }

}
