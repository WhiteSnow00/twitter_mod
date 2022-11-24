// 
// Decompiled by Procyon v0.6.0
// 

public final class f6g
{
    public final int a;
    public final int b;
    
    public f6g(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f6g)) {
            return false;
        }
        final f6g f6g = (f6g)o;
        return this.a == f6g.a && this.b == f6g.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        return bng.g("Location(line=", this.a, ", column=", this.b, ")");
    }
}
