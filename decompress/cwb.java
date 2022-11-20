import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import android.view.View$OnClickListener;
import com.twitter.tweetview.core.TweetViewViewModel;
import android.widget.FrameLayout;
import com.twitter.tweetview.core.TweetView;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cwb
{
    public static final qpu m;
    public final Activity a;
    public final TweetView b;
    public final FrameLayout c;
    public final ehm d;
    public final xwb e;
    public final jfu f;
    public ewg g;
    public bo6 h;
    public final int i;
    public final boolean j;
    public final TweetViewViewModel k;
    public final yq6 l;
    
    static {
        final qpu$a qpu$a = new qpu$a();
        qpu$a.f = true;
        qpu$a.i = true;
        qpu$a.j = true;
        m = (qpu)((n4j)qpu$a).e();
    }
    
    public cwb(final Activity a, final avb avb, final TweetView b, final FrameLayout c, final xwb e, final TweetViewViewModel k, final lbf k2, final yq6 yq6, final hdu r2, final ehm ehm, final ccj<ecu> ccj, final xbm xbm, final jfu jfu) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = ehm;
        this.e = e;
        final int i = ib0.I(3)[((xi1)avb).mIntent.getIntExtra("extra_gallery_tweet_display_mode", 1)];
        this.i = i;
        this.j = (i != 1 && avb.c() != 0L);
        this.k = k;
        this.l = yq6;
        this.f = jfu;
        if (((xi1)avb).mIntent.getBooleanExtra("extra_enable_tweet_clicks", true)) {
            ((View)b).setOnClickListener((View$OnClickListener)new sy((Object)this, 12));
        }
        if (!((xi1)avb).mIntent.getBooleanExtra("extra_gallery_is_dm", false)) {
            final int a2 = c5j.a;
            final cnb cnb = (cnb)a;
            final ind u2 = new ind((ccj)ccj, xbm, (qsb)new bwb((Object)this, 0));
            final efv v = e.v;
            final String y = e.y;
            final int v2 = ewg.v2;
            ewg g;
            if ((g = (ewg)cnb.P().G(2131429270)) == null) {
                g = new ewg();
                final vl1$b vl1$b = new vl1$b();
                ((vl1$a)vl1$b).s("association", (Object)v, (rlp)efv.i);
                ((vl1$a)vl1$b).t("page", y);
                ((vl1$a)vl1$b).t("section", "");
                ((vl1$a)vl1$b).t("component", "gallery");
                ((Fragment)g).N1(((vl1)((n4j)vl1$b).e()).a);
                final a a3 = new a(cnb.P());
                a3.e(2131429270, (Fragment)g, (String)null, 1);
                a3.c();
            }
            g.k2 = k2;
            g.j2 = yq6;
            g.r2 = r2;
            g.s2 = ehm;
            g.t2 = jfu;
            g.u2 = u2;
            this.g = g;
        }
    }
    
    public final void a(final bo6 h) {
        this.h = h;
        if (this.j) {
            if (this.i == 2) {
                ((View)this.b).setVisibility(0);
            }
            final qpu g0 = TweetViewViewModel.G0;
            final bv1 bv1 = new bv1((lca)null);
            final qpu m = cwb.m;
            czd.f((Object)m, "<set-?>");
            this.k.i(new mzu(h, false, true, false, true, (vtu)null, m, h.N2(), false, false, true, 1, (String)null, (rjq)null, false, false, false, (mzu$b)null, bv1, (String)null, 655360));
        }
        if (this.g != null) {
            final int a = dwu.a;
            if (h.K0() ^ true) {
                this.g.l2(h);
                ((View)this.c).setVisibility(0);
            }
            else {
                ((View)this.c).setVisibility(8);
            }
        }
    }
}
