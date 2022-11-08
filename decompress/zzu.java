// 
// Decompiled by Procyon v0.6.0
// 

public final class zzu
{
    public final c a;
    public final b b;
    public final d c;
    public final a d;
    
    public zzu(final c a, final b b, final d c, final a d) {
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
        if (!(o instanceof zzu)) {
            return false;
        }
        final zzu zzu = (zzu)o;
        return zzd.a((Object)this.a, (Object)zzu.a) && zzd.a((Object)this.b, (Object)zzu.b) && zzd.a((Object)this.c, (Object)zzu.c) && zzd.a((Object)this.d, (Object)zzu.d);
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
        final b b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final d c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final a d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final c a = this.a;
        final b b = this.b;
        final d c = this.c;
        final a d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("TweetWithVisibilityResultsExcludingTweet(tweet_interstitial=");
        sb.append(a);
        sb.append(", soft_intervention_pivot=");
        sb.append(b);
        sb.append(", tweet_visibility_nudge=");
        sb.append(c);
        sb.append(", limited_action_results=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final lcf b;
        
        public a(final String a, final lcf b) {
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
            final lcf b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Limited_action_results(__typename=");
            sb.append(a);
            sb.append(", limitedActionResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b
    {
        public final String a;
        public final kjq b;
        
        public b(final String a, final kjq b) {
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
            final kjq b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Soft_intervention_pivot(__typename=");
            sb.append(a);
            sb.append(", softInterventionPivot=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class c
    {
        public final String a;
        public final gmu b;
        
        public c(final String a, final gmu b) {
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
            final gmu b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Tweet_interstitial(__typename=");
            sb.append(a);
            sb.append(", tweetInterstitial=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class d
    {
        public final String a;
        public final hzu b;
        
        public d(final String a, final hzu b) {
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
            return this.b.hashCode() + this.a.hashCode() * 31;
        }
        
        @Override
        public final String toString() {
            final String a = this.a;
            final hzu b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("Tweet_visibility_nudge(__typename=");
            sb.append(a);
            sb.append(", tweetVisibilityNudge=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
