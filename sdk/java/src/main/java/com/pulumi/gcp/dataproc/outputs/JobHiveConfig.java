// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobHiveConfig {
    /**
     * @return Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    private @Nullable Boolean continueOnFailure;
    /**
     * @return HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs.
     * 
     */
    private @Nullable List<String> jarFileUris;
    /**
     * @return A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties set in `/etc/hadoop/conf/*-site.xml`, `/etc/hive/conf/hive-site.xml`, and classes in user code..
     * 
     */
    private @Nullable Map<String,String> properties;
    /**
     * @return HCFS URI of file containing Hive script to execute as the job.
     * Conflicts with `query_list`
     * 
     */
    private @Nullable String queryFileUri;
    /**
     * @return The list of Hive queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    private @Nullable List<String> queryLists;
    /**
     * @return Mapping of query variable names to values (equivalent to the Hive command: `SET name=&#34;value&#34;;`).
     * 
     */
    private @Nullable Map<String,String> scriptVariables;

    private JobHiveConfig() {}
    /**
     * @return Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries. Defaults to false.
     * 
     */
    public Optional<Boolean> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }
    /**
     * @return HCFS URIs of jar files to add to the CLASSPATH of the Hive server and Hadoop MapReduce (MR) tasks. Can contain Hive SerDes and UDFs.
     * 
     */
    public List<String> jarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    /**
     * @return A mapping of property names and values, used to configure Hive. Properties that conflict with values set by the Cloud Dataproc API may be overwritten. Can include properties set in `/etc/hadoop/conf/*-site.xml`, `/etc/hive/conf/hive-site.xml`, and classes in user code..
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * @return HCFS URI of file containing Hive script to execute as the job.
     * Conflicts with `query_list`
     * 
     */
    public Optional<String> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }
    /**
     * @return The list of Hive queries or statements to execute as part of the job.
     * Conflicts with `query_file_uri`
     * 
     */
    public List<String> queryLists() {
        return this.queryLists == null ? List.of() : this.queryLists;
    }
    /**
     * @return Mapping of query variable names to values (equivalent to the Hive command: `SET name=&#34;value&#34;;`).
     * 
     */
    public Map<String,String> scriptVariables() {
        return this.scriptVariables == null ? Map.of() : this.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobHiveConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean continueOnFailure;
        private @Nullable List<String> jarFileUris;
        private @Nullable Map<String,String> properties;
        private @Nullable String queryFileUri;
        private @Nullable List<String> queryLists;
        private @Nullable Map<String,String> scriptVariables;
        public Builder() {}
        public Builder(JobHiveConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryLists = defaults.queryLists;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        @CustomType.Setter
        public Builder continueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }
        @CustomType.Setter
        public Builder jarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }
        @CustomType.Setter
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        @CustomType.Setter
        public Builder queryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }
        @CustomType.Setter
        public Builder queryLists(@Nullable List<String> queryLists) {
            this.queryLists = queryLists;
            return this;
        }
        public Builder queryLists(String... queryLists) {
            return queryLists(List.of(queryLists));
        }
        @CustomType.Setter
        public Builder scriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }
        public JobHiveConfig build() {
            final var o = new JobHiveConfig();
            o.continueOnFailure = continueOnFailure;
            o.jarFileUris = jarFileUris;
            o.properties = properties;
            o.queryFileUri = queryFileUri;
            o.queryLists = queryLists;
            o.scriptVariables = scriptVariables;
            return o;
        }
    }
}
