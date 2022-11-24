// 
// Decompiled by Procyon v0.6.0
// 

public final class afj
{
    public static final a Companion;
    public final pej a;
    public final pej b;
    public final cej c;
    public final qgv d;
    
    static {
        Companion = new a();
    }
    
    public afj(final pej a, final pej b, final cej c, final qgv d) {
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
        if (!(o instanceof afj)) {
            return false;
        }
        final afj afj = (afj)o;
        return e0e.a((Object)this.a, (Object)afj.a) && e0e.a((Object)this.b, (Object)afj.b) && e0e.a((Object)this.c, (Object)afj.c) && e0e.a((Object)this.d, (Object)afj.d);
    }
    
    @Override
    public final int hashCode() {
        final pej a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final pej b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final cej c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final qgv d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final pej a = this.a;
        final pej b = this.b;
        final cej c = this.c;
        final qgv d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append("OcfSubtaskHeader(primaryText=");
        sb.append(a);
        sb.append(", secondaryText=");
        sb.append(b);
        sb.append(", headerImage=");
        sb.append(c);
        sb.append(", user=");
        sb.append(d);
        sb.append(")");
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
