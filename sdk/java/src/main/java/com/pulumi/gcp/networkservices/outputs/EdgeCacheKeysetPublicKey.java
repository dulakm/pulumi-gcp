// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.networkservices.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeCacheKeysetPublicKey {
    /**
     * @return The ID of the public key. The ID must be 1-63 characters long, and comply with RFC1035.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]*
     * which means the first character must be a letter, and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    private String id;
    /**
     * @return Set to true to have the CDN automatically manage this public key value.
     * 
     */
    private @Nullable Boolean managed;
    /**
     * @return The base64-encoded value of the Ed25519 public key. The base64 encoding can be padded (44 bytes) or unpadded (43 bytes).
     * Representations or encodings of the public key other than this will be rejected with an error.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    private @Nullable String value;

    private EdgeCacheKeysetPublicKey() {}
    /**
     * @return The ID of the public key. The ID must be 1-63 characters long, and comply with RFC1035.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]*
     * which means the first character must be a letter, and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Set to true to have the CDN automatically manage this public key value.
     * 
     */
    public Optional<Boolean> managed() {
        return Optional.ofNullable(this.managed);
    }
    /**
     * @return The base64-encoded value of the Ed25519 public key. The base64 encoding can be padded (44 bytes) or unpadded (43 bytes).
     * Representations or encodings of the public key other than this will be rejected with an error.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheKeysetPublicKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable Boolean managed;
        private @Nullable String value;
        public Builder() {}
        public Builder(EdgeCacheKeysetPublicKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.managed = defaults.managed;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder managed(@Nullable Boolean managed) {
            this.managed = managed;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }
        public EdgeCacheKeysetPublicKey build() {
            final var o = new EdgeCacheKeysetPublicKey();
            o.id = id;
            o.managed = managed;
            o.value = value;
            return o;
        }
    }
}
