// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionThresholdAggregation;
import com.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionThresholdDenominatorAggregation;
import com.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionThresholdForecastOptions;
import com.pulumi.gcp.monitoring.outputs.AlertPolicyConditionConditionThresholdTrigger;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertPolicyConditionConditionThreshold {
    /**
     * @return Specifies the alignment of data points in
     * individual time series as well as how to
     * combine the retrieved time series together
     * (such as when aggregating multiple streams
     * on each resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).
     * Multiple aggregations are applied in the
     * order specified.This field is similar to the
     * one in the MetricService.ListTimeSeries
     * request. It is advisable to use the
     * ListTimeSeries method when debugging this
     * field.
     * Structure is documented below.
     * 
     */
    private @Nullable List<AlertPolicyConditionConditionThresholdAggregation> aggregations;
    /**
     * @return The comparison to apply between the time
     * series (indicated by filter and aggregation)
     * and the threshold (indicated by
     * threshold_value). The comparison is applied
     * on each time series, with the time series on
     * the left-hand side and the threshold on the
     * right-hand side. Only COMPARISON_LT and
     * COMPARISON_GT are supported currently.
     * Possible values are: `COMPARISON_GT`, `COMPARISON_GE`, `COMPARISON_LT`, `COMPARISON_LE`, `COMPARISON_EQ`, `COMPARISON_NE`.
     * 
     */
    private String comparison;
    /**
     * @return Specifies the alignment of data points in
     * individual time series selected by
     * denominatorFilter as well as how to combine
     * the retrieved time series together (such as
     * when aggregating multiple streams on each
     * resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).When
     * computing ratios, the aggregations and
     * denominator_aggregations fields must use the
     * same alignment period and produce time
     * series that have the same periodicity and
     * labels.This field is similar to the one in
     * the MetricService.ListTimeSeries request. It
     * is advisable to use the ListTimeSeries
     * method when debugging this field.
     * Structure is documented below.
     * 
     */
    private @Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregation> denominatorAggregations;
    /**
     * @return A filter that identifies a time series that
     * should be used as the denominator of a ratio
     * that will be compared with the threshold. If
     * a denominator_filter is specified, the time
     * series specified by the filter field will be
     * used as the numerator.The filter is similar
     * to the one that is specified in the
     * MetricService.ListTimeSeries request (that
     * call is useful to verify the time series
     * that will be retrieved / processed) and must
     * specify the metric type and optionally may
     * contain restrictions on resource type,
     * resource labels, and metric labels. This
     * field may not exceed 2048 Unicode characters
     * in length.
     * 
     */
    private @Nullable String denominatorFilter;
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
     * @return A filter that identifies which time series
     * should be compared with the threshold.The
     * filter is similar to the one that is
     * specified in the
     * MetricService.ListTimeSeries request (that
     * call is useful to verify the time series
     * that will be retrieved / processed) and must
     * specify the metric type and optionally may
     * contain restrictions on resource type,
     * resource labels, and metric labels. This
     * field may not exceed 2048 Unicode characters
     * in length.
     * 
     */
    private @Nullable String filter;
    /**
     * @return When this field is present, the `MetricThreshold`
     * condition forecasts whether the time series is
     * predicted to violate the threshold within the
     * `forecastHorizon`. When this field is not set, the
     * `MetricThreshold` tests the current value of the
     * timeseries against the threshold.
     * Structure is documented below.
     * 
     */
    private @Nullable AlertPolicyConditionConditionThresholdForecastOptions forecastOptions;
    /**
     * @return A value against which to compare the time
     * series.
     * 
     */
    private @Nullable Double thresholdValue;
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
    private @Nullable AlertPolicyConditionConditionThresholdTrigger trigger;

    private AlertPolicyConditionConditionThreshold() {}
    /**
     * @return Specifies the alignment of data points in
     * individual time series as well as how to
     * combine the retrieved time series together
     * (such as when aggregating multiple streams
     * on each resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).
     * Multiple aggregations are applied in the
     * order specified.This field is similar to the
     * one in the MetricService.ListTimeSeries
     * request. It is advisable to use the
     * ListTimeSeries method when debugging this
     * field.
     * Structure is documented below.
     * 
     */
    public List<AlertPolicyConditionConditionThresholdAggregation> aggregations() {
        return this.aggregations == null ? List.of() : this.aggregations;
    }
    /**
     * @return The comparison to apply between the time
     * series (indicated by filter and aggregation)
     * and the threshold (indicated by
     * threshold_value). The comparison is applied
     * on each time series, with the time series on
     * the left-hand side and the threshold on the
     * right-hand side. Only COMPARISON_LT and
     * COMPARISON_GT are supported currently.
     * Possible values are: `COMPARISON_GT`, `COMPARISON_GE`, `COMPARISON_LT`, `COMPARISON_LE`, `COMPARISON_EQ`, `COMPARISON_NE`.
     * 
     */
    public String comparison() {
        return this.comparison;
    }
    /**
     * @return Specifies the alignment of data points in
     * individual time series selected by
     * denominatorFilter as well as how to combine
     * the retrieved time series together (such as
     * when aggregating multiple streams on each
     * resource to a single stream for each
     * resource or when aggregating streams across
     * all members of a group of resources).When
     * computing ratios, the aggregations and
     * denominator_aggregations fields must use the
     * same alignment period and produce time
     * series that have the same periodicity and
     * labels.This field is similar to the one in
     * the MetricService.ListTimeSeries request. It
     * is advisable to use the ListTimeSeries
     * method when debugging this field.
     * Structure is documented below.
     * 
     */
    public List<AlertPolicyConditionConditionThresholdDenominatorAggregation> denominatorAggregations() {
        return this.denominatorAggregations == null ? List.of() : this.denominatorAggregations;
    }
    /**
     * @return A filter that identifies a time series that
     * should be used as the denominator of a ratio
     * that will be compared with the threshold. If
     * a denominator_filter is specified, the time
     * series specified by the filter field will be
     * used as the numerator.The filter is similar
     * to the one that is specified in the
     * MetricService.ListTimeSeries request (that
     * call is useful to verify the time series
     * that will be retrieved / processed) and must
     * specify the metric type and optionally may
     * contain restrictions on resource type,
     * resource labels, and metric labels. This
     * field may not exceed 2048 Unicode characters
     * in length.
     * 
     */
    public Optional<String> denominatorFilter() {
        return Optional.ofNullable(this.denominatorFilter);
    }
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
     * @return A filter that identifies which time series
     * should be compared with the threshold.The
     * filter is similar to the one that is
     * specified in the
     * MetricService.ListTimeSeries request (that
     * call is useful to verify the time series
     * that will be retrieved / processed) and must
     * specify the metric type and optionally may
     * contain restrictions on resource type,
     * resource labels, and metric labels. This
     * field may not exceed 2048 Unicode characters
     * in length.
     * 
     */
    public Optional<String> filter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * @return When this field is present, the `MetricThreshold`
     * condition forecasts whether the time series is
     * predicted to violate the threshold within the
     * `forecastHorizon`. When this field is not set, the
     * `MetricThreshold` tests the current value of the
     * timeseries against the threshold.
     * Structure is documented below.
     * 
     */
    public Optional<AlertPolicyConditionConditionThresholdForecastOptions> forecastOptions() {
        return Optional.ofNullable(this.forecastOptions);
    }
    /**
     * @return A value against which to compare the time
     * series.
     * 
     */
    public Optional<Double> thresholdValue() {
        return Optional.ofNullable(this.thresholdValue);
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
    public Optional<AlertPolicyConditionConditionThresholdTrigger> trigger() {
        return Optional.ofNullable(this.trigger);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertPolicyConditionConditionThreshold defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<AlertPolicyConditionConditionThresholdAggregation> aggregations;
        private String comparison;
        private @Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregation> denominatorAggregations;
        private @Nullable String denominatorFilter;
        private String duration;
        private @Nullable String evaluationMissingData;
        private @Nullable String filter;
        private @Nullable AlertPolicyConditionConditionThresholdForecastOptions forecastOptions;
        private @Nullable Double thresholdValue;
        private @Nullable AlertPolicyConditionConditionThresholdTrigger trigger;
        public Builder() {}
        public Builder(AlertPolicyConditionConditionThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregations = defaults.aggregations;
    	      this.comparison = defaults.comparison;
    	      this.denominatorAggregations = defaults.denominatorAggregations;
    	      this.denominatorFilter = defaults.denominatorFilter;
    	      this.duration = defaults.duration;
    	      this.evaluationMissingData = defaults.evaluationMissingData;
    	      this.filter = defaults.filter;
    	      this.forecastOptions = defaults.forecastOptions;
    	      this.thresholdValue = defaults.thresholdValue;
    	      this.trigger = defaults.trigger;
        }

        @CustomType.Setter
        public Builder aggregations(@Nullable List<AlertPolicyConditionConditionThresholdAggregation> aggregations) {
            this.aggregations = aggregations;
            return this;
        }
        public Builder aggregations(AlertPolicyConditionConditionThresholdAggregation... aggregations) {
            return aggregations(List.of(aggregations));
        }
        @CustomType.Setter
        public Builder comparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }
        @CustomType.Setter
        public Builder denominatorAggregations(@Nullable List<AlertPolicyConditionConditionThresholdDenominatorAggregation> denominatorAggregations) {
            this.denominatorAggregations = denominatorAggregations;
            return this;
        }
        public Builder denominatorAggregations(AlertPolicyConditionConditionThresholdDenominatorAggregation... denominatorAggregations) {
            return denominatorAggregations(List.of(denominatorAggregations));
        }
        @CustomType.Setter
        public Builder denominatorFilter(@Nullable String denominatorFilter) {
            this.denominatorFilter = denominatorFilter;
            return this;
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
        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        @CustomType.Setter
        public Builder forecastOptions(@Nullable AlertPolicyConditionConditionThresholdForecastOptions forecastOptions) {
            this.forecastOptions = forecastOptions;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdValue(@Nullable Double thresholdValue) {
            this.thresholdValue = thresholdValue;
            return this;
        }
        @CustomType.Setter
        public Builder trigger(@Nullable AlertPolicyConditionConditionThresholdTrigger trigger) {
            this.trigger = trigger;
            return this;
        }
        public AlertPolicyConditionConditionThreshold build() {
            final var o = new AlertPolicyConditionConditionThreshold();
            o.aggregations = aggregations;
            o.comparison = comparison;
            o.denominatorAggregations = denominatorAggregations;
            o.denominatorFilter = denominatorFilter;
            o.duration = duration;
            o.evaluationMissingData = evaluationMissingData;
            o.filter = filter;
            o.forecastOptions = forecastOptions;
            o.thresholdValue = thresholdValue;
            o.trigger = trigger;
            return o;
        }
    }
}
