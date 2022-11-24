// 
// Decompiled by Procyon v0.6.0
// 

public final class za1<T> extends vaa<T>
{
    public final T a;
    public final zzk b;
    
    public za1(final Integer p0, final T p1, final zzk p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   vaa.<init>:()V
        //     4: aload_1        
        //     5: ldc             "Null payload"
        //     7: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    10: pop            
        //    11: aload_0        
        //    12: aload_1        
        //    13: putfield        za1.a:Ljava/lang/Object;
        //    16: aload_2        
        //    17: ldc             "Null priority"
        //    19: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    22: pop            
        //    23: aload_0        
        //    24: aload_2        
        //    25: putfield        za1.b:Lzzk;
        //    28: return         
        //    Signature:
        //  (Ljava/lang/Integer;TT;Lzzk;)V
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
    public final Integer a() {
        return null;
    }
    
    @Override
    public final T b() {
        return this.a;
    }
    
    @Override
    public final zzk c() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof vaa) {
            final vaa vaa = (vaa)o;
            if (vaa.a() != null || !this.a.equals(vaa.b()) || !this.b.equals(vaa.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() ^ (0xD5009D89 ^ this.a.hashCode()) * 1000003;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Event{code=");
        sb.append((Object)null);
        sb.append(", payload=");
        sb.append(this.a);
        sb.append(", priority=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
