// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobSparkJobLoggingConfig;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplateJobSparkJob {
    /**
     * @return HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    private @Nullable List<String> archiveUris;
    /**
     * @return The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    private @Nullable List<String> args;
    /**
     * @return HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    private @Nullable List<String> fileUris;
    /**
     * @return HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
     * 
     */
    private @Nullable List<String> jarFileUris;
    /**
     * @return The runtime log config for job execution.
     * 
     */
    private @Nullable WorkflowTemplateJobSparkJobLoggingConfig loggingConfig;
    /**
     * @return The name of the driver&#39;s main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
     * 
     */
    private @Nullable String mainClass;
    /**
     * @return The HCFS URI of the jar file that contains the main class.
     * 
     */
    private @Nullable String mainJarFileUri;
    /**
     * @return A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    private @Nullable Map<String,String> properties;

    private WorkflowTemplateJobSparkJob() {}
    /**
     * @return HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    public List<String> archiveUris() {
        return this.archiveUris == null ? List.of() : this.archiveUris;
    }
    /**
     * @return The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    public List<String> args() {
        return this.args == null ? List.of() : this.args;
    }
    /**
     * @return HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    public List<String> fileUris() {
        return this.fileUris == null ? List.of() : this.fileUris;
    }
    /**
     * @return HCFS URIs of jar files to add to the CLASSPATHs of the Spark driver and tasks.
     * 
     */
    public List<String> jarFileUris() {
        return this.jarFileUris == null ? List.of() : this.jarFileUris;
    }
    /**
     * @return The runtime log config for job execution.
     * 
     */
    public Optional<WorkflowTemplateJobSparkJobLoggingConfig> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }
    /**
     * @return The name of the driver&#39;s main class. The jar file that contains the class must be in the default CLASSPATH or specified in `jar_file_uris`.
     * 
     */
    public Optional<String> mainClass() {
        return Optional.ofNullable(this.mainClass);
    }
    /**
     * @return The HCFS URI of the jar file that contains the main class.
     * 
     */
    public Optional<String> mainJarFileUri() {
        return Optional.ofNullable(this.mainJarFileUri);
    }
    /**
     * @return A mapping of property names to values, used to configure Spark. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/spark/conf/spark-defaults.conf and classes in user code.
     * 
     */
    public Map<String,String> properties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobSparkJob defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> archiveUris;
        private @Nullable List<String> args;
        private @Nullable List<String> fileUris;
        private @Nullable List<String> jarFileUris;
        private @Nullable WorkflowTemplateJobSparkJobLoggingConfig loggingConfig;
        private @Nullable String mainClass;
        private @Nullable String mainJarFileUri;
        private @Nullable Map<String,String> properties;
        public Builder() {}
        public Builder(WorkflowTemplateJobSparkJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainClass = defaults.mainClass;
    	      this.mainJarFileUri = defaults.mainJarFileUri;
    	      this.properties = defaults.properties;
        }

        @CustomType.Setter
        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        @CustomType.Setter
        public Builder args(@Nullable List<String> args) {
            this.args = args;
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        @CustomType.Setter
        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = fileUris;
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
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
        public Builder loggingConfig(@Nullable WorkflowTemplateJobSparkJobLoggingConfig loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        @CustomType.Setter
        public Builder mainClass(@Nullable String mainClass) {
            this.mainClass = mainClass;
            return this;
        }
        @CustomType.Setter
        public Builder mainJarFileUri(@Nullable String mainJarFileUri) {
            this.mainJarFileUri = mainJarFileUri;
            return this;
        }
        @CustomType.Setter
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }
        public WorkflowTemplateJobSparkJob build() {
            final var o = new WorkflowTemplateJobSparkJob();
            o.archiveUris = archiveUris;
            o.args = args;
            o.fileUris = fileUris;
            o.jarFileUris = jarFileUris;
            o.loggingConfig = loggingConfig;
            o.mainClass = mainClass;
            o.mainJarFileUri = mainJarFileUri;
            o.properties = properties;
            return o;
        }
    }
}
