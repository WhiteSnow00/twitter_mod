import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class izm implements gld
{
    public final w7r C0;
    
    public izm(final boolean b, final q7r<zym> q7r) {
        this.C0 = new w7r(b, (q7r)q7r);
    }
    
    public abstract void e(final twk p0, final yy6 p1);
    
    public final void f(final ld9 ld9, float n, long c) {
        zzd.f((Object)ld9, "$this$drawStateLayer");
        final w7r c2 = this.C0;
        Objects.requireNonNull(c2);
        if (Float.isNaN(n)) {
            n = dzm.a((dp8)ld9, c2.a, ld9.c());
        }
        else {
            n = ((dp8)ld9).t0(n);
        }
        final float floatValue = ((Number)c2.c.f()).floatValue();
        if (floatValue > 0.0f) {
            final long b = pr4.b(c, floatValue);
            if (c2.a) {
                final float d = mcq.d(ld9.c());
                final float b2 = mcq.b(ld9.c());
                Objects.requireNonNull(gi4.Companion);
                final ed9 u0 = ld9.u0();
                c = u0.c();
                u0.b().p();
                u0.a().a(0.0f, 0.0f, d, b2, 1);
                kd9.c(ld9, b, n, 0L, 0.0f, (uau)null, (sr4)null, 0, 124, (Object)null);
                u0.b().c();
                u0.d(c);
            }
            else {
                kd9.c(ld9, b, n, 0L, 0.0f, (uau)null, (sr4)null, 0, 124, (Object)null);
            }
        }
    }
    
    public abstract void g(final twk p0);
}
