import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class sa1 extends x47
{
    public final Context a;
    public final nh4 b;
    public final nh4 c;
    public final String d;
    
    public sa1(final Context a, final nh4 b, final nh4 c, final String d) {
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
    
    public final nh4 c() {
        return this.c;
    }
    
    public final nh4 d() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof x47) {
            final x47 x47 = (x47)o;
            if (!this.a.equals(x47.a()) || !this.b.equals(x47.d()) || !this.c.equals(x47.c()) || !this.d.equals(x47.b())) {
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
        final StringBuilder j = fu8.j("CreationContext{applicationContext=");
        j.append(this.a);
        j.append(", wallClock=");
        j.append(this.b);
        j.append(", monotonicClock=");
        j.append(this.c);
        j.append(", backendName=");
        return ed.B(j, this.d, "}");
    }
}
