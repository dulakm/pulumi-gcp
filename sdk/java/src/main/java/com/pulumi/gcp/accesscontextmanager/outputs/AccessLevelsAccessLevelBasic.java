// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.accesscontextmanager.outputs.AccessLevelsAccessLevelBasicCondition;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AccessLevelsAccessLevelBasic {
    /**
     * @return How the conditions list should be combined to determine if a request
     * is granted this AccessLevel. If AND is used, each Condition in
     * conditions must be satisfied for the AccessLevel to be applied. If
     * OR is used, at least one Condition in conditions must be satisfied
     * for the AccessLevel to be applied.
     * Default value is `AND`.
     * Possible values are: `AND`, `OR`.
     * 
     */
    private @Nullable String combiningFunction;
    /**
     * @return A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    private List<AccessLevelsAccessLevelBasicCondition> conditions;

    private AccessLevelsAccessLevelBasic() {}
    /**
     * @return How the conditions list should be combined to determine if a request
     * is granted this AccessLevel. If AND is used, each Condition in
     * conditions must be satisfied for the AccessLevel to be applied. If
     * OR is used, at least one Condition in conditions must be satisfied
     * for the AccessLevel to be applied.
     * Default value is `AND`.
     * Possible values are: `AND`, `OR`.
     * 
     */
    public Optional<String> combiningFunction() {
        return Optional.ofNullable(this.combiningFunction);
    }
    /**
     * @return A set of requirements for the AccessLevel to be granted.
     * Structure is documented below.
     * 
     */
    public List<AccessLevelsAccessLevelBasicCondition> conditions() {
        return this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelBasic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String combiningFunction;
        private List<AccessLevelsAccessLevelBasicCondition> conditions;
        public Builder() {}
        public Builder(AccessLevelsAccessLevelBasic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.combiningFunction = defaults.combiningFunction;
    	      this.conditions = defaults.conditions;
        }

        @CustomType.Setter
        public Builder combiningFunction(@Nullable String combiningFunction) {
            this.combiningFunction = combiningFunction;
            return this;
        }
        @CustomType.Setter
        public Builder conditions(List<AccessLevelsAccessLevelBasicCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }
        public Builder conditions(AccessLevelsAccessLevelBasicCondition... conditions) {
            return conditions(List.of(conditions));
        }
        public AccessLevelsAccessLevelBasic build() {
            final var o = new AccessLevelsAccessLevelBasic();
            o.combiningFunction = combiningFunction;
            o.conditions = conditions;
            return o;
        }
    }
}
