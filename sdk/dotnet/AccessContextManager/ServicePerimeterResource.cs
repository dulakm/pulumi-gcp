// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.AccessContextManager
{
    /// <summary>
    /// Allows configuring a single GCP resource that should be inside of a service perimeter.
    /// This resource is intended to be used in cases where it is not possible to compile a full list
    /// of projects to include in a `gcp.accesscontextmanager.ServicePerimeter` resource,
    /// to enable them to be added separately.
    /// 
    /// &gt; **Note:** If this resource is used alongside a `gcp.accesscontextmanager.ServicePerimeter` resource,
    /// the service perimeter resource must have a `lifecycle` block with `ignore_changes = [status[0].resources]` so
    /// they don't fight over which resources should be in the policy.
    /// 
    /// To get more information about ServicePerimeterResource, see:
    /// 
    /// * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters)
    /// * How-to Guides
    ///     * [Service Perimeter Quickstart](https://cloud.google.com/vpc-service-controls/docs/quickstart)
    /// 
    /// &gt; **Warning:** If you are using User ADCs (Application Default Credentials) with this resource,
    /// you must specify a `billing_project` and set `user_project_override` to true
    /// in the provider configuration. Otherwise the ACM API will return a 403 error.
    /// Your account must have the `serviceusage.services.use` permission on the
    /// `billing_project` you defined.
    /// 
    /// ## Example Usage
    /// ### Access Context Manager Service Perimeter Resource Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Gcp = Pulumi.Gcp;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var access_policy = new Gcp.AccessContextManager.AccessPolicy("access-policy", new()
    ///     {
    ///         Parent = "organizations/123456789",
    ///         Title = "my policy",
    ///     });
    /// 
    ///     var service_perimeter_resourceServicePerimeter = new Gcp.AccessContextManager.ServicePerimeter("service-perimeter-resourceServicePerimeter", new()
    ///     {
    ///         Parent = access_policy.Name.Apply(name =&gt; $"accessPolicies/{name}"),
    ///         Title = "restrict_all",
    ///         Status = new Gcp.AccessContextManager.Inputs.ServicePerimeterStatusArgs
    ///         {
    ///             RestrictedServices = new[]
    ///             {
    ///                 "storage.googleapis.com",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var service_perimeter_resourceServicePerimeterResource = new Gcp.AccessContextManager.ServicePerimeterResource("service-perimeter-resourceServicePerimeterResource", new()
    ///     {
    ///         PerimeterName = service_perimeter_resourceServicePerimeter.Name,
    ///         Resource = "projects/987654321",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ServicePerimeterResource can be imported using any of these accepted formats* `{{perimeter_name}}/{{resource}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import ServicePerimeterResource using one of the formats above. For exampletf import {
    /// 
    ///  id = "{{perimeter_name}}/{{resource}}"
    /// 
    ///  to = google_access_context_manager_service_perimeter_resource.default }
    /// 
    /// ```sh
    ///  $ pulumi import gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), ServicePerimeterResource can be imported using one of the formats above. For example
    /// ```
    /// 
    /// ```sh
    ///  $ pulumi import gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource default {{perimeter_name}}/{{resource}}
    /// ```
    /// </summary>
    [GcpResourceType("gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource")]
    public partial class ServicePerimeterResource : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The name of the Service Perimeter to add this resource to.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Output("perimeterName")]
        public Output<string> PerimeterName { get; private set; } = null!;

        /// <summary>
        /// A GCP resource that is inside of the service perimeter.
        /// Currently only projects are allowed.
        /// Format: projects/{project_number}
        /// </summary>
        [Output("resource")]
        public Output<string> Resource { get; private set; } = null!;


        /// <summary>
        /// Create a ServicePerimeterResource resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServicePerimeterResource(string name, ServicePerimeterResourceArgs args, CustomResourceOptions? options = null)
            : base("gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource", name, args ?? new ServicePerimeterResourceArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServicePerimeterResource(string name, Input<string> id, ServicePerimeterResourceState? state = null, CustomResourceOptions? options = null)
            : base("gcp:accesscontextmanager/servicePerimeterResource:ServicePerimeterResource", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ServicePerimeterResource resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServicePerimeterResource Get(string name, Input<string> id, ServicePerimeterResourceState? state = null, CustomResourceOptions? options = null)
        {
            return new ServicePerimeterResource(name, id, state, options);
        }
    }

    public sealed class ServicePerimeterResourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Service Perimeter to add this resource to.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("perimeterName", required: true)]
        public Input<string> PerimeterName { get; set; } = null!;

        /// <summary>
        /// A GCP resource that is inside of the service perimeter.
        /// Currently only projects are allowed.
        /// Format: projects/{project_number}
        /// </summary>
        [Input("resource", required: true)]
        public Input<string> Resource { get; set; } = null!;

        public ServicePerimeterResourceArgs()
        {
        }
        public static new ServicePerimeterResourceArgs Empty => new ServicePerimeterResourceArgs();
    }

    public sealed class ServicePerimeterResourceState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Service Perimeter to add this resource to.
        /// 
        /// 
        /// - - -
        /// </summary>
        [Input("perimeterName")]
        public Input<string>? PerimeterName { get; set; }

        /// <summary>
        /// A GCP resource that is inside of the service perimeter.
        /// Currently only projects are allowed.
        /// Format: projects/{project_number}
        /// </summary>
        [Input("resource")]
        public Input<string>? Resource { get; set; }

        public ServicePerimeterResourceState()
        {
        }
        public static new ServicePerimeterResourceState Empty => new ServicePerimeterResourceState();
    }
}
