import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class q2y
{
    public final sf0<?> a;
    public final yra b;
    
    public q2y(final sf0 a, final yra b) {
        this.a = (sf0<?>)a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != null && o instanceof q2y) {
            final q2y q2y = (q2y)o;
            if (f5j.a(this.a, q2y.a) && f5j.a(this.b, q2y.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b });
    }
    
    @Override
    public final String toString() {
        final f5j.a a = new f5j.a(this);
        a.a("key", this.a);
        a.a("feature", this.b);
        return a.toString();
    }
}
