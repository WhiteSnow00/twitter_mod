// 
// Decompiled by Procyon v0.6.0
// 

public final class w7w
{
    public final String a;
    public final Boolean b;
    public final a c;
    public final b d;
    public final long e;
    public final Boolean f;
    public final Boolean g;
    public final Boolean h;
    public final Boolean i;
    public final Boolean j;
    public final Boolean k;
    public final Boolean l;
    public final Boolean m;
    public final Integer n;
    public final Boolean o;
    public final Boolean p;
    public final Boolean q;
    
    public w7w(final String a, final Boolean b, final a c, final b d, final long e, final Boolean f, final Boolean g, final Boolean h, final Boolean i, final Boolean j, final Boolean k, final Boolean l, final Boolean m, final Integer n, final Boolean o, final Boolean p17, final Boolean q) {
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
        this.p = p17;
        this.q = q;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof w7w)) {
            return false;
        }
        final w7w w7w = (w7w)o;
        return zzd.a((Object)this.a, (Object)w7w.a) && zzd.a((Object)this.b, (Object)w7w.b) && zzd.a((Object)this.c, (Object)w7w.c) && zzd.a((Object)this.d, (Object)w7w.d) && this.e == w7w.e && zzd.a((Object)this.f, (Object)w7w.f) && zzd.a((Object)this.g, (Object)w7w.g) && zzd.a((Object)this.h, (Object)w7w.h) && zzd.a((Object)this.i, (Object)w7w.i) && zzd.a((Object)this.j, (Object)w7w.j) && zzd.a((Object)this.k, (Object)w7w.k) && zzd.a((Object)this.l, (Object)w7w.l) && zzd.a((Object)this.m, (Object)w7w.m) && zzd.a((Object)this.n, (Object)w7w.n) && zzd.a((Object)this.o, (Object)w7w.o) && zzd.a((Object)this.p, (Object)w7w.p) && zzd.a((Object)this.q, (Object)w7w.q);
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
        final Boolean b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final a c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final b d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final long e = this.e;
        final int n = (int)(e ^ e >>> 32);
        final Boolean f = this.f;
        int hashCode6;
        if (f == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = f.hashCode();
        }
        final Boolean g = this.g;
        int hashCode7;
        if (g == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = g.hashCode();
        }
        final Boolean h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final Boolean i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = i.hashCode();
        }
        final Boolean j = this.j;
        int hashCode10;
        if (j == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = j.hashCode();
        }
        final Boolean k = this.k;
        int hashCode11;
        if (k == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = k.hashCode();
        }
        final Boolean l = this.l;
        int hashCode12;
        if (l == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = l.hashCode();
        }
        final Boolean m = this.m;
        int hashCode13;
        if (m == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = m.hashCode();
        }
        final Integer n2 = this.n;
        int hashCode14;
        if (n2 == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = n2.hashCode();
        }
        final Boolean o = this.o;
        int hashCode15;
        if (o == null) {
            hashCode15 = 0;
        }
        else {
            hashCode15 = o.hashCode();
        }
        final Boolean p = this.p;
        int hashCode16;
        if (p == null) {
            hashCode16 = 0;
        }
        else {
            hashCode16 = p.hashCode();
        }
        final Boolean q = this.q;
        if (q != null) {
            hashCode = q.hashCode();
        }
        return (((((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + n) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31 + hashCode12) * 31 + hashCode13) * 31 + hashCode14) * 31 + hashCode15) * 31 + hashCode16) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final Boolean b = this.b;
        final a c = this.c;
        final b d = this.d;
        final long e = this.e;
        final Boolean f = this.f;
        final Boolean g = this.g;
        final Boolean h = this.h;
        final Boolean i = this.i;
        final Boolean j = this.j;
        final Boolean k = this.k;
        final Boolean l = this.l;
        final Boolean m = this.m;
        final Integer n = this.n;
        final Boolean o = this.o;
        final Boolean p = this.p;
        final Boolean q = this.q;
        final StringBuilder sb = new StringBuilder();
        sb.append("User(__typename=");
        sb.append(a);
        sb.append(", dm_muting=");
        sb.append(b);
        sb.append(", legacy=");
        sb.append(c);
        sb.append(", professional=");
        sb.append(d);
        sb.append(", rest_id=");
        sb.append(e);
        sb.append(", super_follow_eligible=");
        sb.append(f);
        sb.append(", super_followed_by=");
        sb.append(g);
        sb.append(", super_following=");
        sb.append(h);
        sb.append(", private_super_following=");
        sb.append(i);
        sb.append(", exclusive_tweet_following=");
        sb.append(j);
        sb.append(", space_device_following=");
        sb.append(k);
        sb.append(", smart_blocked_by=");
        sb.append(l);
        sb.append(", smart_blocking=");
        sb.append(m);
        sb.append(", smart_blocking_expiration=");
        sb.append(n);
        sb.append(", has_nft_avatar=");
        sb.append(o);
        sb.append(", has_spaces=");
        sb.append(p);
        sb.append(", has_twitter_article=");
        sb.append(q);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final uh0 b;
        
        public a(final String a, final uh0 b) {
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
            final uh0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Legacy(__typename=");
            sb.append(a);
            sb.append(", apiUser=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final u3l b;
        
        public b(final String a, final u3l b) {
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
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final u3l b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Professional(__typename=");
            sb.append(a);
            sb.append(", professional=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
