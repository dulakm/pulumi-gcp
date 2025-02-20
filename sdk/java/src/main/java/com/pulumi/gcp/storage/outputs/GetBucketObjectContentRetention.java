// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetBucketObjectContentRetention {
    private String mode;
    private String retainUntilTime;

    private GetBucketObjectContentRetention() {}
    public String mode() {
        return this.mode;
    }
    public String retainUntilTime() {
        return this.retainUntilTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectContentRetention defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mode;
        private String retainUntilTime;
        public Builder() {}
        public Builder(GetBucketObjectContentRetention defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.retainUntilTime = defaults.retainUntilTime;
        }

        @CustomType.Setter
        public Builder mode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        @CustomType.Setter
        public Builder retainUntilTime(String retainUntilTime) {
            this.retainUntilTime = Objects.requireNonNull(retainUntilTime);
            return this;
        }
        public GetBucketObjectContentRetention build() {
            final var o = new GetBucketObjectContentRetention();
            o.mode = mode;
            o.retainUntilTime = retainUntilTime;
            return o;
        }
    }
}
