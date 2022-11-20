import java.util.Arrays;
import java.util.Objects;
import com.google.android.exoplayer2.f;
import android.os.Bundle;
import java.util.List;
import com.google.android.exoplayer2.f$a;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dt2
{
    public static <T extends f> edd<T> a(final f$a<T> f$a, final List<Bundle> list) {
        final edd.b e0 = edd.E0;
        wj1.f(4, "initialCapacity");
        Object[] array = new Object[4];
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < list.size()) {
            final Bundle bundle = list.get(i);
            Objects.requireNonNull(bundle);
            final f m = f$a.m(bundle);
            Objects.requireNonNull(m);
            final int n3 = n + 1;
            Object[] array2 = null;
            int n4 = 0;
            Label_0133: {
                Object[] copy;
                if (array.length < n3) {
                    copy = Arrays.copyOf(array, xcd$b.b(array.length, n3));
                }
                else {
                    array2 = array;
                    if ((n4 = n2) == 0) {
                        break Label_0133;
                    }
                    copy = array.clone();
                }
                n4 = 0;
                array2 = copy;
            }
            array2[n] = m;
            ++i;
            ++n;
            array = array2;
            n2 = n4;
        }
        return (edd<T>)edd.o(array, n);
    }
    
    public static <T extends f> List<T> b(final f$a<T> f$a, final List<Bundle> list, List<T> a) {
        if (list != null) {
            a = a((com.google.android.exoplayer2.f$a<f>)f$a, list);
        }
        return (List<T>)a;
    }
    
    public static <T extends f> T c(final f$a<T> f$a, final Bundle bundle) {
        f m;
        if (bundle == null) {
            m = null;
        }
        else {
            m = f$a.m(bundle);
        }
        return (T)m;
    }
}
