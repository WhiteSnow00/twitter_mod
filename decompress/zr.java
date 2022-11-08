import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zr
{
    public final UserIdentifier a;
    public final String b;
    public final String c;
    
    public zr(final UserIdentifier a, final String b, final String c) {
        zzd.f((Object)a, "ownerId");
        zzd.f((Object)b, "folderId");
        zzd.f((Object)c, "tweetId");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof zr)) {
            return false;
        }
        final zr zr = (zr)o;
        return zzd.a((Object)this.a, (Object)zr.a) && zzd.a((Object)this.b, (Object)zr.b) && zzd.a((Object)this.c, (Object)zr.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + l7k.a(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final UserIdentifier a = this.a;
        final String b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("AddToFolderParams(ownerId=");
        sb.append(a);
        sb.append(", folderId=");
        sb.append(b);
        sb.append(", tweetId=");
        return hi.I(sb, c, ")");
    }
}
