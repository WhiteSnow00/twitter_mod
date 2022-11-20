// 
// Decompiled by Procyon v0.6.0
// 

public final class ff
{
    public static final int[] a;
    
    static {
        a = new int[] { 2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048 };
    }
    
    public static void a(final int n, final rwj rwj) {
        rwj.A(7);
        final byte[] a = rwj.a;
        a[0] = -84;
        a[1] = 64;
        a[3] = (a[2] = -1);
        a[4] = (byte)(n >> 16 & 0xFF);
        a[5] = (byte)(n >> 8 & 0xFF);
        a[6] = (byte)(n & 0xFF);
    }
    
    public static a b(final nhx nhx) {
        final int g = nhx.g(16);
        int n = nhx.g(16);
        int n2;
        if (n == 65535) {
            n = nhx.g(24);
            n2 = 7;
        }
        else {
            n2 = 4;
        }
        int n3 = n + n2;
        if (g == 44097) {
            n3 += 2;
        }
        if (nhx.g(2) == 3) {
            do {
                nhx.g(2);
            } while (nhx.f());
        }
        final int g2 = nhx.g(10);
        if (nhx.f() && nhx.g(3) > 0) {
            nhx.m(2);
        }
        int n4;
        if (nhx.f()) {
            n4 = 48000;
        }
        else {
            n4 = 44100;
        }
        final int g3 = nhx.g(4);
        int n5;
        if (n4 == 44100 && g3 == 13) {
            n5 = ff.a[g3];
        }
        else {
            if (n4 == 48000) {
                final int[] a = ff.a;
                if (g3 < 14) {
                    final int n6 = a[g3];
                    final int n7 = g2 % 5;
                    Label_0261: {
                        if (n7 != 1) {
                            if (n7 != 2) {
                                if (n7 != 3) {
                                    if (n7 != 4) {
                                        n5 = n6;
                                        return new a(n4, n3, n5);
                                    }
                                    if (g3 == 3 || g3 == 8) {
                                        break Label_0261;
                                    }
                                    n5 = n6;
                                    if (g3 == 11) {
                                        break Label_0261;
                                    }
                                    return new a(n4, n3, n5);
                                }
                            }
                            else {
                                if (g3 == 8) {
                                    break Label_0261;
                                }
                                n5 = n6;
                                if (g3 == 11) {
                                    break Label_0261;
                                }
                                return new a(n4, n3, n5);
                            }
                        }
                        if (g3 != 3) {
                            n5 = n6;
                            if (g3 != 8) {
                                return new a(n4, n3, n5);
                            }
                        }
                    }
                    n5 = n6 + 1;
                    return new a(n4, n3, n5);
                }
            }
            n5 = 0;
        }
        return new a(n4, n3, n5);
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        
        public a(final int a, final int b, final int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
