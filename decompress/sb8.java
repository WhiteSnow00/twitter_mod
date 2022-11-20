import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sb8 implements y0l<xh4<vh4>>
{
    public final r53 a;
    public final Executor b;
    public final a6d c;
    public final lil d;
    public final y0l<j3a> e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int i;
    public final zh4 j;
    public final Runnable k;
    public final dzr<Boolean> l;
    
    public sb8(final r53 p0, final Executor p1, final a6d p2, final lil p3, final boolean p4, final boolean p5, final boolean p6, final y0l<j3a> p7, final int p8, final zh4 p9, final Runnable p10, final dzr<Boolean> p11) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          11
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_1        
        //    10: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    13: pop            
        //    14: aload_0        
        //    15: aload_1        
        //    16: putfield        sb8.a:Lr53;
        //    19: aload_2        
        //    20: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    23: pop            
        //    24: aload_0        
        //    25: aload_2        
        //    26: putfield        sb8.b:Ljava/util/concurrent/Executor;
        //    29: aload_3        
        //    30: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    33: pop            
        //    34: aload_0        
        //    35: aload_3        
        //    36: putfield        sb8.c:La6d;
        //    39: aload           4
        //    41: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    44: pop            
        //    45: aload_0        
        //    46: aload           4
        //    48: putfield        sb8.d:Llil;
        //    51: aload_0        
        //    52: iload           5
        //    54: putfield        sb8.f:Z
        //    57: aload_0        
        //    58: iload           6
        //    60: putfield        sb8.g:Z
        //    63: aload           8
        //    65: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //    68: pop            
        //    69: aload_0        
        //    70: aload           8
        //    72: putfield        sb8.e:Ly0l;
        //    75: aload_0        
        //    76: iload           7
        //    78: putfield        sb8.h:Z
        //    81: aload_0        
        //    82: iload           9
        //    84: putfield        sb8.i:I
        //    87: aload_0        
        //    88: aload           10
        //    90: putfield        sb8.j:Lzh4;
        //    93: aload_0        
        //    94: aconst_null    
        //    95: putfield        sb8.k:Ljava/lang/Runnable;
        //    98: aload_0        
        //    99: aload           11
        //   101: putfield        sb8.l:Ldzr;
        //   104: return         
        //    Signature:
        //  (Lr53;Ljava/util/concurrent/Executor;La6d;Llil;ZZZLy0l<Lj3a;>;ILzh4;Ljava/lang/Runnable;Ldzr<Ljava/lang/Boolean;>;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 12
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
    
    public final void a(final jj6<xh4<vh4>> jj6, final z0l z0l) {
        try {
            pqb.b();
            Object o;
            if (!z5w.e(z0l.l().b)) {
                o = new sb8.sb8$a(this, (jj6)jj6, z0l, this.h, this.i);
            }
            else {
                o = new sb8.sb8$b(this, (jj6)jj6, z0l, new mil(this.a), this.d, this.h, this.i);
            }
            this.e.a((jj6)o, z0l);
        }
        finally {
            pqb.b();
        }
    }
}
