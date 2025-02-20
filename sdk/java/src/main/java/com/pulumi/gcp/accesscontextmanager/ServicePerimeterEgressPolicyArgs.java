// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressFromArgs;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterEgressPolicyEgressToArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterEgressPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterEgressPolicyArgs Empty = new ServicePerimeterEgressPolicyArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
    private @Nullable Output<ServicePerimeterEgressPolicyEgressFromArgs> egressFrom;

    /**
     * @return Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterEgressPolicyEgressFromArgs>> egressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
    private @Nullable Output<ServicePerimeterEgressPolicyEgressToArgs> egressTo;

    /**
     * @return Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    public Optional<Output<ServicePerimeterEgressPolicyEgressToArgs>> egressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    /**
     * The name of the Service Perimeter to add this resource to.
     * 
     * ***
     * 
     */
    @Import(name="perimeter", required=true)
    private Output<String> perimeter;

    /**
     * @return The name of the Service Perimeter to add this resource to.
     * 
     * ***
     * 
     */
    public Output<String> perimeter() {
        return this.perimeter;
    }

    private ServicePerimeterEgressPolicyArgs() {}

    private ServicePerimeterEgressPolicyArgs(ServicePerimeterEgressPolicyArgs $) {
        this.egressFrom = $.egressFrom;
        this.egressTo = $.egressTo;
        this.perimeter = $.perimeter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterEgressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterEgressPolicyArgs $;

        public Builder() {
            $ = new ServicePerimeterEgressPolicyArgs();
        }

        public Builder(ServicePerimeterEgressPolicyArgs defaults) {
            $ = new ServicePerimeterEgressPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(@Nullable Output<ServicePerimeterEgressPolicyEgressFromArgs> egressFrom) {
            $.egressFrom = egressFrom;
            return this;
        }

        /**
         * @param egressFrom Defines conditions on the source of a request causing this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressFrom(ServicePerimeterEgressPolicyEgressFromArgs egressFrom) {
            return egressFrom(Output.of(egressFrom));
        }

        /**
         * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
         * cause this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressTo(@Nullable Output<ServicePerimeterEgressPolicyEgressToArgs> egressTo) {
            $.egressTo = egressTo;
            return this;
        }

        /**
         * @param egressTo Defines the conditions on the `ApiOperation` and destination resources that
         * cause this `EgressPolicy` to apply.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder egressTo(ServicePerimeterEgressPolicyEgressToArgs egressTo) {
            return egressTo(Output.of(egressTo));
        }

        /**
         * @param perimeter The name of the Service Perimeter to add this resource to.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder perimeter(Output<String> perimeter) {
            $.perimeter = perimeter;
            return this;
        }

        /**
         * @param perimeter The name of the Service Perimeter to add this resource to.
         * 
         * ***
         * 
         * @return builder
         * 
         */
        public Builder perimeter(String perimeter) {
            return perimeter(Output.of(perimeter));
        }

        public ServicePerimeterEgressPolicyArgs build() {
            $.perimeter = Objects.requireNonNull($.perimeter, "expected parameter 'perimeter' to be non-null");
            return $;
        }
    }

}
