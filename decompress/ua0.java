import kotlin.NoWhenBranchMatchedException;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ua0
{
    public static final <T> void a(final mzt<T> mzt, final qsb<? super T, Boolean> qsb, final okh okh, final e6a e6a, final nfa nfa, final itb<? super va0, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n) {
        final x66 h = x66.h(808253933);
        int n3;
        if ((n & 0xE) == 0x0) {
            int n2;
            if (h.P((Object)mzt)) {
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
            if (h.P((Object)qsb)) {
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
            if (h.P((Object)e6a)) {
                n9 = 2048;
            }
            else {
                n9 = 1024;
            }
            n8 = (n6 | n9);
        }
        int n10 = n8;
        if ((n & 0xE000) == 0x0) {
            int n11;
            if (h.P((Object)nfa)) {
                n11 = 16384;
            }
            else {
                n11 = 8192;
            }
            n10 = (n8 | n11);
        }
        int n12 = n10;
        if ((0x70000 & n) == 0x0) {
            int n13;
            if (h.P((Object)itb)) {
                n13 = 131072;
            }
            else {
                n13 = 65536;
            }
            n12 = (n10 | n13);
        }
        if ((0x5B6DB & n12) == 0x12492 && h.i()) {
            h.H();
        }
        else {
            final n96$b a = n96.a;
            h.x(1157296644);
            final boolean p8 = h.P((Object)mzt);
            final Object y = h.y();
            puh q = null;
            Label_0382: {
                if (!p8) {
                    Objects.requireNonNull(x66.Companion);
                    if ((q = (puh)y) != x66$a.b) {
                        break Label_0382;
                    }
                }
                q = blz.Q(qsb.invoke(mzt.b()));
                h.p((Object)q);
            }
            h.O();
            final puh puh = q;
            if ((boolean)qsb.invoke(mzt.f()) || (boolean)puh.getValue() || mzt.g()) {
                final int n14 = (n12 & 0xE) | 0x30;
                h.x(1215497572);
                h.x(1157296644);
                final boolean p9 = h.P((Object)mzt);
                final Object y2 = h.y();
                Object o = null;
                Label_0524: {
                    if (!p9) {
                        Objects.requireNonNull(x66.Companion);
                        if ((o = y2) != x66$a.b) {
                            break Label_0524;
                        }
                    }
                    o = mzt.b();
                    h.p(o);
                }
                h.O();
                if (mzt.g()) {
                    o = mzt.b();
                }
                h.x(-1220581778);
                final w4a f = f((mzt)mzt, (qsb)qsb, o, h);
                h.O();
                final Object f2 = mzt.f();
                h.x(-1220581778);
                final w4a f3 = f((mzt)mzt, (qsb)qsb, f2, h);
                h.O();
                final int n15 = (n14 << 6 & 0x1C00) | (n14 & 0xE);
                h.x(-198307638);
                h.x(1157296644);
                final boolean p10 = h.P((Object)mzt);
                final Object y3 = h.y();
                mzt mzt2 = null;
                Label_0727: {
                    if (!p10) {
                        Objects.requireNonNull(x66.Companion);
                        if ((mzt2 = (mzt)y3) != x66$a.b) {
                            break Label_0727;
                        }
                    }
                    mzt2 = new mzt(new ruh((Object)f), ta0.z(new StringBuilder(), mzt.b, " > ", "EnterExitTransition"));
                    h.p((Object)mzt2);
                }
                h.O();
                final mzt mzt3 = mzt2;
                h.x(511388516);
                final boolean p11 = h.P((Object)mzt);
                final boolean p12 = h.P((Object)mzt3);
                final Object y4 = h.y();
                Object o2 = null;
                Label_0828: {
                    if (!(p11 | p12)) {
                        Objects.requireNonNull(x66.Companion);
                        if ((o2 = y4) != x66$a.b) {
                            break Label_0828;
                        }
                    }
                    o2 = new yzt((mzt<Object>)mzt, (mzt<Object>)mzt3);
                    h.p(o2);
                }
                h.O();
                npe.c((Object)mzt3, (qsb)o2, h);
                if (mzt.g()) {
                    mzt3.j((Object)f, (Object)f3, mzt.k);
                }
                else {
                    mzt3.n((Object)f3, h, (n15 >> 3 & 0x8) | (n15 >> 6 & 0xE));
                    mzt3.j.setValue((Object)Boolean.FALSE);
                }
                h.O();
                h.O();
                h.x(511388516);
                final boolean p13 = h.P((Object)mzt3);
                final boolean p14 = h.P((Object)puh);
                final Object y5 = h.y();
                Object o3 = null;
                Label_1010: {
                    if (!(p13 | p14)) {
                        Objects.requireNonNull(x66.Companion);
                        if ((o3 = y5) != x66$a.b) {
                            break Label_1010;
                        }
                    }
                    o3 = new ua0$a(mzt3, puh, (go6)null);
                    h.p(o3);
                }
                h.O();
                npe.e((Object)mzt3, (ftb)o3, h);
                final int n16 = n12 >> 3;
                final int n17 = (n16 & 0xE000) | ((n16 & 0x70) | (n16 & 0x380) | (n16 & 0x1C00));
                h.x(-1967270694);
                final Object b = mzt3.b();
                final w4a e0 = w4a.E0;
                if (b == e0 || mzt3.f() == e0) {
                    h.x(1157296644);
                    final boolean p15 = h.P((Object)mzt3);
                    final Object y6 = h.y();
                    wa0 wa0 = null;
                    Label_1179: {
                        if (!p15) {
                            Objects.requireNonNull(x66.Companion);
                            if ((wa0 = (wa0)y6) != x66$a.b) {
                                break Label_1179;
                            }
                        }
                        wa0 = new wa0((mzt<w4a>)mzt3);
                        h.p((Object)wa0);
                    }
                    h.O();
                    final wa0 wa2 = wa0;
                    final int n18 = n17 >> 3;
                    final aiv a2 = x4a.a;
                    czd.f((Object)e6a, "enter");
                    czd.f((Object)nfa, "exit");
                    h.x(914000546);
                    final okh b2 = w66.b(w66.b((okh)okh.Companion, (itb)new p5a(mzt3, blz.U(e6a.a().b, h), blz.U(nfa.a().b, h))), (itb)new i5a(mzt3, blz.U(e6a.a().c, h), blz.U(nfa.a().c, h)));
                    final int n19 = ((n17 & 0xE) | 0xC00 | (n18 & 0x70) | (n18 & 0x380)) & 0xE;
                    h.x(1157296644);
                    final boolean p16 = h.P((Object)mzt3);
                    final Object y7 = h.y();
                    puh q2 = null;
                    Label_1402: {
                        if (!p16) {
                            Objects.requireNonNull(x66.Companion);
                            if ((q2 = (puh)y7) != x66$a.b) {
                                break Label_1402;
                            }
                        }
                        q2 = blz.Q(Boolean.FALSE);
                        h.p((Object)q2);
                    }
                    h.O();
                    final puh puh2 = q2;
                    h.x(1157296644);
                    final boolean p17 = h.P((Object)mzt3);
                    final Object y8 = h.y();
                    puh q3 = null;
                    Label_1486: {
                        if (!p17) {
                            Objects.requireNonNull(x66.Companion);
                            if ((q3 = (puh)y8) != x66$a.b) {
                                break Label_1486;
                            }
                        }
                        q3 = blz.Q(Boolean.FALSE);
                        h.p((Object)q3);
                    }
                    h.O();
                    final puh puh3 = q3;
                    if (mzt3.b() == mzt3.f() && !mzt3.g()) {
                        final Boolean false = Boolean.FALSE;
                        puh2.setValue((Object)false);
                        puh3.setValue((Object)false);
                    }
                    else {
                        if (e6a.a().a != null || nfa.a().a != null) {
                            puh2.setValue((Object)Boolean.TRUE);
                        }
                        if (e6a.a().d != null || nfa.a().d != null) {
                            puh3.setValue((Object)Boolean.TRUE);
                        }
                    }
                    h.x(1657240746);
                    final boolean booleanValue = (boolean)((m8r)puh2).getValue();
                    final float n20 = 1.0f;
                    Object o4;
                    if (booleanValue) {
                        final b5a b5a = new b5a(e6a, nfa);
                        h.x(-492369756);
                        final Object y9 = h.y();
                        Objects.requireNonNull(x66.Companion);
                        String s;
                        if ((s = (String)y9) == x66$a.b) {
                            s = "Built-in alpha";
                            h.p((Object)"Built-in alpha");
                        }
                        h.O();
                        final String s2 = s;
                        final int n21 = n19 | 0x180;
                        h.x(-1338768149);
                        final aiv a3 = npw.a;
                        final aiv a4 = npw.a;
                        final int n22 = n21 << 3;
                        h.x(-142660079);
                        final w4a w4a = (w4a)mzt3.b();
                        h.x(755689166);
                        final int ordinal = ((Enum)w4a).ordinal();
                        float n23 = 0.0f;
                        Label_1868: {
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    final bqa a5 = nfa.a().a;
                                    if (a5 != null) {
                                        n23 = a5.a;
                                        break Label_1868;
                                    }
                                }
                            }
                            else {
                                final bqa a6 = e6a.a().a;
                                if (a6 != null) {
                                    n23 = a6.a;
                                    break Label_1868;
                                }
                            }
                            n23 = 1.0f;
                        }
                        h.O();
                        final w4a w4a2 = (w4a)mzt3.f();
                        h.x(755689166);
                        final int ordinal2 = ((Enum)w4a2).ordinal();
                        float n24 = 0.0f;
                        Label_1979: {
                            if (ordinal2 != 0) {
                                if (ordinal2 != 1) {
                                    if (ordinal2 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    final bqa a7 = nfa.a().a;
                                    if (a7 != null) {
                                        n24 = a7.a;
                                        break Label_1979;
                                    }
                                }
                            }
                            else {
                                final bqa a8 = e6a.a().a;
                                if (a8 != null) {
                                    n24 = a8.a;
                                    break Label_1979;
                                }
                            }
                            n24 = 1.0f;
                        }
                        h.O();
                        o4 = e0u.b(mzt3, (Object)n23, (Object)n24, (uza)b5a.h0((Object)mzt3.d(), (Object)h, (Object)(((n22 & 0xE000) | ((n21 & 0xE) | (n22 & 0x380) | (n22 & 0x1C00))) >> 3 & 0x70)), (zhv)a4, s2, h);
                        h.O();
                        h.O();
                    }
                    else {
                        o4 = x4a.b;
                    }
                    h.O();
                    okh okh2;
                    if (((m8r)puh3).getValue()) {
                        h.x(1657241646);
                        final c5a c5a = new c5a(e6a, nfa);
                        h.x(-492369756);
                        final Object y10 = h.y();
                        Objects.requireNonNull(x66.Companion);
                        final x66$a$a b3 = x66$a.b;
                        String s3;
                        if ((s3 = (String)y10) == b3) {
                            s3 = "Built-in scale";
                            h.p((Object)"Built-in scale");
                        }
                        h.O();
                        final String s4 = s3;
                        final int n25 = n19 | 0x180;
                        h.x(-1338768149);
                        final aiv a9 = npw.a;
                        final aiv a10 = npw.a;
                        final int n26 = n25 << 3;
                        h.x(-142660079);
                        final w4a w4a3 = (w4a)mzt3.b();
                        h.x(-596129937);
                        final int ordinal3 = ((Enum)w4a3).ordinal();
                        float n27 = 0.0f;
                        Label_2343: {
                            if (ordinal3 != 0) {
                                if (ordinal3 != 1) {
                                    if (ordinal3 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    final kuo d = nfa.a().d;
                                    if (d != null) {
                                        n27 = d.a;
                                        break Label_2343;
                                    }
                                }
                            }
                            else {
                                final kuo d2 = e6a.a().d;
                                if (d2 != null) {
                                    n27 = d2.a;
                                    break Label_2343;
                                }
                            }
                            n27 = 1.0f;
                        }
                        h.O();
                        final w4a w4a4 = (w4a)mzt3.f();
                        h.x(-596129937);
                        final int ordinal4 = ((Enum)w4a4).ordinal();
                        float n28;
                        if (ordinal4 != 0) {
                            n28 = n20;
                            if (ordinal4 != 1) {
                                if (ordinal4 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                final kuo d3 = nfa.a().d;
                                n28 = n20;
                                if (d3 != null) {
                                    n28 = d3.a;
                                }
                            }
                        }
                        else {
                            final kuo d4 = e6a.a().d;
                            n28 = n20;
                            if (d4 != null) {
                                n28 = d4.a;
                            }
                        }
                        h.O();
                        final m8r b4 = e0u.b(mzt3, (Object)n27, (Object)n28, (uza)c5a.h0((Object)mzt3.d(), (Object)h, (Object)(((n25 & 0xE) | (n26 & 0x380) | (n26 & 0x1C00) | (n26 & 0xE000)) >> 3 & 0x70)), (zhv)a10, s4, h);
                        h.O();
                        h.O();
                        vyt vyt = null;
                        Label_2692: {
                            if (mzt3.b() == w4a.D0) {
                                final kuo d5 = e6a.a().d;
                                if (d5 != null) {
                                    vyt = new vyt(d5.b);
                                    break Label_2692;
                                }
                                final kuo d6 = nfa.a().d;
                                if (d6 != null) {
                                    vyt = new vyt(d6.b);
                                    break Label_2692;
                                }
                            }
                            else {
                                final kuo d7 = nfa.a().d;
                                if (d7 != null) {
                                    vyt = new vyt(d7.b);
                                    break Label_2692;
                                }
                                final kuo d8 = e6a.a().d;
                                if (d8 != null) {
                                    vyt = new vyt(d8.b);
                                    break Label_2692;
                                }
                            }
                            vyt = null;
                        }
                        final aiv a11 = x4a.a;
                        h.x(-142660079);
                        final y4a d9 = y4a.D0;
                        final w4a w4a5 = (w4a)mzt3.b();
                        h.x(-288165413);
                        final int ordinal5 = ((Enum)w4a5).ordinal();
                        vyt vyt2 = null;
                        Label_2900: {
                            if (ordinal5 != 0) {
                                if (ordinal5 == 1) {
                                    vyt2 = vyt;
                                    break Label_2900;
                                }
                                if (ordinal5 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                final kuo d10 = nfa.a().d;
                                if (d10 != null) {
                                    vyt2 = new vyt(d10.b);
                                    break Label_2900;
                                }
                                final kuo d11 = e6a.a().d;
                                if (d11 != null) {
                                    vyt2 = new vyt(d11.b);
                                    break Label_2900;
                                }
                            }
                            else {
                                final kuo d12 = e6a.a().d;
                                if (d12 != null) {
                                    vyt2 = new vyt(d12.b);
                                    break Label_2900;
                                }
                                final kuo d13 = nfa.a().d;
                                if (d13 != null) {
                                    vyt2 = new vyt(d13.b);
                                    break Label_2900;
                                }
                            }
                            vyt2 = null;
                        }
                        long n29;
                        if (vyt2 != null) {
                            n29 = vyt2.a;
                        }
                        else {
                            Objects.requireNonNull(vyt.Companion);
                            n29 = vyt.b;
                        }
                        h.O();
                        final vyt vyt3 = new vyt(n29);
                        final w4a w4a6 = (w4a)mzt3.f();
                        h.x(-288165413);
                        final int ordinal6 = ((Enum)w4a6).ordinal();
                        Label_3126: {
                            Label_3123: {
                                if (ordinal6 != 0) {
                                    if (ordinal6 != 1) {
                                        if (ordinal6 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        final kuo d14 = nfa.a().d;
                                        if (d14 != null) {
                                            vyt = new vyt(d14.b);
                                        }
                                        else {
                                            final kuo d15 = e6a.a().d;
                                            if (d15 == null) {
                                                break Label_3123;
                                            }
                                            vyt = new vyt(d15.b);
                                        }
                                    }
                                }
                                else {
                                    final kuo d16 = e6a.a().d;
                                    if (d16 != null) {
                                        vyt = new vyt(d16.b);
                                    }
                                    else {
                                        final kuo d17 = nfa.a().d;
                                        if (d17 == null) {
                                            break Label_3123;
                                        }
                                        vyt = new vyt(d17.b);
                                    }
                                }
                                break Label_3126;
                            }
                            vyt = null;
                        }
                        long n30;
                        if (vyt != null) {
                            n30 = vyt.a;
                        }
                        else {
                            Objects.requireNonNull(vyt.Companion);
                            n30 = vyt.b;
                        }
                        h.O();
                        final m8r b5 = e0u.b(mzt3, (Object)vyt3, (Object)new vyt(n30), (uza)d9.h0((Object)mzt3.d(), (Object)h, (Object)((n19 | 0xC40) >> 3 & 0x70)), (zhv)a11, "TransformOriginInterruptionHandling", h);
                        h.O();
                        h.x(1618982084);
                        final boolean p18 = h.P(o4);
                        final boolean p19 = h.P((Object)b4);
                        final boolean p20 = h.P((Object)b5);
                        final Object y11 = h.y();
                        Object o5;
                        if ((p18 | p19 | p20) || (o5 = y11) == b3) {
                            o5 = new z4a((m8r<Float>)o4, (m8r<Float>)b4, (m8r<vyt>)b5);
                            h.p(o5);
                        }
                        h.O();
                        okh2 = wj1.n(b2, (qsb)o5);
                        h.O();
                    }
                    else if (((m8r)puh2).getValue()) {
                        h.x(1657243735);
                        h.x(1157296644);
                        final boolean p21 = h.P(o4);
                        final Object y12 = h.y();
                        Object o6 = null;
                        Label_3447: {
                            if (!p21) {
                                Objects.requireNonNull(x66.Companion);
                                if ((o6 = y12) != x66$a.b) {
                                    break Label_3447;
                                }
                            }
                            o6 = new a5a((m8r)o4);
                            h.p(o6);
                        }
                        h.O();
                        okh2 = wj1.n(b2, (qsb)o6);
                        h.O();
                    }
                    else {
                        h.x(1657243827);
                        h.O();
                        okh2 = b2;
                    }
                    h.O();
                    final okh e2 = okh.E(okh2);
                    h.x(-492369756);
                    final Object y13 = h.y();
                    Objects.requireNonNull(x66.Companion);
                    Object o7 = y13;
                    if (y13 == x66$a.b) {
                        o7 = new p90(wa2);
                        h.p(o7);
                    }
                    h.O();
                    final fqg fqg = (fqg)o7;
                    h.x(-1323940314);
                    final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
                    final fve fve = (fve)h.m((wd6)yd6.k);
                    final t6x t6x = (t6x)h.m((wd6)yd6.o);
                    Objects.requireNonNull(q66.Companion);
                    final vve$a b6 = q66.a.b;
                    final itb a12 = ove.a(e2);
                    if (!(h.j() instanceof qr0)) {
                        wd.t();
                        throw null;
                    }
                    h.E();
                    if (h.f()) {
                        h.A((nsb)b6);
                    }
                    else {
                        h.o();
                    }
                    h.F();
                    mru.p(h, (Object)fqg, (ftb)q66.a.e);
                    mru.p(h, (Object)lo8, (ftb)q66.a.d);
                    mru.p(h, (Object)fve, (ftb)q66.a.f);
                    ((t26)a12).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)0);
                    h.x(2058660585);
                    h.x(1797450476);
                    itb.h0((Object)wa2, (Object)h, (Object)((n17 >> 9 & 0x70) | 0x8));
                    h.O();
                    h.O();
                    h.r();
                    h.O();
                }
                h.O();
            }
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ua0$b((mzt)mzt, (qsb)qsb, okh, e6a, nfa, (itb)itb, n));
        }
    }
    
    public static final void b(final pr4 pr4, final boolean b, okh companion, e6a b2, nfa b3, String s, final itb<? super va0, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)pr4, "<this>");
        czd.f((Object)itb, "content");
        final x66 h = x66.h(1766503102);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x30);
        }
        else if ((n & 0x70) == 0x0) {
            int n4;
            if (h.a(b)) {
                n4 = 32;
            }
            else {
                n4 = 16;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0161: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x180);
            }
            else {
                n6 = n3;
                if ((n & 0x380) == 0x0) {
                    int n7;
                    if (h.P((Object)companion)) {
                        n7 = 256;
                    }
                    else {
                        n7 = 128;
                    }
                    n8 = (n3 | n7);
                    break Label_0161;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0234: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0xC00);
            }
            else {
                n10 = n8;
                if ((n & 0x1C00) == 0x0) {
                    int n11;
                    if (h.P((Object)b2)) {
                        n11 = 2048;
                    }
                    else {
                        n11 = 1024;
                    }
                    n12 = (n8 | n11);
                    break Label_0234;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0308: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0x6000);
            }
            else {
                n14 = n12;
                if ((n & 0xE000) == 0x0) {
                    int n15;
                    if (h.P((Object)b3)) {
                        n15 = 16384;
                    }
                    else {
                        n15 = 8192;
                    }
                    n16 = (n12 | n15);
                    break Label_0308;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0380: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x30000);
            }
            else {
                n18 = n16;
                if ((n & 0x70000) == 0x0) {
                    int n19;
                    if (h.P((Object)s)) {
                        n19 = 131072;
                    }
                    else {
                        n19 = 65536;
                    }
                    n20 = (n16 | n19);
                    break Label_0380;
                }
            }
            n20 = n18;
        }
        int n22 = 0;
        Label_0441: {
            int n21;
            if ((n2 & 0x20) != 0x0) {
                n21 = 1572864;
            }
            else {
                n22 = n20;
                if ((n & 0x380000) != 0x0) {
                    break Label_0441;
                }
                if (h.P((Object)itb)) {
                    n21 = 1048576;
                }
                else {
                    n21 = 524288;
                }
            }
            n22 = (n20 | n21);
        }
        e6a e6a;
        String s3;
        if ((n22 & 0x2DB6D1) == 0x92490 && h.i()) {
            h.H();
            final String s2 = s;
            e6a = b2;
            s3 = s2;
        }
        else {
            if (n5 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n9 != 0) {
                b2 = x4a.d((uza)null, 3).b(x4a.c());
            }
            if (n13 != 0) {
                b3 = x4a.e((uza)null, 3).b(x4a.j());
            }
            if (n17 != 0) {
                s = "AnimatedVisibility";
            }
            final n96$b a = n96.a;
            final int n23 = n22 >> 3;
            a((mzt<Object>)e0u.c((Object)b, s, h, (n23 & 0xE) | (n22 >> 12 & 0x70), 0), (qsb<? super Object, Boolean>)ua0$h.D0, companion, b2, b3, itb, h, (n22 & 0xE000) | ((n22 & 0x380) | 0x30 | (n22 & 0x1C00)) | (n23 & 0x70000));
            final String s4 = s;
            e6a = b2;
            s3 = s4;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ua0$i(pr4, b, companion, e6a, b3, s3, (itb)itb, n, n2));
        }
    }
    
    public static final void c(final wlo wlo, final boolean b, okh companion, e6a b2, nfa b3, String s, final itb<? super va0, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)wlo, "<this>");
        czd.f((Object)itb, "content");
        final x66 h = x66.h(-1741346906);
        int n3;
        if ((n2 & 0x1) != 0x0) {
            n3 = (n | 0x30);
        }
        else if ((n & 0x70) == 0x0) {
            int n4;
            if (h.a(b)) {
                n4 = 32;
            }
            else {
                n4 = 16;
            }
            n3 = (n4 | n);
        }
        else {
            n3 = n;
        }
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0161: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x180);
            }
            else {
                n6 = n3;
                if ((n & 0x380) == 0x0) {
                    int n7;
                    if (h.P((Object)companion)) {
                        n7 = 256;
                    }
                    else {
                        n7 = 128;
                    }
                    n8 = (n3 | n7);
                    break Label_0161;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0234: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0xC00);
            }
            else {
                n10 = n8;
                if ((n & 0x1C00) == 0x0) {
                    int n11;
                    if (h.P((Object)b2)) {
                        n11 = 2048;
                    }
                    else {
                        n11 = 1024;
                    }
                    n12 = (n8 | n11);
                    break Label_0234;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0308: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0x6000);
            }
            else {
                n14 = n12;
                if ((n & 0xE000) == 0x0) {
                    int n15;
                    if (h.P((Object)b3)) {
                        n15 = 16384;
                    }
                    else {
                        n15 = 8192;
                    }
                    n16 = (n12 | n15);
                    break Label_0308;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0380: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x30000);
            }
            else {
                n18 = n16;
                if ((n & 0x70000) == 0x0) {
                    int n19;
                    if (h.P((Object)s)) {
                        n19 = 131072;
                    }
                    else {
                        n19 = 65536;
                    }
                    n20 = (n16 | n19);
                    break Label_0380;
                }
            }
            n20 = n18;
        }
        int n22 = 0;
        Label_0441: {
            int n21;
            if ((n2 & 0x20) != 0x0) {
                n21 = 1572864;
            }
            else {
                n22 = n20;
                if ((n & 0x380000) != 0x0) {
                    break Label_0441;
                }
                if (h.P((Object)itb)) {
                    n21 = 1048576;
                }
                else {
                    n21 = 524288;
                }
            }
            n22 = (n20 | n21);
        }
        e6a e6a;
        String s3;
        if ((n22 & 0x2DB6D1) == 0x92490 && h.i()) {
            h.H();
            final String s2 = s;
            e6a = b2;
            s3 = s2;
        }
        else {
            if (n5 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n9 != 0) {
                final e6a d = x4a.d((uza)null, 3);
                final o4r m0 = rp9.M0(400.0f, new ltd(uex.b(ltd.Companion)), 1);
                Objects.requireNonNull(ex.Companion);
                final bw1.a p10 = ex.a.p;
                final d5a d2 = d5a.D0;
                czd.f((Object)d2, "initialWidth");
                b2 = d.b(x4a.a((uza)m0, x4a.m((ex.b)p10), true, (qsb)new e5a((qsb)d2)));
            }
            if (n13 != 0) {
                final nfa e = x4a.e((uza)null, 3);
                final o4r m2 = rp9.M0(400.0f, new ltd(uex.b(ltd.Companion)), 1);
                Objects.requireNonNull(ex.Companion);
                final bw1.a p11 = ex.a.p;
                final j5a d3 = j5a.D0;
                czd.f((Object)d3, "targetWidth");
                b3 = e.b(x4a.h((uza)m2, x4a.m((ex.b)p11), true, (qsb)new k5a((qsb)d3)));
            }
            if (n17 != 0) {
                s = "AnimatedVisibility";
            }
            final n96$b a = n96.a;
            final int n23 = n22 >> 3;
            a((mzt<Object>)e0u.c((Object)b, s, h, (n23 & 0xE) | (n22 >> 12 & 0x70), 0), (qsb<? super Object, Boolean>)ua0$f.D0, companion, b2, b3, itb, h, (n22 & 0xE000) | ((n22 & 0x380) | 0x30 | (n22 & 0x1C00)) | (n23 & 0x70000));
            final e6a e6a2 = b2;
            s3 = s;
            e6a = e6a2;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ua0$g(wlo, b, companion, e6a, b3, s3, (itb)itb, n, n2));
        }
    }
    
    public static final <T> void d(final mzt<T> mzt, final qsb<? super T, Boolean> qsb, okh companion, e6a b, nfa b2, final itb<? super va0, ? super x66, ? super Integer, fzv> itb, final x66 x66, final int n, final int n2) {
        czd.f((Object)mzt, "<this>");
        czd.f((Object)qsb, "visible");
        czd.f((Object)itb, "content");
        final x66 h = x66.h(1031950689);
        int n3;
        if ((n2 & Integer.MIN_VALUE) != 0x0) {
            n3 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n4;
            if (h.P((Object)mzt)) {
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
        if ((n2 & 0x1) != 0x0) {
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
        final int n7 = n2 & 0x2;
        int n10 = 0;
        Label_0226: {
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
                    break Label_0226;
                }
            }
            n10 = n8;
        }
        final int n11 = n2 & 0x4;
        int n14 = 0;
        Label_0299: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n & 0x1C00) == 0x0) {
                    int n13;
                    if (h.P((Object)b)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0299;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x8;
        int n18 = 0;
        Label_0373: {
            int n16;
            if (n15 != 0) {
                n16 = (n14 | 0x6000);
            }
            else {
                n16 = n14;
                if ((n & 0xE000) == 0x0) {
                    int n17;
                    if (h.P((Object)b2)) {
                        n17 = 16384;
                    }
                    else {
                        n17 = 8192;
                    }
                    n18 = (n14 | n17);
                    break Label_0373;
                }
            }
            n18 = n16;
        }
        int n20 = 0;
        Label_0431: {
            int n19;
            if ((n2 & 0x10) != 0x0) {
                n19 = 196608;
            }
            else {
                n20 = n18;
                if ((n & 0x70000) != 0x0) {
                    break Label_0431;
                }
                if (h.P((Object)itb)) {
                    n19 = 131072;
                }
                else {
                    n19 = 65536;
                }
            }
            n20 = (n18 | n19);
        }
        e6a e6a;
        nfa nfa2;
        if ((0x5B6DB & n20) == 0x12492 && h.i()) {
            h.H();
            final nfa nfa = b2;
            e6a = b;
            nfa2 = nfa;
        }
        else {
            if (n7 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n11 != 0) {
                b = x4a.d((uza)null, 3).b(x4a.b((ex)null, 15));
            }
            if (n15 != 0) {
                b2 = x4a.i((ex)null, 15).b(x4a.e((uza)null, 3));
            }
            final n96$b a = n96.a;
            a((mzt<Object>)mzt, (qsb<? super Object, Boolean>)qsb, companion, b, b2, itb, h, (n20 & 0xE) | (n20 & 0x70) | (n20 & 0x380) | (n20 & 0x1C00) | (n20 & 0xE000) | (n20 & 0x70000));
            final nfa nfa3 = b2;
            e6a = b;
            nfa2 = nfa3;
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ua0$c((mzt)mzt, (qsb)qsb, companion, e6a, nfa2, (itb)itb, n, n2));
        }
    }
    
    public static final void e(final boolean b, okh companion, e6a b2, nfa b3, String s, final itb<? super va0, ? super x66, ? super Integer, fzv> itb, x66 h, final int n, final int n2) {
        czd.f((Object)itb, "content");
        h = h.h(2088733774);
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
        final int n5 = n2 & 0x2;
        int n8 = 0;
        Label_0148: {
            int n6;
            if (n5 != 0) {
                n6 = (n3 | 0x30);
            }
            else {
                n6 = n3;
                if ((n & 0x70) == 0x0) {
                    int n7;
                    if (h.P((Object)companion)) {
                        n7 = 32;
                    }
                    else {
                        n7 = 16;
                    }
                    n8 = (n3 | n7);
                    break Label_0148;
                }
            }
            n8 = n6;
        }
        final int n9 = n2 & 0x4;
        int n12 = 0;
        Label_0221: {
            int n10;
            if (n9 != 0) {
                n10 = (n8 | 0x180);
            }
            else {
                n10 = n8;
                if ((n & 0x380) == 0x0) {
                    int n11;
                    if (h.P((Object)b2)) {
                        n11 = 256;
                    }
                    else {
                        n11 = 128;
                    }
                    n12 = (n8 | n11);
                    break Label_0221;
                }
            }
            n12 = n10;
        }
        final int n13 = n2 & 0x8;
        int n16 = 0;
        Label_0295: {
            int n14;
            if (n13 != 0) {
                n14 = (n12 | 0xC00);
            }
            else {
                n14 = n12;
                if ((n & 0x1C00) == 0x0) {
                    int n15;
                    if (h.P((Object)b3)) {
                        n15 = 2048;
                    }
                    else {
                        n15 = 1024;
                    }
                    n16 = (n12 | n15);
                    break Label_0295;
                }
            }
            n16 = n14;
        }
        final int n17 = n2 & 0x10;
        int n20 = 0;
        Label_0369: {
            int n18;
            if (n17 != 0) {
                n18 = (n16 | 0x6000);
            }
            else {
                n18 = n16;
                if ((n & 0xE000) == 0x0) {
                    int n19;
                    if (h.P((Object)s)) {
                        n19 = 16384;
                    }
                    else {
                        n19 = 8192;
                    }
                    n20 = (n16 | n19);
                    break Label_0369;
                }
            }
            n20 = n18;
        }
        int n22 = 0;
        Label_0427: {
            int n21;
            if ((n2 & 0x20) != 0x0) {
                n21 = 196608;
            }
            else {
                n22 = n20;
                if ((n & 0x70000) != 0x0) {
                    break Label_0427;
                }
                if (h.P((Object)itb)) {
                    n21 = 131072;
                }
                else {
                    n21 = 65536;
                }
            }
            n22 = (n20 | n21);
        }
        if ((0x5B6DB & n22) == 0x12492 && h.i()) {
            h.H();
        }
        else {
            if (n5 != 0) {
                companion = (okh)okh.Companion;
            }
            if (n9 != 0) {
                b2 = x4a.d((uza)null, 3).b(x4a.b((ex)null, 15));
            }
            if (n13 != 0) {
                b3 = x4a.i((ex)null, 15).b(x4a.e((uza)null, 3));
            }
            if (n17 != 0) {
                s = "AnimatedVisibility";
            }
            final n96$b a = n96.a;
            final mzt c = e0u.c((Object)b, s, h, (n22 & 0xE) | (n22 >> 9 & 0x70), 0);
            final ua0$d d0 = ua0$d.D0;
            final int n23 = n22 << 3;
            a((mzt<Object>)c, (qsb<? super Object, Boolean>)d0, companion, b2, b3, itb, h, (n23 & 0xE000) | ((n23 & 0x380) | 0x30 | (n23 & 0x1C00)) | (n22 & 0x70000));
        }
        final lxo k = h.k();
        if (k != null) {
            k.a((ftb)new ua0$e(b, companion, b2, b3, s, (itb)itb, n, n2));
        }
    }
    
    public static final <T> w4a f(final mzt<T> mzt, final qsb<? super T, Boolean> qsb, final T t, final x66 x66, final int n) {
        final w4a f0 = w4a.F0;
        final w4a d0 = w4a.D0;
        final w4a e0 = w4a.E0;
        x66.x(361571134);
        final n96$b a = n96.a;
        x66.D(-721837504, (Object)mzt);
        w4a w4a = null;
        Label_0231: {
            Label_0228: {
                if (mzt.g()) {
                    if (!(boolean)qsb.invoke((Object)t)) {
                        if (qsb.invoke(mzt.b())) {
                            w4a = f0;
                            break Label_0231;
                        }
                        break Label_0228;
                    }
                }
                else {
                    x66.x(-492369756);
                    final Object y = x66.y();
                    Objects.requireNonNull(x66.Companion);
                    puh q;
                    if ((q = (puh)y) == x66$a.b) {
                        q = blz.Q(Boolean.FALSE);
                        x66.p((Object)q);
                    }
                    x66.O();
                    final puh puh = q;
                    if (qsb.invoke(mzt.b())) {
                        puh.setValue((Object)Boolean.TRUE);
                    }
                    if (!(boolean)qsb.invoke((Object)t)) {
                        if (puh.getValue()) {
                            w4a = f0;
                            break Label_0231;
                        }
                        break Label_0228;
                    }
                }
                w4a = e0;
                break Label_0231;
            }
            w4a = d0;
        }
        x66.N();
        x66.O();
        return w4a;
    }
}
