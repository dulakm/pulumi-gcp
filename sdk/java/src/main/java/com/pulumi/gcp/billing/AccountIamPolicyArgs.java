// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.billing;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AccountIamPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountIamPolicyArgs Empty = new AccountIamPolicyArgs();

    /**
     * The billing account id.
     * 
     * For `gcp.billing.AccountIamMember` or `gcp.billing.AccountIamBinding`:
     * 
     * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
     *   Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    @Import(name="billingAccountId", required=true)
    private Output<String> billingAccountId;

    /**
     * @return The billing account id.
     * 
     * For `gcp.billing.AccountIamMember` or `gcp.billing.AccountIamBinding`:
     * 
     * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
     *   Each entry can have one of the following values:
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * 
     */
    public Output<String> billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     * ***
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     * ***
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    private AccountIamPolicyArgs() {}

    private AccountIamPolicyArgs(AccountIamPolicyArgs $) {
        this.billingAccountId = $.billingAccountId;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountIamPolicyArgs $;

        public Builder() {
            $ = new AccountIamPolicyArgs();
        }

        public Builder(AccountIamPolicyArgs defaults) {
            $ = new AccountIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountId The billing account id.
         * 
         * For `gcp.billing.AccountIamMember` or `gcp.billing.AccountIamBinding`:
         * 
         * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
         *   Each entry can have one of the following values:
         * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
         * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
         * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
         * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(Output<String> billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        /**
         * @param billingAccountId The billing account id.
         * 
         * For `gcp.billing.AccountIamMember` or `gcp.billing.AccountIamBinding`:
         * 
         * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
         *   Each entry can have one of the following values:
         * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
         * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
         * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
         * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(String billingAccountId) {
            return billingAccountId(Output.of(billingAccountId));
        }

        /**
         * @param policyData The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public AccountIamPolicyArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
