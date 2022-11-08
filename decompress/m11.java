// 
// Decompiled by Procyon v0.6.0
// 

public final class m11
{
    public final String a;
    public final String b;
    public final boolean c;
    
    public m11(final String a, final String b, final boolean c) {
        zzd.f((Object)a, "name");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m11)) {
            return false;
        }
        final m11 m11 = (m11)o;
        return zzd.a((Object)this.a, (Object)m11.a) && zzd.a((Object)this.b, (Object)m11.b) && this.c == m11.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return (hashCode * 31 + hashCode2) * 31 + c;
    }
    
    @Override
    public final String toString() {
        return bd.y(mb0.y("AudioSpaceFeedFilter(name=", this.a, ", icon=", this.b, ", selected="), this.c, ")");
    }
}
