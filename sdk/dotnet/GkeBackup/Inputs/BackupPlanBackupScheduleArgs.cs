// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.GkeBackup.Inputs
{

    public sealed class BackupPlanBackupScheduleArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A standard cron string that defines a repeating schedule for
        /// creating Backups via this BackupPlan.
        /// If this is defined, then backupRetainDays must also be defined.
        /// </summary>
        [Input("cronSchedule")]
        public Input<string>? CronSchedule { get; set; }

        /// <summary>
        /// This flag denotes whether automatic Backup creation is paused for this BackupPlan.
        /// </summary>
        [Input("paused")]
        public Input<bool>? Paused { get; set; }

        public BackupPlanBackupScheduleArgs()
        {
        }
        public static new BackupPlanBackupScheduleArgs Empty => new BackupPlanBackupScheduleArgs();
    }
}
