// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.storage.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.storage.outputs.GetBucketObjectContentCustomerEncryption;
import com.pulumi.gcp.storage.outputs.GetBucketObjectContentRetention;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBucketObjectContentResult {
    private String bucket;
    private String cacheControl;
    /**
     * @return (Computed) [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object content.
     * 
     */
    private @Nullable String content;
    private String contentDisposition;
    private String contentEncoding;
    private String contentLanguage;
    private String contentType;
    private String crc32c;
    private List<GetBucketObjectContentCustomerEncryption> customerEncryptions;
    private String detectMd5hash;
    private Boolean eventBasedHold;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String kmsKeyName;
    private String md5hash;
    private String mediaLink;
    private Map<String,String> metadata;
    private String name;
    private String outputName;
    private List<GetBucketObjectContentRetention> retentions;
    private String selfLink;
    private String source;
    private String storageClass;
    private Boolean temporaryHold;

    private GetBucketObjectContentResult() {}
    public String bucket() {
        return this.bucket;
    }
    public String cacheControl() {
        return this.cacheControl;
    }
    /**
     * @return (Computed) [Content-Language](https://tools.ietf.org/html/rfc7231#section-3.1.3.2) of the object content.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    public String contentDisposition() {
        return this.contentDisposition;
    }
    public String contentEncoding() {
        return this.contentEncoding;
    }
    public String contentLanguage() {
        return this.contentLanguage;
    }
    public String contentType() {
        return this.contentType;
    }
    public String crc32c() {
        return this.crc32c;
    }
    public List<GetBucketObjectContentCustomerEncryption> customerEncryptions() {
        return this.customerEncryptions;
    }
    public String detectMd5hash() {
        return this.detectMd5hash;
    }
    public Boolean eventBasedHold() {
        return this.eventBasedHold;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String kmsKeyName() {
        return this.kmsKeyName;
    }
    public String md5hash() {
        return this.md5hash;
    }
    public String mediaLink() {
        return this.mediaLink;
    }
    public Map<String,String> metadata() {
        return this.metadata;
    }
    public String name() {
        return this.name;
    }
    public String outputName() {
        return this.outputName;
    }
    public List<GetBucketObjectContentRetention> retentions() {
        return this.retentions;
    }
    public String selfLink() {
        return this.selfLink;
    }
    public String source() {
        return this.source;
    }
    public String storageClass() {
        return this.storageClass;
    }
    public Boolean temporaryHold() {
        return this.temporaryHold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBucketObjectContentResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private String cacheControl;
        private @Nullable String content;
        private String contentDisposition;
        private String contentEncoding;
        private String contentLanguage;
        private String contentType;
        private String crc32c;
        private List<GetBucketObjectContentCustomerEncryption> customerEncryptions;
        private String detectMd5hash;
        private Boolean eventBasedHold;
        private String id;
        private String kmsKeyName;
        private String md5hash;
        private String mediaLink;
        private Map<String,String> metadata;
        private String name;
        private String outputName;
        private List<GetBucketObjectContentRetention> retentions;
        private String selfLink;
        private String source;
        private String storageClass;
        private Boolean temporaryHold;
        public Builder() {}
        public Builder(GetBucketObjectContentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.cacheControl = defaults.cacheControl;
    	      this.content = defaults.content;
    	      this.contentDisposition = defaults.contentDisposition;
    	      this.contentEncoding = defaults.contentEncoding;
    	      this.contentLanguage = defaults.contentLanguage;
    	      this.contentType = defaults.contentType;
    	      this.crc32c = defaults.crc32c;
    	      this.customerEncryptions = defaults.customerEncryptions;
    	      this.detectMd5hash = defaults.detectMd5hash;
    	      this.eventBasedHold = defaults.eventBasedHold;
    	      this.id = defaults.id;
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.md5hash = defaults.md5hash;
    	      this.mediaLink = defaults.mediaLink;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.outputName = defaults.outputName;
    	      this.retentions = defaults.retentions;
    	      this.selfLink = defaults.selfLink;
    	      this.source = defaults.source;
    	      this.storageClass = defaults.storageClass;
    	      this.temporaryHold = defaults.temporaryHold;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = Objects.requireNonNull(cacheControl);
            return this;
        }
        @CustomType.Setter
        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = Objects.requireNonNull(contentDisposition);
            return this;
        }
        @CustomType.Setter
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = Objects.requireNonNull(contentEncoding);
            return this;
        }
        @CustomType.Setter
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = Objects.requireNonNull(contentLanguage);
            return this;
        }
        @CustomType.Setter
        public Builder contentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }
        @CustomType.Setter
        public Builder crc32c(String crc32c) {
            this.crc32c = Objects.requireNonNull(crc32c);
            return this;
        }
        @CustomType.Setter
        public Builder customerEncryptions(List<GetBucketObjectContentCustomerEncryption> customerEncryptions) {
            this.customerEncryptions = Objects.requireNonNull(customerEncryptions);
            return this;
        }
        public Builder customerEncryptions(GetBucketObjectContentCustomerEncryption... customerEncryptions) {
            return customerEncryptions(List.of(customerEncryptions));
        }
        @CustomType.Setter
        public Builder detectMd5hash(String detectMd5hash) {
            this.detectMd5hash = Objects.requireNonNull(detectMd5hash);
            return this;
        }
        @CustomType.Setter
        public Builder eventBasedHold(Boolean eventBasedHold) {
            this.eventBasedHold = Objects.requireNonNull(eventBasedHold);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        @CustomType.Setter
        public Builder md5hash(String md5hash) {
            this.md5hash = Objects.requireNonNull(md5hash);
            return this;
        }
        @CustomType.Setter
        public Builder mediaLink(String mediaLink) {
            this.mediaLink = Objects.requireNonNull(mediaLink);
            return this;
        }
        @CustomType.Setter
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder outputName(String outputName) {
            this.outputName = Objects.requireNonNull(outputName);
            return this;
        }
        @CustomType.Setter
        public Builder retentions(List<GetBucketObjectContentRetention> retentions) {
            this.retentions = Objects.requireNonNull(retentions);
            return this;
        }
        public Builder retentions(GetBucketObjectContentRetention... retentions) {
            return retentions(List.of(retentions));
        }
        @CustomType.Setter
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder storageClass(String storageClass) {
            this.storageClass = Objects.requireNonNull(storageClass);
            return this;
        }
        @CustomType.Setter
        public Builder temporaryHold(Boolean temporaryHold) {
            this.temporaryHold = Objects.requireNonNull(temporaryHold);
            return this;
        }
        public GetBucketObjectContentResult build() {
            final var o = new GetBucketObjectContentResult();
            o.bucket = bucket;
            o.cacheControl = cacheControl;
            o.content = content;
            o.contentDisposition = contentDisposition;
            o.contentEncoding = contentEncoding;
            o.contentLanguage = contentLanguage;
            o.contentType = contentType;
            o.crc32c = crc32c;
            o.customerEncryptions = customerEncryptions;
            o.detectMd5hash = detectMd5hash;
            o.eventBasedHold = eventBasedHold;
            o.id = id;
            o.kmsKeyName = kmsKeyName;
            o.md5hash = md5hash;
            o.mediaLink = mediaLink;
            o.metadata = metadata;
            o.name = name;
            o.outputName = outputName;
            o.retentions = retentions;
            o.selfLink = selfLink;
            o.source = source;
            o.storageClass = storageClass;
            o.temporaryHold = temporaryHold;
            return o;
        }
    }
}
