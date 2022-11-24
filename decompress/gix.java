import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import java.io.IOException;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import java.util.List;
import java.util.ArrayList;
import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import java.util.Objects;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gix extends ekr
{
    public gix.gix$a n;
    public int o;
    public boolean p;
    public hix$c q;
    public hix$a r;
    
    public final void b(final long g) {
        super.g = g;
        int e = 0;
        this.p = (g != 0L);
        final hix$c q = this.q;
        if (q != null) {
            e = q.e;
        }
        this.o = e;
    }
    
    public final long c(final gxj gxj) {
        final byte[] a = gxj.a;
        int n = 0;
        if ((a[0] & 0x1) == 0x1) {
            return -1L;
        }
        final byte b = a[0];
        final gix.gix$a n2 = this.n;
        omi.r((Object)n2);
        int o;
        if (!n2.d[b >> 1 & 255 >>> 8 - n2.e].a) {
            o = n2.a.e;
        }
        else {
            o = n2.a.f;
        }
        if (this.p) {
            n = (this.o + o) / 4;
        }
        final long n3 = n;
        final byte[] a2 = gxj.a;
        final int length = a2.length;
        final int n4 = gxj.c + 4;
        if (length < n4) {
            final byte[] copy = Arrays.copyOf(a2, n4);
            gxj.B(copy, copy.length);
        }
        else {
            gxj.C(n4);
        }
        final byte[] a3 = gxj.a;
        final int c = gxj.c;
        a3[c - 4] = (byte)(n3 & 0xFFL);
        a3[c - 3] = (byte)(n3 >>> 8 & 0xFFL);
        a3[c - 2] = (byte)(n3 >>> 16 & 0xFFL);
        a3[c - 1] = (byte)(n3 >>> 24 & 0xFFL);
        this.p = true;
        this.o = o;
        return n3;
    }
    
    @EnsuresNonNullIf(expression = { "#3.format" }, result = false)
    public final boolean d(final gxj gxj, long n, final ekr$a ekr$a) throws IOException {
        if (this.n != null) {
            Objects.requireNonNull(ekr$a.a);
            return false;
        }
        final hix$c q = this.q;
        final gix.gix$a gix$a = null;
        gix.gix$a n4;
        if (q == null) {
            hix.d(1, gxj, false);
            gxj.k();
            final int t = gxj.t();
            final int k = gxj.k();
            int g = gxj.g();
            if (g <= 0) {
                g = -1;
            }
            int g2 = gxj.g();
            if (g2 <= 0) {
                g2 = -1;
            }
            gxj.g();
            final int t2 = gxj.t();
            final int n2 = (int)Math.pow(2.0, t2 & 0xF);
            final int n3 = (int)Math.pow(2.0, (t2 & 0xF0) >> 4);
            gxj.t();
            this.q = new hix$c(t, k, g, g2, n2, n3, Arrays.copyOf(gxj.a, gxj.c));
            n4 = gix$a;
        }
        else {
            final hix$a r = this.r;
            if (r == null) {
                this.r = hix.c(gxj, true, true);
                n4 = gix$a;
            }
            else {
                final int c = gxj.c;
                final byte[] array = new byte[c];
                System.arraycopy(gxj.a, 0, array, 0, c);
                final int a = q.a;
                hix.d(5, gxj, false);
                int n5 = gxj.t() + 1;
                final dix dix = new dix(gxj.a, 0, (j98)null);
                dix.m(gxj.b * 8);
                int i = 0;
                byte[] array2 = array;
                while (i < n5) {
                    if (dix.g(24) != 5653314) {
                        final int e = dix.e();
                        final StringBuilder sb = new StringBuilder(66);
                        sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                        sb.append(e);
                        throw ParserException.a(sb.toString(), (Throwable)null);
                    }
                    final int g3 = dix.g(16);
                    final int g4 = dix.g(24);
                    final long[] array3 = new long[g4];
                    final boolean f = dix.f();
                    n = 0L;
                    byte[] array4;
                    if (!f) {
                        final boolean f2 = dix.f();
                        for (int j = 0; j < g4; ++j) {
                            if (f2) {
                                if (dix.f()) {
                                    array3[j] = dix.g(5) + 1;
                                }
                                else {
                                    array3[j] = 0L;
                                }
                            }
                            else {
                                array3[j] = dix.g(5) + 1;
                            }
                        }
                        array4 = array2;
                    }
                    else {
                        final int n6 = n5;
                        int n7 = dix.g(5) + 1;
                        int n8 = 0;
                        while (true) {
                            array4 = array2;
                            n5 = n6;
                            if (n8 >= g4) {
                                break;
                            }
                            for (int g5 = dix.g(hix.a(g4 - n8)), n9 = 0; n9 < g5 && n8 < g4; ++n8, ++n9) {
                                array3[n8] = n7;
                            }
                            ++n7;
                        }
                    }
                    final int g6 = dix.g(4);
                    if (g6 > 2) {
                        final StringBuilder sb2 = new StringBuilder(53);
                        sb2.append("lookup type greater than 2 not decodable: ");
                        sb2.append(g6);
                        throw ParserException.a(sb2.toString(), (Throwable)null);
                    }
                    if (g6 == 1 || g6 == 2) {
                        dix.m(32);
                        dix.m(32);
                        final int g7 = dix.g(4);
                        dix.m(1);
                        if (g6 == 1) {
                            if (g3 != 0) {
                                n = g4;
                                n = (long)Math.floor(Math.pow((double)n, 1.0 / g3));
                            }
                        }
                        else {
                            n = g4 * (long)g3;
                        }
                        dix.m((int)((g7 + 1) * n));
                    }
                    ++i;
                    array2 = array4;
                }
                for (int g8 = dix.g(6), l = 0; l < g8 + 1; ++l) {
                    if (dix.g(16) != 0) {
                        throw ParserException.a("placeholder of time domain transforms not zeroed out", (Throwable)null);
                    }
                }
                for (int g9 = dix.g(6), n10 = 0; n10 < g9 + 1; ++n10) {
                    final int g10 = dix.g(16);
                    if (g10 != 0) {
                        if (g10 != 1) {
                            final StringBuilder sb3 = new StringBuilder(52);
                            sb3.append("floor type greater than 1 not decodable: ");
                            sb3.append(g10);
                            throw ParserException.a(sb3.toString(), (Throwable)null);
                        }
                        final int g11 = dix.g(5);
                        final int[] array5 = new int[g11];
                        int n11 = 0;
                        int n12 = -1;
                        while (n11 < g11) {
                            array5[n11] = dix.g(4);
                            int n13;
                            if (array5[n11] > (n13 = n12)) {
                                n13 = array5[n11];
                            }
                            ++n11;
                            n12 = n13;
                        }
                        final int[] array6 = new int[++n12];
                        for (int n14 = 0; n14 < n12; ++n14) {
                            array6[n14] = dix.g(3) + 1;
                            final int g12 = dix.g(2);
                            if (g12 > 0) {
                                dix.m(8);
                            }
                            for (int n15 = 0; n15 < 1 << g12; ++n15) {
                                dix.m(8);
                            }
                        }
                        dix.m(2);
                        final int g13 = dix.g(4);
                        int n16 = 0;
                        int n17 = 0;
                        int n18 = 0;
                        while (n16 < g11) {
                            for (n17 += array6[array5[n16]]; n18 < n17; ++n18) {
                                dix.m(g13);
                            }
                            ++n16;
                        }
                    }
                    else {
                        dix.m(8);
                        dix.m(16);
                        dix.m(16);
                        dix.m(6);
                        dix.m(8);
                        for (int g14 = dix.g(4), n19 = 0; n19 < g14 + 1; ++n19) {
                            dix.m(8);
                        }
                    }
                }
                for (int g15 = dix.g(6), n20 = 0; n20 < g15 + 1; ++n20) {
                    if (dix.g(16) > 2) {
                        throw ParserException.a("residueType greater than 2 is not decodable", (Throwable)null);
                    }
                    dix.m(24);
                    dix.m(24);
                    dix.m(24);
                    final int n21 = dix.g(6) + 1;
                    dix.m(8);
                    final int[] array7 = new int[n21];
                    for (int n22 = 0; n22 < n21; ++n22) {
                        final int g16 = dix.g(3);
                        int g17;
                        if (dix.f()) {
                            g17 = dix.g(5);
                        }
                        else {
                            g17 = 0;
                        }
                        array7[n22] = g17 * 8 + g16;
                    }
                    for (int n23 = 0; n23 < n21; ++n23) {
                        for (int n24 = 0; n24 < 8; ++n24) {
                            if ((array7[n23] & 1 << n24) != 0x0) {
                                dix.m(8);
                            }
                        }
                    }
                }
                for (int g18 = dix.g(6), n25 = 0; n25 < g18 + 1; ++n25) {
                    final int g19 = dix.g(16);
                    if (g19 != 0) {
                        final StringBuilder sb4 = new StringBuilder(52);
                        sb4.append("mapping type other than 0 not supported: ");
                        sb4.append(g19);
                        Log.e("VorbisUtil", sb4.toString());
                    }
                    else {
                        int n26;
                        if (dix.f()) {
                            n26 = dix.g(4) + 1;
                        }
                        else {
                            n26 = 1;
                        }
                        if (dix.f()) {
                            for (int g20 = dix.g(8), n27 = 0; n27 < g20 + 1; ++n27) {
                                final int n28 = a - 1;
                                dix.m(hix.a(n28));
                                dix.m(hix.a(n28));
                            }
                        }
                        if (dix.g(2) != 0) {
                            throw ParserException.a("to reserved bits must be zero after mapping coupling steps", (Throwable)null);
                        }
                        if (n26 > 1) {
                            for (int n29 = 0; n29 < a; ++n29) {
                                dix.m(4);
                            }
                        }
                        for (int n30 = 0; n30 < n26; ++n30) {
                            dix.m(8);
                            dix.m(8);
                            dix.m(8);
                        }
                    }
                }
                final int n31 = dix.g(6) + 1;
                final hix$b[] array8 = new hix$b[n31];
                for (int n32 = 0; n32 < n31; ++n32) {
                    final boolean f3 = dix.f();
                    dix.g(16);
                    dix.g(16);
                    dix.g(8);
                    array8[n32] = new hix$b(f3);
                }
                if (!dix.f()) {
                    throw ParserException.a("framing bit after modes not set as expected", (Throwable)null);
                }
                n4 = new gix.gix$a(q, r, array2, array8, hix.a(n31 - 1));
            }
        }
        this.n = n4;
        if (n4 == null) {
            return true;
        }
        final hix$c a2 = n4.a;
        final ArrayList<byte[]> m = new ArrayList<byte[]>();
        m.add(a2.g);
        m.add(n4.c);
        final q9h b = hix.b((List)eed.r(n4.b.a));
        final n$a n$a = new n$a();
        n$a.k = "audio/vorbis";
        n$a.f = a2.d;
        n$a.g = a2.c;
        n$a.x = a2.a;
        n$a.y = a2.b;
        n$a.m = m;
        n$a.i = b;
        ekr$a.a = new n(n$a);
        return true;
    }
    
    public final void e(final boolean b) {
        super.e(b);
        if (b) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
