import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rce
{
    public static final ded<Integer> a;
    
    static {
        final ded a2 = new ded(4);
        Collections.addAll((Collection<? super Integer>)a2, new Integer[] { 2, 7, 4, 5 });
        a = a2;
    }
    
    public static int a(final klo klo, final l4a l4a) {
        l4a.r();
        final int j0 = l4a.J0;
        final ded<Integer> a = rce.a;
        final int index = ((AbstractList)a).indexOf(j0);
        if (index >= 0) {
            int a2 = 0;
            if (!klo.c()) {
                a2 = klo.a();
            }
            return ((AbstractList<Integer>)a).get((a2 / 90 + index) % ((AbstractCollection)a).size());
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }
    
    public static int b(final klo klo, final l4a l4a) {
        final boolean b = klo.b();
        int i0 = 0;
        if (!b) {
            return 0;
        }
        l4a.r();
        final int i2 = l4a.I0;
        if (i2 == 90 || i2 == 180 || i2 == 270) {
            l4a.r();
            i0 = l4a.I0;
        }
        if (klo.c()) {
            return i0;
        }
        return (klo.a() + i0) % 360;
    }
}
