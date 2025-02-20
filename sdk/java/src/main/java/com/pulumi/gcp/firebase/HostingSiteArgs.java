// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HostingSiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final HostingSiteArgs Empty = new HostingSiteArgs();

    /**
     * Optional. The [ID of a Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
     * associated with the Hosting site.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return Optional. The [ID of a Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
     * associated with the Hosting site.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
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
     * Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
     * used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
     * domain name label.
     * 
     */
    @Import(name="siteId")
    private @Nullable Output<String> siteId;

    /**
     * @return Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
     * used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
     * domain name label.
     * 
     */
    public Optional<Output<String>> siteId() {
        return Optional.ofNullable(this.siteId);
    }

    private HostingSiteArgs() {}

    private HostingSiteArgs(HostingSiteArgs $) {
        this.appId = $.appId;
        this.project = $.project;
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HostingSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HostingSiteArgs $;

        public Builder() {
            $ = new HostingSiteArgs();
        }

        public Builder(HostingSiteArgs defaults) {
            $ = new HostingSiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId Optional. The [ID of a Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
         * associated with the Hosting site.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId Optional. The [ID of a Web App](https://firebase.google.com/docs/reference/firebase-management/rest/v1beta1/projects.webApps#WebApp.FIELDS.app_id)
         * associated with the Hosting site.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
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
         * @param siteId Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
         * used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
         * domain name label.
         * 
         * @return builder
         * 
         */
        public Builder siteId(@Nullable Output<String> siteId) {
            $.siteId = siteId;
            return this;
        }

        /**
         * @param siteId Required. Immutable. A globally unique identifier for the Hosting site. This identifier is
         * used to construct the Firebase-provisioned subdomains for the site, so it must also be a valid
         * domain name label.
         * 
         * @return builder
         * 
         */
        public Builder siteId(String siteId) {
            return siteId(Output.of(siteId));
        }

        public HostingSiteArgs build() {
            return $;
        }
    }

}
