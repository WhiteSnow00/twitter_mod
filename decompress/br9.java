import com.twitter.util.user.UserIdentifier;

// 
// Decompiled by Procyon v0.6.0
// 

public final class br9
{
    public final UserIdentifier a;
    public final String b;
    public final String c;
    
    public br9(final UserIdentifier a, final String b, final String c) {
        czd.f((Object)a, "ownerId");
        czd.f((Object)b, "folderId");
        czd.f((Object)c, "name");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof br9)) {
            return false;
        }
        final br9 br9 = (br9)o;
        return czd.a((Object)this.a, (Object)br9.a) && czd.a((Object)this.b, (Object)br9.b) && czd.a((Object)this.c, (Object)br9.c);
    }
    
    @Override
    public final int hashCode() {
        return this.c.hashCode() + hmg.f(this.b, this.a.hashCode() * 31, 31);
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
        return ed.B(sb, c, ")");
    }
}
