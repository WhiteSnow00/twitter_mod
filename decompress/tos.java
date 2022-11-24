import java.util.Map;
import java.util.concurrent.Executor;
import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tos<T> implements m1l<T>
{
    public final m1l<T> a;
    public int b;
    public final ConcurrentLinkedQueue<Pair<pk6<T>, n1l>> c;
    public final Executor d;
    
    public tos(final int p0, final Executor p1, final m1l<T> p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_1        
        //     5: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //     8: pop            
        //     9: aload_0        
        //    10: aload_1        
        //    11: putfield        tos.d:Ljava/util/concurrent/Executor;
        //    14: aload_0        
        //    15: aload_2        
        //    16: putfield        tos.a:Lm1l;
        //    19: aload_0        
        //    20: new             Ljava/util/concurrent/ConcurrentLinkedQueue;
        //    23: dup            
        //    24: invokespecial   java/util/concurrent/ConcurrentLinkedQueue.<init>:()V
        //    27: putfield        tos.c:Ljava/util/concurrent/ConcurrentLinkedQueue;
        //    30: aload_0        
        //    31: iconst_0       
        //    32: putfield        tos.b:I
        //    35: return         
        //    Signature:
        //  (ILjava/util/concurrent/Executor;Lm1l<TT;>;)V
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
        n1l.i().k(n1l, "ThrottlingProducer");
        synchronized (this) {
            final int b = this.b;
            boolean b2 = true;
            if (b >= 5) {
                this.c.add((Pair<pk6<T>, n1l>)Pair.create((Object)pk6, (Object)n1l));
            }
            else {
                this.b = b + 1;
                b2 = false;
            }
            monitorexit(this);
            if (!b2) {
                this.b(pk6, n1l);
            }
        }
    }
    
    public final void b(final pk6<T> pk6, final n1l n1l) {
        n1l.i().a(n1l, "ThrottlingProducer", null);
        this.a.a((pk6<T>)new tos.tos$b(this, (pk6)pk6, (tos$a)null), n1l);
    }
}
