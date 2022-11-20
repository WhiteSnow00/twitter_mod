import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ob0 extends ste implements itb<okh, x66, Integer, okh>
{
    public final ftb<ltd, ltd, fzv> D0;
    public final uza<ltd> E0;
    
    public ob0(final ftb<? super ltd, ? super ltd, fzv> d0, final uza<ltd> e0) {
        this.D0 = (ftb<ltd, ltd, fzv>)d0;
        this.E0 = e0;
        super(3);
    }
    
    public final Object h0(Object g, Object o, final Object o2) {
        final okh okh = (okh)g;
        final x66 x66 = (x66)o;
        ua.y((Number)o2, okh, "$this$composed", x66, -843180607);
        final n96$b a = n96.a;
        o = nb0.y(x66, 773894976, -492369756);
        Objects.requireNonNull(x66.Companion);
        final x66$a$a b = x66$a.b;
        g = o;
        if (o == b) {
            g = mb0.g(npe.C(x66), x66);
        }
        x66.O();
        final cy6 d0 = ((zd6)g).D0;
        x66.O();
        final uza<ltd> e0 = this.E0;
        x66.x(1157296644);
        final boolean p3 = x66.P((Object)d0);
        o = x66.y();
        if (p3 || (g = o) == b) {
            g = new fdq((zb0)e0, d0);
            x66.p(g);
        }
        x66.O();
        final fdq fdq = (fdq)g;
        fdq.F0 = this.D0;
        final okh e2 = rrz.m(okh).E((okh)fdq);
        x66.O();
        return e2;
    }
}
