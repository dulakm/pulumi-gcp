// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudfunctions.outputs.GetFunctionSecretVolumeVersion;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFunctionSecretVolume {
    private String mountPath;
    private String projectId;
    private String secret;
    private List<GetFunctionSecretVolumeVersion> versions;

    private GetFunctionSecretVolume() {}
    public String mountPath() {
        return this.mountPath;
    }
    public String projectId() {
        return this.projectId;
    }
    public String secret() {
        return this.secret;
    }
    public List<GetFunctionSecretVolumeVersion> versions() {
        return this.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionSecretVolume defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String mountPath;
        private String projectId;
        private String secret;
        private List<GetFunctionSecretVolumeVersion> versions;
        public Builder() {}
        public Builder(GetFunctionSecretVolume defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountPath = defaults.mountPath;
    	      this.projectId = defaults.projectId;
    	      this.secret = defaults.secret;
    	      this.versions = defaults.versions;
        }

        @CustomType.Setter
        public Builder mountPath(String mountPath) {
            this.mountPath = Objects.requireNonNull(mountPath);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        @CustomType.Setter
        public Builder secret(String secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }
        @CustomType.Setter
        public Builder versions(List<GetFunctionSecretVolumeVersion> versions) {
            this.versions = Objects.requireNonNull(versions);
            return this;
        }
        public Builder versions(GetFunctionSecretVolumeVersion... versions) {
            return versions(List.of(versions));
        }
        public GetFunctionSecretVolume build() {
            final var o = new GetFunctionSecretVolume();
            o.mountPath = mountPath;
            o.projectId = projectId;
            o.secret = secret;
            o.versions = versions;
            return o;
        }
    }
}
