// 
// Decompiled by Procyon v0.6.0
// 

public final class fru
{
    public final b a;
    
    public fru(final b a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof fru && e0e.a((Object)this.a, (Object)((fru)o).a));
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
        sb.append("TweetResultsWithVisibilityResult(result=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final c b;
        public final f1v c;
        
        public a(final String a, final c b, final f1v c) {
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
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b) && e0e.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final c b = this.b;
            final f1v c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnTweetWithVisibilityResults(__typename=");
            sb.append(a);
            sb.append(", tweet=");
            sb.append(b);
            sb.append(", tweetWithVisibilityResultsExcludingTweet=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final a b;
        
        public b(final String a, final a b) {
            e0e.f((Object)a, "__typename");
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
            sb.append(", onTweetWithVisibilityResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final dtb b;
        
        public c(final String a, final dtb b) {
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
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final dtb b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Tweet(__typename=");
            sb.append(a);
            sb.append(", fullTweet=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
