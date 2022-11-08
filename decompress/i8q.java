import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class i8q
{
    public static final void a(jkh companion, final gub<? super m76, ? super Integer, oyv> gub, m76 h, final int n, final int n2) {
        zzd.f((Object)gub, "content");
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
                if (h.P((Object)gub)) {
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
                companion = jkh.Companion;
            }
            final ea6$b a = ea6.a;
            final i8q$a a2 = i8q$a.a;
            h.x(-1323940314);
            final dp8 dp8 = (dp8)h.m((re6)te6.e);
            final tve tve = (tve)h.m((re6)te6.k);
            final z5x z5x = (z5x)h.m((re6)te6.o);
            Objects.requireNonNull(f76.Companion);
            final jwe$a b = f76.a.b;
            final jub a3 = cwe.a(companion);
            final int n8 = (((n6 << 3 & 0x70) | (n6 >> 3 & 0xE)) << 9 & 0x1C00) | 0x6;
            if (!(h.j() instanceof xr0)) {
                ukg.l0();
                throw null;
            }
            h.E();
            if (h.f()) {
                h.A((otb)b);
            }
            else {
                h.o();
            }
            h.F();
            r9x.v(h, (Object)a2, (gub)f76.a.e);
            r9x.v(h, (Object)dp8, (gub)f76.a.d);
            r9x.v(h, (Object)tve, (gub)f76.a.f);
            ((j36)a3).h0((Object)hvl.b(h, z5x, f76.a.g, h), (Object)h, (Object)(n8 >> 3 & 0x70));
            h.x(2058660585);
            gub.invoke((Object)h, (Object)(n8 >> 9 & 0xE));
            h.O();
            h.r();
            h.O();
        }
        final vwo k = h.k();
        if (k != null) {
            k.a((gub)new i8q$b(companion, (gub)gub, n, n2));
        }
    }
}
