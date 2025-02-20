// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.accesscontextmanager.ServicePerimeterIngressPolicyArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterIngressPolicyState;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterIngressPolicyIngressFrom;
import com.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterIngressPolicyIngressTo;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * IngressPolicies match requests based on ingressFrom and ingressTo stanzas. For an ingress policy to match,
 * both the ingressFrom and ingressTo stanzas must be matched. If an IngressPolicy matches a request,
 * the request is allowed through the perimeter boundary from outside the perimeter.
 * For example, access from the internet can be allowed either based on an AccessLevel or,
 * for traffic hosted on Google Cloud, the project of the source network.
 * For access from private networks, using the project of the hosting network is required.
 * Individual ingress policies can be limited by restricting which services and/
 * or actions they match using the ingressTo field.
 * 
 * To get more information about ServicePerimeterIngressPolicy, see:
 * 
 * * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#ingresspolicy)
 * 
 * ## Import
 * 
 * ServicePerimeterIngressPolicy can be imported using any of these accepted formats* `{{perimeter}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import ServicePerimeterIngressPolicy using one of the formats above. For exampletf import {
 * 
 *  id = &#34;{{perimeter}}&#34;
 * 
 *  to = google_access_context_manager_service_perimeter_ingress_policy.default }
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), ServicePerimeterIngressPolicy can be imported using one of the formats above. For example
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy default {{perimeter}}
 * ```
 * 
 */
@ResourceType(type="gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy")
public class ServicePerimeterIngressPolicy extends com.pulumi.resources.CustomResource {
    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    @Export(name="ingressFrom", refs={ServicePerimeterIngressPolicyIngressFrom.class}, tree="[0]")
    private Output</* @Nullable */ ServicePerimeterIngressPolicyIngressFrom> ingressFrom;

    /**
     * @return Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ServicePerimeterIngressPolicyIngressFrom>> ingressFrom() {
        return Codegen.optional(this.ingressFrom);
    }
    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Export(name="ingressTo", refs={ServicePerimeterIngressPolicyIngressTo.class}, tree="[0]")
    private Output</* @Nullable */ ServicePerimeterIngressPolicyIngressTo> ingressTo;

    /**
     * @return Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Output<Optional<ServicePerimeterIngressPolicyIngressTo>> ingressTo() {
        return Codegen.optional(this.ingressTo);
    }
    /**
     * The name of the Service Perimeter to add this resource to.
     * 
     * ***
     * 
     */
    @Export(name="perimeter", refs={String.class}, tree="[0]")
    private Output<String> perimeter;

    /**
     * @return The name of the Service Perimeter to add this resource to.
     * 
     * ***
     * 
     */
    public Output<String> perimeter() {
        return this.perimeter;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServicePerimeterIngressPolicy(String name) {
        this(name, ServicePerimeterIngressPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServicePerimeterIngressPolicy(String name, ServicePerimeterIngressPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServicePerimeterIngressPolicy(String name, ServicePerimeterIngressPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy", name, args == null ? ServicePerimeterIngressPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServicePerimeterIngressPolicy(String name, Output<String> id, @Nullable ServicePerimeterIngressPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServicePerimeterIngressPolicy get(String name, Output<String> id, @Nullable ServicePerimeterIngressPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServicePerimeterIngressPolicy(name, id, state, options);
    }
}
