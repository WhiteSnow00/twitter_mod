import java.util.AbstractCollection;
import java.util.Objects;
import java.util.Map;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.Arrays;
import java.util.ArrayList;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.source.i$b;
import com.google.android.exoplayer2.n;
import java.util.Collection;
import android.util.Log;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class er extends vq1
{
    public final xh1 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final eed<er$a> o;
    public final qi4 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public fsg u;
    
    public er(final swt swt, final int[] array, final int n, final xh1 g, final long n2, final long n3, long n4, final int k, final int l, final float m, final float n5, final List<er$a> list, final qi4 p13) {
        super(swt, array);
        if (n4 < n2) {
            Log.w("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            n4 = n2;
        }
        this.g = g;
        this.h = n2 * 1000L;
        this.i = n3 * 1000L;
        this.j = n4 * 1000L;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n5;
        this.o = eed.q((Collection<? extends er$a>)list);
        this.p = p13;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }
    
    public static void u(final List<eed.a<er$a>> list, final long[] array) {
        final int n = 0;
        long n2 = 0L;
        int n3 = 0;
        int i;
        while (true) {
            i = n;
            if (n3 >= array.length) {
                break;
            }
            n2 += array[n3];
            ++n3;
        }
        while (i < list.size()) {
            final eed.a a = list.get(i);
            if (a != null) {
                a.c(new er$a(n2, array[i]));
            }
            ++i;
        }
    }
    
    public final int c() {
        return this.r;
    }
    
    public final void d() {
        this.u = null;
    }
    
    public final void h() {
        this.t = -9223372036854775807L;
        this.u = null;
    }
    
    public final void j(final float q) {
        this.q = q;
    }
    
    public final Object k() {
        return null;
    }
    
    public final void n(long n, final long n2, final long n3, final List<? extends fsg> list, final gsg[] array) {
        final long c = this.p.c();
        final int r = this.r;
        final int length = array.length;
        int i = 0;
        Label_0144: {
            long n4 = 0L;
            Label_0123: {
                if (r >= length || !array[r].next()) {
                    for (final gsg gsg : array) {
                        if (gsg.next()) {
                            n = gsg.b();
                            n4 = gsg.a();
                            break Label_0123;
                        }
                    }
                    n = this.w(list);
                    break Label_0144;
                }
                final gsg gsg2 = array[this.r];
                n = gsg2.b();
                n4 = gsg2.a();
            }
            n -= n4;
        }
        int s = this.s;
        if (s == 0) {
            this.s = 1;
            this.r = this.v(c, n);
            return;
        }
        int r2 = this.r;
        Label_0237: {
            if (!list.isEmpty()) {
                final n d = ((fsg)tpz.F(list)).d;
                while (i < super.b) {
                    if (super.d[i] == d) {
                        break Label_0237;
                    }
                    ++i;
                }
            }
            i = -1;
        }
        if (i != -1) {
            s = ((fsg)tpz.F(list)).e;
            r2 = i;
        }
        int v;
        final int n5 = v = this.v(c, n);
        Label_0414: {
            if (!this.f(r2, c)) {
                final n[] d2 = super.d;
                final n n6 = d2[r2];
                final n n7 = d2[n5];
                if (n3 == -9223372036854775807L) {
                    n = this.h;
                }
                else {
                    long n8 = n3;
                    if (n != -9223372036854775807L) {
                        n8 = n3 - n;
                    }
                    n = Math.min((long)(n8 * this.n), this.h);
                }
                final int m0 = n7.M0;
                final int m2 = n6.M0;
                if (m0 <= m2 || n2 >= n) {
                    v = n5;
                    if (m0 >= m2) {
                        break Label_0414;
                    }
                    v = n5;
                    if (n2 < this.i) {
                        break Label_0414;
                    }
                }
                v = r2;
            }
        }
        if (v != r2) {
            s = 3;
        }
        this.s = s;
        this.r = v;
    }
    
    public final int p(final long n, final List<? extends fsg> list) {
        final long c = this.p.c();
        final long t = this.t;
        final int n2 = 0;
        if (t != -9223372036854775807L && c - t < 1000L && (list.isEmpty() || tpz.F(list).equals(this.u))) {
            return list.size();
        }
        this.t = c;
        fsg u;
        if (list.isEmpty()) {
            u = null;
        }
        else {
            u = (fsg)tpz.F(list);
        }
        this.u = u;
        if (list.isEmpty()) {
            return 0;
        }
        final int size = list.size();
        final long y = rnw.y(list.get(size - 1).g - n, this.q);
        final long j = this.j;
        if (y < j) {
            return size;
        }
        final n n3 = super.d[this.v(c, this.w(list))];
        for (int i = n2; i < size; ++i) {
            final fsg fsg = list.get(i);
            final n d = fsg.d;
            if (rnw.y(fsg.g - n, this.q) >= j && d.M0 < n3.M0) {
                final int w0 = d.W0;
                if (w0 != -1 && w0 <= this.l) {
                    final int v0 = d.V0;
                    if (v0 != -1 && v0 <= this.k && w0 < n3.W0) {
                        return i;
                    }
                }
            }
        }
        return size;
    }
    
    public final int s() {
        return this.s;
    }
    
    public final int v(final long n, long b) {
        b = (long)(this.g.a() * this.m);
        this.g.b();
        b /= (long)this.q;
        if (!((AbstractCollection)this.o).isEmpty()) {
            int n2;
            for (n2 = 1; n2 < ((AbstractCollection)this.o).size() - 1 && ((er$a)this.o.get(n2)).a < b; ++n2) {}
            final er$a er$a = this.o.get(n2 - 1);
            final er$a er$a2 = this.o.get(n2);
            final long a = er$a.a;
            final float n3 = (b - a) / (float)(er$a2.a - a);
            b = er$a.b;
            b += (long)(n3 * (er$a2.b - b));
        }
        int i = 0;
        int n4 = 0;
        while (i < super.b) {
            if (n == Long.MIN_VALUE || !this.f(i, n)) {
                if (super.d[i].M0 <= b) {
                    return i;
                }
                n4 = i;
            }
            ++i;
        }
        return n4;
    }
    
    public final long w(final List<? extends fsg> list) {
        final boolean empty = list.isEmpty();
        final long n = -9223372036854775807L;
        if (empty) {
            return -9223372036854775807L;
        }
        final fsg fsg = (fsg)tpz.F(list);
        final long g = fsg.g;
        long n2 = n;
        if (g != -9223372036854775807L) {
            final long h = fsg.h;
            n2 = n;
            if (h != -9223372036854775807L) {
                n2 = h - g;
            }
        }
        return n2;
    }
    
    public static final class b implements tha.b
    {
        public final int a;
        public final int b;
        public final int c;
        public final float d;
        
        public b(final int a, final int b, final int c, final float d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final tha[] a(final a[] array, final xh1 xh1, final i$b i$b, final e0 e0) {
            final ArrayList list = new ArrayList();
            for (int i = 0; i < array.length; ++i) {
                if (array[i] != null && array[i].b.length > 1) {
                    final eed.b g0 = eed.G0;
                    final eed.a a = new eed.a();
                    a.c(new er$a(0L, 0L));
                    list.add(a);
                }
                else {
                    list.add(null);
                }
            }
            final int length = array.length;
            final long[][] array2 = new long[length][];
            for (int j = 0; j < array.length; ++j) {
                final a a2 = array[j];
                if (a2 == null) {
                    array2[j] = new long[0];
                }
                else {
                    array2[j] = new long[a2.b.length];
                    int n = 0;
                    while (true) {
                        final int[] b = a2.b;
                        if (n >= b.length) {
                            break;
                        }
                        array2[j][n] = a2.a.H0[b[n]].M0;
                        ++n;
                    }
                    Arrays.sort(array2[j]);
                }
            }
            int[] array3 = new int[length];
            final long[] array4 = new long[length];
            for (int k = 0; k < length; ++k) {
                long n2;
                if (array2[k].length == 0) {
                    n2 = 0L;
                }
                else {
                    n2 = array2[k][0];
                }
                array4[k] = n2;
            }
            er.u(list, array4);
            final rai f0 = rai.F0;
            iuk.y(2, "expectedValuesPerKey");
            final vth vth = new vth((Map)new TreeMap((Comparator)f0), (wzr)new uth(2));
            for (int l = 0; l < length; ++l) {
                if (array2[l].length > 1) {
                    int length2 = array2[l].length;
                    final double[] array5 = new double[length2];
                    int n3 = 0;
                    while (true) {
                        final int length3 = array2[l].length;
                        double log = 0.0;
                        if (n3 >= length3) {
                            break;
                        }
                        if (array2[l][n3] != -1L) {
                            log = Math.log((double)array2[l][n3]);
                        }
                        array5[n3] = log;
                        ++n3;
                    }
                    final int[] array6 = array3;
                    --length2;
                    final double n4 = array5[length2] - array5[0];
                    int n5 = 0;
                    while (true) {
                        array3 = array6;
                        if (n5 >= length2) {
                            break;
                        }
                        final double n6 = array5[n5];
                        ++n5;
                        final double n7 = array5[n5];
                        double n8;
                        if (n4 == 0.0) {
                            n8 = 1.0;
                        }
                        else {
                            n8 = ((n6 + n7) * 0.5 - array5[0]) / n4;
                        }
                        final Double value = n8;
                        final Integer value2 = l;
                        final Collection collection = ((pc)vth).I0.get(value);
                        if (collection == null) {
                            final Collection g2 = vth.g();
                            if (!g2.add(value2)) {
                                throw new AssertionError((Object)"New Collection violated the Collection spec");
                            }
                            ++((pc)vth).J0;
                            ((pc)vth).I0.put((K)value, g2);
                        }
                        else {
                            if (!collection.add(value2)) {
                                continue;
                            }
                            ++((pc)vth).J0;
                        }
                    }
                }
            }
            AbstractCollection<Object> g3;
            if ((g3 = ((vc)vth).G0) == null) {
                g3 = (vc)vth.new a();
                ((vc)vth).G0 = (vc.a)g3;
            }
            final eed<Object> q = eed.q((Collection<?>)g3);
            for (int n9 = 0; n9 < ((AbstractCollection)q).size(); ++n9) {
                final int intValue = q.get(n9);
                final int n10 = array3[intValue] + 1;
                array3[intValue] = n10;
                array4[intValue] = array2[intValue][n10];
                er.u(list, array4);
            }
            for (int n11 = 0; n11 < array.length; ++n11) {
                if (list.get(n11) != null) {
                    array4[n11] *= 2L;
                }
            }
            er.u(list, array4);
            iuk.y(4, "initialCapacity");
            Object[] array7 = new Object[4];
            int n12 = 0;
            int n13 = 0;
            while (n12 < list.size()) {
                final eed.a a3 = list.get(n12);
                eed eed;
                if (a3 == null) {
                    eed = nbm.J0;
                }
                else {
                    eed = a3.f();
                }
                Objects.requireNonNull(eed);
                final int n14 = n13 + 1;
                Object[] copy = array7;
                if (array7.length < n14) {
                    copy = Arrays.copyOf(array7, xdd$b.b(array7.length, n14));
                }
                copy[n13] = eed;
                ++n12;
                n13 = n14;
                array7 = copy;
            }
            final eed<Object> o = eed.o(array7, n13);
            final tha[] array8 = new tha[array.length];
            for (int n15 = 0; n15 < array.length; ++n15) {
                final a a4 = array[n15];
                if (a4 != null) {
                    final int[] b2 = a4.b;
                    if (b2.length != 0) {
                        vq1 vq1;
                        if (b2.length == 1) {
                            vq1 = new e2b(a4.a, b2[0], a4.c);
                        }
                        else {
                            vq1 = new er(a4.a, b2, a4.c, xh1, this.a, this.b, this.c, 1279, 719, this.d, 0.75f, ((nbm<eed>)o).get(n15), (qi4)qi4.a);
                        }
                        array8[n15] = (tha)vq1;
                    }
                }
            }
            return array8;
        }
    }
}
