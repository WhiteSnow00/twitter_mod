// 
// Decompiled by Procyon v0.6.0
// 

public final class vu2
{
    public final String a;
    
    public vu2(final String a) {
        zzd.f((Object)a, "email");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof vu2 && zzd.a((Object)this.a, (Object)((vu2)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return zi.y("BusinessContactEmailInput(email=", this.a, ")");
    }
}
