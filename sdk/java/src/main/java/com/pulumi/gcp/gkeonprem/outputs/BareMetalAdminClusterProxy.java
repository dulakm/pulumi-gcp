// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkeonprem.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class BareMetalAdminClusterProxy {
    /**
     * @return A list of IPs, hostnames, and domains that should skip the proxy.
     * Examples: [&#34;127.0.0.1&#34;, &#34;example.com&#34;, &#34;.corp&#34;, &#34;localhost&#34;].
     * 
     */
    private @Nullable List<String> noProxies;
    /**
     * @return Specifies the address of your proxy server.
     * Examples: http://domain
     * WARNING: Do not provide credentials in the format
     * http://(username:password@)domain these will be rejected by the server.
     * 
     */
    private String uri;

    private BareMetalAdminClusterProxy() {}
    /**
     * @return A list of IPs, hostnames, and domains that should skip the proxy.
     * Examples: [&#34;127.0.0.1&#34;, &#34;example.com&#34;, &#34;.corp&#34;, &#34;localhost&#34;].
     * 
     */
    public List<String> noProxies() {
        return this.noProxies == null ? List.of() : this.noProxies;
    }
    /**
     * @return Specifies the address of your proxy server.
     * Examples: http://domain
     * WARNING: Do not provide credentials in the format
     * http://(username:password@)domain these will be rejected by the server.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BareMetalAdminClusterProxy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> noProxies;
        private String uri;
        public Builder() {}
        public Builder(BareMetalAdminClusterProxy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.noProxies = defaults.noProxies;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder noProxies(@Nullable List<String> noProxies) {
            this.noProxies = noProxies;
            return this;
        }
        public Builder noProxies(String... noProxies) {
            return noProxies(List.of(noProxies));
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public BareMetalAdminClusterProxy build() {
            final var o = new BareMetalAdminClusterProxy();
            o.noProxies = noProxies;
            o.uri = uri;
            return o;
        }
    }
}
