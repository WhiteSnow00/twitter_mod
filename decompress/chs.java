import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class chs extends pue implements hub<d86, Integer, vzv>
{
    public final fvh<aeq> F0;
    public final osj G0;
    public final hub<d86, Integer, vzv> H0;
    public final int I0;
    
    public chs(final fvh<aeq> f0, final osj g0, final hub<? super d86, ? super Integer, vzv> h0, final int i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = (hub<d86, Integer, vzv>)h0;
        this.I0 = i0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final d86 d86 = (d86)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            final dlh t = egz.t((dlh)dlh.Companion, "border");
            final long a2 = ((aeq)this.F0.getValue()).a;
            final osj g0 = this.G0;
            final float a3 = iqj.a;
            e0e.f((Object)t, "$this$outlineCutout");
            e0e.f((Object)g0, "paddingValues");
            final dlh c = rd9.c(t, (stb<? super em6, vzv>)new jqj(a2, g0));
            final hub<d86, Integer, vzv> h0 = this.H0;
            final int i0 = this.I0;
            d86.x(733328855);
            Objects.requireNonNull(ex.Companion);
            final zqg d87 = ob2.d((ex)ex$a.b, true, d86);
            d86.x(-1323940314);
            final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
            final cwe cwe = (cwe)d86.m((df6)ff6.k);
            final l7x l7x = (l7x)d86.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a4 = lwe.a(c);
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
            jty.X(d86, d87, (hub)w76.a.e);
            jty.X(d86, rp8, (hub)w76.a.d);
            jty.X(d86, cwe, (hub)w76.a.f);
            ((z36)a4).h0((Object)af.y(d86, l7x, w76.a.g, d86), (Object)d86, (Object)0);
            zk.C(d86, 2058660585, -2137368960, 1029492925);
            if (h0 != null) {
                h0.invoke((Object)d86, (Object)(i0 >> 12 & 0xE));
            }
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
