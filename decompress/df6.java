import com.twitter.util.user.UserIdentifier;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import java.util.List;
import com.twitter.android.topiccarousel.MediaTileContainerView;
import android.widget.TextView;
import com.twitter.media.ui.image.UserImageView;
import android.widget.ListAdapter;
import com.twitter.android.topiccarousel.MediaTileContainerView$a;
import java.util.Objects;
import android.view.View;
import com.twitter.subsystems.interests.ui.topics.implicitprompt.ImplicitTopicPromptViewModel$c;

// 
// Decompiled by Procyon v0.6.0
// 

public final class df6 extends he<atu>
{
    public final fkt g;
    public final oxu h;
    public final f6t i;
    
    public df6(final fkt g, final oxu h, final f6t i, final t6t t6t, final ImplicitTopicPromptViewModel$c implicitTopicPromptViewModel$c) {
        zzd.f((Object)g, "eventReporter");
        zzd.f((Object)h, "tweetViewClickListener");
        zzd.f((Object)i, "timelineTweetClickListener");
        zzd.f((Object)t6t, "timelineTweetItemBinder");
        zzd.f((Object)implicitTopicPromptViewModel$c, "implicitTopicPromptViewModelFactory");
        super((Class)atu.class, t6t, implicitTopicPromptViewModel$c);
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void A(final d7t d7t, final atu atu, final ibm ibm) {
        zzd.f((Object)d7t, "vh");
        zzd.f((Object)atu, "item");
        super.x(d7t, (nws)atu, ibm);
        final gf6 gf6 = (gf6)d7t;
        final rd6 rd6 = new rd6();
        final b5j map = kno.f(((l8x)gf6).C0).map((qtb)new mma((rtb)ff6.C0, 3));
        zzd.e((Object)map, "heldView.throttledClicks().map { NoValue }");
        rd6.a(map.subscribe((fk6)new rj4((rtb)new df6$a(this, atu), 5)));
        final UserImageView n0 = gf6.N0;
        zzd.e((Object)n0, "imgUser");
        final b5j f = kno.f((View)n0);
        final TextView o0 = gf6.O0;
        zzd.e((Object)o0, "userName");
        final b5j f2 = kno.f((View)o0);
        final TextView p3 = gf6.P0;
        zzd.e((Object)p3, "userHandle");
        final b5j map2 = b5j.mergeArray(new naj[] { (naj)f, (naj)f2, (naj)kno.f((View)p3) }).map((qtb)new nma((rtb)ef6.C0, 3));
        zzd.e((Object)map2, "mergeArray(\n            \u2026        ).map { NoValue }");
        rd6.a(map2.subscribe((fk6)new iaa((rtb)new df6$b(this, atu), 5)));
        ibm.i((rj)new iv1(rd6, 3));
        final vo6 k = atu.k;
        zzd.e((Object)k, "item.tweet");
        gf6.R0.setText((CharSequence)pjr.l(k.x()));
        gf6.S0.setText((CharSequence)k.h());
        final MediaTileContainerView q0 = gf6.Q0;
        final oxu m0 = gf6.M0;
        Objects.requireNonNull(q0);
        zzd.f((Object)m0, "tweetViewClickListener");
        final Iterable f3 = k.f();
        zzd.e((Object)f3, "tweet.allMediaEntities");
        final List m2 = or4.m2(f3);
        if (m2.isEmpty()) {
            ((View)q0).setVisibility(8);
        }
        else {
            ((View)q0).setVisibility(0);
            if (m2.size() < 4) {
                q0.L0.setNumColumns(m2.size());
            }
            else {
                q0.L0.setNumColumns(2);
            }
            q0.L0.setAdapter((ListAdapter)new MediaTileContainerView$a(m2, q0.N0, q0.M0, (gub)new h1h(m0, k)));
        }
        gf6.N0.L(k.A());
        final UserImageView n2 = gf6.N0;
        n2.setSize(((View)n2).getContext().getResources().getDimensionPixelSize(2131165497));
        gf6.T0.setText((CharSequence)hqs.q(((l8x)gf6).C0.getResources(), k.C0.M0));
        if (!k.J0() && !k.g0()) {
            if (k.z0()) {
                gf6.U0.setImageResource(xd9.a(((l8x)gf6).C0.getContext(), 2130969754, 2131232212));
                final ImageView u0 = gf6.U0;
                final Context context = ((l8x)gf6).C0.getContext();
                zzd.e((Object)context, "heldView.context");
                u0.setColorFilter(goz.J(context, 2130970389));
                gf6.U0.setVisibility(0);
            }
            else {
                gf6.U0.setImageResource(0);
                gf6.U0.setVisibility(8);
            }
        }
        else {
            gf6.U0.setImageResource(xd9.a(((l8x)gf6).C0.getContext(), 2130969795, 2131232530));
            final ImageView u2 = gf6.U0;
            final Context context2 = ((l8x)gf6).C0.getContext();
            zzd.e((Object)context2, "heldView.context");
            u2.setColorFilter(goz.J(context2, 2130971096));
            gf6.U0.setVisibility(0);
        }
    }
    
    public final gf6 B(final ViewGroup viewGroup) {
        final View v = lf.v(viewGroup, "parent", 2131624238, viewGroup, false);
        zzd.e((Object)v, "view");
        return new gf6(v, this.h);
    }
    
    public final void C(final d7t d7t, final atu atu) {
        zzd.f((Object)d7t, "viewHolder");
        zzd.f((Object)atu, "item");
        super.z(d7t, (nws)atu);
        final fkt g = this.g;
        final int j0 = d7t.J0;
        Objects.requireNonNull(g);
        final qzo o0 = atu.k.O0;
        final lev lev = new lev();
        lev.a = atu.k.D();
        lev.R0 = o0;
        lev.f = j0;
        final UserIdentifier a = g.a;
        final nca$a companion = nca.Companion;
        final String d = ((vyo)g.c).d;
        zzd.e((Object)d, "scribeAssociation.page");
        final String e = ((vyo)g.c).e;
        zzd.e((Object)e, "scribeAssociation.section");
        String f;
        if (o0 == null || (f = o0.f) == null) {
            f = "";
        }
        String g2;
        if (o0 == null || (g2 = o0.g) == null) {
            g2 = "tweet";
        }
        final zf4 zf4 = new zf4(a, companion.e(d, e, f, g2, "impression"));
        zf4.i((szo)lev);
        g.b.c((okm)zf4);
    }
    
    public final atu u(final nws nws) {
        final atu atu = (atu)nws;
        zzd.f((Object)atu, "item");
        return atu;
    }
    
    public final boolean v(final nws nws) {
        zzd.f((Object)nws, "item");
        return true;
    }
}
