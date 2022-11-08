// 
// Decompiled by Procyon v0.6.0
// 

public final class z0i implements oax
{
    public final String a;
    public final String b;
    
    public z0i() {
        this.a = null;
        this.b = null;
    }
    
    public z0i(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public z0i(final String s, final String s2, final int n, final hg8 hg8) {
        this.a = null;
        this.b = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof z0i)) {
            return false;
        }
        final z0i z0i = (z0i)o;
        return zzd.a((Object)this.a, (Object)z0i.a) && zzd.a((Object)this.b, (Object)z0i.b);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return yqh.k("NFTCollectionViewState(name=", this.a, ", address=", this.b, ")");
    }
}
