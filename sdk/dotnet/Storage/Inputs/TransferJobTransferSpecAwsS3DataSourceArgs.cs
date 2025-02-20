// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Storage.Inputs
{

    public sealed class TransferJobTransferSpecAwsS3DataSourceArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS credentials block.
        /// </summary>
        [Input("awsAccessKey")]
        public Input<Inputs.TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyArgs>? AwsAccessKey { get; set; }

        /// <summary>
        /// Google Cloud Storage bucket name.
        /// </summary>
        [Input("bucketName", required: true)]
        public Input<string> BucketName { get; set; } = null!;

        /// <summary>
        /// Root path to transfer objects. Must be an empty string or full path name that ends with a '/'. This field is treated as an object prefix. As such, it should generally not begin with a '/'.
        /// </summary>
        [Input("path")]
        public Input<string>? Path { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the role to support temporary credentials via 'AssumeRoleWithWebIdentity'. For more information about ARNs, see [IAM ARNs](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-arns). When a role ARN is provided, Transfer Service fetches temporary credentials for the session using a 'AssumeRoleWithWebIdentity' call for the provided role using the [GoogleServiceAccount][] for this project.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        public TransferJobTransferSpecAwsS3DataSourceArgs()
        {
        }
        public static new TransferJobTransferSpecAwsS3DataSourceArgs Empty => new TransferJobTransferSpecAwsS3DataSourceArgs();
    }
}
