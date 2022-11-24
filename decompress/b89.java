// 
// Decompiled by Procyon v0.6.0
// 

public final class b89<T> implements pml<T>, oxe<T>
{
    public static final Object H0;
    public volatile pml<T> F0;
    public volatile Object G0;
    
    static {
        H0 = new Object();
    }
    
    public b89(final pml<T> f0) {
        this.G0 = b89.H0;
        this.F0 = f0;
    }
    
    public static <P extends pml<T>, T> pml<T> a(final P p) {
        if (p instanceof b89) {
            return p;
        }
        return (pml<T>)new b89((pml<Object>)p);
    }
    
    public static Object b(final Object o, final Object o2) {
        if (o != b89.H0 && o != o2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Scoped provider was invoked recursively returning different results: ");
            sb.append(o);
            sb.append(" & ");
            sb.append(o2);
            sb.append(". This is likely due to a circular dependency.");
            throw new IllegalStateException(sb.toString());
        }
        return o2;
    }
    
    public final T get() {
        final Object g0 = this.G0;
        final Object h0 = b89.H0;
        final T t = (T)g0;
        if (g0 == h0) {
            synchronized (this) {
                if (this.G0 == h0) {
                    final Object value = this.F0.get();
                    b(this.G0, value);
                    this.G0 = value;
                    this.F0 = null;
                }
            }
        }
        return t;
    }
}
