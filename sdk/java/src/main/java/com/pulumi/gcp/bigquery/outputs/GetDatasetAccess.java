// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.bigquery.outputs.GetDatasetAccessDataset;
import com.pulumi.gcp.bigquery.outputs.GetDatasetAccessRoutine;
import com.pulumi.gcp.bigquery.outputs.GetDatasetAccessView;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatasetAccess {
    private List<GetDatasetAccessDataset> datasets;
    private String domain;
    private String groupByEmail;
    private String iamMember;
    private String role;
    private List<GetDatasetAccessRoutine> routines;
    private String specialGroup;
    private String userByEmail;
    private List<GetDatasetAccessView> views;

    private GetDatasetAccess() {}
    public List<GetDatasetAccessDataset> datasets() {
        return this.datasets;
    }
    public String domain() {
        return this.domain;
    }
    public String groupByEmail() {
        return this.groupByEmail;
    }
    public String iamMember() {
        return this.iamMember;
    }
    public String role() {
        return this.role;
    }
    public List<GetDatasetAccessRoutine> routines() {
        return this.routines;
    }
    public String specialGroup() {
        return this.specialGroup;
    }
    public String userByEmail() {
        return this.userByEmail;
    }
    public List<GetDatasetAccessView> views() {
        return this.views;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatasetAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetDatasetAccessDataset> datasets;
        private String domain;
        private String groupByEmail;
        private String iamMember;
        private String role;
        private List<GetDatasetAccessRoutine> routines;
        private String specialGroup;
        private String userByEmail;
        private List<GetDatasetAccessView> views;
        public Builder() {}
        public Builder(GetDatasetAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasets = defaults.datasets;
    	      this.domain = defaults.domain;
    	      this.groupByEmail = defaults.groupByEmail;
    	      this.iamMember = defaults.iamMember;
    	      this.role = defaults.role;
    	      this.routines = defaults.routines;
    	      this.specialGroup = defaults.specialGroup;
    	      this.userByEmail = defaults.userByEmail;
    	      this.views = defaults.views;
        }

        @CustomType.Setter
        public Builder datasets(List<GetDatasetAccessDataset> datasets) {
            this.datasets = Objects.requireNonNull(datasets);
            return this;
        }
        public Builder datasets(GetDatasetAccessDataset... datasets) {
            return datasets(List.of(datasets));
        }
        @CustomType.Setter
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        @CustomType.Setter
        public Builder groupByEmail(String groupByEmail) {
            this.groupByEmail = Objects.requireNonNull(groupByEmail);
            return this;
        }
        @CustomType.Setter
        public Builder iamMember(String iamMember) {
            this.iamMember = Objects.requireNonNull(iamMember);
            return this;
        }
        @CustomType.Setter
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        @CustomType.Setter
        public Builder routines(List<GetDatasetAccessRoutine> routines) {
            this.routines = Objects.requireNonNull(routines);
            return this;
        }
        public Builder routines(GetDatasetAccessRoutine... routines) {
            return routines(List.of(routines));
        }
        @CustomType.Setter
        public Builder specialGroup(String specialGroup) {
            this.specialGroup = Objects.requireNonNull(specialGroup);
            return this;
        }
        @CustomType.Setter
        public Builder userByEmail(String userByEmail) {
            this.userByEmail = Objects.requireNonNull(userByEmail);
            return this;
        }
        @CustomType.Setter
        public Builder views(List<GetDatasetAccessView> views) {
            this.views = Objects.requireNonNull(views);
            return this;
        }
        public Builder views(GetDatasetAccessView... views) {
            return views(List.of(views));
        }
        public GetDatasetAccess build() {
            final var o = new GetDatasetAccess();
            o.datasets = datasets;
            o.domain = domain;
            o.groupByEmail = groupByEmail;
            o.iamMember = iamMember;
            o.role = role;
            o.routines = routines;
            o.specialGroup = specialGroup;
            o.userByEmail = userByEmail;
            o.views = views;
            return o;
        }
    }
}
