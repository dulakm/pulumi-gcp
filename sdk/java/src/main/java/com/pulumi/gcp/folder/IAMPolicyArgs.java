// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class IAMPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final IAMPolicyArgs Empty = new IAMPolicyArgs();

    /**
     * The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    @Import(name="folder", required=true)
    private Output<String> folder;

    /**
     * @return The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
     * 
     */
    public Output<String> folder() {
        return this.folder;
    }

    /**
     * The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the folder. The policy will be
     * merged with any existing policy applied to the folder.
     * 
     * Changing this updates the policy.
     * 
     * Deleting this removes all policies from the folder, locking out users without
     * folder-level access.
     * 
     */
    @Import(name="policyData", required=true)
    private Output<String> policyData;

    /**
     * @return The `gcp.organizations.getIAMPolicy` data source that represents
     * the IAM policy that will be applied to the folder. The policy will be
     * merged with any existing policy applied to the folder.
     * 
     * Changing this updates the policy.
     * 
     * Deleting this removes all policies from the folder, locking out users without
     * folder-level access.
     * 
     */
    public Output<String> policyData() {
        return this.policyData;
    }

    private IAMPolicyArgs() {}

    private IAMPolicyArgs(IAMPolicyArgs $) {
        this.folder = $.folder;
        this.policyData = $.policyData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IAMPolicyArgs $;

        public Builder() {
            $ = new IAMPolicyArgs();
        }

        public Builder(IAMPolicyArgs defaults) {
            $ = new IAMPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param folder The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
         * 
         * @return builder
         * 
         */
        public Builder folder(Output<String> folder) {
            $.folder = folder;
            return this;
        }

        /**
         * @param folder The resource name of the folder the policy is attached to. Its format is folders/{folder_id}.
         * 
         * @return builder
         * 
         */
        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        /**
         * @param policyData The `gcp.organizations.getIAMPolicy` data source that represents
         * the IAM policy that will be applied to the folder. The policy will be
         * merged with any existing policy applied to the folder.
         * 
         * Changing this updates the policy.
         * 
         * Deleting this removes all policies from the folder, locking out users without
         * folder-level access.
         * 
         * @return builder
         * 
         */
        public Builder policyData(Output<String> policyData) {
            $.policyData = policyData;
            return this;
        }

        /**
         * @param policyData The `gcp.organizations.getIAMPolicy` data source that represents
         * the IAM policy that will be applied to the folder. The policy will be
         * merged with any existing policy applied to the folder.
         * 
         * Changing this updates the policy.
         * 
         * Deleting this removes all policies from the folder, locking out users without
         * folder-level access.
         * 
         * @return builder
         * 
         */
        public Builder policyData(String policyData) {
            return policyData(Output.of(policyData));
        }

        public IAMPolicyArgs build() {
            $.folder = Objects.requireNonNull($.folder, "expected parameter 'folder' to be non-null");
            $.policyData = Objects.requireNonNull($.policyData, "expected parameter 'policyData' to be non-null");
            return $;
        }
    }

}
