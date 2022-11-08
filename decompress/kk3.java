// 
// Decompiled by Procyon v0.6.0
// 

public final class kk3
{
    public final int a;
    public final int b;
    
    public kk3(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof kk3)) {
            return false;
        }
        final kk3 kk3 = (kk3)o;
        return this.a == kk3.a && this.b == kk3.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return k1b.f("CardOffset(xValue=", this.a, ", yValue=", this.b, ")");
    }
}
