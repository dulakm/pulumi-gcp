// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.edgecontainer.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.edgecontainer.inputs.ClusterAuthorizationArgs;
import com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneArgs;
import com.pulumi.gcp.edgecontainer.inputs.ClusterControlPlaneEncryptionArgs;
import com.pulumi.gcp.edgecontainer.inputs.ClusterFleetArgs;
import com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenanceEventArgs;
import com.pulumi.gcp.edgecontainer.inputs.ClusterMaintenancePolicyArgs;
import com.pulumi.gcp.edgecontainer.inputs.ClusterNetworkingArgs;
import com.pulumi.gcp.edgecontainer.inputs.ClusterSystemAddonsConfigArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusterState extends com.pulumi.resources.ResourceArgs {

    public static final ClusterState Empty = new ClusterState();

    /**
     * RBAC policy that will be applied and managed by GEC.
     * Structure is documented below.
     * 
     */
    @Import(name="authorization")
    private @Nullable Output<ClusterAuthorizationArgs> authorization;

    /**
     * @return RBAC policy that will be applied and managed by GEC.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterAuthorizationArgs>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * The PEM-encoded public certificate of the cluster&#39;s CA.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Import(name="clusterCaCertificate")
    private @Nullable Output<String> clusterCaCertificate;

    /**
     * @return The PEM-encoded public certificate of the cluster&#39;s CA.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Optional<Output<String>> clusterCaCertificate() {
        return Optional.ofNullable(this.clusterCaCertificate);
    }

    /**
     * The configuration of the cluster control plane.
     * Structure is documented below.
     * 
     */
    @Import(name="controlPlane")
    private @Nullable Output<ClusterControlPlaneArgs> controlPlane;

    /**
     * @return The configuration of the cluster control plane.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterControlPlaneArgs>> controlPlane() {
        return Optional.ofNullable(this.controlPlane);
    }

    /**
     * Remote control plane disk encryption options. This field is only used when
     * enabling CMEK support.
     * Structure is documented below.
     * 
     */
    @Import(name="controlPlaneEncryption")
    private @Nullable Output<ClusterControlPlaneEncryptionArgs> controlPlaneEncryption;

    /**
     * @return Remote control plane disk encryption options. This field is only used when
     * enabling CMEK support.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterControlPlaneEncryptionArgs>> controlPlaneEncryption() {
        return Optional.ofNullable(this.controlPlaneEncryption);
    }

    /**
     * The control plane release version.
     * 
     */
    @Import(name="controlPlaneVersion")
    private @Nullable Output<String> controlPlaneVersion;

    /**
     * @return The control plane release version.
     * 
     */
    public Optional<Output<String>> controlPlaneVersion() {
        return Optional.ofNullable(this.controlPlaneVersion);
    }

    /**
     * (Output)
     * The time when the maintenance event request was created.
     * 
     */
    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    /**
     * @return (Output)
     * The time when the maintenance event request was created.
     * 
     */
    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The default maximum number of pods per node used if a maximum value is not
     * specified explicitly for a node pool in this cluster. If unspecified, the
     * Kubernetes default value will be used.
     * 
     */
    @Import(name="defaultMaxPodsPerNode")
    private @Nullable Output<Integer> defaultMaxPodsPerNode;

    /**
     * @return The default maximum number of pods per node used if a maximum value is not
     * specified explicitly for a node pool in this cluster. If unspecified, the
     * Kubernetes default value will be used.
     * 
     */
    public Optional<Output<Integer>> defaultMaxPodsPerNode() {
        return Optional.ofNullable(this.defaultMaxPodsPerNode);
    }

    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    @Import(name="effectiveLabels")
    private @Nullable Output<Map<String,String>> effectiveLabels;

    /**
     * @return All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     * 
     */
    public Optional<Output<Map<String,String>>> effectiveLabels() {
        return Optional.ofNullable(this.effectiveLabels);
    }

    /**
     * The IP address of the Kubernetes API server.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The IP address of the Kubernetes API server.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * Address pools for cluster data plane external load balancing.
     * 
     */
    @Import(name="externalLoadBalancerIpv4AddressPools")
    private @Nullable Output<List<String>> externalLoadBalancerIpv4AddressPools;

    /**
     * @return Address pools for cluster data plane external load balancing.
     * 
     */
    public Optional<Output<List<String>>> externalLoadBalancerIpv4AddressPools() {
        return Optional.ofNullable(this.externalLoadBalancerIpv4AddressPools);
    }

    /**
     * Fleet related configuration.
     * Fleets are a Google Cloud concept for logically organizing clusters,
     * letting you use and manage multi-cluster capabilities and apply
     * consistent policies across your systems.
     * Structure is documented below.
     * 
     */
    @Import(name="fleet")
    private @Nullable Output<ClusterFleetArgs> fleet;

    /**
     * @return Fleet related configuration.
     * Fleets are a Google Cloud concept for logically organizing clusters,
     * letting you use and manage multi-cluster capabilities and apply
     * consistent policies across your systems.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterFleetArgs>> fleet() {
        return Optional.ofNullable(this.fleet);
    }

    /**
     * User-defined labels for the edgecloud cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return User-defined labels for the edgecloud cluster.
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field `effective_labels` for all of the labels present on the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The location of the resource.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the resource.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * All the maintenance events scheduled for the cluster, including the ones
     * ongoing, planned for the future and done in the past (up to 90 days).
     * Structure is documented below.
     * 
     */
    @Import(name="maintenanceEvents")
    private @Nullable Output<List<ClusterMaintenanceEventArgs>> maintenanceEvents;

    /**
     * @return All the maintenance events scheduled for the cluster, including the ones
     * ongoing, planned for the future and done in the past (up to 90 days).
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ClusterMaintenanceEventArgs>>> maintenanceEvents() {
        return Optional.ofNullable(this.maintenanceEvents);
    }

    /**
     * Cluster-wide maintenance policy configuration.
     * Structure is documented below.
     * 
     */
    @Import(name="maintenancePolicy")
    private @Nullable Output<ClusterMaintenancePolicyArgs> maintenancePolicy;

    /**
     * @return Cluster-wide maintenance policy configuration.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterMaintenancePolicyArgs>> maintenancePolicy() {
        return Optional.ofNullable(this.maintenancePolicy);
    }

    /**
     * The GDCE cluster name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The GDCE cluster name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Fleet related configuration.
     * Fleets are a Google Cloud concept for logically organizing clusters,
     * letting you use and manage multi-cluster capabilities and apply
     * consistent policies across your systems.
     * Structure is documented below.
     * 
     */
    @Import(name="networking")
    private @Nullable Output<ClusterNetworkingArgs> networking;

    /**
     * @return Fleet related configuration.
     * Fleets are a Google Cloud concept for logically organizing clusters,
     * letting you use and manage multi-cluster capabilities and apply
     * consistent policies across your systems.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterNetworkingArgs>> networking() {
        return Optional.ofNullable(this.networking);
    }

    /**
     * The lowest release version among all worker nodes. This field can be empty
     * if the cluster does not have any worker nodes.
     * 
     */
    @Import(name="nodeVersion")
    private @Nullable Output<String> nodeVersion;

    /**
     * @return The lowest release version among all worker nodes. This field can be empty
     * if the cluster does not have any worker nodes.
     * 
     */
    public Optional<Output<String>> nodeVersion() {
        return Optional.ofNullable(this.nodeVersion);
    }

    /**
     * The port number of the Kubernetes API server.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port number of the Kubernetes API server.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    @Import(name="pulumiLabels")
    private @Nullable Output<Map<String,String>> pulumiLabels;

    /**
     * @return The combination of labels configured directly on the resource
     * and default labels configured on the provider.
     * 
     */
    public Optional<Output<Map<String,String>>> pulumiLabels() {
        return Optional.ofNullable(this.pulumiLabels);
    }

    /**
     * The release channel a cluster is subscribed to.
     * Possible values are: `RELEASE_CHANNEL_UNSPECIFIED`, `NONE`, `REGULAR`.
     * 
     */
    @Import(name="releaseChannel")
    private @Nullable Output<String> releaseChannel;

    /**
     * @return The release channel a cluster is subscribed to.
     * Possible values are: `RELEASE_CHANNEL_UNSPECIFIED`, `NONE`, `REGULAR`.
     * 
     */
    public Optional<Output<String>> releaseChannel() {
        return Optional.ofNullable(this.releaseChannel);
    }

    /**
     * Indicates the status of the cluster.
     * 
     */
    @Import(name="status")
    private @Nullable Output<String> status;

    /**
     * @return Indicates the status of the cluster.
     * 
     */
    public Optional<Output<String>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Config that customers are allowed to define for GDCE system add-ons.
     * Structure is documented below.
     * 
     */
    @Import(name="systemAddonsConfig")
    private @Nullable Output<ClusterSystemAddonsConfigArgs> systemAddonsConfig;

    /**
     * @return Config that customers are allowed to define for GDCE system add-ons.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ClusterSystemAddonsConfigArgs>> systemAddonsConfig() {
        return Optional.ofNullable(this.systemAddonsConfig);
    }

    /**
     * The target cluster version. For example: &#34;1.5.0&#34;.
     * 
     */
    @Import(name="targetVersion")
    private @Nullable Output<String> targetVersion;

    /**
     * @return The target cluster version. For example: &#34;1.5.0&#34;.
     * 
     */
    public Optional<Output<String>> targetVersion() {
        return Optional.ofNullable(this.targetVersion);
    }

    /**
     * (Output)
     * The time when the maintenance event message was updated.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    /**
     * @return (Output)
     * The time when the maintenance event message was updated.
     * 
     */
    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    private ClusterState() {}

    private ClusterState(ClusterState $) {
        this.authorization = $.authorization;
        this.clusterCaCertificate = $.clusterCaCertificate;
        this.controlPlane = $.controlPlane;
        this.controlPlaneEncryption = $.controlPlaneEncryption;
        this.controlPlaneVersion = $.controlPlaneVersion;
        this.createTime = $.createTime;
        this.defaultMaxPodsPerNode = $.defaultMaxPodsPerNode;
        this.effectiveLabels = $.effectiveLabels;
        this.endpoint = $.endpoint;
        this.externalLoadBalancerIpv4AddressPools = $.externalLoadBalancerIpv4AddressPools;
        this.fleet = $.fleet;
        this.labels = $.labels;
        this.location = $.location;
        this.maintenanceEvents = $.maintenanceEvents;
        this.maintenancePolicy = $.maintenancePolicy;
        this.name = $.name;
        this.networking = $.networking;
        this.nodeVersion = $.nodeVersion;
        this.port = $.port;
        this.project = $.project;
        this.pulumiLabels = $.pulumiLabels;
        this.releaseChannel = $.releaseChannel;
        this.status = $.status;
        this.systemAddonsConfig = $.systemAddonsConfig;
        this.targetVersion = $.targetVersion;
        this.updateTime = $.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterState $;

        public Builder() {
            $ = new ClusterState();
        }

        public Builder(ClusterState defaults) {
            $ = new ClusterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorization RBAC policy that will be applied and managed by GEC.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authorization(@Nullable Output<ClusterAuthorizationArgs> authorization) {
            $.authorization = authorization;
            return this;
        }

        /**
         * @param authorization RBAC policy that will be applied and managed by GEC.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder authorization(ClusterAuthorizationArgs authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param clusterCaCertificate The PEM-encoded public certificate of the cluster&#39;s CA.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder clusterCaCertificate(@Nullable Output<String> clusterCaCertificate) {
            $.clusterCaCertificate = clusterCaCertificate;
            return this;
        }

        /**
         * @param clusterCaCertificate The PEM-encoded public certificate of the cluster&#39;s CA.
         * **Note**: This property is sensitive and will not be displayed in the plan.
         * 
         * @return builder
         * 
         */
        public Builder clusterCaCertificate(String clusterCaCertificate) {
            return clusterCaCertificate(Output.of(clusterCaCertificate));
        }

        /**
         * @param controlPlane The configuration of the cluster control plane.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder controlPlane(@Nullable Output<ClusterControlPlaneArgs> controlPlane) {
            $.controlPlane = controlPlane;
            return this;
        }

        /**
         * @param controlPlane The configuration of the cluster control plane.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder controlPlane(ClusterControlPlaneArgs controlPlane) {
            return controlPlane(Output.of(controlPlane));
        }

        /**
         * @param controlPlaneEncryption Remote control plane disk encryption options. This field is only used when
         * enabling CMEK support.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneEncryption(@Nullable Output<ClusterControlPlaneEncryptionArgs> controlPlaneEncryption) {
            $.controlPlaneEncryption = controlPlaneEncryption;
            return this;
        }

        /**
         * @param controlPlaneEncryption Remote control plane disk encryption options. This field is only used when
         * enabling CMEK support.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneEncryption(ClusterControlPlaneEncryptionArgs controlPlaneEncryption) {
            return controlPlaneEncryption(Output.of(controlPlaneEncryption));
        }

        /**
         * @param controlPlaneVersion The control plane release version.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneVersion(@Nullable Output<String> controlPlaneVersion) {
            $.controlPlaneVersion = controlPlaneVersion;
            return this;
        }

        /**
         * @param controlPlaneVersion The control plane release version.
         * 
         * @return builder
         * 
         */
        public Builder controlPlaneVersion(String controlPlaneVersion) {
            return controlPlaneVersion(Output.of(controlPlaneVersion));
        }

        /**
         * @param createTime (Output)
         * The time when the maintenance event request was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        /**
         * @param createTime (Output)
         * The time when the maintenance event request was created.
         * 
         * @return builder
         * 
         */
        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        /**
         * @param defaultMaxPodsPerNode The default maximum number of pods per node used if a maximum value is not
         * specified explicitly for a node pool in this cluster. If unspecified, the
         * Kubernetes default value will be used.
         * 
         * @return builder
         * 
         */
        public Builder defaultMaxPodsPerNode(@Nullable Output<Integer> defaultMaxPodsPerNode) {
            $.defaultMaxPodsPerNode = defaultMaxPodsPerNode;
            return this;
        }

        /**
         * @param defaultMaxPodsPerNode The default maximum number of pods per node used if a maximum value is not
         * specified explicitly for a node pool in this cluster. If unspecified, the
         * Kubernetes default value will be used.
         * 
         * @return builder
         * 
         */
        public Builder defaultMaxPodsPerNode(Integer defaultMaxPodsPerNode) {
            return defaultMaxPodsPerNode(Output.of(defaultMaxPodsPerNode));
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(@Nullable Output<Map<String,String>> effectiveLabels) {
            $.effectiveLabels = effectiveLabels;
            return this;
        }

        /**
         * @param effectiveLabels All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
         * 
         * @return builder
         * 
         */
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            return effectiveLabels(Output.of(effectiveLabels));
        }

        /**
         * @param endpoint The IP address of the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The IP address of the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param externalLoadBalancerIpv4AddressPools Address pools for cluster data plane external load balancing.
         * 
         * @return builder
         * 
         */
        public Builder externalLoadBalancerIpv4AddressPools(@Nullable Output<List<String>> externalLoadBalancerIpv4AddressPools) {
            $.externalLoadBalancerIpv4AddressPools = externalLoadBalancerIpv4AddressPools;
            return this;
        }

        /**
         * @param externalLoadBalancerIpv4AddressPools Address pools for cluster data plane external load balancing.
         * 
         * @return builder
         * 
         */
        public Builder externalLoadBalancerIpv4AddressPools(List<String> externalLoadBalancerIpv4AddressPools) {
            return externalLoadBalancerIpv4AddressPools(Output.of(externalLoadBalancerIpv4AddressPools));
        }

        /**
         * @param externalLoadBalancerIpv4AddressPools Address pools for cluster data plane external load balancing.
         * 
         * @return builder
         * 
         */
        public Builder externalLoadBalancerIpv4AddressPools(String... externalLoadBalancerIpv4AddressPools) {
            return externalLoadBalancerIpv4AddressPools(List.of(externalLoadBalancerIpv4AddressPools));
        }

        /**
         * @param fleet Fleet related configuration.
         * Fleets are a Google Cloud concept for logically organizing clusters,
         * letting you use and manage multi-cluster capabilities and apply
         * consistent policies across your systems.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fleet(@Nullable Output<ClusterFleetArgs> fleet) {
            $.fleet = fleet;
            return this;
        }

        /**
         * @param fleet Fleet related configuration.
         * Fleets are a Google Cloud concept for logically organizing clusters,
         * letting you use and manage multi-cluster capabilities and apply
         * consistent policies across your systems.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder fleet(ClusterFleetArgs fleet) {
            return fleet(Output.of(fleet));
        }

        /**
         * @param labels User-defined labels for the edgecloud cluster.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels User-defined labels for the edgecloud cluster.
         * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
         * Please refer to the field `effective_labels` for all of the labels present on the resource.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the resource.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param maintenanceEvents All the maintenance events scheduled for the cluster, including the ones
         * ongoing, planned for the future and done in the past (up to 90 days).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceEvents(@Nullable Output<List<ClusterMaintenanceEventArgs>> maintenanceEvents) {
            $.maintenanceEvents = maintenanceEvents;
            return this;
        }

        /**
         * @param maintenanceEvents All the maintenance events scheduled for the cluster, including the ones
         * ongoing, planned for the future and done in the past (up to 90 days).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceEvents(List<ClusterMaintenanceEventArgs> maintenanceEvents) {
            return maintenanceEvents(Output.of(maintenanceEvents));
        }

        /**
         * @param maintenanceEvents All the maintenance events scheduled for the cluster, including the ones
         * ongoing, planned for the future and done in the past (up to 90 days).
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceEvents(ClusterMaintenanceEventArgs... maintenanceEvents) {
            return maintenanceEvents(List.of(maintenanceEvents));
        }

        /**
         * @param maintenancePolicy Cluster-wide maintenance policy configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(@Nullable Output<ClusterMaintenancePolicyArgs> maintenancePolicy) {
            $.maintenancePolicy = maintenancePolicy;
            return this;
        }

        /**
         * @param maintenancePolicy Cluster-wide maintenance policy configuration.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder maintenancePolicy(ClusterMaintenancePolicyArgs maintenancePolicy) {
            return maintenancePolicy(Output.of(maintenancePolicy));
        }

        /**
         * @param name The GDCE cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The GDCE cluster name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networking Fleet related configuration.
         * Fleets are a Google Cloud concept for logically organizing clusters,
         * letting you use and manage multi-cluster capabilities and apply
         * consistent policies across your systems.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networking(@Nullable Output<ClusterNetworkingArgs> networking) {
            $.networking = networking;
            return this;
        }

        /**
         * @param networking Fleet related configuration.
         * Fleets are a Google Cloud concept for logically organizing clusters,
         * letting you use and manage multi-cluster capabilities and apply
         * consistent policies across your systems.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder networking(ClusterNetworkingArgs networking) {
            return networking(Output.of(networking));
        }

        /**
         * @param nodeVersion The lowest release version among all worker nodes. This field can be empty
         * if the cluster does not have any worker nodes.
         * 
         * @return builder
         * 
         */
        public Builder nodeVersion(@Nullable Output<String> nodeVersion) {
            $.nodeVersion = nodeVersion;
            return this;
        }

        /**
         * @param nodeVersion The lowest release version among all worker nodes. This field can be empty
         * if the cluster does not have any worker nodes.
         * 
         * @return builder
         * 
         */
        public Builder nodeVersion(String nodeVersion) {
            return nodeVersion(Output.of(nodeVersion));
        }

        /**
         * @param port The port number of the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port number of the Kubernetes API server.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(@Nullable Output<Map<String,String>> pulumiLabels) {
            $.pulumiLabels = pulumiLabels;
            return this;
        }

        /**
         * @param pulumiLabels The combination of labels configured directly on the resource
         * and default labels configured on the provider.
         * 
         * @return builder
         * 
         */
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            return pulumiLabels(Output.of(pulumiLabels));
        }

        /**
         * @param releaseChannel The release channel a cluster is subscribed to.
         * Possible values are: `RELEASE_CHANNEL_UNSPECIFIED`, `NONE`, `REGULAR`.
         * 
         * @return builder
         * 
         */
        public Builder releaseChannel(@Nullable Output<String> releaseChannel) {
            $.releaseChannel = releaseChannel;
            return this;
        }

        /**
         * @param releaseChannel The release channel a cluster is subscribed to.
         * Possible values are: `RELEASE_CHANNEL_UNSPECIFIED`, `NONE`, `REGULAR`.
         * 
         * @return builder
         * 
         */
        public Builder releaseChannel(String releaseChannel) {
            return releaseChannel(Output.of(releaseChannel));
        }

        /**
         * @param status Indicates the status of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Indicates the status of the cluster.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param systemAddonsConfig Config that customers are allowed to define for GDCE system add-ons.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder systemAddonsConfig(@Nullable Output<ClusterSystemAddonsConfigArgs> systemAddonsConfig) {
            $.systemAddonsConfig = systemAddonsConfig;
            return this;
        }

        /**
         * @param systemAddonsConfig Config that customers are allowed to define for GDCE system add-ons.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder systemAddonsConfig(ClusterSystemAddonsConfigArgs systemAddonsConfig) {
            return systemAddonsConfig(Output.of(systemAddonsConfig));
        }

        /**
         * @param targetVersion The target cluster version. For example: &#34;1.5.0&#34;.
         * 
         * @return builder
         * 
         */
        public Builder targetVersion(@Nullable Output<String> targetVersion) {
            $.targetVersion = targetVersion;
            return this;
        }

        /**
         * @param targetVersion The target cluster version. For example: &#34;1.5.0&#34;.
         * 
         * @return builder
         * 
         */
        public Builder targetVersion(String targetVersion) {
            return targetVersion(Output.of(targetVersion));
        }

        /**
         * @param updateTime (Output)
         * The time when the maintenance event message was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        /**
         * @param updateTime (Output)
         * The time when the maintenance event message was updated.
         * 
         * @return builder
         * 
         */
        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public ClusterState build() {
            return $;
        }
    }

}
