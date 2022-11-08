import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j4d
{
    public static final jkh a;
    
    static {
        a = tcq.m(jkh.Companion, 24);
    }
    
    public static final void a(final m9d m9d, final String s, jkh companion, final m76 m76, final int n) {
        m76.x(-800853103);
        if ((n & 0x4) != 0x0) {
            companion = jkh.Companion;
        }
        long b;
        if ((n & 0x8) != 0x0) {
            b = pr4.b(((pr4)m76.m((re6)ll6.a)).a, ((Number)m76.m((re6)kl6.a)).floatValue());
        }
        else {
            b = 0L;
        }
        final ea6$b a = ea6.a;
        b((cvj)cpw.b(m9d, m76), s, companion, b, m76, 8, 0);
        m76.O();
    }
    
    public static final void b(final cvj cvj, final String s, jkh companion, long b, final m76 m76, final int n, final int n2) {
        zzd.f((Object)cvj, "painter");
        final m76 h = m76.h(-1142959010);
        if ((n2 & 0x4) != 0x0) {
            companion = jkh.Companion;
        }
        if ((n2 & 0x8) != 0x0) {
            b = pr4.b(((pr4)h.m((re6)ll6.a)).a, ((Number)h.m((re6)kl6.a)).floatValue());
        }
        final ea6$b a = ea6.a;
        Objects.requireNonNull(pr4.Companion);
        sr4 b2;
        if (pr4.c(b, pr4.g)) {
            b2 = null;
        }
        else {
            b2 = sr4$a.b(sr4.Companion, b);
        }
        h.x(1547385429);
        boolean b3 = true;
        jkh jkh;
        if (s != null) {
            final jkh.a companion2 = jkh.Companion;
            h.x(1157296644);
            final boolean p7 = h.P((Object)s);
            final Object y = h.y();
            Object o = null;
            Label_0207: {
                if (!p7) {
                    Objects.requireNonNull(m76.Companion);
                    if ((o = y) != m76$a.b) {
                        break Label_0207;
                    }
                }
                o = new j4d$b(s);
                h.p(o);
            }
            h.O();
            jkh = x3j.K((jkh)companion2, false, (rtb)o);
        }
        else {
            jkh = jkh.Companion;
        }
        h.O();
        zzd.f((Object)companion, "<this>");
        final ssd$a a2 = ssd.a;
        final long h2 = cvj.h();
        Objects.requireNonNull(mcq.Companion);
        jkh jkh2 = null;
        Label_0332: {
            if (!mcq.a(h2, mcq.c)) {
                final long h3 = cvj.h();
                if (!Float.isInfinite(mcq.d(h3)) || !Float.isInfinite(mcq.b(h3))) {
                    b3 = false;
                }
                if (!b3) {
                    jkh2 = jkh.Companion;
                    break Label_0332;
                }
            }
            jkh2 = j4d.a;
        }
        final jkh e = companion.E(jkh2);
        Objects.requireNonNull(ym6.Companion);
        ib2.a(xd.I(e, cvj, (dx)null, (ym6)ym6$a.c, 0.0f, b2, 22).E(jkh), h, 0);
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new j4d$a(cvj, s, companion, b, n, n2));
        }
    }
}
