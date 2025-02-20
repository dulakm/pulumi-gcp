// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRegionInstanceTemplateDiskSourceSnapshotEncryptionKey {
    /**
     * @return The self link of the encryption key that is stored in Google Cloud KMS
     * 
     */
    private String kmsKeySelfLink;
    private String kmsKeyServiceAccount;

    private GetRegionInstanceTemplateDiskSourceSnapshotEncryptionKey() {}
    /**
     * @return The self link of the encryption key that is stored in Google Cloud KMS
     * 
     */
    public String kmsKeySelfLink() {
        return this.kmsKeySelfLink;
    }
    public String kmsKeyServiceAccount() {
        return this.kmsKeyServiceAccount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionInstanceTemplateDiskSourceSnapshotEncryptionKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String kmsKeySelfLink;
        private String kmsKeyServiceAccount;
        public Builder() {}
        public Builder(GetRegionInstanceTemplateDiskSourceSnapshotEncryptionKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeySelfLink = defaults.kmsKeySelfLink;
    	      this.kmsKeyServiceAccount = defaults.kmsKeyServiceAccount;
        }

        @CustomType.Setter
        public Builder kmsKeySelfLink(String kmsKeySelfLink) {
            this.kmsKeySelfLink = Objects.requireNonNull(kmsKeySelfLink);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyServiceAccount(String kmsKeyServiceAccount) {
            this.kmsKeyServiceAccount = Objects.requireNonNull(kmsKeyServiceAccount);
            return this;
        }
        public GetRegionInstanceTemplateDiskSourceSnapshotEncryptionKey build() {
            final var o = new GetRegionInstanceTemplateDiskSourceSnapshotEncryptionKey();
            o.kmsKeySelfLink = kmsKeySelfLink;
            o.kmsKeyServiceAccount = kmsKeyServiceAccount;
            return o;
        }
    }
}
