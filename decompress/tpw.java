import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tpw
{
    public static final a Companion;
    public static final tpw e;
    public final long a;
    public final float b;
    public final long c;
    public final long d;
    
    static {
        Companion = new a();
        Objects.requireNonNull(qfj.Companion);
        final long b = qfj.b;
        e = new tpw(b, 1.0f, 0L, b);
    }
    
    public tpw(final long a, final float b, final long c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof tpw)) {
            return false;
        }
        final tpw tpw = (tpw)o;
        return qfj.b(this.a, tpw.a) && zzd.a((Object)this.b, (Object)tpw.b) && this.c == tpw.c && qfj.b(this.d, tpw.d);
    }
    
    @Override
    public final int hashCode() {
        final int h = c0.h(this.b, qfj.f(this.a) * 31, 31);
        final long c = this.c;
        return qfj.f(this.d) + (h + (int)(c ^ c >>> 32)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("VelocityEstimate(pixelsPerSecond=");
        g.append((Object)qfj.j(this.a));
        g.append(", confidence=");
        g.append(this.b);
        g.append(", durationMillis=");
        g.append(this.c);
        g.append(", offset=");
        g.append((Object)qfj.j(this.d));
        g.append(')');
        return g.toString();
    }
    
    public static final class a
    {
    }
}
