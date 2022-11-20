import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import com.twitter.app.common.args.ContentViewArgs;
import com.twitter.communities.subsystem.api.args.JoinCommunityAgreementContentViewArgs;
import kotlin.NoWhenBranchMatchedException;
import androidx.fragment.app.Fragment$InstantiationException;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.rooms.model.helpers.RoomUserItem;
import java.util.Set;
import java.util.Objects;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.content.Context;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gsn implements ilx<qsn, dsn, csn>
{
    public static final gsn.gsn$a Companion;
    public final View D0;
    public final ul1 E0;
    public final mjo F0;
    public final w7o G0;
    public final obi<?> H0;
    public final Context I0;
    public final ImageView J0;
    public final LinearLayout K0;
    public final ImageView L0;
    public final TypefacesTextView M0;
    public final LinearLayout N0;
    public final ImageView O0;
    public final TypefacesTextView P0;
    public final TextView Q0;
    public final ImageView R0;
    public final n4s S0;
    public final n4s T0;
    public final n4s U0;
    public final rhh<qsn> V0;
    
    static {
        Companion = new gsn.gsn$a();
    }
    
    public gsn(final View d0, final ul1 e0, final mjo f0, final w7o g0, final obi<?> h0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)f0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)g0, "socialActionDelegate");
        czd.f((Object)h0, "navigator");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = d0.getContext();
        final View viewById = d0.findViewById(2131431066);
        czd.e((Object)viewById, "rootView.findViewById(R.\u2026oom_nudge_dismiss_button)");
        this.J0 = (ImageView)viewById;
        final View viewById2 = d0.findViewById(2131431059);
        czd.e((Object)viewById2, "rootView.findViewById(R.\u2026oom_nudge_button_primary)");
        this.K0 = (LinearLayout)viewById2;
        final View viewById3 = d0.findViewById(2131431060);
        czd.e((Object)viewById3, "rootView.findViewById(R.\u2026udge_button_primary_icon)");
        this.L0 = (ImageView)viewById3;
        final View viewById4 = d0.findViewById(2131431061);
        czd.e((Object)viewById4, "rootView.findViewById(R.\u2026udge_button_primary_text)");
        this.M0 = (TypefacesTextView)viewById4;
        final View viewById5 = d0.findViewById(2131431062);
        czd.e((Object)viewById5, "rootView.findViewById(R.\u2026m_nudge_button_secondary)");
        this.N0 = (LinearLayout)viewById5;
        final View viewById6 = d0.findViewById(2131431063);
        czd.e((Object)viewById6, "rootView.findViewById(R.\u2026ge_button_secondary_icon)");
        this.O0 = (ImageView)viewById6;
        final View viewById7 = d0.findViewById(2131431064);
        czd.e((Object)viewById7, "rootView.findViewById(R.\u2026ge_button_secondary_text)");
        this.P0 = (TypefacesTextView)viewById7;
        final View viewById8 = d0.findViewById(2131431065);
        czd.e((Object)viewById8, "rootView.findViewById(R.id.room_nudge_description)");
        this.Q0 = (TextView)viewById8;
        final View viewById9 = d0.findViewById(2131431068);
        czd.e((Object)viewById9, "rootView.findViewById(R.id.room_nudge_icon)");
        this.R0 = (ImageView)viewById9;
        this.S0 = (n4s)pps.n((nsb)gsn$c.D0);
        this.T0 = (n4s)pps.n((nsb)new nsb<gsn$a$a>(this) {
            public final gsn D0;
            
            public final Object invoke() {
                final gsn d0 = this.D0;
                final View d2 = d0.D0;
                final nnl nnl = (nnl)d0.S0.getValue();
                czd.e((Object)nnl, "onNudgeSlidDown");
                return new gsn$a$a(d2, nnl);
            }
        });
        this.U0 = (n4s)pps.n((nsb)new nsb<gsn$a$b>(this) {
            public final gsn D0;
            
            public final Object invoke() {
                return new gsn$a$b(this.D0.D0);
            }
        });
        d0.setBackground((Drawable)q3j.v(d0));
        d0.measure(-1, -2);
        d0.getLayoutParams().height = 0;
        d0.requestLayout();
        this.V0 = (rhh<qsn>)q3j.g0((qsb)new qsb<rhh$a<qsn>, fzv>(this) {
            public final gsn D0;
            
            public final Object invoke(final Object o) {
                final rhh$a rhh$a = (rhh$a)o;
                czd.f((Object)rhh$a, "$this$watch");
                rhh$a.c(new foe[] { (foe)hsn.D0 }, (qsb)new isn(this.D0));
                rhh$a.c(new foe[] { (foe)jsn.D0, (foe)ksn.D0 }, (qsb)new lsn(this.D0));
                return fzv.a;
            }
        });
    }
    
    public final void T(final jbx jbx) {
        final qsn qsn = (qsn)jbx;
        czd.f((Object)qsn, "state");
        this.V0.b((Object)qsn);
    }
    
    public final void a(int intValue, final Integer n) {
        ((View)this.K0).setBackgroundResource(intValue);
        if (Build$VERSION.SDK_INT >= 23) {
            final LinearLayout k0 = this.K0;
            Drawable j;
            if (n != null) {
                intValue = n.intValue();
                j = krm.Companion.b((View)this.K0).j(intValue);
            }
            else {
                j = null;
            }
            k0.setForeground(j);
        }
    }
    
    public final void q(final Object o) {
        final csn csn = (csn)o;
        czd.f((Object)csn, "effect");
        if (csn instanceof csn$a) {
            w7o.b(this.G0, ((csn$a)csn).a);
        }
        else if (csn instanceof csn$e) {
            final w7o g0 = this.G0;
            final csn$e csn$e = (csn$e)csn;
            final String a = csn$e.a;
            final Set b = csn$e.b;
            final Set c = csn$e.c;
            final boolean d = csn$e.d;
            Objects.requireNonNull(g0);
            czd.f((Object)a, "spaceId");
            czd.f((Object)b, "cohosts");
            czd.f((Object)c, "speakers");
            final StringBuilder sb = new StringBuilder();
            sb.append(g0.e());
            sb.append(" ");
            final List<RoomUserItem> d2 = g0.d(b);
            final List<RoomUserItem> d3 = g0.d(c);
            final ArrayList list = (ArrayList)d2;
            list.addAll(d3);
            if (list.isEmpty() ^ true) {
                final ArrayList list2 = new ArrayList<String>(iq4.H((Iterable)d2, 10));
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    final String username = ((RoomUserItem)iterator.next()).getUsername();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("@");
                    sb2.append(username);
                    list2.add(sb2.toString());
                }
                sb.append(mq4.m0((Iterable)list2, (CharSequence)null, (CharSequence)null, (CharSequence)null, (qsb)null, 63));
                sb.append(" ");
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("https://twitter.com/i/spaces/");
            sb3.append(a);
            sb.append(sb3.toString());
            final z66 z66 = new z66();
            z66.s(sb.toString(), null);
            z66.g(1);
            z66.p(new int[] { g0.e().length(), g0.e().length() });
            z66.o("audiospace");
            z66.q(false);
            Object o2;
            if (d) {
                o2 = h9i$e.b;
            }
            else {
                o2 = h9i$c.b;
            }
            z66.k((h9i)o2);
            g0.b.d((ym)z66);
        }
        else if (csn instanceof csn$d) {
            final Bundle a2 = nh.A("twitter:id", 874340);
            if (!((BaseBundle)a2).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final ejo k = m1f.k(a2);
            final int a3 = c5j.a;
            this.F0.a((vmj)new vmj.g(null, 1, null));
            ((wk1)k).e2(((cnb)this.E0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        else if (csn instanceof csn$c) {
            final Bundle a4 = nh.A("twitter:id", 874340);
            if (!((BaseBundle)a4).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final ejo i = m1f.k(a4);
            final int a5 = c5j.a;
            final mjo f0 = this.F0;
            final csn$c csn$c = (csn$c)csn;
            f0.a((vmj)new vmj.f(csn$c.a, csn$c.b));
            ((wk1)i).e2(((cnb)this.E0).P(), "TAG_ROOM_INVITE_DECLINE_REASONS_FRAGMENT");
        }
        else {
            if (!(csn instanceof csn$b)) {
                throw new NoWhenBranchMatchedException();
            }
            final obi<?> h0 = this.H0;
            final csn$b csn$b = (csn$b)csn;
            h0.b((ContentViewArgs)new JoinCommunityAgreementContentViewArgs(csn$b.a, csn$b.b));
        }
    }
    
    public final h5j<dsn> w() {
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)max.h((View)this.J0).map((psb)new g0i((qsb)gsn$f.D0, 10)), (taj)max.h((View)this.K0).map((psb)new vt1((qsb)gsn$g.D0, 4)), (taj)max.h((View)this.N0).map((psb)new oyf((qsb)gsn$h.D0, 2)), (taj)((h5j)this.S0.getValue()).map((psb)new lql((qsb)gsn$i.D0, 10)) });
        czd.e((Object)mergeArray, "mergeArray(\n        dism\u2026nt.NudgeSlidDown },\n    )");
        return (h5j<dsn>)mergeArray;
    }
}
