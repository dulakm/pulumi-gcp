// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Inputs
{

    public sealed class InstanceTemplateSchedulingGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether the instance should be
        /// automatically restarted if it is terminated by Compute Engine (not
        /// terminated by a user). This defaults to true.
        /// </summary>
        [Input("automaticRestart")]
        public Input<bool>? AutomaticRestart { get; set; }

        /// <summary>
        /// Describe the type of termination action for `SPOT` VM. Can be `STOP` or `DELETE`.  Read more on [here](https://cloud.google.com/compute/docs/instances/create-use-spot)
        /// </summary>
        [Input("instanceTerminationAction")]
        public Input<string>? InstanceTerminationAction { get; set; }

        [Input("localSsdRecoveryTimeouts")]
        private InputList<Inputs.InstanceTemplateSchedulingLocalSsdRecoveryTimeoutGetArgs>? _localSsdRecoveryTimeouts;
        public InputList<Inputs.InstanceTemplateSchedulingLocalSsdRecoveryTimeoutGetArgs> LocalSsdRecoveryTimeouts
        {
            get => _localSsdRecoveryTimeouts ?? (_localSsdRecoveryTimeouts = new InputList<Inputs.InstanceTemplateSchedulingLocalSsdRecoveryTimeoutGetArgs>());
            set => _localSsdRecoveryTimeouts = value;
        }

        [Input("maintenanceInterval")]
        public Input<string>? MaintenanceInterval { get; set; }

        /// <summary>
        /// Beta - The duration of the instance. Instance will run and be terminated after then, the termination action could be defined in `instance_termination_action`. Only support `DELETE` `instance_termination_action` at this point. Structure is documented below.
        /// &lt;a name="nested_max_run_duration"&gt;&lt;/a&gt;The `max_run_duration` block supports:
        /// </summary>
        [Input("maxRunDuration")]
        public Input<Inputs.InstanceTemplateSchedulingMaxRunDurationGetArgs>? MaxRunDuration { get; set; }

        [Input("minNodeCpus")]
        public Input<int>? MinNodeCpus { get; set; }

        [Input("nodeAffinities")]
        private InputList<Inputs.InstanceTemplateSchedulingNodeAffinityGetArgs>? _nodeAffinities;

        /// <summary>
        /// Specifies node affinities or anti-affinities
        /// to determine which sole-tenant nodes your instances and managed instance
        /// groups will use as host systems. Read more on sole-tenant node creation
        /// [here](https://cloud.google.com/compute/docs/nodes/create-nodes).
        /// Structure documented below.
        /// </summary>
        public InputList<Inputs.InstanceTemplateSchedulingNodeAffinityGetArgs> NodeAffinities
        {
            get => _nodeAffinities ?? (_nodeAffinities = new InputList<Inputs.InstanceTemplateSchedulingNodeAffinityGetArgs>());
            set => _nodeAffinities = value;
        }

        /// <summary>
        /// Defines the maintenance behavior for this
        /// instance.
        /// </summary>
        [Input("onHostMaintenance")]
        public Input<string>? OnHostMaintenance { get; set; }

        /// <summary>
        /// Allows instance to be preempted. This defaults to
        /// false. Read more on this
        /// [here](https://cloud.google.com/compute/docs/instances/preemptible).
        /// </summary>
        [Input("preemptible")]
        public Input<bool>? Preemptible { get; set; }

        /// <summary>
        /// Describe the type of preemptible VM. This field accepts the value `STANDARD` or `SPOT`. If the value is `STANDARD`, there will be no discount. If this   is set to `SPOT`,
        /// `preemptible` should be `true` and `automatic_restart` should be
        /// `false`. For more info about
        /// `SPOT`, read [here](https://cloud.google.com/compute/docs/instances/spot)
        /// </summary>
        [Input("provisioningModel")]
        public Input<string>? ProvisioningModel { get; set; }

        public InstanceTemplateSchedulingGetArgs()
        {
        }
        public static new InstanceTemplateSchedulingGetArgs Empty => new InstanceTemplateSchedulingGetArgs();
    }
}
