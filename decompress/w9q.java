import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class w9q
{
    public static final void a(dlh companion, final hub<? super d86, ? super Integer, vzv> hub, d86 h, final int n, final int n2) {
        e0e.f((Object)hub, "content");
        h = h.h(-2105228848);
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
            final w9q$a a2 = w9q$a.a;
            h.x(-1323940314);
            final rp8 rp8 = (rp8)h.m((df6)ff6.e);
            final cwe cwe = (cwe)h.m((df6)ff6.k);
            final l7x l7x = (l7x)h.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a3 = lwe.a(companion);
            final int n8 = (((n6 << 3 & 0x70) | (n6 >> 3 & 0xE)) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((ptb)b);
            }
            else {
                h.o();
            }
            h.F();
            jty.X(h, a2, (hub)w76.a.e);
            jty.X(h, rp8, (hub)w76.a.d);
            jty.X(h, cwe, (hub)w76.a.f);
            ((z36)a3).h0((Object)af.y(h, l7x, w76.a.g, h), (Object)h, (Object)(n8 >> 3 & 0x70));
            h.x(2058660585);
            hub.invoke((Object)h, (Object)(n8 >> 9 & 0xE));
            h.O();
            h.r();
            h.O();
        }
        final gyo k = h.k();
        if (k != null) {
            k.a((hub)new w9q$b(companion, (hub)hub, n, n2));
        }
    }
}
