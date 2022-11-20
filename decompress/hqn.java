import java.util.concurrent.TimeUnit;
import android.widget.TextView;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import java.util.NoSuchElementException;
import com.twitter.rooms.ui.core.speakers.RoomManageSpeakersViewModel;
import java.util.Iterator;
import java.util.Objects;
import com.google.android.material.tabs.TabLayout$g;
import java.util.ArrayList;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.twitter.rooms.subsystem.api.utils.BottomSheetRecyclerView;
import com.google.android.material.tabs.TabLayout;
import android.widget.EditText;
import androidx.fragment.app.p;
import androidx.fragment.app.Fragment;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hqn implements ilx<uqn, fqn, dqn>
{
    public final View D0;
    public final Fragment E0;
    public final p F0;
    public final v1s G0;
    public final fig H0;
    public final nnl<tmi> I0;
    public final EditText J0;
    public final TabLayout K0;
    public final gmn L0;
    public final nnl<fqn> M0;
    public final rhh<uqn> N0;
    
    public hqn(final View d0, final h3e<eig> adapter, final Fragment e0, final p f0, final v1s g0, final fig h0, final nnl<tmi> i0) {
        czd.f((Object)d0, "rootView");
        czd.f((Object)adapter, "adapter");
        czd.f((Object)g0, "swipeHelper");
        czd.f((Object)h0, "itemProvider");
        czd.f((Object)i0, "nuxHostToolTipSubject");
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        final View viewById = d0.findViewById(2131430935);
        czd.e((Object)viewById, "rootView.findViewById(R.id.recycler_speakers)");
        final BottomSheetRecyclerView bottomSheetRecyclerView = (BottomSheetRecyclerView)viewById;
        final View viewById2 = d0.findViewById(2131429615);
        czd.e((Object)viewById2, "rootView.findViewById(co\u2026.rooms.R.id.input_search)");
        this.J0 = (EditText)viewById2;
        final View viewById3 = d0.findViewById(2131431878);
        czd.e((Object)viewById3, "rootView.findViewById(R.id.tab_speakers_filter)");
        final TabLayout k0 = (TabLayout)viewById3;
        this.K0 = k0;
        final gmn l0 = new gmn(d0);
        this.L0 = l0;
        this.M0 = (nnl<fqn>)new nnl();
        ((View)l0.g).setVisibility(4);
        ((View)l0.d).setVisibility(8);
        ((View)l0.f).setVisibility(8);
        ((TextView)l0.b).setText(2131958432);
        ((View)l0.b).setAlpha(0.0f);
        ((View)l0.a).setContentDescription((CharSequence)d0.getResources().getString(2131952177));
        d0.getContext();
        ((RecyclerView)bottomSheetRecyclerView).setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        ((RecyclerView)bottomSheetRecyclerView).setAdapter((RecyclerView$e)adapter);
        ((RecyclerView)bottomSheetRecyclerView).h((RecyclerView$l)new n(((View)bottomSheetRecyclerView).getContext(), 1));
        new q((q.d)g0).j((RecyclerView)bottomSheetRecyclerView);
        final itd itd = new itd(0, k0.getTabCount());
        final ArrayList list = new ArrayList();
        final etd j = ((gtd)itd).j();
        while (((htd)j).F0) {
            final TabLayout$g m = this.K0.l(j.a());
            if (m != null) {
                list.add(m);
            }
        }
        for (final TabLayout$g tabLayout$g : list) {
            final int e2 = tabLayout$g.e;
            n8s a;
            if (e2 != 1) {
                if (e2 != 2) {
                    if (e2 != 3) {
                        if (e2 != 4) {
                            if (e2 != 5) {
                                a = n8s.E0;
                            }
                            else {
                                a = n8s.J0;
                            }
                        }
                        else {
                            a = n8s.I0;
                        }
                    }
                    else {
                        a = n8s.H0;
                    }
                }
                else {
                    a = n8s.G0;
                }
            }
            else {
                a = n8s.F0;
            }
            tabLayout$g.a = a;
        }
        if (!djo.p()) {
            final itd itd2 = new itd(0, this.K0.getTabCount());
            final ArrayList<TabLayout$g> list2 = new ArrayList<TabLayout$g>();
            final etd j2 = ((gtd)itd2).j();
            while (((htd)j2).F0) {
                final TabLayout$g l2 = this.K0.l(j2.a());
                if (l2 != null) {
                    list2.add(l2);
                }
            }
            final ArrayList<TabLayout$g> list3 = new ArrayList<TabLayout$g>();
            for (final TabLayout$g next : list2) {
                if (next.a == n8s.F0) {
                    list3.add(next);
                }
            }
            for (final TabLayout$g tabLayout$g2 : list3) {
                final TabLayout k2 = this.K0;
                Objects.requireNonNull(k2);
                if (tabLayout$g2.g != k2) {
                    throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
                }
                k2.q(tabLayout$g2.e);
            }
        }
        this.N0 = (rhh<uqn>)q3j.g0((qsb)new hqn$f(this));
    }
    
    public final void T(final jbx jbx) {
        final uqn uqn = (uqn)jbx;
        czd.f((Object)uqn, "state");
        this.N0.b((Object)uqn);
        if (djo.p() && uqn.k == wqn.E0 && uqn.j == n8s.E0 && uqn.b) {
            this.I0.onNext((Object)tmi.a);
        }
    }
    
    public final void q(final Object o) {
        final dqn dqn = (dqn)o;
        czd.f((Object)dqn, "effect");
        if (dqn instanceof dqn$c) {
            Objects.requireNonNull(RoomManageSpeakersViewModel.Companion);
            final String y0 = RoomManageSpeakersViewModel.Y0;
            final dqn$c dqn$c = (dqn$c)dqn;
            final AtomicReference a = y7g.a;
            m8a.d((Throwable)null);
        }
        else if (dqn instanceof dqn$b) {
            ((View)this.L0.a).setRotation(0.0f);
            ((View)this.L0.b).setAlpha(0.0f);
            are.c(this.D0);
        }
        else if (dqn instanceof dqn$d) {
            ((View)this.L0.a).animate().rotation(90.0f).start();
            ((View)this.L0.b).animate().alpha(1.0f).start();
            final dqn$d dqn$d = (dqn$d)dqn;
            if (dqn$d.a != null) {
                final itd r = rrz.R(0, this.K0.getTabCount());
                final ArrayList list = new ArrayList();
                final Iterator iterator = ((gtd)r).iterator();
                while (((htd)iterator).hasNext()) {
                    final TabLayout$g l = this.K0.l(((etd)iterator).a());
                    if (l != null) {
                        list.add(l);
                    }
                }
                for (final Object next : list) {
                    if (((TabLayout$g)next).a == dqn$d.a) {
                        czd.e(next, "0 until tabLayout.tabCou\u2026tag == effect.tabFilter }");
                        this.K0.s((TabLayout$g)next, true);
                        return;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        else if (dqn instanceof dqn$a) {
            final String username = ((dqn$a)dqn).a.getUsername();
            final Fragment e0 = this.E0;
            if (e0 != null) {
                final Context n0 = e0.N0();
                if (n0 != null) {
                    final kjl$b kjl$b = new kjl$b(9);
                    ((kjl$a)kjl$b).I(n0.getString(2131958301, new Object[] { username }));
                    ((kjl$a)kjl$b).B((CharSequence)n0.getString(2131958300, new Object[] { username }));
                    ((kjl$a)kjl$b).F(2131952374);
                    ((kjl$a)kjl$b).C(2131958202);
                    final jjl jjl = (jjl)((xk1$a)kjl$b).w();
                    ((wk1)jjl).U1 = (xv8)new gqn(this, dqn);
                    final int a2 = c5j.a;
                    ((wk1)jjl).l2(this.F0);
                    return;
                }
            }
            throw new IllegalStateException("fragment context should not null".toString());
        }
    }
    
    public final h5j<fqn> w() {
        final h5j map = max.h((View)this.L0.a).map((psb)new bon((qsb)hqn$b.D0, 7));
        final h5j map2 = ((h5j)mru.e((TextView)this.J0)).map((psb)new k2o((qsb)hqn$c.D0, 2)).doOnNext((lj6)new cpl((qsb)new hqn$d(this), 17)).distinctUntilChanged().debounce(200L, TimeUnit.MILLISECONDS).map((psb)new oyf((qsb)hqn$e.D0, 26));
        final h5j create = h5j.create((h9j)new xi0((Object)this.K0, 1));
        czd.e((Object)create, "create<RoomManageSpeaker\u2026tedListener(listener) }\n}");
        final h5j mergeArray = h5j.mergeArray(new taj[] { (taj)map, (taj)map2, (taj)create, (taj)this.M0 });
        czd.e((Object)mergeArray, "override fun userIntentO\u2026      intentSubject\n    )");
        return (h5j<fqn>)mergeArray;
    }
    
    public interface a
    {
        hqn a(final View p0);
    }
}
