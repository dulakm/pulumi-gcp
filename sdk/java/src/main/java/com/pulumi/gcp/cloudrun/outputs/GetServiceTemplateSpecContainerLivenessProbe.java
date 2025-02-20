// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrun.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerLivenessProbeGrpc;
import com.pulumi.gcp.cloudrun.outputs.GetServiceTemplateSpecContainerLivenessProbeHttpGet;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateSpecContainerLivenessProbe {
    private Integer failureThreshold;
    private List<GetServiceTemplateSpecContainerLivenessProbeGrpc> grpcs;
    private List<GetServiceTemplateSpecContainerLivenessProbeHttpGet> httpGets;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer timeoutSeconds;

    private GetServiceTemplateSpecContainerLivenessProbe() {}
    public Integer failureThreshold() {
        return this.failureThreshold;
    }
    public List<GetServiceTemplateSpecContainerLivenessProbeGrpc> grpcs() {
        return this.grpcs;
    }
    public List<GetServiceTemplateSpecContainerLivenessProbeHttpGet> httpGets() {
        return this.httpGets;
    }
    public Integer initialDelaySeconds() {
        return this.initialDelaySeconds;
    }
    public Integer periodSeconds() {
        return this.periodSeconds;
    }
    public Integer timeoutSeconds() {
        return this.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainerLivenessProbe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer failureThreshold;
        private List<GetServiceTemplateSpecContainerLivenessProbeGrpc> grpcs;
        private List<GetServiceTemplateSpecContainerLivenessProbeHttpGet> httpGets;
        private Integer initialDelaySeconds;
        private Integer periodSeconds;
        private Integer timeoutSeconds;
        public Builder() {}
        public Builder(GetServiceTemplateSpecContainerLivenessProbe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.grpcs = defaults.grpcs;
    	      this.httpGets = defaults.httpGets;
    	      this.initialDelaySeconds = defaults.initialDelaySeconds;
    	      this.periodSeconds = defaults.periodSeconds;
    	      this.timeoutSeconds = defaults.timeoutSeconds;
        }

        @CustomType.Setter
        public Builder failureThreshold(Integer failureThreshold) {
            this.failureThreshold = Objects.requireNonNull(failureThreshold);
            return this;
        }
        @CustomType.Setter
        public Builder grpcs(List<GetServiceTemplateSpecContainerLivenessProbeGrpc> grpcs) {
            this.grpcs = Objects.requireNonNull(grpcs);
            return this;
        }
        public Builder grpcs(GetServiceTemplateSpecContainerLivenessProbeGrpc... grpcs) {
            return grpcs(List.of(grpcs));
        }
        @CustomType.Setter
        public Builder httpGets(List<GetServiceTemplateSpecContainerLivenessProbeHttpGet> httpGets) {
            this.httpGets = Objects.requireNonNull(httpGets);
            return this;
        }
        public Builder httpGets(GetServiceTemplateSpecContainerLivenessProbeHttpGet... httpGets) {
            return httpGets(List.of(httpGets));
        }
        @CustomType.Setter
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            this.initialDelaySeconds = Objects.requireNonNull(initialDelaySeconds);
            return this;
        }
        @CustomType.Setter
        public Builder periodSeconds(Integer periodSeconds) {
            this.periodSeconds = Objects.requireNonNull(periodSeconds);
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.timeoutSeconds = Objects.requireNonNull(timeoutSeconds);
            return this;
        }
        public GetServiceTemplateSpecContainerLivenessProbe build() {
            final var o = new GetServiceTemplateSpecContainerLivenessProbe();
            o.failureThreshold = failureThreshold;
            o.grpcs = grpcs;
            o.httpGets = httpGets;
            o.initialDelaySeconds = initialDelaySeconds;
            o.periodSeconds = periodSeconds;
            o.timeoutSeconds = timeoutSeconds;
            return o;
        }
    }
}
