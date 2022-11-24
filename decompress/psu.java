import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class psu implements vrd
{
    public static final nmp<psu> c;
    public final Set<Long> b;
    
    static {
        psu.c = new psu.psu$b();
    }
    
    public psu(final a a) {
        Object b;
        if ((b = a.a) == null) {
            b = r3a.F0;
        }
        this.b = (Set<Long>)b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof psu && o5j.a((Object)this.b, (Object)((psu)o).b));
    }
    
    @Override
    public final int hashCode() {
        return o5j.e((Iterable)this.b);
    }
    
    public static final class a extends z4j<psu>
    {
        public Set<Long> a;
        
        public final Object i() {
            return new psu(this);
        }
    }
}
