// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig;
import com.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigContainerImage;
import com.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigDataDisk;
import com.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig;
import com.pulumi.gcp.notebooks.outputs.RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RuntimeVirtualMachineVirtualMachineConfig {
    /**
     * @return The Compute Engine accelerator configuration for this runtime.
     * Structure is documented below.
     * 
     */
    private @Nullable RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig acceleratorConfig;
    /**
     * @return Use a list of container images to start the notebook instance.
     * Structure is documented below.
     * 
     */
    private @Nullable List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages;
    /**
     * @return Data disk option configuration settings.
     * Structure is documented below.
     * 
     */
    private RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk;
    /**
     * @return Encryption settings for virtual machine data disk.
     * Structure is documented below.
     * 
     */
    private @Nullable RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig encryptionConfig;
    /**
     * @return (Output)
     * The Compute Engine guest attributes. (see [Project and instance
     * guest attributes](https://cloud.google.com/compute/docs/
     * storing-retrieving-metadata#guest_attributes)).
     * 
     */
    private @Nullable Map<String,String> guestAttributes;
    /**
     * @return If true, runtime will only have internal IP addresses. By default,
     * runtimes are not restricted to internal IP addresses, and will
     * have ephemeral external IP addresses assigned to each vm. This
     * `internal_ip_only` restriction can only be enabled for subnetwork
     * enabled networks, and all dependencies must be configured to be
     * accessible without external IP addresses.
     * 
     */
    private @Nullable Boolean internalIpOnly;
    /**
     * @return The labels to associate with this runtime. Label **keys** must
     * contain 1 to 63 characters, and must conform to [RFC 1035]
     * (https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be
     * empty, but, if present, must contain 1 to 63 characters, and must
     * conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No
     * more than 32 labels can be associated with a cluster.
     * 
     */
    private @Nullable Map<String,String> labels;
    /**
     * @return The Compute Engine machine type used for runtimes.
     * 
     */
    private String machineType;
    /**
     * @return The Compute Engine metadata entries to add to virtual machine.
     * (see [Project and instance metadata](https://cloud.google.com
     * /compute/docs/storing-retrieving-metadata#project_and_instance
     * _metadata)).
     * 
     */
    private @Nullable Map<String,String> metadata;
    /**
     * @return The Compute Engine network to be used for machine communications.
     * Cannot be specified with subnetwork. If neither `network` nor
     * `subnet` is specified, the &#34;default&#34; network of the project is
     * used, if it exists. A full URL or partial URI. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     *   Runtimes are managed resources inside Google Infrastructure.
     *   Runtimes support the following network configurations:
     * * Google Managed Network (Network &amp; subnet are empty)
     * * Consumer Project VPC (network &amp; subnet are required). Requires
     *   configuring Private Service Access.
     * * Shared VPC (network &amp; subnet are required). Requires
     *   configuring Private Service Access.
     * 
     */
    private @Nullable String network;
    /**
     * @return The type of vNIC to be used on this interface. This may be gVNIC
     * or VirtioNet.
     * Possible values are: `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, `GVNIC`.
     * 
     */
    private @Nullable String nicType;
    /**
     * @return Reserved IP Range name is used for VPC Peering. The
     * subnetwork allocation will use the range *name* if it&#39;s assigned.
     * 
     */
    private @Nullable String reservedIpRange;
    /**
     * @return Shielded VM Instance configuration settings.
     * Structure is documented below.
     * 
     */
    private @Nullable RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig shieldedInstanceConfig;
    /**
     * @return The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network. A full URL or
     * partial URI are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    private @Nullable String subnet;
    /**
     * @return The Compute Engine tags to add to runtime (see [Tagging instances]
     * (https://cloud.google.com/compute/docs/
     * label-or-tag-resources#tags)).
     * 
     */
    private @Nullable List<String> tags;
    /**
     * @return (Output)
     * The zone where the virtual machine is located.
     * 
     */
    private @Nullable String zone;

    private RuntimeVirtualMachineVirtualMachineConfig() {}
    /**
     * @return The Compute Engine accelerator configuration for this runtime.
     * Structure is documented below.
     * 
     */
    public Optional<RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig> acceleratorConfig() {
        return Optional.ofNullable(this.acceleratorConfig);
    }
    /**
     * @return Use a list of container images to start the notebook instance.
     * Structure is documented below.
     * 
     */
    public List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages() {
        return this.containerImages == null ? List.of() : this.containerImages;
    }
    /**
     * @return Data disk option configuration settings.
     * Structure is documented below.
     * 
     */
    public RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk() {
        return this.dataDisk;
    }
    /**
     * @return Encryption settings for virtual machine data disk.
     * Structure is documented below.
     * 
     */
    public Optional<RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig> encryptionConfig() {
        return Optional.ofNullable(this.encryptionConfig);
    }
    /**
     * @return (Output)
     * The Compute Engine guest attributes. (see [Project and instance
     * guest attributes](https://cloud.google.com/compute/docs/
     * storing-retrieving-metadata#guest_attributes)).
     * 
     */
    public Map<String,String> guestAttributes() {
        return this.guestAttributes == null ? Map.of() : this.guestAttributes;
    }
    /**
     * @return If true, runtime will only have internal IP addresses. By default,
     * runtimes are not restricted to internal IP addresses, and will
     * have ephemeral external IP addresses assigned to each vm. This
     * `internal_ip_only` restriction can only be enabled for subnetwork
     * enabled networks, and all dependencies must be configured to be
     * accessible without external IP addresses.
     * 
     */
    public Optional<Boolean> internalIpOnly() {
        return Optional.ofNullable(this.internalIpOnly);
    }
    /**
     * @return The labels to associate with this runtime. Label **keys** must
     * contain 1 to 63 characters, and must conform to [RFC 1035]
     * (https://www.ietf.org/rfc/rfc1035.txt). Label **values** may be
     * empty, but, if present, must contain 1 to 63 characters, and must
     * conform to [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt). No
     * more than 32 labels can be associated with a cluster.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return The Compute Engine machine type used for runtimes.
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return The Compute Engine metadata entries to add to virtual machine.
     * (see [Project and instance metadata](https://cloud.google.com
     * /compute/docs/storing-retrieving-metadata#project_and_instance
     * _metadata)).
     * 
     */
    public Map<String,String> metadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }
    /**
     * @return The Compute Engine network to be used for machine communications.
     * Cannot be specified with subnetwork. If neither `network` nor
     * `subnet` is specified, the &#34;default&#34; network of the project is
     * used, if it exists. A full URL or partial URI. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     *   Runtimes are managed resources inside Google Infrastructure.
     *   Runtimes support the following network configurations:
     * * Google Managed Network (Network &amp; subnet are empty)
     * * Consumer Project VPC (network &amp; subnet are required). Requires
     *   configuring Private Service Access.
     * * Shared VPC (network &amp; subnet are required). Requires
     *   configuring Private Service Access.
     * 
     */
    public Optional<String> network() {
        return Optional.ofNullable(this.network);
    }
    /**
     * @return The type of vNIC to be used on this interface. This may be gVNIC
     * or VirtioNet.
     * Possible values are: `UNSPECIFIED_NIC_TYPE`, `VIRTIO_NET`, `GVNIC`.
     * 
     */
    public Optional<String> nicType() {
        return Optional.ofNullable(this.nicType);
    }
    /**
     * @return Reserved IP Range name is used for VPC Peering. The
     * subnetwork allocation will use the range *name* if it&#39;s assigned.
     * 
     */
    public Optional<String> reservedIpRange() {
        return Optional.ofNullable(this.reservedIpRange);
    }
    /**
     * @return Shielded VM Instance configuration settings.
     * Structure is documented below.
     * 
     */
    public Optional<RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }
    /**
     * @return The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network. A full URL or
     * partial URI are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/
     *   regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * 
     */
    public Optional<String> subnet() {
        return Optional.ofNullable(this.subnet);
    }
    /**
     * @return The Compute Engine tags to add to runtime (see [Tagging instances]
     * (https://cloud.google.com/compute/docs/
     * label-or-tag-resources#tags)).
     * 
     */
    public List<String> tags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * @return (Output)
     * The zone where the virtual machine is located.
     * 
     */
    public Optional<String> zone() {
        return Optional.ofNullable(this.zone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeVirtualMachineVirtualMachineConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig acceleratorConfig;
        private @Nullable List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages;
        private RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk;
        private @Nullable RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig encryptionConfig;
        private @Nullable Map<String,String> guestAttributes;
        private @Nullable Boolean internalIpOnly;
        private @Nullable Map<String,String> labels;
        private String machineType;
        private @Nullable Map<String,String> metadata;
        private @Nullable String network;
        private @Nullable String nicType;
        private @Nullable String reservedIpRange;
        private @Nullable RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig shieldedInstanceConfig;
        private @Nullable String subnet;
        private @Nullable List<String> tags;
        private @Nullable String zone;
        public Builder() {}
        public Builder(RuntimeVirtualMachineVirtualMachineConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorConfig = defaults.acceleratorConfig;
    	      this.containerImages = defaults.containerImages;
    	      this.dataDisk = defaults.dataDisk;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.guestAttributes = defaults.guestAttributes;
    	      this.internalIpOnly = defaults.internalIpOnly;
    	      this.labels = defaults.labels;
    	      this.machineType = defaults.machineType;
    	      this.metadata = defaults.metadata;
    	      this.network = defaults.network;
    	      this.nicType = defaults.nicType;
    	      this.reservedIpRange = defaults.reservedIpRange;
    	      this.shieldedInstanceConfig = defaults.shieldedInstanceConfig;
    	      this.subnet = defaults.subnet;
    	      this.tags = defaults.tags;
    	      this.zone = defaults.zone;
        }

        @CustomType.Setter
        public Builder acceleratorConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigAcceleratorConfig acceleratorConfig) {
            this.acceleratorConfig = acceleratorConfig;
            return this;
        }
        @CustomType.Setter
        public Builder containerImages(@Nullable List<RuntimeVirtualMachineVirtualMachineConfigContainerImage> containerImages) {
            this.containerImages = containerImages;
            return this;
        }
        public Builder containerImages(RuntimeVirtualMachineVirtualMachineConfigContainerImage... containerImages) {
            return containerImages(List.of(containerImages));
        }
        @CustomType.Setter
        public Builder dataDisk(RuntimeVirtualMachineVirtualMachineConfigDataDisk dataDisk) {
            this.dataDisk = Objects.requireNonNull(dataDisk);
            return this;
        }
        @CustomType.Setter
        public Builder encryptionConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigEncryptionConfig encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }
        @CustomType.Setter
        public Builder guestAttributes(@Nullable Map<String,String> guestAttributes) {
            this.guestAttributes = guestAttributes;
            return this;
        }
        @CustomType.Setter
        public Builder internalIpOnly(@Nullable Boolean internalIpOnly) {
            this.internalIpOnly = internalIpOnly;
            return this;
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        @CustomType.Setter
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }
        @CustomType.Setter
        public Builder network(@Nullable String network) {
            this.network = network;
            return this;
        }
        @CustomType.Setter
        public Builder nicType(@Nullable String nicType) {
            this.nicType = nicType;
            return this;
        }
        @CustomType.Setter
        public Builder reservedIpRange(@Nullable String reservedIpRange) {
            this.reservedIpRange = reservedIpRange;
            return this;
        }
        @CustomType.Setter
        public Builder shieldedInstanceConfig(@Nullable RuntimeVirtualMachineVirtualMachineConfigShieldedInstanceConfig shieldedInstanceConfig) {
            this.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }
        @CustomType.Setter
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder zone(@Nullable String zone) {
            this.zone = zone;
            return this;
        }
        public RuntimeVirtualMachineVirtualMachineConfig build() {
            final var o = new RuntimeVirtualMachineVirtualMachineConfig();
            o.acceleratorConfig = acceleratorConfig;
            o.containerImages = containerImages;
            o.dataDisk = dataDisk;
            o.encryptionConfig = encryptionConfig;
            o.guestAttributes = guestAttributes;
            o.internalIpOnly = internalIpOnly;
            o.labels = labels;
            o.machineType = machineType;
            o.metadata = metadata;
            o.network = network;
            o.nicType = nicType;
            o.reservedIpRange = reservedIpRange;
            o.shieldedInstanceConfig = shieldedInstanceConfig;
            o.subnet = subnet;
            o.tags = tags;
            o.zone = zone;
            return o;
        }
    }
}
