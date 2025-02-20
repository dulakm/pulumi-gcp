// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.GetBackendServiceCircuitBreakerConnectTimeout;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetBackendServiceCircuitBreaker {
    private List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts;
    private Integer maxConnections;
    private Integer maxPendingRequests;
    private Integer maxRequests;
    private Integer maxRequestsPerConnection;
    private Integer maxRetries;

    private GetBackendServiceCircuitBreaker() {}
    public List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts() {
        return this.connectTimeouts;
    }
    public Integer maxConnections() {
        return this.maxConnections;
    }
    public Integer maxPendingRequests() {
        return this.maxPendingRequests;
    }
    public Integer maxRequests() {
        return this.maxRequests;
    }
    public Integer maxRequestsPerConnection() {
        return this.maxRequestsPerConnection;
    }
    public Integer maxRetries() {
        return this.maxRetries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceCircuitBreaker defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts;
        private Integer maxConnections;
        private Integer maxPendingRequests;
        private Integer maxRequests;
        private Integer maxRequestsPerConnection;
        private Integer maxRetries;
        public Builder() {}
        public Builder(GetBackendServiceCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeouts = defaults.connectTimeouts;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        @CustomType.Setter
        public Builder connectTimeouts(List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts) {
            this.connectTimeouts = Objects.requireNonNull(connectTimeouts);
            return this;
        }
        public Builder connectTimeouts(GetBackendServiceCircuitBreakerConnectTimeout... connectTimeouts) {
            return connectTimeouts(List.of(connectTimeouts));
        }
        @CustomType.Setter
        public Builder maxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }
        @CustomType.Setter
        public Builder maxPendingRequests(Integer maxPendingRequests) {
            this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests);
            return this;
        }
        @CustomType.Setter
        public Builder maxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }
        @CustomType.Setter
        public Builder maxRequestsPerConnection(Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection);
            return this;
        }
        @CustomType.Setter
        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        public GetBackendServiceCircuitBreaker build() {
            final var o = new GetBackendServiceCircuitBreaker();
            o.connectTimeouts = connectTimeouts;
            o.maxConnections = maxConnections;
            o.maxPendingRequests = maxPendingRequests;
            o.maxRequests = maxRequests;
            o.maxRequestsPerConnection = maxRequestsPerConnection;
            o.maxRetries = maxRetries;
            return o;
        }
    }
}
