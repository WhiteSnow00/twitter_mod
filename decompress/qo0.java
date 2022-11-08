// 
// Decompiled by Procyon v0.6.0
// 

public final class qo0
{
    public static final b Companion;
    public static final alp<qo0> o;
    public final d a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final vwl h;
    public final long i;
    public final k3u j;
    public final k3u k;
    public final k3u l;
    public final String m;
    public final long n;
    
    static {
        Companion = new b();
        qo0.o = new qo0.qo0$c();
    }
    
    public qo0(final d a, final String b, final String c, final String d, final String e, final String f, final String g, final vwl h, final long i, final k3u j, final k3u k, final k3u l, final String m, final long n) {
        zzd.f((Object)a, "type");
        zzd.f((Object)h, "ratings");
        zzd.f((Object)j, "isFree");
        zzd.f((Object)k, "isEditorsChoice");
        zzd.f((Object)l, "hasInAppPurchases");
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
        if (!(o instanceof qo0)) {
            return false;
        }
        final qo0 qo0 = (qo0)o;
        return this.a == qo0.a && zzd.a((Object)this.b, (Object)qo0.b) && zzd.a((Object)this.c, (Object)qo0.c) && zzd.a((Object)this.d, (Object)qo0.d) && zzd.a((Object)this.e, (Object)qo0.e) && zzd.a((Object)this.f, (Object)qo0.f) && zzd.a((Object)this.g, (Object)qo0.g) && zzd.a((Object)this.h, (Object)qo0.h) && this.i == qo0.i && this.j == qo0.j && this.k == qo0.k && this.l == qo0.l && zzd.a((Object)this.m, (Object)qo0.m) && this.n == qo0.n;
    }
    
    @Override
    public final int hashCode() {
        final int a = l7k.a(this.b, this.a.hashCode() * 31, 31);
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
        final int a2 = l7k.a(this.e, ((a + hashCode2) * 31 + hashCode3) * 31, 31);
        final String f = this.f;
        int hashCode4;
        if (f == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = f.hashCode();
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
        return ((hashCode9 + (hashCode8 + (hashCode7 + ((hashCode6 + ((a2 + hashCode4) * 31 + hashCode5) * 31) * 31 + n) * 31) * 31) * 31) * 31 + hashCode) * 31 + (int)(n2 ^ n2 >>> 32);
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
        final vwl h = this.h;
        final long i = this.i;
        final k3u j = this.j;
        final k3u k = this.k;
        final k3u l = this.l;
        final String m = this.m;
        final long n = this.n;
        final StringBuilder sb = new StringBuilder();
        sb.append("AppStoreData(type=");
        sb.append(a);
        sb.append(", id=");
        sb.append(b);
        sb.append(", url=");
        mag.m(sb, c, ", urlResolved=", d, ", title=");
        mag.m(sb, e, ", description=", f, ", category=");
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
        aob.h(sb, ", iconUrl=", m, ", sizeBytes=");
        return b8b.r(sb, n, ")");
    }
    
    public static final class b
    {
    }
    
    public enum d
    {
        C0, 
        D0, 
        E0, 
        F0;
    }
}
