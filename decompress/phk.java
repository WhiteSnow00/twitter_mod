import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class phk
{
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof phk)) {
            return false;
        }
        final phk phk = (phk)o;
        Objects.requireNonNull(phk);
        if (!pks.a(0L, 0L)) {
            return false;
        }
        Objects.requireNonNull(phk);
        if (!pks.a(0L, 0L)) {
            return false;
        }
        Objects.requireNonNull(phk);
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int e = pks.e(0L);
        return (e + e * 31) * 31 + 0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder f = ehk.f("Placeholder(width=");
        f.append((Object)pks.f(0L));
        f.append(", height=");
        f.append((Object)pks.f(0L));
        f.append(", placeholderVerticalAlign=");
        f.append((Object)"Invalid");
        f.append(')');
        return f.toString();
    }
}
