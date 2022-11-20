// 
// Decompiled by Procyon v0.6.0
// 

public final class cq
{
    public final iq a;
    public final gq b;
    public final m8a c;
    public final fmv d;
    public final r8x e;
    public final gwo f;
    public final gwo g;
    
    public cq(final iq a, final gq b, final m8a c, final fmv d, final r8x e, final gwo f, final gwo g) {
        czd.f((Object)a, "adIdBridgingHelper");
        czd.f((Object)b, "adIdBridgingRepository");
        czd.f((Object)c, "errorReporter");
        czd.f((Object)d, "featureConfigProvider");
        czd.f((Object)e, "viewLifecycle");
        czd.f((Object)f, "mainScheduler");
        czd.f((Object)g, "ioScheduler");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        e.d().subscribe((lj6)new tg((qsb)new cq$a(this), 10));
    }
}
