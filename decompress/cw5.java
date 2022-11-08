// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cw5
{
    public static final e Companion;
    public static final cw5.cw5$a a;
    
    static {
        Companion = new e();
        a = new cw5.cw5$a();
    }
    
    public static final class b extends cw5
    {
        public final String b;
        
        public b(final String b) {
            zzd.f((Object)b, "deeplink");
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof b && zzd.a((Object)this.b, (Object)((b)o).b));
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("CommunitySpotlightSetupActionShow(deeplink=", this.b, ")");
        }
    }
    
    public static final class c extends cw5
    {
        public final String b;
        public final d c;
        
        public c(final String b, final d c) {
            zzd.f((Object)b, "message");
            zzd.f((Object)c, "reason");
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return zzd.a((Object)this.b, (Object)c.b) && this.c == c.c;
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + this.b.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String b = this.b;
            final d c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("CommunitySpotlightSetupActionUnavailable(message=");
            sb.append(b);
            sb.append(", reason=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public enum d
    {
        public static final a Companion;
        
        D0;
        
        public final String C0;
        
        static {
            Companion = new a();
        }
        
        public d(final String p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "Unavailable"
            //     3: iconst_0       
            //     4: invokespecial   java/lang/Enum.<init>:(Ljava/lang/String;I)V
            //     7: aload_0        
            //     8: ldc             "Unavailable"
            //    10: putfield        cw5$d.C0:Ljava/lang/String;
            //    13: return         
            //    Signature:
            //  (Ljava/lang/String;)V
            // 
            // The error that occurred was:
            // 
            // java.lang.ArrayIndexOutOfBoundsException: 1
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
        
        public static final class a
        {
        }
    }
    
    public static final class e
    {
    }
}
