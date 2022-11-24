// 
// Decompiled by Procyon v0.6.0
// 

public final class u0v
{
    public final t0v a;
    public final a b;
    
    public u0v(final t0v a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof u0v)) {
            return false;
        }
        final u0v u0v = (u0v)o;
        return this.a == u0v.a && e0e.a((Object)this.b, (Object)u0v.b);
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
        final t0v a = this.a;
        final a b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetVisibilityNudgeActions(tweet_visibility_nudge_action_type=");
        sb.append(a);
        sb.append(", tweet_visibility_nudge_action_payload=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final o0v b;
        
        public a(final String a, final o0v b) {
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
            return e0e.a((Object)this.a, (Object)a.a) && e0e.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final o0v b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Tweet_visibility_nudge_action_payload(__typename=");
            sb.append(a);
            sb.append(", tweetVisibilityNudgeActionPayload=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
