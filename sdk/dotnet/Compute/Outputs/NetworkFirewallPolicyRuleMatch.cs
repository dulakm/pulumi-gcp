// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Gcp.Compute.Outputs
{

    [OutputType]
    public sealed class NetworkFirewallPolicyRuleMatch
    {
        /// <summary>
        /// Address groups which should be matched against the traffic destination. Maximum number of destination address groups is 10. Destination address groups is only supported in Egress rules.
        /// </summary>
        public readonly ImmutableArray<string> DestAddressGroups;
        /// <summary>
        /// Domain names that will be used to match against the resolved domain name of destination of traffic. Can only be specified if DIRECTION is egress.
        /// </summary>
        public readonly ImmutableArray<string> DestFqdns;
        /// <summary>
        /// CIDR IP address range. Maximum number of destination CIDR IP ranges allowed is 5000.
        /// </summary>
        public readonly ImmutableArray<string> DestIpRanges;
        /// <summary>
        /// The Unicode country codes whose IP addresses will be used to match against the source of traffic. Can only be specified if DIRECTION is egress.
        /// </summary>
        public readonly ImmutableArray<string> DestRegionCodes;
        /// <summary>
        /// Name of the Google Cloud Threat Intelligence list.
        /// </summary>
        public readonly ImmutableArray<string> DestThreatIntelligences;
        /// <summary>
        /// Pairs of IP protocols and ports that the rule should match.
        /// </summary>
        public readonly ImmutableArray<Outputs.NetworkFirewallPolicyRuleMatchLayer4Config> Layer4Configs;
        /// <summary>
        /// Address groups which should be matched against the traffic source. Maximum number of source address groups is 10. Source address groups is only supported in Ingress rules.
        /// </summary>
        public readonly ImmutableArray<string> SrcAddressGroups;
        /// <summary>
        /// Domain names that will be used to match against the resolved domain name of source of traffic. Can only be specified if DIRECTION is ingress.
        /// </summary>
        public readonly ImmutableArray<string> SrcFqdns;
        /// <summary>
        /// CIDR IP address range. Maximum number of source CIDR IP ranges allowed is 5000.
        /// </summary>
        public readonly ImmutableArray<string> SrcIpRanges;
        /// <summary>
        /// The Unicode country codes whose IP addresses will be used to match against the source of traffic. Can only be specified if DIRECTION is ingress.
        /// </summary>
        public readonly ImmutableArray<string> SrcRegionCodes;
        /// <summary>
        /// List of secure tag values, which should be matched at the source of the traffic. For INGRESS rule, if all the &lt;code&gt;srcSecureTag&lt;/code&gt; are INEFFECTIVE, and there is no &lt;code&gt;srcIpRange&lt;/code&gt;, this rule will be ignored. Maximum number of source tag values allowed is 256.
        /// </summary>
        public readonly ImmutableArray<Outputs.NetworkFirewallPolicyRuleMatchSrcSecureTag> SrcSecureTags;
        /// <summary>
        /// Name of the Google Cloud Threat Intelligence list.
        /// 
        /// The `layer4_configs` block supports:
        /// </summary>
        public readonly ImmutableArray<string> SrcThreatIntelligences;

        [OutputConstructor]
        private NetworkFirewallPolicyRuleMatch(
            ImmutableArray<string> destAddressGroups,

            ImmutableArray<string> destFqdns,

            ImmutableArray<string> destIpRanges,

            ImmutableArray<string> destRegionCodes,

            ImmutableArray<string> destThreatIntelligences,

            ImmutableArray<Outputs.NetworkFirewallPolicyRuleMatchLayer4Config> layer4Configs,

            ImmutableArray<string> srcAddressGroups,

            ImmutableArray<string> srcFqdns,

            ImmutableArray<string> srcIpRanges,

            ImmutableArray<string> srcRegionCodes,

            ImmutableArray<Outputs.NetworkFirewallPolicyRuleMatchSrcSecureTag> srcSecureTags,

            ImmutableArray<string> srcThreatIntelligences)
        {
            DestAddressGroups = destAddressGroups;
            DestFqdns = destFqdns;
            DestIpRanges = destIpRanges;
            DestRegionCodes = destRegionCodes;
            DestThreatIntelligences = destThreatIntelligences;
            Layer4Configs = layer4Configs;
            SrcAddressGroups = srcAddressGroups;
            SrcFqdns = srcFqdns;
            SrcIpRanges = srcIpRanges;
            SrcRegionCodes = srcRegionCodes;
            SrcSecureTags = srcSecureTags;
            SrcThreatIntelligences = srcThreatIntelligences;
        }
    }
}
