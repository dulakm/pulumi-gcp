// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.datacatalog.inputs.TagTemplateIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TagTemplateIamBindingArgs extends com.pulumi.resources.ResourceArgs {

    public static final TagTemplateIamBindingArgs Empty = new TagTemplateIamBindingArgs();

    @Import(name="condition")
    private @Nullable Output<TagTemplateIamBindingConditionArgs> condition;

    public Optional<Output<TagTemplateIamBindingConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    @Import(name="members", required=true)
    private Output<List<String>> members;

    public Output<List<String>> members() {
        return this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
     *   Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * **projectOwner:projectid**: Owners of the given project. For example, &#34;projectOwner:my-example-project&#34;
     * * **projectEditor:projectid**: Editors of the given project. For example, &#34;projectEditor:my-example-project&#34;
     * * **projectViewer:projectid**: Viewers of the given project. For example, &#34;projectViewer:my-example-project&#34;
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
     *   Each entry can have one of the following values:
     * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
     * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
     * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
     * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
     * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
     * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
     * * **projectOwner:projectid**: Owners of the given project. For example, &#34;projectOwner:my-example-project&#34;
     * * **projectEditor:projectid**: Editors of the given project. For example, &#34;projectEditor:my-example-project&#34;
     * * **projectViewer:projectid**: Viewers of the given project. For example, &#34;projectViewer:my-example-project&#34;
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.TagTemplateIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role", required=true)
    private Output<String> role;

    /**
     * @return The role that should be applied. Only one
     * `gcp.datacatalog.TagTemplateIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    public Output<String> role() {
        return this.role;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @Import(name="tagTemplate", required=true)
    private Output<String> tagTemplate;

    /**
     * @return Used to find the parent resource to bind the IAM policy to
     * 
     */
    public Output<String> tagTemplate() {
        return this.tagTemplate;
    }

    private TagTemplateIamBindingArgs() {}

    private TagTemplateIamBindingArgs(TagTemplateIamBindingArgs $) {
        this.condition = $.condition;
        this.members = $.members;
        this.project = $.project;
        this.region = $.region;
        this.role = $.role;
        this.tagTemplate = $.tagTemplate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TagTemplateIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TagTemplateIamBindingArgs $;

        public Builder() {
            $ = new TagTemplateIamBindingArgs();
        }

        public Builder(TagTemplateIamBindingArgs defaults) {
            $ = new TagTemplateIamBindingArgs(Objects.requireNonNull(defaults));
        }

        public Builder condition(@Nullable Output<TagTemplateIamBindingConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        public Builder condition(TagTemplateIamBindingConditionArgs condition) {
            return condition(Output.of(condition));
        }

        public Builder members(Output<List<String>> members) {
            $.members = members;
            return this;
        }

        public Builder members(List<String> members) {
            return members(Output.of(members));
        }

        public Builder members(String... members) {
            return members(List.of(members));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
         *   Each entry can have one of the following values:
         * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
         * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
         * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
         * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
         * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
         * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
         * * **projectOwner:projectid**: Owners of the given project. For example, &#34;projectOwner:my-example-project&#34;
         * * **projectEditor:projectid**: Editors of the given project. For example, &#34;projectEditor:my-example-project&#34;
         * * **projectViewer:projectid**: Viewers of the given project. For example, &#34;projectViewer:my-example-project&#34;
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
         * 
         * * `member/members` - (Required) Identities that will be granted the privilege in `role`.
         *   Each entry can have one of the following values:
         * * **allUsers**: A special identifier that represents anyone who is on the internet; with or without a Google account.
         * * **allAuthenticatedUsers**: A special identifier that represents anyone who is authenticated with a Google account or a service account.
         * * **user:{emailid}**: An email address that represents a specific Google account. For example, alice@gmail.com or joe@example.com.
         * * **serviceAccount:{emailid}**: An email address that represents a service account. For example, my-other-app@appspot.gserviceaccount.com.
         * * **group:{emailid}**: An email address that represents a Google group. For example, admins@example.com.
         * * **domain:{domain}**: A G Suite domain (primary, instead of alias) name that represents all the users of that domain. For example, google.com or example.com.
         * * **projectOwner:projectid**: Owners of the given project. For example, &#34;projectOwner:my-example-project&#34;
         * * **projectEditor:projectid**: Editors of the given project. For example, &#34;projectEditor:my-example-project&#34;
         * * **projectViewer:projectid**: Viewers of the given project. For example, &#34;projectViewer:my-example-project&#34;
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.datacatalog.TagTemplateIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The role that should be applied. Only one
         * `gcp.datacatalog.TagTemplateIamBinding` can be used per role. Note that custom roles must be of the format
         * `[projects|organizations]/{parent-name}/roles/{role-name}`.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param tagTemplate Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder tagTemplate(Output<String> tagTemplate) {
            $.tagTemplate = tagTemplate;
            return this;
        }

        /**
         * @param tagTemplate Used to find the parent resource to bind the IAM policy to
         * 
         * @return builder
         * 
         */
        public Builder tagTemplate(String tagTemplate) {
            return tagTemplate(Output.of(tagTemplate));
        }

        public TagTemplateIamBindingArgs build() {
            $.members = Objects.requireNonNull($.members, "expected parameter 'members' to be non-null");
            $.role = Objects.requireNonNull($.role, "expected parameter 'role' to be non-null");
            $.tagTemplate = Objects.requireNonNull($.tagTemplate, "expected parameter 'tagTemplate' to be non-null");
            return $;
        }
    }

}
