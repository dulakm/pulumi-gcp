// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAutomatedBackupPolicyQuantityBasedRetention {
    /**
     * @return The number of backups to retain.
     * 
     */
    private @Nullable Integer count;

    private ClusterAutomatedBackupPolicyQuantityBasedRetention() {}
    /**
     * @return The number of backups to retain.
     * 
     */
    public Optional<Integer> count() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAutomatedBackupPolicyQuantityBasedRetention defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer count;
        public Builder() {}
        public Builder(ClusterAutomatedBackupPolicyQuantityBasedRetention defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
        }

        @CustomType.Setter
        public Builder count(@Nullable Integer count) {
            this.count = count;
            return this;
        }
        public ClusterAutomatedBackupPolicyQuantityBasedRetention build() {
            final var o = new ClusterAutomatedBackupPolicyQuantityBasedRetention();
            o.count = count;
            return o;
        }
    }
}
