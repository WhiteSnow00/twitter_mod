import java.util.Objects;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gqv extends tqv
{
    public final dpv h;
    public final apv i;
    
    public gqv(final String s, final String s2, final fpv fpv, final fpv fpv2, final dpv h, final apv i, final xwm xwm, final xwm xwm2) {
        super(s, s2, fpv, fpv2, xwm, xwm2);
        this.h = h;
        this.i = i;
    }
    
    public static final class a extends tqv$a<gqv>
    {
        public static final a b;
        
        static {
            b = new a();
        }
        
        public a() {
            super(1);
        }
        
        public final Object d(final elp elp, final int n) throws IOException, ClassNotFoundException {
            final String c = elp.C();
            final String i = elp.I();
            final fpv$a c2 = fpv.c;
            final fpv fpv = (fpv)((s4j)c2).a(elp);
            final fpv fpv2 = (fpv)((s4j)c2).a(elp);
            final Object a = ((s4j)dpv.c).a(elp);
            pf8.r(a);
            final dpv dpv = (dpv)a;
            final apv apv = (apv)((s4j)apv.d).a(elp);
            final xwm xwm = null;
            xwm xwm3;
            xwm xwm4;
            if (n >= 1) {
                final xwm$c f0 = xwm.F0;
                final xwm xwm2 = (xwm)((s4j)f0).a(elp);
                xwm3 = (xwm)((s4j)f0).a(elp);
                xwm4 = xwm2;
            }
            else {
                xwm3 = null;
                xwm4 = xwm;
            }
            return new gqv(c, i, fpv, fpv2, dpv, apv, xwm4, xwm3);
        }
        
        public final void f(flp g, final Object o) throws IOException {
            final gqv gqv = (gqv)o;
            g = g.G(gqv.a).G(gqv.b);
            final fpv c = gqv.c;
            final fpv$a c2 = fpv.c;
            Objects.requireNonNull(g);
            ((s4j)c2).c(g, (Object)c);
            final int a = w4j.a;
            ((s4j)c2).c(g, (Object)gqv.d);
            ((s4j)dpv.c).c(g, (Object)gqv.h);
            ((s4j)apv.d).c(g, (Object)gqv.i);
            final xwm e = gqv.e;
            final xwm$c f0 = xwm.F0;
            ((s4j)f0).c(g, (Object)e);
            ((s4j)f0).c(g, (Object)gqv.f);
        }
    }
}
