// 
// Decompiled by Procyon v0.6.0
// 

public final class lo0
{
    public static final b Companion;
    public static final rlp<lo0> o;
    public final d a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final lxl h;
    public final long i;
    public final z3u j;
    public final z3u k;
    public final z3u l;
    public final String m;
    public final long n;
    
    static {
        Companion = new b();
        lo0.o = new lo0.lo0$c();
    }
    
    public lo0(final d a, final String b, final String c, final String d, final String e, final String f, final String g, final lxl h, final long i, final z3u j, final z3u k, final z3u l, final String m, final long n) {
        czd.f((Object)a, "type");
        czd.f((Object)h, "ratings");
        czd.f((Object)j, "isFree");
        czd.f((Object)k, "isEditorsChoice");
        czd.f((Object)l, "hasInAppPurchases");
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
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof lo0)) {
            return false;
        }
        final lo0 lo0 = (lo0)o;
        return this.a == lo0.a && czd.a((Object)this.b, (Object)lo0.b) && czd.a((Object)this.c, (Object)lo0.c) && czd.a((Object)this.d, (Object)lo0.d) && czd.a((Object)this.e, (Object)lo0.e) && czd.a((Object)this.f, (Object)lo0.f) && czd.a((Object)this.g, (Object)lo0.g) && czd.a((Object)this.h, (Object)lo0.h) && this.i == lo0.i && this.j == lo0.j && this.k == lo0.k && this.l == lo0.l && czd.a((Object)this.m, (Object)lo0.m) && this.n == lo0.n;
    }
    
    @Override
    public final int hashCode() {
        final int f = hmg.f(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final int f2 = hmg.f(this.e, ((f + hashCode2) * 31 + hashCode3) * 31, 31);
        final String f3 = this.f;
        int hashCode4;
        if (f3 == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = f3.hashCode();
        }
        final String g = this.g;
        int hashCode5;
        if (g == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = g.hashCode();
        }
        final int hashCode6 = this.h.hashCode();
        final long i = this.i;
        final int n = (int)(i ^ i >>> 32);
        final int hashCode7 = this.j.hashCode();
        final int hashCode8 = this.k.hashCode();
        final int hashCode9 = this.l.hashCode();
        final String m = this.m;
        if (m != null) {
            hashCode = m.hashCode();
        }
        final long n2 = this.n;
        return ((hashCode9 + (hashCode8 + (hashCode7 + ((hashCode6 + ((f2 + hashCode4) * 31 + hashCode5) * 31) * 31 + n) * 31) * 31) * 31) * 31 + hashCode) * 31 + (int)(n2 ^ n2 >>> 32);
    }
    
    @Override
    public final String toString() {
        final d a = this.a;
        final String b = this.b;
        final String c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final lxl h = this.h;
        final long i = this.i;
        final z3u j = this.j;
        final z3u k = this.k;
        final z3u l = this.l;
        final String m = this.m;
        final long n = this.n;
        final StringBuilder sb = new StringBuilder();
        sb.append("AppStoreData(type=");
        sb.append(a);
        sb.append(", id=");
        sb.append(b);
        sb.append(", url=");
        nb0.z(sb, c, ", urlResolved=", d, ", title=");
        nb0.z(sb, e, ", description=", f, ", category=");
        sb.append(g);
        sb.append(", ratings=");
        sb.append(h);
        sb.append(", numInstalls=");
        sb.append(i);
        sb.append(", isFree=");
        sb.append(j);
        sb.append(", isEditorsChoice=");
        sb.append(k);
        sb.append(", hasInAppPurchases=");
        sb.append(l);
        zip.c(sb, ", iconUrl=", m, ", sizeBytes=");
        return hmg.i(sb, n, ")");
    }
    
    public static final class b
    {
    }
    
    public enum d
    {
        D0, 
        E0, 
        F0, 
        G0;
        
        public static final d[] H0;
    }
}
