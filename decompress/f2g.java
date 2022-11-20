import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import com.google.android.exoplayer2.upstream.b;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f2g
{
    public static final AtomicLong c;
    public final b a;
    public final Map<String, List<String>> b;
    
    static {
        c = new AtomicLong();
    }
    
    public f2g(final long n, final b b, final long n2) {
        final Uri a = b.a;
        this(b, (Map)Collections.emptyMap());
    }
    
    public f2g(final long p0, final b p1, final Uri p2, final Map<String, List<String>> p3, final long p4, final long p5, final long p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        f2g.a:Lcom/google/android/exoplayer2/upstream/b;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        f2g.b:Ljava/util/Map;
        //    14: return         
        //    Signature:
        //  (JLcom/google/android/exoplayer2/upstream/b;Landroid/net/Uri;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;JJJ)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 3
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static long a() {
        return f2g.c.getAndIncrement();
    }
}
