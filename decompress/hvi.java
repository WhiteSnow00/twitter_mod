// 
// Decompiled by Procyon v0.6.0
// 

public final class hvi
{
    public static final s4j<hvi> c;
    public final String a;
    public final String b;
    
    static {
        hvi.c = new hvi.hvi$a();
    }
    
    public hvi(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof hvi) {
            final hvi hvi = (hvi)o;
            if (!w4j.a((Object)this.a, (Object)hvi.a) || !w4j.a((Object)this.b, (Object)hvi.b)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return w4j.g((Object)this.a, (Object)this.b);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("NotificationTabDetails{impressionId='");
        jhd.k(g, this.a, '\'', ", metadata='");
        g.append(this.b);
        g.append('\'');
        g.append('}');
        return g.toString();
    }
}
