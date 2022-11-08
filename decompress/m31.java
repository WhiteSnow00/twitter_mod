// 
// Decompiled by Procyon v0.6.0
// 

public final class m31
{
    public final String a;
    public final String b;
    
    public m31(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m31)) {
            return false;
        }
        final m31 m31 = (m31)o;
        return zzd.a((Object)this.a, (Object)m31.a) && zzd.a((Object)this.b, (Object)m31.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        return yqh.k("AudioSpaceTopic(restId=", this.a, ", name=", this.b, ")");
    }
}
