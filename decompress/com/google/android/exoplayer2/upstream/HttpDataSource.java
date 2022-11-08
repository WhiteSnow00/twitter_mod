// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.upstream;

import okhttp3.CacheControl;
import java.util.List;
import java.util.Map;
import java.io.IOException;

public interface HttpDataSource extends com.google.android.exoplayer2.upstream.a
{
    public static final class CleartextNotPermittedException extends HttpDataSource$HttpDataSourceException
    {
        public CleartextNotPermittedException(final IOException ex, final b b) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", ex, b, 2007);
        }
    }
    
    public static final class InvalidContentTypeException extends HttpDataSource$HttpDataSourceException
    {
        public InvalidContentTypeException(String s, final b b) {
            s = String.valueOf(s);
            if (s.length() != 0) {
                s = "Invalid content type: ".concat(s);
            }
            else {
                s = new String("Invalid content type: ");
            }
            super(s, b, 2003);
        }
    }
    
    public static final class InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException
    {
        public final int G0;
        public final Map<String, List<String>> H0;
        public final byte[] I0;
        
        public InvalidResponseCodeException(final int p0, final String p1, final IOException p2, final Map<String, List<String>> p3, final b p4, final byte[] p5) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: bipush          26
            //     3: ldc             "Response code: "
            //     5: iload_1        
            //     6: invokestatic    q1a.f:(ILjava/lang/String;I)Ljava/lang/String;
            //     9: aload_2        
            //    10: aload           4
            //    12: sipush          2004
            //    15: invokespecial   com/google/android/exoplayer2/upstream/HttpDataSource$HttpDataSourceException.<init>:(Ljava/lang/String;Ljava/io/IOException;Lcom/google/android/exoplayer2/upstream/b;I)V
            //    18: aload_0        
            //    19: iload_1        
            //    20: putfield        com/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException.G0:I
            //    23: aload_0        
            //    24: aload_3        
            //    25: putfield        com/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException.H0:Ljava/util/Map;
            //    28: aload_0        
            //    29: aload           5
            //    31: putfield        com/google/android/exoplayer2/upstream/HttpDataSource$InvalidResponseCodeException.I0:[B
            //    34: return         
            //    Signature:
            //  (ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;Lcom/google/android/exoplayer2/upstream/b;[B)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 6
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
    }
    
    public abstract static class a implements HttpDataSource$b
    {
        public final HttpDataSource$c C0;
        
        public a() {
            this.C0 = new HttpDataSource$c();
        }
        
        public final HttpDataSource b() {
            final HttpDataSource$c c0 = this.C0;
            final egj egj = (egj)this;
            final dgj dgj = new dgj(egj.D0, egj.E0, null, c0);
            final zxt f0 = egj.F0;
            if (f0 != null) {
                dgj.g(f0);
            }
            return dgj;
        }
    }
}
