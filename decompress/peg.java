import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class peg
{
    public final Object a = a;
    public final Object b = new LinkedHashMap();
    
    public peg(final int n) {
        if (n != 2) {
            this.a = new HashSet();
            this.b = new sq2();
            return;
        }
        this.a = new HashSet();
        this.b = new HashSet();
    }
    
    public Object a(final int n) {
        final sq2 sq2 = (sq2)this.b;
        synchronized (sq2) {
            final sq2$a sq2$a = (sq2$a)sq2.a.get(n);
            Object pollFirst;
            if (sq2$a == null) {
                pollFirst = null;
                monitorexit(sq2);
            }
            else {
                pollFirst = sq2$a.c.pollFirst();
                sq2.a(sq2$a);
                monitorexit(sq2);
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
        final sq2 sq2 = (sq2)this.b;
        synchronized (sq2) {
            final sq2$a c = sq2.c;
            Object pollLast;
            if (c == null) {
                pollLast = null;
                monitorexit(sq2);
            }
            else {
                pollLast = c.c.pollLast();
                if (c.c.isEmpty()) {
                    sq2.b(c);
                    sq2.a.remove(c.b);
                }
                monitorexit(sq2);
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
                final sq2 sq2 = (sq2)this.b;
                final int b = this.b(o);
                monitorenter(sq2);
                try {
                    sq2$a sq2$a;
                    if ((sq2$a = (sq2$a)sq2.a.get(b)) == null) {
                        sq2$a = new sq2$a(b, new LinkedList());
                        sq2.a.put(b, (Object)sq2$a);
                    }
                    sq2$a.c.addLast(o);
                    sq2.a(sq2$a);
                    monitorexit(sq2);
                }
                finally {}
            }
        }
    }
}
