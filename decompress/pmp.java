// 
// Decompiled by Procyon v0.6.0
// 

public final class pmp implements hr9
{
    public final int a;
    public final int b;
    
    public pmp(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final ix9 ix9) {
        zzd.f((Object)ix9, "buffer");
        if (ix9.f()) {
            ix9.a();
        }
        final int v = pf8.v(this.a, 0, ix9.e());
        final int v2 = pf8.v(this.b, 0, ix9.e());
        if (v != v2) {
            if (v < v2) {
                ix9.h(v, v2);
            }
            else {
                ix9.h(v2, v);
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof pmp)) {
            return false;
        }
        final int a = this.a;
        final pmp pmp = (pmp)o;
        return a == pmp.a && this.b == pmp.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("SetComposingRegionCommand(start=");
        g.append(this.a);
        g.append(", end=");
        return y70.y(g, this.b, ')');
    }
}
