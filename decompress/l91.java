import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l91 extends ts1
{
    public final List<r8g> a;
    
    public l91(final List<r8g> a) {
        this.a = a;
    }
    
    public final List<r8g> a() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof ts1 && this.a.equals(((ts1)o).a()));
    }
    
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    public final String toString() {
        return gp.A(w48.g("BatchedLogRequest{logRequests="), (List)this.a, "}");
    }
}
