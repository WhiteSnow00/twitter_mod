import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i2t extends b4e<h2t, n2t>
{
    public final pcm d;
    public final ocm e;
    public final oys f;
    
    public i2t(final pcm d, final ocm e, final oys f) {
        super((Class)h2t.class);
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void k(final n8x n8x, final Object o, final kcm kcm) {
        final n2t n2t = (n2t)n8x;
        final h2t h2t = (h2t)o;
        Objects.requireNonNull(n2t);
        final d2t a = h2t.k.a;
        if (a instanceof c3t) {
            final int a2 = o5j.a;
            final c3t c3t = (c3t)a;
            final pcm h0 = n2t.H0;
            final d1p d = n2t.I0.d((vxs)h2t, Integer.valueOf(n2t.J0));
            Objects.requireNonNull(h0);
            n2t.G0.a.n((rk6)new m2t((Object)n2t, (Object)c3t, (Object)new f0t((Object)h0, (Object)c3t, (Object)h2t, (Object)d, 1), 0));
        }
        else {
            n2t.G0.a.a();
        }
    }
    
    public final n8x l(final ViewGroup viewGroup) {
        final View w = m51.w(viewGroup, 2131624580, viewGroup, false);
        return (n8x)new n2t(w, new wcm(w), this.d, this.e);
    }
    
    public final void m(final n8x n8x, final Object o) {
        final n2t n2t = (n2t)n8x;
        final h2t h2t = (h2t)o;
        if (h2t.j != null && h2t.k() && !h2t.c().t) {
            this.f.b(h2t);
        }
    }
    
    public static final class a extends b4e$a<h2t>
    {
        public a(final mxe<i2t> mxe) {
            super((Class)h2t.class, (mxe)mxe);
        }
    }
}
