// 
// Decompiled by Procyon v0.6.0
// 

public final class ua1 extends o17$e$f
{
    public final String a;
    
    public ua1(final String a) {
        this.a = a;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof o17$e$f && this.a.equals(((o17$e$f)o).a()));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        return m51.y(ehk.f("User{identifier="), this.a, "}");
    }
}
