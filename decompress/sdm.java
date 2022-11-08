// 
// Decompiled by Procyon v0.6.0
// 

public final class sdm extends yp1<vrm<m42, pav>>
{
    public final /* synthetic */ n42 D0;
    public final /* synthetic */ tdm E0;
    
    public sdm(final n42 d0, final tdm e0) {
        this.D0 = d0;
        this.E0 = e0;
    }
    
    public final void b(final Object o) {
        final vrm vrm = (vrm)o;
        zzd.f((Object)vrm, "result");
        if (((n42$b)this.D0).c) {
            final tdm e0 = this.E0;
            final boolean d = vrm.d();
            final String y0 = ((n42$b)this.D0).a.Y0();
            zzd.e((Object)y0, "type.tweet.stringId");
            if (d) {
                e0.c.e((Object)new z42.g(y0));
            }
            else {
                e0.b.b(2131957005, 0);
                final fba a = fba.a;
                lux.j(fba.c);
            }
        }
    }
    
    public final void onError(final Throwable t) {
        zzd.f((Object)t, "e");
        this.E0.b.b(2131951882, 0);
        final fba a = fba.a;
        lux.j(fba.c);
    }
}
