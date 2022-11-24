import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class n0n implements kld
{
    public final r9r F0;
    
    public n0n(final boolean b, final l9r<f0n> l9r) {
        this.F0 = new r9r(b, l9r);
    }
    
    public abstract void e(final sxk p0, final iz6 p1);
    
    public final void f(final wd9 wd9, float n, long c) {
        e0e.f((Object)wd9, "$this$drawStateLayer");
        final r9r f0 = this.F0;
        Objects.requireNonNull(f0);
        if (Float.isNaN(n)) {
            n = j0n.a((rp8)wd9, f0.a, wd9.c());
        }
        else {
            n = ((rp8)wd9).t0(n);
        }
        final float floatValue = ((Number)f0.c.f()).floatValue();
        if (floatValue > 0.0f) {
            final long b = sr4.b(c, floatValue);
            if (f0.a) {
                final float d = aeq.d(wd9.c());
                final float b2 = aeq.b(wd9.c());
                Objects.requireNonNull(mi4.Companion);
                final pd9 u0 = wd9.u0();
                c = u0.c();
                u0.b().p();
                u0.a().a(0.0f, 0.0f, d, b2, 1);
                vd9.c(wd9, b, n, 0L, 0.0f, null, null, 0, 124, null);
                u0.b().c();
                u0.d(c);
            }
            else {
                vd9.c(wd9, b, n, 0L, 0.0f, null, null, 0, 124, null);
            }
        }
    }
    
    public abstract void g(final sxk p0);
}
