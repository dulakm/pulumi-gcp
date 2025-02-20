// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.DataLoss.Inputs
{

    public sealed class PreventionJobTriggerInspectJobGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions")]
        private InputList<Inputs.PreventionJobTriggerInspectJobActionGetArgs>? _actions;

        /// <summary>
        /// A task to execute on the completion of a job.
        /// Structure is documented below.
        /// </summary>
        public InputList<Inputs.PreventionJobTriggerInspectJobActionGetArgs> Actions
        {
            get => _actions ?? (_actions = new InputList<Inputs.PreventionJobTriggerInspectJobActionGetArgs>());
            set => _actions = value;
        }

        /// <summary>
        /// The core content of the template.
        /// Structure is documented below.
        /// </summary>
        [Input("inspectConfig")]
        public Input<Inputs.PreventionJobTriggerInspectJobInspectConfigGetArgs>? InspectConfig { get; set; }

        /// <summary>
        /// The name of the template to run when this job is triggered.
        /// </summary>
        [Input("inspectTemplateName")]
        public Input<string>? InspectTemplateName { get; set; }

        /// <summary>
        /// Information on where to inspect
        /// Structure is documented below.
        /// </summary>
        [Input("storageConfig", required: true)]
        public Input<Inputs.PreventionJobTriggerInspectJobStorageConfigGetArgs> StorageConfig { get; set; } = null!;

        public PreventionJobTriggerInspectJobGetArgs()
        {
        }
        public static new PreventionJobTriggerInspectJobGetArgs Empty => new PreventionJobTriggerInspectJobGetArgs();
    }
}
