import java.util.Iterator;
import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ww4 extends xzm implements rcm
{
    public final boolean E0;
    public final float F0;
    public final m8r<nq4> G0;
    public final m8r<pzm> H0;
    public final piq<bxk, qzm> I0;
    
    public ww4(final boolean e0, final float f0, final m8r g0, final m8r h0, final rf8 rf8) {
        super(e0, h0);
        this.E0 = e0;
        this.F0 = f0;
        this.G0 = (m8r<nq4>)g0;
        this.H0 = (m8r<pzm>)h0;
        this.I0 = (piq<bxk, qzm>)new piq();
    }
    
    public final void a() {
    }
    
    public final void b(final yk6 yk6) {
        czd.f((Object)yk6, "<this>");
        final long a = ((nq4)this.G0.getValue()).a;
        yk6.E0();
        this.f((tc9)yk6, this.F0, a);
        final Iterator iterator = this.I0.E0.iterator();
        while (((c9r)iterator).hasNext()) {
            final qzm qzm = ((Map.Entry)((b9r)iterator).next()).getValue();
            final float d = ((pzm)this.H0.getValue()).d;
            if (d != 0.0f) {
                final long b = nq4.b(a, d);
                Objects.requireNonNull(qzm);
                if (qzm.d == null) {
                    final long c = ((tc9)yk6).c();
                    final float a2 = tzm.a;
                    qzm.d = Math.max(ddq.d(c), ddq.b(c)) * 0.3f;
                }
                if (qzm.e == null) {
                    Float e;
                    if (Float.isNaN(qzm.b)) {
                        e = tzm.a((lo8)yk6, qzm.c, ((tc9)yk6).c());
                    }
                    else {
                        e = ((lo8)yk6).t0(qzm.b);
                    }
                    qzm.e = e;
                }
                if (qzm.a == null) {
                    qzm.a = new wfj(((tc9)yk6).B0());
                }
                if (qzm.f == null) {
                    qzm.f = new wfj(wj1.a(ddq.d(((tc9)yk6).c()) / 2.0f, ddq.b(((tc9)yk6).c()) / 2.0f));
                }
                float floatValue;
                if ((boolean)qzm.l.getValue() && !(boolean)qzm.k.getValue()) {
                    floatValue = 1.0f;
                }
                else {
                    floatValue = ((Number)qzm.g.f()).floatValue();
                }
                final Float d2 = qzm.d;
                czd.c((Object)d2);
                final float floatValue2 = d2;
                final Float e2 = qzm.e;
                czd.c((Object)e2);
                final float m = uoz.M(floatValue2, (float)e2, ((Number)qzm.h.f()).floatValue());
                final wfj a3 = qzm.a;
                czd.c((Object)a3);
                final float d3 = wfj.d(a3.a);
                final wfj f = qzm.f;
                czd.c((Object)f);
                final float i = uoz.M(d3, wfj.d(f.a), ((Number)qzm.i.f()).floatValue());
                final wfj a4 = qzm.a;
                czd.c((Object)a4);
                final float e3 = wfj.e(a4.a);
                final wfj f2 = qzm.f;
                czd.c((Object)f2);
                final long a5 = wj1.a(i, uoz.M(e3, wfj.e(f2.a), ((Number)qzm.i.f()).floatValue()));
                final long b2 = nq4.b(b, nq4.d(b) * floatValue);
                if (qzm.c) {
                    final float d4 = ddq.d(((tc9)yk6).c());
                    final float b3 = ddq.b(((tc9)yk6).c());
                    Objects.requireNonNull(hh4.Companion);
                    final mc9 u0 = ((tc9)yk6).u0();
                    final long c2 = u0.c();
                    u0.b().p();
                    u0.a().a(0.0f, 0.0f, d4, b3, 1);
                    sc9.c((tc9)yk6, b2, m, a5, 0.0f, (nbu)null, (qq4)null, 0, 120, (Object)null);
                    u0.b().c();
                    u0.d(c2);
                }
                else {
                    sc9.c((tc9)yk6, b2, m, a5, 0.0f, (nbu)null, (qq4)null, 0, 120, (Object)null);
                }
            }
        }
    }
    
    public final void c() {
        this.I0.clear();
    }
    
    public final void d() {
        this.I0.clear();
    }
    
    public final void e(final bxk bxk, final cy6 cy6) {
        czd.f((Object)bxk, "interaction");
        czd.f((Object)cy6, "scope");
        final Iterator iterator = this.I0.E0.iterator();
        while (iterator.hasNext()) {
            final qzm qzm = iterator.next().getValue();
            qzm.l.setValue((Object)Boolean.TRUE);
            ((s9e)qzm.j).f0((Object)fzv.a);
        }
        wfj wfj;
        if (this.E0) {
            wfj = new wfj(bxk.a);
        }
        else {
            wfj = null;
        }
        final qzm qzm2 = new qzm(wfj, this.F0, this.E0);
        this.I0.put((Object)bxk, (Object)qzm2);
        as2.M(cy6, (sx6)null, 0, (ftb)new ww4$a(qzm2, this, bxk, (go6)null), 3);
    }
    
    public final void g(final bxk bxk) {
        czd.f((Object)bxk, "interaction");
        final qzm qzm = (qzm)this.I0.get((Object)bxk);
        if (qzm != null) {
            qzm.l.setValue((Object)Boolean.TRUE);
            ((s9e)qzm.j).f0((Object)fzv.a);
        }
    }
}
