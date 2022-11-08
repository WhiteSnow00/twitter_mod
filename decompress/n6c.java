// 
// Decompiled by Procyon v0.6.0
// 

public final class n6c
{
    public final String a;
    
    public n6c(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof n6c && zzd.a((Object)this.a, (Object)((n6c)o).a));
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        return zi.y("GoogleVerificationData(staticMapImageUrl=", this.a, ")");
    }
}
