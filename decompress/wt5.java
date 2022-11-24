// 
// Decompiled by Procyon v0.6.0
// 

public final class wt5 implements ccx
{
    public final yh5 a;
    public final boolean b;
    public final boolean c;
    
    public wt5(final yh5 a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof wt5)) {
            return false;
        }
        final wt5 wt5 = (wt5)o;
        return e0e.a((Object)this.a, (Object)wt5.a) && this.b == wt5.b && this.c == wt5.c;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        final int c = this.c ? 1 : 0;
        if (c == 0) {
            n = c;
        }
        return (hashCode * 31 + n2) * 31 + n;
    }
    
    @Override
    public final String toString() {
        final yh5 a = this.a;
        final boolean b = this.b;
        final boolean c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("CommunityRowItemViewState(community=");
        sb.append(a);
        sb.append(", showJoinButton=");
        sb.append(b);
        sb.append(", requestToJoin=");
        return xj0.B(sb, c, ")");
    }
}
