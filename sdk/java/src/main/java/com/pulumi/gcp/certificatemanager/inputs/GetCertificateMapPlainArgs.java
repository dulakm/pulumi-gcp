// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateMapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateMapPlainArgs Empty = new GetCertificateMapPlainArgs();

    /**
     * The name of the certificate map.
     * 
     * ***
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the certificate map.
     * 
     * ***
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetCertificateMapPlainArgs() {}

    private GetCertificateMapPlainArgs(GetCertificateMapPlainArgs $) {
        this.name = $.name;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateMapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateMapPlainArgs $;

        public Builder() {
            $ = new GetCertificateMapPlainArgs();
        }

        public Builder(GetCertificateMapPlainArgs defaults) {
            $ = new GetCertificateMapPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the certificate map.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs. If it
         * is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetCertificateMapPlainArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
