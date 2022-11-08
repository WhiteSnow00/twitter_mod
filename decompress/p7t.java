import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class p7t
{
    public final String a;
    public final x7t b;
    public final c c;
    
    public p7t(final String a, final x7t b, final c c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p7t)) {
            return false;
        }
        final p7t p7t = (p7t)o;
        return zzd.a((Object)this.a, (Object)p7t.a) && this.b == p7t.b && zzd.a((Object)this.c, (Object)p7t.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final c c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return (hashCode2 + hashCode * 31) * 31 + hashCode3;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final x7t b = this.b;
        final c c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("TimelineUrl(url=");
        sb.append(a);
        sb.append(", urlType=");
        sb.append(b);
        sb.append(", urtEndpointOptions=");
        sb.append(c);
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
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            return yqh.k("RequestParam(key=", this.a, ", value=", this.b, ")");
        }
    }
    
    public static final class b
    {
        public final String a;
        public final kxs b;
        
        public b(final String a, final kxs b) {
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
            final kxs b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Timeline(__typename=");
            sb.append(a);
            sb.append(", timelineKey=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final b a;
        public final List<a> b;
        public final String c;
        public final String d;
        public final String e;
        
        public c(final b a, final List<a> b, final String c, final String d, final String e) {
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
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            return zzd.a((Object)this.a, (Object)c.a) && zzd.a((Object)this.b, (Object)c.b) && zzd.a((Object)this.c, (Object)c.c) && zzd.a((Object)this.d, (Object)c.d) && zzd.a((Object)this.e, (Object)c.e);
        }
        
        @Override
        public final int hashCode() {
            final b a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final List<a> b = this.b;
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
            final String e = this.e;
            if (e != null) {
                hashCode = e.hashCode();
            }
            return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final b a = this.a;
            final List<a> b = this.b;
            final String c = this.c;
            final String d = this.d;
            final String e = this.e;
            final StringBuilder sb = new StringBuilder();
            sb.append("UrtEndpointOptions(timeline=");
            sb.append(a);
            sb.append(", requestParams=");
            sb.append(b);
            sb.append(", title=");
            mag.m(sb, c, ", subtitle=", d, ", cacheId=");
            return hi.I(sb, e, ")");
        }
    }
}
