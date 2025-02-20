// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AzureNodePoolConfigSshConfig {
    /**
     * @return The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
     * 
     */
    private String authorizedKey;

    private AzureNodePoolConfigSshConfig() {}
    /**
     * @return The SSH public key data for VMs managed by Anthos. This accepts the authorized_keys file format used in OpenSSH according to the sshd(8) manual page.
     * 
     */
    public String authorizedKey() {
        return this.authorizedKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolConfigSshConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String authorizedKey;
        public Builder() {}
        public Builder(AzureNodePoolConfigSshConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedKey = defaults.authorizedKey;
        }

        @CustomType.Setter
        public Builder authorizedKey(String authorizedKey) {
            this.authorizedKey = Objects.requireNonNull(authorizedKey);
            return this;
        }
        public AzureNodePoolConfigSshConfig build() {
            final var o = new AzureNodePoolConfigSshConfig();
            o.authorizedKey = authorizedKey;
            return o;
        }
    }
}
