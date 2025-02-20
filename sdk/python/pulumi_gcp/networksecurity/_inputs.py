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
    'AuthorizationPolicyRuleArgs',
    'AuthorizationPolicyRuleDestinationArgs',
    'AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs',
    'AuthorizationPolicyRuleSourceArgs',
    'ClientTlsPolicyClientCertificateArgs',
    'ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs',
    'ClientTlsPolicyClientCertificateGrpcEndpointArgs',
    'ClientTlsPolicyServerValidationCaArgs',
    'ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs',
    'ClientTlsPolicyServerValidationCaGrpcEndpointArgs',
    'ServerTlsPolicyMtlsPolicyArgs',
    'ServerTlsPolicyMtlsPolicyClientValidationCaArgs',
    'ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs',
    'ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs',
    'ServerTlsPolicyServerCertificateArgs',
    'ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs',
    'ServerTlsPolicyServerCertificateGrpcEndpointArgs',
]

@pulumi.input_type
class AuthorizationPolicyRuleArgs:
    def __init__(__self__, *,
                 destinations: Optional[pulumi.Input[Sequence[pulumi.Input['AuthorizationPolicyRuleDestinationArgs']]]] = None,
                 sources: Optional[pulumi.Input[Sequence[pulumi.Input['AuthorizationPolicyRuleSourceArgs']]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['AuthorizationPolicyRuleDestinationArgs']]] destinations: List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers.
               If not set, the action specified in the 'action' field will be applied without any rule checks for the destination.
               Structure is documented below.
        :param pulumi.Input[Sequence[pulumi.Input['AuthorizationPolicyRuleSourceArgs']]] sources: List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ipBlocks match.
               If not set, the action specified in the 'action' field will be applied without any rule checks for the source.
               Structure is documented below.
        """
        if destinations is not None:
            pulumi.set(__self__, "destinations", destinations)
        if sources is not None:
            pulumi.set(__self__, "sources", sources)

    @property
    @pulumi.getter
    def destinations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AuthorizationPolicyRuleDestinationArgs']]]]:
        """
        List of attributes for the traffic destination. All of the destinations must match. A destination is a match if a request matches all the specified hosts, ports, methods and headers.
        If not set, the action specified in the 'action' field will be applied without any rule checks for the destination.
        Structure is documented below.
        """
        return pulumi.get(self, "destinations")

    @destinations.setter
    def destinations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AuthorizationPolicyRuleDestinationArgs']]]]):
        pulumi.set(self, "destinations", value)

    @property
    @pulumi.getter
    def sources(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['AuthorizationPolicyRuleSourceArgs']]]]:
        """
        List of attributes for the traffic source. All of the sources must match. A source is a match if both principals and ipBlocks match.
        If not set, the action specified in the 'action' field will be applied without any rule checks for the source.
        Structure is documented below.
        """
        return pulumi.get(self, "sources")

    @sources.setter
    def sources(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['AuthorizationPolicyRuleSourceArgs']]]]):
        pulumi.set(self, "sources", value)


@pulumi.input_type
class AuthorizationPolicyRuleDestinationArgs:
    def __init__(__self__, *,
                 hosts: pulumi.Input[Sequence[pulumi.Input[str]]],
                 methods: pulumi.Input[Sequence[pulumi.Input[str]]],
                 ports: pulumi.Input[Sequence[pulumi.Input[int]]],
                 http_header_match: Optional[pulumi.Input['AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs']] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] hosts: List of host names to match. Matched against the ":authority" header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example "mydomain.*") or a suffix match (example "*.myorg.com") or a presence (any) match "*".
        :param pulumi.Input[Sequence[pulumi.Input[str]]] methods: A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
        :param pulumi.Input[Sequence[pulumi.Input[int]]] ports: List of destination ports to match. At least one port should match.
        :param pulumi.Input['AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs'] http_header_match: Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match.
               Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
               Structure is documented below.
        """
        pulumi.set(__self__, "hosts", hosts)
        pulumi.set(__self__, "methods", methods)
        pulumi.set(__self__, "ports", ports)
        if http_header_match is not None:
            pulumi.set(__self__, "http_header_match", http_header_match)

    @property
    @pulumi.getter
    def hosts(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        List of host names to match. Matched against the ":authority" header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example "mydomain.*") or a suffix match (example "*.myorg.com") or a presence (any) match "*".
        """
        return pulumi.get(self, "hosts")

    @hosts.setter
    def hosts(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "hosts", value)

    @property
    @pulumi.getter
    def methods(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
        """
        return pulumi.get(self, "methods")

    @methods.setter
    def methods(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "methods", value)

    @property
    @pulumi.getter
    def ports(self) -> pulumi.Input[Sequence[pulumi.Input[int]]]:
        """
        List of destination ports to match. At least one port should match.
        """
        return pulumi.get(self, "ports")

    @ports.setter
    def ports(self, value: pulumi.Input[Sequence[pulumi.Input[int]]]):
        pulumi.set(self, "ports", value)

    @property
    @pulumi.getter(name="httpHeaderMatch")
    def http_header_match(self) -> Optional[pulumi.Input['AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs']]:
        """
        Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match.
        Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
        Structure is documented below.
        """
        return pulumi.get(self, "http_header_match")

    @http_header_match.setter
    def http_header_match(self, value: Optional[pulumi.Input['AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs']]):
        pulumi.set(self, "http_header_match", value)


@pulumi.input_type
class AuthorizationPolicyRuleDestinationHttpHeaderMatchArgs:
    def __init__(__self__, *,
                 header_name: pulumi.Input[str],
                 regex_match: pulumi.Input[str]):
        """
        :param pulumi.Input[str] header_name: The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method".
        :param pulumi.Input[str] regex_match: The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
        """
        pulumi.set(__self__, "header_name", header_name)
        pulumi.set(__self__, "regex_match", regex_match)

    @property
    @pulumi.getter(name="headerName")
    def header_name(self) -> pulumi.Input[str]:
        """
        The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method".
        """
        return pulumi.get(self, "header_name")

    @header_name.setter
    def header_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "header_name", value)

    @property
    @pulumi.getter(name="regexMatch")
    def regex_match(self) -> pulumi.Input[str]:
        """
        The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
        """
        return pulumi.get(self, "regex_match")

    @regex_match.setter
    def regex_match(self, value: pulumi.Input[str]):
        pulumi.set(self, "regex_match", value)


