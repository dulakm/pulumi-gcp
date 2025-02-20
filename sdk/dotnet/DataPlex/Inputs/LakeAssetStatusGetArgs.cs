// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataPlex.Inputs
{

    public sealed class LakeAssetStatusGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("activeAssets")]
        public Input<int>? ActiveAssets { get; set; }

        [Input("securityPolicyApplyingAssets")]
        public Input<int>? SecurityPolicyApplyingAssets { get; set; }

        /// <summary>
        /// Output only. The time when the lake was last updated.
        /// </summary>
        [Input("updateTime")]
        public Input<string>? UpdateTime { get; set; }

        public LakeAssetStatusGetArgs()
        {
        }
        public static new LakeAssetStatusGetArgs Empty => new LakeAssetStatusGetArgs();
    }
}
