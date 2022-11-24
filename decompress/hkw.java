import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hkw extends vxs
{
    public final qgv k;
    public final agv l;
    public final boolean m;
    public final Map<n0m$c$a, Long> n;
    
    public hkw(final a a) {
        super((vxs$a)a);
        final qgv l = a.l;
        vmw.g((Object)l);
        this.k = l;
        this.l = a.k;
        this.m = a.m;
        Object n;
        if ((n = a.n) == null) {
            n = m3a.F0;
        }
        this.n = (Map<n0m$c$a, Long>)n;
    }
    
    public final void a(final List<Long> list, final List<Long> list2, final List<Long> list3) {
        list2.add(this.k.F0);
    }
    
    public final b1p f() {
        return this.k.s1;
    }
    
    public static final class a extends vxs$a<hkw, a>
    {
        public agv k;
        public qgv l;
        public boolean m;
        public Map<n0m$c$a, Long> n;
        
        public a() {
            super(0L);
        }
        
        public a(final long n) {
            super(n);
        }
        
        public final Object i() {
            return new hkw(this);
        }
        
        public final boolean k() {
            return this.l != null;
        }
    }
}
