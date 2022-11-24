import java.util.Map;
import java.io.Closeable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class buh<K, T extends Closeable> implements m1l<T>
{
    public final Map<K, buh.buh$a> a;
    public final m1l<T> b;
    public final boolean c;
    public final String d;
    public final String e;
    
    public buh(final m1l<T> p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        buh.b:Lm1l;
        //     9: aload_0        
        //    10: new             Ljava/util/HashMap;
        //    13: dup            
        //    14: invokespecial   java/util/HashMap.<init>:()V
        //    17: putfield        buh.a:Ljava/util/HashMap;
        //    20: aload_0        
        //    21: iconst_0       
        //    22: putfield        buh.c:Z
        //    25: aload_0        
        //    26: ldc             "BitmapMemoryCacheKeyMultiplexProducer"
        //    28: putfield        buh.d:Ljava/lang/String;
        //    31: aload_0        
        //    32: ldc             "multiplex_bmp_cnt"
        //    34: putfield        buh.e:Ljava/lang/String;
        //    37: return         
        //    Signature:
        //  (Lm1l<TT;>;Ljava/lang/String;Ljava/lang/String;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
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
    
    public buh(final m1l<T> p0, final String p1, final String p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        buh.b:Lm1l;
        //     9: aload_0        
        //    10: new             Ljava/util/HashMap;
        //    13: dup            
        //    14: invokespecial   java/util/HashMap.<init>:()V
        //    17: putfield        buh.a:Ljava/util/HashMap;
        //    20: aload_0        
        //    21: iload_2        
        //    22: putfield        buh.c:Z
        //    25: aload_0        
        //    26: ldc             "EncodedCacheKeyMultiplexProducer"
        //    28: putfield        buh.d:Ljava/lang/String;
        //    31: aload_0        
        //    32: ldc             "multiplex_enc_cnt"
        //    34: putfield        buh.e:Ljava/lang/String;
        //    37: return         
        //    Signature:
        //  (Lm1l<TT;>;Ljava/lang/String;Ljava/lang/String;Z)V
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
    
    @Override
    public final void a(final pk6<T> pk6, final n1l n1l) {
        try {
            rrb.b();
            n1l.i().k(n1l, this.d);
            final Object c = this.c(n1l);
            while (true) {
                boolean b = false;
                synchronized (this) {
                    synchronized (this) {
                        final buh.buh$a buh$a = this.a.get(c);
                        monitorexit(this);
                        final int n = 1;
                        buh.buh$a buh$a2 = buh$a;
                        if (buh$a == null) {
                            synchronized (this) {
                                buh$a2 = new buh.buh$a(this, c);
                                this.a.put(c, buh$a2);
                                monitorexit(this);
                                b = true;
                            }
                        }
                        monitorexit(this);
                        if (buh$a2.a((pk6)pk6, n1l)) {
                            if (b) {
                                int n2;
                                if (n1l.n()) {
                                    n2 = n;
                                }
                                else {
                                    n2 = 2;
                                }
                                buh$a2.i(n2);
                            }
                            return;
                        }
                        continue;
                    }
                }
            }
        }
        finally {
            rrb.b();
        }
    }
    
    public abstract T b(final T p0);
    
    public abstract K c(final n1l p0);
    
    public final void d(final K k, final buh.buh$a buh$a) {
        synchronized (this) {
            if (this.a.get(k) == buh$a) {
                this.a.remove(k);
            }
        }
    }
}
