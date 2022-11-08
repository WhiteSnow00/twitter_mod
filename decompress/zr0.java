// 
// Decompiled by Procyon v0.6.0
// 

public final class zr0 extends ia7
{
    public final double[] a;
    public zr0.zr0$a[] b;
    
    public zr0(final int[] array, final double[] a, final double[][] array2) {
        this.a = a;
        this.b = new zr0.zr0$a[a.length - 1];
        int n = 0;
        int n2 = 1;
        int n3 = 1;
        while (true) {
            final zr0.zr0$a[] b = this.b;
            if (n >= b.length) {
                break;
            }
            final int n4 = array[n];
            if (n4 != 0) {
                if (n4 != 1) {
                    if (n4 != 2) {
                        if (n4 == 3) {
                            if (n2 == 1) {
                                n2 = 2;
                            }
                            else {
                                n2 = 1;
                            }
                            n3 = n2;
                        }
                    }
                    else {
                        n2 = 2;
                        n3 = 2;
                    }
                }
                else {
                    n2 = 1;
                    n3 = 1;
                }
            }
            else {
                n3 = 3;
            }
            final double n5 = a[n];
            final int n6 = n + 1;
            b[n] = new zr0.zr0$a(n3, n5, a[n6], array2[n][0], array2[n][1], array2[n6][0], array2[n6][1]);
            n = n6;
        }
    }
    
    @Override
    public final double b(double n) {
        final zr0.zr0$a[] b = this.b;
        int n2 = 0;
        if (n < b[0].c) {
            final double c = b[0].c;
            n -= b[0].c;
            if (b[0].r) {
                return n * this.b[0].l + b[0].c(c);
            }
            b[0].g(c);
            return this.b[0].a() * n + this.b[0].e();
        }
        else {
            if (n > b[b.length - 1].d) {
                final double d = b[b.length - 1].d;
                final int n3 = b.length - 1;
                return (n - d) * this.b[n3].l + b[n3].c(d);
            }
            while (true) {
                final zr0.zr0$a[] b2 = this.b;
                if (n2 >= b2.length) {
                    return Double.NaN;
                }
                if (n <= b2[n2].d) {
                    if (b2[n2].r) {
                        return b2[n2].c(n);
                    }
                    b2[n2].g(n);
                    return this.b[n2].e();
                }
                else {
                    ++n2;
                }
            }
        }
    }
    
    @Override
    public final void c(double n, final double[] array) {
        final zr0.zr0$a[] b = this.b;
        if (n < b[0].c) {
            final double c = b[0].c;
            n -= b[0].c;
            if (b[0].r) {
                final double c2 = b[0].c(c);
                final zr0.zr0$a[] b2 = this.b;
                array[0] = b2[0].l * n + c2;
                array[1] = n * this.b[0].m + b2[0].d(c);
            }
            else {
                b[0].g(c);
                array[0] = this.b[0].a() * n + this.b[0].e();
                array[1] = this.b[0].b() * n + this.b[0].f();
            }
            return;
        }
        if (n > b[b.length - 1].d) {
            final double d = b[b.length - 1].d;
            final double n2 = n - d;
            final int n3 = b.length - 1;
            if (b[n3].r) {
                n = b[n3].c(d);
                final zr0.zr0$a[] b3 = this.b;
                array[0] = b3[n3].l * n2 + n;
                n = b3[n3].d(d);
                array[1] = n2 * this.b[n3].m + n;
            }
            else {
                b[n3].g(n);
                n = this.b[n3].e();
                array[0] = this.b[n3].a() * n2 + n;
                n = this.b[n3].f();
                array[1] = this.b[n3].b() * n2 + n;
            }
            return;
        }
        int n4 = 0;
        while (true) {
            final zr0.zr0$a[] b4 = this.b;
            if (n4 >= b4.length) {
                return;
            }
            if (n <= b4[n4].d) {
                if (b4[n4].r) {
                    array[0] = b4[n4].c(n);
                    array[1] = this.b[n4].d(n);
                    return;
                }
                b4[n4].g(n);
                array[0] = this.b[n4].e();
                array[1] = this.b[n4].f();
            }
            else {
                ++n4;
            }
        }
    }
    
    @Override
    public final void d(double n, final float[] array) {
        final zr0.zr0$a[] b = this.b;
        if (n < b[0].c) {
            final double c = b[0].c;
            n -= b[0].c;
            if (b[0].r) {
                final double c2 = b[0].c(c);
                final zr0.zr0$a[] b2 = this.b;
                array[0] = (float)(b2[0].l * n + c2);
                array[1] = (float)(n * this.b[0].m + b2[0].d(c));
            }
            else {
                b[0].g(c);
                array[0] = (float)(this.b[0].a() * n + this.b[0].e());
                array[1] = (float)(this.b[0].b() * n + this.b[0].f());
            }
            return;
        }
        if (n > b[b.length - 1].d) {
            final double d = b[b.length - 1].d;
            final double n2 = n - d;
            final int n3 = b.length - 1;
            if (b[n3].r) {
                n = b[n3].c(d);
                final zr0.zr0$a[] b3 = this.b;
                array[0] = (float)(b3[n3].l * n2 + n);
                n = b3[n3].d(d);
                array[1] = (float)(n2 * this.b[n3].m + n);
            }
            else {
                b[n3].g(n);
                array[0] = (float)this.b[n3].e();
                array[1] = (float)this.b[n3].f();
            }
            return;
        }
        int n4 = 0;
        while (true) {
            final zr0.zr0$a[] b4 = this.b;
            if (n4 >= b4.length) {
                return;
            }
            if (n <= b4[n4].d) {
                if (b4[n4].r) {
                    array[0] = (float)b4[n4].c(n);
                    array[1] = (float)this.b[n4].d(n);
                    return;
                }
                b4[n4].g(n);
                array[0] = (float)this.b[n4].e();
                array[1] = (float)this.b[n4].f();
            }
            else {
                ++n4;
            }
        }
    }
    
    @Override
    public final void e(final double n, final double[] array) {
        final zr0.zr0$a[] b = this.b;
        double n2;
        if (n < b[0].c) {
            n2 = b[0].c;
        }
        else {
            n2 = n;
            if (n > b[b.length - 1].d) {
                n2 = b[b.length - 1].d;
            }
        }
        int n3 = 0;
        while (true) {
            final zr0.zr0$a[] b2 = this.b;
            if (n3 >= b2.length) {
                return;
            }
            if (n2 <= b2[n3].d) {
                if (b2[n3].r) {
                    array[0] = b2[n3].l;
                    array[1] = b2[n3].m;
                    return;
                }
                b2[n3].g(n2);
                array[0] = this.b[n3].a();
                array[1] = this.b[n3].b();
            }
            else {
                ++n3;
            }
        }
    }
    
    @Override
    public final double[] f() {
        return this.a;
    }
}
