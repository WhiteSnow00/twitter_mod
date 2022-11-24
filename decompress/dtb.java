// 
// Decompiled by Procyon v0.6.0
// 

public final class dtb
{
    public final String a;
    public final a b;
    public final z0v c;
    
    public dtb(final String a, final a b, final z0v c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof dtb)) {
            return false;
        }
        final dtb dtb = (dtb)o;
        return e0e.a((Object)this.a, (Object)dtb.a) && e0e.a((Object)this.b, (Object)dtb.b) && e0e.a((Object)this.c, (Object)dtb.c);
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
        return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final a b = this.b;
        final z0v c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("FullTweet(__typename=");
        sb.append(a);
        sb.append(", legacy=");
        sb.append(b);
        sb.append(", tweetWithQuotedStatus=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final d a;
        
        public a(final d a) {
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && e0e.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            final d a = this.a;
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
            final d a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("Legacy(retweeted_status_result=");
            sb.append(a);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final z0v b;
        
        public b(final String a, final z0v b) {
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
            return e0e.a((Object)this.a, (Object)b.a) && e0e.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final z0v b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnTweet(__typename=");
            sb.append(a);
            sb.append(", tweetWithQuotedStatus=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final b b;
        
        public c(final String a, final b b) {
            e0e.f((Object)a, "__typename");
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
            return e0e.a((Object)this.a, (Object)c.a) && e0e.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final b b = this.b;
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
            final b b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Result(__typename=");
            sb.append(a);
            sb.append(", onTweet=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final c b;
        public final pqu c;
        
        public d(final String a, final c b, final pqu c) {
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
            return e0e.a((Object)this.a, (Object)d.a) && e0e.a((Object)this.b, (Object)d.b) && e0e.a((Object)this.c, (Object)d.c);
        }
        
        @Override
        public final int hashCode() {
            final int hashCode = this.a.hashCode();
            final c b = this.b;
            int hashCode2;
            if (b == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = b.hashCode();
            }
            return this.c.hashCode() + (hashCode * 31 + hashCode2) * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final c b = this.b;
            final pqu c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("Retweeted_status_result(__typename=");
            sb.append(a);
            sb.append(", result=");
            sb.append(b);
            sb.append(", tweetResultsMembersExcludingFullTweet=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
}
