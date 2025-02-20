// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.securitycenter.inputs.OrganizationCustomModuleCustomConfigArgs;
import java.lang.String;
import java.util.Objects;


public final class OrganizationCustomModuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationCustomModuleArgs Empty = new OrganizationCustomModuleArgs();

    /**
     * The user specified custom configuration for the module.
     * Structure is documented below.
     * 
     */
    @Import(name="customConfig", required=true)
    private Output<OrganizationCustomModuleCustomConfigArgs> customConfig;

    /**
     * @return The user specified custom configuration for the module.
     * Structure is documented below.
     * 
     */
    public Output<OrganizationCustomModuleCustomConfigArgs> customConfig() {
        return this.customConfig;
    }

    /**
     * The display name of the Security Health Analytics custom module. This
     * display name becomes the finding category for all findings that are
     * returned by this custom module. The display name must be between 1 and
     * 128 characters, start with a lowercase letter, and contain alphanumeric
     * characters or underscores only.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return The display name of the Security Health Analytics custom module. This
     * display name becomes the finding category for all findings that are
     * returned by this custom module. The display name must be between 1 and
     * 128 characters, start with a lowercase letter, and contain alphanumeric
     * characters or underscores only.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The enablement state of the custom module.
     * Possible values are: `ENABLED`, `DISABLED`.
     * 
     */
    @Import(name="enablementState", required=true)
    private Output<String> enablementState;

    /**
     * @return The enablement state of the custom module.
     * Possible values are: `ENABLED`, `DISABLED`.
     * 
     */
    public Output<String> enablementState() {
        return this.enablementState;
    }

    /**
     * Numerical ID of the parent organization.
     * 
     */
    @Import(name="organization", required=true)
    private Output<String> organization;

    /**
     * @return Numerical ID of the parent organization.
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }

    private OrganizationCustomModuleArgs() {}

    private OrganizationCustomModuleArgs(OrganizationCustomModuleArgs $) {
        this.customConfig = $.customConfig;
        this.displayName = $.displayName;
        this.enablementState = $.enablementState;
        this.organization = $.organization;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationCustomModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationCustomModuleArgs $;

        public Builder() {
            $ = new OrganizationCustomModuleArgs();
        }

        public Builder(OrganizationCustomModuleArgs defaults) {
            $ = new OrganizationCustomModuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customConfig The user specified custom configuration for the module.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customConfig(Output<OrganizationCustomModuleCustomConfigArgs> customConfig) {
            $.customConfig = customConfig;
            return this;
        }

        /**
         * @param customConfig The user specified custom configuration for the module.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder customConfig(OrganizationCustomModuleCustomConfigArgs customConfig) {
            return customConfig(Output.of(customConfig));
        }

        /**
         * @param displayName The display name of the Security Health Analytics custom module. This
         * display name becomes the finding category for all findings that are
         * returned by this custom module. The display name must be between 1 and
         * 128 characters, start with a lowercase letter, and contain alphanumeric
         * characters or underscores only.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The display name of the Security Health Analytics custom module. This
         * display name becomes the finding category for all findings that are
         * returned by this custom module. The display name must be between 1 and
         * 128 characters, start with a lowercase letter, and contain alphanumeric
         * characters or underscores only.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param enablementState The enablement state of the custom module.
         * Possible values are: `ENABLED`, `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder enablementState(Output<String> enablementState) {
            $.enablementState = enablementState;
            return this;
        }

        /**
         * @param enablementState The enablement state of the custom module.
         * Possible values are: `ENABLED`, `DISABLED`.
         * 
         * @return builder
         * 
         */
        public Builder enablementState(String enablementState) {
            return enablementState(Output.of(enablementState));
        }

        /**
         * @param organization Numerical ID of the parent organization.
         * 
         * @return builder
         * 
         */
        public Builder organization(Output<String> organization) {
            $.organization = organization;
            return this;
        }

        /**
         * @param organization Numerical ID of the parent organization.
         * 
         * @return builder
         * 
         */
        public Builder organization(String organization) {
            return organization(Output.of(organization));
        }

        public OrganizationCustomModuleArgs build() {
            $.customConfig = Objects.requireNonNull($.customConfig, "expected parameter 'customConfig' to be non-null");
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.enablementState = Objects.requireNonNull($.enablementState, "expected parameter 'enablementState' to be non-null");
            $.organization = Objects.requireNonNull($.organization, "expected parameter 'organization' to be non-null");
            return $;
        }
    }

}
