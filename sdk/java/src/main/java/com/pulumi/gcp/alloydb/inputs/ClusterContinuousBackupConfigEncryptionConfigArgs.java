// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterContinuousBackupConfigEncryptionConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterContinuousBackupConfigEncryptionConfigArgs Empty = new ClusterContinuousBackupConfigEncryptionConfigArgs();

    /**
     * The fully-qualified resource name of the KMS key. Each Cloud KMS key is regionalized and has the following format: projects/[PROJECT]/locations/[REGION]/keyRings/[RING]/cryptoKeys/[KEY_NAME].
     * 
     */
    @Import(name="kmsKeyName")
    private @Nullable Output<String> kmsKeyName;

    /**
     * @return The fully-qualified resource name of the KMS key. Each Cloud KMS key is regionalized and has the following format: projects/[PROJECT]/locations/[REGION]/keyRings/[RING]/cryptoKeys/[KEY_NAME].
     * 
     */
    public Optional<Output<String>> kmsKeyName() {
        return Optional.ofNullable(this.kmsKeyName);
    }

    private ClusterContinuousBackupConfigEncryptionConfigArgs() {}

    private ClusterContinuousBackupConfigEncryptionConfigArgs(ClusterContinuousBackupConfigEncryptionConfigArgs $) {
        this.kmsKeyName = $.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterContinuousBackupConfigEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterContinuousBackupConfigEncryptionConfigArgs $;

        public Builder() {
            $ = new ClusterContinuousBackupConfigEncryptionConfigArgs();
        }

        public Builder(ClusterContinuousBackupConfigEncryptionConfigArgs defaults) {
            $ = new ClusterContinuousBackupConfigEncryptionConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kmsKeyName The fully-qualified resource name of the KMS key. Each Cloud KMS key is regionalized and has the following format: projects/[PROJECT]/locations/[REGION]/keyRings/[RING]/cryptoKeys/[KEY_NAME].
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(@Nullable Output<String> kmsKeyName) {
            $.kmsKeyName = kmsKeyName;
            return this;
        }

        /**
         * @param kmsKeyName The fully-qualified resource name of the KMS key. Each Cloud KMS key is regionalized and has the following format: projects/[PROJECT]/locations/[REGION]/keyRings/[RING]/cryptoKeys/[KEY_NAME].
         * 
         * @return builder
         * 
         */
        public Builder kmsKeyName(String kmsKeyName) {
            return kmsKeyName(Output.of(kmsKeyName));
        }

        public ClusterContinuousBackupConfigEncryptionConfigArgs build() {
            return $;
        }
    }

}
