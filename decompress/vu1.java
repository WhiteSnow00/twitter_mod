import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vu1
{
    public final Set<x00> a;
    
    public vu1(final Set<? extends x00> a) {
        zzd.f((Object)a, "metadata");
        this.a = (Set<x00>)a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof vu1 && zzd.a((Object)this.a, (Object)((vu1)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final Set<x00> a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("BceMetadataContext(metadata=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
}
