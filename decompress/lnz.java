import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lnz extends unz
{
    public static final Class c;
    
    static {
        c = Collections.unmodifiableList(Collections.emptyList()).getClass();
    }
    
    public final void a(final Object o, final long n) {
        final List list = (List)hsz.j(o, n);
        Object o2;
        if (list instanceof hnz) {
            o2 = ((hnz)list).f();
        }
        else {
            if (lnz.c.isAssignableFrom(list.getClass())) {
                return;
            }
            if (list instanceof dqz && list instanceof qmz) {
                final qmz qmz = (qmz)list;
                if (qmz.d()) {
                    qmz.c();
                }
                return;
            }
            o2 = Collections.unmodifiableList((List<?>)list);
        }
        hsz.r(o, n, o2);
    }
    
    public final void b(final Object o, final Object o2, final long n) {
        final List list = (List)hsz.j(o2, n);
        final int size = list.size();
        final List list2 = (List)hsz.j(o, n);
        Object o3;
        if (list2.isEmpty()) {
            if (list2 instanceof hnz) {
                o3 = new enz(size);
            }
            else if (list2 instanceof dqz && list2 instanceof qmz) {
                o3 = ((qmz)list2).W(size);
            }
            else {
                o3 = new ArrayList(size);
            }
            hsz.r(o, n, o3);
        }
        else if (lnz.c.isAssignableFrom(((enz)list2).getClass())) {
            o3 = new ArrayList(list2.size() + size);
            ((ArrayList)o3).addAll(list2);
            hsz.r(o, n, o3);
        }
        else if (list2 instanceof csz) {
            o3 = new enz(list2.size() + size);
            ((enz)o3).addAll(((enz)o3).size(), list2);
            hsz.r(o, n, o3);
        }
        else {
            o3 = list2;
            if (list2 instanceof dqz) {
                o3 = list2;
                if (list2 instanceof qmz) {
                    final qmz qmz = (qmz)list2;
                    o3 = list2;
                    if (!qmz.d()) {
                        o3 = qmz.W(list2.size() + size);
                        hsz.r(o, n, o3);
                    }
                }
            }
        }
        final int size2 = ((List)o3).size();
        final int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            ((List<Object>)o3).addAll(list);
        }
        if (size2 <= 0) {
            o3 = list;
        }
        hsz.r(o, n, o3);
    }
}
