// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.tags.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTagValueResult {
    /**
     * @return Creation time.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private String createTime;
    private String description;
    /**
     * @return an identifier for the resource with format `tagValues/{{name}}`
     * 
     */
    private String id;
    /**
     * @return The generated numeric id for the TagValue.
     * 
     */
    private String name;
    /**
     * @return Namespaced name of the TagValue.
     * 
     */
    private String namespacedName;
    private String parent;
    private String shortName;
    /**
     * @return Update time.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    private String updateTime;

    private GetTagValueResult() {}
    /**
     * @return Creation time.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    public String description() {
        return this.description;
    }
    /**
     * @return an identifier for the resource with format `tagValues/{{name}}`
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The generated numeric id for the TagValue.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Namespaced name of the TagValue.
     * 
     */
    public String namespacedName() {
        return this.namespacedName;
    }
    public String parent() {
        return this.parent;
    }
    public String shortName() {
        return this.shortName;
    }
    /**
     * @return Update time.
     * A timestamp in RFC3339 UTC &#34;Zulu&#34; format, with nanosecond resolution and up to nine fractional digits. Examples: &#34;2014-10-02T15:01:23Z&#34; and &#34;2014-10-02T15:01:23.045123456Z&#34;.
     * 
     */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagValueResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private String id;
        private String name;
        private String namespacedName;
        private String parent;
        private String shortName;
        private String updateTime;
        public Builder() {}
        public Builder(GetTagValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.namespacedName = defaults.namespacedName;
    	      this.parent = defaults.parent;
    	      this.shortName = defaults.shortName;
    	      this.updateTime = defaults.updateTime;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder namespacedName(String namespacedName) {
            this.namespacedName = Objects.requireNonNull(namespacedName);
            return this;
        }
        @CustomType.Setter
        public Builder parent(String parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        @CustomType.Setter
        public Builder shortName(String shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }
        @CustomType.Setter
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetTagValueResult build() {
            final var o = new GetTagValueResult();
            o.createTime = createTime;
            o.description = description;
            o.id = id;
            o.name = name;
            o.namespacedName = namespacedName;
            o.parent = parent;
            o.shortName = shortName;
            o.updateTime = updateTime;
            return o;
        }
    }
}
