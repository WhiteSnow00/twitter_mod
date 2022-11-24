// 
// Decompiled by Procyon v0.6.0
// 

public final class v5d
{
    public int a;
    public Object b;
    public Object c;
    
    public v5d() {
    }
    
    public v5d(final int n, final int n2, final wg8 wg8) {
        this.b = new Object[16];
        this.c = new Object[16];
    }
    
    public static void a(final v5d v5d, final i02 i02) {
        final int length = ((int[])v5d.c).length;
        int j = 0;
        int n = 0;
        while (j < length) {
            ((int[])v5d.c)[j] = n;
            b1b.z(v5d.a, (int[])v5d.b, n, i02);
            n += 1080;
            ++j;
        }
    }
    
    public static void d(final v5d v5d, final int a, final int n) {
        v5d.a = a;
        v5d.b = new int[n * 1080];
        v5d.c = new int[n];
    }
    
    public final int b(final Object o) {
        final int identityHashCode = System.identityHashCode(o);
        int i = 0;
        int n = this.a - 1;
        while (i <= n) {
            final int n2 = i + n >>> 1;
            final Object o2 = ((Object[])this.b)[n2];
            final int identityHashCode2 = System.identityHashCode(o2);
            if (identityHashCode2 < identityHashCode) {
                i = n2 + 1;
            }
            else if (identityHashCode2 > identityHashCode) {
                n = n2 - 1;
            }
            else {
                if (o == o2) {
                    return n2;
                }
                for (int j = n2 - 1; -1 < j; --j) {
                    final Object o3 = ((Object[])this.b)[j];
                    if (o3 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o3) != identityHashCode) {
                        break;
                    }
                }
                for (int j = n2 + 1; j < this.a; ++j) {
                    final Object o4 = ((Object[])this.b)[j];
                    if (o4 == o) {
                        return j;
                    }
                    if (System.identityHashCode(o4) != identityHashCode) {
                        j = -(j + 1);
                        return j;
                    }
                }
                int j = this.a;
                return -(j + 1);
            }
        }
        return -(i + 1);
    }
    
    public final Object c(Object o) {
        e0e.f(o, "key");
        final int b = this.b(o);
        if (b >= 0) {
            o = ((Object[])this.c)[b];
        }
        else {
            o = null;
        }
        return o;
    }
    
    public final void e(final Object o, final Object o2) {
        e0e.f(o, "key");
        final int b = this.b(o);
        if (b >= 0) {
            ((Object[])this.c)[b] = o2;
        }
        else {
            final int n = -(b + 1);
            final int a = this.a;
            final Object[] array = (Object[])this.b;
            final boolean b2 = a == array.length;
            Object[] b3;
            if (b2) {
                b3 = new Object[a * 2];
            }
            else {
                b3 = array;
            }
            final int n2 = n + 1;
            et0.H0(array, b3, n2, n, a);
            if (b2) {
                et0.J0((Object[])this.b, b3, 0, 0, n, 6);
            }
            b3[n] = o;
            this.b = b3;
            Object[] c;
            if (b2) {
                c = new Object[this.a * 2];
            }
            else {
                c = (Object[])this.c;
            }
            et0.H0((Object[])this.c, c, n2, n, this.a);
            if (b2) {
                et0.J0((Object[])this.c, c, 0, 0, n, 6);
            }
            c[n] = o2;
            this.c = c;
            ++this.a;
        }
    }
}
