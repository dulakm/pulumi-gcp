// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAuthorityConfigSubjectConfigSubject {
    private String commonName;
    private String countryCode;
    private String locality;
    private String organization;
    private String organizationalUnit;
    private String postalCode;
    private String province;
    private String streetAddress;

    private GetAuthorityConfigSubjectConfigSubject() {}
    public String commonName() {
        return this.commonName;
    }
    public String countryCode() {
        return this.countryCode;
    }
    public String locality() {
        return this.locality;
    }
    public String organization() {
        return this.organization;
    }
    public String organizationalUnit() {
        return this.organizationalUnit;
    }
    public String postalCode() {
        return this.postalCode;
    }
    public String province() {
        return this.province;
    }
    public String streetAddress() {
        return this.streetAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAuthorityConfigSubjectConfigSubject defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String commonName;
        private String countryCode;
        private String locality;
        private String organization;
        private String organizationalUnit;
        private String postalCode;
        private String province;
        private String streetAddress;
        public Builder() {}
        public Builder(GetAuthorityConfigSubjectConfigSubject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonName = defaults.commonName;
    	      this.countryCode = defaults.countryCode;
    	      this.locality = defaults.locality;
    	      this.organization = defaults.organization;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.postalCode = defaults.postalCode;
    	      this.province = defaults.province;
    	      this.streetAddress = defaults.streetAddress;
        }

        @CustomType.Setter
        public Builder commonName(String commonName) {
            this.commonName = Objects.requireNonNull(commonName);
            return this;
        }
        @CustomType.Setter
        public Builder countryCode(String countryCode) {
            this.countryCode = Objects.requireNonNull(countryCode);
            return this;
        }
        @CustomType.Setter
        public Builder locality(String locality) {
            this.locality = Objects.requireNonNull(locality);
            return this;
        }
        @CustomType.Setter
        public Builder organization(String organization) {
            this.organization = Objects.requireNonNull(organization);
            return this;
        }
        @CustomType.Setter
        public Builder organizationalUnit(String organizationalUnit) {
            this.organizationalUnit = Objects.requireNonNull(organizationalUnit);
            return this;
        }
        @CustomType.Setter
        public Builder postalCode(String postalCode) {
            this.postalCode = Objects.requireNonNull(postalCode);
            return this;
        }
        @CustomType.Setter
        public Builder province(String province) {
            this.province = Objects.requireNonNull(province);
            return this;
        }
        @CustomType.Setter
        public Builder streetAddress(String streetAddress) {
            this.streetAddress = Objects.requireNonNull(streetAddress);
            return this;
        }
        public GetAuthorityConfigSubjectConfigSubject build() {
            final var o = new GetAuthorityConfigSubjectConfigSubject();
            o.commonName = commonName;
            o.countryCode = countryCode;
            o.locality = locality;
            o.organization = organization;
            o.organizationalUnit = organizationalUnit;
            o.postalCode = postalCode;
            o.province = province;
            o.streetAddress = streetAddress;
            return o;
        }
    }
}
