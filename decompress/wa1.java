import java.util.Objects;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wa1 extends c67
{
    public final Context a;
    public final si4 b;
    public final si4 c;
    public final String d;
    
    public wa1(final Context a, final si4 b, final si4 c, final String d) {
        Objects.requireNonNull(a, "Null applicationContext");
        this.a = a;
        Objects.requireNonNull(b, "Null wallClock");
        this.b = b;
        Objects.requireNonNull(c, "Null monotonicClock");
        this.c = c;
        Objects.requireNonNull(d, "Null backendName");
        this.d = d;
    }
    
    @Override
    public final Context a() {
        return this.a;
    }
    
    @Override
    public final String b() {
        return this.d;
    }
    
    @Override
    public final si4 c() {
        return this.c;
    }
    
    @Override
    public final si4 d() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof c67) {
            final c67 c67 = (c67)o;
            if (!this.a.equals(c67.a()) || !this.b.equals(c67.d()) || !this.c.equals(c67.c()) || !this.d.equals(c67.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("CreationContext{applicationContext=");
        f.append(this.a);
        f.append(", wallClock=");
        f.append(this.b);
        f.append(", monotonicClock=");
        f.append(this.c);
        f.append(", backendName=");
        return m51.y(f, this.d, "}");
    }
}
