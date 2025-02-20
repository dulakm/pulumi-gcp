// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.osconfig.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepArchiveExtraction;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepDpkgInstallation;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepFileCopy;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepFileExec;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepMsiInstallation;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepRpmInstallation;
import com.pulumi.gcp.osconfig.outputs.GuestPoliciesRecipeUpdateStepScriptRun;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GuestPoliciesRecipeUpdateStep {
    /**
     * @return Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
     */
    private @Nullable GuestPoliciesRecipeUpdateStepArchiveExtraction archiveExtraction;
    /**
     * @return Installs a deb file via dpkg.
     * Structure is documented below.
     * 
     */
    private @Nullable GuestPoliciesRecipeUpdateStepDpkgInstallation dpkgInstallation;
    /**
     * @return Copies a file onto the instance.
     * Structure is documented below.
     * 
     */
    private @Nullable GuestPoliciesRecipeUpdateStepFileCopy fileCopy;
    /**
     * @return Executes an artifact or local file.
     * Structure is documented below.
     * 
     */
    private @Nullable GuestPoliciesRecipeUpdateStepFileExec fileExec;
    /**
     * @return Installs an MSI file.
     * Structure is documented below.
     * 
     */
    private @Nullable GuestPoliciesRecipeUpdateStepMsiInstallation msiInstallation;
    /**
     * @return Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
     */
    private @Nullable GuestPoliciesRecipeUpdateStepRpmInstallation rpmInstallation;
    /**
     * @return Runs commands in a shell.
     * Structure is documented below.
     * 
     */
    private @Nullable GuestPoliciesRecipeUpdateStepScriptRun scriptRun;

    private GuestPoliciesRecipeUpdateStep() {}
    /**
     * @return Extracts an archive into the specified directory.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesRecipeUpdateStepArchiveExtraction> archiveExtraction() {
        return Optional.ofNullable(this.archiveExtraction);
    }
    /**
     * @return Installs a deb file via dpkg.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesRecipeUpdateStepDpkgInstallation> dpkgInstallation() {
        return Optional.ofNullable(this.dpkgInstallation);
    }
    /**
     * @return Copies a file onto the instance.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesRecipeUpdateStepFileCopy> fileCopy() {
        return Optional.ofNullable(this.fileCopy);
    }
    /**
     * @return Executes an artifact or local file.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesRecipeUpdateStepFileExec> fileExec() {
        return Optional.ofNullable(this.fileExec);
    }
    /**
     * @return Installs an MSI file.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesRecipeUpdateStepMsiInstallation> msiInstallation() {
        return Optional.ofNullable(this.msiInstallation);
    }
    /**
     * @return Installs an rpm file via the rpm utility.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesRecipeUpdateStepRpmInstallation> rpmInstallation() {
        return Optional.ofNullable(this.rpmInstallation);
    }
    /**
     * @return Runs commands in a shell.
     * Structure is documented below.
     * 
     */
    public Optional<GuestPoliciesRecipeUpdateStepScriptRun> scriptRun() {
        return Optional.ofNullable(this.scriptRun);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestPoliciesRecipeUpdateStep defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable GuestPoliciesRecipeUpdateStepArchiveExtraction archiveExtraction;
        private @Nullable GuestPoliciesRecipeUpdateStepDpkgInstallation dpkgInstallation;
        private @Nullable GuestPoliciesRecipeUpdateStepFileCopy fileCopy;
        private @Nullable GuestPoliciesRecipeUpdateStepFileExec fileExec;
        private @Nullable GuestPoliciesRecipeUpdateStepMsiInstallation msiInstallation;
        private @Nullable GuestPoliciesRecipeUpdateStepRpmInstallation rpmInstallation;
        private @Nullable GuestPoliciesRecipeUpdateStepScriptRun scriptRun;
        public Builder() {}
        public Builder(GuestPoliciesRecipeUpdateStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveExtraction = defaults.archiveExtraction;
    	      this.dpkgInstallation = defaults.dpkgInstallation;
    	      this.fileCopy = defaults.fileCopy;
    	      this.fileExec = defaults.fileExec;
    	      this.msiInstallation = defaults.msiInstallation;
    	      this.rpmInstallation = defaults.rpmInstallation;
    	      this.scriptRun = defaults.scriptRun;
        }

        @CustomType.Setter
        public Builder archiveExtraction(@Nullable GuestPoliciesRecipeUpdateStepArchiveExtraction archiveExtraction) {
            this.archiveExtraction = archiveExtraction;
            return this;
        }
        @CustomType.Setter
        public Builder dpkgInstallation(@Nullable GuestPoliciesRecipeUpdateStepDpkgInstallation dpkgInstallation) {
            this.dpkgInstallation = dpkgInstallation;
            return this;
        }
        @CustomType.Setter
        public Builder fileCopy(@Nullable GuestPoliciesRecipeUpdateStepFileCopy fileCopy) {
            this.fileCopy = fileCopy;
            return this;
        }
        @CustomType.Setter
        public Builder fileExec(@Nullable GuestPoliciesRecipeUpdateStepFileExec fileExec) {
            this.fileExec = fileExec;
            return this;
        }
        @CustomType.Setter
        public Builder msiInstallation(@Nullable GuestPoliciesRecipeUpdateStepMsiInstallation msiInstallation) {
            this.msiInstallation = msiInstallation;
            return this;
        }
        @CustomType.Setter
        public Builder rpmInstallation(@Nullable GuestPoliciesRecipeUpdateStepRpmInstallation rpmInstallation) {
            this.rpmInstallation = rpmInstallation;
            return this;
        }
        @CustomType.Setter
        public Builder scriptRun(@Nullable GuestPoliciesRecipeUpdateStepScriptRun scriptRun) {
            this.scriptRun = scriptRun;
            return this;
        }
        public GuestPoliciesRecipeUpdateStep build() {
            final var o = new GuestPoliciesRecipeUpdateStep();
            o.archiveExtraction = archiveExtraction;
            o.dpkgInstallation = dpkgInstallation;
            o.fileCopy = fileCopy;
            o.fileExec = fileExec;
            o.msiInstallation = msiInstallation;
            o.rpmInstallation = rpmInstallation;
            o.scriptRun = scriptRun;
            return o;
        }
    }
}
