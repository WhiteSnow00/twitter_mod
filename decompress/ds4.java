import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ds4 implements ghs
{
    public final long a;
    
    public ds4(final long a) {
        this.a = a;
        Objects.requireNonNull(pr4.Companion);
        if (a != pr4.g) {
            return;
        }
        throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.".toString());
    }
    
    public final float a() {
        return pr4.d(this.a);
    }
    
    public final long c() {
        return this.a;
    }
    
    public final oq2 e() {
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ds4 && pr4.c(this.a, ((ds4)o).a));
    }
    
    @Override
    public final int hashCode() {
        return pr4.i(this.a);
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("ColorStyle(value=");
        g.append((Object)pr4.j(this.a));
        g.append(')');
        return g.toString();
    }
}
