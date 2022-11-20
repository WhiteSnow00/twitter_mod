import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rtg
{
    public final a a;
    public final c b;
    
    public rtg(final a a, final c b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rtg)) {
            return false;
        }
        final rtg rtg = (rtg)o;
        return czd.a((Object)this.a, (Object)rtg.a) && czd.a((Object)this.b, (Object)rtg.b);
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
        final c b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final a a = this.a;
        final c b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("MediaEntityFeatures(all=");
        sb.append(a);
        sb.append(", large=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final List<d> a;
        
        public a(final List<d> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && czd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            final List<d> a = this.a;
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
            return wc0.z("All(tags=", (List)this.a, ")");
        }
    }
    
    public static final class b
    {
        public final Integer a;
        public final Integer b;
        public final Integer c;
        public final Integer d;
        
        public b(final Integer a, final Integer b, final Integer c, final Integer d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
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
            return czd.a((Object)this.a, (Object)b.a) && czd.a((Object)this.b, (Object)b.b) && czd.a((Object)this.c, (Object)b.c) && czd.a((Object)this.d, (Object)b.d);
        }
        
        @Override
        public final int hashCode() {
            final Integer a = this.a;
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
            final Integer c = this.c;
            int hashCode4;
            if (c == null) {
                hashCode4 = 0;
            }
            else {
                hashCode4 = c.hashCode();
            }
            final Integer d = this.d;
            if (d != null) {
                hashCode = d.hashCode();
            }
            return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final Integer a = this.a;
            final Integer b = this.b;
            final Integer c = this.c;
            final Integer d = this.d;
            final StringBuilder sb = new StringBuilder();
            sb.append("Face(x=");
            sb.append(a);
            sb.append(", y=");
            sb.append(b);
            sb.append(", h=");
            sb.append(c);
            sb.append(", w=");
            sb.append(d);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final List<b> a;
        
        public c(final List<b> a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof c && czd.a((Object)this.a, (Object)((c)o).a));
        }
        
        @Override
        public final int hashCode() {
            final List<b> a = this.a;
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
            return wc0.z("Large(faces=", (List)this.a, ")");
        }
    }
    
    public static final class d
    {
        public final String a;
        public final String b;
        public final String c;
        
        public d(final String a, final String b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
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
            return czd.a((Object)this.a, (Object)d.a) && czd.a((Object)this.b, (Object)d.b) && czd.a((Object)this.c, (Object)d.c);
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
            final String c = this.c;
            if (c != null) {
                hashCode = c.hashCode();
            }
            return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            return ed.B(tqf.q("Tag(user_id=", this.a, ", name=", this.b, ", screen_name="), this.c, ")");
        }
    }
}
