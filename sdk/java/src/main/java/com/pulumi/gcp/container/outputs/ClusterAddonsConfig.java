// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigCloudrunConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigConfigConnectorConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigDnsCacheConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigGcePersistentDiskCsiDriverConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigGcpFilestoreCsiDriverConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigGcsFuseCsiDriverConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigGkeBackupAgentConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigHorizontalPodAutoscaling;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigHttpLoadBalancing;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigIstioConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigKalmConfig;
import com.pulumi.gcp.container.outputs.ClusterAddonsConfigNetworkPolicyConfig;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ClusterAddonsConfig {
    /**
     * @return . Structure is documented below.
     * 
     */
    private @Nullable ClusterAddonsConfigCloudrunConfig cloudrunConfig;
    /**
     * @return .
     * The status of the ConfigConnector addon. It is disabled by default; Set `enabled = true` to enable.
     * 
     * This example `addons_config` disables two addons:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * &lt;a name=&#34;nested_binary_authorization&#34;&gt;&lt;/a&gt;The `binary_authorization` block supports:
     * 
     */
    private @Nullable ClusterAddonsConfigConfigConnectorConfig configConnectorConfig;
    /**
     * @return .
     * The status of the NodeLocal DNSCache addon. It is disabled by default.
     * Set `enabled = true` to enable.
     * 
     * **Enabling/Disabling NodeLocal DNSCache in an existing cluster is a disruptive operation.
     * All cluster nodes running GKE 1.15 and higher are recreated.**
     * 
     */
    private @Nullable ClusterAddonsConfigDnsCacheConfig dnsCacheConfig;
    /**
     * @return .
     * Whether this cluster should enable the Google Compute Engine Persistent Disk Container Storage Interface (CSI) Driver. Set `enabled = true` to enable.
     * 
     * **Note:** The Compute Engine persistent disk CSI Driver is enabled by default on newly created clusters for the following versions: Linux clusters: GKE version 1.18.10-gke.2100 or later, or 1.19.3-gke.2100 or later.
     * 
     */
    private @Nullable ClusterAddonsConfigGcePersistentDiskCsiDriverConfig gcePersistentDiskCsiDriverConfig;
    /**
     * @return The status of the Filestore CSI driver addon,
     * which allows the usage of filestore instance as volumes.
     * It is disabled by default; set `enabled = true` to enable.
     * 
     */
    private @Nullable ClusterAddonsConfigGcpFilestoreCsiDriverConfig gcpFilestoreCsiDriverConfig;
    /**
     * @return The status of the GCSFuse CSI driver addon,
     * which allows the usage of a gcs bucket as volumes.
     * It is disabled by default for Standard clusters; set `enabled = true` to enable.
     * It is enabled by default for Autopilot clusters with version 1.24 or later; set `enabled = true` to enable it explicitly.
     * See [Enable the Cloud Storage FUSE CSI driver](https://cloud.google.com/kubernetes-engine/docs/how-to/persistent-volumes/cloud-storage-fuse-csi-driver#enable) for more information.
     * 
     */
    private @Nullable ClusterAddonsConfigGcsFuseCsiDriverConfig gcsFuseCsiDriverConfig;
    /**
     * @return .
     * The status of the Backup for GKE agent addon. It is disabled by default; Set `enabled = true` to enable.
     * 
     */
    private @Nullable ClusterAddonsConfigGkeBackupAgentConfig gkeBackupAgentConfig;
    /**
     * @return The status of the Horizontal Pod Autoscaling
     * addon, which increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * It is enabled by default;
     * set `disabled = true` to disable.
     * 
     */
    private @Nullable ClusterAddonsConfigHorizontalPodAutoscaling horizontalPodAutoscaling;
    /**
     * @return The status of the HTTP (L7) load balancing
     * controller addon, which makes it easy to set up HTTP load balancers for services in a
     * cluster. It is enabled by default; set `disabled = true` to disable.
     * 
     */
    private @Nullable ClusterAddonsConfigHttpLoadBalancing httpLoadBalancing;
    /**
     * @return .
     * Structure is documented below.
     * 
     */
    private @Nullable ClusterAddonsConfigIstioConfig istioConfig;
    /**
     * @return .
     * Configuration for the KALM addon, which manages the lifecycle of k8s. It is disabled by default; Set `enabled = true` to enable.
     * 
     */
    private @Nullable ClusterAddonsConfigKalmConfig kalmConfig;
    /**
     * @return Whether we should enable the network policy addon
     * for the master.  This must be enabled in order to enable network policy for the nodes.
     * To enable this, you must also define a `network_policy` block,
     * otherwise nothing will happen.
     * It can only be disabled if the nodes already do not have network policies enabled.
     * Defaults to disabled; set `disabled = false` to enable.
     * 
     */
    private @Nullable ClusterAddonsConfigNetworkPolicyConfig networkPolicyConfig;

    private ClusterAddonsConfig() {}
    /**
     * @return . Structure is documented below.
     * 
     */
    public Optional<ClusterAddonsConfigCloudrunConfig> cloudrunConfig() {
        return Optional.ofNullable(this.cloudrunConfig);
    }
    /**
     * @return .
     * The status of the ConfigConnector addon. It is disabled by default; Set `enabled = true` to enable.
     * 
     * This example `addons_config` disables two addons:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * &lt;a name=&#34;nested_binary_authorization&#34;&gt;&lt;/a&gt;The `binary_authorization` block supports:
     * 
     */
    public Optional<ClusterAddonsConfigConfigConnectorConfig> configConnectorConfig() {
        return Optional.ofNullable(this.configConnectorConfig);
    }
    /**
     * @return .
     * The status of the NodeLocal DNSCache addon. It is disabled by default.
     * Set `enabled = true` to enable.
     * 
     * **Enabling/Disabling NodeLocal DNSCache in an existing cluster is a disruptive operation.
     * All cluster nodes running GKE 1.15 and higher are recreated.**
     * 
     */
    public Optional<ClusterAddonsConfigDnsCacheConfig> dnsCacheConfig() {
        return Optional.ofNullable(this.dnsCacheConfig);
    }
    /**
     * @return .
     * Whether this cluster should enable the Google Compute Engine Persistent Disk Container Storage Interface (CSI) Driver. Set `enabled = true` to enable.
     * 
     * **Note:** The Compute Engine persistent disk CSI Driver is enabled by default on newly created clusters for the following versions: Linux clusters: GKE version 1.18.10-gke.2100 or later, or 1.19.3-gke.2100 or later.
     * 
     */
    public Optional<ClusterAddonsConfigGcePersistentDiskCsiDriverConfig> gcePersistentDiskCsiDriverConfig() {
        return Optional.ofNullable(this.gcePersistentDiskCsiDriverConfig);
    }
    /**
     * @return The status of the Filestore CSI driver addon,
     * which allows the usage of filestore instance as volumes.
     * It is disabled by default; set `enabled = true` to enable.
     * 
     */
    public Optional<ClusterAddonsConfigGcpFilestoreCsiDriverConfig> gcpFilestoreCsiDriverConfig() {
        return Optional.ofNullable(this.gcpFilestoreCsiDriverConfig);
    }
    /**
     * @return The status of the GCSFuse CSI driver addon,
     * which allows the usage of a gcs bucket as volumes.
     * It is disabled by default for Standard clusters; set `enabled = true` to enable.
     * It is enabled by default for Autopilot clusters with version 1.24 or later; set `enabled = true` to enable it explicitly.
     * See [Enable the Cloud Storage FUSE CSI driver](https://cloud.google.com/kubernetes-engine/docs/how-to/persistent-volumes/cloud-storage-fuse-csi-driver#enable) for more information.
     * 
     */
    public Optional<ClusterAddonsConfigGcsFuseCsiDriverConfig> gcsFuseCsiDriverConfig() {
        return Optional.ofNullable(this.gcsFuseCsiDriverConfig);
    }
    /**
     * @return .
     * The status of the Backup for GKE agent addon. It is disabled by default; Set `enabled = true` to enable.
     * 
     */
    public Optional<ClusterAddonsConfigGkeBackupAgentConfig> gkeBackupAgentConfig() {
        return Optional.ofNullable(this.gkeBackupAgentConfig);
    }
    /**
     * @return The status of the Horizontal Pod Autoscaling
     * addon, which increases or decreases the number of replica pods a replication controller
     * has based on the resource usage of the existing pods.
     * It is enabled by default;
     * set `disabled = true` to disable.
     * 
     */
    public Optional<ClusterAddonsConfigHorizontalPodAutoscaling> horizontalPodAutoscaling() {
        return Optional.ofNullable(this.horizontalPodAutoscaling);
    }
    /**
     * @return The status of the HTTP (L7) load balancing
     * controller addon, which makes it easy to set up HTTP load balancers for services in a
     * cluster. It is enabled by default; set `disabled = true` to disable.
     * 
     */
    public Optional<ClusterAddonsConfigHttpLoadBalancing> httpLoadBalancing() {
        return Optional.ofNullable(this.httpLoadBalancing);
    }
    /**
     * @return .
     * Structure is documented below.
     * 
     */
    public Optional<ClusterAddonsConfigIstioConfig> istioConfig() {
        return Optional.ofNullable(this.istioConfig);
    }
    /**
     * @return .
     * Configuration for the KALM addon, which manages the lifecycle of k8s. It is disabled by default; Set `enabled = true` to enable.
     * 
     */
    public Optional<ClusterAddonsConfigKalmConfig> kalmConfig() {
        return Optional.ofNullable(this.kalmConfig);
    }
    /**
     * @return Whether we should enable the network policy addon
     * for the master.  This must be enabled in order to enable network policy for the nodes.
     * To enable this, you must also define a `network_policy` block,
     * otherwise nothing will happen.
     * It can only be disabled if the nodes already do not have network policies enabled.
     * Defaults to disabled; set `disabled = false` to enable.
     * 
     */
    public Optional<ClusterAddonsConfigNetworkPolicyConfig> networkPolicyConfig() {
        return Optional.ofNullable(this.networkPolicyConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAddonsConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable ClusterAddonsConfigCloudrunConfig cloudrunConfig;
        private @Nullable ClusterAddonsConfigConfigConnectorConfig configConnectorConfig;
        private @Nullable ClusterAddonsConfigDnsCacheConfig dnsCacheConfig;
        private @Nullable ClusterAddonsConfigGcePersistentDiskCsiDriverConfig gcePersistentDiskCsiDriverConfig;
        private @Nullable ClusterAddonsConfigGcpFilestoreCsiDriverConfig gcpFilestoreCsiDriverConfig;
        private @Nullable ClusterAddonsConfigGcsFuseCsiDriverConfig gcsFuseCsiDriverConfig;
        private @Nullable ClusterAddonsConfigGkeBackupAgentConfig gkeBackupAgentConfig;
        private @Nullable ClusterAddonsConfigHorizontalPodAutoscaling horizontalPodAutoscaling;
        private @Nullable ClusterAddonsConfigHttpLoadBalancing httpLoadBalancing;
        private @Nullable ClusterAddonsConfigIstioConfig istioConfig;
        private @Nullable ClusterAddonsConfigKalmConfig kalmConfig;
        private @Nullable ClusterAddonsConfigNetworkPolicyConfig networkPolicyConfig;
        public Builder() {}
        public Builder(ClusterAddonsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudrunConfig = defaults.cloudrunConfig;
    	      this.configConnectorConfig = defaults.configConnectorConfig;
    	      this.dnsCacheConfig = defaults.dnsCacheConfig;
    	      this.gcePersistentDiskCsiDriverConfig = defaults.gcePersistentDiskCsiDriverConfig;
    	      this.gcpFilestoreCsiDriverConfig = defaults.gcpFilestoreCsiDriverConfig;
    	      this.gcsFuseCsiDriverConfig = defaults.gcsFuseCsiDriverConfig;
    	      this.gkeBackupAgentConfig = defaults.gkeBackupAgentConfig;
    	      this.horizontalPodAutoscaling = defaults.horizontalPodAutoscaling;
    	      this.httpLoadBalancing = defaults.httpLoadBalancing;
    	      this.istioConfig = defaults.istioConfig;
    	      this.kalmConfig = defaults.kalmConfig;
    	      this.networkPolicyConfig = defaults.networkPolicyConfig;
        }

        @CustomType.Setter
        public Builder cloudrunConfig(@Nullable ClusterAddonsConfigCloudrunConfig cloudrunConfig) {
            this.cloudrunConfig = cloudrunConfig;
            return this;
        }
        @CustomType.Setter
        public Builder configConnectorConfig(@Nullable ClusterAddonsConfigConfigConnectorConfig configConnectorConfig) {
            this.configConnectorConfig = configConnectorConfig;
            return this;
        }
        @CustomType.Setter
        public Builder dnsCacheConfig(@Nullable ClusterAddonsConfigDnsCacheConfig dnsCacheConfig) {
            this.dnsCacheConfig = dnsCacheConfig;
            return this;
        }
        @CustomType.Setter
        public Builder gcePersistentDiskCsiDriverConfig(@Nullable ClusterAddonsConfigGcePersistentDiskCsiDriverConfig gcePersistentDiskCsiDriverConfig) {
            this.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
            return this;
        }
        @CustomType.Setter
        public Builder gcpFilestoreCsiDriverConfig(@Nullable ClusterAddonsConfigGcpFilestoreCsiDriverConfig gcpFilestoreCsiDriverConfig) {
            this.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
            return this;
        }
        @CustomType.Setter
        public Builder gcsFuseCsiDriverConfig(@Nullable ClusterAddonsConfigGcsFuseCsiDriverConfig gcsFuseCsiDriverConfig) {
            this.gcsFuseCsiDriverConfig = gcsFuseCsiDriverConfig;
            return this;
        }
        @CustomType.Setter
        public Builder gkeBackupAgentConfig(@Nullable ClusterAddonsConfigGkeBackupAgentConfig gkeBackupAgentConfig) {
            this.gkeBackupAgentConfig = gkeBackupAgentConfig;
            return this;
        }
        @CustomType.Setter
        public Builder horizontalPodAutoscaling(@Nullable ClusterAddonsConfigHorizontalPodAutoscaling horizontalPodAutoscaling) {
            this.horizontalPodAutoscaling = horizontalPodAutoscaling;
            return this;
        }
        @CustomType.Setter
        public Builder httpLoadBalancing(@Nullable ClusterAddonsConfigHttpLoadBalancing httpLoadBalancing) {
            this.httpLoadBalancing = httpLoadBalancing;
            return this;
        }
        @CustomType.Setter
        public Builder istioConfig(@Nullable ClusterAddonsConfigIstioConfig istioConfig) {
            this.istioConfig = istioConfig;
            return this;
        }
        @CustomType.Setter
        public Builder kalmConfig(@Nullable ClusterAddonsConfigKalmConfig kalmConfig) {
            this.kalmConfig = kalmConfig;
            return this;
        }
        @CustomType.Setter
        public Builder networkPolicyConfig(@Nullable ClusterAddonsConfigNetworkPolicyConfig networkPolicyConfig) {
            this.networkPolicyConfig = networkPolicyConfig;
            return this;
        }
        public ClusterAddonsConfig build() {
            final var o = new ClusterAddonsConfig();
            o.cloudrunConfig = cloudrunConfig;
            o.configConnectorConfig = configConnectorConfig;
            o.dnsCacheConfig = dnsCacheConfig;
            o.gcePersistentDiskCsiDriverConfig = gcePersistentDiskCsiDriverConfig;
            o.gcpFilestoreCsiDriverConfig = gcpFilestoreCsiDriverConfig;
            o.gcsFuseCsiDriverConfig = gcsFuseCsiDriverConfig;
            o.gkeBackupAgentConfig = gkeBackupAgentConfig;
            o.horizontalPodAutoscaling = horizontalPodAutoscaling;
            o.httpLoadBalancing = httpLoadBalancing;
            o.istioConfig = istioConfig;
            o.kalmConfig = kalmConfig;
            o.networkPolicyConfig = networkPolicyConfig;
            return o;
        }
    }
}
