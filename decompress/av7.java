import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class av7
{
    public static final void a(final boolean b, final CharSequence charSequence, final String s, okh companion, x66 h, final int n, final int n2) {
        czd.f((Object)charSequence, "previewText");
        h = h.h(-1718894599);
        if ((n2 & 0x8) != 0x0) {
            companion = (okh)okh.Companion;
        }
        final n96$b a = n96.a;
        final int n3 = n >> 9 & 0xE;
        h.x(-483455358);
        final ds0 a2 = ds0.a;
        final ds0$k d = ds0.d;
        Objects.requireNonNull(ex.Companion);
        final fqg a3 = nr4.a((ds0.l)d, (ex.b)ex.a.n, h);
        h.x(-1323940314);
        final lo8 lo8 = (lo8)h.m((wd6)yd6.e);
        final fve fve = (fve)h.m((wd6)yd6.k);
        final t6x t6x = (t6x)h.m((wd6)yd6.o);
        Objects.requireNonNull(q66.Companion);
        final vve$a b2 = q66.a.b;
        final itb a4 = ove.a(companion);
        final int n4 = ((n3 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
        if (h.j() instanceof qr0) {
            h.E();
            if (h.f()) {
                h.A((nsb)b2);
            }
            else {
                h.o();
            }
            h.F();
            mru.p(h, (Object)a3, (ftb)q66.a.e);
            mru.p(h, (Object)lo8, (ftb)q66.a.d);
            mru.p(h, (Object)fve, (ftb)q66.a.f);
            ((t26)a4).h0((Object)g4k.C(h, t6x, q66.a.g, h), (Object)h, (Object)(n4 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-1163856341);
            if ((n4 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n3 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                h.H();
            }
            else {
                final okh$a companion2 = okh.Companion;
                sp7.a(charSequence, b, nza.G1(kdq.i((okh)companion2), 0.0f, 0.0f, (float)24, 0.0f, 11), h, (n << 3 & 0x70) | 0x188, 0);
                if (s != null) {
                    Objects.requireNonNull(ejs.Companion);
                    final sjs j = kpc.Companion.a(h).j;
                    Objects.requireNonNull(pkb.Companion);
                    sis.a(s, nza.G1((okh)companion2, 0.0f, (float)6, 0.0f, 0.0f, 13), ((dpc)h.m((wd6)ipc.a)).j(), 0L, (lkb)null, (pkb)null, (pjb)null, 0L, (ffs)null, (mes)null, 0L, 2, false, 3, sjs.a(j, 0L, 0L, pkb.L0, (pjb)null, (ffs)null, (mes)null, (jfs)null, 0L, 262139), false, h, (n >> 6 & 0xE) | 0x30, 3120, 38904);
                }
            }
            final lxo y = wk0.y(h);
            if (y != null) {
                y.a((ftb)new ftb<x66, Integer, fzv>(b, charSequence, s, companion, n, n2) {
                    public final boolean D0;
                    public final CharSequence E0;
                    public final String F0;
                    public final okh G0;
                    public final int H0;
                    public final int I0;
                    
                    public final Object invoke(final Object o, final Object o2) {
                        final x66 x66 = (x66)o;
                        ((Number)o2).intValue();
                        av7.a(this.D0, this.E0, this.F0, this.G0, x66, this.H0 | 0x1, this.I0);
                        return fzv.a;
                    }
                });
            }
            return;
        }
        wd.t();
        throw null;
    }
}
