// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.artifactregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs Empty = new RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs();

    /**
     * A common public repository base for Yum.
     * Possible values are: `CENTOS`, `CENTOS_DEBUG`, `CENTOS_VAULT`, `CENTOS_STREAM`, `ROCKY`, `EPEL`.
     * 
     */
    @Import(name="repositoryBase", required=true)
    private Output<String> repositoryBase;

    /**
     * @return A common public repository base for Yum.
     * Possible values are: `CENTOS`, `CENTOS_DEBUG`, `CENTOS_VAULT`, `CENTOS_STREAM`, `ROCKY`, `EPEL`.
     * 
     */
    public Output<String> repositoryBase() {
        return this.repositoryBase;
    }

    /**
     * Specific repository from the base, e.g. `&#34;centos/8-stream/BaseOS/x86_64/os&#34;`
     * 
     */
    @Import(name="repositoryPath", required=true)
    private Output<String> repositoryPath;

    /**
     * @return Specific repository from the base, e.g. `&#34;centos/8-stream/BaseOS/x86_64/os&#34;`
     * 
     */
    public Output<String> repositoryPath() {
        return this.repositoryPath;
    }

    private RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs() {}

    private RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs(RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs $) {
        this.repositoryBase = $.repositoryBase;
        this.repositoryPath = $.repositoryPath;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs $;

        public Builder() {
            $ = new RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs();
        }

        public Builder(RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs defaults) {
            $ = new RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param repositoryBase A common public repository base for Yum.
         * Possible values are: `CENTOS`, `CENTOS_DEBUG`, `CENTOS_VAULT`, `CENTOS_STREAM`, `ROCKY`, `EPEL`.
         * 
         * @return builder
         * 
         */
        public Builder repositoryBase(Output<String> repositoryBase) {
            $.repositoryBase = repositoryBase;
            return this;
        }

        /**
         * @param repositoryBase A common public repository base for Yum.
         * Possible values are: `CENTOS`, `CENTOS_DEBUG`, `CENTOS_VAULT`, `CENTOS_STREAM`, `ROCKY`, `EPEL`.
         * 
         * @return builder
         * 
         */
        public Builder repositoryBase(String repositoryBase) {
            return repositoryBase(Output.of(repositoryBase));
        }

        /**
         * @param repositoryPath Specific repository from the base, e.g. `&#34;centos/8-stream/BaseOS/x86_64/os&#34;`
         * 
         * @return builder
         * 
         */
        public Builder repositoryPath(Output<String> repositoryPath) {
            $.repositoryPath = repositoryPath;
            return this;
        }

        /**
         * @param repositoryPath Specific repository from the base, e.g. `&#34;centos/8-stream/BaseOS/x86_64/os&#34;`
         * 
         * @return builder
         * 
         */
        public Builder repositoryPath(String repositoryPath) {
            return repositoryPath(Output.of(repositoryPath));
        }

        public RepositoryRemoteRepositoryConfigYumRepositoryPublicRepositoryArgs build() {
            $.repositoryBase = Objects.requireNonNull($.repositoryBase, "expected parameter 'repositoryBase' to be non-null");
            $.repositoryPath = Objects.requireNonNull($.repositoryPath, "expected parameter 'repositoryPath' to be non-null");
            return $;
        }
    }

}
