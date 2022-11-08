// 
// Decompiled by Procyon v0.6.0
// 

public final class znb implements dns
{
    public final float a;
    
    public znb() {
        this.a = 0.5f;
    }
    
    public final float a(final dp8 dp8, final float n, final float n2) {
        zzd.f((Object)dp8, "<this>");
        return bp7.y(n, n2, this.a);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof znb && zzd.a((Object)this.a, (Object)((znb)o).a));
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }
    
    @Override
    public final String toString() {
        return x30.E(w48.g("FractionalThreshold(fraction="), this.a, ')');
    }
}
