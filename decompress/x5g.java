// 
// Decompiled by Procyon v0.6.0
// 

public final class x5g
{
    public final int a;
    public final int b;
    
    public x5g(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x5g)) {
            return false;
        }
        final x5g x5g = (x5g)o;
        return this.a == x5g.a && this.b == x5g.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return k1b.f("Location(line=", this.a, ", column=", this.b, ")");
    }
}
