// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudrunv2.outputs.GetJobTemplateTemplateVolumeCloudSqlInstance;
import com.pulumi.gcp.cloudrunv2.outputs.GetJobTemplateTemplateVolumeEmptyDir;
import com.pulumi.gcp.cloudrunv2.outputs.GetJobTemplateTemplateVolumeSecret;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetJobTemplateTemplateVolume {
    private List<GetJobTemplateTemplateVolumeCloudSqlInstance> cloudSqlInstances;
    private List<GetJobTemplateTemplateVolumeEmptyDir> emptyDirs;
    /**
     * @return The name of the Cloud Run v2 Job.
     * 
     */
    private String name;
    private List<GetJobTemplateTemplateVolumeSecret> secrets;

    private GetJobTemplateTemplateVolume() {}
    public List<GetJobTemplateTemplateVolumeCloudSqlInstance> cloudSqlInstances() {
        return this.cloudSqlInstances;
    }
    public List<GetJobTemplateTemplateVolumeEmptyDir> emptyDirs() {
        return this.emptyDirs;
    }
    /**
     * @return The name of the Cloud Run v2 Job.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<GetJobTemplateTemplateVolumeSecret> secrets() {
        return this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobTemplateTemplateVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetJobTemplateTemplateVolumeCloudSqlInstance> cloudSqlInstances;
        private List<GetJobTemplateTemplateVolumeEmptyDir> emptyDirs;
        private String name;
        private List<GetJobTemplateTemplateVolumeSecret> secrets;
        public Builder() {}
        public Builder(GetJobTemplateTemplateVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudSqlInstances = defaults.cloudSqlInstances;
    	      this.emptyDirs = defaults.emptyDirs;
    	      this.name = defaults.name;
    	      this.secrets = defaults.secrets;
        }

        @CustomType.Setter
        public Builder cloudSqlInstances(List<GetJobTemplateTemplateVolumeCloudSqlInstance> cloudSqlInstances) {
            this.cloudSqlInstances = Objects.requireNonNull(cloudSqlInstances);
            return this;
        }
        public Builder cloudSqlInstances(GetJobTemplateTemplateVolumeCloudSqlInstance... cloudSqlInstances) {
            return cloudSqlInstances(List.of(cloudSqlInstances));
        }
        @CustomType.Setter
        public Builder emptyDirs(List<GetJobTemplateTemplateVolumeEmptyDir> emptyDirs) {
            this.emptyDirs = Objects.requireNonNull(emptyDirs);
            return this;
        }
        public Builder emptyDirs(GetJobTemplateTemplateVolumeEmptyDir... emptyDirs) {
            return emptyDirs(List.of(emptyDirs));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder secrets(List<GetJobTemplateTemplateVolumeSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder secrets(GetJobTemplateTemplateVolumeSecret... secrets) {
            return secrets(List.of(secrets));
        }
        public GetJobTemplateTemplateVolume build() {
            final var o = new GetJobTemplateTemplateVolume();
            o.cloudSqlInstances = cloudSqlInstances;
            o.emptyDirs = emptyDirs;
            o.name = name;
            o.secrets = secrets;
            return o;
        }
    }
}
