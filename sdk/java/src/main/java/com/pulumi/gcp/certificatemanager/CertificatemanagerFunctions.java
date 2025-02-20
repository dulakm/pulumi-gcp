// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificatemanager;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs;
import com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapPlainArgs;
import com.pulumi.gcp.certificatemanager.outputs.GetCertificateMapResult;
import java.util.concurrent.CompletableFuture;

public final class CertificatemanagerFunctions {
    /**
     * Get info about a Google Certificate Manager Certificate Map resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions;
     * import com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs;
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
     *         final var default = CertificatemanagerFunctions.getCertificateMap(GetCertificateMapArgs.builder()
     *             .name(&#34;cert-map&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCertificateMapResult> getCertificateMap(GetCertificateMapArgs args) {
        return getCertificateMap(args, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google Certificate Manager Certificate Map resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions;
     * import com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs;
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
     *         final var default = CertificatemanagerFunctions.getCertificateMap(GetCertificateMapArgs.builder()
     *             .name(&#34;cert-map&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateMapResult> getCertificateMapPlain(GetCertificateMapPlainArgs args) {
        return getCertificateMapPlain(args, InvokeOptions.Empty);
    }
    /**
     * Get info about a Google Certificate Manager Certificate Map resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions;
     * import com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs;
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
     *         final var default = CertificatemanagerFunctions.getCertificateMap(GetCertificateMapArgs.builder()
     *             .name(&#34;cert-map&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetCertificateMapResult> getCertificateMap(GetCertificateMapArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("gcp:certificatemanager/getCertificateMap:getCertificateMap", TypeShape.of(GetCertificateMapResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Get info about a Google Certificate Manager Certificate Map resource.
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.gcp.certificatemanager.CertificatemanagerFunctions;
     * import com.pulumi.gcp.certificatemanager.inputs.GetCertificateMapArgs;
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
     *         final var default = CertificatemanagerFunctions.getCertificateMap(GetCertificateMapArgs.builder()
     *             .name(&#34;cert-map&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetCertificateMapResult> getCertificateMapPlain(GetCertificateMapPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("gcp:certificatemanager/getCertificateMap:getCertificateMap", TypeShape.of(GetCertificateMapResult.class), args, Utilities.withVersion(options));
    }
}
