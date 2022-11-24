import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ds9
{
    public final UserIdentifier a;
    public final String b;
    public final String c;
    
    public ds9(final UserIdentifier a, final String b, final String c) {
        e0e.f((Object)a, "ownerId");
        e0e.f((Object)b, "folderId");
        e0e.f((Object)c, "name");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ds9)) {
            return false;
        }
        final ds9 ds9 = (ds9)o;
        return e0e.a((Object)this.a, (Object)ds9.a) && e0e.a((Object)this.b, (Object)ds9.b) && e0e.a((Object)this.c, (Object)ds9.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + brg.d(this.b, this.a.hashCode() * 31, 31);
    }
    
    @Override
    public final String toString() {
        final UserIdentifier a = this.a;
        final String b = this.b;
        final String c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("EditFolderParams(ownerId=");
        sb.append(a);
        sb.append(", folderId=");
        sb.append(b);
        sb.append(", name=");
        return m51.y(sb, c, ")");
    }
}
