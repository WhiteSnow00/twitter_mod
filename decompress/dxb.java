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
    public static final cqu m;
    public final Activity a;
    public final TweetView b;
    public final FrameLayout c;
    public final thm d;
    public final yxb e;
    public final yfu f;
    public xwg g;
    public hp6 h;
    public final int i;
    public final boolean j;
    public final TweetViewViewModel k;
    public final es6 l;
    
    static {
        final cqu$a cqu$a = new cqu$a();
        cqu$a.f = true;
        cqu$a.i = true;
        cqu$a.j = true;
        m = (cqu)((z4j)cqu$a).e();
    }
    
    public dxb(final Activity a, final cwb cwb, final TweetView b, final FrameLayout c, final yxb e, final TweetViewViewModel k, final hcf m2, final es6 es6, final xdu t2, final thm thm, final ocj<vcu> ocj, final kcm kcm, final yfu yfu) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = thm;
        this.e = e;
        final int i = lb0.I(3)[((aj1)cwb).mIntent.getIntExtra("extra_gallery_tweet_display_mode", 1)];
        this.i = i;
        this.j = (i != 1 && cwb.c() != 0L);
        this.k = k;
        this.l = es6;
        this.f = yfu;
        if (((aj1)cwb).mIntent.getBooleanExtra("extra_enable_tweet_clicks", true)) {
            ((View)b).setOnClickListener((View$OnClickListener)new d1x((Object)this, 10));
        }
        if (!((aj1)cwb).mIntent.getBooleanExtra("extra_gallery_is_dm", false)) {
            final int a2 = o5j.a;
            final dob dob = (dob)a;
            final jod w2 = new jod((ocj)ocj, kcm, (stb)new f09(this, 1));
            final sfv v = e.v;
            final String y = e.y;
            final int x2 = xwg.x2;
            xwg g;
            if ((g = (xwg)dob.P().G(2131429270)) == null) {
                g = new xwg();
                final am1$b am1$b = new am1$b();
                ((am1.a<am1, am1.a>)am1$b).s("association", v, (nmp<sfv>)sfv.i);
                ((am1.a<am1, am1.a>)am1$b).t("page", y);
                ((am1.a<am1, am1.a>)am1$b).t("section", "");
                ((am1.a<am1, am1.a>)am1$b).t("component", "gallery");
                ((Fragment)g).N1(((am1)((z4j)am1$b).e()).a);
                final a a3 = new a(dob.P());
                a3.e(2131429270, (Fragment)g, (String)null, 1);
                a3.c();
            }
            g.m2 = m2;
            g.l2 = es6;
            g.t2 = t2;
            g.u2 = thm;
            g.v2 = yfu;
            g.w2 = w2;
            this.g = g;
        }
    }
    
    public final void a(final hp6 h) {
        this.h = h;
        if (this.j) {
            if (this.i == 2) {
                ((View)this.b).setVisibility(0);
            }
            final cqu i0 = TweetViewViewModel.I0;
            final jv1 jv1 = new jv1((uda)null);
            final cqu m = dxb.m;
            e0e.f((Object)m, "<set-?>");
            this.k.i(new xzu(h, false, true, false, true, (iuu)null, m, h.O2(), false, false, true, 1, (String)null, (nkq)null, false, false, false, (xzu$b)null, jv1, (String)null, 655360));
        }
        if (this.g != null) {
            final int a = qwu.a;
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
