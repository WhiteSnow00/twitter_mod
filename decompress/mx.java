import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mx
{
    public final f02 a;
    public final List<lx> b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final int[] h;
    public final fsm i;
    
    public mx(final f02 a, final int c, final int d, final int e, final int f, final float g, final fsm i) {
        this.a = a;
        this.b = new ArrayList(5);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = new int[3];
        this.i = i;
    }
    
    public final boolean a(final int[] array) {
        final float g = this.g;
        final float n = g / 2.0f;
        for (int i = 0; i < 3; ++i) {
            if (Math.abs(g - array[i]) >= n) {
                return false;
            }
        }
        return true;
    }
    
    public final lx b(final int[] array, int n, int n2) {
        final int n3 = array[0] + array[1] + array[2];
        final float n4 = n2 - array[2] - array[1] / 2.0f;
        final int n5 = (int)n4;
        final int n6 = array[1] * 2;
        final f02 a = this.a;
        final int d0 = a.D0;
        final int[] h = this.h;
        h[0] = 0;
        h[2] = (h[1] = 0);
        for (n2 = n; n2 >= 0 && a.c(n5, n2) && h[1] <= n6; --n2) {
            ++h[1];
        }
        float n8;
        final float n7 = n8 = Float.NaN;
        if (n2 >= 0) {
            if (h[1] > n6) {
                n8 = n7;
            }
            else {
                while (n2 >= 0 && !a.c(n5, n2) && h[0] <= n6) {
                    ++h[0];
                    --n2;
                }
                if (h[0] > n6) {
                    n8 = n7;
                }
                else {
                    ++n;
                    while (n < d0 && a.c(n5, n) && h[1] <= n6) {
                        ++h[1];
                        ++n;
                    }
                    n8 = n7;
                    if (n != d0) {
                        if (h[1] > n6) {
                            n8 = n7;
                        }
                        else {
                            while (n < d0 && !a.c(n5, n) && h[2] <= n6) {
                                ++h[2];
                                ++n;
                            }
                            if (h[2] > n6) {
                                n8 = n7;
                            }
                            else if (Math.abs(h[0] + h[1] + h[2] - n3) * 5 >= n3 * 2) {
                                n8 = n7;
                            }
                            else {
                                n8 = n7;
                                if (this.a(h)) {
                                    n8 = n - h[2] - h[1] / 2.0f;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!Float.isNaN(n8)) {
            final float n9 = (array[0] + array[1] + array[2]) / 3.0f;
            for (final lx lx : this.b) {
                Label_0520: {
                    if (Math.abs(n8 - ((esm)lx).b) <= n9 && Math.abs(n4 - ((esm)lx).a) <= n9) {
                        final float abs = Math.abs(n9 - lx.c);
                        if (abs <= 1.0f || abs <= lx.c) {
                            n = 1;
                            break Label_0520;
                        }
                    }
                    n = 0;
                }
                if (n != 0) {
                    return new lx((((esm)lx).a + n4) / 2.0f, (((esm)lx).b + n8) / 2.0f, (lx.c + n9) / 2.0f);
                }
            }
            this.b.add(new lx(n4, n8, n9));
            final fsm i = this.i;
            if (i != null) {
                i.a();
            }
        }
        return null;
    }
}
