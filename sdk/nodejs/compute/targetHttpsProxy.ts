// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Represents a TargetHttpsProxy resource, which is used by one or more
 * global forwarding rule to route incoming HTTPS requests to a URL map.
 *
 * To get more information about TargetHttpsProxy, see:
 *
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/targetHttpsProxies)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
 *
 * ## Example Usage
 * ### Target Https Proxy Certificate Manager Certificate
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as fs from "fs";
 * import * as gcp from "@pulumi/gcp";
 *
 * const defaultCertificate = new gcp.certificatemanager.Certificate("defaultCertificate", {
 *     scope: "ALL_REGIONS",
 *     selfManaged: {
 *         pemCertificate: fs.readFileSync("test-fixtures/cert.pem"),
 *         pemPrivateKey: fs.readFileSync("test-fixtures/private-key.pem"),
 *     },
 * });
 * const defaultBackendService = new gcp.compute.BackendService("defaultBackendService", {
 *     portName: "http",
 *     protocol: "HTTP",
 *     timeoutSec: 10,
 *     loadBalancingScheme: "INTERNAL_MANAGED",
 * });
 * const defaultURLMap = new gcp.compute.URLMap("defaultURLMap", {
 *     description: "a description",
 *     defaultService: defaultBackendService.id,
 *     hostRules: [{
 *         hosts: ["mysite.com"],
 *         pathMatcher: "allpaths",
 *     }],
 *     pathMatchers: [{
 *         name: "allpaths",
 *         defaultService: defaultBackendService.id,
 *         pathRules: [{
 *             paths: ["/*"],
 *             service: defaultBackendService.id,
 *         }],
 *     }],
 * });
 * const defaultTargetHttpsProxy = new gcp.compute.TargetHttpsProxy("defaultTargetHttpsProxy", {
 *     urlMap: defaultURLMap.id,
 *     certificateManagerCertificates: [pulumi.interpolate`//certificatemanager.googleapis.com/${defaultCertificate.id}`],
 * });
 * // [google_certificate_manager_certificate.default.id] is also acceptable
 * ```
 *
 * ## Import
 *
 * TargetHttpsProxy can be imported using any of these accepted formats* `projects/{{project}}/global/targetHttpsProxies/{{name}}` * `{{project}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import TargetHttpsProxy using one of the formats above. For exampletf import {
 *
 *  id = "projects/{{project}}/global/targetHttpsProxies/{{name}}"
 *
 *  to = google_compute_target_https_proxy.default }
 *
 * ```sh
 *  $ pulumi import gcp:compute/targetHttpsProxy:TargetHttpsProxy When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), TargetHttpsProxy can be imported using one of the formats above. For example
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:compute/targetHttpsProxy:TargetHttpsProxy default projects/{{project}}/global/targetHttpsProxies/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:compute/targetHttpsProxy:TargetHttpsProxy default {{project}}/{{name}}
 * ```
 *
 * ```sh
 *  $ pulumi import gcp:compute/targetHttpsProxy:TargetHttpsProxy default {{name}}
 * ```
 */
export class TargetHttpsProxy extends pulumi.CustomResource {
    /**
     * Get an existing TargetHttpsProxy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TargetHttpsProxyState, opts?: pulumi.CustomResourceOptions): TargetHttpsProxy {
        return new TargetHttpsProxy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'gcp:compute/targetHttpsProxy:TargetHttpsProxy';

    /**
     * Returns true if the given object is an instance of TargetHttpsProxy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is TargetHttpsProxy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === TargetHttpsProxy.__pulumiType;
    }

    /**
     * URLs to certificate manager certificate resources that are used to authenticate connections between users and the load balancer.
     * Currently, you may specify up to 15 certificates. Certificate manager certificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * sslCertificates and certificateManagerCertificates fields can not be defined together.
     * Accepted format is `//certificatemanager.googleapis.com/projects/{project}/locations/{location}/certificates/{resourceName}` or just the selfLink `projects/{project}/locations/{location}/certificates/{resourceName}`
     */
    public readonly certificateManagerCertificates!: pulumi.Output<string[] | undefined>;
    /**
     * A reference to the CertificateMap resource uri that identifies a certificate map
     * associated with the given target proxy. This field can only be set for global target proxies.
     * Accepted format is `//certificatemanager.googleapis.com/projects/{project}/locations/{location}/certificateMaps/{resourceName}`.
     */
    public readonly certificateMap!: pulumi.Output<string | undefined>;
    /**
     * Creation timestamp in RFC3339 text format.
     */
    public /*out*/ readonly creationTimestamp!: pulumi.Output<string>;
    /**
     * An optional description of this resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Specifies how long to keep a connection open, after completing a response,
     * while there is no matching traffic (in seconds). If an HTTP keepalive is
     * not specified, a default value (610 seconds) will be used. For Global
     * external HTTP(S) load balancer, the minimum allowed value is 5 seconds and
     * the maximum allowed value is 1200 seconds. For Global external HTTP(S)
     * load balancer (classic), this option is not available publicly.
     */
    public readonly httpKeepAliveTimeoutSec!: pulumi.Output<number | undefined>;
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    public readonly project!: pulumi.Output<string>;
    /**
     * This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     */
    public readonly proxyBind!: pulumi.Output<boolean>;
    /**
     * The unique identifier for the resource.
     */
    public /*out*/ readonly proxyId!: pulumi.Output<number>;
    /**
     * Specifies the QUIC override policy for this resource. This determines
     * whether the load balancer will attempt to negotiate QUIC with clients
     * or not. Can specify one of NONE, ENABLE, or DISABLE. If NONE is
     * specified, Google manages whether QUIC is used.
     * Default value is `NONE`.
     * Possible values are: `NONE`, `ENABLE`, `DISABLE`.
     */
    public readonly quicOverride!: pulumi.Output<string | undefined>;
    /**
     * The URI of the created resource.
     */
    public /*out*/ readonly selfLink!: pulumi.Output<string>;
    /**
     * A URL referring to a networksecurity.ServerTlsPolicy
     * resource that describes how the proxy should authenticate inbound
     * traffic. serverTlsPolicy only applies to a global TargetHttpsProxy
     * attached to globalForwardingRules with the loadBalancingScheme
     * set to INTERNAL_SELF_MANAGED or EXTERNAL or EXTERNAL_MANAGED.
     * For details which ServerTlsPolicy resources are accepted with
     * INTERNAL_SELF_MANAGED and which with EXTERNAL, EXTERNAL_MANAGED
     * loadBalancingScheme consult ServerTlsPolicy documentation.
     * If left blank, communications are not encrypted.
     */
    public readonly serverTlsPolicy!: pulumi.Output<string | undefined>;
    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer.
     * Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * sslCertificates and certificateManagerCertificates can not be defined together.
     */
    public readonly sslCertificates!: pulumi.Output<string[] | undefined>;
    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
     * resource will not have any SSL policy configured.
     */
    public readonly sslPolicy!: pulumi.Output<string | undefined>;
    /**
     * A reference to the UrlMap resource that defines the mapping from URL
     * to the BackendService.
     *
     *
     * - - -
     */
    public readonly urlMap!: pulumi.Output<string>;

    /**
     * Create a TargetHttpsProxy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TargetHttpsProxyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TargetHttpsProxyArgs | TargetHttpsProxyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TargetHttpsProxyState | undefined;
            resourceInputs["certificateManagerCertificates"] = state ? state.certificateManagerCertificates : undefined;
            resourceInputs["certificateMap"] = state ? state.certificateMap : undefined;
            resourceInputs["creationTimestamp"] = state ? state.creationTimestamp : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["httpKeepAliveTimeoutSec"] = state ? state.httpKeepAliveTimeoutSec : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["project"] = state ? state.project : undefined;
            resourceInputs["proxyBind"] = state ? state.proxyBind : undefined;
            resourceInputs["proxyId"] = state ? state.proxyId : undefined;
            resourceInputs["quicOverride"] = state ? state.quicOverride : undefined;
            resourceInputs["selfLink"] = state ? state.selfLink : undefined;
            resourceInputs["serverTlsPolicy"] = state ? state.serverTlsPolicy : undefined;
            resourceInputs["sslCertificates"] = state ? state.sslCertificates : undefined;
            resourceInputs["sslPolicy"] = state ? state.sslPolicy : undefined;
            resourceInputs["urlMap"] = state ? state.urlMap : undefined;
        } else {
            const args = argsOrState as TargetHttpsProxyArgs | undefined;
            if ((!args || args.urlMap === undefined) && !opts.urn) {
                throw new Error("Missing required property 'urlMap'");
            }
            resourceInputs["certificateManagerCertificates"] = args ? args.certificateManagerCertificates : undefined;
            resourceInputs["certificateMap"] = args ? args.certificateMap : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["httpKeepAliveTimeoutSec"] = args ? args.httpKeepAliveTimeoutSec : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["project"] = args ? args.project : undefined;
            resourceInputs["proxyBind"] = args ? args.proxyBind : undefined;
            resourceInputs["quicOverride"] = args ? args.quicOverride : undefined;
            resourceInputs["serverTlsPolicy"] = args ? args.serverTlsPolicy : undefined;
            resourceInputs["sslCertificates"] = args ? args.sslCertificates : undefined;
            resourceInputs["sslPolicy"] = args ? args.sslPolicy : undefined;
            resourceInputs["urlMap"] = args ? args.urlMap : undefined;
            resourceInputs["creationTimestamp"] = undefined /*out*/;
            resourceInputs["proxyId"] = undefined /*out*/;
            resourceInputs["selfLink"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(TargetHttpsProxy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering TargetHttpsProxy resources.
 */
export interface TargetHttpsProxyState {
    /**
     * URLs to certificate manager certificate resources that are used to authenticate connections between users and the load balancer.
     * Currently, you may specify up to 15 certificates. Certificate manager certificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * sslCertificates and certificateManagerCertificates fields can not be defined together.
     * Accepted format is `//certificatemanager.googleapis.com/projects/{project}/locations/{location}/certificates/{resourceName}` or just the selfLink `projects/{project}/locations/{location}/certificates/{resourceName}`
     */
    certificateManagerCertificates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A reference to the CertificateMap resource uri that identifies a certificate map
     * associated with the given target proxy. This field can only be set for global target proxies.
     * Accepted format is `//certificatemanager.googleapis.com/projects/{project}/locations/{location}/certificateMaps/{resourceName}`.
     */
    certificateMap?: pulumi.Input<string>;
    /**
     * Creation timestamp in RFC3339 text format.
     */
    creationTimestamp?: pulumi.Input<string>;
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies how long to keep a connection open, after completing a response,
     * while there is no matching traffic (in seconds). If an HTTP keepalive is
     * not specified, a default value (610 seconds) will be used. For Global
     * external HTTP(S) load balancer, the minimum allowed value is 5 seconds and
     * the maximum allowed value is 1200 seconds. For Global external HTTP(S)
     * load balancer (classic), this option is not available publicly.
     */
    httpKeepAliveTimeoutSec?: pulumi.Input<number>;
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     */
    proxyBind?: pulumi.Input<boolean>;
    /**
     * The unique identifier for the resource.
     */
    proxyId?: pulumi.Input<number>;
    /**
     * Specifies the QUIC override policy for this resource. This determines
     * whether the load balancer will attempt to negotiate QUIC with clients
     * or not. Can specify one of NONE, ENABLE, or DISABLE. If NONE is
     * specified, Google manages whether QUIC is used.
     * Default value is `NONE`.
     * Possible values are: `NONE`, `ENABLE`, `DISABLE`.
     */
    quicOverride?: pulumi.Input<string>;
    /**
     * The URI of the created resource.
     */
    selfLink?: pulumi.Input<string>;
    /**
     * A URL referring to a networksecurity.ServerTlsPolicy
     * resource that describes how the proxy should authenticate inbound
     * traffic. serverTlsPolicy only applies to a global TargetHttpsProxy
     * attached to globalForwardingRules with the loadBalancingScheme
     * set to INTERNAL_SELF_MANAGED or EXTERNAL or EXTERNAL_MANAGED.
     * For details which ServerTlsPolicy resources are accepted with
     * INTERNAL_SELF_MANAGED and which with EXTERNAL, EXTERNAL_MANAGED
     * loadBalancingScheme consult ServerTlsPolicy documentation.
     * If left blank, communications are not encrypted.
     */
    serverTlsPolicy?: pulumi.Input<string>;
    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer.
     * Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * sslCertificates and certificateManagerCertificates can not be defined together.
     */
    sslCertificates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
     * resource will not have any SSL policy configured.
     */
    sslPolicy?: pulumi.Input<string>;
    /**
     * A reference to the UrlMap resource that defines the mapping from URL
     * to the BackendService.
     *
     *
     * - - -
     */
    urlMap?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a TargetHttpsProxy resource.
 */
export interface TargetHttpsProxyArgs {
    /**
     * URLs to certificate manager certificate resources that are used to authenticate connections between users and the load balancer.
     * Currently, you may specify up to 15 certificates. Certificate manager certificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * sslCertificates and certificateManagerCertificates fields can not be defined together.
     * Accepted format is `//certificatemanager.googleapis.com/projects/{project}/locations/{location}/certificates/{resourceName}` or just the selfLink `projects/{project}/locations/{location}/certificates/{resourceName}`
     */
    certificateManagerCertificates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A reference to the CertificateMap resource uri that identifies a certificate map
     * associated with the given target proxy. This field can only be set for global target proxies.
     * Accepted format is `//certificatemanager.googleapis.com/projects/{project}/locations/{location}/certificateMaps/{resourceName}`.
     */
    certificateMap?: pulumi.Input<string>;
    /**
     * An optional description of this resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Specifies how long to keep a connection open, after completing a response,
     * while there is no matching traffic (in seconds). If an HTTP keepalive is
     * not specified, a default value (610 seconds) will be used. For Global
     * external HTTP(S) load balancer, the minimum allowed value is 5 seconds and
     * the maximum allowed value is 1200 seconds. For Global external HTTP(S)
     * load balancer (classic), this option is not available publicly.
     */
    httpKeepAliveTimeoutSec?: pulumi.Input<number>;
    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
     */
    name?: pulumi.Input<string>;
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     */
    project?: pulumi.Input<string>;
    /**
     * This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     */
    proxyBind?: pulumi.Input<boolean>;
    /**
     * Specifies the QUIC override policy for this resource. This determines
     * whether the load balancer will attempt to negotiate QUIC with clients
     * or not. Can specify one of NONE, ENABLE, or DISABLE. If NONE is
     * specified, Google manages whether QUIC is used.
     * Default value is `NONE`.
     * Possible values are: `NONE`, `ENABLE`, `DISABLE`.
     */
    quicOverride?: pulumi.Input<string>;
    /**
     * A URL referring to a networksecurity.ServerTlsPolicy
     * resource that describes how the proxy should authenticate inbound
     * traffic. serverTlsPolicy only applies to a global TargetHttpsProxy
     * attached to globalForwardingRules with the loadBalancingScheme
     * set to INTERNAL_SELF_MANAGED or EXTERNAL or EXTERNAL_MANAGED.
     * For details which ServerTlsPolicy resources are accepted with
     * INTERNAL_SELF_MANAGED and which with EXTERNAL, EXTERNAL_MANAGED
     * loadBalancingScheme consult ServerTlsPolicy documentation.
     * If left blank, communications are not encrypted.
     */
    serverTlsPolicy?: pulumi.Input<string>;
    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer.
     * Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * sslCertificates and certificateManagerCertificates can not be defined together.
     */
    sslCertificates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
     * resource will not have any SSL policy configured.
     */
    sslPolicy?: pulumi.Input<string>;
    /**
     * A reference to the UrlMap resource that defines the mapping from URL
     * to the BackendService.
     *
     *
     * - - -
     */
    urlMap: pulumi.Input<string>;
}
