// 
// Decompiled by Procyon v0.6.0
// 

public final class cv0
{
    public final int a;
    public final int b;
    
    public cv0(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof cv0)) {
            return false;
        }
        final cv0 cv0 = (cv0)o;
        return this.a == cv0.a && this.b == cv0.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return zh8.n("AspectRatio(denominator=", this.a, ", numerator=", this.b, ")");
    }
}
