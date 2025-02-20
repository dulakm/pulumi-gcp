// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendServiceConsistentHashHttpCookyTtl;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendServiceConsistentHashHttpCooky {
    /**
     * @return The name of the Backend Service.
     * 
     * ***
     * 
     */
    private String name;
    private String path;
    private List<GetBackendServiceConsistentHashHttpCookyTtl> ttls;

    private GetBackendServiceConsistentHashHttpCooky() {}
    /**
     * @return The name of the Backend Service.
     * 
     * ***
     * 
     */
    public String name() {
        return this.name;
    }
    public String path() {
        return this.path;
    }
    public List<GetBackendServiceConsistentHashHttpCookyTtl> ttls() {
        return this.ttls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceConsistentHashHttpCooky defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String path;
        private List<GetBackendServiceConsistentHashHttpCookyTtl> ttls;
        public Builder() {}
        public Builder(GetBackendServiceConsistentHashHttpCooky defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttls = defaults.ttls;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder ttls(List<GetBackendServiceConsistentHashHttpCookyTtl> ttls) {
            this.ttls = Objects.requireNonNull(ttls);
            return this;
        }
        public Builder ttls(GetBackendServiceConsistentHashHttpCookyTtl... ttls) {
            return ttls(List.of(ttls));
        }
        public GetBackendServiceConsistentHashHttpCooky build() {
            final var o = new GetBackendServiceConsistentHashHttpCooky();
            o.name = name;
            o.path = path;
            o.ttls = ttls;
            return o;
        }
    }
}
