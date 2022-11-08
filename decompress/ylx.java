// 
// Decompiled by Procyon v0.6.0
// 

public final class ylx implements qcw
{
    public final String a;
    
    public ylx(final String a) {
        zzd.f((Object)a, "url");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ylx && zzd.a((Object)this.a, (Object)((ylx)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return zi.y("OnNext(url=", this.a, ")");
    }
}
