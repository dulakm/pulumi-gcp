// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudidentity.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GroupMembershipRole {
    /**
     * @return The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are: `OWNER`, `MANAGER`, `MEMBER`.
     * 
     * ***
     * 
     */
    private String name;

    private GroupMembershipRole() {}
    /**
     * @return The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are: `OWNER`, `MANAGER`, `MEMBER`.
     * 
     * ***
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipRole defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        public Builder() {}
        public Builder(GroupMembershipRole defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GroupMembershipRole build() {
            final var o = new GroupMembershipRole();
            o.name = name;
            return o;
        }
    }
}
