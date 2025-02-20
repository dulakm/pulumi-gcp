// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.apigateway.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.apigateway.outputs.ApiConfigGrpcServiceFileDescriptorSet;
import com.pulumi.gcp.apigateway.outputs.ApiConfigGrpcServiceSource;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ApiConfigGrpcService {
    /**
     * @return Input only. File descriptor set, generated by protoc.
     * To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
     * $ protoc --include_imports --include_source_info test.proto -o out.pb
     * Structure is documented below.
     * 
     */
    private ApiConfigGrpcServiceFileDescriptorSet fileDescriptorSet;
    /**
     * @return Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate fileDescriptorSet.
     * Structure is documented below.
     * 
     */
    private @Nullable List<ApiConfigGrpcServiceSource> sources;

    private ApiConfigGrpcService() {}
    /**
     * @return Input only. File descriptor set, generated by protoc.
     * To generate, use protoc with imports and source info included. For an example test.proto file, the following command would put the value in a new file named out.pb.
     * $ protoc --include_imports --include_source_info test.proto -o out.pb
     * Structure is documented below.
     * 
     */
    public ApiConfigGrpcServiceFileDescriptorSet fileDescriptorSet() {
        return this.fileDescriptorSet;
    }
    /**
     * @return Uncompiled proto files associated with the descriptor set, used for display purposes (server-side compilation is not supported). These should match the inputs to &#39;protoc&#39; command used to generate fileDescriptorSet.
     * Structure is documented below.
     * 
     */
    public List<ApiConfigGrpcServiceSource> sources() {
        return this.sources == null ? List.of() : this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigGrpcService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private ApiConfigGrpcServiceFileDescriptorSet fileDescriptorSet;
        private @Nullable List<ApiConfigGrpcServiceSource> sources;
        public Builder() {}
        public Builder(ApiConfigGrpcService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileDescriptorSet = defaults.fileDescriptorSet;
    	      this.sources = defaults.sources;
        }

        @CustomType.Setter
        public Builder fileDescriptorSet(ApiConfigGrpcServiceFileDescriptorSet fileDescriptorSet) {
            this.fileDescriptorSet = Objects.requireNonNull(fileDescriptorSet);
            return this;
        }
        @CustomType.Setter
        public Builder sources(@Nullable List<ApiConfigGrpcServiceSource> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(ApiConfigGrpcServiceSource... sources) {
            return sources(List.of(sources));
        }
        public ApiConfigGrpcService build() {
            final var o = new ApiConfigGrpcService();
            o.fileDescriptorSet = fileDescriptorSet;
            o.sources = sources;
            return o;
        }
    }
}
