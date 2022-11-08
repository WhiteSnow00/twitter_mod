// 
// Decompiled by Procyon v0.6.0
// 

public final class otm implements ljj
{
    public final /* synthetic */ htm C0;
    public final /* synthetic */ ptm D0;
    
    public otm(final htm c0, final ptm d0) {
        this.C0 = c0;
        this.D0 = d0;
    }
    
    public final void W() {
    }
    
    public final String a(final vo6 vo6) {
        String d;
        if ((d = ((lbu)this.C0).d) == null) {
            d = "";
        }
        if (d.length() <= 0) {
            if (vo6.B0()) {
                d = "quote_tweet";
            }
            else {
                d = "tweet";
            }
        }
        return d;
    }
    
    public final boolean b() {
        return this.D0.c.hasId(((lbu)this.C0).a.w());
    }
    
    public final void c0(final vo6 vo6, final boolean b) {
        zzd.f((Object)vo6, "tweet");
        final zf4 zf4 = new zf4(this.D0.c);
        final jev d = this.D0.e.d;
        String s;
        if (!b) {
            s = "retweet_sheet";
        }
        else {
            s = "undo_retweet_sheet";
        }
        zf4.T = zf4.F(d, s, this.a(vo6), "impression").toString();
        final int a = w4j.a;
        this.D0.e.e.c((okm)zf4);
    }
    
    public final void m0(final vo6 vo6, final boolean b) {
        zzd.f((Object)vo6, "tweet");
        final zf4 zf4 = new zf4(this.D0.c);
        final jev d = this.D0.e.d;
        String s;
        if (!b) {
            s = "retweet_sheet";
        }
        else {
            s = "undo_retweet_sheet";
        }
        zf4.T = zf4.F(d, s, this.a(vo6), "dismiss").toString();
        final int a = w4j.a;
        this.D0.e.e.c((okm)zf4);
    }
    
    public final void v(final long n, final vo6 vo6) {
        zzd.f((Object)vo6, "tweet");
        final String d = ((lbu)this.C0).d;
        if (this.b()) {
            final ptm d2 = this.D0;
            final htm c0 = this.C0;
            ((pbu)d2).c(new lbu(((lbu)c0).a, ((lbu)c0).b, "self_quote", d, ((lbu)c0).e));
        }
        final ptm d3 = this.D0;
        final htm c2 = this.C0;
        ((pbu)d3).c(new lbu(((lbu)c2).a, ((lbu)c2).b, "quote", d, ((lbu)c2).e));
        if (rp2.j0(vo6)) {
            final ptm d4 = this.D0;
            final htm c3 = this.C0;
            ((pbu)d4).c(new lbu(((lbu)c3).a, ((lbu)c3).b, "cotweet_quote", d, ((lbu)c3).e));
        }
    }
    
    public final void x(final vo6 vo6, final boolean b) {
        zzd.f((Object)vo6, "tweet");
        final ubu g = this.C0.g;
        if (g != null) {
            g.c(b);
        }
        final String d = ((lbu)this.C0).d;
        if (b) {
            if (this.b()) {
                final ptm d2 = this.D0;
                final htm c0 = this.C0;
                ((pbu)d2).c(new lbu(((lbu)c0).a, ((lbu)c0).b, "self_unretweet", d, ((lbu)c0).e));
            }
            final ptm d3 = this.D0;
            final htm c2 = this.C0;
            ((pbu)d3).c(new lbu(((lbu)c2).a, ((lbu)c2).b, "unretweet", d, ((lbu)c2).e));
            if (!this.b() && zzd.a((Object)"soft_nudge_with_quote_tweet", (Object)vo6.C0.Z0)) {
                final ptm d4 = this.D0;
                final htm c3 = this.C0;
                ((pbu)d4).c(new lbu(((lbu)c3).a, ((lbu)c3).b, "soft_nudge_with_qt_unretweet", d, ((lbu)c3).e));
            }
        }
        else {
            if (this.b()) {
                final ptm d5 = this.D0;
                final htm c4 = this.C0;
                ((pbu)d5).c(new lbu(((lbu)c4).a, ((lbu)c4).b, "self_retweet", d, ((lbu)c4).e));
            }
            final ptm d6 = this.D0;
            final htm c5 = this.C0;
            ((pbu)d6).c(new lbu(((lbu)c5).a, ((lbu)c5).b, "retweet", d, ((lbu)c5).e));
            if (rp2.j0(vo6)) {
                final ptm d7 = this.D0;
                final htm c6 = this.C0;
                ((pbu)d7).c(new lbu(((lbu)c6).a, ((lbu)c6).b, "cotweet_retweet", d, ((lbu)c6).e));
            }
            if (!this.b() && zzd.a((Object)"soft_nudge_with_quote_tweet", (Object)vo6.C0.Z0)) {
                final ptm d8 = this.D0;
                final htm c7 = this.C0;
                ((pbu)d8).c(new lbu(((lbu)c7).a, ((lbu)c7).b, "soft_nudge_with_qt_retweet", d, ((lbu)c7).e));
            }
        }
    }
}
