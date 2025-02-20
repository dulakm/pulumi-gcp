// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SloRequestBasedSliGoodTotalRatioArgs extends com.pulumi.resources.ResourceArgs {

    public static final SloRequestBasedSliGoodTotalRatioArgs Empty = new SloRequestBasedSliGoodTotalRatioArgs();

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying bad service provided, either demanded service that
     * was not provided or demanded service that was of inadequate
     * quality. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="badServiceFilter")
    private @Nullable Output<String> badServiceFilter;

    /**
     * @return A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying bad service provided, either demanded service that
     * was not provided or demanded service that was of inadequate
     * quality. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Optional<Output<String>> badServiceFilter() {
        return Optional.ofNullable(this.badServiceFilter);
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying good service provided. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="goodServiceFilter")
    private @Nullable Output<String> goodServiceFilter;

    /**
     * @return A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying good service provided. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Optional<Output<String>> goodServiceFilter() {
        return Optional.ofNullable(this.goodServiceFilter);
    }

    /**
     * A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying total demanded service. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    @Import(name="totalServiceFilter")
    private @Nullable Output<String> totalServiceFilter;

    /**
     * @return A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * quantifying total demanded service. Exactly two of
     * good, bad, or total service filter must be defined (where
     * good + bad = total is assumed)
     * Must have ValueType = DOUBLE or ValueType = INT64 and
     * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
     * 
     */
    public Optional<Output<String>> totalServiceFilter() {
        return Optional.ofNullable(this.totalServiceFilter);
    }

    private SloRequestBasedSliGoodTotalRatioArgs() {}

    private SloRequestBasedSliGoodTotalRatioArgs(SloRequestBasedSliGoodTotalRatioArgs $) {
        this.badServiceFilter = $.badServiceFilter;
        this.goodServiceFilter = $.goodServiceFilter;
        this.totalServiceFilter = $.totalServiceFilter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloRequestBasedSliGoodTotalRatioArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloRequestBasedSliGoodTotalRatioArgs $;

        public Builder() {
            $ = new SloRequestBasedSliGoodTotalRatioArgs();
        }

        public Builder(SloRequestBasedSliGoodTotalRatioArgs defaults) {
            $ = new SloRequestBasedSliGoodTotalRatioArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param badServiceFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * quantifying bad service provided, either demanded service that
         * was not provided or demanded service that was of inadequate
         * quality. Exactly two of
         * good, bad, or total service filter must be defined (where
         * good + bad = total is assumed)
         * Must have ValueType = DOUBLE or ValueType = INT64 and
         * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder badServiceFilter(@Nullable Output<String> badServiceFilter) {
            $.badServiceFilter = badServiceFilter;
            return this;
        }

        /**
         * @param badServiceFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * quantifying bad service provided, either demanded service that
         * was not provided or demanded service that was of inadequate
         * quality. Exactly two of
         * good, bad, or total service filter must be defined (where
         * good + bad = total is assumed)
         * Must have ValueType = DOUBLE or ValueType = INT64 and
         * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder badServiceFilter(String badServiceFilter) {
            return badServiceFilter(Output.of(badServiceFilter));
        }

        /**
         * @param goodServiceFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * quantifying good service provided. Exactly two of
         * good, bad, or total service filter must be defined (where
         * good + bad = total is assumed)
         * Must have ValueType = DOUBLE or ValueType = INT64 and
         * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder goodServiceFilter(@Nullable Output<String> goodServiceFilter) {
            $.goodServiceFilter = goodServiceFilter;
            return this;
        }

        /**
         * @param goodServiceFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * quantifying good service provided. Exactly two of
         * good, bad, or total service filter must be defined (where
         * good + bad = total is assumed)
         * Must have ValueType = DOUBLE or ValueType = INT64 and
         * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder goodServiceFilter(String goodServiceFilter) {
            return goodServiceFilter(Output.of(goodServiceFilter));
        }

        /**
         * @param totalServiceFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * quantifying total demanded service. Exactly two of
         * good, bad, or total service filter must be defined (where
         * good + bad = total is assumed)
         * Must have ValueType = DOUBLE or ValueType = INT64 and
         * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder totalServiceFilter(@Nullable Output<String> totalServiceFilter) {
            $.totalServiceFilter = totalServiceFilter;
            return this;
        }

        /**
         * @param totalServiceFilter A TimeSeries [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
         * quantifying total demanded service. Exactly two of
         * good, bad, or total service filter must be defined (where
         * good + bad = total is assumed)
         * Must have ValueType = DOUBLE or ValueType = INT64 and
         * must have MetricKind = DELTA or MetricKind = CUMULATIVE.
         * 
         * @return builder
         * 
         */
        public Builder totalServiceFilter(String totalServiceFilter) {
            return totalServiceFilter(Output.of(totalServiceFilter));
        }

        public SloRequestBasedSliGoodTotalRatioArgs build() {
            return $;
        }
    }

}
