// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ClusterClusterConfigDataprocMetricConfigMetric {
    /**
     * @return One or more [available OSS metrics] (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for the metric course.
     * 
     * ***
     * 
     */
    private @Nullable List<String> metricOverrides;
    /**
     * @return A source for the collection of Dataproc OSS metrics (see [available OSS metrics](https://cloud.google.com//dataproc/docs/guides/monitoring#available_oss_metrics)).
     * 
     */
    private String metricSource;

    private ClusterClusterConfigDataprocMetricConfigMetric() {}
    /**
     * @return One or more [available OSS metrics] (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for the metric course.
     * 
     * ***
     * 
     */
    public List<String> metricOverrides() {
        return this.metricOverrides == null ? List.of() : this.metricOverrides;
    }
    /**
     * @return A source for the collection of Dataproc OSS metrics (see [available OSS metrics](https://cloud.google.com//dataproc/docs/guides/monitoring#available_oss_metrics)).
     * 
     */
    public String metricSource() {
        return this.metricSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigDataprocMetricConfigMetric defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> metricOverrides;
        private String metricSource;
        public Builder() {}
        public Builder(ClusterClusterConfigDataprocMetricConfigMetric defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metricOverrides = defaults.metricOverrides;
    	      this.metricSource = defaults.metricSource;
        }

        @CustomType.Setter
        public Builder metricOverrides(@Nullable List<String> metricOverrides) {
            this.metricOverrides = metricOverrides;
            return this;
        }
        public Builder metricOverrides(String... metricOverrides) {
            return metricOverrides(List.of(metricOverrides));
        }
        @CustomType.Setter
        public Builder metricSource(String metricSource) {
            this.metricSource = Objects.requireNonNull(metricSource);
            return this;
        }
        public ClusterClusterConfigDataprocMetricConfigMetric build() {
            final var o = new ClusterClusterConfigDataprocMetricConfigMetric();
            o.metricOverrides = metricOverrides;
            o.metricSource = metricSource;
            return o;
        }
    }
}
