// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.endpoints.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetServiceIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceIamPolicyArgs Empty = new GetServiceIamPolicyArgs();

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    private GetServiceIamPolicyArgs() {}

    private GetServiceIamPolicyArgs(GetServiceIamPolicyArgs $) {
        this.serviceName = $.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceIamPolicyArgs $;

        public Builder() {
            $ = new GetServiceIamPolicyArgs();
        }

        public Builder(GetServiceIamPolicyArgs defaults) {
            $ = new GetServiceIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public GetServiceIamPolicyArgs build() {
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
