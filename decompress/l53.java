import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l53 extends pue implements hub<d86, Integer, vzv>
{
    public final osj F0;
    public final kub<qmo, d86, Integer, vzv> G0;
    public final int H0;
    
    public l53(final osj f0, final kub<? super qmo, ? super d86, ? super Integer, vzv> g0, final int h0) {
        this.F0 = f0;
        this.G0 = (kub<qmo, d86, Integer, vzv>)g0;
        this.H0 = h0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            final dlh.a companion = dlh.Companion;
            final s43 a2 = s43.a;
            final dlh y = zzz.Y(heq.d((dlh)companion, s43.c, s43.d), this.F0);
            final gs0 a3 = gs0.a;
            final gs0.e f = gs0.f;
            Objects.requireNonNull(ex.Companion);
            final jw1.b l = ex$a.l;
            final kub<qmo, d86, Integer, vzv> g0 = this.G0;
            final int n = (this.H0 >> 18 & 0x1C00) | 0x1B0;
            d86.x(693286680);
            final zqg a4 = omo.a((gs0$d)f, (ex$c)l, d86);
            d86.x(-1323940314);
            final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
            final cwe cwe = (cwe)d86.m((df6)ff6.k);
            final l7x l7x = (l7x)d86.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a5 = lwe.a(y);
            final int n2 = ((n << 3 & 0x70) << 9 & 0x1C00) | 0x6;
            if (!(d86.j() instanceof tr0)) {
                kqe.W();
                throw null;
            }
            d86.E();
            if (d86.f()) {
                d86.A((ptb)b);
            }
            else {
                d86.o();
            }
            d86.F();
            jty.X(d86, a4, (hub)w76.a.e);
            jty.X(d86, rp8, (hub)w76.a.d);
            jty.X(d86, cwe, (hub)w76.a.f);
            ((z36)a5).h0((Object)af.y(d86, l7x, w76.a.g, d86), (Object)d86, (Object)(n2 >> 3 & 0x70));
            d86.x(2058660585);
            d86.x(-678309503);
            if ((n2 >> 9 & 0xE & 0xB) == 0x2 && d86.i()) {
                d86.H();
            }
            else {
                g0.h0((Object)rmo.a, (Object)d86, (Object)((n >> 6 & 0x70) | 0x6));
            }
            awg.g(d86);
        }
        return vzv.a;
    }
}
