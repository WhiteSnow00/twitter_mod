// 
// Decompiled by Procyon v0.6.0
// 

public final class dhr
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    
    public dhr(final String a, final String b, final int c, final int d) {
        czd.f((Object)a, "url");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dhr)) {
            return false;
        }
        final dhr dhr = (dhr)o;
        return czd.a((Object)this.a, (Object)dhr.a) && czd.a((Object)this.b, (Object)dhr.b) && this.c == dhr.c && this.d == dhr.d;
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
        return ((hashCode * 31 + hashCode2) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final int d = this.d;
        final StringBuilder q = tqf.q("StickerImageInfo(url=", a, ", stillImageUrl=", b, ", width=");
        q.append(c);
        q.append(", height=");
        q.append(d);
        q.append(")");
        return q.toString();
    }
}
