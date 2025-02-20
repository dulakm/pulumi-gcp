// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.firebase.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HostingVersionConfigRedirect {
    /**
     * @return The user-supplied glob to match against the request URL path.
     * 
     */
    private @Nullable String glob;
    /**
     * @return The value to put in the HTTP location header of the response.
     * The location can contain capture group values from the pattern using a : prefix to identify
     * the segment and an optional * to capture the rest of the URL. For example:
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
    private String location;
    /**
     * @return The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    private @Nullable String regex;
    /**
     * @return The status HTTP code to return in the response. It must be a valid 3xx status code.
     * 
     */
    private Integer statusCode;

    private HostingVersionConfigRedirect() {}
    /**
     * @return The user-supplied glob to match against the request URL path.
     * 
     */
    public Optional<String> glob() {
        return Optional.ofNullable(this.glob);
    }
    /**
     * @return The value to put in the HTTP location header of the response.
     * The location can contain capture group values from the pattern using a : prefix to identify
     * the segment and an optional * to capture the rest of the URL. For example:
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
    public String location() {
        return this.location;
    }
    /**
     * @return The user-supplied RE2 regular expression to match against the request URL path.
     * 
     */
    public Optional<String> regex() {
        return Optional.ofNullable(this.regex);
    }
    /**
     * @return The status HTTP code to return in the response. It must be a valid 3xx status code.
     * 
     */
    public Integer statusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostingVersionConfigRedirect defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String glob;
        private String location;
        private @Nullable String regex;
        private Integer statusCode;
        public Builder() {}
        public Builder(HostingVersionConfigRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.glob = defaults.glob;
    	      this.location = defaults.location;
    	      this.regex = defaults.regex;
    	      this.statusCode = defaults.statusCode;
        }

        @CustomType.Setter
        public Builder glob(@Nullable String glob) {
            this.glob = glob;
            return this;
        }
        @CustomType.Setter
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        @CustomType.Setter
        public Builder regex(@Nullable String regex) {
            this.regex = regex;
            return this;
        }
        @CustomType.Setter
        public Builder statusCode(Integer statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }
        public HostingVersionConfigRedirect build() {
            final var o = new HostingVersionConfigRedirect();
            o.glob = glob;
            o.location = location;
            o.regex = regex;
            o.statusCode = statusCode;
            return o;
        }
    }
}
