import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a8b extends pue implements hub<d86, Integer, vzv>
{
    public final hub<d86, Integer, vzv> F0;
    public final int G0;
    
    public a8b(final hub<? super d86, ? super Integer, vzv> f0, final int g0) {
        this.F0 = (hub<d86, Integer, vzv>)f0;
        this.G0 = g0;
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
            final float a2 = z7b.a;
            final float a3 = z7b.a;
            final dlh d87 = heq.d((dlh)companion, a3, a3);
            Objects.requireNonNull(ex.Companion);
            final jw1 f = ex$a.f;
            final hub<d86, Integer, vzv> f2 = this.F0;
            final int g0 = this.G0;
            final zqg s = z9a.s(d86, 733328855, f, false, d86, -1323940314);
            final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
            final cwe cwe = (cwe)d86.m((df6)ff6.k);
            final l7x l7x = (l7x)d86.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a4 = lwe.a(d87);
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
            jty.X(d86, s, (hub)w76.a.e);
            jty.X(d86, rp8, (hub)w76.a.d);
            jty.X(d86, cwe, (hub)w76.a.f);
            ((z36)a4).h0((Object)af.y(d86, l7x, w76.a.g, d86), (Object)d86, (Object)0);
            zk.C(d86, 2058660585, -2137368960, -1049034642);
            f2.invoke((Object)d86, (Object)(g0 >> 21 & 0xE));
            d86.O();
            d86.O();
            d86.O();
            d86.r();
            d86.O();
            d86.O();
        }
        return vzv.a;
    }
}
