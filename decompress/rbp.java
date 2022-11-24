import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rbp
{
    public final List<qzb> a;
    
    public rbp() {
        this(null, 1, null);
    }
    
    public rbp(final List<? extends qzb> a) {
        this.a = (List<qzb>)a;
        if (a != null) {
            a.isEmpty();
        }
    }
    
    public rbp(final List list, final int n, final wg8 wg8) {
        this(null);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof rbp && e0e.a((Object)this.a, (Object)((rbp)o).a));
    }
    
    @Override
    public final int hashCode() {
        final List<qzb> a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        return rh.x("Section(components=", (List)this.a, ")");
    }
}
