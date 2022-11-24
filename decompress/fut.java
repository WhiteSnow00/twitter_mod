import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fut extends bur
{
    public final z6p j;
    public final List<String> k;
    public final Map<String, ult> l;
    public final Map<String, ilt> m;
    public final List<String> n;
    public final mrt o;
    public final lrt p;
    public final pej q;
    public final pej r;
    public final int s;
    
    public fut(final a a) {
        super((bur$a)a);
        this.j = a.k;
        final List<String> l = a.l;
        vmw.g((Object)l);
        this.k = l;
        final Map<String, ult> m = a.m;
        vmw.g((Object)m);
        this.l = m;
        Object i;
        if ((i = a.n) == null) {
            i = m3a.F0;
        }
        this.m = (Map<String, ilt>)i;
        this.n = a.o;
        this.o = a.p;
        this.p = a.q;
        final pej r = a.r;
        vmw.g((Object)r);
        this.q = r;
        final pej s = a.s;
        vmw.g((Object)s);
        this.r = s;
        final Integer value = a.t;
        vmw.g((Object)value);
        this.s = value;
    }
    
    public final qtr b(final String s) {
        return (qtr)new dut(s, this);
    }
    
    public static final class a extends bur$a<fut, a>
    {
        public z6p k;
        public List<String> l;
        public Map<String, ult> m;
        public Map<String, ilt> n;
        public List<String> o;
        public mrt p;
        public lrt q;
        public pej r;
        public pej s;
        public int t;
        
        public final Object i() {
            return new fut(this);
        }
    }
}
