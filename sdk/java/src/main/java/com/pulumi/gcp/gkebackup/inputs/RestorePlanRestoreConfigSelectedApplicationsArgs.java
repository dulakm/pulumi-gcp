// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.gkebackup.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.gkebackup.inputs.RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs;
import java.util.List;
import java.util.Objects;


public final class RestorePlanRestoreConfigSelectedApplicationsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePlanRestoreConfigSelectedApplicationsArgs Empty = new RestorePlanRestoreConfigSelectedApplicationsArgs();

    /**
     * A list of namespaced Kubernetes resources.
     * Structure is documented below.
     * 
     */
    @Import(name="namespacedNames", required=true)
    private Output<List<RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs>> namespacedNames;

    /**
     * @return A list of namespaced Kubernetes resources.
     * Structure is documented below.
     * 
     */
    public Output<List<RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs>> namespacedNames() {
        return this.namespacedNames;
    }

    private RestorePlanRestoreConfigSelectedApplicationsArgs() {}

    private RestorePlanRestoreConfigSelectedApplicationsArgs(RestorePlanRestoreConfigSelectedApplicationsArgs $) {
        this.namespacedNames = $.namespacedNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePlanRestoreConfigSelectedApplicationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePlanRestoreConfigSelectedApplicationsArgs $;

        public Builder() {
            $ = new RestorePlanRestoreConfigSelectedApplicationsArgs();
        }

        public Builder(RestorePlanRestoreConfigSelectedApplicationsArgs defaults) {
            $ = new RestorePlanRestoreConfigSelectedApplicationsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(Output<List<RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs>> namespacedNames) {
            $.namespacedNames = namespacedNames;
            return this;
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(List<RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs> namespacedNames) {
            return namespacedNames(Output.of(namespacedNames));
        }

        /**
         * @param namespacedNames A list of namespaced Kubernetes resources.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder namespacedNames(RestorePlanRestoreConfigSelectedApplicationsNamespacedNameArgs... namespacedNames) {
            return namespacedNames(List.of(namespacedNames));
        }

        public RestorePlanRestoreConfigSelectedApplicationsArgs build() {
            $.namespacedNames = Objects.requireNonNull($.namespacedNames, "expected parameter 'namespacedNames' to be non-null");
            return $;
        }
    }

}
