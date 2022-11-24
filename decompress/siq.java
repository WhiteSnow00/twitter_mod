import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class siq implements Iterable<Integer>, koe
{
    public static final a Companion;
    public static final siq J0;
    public final long F0;
    public final long G0;
    public final int H0;
    public final int[] I0;
    
    static {
        Companion = new a();
        J0 = new siq(0L, 0L, 0, null);
    }
    
    public siq(final long f0, final long g0, final int h0, final int[] i0) {
        this.F0 = f0;
        this.G0 = g0;
        this.H0 = h0;
        this.I0 = i0;
    }
    
    public final siq e(siq g) {
        e0e.f((Object)g, "bits");
        final siq j0 = siq.J0;
        if (g == j0) {
            return this;
        }
        if (this == j0) {
            return j0;
        }
        final int h0 = g.H0;
        final int h2 = this.H0;
        if (h0 == h2) {
            final int[] i0 = g.I0;
            final int[] i2 = this.I0;
            if (i0 == i2) {
                return new siq(this.F0 & ~g.F0, this.G0 & ~g.G0, h2, i2);
            }
        }
        final Iterator<Integer> iterator = g.iterator();
        g = this;
        siq siq;
        while (true) {
            siq = g;
            if (!iterator.hasNext()) {
                break;
            }
            g = g.g(iterator.next().intValue());
        }
        return siq;
    }
    
    public final siq g(int n) {
        final int h0 = this.H0;
        final int n2 = n - h0;
        if (n2 >= 0 && n2 < 64) {
            final long n3 = 1L << n2;
            final long g0 = this.G0;
            if ((g0 & n3) != 0x0L) {
                return new siq(this.F0, g0 & ~n3, h0, this.I0);
            }
        }
        else if (n2 >= 64 && n2 < 128) {
            final long n4 = 1L << n2 - 64;
            final long f0 = this.F0;
            if ((f0 & n4) != 0x0L) {
                return new siq(f0 & ~n4, this.G0, h0, this.I0);
            }
        }
        else if (n2 < 0) {
            final int[] i0 = this.I0;
            if (i0 != null) {
                final int j = lp7.i(i0, n);
                if (j >= 0) {
                    n = i0.length - 1;
                    if (n == 0) {
                        return new siq(this.F0, this.G0, this.H0, null);
                    }
                    final int[] array = new int[n];
                    if (j > 0) {
                        et0.G0(i0, array, 0, 0, j);
                    }
                    if (j < n) {
                        et0.G0(i0, array, j, j + 1, n + 1);
                    }
                    return new siq(this.F0, this.G0, this.H0, array);
                }
            }
        }
        return this;
    }
    
    public final boolean i(final int n) {
        final int n2 = n - this.H0;
        final boolean b = true;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = false;
        if (n2 >= 0 && n2 < 64) {
            return (1L << n2 & this.G0) != 0x0L && b3;
        }
        if (n2 >= 64 && n2 < 128) {
            return (1L << n2 - 64 & this.F0) != 0x0L && b;
        }
        if (n2 > 0) {
            return false;
        }
        final int[] i0 = this.I0;
        if (i0 != null) {
            b4 = (lp7.i(i0, n) >= 0 && b2);
        }
        return b4;
    }
    
    @Override
    public final Iterator<Integer> iterator() {
        return ((ykp)fbx.c0((hub)new siq$b(this, (mp6)null))).iterator();
    }
    
    public final siq j(siq siq) {
        e0e.f((Object)siq, "bits");
        final siq j0 = siq.J0;
        if (siq == j0) {
            return this;
        }
        if (this == j0) {
            return siq;
        }
        final int h0 = siq.H0;
        final int h2 = this.H0;
        if (h0 == h2) {
            final int[] i0 = siq.I0;
            final int[] i2 = this.I0;
            if (i0 == i2) {
                return new siq(this.F0 | siq.F0, this.G0 | siq.G0, h2, i2);
            }
        }
        siq siq2;
        if (this.I0 == null) {
            final Iterator<Integer> iterator = this.iterator();
            while (iterator.hasNext()) {
                siq = siq.k(iterator.next().intValue());
            }
            siq2 = siq;
        }
        else {
            final Iterator<Integer> iterator2 = siq.iterator();
            siq = this;
            while (true) {
                siq2 = siq;
                if (!iterator2.hasNext()) {
                    break;
                }
                siq = siq.k(iterator2.next().intValue());
            }
        }
        return siq2;
    }
    
    public final siq k(final int n) {
        final int h0 = this.H0;
        final int n2 = n - h0;
        long n3 = 0L;
        if (n2 >= 0 && n2 < 64) {
            final long n4 = 1L << n2;
            final long g0 = this.G0;
            if ((g0 & n4) == 0x0L) {
                return new siq(this.F0, g0 | n4, h0, this.I0);
            }
        }
        else if (n2 >= 64 && n2 < 128) {
            final long n5 = 1L << n2 - 64;
            final long f0 = this.F0;
            if ((f0 & n5) == 0x0L) {
                return new siq(f0 | n5, this.G0, h0, this.I0);
            }
        }
        else if (n2 >= 128) {
            if (!this.i(n)) {
                long f2 = this.F0;
                long g2 = this.G0;
                int i = this.H0;
                List<Integer> list = null;
                long n7;
                List<Integer> list2;
                for (int n6 = (n + 1) / 64 * 64; i < n6; i += 64, g2 = f2, f2 = n7, n3 = n7, list = list2) {
                    n7 = n3;
                    list2 = list;
                    if (g2 != n3) {
                        if ((list2 = list) == null) {
                            final ArrayList<Integer> list3 = new ArrayList<Integer>();
                            final int[] i2 = this.I0;
                            list2 = list3;
                            if (i2 != null) {
                                final int length = i2.length;
                                int n8 = 0;
                                while (true) {
                                    list2 = list3;
                                    if (n8 >= length) {
                                        break;
                                    }
                                    list3.add(i2[n8]);
                                    ++n8;
                                }
                            }
                        }
                        for (int j = 0; j < 64; ++j) {
                            if ((1L << j & g2) != 0x0L) {
                                list2.add(j + i);
                            }
                        }
                        n7 = 0L;
                    }
                    if (f2 == n7) {
                        i = n6;
                        list = list2;
                        g2 = n7;
                        break;
                    }
                }
                int[] array;
                if (list != null) {
                    array = rr4.h2((Collection)list);
                }
                else {
                    array = this.I0;
                }
                return new siq(f2, g2, i, array).k(n);
            }
        }
        else {
            final int[] i3 = this.I0;
            if (i3 == null) {
                return new siq(this.F0, this.G0, h0, new int[] { n });
            }
            final int k = lp7.i(i3, n);
            if (k < 0) {
                final int n9 = -(k + 1);
                final int n10 = i3.length + 1;
                final int[] array2 = new int[n10];
                et0.G0(i3, array2, 0, 0, n9);
                et0.G0(i3, array2, n9 + 1, n9, n10 - 1);
                array2[n9] = n;
                return new siq(this.F0, this.G0, this.H0, array2);
            }
        }
        return this;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        final ArrayList list = new ArrayList(nr4.d1((Iterable)this, 10));
        final Iterator<Integer> iterator = this.iterator();
        while (iterator.hasNext()) {
            list.add(String.valueOf(iterator.next().intValue()));
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence)"");
        final int size = list.size();
        int i = 0;
        int n = 0;
        while (i < size) {
            final Object value = list.get(i);
            boolean b = true;
            if (++n > 1) {
                sb2.append((CharSequence)", ");
            }
            if (value != null) {
                b = (value instanceof CharSequence);
            }
            if (b) {
                sb2.append((CharSequence)value);
            }
            else if (value instanceof Character) {
                sb2.append((char)value);
            }
            else {
                sb2.append((CharSequence)String.valueOf(value));
            }
            ++i;
        }
        sb2.append((CharSequence)"");
        final String string = sb2.toString();
        e0e.e((Object)string, "fastJoinTo(StringBuilder\u2026form)\n        .toString()");
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
    
    public static final class a
    {
    }
}
