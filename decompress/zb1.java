import java.util.Objects;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zb1 extends svo
{
    public final mi4 a;
    public final Map<azk, svo$a> b;
    
    public zb1(final mi4 a, final Map<azk, svo$a> b) {
        Objects.requireNonNull(a, "Null clock");
        this.a = a;
        Objects.requireNonNull(b, "Null values");
        this.b = b;
    }
    
    public final mi4 a() {
        return this.a;
    }
    
    public final Map<azk, svo$a> c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof svo) {
            final svo svo = (svo)o;
            if (!this.a.equals(svo.a()) || !this.b.equals(svo.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("SchedulerConfig{clock=");
        g.append(this.a);
        g.append(", values=");
        g.append(this.b);
        g.append("}");
        return g.toString();
    }
}
