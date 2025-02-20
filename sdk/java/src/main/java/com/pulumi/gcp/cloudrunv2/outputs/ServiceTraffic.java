// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceTraffic {
    /**
     * @return Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    private @Nullable Integer percent;
    /**
     * @return Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    private @Nullable String revision;
    /**
     * @return Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    private @Nullable String tag;
    /**
     * @return The allocation type for this traffic target.
     * Possible values are: `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST`, `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
     * 
     */
    private @Nullable String type;

    private ServiceTraffic() {}
    /**
     * @return Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    public Optional<Integer> percent() {
        return Optional.ofNullable(this.percent);
    }
    /**
     * @return Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    public Optional<String> revision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * @return Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    public Optional<String> tag() {
        return Optional.ofNullable(this.tag);
    }
    /**
     * @return The allocation type for this traffic target.
     * Possible values are: `TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST`, `TRAFFIC_TARGET_ALLOCATION_TYPE_REVISION`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTraffic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer percent;
        private @Nullable String revision;
        private @Nullable String tag;
        private @Nullable String type;
        public Builder() {}
        public Builder(ServiceTraffic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percent = defaults.percent;
    	      this.revision = defaults.revision;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder percent(@Nullable Integer percent) {
            this.percent = percent;
            return this;
        }
        @CustomType.Setter
        public Builder revision(@Nullable String revision) {
            this.revision = revision;
            return this;
        }
        @CustomType.Setter
        public Builder tag(@Nullable String tag) {
            this.tag = tag;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ServiceTraffic build() {
            final var o = new ServiceTraffic();
            o.percent = percent;
            o.revision = revision;
            o.tag = tag;
            o.type = type;
            return o;
        }
    }
}
