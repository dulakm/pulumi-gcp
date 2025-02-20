// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CxFlowAdvancedSettingsAudioExportGcsDestination {
    /**
     * @return The Google Cloud Storage URI for the exported objects. Whether a full object name, or just a prefix, its usage depends on the Dialogflow operation.
     * Format: gs://bucket/object-name-or-prefix
     * 
     */
    private @Nullable String uri;

    private CxFlowAdvancedSettingsAudioExportGcsDestination() {}
    /**
     * @return The Google Cloud Storage URI for the exported objects. Whether a full object name, or just a prefix, its usage depends on the Dialogflow operation.
     * Format: gs://bucket/object-name-or-prefix
     * 
     */
    public Optional<String> uri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CxFlowAdvancedSettingsAudioExportGcsDestination defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String uri;
        public Builder() {}
        public Builder(CxFlowAdvancedSettingsAudioExportGcsDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public CxFlowAdvancedSettingsAudioExportGcsDestination build() {
            final var o = new CxFlowAdvancedSettingsAudioExportGcsDestination();
            o.uri = uri;
            return o;
        }
    }
}
