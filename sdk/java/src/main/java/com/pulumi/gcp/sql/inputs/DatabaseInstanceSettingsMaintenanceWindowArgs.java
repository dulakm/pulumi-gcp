// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.sql.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseInstanceSettingsMaintenanceWindowArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceSettingsMaintenanceWindowArgs Empty = new DatabaseInstanceSettingsMaintenanceWindowArgs();

    /**
     * Day of week (`1-7`), starting on Monday
     * 
     */
    @Import(name="day")
    private @Nullable Output<Integer> day;

    /**
     * @return Day of week (`1-7`), starting on Monday
     * 
     */
    public Optional<Output<Integer>> day() {
        return Optional.ofNullable(this.day);
    }

    /**
     * Hour of day (`0-23`), ignored if `day` not set
     * 
     */
    @Import(name="hour")
    private @Nullable Output<Integer> hour;

    /**
     * @return Hour of day (`0-23`), ignored if `day` not set
     * 
     */
    public Optional<Output<Integer>> hour() {
        return Optional.ofNullable(this.hour);
    }

    /**
     * Receive updates earlier (`canary`) or later
     * (`stable`)
     * 
     * The optional `settings.insights_config` subblock for instances declares Query Insights([MySQL](https://cloud.google.com/sql/docs/mysql/using-query-insights), [PostgreSQL](https://cloud.google.com/sql/docs/postgres/using-query-insights)) configuration. It contains:
     * 
     */
    @Import(name="updateTrack")
    private @Nullable Output<String> updateTrack;

    /**
     * @return Receive updates earlier (`canary`) or later
     * (`stable`)
     * 
     * The optional `settings.insights_config` subblock for instances declares Query Insights([MySQL](https://cloud.google.com/sql/docs/mysql/using-query-insights), [PostgreSQL](https://cloud.google.com/sql/docs/postgres/using-query-insights)) configuration. It contains:
     * 
     */
    public Optional<Output<String>> updateTrack() {
        return Optional.ofNullable(this.updateTrack);
    }

    private DatabaseInstanceSettingsMaintenanceWindowArgs() {}

    private DatabaseInstanceSettingsMaintenanceWindowArgs(DatabaseInstanceSettingsMaintenanceWindowArgs $) {
        this.day = $.day;
        this.hour = $.hour;
        this.updateTrack = $.updateTrack;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseInstanceSettingsMaintenanceWindowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseInstanceSettingsMaintenanceWindowArgs $;

        public Builder() {
            $ = new DatabaseInstanceSettingsMaintenanceWindowArgs();
        }

        public Builder(DatabaseInstanceSettingsMaintenanceWindowArgs defaults) {
            $ = new DatabaseInstanceSettingsMaintenanceWindowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param day Day of week (`1-7`), starting on Monday
         * 
         * @return builder
         * 
         */
        public Builder day(@Nullable Output<Integer> day) {
            $.day = day;
            return this;
        }

        /**
         * @param day Day of week (`1-7`), starting on Monday
         * 
         * @return builder
         * 
         */
        public Builder day(Integer day) {
            return day(Output.of(day));
        }

        /**
         * @param hour Hour of day (`0-23`), ignored if `day` not set
         * 
         * @return builder
         * 
         */
        public Builder hour(@Nullable Output<Integer> hour) {
            $.hour = hour;
            return this;
        }

        /**
         * @param hour Hour of day (`0-23`), ignored if `day` not set
         * 
         * @return builder
         * 
         */
        public Builder hour(Integer hour) {
            return hour(Output.of(hour));
        }

        /**
         * @param updateTrack Receive updates earlier (`canary`) or later
         * (`stable`)
         * 
         * The optional `settings.insights_config` subblock for instances declares Query Insights([MySQL](https://cloud.google.com/sql/docs/mysql/using-query-insights), [PostgreSQL](https://cloud.google.com/sql/docs/postgres/using-query-insights)) configuration. It contains:
         * 
         * @return builder
         * 
         */
        public Builder updateTrack(@Nullable Output<String> updateTrack) {
            $.updateTrack = updateTrack;
            return this;
        }

        /**
         * @param updateTrack Receive updates earlier (`canary`) or later
         * (`stable`)
         * 
         * The optional `settings.insights_config` subblock for instances declares Query Insights([MySQL](https://cloud.google.com/sql/docs/mysql/using-query-insights), [PostgreSQL](https://cloud.google.com/sql/docs/postgres/using-query-insights)) configuration. It contains:
         * 
         * @return builder
         * 
         */
        public Builder updateTrack(String updateTrack) {
            return updateTrack(Output.of(updateTrack));
        }

        public DatabaseInstanceSettingsMaintenanceWindowArgs build() {
            return $;
        }
    }

}
