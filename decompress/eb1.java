import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eb1 extends ijc
{
    public final String a;
    public final List<String> b;
    
    public eb1(final String a, final List<String> b) {
        Objects.requireNonNull(a, "Null userAgent");
        this.a = a;
        this.b = b;
    }
    
    public final List<String> a() {
        return this.b;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof ijc) {
            final ijc ijc = (ijc)o;
            if (!this.a.equals(ijc.b()) || !this.b.equals(ijc.a())) {
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
        final StringBuilder g = w48.g("HeartBeatResult{userAgent=");
        g.append(this.a);
        g.append(", usedDates=");
        return gp.A(g, (List)this.b, "}");
    }
}
