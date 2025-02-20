// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.PatchDeploymentInstanceFilterGroupLabel;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PatchDeploymentInstanceFilter {
    /**
     * @return Target all VM instances in the project. If true, no other criteria is permitted.
     * 
     */
    private @Nullable Boolean all;
    /**
     * @return Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * Structure is documented below.
     * 
     */
    private @Nullable List<PatchDeploymentInstanceFilterGroupLabel> groupLabels;
    /**
     * @return Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group
     * VMs when targeting configs, for example prefix=&#34;prod-&#34;.
     * 
     */
    private @Nullable List<String> instanceNamePrefixes;
    /**
     * @return Targets any of the VM instances specified. Instances are specified by their URI in the `form zones/{{zone}}/instances/{{instance_name}}`,
     * `projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`, or
     * `https://www.googleapis.com/compute/v1/projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`
     * 
     */
    private @Nullable List<String> instances;
    /**
     * @return Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
     */
    private @Nullable List<String> zones;

    private PatchDeploymentInstanceFilter() {}
    /**
     * @return Target all VM instances in the project. If true, no other criteria is permitted.
     * 
     */
    public Optional<Boolean> all() {
        return Optional.ofNullable(this.all);
    }
    /**
     * @return Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * Structure is documented below.
     * 
     */
    public List<PatchDeploymentInstanceFilterGroupLabel> groupLabels() {
        return this.groupLabels == null ? List.of() : this.groupLabels;
    }
    /**
     * @return Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group
     * VMs when targeting configs, for example prefix=&#34;prod-&#34;.
     * 
     */
    public List<String> instanceNamePrefixes() {
        return this.instanceNamePrefixes == null ? List.of() : this.instanceNamePrefixes;
    }
    /**
     * @return Targets any of the VM instances specified. Instances are specified by their URI in the `form zones/{{zone}}/instances/{{instance_name}}`,
     * `projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`, or
     * `https://www.googleapis.com/compute/v1/projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`
     * 
     */
    public List<String> instances() {
        return this.instances == null ? List.of() : this.instances;
    }
    /**
     * @return Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
     */
    public List<String> zones() {
        return this.zones == null ? List.of() : this.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentInstanceFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean all;
        private @Nullable List<PatchDeploymentInstanceFilterGroupLabel> groupLabels;
        private @Nullable List<String> instanceNamePrefixes;
        private @Nullable List<String> instances;
        private @Nullable List<String> zones;
        public Builder() {}
        public Builder(PatchDeploymentInstanceFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.zones = defaults.zones;
        }

        @CustomType.Setter
        public Builder all(@Nullable Boolean all) {
            this.all = all;
            return this;
        }
        @CustomType.Setter
        public Builder groupLabels(@Nullable List<PatchDeploymentInstanceFilterGroupLabel> groupLabels) {
            this.groupLabels = groupLabels;
            return this;
        }
        public Builder groupLabels(PatchDeploymentInstanceFilterGroupLabel... groupLabels) {
            return groupLabels(List.of(groupLabels));
        }
        @CustomType.Setter
        public Builder instanceNamePrefixes(@Nullable List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }
        public Builder instanceNamePrefixes(String... instanceNamePrefixes) {
            return instanceNamePrefixes(List.of(instanceNamePrefixes));
        }
        @CustomType.Setter
        public Builder instances(@Nullable List<String> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        @CustomType.Setter
        public Builder zones(@Nullable List<String> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }
        public PatchDeploymentInstanceFilter build() {
            final var o = new PatchDeploymentInstanceFilter();
            o.all = all;
            o.groupLabels = groupLabels;
            o.instanceNamePrefixes = instanceNamePrefixes;
            o.instances = instances;
            o.zones = zones;
            return o;
        }
    }
}
