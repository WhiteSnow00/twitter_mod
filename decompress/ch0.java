import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ch0
{
    public final a a;
    public final b b;
    public final List<Double> c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final d j;
    
    public ch0(final a a, final b b, final List<Double> c, final String d, final String e, final String f, final String g, final String h, final String i, final d j) {
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
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ch0)) {
            return false;
        }
        final ch0 ch0 = (ch0)o;
        return zzd.a((Object)this.a, (Object)ch0.a) && zzd.a((Object)this.b, (Object)ch0.b) && zzd.a((Object)this.c, (Object)ch0.c) && zzd.a((Object)this.d, (Object)ch0.d) && zzd.a((Object)this.e, (Object)ch0.e) && zzd.a((Object)this.f, (Object)ch0.f) && zzd.a((Object)this.g, (Object)ch0.g) && zzd.a((Object)this.h, (Object)ch0.h) && zzd.a((Object)this.i, (Object)ch0.i) && zzd.a((Object)this.j, (Object)ch0.j);
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
        final List<Double> c = this.c;
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
        final String e = this.e;
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
        final String g = this.g;
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
        final d j = this.j;
        if (j != null) {
            hashCode = j.hashCode();
        }
        return ((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final b b = this.b;
        final List<Double> c = this.c;
        final String d = this.d;
        final String e = this.e;
        final String f = this.f;
        final String g = this.g;
        final String h = this.h;
        final String i = this.i;
        final d j = this.j;
        final StringBuilder sb = new StringBuilder();
        sb.append("ApiPlace(attributes=");
        sb.append(a);
        sb.append(", bounding_box=");
        sb.append(b);
        sb.append(", centroid=");
        sb.append(c);
        sb.append(", country=");
        sb.append(d);
        sb.append(", country_code=");
        mag.m(sb, e, ", full_name=", f, ", id=");
        mag.m(sb, g, ", name=", h, ", place_type=");
        sb.append(i);
        sb.append(", vendor_info=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        
        public a(final String a, final String b) {
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
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            return yqh.k("Attributes(street_address=", this.a, ", twitter=", this.b, ")");
        }
    }
    
    public static final class b
    {
        public final List<List<List<Double>>> a;
        public final String b;
        
        public b(final List<? extends List<? extends List<Double>>> a, final String b) {
            this.a = (List<List<List<Double>>>)a;
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
            final List<List<List<Double>>> a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final String b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final List<List<List<Double>>> a = this.a;
            final String b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Bounding_box(coordinates=");
            sb.append(a);
            sb.append(", type=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        
        public c(final String a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && zzd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            final String a = this.a;
            int hashCode;
            if (a == null) {
                hashCode = 0;
            }
            else {
                hashCode = a.hashCode();
            }
            return hashCode;
        }
        
        @Override
        public final String toString() {
            return zi.y("Foursquare(venue_id=", this.a, ")");
        }
    }
    
    public static final class d
    {
        public final c a;
        public final e b;
        
        public d(final c a, final e b) {
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
            final c a = this.a;
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
            final c a = this.a;
            final e b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Vendor_info(foursquare=");
            sb.append(a);
            sb.append(", yelp=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class e
    {
        public final String a;
        public final String b;
        public final Double c;
        public final Integer d;
        public final String e;
        
        public e(final String a, final String b, final Double c, final Integer d, final String e) {
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
            if (!(o instanceof e)) {
                return false;
            }
            final e e = (e)o;
            return zzd.a((Object)this.a, (Object)e.a) && zzd.a((Object)this.b, (Object)e.b) && zzd.a((Object)this.c, (Object)e.c) && zzd.a((Object)this.d, (Object)e.d) && zzd.a((Object)this.e, (Object)e.e);
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
            final Double c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final Integer d = this.d;
            int hashCode5;
            if (d == null) {
                hashCode5 = 0;
            }
            else {
                hashCode5 = d.hashCode();
            }
            final String e = this.e;
            if (e != null) {
                hashCode = e.hashCode();
            }
            return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final String b = this.b;
            final Double c = this.c;
            final Integer d = this.d;
            final String e = this.e;
            final StringBuilder y = mb0.y("Yelp(business_id=", a, ", mobile_url=", b, ", rating=");
            y.append(c);
            y.append(", review_count=");
            y.append(d);
            y.append(", url=");
            return hi.I(y, e, ")");
        }
    }
}
