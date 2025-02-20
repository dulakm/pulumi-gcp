// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package accesscontextmanager

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// IngressPolicies match requests based on ingressFrom and ingressTo stanzas. For an ingress policy to match,
// both the ingressFrom and ingressTo stanzas must be matched. If an IngressPolicy matches a request,
// the request is allowed through the perimeter boundary from outside the perimeter.
// For example, access from the internet can be allowed either based on an AccessLevel or,
// for traffic hosted on Google Cloud, the project of the source network.
// For access from private networks, using the project of the hosting network is required.
// Individual ingress policies can be limited by restricting which services and/
// or actions they match using the ingressTo field.
//
// To get more information about ServicePerimeterIngressPolicy, see:
//
// * [API documentation](https://cloud.google.com/access-context-manager/docs/reference/rest/v1/accessPolicies.servicePerimeters#ingresspolicy)
//
// ## Import
//
// ServicePerimeterIngressPolicy can be imported using any of these accepted formats* `{{perimeter}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import ServicePerimeterIngressPolicy using one of the formats above. For exampletf import {
//
//	id = "{{perimeter}}"
//
//	to = google_access_context_manager_service_perimeter_ingress_policy.default }
//
// ```sh
//
//	$ pulumi import gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), ServicePerimeterIngressPolicy can be imported using one of the formats above. For example
//
// ```
//
// ```sh
//
//	$ pulumi import gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy default {{perimeter}}
//
// ```
type ServicePerimeterIngressPolicy struct {
	pulumi.CustomResourceState

	// Defines the conditions on the source of a request causing this `IngressPolicy`
	// to apply.
	// Structure is documented below.
	IngressFrom ServicePerimeterIngressPolicyIngressFromPtrOutput `pulumi:"ingressFrom"`
	// Defines the conditions on the `ApiOperation` and request destination that cause
	// this `IngressPolicy` to apply.
	// Structure is documented below.
	IngressTo ServicePerimeterIngressPolicyIngressToPtrOutput `pulumi:"ingressTo"`
	// The name of the Service Perimeter to add this resource to.
	//
	// ***
	Perimeter pulumi.StringOutput `pulumi:"perimeter"`
}

// NewServicePerimeterIngressPolicy registers a new resource with the given unique name, arguments, and options.
func NewServicePerimeterIngressPolicy(ctx *pulumi.Context,
	name string, args *ServicePerimeterIngressPolicyArgs, opts ...pulumi.ResourceOption) (*ServicePerimeterIngressPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Perimeter == nil {
		return nil, errors.New("invalid value for required argument 'Perimeter'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServicePerimeterIngressPolicy
	err := ctx.RegisterResource("gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServicePerimeterIngressPolicy gets an existing ServicePerimeterIngressPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServicePerimeterIngressPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServicePerimeterIngressPolicyState, opts ...pulumi.ResourceOption) (*ServicePerimeterIngressPolicy, error) {
	var resource ServicePerimeterIngressPolicy
	err := ctx.ReadResource("gcp:accesscontextmanager/servicePerimeterIngressPolicy:ServicePerimeterIngressPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServicePerimeterIngressPolicy resources.
type servicePerimeterIngressPolicyState struct {
	// Defines the conditions on the source of a request causing this `IngressPolicy`
	// to apply.
	// Structure is documented below.
	IngressFrom *ServicePerimeterIngressPolicyIngressFrom `pulumi:"ingressFrom"`
	// Defines the conditions on the `ApiOperation` and request destination that cause
	// this `IngressPolicy` to apply.
	// Structure is documented below.
	IngressTo *ServicePerimeterIngressPolicyIngressTo `pulumi:"ingressTo"`
	// The name of the Service Perimeter to add this resource to.
	//
	// ***
	Perimeter *string `pulumi:"perimeter"`
}

type ServicePerimeterIngressPolicyState struct {
	// Defines the conditions on the source of a request causing this `IngressPolicy`
	// to apply.
	// Structure is documented below.
	IngressFrom ServicePerimeterIngressPolicyIngressFromPtrInput
	// Defines the conditions on the `ApiOperation` and request destination that cause
	// this `IngressPolicy` to apply.
	// Structure is documented below.
	IngressTo ServicePerimeterIngressPolicyIngressToPtrInput
	// The name of the Service Perimeter to add this resource to.
	//
	// ***
	Perimeter pulumi.StringPtrInput
}

func (ServicePerimeterIngressPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*servicePerimeterIngressPolicyState)(nil)).Elem()
}

type servicePerimeterIngressPolicyArgs struct {
	// Defines the conditions on the source of a request causing this `IngressPolicy`
	// to apply.
	// Structure is documented below.
	IngressFrom *ServicePerimeterIngressPolicyIngressFrom `pulumi:"ingressFrom"`
	// Defines the conditions on the `ApiOperation` and request destination that cause
	// this `IngressPolicy` to apply.
	// Structure is documented below.
	IngressTo *ServicePerimeterIngressPolicyIngressTo `pulumi:"ingressTo"`
	// The name of the Service Perimeter to add this resource to.
	//
	// ***
	Perimeter string `pulumi:"perimeter"`
}

// The set of arguments for constructing a ServicePerimeterIngressPolicy resource.
type ServicePerimeterIngressPolicyArgs struct {
	// Defines the conditions on the source of a request causing this `IngressPolicy`
	// to apply.
	// Structure is documented below.
	IngressFrom ServicePerimeterIngressPolicyIngressFromPtrInput
	// Defines the conditions on the `ApiOperation` and request destination that cause
	// this `IngressPolicy` to apply.
	// Structure is documented below.
	IngressTo ServicePerimeterIngressPolicyIngressToPtrInput
	// The name of the Service Perimeter to add this resource to.
	//
	// ***
	Perimeter pulumi.StringInput
}

func (ServicePerimeterIngressPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*servicePerimeterIngressPolicyArgs)(nil)).Elem()
}

type ServicePerimeterIngressPolicyInput interface {
	pulumi.Input

	ToServicePerimeterIngressPolicyOutput() ServicePerimeterIngressPolicyOutput
	ToServicePerimeterIngressPolicyOutputWithContext(ctx context.Context) ServicePerimeterIngressPolicyOutput
}

func (*ServicePerimeterIngressPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**ServicePerimeterIngressPolicy)(nil)).Elem()
}

