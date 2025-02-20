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
    'CryptoKeyIAMBindingConditionArgs',
    'CryptoKeyIAMMemberConditionArgs',
    'CryptoKeyVersionAttestationArgs',
    'CryptoKeyVersionAttestationCertChainsArgs',
    'CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs',
    'CryptoKeyVersionTemplateArgs',
    'KeyRingIAMBindingConditionArgs',
    'KeyRingIAMMemberConditionArgs',
    'KeyRingImportJobAttestationArgs',
    'KeyRingImportJobPublicKeyArgs',
]

@pulumi.input_type
class CryptoKeyIAMBindingConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] expression: Textual representation of an expression in Common Expression Language syntax.
        :param pulumi.Input[str] title: A title for the expression, i.e. a short string describing its purpose.
        :param pulumi.Input[str] description: An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
               
               > **Warning:** The provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
               identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
               consider it to be an entirely different resource and will treat it as such.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.

        > **Warning:** The provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
        identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
        consider it to be an entirely different resource and will treat it as such.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class CryptoKeyIAMMemberConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] expression: Textual representation of an expression in Common Expression Language syntax.
        :param pulumi.Input[str] title: A title for the expression, i.e. a short string describing its purpose.
        :param pulumi.Input[str] description: An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
               
               > **Warning:** The provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
               identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
               consider it to be an entirely different resource and will treat it as such.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.

        > **Warning:** The provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
        identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
        consider it to be an entirely different resource and will treat it as such.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class CryptoKeyVersionAttestationArgs:
    def __init__(__self__, *,
                 cert_chains: Optional[pulumi.Input['CryptoKeyVersionAttestationCertChainsArgs']] = None,
                 content: Optional[pulumi.Input[str]] = None,
                 external_protection_level_options: Optional[pulumi.Input['CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs']] = None,
                 format: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input['CryptoKeyVersionAttestationCertChainsArgs'] cert_chains: The certificate chains needed to validate the attestation
               Structure is documented below.
        :param pulumi.Input[str] content: (Output)
               The attestation data provided by the HSM when the key operation was performed.
        :param pulumi.Input['CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs'] external_protection_level_options: ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
               Structure is documented below.
        :param pulumi.Input[str] format: (Output)
               The format of the attestation data.
        """
        if cert_chains is not None:
            pulumi.set(__self__, "cert_chains", cert_chains)
        if content is not None:
            pulumi.set(__self__, "content", content)
        if external_protection_level_options is not None:
            pulumi.set(__self__, "external_protection_level_options", external_protection_level_options)
        if format is not None:
            pulumi.set(__self__, "format", format)

    @property
    @pulumi.getter(name="certChains")
    def cert_chains(self) -> Optional[pulumi.Input['CryptoKeyVersionAttestationCertChainsArgs']]:
        """
        The certificate chains needed to validate the attestation
        Structure is documented below.
        """
        return pulumi.get(self, "cert_chains")

    @cert_chains.setter
    def cert_chains(self, value: Optional[pulumi.Input['CryptoKeyVersionAttestationCertChainsArgs']]):
        pulumi.set(self, "cert_chains", value)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The attestation data provided by the HSM when the key operation was performed.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter(name="externalProtectionLevelOptions")
    def external_protection_level_options(self) -> Optional[pulumi.Input['CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs']]:
        """
        ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
        Structure is documented below.
        """
        return pulumi.get(self, "external_protection_level_options")

    @external_protection_level_options.setter
    def external_protection_level_options(self, value: Optional[pulumi.Input['CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs']]):
        pulumi.set(self, "external_protection_level_options", value)

    @property
    @pulumi.getter
    def format(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The format of the attestation data.
        """
        return pulumi.get(self, "format")

    @format.setter
    def format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "format", value)


