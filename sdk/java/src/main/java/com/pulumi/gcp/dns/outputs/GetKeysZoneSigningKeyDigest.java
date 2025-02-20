// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKeysZoneSigningKeyDigest {
    /**
     * @return The base-16 encoded bytes of this digest. Suitable for use in a DS resource record.
     * 
     */
    private String digest;
    /**
     * @return Specifies the algorithm used to calculate this digest. Possible values are `sha1`, `sha256` and `sha384`
     * 
     */
    private String type;

    private GetKeysZoneSigningKeyDigest() {}
    /**
     * @return The base-16 encoded bytes of this digest. Suitable for use in a DS resource record.
     * 
     */
    public String digest() {
        return this.digest;
    }
    /**
     * @return Specifies the algorithm used to calculate this digest. Possible values are `sha1`, `sha256` and `sha384`
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeysZoneSigningKeyDigest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String digest;
        private String type;
        public Builder() {}
        public Builder(GetKeysZoneSigningKeyDigest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.digest = defaults.digest;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder digest(String digest) {
            this.digest = Objects.requireNonNull(digest);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetKeysZoneSigningKeyDigest build() {
            final var o = new GetKeysZoneSigningKeyDigest();
            o.digest = digest;
            o.type = type;
            return o;
        }
    }
}
