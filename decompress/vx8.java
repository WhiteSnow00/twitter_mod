// 
// Decompiled by Procyon v0.6.0
// 

public final class vx8
{
    public final long a;
    public final c b;
    public final Boolean c;
    
    public vx8(final long a, final c b, final Boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vx8)) {
            return false;
        }
        final vx8 vx8 = (vx8)o;
        return this.a == vx8.a && zzd.a((Object)this.b, (Object)vx8.b) && zzd.a((Object)this.c, (Object)vx8.c);
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final c b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final Boolean c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (n * 31 + hashCode2) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final c b = this.b;
        final Boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("DirectMessageUser(rest_id=");
        sb.append(a);
        sb.append(", legacy=");
        sb.append(b);
        sb.append(", has_nft_avatar=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final r7a b;
        
        public a(final String a, final r7a b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final r7a b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Description(__typename=");
            sb.append(a);
            sb.append(", entitySet=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final a a;
        public final e b;
        
        public b(final a a, final e b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return zzd.a((Object)this.a, (Object)b.a) && zzd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            final a a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final e b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final a a = this.a;
            final e b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Entities(description=");
            sb.append(a);
            sb.append(", url=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final String b;
        public final b c;
        public final String d;
        public final Boolean e;
        public final Boolean f;
        public final Integer g;
        public final Integer h;
        public final String i;
        public final String j;
        public final d k;
        public final Boolean l;
        public final Boolean m;
        public final hi0 n;
        public final Boolean o;
        
        public c(final String a, final String b, final b c, final String d, final Boolean e, final Boolean f, final Integer g, final Integer h, final String i, final String j, final d k, final Boolean l, final Boolean m, final hi0 n, final Boolean o) {
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
            this.o = o;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b) && zzd.a((Object)this.c, (Object)c.c) && zzd.a((Object)this.d, (Object)c.d) && zzd.a((Object)this.e, (Object)c.e) && zzd.a((Object)this.f, (Object)c.f) && zzd.a((Object)this.g, (Object)c.g) && zzd.a((Object)this.h, (Object)c.h) && zzd.a((Object)this.i, (Object)c.i) && zzd.a((Object)this.j, (Object)c.j) && zzd.a((Object)this.k, (Object)c.k) && zzd.a((Object)this.l, (Object)c.l) && zzd.a((Object)this.m, (Object)c.m) && this.n == c.n && zzd.a((Object)this.o, (Object)c.o);
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
            int hashCode3;
            if (b == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = b.hashCode();
            }
            final b c = this.c;
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
            final Boolean e = this.e;
            int hashCode6;
            if (e == null) {
                hashCode6 = 0;
            }
            else {
                hashCode6 = e.hashCode();
            }
            final Boolean f = this.f;
            int hashCode7;
            if (f == null) {
                hashCode7 = 0;
            }
            else {
                hashCode7 = f.hashCode();
            }
            final Integer g = this.g;
            int hashCode8;
            if (g == null) {
                hashCode8 = 0;
            }
            else {
                hashCode8 = g.hashCode();
            }
            final Integer h = this.h;
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
            final String j = this.j;
            int hashCode11;
            if (j == null) {
                hashCode11 = 0;
            }
            else {
                hashCode11 = j.hashCode();
            }
            final d k = this.k;
            int hashCode12;
            if (k == null) {
                hashCode12 = 0;
            }
            else {
                hashCode12 = k.hashCode();
            }
            final Boolean l = this.l;
            int hashCode13;
            if (l == null) {
                hashCode13 = 0;
            }
            else {
                hashCode13 = l.hashCode();
            }
            final Boolean m = this.m;
            int hashCode14;
            if (m == null) {
                hashCode14 = 0;
            }
            else {
                hashCode14 = m.hashCode();
            }
            final hi0 n = this.n;
            int hashCode15;
            if (n == null) {
                hashCode15 = 0;
            }
            else {
                hashCode15 = n.hashCode();
            }
            final Boolean o = this.o;
            if (o != null) {
                hashCode = o.hashCode();
            }
            return (((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final b c = this.c;
            final String d = this.d;
            final Boolean e = this.e;
            final Boolean f = this.f;
            final Integer g = this.g;
            final Integer h = this.h;
            final String i = this.i;
            final String j = this.j;
            final d k = this.k;
            final Boolean l = this.l;
            final Boolean m = this.m;
            final hi0 n = this.n;
            final Boolean o = this.o;
            final StringBuilder y = mb0.y("Legacy(screen_name=", a, ", created_at=", b, ", entities=");
            y.append(c);
            y.append(", description=");
            y.append(d);
            y.append(", follow_request_sent=");
            y.append(e);
            y.append(", following=");
            y.append(f);
            y.append(", followers_count=");
            y.append(g);
            y.append(", friends_count=");
            y.append(h);
            y.append(", name=");
            mag.m(y, i, ", profile_image_url_https=", j, ", profile_image_extensions=");
            y.append(k);
            y.append(", protected=");
            y.append(l);
            y.append(", verified=");
            y.append(m);
            y.append(", verified_type=");
            y.append(n);
            y.append(", blocking=");
            y.append(o);
            y.append(")");
            return y.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final dg0 b;
        
        public d(final String a, final dg0 b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            return zzd.a((Object)this.a, (Object)d.a) && zzd.a((Object)this.b, (Object)d.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final dg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Profile_image_extensions(__typename=");
            sb.append(a);
            sb.append(", apiMediaExtensions=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final r7a b;
        
        public e(final String a, final r7a b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return zzd.a((Object)this.a, (Object)e.a) && zzd.a((Object)this.b, (Object)e.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final r7a b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Url(__typename=");
            sb.append(a);
            sb.append(", entitySet=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
