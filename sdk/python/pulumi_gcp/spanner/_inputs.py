# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'DatabaseEncryptionConfigArgs',
    'DatabaseIAMBindingConditionArgs',
    'DatabaseIAMMemberConditionArgs',
    'InstanceAutoscalingConfigArgs',
    'InstanceAutoscalingConfigAutoscalingLimitsArgs',
    'InstanceAutoscalingConfigAutoscalingTargetsArgs',
    'InstanceIAMBindingConditionArgs',
    'InstanceIAMMemberConditionArgs',
]

@pulumi.input_type
class DatabaseEncryptionConfigArgs:
    def __init__(__self__, *,
                 kms_key_name: pulumi.Input[str]):
        """
        :param pulumi.Input[str] kms_key_name: Fully qualified name of the KMS key to use to encrypt this database. This key must exist
               in the same location as the Spanner Database.
        """
        pulumi.set(__self__, "kms_key_name", kms_key_name)

    @property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> pulumi.Input[str]:
        """
        Fully qualified name of the KMS key to use to encrypt this database. This key must exist
        in the same location as the Spanner Database.
        """
        return pulumi.get(self, "kms_key_name")

    @kms_key_name.setter
    def kms_key_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "kms_key_name", value)


@pulumi.input_type
class DatabaseIAMBindingConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class DatabaseIAMMemberConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class InstanceAutoscalingConfigArgs:
    def __init__(__self__, *,
                 autoscaling_limits: Optional[pulumi.Input['InstanceAutoscalingConfigAutoscalingLimitsArgs']] = None,
                 autoscaling_targets: Optional[pulumi.Input['InstanceAutoscalingConfigAutoscalingTargetsArgs']] = None):
        """
        :param pulumi.Input['InstanceAutoscalingConfigAutoscalingLimitsArgs'] autoscaling_limits: Defines scale in controls to reduce the risk of response latency
               and outages due to abrupt scale-in events
               Structure is documented below.
        :param pulumi.Input['InstanceAutoscalingConfigAutoscalingTargetsArgs'] autoscaling_targets: Defines scale in controls to reduce the risk of response latency
               and outages due to abrupt scale-in events
               Structure is documented below.
        """
        if autoscaling_limits is not None:
            pulumi.set(__self__, "autoscaling_limits", autoscaling_limits)
        if autoscaling_targets is not None:
            pulumi.set(__self__, "autoscaling_targets", autoscaling_targets)

    @property
    @pulumi.getter(name="autoscalingLimits")
    def autoscaling_limits(self) -> Optional[pulumi.Input['InstanceAutoscalingConfigAutoscalingLimitsArgs']]:
        """
        Defines scale in controls to reduce the risk of response latency
        and outages due to abrupt scale-in events
        Structure is documented below.
        """
        return pulumi.get(self, "autoscaling_limits")

    @autoscaling_limits.setter
    def autoscaling_limits(self, value: Optional[pulumi.Input['InstanceAutoscalingConfigAutoscalingLimitsArgs']]):
        pulumi.set(self, "autoscaling_limits", value)

    @property
    @pulumi.getter(name="autoscalingTargets")
    def autoscaling_targets(self) -> Optional[pulumi.Input['InstanceAutoscalingConfigAutoscalingTargetsArgs']]:
        """
        Defines scale in controls to reduce the risk of response latency
        and outages due to abrupt scale-in events
        Structure is documented below.
        """
        return pulumi.get(self, "autoscaling_targets")

    @autoscaling_targets.setter
    def autoscaling_targets(self, value: Optional[pulumi.Input['InstanceAutoscalingConfigAutoscalingTargetsArgs']]):
        pulumi.set(self, "autoscaling_targets", value)


@pulumi.input_type
class InstanceAutoscalingConfigAutoscalingLimitsArgs:
    def __init__(__self__, *,
                 max_processing_units: Optional[pulumi.Input[int]] = None,
                 min_processing_units: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] max_processing_units: Specifies maximum number of processing units allocated to the instance.
               If set, this number should be multiples of 1000 and be greater than or equal to
               min_processing_units.
        :param pulumi.Input[int] min_processing_units: Specifies minimum number of processing units allocated to the instance.
               If set, this number should be multiples of 1000.
        """
        if max_processing_units is not None:
            pulumi.set(__self__, "max_processing_units", max_processing_units)
        if min_processing_units is not None:
            pulumi.set(__self__, "min_processing_units", min_processing_units)

    @property
    @pulumi.getter(name="maxProcessingUnits")
    def max_processing_units(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies maximum number of processing units allocated to the instance.
        If set, this number should be multiples of 1000 and be greater than or equal to
        min_processing_units.
        """
        return pulumi.get(self, "max_processing_units")

    @max_processing_units.setter
    def max_processing_units(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "max_processing_units", value)

    @property
    @pulumi.getter(name="minProcessingUnits")
    def min_processing_units(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies minimum number of processing units allocated to the instance.
        If set, this number should be multiples of 1000.
        """
        return pulumi.get(self, "min_processing_units")

    @min_processing_units.setter
    def min_processing_units(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "min_processing_units", value)


@pulumi.input_type
class InstanceAutoscalingConfigAutoscalingTargetsArgs:
    def __init__(__self__, *,
                 high_priority_cpu_utilization_percent: Optional[pulumi.Input[int]] = None,
                 storage_utilization_percent: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[int] high_priority_cpu_utilization_percent: Specifies the target high priority cpu utilization percentage that the autoscaler
               should be trying to achieve for the instance.
               This number is on a scale from 0 (no utilization) to 100 (full utilization)..
        :param pulumi.Input[int] storage_utilization_percent: Specifies the target storage utilization percentage that the autoscaler
               should be trying to achieve for the instance.
               This number is on a scale from 0 (no utilization) to 100 (full utilization).
        """
        if high_priority_cpu_utilization_percent is not None:
            pulumi.set(__self__, "high_priority_cpu_utilization_percent", high_priority_cpu_utilization_percent)
        if storage_utilization_percent is not None:
            pulumi.set(__self__, "storage_utilization_percent", storage_utilization_percent)

    @property
    @pulumi.getter(name="highPriorityCpuUtilizationPercent")
    def high_priority_cpu_utilization_percent(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the target high priority cpu utilization percentage that the autoscaler
        should be trying to achieve for the instance.
        This number is on a scale from 0 (no utilization) to 100 (full utilization)..
        """
        return pulumi.get(self, "high_priority_cpu_utilization_percent")

    @high_priority_cpu_utilization_percent.setter
    def high_priority_cpu_utilization_percent(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "high_priority_cpu_utilization_percent", value)

    @property
    @pulumi.getter(name="storageUtilizationPercent")
    def storage_utilization_percent(self) -> Optional[pulumi.Input[int]]:
        """
        Specifies the target storage utilization percentage that the autoscaler
        should be trying to achieve for the instance.
        This number is on a scale from 0 (no utilization) to 100 (full utilization).
        """
        return pulumi.get(self, "storage_utilization_percent")

    @storage_utilization_percent.setter
    def storage_utilization_percent(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "storage_utilization_percent", value)


@pulumi.input_type
class InstanceIAMBindingConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class InstanceIAMMemberConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


