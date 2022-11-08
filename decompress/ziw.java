import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ziw extends nws
{
    public final hfv k;
    public final rev l;
    public final boolean m;
    public final Map<ozl$c$a, Long> n;
    
    public ziw(final a a) {
        super((nws$a)a);
        final hfv l = a.l;
        pf8.r(l);
        this.k = l;
        this.l = a.k;
        this.m = a.m;
        Object n;
        if ((n = a.n) == null) {
            n = a3a.C0;
        }
        this.n = (Map<ozl$c$a, Long>)n;
    }
    
    public final void a(final List<Long> list, final List<Long> list2, final List<Long> list3) {
        list2.add(this.k.C0);
    }
    
    public final qzo f() {
        return this.k.p1;
    }
    
    public static final class a extends nws$a<ziw, a>
    {
        public rev k;
        public hfv l;
        public boolean m;
        public Map<ozl$c$a, Long> n;
        
        public a() {
            super(0L);
        }
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new ziw(this);
        }
        
        public final boolean l() {
            return this.l != null;
        }
    }
}
