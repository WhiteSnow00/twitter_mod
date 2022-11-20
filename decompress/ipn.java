import android.os.BaseBundle;
import java.util.concurrent.TimeUnit;
import android.widget.TextView;
import com.twitter.rooms.model.helpers.CohostInvite;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import androidx.fragment.app.Fragment$InstantiationException;
import com.twitter.rooms.ui.core.invite.RoomInviteViewModel;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.content.res.Resources;
import com.twitter.ui.widget.TwitterEditText;
import com.twitter.ui.components.text.legacy.TypefacesTextView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ipn implements ilx<wpn, xon, von>
{
    public final View D0;
    public final ul1 E0;
    public final q3e<zon> F0;
    public final gfo G0;
    public final mjo H0;
    public final nnl<xon> I0;
    public final RecyclerView J0;
    public final TypefacesTextView K0;
    public final View L0;
    public final TwitterEditText M0;
    public final TypefacesTextView N0;
    public final TypefacesTextView O0;
    public final TypefacesTextView P0;
    public final Resources Q0;
    public final rhh<wpn> R0;
    
    public ipn(final View d0, final ul1 e0, final h3e<zon> adapter, final q3e<zon> f0, final gfo g0, final mjo h0, final nnl<xon> i0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)adapter, "adapter");
        czd.f((Object)f0, "provider");
        czd.f((Object)g0, "roomToaster");
        czd.f((Object)h0, "roomUtilsFragmentViewEventDispatcher");
        czd.f((Object)i0, "publishSubject");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        final View viewById = d0.findViewById(2131431050);
        czd.e((Object)viewById, "rootView.findViewById(Ui\u2026ite_layout_recycler_view)");
        final RecyclerView j0 = (RecyclerView)viewById;
        this.J0 = j0;
        final View viewById2 = d0.findViewById(2131431053);
        czd.e((Object)viewById2, "rootView.findViewById(Ui\u2026nvite_layout_start_space)");
        this.K0 = (TypefacesTextView)viewById2;
        final View viewById3 = d0.findViewById(2131431046);
        czd.e((Object)viewById3, "rootView.findViewById(Ui\u2026te_layout_dismiss_button)");
        this.L0 = viewById3;
        final View viewById4 = d0.findViewById(2131431052);
        czd.e((Object)viewById4, "rootView.findViewById(Ui\u2026ite_layout_search_invite)");
        this.M0 = (TwitterEditText)viewById4;
        final View viewById5 = d0.findViewById(2131431054);
        czd.e((Object)viewById5, "rootView.findViewById(Ui\u2026m_invite_layout_subtitle)");
        this.N0 = (TypefacesTextView)viewById5;
        final View viewById6 = d0.findViewById(2131431057);
        czd.e((Object)viewById6, "rootView.findViewById(UiR.id.room_invite_title)");
        this.O0 = (TypefacesTextView)viewById6;
        final View viewById7 = d0.findViewById(2131431055);
        czd.e((Object)viewById7, "rootView.findViewById(Ui\u2026room_invite_layout_title)");
        this.P0 = (TypefacesTextView)viewById7;
        final Resources resources = ((View)j0).getResources();
        czd.e((Object)resources, "recyclerView.resources");
        this.Q0 = resources;
        d0.getContext();
        j0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        j0.setAdapter((RecyclerView$e)adapter);
        this.R0 = (rhh<wpn>)q3j.g0((qsb)new ipn$g(this));
    }
    
    public static final void a(final ipn ipn, final List list) {
        ipn.F0.d((n3e)new ckf((Iterable)list));
    }
    
    public static final List b(final ipn ipn, final List list, final Set set, final List list2, final List list3) {
        Objects.requireNonNull(ipn);
        final ArrayList list4 = new ArrayList(iq4.H((Iterable)list2, 10));
        for (final zon zon : list2) {
            final String a = zon.a.a;
            list4.add(zon.a(zon, list3.contains(a), list.contains(a) && !set.contains(a), 1));
        }
        return list4;
    }
    
    public final void T(final jbx jbx) {
        final wpn wpn = (wpn)jbx;
        czd.f((Object)wpn, "state");
        this.R0.b((Object)wpn);
    }
    
    public final void q(final Object o) {
        final von von = (von)o;
        czd.f((Object)von, "effect");
        if (von instanceof von.b) {
            Objects.requireNonNull(RoomInviteViewModel.Companion);
            final String z0 = RoomInviteViewModel.Z0;
            final von.b b = (von.b)von;
            Objects.toString(b.a);
            final AtomicReference a = y7g.a;
            m8a.d(b.a);
        }
        else if (von instanceof von.a) {
            ((TextView)this.M0).setText((CharSequence)"");
        }
        else if (von instanceof von.d) {
            final von.d d = (von.d)von;
            final int size = d.a.size();
            if (d.b == gpn.H0) {
                String s;
                if (size > 1) {
                    s = this.D0.getContext().getString(2131958031);
                }
                else {
                    s = this.D0.getContext().getString(2131958032, new Object[] { ((uon)mq4.f0((Iterable)d.a)).b });
                }
                czd.e((Object)s, "if (numberOfInvites > 1)\u2026  )\n                    }");
                this.G0.c(s, (Integer)null);
            }
            else {
                final gfo g0 = this.G0;
                final String quantityString = this.D0.getContext().getResources().getQuantityString(2131820676, size, new Object[] { size });
                czd.e((Object)quantityString, "rootView.context.resourc\u2026                        )");
                g0.c(quantityString, (Integer)null);
            }
        }
        else if (von instanceof von.c) {
            final Bundle a2 = nh.A("twitter:id", 874340);
            if (!((BaseBundle)a2).containsKey("twitter:id")) {
                throw new Fragment$InstantiationException("Missing fragment id", (Exception)null);
            }
            final ejo k = m1f.k(a2);
            final int a3 = c5j.a;
            this.H0.a((vmj)new vmj.b(((von.c)von).a));
            ((wk1)k).e2(((cnb)this.E0).P(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        else if (von instanceof von.e) {
            final Set<CohostInvite> a4 = ((von.e)von).a;
            final String string = this.D0.getContext().getResources().getString(2131954465);
            czd.e((Object)string, "rootView.context.resourc\u2026invite_cohosts_separator)");
            final String i = s9i.i(a4, string);
            final gfo g2 = this.G0;
            final String string2 = this.D0.getContext().getResources().getString(2131952530, new Object[] { i });
            czd.e((Object)string2, "rootView.context.resourc\u2026mes\n                    )");
            g2.c(string2, Integer.valueOf(31));
        }
    }
    
    public final h5j<xon> w() {
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)max.h((View)this.K0).map((psb)new hvl((qsb)ipn$b.D0, 27)), (taj)max.h(this.L0).map((psb)new dti((qsb)ipn$c.D0, 28)), (taj)((h5j)mru.e((TextView)this.M0)).map((psb)new hpn((qsb)ipn$d.D0, 0)).doOnNext((lj6)new ayi((qsb)new ipn$e(this), 17)).distinctUntilChanged().debounce(200L, TimeUnit.MILLISECONDS).map((psb)new wtn((qsb)ipn$f.D0, 5)), (taj)this.I0 });
        czd.e((Object)mergeArray, "override fun userIntentO\u2026shSubject\n        )\n    }");
        return (h5j<xon>)mergeArray;
    }
}
