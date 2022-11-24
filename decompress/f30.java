import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class f30 extends pue implements stb<em6, vzv>
{
    public final float F0;
    public final m6d G0;
    public final vr4 H0;
    
    public f30(final float f0, final m6d g0, final vr4 h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(1);
    }
    
    public final Object invoke(final Object o) {
        final em6 em6 = (em6)o;
        e0e.f((Object)em6, "$this$onDrawWithContent");
        em6.E0();
        final float f0 = this.F0;
        final m6d g0 = this.G0;
        final vr4 h0 = this.H0;
        final pd9 u0 = em6.u0();
        final long c = u0.c();
        u0.b().p();
        final xd9 a = u0.a();
        a.b(f0, 0.0f);
        Objects.requireNonNull(kgj.Companion);
        a.f(45.0f, kgj.b);
        vd9.e(em6, g0, 0L, 0.0f, null, h0, 0, 46, null);
        u0.b().c();
        u0.d(c);
        return vzv.a;
    }
}
