// 
// Decompiled by Procyon v0.6.0
// 

public final class h1n implements ccx
{
    public static final h1n.h1n$a Companion;
    public final String a;
    public final int b;
    
    static {
        Companion = new h1n.h1n$a();
    }
    
    public h1n() {
        this.a = null;
        this.b = 0;
    }
    
    public h1n(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h1n)) {
            return false;
        }
        final h1n h1n = (h1n)o;
        return e0e.a((Object)this.a, (Object)h1n.a) && this.b == h1n.b;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int b = this.b;
        final StringBuilder sb = new StringBuilder();
        sb.append("RoomAnonymousUsersSettingsViewState(roomId=");
        sb.append(a);
        sb.append(", remainingUsersCount=");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
