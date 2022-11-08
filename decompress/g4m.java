import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g4m
{
    public final List<m31> a;
    public final List<m31> b;
    
    public g4m(final List<m31> a) {
        this.a = a;
        final HashSet set = new HashSet();
        final ArrayList b = new ArrayList();
        for (final m31 next : a) {
            if (set.add(next.a)) {
                b.add(next);
            }
        }
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g4m && zzd.a((Object)this.a, (Object)((g4m)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("RecommendedSpaceTopicsResponse(topics=", (List)this.a, ")");
    }
}
