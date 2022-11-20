// 
// Decompiled by Procyon v0.6.0
// 

public final class a2i extends ste implements qsb<e2i, fzv>
{
    public final t1i D0;
    
    public a2i(final t1i d0) {
        this.D0 = d0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final e2i e2i = (e2i)o;
        czd.f((Object)e2i, "$this$distinct");
        final cgv d = e2i.d;
        if (d != null) {
            this.D0.Q0.setUser(d);
            this.D0.Q0.setIsFollower(chw.c0(e2i.d.I1));
            this.D0.P0.setVisibility(0);
        }
        else {
            this.D0.P0.setVisibility(8);
        }
        return fzv.a;
    }
}
