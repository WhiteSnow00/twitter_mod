// 
// Decompiled by Procyon v0.6.0
// 

public final class po0
{
    public final a a;
    public final b b;
    public final c c;
    public final Boolean d;
    public final String e;
    public final Boolean f;
    public final Boolean g;
    public final String h;
    public final d i;
    public final String j;
    public final e k;
    public final si3 l;
    public final String m;
    public final String n;
    
    public po0(final a a, final b b, final c c, final Boolean d, final String e, final Boolean f, final Boolean g, final String h, final d i, final String j, final e k, final si3 l, final String m, final String n) {
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
        if (!(o instanceof po0)) {
            return false;
        }
        final po0 po0 = (po0)o;
        return zzd.a((Object)this.a, (Object)po0.a) && zzd.a((Object)this.b, (Object)po0.b) && zzd.a((Object)this.c, (Object)po0.c) && zzd.a((Object)this.d, (Object)po0.d) && zzd.a((Object)this.e, (Object)po0.e) && zzd.a((Object)this.f, (Object)po0.f) && zzd.a((Object)this.g, (Object)po0.g) && zzd.a((Object)this.h, (Object)po0.h) && zzd.a((Object)this.i, (Object)po0.i) && zzd.a((Object)this.j, (Object)po0.j) && zzd.a((Object)this.k, (Object)po0.k) && this.l == po0.l && zzd.a((Object)this.m, (Object)po0.m) && zzd.a((Object)this.n, (Object)po0.n);
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
        final b b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final c c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final int a2 = l7k.a(this.e, (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31, 31);
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
        final String h = this.h;
        int hashCode8;
        if (h == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = h.hashCode();
        }
        final d i = this.i;
        int hashCode9;
        if (i == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = i.hashCode();
        }
        final String j = this.j;
        int hashCode10;
        if (j == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = j.hashCode();
        }
        final e k = this.k;
        int hashCode11;
        if (k == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = k.hashCode();
        }
        final int hashCode12 = this.l.hashCode();
        final String m = this.m;
        int hashCode13;
        if (m == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = m.hashCode();
        }
        final String n = this.n;
        if (n != null) {
            hashCode = n.hashCode();
        }
        return ((hashCode12 + ((((((a2 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode11) * 31) * 31 + hashCode13) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final b b = this.b;
        final c c = this.c;
        final Boolean d = this.d;
        final String e = this.e;
        final Boolean f = this.f;
        final Boolean g = this.g;
        final String h = this.h;
        final d i = this.i;
        final String j = this.j;
        final e k = this.k;
        final si3 l = this.l;
        final String m = this.m;
        final String n = this.n;
        final StringBuilder sb = new StringBuilder();
        sb.append("AppStoreData(app_icon_media_results=");
        sb.append(a);
        sb.append(", category=");
        sb.append(b);
        sb.append(", description=");
        sb.append(c);
        sb.append(", has_in_app_purchases=");
        sb.append(d);
        sb.append(", id=");
        sb.append(e);
        sb.append(", is_editors_choice=");
        sb.append(f);
        sb.append(", is_free=");
        sb.append(g);
        sb.append(", num_installs=");
        sb.append(h);
        sb.append(", ratings=");
        sb.append(i);
        sb.append(", size_bytes=");
        sb.append(j);
        sb.append(", title=");
        sb.append(k);
        sb.append(", type=");
        sb.append(l);
        sb.append(", url=");
        return hi.J(sb, m, ", url_resolved=", n, ")");
    }
    
    public static final class a
    {
        public final String a;
        public final vg0 b;
        
        public a(final String a, final vg0 b) {
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
            final vg0 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("App_icon_media_results(__typename=");
            sb.append(a);
            sb.append(", apiMediaResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final iy8 b;
        
        public b(final String a, final iy8 b) {
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
            final iy8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Category(__typename=");
            sb.append(a);
            sb.append(", directionalStringElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final iy8 b;
        
        public c(final String a, final iy8 b) {
            this.a = a;
            this.b = b;
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
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final iy8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Description(__typename=");
            sb.append(a);
            sb.append(", directionalStringElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final Double b;
        
        public d(final String a, final Double b) {
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
            final String a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final Double b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final Double b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Ratings(count=");
            sb.append(a);
            sb.append(", star=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final iy8 b;
        
        public e(final String a, final iy8 b) {
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
            final iy8 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Title(__typename=");
            sb.append(a);
            sb.append(", directionalStringElement=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}