@pulumi.input_type
class AuthorizationPolicyRuleSourceArgs:
    def __init__(__self__, *,
                 ip_blocks: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 principals: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input[str]]] ip_blocks: List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., "1.2.3.4") and CIDR (e.g., "1.2.3.0/24") are supported. Authorization based on source IP alone should be avoided.
               The IP addresses of any load balancers or proxies should be considered untrusted.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] principals: List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, "namespace/*") or a suffix match (example, "*/service-account") or a presence match "*".
               Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
        """
        if ip_blocks is not None:
            pulumi.set(__self__, "ip_blocks", ip_blocks)
        if principals is not None:
            pulumi.set(__self__, "principals", principals)

    @property
    @pulumi.getter(name="ipBlocks")
    def ip_blocks(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of CIDR ranges to match based on source IP address. At least one IP block should match. Single IP (e.g., "1.2.3.4") and CIDR (e.g., "1.2.3.0/24") are supported. Authorization based on source IP alone should be avoided.
        The IP addresses of any load balancers or proxies should be considered untrusted.
        """
        return pulumi.get(self, "ip_blocks")

    @ip_blocks.setter
    def ip_blocks(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "ip_blocks", value)

    @property
    @pulumi.getter
    def principals(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        List of peer identities to match for authorization. At least one principal should match. Each peer can be an exact match, or a prefix match (example, "namespace/*") or a suffix match (example, "*/service-account") or a presence match "*".
        Authorization based on the principal name without certificate validation (configured by ServerTlsPolicy resource) is considered insecure.
        """
        return pulumi.get(self, "principals")

    @principals.setter
    def principals(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "principals", value)


@pulumi.input_type
class ClientTlsPolicyClientCertificateArgs:
    def __init__(__self__, *,
                 certificate_provider_instance: Optional[pulumi.Input['ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs']] = None,
                 grpc_endpoint: Optional[pulumi.Input['ClientTlsPolicyClientCertificateGrpcEndpointArgs']] = None):
        """
        :param pulumi.Input['ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs'] certificate_provider_instance: The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
               Structure is documented below.
        :param pulumi.Input['ClientTlsPolicyClientCertificateGrpcEndpointArgs'] grpc_endpoint: gRPC specific configuration to access the gRPC server to obtain the cert and private key.
               Structure is documented below.
        """
        if certificate_provider_instance is not None:
            pulumi.set(__self__, "certificate_provider_instance", certificate_provider_instance)
        if grpc_endpoint is not None:
            pulumi.set(__self__, "grpc_endpoint", grpc_endpoint)

    @property
    @pulumi.getter(name="certificateProviderInstance")
    def certificate_provider_instance(self) -> Optional[pulumi.Input['ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs']]:
        """
        The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
        Structure is documented below.
        """
        return pulumi.get(self, "certificate_provider_instance")

    @certificate_provider_instance.setter
    def certificate_provider_instance(self, value: Optional[pulumi.Input['ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs']]):
        pulumi.set(self, "certificate_provider_instance", value)

    @property
    @pulumi.getter(name="grpcEndpoint")
    def grpc_endpoint(self) -> Optional[pulumi.Input['ClientTlsPolicyClientCertificateGrpcEndpointArgs']]:
        """
        gRPC specific configuration to access the gRPC server to obtain the cert and private key.
        Structure is documented below.
        """
        return pulumi.get(self, "grpc_endpoint")

    @grpc_endpoint.setter
    def grpc_endpoint(self, value: Optional[pulumi.Input['ClientTlsPolicyClientCertificateGrpcEndpointArgs']]):
        pulumi.set(self, "grpc_endpoint", value)


@pulumi.input_type
class ClientTlsPolicyClientCertificateCertificateProviderInstanceArgs:
    def __init__(__self__, *,
                 plugin_instance: pulumi.Input[str]):
        """
        :param pulumi.Input[str] plugin_instance: Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
        """
        pulumi.set(__self__, "plugin_instance", plugin_instance)

    @property
    @pulumi.getter(name="pluginInstance")
    def plugin_instance(self) -> pulumi.Input[str]:
        """
        Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
        """
        return pulumi.get(self, "plugin_instance")

    @plugin_instance.setter
    def plugin_instance(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_instance", value)


@pulumi.input_type
class ClientTlsPolicyClientCertificateGrpcEndpointArgs:
    def __init__(__self__, *,
                 target_uri: pulumi.Input[str]):
        """
        :param pulumi.Input[str] target_uri: The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        """
        pulumi.set(__self__, "target_uri", target_uri)

    @property
    @pulumi.getter(name="targetUri")
    def target_uri(self) -> pulumi.Input[str]:
        """
        The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        """
        return pulumi.get(self, "target_uri")

    @target_uri.setter
    def target_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_uri", value)


@pulumi.input_type
class ClientTlsPolicyServerValidationCaArgs:
    def __init__(__self__, *,
                 certificate_provider_instance: Optional[pulumi.Input['ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs']] = None,
                 grpc_endpoint: Optional[pulumi.Input['ClientTlsPolicyServerValidationCaGrpcEndpointArgs']] = None):
        """
        :param pulumi.Input['ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs'] certificate_provider_instance: The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
               Structure is documented below.
        :param pulumi.Input['ClientTlsPolicyServerValidationCaGrpcEndpointArgs'] grpc_endpoint: gRPC specific configuration to access the gRPC server to obtain the cert and private key.
               Structure is documented below.
        """
        if certificate_provider_instance is not None:
            pulumi.set(__self__, "certificate_provider_instance", certificate_provider_instance)
        if grpc_endpoint is not None:
            pulumi.set(__self__, "grpc_endpoint", grpc_endpoint)

    @property
    @pulumi.getter(name="certificateProviderInstance")
    def certificate_provider_instance(self) -> Optional[pulumi.Input['ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs']]:
        """
        The certificate provider instance specification that will be passed to the data plane, which will be used to load necessary credential information.
        Structure is documented below.
        """
        return pulumi.get(self, "certificate_provider_instance")

    @certificate_provider_instance.setter
    def certificate_provider_instance(self, value: Optional[pulumi.Input['ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs']]):
        pulumi.set(self, "certificate_provider_instance", value)

    @property
    @pulumi.getter(name="grpcEndpoint")
    def grpc_endpoint(self) -> Optional[pulumi.Input['ClientTlsPolicyServerValidationCaGrpcEndpointArgs']]:
        """
        gRPC specific configuration to access the gRPC server to obtain the cert and private key.
        Structure is documented below.
        """
        return pulumi.get(self, "grpc_endpoint")

    @grpc_endpoint.setter
    def grpc_endpoint(self, value: Optional[pulumi.Input['ClientTlsPolicyServerValidationCaGrpcEndpointArgs']]):
        pulumi.set(self, "grpc_endpoint", value)


@pulumi.input_type
class ClientTlsPolicyServerValidationCaCertificateProviderInstanceArgs:
    def __init__(__self__, *,
                 plugin_instance: pulumi.Input[str]):
        """
        :param pulumi.Input[str] plugin_instance: Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
        """
        pulumi.set(__self__, "plugin_instance", plugin_instance)

    @property
    @pulumi.getter(name="pluginInstance")
    def plugin_instance(self) -> pulumi.Input[str]:
        """
        Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
        """
        return pulumi.get(self, "plugin_instance")

    @plugin_instance.setter
    def plugin_instance(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_instance", value)


@pulumi.input_type
class ClientTlsPolicyServerValidationCaGrpcEndpointArgs:
    def __init__(__self__, *,
                 target_uri: pulumi.Input[str]):
        """
        :param pulumi.Input[str] target_uri: The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        """
        pulumi.set(__self__, "target_uri", target_uri)

    @property
    @pulumi.getter(name="targetUri")
    def target_uri(self) -> pulumi.Input[str]:
        """
        The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        """
        return pulumi.get(self, "target_uri")

    @target_uri.setter
    def target_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_uri", value)


@pulumi.input_type
class ServerTlsPolicyMtlsPolicyArgs:
    def __init__(__self__, *,
                 client_validation_cas: Optional[pulumi.Input[Sequence[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaArgs']]]] = None,
                 client_validation_mode: Optional[pulumi.Input[str]] = None,
                 client_validation_trust_config: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[Sequence[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaArgs']]] client_validation_cas: Required if the policy is to be used with Traffic Director. For external HTTPS load balancers it must be empty.
               Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
               Structure is documented below.
        :param pulumi.Input[str] client_validation_mode: When the client presents an invalid certificate or no certificate to the load balancer, the clientValidationMode specifies how the client connection is handled.
               Required if the policy is to be used with the external HTTPS load balancing. For Traffic Director it must be empty.
               Possible values are: `CLIENT_VALIDATION_MODE_UNSPECIFIED`, `ALLOW_INVALID_OR_MISSING_CLIENT_CERT`, `REJECT_INVALID`.
        :param pulumi.Input[str] client_validation_trust_config: Reference to the TrustConfig from certificatemanager.googleapis.com namespace.
               If specified, the chain validation will be performed against certificates configured in the given TrustConfig.
               Allowed only if the policy is to be used with external HTTPS load balancers.
        """
        if client_validation_cas is not None:
            pulumi.set(__self__, "client_validation_cas", client_validation_cas)
        if client_validation_mode is not None:
            pulumi.set(__self__, "client_validation_mode", client_validation_mode)
        if client_validation_trust_config is not None:
            pulumi.set(__self__, "client_validation_trust_config", client_validation_trust_config)

    @property
    @pulumi.getter(name="clientValidationCas")
    def client_validation_cas(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaArgs']]]]:
        """
        Required if the policy is to be used with Traffic Director. For external HTTPS load balancers it must be empty.
        Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
        Structure is documented below.
        """
        return pulumi.get(self, "client_validation_cas")

    @client_validation_cas.setter
    def client_validation_cas(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaArgs']]]]):
        pulumi.set(self, "client_validation_cas", value)

    @property
    @pulumi.getter(name="clientValidationMode")
    def client_validation_mode(self) -> Optional[pulumi.Input[str]]:
        """
        When the client presents an invalid certificate or no certificate to the load balancer, the clientValidationMode specifies how the client connection is handled.
        Required if the policy is to be used with the external HTTPS load balancing. For Traffic Director it must be empty.
        Possible values are: `CLIENT_VALIDATION_MODE_UNSPECIFIED`, `ALLOW_INVALID_OR_MISSING_CLIENT_CERT`, `REJECT_INVALID`.
        """
        return pulumi.get(self, "client_validation_mode")

    @client_validation_mode.setter
    def client_validation_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_validation_mode", value)

    @property
    @pulumi.getter(name="clientValidationTrustConfig")
    def client_validation_trust_config(self) -> Optional[pulumi.Input[str]]:
        """
        Reference to the TrustConfig from certificatemanager.googleapis.com namespace.
        If specified, the chain validation will be performed against certificates configured in the given TrustConfig.
        Allowed only if the policy is to be used with external HTTPS load balancers.
        """
        return pulumi.get(self, "client_validation_trust_config")

    @client_validation_trust_config.setter
    def client_validation_trust_config(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_validation_trust_config", value)


@pulumi.input_type
class ServerTlsPolicyMtlsPolicyClientValidationCaArgs:
    def __init__(__self__, *,
                 certificate_provider_instance: Optional[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs']] = None,
                 grpc_endpoint: Optional[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs']] = None):
        """
        :param pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs'] certificate_provider_instance: Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
               Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
               Structure is documented below.
        :param pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs'] grpc_endpoint: gRPC specific configuration to access the gRPC server to obtain the cert and private key.
               Structure is documented below.
        """
        if certificate_provider_instance is not None:
            pulumi.set(__self__, "certificate_provider_instance", certificate_provider_instance)
        if grpc_endpoint is not None:
            pulumi.set(__self__, "grpc_endpoint", grpc_endpoint)

    @property
    @pulumi.getter(name="certificateProviderInstance")
    def certificate_provider_instance(self) -> Optional[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs']]:
        """
        Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
        Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
        Structure is documented below.
        """
        return pulumi.get(self, "certificate_provider_instance")

    @certificate_provider_instance.setter
    def certificate_provider_instance(self, value: Optional[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs']]):
        pulumi.set(self, "certificate_provider_instance", value)

    @property
    @pulumi.getter(name="grpcEndpoint")
    def grpc_endpoint(self) -> Optional[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs']]:
        """
        gRPC specific configuration to access the gRPC server to obtain the cert and private key.
        Structure is documented below.
        """
        return pulumi.get(self, "grpc_endpoint")

    @grpc_endpoint.setter
    def grpc_endpoint(self, value: Optional[pulumi.Input['ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs']]):
        pulumi.set(self, "grpc_endpoint", value)


@pulumi.input_type
class ServerTlsPolicyMtlsPolicyClientValidationCaCertificateProviderInstanceArgs:
    def __init__(__self__, *,
                 plugin_instance: pulumi.Input[str]):
        """
        :param pulumi.Input[str] plugin_instance: Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
        """
        pulumi.set(__self__, "plugin_instance", plugin_instance)

    @property
    @pulumi.getter(name="pluginInstance")
    def plugin_instance(self) -> pulumi.Input[str]:
        """
        Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
        """
        return pulumi.get(self, "plugin_instance")

    @plugin_instance.setter
    def plugin_instance(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_instance", value)


@pulumi.input_type
class ServerTlsPolicyMtlsPolicyClientValidationCaGrpcEndpointArgs:
    def __init__(__self__, *,
                 target_uri: pulumi.Input[str]):
        """
        :param pulumi.Input[str] target_uri: The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        """
        pulumi.set(__self__, "target_uri", target_uri)

    @property
    @pulumi.getter(name="targetUri")
    def target_uri(self) -> pulumi.Input[str]:
        """
        The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        """
        return pulumi.get(self, "target_uri")

    @target_uri.setter
    def target_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_uri", value)


@pulumi.input_type
class ServerTlsPolicyServerCertificateArgs:
    def __init__(__self__, *,
                 certificate_provider_instance: Optional[pulumi.Input['ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs']] = None,
                 grpc_endpoint: Optional[pulumi.Input['ServerTlsPolicyServerCertificateGrpcEndpointArgs']] = None):
        """
        :param pulumi.Input['ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs'] certificate_provider_instance: Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
               Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
               Structure is documented below.
        :param pulumi.Input['ServerTlsPolicyServerCertificateGrpcEndpointArgs'] grpc_endpoint: gRPC specific configuration to access the gRPC server to obtain the cert and private key.
               Structure is documented below.
        """
        if certificate_provider_instance is not None:
            pulumi.set(__self__, "certificate_provider_instance", certificate_provider_instance)
        if grpc_endpoint is not None:
            pulumi.set(__self__, "grpc_endpoint", grpc_endpoint)

    @property
    @pulumi.getter(name="certificateProviderInstance")
    def certificate_provider_instance(self) -> Optional[pulumi.Input['ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs']]:
        """
        Optional if policy is to be used with Traffic Director. For external HTTPS load balancer must be empty.
        Defines a mechanism to provision server identity (public and private keys). Cannot be combined with allowOpen as a permissive mode that allows both plain text and TLS is not supported.
        Structure is documented below.
        """
        return pulumi.get(self, "certificate_provider_instance")

    @certificate_provider_instance.setter
    def certificate_provider_instance(self, value: Optional[pulumi.Input['ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs']]):
        pulumi.set(self, "certificate_provider_instance", value)

    @property
    @pulumi.getter(name="grpcEndpoint")
    def grpc_endpoint(self) -> Optional[pulumi.Input['ServerTlsPolicyServerCertificateGrpcEndpointArgs']]:
        """
        gRPC specific configuration to access the gRPC server to obtain the cert and private key.
        Structure is documented below.
        """
        return pulumi.get(self, "grpc_endpoint")

    @grpc_endpoint.setter
    def grpc_endpoint(self, value: Optional[pulumi.Input['ServerTlsPolicyServerCertificateGrpcEndpointArgs']]):
        pulumi.set(self, "grpc_endpoint", value)


@pulumi.input_type
class ServerTlsPolicyServerCertificateCertificateProviderInstanceArgs:
    def __init__(__self__, *,
                 plugin_instance: pulumi.Input[str]):
        """
        :param pulumi.Input[str] plugin_instance: Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
        """
        pulumi.set(__self__, "plugin_instance", plugin_instance)

    @property
    @pulumi.getter(name="pluginInstance")
    def plugin_instance(self) -> pulumi.Input[str]:
        """
        Plugin instance name, used to locate and load CertificateProvider instance configuration. Set to "google_cloud_private_spiffe" to use Certificate Authority Service certificate provider instance.
        """
        return pulumi.get(self, "plugin_instance")

    @plugin_instance.setter
    def plugin_instance(self, value: pulumi.Input[str]):
        pulumi.set(self, "plugin_instance", value)


@pulumi.input_type
class ServerTlsPolicyServerCertificateGrpcEndpointArgs:
    def __init__(__self__, *,
                 target_uri: pulumi.Input[str]):
        """
        :param pulumi.Input[str] target_uri: The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        """
        pulumi.set(__self__, "target_uri", target_uri)

    @property
    @pulumi.getter(name="targetUri")
    def target_uri(self) -> pulumi.Input[str]:
        """
        The target URI of the gRPC endpoint. Only UDS path is supported, and should start with "unix:".
        """
        return pulumi.get(self, "target_uri")

    @target_uri.setter
    def target_uri(self, value: pulumi.Input[str]):
        pulumi.set(self, "target_uri", value)


