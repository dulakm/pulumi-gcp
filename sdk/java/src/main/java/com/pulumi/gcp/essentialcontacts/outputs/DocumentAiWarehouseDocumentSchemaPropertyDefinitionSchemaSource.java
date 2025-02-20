// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.essentialcontacts.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource {
    /**
     * @return The schema name in the source.
     * 
     */
    private @Nullable String name;
    /**
     * @return The Doc AI processor type name.
     * 
     */
    private @Nullable String processorType;

    private DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource() {}
    /**
     * @return The schema name in the source.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return The Doc AI processor type name.
     * 
     */
    public Optional<String> processorType() {
        return Optional.ofNullable(this.processorType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String processorType;
        public Builder() {}
        public Builder(DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.processorType = defaults.processorType;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder processorType(@Nullable String processorType) {
            this.processorType = processorType;
            return this;
        }
        public DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource build() {
            final var o = new DocumentAiWarehouseDocumentSchemaPropertyDefinitionSchemaSource();
            o.name = name;
            o.processorType = processorType;
            return o;
        }
    }
}
