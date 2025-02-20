// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.healthcare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFhirStoreIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFhirStoreIamPolicyPlainArgs Empty = new GetFhirStoreIamPolicyPlainArgs();

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="fhirStoreId", required=true)
    private String fhirStoreId;

    /**
     * @return The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
     * project setting will be used as a fallback.
     * 
     */
    public String fhirStoreId() {
        return this.fhirStoreId;
    }

    private GetFhirStoreIamPolicyPlainArgs() {}

    private GetFhirStoreIamPolicyPlainArgs(GetFhirStoreIamPolicyPlainArgs $) {
        this.fhirStoreId = $.fhirStoreId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFhirStoreIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFhirStoreIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetFhirStoreIamPolicyPlainArgs();
        }

        public Builder(GetFhirStoreIamPolicyPlainArgs defaults) {
            $ = new GetFhirStoreIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fhirStoreId The FHIR store ID, in the form
         * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
         * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider&#39;s
         * project setting will be used as a fallback.
         * 
         * @return builder
         * 
         */
        public Builder fhirStoreId(String fhirStoreId) {
            $.fhirStoreId = fhirStoreId;
            return this;
        }

        public GetFhirStoreIamPolicyPlainArgs build() {
            $.fhirStoreId = Objects.requireNonNull($.fhirStoreId, "expected parameter 'fhirStoreId' to be non-null");
            return $;
        }
    }

}
