import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class d2s extends pue implements kub<Boolean, d86, Integer, vzv>
{
    public final e2s F0;
    public final long G0;
    public final int H0;
    public final hb4 I0;
    
    public d2s(final e2s f0, final long g0, final int h0, final hb4 i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
        super(3);
    }
    
    public final Object h0(final Object o, final Object o2, final Object o3) {
        final boolean booleanValue = (boolean)o;
        final d86 d86 = (d86)o2;
        int intValue;
        final int n = intValue = ((Number)o3).intValue();
        if ((n & 0xE) == 0x0) {
            int n2;
            if (d86.a(booleanValue)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            intValue = (n | n2);
        }
        if ((intValue & 0x5B) == 0x12 && d86.i()) {
            d86.H();
        }
        else {
            final sa6$b a = sa6.a;
            final dlh.a companion = dlh.Companion;
            final dlh g = heq.g((dlh)companion);
            Objects.requireNonNull(ex.Companion);
            final jw1 f = ex$a.f;
            final e2s f2 = this.F0;
            final long g2 = this.G0;
            final int h0 = this.H0;
            final hb4 i0 = this.I0;
            final zqg s = z9a.s(d86, 733328855, f, false, d86, -1323940314);
            final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
            final cwe cwe = (cwe)d86.m((df6)ff6.k);
            final l7x l7x = (l7x)d86.m((df6)ff6.o);
            Objects.requireNonNull(w76.Companion);
            final swe$a b = w76.a.b;
            final kub<weq<w76>, d86, Integer, vzv> a2 = lwe.a(g);
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
            ((z36)a2).h0((Object)af.y(d86, l7x, w76.a.g, d86), (Object)d86, (Object)0);
            d86.x(2058660585);
            d86.x(-2137368960);
            if (booleanValue) {
                d86.x(-1527193899);
                final float b2 = f2.b;
                final float c = f2.c;
                bil.b(heq.m((dlh)companion, (b2 + c) * 2), g2, c, d86, h0 >> 18 & 0x70, 0);
                d86.O();
            }
            else {
                d86.x(-1527193561);
                s7d.a((wvj)i0, "Refreshing", (dlh)null, (ex)null, (kn6)null, 0.0f, (vr4)null, d86, 56, 124);
                d86.O();
            }
            awg.g(d86);
        }
        return vzv.a;
    }
}
