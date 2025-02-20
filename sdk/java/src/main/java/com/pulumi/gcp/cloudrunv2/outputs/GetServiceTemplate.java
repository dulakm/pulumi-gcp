// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateContainer;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateScaling;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateVolume;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateVpcAccess;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceTemplate {
    private Map<String,String> annotations;
    private List<GetServiceTemplateContainer> containers;
    private String encryptionKey;
    private String executionEnvironment;
    private Map<String,String> labels;
    private Integer maxInstanceRequestConcurrency;
    private String revision;
    private List<GetServiceTemplateScaling> scalings;
    private String serviceAccount;
    private Boolean sessionAffinity;
    private String timeout;
    private List<GetServiceTemplateVolume> volumes;
    private List<GetServiceTemplateVpcAccess> vpcAccesses;

    private GetServiceTemplate() {}
    public Map<String,String> annotations() {
        return this.annotations;
    }
    public List<GetServiceTemplateContainer> containers() {
        return this.containers;
    }
    public String encryptionKey() {
        return this.encryptionKey;
    }
    public String executionEnvironment() {
        return this.executionEnvironment;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public Integer maxInstanceRequestConcurrency() {
        return this.maxInstanceRequestConcurrency;
    }
    public String revision() {
        return this.revision;
    }
    public List<GetServiceTemplateScaling> scalings() {
        return this.scalings;
    }
    public String serviceAccount() {
        return this.serviceAccount;
    }
    public Boolean sessionAffinity() {
        return this.sessionAffinity;
    }
    public String timeout() {
        return this.timeout;
    }
    public List<GetServiceTemplateVolume> volumes() {
        return this.volumes;
    }
    public List<GetServiceTemplateVpcAccess> vpcAccesses() {
        return this.vpcAccesses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Map<String,String> annotations;
        private List<GetServiceTemplateContainer> containers;
        private String encryptionKey;
        private String executionEnvironment;
        private Map<String,String> labels;
        private Integer maxInstanceRequestConcurrency;
        private String revision;
        private List<GetServiceTemplateScaling> scalings;
        private String serviceAccount;
        private Boolean sessionAffinity;
        private String timeout;
        private List<GetServiceTemplateVolume> volumes;
        private List<GetServiceTemplateVpcAccess> vpcAccesses;
        public Builder() {}
        public Builder(GetServiceTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.containers = defaults.containers;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.executionEnvironment = defaults.executionEnvironment;
    	      this.labels = defaults.labels;
    	      this.maxInstanceRequestConcurrency = defaults.maxInstanceRequestConcurrency;
    	      this.revision = defaults.revision;
    	      this.scalings = defaults.scalings;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.timeout = defaults.timeout;
    	      this.volumes = defaults.volumes;
    	      this.vpcAccesses = defaults.vpcAccesses;
        }

        @CustomType.Setter
        public Builder annotations(Map<String,String> annotations) {
            this.annotations = Objects.requireNonNull(annotations);
            return this;
        }
        @CustomType.Setter
        public Builder containers(List<GetServiceTemplateContainer> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }
        public Builder containers(GetServiceTemplateContainer... containers) {
            return containers(List.of(containers));
        }
        @CustomType.Setter
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = Objects.requireNonNull(encryptionKey);
            return this;
        }
        @CustomType.Setter
        public Builder executionEnvironment(String executionEnvironment) {
            this.executionEnvironment = Objects.requireNonNull(executionEnvironment);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder maxInstanceRequestConcurrency(Integer maxInstanceRequestConcurrency) {
            this.maxInstanceRequestConcurrency = Objects.requireNonNull(maxInstanceRequestConcurrency);
            return this;
        }
        @CustomType.Setter
        public Builder revision(String revision) {
            this.revision = Objects.requireNonNull(revision);
            return this;
        }
        @CustomType.Setter
        public Builder scalings(List<GetServiceTemplateScaling> scalings) {
            this.scalings = Objects.requireNonNull(scalings);
            return this;
        }
        public Builder scalings(GetServiceTemplateScaling... scalings) {
            return scalings(List.of(scalings));
        }
        @CustomType.Setter
        public Builder serviceAccount(String serviceAccount) {
            this.serviceAccount = Objects.requireNonNull(serviceAccount);
            return this;
        }
        @CustomType.Setter
        public Builder sessionAffinity(Boolean sessionAffinity) {
            this.sessionAffinity = Objects.requireNonNull(sessionAffinity);
            return this;
        }
        @CustomType.Setter
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        @CustomType.Setter
        public Builder volumes(List<GetServiceTemplateVolume> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public Builder volumes(GetServiceTemplateVolume... volumes) {
            return volumes(List.of(volumes));
        }
        @CustomType.Setter
        public Builder vpcAccesses(List<GetServiceTemplateVpcAccess> vpcAccesses) {
            this.vpcAccesses = Objects.requireNonNull(vpcAccesses);
            return this;
        }
        public Builder vpcAccesses(GetServiceTemplateVpcAccess... vpcAccesses) {
            return vpcAccesses(List.of(vpcAccesses));
        }
        public GetServiceTemplate build() {
            final var o = new GetServiceTemplate();
            o.annotations = annotations;
            o.containers = containers;
            o.encryptionKey = encryptionKey;
            o.executionEnvironment = executionEnvironment;
            o.labels = labels;
            o.maxInstanceRequestConcurrency = maxInstanceRequestConcurrency;
            o.revision = revision;
            o.scalings = scalings;
            o.serviceAccount = serviceAccount;
            o.sessionAffinity = sessionAffinity;
            o.timeout = timeout;
            o.volumes = volumes;
            o.vpcAccesses = vpcAccesses;
            return o;
        }
    }
}
