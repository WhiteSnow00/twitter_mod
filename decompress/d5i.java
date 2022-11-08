// 
// Decompiled by Procyon v0.6.0
// 

public final class d5i
{
    public final int a;
    public final int b;
    public final String c;
    
    public d5i(final int a, final int b, final String c) {
        k1b.i(a, "type");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d5i)) {
            return false;
        }
        final d5i d5i = (d5i)o;
        return this.a == d5i.a && this.b == d5i.b && zzd.a((Object)this.c, (Object)d5i.c);
    }
    
    @Override
    public final int hashCode() {
        final int d = nb0.D(this.a);
        final int b = this.b;
        final String c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return (d * 31 + b) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final String c = this.c;
        final StringBuilder g = w48.g("NFTWallet(type=");
        g.append(kwe.r(a));
        g.append(", drawable=");
        g.append(b);
        g.append(", deeplink=");
        g.append(c);
        g.append(")");
        return g.toString();
    }
}
