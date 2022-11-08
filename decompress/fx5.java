// 
// Decompiled by Procyon v0.6.0
// 

public interface fx5
{
    public static final class a implements fx5
    {
        public final String a;
        
        public a(final String a) {
            zzd.f((Object)a, "message");
            this.a = a;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return this == o || (o instanceof a && zzd.a((Object)this.a, (Object)((a)o).a));
        }
        
        @Override
        public final int hashCode() {
            return this.a.hashCode();
        }
        
        @Override
        public final String toString() {
            return zi.y("CommunityTweetUnpinError(message=", this.a, ")");
        }
    }
    
    public static final class b implements fx5
    {
        public final String a;
        public final xw5 b;
        
        public b(final String a, final xw5 b) {
            zzd.f((Object)a, "unpinnedTweetId");
            zzd.f((Object)b, "communityTweetPinActionResults");
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
            final xw5 b = this.b;
            final StringBuilder sb = new StringBuilder();
            sb.append("UnpinnedTweetResult(unpinnedTweetId=");
            sb.append(a);
            sb.append(", communityTweetPinActionResults=");
            sb.append(b);
            sb.append(")");
            return sb.toString();
        }
    }
}
