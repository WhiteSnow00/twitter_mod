import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wry<T> implements dsy, nry
{
    public static final Object H0;
    public volatile dsy<T> F0;
    public volatile Object G0;
    
    static {
        H0 = new Object();
    }
    
    public wry(final dsy<T> f0) {
        this.G0 = wry.H0;
        this.F0 = f0;
    }
    
    public static <P extends dsy<T>, T> nry<T> b(final P p) {
        if (p instanceof nry) {
            return (nry<T>)p;
        }
        Objects.requireNonNull(p);
        return (nry<T>)new wry((dsy<Object>)p);
    }
    
    public static <P extends dsy<T>, T> dsy<T> c(final P p) {
        if (p instanceof wry) {
            return p;
        }
        return (dsy<T>)new wry((dsy<Object>)p);
    }
    
    public final T a() {
        final Object g0 = this.G0;
        final Object h0 = wry.H0;
        final T t = (T)g0;
        if (g0 == h0) {
            synchronized (this) {
                if (this.G0 == h0) {
                    final Object a = this.F0.a();
                    final Object g2 = this.G0;
                    if (g2 != h0 && g2 != a) {
                        final String value = String.valueOf(g2);
                        final String value2 = String.valueOf(a);
                        final StringBuilder sb = new StringBuilder(value.length() + 118 + value2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(value);
                        sb.append(" & ");
                        sb.append(value2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.G0 = a;
                    this.F0 = null;
                }
            }
        }
        return t;
    }
}
