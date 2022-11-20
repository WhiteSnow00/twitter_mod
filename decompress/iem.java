// 
// Decompiled by Procyon v0.6.0
// 

public final class iem extends tp1<msm<g42, kbv>>
{
    public final h42 E0;
    public final jem F0;
    
    public iem(final h42 e0, final jem f0) {
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void b(final Object o) {
        final msm msm = (msm)o;
        czd.f((Object)msm, "result");
        if (((h42$b)this.E0).c) {
            final jem f0 = this.F0;
            final boolean d = msm.d();
            final String x0 = ((h42$b)this.E0).a.X0();
            czd.e((Object)x0, "type.tweet.stringId");
            if (d) {
                f0.c.e((Object)new s42.g(x0));
            }
            else {
                f0.b.c(2131957005, 0);
                final oaa a = oaa.a;
                wa2.P(oaa.c);
            }
        }
    }
    
    public final void onError(final Throwable t) {
        czd.f((Object)t, "e");
        this.F0.b.c(2131951882, 0);
        final oaa a = oaa.a;
        wa2.P(oaa.c);
    }
}
