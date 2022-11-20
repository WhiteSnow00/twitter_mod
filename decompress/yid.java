import java.util.List;
import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yid
{
    public static final void a(final qo7 qo7, final String s, final int n, final String s2, final CharSequence charSequence, final String s3, final nsb<fzv> nsb, final nsb<fzv> nsb2, final nsb<fzv> nsb3, final nsb<fzv> nsb4, okh companion, final x66 x66, final int n2, final int n3, final int n4) {
        czd.f((Object)qo7, "dmInboxItem");
        czd.f((Object)s, "conversationTitle");
        czd.f((Object)charSequence, "previewText");
        czd.f((Object)nsb, "onClickAvatar");
        czd.f((Object)nsb2, "onClickContent");
        czd.f((Object)nsb3, "onLongClickContent");
        czd.f((Object)nsb4, "onClickDeleteRequest");
        final x66 h = x66.h(-1299348865);
        if ((n4 & 0x400) != 0x0) {
            companion = (okh)okh.Companion;
        }
        final n96$b a = n96.a;
        final eoc a2 = eoc.a;
        final long v = eoc.v;
        final iar a3 = ipc.a;
        final long h2 = s9i.h(v, ((dpc)h.m((wd6)a3)).j(), ((dpc)h.m((wd6)a3)).j(), h);
        int n5;
        if (qo7.g) {
            n5 = 2131953536;
        }
        else {
            n5 = 2131953537;
        }
        final String a4 = wd.A(n5, h);
        final String a5 = wd.A(2131953225, h);
        h.x(1157296644);
        final boolean p15 = h.P((Object)nsb);
        final Object y = h.y();
        Object o = null;
        Label_0243: {
            if (!p15) {
                Objects.requireNonNull(x66.Companion);
                if ((o = y) != x66$a.b) {
                    break Label_0243;
                }
            }
            o = new yid$c((nsb)nsb);
            h.p(o);
        }
        h.O();
        final n97 n6 = new n97(a4, (nsb)o);
        h.x(1157296644);
        final boolean p16 = h.P((Object)nsb4);
        final Object y2 = h.y();
        Object o2 = null;
        Label_0339: {
            if (!p16) {
                Objects.requireNonNull(x66.Companion);
                if ((o2 = y2) != x66$a.b) {
                    break Label_0339;
                }
            }
            o2 = new yid$d((nsb)nsb4);
            h.p(o2);
        }
        h.O();
        final List s4 = s9i.s(n6, new n97(a5, (nsb)o2));
        final okh f = ld4.f(companion, (nsb)nsb3, (nsb)nsb2);
        final float n7 = 16;
        final float n8 = 10;
        final okh f2 = oj7.f(nza.D1(f, n7, n8), (qsb)new yid$a(s2, s4));
        final ds0 a6 = ds0.a;
        final ds0$g h3 = ds0.h;
        Objects.requireNonNull(ex.Companion);
        final bw1.b k = ex.a.k;
        h.x(693286680);
        final fqg a7 = ulo.a((ds0.d)h3, k, h);
        h.x(-1323940314);
        final iar e = yd6.e;
        final lo8 lo8 = (lo8)h.m((wd6)e);
        final iar i = yd6.k;
        final fve fve = (fve)h.m((wd6)i);
        final iar o3 = yd6.o;
        final t6x t6x = (t6x)h.m((wd6)o3);
        Objects.requireNonNull(q66.Companion);
        final vve$a b = q66.a.b;
        final itb a8 = ove.a(f2);
        if (!(h.j() instanceof qr0)) {
            wd.t();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((nsb)b);
        }
        else {
            h.o();
        }
        h.F();
        final q66$a$c e2 = q66.a.e;
        mru.p(h, (Object)a7, (ftb)e2);
        final q66$a$a d = q66.a.d;
        mru.p(h, (Object)lo8, (ftb)d);
        final q66$a$b f3 = q66.a.f;
        mru.p(h, (Object)fve, (ftb)f3);
        final q66$a$e g = q66.a.g;
        ((t26)a8).h0((Object)g4k.C(h, t6x, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-678309503);
        final okh$a companion2 = okh.Companion;
        czd.f((Object)companion2, "<this>");
        if (1.0f <= 0.0) {
            throw new IllegalArgumentException(sk0.B("invalid weight ", 1.0f, "; must be greater than zero").toString());
        }
        final wrd$a a9 = wrd.a;
        final wrd$a a10 = wrd.a;
        final mwe mwe = new mwe(1.0f, true);
        ((okh)companion2).E((okh)mwe);
        h.x(693286680);
        final fqg a11 = ulo.a((ds0.d)ds0.b, k, h);
        h.x(-1323940314);
        final lo8 lo9 = (lo8)h.m((wd6)e);
        final fve fve2 = (fve)h.m((wd6)i);
        final t6x t6x2 = (t6x)h.m((wd6)o3);
        final itb a12 = ove.a((okh)mwe);
        if (!(h.j() instanceof qr0)) {
            wd.t();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((nsb)b);
        }
        else {
            h.o();
        }
        ((t26)a12).h0((Object)mw.x(h, h, a11, e2, h, lo9, d, h, fve2, f3, h, t6x2, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-678309503);
        final List<cgv> a13 = qo7.a();
        h.x(1157296644);
        final boolean p17 = h.P((Object)a13);
        final Object y3 = h.y();
        hdd b2 = null;
        Label_1054: {
            if (!p17) {
                Objects.requireNonNull(x66.Companion);
                if ((b2 = (hdd)y3) != x66$a.b) {
                    break Label_1054;
                }
            }
            final List<cgv> a14 = qo7.a();
            czd.e((Object)a14, "dmInboxItem.users");
            b2 = rpb.b0(a14);
            h.p((Object)b2);
        }
        h.O();
        final hdd hdd = b2;
        final boolean g2 = qo7.g;
        final soj d2 = qo7.d;
        String a15;
        if (d2 != null) {
            a15 = d2.a;
        }
        else {
            a15 = null;
        }
        ag7.e((hdd<? extends cgv>)hdd, n, g2, a15, nsb, null, null, null, h, (n2 >> 3 & 0x70) | 0x8 | (n2 >> 6 & 0xE000), 224);
        final okh g3 = nza.G1((okh)companion2, n8, 0.0f, 0.0f, 0.0f, 14);
        final ds0$k d3 = ds0.d;
        h.x(-483455358);
        final fqg a16 = nr4.a((ds0.l)d3, (ex.b)ex.a.n, h);
        h.x(-1323940314);
        final lo8 lo10 = (lo8)h.m((wd6)e);
        final fve fve3 = (fve)h.m((wd6)i);
        final t6x t6x3 = (t6x)h.m((wd6)o3);
        final itb a17 = ove.a(g3);
        if (!(h.j() instanceof qr0)) {
            wd.t();
            throw null;
        }
        h.E();
        if (h.f()) {
            h.A((nsb)b);
        }
        else {
            h.o();
        }
        ((t26)a17).h0((Object)mw.x(h, h, a16, e2, h, lo10, d, h, fve3, f3, h, t6x3, g, h), (Object)h, (Object)0);
        h.x(2058660585);
        h.x(-1163856341);
        rf7.b(qo7.g, qo7.f, qo7.e, qo7.i, s, (cgv)mq4.i0((List)hdd), null, h, (n2 << 9 & 0xE000) | 0x40000, 64);
        av7.a(qo7.e, charSequence, s3, null, h, (n2 >> 9 & 0x380) | 0x40, 8);
        h.O();
        h.O();
        h.r();
        h.O();
        h.O();
        h.O();
        h.O();
        h.r();
        h.O();
        h.O();
        final okh g4 = nza.G1((okh)companion2, n7, 0.0f, 0.0f, 0.0f, 14);
        h.x(733328855);
        final fqg d4 = bb2.d((ex)ex.a.b, false, h);
        h.x(-1323940314);
        final lo8 lo11 = (lo8)h.m((wd6)e);
        final fve fve4 = (fve)h.m((wd6)i);
        final t6x t6x4 = (t6x)h.m((wd6)o3);
        final itb a18 = ove.a(g4);
        if (h.j() instanceof qr0) {
            h.E();
            if (h.f()) {
                h.A((nsb)b);
            }
            else {
                h.o();
            }
            ((t26)a18).h0((Object)mw.x(h, h, d4, e2, h, lo11, d, h, fve4, f3, h, t6x4, g, h), (Object)h, (Object)0);
            h.x(2058660585);
            h.x(-2137368960);
            koc.a(joc.B, (String)null, ld4.d(kdq.m((okh)companion2, (float)30), false, (String)null, (d0n)null, (nsb)nsb4, 7), h2, false, h, 56, 16);
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            h.O();
            h.O();
            h.r();
            h.O();
            h.O();
            final lxo j = h.k();
            if (j != null) {
                j.a((ftb)new yid$b(qo7, s, n, s2, charSequence, s3, (nsb)nsb, (nsb)nsb2, (nsb)nsb3, (nsb)nsb4, companion, n2, n3, n4));
            }
            return;
        }
        wd.t();
        throw null;
    }
}
