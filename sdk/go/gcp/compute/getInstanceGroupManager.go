// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get a Compute Instance Group Manager within GCE.
// For more information, see [the official documentation](https://cloud.google.com/compute/docs/instance-groups#managed_instance_groups)
// and [API](https://cloud.google.com/compute/docs/reference/latest/instanceGroupManagers)
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/compute"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := compute.LookupInstanceGroupManager(ctx, &compute.LookupInstanceGroupManagerArgs{
//				Name: pulumi.StringRef("my-igm"),
//				Zone: pulumi.StringRef("us-central1-a"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = compute.LookupInstanceGroupManager(ctx, &compute.LookupInstanceGroupManagerArgs{
//				SelfLink: pulumi.StringRef("https://www.googleapis.com/compute/v1/projects/myproject/zones/us-central1-a/instanceGroupManagers/my-igm"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupInstanceGroupManager(ctx *pulumi.Context, args *LookupInstanceGroupManagerArgs, opts ...pulumi.InvokeOption) (*LookupInstanceGroupManagerResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupInstanceGroupManagerResult
	err := ctx.Invoke("gcp:compute/getInstanceGroupManager:getInstanceGroupManager", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getInstanceGroupManager.
type LookupInstanceGroupManagerArgs struct {
	// The name of the instance group. Either `name` or `selfLink` must be provided.
	Name *string `pulumi:"name"`
	// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
	Project *string `pulumi:"project"`
	// The self link of the instance group. Either `name` or `selfLink` must be provided.
	SelfLink *string `pulumi:"selfLink"`
	// The zone of the instance group. If referencing the instance group by name and `zone` is not provided, the provider zone is used.
	Zone *string `pulumi:"zone"`
}

// A collection of values returned by getInstanceGroupManager.
type LookupInstanceGroupManagerResult struct {
	AllInstancesConfigs []GetInstanceGroupManagerAllInstancesConfig `pulumi:"allInstancesConfigs"`
	AutoHealingPolicies []GetInstanceGroupManagerAutoHealingPolicy  `pulumi:"autoHealingPolicies"`
	BaseInstanceName    string                                      `pulumi:"baseInstanceName"`
	Description         string                                      `pulumi:"description"`
	Fingerprint         string                                      `pulumi:"fingerprint"`
	// The provider-assigned unique ID for this managed resource.
	Id                          string                                           `pulumi:"id"`
	InstanceGroup               string                                           `pulumi:"instanceGroup"`
	InstanceLifecyclePolicies   []GetInstanceGroupManagerInstanceLifecyclePolicy `pulumi:"instanceLifecyclePolicies"`
	ListManagedInstancesResults string                                           `pulumi:"listManagedInstancesResults"`
	Name                        *string                                          `pulumi:"name"`
	NamedPorts                  []GetInstanceGroupManagerNamedPort               `pulumi:"namedPorts"`
	Operation                   string                                           `pulumi:"operation"`
	Project                     *string                                          `pulumi:"project"`
	SelfLink                    *string                                          `pulumi:"selfLink"`
	StatefulDisks               []GetInstanceGroupManagerStatefulDisk            `pulumi:"statefulDisks"`
	StatefulExternalIps         []GetInstanceGroupManagerStatefulExternalIp      `pulumi:"statefulExternalIps"`
	StatefulInternalIps         []GetInstanceGroupManagerStatefulInternalIp      `pulumi:"statefulInternalIps"`
	Statuses                    []GetInstanceGroupManagerStatus                  `pulumi:"statuses"`
	TargetPools                 []string                                         `pulumi:"targetPools"`
	TargetSize                  int                                              `pulumi:"targetSize"`
	UpdatePolicies              []GetInstanceGroupManagerUpdatePolicy            `pulumi:"updatePolicies"`
	Versions                    []GetInstanceGroupManagerVersion                 `pulumi:"versions"`
	WaitForInstances            bool                                             `pulumi:"waitForInstances"`
	WaitForInstancesStatus      string                                           `pulumi:"waitForInstancesStatus"`
	Zone                        *string                                          `pulumi:"zone"`
}

func LookupInstanceGroupManagerOutput(ctx *pulumi.Context, args LookupInstanceGroupManagerOutputArgs, opts ...pulumi.InvokeOption) LookupInstanceGroupManagerResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupInstanceGroupManagerResult, error) {
			args := v.(LookupInstanceGroupManagerArgs)
			r, err := LookupInstanceGroupManager(ctx, &args, opts...)
			var s LookupInstanceGroupManagerResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupInstanceGroupManagerResultOutput)
}

// A collection of arguments for invoking getInstanceGroupManager.
type LookupInstanceGroupManagerOutputArgs struct {
	// The name of the instance group. Either `name` or `selfLink` must be provided.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// The ID of the project in which the resource belongs. If it is not provided, the provider project is used.
	Project pulumi.StringPtrInput `pulumi:"project"`
	// The self link of the instance group. Either `name` or `selfLink` must be provided.
	SelfLink pulumi.StringPtrInput `pulumi:"selfLink"`
	// The zone of the instance group. If referencing the instance group by name and `zone` is not provided, the provider zone is used.
	Zone pulumi.StringPtrInput `pulumi:"zone"`
}

func (LookupInstanceGroupManagerOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInstanceGroupManagerArgs)(nil)).Elem()
}

// A collection of values returned by getInstanceGroupManager.
type LookupInstanceGroupManagerResultOutput struct{ *pulumi.OutputState }

func (LookupInstanceGroupManagerResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupInstanceGroupManagerResult)(nil)).Elem()
}

func (o LookupInstanceGroupManagerResultOutput) ToLookupInstanceGroupManagerResultOutput() LookupInstanceGroupManagerResultOutput {
	return o
}

func (o LookupInstanceGroupManagerResultOutput) ToLookupInstanceGroupManagerResultOutputWithContext(ctx context.Context) LookupInstanceGroupManagerResultOutput {
	return o
}

func (o LookupInstanceGroupManagerResultOutput) AllInstancesConfigs() GetInstanceGroupManagerAllInstancesConfigArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerAllInstancesConfig {
		return v.AllInstancesConfigs
	}).(GetInstanceGroupManagerAllInstancesConfigArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) AutoHealingPolicies() GetInstanceGroupManagerAutoHealingPolicyArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerAutoHealingPolicy {
		return v.AutoHealingPolicies
	}).(GetInstanceGroupManagerAutoHealingPolicyArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) BaseInstanceName() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) string { return v.BaseInstanceName }).(pulumi.StringOutput)
}

func (o LookupInstanceGroupManagerResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) string { return v.Description }).(pulumi.StringOutput)
}

func (o LookupInstanceGroupManagerResultOutput) Fingerprint() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) string { return v.Fingerprint }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupInstanceGroupManagerResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupInstanceGroupManagerResultOutput) InstanceGroup() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) string { return v.InstanceGroup }).(pulumi.StringOutput)
}

func (o LookupInstanceGroupManagerResultOutput) InstanceLifecyclePolicies() GetInstanceGroupManagerInstanceLifecyclePolicyArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerInstanceLifecyclePolicy {
		return v.InstanceLifecyclePolicies
	}).(GetInstanceGroupManagerInstanceLifecyclePolicyArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) ListManagedInstancesResults() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) string { return v.ListManagedInstancesResults }).(pulumi.StringOutput)
}

func (o LookupInstanceGroupManagerResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

func (o LookupInstanceGroupManagerResultOutput) NamedPorts() GetInstanceGroupManagerNamedPortArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerNamedPort { return v.NamedPorts }).(GetInstanceGroupManagerNamedPortArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) Operation() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) string { return v.Operation }).(pulumi.StringOutput)
}

func (o LookupInstanceGroupManagerResultOutput) Project() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) *string { return v.Project }).(pulumi.StringPtrOutput)
}

func (o LookupInstanceGroupManagerResultOutput) SelfLink() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) *string { return v.SelfLink }).(pulumi.StringPtrOutput)
}

func (o LookupInstanceGroupManagerResultOutput) StatefulDisks() GetInstanceGroupManagerStatefulDiskArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerStatefulDisk { return v.StatefulDisks }).(GetInstanceGroupManagerStatefulDiskArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) StatefulExternalIps() GetInstanceGroupManagerStatefulExternalIpArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerStatefulExternalIp {
		return v.StatefulExternalIps
	}).(GetInstanceGroupManagerStatefulExternalIpArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) StatefulInternalIps() GetInstanceGroupManagerStatefulInternalIpArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerStatefulInternalIp {
		return v.StatefulInternalIps
	}).(GetInstanceGroupManagerStatefulInternalIpArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) Statuses() GetInstanceGroupManagerStatusArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerStatus { return v.Statuses }).(GetInstanceGroupManagerStatusArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) TargetPools() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []string { return v.TargetPools }).(pulumi.StringArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) TargetSize() pulumi.IntOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) int { return v.TargetSize }).(pulumi.IntOutput)
}

func (o LookupInstanceGroupManagerResultOutput) UpdatePolicies() GetInstanceGroupManagerUpdatePolicyArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerUpdatePolicy {
		return v.UpdatePolicies
	}).(GetInstanceGroupManagerUpdatePolicyArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) Versions() GetInstanceGroupManagerVersionArrayOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) []GetInstanceGroupManagerVersion { return v.Versions }).(GetInstanceGroupManagerVersionArrayOutput)
}

func (o LookupInstanceGroupManagerResultOutput) WaitForInstances() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) bool { return v.WaitForInstances }).(pulumi.BoolOutput)
}

func (o LookupInstanceGroupManagerResultOutput) WaitForInstancesStatus() pulumi.StringOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) string { return v.WaitForInstancesStatus }).(pulumi.StringOutput)
}

func (o LookupInstanceGroupManagerResultOutput) Zone() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupInstanceGroupManagerResult) *string { return v.Zone }).(pulumi.StringPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupInstanceGroupManagerResultOutput{})
}
