// 
// Decompiled by Procyon v0.6.0
// 

public final class w69<T> implements dml<T>, rwe<T>
{
    public static final Object F0;
    public volatile dml<T> D0;
    public volatile Object E0;
    
    static {
        F0 = new Object();
    }
    
    public w69(final dml<T> d0) {
        this.E0 = w69.F0;
        this.D0 = d0;
    }
    
    public static <P extends dml<T>, T> dml<T> a(final P p) {
        if (p instanceof w69) {
            return p;
        }
        return (dml<T>)new w69((dml<Object>)p);
    }
    
    public static Object b(final Object o, final Object o2) {
        if (o != w69.F0 && o != o2) {
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
        final Object e0 = this.E0;
        final Object f0 = w69.F0;
        final T t = (T)e0;
        if (e0 == f0) {
            synchronized (this) {
                if (this.E0 == f0) {
                    final Object value = this.D0.get();
                    b(this.E0, value);
                    this.E0 = value;
                    this.D0 = null;
                }
            }
        }
        return t;
    }
}
