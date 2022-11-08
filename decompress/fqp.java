import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class fqp
{
    public static final alp<fqp> e;
    public final xdj a;
    public final xdj b;
    public final String c;
    public final int d;
    
    static {
        fqp.e = (jx6)hx6.b(new pkp[] { new pkp((Class)fqp.class, (alp)new fqp.fqp$d()), new pkp((Class)u9r.class, (alp)new u9r$b()), new pkp((Class)n72.class, (alp)new n72$a()), new pkp((Class)dl.class, (alp)new dl$a()), new pkp((Class)i9c.class, (alp)new i9c$b()), new pkp((Class)kmf.class, (alp)new kmf$b()), new pkp((Class)fhl.class, (alp)new fhl$b()), new pkp((Class)tft.class, (alp)new tft$c()), new pkp((Class)wru.class, (alp)new wru$b()), new pkp((Class)a53.class, (alp)new a53$b()), new pkp((Class)i53.class, (alp)new i53$b()), new pkp((Class)b9d.class, (alp)new b9d$b()), new pkp((Class)qmd.class, (alp)new qmd$b()), new pkp((Class)xw.class, (alp)new xw$a()), new pkp((Class)nnq.class, (alp)new nnq$b()), new pkp((Class)cj3.class, (alp)new cj3$b()) });
    }
    
    public fqp(final a a) {
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
    }
    
    public static Map<String, snp> a(final List<fqp> list) {
        final sjg t = sjg.t();
        for (final fqp fqp : list) {
            if (fqp.d()) {
                t.x((Map)fqp.c());
            }
        }
        return (Map)((h4j)t).e();
    }
    
    public List<rh0> b() {
        return Collections.emptyList();
    }
    
    public Map<String, snp> c() {
        return null;
    }
    
    public boolean d() {
        return this instanceof dl ^ true;
    }
    
    public abstract static class a<SP extends fqp, B extends h4j<SP>> extends h4j<SP>
    {
        public xdj a;
        public xdj b;
        public String c;
        public int d;
        
        public a() {
            this.d = -1;
        }
        
        public boolean l() {
            return this.d > -1;
        }
    }
}
