// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs extends com.pulumi.resources.ResourceArgs {

    public static final CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs Empty = new CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs();

    /**
     * The algorithm used.
     * Possible values are: `ECDSA_P256`, `ECDSA_P384`, `EDDSA_25519`.
     * 
     */
    @Import(name="signatureAlgorithm", required=true)
    private Output<String> signatureAlgorithm;

    /**
     * @return The algorithm used.
     * Possible values are: `ECDSA_P256`, `ECDSA_P384`, `EDDSA_25519`.
     * 
     */
    public Output<String> signatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    private CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs() {}

    private CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs(CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs $) {
        this.signatureAlgorithm = $.signatureAlgorithm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs $;

        public Builder() {
            $ = new CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs();
        }

        public Builder(CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs defaults) {
            $ = new CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param signatureAlgorithm The algorithm used.
         * Possible values are: `ECDSA_P256`, `ECDSA_P384`, `EDDSA_25519`.
         * 
         * @return builder
         * 
         */
        public Builder signatureAlgorithm(Output<String> signatureAlgorithm) {
            $.signatureAlgorithm = signatureAlgorithm;
            return this;
        }

        /**
         * @param signatureAlgorithm The algorithm used.
         * Possible values are: `ECDSA_P256`, `ECDSA_P384`, `EDDSA_25519`.
         * 
         * @return builder
         * 
         */
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            return signatureAlgorithm(Output.of(signatureAlgorithm));
        }

        public CaPoolIssuancePolicyAllowedKeyTypeEllipticCurveArgs build() {
            $.signatureAlgorithm = Objects.requireNonNull($.signatureAlgorithm, "expected parameter 'signatureAlgorithm' to be non-null");
            return $;
        }
    }

}
