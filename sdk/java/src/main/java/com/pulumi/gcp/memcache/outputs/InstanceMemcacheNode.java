// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.memcache.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceMemcacheNode {
    /**
     * @return (Output)
     * Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
     */
    private @Nullable String host;
    /**
     * @return (Output)
     * Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
     */
    private @Nullable String nodeId;
    /**
     * @return (Output)
     * The port number of the Memcached server on this node.
     * 
     */
    private @Nullable Integer port;
    /**
     * @return (Output)
     * Current state of the Memcached node.
     * 
     */
    private @Nullable String state;
    /**
     * @return (Output)
     * Location (GCP Zone) for the Memcached node.
     * 
     */
    private @Nullable String zone;

    private InstanceMemcacheNode() {}
    /**
     * @return (Output)
     * Hostname or IP address of the Memcached node used by the clients to connect to the Memcached server on this node.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return (Output)
     * Identifier of the Memcached node. The node id does not include project or location like the Memcached instance name.
     * 
     */
    public Optional<String> nodeId() {
        return Optional.ofNullable(this.nodeId);
    }
    /**
     * @return (Output)
     * The port number of the Memcached server on this node.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }
    /**
     * @return (Output)
     * Current state of the Memcached node.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * @return (Output)
     * Location (GCP Zone) for the Memcached node.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceMemcacheNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String host;
        private @Nullable String nodeId;
        private @Nullable Integer port;
        private @Nullable String state;
        private @Nullable String zone;
        public Builder() {}
        public Builder(InstanceMemcacheNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.nodeId = defaults.nodeId;
    	      this.port = defaults.port;
    	      this.state = defaults.state;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        @CustomType.Setter
        public Builder nodeId(@Nullable String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        @CustomType.Setter
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        @CustomType.Setter
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public InstanceMemcacheNode build() {
            final var o = new InstanceMemcacheNode();
            o.host = host;
            o.nodeId = nodeId;
            o.port = port;
            o.state = state;
            o.zone = zone;
            return o;
        }
    }
}
