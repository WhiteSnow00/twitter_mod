// 
// Decompiled by Procyon v0.6.0
// 

public abstract class vn5
{
    public static final class a extends vn5
    {
        public final tg5 a;
        
        public a(final tg5 a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            final tg5 a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            return g4k.E("CommunityJoinRequest(community=", this.a, ")");
        }
    }
    
    public static final class b extends vn5
    {
        public final String a;
        public final c b;
        
        public b(final String a, final c b) {
            czd.f((Object)a, "message");
            czd.f((Object)b, "reason");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return czd.a((Object)this.a, (Object)b.a) && this.b == b.b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final c b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("CommunityJoinRequestCreateActionUnavailable(message=");
            sb.append(a);
            sb.append(", reason=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public enum c
    {
        public static final a Companion;
        
        E0;
        
        public static final c[] F0;
        public final String D0;
        
        static {
            Companion = new a();
        }
        
        public c(final String p0) {
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
            //    10: putfield        vn5$c.D0:Ljava/lang/String;
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
    
    public static final class d extends vn5
    {
        public final String a;
        public final e b;
        
        public d(final String a, final e b) {
            czd.f((Object)a, "message");
            czd.f((Object)b, "reason");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return czd.a((Object)this.a, (Object)d.a) && this.b == d.b;
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final e b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("CommunityJoinRequestCreateError(message=");
            sb.append(a);
            sb.append(", reason=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public enum e
    {
        public static final a Companion;
        
        E0;
        
        public static final e[] F0;
        public final String D0;
        
        static {
            Companion = new a();
        }
        
        public e(final String p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "Error"
            //     3: iconst_0       
            //     4: invokespecial   java/lang/Enum.<init>:(Ljava/lang/String;I)V
            //     7: aload_0        
            //     8: ldc             "Error"
            //    10: putfield        vn5$e.D0:Ljava/lang/String;
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
    
    public enum f
    {
        public static final a Companion;
        
        E0("Invalid");
        
        public static final f[] F0;
        public final String D0;
        
        static {
            Companion = new a();
        }
        
        public f(final String d0) {
            this.D0 = d0;
        }
        
        public static final class a
        {
            public final f a(final String s) {
                while (true) {
                    for (final f f : f.values()) {
                        if (czd.a((Object)s, (Object)f.D0)) {
                            final f f2 = f;
                            f e0 = f2;
                            if (f2 == null) {
                                e0 = f.E0;
                            }
                            return e0;
                        }
                    }
                    final f f2 = null;
                    continue;
                }
            }
        }
    }
}
