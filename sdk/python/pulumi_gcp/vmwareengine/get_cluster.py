# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs

__all__ = [
    'GetClusterResult',
    'AwaitableGetClusterResult',
    'get_cluster',
    'get_cluster_output',
]

@pulumi.output_type
class GetClusterResult:
    """
    A collection of values returned by getCluster.
    """
    def __init__(__self__, id=None, management=None, name=None, node_type_configs=None, parent=None, state=None, uid=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if management and not isinstance(management, bool):
            raise TypeError("Expected argument 'management' to be a bool")
        pulumi.set(__self__, "management", management)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if node_type_configs and not isinstance(node_type_configs, list):
            raise TypeError("Expected argument 'node_type_configs' to be a list")
        pulumi.set(__self__, "node_type_configs", node_type_configs)
        if parent and not isinstance(parent, str):
            raise TypeError("Expected argument 'parent' to be a str")
        pulumi.set(__self__, "parent", parent)
        if state and not isinstance(state, str):
            raise TypeError("Expected argument 'state' to be a str")
        pulumi.set(__self__, "state", state)
        if uid and not isinstance(uid, str):
            raise TypeError("Expected argument 'uid' to be a str")
        pulumi.set(__self__, "uid", uid)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def management(self) -> bool:
        return pulumi.get(self, "management")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="nodeTypeConfigs")
    def node_type_configs(self) -> Sequence['outputs.GetClusterNodeTypeConfigResult']:
        return pulumi.get(self, "node_type_configs")

    @property
    @pulumi.getter
    def parent(self) -> str:
        return pulumi.get(self, "parent")

    @property
    @pulumi.getter
    def state(self) -> str:
        return pulumi.get(self, "state")

    @property
    @pulumi.getter
    def uid(self) -> str:
        return pulumi.get(self, "uid")


class AwaitableGetClusterResult(GetClusterResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterResult(
            id=self.id,
            management=self.management,
            name=self.name,
            node_type_configs=self.node_type_configs,
            parent=self.parent,
            state=self.state,
            uid=self.uid)


def get_cluster(name: Optional[str] = None,
                parent: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_cluster = gcp.vmwareengine.get_cluster(name="my-cluster",
        parent="project/locations/us-west1-a/privateClouds/my-cloud")
    ```


    :param str name: Name of the resource.
    :param str parent: The resource name of the private cloud that this cluster belongs.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['parent'] = parent
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('gcp:vmwareengine/getCluster:getCluster', __args__, opts=opts, typ=GetClusterResult).value

    return AwaitableGetClusterResult(
        id=pulumi.get(__ret__, 'id'),
        management=pulumi.get(__ret__, 'management'),
        name=pulumi.get(__ret__, 'name'),
        node_type_configs=pulumi.get(__ret__, 'node_type_configs'),
        parent=pulumi.get(__ret__, 'parent'),
        state=pulumi.get(__ret__, 'state'),
        uid=pulumi.get(__ret__, 'uid'))


@_utilities.lift_output_func(get_cluster)
def get_cluster_output(name: Optional[pulumi.Input[str]] = None,
                       parent: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_gcp as gcp

    my_cluster = gcp.vmwareengine.get_cluster(name="my-cluster",
        parent="project/locations/us-west1-a/privateClouds/my-cloud")
    ```


    :param str name: Name of the resource.
    :param str parent: The resource name of the private cloud that this cluster belongs.
    """
    ...
