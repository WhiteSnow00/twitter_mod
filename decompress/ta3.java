import android.graphics.Color;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ta3
{
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    
    public ta3(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final float n8, final float n9, final int n10) {
        if (n10 != 1) {
            this.a = n;
            this.b = n2;
            this.c = n3;
            this.d = n4;
            this.e = n5;
            this.f = n6;
            this.g = n7;
            this.h = n8;
            this.i = n9;
            return;
        }
        this.a = n;
        this.b = n4;
        this.c = n7;
        this.d = n2;
        this.e = n5;
        this.f = n8;
        this.g = n3;
        this.h = n6;
        this.i = n9;
    }
    
    public static ta3 a(final int n) {
        final wcx k = wcx.k;
        final float c = amy.C(Color.red(n));
        final float c2 = amy.C(Color.green(n));
        final float c3 = amy.C(Color.blue(n));
        final float[][] f0 = amy.F0;
        final float[] array = { f0[0][2] * c3 + (f0[0][1] * c2 + f0[0][0] * c), f0[1][2] * c3 + (f0[1][1] * c2 + f0[1][0] * c), c3 * f0[2][2] + (c2 * f0[2][1] + c * f0[2][0]) };
        final float[][] c4 = amy.C0;
        final float n2 = array[0];
        final float n3 = c4[0][0];
        final float n4 = array[1];
        final float n5 = c4[0][1];
        final float n6 = array[2];
        final float n7 = c4[0][2];
        final float n8 = array[0];
        final float n9 = c4[1][0];
        final float n10 = array[1];
        final float n11 = c4[1][1];
        final float n12 = array[2];
        final float n13 = c4[1][2];
        final float n14 = array[0];
        final float n15 = c4[2][0];
        final float n16 = array[1];
        final float n17 = c4[2][1];
        final float n18 = array[2];
        final float n19 = c4[2][2];
        final float[] g = k.g;
        final float n20 = g[0] * (n6 * n7 + (n4 * n5 + n2 * n3));
        final float n21 = g[1] * (n12 * n13 + (n10 * n11 + n8 * n9));
        final float n22 = g[2] * (n18 * n19 + (n16 * n17 + n14 * n15));
        final float n23 = (float)Math.pow(Math.abs(n20) * k.h / 100.0, 0.42);
        final float n24 = (float)Math.pow(Math.abs(n21) * k.h / 100.0, 0.42);
        final float n25 = (float)Math.pow(Math.abs(n22) * k.h / 100.0, 0.42);
        final float n26 = Math.signum(n20) * 400.0f * n23 / (n23 + 27.13f);
        final float n27 = Math.signum(n21) * 400.0f * n24 / (n24 + 27.13f);
        final float n28 = Math.signum(n22) * 400.0f * n25 / (n25 + 27.13f);
        final double n29 = n26;
        final double n30 = n27;
        final double n31 = n28;
        final float n32 = (float)(n30 * -12.0 + n29 * 11.0 + n31) / 11.0f;
        final float n33 = (float)(n26 + n27 - n31 * 2.0) / 9.0f;
        final float n34 = n27 * 20.0f;
        final float n35 = (21.0f * n28 + (n26 * 20.0f + n34)) / 20.0f;
        final float n36 = (n26 * 40.0f + n34 + n28) / 20.0f;
        final float n37 = (float)Math.atan2(n33, n32) * 180.0f / 3.1415927f;
        float n38;
        if (n37 < 0.0f) {
            n38 = n37 + 360.0f;
        }
        else {
            n38 = n37;
            if (n37 >= 360.0f) {
                n38 = n37 - 360.0f;
            }
        }
        final float n39 = 3.1415927f * n38 / 180.0f;
        final float n40 = (float)Math.pow(n36 * k.b / k.a, k.d * k.j) * 100.0f;
        final float n41 = 4.0f / k.d;
        final float n42 = (float)Math.sqrt(n40 / 100.0f);
        final float a = k.a;
        final float i = k.i;
        float n43;
        if (n38 < 20.14) {
            n43 = 360.0f + n38;
        }
        else {
            n43 = n38;
        }
        final float n44 = (float)Math.pow(1.64 - Math.pow(0.29, k.f), 0.73) * (float)Math.pow((float)(Math.cos(n43 * 3.141592653589793 / 180.0 + 2.0) + 3.8) * 0.25f * 3846.1538f * k.e * k.c * (float)Math.sqrt(n33 * n33 + n32 * n32) / (n35 + 0.305f), 0.9);
        final float n45 = n44 * (float)Math.sqrt(n40 / 100.0);
        final float n46 = n45 * k.i;
        final float n47 = (float)Math.sqrt(n44 * k.d / (k.a + 4.0f));
        final float n48 = 1.7f * n40 / (0.007f * n40 + 1.0f);
        final float n49 = (float)Math.log(0.0228f * n46 + 1.0f) * 43.85965f;
        final double n50 = n39;
        return new ta3(n38, n45, n40, (a + 4.0f) * (n41 * n42) * i, n46, n47 * 50.0f, n48, n49 * (float)Math.cos(n50), n49 * (float)Math.sin(n50), 0);
    }
    
    public static ta3 b(final float n, final float n2, final float n3) {
        final wcx k = wcx.k;
        final float n4 = 4.0f / k.d;
        final double n5 = n / 100.0;
        final float n6 = (float)Math.sqrt(n5);
        final float a = k.a;
        final float i = k.i;
        final float n7 = n2 * i;
        final float n8 = (float)Math.sqrt(n2 / (float)Math.sqrt(n5) * k.d / (k.a + 4.0f));
        final float n9 = 3.1415927f * n3 / 180.0f;
        final float n10 = 1.7f * n / (0.007f * n + 1.0f);
        final float n11 = (float)Math.log(n7 * 0.0228 + 1.0) * 43.85965f;
        final double n12 = n9;
        return new ta3(n3, n2, n, (a + 4.0f) * (n4 * n6) * i, n7, n8 * 50.0f, n10, n11 * (float)Math.cos(n12), n11 * (float)Math.sin(n12), 0);
    }
    
    public static ta3 c(final float n, final float n2, final float n3, final float n4, float o, float n5, final float n6, final float n7) {
        final float n8 = n - n3 + o - n6;
        final float n9 = n2 - n4 + n5 - n7;
        if (n8 == 0.0f && n9 == 0.0f) {
            return new ta3(n3 - n, o - n3, n, n4 - n2, n5 - n4, n2, 0.0f, 0.0f, 1.0f, 1);
        }
        final float n10 = n3 - o;
        final float n11 = n6 - o;
        o = n4 - n5;
        final float n12 = n7 - n5;
        n5 = n10 * n12 - n11 * o;
        final float o2 = b8b.o(n11, n9, n12 * n8, n5);
        o = b8b.o(n8, o, n10 * n9, n5);
        return new ta3(o2 * n3 + (n3 - n), o * n6 + (n6 - n), n, o2 * n4 + (n4 - n2), o * n7 + (n7 - n2), n2, o2, o, 1.0f, 1);
    }
    
    public final int d(final wcx wcx) {
        final float b = this.b;
        float n2 = 0.0f;
        Label_0044: {
            if (b != 0.0) {
                final double n = this.c;
                if (n != 0.0) {
                    n2 = b / (float)Math.sqrt(n / 100.0);
                    break Label_0044;
                }
            }
            n2 = 0.0f;
        }
        final float n3 = (float)Math.pow(n2 / Math.pow(1.64 - Math.pow(0.29, wcx.f), 0.73), 1.1111111111111112);
        final double n4 = this.a * 3.1415927f / 180.0f;
        final float n5 = (float)(Math.cos(2.0 + n4) + 3.8);
        final float a = wcx.a;
        final float n6 = (float)Math.pow(this.c / 100.0, 1.0 / wcx.d / wcx.j);
        final float e = wcx.e;
        final float c = wcx.c;
        final float n7 = a * n6 / wcx.b;
        final float n8 = (float)Math.sin(n4);
        final float n9 = (float)Math.cos(n4);
        final float n10 = (0.305f + n7) * 23.0f * n3 / (n3 * 108.0f * n8 + (11.0f * n3 * n9 + n5 * 0.25f * 3846.1538f * e * c * 23.0f));
        final float n11 = n9 * n10;
        final float n12 = n10 * n8;
        final float n13 = n7 * 460.0f;
        final float n14 = (288.0f * n12 + (451.0f * n11 + n13)) / 1403.0f;
        final float o = b8b.o(n12, 261.0f, n13 - 891.0f * n11, 1403.0f);
        final float o2 = b8b.o(n12, 6300.0f, n13 - n11 * 220.0f, 1403.0f);
        final float n15 = (float)Math.max(0.0, Math.abs(n14) * 27.13 / (400.0 - Math.abs(n14)));
        final float signum = Math.signum(n14);
        final float n16 = 100.0f / wcx.h;
        final float n17 = (float)Math.pow(n15, 2.380952380952381);
        final float n18 = (float)Math.max(0.0, Math.abs(o) * 27.13 / (400.0 - Math.abs(o)));
        final float signum2 = Math.signum(o);
        final float n19 = 100.0f / wcx.h;
        final float n20 = (float)Math.pow(n18, 2.380952380952381);
        final float n21 = (float)Math.max(0.0, Math.abs(o2) * 27.13 / (400.0 - Math.abs(o2)));
        final float signum3 = Math.signum(o2);
        final float n22 = 100.0f / wcx.h;
        final float n23 = (float)Math.pow(n21, 2.380952380952381);
        final float[] g = wcx.g;
        final float n24 = n16 * signum * n17 / g[0];
        final float n25 = n19 * signum2 * n20 / g[1];
        final float n26 = n22 * signum3 * n23 / g[2];
        final float[][] d0 = amy.D0;
        return gs4.b(d0[0][2] * n26 + (d0[0][1] * n25 + d0[0][0] * n24), d0[1][2] * n26 + (d0[1][1] * n25 + d0[1][0] * n24), n26 * d0[2][2] + (n25 * d0[2][1] + n24 * d0[2][0]));
    }
}
