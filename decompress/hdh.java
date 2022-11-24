// 
// Decompiled by Procyon v0.6.0
// 

public final class hdh
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final cgh e;
    public final String f;
    public final edh g;
    public final String h;
    public final String i;
    public final Double j;
    public final String k;
    
    public hdh(final String a, final String b, final String c, final String d, final cgh e, final String f, final edh g, final String h, final String i, final Double j, final String k) {
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
        if (!(o instanceof hdh)) {
            return false;
        }
        final hdh hdh = (hdh)o;
        return e0e.a((Object)this.a, (Object)hdh.a) && e0e.a((Object)this.b, (Object)hdh.b) && e0e.a((Object)this.c, (Object)hdh.c) && e0e.a((Object)this.d, (Object)hdh.d) && e0e.a((Object)this.e, (Object)hdh.e) && e0e.a((Object)this.f, (Object)hdh.f) && e0e.a((Object)this.g, (Object)hdh.g) && e0e.a((Object)this.h, (Object)hdh.h) && e0e.a((Object)this.i, (Object)hdh.i) && e0e.a((Object)this.j, (Object)hdh.j) && e0e.a((Object)this.k, (Object)hdh.k);
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
        final cgh e = this.e;
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
        final edh g = this.g;
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
        final cgh e = this.e;
        final String f = this.f;
        final edh g = this.g;
        final String h = this.h;
        final String i = this.i;
        final Double j = this.j;
        final String k = this.k;
        final StringBuilder l = l58.k("MobileAppMetadata(appId=", a, ", name=", b, ", subtitle=");
        jba.s(l, c, ", description=", d, ", appPrice=");
        l.append(e);
        l.append(", primaryCategoryName=");
        l.append(f);
        l.append(", appIcon=");
        l.append(g);
        l.append(", originalAppIcon=");
        l.append(h);
        l.append(", developerName=");
        l.append(i);
        l.append(", averageStars=");
        l.append(j);
        l.append(", storeUrl=");
        return m51.y(l, k, ")");
    }
}
