// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetInstanceBootDiskInitializeParam {
    private Boolean enableConfidentialCompute;
    /**
     * @return The image from which this disk was initialised.
     * 
     */
    private String image;
    /**
     * @return A set of key/value label pairs assigned to the disk.
     * 
     */
    private Map<String,Object> labels;
    private Map<String,Object> resourceManagerTags;
    /**
     * @return The size of the image in gigabytes.
     * 
     */
    private Integer size;
    /**
     * @return The accelerator type resource exposed to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    private String type;

    private GetInstanceBootDiskInitializeParam() {}
    public Boolean enableConfidentialCompute() {
        return this.enableConfidentialCompute;
    }
    /**
     * @return The image from which this disk was initialised.
     * 
     */
    public String image() {
        return this.image;
    }
    /**
     * @return A set of key/value label pairs assigned to the disk.
     * 
     */
    public Map<String,Object> labels() {
        return this.labels;
    }
    public Map<String,Object> resourceManagerTags() {
        return this.resourceManagerTags;
    }
    /**
     * @return The size of the image in gigabytes.
     * 
     */
    public Integer size() {
        return this.size;
    }
    /**
     * @return The accelerator type resource exposed to this instance. E.g. `nvidia-tesla-k80`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceBootDiskInitializeParam defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enableConfidentialCompute;
        private String image;
        private Map<String,Object> labels;
        private Map<String,Object> resourceManagerTags;
        private Integer size;
        private String type;
        public Builder() {}
        public Builder(GetInstanceBootDiskInitializeParam defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableConfidentialCompute = defaults.enableConfidentialCompute;
    	      this.image = defaults.image;
    	      this.labels = defaults.labels;
    	      this.resourceManagerTags = defaults.resourceManagerTags;
    	      this.size = defaults.size;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder enableConfidentialCompute(Boolean enableConfidentialCompute) {
            this.enableConfidentialCompute = Objects.requireNonNull(enableConfidentialCompute);
            return this;
        }
        @CustomType.Setter
        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        @CustomType.Setter
        public Builder labels(Map<String,Object> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        @CustomType.Setter
        public Builder resourceManagerTags(Map<String,Object> resourceManagerTags) {
            this.resourceManagerTags = Objects.requireNonNull(resourceManagerTags);
            return this;
        }
        @CustomType.Setter
        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetInstanceBootDiskInitializeParam build() {
            final var o = new GetInstanceBootDiskInitializeParam();
            o.enableConfidentialCompute = enableConfidentialCompute;
            o.image = image;
            o.labels = labels;
            o.resourceManagerTags = resourceManagerTags;
            o.size = size;
            o.type = type;
            return o;
        }
    }
}
