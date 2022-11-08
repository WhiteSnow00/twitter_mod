import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vs0 implements et0$a
{
    public int a;
    public final et0 b;
    public final wb7 c;
    public int d;
    public int[] e;
    public int[] f;
    public float[] g;
    public int h;
    public int i;
    public boolean j;
    
    public vs0(final et0 b, final wb7 c) {
        this.a = 0;
        this.d = 8;
        this.e = new int[8];
        this.f = new int[8];
        this.g = new float[8];
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(final ukq ukq) {
        int h = this.h;
        if (h == -1) {
            return false;
        }
        for (int n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            if (this.e[h] == ukq.D0) {
                return true;
            }
        }
        return false;
    }
    
    public final ukq b(final int n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            if (n2 == n) {
                return ((ukq[])this.c.d)[this.e[h]];
            }
        }
        return null;
    }
    
    public final void c() {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final float[] g = this.g;
            g[h] *= -1.0f;
        }
    }
    
    public final void clear() {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final ukq ukq = ((ukq[])this.c.d)[this.e[h]];
            if (ukq != null) {
                ukq.e(this.b);
            }
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }
    
    public final float d(final et0 et0, final boolean b) {
        final float e = this.e(et0.a);
        this.i(et0.a, b);
        final et0.et0$a d = et0.d;
        for (int f = d.f(), i = 0; i < f; ++i) {
            final ukq b2 = d.b(i);
            this.g(b2, d.e(b2) * e, b);
        }
        return e;
    }
    
    public final float e(final ukq ukq) {
        for (int h = this.h, n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            if (this.e[h] == ukq.D0) {
                return this.g[h];
            }
        }
        return 0.0f;
    }
    
    public final int f() {
        return this.a;
    }
    
    public final void g(final ukq ukq, float n, final boolean b) {
        if (n > -0.001f && n < 0.001f) {
            return;
        }
        int h = this.h;
        if (h == -1) {
            this.h = 0;
            this.g[0] = n;
            this.e[0] = ukq.D0;
            this.f[0] = -1;
            ++ukq.N0;
            ukq.b(this.b);
            ++this.a;
            if (!this.j) {
                final int i = this.i + 1;
                this.i = i;
                final int[] e = this.e;
                if (i >= e.length) {
                    this.j = true;
                    this.i = e.length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (h != -1 && n2 < this.a) {
            final int[] e2 = this.e;
            final int n4 = e2[h];
            final int d0 = ukq.D0;
            if (n4 == d0) {
                final float[] g = this.g;
                final float n5 = n += g[h];
                if (n5 > -0.001f) {
                    n = n5;
                    if (n5 < 0.001f) {
                        n = 0.0f;
                    }
                }
                g[h] = n;
                if (n == 0.0f) {
                    if (h == this.h) {
                        this.h = this.f[h];
                    }
                    else {
                        final int[] f = this.f;
                        f[n3] = f[h];
                    }
                    if (b) {
                        ukq.e(this.b);
                    }
                    if (this.j) {
                        this.i = h;
                    }
                    --ukq.N0;
                    --this.a;
                }
                return;
            }
            if (e2[h] < d0) {
                n3 = h;
            }
            h = this.f[h];
            ++n2;
        }
        int n6 = this.i;
        if (this.j) {
            final int[] e3 = this.e;
            if (e3[n6] != -1) {
                n6 = e3.length;
            }
        }
        else {
            ++n6;
        }
        final int[] e4 = this.e;
        int n7 = n6;
        if (n6 >= e4.length) {
            n7 = n6;
            if (this.a < e4.length) {
                int n8 = 0;
                while (true) {
                    final int[] e5 = this.e;
                    n7 = n6;
                    if (n8 >= e5.length) {
                        break;
                    }
                    if (e5[n8] == -1) {
                        n7 = n8;
                        break;
                    }
                    ++n8;
                }
            }
        }
        final int[] e6 = this.e;
        int length;
        if ((length = n7) >= e6.length) {
            length = e6.length;
            final int d2 = this.d * 2;
            this.d = d2;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, d2);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = ukq.D0;
        this.g[length] = n;
        if (n3 != -1) {
            final int[] f2 = this.f;
            f2[length] = f2[n3];
            f2[n3] = length;
        }
        else {
            this.f[length] = this.h;
            this.h = length;
        }
        ++ukq.N0;
        ukq.b(this.b);
        ++this.a;
        if (!this.j) {
            ++this.i;
        }
        final int j = this.i;
        final int[] e7 = this.e;
        if (j >= e7.length) {
            this.j = true;
            this.i = e7.length - 1;
        }
    }
    
    public final float h(final int n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            if (n2 == n) {
                return this.g[h];
            }
        }
        return 0.0f;
    }
    
    public final float i(final ukq ukq, final boolean b) {
        int h = this.h;
        if (h == -1) {
            return 0.0f;
        }
        int n = 0;
        int n2 = -1;
        while (h != -1 && n < this.a) {
            if (this.e[h] == ukq.D0) {
                if (h == this.h) {
                    this.h = this.f[h];
                }
                else {
                    final int[] f = this.f;
                    f[n2] = f[h];
                }
                if (b) {
                    ukq.e(this.b);
                }
                --ukq.N0;
                --this.a;
                this.e[h] = -1;
                if (this.j) {
                    this.i = h;
                }
                return this.g[h];
            }
            final int n3 = this.f[h];
            ++n;
            n2 = h;
            h = n3;
        }
        return 0.0f;
    }
    
    public final void j(final float n) {
        for (int h = this.h, n2 = 0; h != -1 && n2 < this.a; h = this.f[h], ++n2) {
            final float[] g = this.g;
            g[h] /= n;
        }
    }
    
    public final void k(final ukq ukq, final float n) {
        if (n == 0.0f) {
            this.i(ukq, true);
            return;
        }
        int h = this.h;
        if (h == -1) {
            this.h = 0;
            this.g[0] = n;
            this.e[0] = ukq.D0;
            this.f[0] = -1;
            ++ukq.N0;
            ukq.b(this.b);
            ++this.a;
            if (!this.j) {
                final int i = this.i + 1;
                this.i = i;
                final int[] e = this.e;
                if (i >= e.length) {
                    this.j = true;
                    this.i = e.length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (h != -1 && n2 < this.a) {
            final int[] e2 = this.e;
            final int n4 = e2[h];
            final int d0 = ukq.D0;
            if (n4 == d0) {
                this.g[h] = n;
                return;
            }
            if (e2[h] < d0) {
                n3 = h;
            }
            h = this.f[h];
            ++n2;
        }
        int n5 = this.i;
        if (this.j) {
            final int[] e3 = this.e;
            if (e3[n5] != -1) {
                n5 = e3.length;
            }
        }
        else {
            ++n5;
        }
        final int[] e4 = this.e;
        int n6 = n5;
        if (n5 >= e4.length) {
            n6 = n5;
            if (this.a < e4.length) {
                int n7 = 0;
                while (true) {
                    final int[] e5 = this.e;
                    n6 = n5;
                    if (n7 >= e5.length) {
                        break;
                    }
                    if (e5[n7] == -1) {
                        n6 = n7;
                        break;
                    }
                    ++n7;
                }
            }
        }
        final int[] e6 = this.e;
        int length;
        if ((length = n6) >= e6.length) {
            length = e6.length;
            final int d2 = this.d * 2;
            this.d = d2;
            this.j = false;
            this.i = length - 1;
            this.g = Arrays.copyOf(this.g, d2);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[length] = ukq.D0;
        this.g[length] = n;
        if (n3 != -1) {
            final int[] f = this.f;
            f[length] = f[n3];
            f[n3] = length;
        }
        else {
            this.f[length] = this.h;
            this.h = length;
        }
        ++ukq.N0;
        ukq.b(this.b);
        final int a = this.a + 1;
        this.a = a;
        if (!this.j) {
            ++this.i;
        }
        final int[] e7 = this.e;
        if (a >= e7.length) {
            this.j = true;
        }
        if (this.i >= e7.length) {
            this.j = true;
            this.i = e7.length - 1;
        }
    }
    
    @Override
    public final String toString() {
        int h = this.h;
        String string = "";
        for (int n = 0; h != -1 && n < this.a; h = this.f[h], ++n) {
            final StringBuilder g = w48.g(l7k.c(string, " -> "));
            g.append(this.g[h]);
            g.append(" : ");
            final StringBuilder g2 = w48.g(g.toString());
            g2.append(((ukq[])this.c.d)[this.e[h]]);
            string = g2.toString();
        }
        return string;
    }
}
