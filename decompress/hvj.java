// 
// Decompiled by Procyon v0.6.0
// 

public final class hvj<F, S>
{
    public final F a;
    public final S b;
    
    public hvj(final F a, final S b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof hvj;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final hvj hvj = (hvj)o;
        boolean b3 = b2;
        if (a5j.a((Object)hvj.a, (Object)this.a)) {
            b3 = b2;
            if (a5j.a((Object)hvj.b, (Object)this.b)) {
                b3 = true;
            }
        }
        return b3;
    }
    
    @Override
    public final int hashCode() {
        final F a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final S b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Pair{");
        g.append(this.a);
        g.append(" ");
        g.append(this.b);
        g.append("}");
        return g.toString();
    }
}
