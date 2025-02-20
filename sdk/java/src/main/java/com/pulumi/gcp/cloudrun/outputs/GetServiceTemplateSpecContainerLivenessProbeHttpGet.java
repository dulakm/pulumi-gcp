// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerLivenessProbeHttpGetHttpHeader;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecContainerLivenessProbeHttpGet {
    private List<GetServiceTemplateSpecContainerLivenessProbeHttpGetHttpHeader> httpHeaders;
    private String path;
    private Integer port;

    private GetServiceTemplateSpecContainerLivenessProbeHttpGet() {}
    public List<GetServiceTemplateSpecContainerLivenessProbeHttpGetHttpHeader> httpHeaders() {
        return this.httpHeaders;
    }
    public String path() {
        return this.path;
    }
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerLivenessProbeHttpGet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetServiceTemplateSpecContainerLivenessProbeHttpGetHttpHeader> httpHeaders;
        private String path;
        private Integer port;
        public Builder() {}
        public Builder(GetServiceTemplateSpecContainerLivenessProbeHttpGet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder httpHeaders(List<GetServiceTemplateSpecContainerLivenessProbeHttpGetHttpHeader> httpHeaders) {
            this.httpHeaders = Objects.requireNonNull(httpHeaders);
            return this;
        }
        public Builder httpHeaders(GetServiceTemplateSpecContainerLivenessProbeHttpGetHttpHeader... httpHeaders) {
            return httpHeaders(List.of(httpHeaders));
        }
        @CustomType.Setter
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public GetServiceTemplateSpecContainerLivenessProbeHttpGet build() {
            final var o = new GetServiceTemplateSpecContainerLivenessProbeHttpGet();
            o.httpHeaders = httpHeaders;
            o.path = path;
            o.port = port;
            return o;
        }
    }
}
