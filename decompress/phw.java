import java.util.Map;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phw implements vrd
{
    public final Set<Long> b;
    public final Set<Long> c;
    public final Map<String, Integer> d;
    
    public phw(final a a) {
        Object b;
        if ((b = a.a) == null) {
            b = r3a.F0;
        }
        this.b = (Set<Long>)b;
        Object c;
        if ((c = a.b) == null) {
            c = r3a.F0;
        }
        this.c = (Set<Long>)c;
        Object d;
        if ((d = a.c) == null) {
            d = m3a.F0;
        }
        this.d = (Map<String, Integer>)d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof phw)) {
            return false;
        }
        final phw phw = (phw)o;
        if (!o5j.a((Object)this.b, (Object)phw.b) || !o5j.a((Object)this.c, (Object)phw.c) || !o5j.a((Object)this.d, (Object)phw.d)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return o5j.h((Object)this.b, (Object)this.c, (Object)this.d);
    }
    
    public static final class a extends z4j<phw>
    {
        public Set<Long> a;
        public Set<Long> b;
        public Map<String, Integer> c;
        
        public final Object i() {
            return new phw(this);
        }
    }
}
