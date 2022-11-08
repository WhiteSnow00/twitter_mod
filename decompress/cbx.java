import java.util.Arrays;
import java.util.HashMap;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class cbx extends qps
{
    public final float d(float n, final long i, final View view, final spe spe) {
        super.a.d(n, super.g);
        final float[] g = super.g;
        final boolean b = true;
        final float n2 = g[1];
        final float n3 = fcmpl(n2, 0.0f);
        if (n3 == 0) {
            super.h = false;
            return g[2];
        }
        if (Float.isNaN(super.j)) {
            n = spe.b(view, super.f);
            super.j = n;
            if (Float.isNaN(n)) {
                super.j = 0.0f;
            }
        }
        n = (float)(((i - super.i) * 1.0E-9 * n2 + super.j) % 1.0);
        super.j = n;
        final String f = super.f;
        if (!((HashMap)spe.D0).containsKey(view)) {
            final HashMap hashMap = new HashMap();
            hashMap.put(f, new float[] { n });
            ((HashMap)spe.D0).put(view, hashMap);
        }
        else {
            HashMap hashMap2;
            if ((hashMap2 = ((HashMap)spe.D0).get(view)) == null) {
                hashMap2 = new HashMap();
            }
            if (!hashMap2.containsKey(f)) {
                hashMap2.put(f, new float[] { n });
                ((HashMap)spe.D0).put(view, hashMap2);
            }
            else {
                float[] array;
                if ((array = (float[])hashMap2.get(f)) == null) {
                    array = new float[0];
                }
                float[] copy = array;
                if (array.length <= 0) {
                    copy = Arrays.copyOf(array, 1);
                }
                copy[0] = n;
                hashMap2.put(f, copy);
            }
        }
        super.i = i;
        final float n4 = super.g[0];
        n = this.a(super.j);
        final float n5 = super.g[2];
        boolean h = b;
        if (n4 == 0.0f) {
            h = (n3 != 0 && b);
        }
        super.h = h;
        return n * n4 + n5;
    }
    
    public abstract boolean e(final View p0, final float p1, final long p2, final spe p3);
}
