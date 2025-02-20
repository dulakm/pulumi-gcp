// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.kms;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.kms.SecretCiphertextArgs;
import com.pulumi.gcp.kms.inputs.SecretCiphertextState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Encrypts secret data with Google Cloud KMS and provides access to the ciphertext.
 * 
 * &gt; **NOTE:** Using this resource will allow you to conceal secret data within your
 * resource definitions, but it does not take care of protecting that data in the
 * logging output, plan output, or state output.  Please take care to secure your secret
 * data outside of resource definitions.
 * 
 * To get more information about SecretCiphertext, see:
 * 
 * * [API documentation](https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys/encrypt)
 * * How-to Guides
 *     * [Encrypting and decrypting data with a symmetric key](https://cloud.google.com/kms/docs/encrypt-decrypt)
 * 
 * &gt; **Warning:** All arguments including `plaintext` and `additional_authenticated_data` will be stored in the raw state as plain-text.
 * 
 * ## Example Usage
 * ### Kms Secret Ciphertext Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.gcp.kms.KeyRing;
 * import com.pulumi.gcp.kms.KeyRingArgs;
 * import com.pulumi.gcp.kms.CryptoKey;
 * import com.pulumi.gcp.kms.CryptoKeyArgs;
 * import com.pulumi.gcp.kms.SecretCiphertext;
 * import com.pulumi.gcp.kms.SecretCiphertextArgs;
 * import com.pulumi.gcp.compute.Instance;
 * import com.pulumi.gcp.compute.InstanceArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceBootDiskInitializeParamsArgs;
 * import com.pulumi.gcp.compute.inputs.InstanceNetworkInterfaceArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var keyring = new KeyRing(&#34;keyring&#34;, KeyRingArgs.builder()        
 *             .location(&#34;global&#34;)
 *             .build());
 * 
 *         var cryptokey = new CryptoKey(&#34;cryptokey&#34;, CryptoKeyArgs.builder()        
 *             .keyRing(keyring.id())
 *             .rotationPeriod(&#34;100000s&#34;)
 *             .build());
 * 
 *         var myPassword = new SecretCiphertext(&#34;myPassword&#34;, SecretCiphertextArgs.builder()        
 *             .cryptoKey(cryptokey.id())
 *             .plaintext(&#34;my-secret-password&#34;)
 *             .build());
 * 
 *         var instance = new Instance(&#34;instance&#34;, InstanceArgs.builder()        
 *             .machineType(&#34;e2-medium&#34;)
 *             .zone(&#34;us-central1-a&#34;)
 *             .bootDisk(InstanceBootDiskArgs.builder()
 *                 .initializeParams(InstanceBootDiskInitializeParamsArgs.builder()
 *                     .image(&#34;debian-cloud/debian-11&#34;)
 *                     .build())
 *                 .build())
 *             .networkInterfaces(InstanceNetworkInterfaceArgs.builder()
 *                 .network(&#34;default&#34;)
 *                 .accessConfigs()
 *                 .build())
 *             .metadata(Map.of(&#34;password&#34;, myPassword.ciphertext()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * This resource does not support import.
 * 
 */
@ResourceType(type="gcp:kms/secretCiphertext:SecretCiphertext")
public class SecretCiphertext extends com.pulumi.resources.CustomResource {
    /**
     * The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="additionalAuthenticatedData", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> additionalAuthenticatedData;

    /**
     * @return The additional authenticated data used for integrity checks during encryption and decryption.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<Optional<String>> additionalAuthenticatedData() {
        return Codegen.optional(this.additionalAuthenticatedData);
    }
    /**
     * Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    @Export(name="ciphertext", refs={String.class}, tree="[0]")
    private Output<String> ciphertext;

    /**
     * @return Contains the result of encrypting the provided plaintext, encoded in base64.
     * 
     */
    public Output<String> ciphertext() {
        return this.ciphertext;
    }
    /**
     * The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `&#39;projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}&#39;`
     * 
     * ***
     * 
     */
    @Export(name="cryptoKey", refs={String.class}, tree="[0]")
    private Output<String> cryptoKey;

    /**
     * @return The full name of the CryptoKey that will be used to encrypt the provided plaintext.
     * Format: `&#39;projects/{{project}}/locations/{{location}}/keyRings/{{keyRing}}/cryptoKeys/{{cryptoKey}}&#39;`
     * 
     * ***
     * 
     */
    public Output<String> cryptoKey() {
        return this.cryptoKey;
    }
    /**
     * The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    @Export(name="plaintext", refs={String.class}, tree="[0]")
    private Output<String> plaintext;

    /**
     * @return The plaintext to be encrypted.
     * **Note**: This property is sensitive and will not be displayed in the plan.
     * 
     */
    public Output<String> plaintext() {
        return this.plaintext;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecretCiphertext(String name) {
        this(name, SecretCiphertextArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecretCiphertext(String name, SecretCiphertextArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecretCiphertext(String name, SecretCiphertextArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/secretCiphertext:SecretCiphertext", name, args == null ? SecretCiphertextArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecretCiphertext(String name, Output<String> id, @Nullable SecretCiphertextState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:kms/secretCiphertext:SecretCiphertext", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "additionalAuthenticatedData",
                "plaintext"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SecretCiphertext get(String name, Output<String> id, @Nullable SecretCiphertextState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecretCiphertext(name, id, state, options);
    }
}
