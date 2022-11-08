import android.os.BaseBundle;
import java.util.concurrent.TimeUnit;
import android.widget.TextView;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;
import androidx.fragment.app.Fragment;
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

public final class uon implements okx<ipn, kon, ion>
{
    public final View C0;
    public final yl1 D0;
    public final l4e<mon> E0;
    public final seo F0;
    public final xio G0;
    public final zml<kon> H0;
    public final RecyclerView I0;
    public final TypefacesTextView J0;
    public final View K0;
    public final TwitterEditText L0;
    public final TypefacesTextView M0;
    public final TypefacesTextView N0;
    public final TypefacesTextView O0;
    public final Resources P0;
    public final mhh<ipn> Q0;
    
    public uon(final View c0, final yl1 d0, final c4e<mon> adapter, final l4e<mon> e0, final seo f0, final xio g0, final zml<kon> h0) {
        zzd.f((Object)c0, "rootView");
        zzd.f((Object)adapter, "adapter");
        zzd.f((Object)e0, "provider");
        zzd.f((Object)f0, "roomToaster");
        zzd.f((Object)g0, "roomUtilsFragmentViewEventDispatcher");
        zzd.f((Object)h0, "publishSubject");
        this.C0 = c0;
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        final View viewById = c0.findViewById(2131431048);
        zzd.e((Object)viewById, "rootView.findViewById(Ui\u2026ite_layout_recycler_view)");
        final RecyclerView i0 = (RecyclerView)viewById;
        this.I0 = i0;
        final View viewById2 = c0.findViewById(2131431051);
        zzd.e((Object)viewById2, "rootView.findViewById(Ui\u2026nvite_layout_start_space)");
        this.J0 = (TypefacesTextView)viewById2;
        final View viewById3 = c0.findViewById(2131431044);
        zzd.e((Object)viewById3, "rootView.findViewById(Ui\u2026te_layout_dismiss_button)");
        this.K0 = viewById3;
        final View viewById4 = c0.findViewById(2131431050);
        zzd.e((Object)viewById4, "rootView.findViewById(Ui\u2026ite_layout_search_invite)");
        this.L0 = (TwitterEditText)viewById4;
        final View viewById5 = c0.findViewById(2131431052);
        zzd.e((Object)viewById5, "rootView.findViewById(Ui\u2026m_invite_layout_subtitle)");
        this.M0 = (TypefacesTextView)viewById5;
        final View viewById6 = c0.findViewById(2131431055);
        zzd.e((Object)viewById6, "rootView.findViewById(UiR.id.room_invite_title)");
        this.N0 = (TypefacesTextView)viewById6;
        final View viewById7 = c0.findViewById(2131431053);
        zzd.e((Object)viewById7, "rootView.findViewById(Ui\u2026room_invite_layout_title)");
        this.O0 = (TypefacesTextView)viewById7;
        final Resources resources = ((View)i0).getResources();
        zzd.e((Object)resources, "recyclerView.resources");
        this.P0 = resources;
        c0.getContext();
        i0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        i0.setAdapter((RecyclerView$e)adapter);
        this.Q0 = (mhh<ipn>)ajy.a0((rtb)new uon$g(this));
    }
    
    public static final void a(final uon uon, final List list) {
        uon.E0.d((i4e)new skf((Iterable)list));
    }
    
    public static final List b(final uon uon, final List list, final Set set, final List list2, final List list3) {
        Objects.requireNonNull(uon);
        final ArrayList list4 = new ArrayList(kr4.h1((Iterable)list2, 10));
        for (final mon mon : list2) {
            final String a = mon.a.a;
            list4.add(mon.a(mon, list3.contains(a), list.contains(a) && !set.contains(a), 1));
        }
        return list4;
    }
    
    public final void T(final oax oax) {
        final ipn ipn = (ipn)oax;
        zzd.f((Object)ipn, "state");
        this.Q0.b((Object)ipn);
    }
    
    public final void s(final Object o) {
        final ion ion = (ion)o;
        zzd.f((Object)ion, "effect");
        if (ion instanceof ion$b) {
            Objects.requireNonNull(RoomInviteViewModel.Companion);
            final String y0 = RoomInviteViewModel.Y0;
            final ion$b ion$b = (ion$b)ion;
            Objects.toString(ion$b.a);
            final AtomicReference a = j8g.a;
            e9a.d(ion$b.a);
        }
        else if (ion instanceof ion$a) {
            ((TextView)this.L0).setText((CharSequence)"");
        }
        else if (ion instanceof ion$d) {
            final ion$d ion$d = (ion$d)ion;
            final int size = ion$d.a.size();
            if (ion$d.b == ton.G0) {
                String s;
                if (size > 1) {
                    s = this.C0.getContext().getString(2131958031);
                }
                else {
                    s = this.C0.getContext().getString(2131958032, new Object[] { ((hon)or4.F1((Iterable)ion$d.a)).b });
                }
                zzd.e((Object)s, "if (numberOfInvites > 1)\u2026  )\n                    }");
                this.F0.c(s, (Integer)null);
            }
            else {
                final seo f0 = this.F0;
                final String quantityString = this.C0.getContext().getResources().getQuantityString(2131820676, size, new Object[] { size });
                zzd.e((Object)quantityString, "rootView.context.resourc\u2026                        )");
                f0.c(quantityString, (Integer)null);
            }
        }
        else if (ion instanceof ion$c) {
            final Bundle w = zi.w("twitter:id", 874340);
            if (!((BaseBundle)w).containsKey("twitter:id")) {
                throw new Fragment.InstantiationException("Missing fragment id", null);
            }
            final pio f2 = xha.f(w);
            final int a2 = w4j.a;
            this.G0.a((qmj)new qmj$b(((ion$c)ion).a));
            ((cl1)f2).e2(((gob)this.D0).Q(), "TAG_ROOM_PROFILE_SHEET_FRAGMENT");
        }
        else if (ion instanceof ion$e) {
            final Set a3 = ((ion$e)ion).a;
            final String string = this.C0.getContext().getResources().getString(2131954465);
            zzd.e((Object)string, "rootView.context.resourc\u2026invite_cohosts_separator)");
            final String v = dml.v(a3, string);
            final seo f3 = this.F0;
            final String string2 = this.C0.getContext().getResources().getString(2131952531, new Object[] { v });
            zzd.e((Object)string2, "rootView.context.resourc\u2026mes\n                    )");
            f3.c(string2, Integer.valueOf(31));
        }
    }
    
    public final b5j<kon> x() {
        final b5j mergeArray = b5j.mergeArray(new naj[] { (naj)asy.q((View)this.J0).map((qtb)new jhb((rtb)uon$b.C0, 27)), (naj)asy.q(this.K0).map((qtb)new l5l((rtb)uon$c.C0, 23)), (naj)r9x.b((TextView)this.L0).map((qtb)new q3m((rtb)uon$d.C0, 28)).doOnNext((fk6)new xol((rtb)new uon$e(this), 18)).distinctUntilChanged().debounce(200L, TimeUnit.MILLISECONDS).map((qtb)new sbn((rtb)uon$f.C0, 1)), (naj)this.H0 });
        zzd.e((Object)mergeArray, "override fun userIntentO\u2026shSubject\n        )\n    }");
        return (b5j<kon>)mergeArray;
    }
}
