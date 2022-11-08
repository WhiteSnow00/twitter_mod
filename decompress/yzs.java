import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yzs extends nws
{
    public final api k;
    public final Iterable<hfv> l;
    public final vo6 m;
    public final q7t n;
    public final rev o;
    
    public yzs(final a a) {
        super((nws$a)a);
        final api k = a.k;
        pf8.r(k);
        this.k = k;
        Object l;
        if ((l = a.l) == null) {
            l = v2a.C0;
        }
        this.l = (List)l;
        this.m = a.m;
        final q7t n = a.n;
        pf8.r(n);
        this.n = n;
        this.o = a.o;
    }
    
    public static final class a extends nws$a<yzs, a>
    {
        public api k;
        public List<hfv> l;
        public vo6 m;
        public q7t n;
        public rev o;
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new yzs(this);
        }
        
        public final boolean l() {
            return this.k != null && this.n != null;
        }
    }
}
