import java.util.Map;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ptt extends dtr
{
    public final f6p j;
    public final List<String> k;
    public final Map<String, dlt> l;
    public final Map<String, rkt> m;
    public final List<String> n;
    public final vqt o;
    public final uqt p;
    public final cej q;
    public final cej r;
    public final int s;
    
    public ptt(final a a) {
        super((dtr$a)a);
        this.j = a.k;
        final List<String> l = a.l;
        jee.l((Object)l);
        this.k = l;
        final Map<String, dlt> m = a.m;
        jee.l((Object)m);
        this.l = m;
        Object i;
        if ((i = a.n) == null) {
            i = k2a.D0;
        }
        this.m = (Map<String, rkt>)i;
        this.n = a.o;
        this.o = a.p;
        this.p = a.q;
        final cej r = a.r;
        jee.l((Object)r);
        this.q = r;
        final cej s = a.s;
        jee.l((Object)s);
        this.r = s;
        final Integer value = a.t;
        jee.l((Object)value);
        this.s = value;
    }
    
    public final ssr b(final String s) {
        return (ssr)new ntt(s, this);
    }
    
    public static final class a extends dtr$a<ptt, a>
    {
        public f6p k;
        public List<String> l;
        public Map<String, dlt> m;
        public Map<String, rkt> n;
        public List<String> o;
        public vqt p;
        public uqt q;
        public cej r;
        public cej s;
        public int t;
        
        public final Object i() {
            return new ptt(this);
        }
    }
}