func (i *ServicePerimeterIngressPolicy) ToServicePerimeterIngressPolicyOutput() ServicePerimeterIngressPolicyOutput {
	return i.ToServicePerimeterIngressPolicyOutputWithContext(context.Background())
}

func (i *ServicePerimeterIngressPolicy) ToServicePerimeterIngressPolicyOutputWithContext(ctx context.Context) ServicePerimeterIngressPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePerimeterIngressPolicyOutput)
}

// ServicePerimeterIngressPolicyArrayInput is an input type that accepts ServicePerimeterIngressPolicyArray and ServicePerimeterIngressPolicyArrayOutput values.
// You can construct a concrete instance of `ServicePerimeterIngressPolicyArrayInput` via:
//
//	ServicePerimeterIngressPolicyArray{ ServicePerimeterIngressPolicyArgs{...} }
type ServicePerimeterIngressPolicyArrayInput interface {
	pulumi.Input

	ToServicePerimeterIngressPolicyArrayOutput() ServicePerimeterIngressPolicyArrayOutput
	ToServicePerimeterIngressPolicyArrayOutputWithContext(context.Context) ServicePerimeterIngressPolicyArrayOutput
}

type ServicePerimeterIngressPolicyArray []ServicePerimeterIngressPolicyInput

func (ServicePerimeterIngressPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServicePerimeterIngressPolicy)(nil)).Elem()
}

func (i ServicePerimeterIngressPolicyArray) ToServicePerimeterIngressPolicyArrayOutput() ServicePerimeterIngressPolicyArrayOutput {
	return i.ToServicePerimeterIngressPolicyArrayOutputWithContext(context.Background())
}

func (i ServicePerimeterIngressPolicyArray) ToServicePerimeterIngressPolicyArrayOutputWithContext(ctx context.Context) ServicePerimeterIngressPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePerimeterIngressPolicyArrayOutput)
}

// ServicePerimeterIngressPolicyMapInput is an input type that accepts ServicePerimeterIngressPolicyMap and ServicePerimeterIngressPolicyMapOutput values.
// You can construct a concrete instance of `ServicePerimeterIngressPolicyMapInput` via:
//
//	ServicePerimeterIngressPolicyMap{ "key": ServicePerimeterIngressPolicyArgs{...} }
type ServicePerimeterIngressPolicyMapInput interface {
	pulumi.Input

	ToServicePerimeterIngressPolicyMapOutput() ServicePerimeterIngressPolicyMapOutput
	ToServicePerimeterIngressPolicyMapOutputWithContext(context.Context) ServicePerimeterIngressPolicyMapOutput
}

type ServicePerimeterIngressPolicyMap map[string]ServicePerimeterIngressPolicyInput

func (ServicePerimeterIngressPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServicePerimeterIngressPolicy)(nil)).Elem()
}

func (i ServicePerimeterIngressPolicyMap) ToServicePerimeterIngressPolicyMapOutput() ServicePerimeterIngressPolicyMapOutput {
	return i.ToServicePerimeterIngressPolicyMapOutputWithContext(context.Background())
}

