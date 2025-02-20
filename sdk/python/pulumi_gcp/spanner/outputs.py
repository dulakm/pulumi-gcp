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
    'DatabaseEncryptionConfig',
    'DatabaseIAMBindingCondition',
    'DatabaseIAMMemberCondition',
    'InstanceAutoscalingConfig',
    'InstanceAutoscalingConfigAutoscalingLimits',
    'InstanceAutoscalingConfigAutoscalingTargets',
    'InstanceIAMBindingCondition',
    'InstanceIAMMemberCondition',
    'GetInstanceAutoscalingConfigResult',
    'GetInstanceAutoscalingConfigAutoscalingLimitResult',
    'GetInstanceAutoscalingConfigAutoscalingTargetResult',
]

@pulumi.output_type
class DatabaseEncryptionConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "kmsKeyName":
            suggest = "kms_key_name"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in DatabaseEncryptionConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        DatabaseEncryptionConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        DatabaseEncryptionConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 kms_key_name: str):
        """
        :param str kms_key_name: Fully qualified name of the KMS key to use to encrypt this database. This key must exist
               in the same location as the Spanner Database.
        """
        pulumi.set(__self__, "kms_key_name", kms_key_name)

    @property
    @pulumi.getter(name="kmsKeyName")
    def kms_key_name(self) -> str:
        """
        Fully qualified name of the KMS key to use to encrypt this database. This key must exist
        in the same location as the Spanner Database.
        """
        return pulumi.get(self, "kms_key_name")


