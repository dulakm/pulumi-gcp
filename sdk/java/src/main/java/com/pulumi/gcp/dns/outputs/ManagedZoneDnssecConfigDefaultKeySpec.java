// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedZoneDnssecConfigDefaultKeySpec {
    /**
     * @return String mnemonic specifying the DNSSEC algorithm of this key
     * Possible values are: `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, `rsasha512`.
     * 
     */
    private @Nullable String algorithm;
    /**
     * @return Length of the keys in bits
     * 
     */
    private @Nullable Integer keyLength;
    /**
     * @return Specifies whether this is a key signing key (KSK) or a zone
     * signing key (ZSK). Key signing keys have the Secure Entry
     * Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do
     * not have the Secure Entry Point flag set and will be used
     * to sign all other types of resource record sets.
     * Possible values are: `keySigning`, `zoneSigning`.
     * 
     */
    private @Nullable String keyType;
    /**
     * @return Identifies what kind of resource this is
     * 
     */
    private @Nullable String kind;

    private ManagedZoneDnssecConfigDefaultKeySpec() {}
    /**
     * @return String mnemonic specifying the DNSSEC algorithm of this key
     * Possible values are: `ecdsap256sha256`, `ecdsap384sha384`, `rsasha1`, `rsasha256`, `rsasha512`.
     * 
     */
    public Optional<String> algorithm() {
        return Optional.ofNullable(this.algorithm);
    }
    /**
     * @return Length of the keys in bits
     * 
     */
    public Optional<Integer> keyLength() {
        return Optional.ofNullable(this.keyLength);
    }
    /**
     * @return Specifies whether this is a key signing key (KSK) or a zone
     * signing key (ZSK). Key signing keys have the Secure Entry
     * Point flag set and, when active, will only be used to sign
     * resource record sets of type DNSKEY. Zone signing keys do
     * not have the Secure Entry Point flag set and will be used
     * to sign all other types of resource record sets.
     * Possible values are: `keySigning`, `zoneSigning`.
     * 
     */
    public Optional<String> keyType() {
        return Optional.ofNullable(this.keyType);
    }
    /**
     * @return Identifies what kind of resource this is
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneDnssecConfigDefaultKeySpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String algorithm;
        private @Nullable Integer keyLength;
        private @Nullable String keyType;
        private @Nullable String kind;
        public Builder() {}
        public Builder(ManagedZoneDnssecConfigDefaultKeySpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.keyLength = defaults.keyLength;
    	      this.keyType = defaults.keyType;
    	      this.kind = defaults.kind;
        }

        @CustomType.Setter
        public Builder algorithm(@Nullable String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        @CustomType.Setter
        public Builder keyLength(@Nullable Integer keyLength) {
            this.keyLength = keyLength;
            return this;
        }
        @CustomType.Setter
        public Builder keyType(@Nullable String keyType) {
            this.keyType = keyType;
            return this;
        }
        @CustomType.Setter
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public ManagedZoneDnssecConfigDefaultKeySpec build() {
            final var o = new ManagedZoneDnssecConfigDefaultKeySpec();
            o.algorithm = algorithm;
            o.keyLength = keyLength;
            o.keyType = keyType;
            o.kind = kind;
            return o;
        }
    }
}
