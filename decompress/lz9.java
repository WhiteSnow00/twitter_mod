// 
// Decompiled by Procyon v0.6.0
// 

public final class lz9
{
    public final String a;
    public final String b;
    
    public lz9(final String a, final String b) {
        zzd.f((Object)b, "body");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lz9)) {
            return false;
        }
        final lz9 lz9 = (lz9)o;
        return zzd.a((Object)this.a, (Object)lz9.a) && zzd.a((Object)this.b, (Object)lz9.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return yqh.k("EmailContent(subject=", this.a, ", body=", this.b, ")");
    }
}
