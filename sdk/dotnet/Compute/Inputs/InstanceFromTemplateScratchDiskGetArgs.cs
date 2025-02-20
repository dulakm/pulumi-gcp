// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceFromTemplateScratchDiskGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("deviceName")]
        public Input<string>? DeviceName { get; set; }

        [Input("interface", required: true)]
        public Input<string> Interface { get; set; } = null!;

        [Input("size")]
        public Input<int>? Size { get; set; }

        public InstanceFromTemplateScratchDiskGetArgs()
        {
        }
        public static new InstanceFromTemplateScratchDiskGetArgs Empty => new InstanceFromTemplateScratchDiskGetArgs();
    }
}
