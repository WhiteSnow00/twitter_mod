import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wv1 implements yz<vv1, ho3>
{
    public final mca a;
    
    public wv1(final mca a) {
        e0e.f((Object)a, "eventFactory");
        this.a = a;
    }
    
    public final f00 a(final uz uz) {
        final vv1 vv1 = (vv1)uz;
        e0e.f((Object)vv1, "event");
        final g5s a = nq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        final i73$a p = i73.P0;
        final mca a2 = this.a;
        Objects.requireNonNull(a2);
        final saa$a saa$a = new saa$a();
        final saa$b m0 = saa.M0;
        final so6 a3 = a2.a;
        Objects.requireNonNull(a3);
        final vv1 w = vv1.w();
        de2 de2 = null;
        if (w != null) {
            final de2$a l0 = de2.L0;
            final ics a4 = a3.a;
            final vv1 w2 = vv1.w();
            e0e.c((Object)w2);
            de2 = new de2(l0, (Object)new ce2(a4.a(w2)));
            if (((Enum)lo6.I0).ordinal() != 0) {
                de2 = de2;
            }
        }
        saa$a.a(m0, (Object)new mo6(mo6.L0, (Object)new lo6(de2)));
        final saa$b n0 = saa.N0;
        Objects.requireNonNull(a2.b);
        qj qj;
        if (vv1 instanceof s7a) {
            qj = new qj(qj.U0, (Object)new td4(td4.L0, (Object)new sd4()));
        }
        else if (vv1 instanceof e8a) {
            qj = new qj(qj.V0, (Object)new lcg(lcg.L0, (Object)new kcg()));
        }
        else if (vv1 instanceof b8a) {
            final b8a b8a = (b8a)vv1;
            final qj$a t0 = qj.T0;
            final ifd$a m2 = ifd.M0;
            final Double value = 0.0;
            final Long value2 = b8a.d;
            final Long value3 = b8a.e;
            final hfd hfd = new hfd();
            if (value != null) {
                hfd.F0 = value;
                hfd.K0.set(0, true);
            }
            if (value != null) {
                hfd.G0 = value;
                hfd.K0.set(1, true);
            }
            if (value2 != null) {
                hfd.H0 = value2;
                hfd.K0.set(2, true);
            }
            if (value3 != null) {
                hfd.I0 = value3;
                hfd.K0.set(3, true);
            }
            qj = new qj(t0, (Object)new ifd(m2, (Object)hfd));
        }
        else {
            if (!(vv1 instanceof yvg)) {
                throw new NoWhenBranchMatchedException();
            }
            final qj$a w3 = qj.W0;
            final zvg$a l2 = zvg.L0;
            final umk$a l3 = umk.L0;
            final Long value4 = ((yvg)vv1).d;
            final tmk tmk = new tmk();
            if (value4 != null) {
                tmk.F0 = value4;
                tmk.G0.set(0, true);
            }
            qj = new qj(w3, (Object)new zvg(l2, (Object)new umk(l3, (Object)tmk)));
        }
        saa$a.a(n0, (Object)qj);
        saa$a.a(saa.O0, (Object)a2.c.a(vv1));
        if (saa$a.a == null) {
            final StringBuilder f = ehk.f("Required field 'context' was not present! Struct: ");
            f.append(saa$a.toString());
            throw new IllegalArgumentException(f.toString());
        }
        if (saa$a.b == null) {
            final StringBuilder f2 = ehk.f("Required field 'action' was not present! Struct: ");
            f2.append(saa$a.toString());
            throw new IllegalArgumentException(f2.toString());
        }
        if (saa$a.c != null) {
            return (f00)new ho3(currentTimeMillis, new i73(p, (Object)new taa(taa.L0, (Object)new saa(saa$a.a, saa$a.b, saa$a.c))));
        }
        final StringBuilder f3 = ehk.f("Required field 'targetView' was not present! Struct: ");
        f3.append(saa$a.toString());
        throw new IllegalArgumentException(f3.toString());
    }
}
