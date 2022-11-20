// 
// Decompiled by Procyon v0.6.0
// 

public final class rj3
{
    public final int a;
    public final int b;
    
    public rj3(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof rj3)) {
            return false;
        }
        final rj3 rj3 = (rj3)o;
        return this.a == rj3.a && this.b == rj3.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return zh8.n("CardOffset(xValue=", this.a, ", yValue=", this.b, ")");
    }
}
