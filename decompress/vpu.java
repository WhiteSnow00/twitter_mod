// 
// Decompiled by Procyon v0.6.0
// 

public final class vpu
{
    public final b a;
    
    public vpu(final b a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof vpu && zzd.a((Object)this.a, (Object)((vpu)o).a));
    }
    
    @Override
    public final int hashCode() {
        final b a = this.a;
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
        final b a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetResultsTweetUnavailable(result=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final auu b;
        public final String c;
        
        public a(final String a, final auu b, final String c) {
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
            return zzd.a((Object)this.a, (Object)a.a) && this.b == a.b && zzd.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final int hashCode2 = this.b.hashCode();
            final String c = this.c;
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
            final auu b = this.b;
            final String c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnTweetUnavailable(__typename=");
            sb.append(a);
            sb.append(", reason=");
            sb.append(b);
            sb.append(", message=");
            return hi.I(sb, c, ")");
        }
    }
    
    public static final class b
    {
        public final String a;
        public final a b;
        
        public b(final String a, final a b) {
            zzd.f((Object)a, "__typename");
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
            final int hashCode = this.a.hashCode();
            final a b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return hashCode * 31 + hashCode2;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final a b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", onTweetUnavailable=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
