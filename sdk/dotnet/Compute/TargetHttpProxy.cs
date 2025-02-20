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
    /// Represents a TargetHttpProxy resource, which is used by one or more global
    /// forwarding rule to route incoming HTTP requests to a URL map.
    /// 
    /// To get more information about TargetHttpProxy, see:
    /// 
    /// * [API documentation](https://cloud.google.com/compute/docs/reference/v1/targetHttpProxies)
    /// * How-to Guides
    ///     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/target-proxies)
    /// 
    /// ## Example Usage
    /// ### Target Http Proxy Https Redirect
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var defaultURLMap = new Gcp.Compute.URLMap("defaultURLMap", new()
    ///     {
    ///         DefaultUrlRedirect = new Gcp.Compute.Inputs.URLMapDefaultUrlRedirectArgs
    ///         {
    ///             HttpsRedirect = true,
    ///             StripQuery = false,
    ///         },
    ///     });
    /// 
    ///     var defaultTargetHttpProxy = new Gcp.Compute.TargetHttpProxy("defaultTargetHttpProxy", new()
    ///     {
    ///         UrlMap = defaultURLMap.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// TargetHttpProxy can be imported using any of these accepted formats* `projects/{{project}}/global/targetHttpProxies/{{name}}` * `{{project}}/{{name}}` * `{{name}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import TargetHttpProxy using one of the formats above. For exampletf import {
    /// 
    ///  id = "projects/{{project}}/global/targetHttpProxies/{{name}}"
    /// 
    ///  to = google_compute_target_http_proxy.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/targetHttpProxy:TargetHttpProxy When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), TargetHttpProxy can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/targetHttpProxy:TargetHttpProxy default projects/{{project}}/global/targetHttpProxies/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/targetHttpProxy:TargetHttpProxy default {{project}}/{{name}}
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:compute/targetHttpProxy:TargetHttpProxy default {{name}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:compute/targetHttpProxy:TargetHttpProxy")]
    public partial class TargetHttpProxy : global::Pulumi.CustomResource
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
        /// Specifies how long to keep a connection open, after completing a response,
        /// while there is no matching traffic (in seconds). If an HTTP keepalive is
        /// not specified, a default value (610 seconds) will be used. For Global
        /// external HTTP(S) load balancer, the minimum allowed value is 5 seconds and
        /// the maximum allowed value is 1200 seconds. For Global external HTTP(S)
        /// load balancer (classic), this option is not available publicly.
        /// </summary>
        [Output("httpKeepAliveTimeoutSec")]
        public Output<int?> HttpKeepAliveTimeoutSec { get; private set; } = null!;

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
        /// This field only applies when the forwarding rule that references
        /// this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
        /// </summary>
        [Output("proxyBind")]
        public Output<bool> ProxyBind { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the resource.
        /// </summary>
        [Output("proxyId")]
        public Output<int> ProxyId { get; private set; } = null!;

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Output("selfLink")]
        public Output<string> SelfLink { get; private set; } = null!;

        /// <summary>
        /// A reference to the UrlMap resource that defines the mapping from URL
        /// to the BackendService.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Output("urlMap")]
        public Output<string> UrlMap { get; private set; } = null!;


        /// <summary>
        /// Create a TargetHttpProxy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TargetHttpProxy(string name, TargetHttpProxyArgs args, CustomResourceOptions? options = null)
            : base("gcp:compute/targetHttpProxy:TargetHttpProxy", name, args ?? new TargetHttpProxyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TargetHttpProxy(string name, Input<string> id, TargetHttpProxyState? state = null, CustomResourceOptions? options = null)
            : base("gcp:compute/targetHttpProxy:TargetHttpProxy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TargetHttpProxy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TargetHttpProxy Get(string name, Input<string> id, TargetHttpProxyState? state = null, CustomResourceOptions? options = null)
        {
            return new TargetHttpProxy(name, id, state, options);
        }
    }

    public sealed class TargetHttpProxyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// An optional description of this resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Specifies how long to keep a connection open, after completing a response,
        /// while there is no matching traffic (in seconds). If an HTTP keepalive is
        /// not specified, a default value (610 seconds) will be used. For Global
        /// external HTTP(S) load balancer, the minimum allowed value is 5 seconds and
        /// the maximum allowed value is 1200 seconds. For Global external HTTP(S)
        /// load balancer (classic), this option is not available publicly.
        /// </summary>
        [Input("httpKeepAliveTimeoutSec")]
        public Input<int>? HttpKeepAliveTimeoutSec { get; set; }

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
        /// This field only applies when the forwarding rule that references
        /// this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
        /// </summary>
        [Input("proxyBind")]
        public Input<bool>? ProxyBind { get; set; }

        /// <summary>
        /// A reference to the UrlMap resource that defines the mapping from URL
        /// to the BackendService.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("urlMap", required: true)]
        public Input<string> UrlMap { get; set; } = null!;

        public TargetHttpProxyArgs()
        {
        }
        public static new TargetHttpProxyArgs Empty => new TargetHttpProxyArgs();
    }

    public sealed class TargetHttpProxyState : global::Pulumi.ResourceArgs
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
        /// Specifies how long to keep a connection open, after completing a response,
        /// while there is no matching traffic (in seconds). If an HTTP keepalive is
        /// not specified, a default value (610 seconds) will be used. For Global
        /// external HTTP(S) load balancer, the minimum allowed value is 5 seconds and
        /// the maximum allowed value is 1200 seconds. For Global external HTTP(S)
        /// load balancer (classic), this option is not available publicly.
        /// </summary>
        [Input("httpKeepAliveTimeoutSec")]
        public Input<int>? HttpKeepAliveTimeoutSec { get; set; }

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
        /// This field only applies when the forwarding rule that references
        /// this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
        /// </summary>
        [Input("proxyBind")]
        public Input<bool>? ProxyBind { get; set; }

        /// <summary>
        /// The unique identifier for the resource.
        /// </summary>
        [Input("proxyId")]
        public Input<int>? ProxyId { get; set; }

        /// <summary>
        /// The URI of the created resource.
        /// </summary>
        [Input("selfLink")]
        public Input<string>? SelfLink { get; set; }

        /// <summary>
        /// A reference to the UrlMap resource that defines the mapping from URL
        /// to the BackendService.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("urlMap")]
        public Input<string>? UrlMap { get; set; }

        public TargetHttpProxyState()
        {
        }
        public static new TargetHttpProxyState Empty => new TargetHttpProxyState();
    }
}
