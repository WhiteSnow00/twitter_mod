// 
// Decompiled by Procyon v0.6.0
// 

public final class uxi
{
    public static final a Companion;
    public final long a;
    public final String b;
    public final fnj c;
    
    static {
        Companion = new a();
    }
    
    public uxi(final long a, final String b, final fnj c) {
        e0e.f((Object)b, "impressionId");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uxi)) {
            return false;
        }
        final uxi uxi = (uxi)o;
        return this.a == uxi.a && e0e.a((Object)this.b, (Object)uxi.b) && this.c == uxi.c;
    }
    
    @Override
    public final int hashCode() {
        final long a = this.a;
        return this.c.hashCode() + brg.d(this.b, (int)(a ^ a >>> 32) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final String b = this.b;
        final fnj c = this.c;
        final StringBuilder b2 = snp.b("NotificationsOpenOrDismissEntry(timeStamp=", a, ", impressionId=", b);
        b2.append(", openOrDismiss=");
        b2.append(c);
        b2.append(")");
        return b2.toString();
    }
    
    public static final class a
    {
    }
}
