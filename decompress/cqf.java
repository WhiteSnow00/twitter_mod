import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cqf implements fok$a
{
    public final bqf D0;
    
    public cqf(final bqf d0) {
        this.D0 = d0;
    }
    
    public final void c() {
    }
    
    public final void e(g3 a, final t5 t5) {
        czd.f((Object)a, "media");
        czd.f((Object)t5, "startType");
        final bqf d0 = this.D0;
        final w4 g0 = d0.G0;
        if (g0 != null) {
            a = g0.a();
        }
        else {
            a = null;
        }
        if (g63.I(a)) {
            d0.D0.a();
        }
        else {
            final w4 g2 = d0.G0;
            if (g2 != null) {
                final i1 c1 = g2.b.c1;
                if (c1 != null) {
                    ((TextView)d0.D0.E0.f()).setText((CharSequence)d0.E0.a(c1));
                    ec0.c(d0.D0.E0.g());
                    d0.F0.b(rw0.k(5000L, (oj)new qbk(d0, 2)));
                }
            }
        }
    }
    
    public final void g(final g3 g3) {
        czd.f((Object)g3, "media");
        final bqf d0 = this.D0;
        d0.D0.a();
        d0.F0.b((t19)null);
    }
    
    public final void i() {
    }
    
    public final void v(final g3 g3) {
        czd.f((Object)g3, "media");
        final bqf d0 = this.D0;
        d0.D0.a();
        d0.F0.b((t19)null);
    }
    
    public final void w() {
    }
}
