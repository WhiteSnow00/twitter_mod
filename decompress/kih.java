import java.util.Iterator;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kih
{
    public static boolean a(final Class<?> clazz) {
        return qfe.class.isAssignableFrom(clazz);
    }
    
    public static <M, J extends fih<M>> M b(final J n) {
        Object s;
        if (n != null) {
            s = n.s();
        }
        else {
            s = null;
        }
        return (M)s;
    }
    
    public static <M, J extends fih<M>> M c(final J n, final M m) {
        final edq c = edq.c;
        Object b = b(n);
        if (b == null) {
            b = c;
        }
        return (M)b;
    }
    
    public static <M, J extends fih<M>, C extends Collection<M>> C d(final Iterable<J> iterable, final kp4<M, C> kp4) {
        final Iterator<J> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            ((rif)kp4).p(iterator.next().s());
        }
        return (C)((rif$a)kp4).g();
    }
}
