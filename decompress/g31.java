import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class g31
{
    public final List<d31> a;
    
    public g31(final List<d31> a) {
        zzd.f((Object)a, "items");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof g31 && zzd.a((Object)this.a, (Object)((g31)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("AudioSpaceSharingResponse(items=", (List)this.a, ")");
    }
}
