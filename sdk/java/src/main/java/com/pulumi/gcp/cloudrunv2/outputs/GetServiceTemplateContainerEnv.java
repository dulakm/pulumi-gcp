// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.GetServiceTemplateContainerEnvValueSource;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetServiceTemplateContainerEnv {
    /**
     * @return The name of the Cloud Run v2 Service.
     * 
     */
    private String name;
    private String value;
    private List<GetServiceTemplateContainerEnvValueSource> valueSources;

    private GetServiceTemplateContainerEnv() {}
    /**
     * @return The name of the Cloud Run v2 Service.
     * 
     */
    public String name() {
        return this.name;
    }
    public String value() {
        return this.value;
    }
    public List<GetServiceTemplateContainerEnvValueSource> valueSources() {
        return this.valueSources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateContainerEnv defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String value;
        private List<GetServiceTemplateContainerEnvValueSource> valueSources;
        public Builder() {}
        public Builder(GetServiceTemplateContainerEnv defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
    	      this.valueSources = defaults.valueSources;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        @CustomType.Setter
        public Builder valueSources(List<GetServiceTemplateContainerEnvValueSource> valueSources) {
            this.valueSources = Objects.requireNonNull(valueSources);
            return this;
        }
        public Builder valueSources(GetServiceTemplateContainerEnvValueSource... valueSources) {
            return valueSources(List.of(valueSources));
        }
        public GetServiceTemplateContainerEnv build() {
            final var o = new GetServiceTemplateContainerEnv();
            o.name = name;
            o.value = value;
            o.valueSources = valueSources;
            return o;
        }
    }
}
