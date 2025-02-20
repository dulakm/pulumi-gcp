// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.alloydb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterSecondaryConfig {
    /**
     * @return Name of the primary cluster must be in the format
     * &#39;projects/{project}/locations/{location}/clusters/{cluster_id}&#39;
     * 
     */
    private String primaryClusterName;

    private ClusterSecondaryConfig() {}
    /**
     * @return Name of the primary cluster must be in the format
     * &#39;projects/{project}/locations/{location}/clusters/{cluster_id}&#39;
     * 
     */
    public String primaryClusterName() {
        return this.primaryClusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterSecondaryConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String primaryClusterName;
        public Builder() {}
        public Builder(ClusterSecondaryConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryClusterName = defaults.primaryClusterName;
        }

        @CustomType.Setter
        public Builder primaryClusterName(String primaryClusterName) {
            this.primaryClusterName = Objects.requireNonNull(primaryClusterName);
            return this;
        }
        public ClusterSecondaryConfig build() {
            final var o = new ClusterSecondaryConfig();
            o.primaryClusterName = primaryClusterName;
            return o;
        }
    }
}
