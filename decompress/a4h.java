import java.io.IOException;
import java.util.Iterator;
import com.twitter.util.user.UserIdentifier;
import java.math.BigDecimal;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a4h extends e3k
{
    public final Map<String, BigDecimal> x0;
    
    public a4h(final a a) {
        super((e3k.a)a);
        final Map<String, BigDecimal> r0 = a.r0;
        pf8.r(r0);
        this.x0 = r0;
        super.p0 = 4;
    }
    
    public a4h(final String s, final UserIdentifier userIdentifier, final Map<String, BigDecimal> x0, final bu8 bu8) {
        super(s, userIdentifier, bu8);
        this.x0 = x0;
        super.p0 = 4;
    }
    
    public final void B(final tfe tfe) throws IOException {
        super.B(tfe);
        tfe.i0("mem_metrics");
        for (final Map.Entry<String, V> entry : this.x0.entrySet()) {
            final String s = entry.getKey();
            final BigDecimal bigDecimal = (BigDecimal)entry.getValue();
            tfe.i(s);
            tfe.z(bigDecimal);
        }
        tfe.h();
    }
    
    public static final class a extends e3k.a<a4h, a>
    {
        public Map<String, BigDecimal> r0;
        
        public final Object i() {
            return new a4h(this);
        }
    }
    
    public static final class b extends js2<a4h, a>
    {
        public b() {
            super(0);
        }
        
        public final void f(final flp flp, final Object o) throws IOException {
            final a4h a4h = (a4h)o;
            flp.C((Object)a4h, (alp)e3k.w0);
            ((s4j)new cr4((alp)hx6.f, (alp)hx6.k)).c(flp, (Object)a4h.x0);
            final int a = w4j.a;
        }
        
        public final h4j g() {
            return (h4j)new a();
        }
        
        public final void h(final elp elp, final h4j h4j, int a) throws IOException, ClassNotFoundException {
            final a a2 = (a)h4j;
            final e3k$c w0 = e3k.w0;
            a = w4j.a;
            elp.E((js2)w0, (h4j)a2);
            final Object a3 = ((s4j)new cr4((alp)hx6.f, (alp)hx6.k)).a(elp);
            pf8.r(a3);
            a2.r0 = (Map<String, BigDecimal>)a3;
        }
    }
}
