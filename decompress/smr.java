import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class smr
{
    public static final void a(dlh companion, final hub<? super vmr, ? super vj6, ? extends arg> hub, final d86 d86, final int n, final int n2) {
        e0e.f((Object)hub, "measurePolicy");
        final d86 h = d86.h(-1298353104);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0xE) == 0x0) {
            int n5;
            if (h.P((Object)companion)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        int n6;
        if ((n2 & 0x2) != 0x0) {
            n6 = (n4 | 0x30);
        }
        else {
            n6 = n4;
            if ((n & 0x70) == 0x0) {
                int n7;
                if (h.P((Object)hub)) {
                    n7 = 32;
                }
                else {
                    n7 = 16;
                }
                n6 = (n4 | n7);
            }
        }
        if ((n6 & 0x5B) == 0x12 && h.i()) {
            h.H();
        }
        else {
            if (n3 != 0) {
                companion = (dlh)dlh.Companion;
            }
            final sa6$b a = sa6.a;
            h.x(-492369756);
            final Object y = h.y();
            Objects.requireNonNull(d86.Companion);
            umr umr;
            if ((umr = (umr)y) == d86$a.b) {
                umr = new umr();
                h.p((Object)umr);
            }
            h.O();
            final umr umr2 = umr;
            final int n8 = n6 << 3;
            b(umr2, companion, hub, h, (n8 & 0x70) | 0x8 | (n8 & 0x380), 0);
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new smr$b(companion, (hub)hub, n, n2));
        }
    }
    
    public static final void b(final umr umr, dlh companion, final hub<? super vmr, ? super vj6, ? extends arg> hub, final d86 d86, final int n, final int n2) {
        e0e.f((Object)umr, "state");
        e0e.f((Object)hub, "measurePolicy");
        final d86 h = d86.h(-511989831);
        if ((n2 & 0x2) != 0x0) {
            companion = (dlh)dlh.Companion;
        }
        final sa6$b a = sa6.a;
        final xe6 i0 = kqe.i0(h);
        final dlh c = c86.c(h, companion);
        final rp8 rp8 = (rp8)h.m((df6)ff6.e);
        final cwe cwe = (cwe)h.m((df6)ff6.k);
        final l7x l7x = (l7x)h.m((df6)ff6.o);
        Objects.requireNonNull(swe.Companion);
        final swe$a s1 = swe.s1;
        h.x(1886828752);
        if (h.j() instanceof tr0) {
            h.l();
            if (h.f()) {
                h.A((ptb)new smr$a((ptb)s1));
            }
            else {
                h.o();
            }
            jty.X(h, umr, (hub)umr.c);
            jty.X(h, i0, (hub)umr.d);
            jty.X(h, hub, (hub)umr.e);
            Objects.requireNonNull(w76.Companion);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            jty.X(h, l7x, (hub)w76.a.g);
            jty.X(h, c, (hub)w76.a.c);
            h.r();
            h.O();
            h.x(-607848778);
            if (!h.i()) {
                shw.n((ptb)new smr$c(umr), h);
            }
            h.O();
            final l9r h2 = zzz.h0((Object)umr, h);
            final vzv a2 = vzv.a;
            h.x(1157296644);
            final boolean p6 = h.P((Object)h2);
            final Object y = h.y();
            Object o = null;
            Label_0386: {
                if (!p6) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o = y) != d86$a.b) {
                        break Label_0386;
                    }
                }
                o = new smr$d(h2);
                h.p(o);
            }
            h.O();
            shw.b((Object)a2, (stb)o, h);
            final gyo k = h.k();
            if (k != null) {
                k.a((hub)new smr$e(umr, companion, (hub)hub, n, n2));
            }
            return;
        }
        kqe.W();
        throw null;
    }
}
