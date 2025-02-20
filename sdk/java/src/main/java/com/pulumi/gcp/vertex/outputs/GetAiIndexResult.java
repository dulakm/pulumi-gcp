// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.vertex.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.vertex.outputs.GetAiIndexDeployedIndex;
import com.pulumi.gcp.vertex.outputs.GetAiIndexIndexStat;
import com.pulumi.gcp.vertex.outputs.GetAiIndexMetadata;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetAiIndexResult {
    private String createTime;
    private List<GetAiIndexDeployedIndex> deployedIndexes;
    private String description;
    private String displayName;
    private Map<String,String> effectiveLabels;
    private String etag;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetAiIndexIndexStat> indexStats;
    private String indexUpdateMethod;
    private Map<String,String> labels;
    private String metadataSchemaUri;
    private List<GetAiIndexMetadata> metadatas;
    private String name;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private String region;
    private String updateTime;

    private GetAiIndexResult() {}
    public String createTime() {
        return this.createTime;
    }
    public List<GetAiIndexDeployedIndex> deployedIndexes() {
        return this.deployedIndexes;
    }
    public String description() {
        return this.description;
    }
    public String displayName() {
        return this.displayName;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public String etag() {
        return this.etag;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetAiIndexIndexStat> indexStats() {
        return this.indexStats;
    }
    public String indexUpdateMethod() {
        return this.indexUpdateMethod;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String metadataSchemaUri() {
        return this.metadataSchemaUri;
    }
    public List<GetAiIndexMetadata> metadatas() {
        return this.metadatas;
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
    public String region() {
        return this.region;
    }
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAiIndexResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private List<GetAiIndexDeployedIndex> deployedIndexes;
        private String description;
        private String displayName;
        private Map<String,String> effectiveLabels;
        private String etag;
        private String id;
        private List<GetAiIndexIndexStat> indexStats;
        private String indexUpdateMethod;
        private Map<String,String> labels;
        private String metadataSchemaUri;
        private List<GetAiIndexMetadata> metadatas;
        private String name;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private String region;
        private String updateTime;
        public Builder() {}
        public Builder(GetAiIndexResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.deployedIndexes = defaults.deployedIndexes;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.indexStats = defaults.indexStats;
    	      this.indexUpdateMethod = defaults.indexUpdateMethod;
    	      this.labels = defaults.labels;
    	      this.metadataSchemaUri = defaults.metadataSchemaUri;
    	      this.metadatas = defaults.metadatas;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.region = defaults.region;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder deployedIndexes(List<GetAiIndexDeployedIndex> deployedIndexes) {
            this.deployedIndexes = Objects.requireNonNull(deployedIndexes);
            return this;
        }
        public Builder deployedIndexes(GetAiIndexDeployedIndex... deployedIndexes) {
            return deployedIndexes(List.of(deployedIndexes));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder effectiveLabels(Map<String,String> effectiveLabels) {
            this.effectiveLabels = Objects.requireNonNull(effectiveLabels);
            return this;
        }
        @CustomType.Setter
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder indexStats(List<GetAiIndexIndexStat> indexStats) {
            this.indexStats = Objects.requireNonNull(indexStats);
            return this;
        }
        public Builder indexStats(GetAiIndexIndexStat... indexStats) {
            return indexStats(List.of(indexStats));
        }
        @CustomType.Setter
        public Builder indexUpdateMethod(String indexUpdateMethod) {
            this.indexUpdateMethod = Objects.requireNonNull(indexUpdateMethod);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder metadataSchemaUri(String metadataSchemaUri) {
            this.metadataSchemaUri = Objects.requireNonNull(metadataSchemaUri);
            return this;
        }
        @CustomType.Setter
        public Builder metadatas(List<GetAiIndexMetadata> metadatas) {
            this.metadatas = Objects.requireNonNull(metadatas);
            return this;
        }
        public Builder metadatas(GetAiIndexMetadata... metadatas) {
            return metadatas(List.of(metadatas));
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
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetAiIndexResult build() {
            final var o = new GetAiIndexResult();
            o.createTime = createTime;
            o.deployedIndexes = deployedIndexes;
            o.description = description;
            o.displayName = displayName;
            o.effectiveLabels = effectiveLabels;
            o.etag = etag;
            o.id = id;
            o.indexStats = indexStats;
            o.indexUpdateMethod = indexUpdateMethod;
            o.labels = labels;
            o.metadataSchemaUri = metadataSchemaUri;
            o.metadatas = metadatas;
            o.name = name;
            o.project = project;
            o.pulumiLabels = pulumiLabels;
            o.region = region;
            o.updateTime = updateTime;
            return o;
        }
    }
}
