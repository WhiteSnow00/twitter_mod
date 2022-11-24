import java.util.Objects;
import java.util.Arrays;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class l0e extends dcu
{
    public static int s(final long n) {
        final int n2 = (int)n;
        if (n2 == n) {
            return n2;
        }
        throw new IllegalArgumentException(yru.v("Out of range: %s", new Object[] { n }));
    }
    
    public static int[] t(final Collection<? extends Number> collection) {
        if (collection instanceof l0e.l0e$a) {
            final l0e.l0e$a l0e$a = (l0e.l0e$a)collection;
            return Arrays.copyOfRange(l0e$a.F0, l0e$a.G0, l0e$a.H0);
        }
        final Object[] array = collection.toArray();
        final int length = array.length;
        final int[] array2 = new int[length];
        for (int i = 0; i < length; ++i) {
            final Object o = array[i];
            Objects.requireNonNull(o);
            array2[i] = ((Number)o).intValue();
        }
        return array2;
    }
}
