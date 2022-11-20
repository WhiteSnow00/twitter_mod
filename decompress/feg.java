import java.util.LinkedList;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.HashSet;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class feg
{
    public final Object a;
    public final Object b;
    
    public feg(final int n) {
        if (n != 2) {
            this.a = new HashSet();
            this.b = new jq2();
            return;
        }
        this.a = new HashSet();
        this.b = new HashSet();
    }
    
    public feg(final vvt a) {
        czd.f((Object)a, "tracer");
        this.a = a;
        this.b = new LinkedHashMap();
    }
    
    public Object a(final int n) {
        final jq2 jq2 = (jq2)this.b;
        synchronized (jq2) {
            final jq2.a a = (jq2.a)jq2.a.get(n);
            Object pollFirst;
            if (a == null) {
                pollFirst = null;
                monitorexit(jq2);
            }
            else {
                pollFirst = a.c.pollFirst();
                jq2.a(a);
                monitorexit(jq2);
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
        final jq2 jq2 = (jq2)this.b;
        synchronized (jq2) {
            final jq2.a<T> c = jq2.c;
            Object pollLast;
            if (c == null) {
                pollLast = null;
                monitorexit(jq2);
            }
            else {
                pollLast = c.c.pollLast();
                if (c.c.isEmpty()) {
                    jq2.b(c);
                    jq2.a.remove(c.b);
                }
                monitorexit(jq2);
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
                final jq2 jq2 = (jq2)this.b;
                final int b = this.b(o);
                monitorenter(jq2);
                try {
                    Object o2;
                    if ((o2 = jq2.a.get(b)) == null) {
                        o2 = new jq2.a(b, new LinkedList());
                        jq2.a.put(b, o2);
                    }
                    ((jq2.a)o2).c.addLast((I)o);
                    jq2.a((jq2.a)o2);
                    monitorexit(jq2);
                }
                finally {}
            }
        }
    }
}
