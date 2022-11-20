// 
// Decompiled by Procyon v0.6.0
// 

public final class f1b
{
    public static boolean a(final rwj rwj, final j1b j1b, int i, final a a) {
        final int b = rwj.b;
        final long u = rwj.u();
        final long n = u >>> 16;
        final long n2 = i;
        final boolean b2 = false;
        if (n != n2) {
            return false;
        }
        if ((n & 0x1L) == 0x1L) {
            i = 1;
        }
        else {
            i = 0;
        }
        final int n3 = (int)(u >> 12 & 0xFL);
        final int n4 = (int)(u >> 8 & 0xFL);
        final int n5 = (int)(0xFL & u >> 4);
        final int n6 = (int)(u >> 1 & 0x7L);
        final boolean b3 = (u & 0x1L) == 0x1L;
        final boolean b4 = (n5 <= 7) ? (n5 == j1b.g - 1) : (n5 <= 10 && j1b.g == 2);
        boolean b5 = b2;
        while (true) {
            if (b4) {
                boolean b6 = false;
                Label_0196: {
                    if (n6 != 0) {
                        if (n6 != j1b.i) {
                            b6 = false;
                            break Label_0196;
                        }
                    }
                    b6 = true;
                }
                b5 = b2;
                if (b6) {
                    b5 = b2;
                    if (!b3) {
                        try {
                            long z = rwj.z();
                            if (i == 0) {
                                z *= j1b.b;
                            }
                            a.a = z;
                            i = 1;
                        }
                        catch (final NumberFormatException ex) {
                            i = 0;
                        }
                        b5 = b2;
                        if (i != 0) {
                            i = b(rwj, n3);
                            if (i != -1 && i <= j1b.b) {
                                i = 1;
                            }
                            else {
                                i = 0;
                            }
                            b5 = b2;
                            if (i != 0) {
                                final int e = j1b.e;
                                Label_0392: {
                                    if (n4 != 0) {
                                        if ((n4 > 11) ? ((n4 != 12) ? (n4 <= 14) : (rwj.t() * 1000 == e)) : (n4 == j1b.f)) {
                                            break Label_0385;
                                        }
                                        Label_0390: {
                                            i = 0;
                                        }
                                        break Label_0392;
                                    }
                                    i = 1;
                                }
                                b5 = b2;
                                if (i != 0) {
                                    final int t = rwj.t();
                                    final int b7 = rwj.b;
                                    final byte[] a2 = rwj.a;
                                    i = cnw.a;
                                    int n7 = 0;
                                    for (i = b; i < b7 - 1; ++i) {
                                        n7 = cnw.m[n7 ^ (a2[i] & 0xFF)];
                                    }
                                    if (t == n7) {
                                        i = 1;
                                    }
                                    else {
                                        i = 0;
                                    }
                                    b5 = b2;
                                    if (i != 0) {
                                        b5 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return b5;
            final int n8;
            i = n8 * 10;
            int e = 0;
            iftrue(Label_0390:)(i != e);
            continue;
        }
    }
    
    public static int b(final rwj rwj, final int n) {
        switch (n) {
            default: {
                return -1;
            }
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: {
                return 256 << n - 8;
            }
            case 7: {
                return rwj.y() + 1;
            }
            case 6: {
                return rwj.t() + 1;
            }
            case 2:
            case 3:
            case 4:
            case 5: {
                return 576 << n - 2;
            }
            case 1: {
                return 192;
            }
        }
    }
    
    public static final class a
    {
        public long a;
    }
}