@pulumi.input_type
class CryptoKeyVersionAttestationCertChainsArgs:
    def __init__(__self__, *,
                 cavium_certs: Optional[pulumi.Input[str]] = None,
                 google_card_certs: Optional[pulumi.Input[str]] = None,
                 google_partition_certs: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] cavium_certs: Cavium certificate chain corresponding to the attestation.
        :param pulumi.Input[str] google_card_certs: Google card certificate chain corresponding to the attestation.
        :param pulumi.Input[str] google_partition_certs: Google partition certificate chain corresponding to the attestation.
        """
        if cavium_certs is not None:
            pulumi.set(__self__, "cavium_certs", cavium_certs)
        if google_card_certs is not None:
            pulumi.set(__self__, "google_card_certs", google_card_certs)
        if google_partition_certs is not None:
            pulumi.set(__self__, "google_partition_certs", google_partition_certs)

    @property
    @pulumi.getter(name="caviumCerts")
    def cavium_certs(self) -> Optional[pulumi.Input[str]]:
        """
        Cavium certificate chain corresponding to the attestation.
        """
        return pulumi.get(self, "cavium_certs")

    @cavium_certs.setter
    def cavium_certs(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cavium_certs", value)

    @property
    @pulumi.getter(name="googleCardCerts")
    def google_card_certs(self) -> Optional[pulumi.Input[str]]:
        """
        Google card certificate chain corresponding to the attestation.
        """
        return pulumi.get(self, "google_card_certs")

    @google_card_certs.setter
    def google_card_certs(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "google_card_certs", value)

    @property
    @pulumi.getter(name="googlePartitionCerts")
    def google_partition_certs(self) -> Optional[pulumi.Input[str]]:
        """
        Google partition certificate chain corresponding to the attestation.
        """
        return pulumi.get(self, "google_partition_certs")

    @google_partition_certs.setter
    def google_partition_certs(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "google_partition_certs", value)


@pulumi.input_type
class CryptoKeyVersionAttestationExternalProtectionLevelOptionsArgs:
    def __init__(__self__, *,
                 ekm_connection_key_path: Optional[pulumi.Input[str]] = None,
                 external_key_uri: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] ekm_connection_key_path: The path to the external key material on the EKM when using EkmConnection e.g., "v0/my/key". Set this field instead of externalKeyUri when using an EkmConnection.
        :param pulumi.Input[str] external_key_uri: The URI for an external resource that this CryptoKeyVersion represents.
        """
        if ekm_connection_key_path is not None:
            pulumi.set(__self__, "ekm_connection_key_path", ekm_connection_key_path)
        if external_key_uri is not None:
            pulumi.set(__self__, "external_key_uri", external_key_uri)

    @property
    @pulumi.getter(name="ekmConnectionKeyPath")
    def ekm_connection_key_path(self) -> Optional[pulumi.Input[str]]:
        """
        The path to the external key material on the EKM when using EkmConnection e.g., "v0/my/key". Set this field instead of externalKeyUri when using an EkmConnection.
        """
        return pulumi.get(self, "ekm_connection_key_path")

    @ekm_connection_key_path.setter
    def ekm_connection_key_path(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "ekm_connection_key_path", value)

    @property
    @pulumi.getter(name="externalKeyUri")
    def external_key_uri(self) -> Optional[pulumi.Input[str]]:
        """
        The URI for an external resource that this CryptoKeyVersion represents.
        """
        return pulumi.get(self, "external_key_uri")

    @external_key_uri.setter
    def external_key_uri(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "external_key_uri", value)


