// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionPushConfigOidcTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final SubscriptionPushConfigOidcTokenArgs Empty = new SubscriptionPushConfigOidcTokenArgs();

    /**
     * Audience to be used when generating OIDC token. The audience claim
     * identifies the recipients that the JWT is intended for. The audience
     * value is a single case-sensitive string. Having multiple values (array)
     * for the audience field is not supported. More info about the OIDC JWT
     * token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3
     * Note: if not specified, the Push endpoint URL will be used.
     * 
     */
    @Import(name="audience")
    private @Nullable Output<String> audience;

    /**
     * @return Audience to be used when generating OIDC token. The audience claim
     * identifies the recipients that the JWT is intended for. The audience
     * value is a single case-sensitive string. Having multiple values (array)
     * for the audience field is not supported. More info about the OIDC JWT
     * token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3
     * Note: if not specified, the Push endpoint URL will be used.
     * 
     */
    public Optional<Output<String>> audience() {
        return Optional.ofNullable(this.audience);
    }

    /**
     * Service account email to be used for generating the OIDC token.
     * The caller (for subscriptions.create, subscriptions.patch, and
     * subscriptions.modifyPushConfig RPCs) must have the
     * iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    @Import(name="serviceAccountEmail", required=true)
    private Output<String> serviceAccountEmail;

    /**
     * @return Service account email to be used for generating the OIDC token.
     * The caller (for subscriptions.create, subscriptions.patch, and
     * subscriptions.modifyPushConfig RPCs) must have the
     * iam.serviceAccounts.actAs permission for the service account.
     * 
     */
    public Output<String> serviceAccountEmail() {
        return this.serviceAccountEmail;
    }

    private SubscriptionPushConfigOidcTokenArgs() {}

    private SubscriptionPushConfigOidcTokenArgs(SubscriptionPushConfigOidcTokenArgs $) {
        this.audience = $.audience;
        this.serviceAccountEmail = $.serviceAccountEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SubscriptionPushConfigOidcTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SubscriptionPushConfigOidcTokenArgs $;

        public Builder() {
            $ = new SubscriptionPushConfigOidcTokenArgs();
        }

        public Builder(SubscriptionPushConfigOidcTokenArgs defaults) {
            $ = new SubscriptionPushConfigOidcTokenArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audience Audience to be used when generating OIDC token. The audience claim
         * identifies the recipients that the JWT is intended for. The audience
         * value is a single case-sensitive string. Having multiple values (array)
         * for the audience field is not supported. More info about the OIDC JWT
         * token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3
         * Note: if not specified, the Push endpoint URL will be used.
         * 
         * @return builder
         * 
         */
        public Builder audience(@Nullable Output<String> audience) {
            $.audience = audience;
            return this;
        }

        /**
         * @param audience Audience to be used when generating OIDC token. The audience claim
         * identifies the recipients that the JWT is intended for. The audience
         * value is a single case-sensitive string. Having multiple values (array)
         * for the audience field is not supported. More info about the OIDC JWT
         * token audience here: https://tools.ietf.org/html/rfc7519#section-4.1.3
         * Note: if not specified, the Push endpoint URL will be used.
         * 
         * @return builder
         * 
         */
        public Builder audience(String audience) {
            return audience(Output.of(audience));
        }

        /**
         * @param serviceAccountEmail Service account email to be used for generating the OIDC token.
         * The caller (for subscriptions.create, subscriptions.patch, and
         * subscriptions.modifyPushConfig RPCs) must have the
         * iam.serviceAccounts.actAs permission for the service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail Service account email to be used for generating the OIDC token.
         * The caller (for subscriptions.create, subscriptions.patch, and
         * subscriptions.modifyPushConfig RPCs) must have the
         * iam.serviceAccounts.actAs permission for the service account.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        public SubscriptionPushConfigOidcTokenArgs build() {
            $.serviceAccountEmail = Objects.requireNonNull($.serviceAccountEmail, "expected parameter 'serviceAccountEmail' to be non-null");
            return $;
        }
    }

}
