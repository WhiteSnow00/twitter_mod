import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class k0r
{
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final int e = 0;
    
    static {
        a = fli.b0(14);
        b = fli.b0(0);
        final nq4$a companion = nq4.Companion;
        Objects.requireNonNull(companion);
        c = nq4.f;
        Objects.requireNonNull(companion);
        d = nq4.b;
    }
    
    public static final <T> T a(T t, final T t2, final float n) {
        if (n >= 0.5) {
            t = t2;
        }
        return t;
    }
    
    public static final long b(final long n, final long n2, final float n3) {
        if (!fli.k0(n) && !fli.k0(n2)) {
            return fli.m0(n, n2, n3);
        }
        return a(new xjs(n), new xjs(n2), n3).a;
    }
}
