import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public class kpo<K, V> implements Iterable<Map.Entry<K, V>>
{
    public c<K, V> D0;
    public c<K, V> E0;
    public WeakHashMap<f<K, V>, Boolean> F0;
    public int G0;
    
    public kpo() {
        this.F0 = new WeakHashMap<f<K, V>, Boolean>();
        this.G0 = 0;
    }
    
    public c<K, V> e(final K k) {
        c<K, V> c;
        for (c = this.D0; c != null && !c.D0.equals(k); c = c.F0) {}
        return c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof kpo)) {
            return false;
        }
        final kpo kpo = (kpo)o;
        if (this.G0 != kpo.G0) {
            return false;
        }
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        final Iterator iterator2 = kpo.iterator();
        Map.Entry entry;
        Object next;
        do {
            final kpo.kpo$e kpo$e = (kpo.kpo$e)iterator;
            if (kpo$e.hasNext()) {
                final kpo.kpo$e kpo$e2 = (kpo.kpo$e)iterator2;
                if (kpo$e2.hasNext()) {
                    entry = (Map.Entry)kpo$e.next();
                    next = kpo$e2.next();
                    continue;
                }
            }
            if (kpo$e.hasNext() || ((kpo.kpo$e)iterator2).hasNext()) {
                b = false;
            }
            return b;
        } while ((entry != null || next == null) && (entry == null || entry.equals(next)));
        return false;
    }
    
    public final kpo.kpo$d g() {
        final kpo.kpo$d kpo$d = new kpo.kpo$d(this);
        this.F0.put((f<K, V>)kpo$d, Boolean.FALSE);
        return kpo$d;
    }
    
    @Override
    public final int hashCode() {
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        int n = 0;
        while (true) {
            final kpo.kpo$e kpo$e = (kpo.kpo$e)iterator;
            if (!kpo$e.hasNext()) {
                break;
            }
            n += ((Map.Entry)kpo$e.next()).hashCode();
        }
        return n;
    }
    
    public final c<K, V> i(final K k, final V v) {
        final c c = new c((K)k, (V)v);
        ++this.G0;
        final c<K, V> e0 = this.E0;
        if (e0 == null) {
            this.D0 = c;
            return this.E0 = c;
        }
        e0.F0 = c;
        c.G0 = (c<K, V>)e0;
        return this.E0 = c;
    }
    
    @Override
    public final Iterator<Map.Entry<K, V>> iterator() {
        final kpo.kpo$a kpo$a = new kpo.kpo$a((c)this.D0, (c)this.E0);
        this.F0.put((f<K, V>)kpo$a, Boolean.FALSE);
        return (Iterator<Map.Entry<K, V>>)kpo$a;
    }
    
    public V j(final K k, final V v) {
        final c<K, V> e = this.e(k);
        if (e != null) {
            return e.E0;
        }
        this.i(k, v);
        return null;
    }
    
    public V l(final K k) {
        final c<K, V> e = this.e(k);
        if (e == null) {
            return null;
        }
        --this.G0;
        if (!this.F0.isEmpty()) {
            final Iterator<f<K, V>> iterator = this.F0.keySet().iterator();
            while (iterator.hasNext()) {
                iterator.next().a((c)e);
            }
        }
        final c<K, V> g0 = (c<K, V>)e.G0;
        if (g0 != null) {
            g0.F0 = (c<K, V>)e.F0;
        }
        else {
            this.D0 = e.F0;
        }
        final c<K, V> f0 = (c<K, V>)e.F0;
        if (f0 != null) {
            f0.G0 = g0;
        }
        else {
            this.E0 = (c<K, V>)g0;
        }
        e.F0 = null;
        e.G0 = null;
        return e.E0;
    }
    
    @Override
    public final String toString() {
        final StringBuilder j = fu8.j("[");
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        while (true) {
            final kpo.kpo$e kpo$e = (kpo.kpo$e)iterator;
            if (!kpo$e.hasNext()) {
                break;
            }
            j.append(kpo$e.next().toString());
            if (!kpo$e.hasNext()) {
                continue;
            }
            j.append(", ");
        }
        j.append("]");
        return j.toString();
    }
    
    public static final class c<K, V> implements Entry<K, V>
    {
        public final K D0;
        public final V E0;
        public c<K, V> F0;
        public c<K, V> G0;
        
        public c(final K d0, final V e0) {
            this.D0 = d0;
            this.E0 = e0;
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (o == this) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            if (!this.D0.equals(c.D0) || !this.E0.equals(c.E0)) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final K getKey() {
            return this.D0;
        }
        
        @Override
        public final V getValue() {
            return this.E0;
        }
        
        @Override
        public final int hashCode() {
            return this.D0.hashCode() ^ this.E0.hashCode();
        }
        
        @Override
        public final V setValue(final V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.D0);
            sb.append("=");
            sb.append(this.E0);
            return sb.toString();
        }
    }
    
    public interface f<K, V>
    {
        void a(final c<K, V> p0);
    }
}
