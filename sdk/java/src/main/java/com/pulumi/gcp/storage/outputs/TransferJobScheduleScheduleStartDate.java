// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class TransferJobScheduleScheduleStartDate {
    /**
     * @return Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     * &lt;a name=&#34;nested_start_time_of_day&#34;&gt;&lt;/a&gt;The `start_time_of_day` blocks support:
     * 
     */
    private Integer day;
    /**
     * @return Month of year. Must be from 1 to 12.
     * 
     */
    private Integer month;
    /**
     * @return Year of date. Must be from 1 to 9999.
     * 
     */
    private Integer year;

    private TransferJobScheduleScheduleStartDate() {}
    /**
     * @return Day of month. Must be from 1 to 31 and valid for the year and month.
     * 
     * &lt;a name=&#34;nested_start_time_of_day&#34;&gt;&lt;/a&gt;The `start_time_of_day` blocks support:
     * 
     */
    public Integer day() {
        return this.day;
    }
    /**
     * @return Month of year. Must be from 1 to 12.
     * 
     */
    public Integer month() {
        return this.month;
    }
    /**
     * @return Year of date. Must be from 1 to 9999.
     * 
     */
    public Integer year() {
        return this.year;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobScheduleScheduleStartDate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer day;
        private Integer month;
        private Integer year;
        public Builder() {}
        public Builder(TransferJobScheduleScheduleStartDate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.day = defaults.day;
    	      this.month = defaults.month;
    	      this.year = defaults.year;
        }

        @CustomType.Setter
        public Builder day(Integer day) {
            this.day = Objects.requireNonNull(day);
            return this;
        }
        @CustomType.Setter
        public Builder month(Integer month) {
            this.month = Objects.requireNonNull(month);
            return this;
        }
        @CustomType.Setter
        public Builder year(Integer year) {
            this.year = Objects.requireNonNull(year);
            return this;
        }
        public TransferJobScheduleScheduleStartDate build() {
            final var o = new TransferJobScheduleScheduleStartDate();
            o.day = day;
            o.month = month;
            o.year = year;
            return o;
        }
    }
}
