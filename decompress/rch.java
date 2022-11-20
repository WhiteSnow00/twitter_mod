// 
// Decompiled by Procyon v0.6.0
// 

public final class rch
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ofh e;
    public final String f;
    public final och g;
    public final String h;
    public final String i;
    public final Double j;
    public final String k;
    
    public rch(final String a, final String b, final String c, final String d, final ofh e, final String f, final och g, final String h, final String i, final Double j, final String k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rch)) {
            return false;
        }
        final rch rch = (rch)o;
        return czd.a((Object)this.a, (Object)rch.a) && czd.a((Object)this.b, (Object)rch.b) && czd.a((Object)this.c, (Object)rch.c) && czd.a((Object)this.d, (Object)rch.d) && czd.a((Object)this.e, (Object)rch.e) && czd.a((Object)this.f, (Object)rch.f) && czd.a((Object)this.g, (Object)rch.g) && czd.a((Object)this.h, (Object)rch.h) && czd.a((Object)this.i, (Object)rch.i) && czd.a((Object)this.j, (Object)rch.j) && czd.a((Object)this.k, (Object)rch.k);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final ofh e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final och g = this.g;
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final Double j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final String k = this.k;
        if (k != null) {
            hashCode2 = k.hashCode();
        }
        return (((((((((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final ofh e = this.e;
        final String f = this.f;
        final och g = this.g;
        final String h = this.h;
        final String i = this.i;
        final Double j = this.j;
        final String k = this.k;
        final StringBuilder q = tqf.q("MobileAppMetadata(appId=", a, ", name=", b, ", subtitle=");
        nb0.z(q, c, ", description=", d, ", appPrice=");
        q.append(e);
        q.append(", primaryCategoryName=");
        q.append(f);
        q.append(", appIcon=");
        q.append(g);
        q.append(", originalAppIcon=");
        q.append(h);
        q.append(", developerName=");
        q.append(i);
        q.append(", averageStars=");
        q.append(j);
        q.append(", storeUrl=");
        return ed.B(q, k, ")");
    }
}
