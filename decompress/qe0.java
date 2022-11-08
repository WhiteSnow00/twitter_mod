// 
// Decompiled by Procyon v0.6.0
// 

public final class qe0
{
    public final int a;
    public final int b;
    
    public qe0(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof qe0)) {
            return false;
        }
        final qe0 qe0 = (qe0)o;
        return this.a == qe0.a && this.b == qe0.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return k1b.f("ApiAspectRatio(denominator=", this.a, ", numerator=", this.b, ")");
    }
}
