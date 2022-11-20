import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class o3d
{
    public static final okh a;
    
    static {
        a = kdq.m((okh)okh.Companion, (float)24);
    }
    
    public static final void a(final q8d q8d, final String s, okh companion, final x66 x66, final int n) {
        x66.x(-800853103);
        if ((n & 0x4) != 0x0) {
            companion = (okh)okh.Companion;
        }
        long b;
        if ((n & 0x8) != 0x0) {
            b = nq4.b(((nq4)x66.m((wd6)sk6.a)).a, ((Number)x66.m((wd6)rk6.a)).floatValue());
        }
        else {
            b = 0L;
        }
        final n96$b a = n96.a;
        b(xpw.b(q8d, x66), s, companion, b, x66, 8, 0);
        x66.O();
    }
    
    public static final void b(final hvj hvj, final String s, okh companion, long b, final x66 x66, final int n, final int n2) {
        czd.f((Object)hvj, "painter");
        final x66 h = x66.h(-1142959010);
        if ((n2 & 0x4) != 0x0) {
            companion = (okh)okh.Companion;
        }
        if ((n2 & 0x8) != 0x0) {
            b = nq4.b(((nq4)h.m((wd6)sk6.a)).a, ((Number)h.m((wd6)rk6.a)).floatValue());
        }
        final n96$b a = n96.a;
        Objects.requireNonNull(nq4.Companion);
        qq4 b2;
        if (nq4.c(b, nq4.g)) {
            b2 = null;
        }
        else {
            b2 = qq4$a.b(qq4.Companion, b);
        }
        h.x(1547385429);
        boolean b3 = true;
        Object o2;
        if (s != null) {
            final okh$a companion2 = okh.Companion;
            h.x(1157296644);
            final boolean p7 = h.P((Object)s);
            final Object y = h.y();
            Object o = null;
            Label_0207: {
                if (!p7) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o = y) != x66$a.b) {
                        break Label_0207;
                    }
                }
                o = new o3d$b(s);
                h.p(o);
            }
            h.O();
            o2 = oj7.n((okh)companion2, false, (qsb)o);
        }
        else {
            o2 = okh.Companion;
        }
        h.O();
        czd.f((Object)companion, "<this>");
        final wrd$a a2 = wrd.a;
        final long h2 = hvj.h();
        Objects.requireNonNull(ddq.Companion);
        Object o3 = null;
        Label_0332: {
            if (!ddq.a(h2, ddq.c)) {
                final long h3 = hvj.h();
                if (!Float.isInfinite(ddq.d(h3)) || !Float.isInfinite(ddq.b(h3))) {
                    b3 = false;
                }
                if (!b3) {
                    o3 = okh.Companion;
                    break Label_0332;
                }
            }
            o3 = o3d.a;
        }
        final okh e = companion.E((okh)o3);
        Objects.requireNonNull(em6.Companion);
        bb2.a(xli.r0(e, hvj, (ex)null, (em6)em6.a.c, 0.0f, b2, 22).E((okh)o2), h, 0);
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new o3d$a(hvj, s, companion, b, n, n2));
        }
    }
}
