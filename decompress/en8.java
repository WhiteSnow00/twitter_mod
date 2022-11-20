import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class en8
{
    public final UserIdentifier a;
    public final String b;
    
    public en8(final UserIdentifier a, final String b) {
        czd.f((Object)a, "ownerId");
        czd.f((Object)b, "folderId");
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof en8)) {
            return false;
        }
        final en8 en8 = (en8)o;
        return czd.a((Object)this.a, (Object)en8.a) && czd.a((Object)this.b, (Object)en8.b);
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
        sb.append("DeleteFolderParams(ownerId=");
        sb.append(a);
        sb.append(", folderId=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
