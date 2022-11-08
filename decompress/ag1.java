import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ag1 extends wsd implements fd9
{
    public final pr4 D0;
    public final oq2 E0;
    public final float F0;
    public final oqp G0;
    public mcq H0;
    public tve I0;
    public jpj J0;
    
    public ag1(pr4 d0, oq2 e0, float f0, final oqp g0, final int n) {
        final ssd$a a = ssd.a;
        if ((n & 0x1) != 0x0) {
            d0 = null;
        }
        if ((n & 0x2) != 0x0) {
            e0 = null;
        }
        if ((n & 0x4) != 0x0) {
            f0 = 1.0f;
        }
        super((rtb)a);
        this.D0 = d0;
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = g0;
    }
    
    public final Object X(final Object o, final gub gub) {
        zzd.f((Object)gub, "operation");
        return gub.invoke(o, (Object)this);
    }
    
    public final boolean equals(final Object o) {
        ag1 ag1;
        if (o instanceof ag1) {
            ag1 = (ag1)o;
        }
        else {
            ag1 = null;
        }
        final boolean b = false;
        if (ag1 == null) {
            return false;
        }
        boolean b2 = b;
        if (zzd.a((Object)this.D0, (Object)ag1.D0)) {
            b2 = b;
            if (zzd.a((Object)this.E0, (Object)ag1.E0)) {
                final boolean b3 = this.F0 == ag1.F0;
                b2 = b;
                if (b3) {
                    b2 = b;
                    if (zzd.a((Object)this.G0, (Object)ag1.G0)) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    public final int hashCode() {
        final pr4 d0 = this.D0;
        int hashCode = 0;
        int i;
        if (d0 != null) {
            i = pr4.i(d0.a);
        }
        else {
            i = 0;
        }
        final oq2 e0 = this.E0;
        if (e0 != null) {
            hashCode = e0.hashCode();
        }
        return this.G0.hashCode() + c0.h(this.F0, (i * 31 + hashCode) * 31, 31);
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("Background(color=");
        g.append(this.D0);
        g.append(", brush=");
        g.append(this.E0);
        g.append(", alpha = ");
        g.append(this.F0);
        g.append(", shape=");
        g.append(this.G0);
        g.append(')');
        return g.toString();
    }
    
    public final void x(final sl6 sl6) {
        zzd.f((Object)sl6, "<this>");
        if (this.G0 == v5m.a) {
            final pr4 d0 = this.D0;
            if (d0 != null) {
                kd9.j((ld9)sl6, d0.a, 0L, 0L, 0.0f, (uau)null, (sr4)null, 0, 126, (Object)null);
            }
            final oq2 e0 = this.E0;
            if (e0 != null) {
                kd9.i((ld9)sl6, e0, 0L, 0L, this.F0, (uau)null, (sr4)null, 0, 118, (Object)null);
            }
        }
        else {
            final long c = ((ld9)sl6).c();
            final mcq h0 = this.H0;
            final mcq.a companion = mcq.Companion;
            final boolean b = h0 instanceof mcq;
            boolean b2 = false;
            if (b) {
                if (c == h0.a) {
                    b2 = true;
                }
            }
            jpj j0;
            if (b2 && ((ld9)sl6).getLayoutDirection() == this.I0) {
                j0 = this.J0;
                zzd.c((Object)j0);
            }
            else {
                j0 = this.G0.a(((ld9)sl6).c(), ((ld9)sl6).getLayoutDirection(), (dp8)sl6);
            }
            final pr4 d2 = this.D0;
            Label_0431: {
                if (d2 != null) {
                    final long a = d2.a;
                    final vya c2 = vya.C0;
                    Objects.requireNonNull(ld9.Companion);
                    final int b3 = ld9$a.b;
                    zzd.f((Object)j0, "outline");
                    if (j0 instanceof jpj.b) {
                        final n5m a2 = ((jpj.b)j0).a;
                        ((ld9)sl6).o0(a, ukg.m(a2.a, a2.b), x3j.f(a2.c - a2.a, a2.d - a2.b), 1.0f, c2, (sr4)null, b3);
                    }
                    else {
                        Object o;
                        if (j0 instanceof jpj.c) {
                            final jpj.c c3 = (jpj.c)j0;
                            o = c3.b;
                            if (o == null) {
                                final fko a3 = c3.a;
                                final float b4 = jy6.b(a3.h);
                                ((ld9)sl6).f0(a, ukg.m(a3.a, a3.b), x3j.f(a3.c - a3.a, a3.d - a3.b), zi8.d(b4, b4), c2, 1.0f, (sr4)null, b3);
                                break Label_0431;
                            }
                        }
                        else {
                            if (!(j0 instanceof jpj.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o = ((jpj.a)j0).a;
                        }
                        ((ld9)sl6).k0(o, a, 1.0f, (uau)c2, (sr4)null, b3);
                    }
                }
            }
            final oq2 e2 = this.E0;
            Label_0695: {
                if (e2 != null) {
                    final float f0 = this.F0;
                    final vya c4 = vya.C0;
                    Objects.requireNonNull(ld9.Companion);
                    final int b5 = ld9$a.b;
                    zzd.f((Object)j0, "outline");
                    if (j0 instanceof jpj.b) {
                        final n5m a4 = ((jpj.b)j0).a;
                        ((ld9)sl6).D0(e2, ukg.m(a4.a, a4.b), x3j.f(a4.c - a4.a, a4.d - a4.b), f0, c4, (sr4)null, b5);
                    }
                    else {
                        Object o2;
                        if (j0 instanceof jpj.c) {
                            final jpj.c c5 = (jpj.c)j0;
                            o2 = c5.b;
                            if (o2 == null) {
                                final fko a5 = c5.a;
                                final float b6 = jy6.b(a5.h);
                                ((ld9)sl6).N(e2, ukg.m(a5.a, a5.b), x3j.f(a5.c - a5.a, a5.d - a5.b), zi8.d(b6, b6), f0, c4, (sr4)null, b5);
                                break Label_0695;
                            }
                        }
                        else {
                            if (!(j0 instanceof jpj.a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o2 = ((jpj.a)j0).a;
                        }
                        ((ld9)sl6).r0(o2, e2, f0, (uau)c4, (sr4)null, b5);
                    }
                }
            }
            this.J0 = j0;
            this.H0 = new mcq(((ld9)sl6).c());
            this.I0 = ((ld9)sl6).getLayoutDirection();
        }
        sl6.E0();
    }
}
