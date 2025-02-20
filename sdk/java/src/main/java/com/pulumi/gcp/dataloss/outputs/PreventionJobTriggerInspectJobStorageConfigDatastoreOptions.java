// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataloss.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKind;
import com.pulumi.gcp.dataloss.outputs.PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId;
import java.util.Objects;

@CustomType
public final class PreventionJobTriggerInspectJobStorageConfigDatastoreOptions {
    /**
     * @return A representation of a Datastore kind.
     * Structure is documented below.
     * 
     */
    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKind kind;
    /**
     * @return Datastore partition ID. A partition ID identifies a grouping of entities. The grouping
     * is always by project and namespace, however the namespace ID may be empty.
     * Structure is documented below.
     * 
     */
    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId partitionId;

    private PreventionJobTriggerInspectJobStorageConfigDatastoreOptions() {}
    /**
     * @return A representation of a Datastore kind.
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKind kind() {
        return this.kind;
    }
    /**
     * @return Datastore partition ID. A partition ID identifies a grouping of entities. The grouping
     * is always by project and namespace, however the namespace ID may be empty.
     * Structure is documented below.
     * 
     */
    public PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId partitionId() {
        return this.partitionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKind kind;
        private PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId partitionId;
        public Builder() {}
        public Builder(PreventionJobTriggerInspectJobStorageConfigDatastoreOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.partitionId = defaults.partitionId;
        }

        @CustomType.Setter
        public Builder kind(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsKind kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        @CustomType.Setter
        public Builder partitionId(PreventionJobTriggerInspectJobStorageConfigDatastoreOptionsPartitionId partitionId) {
            this.partitionId = Objects.requireNonNull(partitionId);
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigDatastoreOptions build() {
            final var o = new PreventionJobTriggerInspectJobStorageConfigDatastoreOptions();
            o.kind = kind;
            o.partitionId = partitionId;
            return o;
        }
    }
}
