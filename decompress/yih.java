import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yih
{
    public static boolean a(final Class<?> clazz) {
        return nge.class.isAssignableFrom(clazz);
    }
    
    public static <M, J extends tih<M>> M b(final J n) {
        M s;
        if (n != null) {
            s = n.s();
        }
        else {
            s = null;
        }
        return s;
    }
    
    public static <M, J extends tih<M>> M c(final J n, final M m) {
        final beq c = beq.c;
        Object b = b(n);
        if (b == null) {
            b = c;
        }
        return (M)b;
    }
    
    public static <M, J extends tih<M>, C extends Collection<M>> C d(final Iterable<J> iterable, final pq4<M, C> pq4) {
        final Iterator<J> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            ((ojf)pq4).p(((tih<Object>)iterator.next()).s());
        }
        return (C)((ojf$a)pq4).g();
    }
}
