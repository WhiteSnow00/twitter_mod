import java.util.Iterator;
import java.util.HashMap;
import androidx.annotation.RecentlyNonNull;
import java.util.Set;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class udm
{
    public final Map<Class<? extends tdm>, eml<Object>> a;
    
    public udm(@RecentlyNonNull final Set<a> set) {
        this.a = new HashMap();
        for (final a a : set) {
            this.a.put(a.a, a.b);
        }
    }
    
    public static final class a
    {
        public final Class<? extends tdm> a;
        public final eml<Object> b;
        
        public <RemoteT extends tdm> a(@RecentlyNonNull final Class<RemoteT> p0, final eml<Object> p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: invokespecial   java/lang/Object.<init>:()V
            //     4: aload_0        
            //     5: ldc             Lea7;.class
            //     7: putfield        udm$a.a:Ljava/lang/Class;
            //    10: aload_0        
            //    11: aload_1        
            //    12: putfield        udm$a.b:Leml;
            //    15: return         
            //    Signature:
            //  <RemoteT:Ltdm;>(Ljava/lang/Class<TRemoteT;>;Leml<Ljava/lang/Object;>;)V
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
