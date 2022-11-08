// 
// Decompiled by Procyon v0.6.0
// 

public final class mdf extends ia7
{
    public double[] a;
    public double[][] b;
    public double[] c;
    
    public mdf(final double[] a, final double[][] b) {
        final int length = a.length;
        final int length2 = b[0].length;
        this.c = new double[length2];
        this.a = a;
        this.b = b;
        if (length2 > 2) {
            double n = 0.0;
            double n2 = 0.0;
            double n3;
            double n4;
            for (int i = 0; i < a.length; ++i, n = n3, n2 = n4) {
                n3 = b[i][0];
                n4 = b[i][0];
                if (i > 0) {
                    Math.hypot(n3 - n, n4 - n2);
                }
            }
        }
    }
    
    @Override
    public final double b(double n) {
        final double[] a = this.a;
        final int length = a.length;
        if (n <= a[0]) {
            return this.g(a[0]) * (n - a[0]) + this.b[0][0];
        }
        final int n2 = length - 1;
        if (n >= a[n2]) {
            return this.g(a[n2]) * (n - a[n2]) + this.b[n2][0];
        }
        int n3;
        for (int i = 0; i < n2; i = n3) {
            final double[] a2 = this.a;
            if (n == a2[i]) {
                return this.b[i][0];
            }
            n3 = i + 1;
            if (n < a2[n3]) {
                n = (n - a2[i]) / (a2[n3] - a2[i]);
                final double[][] b = this.b;
                return b[n3][0] * n + (1.0 - n) * b[i][0];
            }
        }
        return 0.0;
    }
    
    @Override
    public final void c(double n, final double[] array) {
        final double[] a = this.a;
        final int length = a.length;
        final double[][] b = this.b;
        final int n2 = 0;
        int i = 0;
        final int length2 = b[0].length;
        if (n <= a[0]) {
            this.e(a[0], this.c);
            for (int j = 0; j < length2; ++j) {
                array[j] = (n - this.a[0]) * this.c[j] + this.b[0][j];
            }
            return;
        }
        final int n3 = length - 1;
        if (n >= a[n3]) {
            this.e(a[n3], this.c);
            while (i < length2) {
                array[i] = (n - this.a[n3]) * this.c[i] + this.b[n3][i];
                ++i;
            }
            return;
        }
        int n4;
        for (int k = 0; k < length - 1; k = n4) {
            if (n == this.a[k]) {
                for (int l = 0; l < length2; ++l) {
                    array[l] = this.b[k][l];
                }
            }
            final double[] a2 = this.a;
            n4 = k + 1;
            if (n < a2[n4]) {
                n = (n - a2[k]) / (a2[n4] - a2[k]);
                for (int n5 = n2; n5 < length2; ++n5) {
                    final double[][] b2 = this.b;
                    array[n5] = b2[n4][n5] * n + (1.0 - n) * b2[k][n5];
                }
                return;
            }
        }
    }
    
    @Override
    public final void d(double n, final float[] array) {
        final double[] a = this.a;
        final int length = a.length;
        final double[][] b = this.b;
        final int n2 = 0;
        int i = 0;
        final int length2 = b[0].length;
        if (n <= a[0]) {
            this.e(a[0], this.c);
            for (int j = 0; j < length2; ++j) {
                array[j] = (float)((n - this.a[0]) * this.c[j] + this.b[0][j]);
            }
            return;
        }
        final int n3 = length - 1;
        if (n >= a[n3]) {
            this.e(a[n3], this.c);
            while (i < length2) {
                array[i] = (float)((n - this.a[n3]) * this.c[i] + this.b[n3][i]);
                ++i;
            }
            return;
        }
        int n4;
        for (int k = 0; k < n3; k = n4) {
            if (n == this.a[k]) {
                for (int l = 0; l < length2; ++l) {
                    array[l] = (float)this.b[k][l];
                }
            }
            final double[] a2 = this.a;
            n4 = k + 1;
            if (n < a2[n4]) {
                n = (n - a2[k]) / (a2[n4] - a2[k]);
                for (int n5 = n2; n5 < length2; ++n5) {
                    final double[][] b2 = this.b;
                    array[n5] = (float)(b2[n4][n5] * n + (1.0 - n) * b2[k][n5]);
                }
                return;
            }
        }
    }
    
    @Override
    public final void e(double n, final double[] array) {
        final double[] a = this.a;
        final int length = a.length;
        final double[][] b = this.b;
        int i = 0;
        final int length2 = b[0].length;
        double n2;
        if (n <= a[0]) {
            n2 = a[0];
        }
        else {
            final int n3 = length - 1;
            n2 = n;
            if (n >= a[n3]) {
                n2 = a[n3];
            }
        }
        int n4;
        for (int j = 0; j < length - 1; j = n4) {
            final double[] a2 = this.a;
            n4 = j + 1;
            if (n2 <= a2[n4]) {
                final double n5 = a2[n4];
                n = a2[j];
                final double n6 = a2[j];
                while (i < length2) {
                    final double[][] b2 = this.b;
                    array[i] = (b2[n4][i] - b2[j][i]) / (n5 - n);
                    ++i;
                }
                break;
            }
        }
    }
    
    @Override
    public final double[] f() {
        return this.a;
    }
    
    public final double g(double n) {
        final double[] a = this.a;
        final int length = a.length;
        double n2;
        if (n < a[0]) {
            n2 = a[0];
        }
        else {
            final int n3 = length - 1;
            n2 = n;
            if (n >= a[n3]) {
                n2 = a[n3];
            }
        }
        int n4;
        for (int i = 0; i < length - 1; i = n4) {
            final double[] a2 = this.a;
            n4 = i + 1;
            if (n2 <= a2[n4]) {
                n = a2[n4];
                final double n5 = a2[i];
                final double n6 = a2[i];
                final double[][] b = this.b;
                return (b[n4][0] - b[i][0]) / (n - n5);
            }
        }
        return 0.0;
    }
}
