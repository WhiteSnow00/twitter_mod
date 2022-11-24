import java.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public interface zz6<K, V> extends k4h<K, V>, w4h
{
    cj4<V> c(final K p0, final cj4<V> p1, final b<K> p2);
    
    cj4<V> e(final K p0);
    
    public static final class a<K, V>
    {
        public final K a;
        public final cj4<V> b;
        public int c;
        public boolean d;
        public final b<K> e;
        
        public a(final K a, final cj4<V> cj4, final b<K> e) {
            Objects.requireNonNull(a);
            this.a = a;
            final cj4<V> c = cj4.c(cj4);
            Objects.requireNonNull(c);
            this.b = c;
            this.c = 0;
            this.d = false;
            this.e = e;
        }
    }
    
    public interface b<K>
    {
    }
}
