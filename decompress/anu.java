// 
// Decompiled by Procyon v0.6.0
// 

public final class anu
{
    public final String a;
    public final a b;
    
    public anu(final String a, final a b) {
        czd.f((Object)a, "__typename");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof anu)) {
            return false;
        }
        final anu anu = (anu)o;
        return czd.a((Object)this.a, (Object)anu.a) && czd.a((Object)this.b, (Object)anu.b);
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
        sb.append("TweetInterstitial(__typename=");
        sb.append(a);
        sb.append(", onContextualTweetInterstitial=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final cnu a;
        public final c b;
        public final b c;
        
        public a(final cnu a, final c b, final b c) {
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
            return this.a == a.a && czd.a((Object)this.b, (Object)a.b) && czd.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31;
        }
        
        @Override
        public final String toString() {
            final cnu a = this.a;
            final c b = this.b;
            final b c = this.c;
            final StringBuilder sb = new StringBuilder();
            sb.append("OnContextualTweetInterstitial(display_type=");
            sb.append(a);
            sb.append(", text=");
            sb.append(b);
            sb.append(", reveal_text=");
            sb.append(c);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final f3t b;
        
        public b(final String a, final f3t b) {
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
            return czd.a((Object)this.a, (Object)b.a) && czd.a((Object)this.b, (Object)b.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final f3t b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Reveal_text(__typename=");
            sb.append(a);
            sb.append(", timelineRichText=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final f3t b;
        
        public c(final String a, final f3t b) {
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
            return czd.a((Object)this.a, (Object)c.a) && czd.a((Object)this.b, (Object)c.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final f3t b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Text(__typename=");
            sb.append(a);
            sb.append(", timelineRichText=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
