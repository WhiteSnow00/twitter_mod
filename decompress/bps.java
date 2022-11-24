import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bps implements m1l<l4a>
{
    public final pps<l4a>[] a;
    
    public bps(final pps<l4a>... array) {
        final pps<l4a>[] a = array;
        this.a = a;
        final int length = a.length;
        if (length > 0) {
            return;
        }
        if (length >= 0) {
            throw new IndexOutOfBoundsException(xd.k0("%s (%s) must be less than size (%s)", "index", 0, length));
        }
        throw new IllegalArgumentException(rk0.B("negative size: ", length));
    }
    
    @Override
    public final void a(final pk6<l4a> pk6, final n1l n1l) {
        Objects.requireNonNull(n1l.l());
        pk6.c(null, 1);
    }
}
