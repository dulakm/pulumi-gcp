// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTableIamPolicyPlainArgs Empty = new GetTableIamPolicyPlainArgs();

    @Import(name="datasetId", required=true)
    private String datasetId;

    public String datasetId() {
        return this.datasetId;
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

    @Import(name="tableId", required=true)
    private String tableId;

    public String tableId() {
        return this.tableId;
    }

    private GetTableIamPolicyPlainArgs() {}

    private GetTableIamPolicyPlainArgs(GetTableIamPolicyPlainArgs $) {
        this.datasetId = $.datasetId;
        this.project = $.project;
        this.tableId = $.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTableIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTableIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetTableIamPolicyPlainArgs();
        }

        public Builder(GetTableIamPolicyPlainArgs defaults) {
            $ = new GetTableIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetId(String datasetId) {
            $.datasetId = datasetId;
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

        public Builder tableId(String tableId) {
            $.tableId = tableId;
            return this;
        }

        public GetTableIamPolicyPlainArgs build() {
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            $.tableId = Objects.requireNonNull($.tableId, "expected parameter 'tableId' to be non-null");
            return $;
        }
    }

}
