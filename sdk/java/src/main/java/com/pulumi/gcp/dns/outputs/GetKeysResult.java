// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dns.outputs.GetKeysKeySigningKey;
import com.pulumi.gcp.dns.outputs.GetKeysZoneSigningKey;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetKeysResult {
    /**
     * @return Unique identifier for the resource; defined by the server.
     * 
     */
    private String id;
    /**
     * @return A list of Key-signing key (KSK) records. Structure is documented below. Additionally, the DS record is provided:
     * 
     */
    private List<GetKeysKeySigningKey> keySigningKeys;
    private String managedZone;
    private String project;
    /**
     * @return A list of Zone-signing key (ZSK) records. Structure is documented below.
     * 
     */
    private List<GetKeysZoneSigningKey> zoneSigningKeys;

    private GetKeysResult() {}
    /**
     * @return Unique identifier for the resource; defined by the server.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A list of Key-signing key (KSK) records. Structure is documented below. Additionally, the DS record is provided:
     * 
     */
    public List<GetKeysKeySigningKey> keySigningKeys() {
        return this.keySigningKeys;
    }
    public String managedZone() {
        return this.managedZone;
    }
    public String project() {
        return this.project;
    }
    /**
     * @return A list of Zone-signing key (ZSK) records. Structure is documented below.
     * 
     */
    public List<GetKeysZoneSigningKey> zoneSigningKeys() {
        return this.zoneSigningKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeysResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetKeysKeySigningKey> keySigningKeys;
        private String managedZone;
        private String project;
        private List<GetKeysZoneSigningKey> zoneSigningKeys;
        public Builder() {}
        public Builder(GetKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.keySigningKeys = defaults.keySigningKeys;
    	      this.managedZone = defaults.managedZone;
    	      this.project = defaults.project;
    	      this.zoneSigningKeys = defaults.zoneSigningKeys;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder keySigningKeys(List<GetKeysKeySigningKey> keySigningKeys) {
            this.keySigningKeys = Objects.requireNonNull(keySigningKeys);
            return this;
        }
        public Builder keySigningKeys(GetKeysKeySigningKey... keySigningKeys) {
            return keySigningKeys(List.of(keySigningKeys));
        }
        @CustomType.Setter
        public Builder managedZone(String managedZone) {
            this.managedZone = Objects.requireNonNull(managedZone);
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder zoneSigningKeys(List<GetKeysZoneSigningKey> zoneSigningKeys) {
            this.zoneSigningKeys = Objects.requireNonNull(zoneSigningKeys);
            return this;
        }
        public Builder zoneSigningKeys(GetKeysZoneSigningKey... zoneSigningKeys) {
            return zoneSigningKeys(List.of(zoneSigningKeys));
        }
        public GetKeysResult build() {
            final var o = new GetKeysResult();
            o.id = id;
            o.keySigningKeys = keySigningKeys;
            o.managedZone = managedZone;
            o.project = project;
            o.zoneSigningKeys = zoneSigningKeys;
            return o;
        }
    }
}
