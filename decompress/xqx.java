import java.util.List;
import java.util.Set;
import androidx.work.b;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xqx
{
    public UUID a;
    public a b;
    public b c;
    public Set<String> d;
    public b e;
    public int f;
    
    public xqx(final UUID p0, final a p1, final b p2, final List<String> p3, final b p4, final int p5, final int p6) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        xqx.a:Ljava/util/UUID;
        //     9: aload_0        
        //    10: aload_2        
        //    11: putfield        xqx.b:Lxqx$a;
        //    14: aload_0        
        //    15: aload_3        
        //    16: putfield        xqx.c:Landroidx/work/b;
        //    19: aload_0        
        //    20: new             Ljava/util/HashSet;
        //    23: dup            
        //    24: aload           4
        //    26: invokespecial   java/util/HashSet.<init>:(Ljava/util/Collection;)V
        //    29: putfield        xqx.d:Ljava/util/HashSet;
        //    32: aload_0        
        //    33: aload           5
        //    35: putfield        xqx.e:Landroidx/work/b;
        //    38: aload_0        
        //    39: iload           6
        //    41: putfield        xqx.f:I
        //    44: return         
        //    Signature:
        //  (Ljava/util/UUID;Lxqx$a;Landroidx/work/b;Ljava/util/List<Ljava/lang/String;>;Landroidx/work/b;II)V
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 7
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
        if (o != null && xqx.class == o.getClass()) {
            final xqx xqx = (xqx)o;
            return this.f == xqx.f && this.a.equals(xqx.a) && this.b == xqx.b && this.c.equals(xqx.c) && this.d.equals(xqx.d) && this.e.equals(xqx.e);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31) * 31) * 31 + this.f;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("WorkInfo{mId='");
        g.append(this.a);
        g.append('\'');
        g.append(", mState=");
        g.append(this.b);
        g.append(", mOutputData=");
        g.append(this.c);
        g.append(", mTags=");
        g.append(this.d);
        g.append(", mProgress=");
        g.append(this.e);
        g.append('}');
        return g.toString();
    }
    
    public enum a
    {
        C0, 
        D0, 
        E0, 
        F0, 
        G0, 
        H0;
        
        public final boolean b() {
            return this == a.E0 || this == a.F0 || this == a.H0;
        }
    }
}
