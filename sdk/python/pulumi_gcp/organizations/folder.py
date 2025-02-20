# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['FolderArgs', 'Folder']

@pulumi.input_type
class FolderArgs:
    def __init__(__self__, *,
                 display_name: pulumi.Input[str],
                 parent: pulumi.Input[str]):
        """
        The set of arguments for constructing a Folder resource.
        :param pulumi.Input[str] display_name: The folder’s display name.
               A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
        :param pulumi.Input[str] parent: The resource name of the parent Folder or Organization.
               Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
        """
        pulumi.set(__self__, "display_name", display_name)
        pulumi.set(__self__, "parent", parent)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Input[str]:
        """
        The folder’s display name.
        A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter
    def parent(self) -> pulumi.Input[str]:
        """
        The resource name of the parent Folder or Organization.
        Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: pulumi.Input[str]):
        pulumi.set(self, "parent", value)


@pulumi.input_type
class _FolderState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 folder_id: Optional[pulumi.Input[str]] = None,
                 lifecycle_state: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Folder resources.
        :param pulumi.Input[str] create_time: Timestamp when the Folder was created. Assigned by the server.
               A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[str] display_name: The folder’s display name.
               A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
        :param pulumi.Input[str] folder_id: The folder id from the name "folders/{folder_id}"
        :param pulumi.Input[str] lifecycle_state: The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
        :param pulumi.Input[str] name: The resource name of the Folder. Its format is folders/{folder_id}.
        :param pulumi.Input[str] parent: The resource name of the parent Folder or Organization.
               Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
        """
        if create_time is not None:
            pulumi.set(__self__, "create_time", create_time)
        if display_name is not None:
            pulumi.set(__self__, "display_name", display_name)
        if folder_id is not None:
            pulumi.set(__self__, "folder_id", folder_id)
        if lifecycle_state is not None:
            pulumi.set(__self__, "lifecycle_state", lifecycle_state)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if parent is not None:
            pulumi.set(__self__, "parent", parent)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        Timestamp when the Folder was created. Assigned by the server.
        A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> Optional[pulumi.Input[str]]:
        """
        The folder’s display name.
        A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
        """
        return pulumi.get(self, "display_name")

    @display_name.setter
    def display_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "display_name", value)

    @property
    @pulumi.getter(name="folderId")
    def folder_id(self) -> Optional[pulumi.Input[str]]:
        """
        The folder id from the name "folders/{folder_id}"
        """
        return pulumi.get(self, "folder_id")

    @folder_id.setter
    def folder_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "folder_id", value)

    @property
    @pulumi.getter(name="lifecycleState")
    def lifecycle_state(self) -> Optional[pulumi.Input[str]]:
        """
        The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
        """
        return pulumi.get(self, "lifecycle_state")

    @lifecycle_state.setter
    def lifecycle_state(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lifecycle_state", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The resource name of the Folder. Its format is folders/{folder_id}.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def parent(self) -> Optional[pulumi.Input[str]]:
        """
        The resource name of the parent Folder or Organization.
        Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
        """
        return pulumi.get(self, "parent")

    @parent.setter
    def parent(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "parent", value)


class Folder(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Allows management of a Google Cloud Platform folder. For more information see
        [the official documentation](https://cloud.google.com/resource-manager/docs/creating-managing-folders)
        and
        [API](https://cloud.google.com/resource-manager/reference/rest/v2/folders).

        A folder can contain projects, other folders, or a combination of both. You can use folders to group projects under an organization in a hierarchy. For example, your organization might contain multiple departments, each with its own set of Cloud Platform resources. Folders allows you to group these resources on a per-department basis. Folders are used to group resources that share common IAM policies.

        Folders created live inside an Organization. See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.

        The service account used to run the provider when creating a `organizations.Folder`
        resource must have `roles/resourcemanager.folderCreator`. See the
        [Access Control for Folders Using IAM](https://cloud.google.com/resource-manager/docs/access-control-folders)
        doc for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gcp as gcp

        # Top-level folder under an organization.
        department1 = gcp.organizations.Folder("department1",
            display_name="Department 1",
            parent="organizations/1234567")
        # Folder nested under another folder.
        team_abc = gcp.organizations.Folder("team-abc",
            display_name="Team ABC",
            parent=department1.name)
        ```

        ## Import

        Folders can be imported using the folder's id, e.g. * `folders/{{folder_id}}` * `{{folder_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Folders using one of the formats above. For exampletf import {

         id = "folders/{{folder_id}}"

         to = google_folder.default }

        ```sh
         $ pulumi import gcp:organizations/folder:Folder When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Folders can be imported using one of the formats above. For example
        ```

        ```sh
         $ pulumi import gcp:organizations/folder:Folder default {{folder_id}}
        ```

        ```sh
         $ pulumi import gcp:organizations/folder:Folder default folders/{{folder_id}}
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] display_name: The folder’s display name.
               A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
        :param pulumi.Input[str] parent: The resource name of the parent Folder or Organization.
               Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FolderArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Allows management of a Google Cloud Platform folder. For more information see
        [the official documentation](https://cloud.google.com/resource-manager/docs/creating-managing-folders)
        and
        [API](https://cloud.google.com/resource-manager/reference/rest/v2/folders).

        A folder can contain projects, other folders, or a combination of both. You can use folders to group projects under an organization in a hierarchy. For example, your organization might contain multiple departments, each with its own set of Cloud Platform resources. Folders allows you to group these resources on a per-department basis. Folders are used to group resources that share common IAM policies.

        Folders created live inside an Organization. See the [Organization documentation](https://cloud.google.com/resource-manager/docs/quickstarts) for more details.

        The service account used to run the provider when creating a `organizations.Folder`
        resource must have `roles/resourcemanager.folderCreator`. See the
        [Access Control for Folders Using IAM](https://cloud.google.com/resource-manager/docs/access-control-folders)
        doc for more information.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_gcp as gcp

        # Top-level folder under an organization.
        department1 = gcp.organizations.Folder("department1",
            display_name="Department 1",
            parent="organizations/1234567")
        # Folder nested under another folder.
        team_abc = gcp.organizations.Folder("team-abc",
            display_name="Team ABC",
            parent=department1.name)
        ```

        ## Import

        Folders can be imported using the folder's id, e.g. * `folders/{{folder_id}}` * `{{folder_id}}` In Terraform v1.5.0 and later, use an [`import` block](https://developer.hashicorp.com/terraform/language/import) to import Folders using one of the formats above. For exampletf import {

         id = "folders/{{folder_id}}"

         to = google_folder.default }

        ```sh
         $ pulumi import gcp:organizations/folder:Folder When using the [`terraform import` command](https://developer.hashicorp.com/terraform/cli/commands/import), Folders can be imported using one of the formats above. For example
        ```

        ```sh
         $ pulumi import gcp:organizations/folder:Folder default {{folder_id}}
        ```

        ```sh
         $ pulumi import gcp:organizations/folder:Folder default folders/{{folder_id}}
        ```

        :param str resource_name: The name of the resource.
        :param FolderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FolderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 display_name: Optional[pulumi.Input[str]] = None,
                 parent: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FolderArgs.__new__(FolderArgs)

            if display_name is None and not opts.urn:
                raise TypeError("Missing required property 'display_name'")
            __props__.__dict__["display_name"] = display_name
            if parent is None and not opts.urn:
                raise TypeError("Missing required property 'parent'")
            __props__.__dict__["parent"] = parent
            __props__.__dict__["create_time"] = None
            __props__.__dict__["folder_id"] = None
            __props__.__dict__["lifecycle_state"] = None
            __props__.__dict__["name"] = None
        super(Folder, __self__).__init__(
            'gcp:organizations/folder:Folder',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            display_name: Optional[pulumi.Input[str]] = None,
            folder_id: Optional[pulumi.Input[str]] = None,
            lifecycle_state: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            parent: Optional[pulumi.Input[str]] = None) -> 'Folder':
        """
        Get an existing Folder resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: Timestamp when the Folder was created. Assigned by the server.
               A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        :param pulumi.Input[str] display_name: The folder’s display name.
               A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
        :param pulumi.Input[str] folder_id: The folder id from the name "folders/{folder_id}"
        :param pulumi.Input[str] lifecycle_state: The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
        :param pulumi.Input[str] name: The resource name of the Folder. Its format is folders/{folder_id}.
        :param pulumi.Input[str] parent: The resource name of the parent Folder or Organization.
               Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FolderState.__new__(_FolderState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["display_name"] = display_name
        __props__.__dict__["folder_id"] = folder_id
        __props__.__dict__["lifecycle_state"] = lifecycle_state
        __props__.__dict__["name"] = name
        __props__.__dict__["parent"] = parent
        return Folder(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        Timestamp when the Folder was created. Assigned by the server.
        A timestamp in RFC3339 UTC "Zulu" format, accurate to nanoseconds. Example: "2014-10-02T15:01:23.045123456Z".
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter(name="displayName")
    def display_name(self) -> pulumi.Output[str]:
        """
        The folder’s display name.
        A folder’s display name must be unique amongst its siblings, e.g. no two folders with the same parent can share the same display name. The display name must start and end with a letter or digit, may contain letters, digits, spaces, hyphens and underscores and can be no longer than 30 characters.
        """
        return pulumi.get(self, "display_name")

    @property
    @pulumi.getter(name="folderId")
    def folder_id(self) -> pulumi.Output[str]:
        """
        The folder id from the name "folders/{folder_id}"
        """
        return pulumi.get(self, "folder_id")

    @property
    @pulumi.getter(name="lifecycleState")
    def lifecycle_state(self) -> pulumi.Output[str]:
        """
        The lifecycle state of the folder such as `ACTIVE` or `DELETE_REQUESTED`.
        """
        return pulumi.get(self, "lifecycle_state")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The resource name of the Folder. Its format is folders/{folder_id}.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def parent(self) -> pulumi.Output[str]:
        """
        The resource name of the parent Folder or Organization.
        Must be of the form `folders/{folder_id}` or `organizations/{org_id}`.
        """
        return pulumi.get(self, "parent")

