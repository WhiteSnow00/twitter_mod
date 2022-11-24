import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tkd<T> implements zzr<v88<T>>
{
    public final List<zzr<v88<T>>> a;
    public final boolean b;
    
    public tkd(final List<zzr<v88<T>>> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_1        
        //     5: invokeinterface java/util/List.isEmpty:()Z
        //    10: iconst_1       
        //    11: ixor           
        //    12: ldc             "List of suppliers is empty!"
        //    14: invokestatic    xd.F:(ZLjava/lang/Object;)V
        //    17: aload_0        
        //    18: aload_1        
        //    19: putfield        tkd.a:Ljava/util/List;
        //    22: aload_0        
        //    23: iconst_0       
        //    24: putfield        tkd.b:Z
        //    27: return         
        //    Signature:
        //  (Ljava/util/List<Lzzr<Lv88<TT;>;>;>;Z)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
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
    public final boolean equals(final Object o) {
        return o == this || (o instanceof tkd && q5j.a((Object)this.a, (Object)((tkd)o).a));
    }
    
    @Override
    public final Object get() {
        return new tkd.tkd$a(this);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final q5j$a b = q5j.b((Object)this);
        b.c("list", (Object)this.a);
        return b.toString();
    }
}
