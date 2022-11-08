// 
// Decompiled by Procyon v0.6.0
// 

public final class j4a
{
    public final String a;
    
    public j4a(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof j4a && this.a.equals(((j4a)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        return hi.I(w48.g("Encoding{name=\""), this.a, "\"}");
    }
}
