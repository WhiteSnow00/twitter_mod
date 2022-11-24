import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pnz extends unz
{
    public final void a(final Object o, final long n) {
        ((qmz)hsz.j(o, n)).c();
    }
    
    public final void b(final Object o, final Object o2, final long n) {
        final qmz qmz = (qmz)hsz.j(o, n);
        final qmz qmz2 = (qmz)hsz.j(o2, n);
        final int size = ((List)qmz).size();
        final int size2 = ((List)qmz2).size();
        Object w = qmz;
        if (size > 0) {
            w = qmz;
            if (size2 > 0) {
                w = qmz;
                if (!qmz.d()) {
                    w = qmz.W(size2 + size);
                }
                ((List)w).addAll((Collection)qmz2);
            }
        }
        if (size <= 0) {
            w = qmz2;
        }
        hsz.r(o, n, w);
    }
}
