import java.util.regex.Pattern;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.KClass;
import java.lang.annotation.Annotation;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rv0 extends tv0
{
    public static final rv0.rv0$a Companion;
    public final String C0;
    public final String D0;
    public final rv0 E0;
    public final u3s F0;
    public final u3s G0;
    
    static {
        Companion = new rv0.rv0$a();
        new rv0("error", "error", null);
        jgw.p0((Class)Object.class);
        jgw.p0((Class)oyv.class);
        jgw.p0((Class)Annotation.class);
        jgw.p0((Class)Enum.class);
        jgw.p0((Class)String.class);
        jgw.p0((Class)KClass.class);
        jgw.p0((Class)Class.class);
        jgw.p0((Class)Set.class);
        jgw.p0((Class)Map.class);
        jgw.p0((Class)Short.class);
        jgw.p0((Class)Integer.class);
        jgw.p0((Class)Long.class);
        jgw.p0((Class)Float.class);
        jgw.p0((Class)Double.class);
        jgw.p0((Class)Character.class);
        jgw.p0((Class)Boolean.class);
        jgw.p0((Class)Byte.class);
        jgw.p0((Class)Void.class);
        zzd.e((Object)Pattern.compile("([^A-Z]*)(?:\\.|^)(.*)"), "compile(pattern)");
    }
    
    public rv0(final String c0, final String d0, final rv0 e0) {
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = (u3s)rp2.z0((otb)new rv0$b(this));
        this.G0 = (u3s)rp2.z0((otb)new rv0$c(this));
    }
    
    public static rv0 e(final rv0 rv0, final String s, final rv0 rv2) {
        final String c0 = rv0.C0;
        zzd.f((Object)c0, "packageName");
        return new rv0(c0, s, rv2);
    }
    
    public static final gjp<String> f(final rv0 rv0) {
        final rv0 e0 = rv0.E0;
        gjp f;
        if (e0 != null) {
            f = f(e0);
        }
        else {
            f = null;
        }
        Object a = f;
        if (f == null) {
            a = e3a.a;
        }
        return (gjp<String>)tjp.S0((gjp)a, (Object)rv0.D0);
    }
    
    public final String b(final efm<Object> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "defaultRenderer"
        //     3: invokestatic    zzd.f:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0        
        //     7: getfield        rv0.F0:Lu3s;
        //    10: invokevirtual   u3s.getValue:()Ljava/lang/Object;
        //    13: checkcast       Ljava/lang/String;
        //    16: areturn        
        //    Signature:
        //  (Lefm<Ljava/lang/Object;>;Z)Ljava/lang/String;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 2
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2016)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rv0)) {
            return false;
        }
        final rv0 rv0 = (rv0)o;
        return zzd.a((Object)this.C0, (Object)rv0.C0) && zzd.a((Object)this.D0, (Object)rv0.D0) && zzd.a((Object)this.E0, (Object)rv0.E0);
    }
    
    public final int hashCode() {
        final int a = l7k.a(this.D0, this.C0.hashCode() * 31, 31);
        final rv0 e0 = this.E0;
        int hashCode;
        if (e0 == null) {
            hashCode = 0;
        }
        else {
            hashCode = e0.hashCode();
        }
        return a + hashCode;
    }
}
