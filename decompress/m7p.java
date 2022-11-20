import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class m7p
{
    public final boolean a;
    public final List<Integer> b;
    public final boolean c;
    public final f7w d;
    
    public m7p(final boolean p0, final List<Integer> p1, final boolean p2, final f7w p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: iconst_1       
        //     6: putfield        m7p.a:Z
        //     9: aload_0        
        //    10: aload_1        
        //    11: putfield        m7p.b:Ljava/util/List;
        //    14: aload_0        
        //    15: iconst_1       
        //    16: putfield        m7p.c:Z
        //    19: aload_0        
        //    20: aload_2        
        //    21: putfield        m7p.d:Lf7w;
        //    24: return         
        //    Signature:
        //  (ZLjava/util/List<Ljava/lang/Integer;>;ZLf7w;)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 3
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
        if (this == o) {
            return true;
        }
        if (!(o instanceof m7p)) {
            return false;
        }
        final m7p m7p = (m7p)o;
        return this.a == m7p.a && czd.a((Object)this.b, (Object)m7p.b) && this.c == m7p.c && czd.a((Object)this.d, (Object)m7p.d);
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a ? 1 : 0;
        final int n = 1;
        int n2 = a;
        if (a != 0) {
            n2 = 1;
        }
        final int d = sde.d((List)this.b, n2 * 31, 31);
        int c = this.c ? 1 : 0;
        if (c != 0) {
            c = n;
        }
        final f7w d2 = this.d;
        int hashCode;
        if (d2 == null) {
            hashCode = 0;
        }
        else {
            hashCode = d2.hashCode();
        }
        return (d + c) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final List<Integer> b = this.b;
        final boolean c = this.c;
        final f7w d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("SearchResultsConfiguration(hideToolbarOptions=");
        sb.append(a);
        sb.append(", searchTabs=");
        sb.append(b);
        sb.append(", tabsCenterAlignment=");
        sb.append(c);
        sb.append(", urtConfiguration=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
}
