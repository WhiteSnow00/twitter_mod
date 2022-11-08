import com.facebook.imagepipeline.request.a$c;
import com.facebook.imagepipeline.request.a;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import com.facebook.common.memory.PooledByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j8d
{
    public final x0l a;
    public final bnb b;
    public final anb c;
    public final lyr<Boolean> d;
    public final s3h<q73, ui4> e;
    public final s3h<q73, PooledByteBuffer> f;
    public final ir2 g;
    public final ir2 h;
    public final u73 i;
    public final lyr<Boolean> j;
    public AtomicLong k;
    public final lyr<Boolean> l;
    public final da3 m;
    public final l8d n;
    
    static {
        new CancellationException("Prefetching is not enabled");
    }
    
    public j8d(final x0l p0, final Set<som> p1, final Set<rom> p2, final lyr<Boolean> p3, final s3h<q73, ui4> p4, final s3h<q73, PooledByteBuffer> p5, final ir2 p6, final ir2 p7, final u73 p8, final bms p9, final lyr<Boolean> p10, final lyr<Boolean> p11, final da3 p12, final l8d p13) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             Ljava/util/concurrent/atomic/AtomicLong;
        //     8: dup            
        //     9: invokespecial   java/util/concurrent/atomic/AtomicLong.<init>:()V
        //    12: putfield        j8d.k:Ljava/util/concurrent/atomic/AtomicLong;
        //    15: aload_0        
        //    16: aload_1        
        //    17: putfield        j8d.a:Lx0l;
        //    20: aload_0        
        //    21: new             Lbnb;
        //    24: dup            
        //    25: aload_2        
        //    26: invokespecial   bnb.<init>:(Ljava/util/Set;)V
        //    29: putfield        j8d.b:Lbnb;
        //    32: aload_0        
        //    33: new             Lanb;
        //    36: dup            
        //    37: aload_3        
        //    38: invokespecial   anb.<init>:(Ljava/util/Set;)V
        //    41: putfield        j8d.c:Lanb;
        //    44: aload_0        
        //    45: aload           4
        //    47: putfield        j8d.d:Llyr;
        //    50: aload_0        
        //    51: aload           5
        //    53: putfield        j8d.e:Ls3h;
        //    56: aload_0        
        //    57: aload           6
        //    59: putfield        j8d.f:Ls3h;
        //    62: aload_0        
        //    63: aload           7
        //    65: putfield        j8d.g:Lir2;
        //    68: aload_0        
        //    69: aload           8
        //    71: putfield        j8d.h:Lir2;
        //    74: aload_0        
        //    75: aload           9
        //    77: putfield        j8d.i:Lu73;
        //    80: aload_0        
        //    81: aload           10
        //    83: putfield        j8d.j:Llyr;
        //    86: aload_0        
        //    87: aconst_null    
        //    88: putfield        j8d.l:Llyr;
        //    91: aload_0        
        //    92: aload           11
        //    94: putfield        j8d.m:Lda3;
        //    97: aload_0        
        //    98: aload           12
        //   100: putfield        j8d.n:Ll8d;
        //   103: return         
        //    Signature:
        //  (Lx0l;Ljava/util/Set<Lsom;>;Ljava/util/Set<Lrom;>;Llyr<Ljava/lang/Boolean;>;Ls3h<Lq73;Lui4;>;Ls3h<Lq73;Lcom/facebook/common/memory/PooledByteBuffer;>;Lir2;Lir2;Lu73;Lbms;Llyr<Ljava/lang/Boolean;>;Llyr<Ljava/lang/Boolean;>;Lda3;Ll8d;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 13
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
    
    public final h88<wi4<ui4>> a(final a a, final Object o, final a$c a$c, final som som, final String s) {
        try {
            return this.b((p0l<wi4<ui4>>)this.a.c(a), a, a$c, o, som, s);
        }
        catch (final Exception ex) {
            return b9a.b((Throwable)ex);
        }
    }
    
    public final <T> h88<wi4<T>> b(final p0l<wi4<T>> p0l, final a a, a$c a$c, final Object o, som p6, final String s) {
        srb.b();
        bnb b;
        if (p6 == null) {
            p6 = a.p;
            if (p6 == null) {
                b = this.b;
            }
            else {
                b = new bnb(new som[] { (som)this.b, p6 });
            }
        }
        else {
            final som p7 = a.p;
            if (p7 == null) {
                b = new bnb(new som[] { (som)this.b, p6 });
            }
            else {
                b = new bnb(new som[] { (som)this.b, p6, p7 });
            }
        }
        final pyd pyd = new pyd((som)b, (rom)this.c);
        final da3 m = this.m;
        Label_0158: {
            if (m == null) {
                break Label_0158;
            }
            m.a();
            try {
                try {
                    final a$c k = a.k;
                    if (k.C0 > a$c.C0) {
                        a$c = k;
                    }
                    final cnp cnp = new cnp(a, String.valueOf(this.k.getAndIncrement()), s, (u0l)pyd, o, a$c, a.e || !o5w.e(a.b), a.j, this.n);
                    srb.b();
                    final vi4 vi4 = new vi4((p0l)p0l, cnp, (rom)pyd);
                    srb.b();
                    srb.b();
                    return (h88<wi4<T>>)vi4;
                }
                finally {}
            }
            catch (final Exception ex) {
                final h88 b2 = b9a.b((Throwable)ex);
                srb.b();
                return b2;
            }
        }
        srb.b();
    }
}
