import android.graphics.Point;
import android.graphics.Rect;
import java.util.Collection;
import java.util.ArrayList;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfs
{
    public final List<cfs.cfs$d> a;
    public final String b;
    
    public cfs(@RecentlyNonNull final String b, @RecentlyNonNull final List<cfs.cfs$d> list) {
        (this.a = new ArrayList()).addAll(list);
        this.b = b;
    }
    
    public cfs(final rrz rrz) {
        final ArrayList a = new ArrayList();
        this.a = a;
        this.b = rrz.F0;
        a.addAll(v7q.A((List)rrz.G0, (f000)iuk.H0));
    }
    
    public static class c
    {
        public final String a;
        public final String b;
        
        public c(final String p0, final Rect p1, final List<Point> p2, final String p3) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_0        
            //     5: aload_1        
            //     6: putfield        cfs$c.a:Ljava/lang/String;
            //     9: aload_2        
            //    10: iconst_0       
            //    11: anewarray       Landroid/graphics/Point;
            //    14: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
            //    19: checkcast       [Landroid/graphics/Point;
            //    22: astore_1       
            //    23: aload_0        
            //    24: aload_3        
            //    25: putfield        cfs$c.b:Ljava/lang/String;
            //    28: return         
            //    Signature:
            //  (Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List<Landroid/graphics/Point;>;Ljava/lang/String;)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 4
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
}
