import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rza
{
    public final yz1 a;
    public final List<qza> b;
    public boolean c;
    public final int[] d;
    public final xsm e;
    
    public rza(final yz1 a, final xsm e) {
        this.a = a;
        this.b = new ArrayList();
        this.d = new int[5];
        this.e = e;
    }
    
    public static float a(final int[] array, final int n) {
        return n - array[4] - array[3] - array[2] / 2.0f;
    }
    
    public static boolean b(final int[] array) {
        final boolean b = false;
        int i = 0;
        int n = 0;
        while (i < 5) {
            final int n2 = array[i];
            if (n2 == 0) {
                return false;
            }
            n += n2;
            ++i;
        }
        if (n < 7) {
            return false;
        }
        final float n3 = n / 7.0f;
        final float n4 = n3 / 2.0f;
        boolean b2 = b;
        if (Math.abs(n3 - array[0]) < n4) {
            b2 = b;
            if (Math.abs(n3 - array[1]) < n4) {
                b2 = b;
                if (Math.abs(n3 * 3.0f - array[2]) < 3.0f * n4) {
                    b2 = b;
                    if (Math.abs(n3 - array[3]) < n4) {
                        b2 = b;
                        if (Math.abs(n3 - array[4]) < n4) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    public final int[] c() {
        final int[] d = this.d;
        d[0] = 0;
        d[2] = (d[1] = 0);
        d[4] = (d[3] = 0);
        return d;
    }
    
    public final boolean d(int[] c, int i, int n, final boolean b) {
        final int n2 = c[0] + c[1] + c[2] + c[3] + c[4];
        final int n3 = (int)a(c, n);
        final int n4 = c[2];
        final yz1 a = this.a;
        final int e0 = a.E0;
        final int[] c2 = this.c();
        for (n = i; n >= 0 && a.c(n3, n); --n) {
            ++c2[2];
        }
        float a2 = 0.0f;
        Label_0435: {
            int n5;
            if ((n5 = n) >= 0) {
                while (n5 >= 0 && !a.c(n3, n5) && c2[1] <= n4) {
                    ++c2[1];
                    --n5;
                }
                if (n5 >= 0) {
                    if (c2[1] <= n4) {
                        while (n5 >= 0 && a.c(n3, n5) && c2[0] <= n4) {
                            ++c2[0];
                            --n5;
                        }
                        if (c2[0] <= n4) {
                            ++i;
                            while (i < e0 && a.c(n3, i)) {
                                ++c2[2];
                                ++i;
                            }
                            if ((n = i) != e0) {
                                while (n < e0 && !a.c(n3, n) && c2[3] < n4) {
                                    ++c2[3];
                                    ++n;
                                }
                                if (n != e0) {
                                    if (c2[3] < n4) {
                                        while (n < e0 && a.c(n3, n) && c2[4] < n4) {
                                            ++c2[4];
                                            ++n;
                                        }
                                        if (c2[4] < n4) {
                                            if (Math.abs(c2[0] + c2[1] + c2[2] + c2[3] + c2[4] - n2) * 5 < n2 * 2) {
                                                if (b(c2)) {
                                                    a2 = a(c2, n);
                                                    break Label_0435;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            a2 = Float.NaN;
        }
        if (!Float.isNaN(a2)) {
            final int n6 = (int)a2;
            final int n7 = c[2];
            final yz1 a3 = this.a;
            final int d0 = a3.D0;
            final int[] c3 = this.c();
            for (n = n3; n >= 0 && a3.c(n, n6); --n) {
                ++c3[2];
            }
            float a4 = 0.0f;
            Label_0849: {
                if ((i = n) >= 0) {
                    while (i >= 0 && !a3.c(i, n6) && c3[1] <= n7) {
                        ++c3[1];
                        --i;
                    }
                    if (i >= 0) {
                        if (c3[1] <= n7) {
                            while (i >= 0 && a3.c(i, n6) && c3[0] <= n7) {
                                ++c3[0];
                                --i;
                            }
                            if (c3[0] <= n7) {
                                for (i = n3 + 1; i < d0 && a3.c(i, n6); ++i) {
                                    ++c3[2];
                                }
                                if ((n = i) != d0) {
                                    while (n < d0 && !a3.c(n, n6) && c3[3] < n7) {
                                        ++c3[3];
                                        ++n;
                                    }
                                    if (n != d0) {
                                        if (c3[3] < n7) {
                                            while (n < d0 && a3.c(n, n6) && c3[4] < n7) {
                                                ++c3[4];
                                                ++n;
                                            }
                                            if (c3[4] < n7) {
                                                if (Math.abs(c3[0] + c3[1] + c3[2] + c3[3] + c3[4] - n2) * 5 < n2) {
                                                    if (b(c3)) {
                                                        a4 = a(c3, n);
                                                        break Label_0849;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                a4 = Float.NaN;
            }
            if (!Float.isNaN(a4)) {
                if (b) {
                    final int n8 = (int)a4;
                    final int n9 = c[2];
                    c = this.c();
                    for (n = 0; n6 >= n && n8 >= n && this.a.c(n8 - n, n6 - n); ++n) {
                        ++c[2];
                    }
                    Label_1374: {
                        if (n6 >= n) {
                            if (n8 >= (i = n)) {
                                while (n6 >= i && n8 >= i && !this.a.c(n8 - i, n6 - i) && c[1] <= n9) {
                                    ++c[1];
                                    ++i;
                                }
                                if (n6 >= i && n8 >= i) {
                                    if (c[1] <= n9) {
                                        while (n6 >= i && n8 >= i && this.a.c(n8 - i, n6 - i) && c[0] <= n9) {
                                            ++c[0];
                                            ++i;
                                        }
                                        if (c[0] <= n9) {
                                            final yz1 a5 = this.a;
                                            final int e2 = a5.E0;
                                            final int d2 = a5.D0;
                                            i = 1;
                                            int n10;
                                            while (true) {
                                                n10 = n6 + i;
                                                if (n10 >= e2) {
                                                    break;
                                                }
                                                n = n8 + i;
                                                if (n >= d2 || !this.a.c(n, n10)) {
                                                    break;
                                                }
                                                ++c[2];
                                                ++i;
                                            }
                                            if (n10 < e2) {
                                                n = i;
                                                if (n8 + i < d2) {
                                                    int n11;
                                                    while (true) {
                                                        n11 = n6 + n;
                                                        if (n11 >= e2) {
                                                            break;
                                                        }
                                                        i = n8 + n;
                                                        if (i >= d2 || this.a.c(i, n11) || c[3] >= n9) {
                                                            break;
                                                        }
                                                        ++c[3];
                                                        ++n;
                                                    }
                                                    if (n11 < e2 && n8 + n < d2) {
                                                        if (c[3] < n9) {
                                                            while (true) {
                                                                i = n6 + n;
                                                                if (i >= e2) {
                                                                    break;
                                                                }
                                                                final int n12 = n8 + n;
                                                                if (n12 >= d2 || !this.a.c(n12, i) || c[4] >= n9) {
                                                                    break;
                                                                }
                                                                ++c[4];
                                                                ++n;
                                                            }
                                                            if (c[4] < n9) {
                                                                if (Math.abs(c[0] + c[1] + c[2] + c[3] + c[4] - n2) < n2 * 2 && b(c)) {
                                                                    i = 1;
                                                                    break Label_1374;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i = 0;
                    }
                    if (i == 0) {
                        return false;
                    }
                }
                final float n13 = n2 / 7.0f;
                while (true) {
                    qza qza;
                    float abs;
                    ArrayList b2;
                    int d3;
                    float n14;
                    float a6;
                    float n15;
                    xsm e3;
                    for (i = 0; i < this.b.size(); ++i) {
                        qza = this.b.get(i);
                        Label_1479: {
                            if (Math.abs(a2 - ((wsm)qza).b) <= n13 && Math.abs(a4 - ((wsm)qza).a) <= n13) {
                                abs = Math.abs(n13 - qza.c);
                                if (abs <= 1.0f || abs <= qza.c) {
                                    n = 1;
                                    break Label_1479;
                                }
                            }
                            n = 0;
                        }
                        if (n != 0) {
                            b2 = this.b;
                            d3 = qza.d;
                            n = d3 + 1;
                            n14 = (float)d3;
                            a6 = ((wsm)qza).a;
                            n15 = (float)n;
                            b2.set(i, new qza((a6 * n14 + a4) / n15, (((wsm)qza).b * n14 + a2) / n15, (n14 * qza.c + n13) / n15, n));
                            i = 1;
                            if (i == 0) {
                                this.b.add(new qza(a4, a2, n13));
                                e3 = this.e;
                                if (e3 != null) {
                                    e3.a();
                                }
                            }
                            return true;
                        }
                    }
                    i = 0;
                    continue;
                }
            }
        }
        return false;
    }
    
    public final boolean e() {
        final int size = this.b.size();
        final Iterator iterator = this.b.iterator();
        boolean b = false;
        float n = 0.0f;
        int n2 = 0;
        float n3 = 0.0f;
        while (iterator.hasNext()) {
            final qza qza = (qza)iterator.next();
            if (qza.d >= 2) {
                ++n2;
                n3 += qza.c;
            }
        }
        if (n2 < 3) {
            return false;
        }
        final float n4 = n3 / size;
        final Iterator iterator2 = this.b.iterator();
        while (iterator2.hasNext()) {
            n += Math.abs(((qza)iterator2.next()).c - n4);
        }
        if (n <= n3 * 0.05f) {
            b = true;
        }
        return b;
    }
    
    public static final class a implements Comparator<qza>, Serializable
    {
        public final float D0;
        
        public a(final float d0) {
            this.D0 = d0;
        }
        
        @Override
        public final int compare(final Object o, final Object o2) {
            final qza qza = (qza)o;
            final qza qza2 = (qza)o2;
            final int d = qza2.d;
            final int d2 = qza.d;
            int n;
            if (d == d2) {
                final float abs = Math.abs(qza2.c - this.D0);
                final float abs2 = Math.abs(qza.c - this.D0);
                if (abs < abs2) {
                    n = 1;
                }
                else if (abs == abs2) {
                    n = 0;
                }
                else {
                    n = -1;
                }
            }
            else {
                n = d - d2;
            }
            return n;
        }
    }
    
    public static final class b implements Comparator<qza>, Serializable
    {
        public final float D0;
        
        public b(final float d0) {
            this.D0 = d0;
        }
        
        @Override
        public final int compare(final Object o, final Object o2) {
            final qza qza = (qza)o;
            final float abs = Math.abs(((qza)o2).c - this.D0);
            final float abs2 = Math.abs(qza.c - this.D0);
            int n;
            if (abs < abs2) {
                n = -1;
            }
            else if (abs == abs2) {
                n = 0;
            }
            else {
                n = 1;
            }
            return n;
        }
    }
}
