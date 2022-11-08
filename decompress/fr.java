import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fr
{
    public final UserIdentifier a;
    public final String b;
    
    public fr(final UserIdentifier a, final String b) {
        zzd.f((Object)a, "currentUser");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof fr)) {
            return false;
        }
        final fr fr = (fr)o;
        return zzd.a((Object)this.a, (Object)fr.a) && zzd.a((Object)this.b, (Object)fr.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final UserIdentifier a = this.a;
        final String b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("AddBookmarkParams(currentUser=");
        sb.append(a);
        sb.append(", tweetId=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
