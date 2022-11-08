import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wa1 extends t57
{
    public final Context a;
    public final mi4 b;
    public final mi4 c;
    public final String d;
    
    public wa1(final Context a, final mi4 b, final mi4 c, final String d) {
        Objects.requireNonNull(a, "Null applicationContext");
        this.a = a;
        Objects.requireNonNull(b, "Null wallClock");
        this.b = b;
        Objects.requireNonNull(c, "Null monotonicClock");
        this.c = c;
        Objects.requireNonNull(d, "Null backendName");
        this.d = d;
    }
    
    public final Context a() {
        return this.a;
    }
    
    public final String b() {
        return this.d;
    }
    
    public final mi4 c() {
        return this.c;
    }
    
    public final mi4 d() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof t57) {
            final t57 t57 = (t57)o;
            if (!this.a.equals(t57.a()) || !this.b.equals(t57.d()) || !this.c.equals(t57.c()) || !this.d.equals(t57.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    public final String toString() {
        final StringBuilder g = w48.g("CreationContext{applicationContext=");
        g.append(this.a);
        g.append(", wallClock=");
        g.append(this.b);
        g.append(", monotonicClock=");
        g.append(this.c);
        g.append(", backendName=");
        return hi.I(g, this.d, "}");
    }
}
