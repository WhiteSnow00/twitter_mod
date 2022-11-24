// 
// Decompiled by Procyon v0.6.0
// 

public final class s7b implements i7b
{
    public final float a;
    public final m5r b;
    
    public s7b() {
        this(0.0f, 0.0f, 7);
    }
    
    public s7b(final float g, final float n, final float a) {
        this.a = a;
        final m5r b = new m5r();
        if (g < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        b.g = g;
        b.c = false;
        final double b2 = b.b;
        if ((float)(b2 * b2) > 0.0f) {
            b.b = Math.sqrt(n);
            b.c = false;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }
    
    public s7b(float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = 1.0f;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = 1500.0f;
        }
        float n4;
        if ((n3 & 0x4) != 0x0) {
            n4 = 0.01f;
        }
        else {
            n4 = 0.0f;
        }
        this(n, n2, n4);
    }
    
    public final /* bridge */ qqw a(final liv liv) {
        return (qqw)this.f(liv);
    }
    
    public final float b(final float n, final float n2, final float n3) {
        return 0.0f;
    }
    
    public final float c(long n, final float n2, final float a, final float n3) {
        n /= 1000000L;
        final m5r b = this.b;
        b.a = a;
        return Float.intBitsToFloat((int)(b.a(n2, n3, n) >> 32));
    }
    
    public final float d(long n, final float n2, final float a, final float n3) {
        n /= 1000000L;
        final m5r b = this.b;
        b.a = a;
        return Float.intBitsToFloat((int)(b.a(n2, n3, n) & 0xFFFFFFFFL));
    }
    
    public final long e(float n, float n2, final float n3) {
        final m5r b = this.b;
        final double b2 = b.b;
        final float n4 = (float)(b2 * b2);
        final float g = b.g;
        final float a = this.a;
        n = (n - n2) / a;
        n2 = n3 / a;
        final double n5 = n4;
        final double n6 = g;
        final double n7 = n2;
        final double n8 = n;
        double n9 = 1.0f;
        final double n10 = n6 * 2.0 * Math.sqrt(n5);
        final double n11 = -n10;
        final double n12 = n10 * n10 - n5 * 4.0;
        final r16 b3 = zzz.B(n12);
        b3.a = (b3.a + n11) / 2.0;
        b3.b /= 2.0;
        final r16 b4 = zzz.B(n12);
        final double a2 = b4.a;
        final double n13 = -1;
        final double b5 = b4.b;
        b4.a = (a2 * n13 + n11) / 2.0;
        b4.b = b5 * n13 / 2.0;
        final double n14 = dcmpg(n8, 0.0);
        long n15;
        if (n14 == 0 && n7 == 0.0) {
            n15 = 0L;
        }
        else {
            double n16 = n7;
            if (n14 < 0) {
                n16 = -n7;
            }
            final double abs = Math.abs(n8);
            double n17 = Double.MAX_VALUE;
            double max;
            if (n6 > 1.0) {
                final double a3 = b3.a;
                final double a4 = b4.a;
                final double n18 = a3 - a4;
                final double n19 = (a3 * abs - n16) / n18;
                final double n20 = abs - n19;
                max = Math.log(Math.abs(n9 / n20)) / a3;
                final double n21 = Math.log(Math.abs(n9 / n19)) / a4;
                if ((!Double.isInfinite(max) && !Double.isNaN(max)) ^ true) {
                    max = n21;
                }
                else if (!(true ^ (!Double.isInfinite(n21) && !Double.isNaN(n21)))) {
                    max = Math.max(max, n21);
                }
                final double n22 = n20 * a3;
                final double n23 = Math.log(n22 / (-n19 * a4)) / (a4 - a3);
                if (!Double.isNaN(n23) && n23 > 0.0) {
                    if (n23 > 0.0 && -(Math.exp(n23 * a4) * n19 + Math.exp(a3 * n23) * n20) < n9) {
                        if (n19 > 0.0 && n20 < 0.0) {
                            max = 0.0;
                        }
                        n9 = -n9;
                    }
                    else {
                        max = Math.log(-(n19 * a4 * a4) / (n22 * a3)) / n18;
                    }
                }
                else {
                    n9 = -n9;
                }
                final h5r h5r = new h5r(n20, a3, n19, a4, n9);
                final i5r i5r = new i5r(n20, a3, n19, a4);
                if (Math.abs(((Number)h5r.invoke((Object)max)).doubleValue()) >= 1.0E-4) {
                    int n24 = 0;
                    double n25 = max;
                    while (true) {
                        max = n25;
                        if (n17 <= 0.001) {
                            break;
                        }
                        max = n25;
                        if (n24 >= 100) {
                            break;
                        }
                        ++n24;
                        final double n26 = n25 - ((Number)h5r.invoke((Object)n25)).doubleValue() / ((Number)i5r.invoke((Object)n25)).doubleValue();
                        n17 = Math.abs(n25 - n26);
                        n25 = n26;
                    }
                }
            }
            else if (n6 < 1.0) {
                final double a5 = b3.a;
                final double n27 = (n16 - a5 * abs) / b3.b;
                max = Math.log(n9 / Math.sqrt(n27 * n27 + abs * abs)) / a5;
            }
            else {
                final double a6 = b3.a;
                final double n28 = a6 * abs;
                final double n29 = n16 - n28;
                final double n30 = Math.log(Math.abs(n9 / abs)) / a6;
                double log;
                final double n31 = log = Math.log(Math.abs(n9 / n29));
                for (int i = 0; i < 6; ++i) {
                    log = n31 - Math.log(Math.abs(log / a6));
                }
                double max2 = log / a6;
                if (!((!Double.isInfinite(n30) && !Double.isNaN(n30)) ^ true)) {
                    if ((!Double.isInfinite(max2) && !Double.isNaN(max2)) ^ true) {
                        max2 = n30;
                    }
                    else {
                        max2 = Math.max(n30, max2);
                    }
                }
                final double n32 = -(n28 + n29) / (a6 * n29);
                Label_1093: {
                    Label_1088: {
                        if (!Double.isNaN(n32)) {
                            if (n32 > 0.0) {
                                if (n32 > 0.0) {
                                    final double n33 = a6 * n32;
                                    if (-(Math.exp(n33) * (n32 * n29) + Math.exp(n33) * abs) < n9) {
                                        final double n34 = 0.0;
                                        if (n29 < 0.0 && abs > 0.0) {
                                            max2 = n34;
                                        }
                                        break Label_1088;
                                    }
                                }
                                max2 = -(2.0 / a6) - abs / n29;
                                break Label_1093;
                            }
                        }
                    }
                    n9 = -n9;
                }
                final f5r f5r = new f5r(abs, n29, a6, n9);
                final g5r g5r = new g5r(n29, a6, abs);
                int n35 = 0;
                double n36 = max2;
                while (true) {
                    max = n36;
                    if (n17 <= 0.001) {
                        break;
                    }
                    max = n36;
                    if (n35 >= 100) {
                        break;
                    }
                    ++n35;
                    final double n37 = n36 - ((Number)f5r.invoke((Object)n36)).doubleValue() / ((Number)g5r.invoke((Object)n36)).doubleValue();
                    n17 = Math.abs(n36 - n37);
                    n36 = n37;
                }
            }
            n15 = (long)(max * 1000.0);
        }
        return n15 * 1000000L;
    }
    
    public final vqw f(final liv liv) {
        e0e.f((Object)liv, "converter");
        return new vqw((i7b)this);
    }
}
