// 
// Decompiled by Procyon v0.6.0
// 

public final class tk3
{
    public final int a;
    public final int b;
    
    public tk3(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tk3)) {
            return false;
        }
        final tk3 tk3 = (tk3)o;
        return this.a == tk3.a && this.b == tk3.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return bng.g("CardOffset(xValue=", this.a, ", yValue=", this.b, ")");
    }
}
