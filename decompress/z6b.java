import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class z6b extends ste implements ftb<x66, Integer, fzv>
{
    public final ftb<x66, Integer, fzv> D0;
    public final int E0;
    
    public z6b(final ftb<? super x66, ? super Integer, fzv> d0, final int e0) {
        this.D0 = (ftb<x66, Integer, fzv>)d0;
        this.E0 = e0;
        super(2);
    }
    
    public final Object invoke(final Object o, final Object o2) {
        final x66 x66 = (x66)o;
        if ((((Number)o2).intValue() & 0xB) == 0x2 && x66.i()) {
            x66.H();
        }
        else {
            final n96$b a = n96.a;
            final okh$a companion = okh.Companion;
            final float a2 = y6b.a;
            final float a3 = y6b.a;
            final okh d = kdq.d((okh)companion, a3, a3);
            Objects.requireNonNull(ex.Companion);
            final bw1 f = ex.a.f;
            final ftb<x66, Integer, fzv> d2 = this.D0;
            final int e0 = this.E0;
            final fqg g = w9.g(x66, 733328855, f, false, x66, -1323940314);
            final lo8 lo8 = (lo8)x66.m((wd6)yd6.e);
            final fve fve = (fve)x66.m((wd6)yd6.k);
            final t6x t6x = (t6x)x66.m((wd6)yd6.o);
            Objects.requireNonNull(q66.Companion);
            final vve$a b = q66.a.b;
            final itb a4 = ove.a(d);
            if (!(x66.j() instanceof qr0)) {
                wd.t();
                throw null;
            }
            x66.E();
            if (x66.f()) {
                x66.A((nsb)b);
            }
            else {
                x66.o();
            }
            x66.F();
            mru.p(x66, (Object)g, (ftb)q66.a.e);
            mru.p(x66, (Object)lo8, (ftb)q66.a.d);
            mru.p(x66, (Object)fve, (ftb)q66.a.f);
            ((t26)a4).h0((Object)g4k.C(x66, t6x, q66.a.g, x66), (Object)x66, (Object)0);
            sk0.D(x66, 2058660585, -2137368960, -1049034642);
            d2.invoke((Object)x66, (Object)(e0 >> 21 & 0xE));
            x66.O();
            x66.O();
            x66.O();
            x66.r();
            x66.O();
            x66.O();
        }
        return fzv.a;
    }
}
