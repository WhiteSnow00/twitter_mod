// 
// Decompiled by Procyon v0.6.0
// 

public final class r6c
{
    public final String a;
    
    public r6c(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof r6c && e0e.a((Object)this.a, (Object)((r6c)o).a));
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
        return c0e.h("GoogleVerificationData(staticMapImageUrl=", this.a, ")");
    }
}