func (i ServicePerimeterIngressPolicyMap) ToServicePerimeterIngressPolicyMapOutputWithContext(ctx context.Context) ServicePerimeterIngressPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServicePerimeterIngressPolicyMapOutput)
}

type ServicePerimeterIngressPolicyOutput struct{ *pulumi.OutputState }

func (ServicePerimeterIngressPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServicePerimeterIngressPolicy)(nil)).Elem()
}

func (o ServicePerimeterIngressPolicyOutput) ToServicePerimeterIngressPolicyOutput() ServicePerimeterIngressPolicyOutput {
	return o
}

func (o ServicePerimeterIngressPolicyOutput) ToServicePerimeterIngressPolicyOutputWithContext(ctx context.Context) ServicePerimeterIngressPolicyOutput {
	return o
}

// Defines the conditions on the source of a request causing this `IngressPolicy`
// to apply.
// Structure is documented below.
func (o ServicePerimeterIngressPolicyOutput) IngressFrom() ServicePerimeterIngressPolicyIngressFromPtrOutput {
	return o.ApplyT(func(v *ServicePerimeterIngressPolicy) ServicePerimeterIngressPolicyIngressFromPtrOutput {
		return v.IngressFrom
	}).(ServicePerimeterIngressPolicyIngressFromPtrOutput)
}

// Defines the conditions on the `ApiOperation` and request destination that cause
// this `IngressPolicy` to apply.
// Structure is documented below.
func (o ServicePerimeterIngressPolicyOutput) IngressTo() ServicePerimeterIngressPolicyIngressToPtrOutput {
	return o.ApplyT(func(v *ServicePerimeterIngressPolicy) ServicePerimeterIngressPolicyIngressToPtrOutput {
		return v.IngressTo
	}).(ServicePerimeterIngressPolicyIngressToPtrOutput)
}

// The name of the Service Perimeter to add this resource to.
//
// ***
func (o ServicePerimeterIngressPolicyOutput) Perimeter() pulumi.StringOutput {
	return o.ApplyT(func(v *ServicePerimeterIngressPolicy) pulumi.StringOutput { return v.Perimeter }).(pulumi.StringOutput)
}

type ServicePerimeterIngressPolicyArrayOutput struct{ *pulumi.OutputState }

func (ServicePerimeterIngressPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServicePerimeterIngressPolicy)(nil)).Elem()
}

func (o ServicePerimeterIngressPolicyArrayOutput) ToServicePerimeterIngressPolicyArrayOutput() ServicePerimeterIngressPolicyArrayOutput {
	return o
}

func (o ServicePerimeterIngressPolicyArrayOutput) ToServicePerimeterIngressPolicyArrayOutputWithContext(ctx context.Context) ServicePerimeterIngressPolicyArrayOutput {
	return o
}

func (o ServicePerimeterIngressPolicyArrayOutput) Index(i pulumi.IntInput) ServicePerimeterIngressPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServicePerimeterIngressPolicy {
		return vs[0].([]*ServicePerimeterIngressPolicy)[vs[1].(int)]
	}).(ServicePerimeterIngressPolicyOutput)
}

type ServicePerimeterIngressPolicyMapOutput struct{ *pulumi.OutputState }

func (ServicePerimeterIngressPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServicePerimeterIngressPolicy)(nil)).Elem()
}

func (o ServicePerimeterIngressPolicyMapOutput) ToServicePerimeterIngressPolicyMapOutput() ServicePerimeterIngressPolicyMapOutput {
	return o
}

func (o ServicePerimeterIngressPolicyMapOutput) ToServicePerimeterIngressPolicyMapOutputWithContext(ctx context.Context) ServicePerimeterIngressPolicyMapOutput {
	return o
}

func (o ServicePerimeterIngressPolicyMapOutput) MapIndex(k pulumi.StringInput) ServicePerimeterIngressPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServicePerimeterIngressPolicy {
		return vs[0].(map[string]*ServicePerimeterIngressPolicy)[vs[1].(string)]
	}).(ServicePerimeterIngressPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePerimeterIngressPolicyInput)(nil)).Elem(), &ServicePerimeterIngressPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePerimeterIngressPolicyArrayInput)(nil)).Elem(), ServicePerimeterIngressPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServicePerimeterIngressPolicyMapInput)(nil)).Elem(), ServicePerimeterIngressPolicyMap{})
	pulumi.RegisterOutputType(ServicePerimeterIngressPolicyOutput{})
	pulumi.RegisterOutputType(ServicePerimeterIngressPolicyArrayOutput{})
	pulumi.RegisterOutputType(ServicePerimeterIngressPolicyMapOutput{})
}
