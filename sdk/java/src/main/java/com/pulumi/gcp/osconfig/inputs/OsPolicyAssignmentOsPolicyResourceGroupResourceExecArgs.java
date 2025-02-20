// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs;
import com.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs extends com.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs();

    /**
     * What to run to bring this resource into the desired
     * state. An exit code of 100 indicates &#34;success&#34;, any other exit code
     * indicates a failure running enforce. Structure is
     * documented below.
     * 
     */
    @Import(name="enforce")
    private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs> enforce;

    /**
     * @return What to run to bring this resource into the desired
     * state. An exit code of 100 indicates &#34;success&#34;, any other exit code
     * indicates a failure running enforce. Structure is
     * documented below.
     * 
     */
    public Optional<Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs>> enforce() {
        return Optional.ofNullable(this.enforce);
    }

    /**
     * What to run to validate this resource is in the
     * desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit
     * code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates
     * a failure running validate. Structure is
     * documented below.
     * 
     */
    @Import(name="validate", required=true)
    private Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs> validate;

    /**
     * @return What to run to validate this resource is in the
     * desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit
     * code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates
     * a failure running validate. Structure is
     * documented below.
     * 
     */
    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs> validate() {
        return this.validate;
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs() {}

    private OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs(OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs $) {
        this.enforce = $.enforce;
        this.validate = $.validate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs $;

        public Builder() {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs();
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs defaults) {
            $ = new OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enforce What to run to bring this resource into the desired
         * state. An exit code of 100 indicates &#34;success&#34;, any other exit code
         * indicates a failure running enforce. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder enforce(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs> enforce) {
            $.enforce = enforce;
            return this;
        }

        /**
         * @param enforce What to run to bring this resource into the desired
         * state. An exit code of 100 indicates &#34;success&#34;, any other exit code
         * indicates a failure running enforce. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder enforce(OsPolicyAssignmentOsPolicyResourceGroupResourceExecEnforceArgs enforce) {
            return enforce(Output.of(enforce));
        }

        /**
         * @param validate What to run to validate this resource is in the
         * desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit
         * code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates
         * a failure running validate. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder validate(Output<OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs> validate) {
            $.validate = validate;
            return this;
        }

        /**
         * @param validate What to run to validate this resource is in the
         * desired state. An exit code of 100 indicates &#34;in desired state&#34;, and exit
         * code of 101 indicates &#34;not in desired state&#34;. Any other exit code indicates
         * a failure running validate. Structure is
         * documented below.
         * 
         * @return builder
         * 
         */
        public Builder validate(OsPolicyAssignmentOsPolicyResourceGroupResourceExecValidateArgs validate) {
            return validate(Output.of(validate));
        }

        public OsPolicyAssignmentOsPolicyResourceGroupResourceExecArgs build() {
            $.validate = Objects.requireNonNull($.validate, "expected parameter 'validate' to be non-null");
            return $;
        }
    }

}
