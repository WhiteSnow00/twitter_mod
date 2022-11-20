// 
// Decompiled by Procyon v0.6.0
// 

public final class gq6 extends y4j<fq6>
{
    public static final gq6 b;
    
    static {
        b = new gq6();
    }
    
    public gq6() {
        super(0);
    }
    
    public final Object d(final vlp vlp, final int n) {
        czd.f((Object)vlp, "input");
        return new fq6(vlp.G(), spv.Companion.a(vlp.G()));
    }
    
    public final void f(final wlp wlp, final Object o) {
        final fq6 fq6 = (fq6)o;
        czd.f((Object)wlp, "output");
        czd.f((Object)fq6, "conversationContext");
        wlp.E(fq6.a).E(fq6.b.name());
    }
}
