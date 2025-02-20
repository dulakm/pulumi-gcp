// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendServiceBackend;
import com.pulumi.gcp.compute.outputs.GetBackendServiceCdnPolicy;
import com.pulumi.gcp.compute.outputs.GetBackendServiceCircuitBreaker;
import com.pulumi.gcp.compute.outputs.GetBackendServiceConsistentHash;
import com.pulumi.gcp.compute.outputs.GetBackendServiceIap;
import com.pulumi.gcp.compute.outputs.GetBackendServiceLocalityLbPolicy;
import com.pulumi.gcp.compute.outputs.GetBackendServiceLogConfig;
import com.pulumi.gcp.compute.outputs.GetBackendServiceOutlierDetection;
import com.pulumi.gcp.compute.outputs.GetBackendServiceSecuritySetting;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBackendServiceResult {
    private Integer affinityCookieTtlSec;
    /**
     * @return The set of backends that serve this Backend Service.
     * 
     */
    private List<GetBackendServiceBackend> backends;
    private List<GetBackendServiceCdnPolicy> cdnPolicies;
    private List<GetBackendServiceCircuitBreaker> circuitBreakers;
    private String compressionMode;
    /**
     * @return Time for which instance will be drained (not accept new connections, but still work to finish started ones).
     * 
     */
    private Integer connectionDrainingTimeoutSec;
    private List<GetBackendServiceConsistentHash> consistentHash;
    private String creationTimestamp;
    private List<String> customRequestHeaders;
    private List<String> customResponseHeaders;
    /**
     * @return Textual description for the Backend Service.
     * 
     */
    private String description;
    private String edgeSecurityPolicy;
    /**
     * @return Whether or not Cloud CDN is enabled on the Backend Service.
     * 
     */
    private Boolean enableCdn;
    /**
     * @return The fingerprint of the Backend Service.
     * 
     */
    private String fingerprint;
    /**
     * @return The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    private Integer generatedId;
    /**
     * @return The set of HTTP/HTTPS health checks used by the Backend Service.
     * 
     */
    private List<String> healthChecks;
    private List<GetBackendServiceIap> iaps;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String loadBalancingScheme;
    private List<GetBackendServiceLocalityLbPolicy> localityLbPolicies;
    private String localityLbPolicy;
    private List<GetBackendServiceLogConfig> logConfigs;
    private String name;
    private List<GetBackendServiceOutlierDetection> outlierDetections;
    /**
     * @return The name of a service that has been added to an instance group in this backend.
     * 
     */
    private String portName;
    private @Nullable String project;
    /**
     * @return The protocol for incoming requests.
     * 
     */
    private String protocol;
    private String securityPolicy;
    private List<GetBackendServiceSecuritySetting> securitySettings;
    /**
     * @return The URI of the Backend Service.
     * 
     */
    private String selfLink;
    /**
     * @return The Backend Service session stickiness configuration.
     * 
     */
    private String sessionAffinity;
    /**
     * @return The number of seconds to wait for a backend to respond to a request before considering the request failed.
     * 
     */
    private Integer timeoutSec;

    private GetBackendServiceResult() {}
    public Integer affinityCookieTtlSec() {
        return this.affinityCookieTtlSec;
    }
    /**
     * @return The set of backends that serve this Backend Service.
     * 
     */
    public List<GetBackendServiceBackend> backends() {
        return this.backends;
    }
    public List<GetBackendServiceCdnPolicy> cdnPolicies() {
        return this.cdnPolicies;
    }
    public List<GetBackendServiceCircuitBreaker> circuitBreakers() {
        return this.circuitBreakers;
    }
    public String compressionMode() {
        return this.compressionMode;
    }
    /**
     * @return Time for which instance will be drained (not accept new connections, but still work to finish started ones).
     * 
     */
    public Integer connectionDrainingTimeoutSec() {
        return this.connectionDrainingTimeoutSec;
    }
    public List<GetBackendServiceConsistentHash> consistentHash() {
        return this.consistentHash;
    }
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    public List<String> customRequestHeaders() {
        return this.customRequestHeaders;
    }
    public List<String> customResponseHeaders() {
        return this.customResponseHeaders;
    }
    /**
     * @return Textual description for the Backend Service.
     * 
     */
    public String description() {
        return this.description;
    }
    public String edgeSecurityPolicy() {
        return this.edgeSecurityPolicy;
    }
    /**
     * @return Whether or not Cloud CDN is enabled on the Backend Service.
     * 
     */
    public Boolean enableCdn() {
        return this.enableCdn;
    }
    /**
     * @return The fingerprint of the Backend Service.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return The unique identifier for the resource. This identifier is defined by the server.
     * 
     */
    public Integer generatedId() {
        return this.generatedId;
    }
    /**
     * @return The set of HTTP/HTTPS health checks used by the Backend Service.
     * 
     */
    public List<String> healthChecks() {
        return this.healthChecks;
    }
    public List<GetBackendServiceIap> iaps() {
        return this.iaps;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String loadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    public List<GetBackendServiceLocalityLbPolicy> localityLbPolicies() {
        return this.localityLbPolicies;
    }
    public String localityLbPolicy() {
        return this.localityLbPolicy;
    }
    public List<GetBackendServiceLogConfig> logConfigs() {
        return this.logConfigs;
    }
    public String name() {
        return this.name;
    }
    public List<GetBackendServiceOutlierDetection> outlierDetections() {
        return this.outlierDetections;
    }
    /**
     * @return The name of a service that has been added to an instance group in this backend.
     * 
     */
    public String portName() {
        return this.portName;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    /**
     * @return The protocol for incoming requests.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    public String securityPolicy() {
        return this.securityPolicy;
    }
    public List<GetBackendServiceSecuritySetting> securitySettings() {
        return this.securitySettings;
    }
    /**
     * @return The URI of the Backend Service.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return The Backend Service session stickiness configuration.
     * 
     */
    public String sessionAffinity() {
        return this.sessionAffinity;
    }
    /**
     * @return The number of seconds to wait for a backend to respond to a request before considering the request failed.
     * 
     */
    public Integer timeoutSec() {
        return this.timeoutSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer affinityCookieTtlSec;
        private List<GetBackendServiceBackend> backends;
        private List<GetBackendServiceCdnPolicy> cdnPolicies;
        private List<GetBackendServiceCircuitBreaker> circuitBreakers;
        private String compressionMode;
        private Integer connectionDrainingTimeoutSec;
        private List<GetBackendServiceConsistentHash> consistentHash;
        private String creationTimestamp;
        private List<String> customRequestHeaders;
        private List<String> customResponseHeaders;
        private String description;
        private String edgeSecurityPolicy;
        private Boolean enableCdn;
        private String fingerprint;
        private Integer generatedId;
        private List<String> healthChecks;
        private List<GetBackendServiceIap> iaps;
        private String id;
        private String loadBalancingScheme;
        private List<GetBackendServiceLocalityLbPolicy> localityLbPolicies;
        private String localityLbPolicy;
        private List<GetBackendServiceLogConfig> logConfigs;
        private String name;
        private List<GetBackendServiceOutlierDetection> outlierDetections;
        private String portName;
        private @Nullable String project;
        private String protocol;
        private String securityPolicy;
        private List<GetBackendServiceSecuritySetting> securitySettings;
        private String selfLink;
        private String sessionAffinity;
        private Integer timeoutSec;
        public Builder() {}
        public Builder(GetBackendServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieTtlSec = defaults.affinityCookieTtlSec;
    	      this.backends = defaults.backends;
    	      this.cdnPolicies = defaults.cdnPolicies;
    	      this.circuitBreakers = defaults.circuitBreakers;
    	      this.compressionMode = defaults.compressionMode;
    	      this.connectionDrainingTimeoutSec = defaults.connectionDrainingTimeoutSec;
    	      this.consistentHash = defaults.consistentHash;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customRequestHeaders = defaults.customRequestHeaders;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.edgeSecurityPolicy = defaults.edgeSecurityPolicy;
    	      this.enableCdn = defaults.enableCdn;
    	      this.fingerprint = defaults.fingerprint;
    	      this.generatedId = defaults.generatedId;
    	      this.healthChecks = defaults.healthChecks;
    	      this.iaps = defaults.iaps;
    	      this.id = defaults.id;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.localityLbPolicies = defaults.localityLbPolicies;
    	      this.localityLbPolicy = defaults.localityLbPolicy;
    	      this.logConfigs = defaults.logConfigs;
    	      this.name = defaults.name;
    	      this.outlierDetections = defaults.outlierDetections;
    	      this.portName = defaults.portName;
    	      this.project = defaults.project;
    	      this.protocol = defaults.protocol;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.securitySettings = defaults.securitySettings;
    	      this.selfLink = defaults.selfLink;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.timeoutSec = defaults.timeoutSec;
        }

        @CustomType.Setter
        public Builder affinityCookieTtlSec(Integer affinityCookieTtlSec) {
            this.affinityCookieTtlSec = Objects.requireNonNull(affinityCookieTtlSec);
            return this;
        }
        @CustomType.Setter
        public Builder backends(List<GetBackendServiceBackend> backends) {
            this.backends = Objects.requireNonNull(backends);
            return this;
        }
        public Builder backends(GetBackendServiceBackend... backends) {
            return backends(List.of(backends));
        }
        @CustomType.Setter
        public Builder cdnPolicies(List<GetBackendServiceCdnPolicy> cdnPolicies) {
            this.cdnPolicies = Objects.requireNonNull(cdnPolicies);
            return this;
        }
        public Builder cdnPolicies(GetBackendServiceCdnPolicy... cdnPolicies) {
            return cdnPolicies(List.of(cdnPolicies));
        }
        @CustomType.Setter
        public Builder circuitBreakers(List<GetBackendServiceCircuitBreaker> circuitBreakers) {
            this.circuitBreakers = Objects.requireNonNull(circuitBreakers);
            return this;
        }
        public Builder circuitBreakers(GetBackendServiceCircuitBreaker... circuitBreakers) {
            return circuitBreakers(List.of(circuitBreakers));
        }
        @CustomType.Setter
        public Builder compressionMode(String compressionMode) {
            this.compressionMode = Objects.requireNonNull(compressionMode);
            return this;
        }
        @CustomType.Setter
        public Builder connectionDrainingTimeoutSec(Integer connectionDrainingTimeoutSec) {
            this.connectionDrainingTimeoutSec = Objects.requireNonNull(connectionDrainingTimeoutSec);
            return this;
        }
        @CustomType.Setter
        public Builder consistentHash(List<GetBackendServiceConsistentHash> consistentHash) {
            this.consistentHash = Objects.requireNonNull(consistentHash);
            return this;
        }
        public Builder consistentHash(GetBackendServiceConsistentHash... consistentHash) {
            return consistentHash(List.of(consistentHash));
        }
        @CustomType.Setter
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        @CustomType.Setter
        public Builder customRequestHeaders(List<String> customRequestHeaders) {
            this.customRequestHeaders = Objects.requireNonNull(customRequestHeaders);
            return this;
        }
        public Builder customRequestHeaders(String... customRequestHeaders) {
            return customRequestHeaders(List.of(customRequestHeaders));
        }
        @CustomType.Setter
        public Builder customResponseHeaders(List<String> customResponseHeaders) {
            this.customResponseHeaders = Objects.requireNonNull(customResponseHeaders);
            return this;
        }
        public Builder customResponseHeaders(String... customResponseHeaders) {
            return customResponseHeaders(List.of(customResponseHeaders));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder edgeSecurityPolicy(String edgeSecurityPolicy) {
            this.edgeSecurityPolicy = Objects.requireNonNull(edgeSecurityPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder enableCdn(Boolean enableCdn) {
            this.enableCdn = Objects.requireNonNull(enableCdn);
            return this;
        }
        @CustomType.Setter
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        @CustomType.Setter
        public Builder generatedId(Integer generatedId) {
            this.generatedId = Objects.requireNonNull(generatedId);
            return this;
        }
        @CustomType.Setter
        public Builder healthChecks(List<String> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }
        public Builder healthChecks(String... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        @CustomType.Setter
        public Builder iaps(List<GetBackendServiceIap> iaps) {
            this.iaps = Objects.requireNonNull(iaps);
            return this;
        }
        public Builder iaps(GetBackendServiceIap... iaps) {
            return iaps(List.of(iaps));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancingScheme(String loadBalancingScheme) {
            this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
            return this;
        }
        @CustomType.Setter
        public Builder localityLbPolicies(List<GetBackendServiceLocalityLbPolicy> localityLbPolicies) {
            this.localityLbPolicies = Objects.requireNonNull(localityLbPolicies);
            return this;
        }
        public Builder localityLbPolicies(GetBackendServiceLocalityLbPolicy... localityLbPolicies) {
            return localityLbPolicies(List.of(localityLbPolicies));
        }
        @CustomType.Setter
        public Builder localityLbPolicy(String localityLbPolicy) {
            this.localityLbPolicy = Objects.requireNonNull(localityLbPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder logConfigs(List<GetBackendServiceLogConfig> logConfigs) {
            this.logConfigs = Objects.requireNonNull(logConfigs);
            return this;
        }
        public Builder logConfigs(GetBackendServiceLogConfig... logConfigs) {
            return logConfigs(List.of(logConfigs));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder outlierDetections(List<GetBackendServiceOutlierDetection> outlierDetections) {
            this.outlierDetections = Objects.requireNonNull(outlierDetections);
            return this;
        }
        public Builder outlierDetections(GetBackendServiceOutlierDetection... outlierDetections) {
            return outlierDetections(List.of(outlierDetections));
        }
        @CustomType.Setter
        public Builder portName(String portName) {
            this.portName = Objects.requireNonNull(portName);
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder securityPolicy(String securityPolicy) {
            this.securityPolicy = Objects.requireNonNull(securityPolicy);
            return this;
        }
        @CustomType.Setter
        public Builder securitySettings(List<GetBackendServiceSecuritySetting> securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }
        public Builder securitySettings(GetBackendServiceSecuritySetting... securitySettings) {
            return securitySettings(List.of(securitySettings));
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder sessionAffinity(String sessionAffinity) {
            this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
            return this;
        }
        @CustomType.Setter
        public Builder timeoutSec(Integer timeoutSec) {
            this.timeoutSec = Objects.requireNonNull(timeoutSec);
            return this;
        }
        public GetBackendServiceResult build() {
            final var o = new GetBackendServiceResult();
            o.affinityCookieTtlSec = affinityCookieTtlSec;
            o.backends = backends;
            o.cdnPolicies = cdnPolicies;
            o.circuitBreakers = circuitBreakers;
            o.compressionMode = compressionMode;
            o.connectionDrainingTimeoutSec = connectionDrainingTimeoutSec;
            o.consistentHash = consistentHash;
            o.creationTimestamp = creationTimestamp;
            o.customRequestHeaders = customRequestHeaders;
            o.customResponseHeaders = customResponseHeaders;
            o.description = description;
            o.edgeSecurityPolicy = edgeSecurityPolicy;
            o.enableCdn = enableCdn;
            o.fingerprint = fingerprint;
            o.generatedId = generatedId;
            o.healthChecks = healthChecks;
            o.iaps = iaps;
            o.id = id;
            o.loadBalancingScheme = loadBalancingScheme;
            o.localityLbPolicies = localityLbPolicies;
            o.localityLbPolicy = localityLbPolicy;
            o.logConfigs = logConfigs;
            o.name = name;
            o.outlierDetections = outlierDetections;
            o.portName = portName;
            o.project = project;
            o.protocol = protocol;
            o.securityPolicy = securityPolicy;
            o.securitySettings = securitySettings;
            o.selfLink = selfLink;
            o.sessionAffinity = sessionAffinity;
            o.timeoutSec = timeoutSec;
            return o;
        }
    }
}
