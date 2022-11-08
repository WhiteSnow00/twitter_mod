import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xug
{
    public final List<Integer> a;
    public final Integer b;
    public final List<a> c;
    
    public xug(final List<Integer> a, final Integer b, final List<a> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof xug)) {
            return false;
        }
        final xug xug = (xug)o;
        return zzd.a((Object)this.a, (Object)xug.a) && zzd.a((Object)this.b, (Object)xug.b) && zzd.a((Object)this.c, (Object)xug.c);
    }
    
    @Override
    public final int hashCode() {
        final List<Integer> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Integer b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final List<a> c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final List<Integer> a = this.a;
        final Integer b = this.b;
        final List<a> c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaEntityVideoInfo(aspect_ratio=");
        sb.append(a);
        sb.append(", duration_millis=");
        sb.append(b);
        sb.append(", variants=");
        return gp.A(sb, (List)c, ")");
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final Integer c;
        
        public a(final String a, final String b, final Integer c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return zzd.a((Object)this.a, (Object)a.a) && zzd.a((Object)this.b, (Object)a.b) && zzd.a((Object)this.c, (Object)a.c);
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
            final Integer c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            return hy8.p(mb0.y("Variant(url=", this.a, ", content_type=", this.b, ", bitrate="), this.c, ")");
        }
    }
}
