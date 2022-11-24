import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l60 extends pue implements kub<dlh, d86, Integer, dlh>
{
    public final boolean F0;
    public final frm G0;
    public final boolean H0;
    
    public l60(final boolean f0, final frm g0, final boolean h0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        super(3);
    }
    
    public final Object h0(Object o, Object y, final Object o2) {
        final dlh dlh = (dlh)o;
        final d86 d86 = (d86)y;
        lf.L((Number)o2, dlh, "$this$composed", d86, -1538687176);
        final sa6$b a = sa6.a;
        final long a2 = ((fks)d86.m((df6)gks.a)).a;
        final dlh.a companion = dlh.Companion;
        final sr4 sr4 = new sr4(a2);
        int i = 0;
        final boolean f0 = this.F0;
        final frm g0 = this.G0;
        final boolean h0 = this.H0;
        final boolean f2 = this.F0;
        final frm g2 = this.G0;
        final boolean h2 = this.H0;
        d86.x(-568225417);
        boolean b = false;
        while (i < 4) {
            b |= d86.P((new Object[] { sr4, f0, g0, h0 })[i]);
            ++i;
        }
        y = d86.y();
        Label_0223: {
            if (!b) {
                Objects.requireNonNull(d86.Companion);
                if ((o = y) != d86$a.b) {
                    break Label_0223;
                }
            }
            y = (o = new k60(a2, f2, g2, h2));
            d86.p(y);
        }
        d86.O();
        final dlh e = dlh.E(rd9.b((dlh)companion, (stb<? super v73, ud9>)o));
        final sa6$b a3 = sa6.a;
        d86.O();
        return e;
    }
}
