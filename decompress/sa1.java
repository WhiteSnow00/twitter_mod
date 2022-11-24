// 
// Decompiled by Procyon v0.6.0
// 

public final class sa1 extends o17$e$d$d
{
    public final String a;
    
    public sa1(final String a) {
        this.a = a;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof o17$e$d$d && this.a.equals(((o17$e$d$d)o).a()));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        return m51.y(ehk.f("Log{content="), this.a, "}");
    }
}
