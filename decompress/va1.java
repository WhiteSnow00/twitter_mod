// 
// Decompiled by Procyon v0.6.0
// 

public final class va1<T> extends p9a<T>
{
    public final T a;
    public final izk b;
    
    public va1(final Integer p0, final T p1, final izk p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   p9a.<init>:()V
        //     4: aload_1        
        //     5: ldc             "Null payload"
        //     7: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    10: pop            
        //    11: aload_0        
        //    12: aload_1        
        //    13: putfield        va1.a:Ljava/lang/Object;
        //    16: aload_2        
        //    17: ldc             "Null priority"
        //    19: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    22: pop            
        //    23: aload_0        
        //    24: aload_2        
        //    25: putfield        va1.b:Lizk;
        //    28: return         
        //    Signature:
        //  (Ljava/lang/Integer;TT;Lizk;)V
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
    
    public final Integer a() {
        return null;
    }
    
    public final T b() {
        return this.a;
    }
    
    public final izk c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof p9a) {
            final p9a p9a = (p9a)o;
            if (p9a.a() != null || !this.a.equals(p9a.b()) || !this.b.equals(p9a.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return this.b.hashCode() ^ (0xD5009D89 ^ this.a.hashCode()) * 1000003;
    }
    
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
