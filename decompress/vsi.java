import android.view.ViewStub;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.twitter.ui.widget.TombstoneView;
import com.twitter.notifications.timeline.ui.NotificationAutoPlayableViewHost;
import com.twitter.tweetview.core.QuoteView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vsi
{
    public final View A;
    public final rv1 B;
    public final Activity a;
    public final krm b;
    public final efv c;
    public final rfm d;
    public int e;
    public final View f;
    public final View g;
    public final TextView h;
    public final v2c i;
    public final v2c j;
    public final v2c k;
    public final v2c l;
    public final v2c m;
    public final v2c n;
    public final v2c o;
    public final View p;
    public final View q;
    public final View r;
    public final ImageView s;
    public final FrameLayout t;
    public final baq<QuoteView> u;
    public qwv v;
    public final NotificationAutoPlayableViewHost w;
    public final baq<TombstoneView> x;
    public qfm y;
    public final FrameLayout z;
    
    public vsi(final Activity a, final krm b, final efv c, final ViewGroup viewGroup, final LayoutInflater layoutInflater, final rfm d, final rv1 b2) {
        this.e = -1;
        this.a = a;
        this.b = b;
        this.c = c;
        this.B = b2;
        this.d = d;
        final View inflate = layoutInflater.inflate(2131624545, viewGroup, false);
        (this.f = inflate).setTag(2131432587, (Object)this);
        final View viewById = inflate.findViewById(2131427550);
        jee.l((Object)viewById);
        final View view = viewById;
        this.g = viewById;
        final TextView h = (TextView)inflate.findViewById(2131428708);
        jee.l((Object)h);
        final TextView textView = h;
        this.h = h;
        final ViewStub viewStub = (ViewStub)inflate.findViewById(2131429064);
        jee.l((Object)viewStub);
        final ViewStub viewStub2 = viewStub;
        this.i = new v2c(viewStub);
        final ViewStub viewStub3 = (ViewStub)inflate.findViewById(2131428449);
        jee.l((Object)viewStub3);
        final ViewStub viewStub4 = viewStub3;
        this.j = new v2c(viewStub3);
        final ViewStub viewStub5 = (ViewStub)inflate.findViewById(2131431452);
        jee.l((Object)viewStub5);
        final ViewStub viewStub6 = viewStub5;
        this.m = new v2c(viewStub5);
        final ViewStub viewStub7 = (ViewStub)inflate.findViewById(2131431517);
        jee.l((Object)viewStub7);
        final ViewStub viewStub8 = viewStub7;
        this.k = new v2c(viewStub7);
        final ViewStub viewStub9 = (ViewStub)inflate.findViewById(2131428115);
        jee.l((Object)viewStub9);
        final ViewStub viewStub10 = viewStub9;
        this.l = new v2c(viewStub9);
        final View viewById2 = inflate.findViewById(2131428116);
        jee.l((Object)viewById2);
        final View view2 = viewById2;
        this.p = viewById2;
        final ViewStub viewStub11 = (ViewStub)inflate.findViewById(2131432028);
        jee.l((Object)viewStub11);
        final ViewStub viewStub12 = viewStub11;
        this.n = new v2c(viewStub11);
        final ViewStub viewStub13 = (ViewStub)inflate.findViewById(2131432025);
        jee.l((Object)viewStub13);
        final ViewStub viewStub14 = viewStub13;
        this.o = new v2c(viewStub13);
        final View viewById3 = inflate.findViewById(2131432029);
        jee.l((Object)viewById3);
        final View view3 = viewById3;
        this.q = viewById3;
        final View viewById4 = inflate.findViewById(2131432026);
        jee.l((Object)viewById4);
        final View view4 = viewById4;
        this.r = viewById4;
        final ImageView s = (ImageView)inflate.findViewById(2131429505);
        jee.l((Object)s);
        final ImageView imageView = s;
        this.s = s;
        this.t = (FrameLayout)inflate.findViewById(2131430390);
        this.u = (baq<QuoteView>)new baq(inflate, 2131430389, 2131430388);
        this.w = (NotificationAutoPlayableViewHost)inflate.findViewById(2131430380);
        this.x = (baq<TombstoneView>)new baq(inflate, 2131429640, 2131429639);
        this.z = (FrameLayout)inflate.findViewById(2131431576);
        this.A = inflate.findViewById(2131432299);
    }
    
    public final void a(final String text) {
        ((TextView)this.j.g()).setText((CharSequence)text);
    }
}
