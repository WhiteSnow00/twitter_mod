import java.util.Objects;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eb1 extends kjc
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
        if (o instanceof kjc) {
            final kjc kjc = (kjc)o;
            if (!this.a.equals(kjc.b()) || !this.b.equals(kjc.a())) {
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
        final StringBuilder f = ehk.f("HeartBeatResult{userAgent=");
        f.append(this.a);
        f.append(", usedDates=");
        return ad.A(f, this.b, "}");
    }
}
