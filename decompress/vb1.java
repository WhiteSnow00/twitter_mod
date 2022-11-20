import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vb1 extends iwo
{
    public final nh4 a;
    public final Map<izk, a> b;
    
    public vb1(final nh4 a, final Map<izk, a> b) {
        Objects.requireNonNull(a, "Null clock");
        this.a = a;
        Objects.requireNonNull(b, "Null values");
        this.b = b;
    }
    
    @Override
    public final nh4 a() {
        return this.a;
    }
    
    @Override
    public final Map<izk, a> c() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof iwo) {
            final iwo iwo = (iwo)o;
            if (!this.a.equals(iwo.a()) || !this.b.equals(iwo.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("SchedulerConfig{clock=");
        j.append(this.a);
        j.append(", values=");
        j.append(this.b);
        j.append("}");
        return j.toString();
    }
}
