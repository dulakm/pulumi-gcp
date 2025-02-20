// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs Empty = new ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs();

    /**
     * The scope of automatic upgrades to restrict in the exclusion window. One of: **NO_UPGRADES | NO_MINOR_UPGRADES | NO_MINOR_OR_NODE_UPGRADES**
     * 
     * Specify `start_time` and `end_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) &#34;Zulu&#34; date format.  The start time&#39;s date is
     * the initial date that the window starts, and the end time is used for calculating duration.Specify `recurrence` in
     * [RFC5545](https://tools.ietf.org/html/rfc5545#section-3.8.5.3) RRULE format, to specify when this recurs.
     * Note that GKE may accept other formats, but will return values in UTC, causing a permanent diff.
     * 
     * Examples:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    @Import(name="scope", required=true)
    private Output<String> scope;

    /**
     * @return The scope of automatic upgrades to restrict in the exclusion window. One of: **NO_UPGRADES | NO_MINOR_UPGRADES | NO_MINOR_OR_NODE_UPGRADES**
     * 
     * Specify `start_time` and `end_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) &#34;Zulu&#34; date format.  The start time&#39;s date is
     * the initial date that the window starts, and the end time is used for calculating duration.Specify `recurrence` in
     * [RFC5545](https://tools.ietf.org/html/rfc5545#section-3.8.5.3) RRULE format, to specify when this recurs.
     * Note that GKE may accept other formats, but will return values in UTC, causing a permanent diff.
     * 
     * Examples:
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *     }
     * }
     * ```
     * 
     */
    public Output<String> scope() {
        return this.scope;
    }

    private ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs() {}

    private ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs(ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs $) {
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs $;

        public Builder() {
            $ = new ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs();
        }

        public Builder(ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs defaults) {
            $ = new ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param scope The scope of automatic upgrades to restrict in the exclusion window. One of: **NO_UPGRADES | NO_MINOR_UPGRADES | NO_MINOR_OR_NODE_UPGRADES**
         * 
         * Specify `start_time` and `end_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) &#34;Zulu&#34; date format.  The start time&#39;s date is
         * the initial date that the window starts, and the end time is used for calculating duration.Specify `recurrence` in
         * [RFC5545](https://tools.ietf.org/html/rfc5545#section-3.8.5.3) RRULE format, to specify when this recurs.
         * Note that GKE may accept other formats, but will return values in UTC, causing a permanent diff.
         * 
         * Examples:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder scope(Output<String> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope The scope of automatic upgrades to restrict in the exclusion window. One of: **NO_UPGRADES | NO_MINOR_UPGRADES | NO_MINOR_OR_NODE_UPGRADES**
         * 
         * Specify `start_time` and `end_time` in [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) &#34;Zulu&#34; date format.  The start time&#39;s date is
         * the initial date that the window starts, and the end time is used for calculating duration.Specify `recurrence` in
         * [RFC5545](https://tools.ietf.org/html/rfc5545#section-3.8.5.3) RRULE format, to specify when this recurs.
         * Note that GKE may accept other formats, but will return values in UTC, causing a permanent diff.
         * 
         * Examples:
         * ```java
         * package generated_program;
         * 
         * import com.pulumi.Context;
         * import com.pulumi.Pulumi;
         * import com.pulumi.core.Output;
         * import java.util.List;
         * import java.util.ArrayList;
         * import java.util.Map;
         * import java.io.File;
         * import java.nio.file.Files;
         * import java.nio.file.Paths;
         * 
         * public class App {
         *     public static void main(String[] args) {
         *         Pulumi.run(App::stack);
         *     }
         * 
         *     public static void stack(Context ctx) {
         *     }
         * }
         * ```
         * 
         * @return builder
         * 
         */
        public Builder scope(String scope) {
            return scope(Output.of(scope));
        }

        public ClusterMaintenancePolicyMaintenanceExclusionExclusionOptionsArgs build() {
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
