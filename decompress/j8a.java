import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class j8a<T>
{
    public abstract boolean a(final T p0, final T p1);
    
    public abstract int b(final T p0);
    
    public final boolean c(final T t, final T t2) {
        return t == t2 || (t != null && t2 != null && this.a(t, t2));
    }
    
    public static final class a extends j8a<Object> implements Serializable
    {
        public static final a C0;
        
        static {
            C0 = new a();
        }
        
        @Override
        public final boolean a(final Object o, final Object o2) {
            return o.equals(o2);
        }
        
        @Override
        public final int b(final Object o) {
            return o.hashCode();
        }
    }
    
    public static final class b extends j8a<Object> implements Serializable
    {
        public static final b C0;
        
        static {
            C0 = new b();
        }
        
        @Override
        public final boolean a(final Object o, final Object o2) {
            return false;
        }
        
        @Override
        public final int b(final Object o) {
            return System.identityHashCode(o);
        }
    }
}
