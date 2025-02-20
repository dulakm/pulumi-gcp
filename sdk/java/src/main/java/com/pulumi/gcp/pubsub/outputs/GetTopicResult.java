// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.pubsub.outputs.GetTopicMessageStoragePolicy;
import com.pulumi.gcp.pubsub.outputs.GetTopicSchemaSetting;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetTopicResult {
    private Map<String,String> effectiveLabels;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String kmsKeyName;
    private Map<String,String> labels;
    private String messageRetentionDuration;
    private List<GetTopicMessageStoragePolicy> messageStoragePolicies;
    private String name;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private List<GetTopicSchemaSetting> schemaSettings;

    private GetTopicResult() {}
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String messageRetentionDuration() {
        return this.messageRetentionDuration;
    }
    public List<GetTopicMessageStoragePolicy> messageStoragePolicies() {
        return this.messageStoragePolicies;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Map<String,String> pulumiLabels() {
        return this.pulumiLabels;
    }
    public List<GetTopicSchemaSetting> schemaSettings() {
        return this.schemaSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> effectiveLabels;
        private String id;
        private String kmsKeyName;
        private Map<String,String> labels;
        private String messageRetentionDuration;
        private List<GetTopicMessageStoragePolicy> messageStoragePolicies;
        private String name;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private List<GetTopicSchemaSetting> schemaSettings;
        public Builder() {}
        public Builder(GetTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.id = defaults.id;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.labels = defaults.labels;
    	      this.messageRetentionDuration = defaults.messageRetentionDuration;
    	      this.messageStoragePolicies = defaults.messageStoragePolicies;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.schemaSettings = defaults.schemaSettings;
        }

        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            this.effectiveLabels = Objects.requireNonNull(effectiveLabels);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder messageRetentionDuration(String messageRetentionDuration) {
            this.messageRetentionDuration = Objects.requireNonNull(messageRetentionDuration);
            return this;
        }
        @CustomType.Setter
        public Builder messageStoragePolicies(List<GetTopicMessageStoragePolicy> messageStoragePolicies) {
            this.messageStoragePolicies = Objects.requireNonNull(messageStoragePolicies);
            return this;
        }
        public Builder messageStoragePolicies(GetTopicMessageStoragePolicy... messageStoragePolicies) {
            return messageStoragePolicies(List.of(messageStoragePolicies));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder pulumiLabels(Map<String,String> pulumiLabels) {
            this.pulumiLabels = Objects.requireNonNull(pulumiLabels);
            return this;
        }
        @CustomType.Setter
        public Builder schemaSettings(List<GetTopicSchemaSetting> schemaSettings) {
            this.schemaSettings = Objects.requireNonNull(schemaSettings);
            return this;
        }
        public Builder schemaSettings(GetTopicSchemaSetting... schemaSettings) {
            return schemaSettings(List.of(schemaSettings));
        }
        public GetTopicResult build() {
            final var o = new GetTopicResult();
            o.effectiveLabels = effectiveLabels;
            o.id = id;
            o.kmsKeyName = kmsKeyName;
            o.labels = labels;
            o.messageRetentionDuration = messageRetentionDuration;
            o.messageStoragePolicies = messageStoragePolicies;
            o.name = name;
            o.project = project;
            o.pulumiLabels = pulumiLabels;
            o.schemaSettings = schemaSettings;
            return o;
        }
    }
}
