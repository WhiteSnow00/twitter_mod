import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ais extends pue implements kub<dlh, d86, Integer, dlh>
{
    public final bis F0;
    public final boolean G0;
    public final iuh H0;
    
    public ais(final bis f0, final boolean g0, final iuh h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(3);
    }
    
    public final Object h0(Object o, Object o2, final Object o3) {
        final dlh dlh = (dlh)o;
        final d86 d86 = (d86)o2;
        lf.L((Number)o3, dlh, "$this$composed", d86, 805428266);
        final sa6$b a = sa6.a;
        final boolean b = d86.m((df6)ff6.k) == cwe.G0;
        final boolean b2 = this.F0.c() == dpj.F0 || !b;
        final bis f0 = this.F0;
        d86.x(1157296644);
        final boolean p3 = d86.P((Object)f0);
        o2 = d86.y();
        Label_0154: {
            if (!p3) {
                Objects.requireNonNull(d86.Companion);
                if ((o = o2) != d86$a.b) {
                    break Label_0154;
                }
            }
            o = new zhs(f0);
            d86.p(o);
        }
        d86.O();
        final stb stb = (stb)o;
        e0e.f((Object)stb, "consumeScrollDelta");
        d86.x(-180460798);
        final l9r h0 = zzz.h0((Object)stb, d86);
        d86.x(-492369756);
        o2 = d86.y();
        Objects.requireNonNull(d86.Companion);
        if ((o = o2) == d86$a.b) {
            o = new qk8((stb<? super Float, Float>)new b5p(h0));
            d86.p(o);
        }
        d86.O();
        final a5p a5p = (a5p)o;
        d86.O();
        final dlh.a companion = dlh.Companion;
        final dpj c = this.F0.c();
        final boolean b3 = this.G0 && this.F0.a() != 0.0f;
        final iuh h2 = this.H0;
        final g4p a2 = (g4p)t4p.a;
        e0e.f((Object)companion, "<this>");
        e0e.f((Object)a5p, "state");
        e0e.f((Object)c, "orientation");
        final dlh b4 = t4p.b((dlh)companion, a5p, c, (krj)null, b3, b2, (y6b)null, h2);
        d86.O();
        return b4;
    }
}
