// 
// Decompiled by Procyon v0.6.0
// 

public final class ko0
{
    public static final b Companion;
    public static final nmp<ko0> o;
    public final d a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final vxl h;
    public final long i;
    public final s4u j;
    public final s4u k;
    public final s4u l;
    public final String m;
    public final long n;
    
    static {
        Companion = new b();
        ko0.o = new ko0.ko0$c();
    }
    
    public ko0(final d a, final String b, final String c, final String d, final String e, final String f, final String g, final vxl h, final long i, final s4u j, final s4u k, final s4u l, final String m, final long n) {
        e0e.f((Object)a, "type");
        e0e.f((Object)h, "ratings");
        e0e.f((Object)j, "isFree");
        e0e.f((Object)k, "isEditorsChoice");
        e0e.f((Object)l, "hasInAppPurchases");
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
        if (!(o instanceof ko0)) {
            return false;
        }
        final ko0 ko0 = (ko0)o;
        return this.a == ko0.a && e0e.a((Object)this.b, (Object)ko0.b) && e0e.a((Object)this.c, (Object)ko0.c) && e0e.a((Object)this.d, (Object)ko0.d) && e0e.a((Object)this.e, (Object)ko0.e) && e0e.a((Object)this.f, (Object)ko0.f) && e0e.a((Object)this.g, (Object)ko0.g) && e0e.a((Object)this.h, (Object)ko0.h) && this.i == ko0.i && this.j == ko0.j && this.k == ko0.k && this.l == ko0.l && e0e.a((Object)this.m, (Object)ko0.m) && this.n == ko0.n;
    }
    
    @Override
    public final int hashCode() {
        final int d = brg.d(this.b, this.a.hashCode() * 31, 31);
        final String c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final String d2 = this.d;
        int hashCode3;
        if (d2 == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d2.hashCode();
        }
        final int d3 = brg.d(this.e, ((d + hashCode2) * 31 + hashCode3) * 31, 31);
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
        return ((hashCode9 + (hashCode8 + (hashCode7 + ((hashCode6 + ((d3 + hashCode4) * 31 + hashCode5) * 31) * 31 + n) * 31) * 31) * 31) * 31 + hashCode) * 31 + (int)(n2 ^ n2 >>> 32);
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
        final vxl h = this.h;
        final long i = this.i;
        final s4u j = this.j;
        final s4u k = this.k;
        final s4u l = this.l;
        final String m = this.m;
        final long n = this.n;
        final StringBuilder sb = new StringBuilder();
        sb.append("AppStoreData(type=");
        sb.append(a);
        sb.append(", id=");
        sb.append(b);
        sb.append(", url=");
        jba.s(sb, c, ", urlResolved=", d, ", title=");
        jba.s(sb, e, ", description=", f, ", category=");
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
        ffe.q(sb, ", iconUrl=", m, ", sizeBytes=");
        return ang.c(sb, n, ")");
    }
    
    public static final class a extends z4j<ko0>
    {
        public d a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public vxl h;
        public long i;
        public s4u j;
        public s4u k;
        public s4u l;
        public String m;
        public long n;
        
        public a() {
            this(null, null, null, null, null, null, null, null, 0L, null, null, null, null, 0L, 16383, null);
        }
        
        public a(final d d, final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final vxl vxl, final long n, final s4u s4u, final s4u s4u2, final s4u s4u3, final String s7, final long n2, final int n3, final wg8 wg8) {
            final s4u f0 = s4u.F0;
            final d i0 = d.I0;
            final vxl h = (vxl)((z4j)new vxl$a(0.0f, 0L, 3, (wg8)null)).e();
            this.a = i0;
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = h;
            this.i = 0L;
            this.j = f0;
            this.k = f0;
            this.l = f0;
            this.m = null;
            this.n = 0L;
        }
        
        public final Object i() {
            final d a = this.a;
            final String b = this.b;
            e0e.c((Object)b);
            final String c = this.c;
            final String d = this.d;
            final String e = this.e;
            e0e.c((Object)e);
            return new ko0(a, b, c, d, e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        }
        
        public final boolean k() {
            return this.a != ko0.d.I0 && flr.g((CharSequence)this.b);
        }
        
        public final a o(final String b) {
            e0e.f((Object)b, "id");
            this.b = b;
            return this;
        }
        
        public final a p(final String e) {
            e0e.f((Object)e, "title");
            this.e = e;
            return this;
        }
        
        public final a q(final d a) {
            e0e.f((Object)a, "type");
            this.a = a;
            return this;
        }
    }
    
    public static final class b
    {
    }
    
    public enum d
    {
        F0, 
        G0, 
        H0, 
        I0;
        
        public static final d[] J0;
    }
}
