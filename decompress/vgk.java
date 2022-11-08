import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vgk
{
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof vgk)) {
            return false;
        }
        final vgk vgk = (vgk)o;
        Objects.requireNonNull(vgk);
        if (!cjs.a(0L, 0L)) {
            return false;
        }
        Objects.requireNonNull(vgk);
        if (!cjs.a(0L, 0L)) {
            return false;
        }
        Objects.requireNonNull(vgk);
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int e = cjs.e(0L);
        return (e + e * 31) * 31 + 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder g = w48.g("Placeholder(width=");
        g.append((Object)cjs.f(0L));
        g.append(", height=");
        g.append((Object)cjs.f(0L));
        g.append(", placeholderVerticalAlign=");
        g.append((Object)"Invalid");
        g.append(')');
        return g.toString();
    }
}
