import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zfw implements yfw
{
    public final daq<ppl, List<jsi>> a;
    public final daq<pmi, Integer> b;
    public final bx0<jsi, jsi, ppl> c;
    
    public zfw(final daq<ppl, List<jsi>> a, final daq<pmi, Integer> b, final w3s<jsi, jsi, ppl> w3s) {
        zzd.f((Object)a, "dataSource");
        zzd.f((Object)b, "pushNotificationsCountSource");
        zzd.f((Object)w3s, "dataSink");
        this.a = a;
        this.b = b;
        final bx0<jsi, jsi, ppl> e = w3s.e();
        zzd.e((Object)e, "dataSink.async()");
        this.c = e;
    }
    
    public final n9q<List<jsi>> a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        zfw.a:Ldaq;
        //     4: new             Ly4q;
        //     7: dup            
        //     8: invokespecial   y4q.<init>:()V
        //    11: invokeinterface daq.S:(Ljava/lang/Object;)Ln9q;
        //    16: areturn        
        //    Signature:
        //  (Z)Ln9q<Ljava/util/List<Ljsi;>;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.ArrayIndexOutOfBoundsException: 1
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
    
    public final n9q<Integer> b() {
        return (n9q<Integer>)this.b.S((Object)pmi.a);
    }
    
    public final n9q<List<jsi>> c(final String s) {
        return this.n((ppl)new m3u(s));
    }
    
    public final iz5 d() {
        return this.m((ppl)new nx());
    }
    
    public final n9q<List<jsi>> e(final String s) {
        zzd.f((Object)s, "conversationId");
        return this.n((ppl)new xs6(s));
    }
    
    public final n9q<List<jsi>> f() {
        return this.n((ppl)new dvd());
    }
    
    public final n9q<List<jsi>> g(final long n) {
        return this.n((ppl)new asi(n));
    }
    
    public final iz5 h(final String s) {
        return this.m((ppl)new xs6(s));
    }
    
    public final iz5 i(final List<Long> list) {
        zzd.f((Object)list, "notificationIds");
        return this.m((ppl)new bsi((List)list));
    }
    
    public final n9q<List<jsi>> j(final String s) {
        return this.n((ppl)new y8c(s));
    }
    
    public final n9q<List<jsi>> k() {
        return this.n((ppl)new nx());
    }
    
    public final n9q<jsi> l(final jsi jsi) {
        zzd.f((Object)jsi, "notificationInfo");
        final n9q<jsi> put = this.c.put(jsi);
        zzd.e((Object)put, "dataSink.put(notificationInfo)");
        return put;
    }
    
    public final iz5 m(final ppl ppl) {
        final iz5 c = this.c.c(ppl);
        zzd.e((Object)c, "dataSink.delete(args)");
        return c;
    }
    
    public final n9q<List<jsi>> n(final ppl ppl) {
        return (n9q<List<jsi>>)this.a.S((Object)ppl);
    }
}
