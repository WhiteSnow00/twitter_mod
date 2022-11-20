// 
// Decompiled by Procyon v0.6.0
// 

public final class l52 extends ste implements ftb<nm6, mws, fzv>
{
    public final i52 D0;
    public final String E0;
    
    public l52(final i52 d0, final String e0) {
        this.D0 = d0;
        this.E0 = e0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final nm6 nm6 = (nm6)o;
        final mws mws = (mws)o2;
        czd.f((Object)nm6, "contentUriNotifier");
        czd.f((Object)mws, "timelineIdentifier");
        if (this.D0.h.c(mws, (Iterable)rp9.H0(this.E0)) > 0) {
            final i52 d0 = this.D0;
            rw0.d(d0.j, (oj)new rt1((Object)d0, (Object)mws, 2));
            nm6.b();
        }
        return fzv.a;
    }
}
