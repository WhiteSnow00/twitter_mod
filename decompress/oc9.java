import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oc9
{
    public static final okh a(final okh okh, final qsb<? super tc9, fzv> qsb) {
        czd.f((Object)okh, "<this>");
        czd.f((Object)qsb, "onDraw");
        final wrd$a a = wrd.a;
        final wrd$a a2 = wrd.a;
        return okh.E((okh)new hc9((qsb)qsb));
    }
    
    public static final okh b(final okh okh, final qsb<? super d73, rc9> qsb) {
        czd.f((Object)okh, "<this>");
        czd.f((Object)qsb, "onBuildDrawCache");
        final wrd$a a = wrd.a;
        return w66.a(okh, (qsb)wrd.a, (itb)new itb<okh, x66, Integer, okh>(qsb) {
            public final qsb<d73, rc9> D0;
            
            public final Object h0(Object o, Object y, final Object o2) {
                final okh okh = (okh)o;
                final x66 x66 = (x66)y;
                ua.y((Number)o2, okh, "$this$composed", x66, -1689569019);
                final n96$b a = n96.a;
                x66.x(-492369756);
                y = x66.y();
                Objects.requireNonNull(x66.Companion);
                o = y;
                if (y == x66$a.b) {
                    o = new d73();
                    x66.p(o);
                }
                x66.O();
                final okh e = okh.E((okh)new lc9((d73)o, this.D0));
                x66.O();
                return e;
            }
        });
    }
    
    public static final okh c(final okh okh, final qsb<? super yk6, fzv> qsb) {
        czd.f((Object)okh, "<this>");
        final wrd$a a = wrd.a;
        final wrd$a a2 = wrd.a;
        return okh.E((okh)new vc9((qsb)qsb));
    }
}
