// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendServiceConsistentHashHttpCooky;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendServiceConsistentHash {
    private List<GetBackendServiceConsistentHashHttpCooky> httpCookies;
    private String httpHeaderName;
    private Integer minimumRingSize;

    private GetBackendServiceConsistentHash() {}
    public List<GetBackendServiceConsistentHashHttpCooky> httpCookies() {
        return this.httpCookies;
    }
    public String httpHeaderName() {
        return this.httpHeaderName;
    }
    public Integer minimumRingSize() {
        return this.minimumRingSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceConsistentHash defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetBackendServiceConsistentHashHttpCooky> httpCookies;
        private String httpHeaderName;
        private Integer minimumRingSize;
        public Builder() {}
        public Builder(GetBackendServiceConsistentHash defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpCookies = defaults.httpCookies;
    	      this.httpHeaderName = defaults.httpHeaderName;
    	      this.minimumRingSize = defaults.minimumRingSize;
        }

        @CustomType.Setter
        public Builder httpCookies(List<GetBackendServiceConsistentHashHttpCooky> httpCookies) {
            this.httpCookies = Objects.requireNonNull(httpCookies);
            return this;
        }
        public Builder httpCookies(GetBackendServiceConsistentHashHttpCooky... httpCookies) {
            return httpCookies(List.of(httpCookies));
        }
        @CustomType.Setter
        public Builder httpHeaderName(String httpHeaderName) {
            this.httpHeaderName = Objects.requireNonNull(httpHeaderName);
            return this;
        }
        @CustomType.Setter
        public Builder minimumRingSize(Integer minimumRingSize) {
            this.minimumRingSize = Objects.requireNonNull(minimumRingSize);
            return this;
        }
        public GetBackendServiceConsistentHash build() {
            final var o = new GetBackendServiceConsistentHash();
            o.httpCookies = httpCookies;
            o.httpHeaderName = httpHeaderName;
            o.minimumRingSize = minimumRingSize;
            return o;
        }
    }
}
