// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudbuild.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.cloudbuild.outputs.GetTriggerBuildStepVolume;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTriggerBuildStep {
    private List<Integer> allowExitCodes;
    private Boolean allowFailure;
    private List<String> args;
    private String dir;
    private String entrypoint;
    private List<String> envs;
    private String id;
    private String name;
    private String script;
    private List<String> secretEnvs;
    private String timeout;
    private String timing;
    private List<GetTriggerBuildStepVolume> volumes;
    private List<String> waitFors;

    private GetTriggerBuildStep() {}
    public List<Integer> allowExitCodes() {
        return this.allowExitCodes;
    }
    public Boolean allowFailure() {
        return this.allowFailure;
    }
    public List<String> args() {
        return this.args;
    }
    public String dir() {
        return this.dir;
    }
    public String entrypoint() {
        return this.entrypoint;
    }
    public List<String> envs() {
        return this.envs;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public String script() {
        return this.script;
    }
    public List<String> secretEnvs() {
        return this.secretEnvs;
    }
    public String timeout() {
        return this.timeout;
    }
    public String timing() {
        return this.timing;
    }
    public List<GetTriggerBuildStepVolume> volumes() {
        return this.volumes;
    }
    public List<String> waitFors() {
        return this.waitFors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTriggerBuildStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<Integer> allowExitCodes;
        private Boolean allowFailure;
        private List<String> args;
        private String dir;
        private String entrypoint;
        private List<String> envs;
        private String id;
        private String name;
        private String script;
        private List<String> secretEnvs;
        private String timeout;
        private String timing;
        private List<GetTriggerBuildStepVolume> volumes;
        private List<String> waitFors;
        public Builder() {}
        public Builder(GetTriggerBuildStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowExitCodes = defaults.allowExitCodes;
    	      this.allowFailure = defaults.allowFailure;
    	      this.args = defaults.args;
    	      this.dir = defaults.dir;
    	      this.entrypoint = defaults.entrypoint;
    	      this.envs = defaults.envs;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.script = defaults.script;
    	      this.secretEnvs = defaults.secretEnvs;
    	      this.timeout = defaults.timeout;
    	      this.timing = defaults.timing;
    	      this.volumes = defaults.volumes;
    	      this.waitFors = defaults.waitFors;
        }

        @CustomType.Setter
        public Builder allowExitCodes(List<Integer> allowExitCodes) {
            this.allowExitCodes = Objects.requireNonNull(allowExitCodes);
            return this;
        }
        public Builder allowExitCodes(Integer... allowExitCodes) {
            return allowExitCodes(List.of(allowExitCodes));
        }
        @CustomType.Setter
        public Builder allowFailure(Boolean allowFailure) {
            this.allowFailure = Objects.requireNonNull(allowFailure);
            return this;
        }
        @CustomType.Setter
        public Builder args(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder dir(String dir) {
            this.dir = Objects.requireNonNull(dir);
            return this;
        }
        @CustomType.Setter
        public Builder entrypoint(String entrypoint) {
            this.entrypoint = Objects.requireNonNull(entrypoint);
            return this;
        }
        @CustomType.Setter
        public Builder envs(List<String> envs) {
            this.envs = Objects.requireNonNull(envs);
            return this;
        }
        public Builder envs(String... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder script(String script) {
            this.script = Objects.requireNonNull(script);
            return this;
        }
        @CustomType.Setter
        public Builder secretEnvs(List<String> secretEnvs) {
            this.secretEnvs = Objects.requireNonNull(secretEnvs);
            return this;
        }
        public Builder secretEnvs(String... secretEnvs) {
            return secretEnvs(List.of(secretEnvs));
        }
        @CustomType.Setter
        public Builder timeout(String timeout) {
            this.timeout = Objects.requireNonNull(timeout);
            return this;
        }
        @CustomType.Setter
        public Builder timing(String timing) {
            this.timing = Objects.requireNonNull(timing);
            return this;
        }
        @CustomType.Setter
        public Builder volumes(List<GetTriggerBuildStepVolume> volumes) {
            this.volumes = Objects.requireNonNull(volumes);
            return this;
        }
        public Builder volumes(GetTriggerBuildStepVolume... volumes) {
            return volumes(List.of(volumes));
        }
        @CustomType.Setter
        public Builder waitFors(List<String> waitFors) {
            this.waitFors = Objects.requireNonNull(waitFors);
            return this;
        }
        public Builder waitFors(String... waitFors) {
            return waitFors(List.of(waitFors));
        }
        public GetTriggerBuildStep build() {
            final var o = new GetTriggerBuildStep();
            o.allowExitCodes = allowExitCodes;
            o.allowFailure = allowFailure;
            o.args = args;
            o.dir = dir;
            o.entrypoint = entrypoint;
            o.envs = envs;
            o.id = id;
            o.name = name;
            o.script = script;
            o.secretEnvs = secretEnvs;
            o.timeout = timeout;
            o.timing = timing;
            o.volumes = volumes;
            o.waitFors = waitFors;
            return o;
        }
    }
}
