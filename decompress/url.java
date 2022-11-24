// 
// Decompiled by Procyon v0.6.0
// 

public final class url
{
    public final xjk a;
    public final zrl b;
    public final bw0 c;
    public final pml<trl> d;
    
    public url(final k9x k9x, final kcm kcm, final bxo bxo, final xjk a, final zrl b, final bw0 c, final pml<trl> d) {
        e0e.f((Object)k9x, "viewLifecycle");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)bxo, "ioScheduler");
        e0e.f((Object)a, "playServicesUtil");
        e0e.f((Object)b, "tokenRepository");
        e0e.f((Object)c, "asyncOperationController");
        e0e.f((Object)d, "delegateFactory");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        kcm.i((sj)new ku1(k9x.l().observeOn(bxo).subscribe((rk6)new aic((stb)new url$a(this), 4)), 7));
    }
}
