// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute
{
    /// <summary>
    /// Represents a RegionTargetHttpsProxy resource, which is used by one or more
    /// forwarding rules to route incoming HTTPS requests to a URL map.
    /// 
    /// To get more information about RegionTargetHttpsProxy, see:
    /// 
    /// * [API documentation](https://cloud.google.com/compute/docs/reference/rest/v1/regionTargetHttpsProxies)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// RegionTargetHttpsProxy can be imported using any of these accepted formats* `projects/{{project}}/regions/{{region}}/targetHttpsProxies/{{name}}` * `{{project}}/{{region}}/{{name}}` * `{{region}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import RegionTargetHttpsProxy using one of the formats above. For exampletf import {
    /// 
    ///  id = "projects/{{project}}/regions/{{region}}/targetHttpsProxies/{{name}}"
    /// 
    ///  to = google_compute_region_target_https_proxy.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), RegionTargetHttpsProxy can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy default projects/{{project}}/regions/{{region}}/targetHttpsProxies/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy default {{project}}/{{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy default {{region}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy")]
    public partial class RegionTargetHttpsProxy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        [Output("creationTimestamp")]
        public Output<string> CreationTimestamp { get; private set; } = null!;

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035. Specifically, the name must be 1-63 characters long and match
        /// the regular expression `a-z?` which means the
        /// first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Output("project")]
        public Output<string> Project { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the resource.
        /// </summary>
        [Output("proxyId")]
        public Output<int> ProxyId { get; private set; } = null!;

        /// <summary>
        /// The Region in which the created target https proxy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;

        /// <summary>
        /// A list of RegionSslCertificate resources that are used to authenticate
        /// connections between users and the load balancer. Currently, exactly
        /// one SSL certificate must be specified.
        /// </summary>
        [Output("sslCertificates")]
        public Output<ImmutableArray<string>> SslCertificates { get; private set; } = null!;

        /// <summary>
        /// A reference to the Region SslPolicy resource that will be associated with
        /// the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
        /// resource will not have any SSL policy configured.
        /// </summary>
        [Output("sslPolicy")]
        public Output<string?> SslPolicy { get; private set; } = null!;

        /// <summary>
        /// A reference to the RegionUrlMap resource that defines the mapping from URL
        /// to the RegionBackendService.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Output("urlMap")]
        public Output<string> UrlMap { get; private set; } = null!;


        /// <summary>
        /// Create a RegionTargetHttpsProxy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public RegionTargetHttpsProxy(string name, RegionTargetHttpsProxyArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy", name, args ?? new RegionTargetHttpsProxyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private RegionTargetHttpsProxy(string name, Input<string> id, RegionTargetHttpsProxyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/regionTargetHttpsProxy:RegionTargetHttpsProxy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing RegionTargetHttpsProxy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static RegionTargetHttpsProxy Get(string name, Input<string> id, RegionTargetHttpsProxyState? state = null, CustomResourceOptions? options = null)
        {
            return new RegionTargetHttpsProxy(name, id, state, options);
        }
    }

    public sealed class RegionTargetHttpsProxyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035. Specifically, the name must be 1-63 characters long and match
        /// the regular expression `a-z?` which means the
        /// first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The Region in which the created target https proxy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        [Input("sslCertificates", required: true)]
        private InputList<string>? _sslCertificates;

        /// <summary>
        /// A list of RegionSslCertificate resources that are used to authenticate
        /// connections between users and the load balancer. Currently, exactly
        /// one SSL certificate must be specified.
        /// </summary>
        public InputList<string> SslCertificates
        {
            get => _sslCertificates ?? (_sslCertificates = new InputList<string>());
            set => _sslCertificates = value;
        }

        /// <summary>
        /// A reference to the Region SslPolicy resource that will be associated with
        /// the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
        /// resource will not have any SSL policy configured.
        /// </summary>
        [Input("sslPolicy")]
        public Input<string>? SslPolicy { get; set; }

        /// <summary>
        /// A reference to the RegionUrlMap resource that defines the mapping from URL
        /// to the RegionBackendService.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("urlMap", required: true)]
        public Input<string> UrlMap { get; set; } = null!;

        public RegionTargetHttpsProxyArgs()
        {
        }
        public static new RegionTargetHttpsProxyArgs Empty => new RegionTargetHttpsProxyArgs();
    }

    public sealed class RegionTargetHttpsProxyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Creation timestamp in RFC3339 text format.
        /// </summary>
        [Input("creationTimestamp")]
        public Input<string>? CreationTimestamp { get; set; }

        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Name of the resource. Provided by the client when the resource is
        /// created. The name must be 1-63 characters long, and comply with
        /// RFC1035. Specifically, the name must be 1-63 characters long and match
        /// the regular expression `a-z?` which means the
        /// first character must be a lowercase letter, and all following
        /// characters must be a dash, lowercase letter, or digit, except the last
        /// character, which cannot be a dash.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ID of the project in which the resource belongs.
        /// If it is not provided, the provider project is used.
        /// </summary>
        [Input("project")]
        public Input<string>? Project { get; set; }

        /// <summary>
        /// The unique identifier for the resource.
        /// </summary>
        [Input("proxyId")]
        public Input<int>? ProxyId { get; set; }

        /// <summary>
        /// The Region in which the created target https proxy should reside.
        /// If it is not provided, the provider region is used.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        [Input("sslCertificates")]
        private InputList<string>? _sslCertificates;

        /// <summary>
        /// A list of RegionSslCertificate resources that are used to authenticate
        /// connections between users and the load balancer. Currently, exactly
        /// one SSL certificate must be specified.
        /// </summary>
        public InputList<string> SslCertificates
        {
            get => _sslCertificates ?? (_sslCertificates = new InputList<string>());
            set => _sslCertificates = value;
        }

        /// <summary>
        /// A reference to the Region SslPolicy resource that will be associated with
        /// the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
        /// resource will not have any SSL policy configured.
        /// </summary>
        [Input("sslPolicy")]
        public Input<string>? SslPolicy { get; set; }

        /// <summary>
        /// A reference to the RegionUrlMap resource that defines the mapping from URL
        /// to the RegionBackendService.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("urlMap")]
        public Input<string>? UrlMap { get; set; }

        public RegionTargetHttpsProxyState()
        {
        }
        public static new RegionTargetHttpsProxyState Empty => new RegionTargetHttpsProxyState();
    }
}
