// 
// Decompiled by Procyon v0.6.0
// 

public final class i9w
{
    public static final a Companion;
    public static final i9w.i9w$b b;
    public final j9w a;
    
    static {
        Companion = new a();
        b = new i9w.i9w$b();
    }
    
    public i9w(final j9w a) {
        zzd.f((Object)a, "inviteActionResults");
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof i9w && zzd.a((Object)this.a, (Object)((i9w)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final j9w a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("UserCommunityActions(inviteActionResults=");
        sb.append(a);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
