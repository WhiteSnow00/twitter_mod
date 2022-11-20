// 
// Decompiled by Procyon v0.6.0
// 

public final class k33
{
    public final String a;
    
    public k33(final String a) {
        czd.f((Object)a, "timezone");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof k33 && czd.a((Object)this.a, (Object)((k33)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return da8.j("BusinessTimezoneInput(timezone=", this.a, ")");
    }
}
