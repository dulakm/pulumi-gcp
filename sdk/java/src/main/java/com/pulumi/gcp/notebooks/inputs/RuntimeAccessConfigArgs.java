// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeAccessConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeAccessConfigArgs Empty = new RuntimeAccessConfigArgs();

    /**
     * The type of access mode this instance. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#RuntimeAccessType`.
     * 
     */
    @Import(name="accessType")
    private @Nullable Output<String> accessType;

    /**
     * @return The type of access mode this instance. For valid values, see
     * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
     * rest/v1/projects.locations.runtimes#RuntimeAccessType`.
     * 
     */
    public Optional<Output<String>> accessType() {
        return Optional.ofNullable(this.accessType);
    }

    /**
     * (Output)
     * The proxy endpoint that is used to access the runtime.
     * 
     */
    @Import(name="proxyUri")
    private @Nullable Output<String> proxyUri;

    /**
     * @return (Output)
     * The proxy endpoint that is used to access the runtime.
     * 
     */
    public Optional<Output<String>> proxyUri() {
        return Optional.ofNullable(this.proxyUri);
    }

    /**
     * The owner of this runtime after creation. Format: `alias@example.com`.
     * Currently supports one owner only.
     * 
     */
    @Import(name="runtimeOwner")
    private @Nullable Output<String> runtimeOwner;

    /**
     * @return The owner of this runtime after creation. Format: `alias@example.com`.
     * Currently supports one owner only.
     * 
     */
    public Optional<Output<String>> runtimeOwner() {
        return Optional.ofNullable(this.runtimeOwner);
    }

    private RuntimeAccessConfigArgs() {}

    private RuntimeAccessConfigArgs(RuntimeAccessConfigArgs $) {
        this.accessType = $.accessType;
        this.proxyUri = $.proxyUri;
        this.runtimeOwner = $.runtimeOwner;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeAccessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeAccessConfigArgs $;

        public Builder() {
            $ = new RuntimeAccessConfigArgs();
        }

        public Builder(RuntimeAccessConfigArgs defaults) {
            $ = new RuntimeAccessConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessType The type of access mode this instance. For valid values, see
         * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
         * rest/v1/projects.locations.runtimes#RuntimeAccessType`.
         * 
         * @return builder
         * 
         */
        public Builder accessType(@Nullable Output<String> accessType) {
            $.accessType = accessType;
            return this;
        }

        /**
         * @param accessType The type of access mode this instance. For valid values, see
         * `https://cloud.google.com/vertex-ai/docs/workbench/reference/
         * rest/v1/projects.locations.runtimes#RuntimeAccessType`.
         * 
         * @return builder
         * 
         */
        public Builder accessType(String accessType) {
            return accessType(Output.of(accessType));
        }

        /**
         * @param proxyUri (Output)
         * The proxy endpoint that is used to access the runtime.
         * 
         * @return builder
         * 
         */
        public Builder proxyUri(@Nullable Output<String> proxyUri) {
            $.proxyUri = proxyUri;
            return this;
        }

        /**
         * @param proxyUri (Output)
         * The proxy endpoint that is used to access the runtime.
         * 
         * @return builder
         * 
         */
        public Builder proxyUri(String proxyUri) {
            return proxyUri(Output.of(proxyUri));
        }

        /**
         * @param runtimeOwner The owner of this runtime after creation. Format: `alias@example.com`.
         * Currently supports one owner only.
         * 
         * @return builder
         * 
         */
        public Builder runtimeOwner(@Nullable Output<String> runtimeOwner) {
            $.runtimeOwner = runtimeOwner;
            return this;
        }

        /**
         * @param runtimeOwner The owner of this runtime after creation. Format: `alias@example.com`.
         * Currently supports one owner only.
         * 
         * @return builder
         * 
         */
        public Builder runtimeOwner(String runtimeOwner) {
            return runtimeOwner(Output.of(runtimeOwner));
        }

        public RuntimeAccessConfigArgs build() {
            return $;
        }
    }

}
