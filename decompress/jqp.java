import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jqp
{
    public static final a Companion;
    public static final jqp d;
    public final long a;
    public final long b;
    public final float c;
    
    static {
        Companion = new a();
        d = new jqp();
    }
    
    public jqp() {
        final long q = m0n.q(4278190080L);
        Objects.requireNonNull(qfj.Companion);
        this(q, qfj.b, 0.0f);
    }
    
    public jqp(final long a, final long b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jqp)) {
            return false;
        }
        final long a = this.a;
        final jqp jqp = (jqp)o;
        return pr4.c(a, jqp.a) && qfj.b(this.b, jqp.b) && this.c == jqp.c;
    }
    
    @Override
    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (qfj.f(this.b) + pr4.i(this.a) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Shadow(color=");
        g.append((Object)pr4.j(this.a));
        g.append(", offset=");
        g.append((Object)qfj.j(this.b));
        g.append(", blurRadius=");
        return x30.E(g, this.c, ')');
    }
    
    public static final class a
    {
    }
}
