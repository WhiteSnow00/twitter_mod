// 
// Decompiled by Procyon v0.6.0
// 

public final class ca1 extends d17$c
{
    public final String a;
    public final String b;
    
    public ca1(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final String b() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d17$c) {
            final d17$c d17$c = (d17$c)o;
            if (!this.a.equals(d17$c.a()) || !this.b.equals(d17$c.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("CustomAttribute{key=");
        g.append(this.a);
        g.append(", value=");
        return hi.I(g, this.b, "}");
    }
}
