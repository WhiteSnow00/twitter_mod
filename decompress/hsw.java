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

public final class hsw implements xlx
{
    public final pe6 F0;
    public final znl<isw> G0;
    public final RecyclerView H0;
    public final TextView I0;
    public final TextView J0;
    public final View K0;
    public final Button L0;
    public final View M0;
    public final View N0;
    public final View O0;
    public final View P0;
    public final List<View> Q0;
    public final List<View> R0;
    public final bsw S0;
    
    public hsw(final View view, final pe6 pe6, final pe6 f0, final zrm zrm, final ex8 ex8, final i9t i9t, final kcm kcm, final k9x k9x) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)pe6, "linkColorTextProcessor");
        e0e.f((Object)f0, "linkClickableTextProcessor");
        e0e.f((Object)zrm, "resourceProvider");
        e0e.f((Object)ex8, "navigationDelegate");
        e0e.f((Object)i9t, "timelineUrlLauncher");
        e0e.f((Object)kcm, "releaseCompletable");
        e0e.f((Object)k9x, "viewLifecycle");
        this.F0 = f0;
        this.G0 = (znl<isw>)new znl();
        final RecyclerView h0 = (RecyclerView)view.findViewById(2131432619);
        this.H0 = h0;
        final TextView i0 = (TextView)view.findViewById(2131432621);
        this.I0 = i0;
        final TextView j0 = (TextView)view.findViewById(2131432613);
        this.J0 = j0;
        final View viewById = view.findViewById(2131432614);
        this.K0 = viewById;
        final Button l0 = (Button)view.findViewById(2131432615);
        this.L0 = l0;
        final View viewById2 = view.findViewById(2131432616);
        this.M0 = viewById2;
        final View viewById3 = view.findViewById(2131432618);
        this.N0 = viewById3;
        final View viewById4 = view.findViewById(2131432617);
        this.O0 = viewById4;
        this.P0 = view.findViewById(2131432620);
        this.Q0 = shw.y0((Object[])new View[] { (View)h0, (View)i0, (View)j0, (View)l0 });
        this.R0 = shw.y0((Object[])new View[] { viewById3, viewById2, viewById4 });
        final bsw bsw = new bsw(pe6, zrm, i9t);
        this.S0 = bsw;
        ((View)h0).getContext();
        h0.setLayoutManager((RecyclerView$m)new LinearLayoutManager(1));
        h0.setAdapter((RecyclerView$e)bsw);
        final de6 de6 = new de6();
        e0e.e((Object)l0, "doneButton");
        final t5j f2 = too.f((View)l0);
        e0e.e((Object)viewById, "dismissButton");
        de6.a(t5j.merge((fbj)f2, (fbj)too.f(viewById)).subscribe((rk6)new zna((stb)new stb<View, vzv>(ex8) {
            public final ex8 F0;
            
            public final Object invoke(final Object o) {
                final View view = (View)o;
                this.F0.E0();
                return vzv.a;
            }
        }, 8)));
        e0e.e((Object)viewById2, "retryButton");
        de6.a(too.f(viewById2).subscribe((rk6)new aoa((stb)new stb<View, vzv>(this) {
            public final hsw F0;
            
            public final Object invoke(final Object o) {
                final View view = (View)o;
                this.F0.G0.onNext((Object)isw.a.a);
                return vzv.a;
            }
        }, 8)));
        de6.a(k9x.d().subscribe((rk6)new ug((stb)new stb<kni, vzv>(this) {
            public final hsw F0;
            
            public final Object invoke(final Object o) {
                final kni kni = (kni)o;
                this.F0.G0.onNext((Object)isw.a.a);
                return vzv.a;
            }
        }, 11)));
        kcm.i((sj)new gsw(de6, 0));
    }
    
    public final void T(final ccx ccx) {
        final nsw nsw = (nsw)ccx;
        e0e.f((Object)nsw, "state");
        if (nsw.b) {
            this.a(true);
        }
        else if (nsw.a != null) {
            this.a(false);
            final esw a = nsw.a;
            this.I0.setText((CharSequence)a.a);
            final pe6 f0 = this.F0;
            final TextView j0 = this.J0;
            final fym b = a.b;
            Objects.requireNonNull(f0);
            sym$a.a(j0, b, (sym)f0);
            ((TextView)this.L0).setText((CharSequence)a.e);
            if (a.d.isEmpty() ^ true) {
                final bsw s0 = this.S0;
                final List d = a.d;
                Objects.requireNonNull(s0);
                e0e.f((Object)d, "items");
                s0.L0.clear();
                s0.L0.addAll(d);
                ((RecyclerView$e)s0).f();
                ((View)this.H0).setVisibility(0);
            }
            else {
                ((View)this.H0).setVisibility(8);
            }
            final Iterator<Object> iterator = this.R0.iterator();
            while (iterator.hasNext()) {
                iterator.next().setVisibility(8);
            }
        }
        else {
            this.a(false);
            final Iterator<Object> iterator2 = this.R0.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().setVisibility(0);
            }
            final Iterator<Object> iterator3 = this.Q0.iterator();
            while (iterator3.hasNext()) {
                iterator3.next().setVisibility(8);
            }
        }
    }
    
    public final void a(final boolean b) {
        final View p = this.P0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        p.setVisibility(visibility);
        for (final View view : rr4.o2((Iterable)this.Q0, (Iterable)this.R0)) {
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
    
    public final void r(final Object o) {
    }
    
    public final t5j<isw> w() {
        return (t5j<isw>)this.G0;
    }
}
