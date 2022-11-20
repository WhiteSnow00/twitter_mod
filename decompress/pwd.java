import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pwd implements xv8
{
    public final qwd D0;
    public final xwd E0;
    public final owd F0;
    
    public pwd(final qwd d0, final xwd e0, final owd f0) {
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
    }
    
    public final void k0(final Dialog dialog, final int n, final int n2) {
        final qwd d0 = this.D0;
        final xwd e0 = this.E0;
        final owd f0 = this.F0;
        czd.f((Object)d0, "this$0");
        czd.f((Object)e0, "$viewHolder");
        czd.f((Object)f0, "$item");
        czd.f((Object)dialog, "<anonymous parameter 0>");
        final y0k c = uiw.c(d0.l, "topic-toggle-pill-unfollow", (vvt$b)null, 0, 62);
        if (c != null) {
            c.start();
        }
        e0.H0.setToggledOn(false);
        final rqt f2 = d0.f;
        final h0p j = ((cxs)f0).j;
        final String c2 = f0.k.c;
        czd.e((Object)c2, "item.interestTopic.name");
        ((mjl)f2).e(j, c2);
        final w19 m = d0.m;
        final ett e2 = d0.e;
        final String a = f0.k.a;
        czd.e((Object)a, "item.interestTopic.id");
        m.c(e2.i(a, false, (cxs)null).r((oj)new q00((Object)c, 28), (lj6)new irl((qsb)new rwd(c), 24)));
    }
}
