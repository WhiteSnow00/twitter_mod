import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3s extends pue implements kub<dlh, d86, Integer, dlh>
{
    public final Map<Float, Object> F0;
    public final o3s<Object> G0;
    public final dpj H0;
    public final boolean I0;
    public final iuh J0;
    public final boolean K0;
    public final wqm L0;
    public final hub<Object, Object, ros> M0;
    public final float N0;
    
    public e3s(final Map<Float, Object> f0, final o3s<Object> g0, final dpj i0, final boolean j0, final iuh k0, final boolean l0, final wqm m0, final hub<Object, Object, ? extends ros> n0, final float n2) {
        final dpj g2 = dpj.G0;
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = g2;
        this.I0 = (boolean)i0;
        this.J0 = (iuh)j0;
        this.K0 = (boolean)k0;
        this.L0 = (wqm)l0;
        this.M0 = (hub<Object, Object, ros>)m0;
        this.N0 = (float)n0;
        super(3);
    }
    
    public final Object h0(Object o, Object y, final Object o2) {
        final dlh dlh = (dlh)o;
        final d86 d86 = (d86)y;
        lf.L((Number)o2, dlh, "$this$composed", d86, 43594985);
        final sa6$b a = sa6.a;
        final boolean empty = this.F0.isEmpty();
        boolean b = true;
        if (!(empty ^ true)) {
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }
        if (rr4.w1((Iterable)this.F0.values()).size() != this.F0.size()) {
            b = false;
        }
        if (b) {
            final rp8 rp8 = (rp8)d86.m((df6)ff6.e);
            final o3s<Object> g0 = this.G0;
            final Map<Float, Object> f0 = this.F0;
            Objects.requireNonNull(g0);
            e0e.f((Object)f0, "newAnchors");
            if (g0.e().isEmpty()) {
                final Float b2 = lai.b(f0, g0.f());
                if (b2 == null) {
                    throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                }
                ((cjq<Float>)g0.e).setValue(b2);
                ((cjq<Float>)g0.g).setValue(b2);
            }
            final Map<Float, Object> f2 = this.F0;
            final o3s<Object> g2 = this.G0;
            shw.i((Object)f2, (Object)g2, (hub)new c3s(g2, f2, this.L0, rp8, this.M0, this.N0, null), d86);
            final dlh.a companion = dlh.Companion;
            final boolean booleanValue = ((cjq<Boolean>)this.G0.d).getValue();
            final o3s<Object> g3 = this.G0;
            final ih8 p3 = g3.p;
            final dpj h0 = this.H0;
            final boolean i0 = this.I0;
            final iuh j0 = this.J0;
            d86.x(1157296644);
            final boolean p4 = d86.P((Object)g3);
            y = d86.y();
            Label_0343: {
                if (!p4) {
                    Objects.requireNonNull(d86.Companion);
                    if ((o = y) != d86$a.b) {
                        break Label_0343;
                    }
                }
                o = new d3s(g3, null);
                d86.p(o);
            }
            d86.O();
            final kub kub = (kub)o;
            final boolean k0 = this.K0;
            o = new zc9((mp6)null);
            e0e.f((Object)companion, "<this>");
            e0e.f((Object)p3, "state");
            e0e.f((Object)h0, "orientation");
            e0e.f((Object)kub, "onDragStopped");
            final dlh c = id9.c((dlh)companion, (jd9)p3, (stb)ad9.F0, h0, i0, j0, (ptb)new bd9(booleanValue), (kub)o, (kub)new cd9((kub<? super iz6, ? super Float, ? super mp6<? super vzv>, ?>)kub, h0, null), k0);
            d86.O();
            return c;
        }
        throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
    }
}
