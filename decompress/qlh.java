// 
// Decompiled by Procyon v0.6.0
// 

public final class qlh
{
    public final String a;
    
    public qlh(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof qlh && czd.a((Object)this.a, (Object)((qlh)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return da8.j("ModuleForDisplay(moduleId=", this.a, ")");
    }
}
