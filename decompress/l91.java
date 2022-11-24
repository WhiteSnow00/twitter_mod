import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l91 extends ws1
{
    public final List<b9g> a;
    
    public l91(final List<b9g> a) {
        this.a = a;
    }
    
    public final List<b9g> a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ws1 && this.a.equals(((ws1)o).a()));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        return ad.A(ehk.f("BatchedLogRequest{logRequests="), this.a, "}");
    }
}
