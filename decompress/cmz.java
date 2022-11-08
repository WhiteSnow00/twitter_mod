import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cmz extends hmz
{
    public final void a(final Object o, final long n) {
        ((dlz)uqz.j(o, n)).c();
    }
    
    public final void b(final Object o, final Object o2, final long n) {
        final dlz dlz = (dlz)uqz.j(o, n);
        final dlz dlz2 = (dlz)uqz.j(o2, n);
        final int size = ((List)dlz).size();
        final int size2 = ((List)dlz2).size();
        Object w = dlz;
        if (size > 0) {
            w = dlz;
            if (size2 > 0) {
                w = dlz;
                if (!dlz.d()) {
                    w = dlz.W(size2 + size);
                }
                ((List)w).addAll((Collection)dlz2);
            }
        }
        if (size <= 0) {
            w = dlz2;
        }
        uqz.r(o, n, w);
    }
}
