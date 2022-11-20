import java.util.Set;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class iwo
{
    public abstract nh4 a();
    
    public final long b(final izk izk, final long n, int n2) {
        final long b = this.a().B();
        final a a = this.c().get(izk);
        final long b2 = a.b();
        --n2;
        long n3;
        if (b2 > 1L) {
            n3 = b2;
        }
        else {
            n3 = 2L;
        }
        return Math.min(Math.max((long)(Math.pow(3.0, n2) * b2 * Math.max(1.0, Math.log(10000.0) / Math.log((double)(n3 * n2)))), n - b), a.d());
    }
    
    public abstract Map<izk, a> c();
    
    public abstract static class a
    {
        public static iwo.a.a a() {
            final wb1$b wb1$b = new wb1$b();
            final Set<Object> emptySet = Collections.emptySet();
            Objects.requireNonNull(emptySet, "Null flags");
            wb1$b.c = emptySet;
            return (iwo.a.a)wb1$b;
        }
        
        public abstract long b();
        
        public abstract Set<b> c();
        
        public abstract long d();
        
        public abstract static class a
        {
            public abstract iwo.a a();
            
            public abstract a b(final long p0);
            
            public abstract a c();
        }
    }
    
    public enum b
    {
        D0, 
        E0, 
        F0;
        
        public static final b[] G0;
    }
}
