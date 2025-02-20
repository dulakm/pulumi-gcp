// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetManagedZoneIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetManagedZoneIamPolicyPlainArgs Empty = new GetManagedZoneIamPolicyPlainArgs();

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="managedZone", required=true)
    private String managedZone;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public String managedZone() {
        return this.managedZone;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetManagedZoneIamPolicyPlainArgs() {}

    private GetManagedZoneIamPolicyPlainArgs(GetManagedZoneIamPolicyPlainArgs $) {
        this.managedZone = $.managedZone;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetManagedZoneIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetManagedZoneIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetManagedZoneIamPolicyPlainArgs();
        }

        public Builder(GetManagedZoneIamPolicyPlainArgs defaults) {
            $ = new GetManagedZoneIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param managedZone Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder managedZone(String managedZone) {
            $.managedZone = managedZone;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetManagedZoneIamPolicyPlainArgs build() {
            $.managedZone = Objects.requireNonNull($.managedZone, "expected parameter 'managedZone' to be non-null");
            return $;
        }
    }

}
