// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudrunv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeGrpcArgs;
import com.pulumi.gcp.cloudrunv2.inputs.ServiceTemplateContainerLivenessProbeHttpGetArgs;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceTemplateContainerLivenessProbeArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateContainerLivenessProbeArgs Empty = new ServiceTemplateContainerLivenessProbeArgs();

    /**
     * Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    /**
     * @return Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
     * 
     */
    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    /**
     * GRPC specifies an action involving a GRPC port.
     * Structure is documented below.
     * 
     */
    @Import(name="grpc")
    private @Nullable Output<ServiceTemplateContainerLivenessProbeGrpcArgs> grpc;

    /**
     * @return GRPC specifies an action involving a GRPC port.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServiceTemplateContainerLivenessProbeGrpcArgs>> grpc() {
        return Optional.ofNullable(this.grpc);
    }

    /**
     * HTTPGet specifies the http request to perform.
     * Structure is documented below.
     * 
     */
    @Import(name="httpGet")
    private @Nullable Output<ServiceTemplateContainerLivenessProbeHttpGetArgs> httpGet;

    /**
     * @return HTTPGet specifies the http request to perform.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServiceTemplateContainerLivenessProbeHttpGetArgs>> httpGet() {
        return Optional.ofNullable(this.httpGet);
    }

    /**
     * Number of seconds after the container has started before the probe is initiated. Defaults to 0 seconds. Minimum value is 0. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="initialDelaySeconds")
    private @Nullable Output<Integer> initialDelaySeconds;

    /**
     * @return Number of seconds after the container has started before the probe is initiated. Defaults to 0 seconds. Minimum value is 0. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Optional<Output<Integer>> initialDelaySeconds() {
        return Optional.ofNullable(this.initialDelaySeconds);
    }

    /**
     * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. Must be greater or equal than timeoutSeconds
     * 
     */
    @Import(name="periodSeconds")
    private @Nullable Output<Integer> periodSeconds;

    /**
     * @return How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. Must be greater or equal than timeoutSeconds
     * 
     */
    public Optional<Output<Integer>> periodSeconds() {
        return Optional.ofNullable(this.periodSeconds);
    }

    /**
     * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 3600. Must be smaller than periodSeconds. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    @Import(name="timeoutSeconds")
    private @Nullable Output<Integer> timeoutSeconds;

    /**
     * @return Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 3600. Must be smaller than periodSeconds. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
     * 
     */
    public Optional<Output<Integer>> timeoutSeconds() {
        return Optional.ofNullable(this.timeoutSeconds);
    }

    private ServiceTemplateContainerLivenessProbeArgs() {}

    private ServiceTemplateContainerLivenessProbeArgs(ServiceTemplateContainerLivenessProbeArgs $) {
        this.failureThreshold = $.failureThreshold;
        this.grpc = $.grpc;
        this.httpGet = $.httpGet;
        this.initialDelaySeconds = $.initialDelaySeconds;
        this.periodSeconds = $.periodSeconds;
        this.timeoutSeconds = $.timeoutSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceTemplateContainerLivenessProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceTemplateContainerLivenessProbeArgs $;

        public Builder() {
            $ = new ServiceTemplateContainerLivenessProbeArgs();
        }

        public Builder(ServiceTemplateContainerLivenessProbeArgs defaults) {
            $ = new ServiceTemplateContainerLivenessProbeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param failureThreshold Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        /**
         * @param grpc GRPC specifies an action involving a GRPC port.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder grpc(@Nullable Output<ServiceTemplateContainerLivenessProbeGrpcArgs> grpc) {
            $.grpc = grpc;
            return this;
        }

        /**
         * @param grpc GRPC specifies an action involving a GRPC port.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder grpc(ServiceTemplateContainerLivenessProbeGrpcArgs grpc) {
            return grpc(Output.of(grpc));
        }

        /**
         * @param httpGet HTTPGet specifies the http request to perform.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder httpGet(@Nullable Output<ServiceTemplateContainerLivenessProbeHttpGetArgs> httpGet) {
            $.httpGet = httpGet;
            return this;
        }

        /**
         * @param httpGet HTTPGet specifies the http request to perform.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder httpGet(ServiceTemplateContainerLivenessProbeHttpGetArgs httpGet) {
            return httpGet(Output.of(httpGet));
        }

        /**
         * @param initialDelaySeconds Number of seconds after the container has started before the probe is initiated. Defaults to 0 seconds. Minimum value is 0. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(@Nullable Output<Integer> initialDelaySeconds) {
            $.initialDelaySeconds = initialDelaySeconds;
            return this;
        }

        /**
         * @param initialDelaySeconds Number of seconds after the container has started before the probe is initiated. Defaults to 0 seconds. Minimum value is 0. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * 
         * @return builder
         * 
         */
        public Builder initialDelaySeconds(Integer initialDelaySeconds) {
            return initialDelaySeconds(Output.of(initialDelaySeconds));
        }

        /**
         * @param periodSeconds How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. Must be greater or equal than timeoutSeconds
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(@Nullable Output<Integer> periodSeconds) {
            $.periodSeconds = periodSeconds;
            return this;
        }

        /**
         * @param periodSeconds How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Maximum value for liveness probe is 3600. Maximum value for startup probe is 240. Must be greater or equal than timeoutSeconds
         * 
         * @return builder
         * 
         */
        public Builder periodSeconds(Integer periodSeconds) {
            return periodSeconds(Output.of(periodSeconds));
        }

        /**
         * @param timeoutSeconds Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 3600. Must be smaller than periodSeconds. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(@Nullable Output<Integer> timeoutSeconds) {
            $.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * @param timeoutSeconds Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1. Maximum value is 3600. Must be smaller than periodSeconds. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
         * 
         * @return builder
         * 
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            return timeoutSeconds(Output.of(timeoutSeconds));
        }

        public ServiceTemplateContainerLivenessProbeArgs build() {
            return $;
        }
    }

}
