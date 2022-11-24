import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ob2
{
    public static final pb2 a;
    public static final ob2$b b;
    
    static {
        Objects.requireNonNull(ex.Companion);
        a = new pb2(false, (ex)ex$a.b);
        b = ob2$b.a;
    }
    
    public static final void a(final dlh dlh, d86 h, final int n) {
        e0e.f((Object)dlh, "modifier");
        h = h.h(-211209833);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)dlh)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n3 & 0xB) == 0x2 && h.i()) {
            h.H();
        }
        else {
            final sa6$b a = sa6.a;
            final zqg b = ob2.b;
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b2 = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(dlh);
            final int n4 = (((n3 << 3 & 0x70) | 0x180) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b2);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, b, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a2).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)(n4 >> 3 & 0x70));
            h.x(2058660585);
            h.x(1021196736);
            if ((n4 >> 9 & 0xE & 0xB) == 0x2) {
                if (h.i()) {
                    h.H();
                }
            }
            h.O();
            h.O();
            h.r();
            h.O();
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new ob2$a(dlh, n));
        }
    }
    
    public static final boolean b(final wqg wqg) {
        final Object m = ((jzd)wqg).m();
        nb2 nb2;
        if (m instanceof nb2) {
            nb2 = (nb2)m;
        }
        else {
            nb2 = null;
        }
        return nb2 != null && nb2.H0;
    }
    
    public static final void c(final khk$a khk$a, final khk khk, final wqg wqg, final cwe cwe, final int n, final int n2, final ex ex) {
        final Object m = ((jzd)wqg).m();
        nb2 nb2;
        if (m instanceof nb2) {
            nb2 = (nb2)m;
        }
        else {
            nb2 = null;
        }
        ex g0 = null;
        Label_0046: {
            if (nb2 != null) {
                g0 = nb2.G0;
                if (g0 != null) {
                    break Label_0046;
                }
            }
            g0 = ex;
        }
        khk$a.f(khk$a, khk, g0.a(shw.f(khk.F0, khk.G0), shw.f(n, n2), cwe), 0.0f, 2, (Object)null);
    }
    
    public static final zqg d(final ex ex, final boolean b, final d86 d86) {
        e0e.f((Object)ex, "alignment");
        d86.x(56522820);
        final sa6$b a = sa6.a;
        Objects.requireNonNull(ex.Companion);
        Object a2;
        if (e0e.a((Object)ex, (Object)ex$a.b) && !b) {
            a2 = ob2.a;
        }
        else {
            d86.x(511388516);
            final boolean p3 = d86.P((Object)ex);
            final boolean p4 = d86.P((Object)b);
            final Object y = d86.y();
            Object o = null;
            Label_0128: {
                if (!(p4 | p3)) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o = y) != d86$a.b) {
                        break Label_0128;
                    }
                }
                o = new pb2(b, ex);
                d86.p(o);
            }
            d86.O();
            a2 = o;
        }
        d86.O();
        return (zqg)a2;
    }
}
