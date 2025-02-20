// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UptimeCheckConfigResourceGroup {
    /**
     * @return The group of resources being monitored. Should be the `name` of a group
     * 
     */
    private @Nullable String groupId;
    /**
     * @return The resource type of the group members.
     * Possible values are: `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, `AWS_ELB_LOAD_BALANCER`.
     * 
     */
    private @Nullable String resourceType;

    private UptimeCheckConfigResourceGroup() {}
    /**
     * @return The group of resources being monitored. Should be the `name` of a group
     * 
     */
    public Optional<String> groupId() {
        return Optional.ofNullable(this.groupId);
    }
    /**
     * @return The resource type of the group members.
     * Possible values are: `RESOURCE_TYPE_UNSPECIFIED`, `INSTANCE`, `AWS_ELB_LOAD_BALANCER`.
     * 
     */
    public Optional<String> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UptimeCheckConfigResourceGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String groupId;
        private @Nullable String resourceType;
        public Builder() {}
        public Builder(UptimeCheckConfigResourceGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupId = defaults.groupId;
    	      this.resourceType = defaults.resourceType;
        }

        @CustomType.Setter
        public Builder groupId(@Nullable String groupId) {
            this.groupId = groupId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public UptimeCheckConfigResourceGroup build() {
            final var o = new UptimeCheckConfigResourceGroup();
            o.groupId = groupId;
            o.resourceType = resourceType;
            return o;
        }
    }
}
