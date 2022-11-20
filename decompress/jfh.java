import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfh implements jbx
{
    public final List<oeh> a;
    public final boolean b;
    
    public jfh() {
        this(null, false, 3, null);
    }
    
    public jfh(final List<oeh> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: aload_1        
        //     6: putfield        jfh.a:Ljava/util/List;
        //     9: aload_0        
        //    10: iconst_0       
        //    11: putfield        jfh.b:Z
        //    14: return         
        //    Signature:
        //  (Ljava/util/List<Loeh;>;Z)V
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
    
    public jfh(final List list, final boolean b, final int n, final rf8 rf8) {
        final f2a d0 = f2a.D0;
        this.a = (List<oeh>)d0;
        this.b = true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jfh)) {
            return false;
        }
        final jfh jfh = (jfh)o;
        return czd.a((Object)this.a, (Object)jfh.a) && this.b == jfh.b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        return hashCode * 31 + b;
    }
    
    @Override
    public final String toString() {
        final List<oeh> a = this.a;
        final boolean b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("MobileAppModuleViewState(mobileAppModuleDomainData=");
        sb.append(a);
        sb.append(", loading=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
