import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class zeg
{
    public final Object a;
    public final Object b;
    
    public zeg(final int n) {
        if (n != 2) {
            this.a = new HashSet();
            this.b = new ar2();
            return;
        }
        this.a = new HashSet();
        this.b = new HashSet();
    }
    
    public zeg(final mwt a) {
        e0e.f((Object)a, "tracer");
        this.a = a;
        this.b = new LinkedHashMap();
    }
    
    public Object a(final int n) {
        final ar2 ar2 = (ar2)this.b;
        synchronized (ar2) {
            final ar2$a ar2$a = (ar2$a)ar2.a.get(n);
            Object pollFirst;
            if (ar2$a == null) {
                pollFirst = null;
                monitorexit(ar2);
            }
            else {
                pollFirst = ar2$a.c.pollFirst();
                ar2.a(ar2$a);
                monitorexit(ar2);
            }
            if (pollFirst != null) {
                synchronized (this) {
                    ((Set)this.a).remove(pollFirst);
                }
            }
            return pollFirst;
        }
    }
    
    public abstract int b(final Object p0);
    
    public final Object c() {
        final ar2 ar2 = (ar2)this.b;
        synchronized (ar2) {
            final ar2$a c = ar2.c;
            Object pollLast;
            if (c == null) {
                pollLast = null;
                monitorexit(ar2);
            }
            else {
                pollLast = c.c.pollLast();
                if (c.c.isEmpty()) {
                    ar2.b(c);
                    ar2.a.remove(c.b);
                }
                monitorexit(ar2);
            }
            if (pollLast != null) {
                synchronized (this) {
                    ((Set)this.a).remove(pollLast);
                }
            }
            return pollLast;
        }
    }
    
    public void d(final Object o) {
        synchronized (this) {
            final boolean add = ((Set)this.a).add(o);
            monitorexit(this);
            if (add) {
                final ar2 ar2 = (ar2)this.b;
                final int b = this.b(o);
                monitorenter(ar2);
                try {
                    ar2$a ar2$a;
                    if ((ar2$a = (ar2$a)ar2.a.get(b)) == null) {
                        ar2$a = new ar2$a(b, new LinkedList());
                        ar2.a.put(b, (Object)ar2$a);
                    }
                    ar2$a.c.addLast(o);
                    ar2.a(ar2$a);
                    monitorexit(ar2);
                }
                finally {}
            }
        }
    }
}
