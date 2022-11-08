// 
// Decompiled by Procyon v0.6.0
// 

public final class m3i
{
    public final String a;
    public final String b;
    public final boolean c;
    
    public m3i(final String a, final String b) {
        zzd.f((Object)b, "info");
        this.a = a;
        this.b = b;
        this.c = true;
    }
    
    public m3i(final String a, final String b, final boolean b2, final int n, final hg8 hg8) {
        zzd.f((Object)b, "info");
        this.a = a;
        this.b = b;
        this.c = false;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m3i)) {
            return false;
        }
        final m3i m3i = (m3i)o;
        return zzd.a((Object)this.a, (Object)m3i.a) && zzd.a((Object)this.b, (Object)m3i.b) && this.c == m3i.c;
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
        int c;
        if ((c = (this.c ? 1 : 0)) != 0) {
            c = 1;
        }
        return a + c;
    }
    
    @Override
    public final String toString() {
        return bd.y(mb0.y("NFTInfo(title=", this.a, ", info=", this.b, ", isLink="), this.c, ")");
    }
}
