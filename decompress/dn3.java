import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dn3
{
    public static void a(final long n, final rwj rwj, final ewt[] array) {
    Label_0000:
        while (true) {
            final int c = rwj.c;
            final int b = rwj.b;
            final boolean b2 = true;
            if (c - b > 1) {
                int n2 = 0;
                while (true) {
                    while (rwj.c - rwj.b != 0) {
                        final int t = rwj.t();
                        n2 += t;
                        if (t != 255) {
                            final int n3 = n2;
                            int n4 = 0;
                            while (true) {
                                while (rwj.c - rwj.b != 0) {
                                    final int t2 = rwj.t();
                                    n4 += t2;
                                    if (t2 != 255) {
                                        final int n5 = n4;
                                        final int b3 = rwj.b;
                                        final int n6 = b3 + n5;
                                        int c2;
                                        if (n5 != -1 && n5 <= rwj.c - b3) {
                                            c2 = n6;
                                            if (n3 == 4) {
                                                c2 = n6;
                                                if (n5 >= 8) {
                                                    final int t3 = rwj.t();
                                                    final int y = rwj.y();
                                                    int e;
                                                    if (y == 49) {
                                                        e = rwj.e();
                                                    }
                                                    else {
                                                        e = 0;
                                                    }
                                                    final int t4 = rwj.t();
                                                    if (y == 47) {
                                                        rwj.E(1);
                                                    }
                                                    boolean b4 = t3 == 181 && (y == 49 || y == 47) && t4 == 3;
                                                    if (y == 49) {
                                                        b4 &= (e == 1195456820 && b2);
                                                    }
                                                    c2 = n6;
                                                    if (b4) {
                                                        b(n, rwj, array);
                                                        c2 = n6;
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                                            c2 = rwj.c;
                                        }
                                        rwj.D(c2);
                                        continue Label_0000;
                                    }
                                }
                                final int n5 = -1;
                                continue;
                            }
                        }
                    }
                    final int n3 = -1;
                    continue;
                }
            }
            break;
        }
    }
    
    public static void b(final long n, final rwj rwj, final ewt[] array) {
        final int t = rwj.t();
        final int n2 = 0;
        if ((t & 0x40) == 0x0) {
            return;
        }
        rwj.E(1);
        final int n3 = (t & 0x1F) * 3;
        final int b = rwj.b;
        for (int length = array.length, i = n2; i < length; ++i) {
            final ewt ewt = array[i];
            rwj.D(b);
            ewt.d(rwj, n3);
            if (n != -9223372036854775807L) {
                ewt.b(n, 1, n3, 0, null);
            }
        }
    }
}
