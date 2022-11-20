import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class r6d
{
    public static final void a(final hvj hvj, final String s, okh companion, ex f, em6 c, float n, qq4 qq4, final x66 x66, final int n2, final int n3) {
        czd.f((Object)hvj, "painter");
        final x66 h = x66.h(1142754848);
        if ((n3 & 0x4) != 0x0) {
            companion = (okh)okh.Companion;
        }
        if ((n3 & 0x8) != 0x0) {
            Objects.requireNonNull(ex.Companion);
            f = ex.a.f;
        }
        if ((n3 & 0x10) != 0x0) {
            Objects.requireNonNull(em6.Companion);
            c = em6.a.c;
        }
        if ((n3 & 0x20) != 0x0) {
            n = 1.0f;
        }
        if ((n3 & 0x40) != 0x0) {
            qq4 = null;
        }
        final n96$b a = n96.a;
        h.x(-816794123);
        Object o2;
        if (s != null) {
            final okh$a companion2 = okh.Companion;
            h.x(1157296644);
            final boolean p10 = h.P((Object)s);
            final Object y = h.y();
            Object o = null;
            Label_0198: {
                if (!p10) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y) != x66$a.b) {
                        break Label_0198;
                    }
                }
                o = new r6d$c(s);
                h.p(o);
            }
            h.O();
            o2 = oj7.n((okh)companion2, false, (qsb)o);
        }
        else {
            o2 = okh.Companion;
        }
        h.O();
        final okh r0 = xli.r0(rrz.m(companion.E((okh)o2)), hvj, f, c, n, qq4, 2);
        final r6d$a a2 = r6d$a.a;
        h.x(-1323940314);
        final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
        final fve fve = (fve)h.m((wd6)yd6.k);
        final t6x t6x = (t6x)h.m((wd6)yd6.o);
        Objects.requireNonNull(q66.Companion);
        final vve$a b = q66.a.b;
        final itb a3 = ove.a(r0);
        if (h.j() instanceof qr0) {
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)a2, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a3).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2077995625);
            h.O();
            h.O();
            h.r();
            h.O();
            final lxo k = h.k();
            if (k != null) {
                k.a((ftb)new r6d$b(hvj, s, companion, f, c, n, qq4, n2, n3));
            }
            return;
        }
        wd.t();
        throw null;
    }
}
