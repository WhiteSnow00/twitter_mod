import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yep
{
    public static final ic0 a;
    public static final zhv<wfj, ic0> b;
    public static final long c;
    public static final o4r<wfj> d;
    
    static {
        a = new ic0(Float.NaN, Float.NaN);
        yep.b = (aiv)npw.a((qsb)yep$a.D0, (qsb)yep$b.D0);
        d = new o4r<wfj>(new wfj(c = wj1.a(0.01f, 0.01f)), 3);
    }
    
    public static final okh a(final okh okh, final nsb<wfj> nsb, final qsb<? super nsb<wfj>, ? extends okh> qsb) {
        czd.f((Object)okh, "<this>");
        czd.f((Object)qsb, "platformMagnifier");
        return w66.b(okh, (itb)new itb<okh, x66, Integer, okh>(nsb, qsb) {
            public final nsb<wfj> D0;
            public final qsb<nsb<wfj>, okh> E0;
            
            public final Object h0(Object l, Object o, final Object o2) {
                final okh okh = (okh)l;
                final x66 x66 = (x66)o;
                ua.y((Number)o2, okh, "$this$composed", x66, 759876635);
                final n96$b a = n96.a;
                final nsb<wfj> d0 = this.D0;
                o = nb0.y(x66, -1589795249, -492369756);
                Objects.requireNonNull(x66.Companion);
                final x66$a$a b = x66$a.b;
                l = o;
                if (o == b) {
                    l = blz.l(d0);
                    x66.p(l);
                }
                x66.O();
                final m8r m8r = (m8r)l;
                x66.x(-492369756);
                o = x66.y();
                if ((l = o) == b) {
                    final wfj wfj = new wfj(((wfj)m8r.getValue()).a);
                    final aiv b2 = yep.b;
                    final wfj wfj2 = new wfj(yep.c);
                    czd.f((Object)b2, "typeConverter");
                    l = new b80((Object)wfj, (zhv)b2, (Object)wfj2, "Animatable");
                    x66.p(l);
                }
                x66.O();
                final b80 b3 = (b80)l;
                npe.e((Object)fzv.a, (ftb)new afp(m8r, b3, (go6)null), x66);
                final ac0 c = b3.c;
                x66.O();
                final qsb<nsb<wfj>, okh> e0 = this.E0;
                x66.x(1157296644);
                final boolean p3 = x66.P((Object)c);
                o = x66.y();
                if (p3 || (l = o) == b) {
                    l = new zep((m8r<wfj>)c);
                    x66.p(l);
                }
                x66.O();
                final okh okh2 = (okh)e0.invoke(l);
                x66.O();
                return okh2;
            }
        });
    }
}
