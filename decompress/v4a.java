// 
// Decompiled by Procyon v0.6.0
// 

public final class v4a
{
    public final String a;
    
    public v4a(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof v4a && this.a.equals(((v4a)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        return m51.y(ehk.f("Encoding{name=\""), this.a, "\"}");
    }
}