@pulumi.input_type
class CryptoKeyVersionTemplateArgs:
    def __init__(__self__, *,
                 algorithm: pulumi.Input[str],
                 protection_level: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] algorithm: The algorithm to use when creating a version based on this template.
               See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
        :param pulumi.Input[str] protection_level: The protection level to use when creating a version based on this template. Possible values include "SOFTWARE", "HSM", "EXTERNAL", "EXTERNAL_VPC". Defaults to "SOFTWARE".
        """
        pulumi.set(__self__, "algorithm", algorithm)
        if protection_level is not None:
            pulumi.set(__self__, "protection_level", protection_level)

    @property
    @pulumi.getter
    def algorithm(self) -> pulumi.Input[str]:
        """
        The algorithm to use when creating a version based on this template.
        See the [algorithm reference](https://cloud.google.com/kms/docs/reference/rest/v1/CryptoKeyVersionAlgorithm) for possible inputs.
        """
        return pulumi.get(self, "algorithm")

    @algorithm.setter
    def algorithm(self, value: pulumi.Input[str]):
        pulumi.set(self, "algorithm", value)

    @property
    @pulumi.getter(name="protectionLevel")
    def protection_level(self) -> Optional[pulumi.Input[str]]:
        """
        The protection level to use when creating a version based on this template. Possible values include "SOFTWARE", "HSM", "EXTERNAL", "EXTERNAL_VPC". Defaults to "SOFTWARE".
        """
        return pulumi.get(self, "protection_level")

    @protection_level.setter
    def protection_level(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "protection_level", value)


@pulumi.input_type
class KeyRingIAMBindingConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] expression: Textual representation of an expression in Common Expression Language syntax.
        :param pulumi.Input[str] title: A title for the expression, i.e. a short string describing its purpose.
        :param pulumi.Input[str] description: An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
               
               > **Warning:** The provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
               identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
               consider it to be an entirely different resource and will treat it as such.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.

        > **Warning:** The provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
        identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
        consider it to be an entirely different resource and will treat it as such.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class KeyRingIAMMemberConditionArgs:
    def __init__(__self__, *,
                 expression: pulumi.Input[str],
                 title: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] expression: Textual representation of an expression in Common Expression Language syntax.
        :param pulumi.Input[str] title: A title for the expression, i.e. a short string describing its purpose.
        :param pulumi.Input[str] description: An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.
               
               > **Warning:** The provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
               identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
               consider it to be an entirely different resource and will treat it as such.
        """
        pulumi.set(__self__, "expression", expression)
        pulumi.set(__self__, "title", title)
        if description is not None:
            pulumi.set(__self__, "description", description)

    @property
    @pulumi.getter
    def expression(self) -> pulumi.Input[str]:
        """
        Textual representation of an expression in Common Expression Language syntax.
        """
        return pulumi.get(self, "expression")

    @expression.setter
    def expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "expression", value)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        A title for the expression, i.e. a short string describing its purpose.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        An optional description of the expression. This is a longer text which describes the expression, e.g. when hovered over it in a UI.

        > **Warning:** The provider considers the `role` and condition contents (`title`+`description`+`expression`) as the
        identifier for the binding. This means that if any part of the condition is changed out-of-band, the provider will
        consider it to be an entirely different resource and will treat it as such.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class KeyRingImportJobAttestationArgs:
    def __init__(__self__, *,
                 content: Optional[pulumi.Input[str]] = None,
                 format: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] content: (Output)
               The attestation data provided by the HSM when the key operation was performed.
               A base64-encoded string.
        :param pulumi.Input[str] format: (Output)
               The format of the attestation data.
        """
        if content is not None:
            pulumi.set(__self__, "content", content)
        if format is not None:
            pulumi.set(__self__, "format", format)

    @property
    @pulumi.getter
    def content(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The attestation data provided by the HSM when the key operation was performed.
        A base64-encoded string.
        """
        return pulumi.get(self, "content")

    @content.setter
    def content(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "content", value)

    @property
    @pulumi.getter
    def format(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The format of the attestation data.
        """
        return pulumi.get(self, "format")

    @format.setter
    def format(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "format", value)


@pulumi.input_type
class KeyRingImportJobPublicKeyArgs:
    def __init__(__self__, *,
                 pem: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[str] pem: (Output)
               The public key, encoded in PEM format. For more information, see the RFC 7468 sections
               for General Considerations and Textual Encoding of Subject Public Key Info.
        """
        if pem is not None:
            pulumi.set(__self__, "pem", pem)

    @property
    @pulumi.getter
    def pem(self) -> Optional[pulumi.Input[str]]:
        """
        (Output)
        The public key, encoded in PEM format. For more information, see the RFC 7468 sections
        for General Considerations and Textual Encoding of Subject Public Key Info.
        """
        return pulumi.get(self, "pem")

    @pem.setter
    def pem(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pem", value)


