import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rgb extends pue implements kub<dlh, d86, Integer, dlh>
{
    public final stb<bwe, vzv> F0;
    
    public rgb(final stb<? super bwe, vzv> f0) {
        this.F0 = (stb<bwe, vzv>)f0;
        super(3);
    }
    
    public final Object h0(Object o, Object y, final Object o2) {
        final dlh dlh = (dlh)o;
        final d86 d86 = (d86)y;
        lf.L((Number)o2, dlh, "$this$composed", d86, 1176407768);
        final sa6$b a = sa6.a;
        final stb<bwe, vzv> f0 = this.F0;
        d86.x(1157296644);
        final boolean p3 = d86.P((Object)f0);
        y = d86.y();
        Label_0099: {
            if (!p3) {
                Objects.requireNonNull(d86.Companion);
                if ((o = y) != d86$a.b) {
                    break Label_0099;
                }
            }
            o = new tgb((stb)f0);
            d86.p(o);
        }
        d86.O();
        final tgb tgb = (tgb)o;
        d86.O();
        return tgb;
    }
}
