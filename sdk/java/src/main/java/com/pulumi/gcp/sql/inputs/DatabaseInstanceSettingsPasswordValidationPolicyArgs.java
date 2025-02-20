// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsPasswordValidationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsPasswordValidationPolicyArgs Empty = new DatabaseInstanceSettingsPasswordValidationPolicyArgs();

    /**
     * Checks if the password is a combination of lowercase, uppercase, numeric, and non-alphanumeric characters.
     * 
     */
    @Import(name="complexity")
    private @Nullable Output<String> complexity;

    /**
     * @return Checks if the password is a combination of lowercase, uppercase, numeric, and non-alphanumeric characters.
     * 
     */
    public Optional<Output<String>> complexity() {
        return Optional.ofNullable(this.complexity);
    }

    /**
     * Prevents the use of the username in the password.
     * 
     */
    @Import(name="disallowUsernameSubstring")
    private @Nullable Output<Boolean> disallowUsernameSubstring;

    /**
     * @return Prevents the use of the username in the password.
     * 
     */
    public Optional<Output<Boolean>> disallowUsernameSubstring() {
        return Optional.ofNullable(this.disallowUsernameSubstring);
    }

    /**
     * Enables or disable the password validation policy.
     * 
     * The optional `replica_configuration` block must have `master_instance_name` set
     * to work, cannot be updated, and supports:
     * 
     */
    @Import(name="enablePasswordPolicy", required=true)
    private Output<Boolean> enablePasswordPolicy;

    /**
     * @return Enables or disable the password validation policy.
     * 
     * The optional `replica_configuration` block must have `master_instance_name` set
     * to work, cannot be updated, and supports:
     * 
     */
    public Output<Boolean> enablePasswordPolicy() {
        return this.enablePasswordPolicy;
    }

    /**
     * Specifies the minimum number of characters that the password must have.
     * 
     */
    @Import(name="minLength")
    private @Nullable Output<Integer> minLength;

    /**
     * @return Specifies the minimum number of characters that the password must have.
     * 
     */
    public Optional<Output<Integer>> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    /**
     * Specifies the minimum duration after which you can change the password.
     * 
     */
    @Import(name="passwordChangeInterval")
    private @Nullable Output<String> passwordChangeInterval;

    /**
     * @return Specifies the minimum duration after which you can change the password.
     * 
     */
    public Optional<Output<String>> passwordChangeInterval() {
        return Optional.ofNullable(this.passwordChangeInterval);
    }

    /**
     * Specifies the number of previous passwords that you can&#39;t reuse.
     * 
     */
    @Import(name="reuseInterval")
    private @Nullable Output<Integer> reuseInterval;

    /**
     * @return Specifies the number of previous passwords that you can&#39;t reuse.
     * 
     */
    public Optional<Output<Integer>> reuseInterval() {
        return Optional.ofNullable(this.reuseInterval);
    }

    private DatabaseInstanceSettingsPasswordValidationPolicyArgs() {}

    private DatabaseInstanceSettingsPasswordValidationPolicyArgs(DatabaseInstanceSettingsPasswordValidationPolicyArgs $) {
        this.complexity = $.complexity;
        this.disallowUsernameSubstring = $.disallowUsernameSubstring;
        this.enablePasswordPolicy = $.enablePasswordPolicy;
        this.minLength = $.minLength;
        this.passwordChangeInterval = $.passwordChangeInterval;
        this.reuseInterval = $.reuseInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceSettingsPasswordValidationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceSettingsPasswordValidationPolicyArgs $;

        public Builder() {
            $ = new DatabaseInstanceSettingsPasswordValidationPolicyArgs();
        }

        public Builder(DatabaseInstanceSettingsPasswordValidationPolicyArgs defaults) {
            $ = new DatabaseInstanceSettingsPasswordValidationPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param complexity Checks if the password is a combination of lowercase, uppercase, numeric, and non-alphanumeric characters.
         * 
         * @return builder
         * 
         */
        public Builder complexity(@Nullable Output<String> complexity) {
            $.complexity = complexity;
            return this;
        }

        /**
         * @param complexity Checks if the password is a combination of lowercase, uppercase, numeric, and non-alphanumeric characters.
         * 
         * @return builder
         * 
         */
        public Builder complexity(String complexity) {
            return complexity(Output.of(complexity));
        }

        /**
         * @param disallowUsernameSubstring Prevents the use of the username in the password.
         * 
         * @return builder
         * 
         */
        public Builder disallowUsernameSubstring(@Nullable Output<Boolean> disallowUsernameSubstring) {
            $.disallowUsernameSubstring = disallowUsernameSubstring;
            return this;
        }

        /**
         * @param disallowUsernameSubstring Prevents the use of the username in the password.
         * 
         * @return builder
         * 
         */
        public Builder disallowUsernameSubstring(Boolean disallowUsernameSubstring) {
            return disallowUsernameSubstring(Output.of(disallowUsernameSubstring));
        }

        /**
         * @param enablePasswordPolicy Enables or disable the password validation policy.
         * 
         * The optional `replica_configuration` block must have `master_instance_name` set
         * to work, cannot be updated, and supports:
         * 
         * @return builder
         * 
         */
        public Builder enablePasswordPolicy(Output<Boolean> enablePasswordPolicy) {
            $.enablePasswordPolicy = enablePasswordPolicy;
            return this;
        }

        /**
         * @param enablePasswordPolicy Enables or disable the password validation policy.
         * 
         * The optional `replica_configuration` block must have `master_instance_name` set
         * to work, cannot be updated, and supports:
         * 
         * @return builder
         * 
         */
        public Builder enablePasswordPolicy(Boolean enablePasswordPolicy) {
            return enablePasswordPolicy(Output.of(enablePasswordPolicy));
        }

        /**
         * @param minLength Specifies the minimum number of characters that the password must have.
         * 
         * @return builder
         * 
         */
        public Builder minLength(@Nullable Output<Integer> minLength) {
            $.minLength = minLength;
            return this;
        }

        /**
         * @param minLength Specifies the minimum number of characters that the password must have.
         * 
         * @return builder
         * 
         */
        public Builder minLength(Integer minLength) {
            return minLength(Output.of(minLength));
        }

        /**
         * @param passwordChangeInterval Specifies the minimum duration after which you can change the password.
         * 
         * @return builder
         * 
         */
        public Builder passwordChangeInterval(@Nullable Output<String> passwordChangeInterval) {
            $.passwordChangeInterval = passwordChangeInterval;
            return this;
        }

        /**
         * @param passwordChangeInterval Specifies the minimum duration after which you can change the password.
         * 
         * @return builder
         * 
         */
        public Builder passwordChangeInterval(String passwordChangeInterval) {
            return passwordChangeInterval(Output.of(passwordChangeInterval));
        }

        /**
         * @param reuseInterval Specifies the number of previous passwords that you can&#39;t reuse.
         * 
         * @return builder
         * 
         */
        public Builder reuseInterval(@Nullable Output<Integer> reuseInterval) {
            $.reuseInterval = reuseInterval;
            return this;
        }

        /**
         * @param reuseInterval Specifies the number of previous passwords that you can&#39;t reuse.
         * 
         * @return builder
         * 
         */
        public Builder reuseInterval(Integer reuseInterval) {
            return reuseInterval(Output.of(reuseInterval));
        }

        public DatabaseInstanceSettingsPasswordValidationPolicyArgs build() {
            $.enablePasswordPolicy = Objects.requireNonNull($.enablePasswordPolicy, "expected parameter 'enablePasswordPolicy' to be non-null");
            return $;
        }
    }

}