@pulumi.output_type
class DatabaseIAMBindingCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 title: str,
                 description: Optional[str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> str:
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class DatabaseIAMMemberCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 title: str,
                 description: Optional[str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> str:
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class InstanceAutoscalingConfig(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "autoscalingLimits":
            suggest = "autoscaling_limits"
        elif key == "autoscalingTargets":
            suggest = "autoscaling_targets"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in InstanceAutoscalingConfig. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        InstanceAutoscalingConfig.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        InstanceAutoscalingConfig.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 autoscaling_limits: Optional['outputs.InstanceAutoscalingConfigAutoscalingLimits'] = None,
                 autoscaling_targets: Optional['outputs.InstanceAutoscalingConfigAutoscalingTargets'] = None):
        """
        :param 'InstanceAutoscalingConfigAutoscalingLimitsArgs' autoscaling_limits: Defines scale in controls to reduce the risk of response latency
               and outages due to abrupt scale-in events
               Structure is documented below.
        :param 'InstanceAutoscalingConfigAutoscalingTargetsArgs' autoscaling_targets: Defines scale in controls to reduce the risk of response latency
               and outages due to abrupt scale-in events
               Structure is documented below.
        """
        if autoscaling_limits is not None:
            pulumi.set(__self__, "autoscaling_limits", autoscaling_limits)
        if autoscaling_targets is not None:
            pulumi.set(__self__, "autoscaling_targets", autoscaling_targets)

    @property
    @pulumi.getter(name="autoscalingLimits")
    def autoscaling_limits(self) -> Optional['outputs.InstanceAutoscalingConfigAutoscalingLimits']:
        """
        Defines scale in controls to reduce the risk of response latency
        and outages due to abrupt scale-in events
        Structure is documented below.
        """
        return pulumi.get(self, "autoscaling_limits")

    @property
    @pulumi.getter(name="autoscalingTargets")
    def autoscaling_targets(self) -> Optional['outputs.InstanceAutoscalingConfigAutoscalingTargets']:
        """
        Defines scale in controls to reduce the risk of response latency
        and outages due to abrupt scale-in events
        Structure is documented below.
        """
        return pulumi.get(self, "autoscaling_targets")


@pulumi.output_type
class InstanceAutoscalingConfigAutoscalingLimits(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "maxProcessingUnits":
            suggest = "max_processing_units"
        elif key == "minProcessingUnits":
            suggest = "min_processing_units"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in InstanceAutoscalingConfigAutoscalingLimits. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        InstanceAutoscalingConfigAutoscalingLimits.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        InstanceAutoscalingConfigAutoscalingLimits.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 max_processing_units: Optional[int] = None,
                 min_processing_units: Optional[int] = None):
        """
        :param int max_processing_units: Specifies maximum number of processing units allocated to the instance.
               If set, this number should be multiples of 1000 and be greater than or equal to
               min_processing_units.
        :param int min_processing_units: Specifies minimum number of processing units allocated to the instance.
               If set, this number should be multiples of 1000.
        """
        if max_processing_units is not None:
            pulumi.set(__self__, "max_processing_units", max_processing_units)
        if min_processing_units is not None:
            pulumi.set(__self__, "min_processing_units", min_processing_units)

    @property
    @pulumi.getter(name="maxProcessingUnits")
    def max_processing_units(self) -> Optional[int]:
        """
        Specifies maximum number of processing units allocated to the instance.
        If set, this number should be multiples of 1000 and be greater than or equal to
        min_processing_units.
        """
        return pulumi.get(self, "max_processing_units")

    @property
    @pulumi.getter(name="minProcessingUnits")
    def min_processing_units(self) -> Optional[int]:
        """
        Specifies minimum number of processing units allocated to the instance.
        If set, this number should be multiples of 1000.
        """
        return pulumi.get(self, "min_processing_units")


@pulumi.output_type
class InstanceAutoscalingConfigAutoscalingTargets(dict):
    @staticmethod
    def __key_warning(key: str):
        suggest = None
        if key == "highPriorityCpuUtilizationPercent":
            suggest = "high_priority_cpu_utilization_percent"
        elif key == "storageUtilizationPercent":
            suggest = "storage_utilization_percent"

        if suggest:
            pulumi.log.warn(f"Key '{key}' not found in InstanceAutoscalingConfigAutoscalingTargets. Access the value via the '{suggest}' property getter instead.")

    def __getitem__(self, key: str) -> Any:
        InstanceAutoscalingConfigAutoscalingTargets.__key_warning(key)
        return super().__getitem__(key)

    def get(self, key: str, default = None) -> Any:
        InstanceAutoscalingConfigAutoscalingTargets.__key_warning(key)
        return super().get(key, default)

    def __init__(__self__, *,
                 high_priority_cpu_utilization_percent: Optional[int] = None,
                 storage_utilization_percent: Optional[int] = None):
        """
        :param int high_priority_cpu_utilization_percent: Specifies the target high priority cpu utilization percentage that the autoscaler
               should be trying to achieve for the instance.
               This number is on a scale from 0 (no utilization) to 100 (full utilization)..
        :param int storage_utilization_percent: Specifies the target storage utilization percentage that the autoscaler
               should be trying to achieve for the instance.
               This number is on a scale from 0 (no utilization) to 100 (full utilization).
        """
        if high_priority_cpu_utilization_percent is not None:
            pulumi.set(__self__, "high_priority_cpu_utilization_percent", high_priority_cpu_utilization_percent)
        if storage_utilization_percent is not None:
            pulumi.set(__self__, "storage_utilization_percent", storage_utilization_percent)

    @property
    @pulumi.getter(name="highPriorityCpuUtilizationPercent")
    def high_priority_cpu_utilization_percent(self) -> Optional[int]:
        """
        Specifies the target high priority cpu utilization percentage that the autoscaler
        should be trying to achieve for the instance.
        This number is on a scale from 0 (no utilization) to 100 (full utilization)..
        """
        return pulumi.get(self, "high_priority_cpu_utilization_percent")

    @property
    @pulumi.getter(name="storageUtilizationPercent")
    def storage_utilization_percent(self) -> Optional[int]:
        """
        Specifies the target storage utilization percentage that the autoscaler
        should be trying to achieve for the instance.
        This number is on a scale from 0 (no utilization) to 100 (full utilization).
        """
        return pulumi.get(self, "storage_utilization_percent")


@pulumi.output_type
class InstanceIAMBindingCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 title: str,
                 description: Optional[str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> str:
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class InstanceIAMMemberCondition(dict):
    def __init__(__self__, *,
                 expression: str,
                 title: str,
                 description: Optional[str] = None):
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> str:
        return pulumi.get(self, "expression")

    @property
    @pulumi.getter
    def title(self) -> str:
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def description(self) -> Optional[str]:
        return pulumi.get(self, "description")


@pulumi.output_type
class GetInstanceAutoscalingConfigResult(dict):
    def __init__(__self__, *,
                 autoscaling_limits: Sequence['outputs.GetInstanceAutoscalingConfigAutoscalingLimitResult'],
                 autoscaling_targets: Sequence['outputs.GetInstanceAutoscalingConfigAutoscalingTargetResult']):
        pulumi.set(__self__, "autoscaling_limits", autoscaling_limits)
        pulumi.set(__self__, "autoscaling_targets", autoscaling_targets)

    @property
    @pulumi.getter(name="autoscalingLimits")
    def autoscaling_limits(self) -> Sequence['outputs.GetInstanceAutoscalingConfigAutoscalingLimitResult']:
        return pulumi.get(self, "autoscaling_limits")

    @property
    @pulumi.getter(name="autoscalingTargets")
    def autoscaling_targets(self) -> Sequence['outputs.GetInstanceAutoscalingConfigAutoscalingTargetResult']:
        return pulumi.get(self, "autoscaling_targets")


@pulumi.output_type
class GetInstanceAutoscalingConfigAutoscalingLimitResult(dict):
    def __init__(__self__, *,
                 max_processing_units: int,
                 min_processing_units: int):
        pulumi.set(__self__, "max_processing_units", max_processing_units)
        pulumi.set(__self__, "min_processing_units", min_processing_units)

    @property
    @pulumi.getter(name="maxProcessingUnits")
    def max_processing_units(self) -> int:
        return pulumi.get(self, "max_processing_units")

    @property
    @pulumi.getter(name="minProcessingUnits")
    def min_processing_units(self) -> int:
        return pulumi.get(self, "min_processing_units")


@pulumi.output_type
class GetInstanceAutoscalingConfigAutoscalingTargetResult(dict):
    def __init__(__self__, *,
                 high_priority_cpu_utilization_percent: int,
                 storage_utilization_percent: int):
        pulumi.set(__self__, "high_priority_cpu_utilization_percent", high_priority_cpu_utilization_percent)
        pulumi.set(__self__, "storage_utilization_percent", storage_utilization_percent)

    @property
    @pulumi.getter(name="highPriorityCpuUtilizationPercent")
    def high_priority_cpu_utilization_percent(self) -> int:
        return pulumi.get(self, "high_priority_cpu_utilization_percent")

    @property
    @pulumi.getter(name="storageUtilizationPercent")
    def storage_utilization_percent(self) -> int:
        return pulumi.get(self, "storage_utilization_percent")


