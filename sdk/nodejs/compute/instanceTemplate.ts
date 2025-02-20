// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * > **Note**: Global instance templates can be used in any region. To lower the impact of outages outside your region and gain data residency within your region, use google_compute_region_instance_template.
 *
 * Manages a VM instance template resource within GCE. For more information see
 * [the official documentation](https://cloud.google.com/compute/docs/instance-templates)
 * and
 * [API](https://cloud.google.com/compute/docs/reference/latest/instanceTemplates).
 *
 * ## Example Usage
 * ### Automatic Envoy Deployment
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const default = gcp.compute.getDefaultServiceAccount({});
 * const myImage = gcp.compute.getImage({
 *     family: "debian-11",
 *     project: "debian-cloud",
 * });
 * const foobar = new gcp.compute.InstanceTemplate("foobar", {
 *     machineType: "e2-medium",
 *     canIpForward: false,
 *     tags: [
 *         "foo",
 *         "bar",
 *     ],
 *     disks: [{
 *         sourceImage: myImage.then(myImage => myImage.selfLink),
 *         autoDelete: true,
 *         boot: true,
 *     }],
 *     networkInterfaces: [{
 *         network: "default",
 *     }],
 *     scheduling: {
 *         preemptible: false,
 *         automaticRestart: true,
 *     },
 *     metadata: {
 *         "gce-software-declaration": `{
 *   "softwareRecipes": [{
 *     "name": "install-gce-service-proxy-agent",
 *     "desired_state": "INSTALLED",
 *     "installSteps": [{
 *       "scriptRun": {
 *         "script": "#! /bin/bash\\nZONE=$(curl --silent http://metadata.google.internal/computeMetadata/v1/instance/zone -H Metadata-Flavor:Google | cut -d/ -f4 )\\nexport SERVICE_PROXY_AGENT_DIRECTORY=$(mktemp -d)\\nsudo gsutil cp   gs://gce-service-proxy-"$ZONE"/service-proxy-agent/releases/service-proxy-agent-0.2.tgz   "$SERVICE_PROXY_AGENT_DIRECTORY"   || sudo gsutil cp     gs://gce-service-proxy/service-proxy-agent/releases/service-proxy-agent-0.2.tgz     "$SERVICE_PROXY_AGENT_DIRECTORY"\\nsudo tar -xzf "$SERVICE_PROXY_AGENT_DIRECTORY"/service-proxy-agent-0.2.tgz -C "$SERVICE_PROXY_AGENT_DIRECTORY"\\n"$SERVICE_PROXY_AGENT_DIRECTORY"/service-proxy-agent/service-proxy-agent-bootstrap.sh"
 *       }
 *     }]
 *   }]
 * }
 * `,
 *         "gce-service-proxy": `{
 *   "api-version": "0.2",
 *   "proxy-spec": {
 *     "proxy-port": 15001,
 *     "network": "my-network",
 *     "tracing": "ON",
 *     "access-log": "/var/log/envoy/access.log"
 *   }
 *   "service": {
 *     "serving-ports": [80, 81]
 *   },
 *  "labels": {
 *    "app_name": "bookserver_app",
 *    "app_version": "STABLE"
 *   }
 * }
 * `,
 *         "enable-guest-attributes": "true",
 *         "enable-osconfig": "true",
 *     },
 *     serviceAccount: {
 *         email: _default.then(_default => _default.email),
 *         scopes: ["cloud-platform"],
 *     },
 *     labels: {
 *         "gce-service-proxy": "on",
 *     },
 * });
 * ```
 * ## Deploying the Latest Image
 *
 * A common way to use instance templates and managed instance groups is to deploy the
 * latest image in a family, usually the latest build of your application. There are two
 * ways to do this in the provider, and they have their pros and cons. The difference ends
 * up being in how "latest" is interpreted. You can either deploy the latest image available
 * when the provider runs, or you can have each instance check what the latest image is when
 * it's being created, either as part of a scaling event or being rebuilt by the instance
 * group manager.
 *
 * If you're not sure, we recommend deploying the latest image available when the provider runs,
 * because this means all the instances in your group will be based on the same image, always,
 * and means that no upgrades or changes to your instances happen outside of a `pulumi up`.
 * You can achieve this by using the `gcp.compute.Image`
 * data source, which will retrieve the latest image on every `pulumi apply`, and will update
 * the template to use that specific image:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const myImage = gcp.compute.getImage({
 *     family: "debian-11",
 *     project: "debian-cloud",
 * });
 * const instanceTemplate = new gcp.compute.InstanceTemplate("instanceTemplate", {
 *     namePrefix: "instance-template-",
 *     machineType: "e2-medium",
 *     region: "us-central1",
 *     disks: [{
 *         sourceImage: myImage.then(myImage => myImage.selfLink),
 *     }],
 * });
 * ```
 *
 * To have instances update to the latest on every scaling event or instance re-creation,
 * use the family as the image for the disk, and it will use GCP's default behavior, setting
 * the image for the template to the family:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as gcp from "@pulumi/gcp";
 *
 * const instanceTemplate = new gcp.compute.InstanceTemplate("instanceTemplate", {
 *     disks: [{
 *         sourceImage: "debian-cloud/debian-11",
 *     }],
 *     machineType: "e2-medium",
 *     namePrefix: "instance-template-",
 *     region: "us-central1",
 * });
 * ```
 *
 * ## Import
 *
 * Instance templates can be imported using any of these accepted formats* `projects/{{project}}/global/instanceTemplates/{{name}}` * `{{project}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import instance templates using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/global/instanceTemplates/{{name}}"
 *
 *  to = google_compute_instance_template.default }
 *
 * ```sh
 *  $ pulumi import gcp:compute/instanceTemplate:InstanceTemplate When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), instance templates can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:compute/instanceTemplate:InstanceTemplate default projects/{{project}}/global/instanceTemplates/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:compute/instanceTemplate:InstanceTemplate default {{project}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:compute/instanceTemplate:InstanceTemplate default {{name}}
 * ```
 */
export class InstanceTemplate extends pulumi.CustomResource {
    /**
     * Get an existing InstanceTemplate resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: InstanceTemplateState, opts?: pulumi.CustomResourceOptions): InstanceTemplate {
        return new InstanceTemplate(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/instanceTemplate:InstanceTemplate';

    /**
     * Returns true if the given object is an instance of InstanceTemplate.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is InstanceTemplate {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === InstanceTemplate.__pulumiType;
    }

    /**
     * Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     */
    public readonly advancedMachineFeatures!: pulumi.Output<outputs.compute.InstanceTemplateAdvancedMachineFeatures | undefined>;
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     */
    public readonly canIpForward!: pulumi.Output<boolean | undefined>;
    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     */
    public readonly confidentialInstanceConfig!: pulumi.Output<outputs.compute.InstanceTemplateConfidentialInstanceConfig>;
    /**
     * A brief description of this resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     */
    public readonly disks!: pulumi.Output<outputs.compute.InstanceTemplateDisk[]>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    public /*out*/ readonly effectiveLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * ) Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allowStoppingForUpdate` must be set to true in order to update this field.
     */
    public readonly enableDisplay!: pulumi.Output<boolean | undefined>;
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     */
    public readonly guestAccelerators!: pulumi.Output<outputs.compute.InstanceTemplateGuestAccelerator[] | undefined>;
    /**
     * A brief description to use for instances
     * created from this template.
     */
    public readonly instanceDescription!: pulumi.Output<string | undefined>;
    /**
     * A set of key/value label pairs to assign to instances
     * created from this template.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field 'effective_labels' for all of the labels present on the resource.
     */
    public readonly labels!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * The machine type to create.
     *
     * To create a machine with a [custom type](https://cloud.google.com/dataproc/docs/concepts/compute/custom-machine-types) (such as extended memory), format the value like `custom-VCPUS-MEM_IN_MB` like `custom-6-20480` for 6 vCPU and 20GB of RAM.
     *
     * - - -
     */
    public readonly machineType!: pulumi.Output<string>;
    /**
     * Metadata key/value pairs to make available from
     * within instances created from this template.
     */
    public readonly metadata!: pulumi.Output<{[key: string]: any} | undefined>;
    /**
     * The unique fingerprint of the metadata.
     */
    public /*out*/ readonly metadataFingerprint!: pulumi.Output<string>;
    /**
     * An alternative to using the
     * startup-script metadata key, mostly to match the computeInstance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     */
    public readonly metadataStartupScript!: pulumi.Output<string | undefined>;
    /**
     * Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     */
    public readonly minCpuPlatform!: pulumi.Output<string | undefined>;
    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     */
    public readonly namePrefix!: pulumi.Output<string>;
    /**
     * Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     */
    public readonly networkInterfaces!: pulumi.Output<outputs.compute.InstanceTemplateNetworkInterface[] | undefined>;
    /**
     * (Optional, Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machineType`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     */
    public readonly networkPerformanceConfig!: pulumi.Output<outputs.compute.InstanceTemplateNetworkPerformanceConfig | undefined>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * The combination of labels configured directly on the resource and default labels configured on the provider.
     */
    public /*out*/ readonly pulumiLabels!: pulumi.Output<{[key: string]: string}>;
    /**
     * An instance template is a global resource that is not
     * bound to a zone or a region. However, you can still specify some regional
     * resources in an instance template, which restricts the template to the
     * region where that resource resides. For example, a custom `subnetwork`
     * resource is tied to a specific region. Defaults to the region of the
     * Provider if no value is given.
     */
    public readonly region!: pulumi.Output<string>;
    /**
     * Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     */
    public readonly reservationAffinity!: pulumi.Output<outputs.compute.InstanceTemplateReservationAffinity | undefined>;
    /**
     * - A list of selfLinks of resource policies to attach to the instance. Modifying this list will cause the instance to recreate. Currently a max of 1 resource policy is supported.
     */
    public readonly resourcePolicies!: pulumi.Output<string | undefined>;
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     */
    public readonly scheduling!: pulumi.Output<outputs.compute.InstanceTemplateScheduling>;
    /**
     * The URI of the created resource.
     */
    public /*out*/ readonly selfLink!: pulumi.Output<string>;
    /**
     * A special URI of the created resource that uniquely identifies this instance template with the following format: `projects/{{project}}/global/instanceTemplates/{{name}}?uniqueId={{uniqueId}}`
     * Referencing an instance template via this attribute prevents Time of Check to Time of Use attacks when the instance template resides in a shared/untrusted environment.
     */
    public /*out*/ readonly selfLinkUnique!: pulumi.Output<string>;
    /**
     * Service account to attach to the instance. Structure is documented below.
     */
    public readonly serviceAccount!: pulumi.Output<outputs.compute.InstanceTemplateServiceAccount | undefined>;
    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     */
    public readonly shieldedInstanceConfig!: pulumi.Output<outputs.compute.InstanceTemplateShieldedInstanceConfig>;
    /**
     * Tags to attach to the instance.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * The unique fingerprint of the tags.
     */
    public /*out*/ readonly tagsFingerprint!: pulumi.Output<string>;

    /**
     * Create a InstanceTemplate resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: InstanceTemplateArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: InstanceTemplateArgs | InstanceTemplateState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as InstanceTemplateState | undefined;
            resourceInputs["advancedMachineFeatures"] = state ? state.advancedMachineFeatures : undefined;
            resourceInputs["canIpForward"] = state ? state.canIpForward : undefined;
            resourceInputs["confidentialInstanceConfig"] = state ? state.confidentialInstanceConfig : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["disks"] = state ? state.disks : undefined;
            resourceInputs["effectiveLabels"] = state ? state.effectiveLabels : undefined;
            resourceInputs["enableDisplay"] = state ? state.enableDisplay : undefined;
            resourceInputs["guestAccelerators"] = state ? state.guestAccelerators : undefined;
            resourceInputs["instanceDescription"] = state ? state.instanceDescription : undefined;
            resourceInputs["labels"] = state ? state.labels : undefined;
            resourceInputs["machineType"] = state ? state.machineType : undefined;
            resourceInputs["metadata"] = state ? state.metadata : undefined;
            resourceInputs["metadataFingerprint"] = state ? state.metadataFingerprint : undefined;
            resourceInputs["metadataStartupScript"] = state ? state.metadataStartupScript : undefined;
            resourceInputs["minCpuPlatform"] = state ? state.minCpuPlatform : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["namePrefix"] = state ? state.namePrefix : undefined;
            resourceInputs["networkInterfaces"] = state ? state.networkInterfaces : undefined;
            resourceInputs["networkPerformanceConfig"] = state ? state.networkPerformanceConfig : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["pulumiLabels"] = state ? state.pulumiLabels : undefined;
            resourceInputs["region"] = state ? state.region : undefined;
            resourceInputs["reservationAffinity"] = state ? state.reservationAffinity : undefined;
            resourceInputs["resourcePolicies"] = state ? state.resourcePolicies : undefined;
            resourceInputs["scheduling"] = state ? state.scheduling : undefined;
            resourceInputs["selfLink"] = state ? state.selfLink : undefined;
            resourceInputs["selfLinkUnique"] = state ? state.selfLinkUnique : undefined;
            resourceInputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            resourceInputs["shieldedInstanceConfig"] = state ? state.shieldedInstanceConfig : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsFingerprint"] = state ? state.tagsFingerprint : undefined;
        } else {
            const args = argsOrState as InstanceTemplateArgs | undefined;
            if ((!args || args.disks === undefined) && !opts.urn) {
                throw new Error("Missing required property 'disks'");
            }
            if ((!args || args.machineType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'machineType'");
            }
            resourceInputs["advancedMachineFeatures"] = args ? args.advancedMachineFeatures : undefined;
            resourceInputs["canIpForward"] = args ? args.canIpForward : undefined;
            resourceInputs["confidentialInstanceConfig"] = args ? args.confidentialInstanceConfig : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["disks"] = args ? args.disks : undefined;
            resourceInputs["enableDisplay"] = args ? args.enableDisplay : undefined;
            resourceInputs["guestAccelerators"] = args ? args.guestAccelerators : undefined;
            resourceInputs["instanceDescription"] = args ? args.instanceDescription : undefined;
            resourceInputs["labels"] = args ? args.labels : undefined;
            resourceInputs["machineType"] = args ? args.machineType : undefined;
            resourceInputs["metadata"] = args ? args.metadata : undefined;
            resourceInputs["metadataStartupScript"] = args ? args.metadataStartupScript : undefined;
            resourceInputs["minCpuPlatform"] = args ? args.minCpuPlatform : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["namePrefix"] = args ? args.namePrefix : undefined;
            resourceInputs["networkInterfaces"] = args ? args.networkInterfaces : undefined;
            resourceInputs["networkPerformanceConfig"] = args ? args.networkPerformanceConfig : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["region"] = args ? args.region : undefined;
            resourceInputs["reservationAffinity"] = args ? args.reservationAffinity : undefined;
            resourceInputs["resourcePolicies"] = args ? args.resourcePolicies : undefined;
            resourceInputs["scheduling"] = args ? args.scheduling : undefined;
            resourceInputs["serviceAccount"] = args ? args.serviceAccount : undefined;
            resourceInputs["shieldedInstanceConfig"] = args ? args.shieldedInstanceConfig : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["effectiveLabels"] = undefined /*out*/;
            resourceInputs["metadataFingerprint"] = undefined /*out*/;
            resourceInputs["pulumiLabels"] = undefined /*out*/;
            resourceInputs["selfLink"] = undefined /*out*/;
            resourceInputs["selfLinkUnique"] = undefined /*out*/;
            resourceInputs["tagsFingerprint"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["effectiveLabels", "pulumiLabels"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(InstanceTemplate.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering InstanceTemplate resources.
 */
export interface InstanceTemplateState {
    /**
     * Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     */
    advancedMachineFeatures?: pulumi.Input<inputs.compute.InstanceTemplateAdvancedMachineFeatures>;
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     */
    canIpForward?: pulumi.Input<boolean>;
    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     */
    confidentialInstanceConfig?: pulumi.Input<inputs.compute.InstanceTemplateConfidentialInstanceConfig>;
    /**
     * A brief description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     */
    disks?: pulumi.Input<pulumi.Input<inputs.compute.InstanceTemplateDisk>[]>;
    /**
     * All of labels (key/value pairs) present on the resource in GCP, including the labels configured through Pulumi, other clients and services.
     */
    effectiveLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * ) Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allowStoppingForUpdate` must be set to true in order to update this field.
     */
    enableDisplay?: pulumi.Input<boolean>;
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     */
    guestAccelerators?: pulumi.Input<pulumi.Input<inputs.compute.InstanceTemplateGuestAccelerator>[]>;
    /**
     * A brief description to use for instances
     * created from this template.
     */
    instanceDescription?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to instances
     * created from this template.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field 'effective_labels' for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The machine type to create.
     *
     * To create a machine with a [custom type](https://cloud.google.com/dataproc/docs/concepts/compute/custom-machine-types) (such as extended memory), format the value like `custom-VCPUS-MEM_IN_MB` like `custom-6-20480` for 6 vCPU and 20GB of RAM.
     *
     * - - -
     */
    machineType?: pulumi.Input<string>;
    /**
     * Metadata key/value pairs to make available from
     * within instances created from this template.
     */
    metadata?: pulumi.Input<{[key: string]: any}>;
    /**
     * The unique fingerprint of the metadata.
     */
    metadataFingerprint?: pulumi.Input<string>;
    /**
     * An alternative to using the
     * startup-script metadata key, mostly to match the computeInstance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     */
    metadataStartupScript?: pulumi.Input<string>;
    /**
     * Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     */
    minCpuPlatform?: pulumi.Input<string>;
    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.compute.InstanceTemplateNetworkInterface>[]>;
    /**
     * (Optional, Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machineType`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     */
    networkPerformanceConfig?: pulumi.Input<inputs.compute.InstanceTemplateNetworkPerformanceConfig>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * The combination of labels configured directly on the resource and default labels configured on the provider.
     */
    pulumiLabels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * An instance template is a global resource that is not
     * bound to a zone or a region. However, you can still specify some regional
     * resources in an instance template, which restricts the template to the
     * region where that resource resides. For example, a custom `subnetwork`
     * resource is tied to a specific region. Defaults to the region of the
     * Provider if no value is given.
     */
    region?: pulumi.Input<string>;
    /**
     * Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     */
    reservationAffinity?: pulumi.Input<inputs.compute.InstanceTemplateReservationAffinity>;
    /**
     * - A list of selfLinks of resource policies to attach to the instance. Modifying this list will cause the instance to recreate. Currently a max of 1 resource policy is supported.
     */
    resourcePolicies?: pulumi.Input<string>;
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     */
    scheduling?: pulumi.Input<inputs.compute.InstanceTemplateScheduling>;
    /**
     * The URI of the created resource.
     */
    selfLink?: pulumi.Input<string>;
    /**
     * A special URI of the created resource that uniquely identifies this instance template with the following format: `projects/{{project}}/global/instanceTemplates/{{name}}?uniqueId={{uniqueId}}`
     * Referencing an instance template via this attribute prevents Time of Check to Time of Use attacks when the instance template resides in a shared/untrusted environment.
     */
    selfLinkUnique?: pulumi.Input<string>;
    /**
     * Service account to attach to the instance. Structure is documented below.
     */
    serviceAccount?: pulumi.Input<inputs.compute.InstanceTemplateServiceAccount>;
    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     */
    shieldedInstanceConfig?: pulumi.Input<inputs.compute.InstanceTemplateShieldedInstanceConfig>;
    /**
     * Tags to attach to the instance.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The unique fingerprint of the tags.
     */
    tagsFingerprint?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a InstanceTemplate resource.
 */
export interface InstanceTemplateArgs {
    /**
     * Configure Nested Virtualisation and Simultaneous Hyper Threading on this VM. Structure is documented below
     */
    advancedMachineFeatures?: pulumi.Input<inputs.compute.InstanceTemplateAdvancedMachineFeatures>;
    /**
     * Whether to allow sending and receiving of
     * packets with non-matching source or destination IPs. This defaults to false.
     */
    canIpForward?: pulumi.Input<boolean>;
    /**
     * Enable [Confidential Mode](https://cloud.google.com/compute/confidential-vm/docs/about-cvm) on this VM. Structure is documented below
     */
    confidentialInstanceConfig?: pulumi.Input<inputs.compute.InstanceTemplateConfidentialInstanceConfig>;
    /**
     * A brief description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Disks to attach to instances created from this template.
     * This can be specified multiple times for multiple disks. Structure is
     * documented below.
     */
    disks: pulumi.Input<pulumi.Input<inputs.compute.InstanceTemplateDisk>[]>;
    /**
     * ) Enable [Virtual Displays](https://cloud.google.com/compute/docs/instances/enable-instance-virtual-display#verify_display_driver) on this instance.
     * **Note**: `allowStoppingForUpdate` must be set to true in order to update this field.
     */
    enableDisplay?: pulumi.Input<boolean>;
    /**
     * List of the type and count of accelerator cards attached to the instance. Structure documented below.
     */
    guestAccelerators?: pulumi.Input<pulumi.Input<inputs.compute.InstanceTemplateGuestAccelerator>[]>;
    /**
     * A brief description to use for instances
     * created from this template.
     */
    instanceDescription?: pulumi.Input<string>;
    /**
     * A set of key/value label pairs to assign to instances
     * created from this template.
     *
     * **Note**: This field is non-authoritative, and will only manage the labels present in your configuration.
     * Please refer to the field 'effective_labels' for all of the labels present on the resource.
     */
    labels?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The machine type to create.
     *
     * To create a machine with a [custom type](https://cloud.google.com/dataproc/docs/concepts/compute/custom-machine-types) (such as extended memory), format the value like `custom-VCPUS-MEM_IN_MB` like `custom-6-20480` for 6 vCPU and 20GB of RAM.
     *
     * - - -
     */
    machineType: pulumi.Input<string>;
    /**
     * Metadata key/value pairs to make available from
     * within instances created from this template.
     */
    metadata?: pulumi.Input<{[key: string]: any}>;
    /**
     * An alternative to using the
     * startup-script metadata key, mostly to match the computeInstance resource.
     * This replaces the startup-script metadata key on the created instance and
     * thus the two mechanisms are not allowed to be used simultaneously.
     */
    metadataStartupScript?: pulumi.Input<string>;
    /**
     * Specifies a minimum CPU platform. Applicable values are the friendly names of CPU platforms, such as
     * `Intel Haswell` or `Intel Skylake`. See the complete list [here](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform).
     */
    minCpuPlatform?: pulumi.Input<string>;
    /**
     * The name of the instance template. If you leave
     * this blank, the provider will auto-generate a unique name.
     */
    name?: pulumi.Input<string>;
    /**
     * Creates a unique name beginning with the specified
     * prefix. Conflicts with `name`.
     */
    namePrefix?: pulumi.Input<string>;
    /**
     * Networks to attach to instances created from
     * this template. This can be specified multiple times for multiple networks.
     * Structure is documented below.
     */
    networkInterfaces?: pulumi.Input<pulumi.Input<inputs.compute.InstanceTemplateNetworkInterface>[]>;
    /**
     * (Optional, Configures network performance settings for the instance created from the
     * template. Structure is documented below. **Note**: `machineType`
     * must be a [supported type](https://cloud.google.com/compute/docs/networking/configure-vm-with-high-bandwidth-configuration),
     * the `image` used must include the [`GVNIC`](https://cloud.google.com/compute/docs/networking/using-gvnic#create-instance-gvnic-image)
     * in `guest-os-features`, and `network_interface.0.nic-type` must be `GVNIC`
     * in order for this setting to take effect.
     */
    networkPerformanceConfig?: pulumi.Input<inputs.compute.InstanceTemplateNetworkPerformanceConfig>;
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * An instance template is a global resource that is not
     * bound to a zone or a region. However, you can still specify some regional
     * resources in an instance template, which restricts the template to the
     * region where that resource resides. For example, a custom `subnetwork`
     * resource is tied to a specific region. Defaults to the region of the
     * Provider if no value is given.
     */
    region?: pulumi.Input<string>;
    /**
     * Specifies the reservations that this instance can consume from.
     * Structure is documented below.
     */
    reservationAffinity?: pulumi.Input<inputs.compute.InstanceTemplateReservationAffinity>;
    /**
     * - A list of selfLinks of resource policies to attach to the instance. Modifying this list will cause the instance to recreate. Currently a max of 1 resource policy is supported.
     */
    resourcePolicies?: pulumi.Input<string>;
    /**
     * The scheduling strategy to use. More details about
     * this configuration option are detailed below.
     */
    scheduling?: pulumi.Input<inputs.compute.InstanceTemplateScheduling>;
    /**
     * Service account to attach to the instance. Structure is documented below.
     */
    serviceAccount?: pulumi.Input<inputs.compute.InstanceTemplateServiceAccount>;
    /**
     * Enable [Shielded VM](https://cloud.google.com/security/shielded-cloud/shielded-vm) on this instance. Shielded VM provides verifiable integrity to prevent against malware and rootkits. Defaults to disabled. Structure is documented below.
     * **Note**: `shieldedInstanceConfig` can only be used with boot images with shielded vm support. See the complete list [here](https://cloud.google.com/compute/docs/images#shielded-images).
     */
    shieldedInstanceConfig?: pulumi.Input<inputs.compute.InstanceTemplateShieldedInstanceConfig>;
    /**
     * Tags to attach to the instance.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
