// 
// Decompiled by Procyon v0.6.0
// 

public final class llh
{
    public final String a;
    
    public llh(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof llh && zzd.a((Object)this.a, (Object)((llh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return zi.y("ModuleForDisplay(moduleId=", this.a, ")");
    }
}
