import java.util.Locale;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.WeakHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class e3f<T>
{
    public final AtomicInteger a;
    public final Map<T, Long> b;
    public final Map<T, Long> c;
    public final long d;
    public final long e;
    public final int f;
    public long g;
    public final List<b<T>> h;
    
    public e3f(final long e, final int f) {
        this.a = new AtomicInteger();
        this.b = new WeakHashMap();
        this.c = new WeakHashMap();
        this.h = new CopyOnWriteArrayList();
        this.d = 300000L;
        this.e = e;
        this.f = f;
    }
    
    public final long a(final T t) {
        final Long n = this.b.get(t);
        long n2;
        if (n != null) {
            final m4s a = hq1.a;
            n2 = System.currentTimeMillis() - n;
        }
        else {
            n2 = 0L;
        }
        return n2;
    }
    
    public final List<T> b() {
        if (this.c.size() == 0) {
            final gdd$b e0 = gdd.E0;
            final int a = c5j.a;
            return (List<T>)e0;
        }
        synchronized (this.c) {
            return rif.u((Iterable)this.c.keySet());
        }
    }
    
    public final long c(final T t) {
        final Long n = this.c.get(t);
        long n2;
        if (n != null) {
            final m4s a = hq1.a;
            n2 = System.currentTimeMillis() - n;
        }
        else {
            n2 = 0L;
        }
        return n2;
    }
    
    public final List<T> d() {
        final int size = this.c.size();
        if (size == 0) {
            final gdd$b e0 = gdd.E0;
            final int a = c5j.a;
            return (List<T>)e0;
        }
        List<T> list = null;
        synchronized (this.c) {
            for (final Map.Entry<K, Long> entry : this.c.entrySet()) {
                final long longValue = entry.getValue();
                final K key = entry.getKey();
                final m4s a2 = hq1.a;
                if (System.currentTimeMillis() - longValue > this.e) {
                    List<T> list2;
                    if ((list2 = list) == null) {
                        list2 = new ArrayList<T>(size);
                    }
                    list2.add((T)key);
                    list = list2;
                }
            }
            monitorexit(this.c);
            Object d0;
            if ((d0 = list) == null) {
                d0 = f2a.D0;
            }
            return (List<T>)d0;
        }
    }
    
    public final void e() {
        final m4s a = hq1.a;
        final long currentTimeMillis = System.currentTimeMillis();
        if (this.c.size() >= this.f && currentTimeMillis - this.g > this.d) {
            Object o = gdd.E0;
            final int a2 = c5j.a;
            Object c = this.c;
            synchronized (c) {
                if (this.c.size() >= this.f) {
                    o = this.d();
                }
                monitorexit(c);
                if (((List)o).size() >= this.f) {
                    this.g = currentTimeMillis;
                    c = new h8a();
                    ((h8a)c).b = new a();
                    final Iterator iterator = ((Iterable)o).iterator();
                    int n = 0;
                    while (iterator.hasNext()) {
                        final Object next = iterator.next();
                        final Locale english = Locale.ENGLISH;
                        ++n;
                        ((h8a)c).b(String.format(english, "LeakedResourceErrorLog.leaked_obj_name_%d", n), (Object)next.getClass().getSimpleName());
                    }
                    ((h8a)c).b("LeakedResourceErrorLog.leaked_obj_count", (Object)n);
                    m8a.c((h8a)c);
                    wk0.b().a();
                    final Iterator iterator2 = this.h.iterator();
                    while (iterator2.hasNext()) {
                        ((b)iterator2.next()).a();
                    }
                }
            }
        }
    }
    
    public static final class a extends Exception
    {
    }
    
    public interface b<T>
    {
        void a(final List<T> p0);
    }
}
