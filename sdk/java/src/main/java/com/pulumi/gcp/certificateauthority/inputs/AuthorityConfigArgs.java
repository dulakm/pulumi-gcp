// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigSubjectConfigArgs;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigArgs;
import java.util.Objects;


public final class AuthorityConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigArgs Empty = new AuthorityConfigArgs();

    /**
     * Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_x509_config&#34;&gt;&lt;/a&gt;The `x509_config` block supports:
     * 
     */
    @Import(name="subjectConfig", required=true)
    private Output<AuthorityConfigSubjectConfigArgs> subjectConfig;

    /**
     * @return Specifies some of the values in a certificate that are related to the subject.
     * Structure is documented below.
     * 
     * &lt;a name=&#34;nested_x509_config&#34;&gt;&lt;/a&gt;The `x509_config` block supports:
     * 
     */
    public Output<AuthorityConfigSubjectConfigArgs> subjectConfig() {
        return this.subjectConfig;
    }

    /**
     * Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    @Import(name="x509Config", required=true)
    private Output<AuthorityConfigX509ConfigArgs> x509Config;

    /**
     * @return Describes how some of the technical X.509 fields in a certificate should be populated.
     * Structure is documented below.
     * 
     */
    public Output<AuthorityConfigX509ConfigArgs> x509Config() {
        return this.x509Config;
    }

    private AuthorityConfigArgs() {}

    private AuthorityConfigArgs(AuthorityConfigArgs $) {
        this.subjectConfig = $.subjectConfig;
        this.x509Config = $.x509Config;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorityConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigArgs $;

        public Builder() {
            $ = new AuthorityConfigArgs();
        }

        public Builder(AuthorityConfigArgs defaults) {
            $ = new AuthorityConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param subjectConfig Specifies some of the values in a certificate that are related to the subject.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_x509_config&#34;&gt;&lt;/a&gt;The `x509_config` block supports:
         * 
         * @return builder
         * 
         */
        public Builder subjectConfig(Output<AuthorityConfigSubjectConfigArgs> subjectConfig) {
            $.subjectConfig = subjectConfig;
            return this;
        }

        /**
         * @param subjectConfig Specifies some of the values in a certificate that are related to the subject.
         * Structure is documented below.
         * 
         * &lt;a name=&#34;nested_x509_config&#34;&gt;&lt;/a&gt;The `x509_config` block supports:
         * 
         * @return builder
         * 
         */
        public Builder subjectConfig(AuthorityConfigSubjectConfigArgs subjectConfig) {
            return subjectConfig(Output.of(subjectConfig));
        }

        /**
         * @param x509Config Describes how some of the technical X.509 fields in a certificate should be populated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder x509Config(Output<AuthorityConfigX509ConfigArgs> x509Config) {
            $.x509Config = x509Config;
            return this;
        }

        /**
         * @param x509Config Describes how some of the technical X.509 fields in a certificate should be populated.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder x509Config(AuthorityConfigX509ConfigArgs x509Config) {
            return x509Config(Output.of(x509Config));
        }

        public AuthorityConfigArgs build() {
            $.subjectConfig = Objects.requireNonNull($.subjectConfig, "expected parameter 'subjectConfig' to be non-null");
            $.x509Config = Objects.requireNonNull($.x509Config, "expected parameter 'x509Config' to be non-null");
            return $;
        }
    }

}
