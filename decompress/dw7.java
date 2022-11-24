import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dw7
{
    public static final void a(final boolean b, final CharSequence charSequence, final String s, dlh companion, d86 h, final int n, final int n2) {
        e0e.f((Object)charSequence, "previewText");
        h = h.h(-1718894599);
        if ((n2 & 0x8) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        final sa6$b a = sa6.a;
        final int n3 = n >> 9 & 0xE;
        h.x(-483455358);
        final gs0 a2 = gs0.a;
        final gs0$l d = (gs0$l)gs0.d;
        Objects.requireNonNull(ex.Companion);
        final zqg a3 = ts4.a((gs0$l)d, (ex$b)ex$a.n, h);
        h.x(-1323940314);
        final rp8 rp8 = (rp8)h.m((df6)ff6.e);
        final cwe cwe = (cwe)h.m((df6)ff6.k);
        final l7x l7x = (l7x)h.m((df6)ff6.o);
        Objects.requireNonNull(w76.Companion);
        final swe$a b2 = w76.a.b;
        final kub<weq<w76>, d86, Integer, vzv> a4 = lwe.a(companion);
        final int n4 = ((n3 << 3 & 0x70) << 9 & 0x1C00) | 0x6;
        if (h.j() instanceof tr0) {
            h.E();
            if (h.f()) {
                h.A((ptb)b2);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, a3, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a4).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)(n4 >> 3 & 0x70));
            h.x(2058660585);
            h.x(-1163856341);
            if ((n4 >> 9 & 0xE & 0xB) == 0x2 && h.i()) {
                h.H();
            }
            else if ((((n3 >> 6 & 0x70) | 0x6) & 0x51) == 0x10 && h.i()) {
                h.H();
            }
            else {
                final dlh.a companion2 = dlh.Companion;
                vq7.a(charSequence, b, zzz.d0(heq.i((dlh)companion2), 0.0f, 0.0f, (float)24, 0.0f, 11), h, (n << 3 & 0x70) | 0x188, 0);
                if (s != null) {
                    Objects.requireNonNull(wjs.Companion);
                    final kks j = kqc.Companion.a(h).j;
                    Objects.requireNonNull(qlb.Companion);
                    kjs.a(s, zzz.d0((dlh)companion2, 0.0f, (float)6, 0.0f, 0.0f, 13), ((dqc)h.m((df6)iqc.a)).j(), 0L, (mlb)null, (qlb)null, (qkb)null, 0L, (xfs)null, (efs)null, 0L, 2, false, 3, kks.a(j, 0L, 0L, qlb.N0, (qkb)null, (xfs)null, (efs)null, (bgs)null, 0L, 262139), false, h, (n >> 6 & 0xE) | 0x30, 3120, 38904);
                }
            }
            final gyo y = lr0.y(h);
            if (y != null) {
                y.a((hub)new dw7$a(b, charSequence, s, companion, n, n2));
            }
            return;
        }
        kqe.W();
        throw null;
    }
}
