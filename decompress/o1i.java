import androidx.appcompat.widget.Toolbar;
import android.view.View;
import androidx.fragment.app.p;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o1i implements xlx<s1i, i1i, h1i>
{
    public final fci<?> F0;
    public final bpb G0;
    public final p H0;
    public final h5s I0;
    public final fih<s1i> J0;
    
    public o1i(final View view, final fci<?> f0, final bpb g0, final p h0) {
        e0e.f((Object)view, "rootView");
        e0e.f((Object)f0, "navigator");
        e0e.f((Object)g0, "fragmentProvider");
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = (h5s)jty.N((ptb)new o1i$b(view));
        this.J0 = (fih<s1i>)ma7.S((stb)new o1i$d(this));
    }
    
    public final void T(final ccx ccx) {
        final s1i s1i = (s1i)ccx;
        e0e.f((Object)s1i, "state");
        this.J0.b((Object)s1i);
    }
    
    public final void r(final Object o) {
        final h1i h1i = (h1i)o;
        e0e.f((Object)h1i, "effect");
        if (h1i instanceof h1i.a) {
            this.F0.k();
        }
    }
    
    public final t5j<i1i> w() {
        final Object value = this.I0.getValue();
        e0e.e(value, "<get-toolbar>(...)");
        final t5j mergeArray = t5j.mergeArray(new fbj[] { (fbj)d4j.o0((Toolbar)value).map((rtb)new qe5((stb)o1i$c.F0, 24)) });
        e0e.e((Object)mergeArray, "mergeArray(toolbar.navig\u2026onIntent.OnBackPressed })");
        return (t5j<i1i>)mergeArray;
    }
}
