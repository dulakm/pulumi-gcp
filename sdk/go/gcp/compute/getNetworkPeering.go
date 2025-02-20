// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package compute

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-gcp/sdk/v7/go/gcp/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Get information of a specified compute network peering. For more information see
// [the official documentation](https://cloud.google.com/compute/docs/vpc/vpc-peering)
// and
// [API](https://cloud.google.com/compute/docs/reference/latest/networks).
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
//			_, err := compute.NewNetwork(ctx, "default", &compute.NetworkArgs{
//				AutoCreateSubnetworks: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			other, err := compute.NewNetwork(ctx, "other", &compute.NetworkArgs{
//				AutoCreateSubnetworks: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			peering1, err := compute.NewNetworkPeering(ctx, "peering1", &compute.NetworkPeeringArgs{
//				Network:     _default.SelfLink,
//				PeerNetwork: other.SelfLink,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = compute.NewNetworkPeering(ctx, "peering2", &compute.NetworkPeeringArgs{
//				Network:     other.SelfLink,
//				PeerNetwork: _default.SelfLink,
//			})
//			if err != nil {
//				return err
//			}
//			_ = compute.LookupNetworkPeeringOutput(ctx, compute.GetNetworkPeeringOutputArgs{
//				Name:    peering1.Name,
//				Network: peering1.Network,
//			}, nil)
//			return nil
//		})
//	}
//
// ```
func LookupNetworkPeering(ctx *pulumi.Context, args *LookupNetworkPeeringArgs, opts ...pulumi.InvokeOption) (*LookupNetworkPeeringResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv LookupNetworkPeeringResult
	err := ctx.Invoke("gcp:compute/getNetworkPeering:getNetworkPeering", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getNetworkPeering.
type LookupNetworkPeeringArgs struct {
	// Name of the peering.
	Name string `pulumi:"name"`
	// The primary network of the peering.
	Network string `pulumi:"network"`
}

// A collection of values returned by getNetworkPeering.
type LookupNetworkPeeringResult struct {
	ExportCustomRoutes             bool `pulumi:"exportCustomRoutes"`
	ExportSubnetRoutesWithPublicIp bool `pulumi:"exportSubnetRoutesWithPublicIp"`
	// The provider-assigned unique ID for this managed resource.
	Id                             string `pulumi:"id"`
	ImportCustomRoutes             bool   `pulumi:"importCustomRoutes"`
	ImportSubnetRoutesWithPublicIp bool   `pulumi:"importSubnetRoutesWithPublicIp"`
	Name                           string `pulumi:"name"`
	Network                        string `pulumi:"network"`
	PeerNetwork                    string `pulumi:"peerNetwork"`
	StackType                      string `pulumi:"stackType"`
	State                          string `pulumi:"state"`
	StateDetails                   string `pulumi:"stateDetails"`
}

func LookupNetworkPeeringOutput(ctx *pulumi.Context, args LookupNetworkPeeringOutputArgs, opts ...pulumi.InvokeOption) LookupNetworkPeeringResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupNetworkPeeringResult, error) {
			args := v.(LookupNetworkPeeringArgs)
			r, err := LookupNetworkPeering(ctx, &args, opts...)
			var s LookupNetworkPeeringResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupNetworkPeeringResultOutput)
}

// A collection of arguments for invoking getNetworkPeering.
type LookupNetworkPeeringOutputArgs struct {
	// Name of the peering.
	Name pulumi.StringInput `pulumi:"name"`
	// The primary network of the peering.
	Network pulumi.StringInput `pulumi:"network"`
}

func (LookupNetworkPeeringOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkPeeringArgs)(nil)).Elem()
}

// A collection of values returned by getNetworkPeering.
type LookupNetworkPeeringResultOutput struct{ *pulumi.OutputState }

func (LookupNetworkPeeringResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupNetworkPeeringResult)(nil)).Elem()
}

func (o LookupNetworkPeeringResultOutput) ToLookupNetworkPeeringResultOutput() LookupNetworkPeeringResultOutput {
	return o
}

func (o LookupNetworkPeeringResultOutput) ToLookupNetworkPeeringResultOutputWithContext(ctx context.Context) LookupNetworkPeeringResultOutput {
	return o
}

func (o LookupNetworkPeeringResultOutput) ExportCustomRoutes() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) bool { return v.ExportCustomRoutes }).(pulumi.BoolOutput)
}

func (o LookupNetworkPeeringResultOutput) ExportSubnetRoutesWithPublicIp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) bool { return v.ExportSubnetRoutesWithPublicIp }).(pulumi.BoolOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupNetworkPeeringResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) ImportCustomRoutes() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) bool { return v.ImportCustomRoutes }).(pulumi.BoolOutput)
}

func (o LookupNetworkPeeringResultOutput) ImportSubnetRoutesWithPublicIp() pulumi.BoolOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) bool { return v.ImportSubnetRoutesWithPublicIp }).(pulumi.BoolOutput)
}

func (o LookupNetworkPeeringResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) Network() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.Network }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) PeerNetwork() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.PeerNetwork }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) StackType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.StackType }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.State }).(pulumi.StringOutput)
}

func (o LookupNetworkPeeringResultOutput) StateDetails() pulumi.StringOutput {
	return o.ApplyT(func(v LookupNetworkPeeringResult) string { return v.StateDetails }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupNetworkPeeringResultOutput{})
}
