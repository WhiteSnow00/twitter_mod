// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.Collections;
import android.net.Uri;
import java.util.List;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.UUID;

public final class WorkerParameters
{
    public UUID a;
    public b b;
    public int c;
    public Executor d;
    public lbs e;
    public ksx f;
    public xhl g;
    public imb h;
    
    public WorkerParameters(final UUID p0, final b p1, final Collection<String> p2, final a p3, final int p4, final int p5, final Executor p6, final lbs p7, final ksx p8, final xhl p9, final imb p10) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        androidx/work/WorkerParameters.a:Ljava/util/UUID;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        androidx/work/WorkerParameters.b:Landroidx/work/b;
        //    14: new             Ljava/util/HashSet;
        //    17: dup            
        //    18: aload_3        
        //    19: invokespecial   java/util/HashSet.<init>:(Ljava/util/Collection;)V
        //    22: pop            
        //    23: aload_0        
        //    24: iload           4
        //    26: putfield        androidx/work/WorkerParameters.c:I
        //    29: aload_0        
        //    30: aload           5
        //    32: putfield        androidx/work/WorkerParameters.d:Ljava/util/concurrent/Executor;
        //    35: aload_0        
        //    36: aload           6
        //    38: putfield        androidx/work/WorkerParameters.e:Llbs;
        //    41: aload_0        
        //    42: aload           7
        //    44: putfield        androidx/work/WorkerParameters.f:Lksx;
        //    47: aload_0        
        //    48: aload           8
        //    50: putfield        androidx/work/WorkerParameters.g:Lxhl;
        //    53: aload_0        
        //    54: aload           9
        //    56: putfield        androidx/work/WorkerParameters.h:Limb;
        //    59: return         
        //    Signature:
        //  (Ljava/util/UUID;Landroidx/work/b;Ljava/util/Collection<Ljava/lang/String;>;Landroidx/work/WorkerParameters$a;IILjava/util/concurrent/Executor;Llbs;Lksx;Lxhl;Limb;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 10
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
    
    public static final class a
    {
        public List<String> a;
        public List<Uri> b;
        
        public a() {
            this.a = Collections.emptyList();
            this.b = Collections.emptyList();
        }
    }
}
