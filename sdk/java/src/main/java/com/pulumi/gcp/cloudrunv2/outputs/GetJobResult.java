// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.GetJobBinaryAuthorization;
import com.pulumi.gcp.cloudrunv2.outputs.GetJobCondition;
import com.pulumi.gcp.cloudrunv2.outputs.GetJobLatestCreatedExecution;
import com.pulumi.gcp.cloudrunv2.outputs.GetJobTemplate;
import com.pulumi.gcp.cloudrunv2.outputs.GetJobTerminalCondition;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetJobResult {
    private Map<String,String> annotations;
    private List<GetJobBinaryAuthorization> binaryAuthorizations;
    private String client;
    private String clientVersion;
    private List<GetJobCondition> conditions;
    private String createTime;
    private String creator;
    private String deleteTime;
    private Map<String,String> effectiveAnnotations;
    private Map<String,String> effectiveLabels;
    private String etag;
    private Integer executionCount;
    private String expireTime;
    private String generation;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private Map<String,String> labels;
    private String lastModifier;
    private List<GetJobLatestCreatedExecution> latestCreatedExecutions;
    private String launchStage;
    private @Nullable String location;
    private String name;
    private String observedGeneration;
    private @Nullable String project;
    private Map<String,String> pulumiLabels;
    private Boolean reconciling;
    private List<GetJobTemplate> templates;
    private List<GetJobTerminalCondition> terminalConditions;
    private String uid;
    private String updateTime;

    private GetJobResult() {}
    public Map<String,String> annotations() {
        return this.annotations;
    }
    public List<GetJobBinaryAuthorization> binaryAuthorizations() {
        return this.binaryAuthorizations;
    }
    public String client() {
        return this.client;
    }
    public String clientVersion() {
        return this.clientVersion;
    }
    public List<GetJobCondition> conditions() {
        return this.conditions;
    }
    public String createTime() {
        return this.createTime;
    }
    public String creator() {
        return this.creator;
    }
    public String deleteTime() {
        return this.deleteTime;
    }
    public Map<String,String> effectiveAnnotations() {
        return this.effectiveAnnotations;
    }
    public Map<String,String> effectiveLabels() {
        return this.effectiveLabels;
    }
    public String etag() {
        return this.etag;
    }
    public Integer executionCount() {
        return this.executionCount;
    }
    public String expireTime() {
        return this.expireTime;
    }
    public String generation() {
        return this.generation;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String lastModifier() {
        return this.lastModifier;
    }
    public List<GetJobLatestCreatedExecution> latestCreatedExecutions() {
        return this.latestCreatedExecutions;
    }
    public String launchStage() {
        return this.launchStage;
    }
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    public String name() {
        return this.name;
    }
    public String observedGeneration() {
        return this.observedGeneration;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Map<String,String> pulumiLabels() {
        return this.pulumiLabels;
    }
    public Boolean reconciling() {
        return this.reconciling;
    }
    public List<GetJobTemplate> templates() {
        return this.templates;
    }
    public List<GetJobTerminalCondition> terminalConditions() {
        return this.terminalConditions;
    }
    public String uid() {
        return this.uid;
    }
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private List<GetJobBinaryAuthorization> binaryAuthorizations;
        private String client;
        private String clientVersion;
        private List<GetJobCondition> conditions;
        private String createTime;
        private String creator;
        private String deleteTime;
        private Map<String,String> effectiveAnnotations;
        private Map<String,String> effectiveLabels;
        private String etag;
        private Integer executionCount;
        private String expireTime;
        private String generation;
        private String id;
        private Map<String,String> labels;
        private String lastModifier;
        private List<GetJobLatestCreatedExecution> latestCreatedExecutions;
        private String launchStage;
        private @Nullable String location;
        private String name;
        private String observedGeneration;
        private @Nullable String project;
        private Map<String,String> pulumiLabels;
        private Boolean reconciling;
        private List<GetJobTemplate> templates;
        private List<GetJobTerminalCondition> terminalConditions;
        private String uid;
        private String updateTime;
        public Builder() {}
        public Builder(GetJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.binaryAuthorizations = defaults.binaryAuthorizations;
    	      this.client = defaults.client;
    	      this.clientVersion = defaults.clientVersion;
    	      this.conditions = defaults.conditions;
    	      this.createTime = defaults.createTime;
    	      this.creator = defaults.creator;
    	      this.deleteTime = defaults.deleteTime;
    	      this.effectiveAnnotations = defaults.effectiveAnnotations;
    	      this.effectiveLabels = defaults.effectiveLabels;
    	      this.etag = defaults.etag;
    	      this.executionCount = defaults.executionCount;
    	      this.expireTime = defaults.expireTime;
    	      this.generation = defaults.generation;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.lastModifier = defaults.lastModifier;
    	      this.latestCreatedExecutions = defaults.latestCreatedExecutions;
    	      this.launchStage = defaults.launchStage;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.observedGeneration = defaults.observedGeneration;
    	      this.project = defaults.project;
    	      this.pulumiLabels = defaults.pulumiLabels;
    	      this.reconciling = defaults.reconciling;
    	      this.templates = defaults.templates;
    	      this.terminalConditions = defaults.terminalConditions;
    	      this.uid = defaults.uid;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder binaryAuthorizations(List<GetJobBinaryAuthorization> binaryAuthorizations) {
            this.binaryAuthorizations = Objects.requireNonNull(binaryAuthorizations);
            return this;
        }
        public Builder binaryAuthorizations(GetJobBinaryAuthorization... binaryAuthorizations) {
            return binaryAuthorizations(List.of(binaryAuthorizations));
        }
        @CustomType.Setter
        public Builder client(String client) {
            this.client = Objects.requireNonNull(client);
            return this;
        }
        @CustomType.Setter
        public Builder clientVersion(String clientVersion) {
            this.clientVersion = Objects.requireNonNull(clientVersion);
            return this;
        }
        @CustomType.Setter
        public Builder conditions(List<GetJobCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(GetJobCondition... conditions) {
            return conditions(List.of(conditions));
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder creator(String creator) {
            this.creator = Objects.requireNonNull(creator);
            return this;
        }
        @CustomType.Setter
        public Builder deleteTime(String deleteTime) {
            this.deleteTime = Objects.requireNonNull(deleteTime);
            return this;
        }
        @CustomType.Setter
        public Builder effectiveAnnotations(Map<String,String> effectiveAnnotations) {
            this.effectiveAnnotations = Objects.requireNonNull(effectiveAnnotations);
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
        public Builder executionCount(Integer executionCount) {
            this.executionCount = Objects.requireNonNull(executionCount);
            return this;
        }
        @CustomType.Setter
        public Builder expireTime(String expireTime) {
            this.expireTime = Objects.requireNonNull(expireTime);
            return this;
        }
        @CustomType.Setter
        public Builder generation(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder lastModifier(String lastModifier) {
            this.lastModifier = Objects.requireNonNull(lastModifier);
            return this;
        }
        @CustomType.Setter
        public Builder latestCreatedExecutions(List<GetJobLatestCreatedExecution> latestCreatedExecutions) {
            this.latestCreatedExecutions = Objects.requireNonNull(latestCreatedExecutions);
            return this;
        }
        public Builder latestCreatedExecutions(GetJobLatestCreatedExecution... latestCreatedExecutions) {
            return latestCreatedExecutions(List.of(latestCreatedExecutions));
        }
        @CustomType.Setter
        public Builder launchStage(String launchStage) {
            this.launchStage = Objects.requireNonNull(launchStage);
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder observedGeneration(String observedGeneration) {
            this.observedGeneration = Objects.requireNonNull(observedGeneration);
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
        public Builder reconciling(Boolean reconciling) {
            this.reconciling = Objects.requireNonNull(reconciling);
            return this;
        }
        @CustomType.Setter
        public Builder templates(List<GetJobTemplate> templates) {
            this.templates = Objects.requireNonNull(templates);
            return this;
        }
        public Builder templates(GetJobTemplate... templates) {
            return templates(List.of(templates));
        }
        @CustomType.Setter
        public Builder terminalConditions(List<GetJobTerminalCondition> terminalConditions) {
            this.terminalConditions = Objects.requireNonNull(terminalConditions);
            return this;
        }
        public Builder terminalConditions(GetJobTerminalCondition... terminalConditions) {
            return terminalConditions(List.of(terminalConditions));
        }
        @CustomType.Setter
        public Builder uid(String uid) {
            this.uid = Objects.requireNonNull(uid);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetJobResult build() {
            final var o = new GetJobResult();
            o.annotations = annotations;
            o.binaryAuthorizations = binaryAuthorizations;
            o.client = client;
            o.clientVersion = clientVersion;
            o.conditions = conditions;
            o.createTime = createTime;
            o.creator = creator;
            o.deleteTime = deleteTime;
            o.effectiveAnnotations = effectiveAnnotations;
            o.effectiveLabels = effectiveLabels;
            o.etag = etag;
            o.executionCount = executionCount;
            o.expireTime = expireTime;
            o.generation = generation;
            o.id = id;
            o.labels = labels;
            o.lastModifier = lastModifier;
            o.latestCreatedExecutions = latestCreatedExecutions;
            o.launchStage = launchStage;
            o.location = location;
            o.name = name;
            o.observedGeneration = observedGeneration;
            o.project = project;
            o.pulumiLabels = pulumiLabels;
            o.reconciling = reconciling;
            o.templates = templates;
            o.terminalConditions = terminalConditions;
            o.uid = uid;
            o.updateTime = updateTime;
            return o;
        }
    }
}
