// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Firebase.Inputs
{

    public sealed class HostingCustomDomainIssueArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The status code, which should be an enum value of `google.rpc.Code`
        /// </summary>
        [Input("code")]
        public Input<int>? Code { get; set; }

        [Input("details")]
        private InputList<ImmutableDictionary<string, object>>? _details;

        /// <summary>
        /// A list of messages that carry the error details.
        /// </summary>
        public InputList<ImmutableDictionary<string, object>> Details
        {
            get => _details ?? (_details = new InputList<ImmutableDictionary<string, object>>());
            set => _details = value;
        }

        /// <summary>
        /// Error message
        /// </summary>
        [Input("message")]
        public Input<string>? Message { get; set; }

        public HostingCustomDomainIssueArgs()
        {
        }
        public static new HostingCustomDomainIssueArgs Empty => new HostingCustomDomainIssueArgs();
    }
}
