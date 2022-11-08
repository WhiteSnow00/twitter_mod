// 
// Decompiled by Procyon v0.6.0
// 

public final class k3l
{
    public final long a;
    public final String b;
    public final Long c;
    public final Integer d;
    public final String e;
    
    public k3l(final long a, final String b, final Long c, final Integer d, final String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k3l)) {
            return false;
        }
        final k3l k3l = (k3l)o;
        return this.a == k3l.a && zzd.a((Object)this.b, (Object)k3l.b) && zzd.a((Object)this.c, (Object)k3l.c) && zzd.a((Object)this.d, (Object)k3l.d) && zzd.a((Object)this.e, (Object)k3l.e);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int a2 = l7k.a(this.b, (int)(a ^ a >>> 32) * 31, 31);
        final Long c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return ((a2 + hashCode2) * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final Long c = this.c;
        final Integer d = this.d;
        final String e = this.e;
        final StringBuilder h = w48.h("ProductMetadata(regularPriceMicros=", a, ", currencyCode=", b);
        h.append(", salePriceMicros=");
        h.append(c);
        h.append(", numRatings=");
        h.append(d);
        return xa0.B(h, ", rating=", e, ")");
    }
}
