import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ib4
{
    public final List<hb4> a;
    
    public ib4(final List<hb4> a) {
        zzd.f((Object)a, "claims");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ib4 && zzd.a((Object)this.a, (Object)((ib4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return du1.x("Claims(claims=", (List)this.a, ")");
    }
}
