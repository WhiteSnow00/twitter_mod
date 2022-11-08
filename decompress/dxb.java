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

public final class dxb
{
    public static final wou m;
    public final Activity a;
    public final TweetView b;
    public final FrameLayout c;
    public final ogm d;
    public final xxb e;
    public final qeu f;
    public ewg g;
    public vo6 h;
    public final int i;
    public final boolean j;
    public final TweetViewViewModel k;
    public final tr6 l;
    
    static {
        final wou$a wou$a = new wou$a();
        wou$a.f = true;
        wou$a.i = true;
        wou$a.j = true;
        m = (wou)((h4j)wou$a).e();
    }
    
    public dxb(final Activity a, final yvb yvb, final TweetView b, final FrameLayout c, final xxb e, final TweetViewViewModel k, final zbf j2, final tr6 tr6, final rcu q2, final ogm ogm, final wbj<lbu> wbj, final ibm ibm, final qeu qeu) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = ogm;
        this.e = e;
        final int i = nb0.F(3)[((dj1)yvb).mIntent.getIntExtra("extra_gallery_tweet_display_mode", 1)];
        this.i = i;
        this.j = (i != 1 && yvb.c() != 0L);
        this.k = k;
        this.l = tr6;
        this.f = qeu;
        if (((dj1)yvb).mIntent.getBooleanExtra("extra_enable_tweet_clicks", true)) {
            ((View)b).setOnClickListener((View$OnClickListener)new u0p((Object)this, 9));
        }
        if (!((dj1)yvb).mIntent.getBooleanExtra("extra_gallery_is_dm", false)) {
            final int a2 = w4j.a;
            final gob gob = (gob)a;
            final fod t2 = new fod((wbj)wbj, ibm, (rtb)new cxb((Object)this, 0));
            final jev v = e.v;
            final String y = e.y;
            final int u2 = ewg.u2;
            ewg g;
            if ((g = (ewg)gob.Q().G(2131429270)) == null) {
                g = new ewg();
                final zl1.b b2 = new zl1.b();
                b2.s("association", (Object)v, (alp)jev.i);
                b2.t("page", y);
                b2.t("section", "");
                b2.t("component", "gallery");
                ((Fragment)g).N1(((zl1)((h4j)b2).e()).a);
                final a a3 = new a(gob.Q());
                a3.e(2131429270, (Fragment)g, null, 1);
                a3.c();
                g.j2 = j2;
                g.i2 = tr6;
                g.q2 = q2;
                g.r2 = ogm;
                g.s2 = qeu;
                g.t2 = t2;
            }
            this.g = g;
        }
    }
    
    public final void a(final vo6 h) {
        this.h = h;
        if (this.j) {
            if (this.i == 2) {
                ((View)this.b).setVisibility(0);
            }
            final wou f0 = TweetViewViewModel.F0;
            final gv1 gv1 = new gv1(null);
            final wou m = dxb.m;
            zzd.f((Object)m, "<set-?>");
            this.k.i(new ryu(h, false, true, false, true, (atu)null, m, h.O2(), false, false, true, 1, (String)null, (ziq)null, false, false, false, (ryu$b)null, gv1, (String)null, 655360));
        }
        if (this.g != null) {
            final int a = kvu.a;
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
