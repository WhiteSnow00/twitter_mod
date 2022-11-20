import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class h74
{
    public static final float a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    
    static {
        a = 24;
        final float n = b = 2;
        c = 20;
        d = n;
        e = n;
    }
    
    public static final void a(final boolean b, final qsb<? super Boolean, fzv> qsb, okh companion, boolean b2, sth sth, e74 f, final x66 x66, final int n, final int n2) {
        final x66 h = x66.h(-2118660998);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.a(b)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (h.P((Object)qsb)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0201: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x180);
            }
            else {
                n8 = n5;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (h.P((Object)companion)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n5 | n9);
                    break Label_0201;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0275: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (h.a(b2)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0275;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0349: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((n & 0xE000) == 0x0) {
                    int n17;
                    if (h.P((Object)sth)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0349;
                }
            }
            n18 = n16;
        }
        if ((n & 0x70000) == 0x0) {
            int n19;
            if ((n2 & 0x20) == 0x0 && h.P((Object)f)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 |= n19;
        }
        sth sth2;
        e74 e75;
        if ((0x5B6DB & n18) == 0x12492 && h.i()) {
            h.H();
            final e74 e74 = f;
            sth2 = sth;
            e75 = e74;
        }
        else {
            h.C();
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n20 = n18;
                if ((n2 & 0x20) != 0x0) {
                    n20 = (n18 & 0xFFF8FFFF);
                }
                n18 = n20;
            }
            else {
                if (n7 != 0) {
                    companion = (okh)okh.Companion;
                }
                if (n11 != 0) {
                    b2 = true;
                }
                if (n15 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(x66.Companion);
                    Object f2;
                    if ((f2 = y) == x66$a.b) {
                        f2 = h91.f(h);
                    }
                    h.O();
                    sth = (sth)f2;
                }
                if ((n2 & 0x20) != 0x0) {
                    f = ffz.F(0L, 0L, h, 31);
                    n18 &= 0xFFF8FFFF;
                }
            }
            h.s();
            final n96$b a = n96.a;
            ght ght;
            if (b) {
                ght = ght.D0;
            }
            else {
                ght = ght.E0;
            }
            h.x(1433125990);
            nsb nsb;
            if (qsb != null) {
                h.x(511388516);
                final boolean p9 = h.P((Object)qsb);
                final boolean p10 = h.P((Object)b);
                final Object y2 = h.y();
                Object o = null;
                Label_0750: {
                    if (!(p10 | p9)) {
                        Objects.requireNonNull(x66.Companion);
                        if ((o = y2) != x66$a.b) {
                            break Label_0750;
                        }
                    }
                    o = new h74$a((qsb)qsb, b);
                    h.p(o);
                }
                h.O();
                nsb = (nsb)o;
            }
            else {
                nsb = null;
            }
            h.O();
            c(ght, (nsb<fzv>)nsb, companion, b2, sth, f, h, (n18 & 0x380) | (n18 & 0x1C00) | (n18 & 0xE000) | (n18 & 0x70000), 0);
            final sth sth3 = sth;
            e75 = f;
            sth2 = sth3;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new h74$b(b, (qsb)qsb, companion, b2, sth2, e75, n, n2));
        }
    }
    
    public static final void b(final boolean b, final ght ght, final okh okh, final e74 e74, final x66 x66, final int n) {
        final x66 h = x66.h(-2118895727);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.a(b)) {
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
        int n4 = n3;
        if ((n & 0x70) == 0x0) {
            int n5;
            if (h.P((Object)ght)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        int n6 = n4;
        if ((n & 0x380) == 0x0) {
            int n7;
            if (h.P((Object)okh)) {
                n7 = 256;
            }
            else {
                n7 = 128;
            }
            n6 = (n4 | n7);
        }
        int n8 = n6;
        if ((n & 0x1C00) == 0x0) {
            int n9;
            if (h.P((Object)e74)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        if ((n8 & 0x16DB) == 0x492 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            final mzt c = e0u.c((Object)ght, (String)null, h, n8 >> 3 & 0xE, 2);
            final h74$f d0 = h74$f.D0;
            h.x(1399891485);
            final aiv a2 = npw.a;
            final aiv a3 = npw.a;
            h.x(1847725064);
            final ght ght2 = (ght)c.b();
            h.x(-1798345588);
            final int ordinal = ((Enum)ght2).ordinal();
            final float n10 = 1.0f;
            float n11 = 0.0f;
            Label_0338: {
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        n11 = 0.0f;
                        break Label_0338;
                    }
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n11 = 1.0f;
            }
            h.O();
            final ght ght3 = (ght)c.f();
            h.x(-1798345588);
            final int ordinal2 = ((Enum)ght3).ordinal();
            float n12 = 0.0f;
            Label_0408: {
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        n12 = 0.0f;
                        break Label_0408;
                    }
                    if (ordinal2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n12 = 1.0f;
            }
            h.O();
            final m8r b2 = e0u.b(c, (Object)n11, (Object)n12, (uza)d0.h0((Object)c.d(), (Object)h, (Object)0), (zhv)a3, "FloatAnimation", h);
            h.O();
            h.O();
            final h74$e d2 = h74$e.D0;
            h.x(1399891485);
            h.x(1847725064);
            final ght ght4 = (ght)c.b();
            h.x(-2098942571);
            final int ordinal3 = ((Enum)ght4).ordinal();
            float n13;
            if (ordinal3 != 0 && ordinal3 != 1) {
                if (ordinal3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n13 = 1.0f;
            }
            else {
                n13 = 0.0f;
            }
            h.O();
            final ght ght5 = (ght)c.f();
            h.x(-2098942571);
            final int ordinal4 = ((Enum)ght5).ordinal();
            float n14;
            if (ordinal4 != 0 && ordinal4 != 1) {
                if (ordinal4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                n14 = n10;
            }
            else {
                n14 = 0.0f;
            }
            h.O();
            final m8r b3 = e0u.b(c, (Object)n13, (Object)n14, (uza)d2.h0((Object)c.d(), (Object)h, (Object)0), (zhv)a3, "FloatAnimation", h);
            h.O();
            h.O();
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(x66.Companion);
            Object o = y;
            if (y == x66$a.b) {
                o = new b64((lzj)null, (tzj)null, (lzj)null, 7, (rf8)null);
                h.p(o);
            }
            h.O();
            final b64 b4 = (b64)o;
            final m8r c2 = e74.c(ght, h);
            final m8r b5 = e74.b(b, ght, h);
            final m8r a4 = e74.a(b, ght, h);
            Objects.requireNonNull(ex.Companion);
            final okh l = kdq.l(kdq.u(okh, (ex)ex.a.f, 2), h74.c);
            h.x(-568225417);
            boolean b6 = false;
            for (int i = 0; i < 6; ++i) {
                b6 |= h.P((new Object[] { b5, a4, c2, b2, b3, b4 })[i]);
            }
            final Object y2 = h.y();
            Object o2 = null;
            Label_0960: {
                if (!b6) {
                    Objects.requireNonNull(x66.Companion);
                    if ((o2 = y2) != x66$a.b) {
                        break Label_0960;
                    }
                }
                o2 = new h74$c(b4, b5, a4, c2, b2, b3);
                h.p(o2);
            }
            h.O();
            eg3.a(l, (qsb)o2, h, 0);
            final n96$b a5 = n96.a;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new h74$d(b, ght, okh, e74, n));
        }
    }
    
    public static final void c(final ght ght, final nsb<fzv> nsb, okh companion, boolean b, sth sth, final e74 e74, final x66 x66, final int n, final int n2) {
        czd.f((Object)ght, "state");
        final x66 h = x66.h(2031255194);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)ght)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        int n5;
        if ((n2 & 0x2) != 0x0) {
            n5 = (n3 | 0x30);
        }
        else {
            n5 = n3;
            if ((n & 0x70) == 0x0) {
                int n6;
                if (h.P((Object)nsb)) {
                    n6 = 32;
                }
                else {
                    n6 = 16;
                }
                n5 = (n3 | n6);
            }
        }
        final int n7 = n2 & 0x4;
        int n10 = 0;
        Label_0209: {
            int n8;
            if (n7 != 0) {
                n8 = (n5 | 0x180);
            }
            else {
                n8 = n5;
                if ((n & 0x380) == 0x0) {
                    int n9;
                    if (h.P((Object)companion)) {
                        n9 = 256;
                    }
                    else {
                        n9 = 128;
                    }
                    n10 = (n5 | n9);
                    break Label_0209;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x8;
        int n14 = 0;
        Label_0283: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (h.a(b)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0283;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        int n18 = 0;
        Label_0357: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((0xE000 & n) == 0x0) {
                    int n17;
                    if (h.P((Object)sth)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0357;
                }
            }
            n18 = n16;
        }
        if ((0x70000 & n) == 0x0) {
            int n19;
            if ((n2 & 0x20) == 0x0 && h.P((Object)e74)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 |= n19;
        }
        sth sth2;
        e74 e75;
        if ((0x5B6DB & n18) == 0x12492 && h.i()) {
            h.H();
            sth2 = sth;
            e75 = e74;
        }
        else {
            h.C();
            e74 e76;
            okh okh2;
            if ((n & 0x1) != 0x0 && !h.K()) {
                h.H();
                int n20 = n18;
                if ((n2 & 0x20) != 0x0) {
                    n20 = (n18 & 0xFFF8FFFF);
                }
                final okh okh = companion;
                e76 = e74;
                n18 = n20;
                okh2 = okh;
            }
            else {
                if (n7 != 0) {
                    companion = (okh)okh.Companion;
                }
                if (n11 != 0) {
                    b = true;
                }
                if (n15 != 0) {
                    h.x(-492369756);
                    final Object y = h.y();
                    Objects.requireNonNull(x66.Companion);
                    Object f;
                    if ((f = y) == x66$a.b) {
                        f = h91.f(h);
                    }
                    h.O();
                    sth = (sth)f;
                }
                if ((n2 & 0x20) != 0x0) {
                    final e74 f2 = ffz.F(0L, 0L, h, 31);
                    n18 &= 0xFFF8FFFF;
                    okh2 = companion;
                    e76 = f2;
                }
                else {
                    okh2 = companion;
                    e76 = e74;
                }
            }
            h.s();
            final n96$b a = n96.a;
            h.x(-1517549514);
            Object o;
            if (nsb != null) {
                final okh$a companion2 = okh.Companion;
                Objects.requireNonNull(d0n.Companion);
                o = fht.c((okh)companion2, ght, sth, yzm.a(false, h74.a, 0L, h, 54, 4), b, new d0n(1), nsb);
            }
            else {
                o = okh.Companion;
            }
            h.O();
            okh okh3;
            final okh$a okh$a = (okh$a)(okh3 = (okh)okh.Companion);
            if (nsb != null) {
                okh3 = lut.a((okh)okh$a);
            }
            b(b, ght, nza.C1(okh2.E(okh3).E((okh)o), h74.b), e76, h, (n18 >> 9 & 0xE) | (n18 << 3 & 0x70) | (n18 >> 6 & 0x1C00));
            sth2 = sth;
            e75 = e76;
            companion = okh2;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new h74$g(ght, (nsb)nsb, companion, b, sth2, e75, n, n2));
        }
    }
}
