import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z0t extends v3e<y0t, e1t>
{
    public final nbm d;
    public final mbm e;
    public final exs f;
    
    public z0t(final nbm d, final mbm e, final exs f) {
        super((Class)y0t.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void k(final c7x c7x, final Object o, final ibm ibm) {
        final e1t e1t = (e1t)c7x;
        final y0t y0t = (y0t)o;
        Objects.requireNonNull(e1t);
        final u0t a = y0t.k.a;
        if (a instanceof s1t) {
            final int a2 = w4j.a;
            final s1t s1t = (s1t)a;
            final nbm e0 = e1t.E0;
            final szo d = e1t.F0.d((nws)y0t, Integer.valueOf(e1t.G0));
            Objects.requireNonNull(e0);
            e1t.D0.a.n((fk6)new d1t((Object)e1t, (Object)s1t, (Object)new fl3((Object)e0, (Object)s1t, (Object)y0t, (Object)d, 1), 0));
        }
        else {
            e1t.D0.a.b();
        }
    }
    
    public final c7x l(final ViewGroup viewGroup) {
        final View b = w30.B(viewGroup, 2131624580, viewGroup, false);
        return (c7x)new e1t(b, new vbm(b), this.d, this.e);
    }
    
    public final void m(final c7x c7x, final Object o) {
        final e1t e1t = (e1t)c7x;
        final y0t y0t = (y0t)o;
        if (((nws)y0t).j != null && ((nws)y0t).k() && !((nws)y0t).c().t) {
            this.f.b((nws)y0t);
        }
    }
    
    public static final class a extends v3e$a<y0t>
    {
        public a(final fxe<z0t> fxe) {
            super((Class)y0t.class, (fxe)fxe);
        }
    }
}
