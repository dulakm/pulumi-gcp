// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accessapproval.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetFolderServiceAccountResult {
    /**
     * @return The email address of the service account. This value is
     * often used to refer to the service account in order to grant IAM permissions.
     * 
     */
    private String accountEmail;
    private String folderId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The Access Approval service account resource name. Format is &#34;folders/{folder_id}/serviceAccount&#34;.
     * 
     */
    private String name;

    private GetFolderServiceAccountResult() {}
    /**
     * @return The email address of the service account. This value is
     * often used to refer to the service account in order to grant IAM permissions.
     * 
     */
    public String accountEmail() {
        return this.accountEmail;
    }
    public String folderId() {
        return this.folderId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Access Approval service account resource name. Format is &#34;folders/{folder_id}/serviceAccount&#34;.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFolderServiceAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountEmail;
        private String folderId;
        private String id;
        private String name;
        public Builder() {}
        public Builder(GetFolderServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountEmail = defaults.accountEmail;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder accountEmail(String accountEmail) {
            this.accountEmail = Objects.requireNonNull(accountEmail);
            return this;
        }
        @CustomType.Setter
        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
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
        public GetFolderServiceAccountResult build() {
            final var o = new GetFolderServiceAccountResult();
            o.accountEmail = accountEmail;
            o.folderId = folderId;
            o.id = id;
            o.name = name;
            return o;
        }
    }
}
