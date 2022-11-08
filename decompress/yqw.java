import java.util.Iterator;
import java.util.Collection;
import java.util.Objects;
import androidx.recyclerview.widget.RecyclerView$e;
import androidx.recyclerview.widget.RecyclerView$m;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yqw implements okx
{
    public final de6 C0;
    public final zml<zqw> D0;
    public final RecyclerView E0;
    public final TextView F0;
    public final TextView G0;
    public final View H0;
    public final Button I0;
    public final View J0;
    public final View K0;
    public final View L0;
    public final View M0;
    public final List<View> N0;
    public final List<View> O0;
    public final rqw P0;
    
    public yqw(final View view, final de6 de6, final de6 c0, final tqm tqm, final nw8 nw8, final w7t w7t, final ibm ibm, final z7x z7x) {
        zzd.f((Object)view, "rootView");
        zzd.f((Object)de6, "linkColorTextProcessor");
        zzd.f((Object)c0, "linkClickableTextProcessor");
        zzd.f((Object)tqm, "resourceProvider");
        zzd.f((Object)nw8, "navigationDelegate");
        zzd.f((Object)w7t, "timelineUrlLauncher");
        zzd.f((Object)ibm, "releaseCompletable");
        zzd.f((Object)z7x, "viewLifecycle");
        this.C0 = c0;
        this.D0 = (zml<zqw>)new zml();
        final RecyclerView e0 = (RecyclerView)view.findViewById(2131432615);
        this.E0 = e0;
        final TextView f0 = (TextView)view.findViewById(2131432617);
        this.F0 = f0;
        final TextView g0 = (TextView)view.findViewById(2131432609);
        this.G0 = g0;
        final View viewById = view.findViewById(2131432610);
        this.H0 = viewById;
        final Button i0 = (Button)view.findViewById(2131432611);
        this.I0 = i0;
        final View viewById2 = view.findViewById(2131432612);
        this.J0 = viewById2;
        final View viewById3 = view.findViewById(2131432614);
        this.K0 = viewById3;
        final View viewById4 = view.findViewById(2131432613);
        this.L0 = viewById4;
        this.M0 = view.findViewById(2131432616);
        this.N0 = tdy.v0((Object[])new View[] { (View)e0, (View)f0, (View)g0, (View)i0 });
        this.O0 = tdy.v0((Object[])new View[] { viewById3, viewById2, viewById4 });
        final rqw rqw = new rqw(de6, tqm, w7t);
        this.P0 = rqw;
        ((View)e0).getContext();
        e0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        e0.setAdapter((RecyclerView$e)rqw);
        final rd6 rd6 = new rd6();
        zzd.e((Object)i0, "doneButton");
        final b5j f2 = kno.f((View)i0);
        zzd.e((Object)viewById, "dismissButton");
        rd6.a(b5j.merge((naj)f2, (naj)kno.f(viewById)).subscribe((fk6)new iaa((rtb)new rtb<View, oyv>() {
            public final Object invoke(final Object o) {
                final View view = (View)o;
                nw8.E0();
                return oyv.a;
            }
        }, 7)));
        zzd.e((Object)viewById2, "retryButton");
        rd6.a(kno.f(viewById2).subscribe((fk6)new kt1((rtb)new rtb<View, oyv>() {
            public final /* synthetic */ yqw C0;
            
            public final Object invoke(final Object o) {
                final View view = (View)o;
                this.C0.D0.onNext((Object)zqw.a.a);
                return oyv.a;
            }
        }, 4)));
        rd6.a(z7x.d().subscribe((fk6)new jt1((rtb)new rtb<pmi, oyv>() {
            public final /* synthetic */ yqw C0;
            
            public final Object invoke(final Object o) {
                final pmi pmi = (pmi)o;
                this.C0.D0.onNext((Object)zqw.a.a);
                return oyv.a;
            }
        }, 9)));
        ibm.i((rj)new xqw(rd6, 0));
    }
    
    public final void T(final oax oax) {
        final erw erw = (erw)oax;
        zzd.f((Object)erw, "state");
        if (erw.b) {
            this.a(true);
        }
        else if (erw.a != null) {
            this.a(false);
            final vqw a = erw.a;
            this.F0.setText((CharSequence)a.a);
            final de6 c0 = this.C0;
            final TextView g0 = this.G0;
            final xwm<?> b = a.b;
            Objects.requireNonNull(c0);
            kxm$a.a(g0, (xwm)b, (kxm)c0);
            ((TextView)this.I0).setText((CharSequence)a.e);
            if (a.d.isEmpty() ^ true) {
                final rqw p = this.P0;
                final List<oqw> d = a.d;
                Objects.requireNonNull(p);
                zzd.f((Object)d, "items");
                p.I0.clear();
                p.I0.addAll(d);
                ((RecyclerView$e)p).f();
                ((View)this.E0).setVisibility(0);
            }
            else {
                ((View)this.E0).setVisibility(8);
            }
            final Iterator<Object> iterator = this.O0.iterator();
            while (iterator.hasNext()) {
                iterator.next().setVisibility(8);
            }
        }
        else {
            this.a(false);
            final Iterator<Object> iterator2 = this.O0.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().setVisibility(0);
            }
            final Iterator<Object> iterator3 = this.N0.iterator();
            while (iterator3.hasNext()) {
                iterator3.next().setVisibility(8);
            }
        }
    }
    
    public final void a(final boolean b) {
        final View m0 = this.M0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        m0.setVisibility(visibility);
        for (final View view : or4.s2((Iterable)this.N0, (Iterable)this.O0)) {
            int visibility2;
            if (b) {
                visibility2 = 8;
            }
            else {
                visibility2 = 0;
            }
            view.setVisibility(visibility2);
        }
    }
    
    public final b5j<zqw> x() {
        return (b5j<zqw>)this.D0;
    }
}
