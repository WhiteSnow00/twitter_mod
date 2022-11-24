// 
// Decompiled by Procyon v0.6.0
// 

public final class n9n implements ccx
{
    public static final n9n.n9n$a Companion;
    public final String a;
    public final String b;
    public final String c;
    public final azk d;
    
    static {
        Companion = new n9n.n9n$a();
    }
    
    public n9n(final String a, final String b, final String c, final azk d) {
        e0e.f((Object)b, "twitterId");
        e0e.f((Object)d, "previousView");
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
        if (!(o instanceof n9n)) {
            return false;
        }
        final n9n n9n = (n9n)o;
        return e0e.a((Object)this.a, (Object)n9n.a) && e0e.a((Object)this.b, (Object)n9n.b) && e0e.a((Object)this.c, (Object)n9n.c) && this.d == n9n.d;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        final int n = 0;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int d = brg.d(this.b, hashCode * 31, 31);
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return this.d.hashCode() + (d + hashCode2) * 31;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final String c = this.c;
        final azk d = this.d;
        final StringBuilder k = l58.k("RoomCohostSwitchToListeningViewState(periscopeUserId=", a, ", twitterId=", b, ", broadcastId=");
        k.append(c);
        k.append(", previousView=");
        k.append(d);
        k.append(")");
        return k.toString();
    }
}
