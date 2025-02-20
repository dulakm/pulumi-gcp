// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionMonitoringQueryLanguageTrigger;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertPolicyConditionConditionMonitoringQueryLanguage {
    /**
     * @return The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    private String duration;
    /**
     * @return A condition control that determines how
     * metric-threshold conditions are evaluated when
     * data stops arriving.
     * Possible values are: `EVALUATION_MISSING_DATA_INACTIVE`, `EVALUATION_MISSING_DATA_ACTIVE`, `EVALUATION_MISSING_DATA_NO_OP`.
     * 
     */
    private @Nullable String evaluationMissingData;
    /**
     * @return Monitoring Query Language query that outputs a boolean stream.
     * 
     */
    private String query;
    /**
     * @return The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    private @Nullable AlertPolicyConditionConditionMonitoringQueryLanguageTrigger trigger;

    private AlertPolicyConditionConditionMonitoringQueryLanguage() {}
    /**
     * @return The amount of time that a time series must
     * violate the threshold to be considered
     * failing. Currently, only values that are a
     * multiple of a minute--e.g., 0, 60, 120, or
     * 300 seconds--are supported. If an invalid
     * value is given, an error will be returned.
     * When choosing a duration, it is useful to
     * keep in mind the frequency of the underlying
     * time series data (which may also be affected
     * by any alignments specified in the
     * aggregations field); a good duration is long
     * enough so that a single outlier does not
     * generate spurious alerts, but short enough
     * that unhealthy states are detected and
     * alerted on quickly.
     * 
     */
    public String duration() {
        return this.duration;
    }
    /**
     * @return A condition control that determines how
     * metric-threshold conditions are evaluated when
     * data stops arriving.
     * Possible values are: `EVALUATION_MISSING_DATA_INACTIVE`, `EVALUATION_MISSING_DATA_ACTIVE`, `EVALUATION_MISSING_DATA_NO_OP`.
     * 
     */
    public Optional<String> evaluationMissingData() {
        return Optional.ofNullable(this.evaluationMissingData);
    }
    /**
     * @return Monitoring Query Language query that outputs a boolean stream.
     * 
     */
    public String query() {
        return this.query;
    }
    /**
     * @return The number/percent of time series for which
     * the comparison must hold in order for the
     * condition to trigger. If unspecified, then
     * the condition will trigger if the comparison
     * is true for any of the time series that have
     * been identified by filter and aggregations,
     * or by the ratio, if denominator_filter and
     * denominator_aggregations are specified.
     * Structure is documented below.
     * 
     */
    public Optional<AlertPolicyConditionConditionMonitoringQueryLanguageTrigger> trigger() {
        return Optional.ofNullable(this.trigger);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionMonitoringQueryLanguage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String duration;
        private @Nullable String evaluationMissingData;
        private String query;
        private @Nullable AlertPolicyConditionConditionMonitoringQueryLanguageTrigger trigger;
        public Builder() {}
        public Builder(AlertPolicyConditionConditionMonitoringQueryLanguage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.evaluationMissingData = defaults.evaluationMissingData;
    	      this.query = defaults.query;
    	      this.trigger = defaults.trigger;
        }

        @CustomType.Setter
        public Builder duration(String duration) {
            this.duration = Objects.requireNonNull(duration);
            return this;
        }
        @CustomType.Setter
        public Builder evaluationMissingData(@Nullable String evaluationMissingData) {
            this.evaluationMissingData = evaluationMissingData;
            return this;
        }
        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        @CustomType.Setter
        public Builder trigger(@Nullable AlertPolicyConditionConditionMonitoringQueryLanguageTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public AlertPolicyConditionConditionMonitoringQueryLanguage build() {
            final var o = new AlertPolicyConditionConditionMonitoringQueryLanguage();
            o.duration = duration;
            o.evaluationMissingData = evaluationMissingData;
            o.query = query;
            o.trigger = trigger;
            return o;
        }
    }
}
