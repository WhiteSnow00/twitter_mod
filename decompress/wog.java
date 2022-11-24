import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import java.io.IOException;
import java.util.Arrays;
import com.google.android.exoplayer2.ParserException;
import java.util.Objects;
import java.util.Locale;
import java.util.Collections;
import java.util.HashMap;
import java.nio.ByteBuffer;
import android.util.SparseArray;
import java.util.Map;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wog implements qoa
{
    public static final byte[] b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final byte[] e0;
    public static final UUID f0;
    public static final Map<String, Integer> g0;
    public long A;
    public long B;
    public fcg C;
    public fcg D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;
    public final rq9 a;
    public voa a0;
    public final vpw b;
    public final SparseArray<wog.wog$b> c;
    public final boolean d;
    public final gxj e;
    public final gxj f;
    public final gxj g;
    public final gxj h;
    public final gxj i;
    public final gxj j;
    public final gxj k;
    public final gxj l;
    public final gxj m;
    public final gxj n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public wog.wog$b u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;
    
    static {
        b0 = new byte[] { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
        c0 = rnw.C("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        d0 = new byte[] { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
        e0 = new byte[] { 87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10 };
        f0 = new UUID(72057594037932032L, -9223371306706625679L);
        final HashMap hashMap = new HashMap();
        p4l.h(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        g0 = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public wog() {
        final nh8 a = new nh8();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = (rq9)a;
        a.d = (qq9)new a();
        this.d = true;
        this.b = new vpw();
        this.c = (SparseArray<wog.wog$b>)new SparseArray();
        this.g = new gxj(4);
        this.h = new gxj(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new gxj(4);
        this.e = new gxj(z6i.a);
        this.f = new gxj(4);
        this.j = new gxj();
        this.k = new gxj();
        this.l = new gxj(8);
        this.m = new gxj();
        this.n = new gxj();
        this.L = new int[1];
    }
    
    public static byte[] h(long n, final String s, final long n2) {
        omi.m(n != -9223372036854775807L);
        final int n3 = (int)(n / 3600000000L);
        n -= n3 * 3600 * 1000000L;
        final int n4 = (int)(n / 60000000L);
        n -= n4 * 60 * 1000000L;
        final int n5 = (int)(n / 1000000L);
        return rnw.C(String.format(Locale.US, s, n3, n4, n5, (int)((n - n5 * 1000000L) / n2)));
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        this.F = false;
        roa roa2 = roa;
        int n = 1;
        while (n != 0 && !this.F) {
            final nh8 nh8 = (nh8)this.a;
            omi.r((Object)nh8.d);
            Label_5910: {
                while (true) {
                    final nh8$a nh8$a = nh8.b.peek();
                    if (nh8$a != null && roa.getPosition() >= nh8$a.b) {
                        ((a)nh8.d).a.g(((nh8$a)nh8.b.pop()).a);
                        break;
                    }
                    final int e = nh8.e;
                    final int n2 = 4;
                    if (e == 0) {
                        long c;
                        if ((c = nh8.c.c(roa2, true, false, 4)) == -2L) {
                            roa.e();
                            int b;
                            int n3;
                            while (true) {
                                roa2.n(nh8.a, 0, 4);
                                b = vpw.b((int)nh8.a[0]);
                                if (b != -1 && b <= 4) {
                                    n3 = (int)vpw.a(nh8.a, b, false);
                                    Objects.requireNonNull(((a)nh8.d).a);
                                    if (n3 == 357149030 || n3 == 524531317 || n3 == 475249515 || n3 == 374648427) {
                                        break;
                                    }
                                }
                                roa2.k(1);
                            }
                            roa2.k(b);
                            c = n3;
                        }
                        if (c == -1L) {
                            n = 0;
                            break Label_5910;
                        }
                        nh8.f = (int)c;
                        nh8.e = 1;
                    }
                    if (nh8.e == 1) {
                        nh8.g = nh8.c.c(roa2, false, true, 8);
                        nh8.e = 2;
                    }
                    final qq9 d = nh8.d;
                    final int f = nh8.f;
                    Objects.requireNonNull(((a)d).a);
                    int n4 = 0;
                    switch (f) {
                        default: {
                            n4 = 0;
                            break;
                        }
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325: {
                            n4 = 5;
                            break;
                        }
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322: {
                            n4 = 4;
                            break;
                        }
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317: {
                            n4 = 1;
                            break;
                        }
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716: {
                            n4 = 3;
                            break;
                        }
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30321:
                        case 2352003:
                        case 2807729: {
                            n4 = 2;
                            break;
                        }
                    }
                    if (n4 != 0) {
                        if (n4 == 1) {
                            final long position = roa.getPosition();
                            nh8.b.push(new nh8$a(nh8.f, nh8.g + position));
                            final qq9 d2 = nh8.d;
                            final int f2 = nh8.f;
                            final long g = nh8.g;
                            final wog a = ((a)d2).a;
                            omi.r((Object)a.a0);
                            if (f2 != 160) {
                                if (f2 != 174) {
                                    if (f2 != 187) {
                                        if (f2 != 19899) {
                                            if (f2 != 20533) {
                                                if (f2 != 21968) {
                                                    if (f2 != 408125543) {
                                                        if (f2 != 475249515) {
                                                            if (f2 == 524531317) {
                                                                if (!a.v) {
                                                                    if (a.d && a.z != -1L) {
                                                                        a.y = true;
                                                                    }
                                                                    else {
                                                                        a.a0.l((qcp)new qcp.b(a.t));
                                                                        a.v = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            a.C = new fcg(0, (j98)null);
                                                            a.D = new fcg(0, (j98)null);
                                                        }
                                                    }
                                                    else {
                                                        final long q = a.q;
                                                        if (q != -1L && q != position) {
                                                            throw ParserException.a("Multiple Segment elements not supported", (Throwable)null);
                                                        }
                                                        a.q = position;
                                                        a.p = g;
                                                    }
                                                }
                                                else {
                                                    a.e(f2);
                                                    a.u.x = true;
                                                }
                                            }
                                            else {
                                                a.e(f2);
                                                a.u.h = true;
                                            }
                                        }
                                        else {
                                            a.w = -1;
                                            a.x = -1L;
                                        }
                                    }
                                    else {
                                        a.E = false;
                                    }
                                }
                                else {
                                    a.u = new wog.wog$b();
                                }
                            }
                            else {
                                a.Q = false;
                            }
                            nh8.e = 0;
                            break;
                        }
                        if (n4 != 2) {
                            if (n4 != 3) {
                                if (n4 == 4) {
                                    final qq9 d3 = nh8.d;
                                    final int f3 = nh8.f;
                                    final int n5 = (int)nh8.g;
                                    final wog a2 = ((a)d3).a;
                                    Objects.requireNonNull(a2);
                                    if (f3 != 161 && f3 != 163) {
                                        if (f3 != 165) {
                                            if (f3 != 16877) {
                                                if (f3 != 16981) {
                                                    if (f3 != 18402) {
                                                        if (f3 != 21419) {
                                                            if (f3 != 25506) {
                                                                if (f3 != 30322) {
                                                                    final StringBuilder sb = new StringBuilder(26);
                                                                    sb.append("Unexpected id: ");
                                                                    sb.append(f3);
                                                                    throw ParserException.a(sb.toString(), (Throwable)null);
                                                                }
                                                                a2.e(f3);
                                                                roa2.readFully(a2.u.v = new byte[n5], 0, n5);
                                                            }
                                                            else {
                                                                a2.e(f3);
                                                                roa2.readFully(a2.u.k = new byte[n5], 0, n5);
                                                            }
                                                        }
                                                        else {
                                                            Arrays.fill(a2.i.a, (byte)0);
                                                            roa2.readFully(a2.i.a, 4 - n5, n5);
                                                            a2.i.D(0);
                                                            a2.w = (int)a2.i.u();
                                                        }
                                                    }
                                                    else {
                                                        final byte[] array = new byte[n5];
                                                        roa2.readFully(array, 0, n5);
                                                        a2.e(f3);
                                                        a2.u.j = new vwt$a(1, array, 0, 0);
                                                    }
                                                }
                                                else {
                                                    a2.e(f3);
                                                    roa2.readFully(a2.u.i = new byte[n5], 0, n5);
                                                }
                                            }
                                            else {
                                                a2.e(f3);
                                                final wog.wog$b u = a2.u;
                                                final int g2 = u.g;
                                                if (g2 != 1685485123 && g2 != 1685480259) {
                                                    roa2.k(n5);
                                                }
                                                else {
                                                    roa2.readFully(u.N = new byte[n5], 0, n5);
                                                }
                                            }
                                        }
                                        else if (a2.G == 2) {
                                            final wog.wog$b wog$b = (wog.wog$b)a2.c.get(a2.M);
                                            if (a2.P == 4 && "V_VP9".equals(wog$b.b)) {
                                                a2.n.A(n5);
                                                roa2.readFully(a2.n.a, 0, n5);
                                            }
                                            else {
                                                roa2.k(n5);
                                            }
                                        }
                                    }
                                    else {
                                        if (a2.G == 0) {
                                            a2.M = (int)a2.b.c(roa2, false, true, 8);
                                            a2.N = a2.b.c;
                                            a2.I = -9223372036854775807L;
                                            a2.G = 1;
                                            a2.g.A(0);
                                        }
                                        final wog.wog$b wog$b2 = (wog.wog$b)a2.c.get(a2.M);
                                        if (wog$b2 == null) {
                                            roa2.k(n5 - a2.N);
                                            a2.G = 0;
                                        }
                                        else {
                                            Objects.requireNonNull(wog$b2.X);
                                            if (a2.G == 1) {
                                                a2.j(roa2, 3);
                                                final int n6 = (a2.g.a[2] & 0x6) >> 1;
                                                if (n6 == 0) {
                                                    a2.K = 1;
                                                    int[] l = a2.L;
                                                    if (l == null) {
                                                        l = new int[] { 0 };
                                                    }
                                                    else if (l.length < 1) {
                                                        l = new int[Math.max(l.length * 2, 1)];
                                                    }
                                                    (a2.L = l)[0] = n5 - a2.N - 3;
                                                }
                                                else {
                                                    a2.j(roa2, 4);
                                                    final int k = (a2.g.a[3] & 0xFF) + 1;
                                                    a2.K = k;
                                                    int[] i = a2.L;
                                                    if (i == null) {
                                                        i = new int[k];
                                                    }
                                                    else if (i.length < k) {
                                                        i = new int[Math.max(i.length * 2, k)];
                                                    }
                                                    a2.L = i;
                                                    if (n6 == 2) {
                                                        final int n7 = a2.N;
                                                        final int j = a2.K;
                                                        Arrays.fill(i, 0, j, (n5 - n7 - 4) / j);
                                                    }
                                                    else if (n6 == 1) {
                                                        int n8 = 0;
                                                        final int n9 = 0;
                                                        int n10 = n2;
                                                        int n11 = n9;
                                                        int n12;
                                                        while (true) {
                                                            n12 = a2.K - 1;
                                                            if (n8 >= n12) {
                                                                break;
                                                            }
                                                            a2.L[n8] = 0;
                                                            int n13;
                                                            int[] m;
                                                            do {
                                                                ++n10;
                                                                a2.j(roa2, n10);
                                                                n13 = (a2.g.a[n10 - 1] & 0xFF);
                                                                m = a2.L;
                                                                m[n8] += n13;
                                                            } while (n13 == 255);
                                                            n11 += m[n8];
                                                            ++n8;
                                                        }
                                                        a2.L[n12] = n5 - a2.N - n10 - n11;
                                                    }
                                                    else {
                                                        if (n6 != 3) {
                                                            final StringBuilder sb2 = new StringBuilder(36);
                                                            sb2.append("Unexpected lacing value: ");
                                                            sb2.append(n6);
                                                            throw ParserException.a(sb2.toString(), (Throwable)null);
                                                        }
                                                        int n14 = 0;
                                                        final int n15 = 0;
                                                        int n16 = n2;
                                                        int n17 = n15;
                                                    Label_2852:
                                                        while (true) {
                                                            final int n18 = a2.K - 1;
                                                            if (n14 >= n18) {
                                                                a2.L[n18] = n5 - a2.N - n16 - n17;
                                                                break;
                                                            }
                                                            a2.L[n14] = 0;
                                                            ++n16;
                                                            a2.j(roa2, n16);
                                                            final byte[] a3 = a2.g.a;
                                                            final int n19 = n16 - 1;
                                                            if (a3[n19] != 0) {
                                                                int n20 = 0;
                                                                while (true) {
                                                                    while (n20 < 8) {
                                                                        final int n21 = 1 << 7 - n20;
                                                                        if ((a2.g.a[n19] & n21) != 0x0) {
                                                                            final int n22 = n16 + n20;
                                                                            a2.j(roa2, n22);
                                                                            final byte[] a4 = a2.g.a;
                                                                            int n23 = n19 + 1;
                                                                            long n24 = a4[n19] & 0xFF & ~n21;
                                                                            while (n23 < n22) {
                                                                                n24 = (n24 << 8 | (long)(a2.g.a[n23] & 0xFF));
                                                                                ++n23;
                                                                            }
                                                                            n16 = n22;
                                                                            long n25 = n24;
                                                                            if (n14 > 0) {
                                                                                n25 = n24 - ((1L << n20 * 7 + 6) - 1L);
                                                                                n16 = n22;
                                                                            }
                                                                            if (n25 >= -2147483648L && n25 <= 2147483647L) {
                                                                                int n26 = (int)n25;
                                                                                final int[] l2 = a2.L;
                                                                                if (n14 != 0) {
                                                                                    n26 += l2[n14 - 1];
                                                                                }
                                                                                l2[n14] = n26;
                                                                                n17 += l2[n14];
                                                                                ++n14;
                                                                                roa2 = roa;
                                                                                continue Label_2852;
                                                                            }
                                                                            throw ParserException.a("EBML lacing sample size out of range.", (Throwable)null);
                                                                        }
                                                                        else {
                                                                            ++n20;
                                                                            roa2 = roa;
                                                                        }
                                                                    }
                                                                    long n25 = 0L;
                                                                    continue;
                                                                }
                                                            }
                                                            throw ParserException.a("No valid varint length mask found", (Throwable)null);
                                                        }
                                                    }
                                                }
                                                final byte[] a5 = a2.g.a;
                                                a2.H = a2.l((a5[1] & 0xFF) | a5[0] << 8) + a2.B;
                                                int o;
                                                if (wog$b2.d != 2 && (f3 != 163 || (a2.g.a[2] & 0x80) != 0x80)) {
                                                    o = 0;
                                                }
                                                else {
                                                    o = 1;
                                                }
                                                a2.O = o;
                                                a2.G = 2;
                                                a2.J = 0;
                                            }
                                            if (f3 == 163) {
                                                while (true) {
                                                    final int j2 = a2.J;
                                                    if (j2 >= a2.K) {
                                                        break;
                                                    }
                                                    a2.f(wog$b2, a2.J * wog$b2.e / 1000 + a2.H, a2.O, a2.m(roa, wog$b2, a2.L[j2]), 0);
                                                    ++a2.J;
                                                }
                                                a2.G = 0;
                                            }
                                            else {
                                                while (true) {
                                                    final int j3 = a2.J;
                                                    if (j3 >= a2.K) {
                                                        break;
                                                    }
                                                    final int[] l3 = a2.L;
                                                    l3[j3] = a2.m(roa, wog$b2, l3[j3]);
                                                    ++a2.J;
                                                }
                                            }
                                            roa2 = roa;
                                        }
                                    }
                                    nh8.e = 0;
                                    break;
                                }
                                if (n4 != 5) {
                                    final StringBuilder sb3 = new StringBuilder(32);
                                    sb3.append("Invalid element type ");
                                    sb3.append(n4);
                                    throw ParserException.a(sb3.toString(), (Throwable)null);
                                }
                                final long g3 = nh8.g;
                                if (g3 != 4L && g3 != 8L) {
                                    final StringBuilder sb4 = new StringBuilder(40);
                                    sb4.append("Invalid float size: ");
                                    sb4.append(g3);
                                    throw ParserException.a(sb4.toString(), (Throwable)null);
                                }
                                final qq9 d4 = nh8.d;
                                final int f4 = nh8.f;
                                final int n27 = (int)g3;
                                final long a6 = nh8.a(roa2, n27);
                                double longBitsToDouble;
                                if (n27 == 4) {
                                    longBitsToDouble = Float.intBitsToFloat((int)a6);
                                }
                                else {
                                    longBitsToDouble = Double.longBitsToDouble(a6);
                                }
                                final wog a7 = ((a)d4).a;
                                Objects.requireNonNull(a7);
                                Label_1726: {
                                    if (f4 != 181) {
                                        if (f4 != 17545) {
                                            switch (f4) {
                                                default: {
                                                    switch (f4) {
                                                        default: {
                                                            break Label_1726;
                                                        }
                                                        case 30325: {
                                                            a7.e(f4);
                                                            a7.u.u = (float)longBitsToDouble;
                                                            break Label_1726;
                                                        }
                                                        case 30324: {
                                                            a7.e(f4);
                                                            a7.u.t = (float)longBitsToDouble;
                                                            break Label_1726;
                                                        }
                                                        case 30323: {
                                                            a7.e(f4);
                                                            a7.u.s = (float)longBitsToDouble;
                                                            break Label_1726;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 21978: {
                                                    a7.e(f4);
                                                    a7.u.M = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21977: {
                                                    a7.e(f4);
                                                    a7.u.L = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21976: {
                                                    a7.e(f4);
                                                    a7.u.K = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21975: {
                                                    a7.e(f4);
                                                    a7.u.J = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21974: {
                                                    a7.e(f4);
                                                    a7.u.I = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21973: {
                                                    a7.e(f4);
                                                    a7.u.H = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21972: {
                                                    a7.e(f4);
                                                    a7.u.G = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21971: {
                                                    a7.e(f4);
                                                    a7.u.F = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21970: {
                                                    a7.e(f4);
                                                    a7.u.E = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21969: {
                                                    a7.e(f4);
                                                    a7.u.D = (float)longBitsToDouble;
                                                    break;
                                                }
                                            }
                                        }
                                        else {
                                            a7.s = (long)longBitsToDouble;
                                        }
                                    }
                                    else {
                                        a7.e(f4);
                                        a7.u.Q = (int)longBitsToDouble;
                                    }
                                }
                                nh8.e = 0;
                                break;
                            }
                            else {
                                final long g4 = nh8.g;
                                if (g4 <= 2147483647L) {
                                    final qq9 d5 = nh8.d;
                                    final int f5 = nh8.f;
                                    int n28 = (int)g4;
                                    String b2;
                                    if (n28 == 0) {
                                        b2 = "";
                                    }
                                    else {
                                        final byte[] array2 = new byte[n28];
                                        roa2.readFully(array2, 0, n28);
                                        while (n28 > 0) {
                                            final int n29 = n28 - 1;
                                            if (array2[n29] != 0) {
                                                break;
                                            }
                                            n28 = n29;
                                        }
                                        b2 = new String(array2, 0, n28);
                                    }
                                    final wog a8 = ((a)d5).a;
                                    Objects.requireNonNull(a8);
                                    if (f5 != 134) {
                                        if (f5 != 17026) {
                                            if (f5 != 21358) {
                                                if (f5 == 2274716) {
                                                    a8.e(f5);
                                                    a8.u.W = b2;
                                                }
                                            }
                                            else {
                                                a8.e(f5);
                                                a8.u.a = b2;
                                            }
                                        }
                                        else if (!"webm".equals(b2)) {
                                            if (!"matroska".equals(b2)) {
                                                final StringBuilder sb5 = new StringBuilder(b2.length() + 22);
                                                sb5.append("DocType ");
                                                sb5.append(b2);
                                                sb5.append(" not supported");
                                                throw ParserException.a(sb5.toString(), (Throwable)null);
                                            }
                                        }
                                    }
                                    else {
                                        a8.e(f5);
                                        a8.u.b = b2;
                                    }
                                    nh8.e = 0;
                                    break;
                                }
                                final StringBuilder sb6 = new StringBuilder(41);
                                sb6.append("String element size: ");
                                sb6.append(g4);
                                throw ParserException.a(sb6.toString(), (Throwable)null);
                            }
                        }
                        else {
                            final long g5 = nh8.g;
                            if (g5 <= 8L) {
                                final qq9 d6 = nh8.d;
                                final int f6 = nh8.f;
                                final long a9 = nh8.a(roa2, (int)g5);
                                final wog a10 = ((a)d6).a;
                                Objects.requireNonNull(a10);
                                Label_5425: {
                                    if (f6 != 20529) {
                                        if (f6 != 20530) {
                                            switch (f6) {
                                                default: {
                                                    switch (f6) {
                                                        default: {
                                                            break Label_5425;
                                                        }
                                                        case 21949: {
                                                            a10.e(f6);
                                                            a10.u.C = (int)a9;
                                                            break Label_5425;
                                                        }
                                                        case 21948: {
                                                            a10.e(f6);
                                                            a10.u.B = (int)a9;
                                                            break Label_5425;
                                                        }
                                                        case 21947: {
                                                            a10.e(f6);
                                                            a10.u.x = true;
                                                            final int a11 = wr4.a((int)a9);
                                                            if (a11 != -1) {
                                                                a10.u.y = a11;
                                                                break Label_5425;
                                                            }
                                                            break Label_5425;
                                                        }
                                                        case 21946: {
                                                            a10.e(f6);
                                                            final int b3 = wr4.b((int)a9);
                                                            if (b3 != -1) {
                                                                a10.u.z = b3;
                                                                break Label_5425;
                                                            }
                                                            break Label_5425;
                                                        }
                                                        case 21945: {
                                                            a10.e(f6);
                                                            final int n30 = (int)a9;
                                                            if (n30 == 1) {
                                                                a10.u.A = 2;
                                                                break Label_5425;
                                                            }
                                                            if (n30 != 2) {
                                                                break Label_5425;
                                                            }
                                                            a10.u.A = 1;
                                                            break Label_5425;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 2807729: {
                                                    a10.r = a9;
                                                    break;
                                                }
                                                case 2352003: {
                                                    a10.e(f6);
                                                    a10.u.e = (int)a9;
                                                    break;
                                                }
                                                case 30321: {
                                                    a10.e(f6);
                                                    final int n31 = (int)a9;
                                                    if (n31 == 0) {
                                                        a10.u.r = 0;
                                                        break;
                                                    }
                                                    if (n31 == 1) {
                                                        a10.u.r = 1;
                                                        break;
                                                    }
                                                    if (n31 == 2) {
                                                        a10.u.r = 2;
                                                        break;
                                                    }
                                                    if (n31 != 3) {
                                                        break;
                                                    }
                                                    a10.u.r = 3;
                                                    break;
                                                }
                                                case 25188: {
                                                    a10.e(f6);
                                                    a10.u.P = (int)a9;
                                                    break;
                                                }
                                                case 22203: {
                                                    a10.e(f6);
                                                    a10.u.S = a9;
                                                    break;
                                                }
                                                case 22186: {
                                                    a10.e(f6);
                                                    a10.u.R = a9;
                                                    break;
                                                }
                                                case 21998: {
                                                    a10.e(f6);
                                                    a10.u.f = (int)a9;
                                                    break;
                                                }
                                                case 21930: {
                                                    a10.e(f6);
                                                    a10.u.U = (a9 == 1L);
                                                    break;
                                                }
                                                case 21690: {
                                                    a10.e(f6);
                                                    a10.u.p = (int)a9;
                                                    break;
                                                }
                                                case 21682: {
                                                    a10.e(f6);
                                                    a10.u.q = (int)a9;
                                                    break;
                                                }
                                                case 21680: {
                                                    a10.e(f6);
                                                    a10.u.o = (int)a9;
                                                    break;
                                                }
                                                case 21432: {
                                                    final int n32 = (int)a9;
                                                    a10.e(f6);
                                                    if (n32 == 0) {
                                                        a10.u.w = 0;
                                                        break;
                                                    }
                                                    if (n32 == 1) {
                                                        a10.u.w = 2;
                                                        break;
                                                    }
                                                    if (n32 == 3) {
                                                        a10.u.w = 1;
                                                        break;
                                                    }
                                                    if (n32 != 15) {
                                                        break;
                                                    }
                                                    a10.u.w = 3;
                                                    break;
                                                }
                                                case 21420: {
                                                    a10.x = a9 + a10.q;
                                                    break;
                                                }
                                                case 18408: {
                                                    if (a9 == 1L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb7 = new StringBuilder(56);
                                                    sb7.append("AESSettingsCipherMode ");
                                                    sb7.append(a9);
                                                    sb7.append(" not supported");
                                                    throw ParserException.a(sb7.toString(), (Throwable)null);
                                                }
                                                case 18401: {
                                                    if (a9 == 5L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb8 = new StringBuilder(49);
                                                    sb8.append("ContentEncAlgo ");
                                                    sb8.append(a9);
                                                    sb8.append(" not supported");
                                                    throw ParserException.a(sb8.toString(), (Throwable)null);
                                                }
                                                case 17143: {
                                                    if (a9 == 1L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb9 = new StringBuilder(50);
                                                    sb9.append("EBMLReadVersion ");
                                                    sb9.append(a9);
                                                    sb9.append(" not supported");
                                                    throw ParserException.a(sb9.toString(), (Throwable)null);
                                                }
                                                case 17029: {
                                                    if (a9 >= 1L && a9 <= 2L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb10 = new StringBuilder(53);
                                                    sb10.append("DocTypeReadVersion ");
                                                    sb10.append(a9);
                                                    sb10.append(" not supported");
                                                    throw ParserException.a(sb10.toString(), (Throwable)null);
                                                }
                                                case 16980: {
                                                    if (a9 == 3L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb11 = new StringBuilder(50);
                                                    sb11.append("ContentCompAlgo ");
                                                    sb11.append(a9);
                                                    sb11.append(" not supported");
                                                    throw ParserException.a(sb11.toString(), (Throwable)null);
                                                }
                                                case 16871: {
                                                    a10.e(f6);
                                                    a10.u.g = (int)a9;
                                                    break;
                                                }
                                                case 251: {
                                                    a10.Q = true;
                                                    break;
                                                }
                                                case 241: {
                                                    if (!a10.E) {
                                                        a10.d(f6);
                                                        a10.D.a(a9);
                                                        a10.E = true;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 238: {
                                                    a10.P = (int)a9;
                                                    break;
                                                }
                                                case 231: {
                                                    a10.B = a10.l(a9);
                                                    break;
                                                }
                                                case 215: {
                                                    a10.e(f6);
                                                    a10.u.c = (int)a9;
                                                    break;
                                                }
                                                case 186: {
                                                    a10.e(f6);
                                                    a10.u.n = (int)a9;
                                                    break;
                                                }
                                                case 179: {
                                                    a10.d(f6);
                                                    a10.C.a(a10.l(a9));
                                                    break;
                                                }
                                                case 176: {
                                                    a10.e(f6);
                                                    a10.u.m = (int)a9;
                                                    break;
                                                }
                                                case 159: {
                                                    a10.e(f6);
                                                    a10.u.O = (int)a9;
                                                    break;
                                                }
                                                case 155: {
                                                    a10.I = a10.l(a9);
                                                    break;
                                                }
                                                case 136: {
                                                    a10.e(f6);
                                                    a10.u.V = (a9 == 1L);
                                                    break;
                                                }
                                                case 131: {
                                                    a10.e(f6);
                                                    a10.u.d = (int)a9;
                                                    break;
                                                }
                                            }
                                        }
                                        else if (a9 != 1L) {
                                            final StringBuilder sb12 = new StringBuilder(55);
                                            sb12.append("ContentEncodingScope ");
                                            sb12.append(a9);
                                            sb12.append(" not supported");
                                            throw ParserException.a(sb12.toString(), (Throwable)null);
                                        }
                                    }
                                    else if (a9 != 0L) {
                                        final StringBuilder sb13 = new StringBuilder(55);
                                        sb13.append("ContentEncodingOrder ");
                                        sb13.append(a9);
                                        sb13.append(" not supported");
                                        throw ParserException.a(sb13.toString(), (Throwable)null);
                                    }
                                }
                                nh8.e = 0;
                                break;
                            }
                            final StringBuilder sb14 = new StringBuilder(42);
                            sb14.append("Invalid integer size: ");
                            sb14.append(g5);
                            throw ParserException.a(sb14.toString(), (Throwable)null);
                        }
                    }
                    else {
                        roa2.k((int)nh8.g);
                        nh8.e = 0;
                    }
                }
                n = 1;
            }
            if (n != 0) {
                final long position2 = roa.getPosition();
                boolean b4 = false;
                Label_5996: {
                    Label_5987: {
                        if (!this.y) {
                            if (this.v) {
                                final long a12 = this.A;
                                if (a12 != -1L) {
                                    lsk.a = a12;
                                    this.A = -1L;
                                    break Label_5987;
                                }
                            }
                            b4 = false;
                            break Label_5996;
                        }
                        this.A = position2;
                        lsk.a = this.z;
                        this.y = false;
                    }
                    b4 = true;
                }
                if (b4) {
                    return 1;
                }
                continue;
            }
        }
        if (n == 0) {
            for (int n33 = 0; n33 < this.c.size(); ++n33) {
                final wog.wog$b wog$b3 = (wog.wog$b)this.c.valueAt(n33);
                wog.wog$b.a(wog$b3);
                final t4u t = wog$b3.T;
                if (t != null) {
                    t.a(wog$b3.X, wog$b3.j);
                }
            }
            return -1;
        }
        return 0;
    }
    
    public final boolean b(final roa roa) throws IOException {
        final pjq pjq = new pjq();
        final long c = ((vh8)roa).c;
        final long n = 1024L;
        final long n2 = lcmp(c, -1L);
        long n3 = n;
        if (n2 != 0) {
            if (c > 1024L) {
                n3 = n;
            }
            else {
                n3 = c;
            }
        }
        final int n4 = (int)n3;
        final byte[] a = pjq.a.a;
        final vh8 vh8 = (vh8)roa;
        final boolean b = false;
        vh8.c(a, 0, 4, false);
        long u = pjq.a.u();
        pjq.b = 4;
        while (u != 440786851L) {
            if (++pjq.b == n4) {
                return b;
            }
            vh8.c(pjq.a.a, 0, 1, false);
            u = ((u << 8 & 0xFFFFFFFFFFFFFF00L) | (long)(pjq.a.a[0] & 0xFF));
        }
        final long a2 = pjq.a(roa);
        final long n5 = pjq.b;
        boolean b2 = b;
        if (a2 == Long.MIN_VALUE) {
            return b2;
        }
        if (n2 != 0 && n5 + a2 >= c) {
            b2 = b;
            return b2;
        }
        while (true) {
            final long n6 = lcmp((long)pjq.b, n5 + a2);
            if (n6 < 0) {
                if (pjq.a(roa) == Long.MIN_VALUE) {
                    b2 = b;
                    return b2;
                }
                final long a3 = pjq.a(roa);
                final long n7 = lcmp(a3, 0L);
                b2 = b;
                if (n7 < 0) {
                    return b2;
                }
                if (a3 > 2147483647L) {
                    b2 = b;
                    return b2;
                }
                if (n7 == 0) {
                    continue;
                }
                final int n8 = (int)a3;
                vh8.l(n8, false);
                pjq.b += n8;
            }
            else {
                b2 = b;
                if (n6 == 0) {
                    b2 = true;
                    return b2;
                }
                return b2;
            }
        }
    }
    
    public final void c(final long n, final long n2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        final nh8 nh8 = (nh8)this.a;
        nh8.e = 0;
        nh8.b.clear();
        final vpw c = nh8.c;
        c.b = 0;
        c.c = 0;
        final vpw b = this.b;
        b.b = 0;
        b.c = 0;
        this.k();
        for (int i = 0; i < this.c.size(); ++i) {
            final t4u t = ((wog.wog$b)this.c.valueAt(i)).T;
            if (t != null) {
                t.b = false;
                t.c = 0;
            }
        }
    }
    
    @EnsuresNonNull({ "cueTimesUs", "cueClusterPositions" })
    public final void d(final int n) throws ParserException {
        if (this.C != null && this.D != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder(37);
        sb.append("Element ");
        sb.append(n);
        sb.append(" must be in a Cues");
        throw ParserException.a(sb.toString(), (Throwable)null);
    }
    
    @EnsuresNonNull({ "currentTrack" })
    public final void e(final int n) throws ParserException {
        if (this.u != null) {
            return;
        }
        final StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(n);
        sb.append(" must be in a TrackEntry");
        throw ParserException.a(sb.toString(), (Throwable)null);
    }
    
    @RequiresNonNull({ "#1.output" })
    public final void f(final wog.wog$b wog$b, final long n, int n2, int n3, final int n4) {
        final t4u t = wog$b.T;
        if (t != null) {
            t.b(wog$b.X, n, n2, n3, n4, wog$b.j);
        }
        else {
            if ("S_TEXT/UTF8".equals(wog$b.b) || "S_TEXT/ASS".equals(wog$b.b) || "S_TEXT/WEBVTT".equals(wog$b.b)) {
                if (this.K > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                }
                else {
                    final long i = this.I;
                    if (i == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    }
                    else {
                        final String b = wog$b.b;
                        final byte[] a = this.k.a;
                        Objects.requireNonNull(b);
                        final int hashCode = b.hashCode();
                        int n5 = -1;
                        if (hashCode != 738597099) {
                            if (hashCode != 1045209816) {
                                if (hashCode == 1422270023) {
                                    if (b.equals("S_TEXT/UTF8")) {
                                        n5 = 2;
                                    }
                                }
                            }
                            else if (b.equals("S_TEXT/WEBVTT")) {
                                n5 = 1;
                            }
                        }
                        else if (b.equals("S_TEXT/ASS")) {
                            n5 = 0;
                        }
                        byte[] array;
                        int n6;
                        if (n5 != 0) {
                            if (n5 != 1) {
                                if (n5 != 2) {
                                    throw new IllegalArgumentException();
                                }
                                array = h(i, "%02d:%02d:%02d,%03d", 1000L);
                                n6 = 19;
                            }
                            else {
                                array = h(i, "%02d:%02d:%02d.%03d", 1000L);
                                n6 = 25;
                            }
                        }
                        else {
                            array = h(i, "%01d:%02d:%02d:%02d", 10000L);
                            n6 = 21;
                        }
                        System.arraycopy(array, 0, a, n6, array.length);
                        int b2 = this.k.b;
                        while (true) {
                            final gxj k = this.k;
                            if (b2 >= k.c) {
                                break;
                            }
                            if (k.a[b2] == 0) {
                                k.C(b2);
                                break;
                            }
                            ++b2;
                        }
                        final vwt x = wog$b.X;
                        final gxj j = this.k;
                        x.d(j, j.c);
                        n3 += this.k.c;
                    }
                }
            }
            int n7 = n3;
            Label_0491: {
                if ((n2 & 0x10000000) != 0x0) {
                    if (this.K > 1) {
                        n2 &= 0xEFFFFFFF;
                        break Label_0491;
                    }
                    final gxj n8 = this.n;
                    final int c = n8.c;
                    wog$b.X.a(n8, c);
                    n7 = n3 + c;
                }
                n3 = n7;
            }
            wog$b.X.b(n, n2, n3, n4, wog$b.j);
        }
        this.F = true;
    }
    
    public final void g(final int p0) throws ParserException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        wog.a0:Lvoa;
        //     4: invokestatic    omi.r:(Ljava/lang/Object;)Ljava/lang/Object;
        //     7: pop            
        //     8: iconst_2       
        //     9: istore          6
        //    11: iconst_0       
        //    12: istore          5
        //    14: iload_1        
        //    15: sipush          160
        //    18: if_icmpeq       5885
        //    21: iload_1        
        //    22: sipush          174
        //    25: if_icmpeq       729
        //    28: iload_1        
        //    29: sipush          19899
        //    32: if_icmpeq       680
        //    35: iload_1        
        //    36: sipush          25152
        //    39: if_icmpeq       599
        //    42: iload_1        
        //    43: sipush          28032
        //    46: if_icmpeq       561
        //    49: iload_1        
        //    50: ldc_w           357149030
        //    53: if_icmpeq       515
        //    56: iload_1        
        //    57: ldc_w           374648427
        //    60: if_icmpeq       485
        //    63: iload_1        
        //    64: ldc_w           475249515
        //    67: if_icmpeq       73
        //    70: goto            6051
        //    73: aload_0        
        //    74: getfield        wog.v:Z
        //    77: ifne            472
        //    80: aload_0        
        //    81: getfield        wog.a0:Lvoa;
        //    84: astore          23
        //    86: aload_0        
        //    87: getfield        wog.C:Lfcg;
        //    90: astore          16
        //    92: aload_0        
        //    93: getfield        wog.D:Lfcg;
        //    96: astore          15
        //    98: aload_0        
        //    99: getfield        wog.q:J
        //   102: ldc2_w          -1
        //   105: lcmp           
        //   106: ifeq            445
        //   109: aload_0        
        //   110: getfield        wog.t:J
        //   113: ldc2_w          -9223372036854775807
        //   116: lcmp           
        //   117: ifeq            445
        //   120: aload           16
        //   122: ifnull          445
        //   125: aload           16
        //   127: getfield        fcg.a:I
        //   130: istore          6
        //   132: iload           6
        //   134: ifeq            445
        //   137: aload           15
        //   139: ifnull          445
        //   142: aload           15
        //   144: getfield        fcg.a:I
        //   147: iload           6
        //   149: if_icmpeq       155
        //   152: goto            445
        //   155: iload           6
        //   157: newarray        I
        //   159: astore          22
        //   161: iload           6
        //   163: newarray        J
        //   165: astore          21
        //   167: iload           6
        //   169: newarray        J
        //   171: astore          20
        //   173: iload           6
        //   175: newarray        J
        //   177: astore          19
        //   179: iconst_0       
        //   180: istore          4
        //   182: iload           5
        //   184: istore_1       
        //   185: iload           4
        //   187: iload           6
        //   189: if_icmpge       231
        //   192: aload           19
        //   194: iload           4
        //   196: aload           16
        //   198: iload           4
        //   200: invokevirtual   fcg.d:(I)J
        //   203: lastore        
        //   204: aload_0        
        //   205: getfield        wog.q:J
        //   208: lstore          11
        //   210: aload           21
        //   212: iload           4
        //   214: aload           15
        //   216: iload           4
        //   218: invokevirtual   fcg.d:(I)J
        //   221: lload           11
        //   223: ladd           
        //   224: lastore        
        //   225: iinc            4, 1
        //   228: goto            182
        //   231: iload           6
        //   233: iconst_1       
        //   234: isub           
        //   235: istore          4
        //   237: iload_1        
        //   238: iload           4
        //   240: if_icmpge       283
        //   243: iload_1        
        //   244: iconst_1       
        //   245: iadd           
        //   246: istore          4
        //   248: aload           22
        //   250: iload_1        
        //   251: aload           21
        //   253: iload           4
        //   255: laload         
        //   256: aload           21
        //   258: iload_1        
        //   259: laload         
        //   260: lsub           
        //   261: l2i            
        //   262: iastore        
        //   263: aload           20
        //   265: iload_1        
        //   266: aload           19
        //   268: iload           4
        //   270: laload         
        //   271: aload           19
        //   273: iload_1        
        //   274: laload         
        //   275: lsub           
        //   276: lastore        
        //   277: iload           4
        //   279: istore_1       
        //   280: goto            231
        //   283: aload           22
        //   285: iload           4
        //   287: aload_0        
        //   288: getfield        wog.q:J
        //   291: aload_0        
        //   292: getfield        wog.p:J
        //   295: ladd           
        //   296: aload           21
        //   298: iload           4
        //   300: laload         
        //   301: lsub           
        //   302: l2i            
        //   303: iastore        
        //   304: aload           20
        //   306: iload           4
        //   308: aload_0        
        //   309: getfield        wog.t:J
        //   312: aload           19
        //   314: iload           4
        //   316: laload         
        //   317: lsub           
        //   318: lastore        
        //   319: aload           20
        //   321: iload           4
        //   323: laload         
        //   324: lstore          11
        //   326: aload           22
        //   328: astore          18
        //   330: aload           21
        //   332: astore          17
        //   334: aload           20
        //   336: astore          16
        //   338: aload           19
        //   340: astore          15
        //   342: lload           11
        //   344: lconst_0       
        //   345: lcmp           
        //   346: ifgt            425
        //   349: new             Ljava/lang/StringBuilder;
        //   352: dup            
        //   353: bipush          72
        //   355: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   358: astore          15
        //   360: aload           15
        //   362: ldc_w           "Discarding last cue point with unexpected duration: "
        //   365: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   368: pop            
        //   369: aload           15
        //   371: lload           11
        //   373: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   376: pop            
        //   377: ldc_w           "MatroskaExtractor"
        //   380: aload           15
        //   382: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   385: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   388: pop            
        //   389: aload           22
        //   391: iload           4
        //   393: invokestatic    java/util/Arrays.copyOf:([II)[I
        //   396: astore          18
        //   398: aload           21
        //   400: iload           4
        //   402: invokestatic    java/util/Arrays.copyOf:([JI)[J
        //   405: astore          17
        //   407: aload           20
        //   409: iload           4
        //   411: invokestatic    java/util/Arrays.copyOf:([JI)[J
        //   414: astore          16
        //   416: aload           19
        //   418: iload           4
        //   420: invokestatic    java/util/Arrays.copyOf:([JI)[J
        //   423: astore          15
        //   425: new             Lqa4;
        //   428: dup            
        //   429: aload           18
        //   431: aload           17
        //   433: aload           16
        //   435: aload           15
        //   437: invokespecial   qa4.<init>:([I[J[J[J)V
        //   440: astore          15
        //   442: goto            458
        //   445: new             Lqcp$b;
        //   448: dup            
        //   449: aload_0        
        //   450: getfield        wog.t:J
        //   453: invokespecial   qcp$b.<init>:(J)V
        //   456: astore          15
        //   458: aload           23
        //   460: aload           15
        //   462: invokeinterface voa.l:(Lqcp;)V
        //   467: aload_0        
        //   468: iconst_1       
        //   469: putfield        wog.v:Z
        //   472: aload_0        
        //   473: aconst_null    
        //   474: putfield        wog.C:Lfcg;
        //   477: aload_0        
        //   478: aconst_null    
        //   479: putfield        wog.D:Lfcg;
        //   482: goto            6051
        //   485: aload_0        
        //   486: getfield        wog.c:Landroid/util/SparseArray;
        //   489: invokevirtual   android/util/SparseArray.size:()I
        //   492: ifeq            507
        //   495: aload_0        
        //   496: getfield        wog.a0:Lvoa;
        //   499: invokeinterface voa.p:()V
        //   504: goto            6051
        //   507: ldc_w           "No valid tracks were found"
        //   510: aconst_null    
        //   511: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //   514: athrow         
        //   515: aload_0        
        //   516: getfield        wog.r:J
        //   519: ldc2_w          -9223372036854775807
        //   522: lcmp           
        //   523: ifne            533
        //   526: aload_0        
        //   527: ldc2_w          1000000
        //   530: putfield        wog.r:J
        //   533: aload_0        
        //   534: getfield        wog.s:J
        //   537: lstore          11
        //   539: lload           11
        //   541: ldc2_w          -9223372036854775807
        //   544: lcmp           
        //   545: ifeq            6051
        //   548: aload_0        
        //   549: aload_0        
        //   550: lload           11
        //   552: invokevirtual   wog.l:(J)J
        //   555: putfield        wog.t:J
        //   558: goto            6051
        //   561: aload_0        
        //   562: iload_1        
        //   563: invokevirtual   wog.e:(I)V
        //   566: aload_0        
        //   567: getfield        wog.u:Lwog$b;
        //   570: astore          15
        //   572: aload           15
        //   574: getfield        wog$b.h:Z
        //   577: ifeq            6051
        //   580: aload           15
        //   582: getfield        wog$b.i:[B
        //   585: ifnonnull       591
        //   588: goto            6051
        //   591: ldc_w           "Combining encryption and compression is not supported"
        //   594: aconst_null    
        //   595: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //   598: athrow         
        //   599: aload_0        
        //   600: iload_1        
        //   601: invokevirtual   wog.e:(I)V
        //   604: aload_0        
        //   605: getfield        wog.u:Lwog$b;
        //   608: astore          16
        //   610: aload           16
        //   612: getfield        wog$b.h:Z
        //   615: ifeq            6051
        //   618: aload           16
        //   620: getfield        wog$b.j:Lvwt$a;
        //   623: astore          15
        //   625: aload           15
        //   627: ifnull          672
        //   630: aload           16
        //   632: new             Lcom/google/android/exoplayer2/drm/b;
        //   635: dup            
        //   636: aconst_null    
        //   637: iconst_1       
        //   638: iconst_1       
        //   639: anewarray       Lcom/google/android/exoplayer2/drm/b$b;
        //   642: dup            
        //   643: iconst_0       
        //   644: new             Lcom/google/android/exoplayer2/drm/b$b;
        //   647: dup            
        //   648: getstatic       g73.a:Ljava/util/UUID;
        //   651: ldc_w           "video/webm"
        //   654: aload           15
        //   656: getfield        vwt$a.b:[B
        //   659: invokespecial   com/google/android/exoplayer2/drm/b$b.<init>:(Ljava/util/UUID;Ljava/lang/String;[B)V
        //   662: aastore        
        //   663: invokespecial   com/google/android/exoplayer2/drm/b.<init>:(Ljava/lang/String;Z[Lcom/google/android/exoplayer2/drm/b$b;)V
        //   666: putfield        wog$b.l:Lcom/google/android/exoplayer2/drm/b;
        //   669: goto            6051
        //   672: ldc_w           "Encrypted Track found but ContentEncKeyID was not found"
        //   675: aconst_null    
        //   676: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //   679: athrow         
        //   680: aload_0        
        //   681: getfield        wog.w:I
        //   684: istore_1       
        //   685: iload_1        
        //   686: iconst_m1      
        //   687: if_icmpeq       721
        //   690: aload_0        
        //   691: getfield        wog.x:J
        //   694: lstore          11
        //   696: lload           11
        //   698: ldc2_w          -1
        //   701: lcmp           
        //   702: ifeq            721
        //   705: iload_1        
        //   706: ldc_w           475249515
        //   709: if_icmpne       6051
        //   712: aload_0        
        //   713: lload           11
        //   715: putfield        wog.z:J
        //   718: goto            6051
        //   721: ldc_w           "Mandatory element SeekID or SeekPosition not found"
        //   724: aconst_null    
        //   725: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //   728: athrow         
        //   729: aload_0        
        //   730: getfield        wog.u:Lwog$b;
        //   733: astore          20
        //   735: aload           20
        //   737: invokestatic    omi.r:(Ljava/lang/Object;)Ljava/lang/Object;
        //   740: pop            
        //   741: aload           20
        //   743: getfield        wog$b.b:Ljava/lang/String;
        //   746: astore          15
        //   748: aload           15
        //   750: ifnull          5877
        //   753: aload           15
        //   755: invokevirtual   java/lang/String.hashCode:()I
        //   758: lookupswitch {
        //          -2095576542: 1670
        //          -2095575984: 1651
        //          -1985379776: 1632
        //          -1784763192: 1613
        //          -1730367663: 1594
        //          -1482641358: 1575
        //          -1482641357: 1555
        //          -1373388978: 1535
        //          -933872740: 1515
        //          -538363189: 1495
        //          -538363109: 1475
        //          -425012669: 1455
        //          -356037306: 1435
        //          62923557: 1415
        //          62923603: 1395
        //          62927045: 1375
        //          82318131: 1355
        //          82338133: 1335
        //          82338134: 1315
        //          99146302: 1295
        //          444813526: 1275
        //          542569478: 1255
        //          635596514: 1235
        //          725948237: 1215
        //          725957860: 1195
        //          738597099: 1175
        //          855502857: 1155
        //          1045209816: 1135
        //          1422270023: 1115
        //          1809237540: 1095
        //          1950749482: 1075
        //          1950789798: 1055
        //          1951062397: 1035
        //          default: 1032
        //        }
        //  1032: goto            1689
        //  1035: aload           15
        //  1037: ldc_w           "A_OPUS"
        //  1040: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1043: ifne            1049
        //  1046: goto            1689
        //  1049: bipush          32
        //  1051: istore_1       
        //  1052: goto            1691
        //  1055: aload           15
        //  1057: ldc_w           "A_FLAC"
        //  1060: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1063: ifne            1069
        //  1066: goto            1689
        //  1069: bipush          31
        //  1071: istore_1       
        //  1072: goto            1691
        //  1075: aload           15
        //  1077: ldc_w           "A_EAC3"
        //  1080: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1083: ifne            1089
        //  1086: goto            1689
        //  1089: bipush          30
        //  1091: istore_1       
        //  1092: goto            1691
        //  1095: aload           15
        //  1097: ldc_w           "V_MPEG2"
        //  1100: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1103: ifne            1109
        //  1106: goto            1689
        //  1109: bipush          29
        //  1111: istore_1       
        //  1112: goto            1691
        //  1115: aload           15
        //  1117: ldc_w           "S_TEXT/UTF8"
        //  1120: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1123: ifne            1129
        //  1126: goto            1689
        //  1129: bipush          28
        //  1131: istore_1       
        //  1132: goto            1691
        //  1135: aload           15
        //  1137: ldc_w           "S_TEXT/WEBVTT"
        //  1140: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1143: ifne            1149
        //  1146: goto            1689
        //  1149: bipush          27
        //  1151: istore_1       
        //  1152: goto            1691
        //  1155: aload           15
        //  1157: ldc_w           "V_MPEGH/ISO/HEVC"
        //  1160: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1163: ifne            1169
        //  1166: goto            1689
        //  1169: bipush          26
        //  1171: istore_1       
        //  1172: goto            1691
        //  1175: aload           15
        //  1177: ldc_w           "S_TEXT/ASS"
        //  1180: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1183: ifne            1189
        //  1186: goto            1689
        //  1189: bipush          25
        //  1191: istore_1       
        //  1192: goto            1691
        //  1195: aload           15
        //  1197: ldc_w           "A_PCM/INT/LIT"
        //  1200: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1203: ifne            1209
        //  1206: goto            1689
        //  1209: bipush          24
        //  1211: istore_1       
        //  1212: goto            1691
        //  1215: aload           15
        //  1217: ldc_w           "A_PCM/INT/BIG"
        //  1220: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1223: ifne            1229
        //  1226: goto            1689
        //  1229: bipush          23
        //  1231: istore_1       
        //  1232: goto            1691
        //  1235: aload           15
        //  1237: ldc_w           "A_PCM/FLOAT/IEEE"
        //  1240: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1243: ifne            1249
        //  1246: goto            1689
        //  1249: bipush          22
        //  1251: istore_1       
        //  1252: goto            1691
        //  1255: aload           15
        //  1257: ldc_w           "A_DTS/EXPRESS"
        //  1260: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1263: ifne            1269
        //  1266: goto            1689
        //  1269: bipush          21
        //  1271: istore_1       
        //  1272: goto            1691
        //  1275: aload           15
        //  1277: ldc_w           "V_THEORA"
        //  1280: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1283: ifne            1289
        //  1286: goto            1689
        //  1289: bipush          20
        //  1291: istore_1       
        //  1292: goto            1691
        //  1295: aload           15
        //  1297: ldc_w           "S_HDMV/PGS"
        //  1300: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1303: ifne            1309
        //  1306: goto            1689
        //  1309: bipush          19
        //  1311: istore_1       
        //  1312: goto            1691
        //  1315: aload           15
        //  1317: ldc_w           "V_VP9"
        //  1320: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1323: ifne            1329
        //  1326: goto            1689
        //  1329: bipush          18
        //  1331: istore_1       
        //  1332: goto            1691
        //  1335: aload           15
        //  1337: ldc_w           "V_VP8"
        //  1340: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1343: ifne            1349
        //  1346: goto            1689
        //  1349: bipush          17
        //  1351: istore_1       
        //  1352: goto            1691
        //  1355: aload           15
        //  1357: ldc_w           "V_AV1"
        //  1360: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1363: ifne            1369
        //  1366: goto            1689
        //  1369: bipush          16
        //  1371: istore_1       
        //  1372: goto            1691
        //  1375: aload           15
        //  1377: ldc_w           "A_DTS"
        //  1380: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1383: ifne            1389
        //  1386: goto            1689
        //  1389: bipush          15
        //  1391: istore_1       
        //  1392: goto            1691
        //  1395: aload           15
        //  1397: ldc_w           "A_AC3"
        //  1400: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1403: ifne            1409
        //  1406: goto            1689
        //  1409: bipush          14
        //  1411: istore_1       
        //  1412: goto            1691
        //  1415: aload           15
        //  1417: ldc_w           "A_AAC"
        //  1420: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1423: ifne            1429
        //  1426: goto            1689
        //  1429: bipush          13
        //  1431: istore_1       
        //  1432: goto            1691
        //  1435: aload           15
        //  1437: ldc_w           "A_DTS/LOSSLESS"
        //  1440: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1443: ifne            1449
        //  1446: goto            1689
        //  1449: bipush          12
        //  1451: istore_1       
        //  1452: goto            1691
        //  1455: aload           15
        //  1457: ldc_w           "S_VOBSUB"
        //  1460: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1463: ifne            1469
        //  1466: goto            1689
        //  1469: bipush          11
        //  1471: istore_1       
        //  1472: goto            1691
        //  1475: aload           15
        //  1477: ldc_w           "V_MPEG4/ISO/AVC"
        //  1480: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1483: ifne            1489
        //  1486: goto            1689
        //  1489: bipush          10
        //  1491: istore_1       
        //  1492: goto            1691
        //  1495: aload           15
        //  1497: ldc_w           "V_MPEG4/ISO/ASP"
        //  1500: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1503: ifne            1509
        //  1506: goto            1689
        //  1509: bipush          9
        //  1511: istore_1       
        //  1512: goto            1691
        //  1515: aload           15
        //  1517: ldc_w           "S_DVBSUB"
        //  1520: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1523: ifne            1529
        //  1526: goto            1689
        //  1529: bipush          8
        //  1531: istore_1       
        //  1532: goto            1691
        //  1535: aload           15
        //  1537: ldc_w           "V_MS/VFW/FOURCC"
        //  1540: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1543: ifne            1549
        //  1546: goto            1689
        //  1549: bipush          7
        //  1551: istore_1       
        //  1552: goto            1691
        //  1555: aload           15
        //  1557: ldc_w           "A_MPEG/L3"
        //  1560: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1563: ifne            1569
        //  1566: goto            1689
        //  1569: bipush          6
        //  1571: istore_1       
        //  1572: goto            1691
        //  1575: aload           15
        //  1577: ldc_w           "A_MPEG/L2"
        //  1580: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1583: ifne            1589
        //  1586: goto            1689
        //  1589: iconst_5       
        //  1590: istore_1       
        //  1591: goto            1691
        //  1594: aload           15
        //  1596: ldc_w           "A_VORBIS"
        //  1599: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1602: ifne            1608
        //  1605: goto            1689
        //  1608: iconst_4       
        //  1609: istore_1       
        //  1610: goto            1691
        //  1613: aload           15
        //  1615: ldc_w           "A_TRUEHD"
        //  1618: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1621: ifne            1627
        //  1624: goto            1689
        //  1627: iconst_3       
        //  1628: istore_1       
        //  1629: goto            1691
        //  1632: aload           15
        //  1634: ldc_w           "A_MS/ACM"
        //  1637: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1640: ifne            1646
        //  1643: goto            1689
        //  1646: iconst_2       
        //  1647: istore_1       
        //  1648: goto            1691
        //  1651: aload           15
        //  1653: ldc_w           "V_MPEG4/ISO/SP"
        //  1656: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1659: ifne            1665
        //  1662: goto            1689
        //  1665: iconst_1       
        //  1666: istore_1       
        //  1667: goto            1691
        //  1670: aload           15
        //  1672: ldc_w           "V_MPEG4/ISO/AP"
        //  1675: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1678: ifne            1684
        //  1681: goto            1689
        //  1684: iconst_0       
        //  1685: istore_1       
        //  1686: goto            1691
        //  1689: iconst_m1      
        //  1690: istore_1       
        //  1691: iload_1        
        //  1692: tableswitch {
        //                0: 1845
        //                1: 1845
        //                2: 1845
        //                3: 1845
        //                4: 1845
        //                5: 1845
        //                6: 1845
        //                7: 1845
        //                8: 1845
        //                9: 1845
        //               10: 1845
        //               11: 1845
        //               12: 1845
        //               13: 1845
        //               14: 1845
        //               15: 1845
        //               16: 1845
        //               17: 1845
        //               18: 1845
        //               19: 1845
        //               20: 1845
        //               21: 1845
        //               22: 1845
        //               23: 1845
        //               24: 1845
        //               25: 1845
        //               26: 1845
        //               27: 1845
        //               28: 1845
        //               29: 1845
        //               30: 1845
        //               31: 1845
        //               32: 1845
        //          default: 1840
        //        }
        //  1840: iconst_0       
        //  1841: istore_1       
        //  1842: goto            1847
        //  1845: iconst_1       
        //  1846: istore_1       
        //  1847: iload_1        
        //  1848: ifeq            5869
        //  1851: aload_0        
        //  1852: getfield        wog.a0:Lvoa;
        //  1855: astore          21
        //  1857: aload           20
        //  1859: getfield        wog$b.c:I
        //  1862: istore          8
        //  1864: aload           20
        //  1866: getfield        wog$b.b:Ljava/lang/String;
        //  1869: astore          15
        //  1871: aload           15
        //  1873: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1876: pop            
        //  1877: aload           15
        //  1879: invokevirtual   java/lang/String.hashCode:()I
        //  1882: lookupswitch {
        //          -2095576542: 2794
        //          -2095575984: 2775
        //          -1985379776: 2756
        //          -1784763192: 2737
        //          -1730367663: 2718
        //          -1482641358: 2699
        //          -1482641357: 2679
        //          -1373388978: 2659
        //          -933872740: 2639
        //          -538363189: 2619
        //          -538363109: 2599
        //          -425012669: 2579
        //          -356037306: 2559
        //          62923557: 2539
        //          62923603: 2519
        //          62927045: 2499
        //          82318131: 2479
        //          82338133: 2459
        //          82338134: 2439
        //          99146302: 2419
        //          444813526: 2399
        //          542569478: 2379
        //          635596514: 2359
        //          725948237: 2339
        //          725957860: 2319
        //          738597099: 2299
        //          855502857: 2279
        //          1045209816: 2259
        //          1422270023: 2239
        //          1809237540: 2219
        //          1950749482: 2199
        //          1950789798: 2179
        //          1951062397: 2159
        //          default: 2156
        //        }
        //  2156: goto            2813
        //  2159: aload           15
        //  2161: ldc_w           "A_OPUS"
        //  2164: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2167: ifne            2173
        //  2170: goto            2813
        //  2173: bipush          32
        //  2175: istore_1       
        //  2176: goto            2815
        //  2179: aload           15
        //  2181: ldc_w           "A_FLAC"
        //  2184: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2187: ifne            2193
        //  2190: goto            2813
        //  2193: bipush          31
        //  2195: istore_1       
        //  2196: goto            2815
        //  2199: aload           15
        //  2201: ldc_w           "A_EAC3"
        //  2204: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2207: ifne            2213
        //  2210: goto            2813
        //  2213: bipush          30
        //  2215: istore_1       
        //  2216: goto            2815
        //  2219: aload           15
        //  2221: ldc_w           "V_MPEG2"
        //  2224: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2227: ifne            2233
        //  2230: goto            2813
        //  2233: bipush          29
        //  2235: istore_1       
        //  2236: goto            2815
        //  2239: aload           15
        //  2241: ldc_w           "S_TEXT/UTF8"
        //  2244: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2247: ifne            2253
        //  2250: goto            2813
        //  2253: bipush          28
        //  2255: istore_1       
        //  2256: goto            2815
        //  2259: aload           15
        //  2261: ldc_w           "S_TEXT/WEBVTT"
        //  2264: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2267: ifne            2273
        //  2270: goto            2813
        //  2273: bipush          27
        //  2275: istore_1       
        //  2276: goto            2815
        //  2279: aload           15
        //  2281: ldc_w           "V_MPEGH/ISO/HEVC"
        //  2284: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2287: ifne            2293
        //  2290: goto            2813
        //  2293: bipush          26
        //  2295: istore_1       
        //  2296: goto            2815
        //  2299: aload           15
        //  2301: ldc_w           "S_TEXT/ASS"
        //  2304: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2307: ifne            2313
        //  2310: goto            2813
        //  2313: bipush          25
        //  2315: istore_1       
        //  2316: goto            2815
        //  2319: aload           15
        //  2321: ldc_w           "A_PCM/INT/LIT"
        //  2324: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2327: ifne            2333
        //  2330: goto            2813
        //  2333: bipush          24
        //  2335: istore_1       
        //  2336: goto            2815
        //  2339: aload           15
        //  2341: ldc_w           "A_PCM/INT/BIG"
        //  2344: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2347: ifne            2353
        //  2350: goto            2813
        //  2353: bipush          23
        //  2355: istore_1       
        //  2356: goto            2815
        //  2359: aload           15
        //  2361: ldc_w           "A_PCM/FLOAT/IEEE"
        //  2364: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2367: ifne            2373
        //  2370: goto            2813
        //  2373: bipush          22
        //  2375: istore_1       
        //  2376: goto            2815
        //  2379: aload           15
        //  2381: ldc_w           "A_DTS/EXPRESS"
        //  2384: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2387: ifne            2393
        //  2390: goto            2813
        //  2393: bipush          21
        //  2395: istore_1       
        //  2396: goto            2815
        //  2399: aload           15
        //  2401: ldc_w           "V_THEORA"
        //  2404: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2407: ifne            2413
        //  2410: goto            2813
        //  2413: bipush          20
        //  2415: istore_1       
        //  2416: goto            2815
        //  2419: aload           15
        //  2421: ldc_w           "S_HDMV/PGS"
        //  2424: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2427: ifne            2433
        //  2430: goto            2813
        //  2433: bipush          19
        //  2435: istore_1       
        //  2436: goto            2815
        //  2439: aload           15
        //  2441: ldc_w           "V_VP9"
        //  2444: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2447: ifne            2453
        //  2450: goto            2813
        //  2453: bipush          18
        //  2455: istore_1       
        //  2456: goto            2815
        //  2459: aload           15
        //  2461: ldc_w           "V_VP8"
        //  2464: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2467: ifne            2473
        //  2470: goto            2813
        //  2473: bipush          17
        //  2475: istore_1       
        //  2476: goto            2815
        //  2479: aload           15
        //  2481: ldc_w           "V_AV1"
        //  2484: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2487: ifne            2493
        //  2490: goto            2813
        //  2493: bipush          16
        //  2495: istore_1       
        //  2496: goto            2815
        //  2499: aload           15
        //  2501: ldc_w           "A_DTS"
        //  2504: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2507: ifne            2513
        //  2510: goto            2813
        //  2513: bipush          15
        //  2515: istore_1       
        //  2516: goto            2815
        //  2519: aload           15
        //  2521: ldc_w           "A_AC3"
        //  2524: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2527: ifne            2533
        //  2530: goto            2813
        //  2533: bipush          14
        //  2535: istore_1       
        //  2536: goto            2815
        //  2539: aload           15
        //  2541: ldc_w           "A_AAC"
        //  2544: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2547: ifne            2553
        //  2550: goto            2813
        //  2553: bipush          13
        //  2555: istore_1       
        //  2556: goto            2815
        //  2559: aload           15
        //  2561: ldc_w           "A_DTS/LOSSLESS"
        //  2564: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2567: ifne            2573
        //  2570: goto            2813
        //  2573: bipush          12
        //  2575: istore_1       
        //  2576: goto            2815
        //  2579: aload           15
        //  2581: ldc_w           "S_VOBSUB"
        //  2584: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2587: ifne            2593
        //  2590: goto            2813
        //  2593: bipush          11
        //  2595: istore_1       
        //  2596: goto            2815
        //  2599: aload           15
        //  2601: ldc_w           "V_MPEG4/ISO/AVC"
        //  2604: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2607: ifne            2613
        //  2610: goto            2813
        //  2613: bipush          10
        //  2615: istore_1       
        //  2616: goto            2815
        //  2619: aload           15
        //  2621: ldc_w           "V_MPEG4/ISO/ASP"
        //  2624: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2627: ifne            2633
        //  2630: goto            2813
        //  2633: bipush          9
        //  2635: istore_1       
        //  2636: goto            2815
        //  2639: aload           15
        //  2641: ldc_w           "S_DVBSUB"
        //  2644: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2647: ifne            2653
        //  2650: goto            2813
        //  2653: bipush          8
        //  2655: istore_1       
        //  2656: goto            2815
        //  2659: aload           15
        //  2661: ldc_w           "V_MS/VFW/FOURCC"
        //  2664: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2667: ifne            2673
        //  2670: goto            2813
        //  2673: bipush          7
        //  2675: istore_1       
        //  2676: goto            2815
        //  2679: aload           15
        //  2681: ldc_w           "A_MPEG/L3"
        //  2684: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2687: ifne            2693
        //  2690: goto            2813
        //  2693: bipush          6
        //  2695: istore_1       
        //  2696: goto            2815
        //  2699: aload           15
        //  2701: ldc_w           "A_MPEG/L2"
        //  2704: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2707: ifne            2713
        //  2710: goto            2813
        //  2713: iconst_5       
        //  2714: istore_1       
        //  2715: goto            2815
        //  2718: aload           15
        //  2720: ldc_w           "A_VORBIS"
        //  2723: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2726: ifne            2732
        //  2729: goto            2813
        //  2732: iconst_4       
        //  2733: istore_1       
        //  2734: goto            2815
        //  2737: aload           15
        //  2739: ldc_w           "A_TRUEHD"
        //  2742: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2745: ifne            2751
        //  2748: goto            2813
        //  2751: iconst_3       
        //  2752: istore_1       
        //  2753: goto            2815
        //  2756: aload           15
        //  2758: ldc_w           "A_MS/ACM"
        //  2761: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2764: ifne            2770
        //  2767: goto            2813
        //  2770: iconst_2       
        //  2771: istore_1       
        //  2772: goto            2815
        //  2775: aload           15
        //  2777: ldc_w           "V_MPEG4/ISO/SP"
        //  2780: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2783: ifne            2789
        //  2786: goto            2813
        //  2789: iconst_1       
        //  2790: istore_1       
        //  2791: goto            2815
        //  2794: aload           15
        //  2796: ldc_w           "V_MPEG4/ISO/AP"
        //  2799: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2802: ifne            2808
        //  2805: goto            2813
        //  2808: iconst_0       
        //  2809: istore_1       
        //  2810: goto            2815
        //  2813: iconst_m1      
        //  2814: istore_1       
        //  2815: ldc_w           "video/x-unknown"
        //  2818: astore          15
        //  2820: ldc_w           "audio/raw"
        //  2823: astore          17
        //  2825: ldc_w           "audio/x-unknown"
        //  2828: astore          16
        //  2830: iload_1        
        //  2831: tableswitch {
        //                0: 4648
        //                1: 4648
        //                2: 4406
        //                3: 4386
        //                4: 4097
        //                5: 4082
        //                6: 4074
        //                7: 3767
        //                8: 3717
        //                9: 4648
        //               10: 3661
        //               11: 3638
        //               12: 3627
        //               13: 3567
        //               14: 3559
        //               15: 3551
        //               16: 3543
        //               17: 3535
        //               18: 3527
        //               19: 3519
        //               20: 3632
        //               21: 3551
        //               22: 3428
        //               23: 3331
        //               24: 3243
        //               25: 3194
        //               26: 3140
        //               27: 3132
        //               28: 3124
        //               29: 3116
        //               30: 3108
        //               31: 3085
        //               32: 2984
        //          default: 2976
        //        }
        //  2976: ldc_w           "Unrecognized codec identifier."
        //  2979: aconst_null    
        //  2980: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  2983: athrow         
        //  2984: sipush          5760
        //  2987: istore_1       
        //  2988: new             Ljava/util/ArrayList;
        //  2991: dup            
        //  2992: iconst_3       
        //  2993: invokespecial   java/util/ArrayList.<init>:(I)V
        //  2996: astore          16
        //  2998: aload           16
        //  3000: aload           20
        //  3002: aload           20
        //  3004: getfield        wog$b.b:Ljava/lang/String;
        //  3007: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3010: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  3013: pop            
        //  3014: bipush          8
        //  3016: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //  3019: astore          17
        //  3021: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //  3024: astore          15
        //  3026: aload           16
        //  3028: aload           17
        //  3030: aload           15
        //  3032: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //  3035: aload           20
        //  3037: getfield        wog$b.R:J
        //  3040: invokevirtual   java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
        //  3043: invokevirtual   java/nio/ByteBuffer.array:()[B
        //  3046: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  3049: pop            
        //  3050: aload           16
        //  3052: bipush          8
        //  3054: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //  3057: aload           15
        //  3059: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //  3062: aload           20
        //  3064: getfield        wog$b.S:J
        //  3067: invokevirtual   java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
        //  3070: invokevirtual   java/nio/ByteBuffer.array:()[B
        //  3073: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  3076: pop            
        //  3077: ldc_w           "audio/opus"
        //  3080: astore          15
        //  3082: goto            4338
        //  3085: aload           20
        //  3087: aload           20
        //  3089: getfield        wog$b.b:Ljava/lang/String;
        //  3092: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3095: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  3098: astore          15
        //  3100: ldc_w           "audio/flac"
        //  3103: astore          16
        //  3105: goto            3752
        //  3108: ldc_w           "audio/eac3"
        //  3111: astore          15
        //  3113: goto            3632
        //  3116: ldc_w           "video/mpeg2"
        //  3119: astore          15
        //  3121: goto            3632
        //  3124: ldc_w           "application/x-subrip"
        //  3127: astore          15
        //  3129: goto            3632
        //  3132: ldc_w           "text/vtt"
        //  3135: astore          15
        //  3137: goto            3632
        //  3140: new             Lgxj;
        //  3143: dup            
        //  3144: aload           20
        //  3146: aload           20
        //  3148: getfield        wog$b.b:Ljava/lang/String;
        //  3151: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3154: invokespecial   gxj.<init>:([B)V
        //  3157: invokestatic    hkc.a:(Lgxj;)Lhkc;
        //  3160: astore          15
        //  3162: aload           15
        //  3164: getfield        hkc.a:Ljava/util/List;
        //  3167: astore          17
        //  3169: aload           20
        //  3171: aload           15
        //  3173: getfield        hkc.b:I
        //  3176: putfield        wog$b.Y:I
        //  3179: aload           15
        //  3181: getfield        hkc.d:Ljava/lang/String;
        //  3184: astore          15
        //  3186: ldc_w           "video/hevc"
        //  3189: astore          16
        //  3191: goto            3712
        //  3194: getstatic       wog.c0:[B
        //  3197: astore          16
        //  3199: aload           20
        //  3201: aload           20
        //  3203: getfield        wog$b.b:Ljava/lang/String;
        //  3206: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3209: astore          17
        //  3211: getstatic       eed.G0:Leed$b;
        //  3214: astore          15
        //  3216: iconst_2       
        //  3217: anewarray       Ljava/lang/Object;
        //  3220: dup            
        //  3221: iconst_0       
        //  3222: aload           16
        //  3224: aastore        
        //  3225: dup            
        //  3226: iconst_1       
        //  3227: aload           17
        //  3229: aastore        
        //  3230: invokestatic    eed.p:([Ljava/lang/Object;)Leed;
        //  3233: astore          15
        //  3235: ldc_w           "text/x-ssa"
        //  3238: astore          16
        //  3240: goto            3752
        //  3243: aload           20
        //  3245: getfield        wog$b.P:I
        //  3248: invokestatic    rnw.w:(I)I
        //  3251: istore          4
        //  3253: iload           4
        //  3255: istore_1       
        //  3256: iload           4
        //  3258: ifne            3358
        //  3261: aload           20
        //  3263: getfield        wog$b.P:I
        //  3266: istore_1       
        //  3267: new             Ljava/lang/StringBuilder;
        //  3270: dup            
        //  3271: bipush          89
        //  3273: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3276: astore          15
        //  3278: aload           15
        //  3280: ldc_w           "Unsupported little endian PCM bit depth: "
        //  3283: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3286: pop            
        //  3287: aload           15
        //  3289: iload_1        
        //  3290: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3293: pop            
        //  3294: aload           15
        //  3296: ldc_w           ". Setting mimeType to "
        //  3299: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3302: pop            
        //  3303: aload           15
        //  3305: ldc_w           "audio/x-unknown"
        //  3308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3311: pop            
        //  3312: ldc_w           "MatroskaExtractor"
        //  3315: aload           15
        //  3317: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3320: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  3323: pop            
        //  3324: aload           16
        //  3326: astore          15
        //  3328: goto            3632
        //  3331: aload           20
        //  3333: getfield        wog$b.P:I
        //  3336: istore_1       
        //  3337: iload_1        
        //  3338: bipush          8
        //  3340: if_icmpne       3348
        //  3343: iconst_3       
        //  3344: istore_1       
        //  3345: goto            3358
        //  3348: iload_1        
        //  3349: bipush          16
        //  3351: if_icmpne       3364
        //  3354: ldc_w           268435456
        //  3357: istore_1       
        //  3358: iload_1        
        //  3359: istore          4
        //  3361: goto            3443
        //  3364: new             Ljava/lang/StringBuilder;
        //  3367: dup            
        //  3368: bipush          86
        //  3370: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3373: astore          15
        //  3375: aload           15
        //  3377: ldc_w           "Unsupported big endian PCM bit depth: "
        //  3380: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3383: pop            
        //  3384: aload           15
        //  3386: iload_1        
        //  3387: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3390: pop            
        //  3391: aload           15
        //  3393: ldc_w           ". Setting mimeType to "
        //  3396: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3399: pop            
        //  3400: aload           15
        //  3402: ldc_w           "audio/x-unknown"
        //  3405: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3408: pop            
        //  3409: ldc_w           "MatroskaExtractor"
        //  3412: aload           15
        //  3414: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3417: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  3420: pop            
        //  3421: aload           16
        //  3423: astore          15
        //  3425: goto            3632
        //  3428: aload           20
        //  3430: getfield        wog$b.P:I
        //  3433: istore_1       
        //  3434: iload_1        
        //  3435: bipush          32
        //  3437: if_icmpne       3455
        //  3440: iconst_4       
        //  3441: istore          4
        //  3443: iconst_m1      
        //  3444: istore_1       
        //  3445: aconst_null    
        //  3446: astore          16
        //  3448: aload           17
        //  3450: astore          15
        //  3452: goto            4683
        //  3455: new             Ljava/lang/StringBuilder;
        //  3458: dup            
        //  3459: bipush          90
        //  3461: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3464: astore          15
        //  3466: aload           15
        //  3468: ldc_w           "Unsupported floating point PCM bit depth: "
        //  3471: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3474: pop            
        //  3475: aload           15
        //  3477: iload_1        
        //  3478: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3481: pop            
        //  3482: aload           15
        //  3484: ldc_w           ". Setting mimeType to "
        //  3487: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3490: pop            
        //  3491: aload           15
        //  3493: ldc_w           "audio/x-unknown"
        //  3496: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3499: pop            
        //  3500: ldc_w           "MatroskaExtractor"
        //  3503: aload           15
        //  3505: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3508: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  3511: pop            
        //  3512: aload           16
        //  3514: astore          15
        //  3516: goto            3632
        //  3519: ldc_w           "application/pgs"
        //  3522: astore          15
        //  3524: goto            3632
        //  3527: ldc_w           "video/x-vnd.on2.vp9"
        //  3530: astore          15
        //  3532: goto            3632
        //  3535: ldc_w           "video/x-vnd.on2.vp8"
        //  3538: astore          15
        //  3540: goto            3632
        //  3543: ldc_w           "video/av01"
        //  3546: astore          15
        //  3548: goto            3632
        //  3551: ldc_w           "audio/vnd.dts"
        //  3554: astore          15
        //  3556: goto            3632
        //  3559: ldc_w           "audio/ac3"
        //  3562: astore          15
        //  3564: goto            3632
        //  3567: aload           20
        //  3569: aload           20
        //  3571: getfield        wog$b.b:Ljava/lang/String;
        //  3574: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3577: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  3580: astore          17
        //  3582: aload           20
        //  3584: getfield        wog$b.k:[B
        //  3587: invokestatic    y6.c:([B)Ly6$a;
        //  3590: astore          15
        //  3592: aload           20
        //  3594: aload           15
        //  3596: getfield        y6$a.a:I
        //  3599: putfield        wog$b.Q:I
        //  3602: aload           20
        //  3604: aload           15
        //  3606: getfield        y6$a.b:I
        //  3609: putfield        wog$b.O:I
        //  3612: aload           15
        //  3614: getfield        y6$a.c:Ljava/lang/String;
        //  3617: astore          15
        //  3619: ldc_w           "audio/mp4a-latm"
        //  3622: astore          16
        //  3624: goto            3712
        //  3627: ldc_w           "audio/vnd.dts.hd"
        //  3630: astore          15
        //  3632: aconst_null    
        //  3633: astore          16
        //  3635: goto            4059
        //  3638: aload           20
        //  3640: aload           20
        //  3642: getfield        wog$b.b:Ljava/lang/String;
        //  3645: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3648: invokestatic    eed.t:(Ljava/lang/Object;)Leed;
        //  3651: astore          15
        //  3653: ldc_w           "application/vobsub"
        //  3656: astore          16
        //  3658: goto            3752
        //  3661: new             Lgxj;
        //  3664: dup            
        //  3665: aload           20
        //  3667: aload           20
        //  3669: getfield        wog$b.b:Ljava/lang/String;
        //  3672: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3675: invokespecial   gxj.<init>:([B)V
        //  3678: invokestatic    ee1.b:(Lgxj;)Lee1;
        //  3681: astore          15
        //  3683: aload           15
        //  3685: getfield        ee1.a:Ljava/util/List;
        //  3688: astore          17
        //  3690: aload           20
        //  3692: aload           15
        //  3694: getfield        ee1.b:I
        //  3697: putfield        wog$b.Y:I
        //  3700: aload           15
        //  3702: getfield        ee1.f:Ljava/lang/String;
        //  3705: astore          15
        //  3707: ldc_w           "video/avc"
        //  3710: astore          16
        //  3712: iconst_m1      
        //  3713: istore_1       
        //  3714: goto            4606
        //  3717: iconst_4       
        //  3718: newarray        B
        //  3720: astore          15
        //  3722: aload           20
        //  3724: aload           20
        //  3726: getfield        wog$b.b:Ljava/lang/String;
        //  3729: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3732: iconst_0       
        //  3733: aload           15
        //  3735: iconst_0       
        //  3736: iconst_4       
        //  3737: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  3740: aload           15
        //  3742: invokestatic    eed.t:(Ljava/lang/Object;)Leed;
        //  3745: astore          15
        //  3747: ldc_w           "application/dvbsubs"
        //  3750: astore          16
        //  3752: aload           16
        //  3754: astore          17
        //  3756: aload           15
        //  3758: astore          16
        //  3760: aload           17
        //  3762: astore          15
        //  3764: goto            4059
        //  3767: aload           20
        //  3769: aload           20
        //  3771: getfield        wog$b.b:Ljava/lang/String;
        //  3774: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  3777: astore          15
        //  3779: bipush          16
        //  3781: aload           15
        //  3783: arraylength    
        //  3784: if_icmpgt       3793
        //  3787: iconst_1       
        //  3788: istore          10
        //  3790: goto            3796
        //  3793: iconst_0       
        //  3794: istore          10
        //  3796: iload           10
        //  3798: invokestatic    omi.m:(Z)V
        //  3801: aload           15
        //  3803: bipush          16
        //  3805: baload         
        //  3806: i2l            
        //  3807: lstore          11
        //  3809: aload           15
        //  3811: bipush          17
        //  3813: baload         
        //  3814: i2l            
        //  3815: ldc2_w          255
        //  3818: land           
        //  3819: bipush          8
        //  3821: lshl           
        //  3822: lload           11
        //  3824: ldc2_w          255
        //  3827: land           
        //  3828: lor            
        //  3829: aload           15
        //  3831: bipush          18
        //  3833: baload         
        //  3834: i2l            
        //  3835: ldc2_w          255
        //  3838: land           
        //  3839: bipush          16
        //  3841: lshl           
        //  3842: lor            
        //  3843: aload           15
        //  3845: bipush          19
        //  3847: baload         
        //  3848: i2l            
        //  3849: ldc2_w          255
        //  3852: land           
        //  3853: bipush          24
        //  3855: lshl           
        //  3856: lor            
        //  3857: lstore          11
        //  3859: lload           11
        //  3861: ldc2_w          1482049860
        //  3864: lcmp           
        //  3865: ifne            3884
        //  3868: new             Landroid/util/Pair;
        //  3871: dup            
        //  3872: ldc_w           "video/divx"
        //  3875: aconst_null    
        //  3876: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3879: astore          15
        //  3881: goto            4031
        //  3884: lload           11
        //  3886: ldc2_w          859189832
        //  3889: lcmp           
        //  3890: ifne            3909
        //  3893: new             Landroid/util/Pair;
        //  3896: dup            
        //  3897: ldc_w           "video/3gpp"
        //  3900: aconst_null    
        //  3901: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3904: astore          15
        //  3906: goto            4031
        //  3909: lload           11
        //  3911: ldc2_w          826496599
        //  3914: lcmp           
        //  3915: ifne            4008
        //  3918: bipush          40
        //  3920: istore_1       
        //  3921: iload_1        
        //  3922: aload           15
        //  3924: arraylength    
        //  3925: iconst_4       
        //  3926: isub           
        //  3927: if_icmpge       4000
        //  3930: aload           15
        //  3932: iload_1        
        //  3933: baload         
        //  3934: ifne            3994
        //  3937: aload           15
        //  3939: iload_1        
        //  3940: iconst_1       
        //  3941: iadd           
        //  3942: baload         
        //  3943: ifne            3994
        //  3946: aload           15
        //  3948: iload_1        
        //  3949: iconst_2       
        //  3950: iadd           
        //  3951: baload         
        //  3952: iconst_1       
        //  3953: if_icmpne       3994
        //  3956: aload           15
        //  3958: iload_1        
        //  3959: iconst_3       
        //  3960: iadd           
        //  3961: baload         
        //  3962: bipush          15
        //  3964: if_icmpne       3994
        //  3967: new             Landroid/util/Pair;
        //  3970: dup            
        //  3971: ldc_w           "video/wvc1"
        //  3974: aload           15
        //  3976: iload_1        
        //  3977: aload           15
        //  3979: arraylength    
        //  3980: invokestatic    java/util/Arrays.copyOfRange:([BII)[B
        //  3983: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  3986: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3989: astore          15
        //  3991: goto            4031
        //  3994: iinc            1, 1
        //  3997: goto            3921
        //  4000: ldc_w           "Failed to find FourCC VC1 initialization data"
        //  4003: aconst_null    
        //  4004: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4007: athrow         
        //  4008: ldc_w           "MatroskaExtractor"
        //  4011: ldc_w           "Unknown FourCC. Setting mimeType to video/x-unknown"
        //  4014: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  4017: pop            
        //  4018: new             Landroid/util/Pair;
        //  4021: dup            
        //  4022: ldc_w           "video/x-unknown"
        //  4025: aconst_null    
        //  4026: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  4029: astore          15
        //  4031: aload           15
        //  4033: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  4036: checkcast       Ljava/lang/String;
        //  4039: astore          16
        //  4041: aload           15
        //  4043: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  4046: checkcast       Ljava/util/List;
        //  4049: astore          17
        //  4051: aload           16
        //  4053: astore          15
        //  4055: aload           17
        //  4057: astore          16
        //  4059: iconst_m1      
        //  4060: istore_1       
        //  4061: goto            4094
        //  4064: astore          15
        //  4066: ldc_w           "Error parsing FourCC private data"
        //  4069: aconst_null    
        //  4070: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4073: athrow         
        //  4074: ldc_w           "audio/mpeg"
        //  4077: astore          15
        //  4079: goto            4087
        //  4082: ldc_w           "audio/mpeg-L2"
        //  4085: astore          15
        //  4087: sipush          4096
        //  4090: istore_1       
        //  4091: aconst_null    
        //  4092: astore          16
        //  4094: goto            4680
        //  4097: sipush          8192
        //  4100: istore          5
        //  4102: aload           20
        //  4104: aload           20
        //  4106: getfield        wog$b.b:Ljava/lang/String;
        //  4109: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  4112: astore          16
        //  4114: aload           16
        //  4116: iconst_0       
        //  4117: baload         
        //  4118: iconst_2       
        //  4119: if_icmpne       4370
        //  4122: iconst_1       
        //  4123: istore_1       
        //  4124: iconst_0       
        //  4125: istore          4
        //  4127: aload           16
        //  4129: iload_1        
        //  4130: baload         
        //  4131: sipush          255
        //  4134: iand           
        //  4135: sipush          255
        //  4138: if_icmpne       4153
        //  4141: iinc_w          4, 255
        //  4147: iinc            1, 1
        //  4150: goto            4127
        //  4153: iload_1        
        //  4154: iconst_1       
        //  4155: iadd           
        //  4156: istore          7
        //  4158: iload           4
        //  4160: aload           16
        //  4162: iload_1        
        //  4163: baload         
        //  4164: sipush          255
        //  4167: iand           
        //  4168: iadd           
        //  4169: istore          9
        //  4171: iconst_0       
        //  4172: istore_1       
        //  4173: iload           7
        //  4175: istore          4
        //  4177: aload           16
        //  4179: iload           4
        //  4181: baload         
        //  4182: sipush          255
        //  4185: iand           
        //  4186: sipush          255
        //  4189: if_icmpne       4204
        //  4192: iinc_w          1, 255
        //  4198: iinc            4, 1
        //  4201: goto            4177
        //  4204: iload           4
        //  4206: iconst_1       
        //  4207: iadd           
        //  4208: istore          7
        //  4210: aload           16
        //  4212: iload           4
        //  4214: baload         
        //  4215: istore          4
        //  4217: aload           16
        //  4219: iload           7
        //  4221: baload         
        //  4222: iconst_1       
        //  4223: if_icmpne       4357
        //  4226: iload           9
        //  4228: newarray        B
        //  4230: astore          15
        //  4232: aload           16
        //  4234: iload           7
        //  4236: aload           15
        //  4238: iconst_0       
        //  4239: iload           9
        //  4241: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  4244: iload           7
        //  4246: iload           9
        //  4248: iadd           
        //  4249: istore          7
        //  4251: aload           16
        //  4253: iload           7
        //  4255: baload         
        //  4256: iconst_3       
        //  4257: if_icmpne       4349
        //  4260: iload           7
        //  4262: iload_1        
        //  4263: iload           4
        //  4265: sipush          255
        //  4268: iand           
        //  4269: iadd           
        //  4270: iadd           
        //  4271: istore_1       
        //  4272: aload           16
        //  4274: iload_1        
        //  4275: baload         
        //  4276: iconst_5       
        //  4277: if_icmpne       4341
        //  4280: aload           16
        //  4282: arraylength    
        //  4283: iload_1        
        //  4284: isub           
        //  4285: newarray        B
        //  4287: astore          17
        //  4289: aload           16
        //  4291: iload_1        
        //  4292: aload           17
        //  4294: iconst_0       
        //  4295: aload           16
        //  4297: arraylength    
        //  4298: iload_1        
        //  4299: isub           
        //  4300: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  4303: new             Ljava/util/ArrayList;
        //  4306: astore          16
        //  4308: aload           16
        //  4310: iconst_2       
        //  4311: invokespecial   java/util/ArrayList.<init>:(I)V
        //  4314: aload           16
        //  4316: aload           15
        //  4318: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  4321: pop            
        //  4322: aload           16
        //  4324: aload           17
        //  4326: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  4329: pop            
        //  4330: ldc_w           "audio/vorbis"
        //  4333: astore          15
        //  4335: iload           5
        //  4337: istore_1       
        //  4338: goto            4680
        //  4341: ldc_w           "Error parsing vorbis codec private"
        //  4344: aconst_null    
        //  4345: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4348: athrow         
        //  4349: ldc_w           "Error parsing vorbis codec private"
        //  4352: aconst_null    
        //  4353: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4356: athrow         
        //  4357: ldc_w           "Error parsing vorbis codec private"
        //  4360: aconst_null    
        //  4361: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4364: athrow         
        //  4365: astore          15
        //  4367: goto            4378
        //  4370: ldc_w           "Error parsing vorbis codec private"
        //  4373: aconst_null    
        //  4374: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4377: athrow         
        //  4378: ldc_w           "Error parsing vorbis codec private"
        //  4381: aconst_null    
        //  4382: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4385: athrow         
        //  4386: aload           20
        //  4388: new             Lt4u;
        //  4391: dup            
        //  4392: invokespecial   t4u.<init>:()V
        //  4395: putfield        wog$b.T:Lt4u;
        //  4398: ldc_w           "audio/true-hd"
        //  4401: astore          15
        //  4403: goto            4632
        //  4406: new             Lgxj;
        //  4409: dup            
        //  4410: aload           20
        //  4412: aload           20
        //  4414: getfield        wog$b.b:Ljava/lang/String;
        //  4417: invokevirtual   wog$b.b:(Ljava/lang/String;)[B
        //  4420: invokespecial   gxj.<init>:([B)V
        //  4423: astore          18
        //  4425: aload           18
        //  4427: invokevirtual   gxj.l:()I
        //  4430: istore_1       
        //  4431: iload_1        
        //  4432: iconst_1       
        //  4433: if_icmpne       4439
        //  4436: goto            4498
        //  4439: iload_1        
        //  4440: ldc_w           65534
        //  4443: if_icmpne       4503
        //  4446: aload           18
        //  4448: bipush          24
        //  4450: invokevirtual   gxj.D:(I)V
        //  4453: aload           18
        //  4455: invokevirtual   gxj.m:()J
        //  4458: lstore          11
        //  4460: getstatic       wog.f0:Ljava/util/UUID;
        //  4463: astore          15
        //  4465: lload           11
        //  4467: aload           15
        //  4469: invokevirtual   java/util/UUID.getMostSignificantBits:()J
        //  4472: lcmp           
        //  4473: ifne            4503
        //  4476: aload           18
        //  4478: invokevirtual   gxj.m:()J
        //  4481: lstore          13
        //  4483: aload           15
        //  4485: invokevirtual   java/util/UUID.getLeastSignificantBits:()J
        //  4488: lstore          11
        //  4490: lload           13
        //  4492: lload           11
        //  4494: lcmp           
        //  4495: ifne            4503
        //  4498: iconst_1       
        //  4499: istore_1       
        //  4500: goto            4505
        //  4503: iconst_0       
        //  4504: istore_1       
        //  4505: iload_1        
        //  4506: ifeq            4612
        //  4509: aload           20
        //  4511: getfield        wog$b.P:I
        //  4514: invokestatic    rnw.w:(I)I
        //  4517: istore_1       
        //  4518: iload_1        
        //  4519: ifne            4592
        //  4522: aload           20
        //  4524: getfield        wog$b.P:I
        //  4527: istore_1       
        //  4528: new             Ljava/lang/StringBuilder;
        //  4531: dup            
        //  4532: bipush          75
        //  4534: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  4537: astore          15
        //  4539: aload           15
        //  4541: ldc_w           "Unsupported PCM bit depth: "
        //  4544: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4547: pop            
        //  4548: aload           15
        //  4550: iload_1        
        //  4551: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  4554: pop            
        //  4555: aload           15
        //  4557: ldc_w           ". Setting mimeType to "
        //  4560: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4563: pop            
        //  4564: aload           15
        //  4566: ldc_w           "audio/x-unknown"
        //  4569: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4572: pop            
        //  4573: ldc_w           "MatroskaExtractor"
        //  4576: aload           15
        //  4578: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  4581: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  4584: pop            
        //  4585: aload           16
        //  4587: astore          15
        //  4589: goto            4632
        //  4592: aconst_null    
        //  4593: astore          15
        //  4595: aconst_null    
        //  4596: astore          18
        //  4598: aload           17
        //  4600: astore          16
        //  4602: aload           18
        //  4604: astore          17
        //  4606: iconst_m1      
        //  4607: istore          4
        //  4609: goto            4708
        //  4612: ldc_w           "MatroskaExtractor"
        //  4615: ldc_w           "Non-PCM MS/ACM is unsupported. Setting mimeType to "
        //  4618: ldc_w           "audio/x-unknown"
        //  4621: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  4624: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  4627: pop            
        //  4628: aload           16
        //  4630: astore          15
        //  4632: aconst_null    
        //  4633: astore          16
        //  4635: goto            4678
        //  4638: astore          15
        //  4640: ldc_w           "Error parsing MS/ACM codec private"
        //  4643: aconst_null    
        //  4644: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4647: athrow         
        //  4648: aload           20
        //  4650: getfield        wog$b.k:[B
        //  4653: astore          15
        //  4655: aload           15
        //  4657: ifnonnull       4666
        //  4660: aconst_null    
        //  4661: astore          16
        //  4663: goto            4673
        //  4666: aload           15
        //  4668: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  4671: astore          16
        //  4673: ldc_w           "video/mp4v-es"
        //  4676: astore          15
        //  4678: iconst_m1      
        //  4679: istore_1       
        //  4680: iconst_m1      
        //  4681: istore          4
        //  4683: aload           16
        //  4685: astore          17
        //  4687: aconst_null    
        //  4688: astore          18
        //  4690: iload_1        
        //  4691: istore          5
        //  4693: iload           4
        //  4695: istore_1       
        //  4696: aload           15
        //  4698: astore          16
        //  4700: aload           18
        //  4702: astore          15
        //  4704: iload           5
        //  4706: istore          4
        //  4708: aload           20
        //  4710: getfield        wog$b.N:[B
        //  4713: astore          22
        //  4715: aload           15
        //  4717: astore          19
        //  4719: aload           16
        //  4721: astore          18
        //  4723: aload           22
        //  4725: ifnull          4770
        //  4728: new             Lgxj;
        //  4731: dup            
        //  4732: aload           22
        //  4734: invokespecial   gxj.<init>:([B)V
        //  4737: invokestatic    p79.b:(Lgxj;)Lp79;
        //  4740: astore          22
        //  4742: aload           15
        //  4744: astore          19
        //  4746: aload           16
        //  4748: astore          18
        //  4750: aload           22
        //  4752: ifnull          4770
        //  4755: aload           22
        //  4757: getfield        p79.c:Ljava/lang/Object;
        //  4760: checkcast       Ljava/lang/String;
        //  4763: astore          19
        //  4765: ldc_w           "video/dolby-vision"
        //  4768: astore          18
        //  4770: aload           20
        //  4772: getfield        wog$b.V:Z
        //  4775: istore          10
        //  4777: aload           20
        //  4779: getfield        wog$b.U:Z
        //  4782: ifeq            4791
        //  4785: iconst_2       
        //  4786: istore          5
        //  4788: goto            4794
        //  4791: iconst_0       
        //  4792: istore          5
        //  4794: new             Lcom/google/android/exoplayer2/n$a;
        //  4797: dup            
        //  4798: invokespecial   com/google/android/exoplayer2/n$a.<init>:()V
        //  4801: astore          16
        //  4803: aload           18
        //  4805: invokestatic    rbh.i:(Ljava/lang/String;)Z
        //  4808: ifeq            4842
        //  4811: aload           16
        //  4813: aload           20
        //  4815: getfield        wog$b.O:I
        //  4818: putfield        com/google/android/exoplayer2/n$a.x:I
        //  4821: aload           16
        //  4823: aload           20
        //  4825: getfield        wog$b.Q:I
        //  4828: putfield        com/google/android/exoplayer2/n$a.y:I
        //  4831: aload           16
        //  4833: iload_1        
        //  4834: putfield        com/google/android/exoplayer2/n$a.z:I
        //  4837: iconst_1       
        //  4838: istore_1       
        //  4839: goto            5714
        //  4842: aload           18
        //  4844: invokestatic    rbh.k:(Ljava/lang/String;)Z
        //  4847: ifeq            5635
        //  4850: aload           20
        //  4852: getfield        wog$b.q:I
        //  4855: ifne            4917
        //  4858: aload           20
        //  4860: getfield        wog$b.o:I
        //  4863: istore          7
        //  4865: iload           7
        //  4867: istore_1       
        //  4868: iload           7
        //  4870: iconst_m1      
        //  4871: if_icmpne       4880
        //  4874: aload           20
        //  4876: getfield        wog$b.m:I
        //  4879: istore_1       
        //  4880: aload           20
        //  4882: iload_1        
        //  4883: putfield        wog$b.o:I
        //  4886: aload           20
        //  4888: getfield        wog$b.p:I
        //  4891: istore          7
        //  4893: iload           7
        //  4895: istore_1       
        //  4896: iload           7
        //  4898: iconst_m1      
        //  4899: if_icmpne       4908
        //  4902: aload           20
        //  4904: getfield        wog$b.n:I
        //  4907: istore_1       
        //  4908: aload           20
        //  4910: iload_1        
        //  4911: putfield        wog$b.p:I
        //  4914: goto            4917
        //  4917: ldc_w           -1.0
        //  4920: fstore_3       
        //  4921: aload           20
        //  4923: getfield        wog$b.o:I
        //  4926: istore          7
        //  4928: fload_3        
        //  4929: fstore_2       
        //  4930: iload           7
        //  4932: iconst_m1      
        //  4933: if_icmpeq       4968
        //  4936: aload           20
        //  4938: getfield        wog$b.p:I
        //  4941: istore_1       
        //  4942: fload_3        
        //  4943: fstore_2       
        //  4944: iload_1        
        //  4945: iconst_m1      
        //  4946: if_icmpeq       4968
        //  4949: aload           20
        //  4951: getfield        wog$b.n:I
        //  4954: iload           7
        //  4956: imul           
        //  4957: i2f            
        //  4958: aload           20
        //  4960: getfield        wog$b.m:I
        //  4963: iload_1        
        //  4964: imul           
        //  4965: i2f            
        //  4966: fdiv           
        //  4967: fstore_2       
        //  4968: aload           20
        //  4970: getfield        wog$b.x:Z
        //  4973: ifeq            5386
        //  4976: aload           20
        //  4978: getfield        wog$b.D:F
        //  4981: ldc_w           -1.0
        //  4984: fcmpl          
        //  4985: ifeq            5354
        //  4988: aload           20
        //  4990: getfield        wog$b.E:F
        //  4993: ldc_w           -1.0
        //  4996: fcmpl          
        //  4997: ifeq            5354
        //  5000: aload           20
        //  5002: getfield        wog$b.F:F
        //  5005: ldc_w           -1.0
        //  5008: fcmpl          
        //  5009: ifeq            5354
        //  5012: aload           20
        //  5014: getfield        wog$b.G:F
        //  5017: ldc_w           -1.0
        //  5020: fcmpl          
        //  5021: ifeq            5354
        //  5024: aload           20
        //  5026: getfield        wog$b.H:F
        //  5029: ldc_w           -1.0
        //  5032: fcmpl          
        //  5033: ifeq            5354
        //  5036: aload           20
        //  5038: getfield        wog$b.I:F
        //  5041: ldc_w           -1.0
        //  5044: fcmpl          
        //  5045: ifeq            5354
        //  5048: aload           20
        //  5050: getfield        wog$b.J:F
        //  5053: ldc_w           -1.0
        //  5056: fcmpl          
        //  5057: ifeq            5354
        //  5060: aload           20
        //  5062: getfield        wog$b.K:F
        //  5065: ldc_w           -1.0
        //  5068: fcmpl          
        //  5069: ifeq            5354
        //  5072: aload           20
        //  5074: getfield        wog$b.L:F
        //  5077: ldc_w           -1.0
        //  5080: fcmpl          
        //  5081: ifeq            5354
        //  5084: aload           20
        //  5086: getfield        wog$b.M:F
        //  5089: ldc_w           -1.0
        //  5092: fcmpl          
        //  5093: ifne            5099
        //  5096: goto            5354
        //  5099: bipush          25
        //  5101: newarray        B
        //  5103: astore          15
        //  5105: aload           15
        //  5107: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  5110: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //  5113: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //  5116: astore          22
        //  5118: aload           22
        //  5120: iconst_0       
        //  5121: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //  5124: pop            
        //  5125: aload           22
        //  5127: aload           20
        //  5129: getfield        wog$b.D:F
        //  5132: ldc_w           50000.0
        //  5135: fmul           
        //  5136: ldc_w           0.5
        //  5139: fadd           
        //  5140: f2i            
        //  5141: i2s            
        //  5142: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5145: pop            
        //  5146: aload           22
        //  5148: aload           20
        //  5150: getfield        wog$b.E:F
        //  5153: ldc_w           50000.0
        //  5156: fmul           
        //  5157: ldc_w           0.5
        //  5160: fadd           
        //  5161: f2i            
        //  5162: i2s            
        //  5163: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5166: pop            
        //  5167: aload           22
        //  5169: aload           20
        //  5171: getfield        wog$b.F:F
        //  5174: ldc_w           50000.0
        //  5177: fmul           
        //  5178: ldc_w           0.5
        //  5181: fadd           
        //  5182: f2i            
        //  5183: i2s            
        //  5184: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5187: pop            
        //  5188: aload           22
        //  5190: aload           20
        //  5192: getfield        wog$b.G:F
        //  5195: ldc_w           50000.0
        //  5198: fmul           
        //  5199: ldc_w           0.5
        //  5202: fadd           
        //  5203: f2i            
        //  5204: i2s            
        //  5205: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5208: pop            
        //  5209: aload           22
        //  5211: aload           20
        //  5213: getfield        wog$b.H:F
        //  5216: ldc_w           50000.0
        //  5219: fmul           
        //  5220: ldc_w           0.5
        //  5223: fadd           
        //  5224: f2i            
        //  5225: i2s            
        //  5226: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5229: pop            
        //  5230: aload           22
        //  5232: aload           20
        //  5234: getfield        wog$b.I:F
        //  5237: ldc_w           50000.0
        //  5240: fmul           
        //  5241: ldc_w           0.5
        //  5244: fadd           
        //  5245: f2i            
        //  5246: i2s            
        //  5247: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5250: pop            
        //  5251: aload           22
        //  5253: aload           20
        //  5255: getfield        wog$b.J:F
        //  5258: ldc_w           50000.0
        //  5261: fmul           
        //  5262: ldc_w           0.5
        //  5265: fadd           
        //  5266: f2i            
        //  5267: i2s            
        //  5268: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5271: pop            
        //  5272: aload           22
        //  5274: aload           20
        //  5276: getfield        wog$b.K:F
        //  5279: ldc_w           50000.0
        //  5282: fmul           
        //  5283: ldc_w           0.5
        //  5286: fadd           
        //  5287: f2i            
        //  5288: i2s            
        //  5289: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5292: pop            
        //  5293: aload           22
        //  5295: aload           20
        //  5297: getfield        wog$b.L:F
        //  5300: ldc_w           0.5
        //  5303: fadd           
        //  5304: f2i            
        //  5305: i2s            
        //  5306: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5309: pop            
        //  5310: aload           22
        //  5312: aload           20
        //  5314: getfield        wog$b.M:F
        //  5317: ldc_w           0.5
        //  5320: fadd           
        //  5321: f2i            
        //  5322: i2s            
        //  5323: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5326: pop            
        //  5327: aload           22
        //  5329: aload           20
        //  5331: getfield        wog$b.B:I
        //  5334: i2s            
        //  5335: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5338: pop            
        //  5339: aload           22
        //  5341: aload           20
        //  5343: getfield        wog$b.C:I
        //  5346: i2s            
        //  5347: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5350: pop            
        //  5351: goto            5357
        //  5354: aconst_null    
        //  5355: astore          15
        //  5357: new             Lwr4;
        //  5360: dup            
        //  5361: aload           20
        //  5363: getfield        wog$b.y:I
        //  5366: aload           20
        //  5368: getfield        wog$b.A:I
        //  5371: aload           20
        //  5373: getfield        wog$b.z:I
        //  5376: aload           15
        //  5378: invokespecial   wr4.<init>:(III[B)V
        //  5381: astore          15
        //  5383: goto            5389
        //  5386: aconst_null    
        //  5387: astore          15
        //  5389: aload           20
        //  5391: getfield        wog$b.a:Ljava/lang/String;
        //  5394: astore          22
        //  5396: aload           22
        //  5398: ifnull          5440
        //  5401: getstatic       wog.g0:Ljava/util/Map;
        //  5404: astore          23
        //  5406: aload           23
        //  5408: aload           22
        //  5410: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //  5415: ifeq            5440
        //  5418: aload           23
        //  5420: aload           20
        //  5422: getfield        wog$b.a:Ljava/lang/String;
        //  5425: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  5430: checkcast       Ljava/lang/Integer;
        //  5433: invokevirtual   java/lang/Integer.intValue:()I
        //  5436: istore_1       
        //  5437: goto            5442
        //  5440: iconst_m1      
        //  5441: istore_1       
        //  5442: aload           20
        //  5444: getfield        wog$b.r:I
        //  5447: ifne            5570
        //  5450: aload           20
        //  5452: getfield        wog$b.s:F
        //  5455: fconst_0       
        //  5456: invokestatic    java/lang/Float.compare:(FF)I
        //  5459: ifne            5570
        //  5462: aload           20
        //  5464: getfield        wog$b.t:F
        //  5467: fconst_0       
        //  5468: invokestatic    java/lang/Float.compare:(FF)I
        //  5471: ifne            5570
        //  5474: aload           20
        //  5476: getfield        wog$b.u:F
        //  5479: fconst_0       
        //  5480: invokestatic    java/lang/Float.compare:(FF)I
        //  5483: ifne            5491
        //  5486: iconst_0       
        //  5487: istore_1       
        //  5488: goto            5570
        //  5491: aload           20
        //  5493: getfield        wog$b.t:F
        //  5496: ldc_w           90.0
        //  5499: invokestatic    java/lang/Float.compare:(FF)I
        //  5502: ifne            5511
        //  5505: bipush          90
        //  5507: istore_1       
        //  5508: goto            5570
        //  5511: aload           20
        //  5513: getfield        wog$b.t:F
        //  5516: ldc_w           -180.0
        //  5519: invokestatic    java/lang/Float.compare:(FF)I
        //  5522: ifeq            5563
        //  5525: aload           20
        //  5527: getfield        wog$b.t:F
        //  5530: ldc_w           180.0
        //  5533: invokestatic    java/lang/Float.compare:(FF)I
        //  5536: ifne            5542
        //  5539: goto            5563
        //  5542: aload           20
        //  5544: getfield        wog$b.t:F
        //  5547: ldc_w           -90.0
        //  5550: invokestatic    java/lang/Float.compare:(FF)I
        //  5553: ifne            5570
        //  5556: sipush          270
        //  5559: istore_1       
        //  5560: goto            5570
        //  5563: sipush          180
        //  5566: istore_1       
        //  5567: goto            5570
        //  5570: aload           16
        //  5572: aload           20
        //  5574: getfield        wog$b.m:I
        //  5577: putfield        com/google/android/exoplayer2/n$a.p:I
        //  5580: aload           16
        //  5582: aload           20
        //  5584: getfield        wog$b.n:I
        //  5587: putfield        com/google/android/exoplayer2/n$a.q:I
        //  5590: aload           16
        //  5592: fload_2        
        //  5593: putfield        com/google/android/exoplayer2/n$a.t:F
        //  5596: aload           16
        //  5598: iload_1        
        //  5599: putfield        com/google/android/exoplayer2/n$a.s:I
        //  5602: aload           16
        //  5604: aload           20
        //  5606: getfield        wog$b.v:[B
        //  5609: putfield        com/google/android/exoplayer2/n$a.u:[B
        //  5612: aload           16
        //  5614: aload           20
        //  5616: getfield        wog$b.w:I
        //  5619: putfield        com/google/android/exoplayer2/n$a.v:I
        //  5622: aload           16
        //  5624: aload           15
        //  5626: putfield        com/google/android/exoplayer2/n$a.w:Lwr4;
        //  5629: iload           6
        //  5631: istore_1       
        //  5632: goto            5714
        //  5635: ldc_w           "application/x-subrip"
        //  5638: aload           18
        //  5640: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5643: ifne            5712
        //  5646: ldc_w           "text/x-ssa"
        //  5649: aload           18
        //  5651: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5654: ifne            5712
        //  5657: ldc_w           "text/vtt"
        //  5660: aload           18
        //  5662: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5665: ifne            5712
        //  5668: ldc_w           "application/vobsub"
        //  5671: aload           18
        //  5673: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5676: ifne            5712
        //  5679: ldc_w           "application/pgs"
        //  5682: aload           18
        //  5684: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5687: ifne            5712
        //  5690: ldc_w           "application/dvbsubs"
        //  5693: aload           18
        //  5695: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5698: ifeq            5704
        //  5701: goto            5712
        //  5704: ldc_w           "Unexpected MIME type."
        //  5707: aconst_null    
        //  5708: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  5711: athrow         
        //  5712: iconst_3       
        //  5713: istore_1       
        //  5714: aload           20
        //  5716: getfield        wog$b.a:Ljava/lang/String;
        //  5719: astore          15
        //  5721: aload           15
        //  5723: ifnull          5749
        //  5726: getstatic       wog.g0:Ljava/util/Map;
        //  5729: aload           15
        //  5731: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //  5736: ifne            5749
        //  5739: aload           16
        //  5741: aload           20
        //  5743: getfield        wog$b.a:Ljava/lang/String;
        //  5746: putfield        com/google/android/exoplayer2/n$a.b:Ljava/lang/String;
        //  5749: aload           16
        //  5751: iload           8
        //  5753: invokevirtual   com/google/android/exoplayer2/n$a.b:(I)Lcom/google/android/exoplayer2/n$a;
        //  5756: pop            
        //  5757: aload           16
        //  5759: aload           18
        //  5761: putfield        com/google/android/exoplayer2/n$a.k:Ljava/lang/String;
        //  5764: aload           16
        //  5766: iload           4
        //  5768: putfield        com/google/android/exoplayer2/n$a.l:I
        //  5771: aload           16
        //  5773: aload           20
        //  5775: getfield        wog$b.W:Ljava/lang/String;
        //  5778: putfield        com/google/android/exoplayer2/n$a.c:Ljava/lang/String;
        //  5781: aload           16
        //  5783: iload           10
        //  5785: iconst_0       
        //  5786: ior            
        //  5787: iload           5
        //  5789: ior            
        //  5790: putfield        com/google/android/exoplayer2/n$a.d:I
        //  5793: aload           16
        //  5795: aload           17
        //  5797: putfield        com/google/android/exoplayer2/n$a.m:Ljava/util/List;
        //  5800: aload           16
        //  5802: aload           19
        //  5804: putfield        com/google/android/exoplayer2/n$a.h:Ljava/lang/String;
        //  5807: aload           16
        //  5809: aload           20
        //  5811: getfield        wog$b.l:Lcom/google/android/exoplayer2/drm/b;
        //  5814: putfield        com/google/android/exoplayer2/n$a.n:Lcom/google/android/exoplayer2/drm/b;
        //  5817: aload           16
        //  5819: invokevirtual   com/google/android/exoplayer2/n$a.a:()Lcom/google/android/exoplayer2/n;
        //  5822: astore          15
        //  5824: aload           21
        //  5826: aload           20
        //  5828: getfield        wog$b.c:I
        //  5831: iload_1        
        //  5832: invokeinterface voa.r:(II)Lvwt;
        //  5837: astore          16
        //  5839: aload           20
        //  5841: aload           16
        //  5843: putfield        wog$b.X:Lvwt;
        //  5846: aload           16
        //  5848: aload           15
        //  5850: invokeinterface vwt.e:(Lcom/google/android/exoplayer2/n;)V
        //  5855: aload_0        
        //  5856: getfield        wog.c:Landroid/util/SparseArray;
        //  5859: aload           20
        //  5861: getfield        wog$b.c:I
        //  5864: aload           20
        //  5866: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //  5869: aload_0        
        //  5870: aconst_null    
        //  5871: putfield        wog.u:Lwog$b;
        //  5874: goto            6051
        //  5877: ldc_w           "CodecId is missing in TrackEntry element"
        //  5880: aconst_null    
        //  5881: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  5884: athrow         
        //  5885: aload_0        
        //  5886: getfield        wog.G:I
        //  5889: iconst_2       
        //  5890: if_icmpeq       5894
        //  5893: return         
        //  5894: iconst_0       
        //  5895: istore          4
        //  5897: iconst_0       
        //  5898: istore_1       
        //  5899: iload           4
        //  5901: aload_0        
        //  5902: getfield        wog.K:I
        //  5905: if_icmpge       5924
        //  5908: iload_1        
        //  5909: aload_0        
        //  5910: getfield        wog.L:[I
        //  5913: iload           4
        //  5915: iaload         
        //  5916: iadd           
        //  5917: istore_1       
        //  5918: iinc            4, 1
        //  5921: goto            5899
        //  5924: aload_0        
        //  5925: getfield        wog.c:Landroid/util/SparseArray;
        //  5928: aload_0        
        //  5929: getfield        wog.M:I
        //  5932: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
        //  5935: checkcast       Lwog$b;
        //  5938: astore          15
        //  5940: aload           15
        //  5942: invokestatic    wog$b.a:(Lwog$b;)V
        //  5945: iconst_0       
        //  5946: istore          4
        //  5948: iload           4
        //  5950: aload_0        
        //  5951: getfield        wog.K:I
        //  5954: if_icmpge       6046
        //  5957: aload_0        
        //  5958: getfield        wog.H:J
        //  5961: lstore          11
        //  5963: aload           15
        //  5965: getfield        wog$b.e:I
        //  5968: iload           4
        //  5970: imul           
        //  5971: sipush          1000
        //  5974: idiv           
        //  5975: i2l            
        //  5976: lstore          13
        //  5978: aload_0        
        //  5979: getfield        wog.O:I
        //  5982: istore          6
        //  5984: iload           6
        //  5986: istore          5
        //  5988: iload           4
        //  5990: ifne            6010
        //  5993: iload           6
        //  5995: istore          5
        //  5997: aload_0        
        //  5998: getfield        wog.Q:Z
        //  6001: ifne            6010
        //  6004: iload           6
        //  6006: iconst_1       
        //  6007: ior            
        //  6008: istore          5
        //  6010: aload_0        
        //  6011: getfield        wog.L:[I
        //  6014: iload           4
        //  6016: iaload         
        //  6017: istore          6
        //  6019: iload_1        
        //  6020: iload           6
        //  6022: isub           
        //  6023: istore_1       
        //  6024: aload_0        
        //  6025: aload           15
        //  6027: lload           11
        //  6029: lload           13
        //  6031: ladd           
        //  6032: iload           5
        //  6034: iload           6
        //  6036: iload_1        
        //  6037: invokevirtual   wog.f:(Lwog$b;JIII)V
        //  6040: iinc            4, 1
        //  6043: goto            5948
        //  6046: aload_0        
        //  6047: iconst_0       
        //  6048: putfield        wog.G:I
        //  6051: return         
        //  6052: astore          15
        //  6054: goto            4378
        //    Exceptions:
        //  throws com.google.android.exoplayer2.ParserException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  3796   3801   4064   4074   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3868   3881   4064   4074   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3893   3906   4064   4074   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3921   3930   4064   4074   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3967   3991   4064   4074   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4000   4008   4064   4074   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4226   4244   4365   4370   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4280   4330   4365   4370   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4341   4349   6052   6057   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4349   4357   6052   6057   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4357   4365   4365   4370   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4370   4378   6052   6057   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4425   4431   4638   4648   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4446   4490   4638   4648   Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_4341:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void i(final voa a0) {
        this.a0 = a0;
    }
    
    public final void j(final roa roa, final int n) throws IOException {
        final gxj g = this.g;
        if (g.c >= n) {
            return;
        }
        final byte[] a = g.a;
        if (a.length < n) {
            g.a(Math.max(a.length * 2, n));
        }
        final gxj g2 = this.g;
        final byte[] a2 = g2.a;
        final int c = g2.c;
        roa.readFully(a2, c, n - c);
        this.g.C(n);
    }
    
    public final void k() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = 0;
        this.Z = false;
        this.j.A(0);
    }
    
    public final long l(final long n) throws ParserException {
        final long r = this.r;
        if (r != -9223372036854775807L) {
            return rnw.N(n, r, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", (Throwable)null);
    }
    
    @RequiresNonNull({ "#2.output" })
    public final int m(final roa roa, final wog.wog$b wog$b, int n) throws IOException {
        if ("S_TEXT/UTF8".equals(wog$b.b)) {
            this.n(roa, wog.b0, n);
            n = this.S;
            this.k();
            return n;
        }
        if ("S_TEXT/ASS".equals(wog$b.b)) {
            this.n(roa, wog.d0, n);
            n = this.S;
            this.k();
            return n;
        }
        if ("S_TEXT/WEBVTT".equals(wog$b.b)) {
            this.n(roa, wog.e0, n);
            n = this.S;
            this.k();
            return n;
        }
        final vwt x = wog$b.X;
        final boolean u = this.U;
        boolean b = true;
        if (!u) {
            if (wog$b.h) {
                this.O &= 0xBFFFFFFF;
                final boolean v = this.V;
                int n2 = 128;
                if (!v) {
                    roa.readFully(this.g.a, 0, 1);
                    ++this.R;
                    final byte[] a = this.g.a;
                    if ((a[0] & 0x80) == 0x80) {
                        throw ParserException.a("Extension bit is set in signal byte", (Throwable)null);
                    }
                    this.Y = a[0];
                    this.V = true;
                }
                final byte y = this.Y;
                if ((y & 0x1) == 0x1) {
                    final boolean b2 = (y & 0x2) == 0x2;
                    this.O |= 0x40000000;
                    if (!this.Z) {
                        roa.readFully(this.l.a, 0, 8);
                        this.R += 8;
                        this.Z = true;
                        final gxj g = this.g;
                        final byte[] a2 = g.a;
                        if (!b2) {
                            n2 = 0;
                        }
                        a2[0] = (byte)(n2 | 0x8);
                        g.D(0);
                        x.a(this.g, 1);
                        ++this.S;
                        this.l.D(0);
                        x.a(this.l, 8);
                        this.S += 8;
                    }
                    if (b2) {
                        if (!this.W) {
                            roa.readFully(this.g.a, 0, 1);
                            ++this.R;
                            this.g.D(0);
                            this.X = this.g.t();
                            this.W = true;
                        }
                        final int n3 = this.X * 4;
                        this.g.A(n3);
                        roa.readFully(this.g.a, 0, n3);
                        this.R += n3;
                        final short n4 = (short)(this.X / 2 + 1);
                        final int n5 = n4 * 6 + 2;
                        final ByteBuffer o = this.o;
                        if (o == null || o.capacity() < n5) {
                            this.o = ByteBuffer.allocate(n5);
                        }
                        this.o.position(0);
                        this.o.putShort(n4);
                        int n6 = 0;
                        int n7 = 0;
                        int x2;
                        while (true) {
                            x2 = this.X;
                            if (n6 >= x2) {
                                break;
                            }
                            final int w = this.g.w();
                            if (n6 % 2 == 0) {
                                this.o.putShort((short)(w - n7));
                            }
                            else {
                                this.o.putInt(w - n7);
                            }
                            ++n6;
                            n7 = w;
                        }
                        final int n8 = n - this.R - n7;
                        if (x2 % 2 == 1) {
                            this.o.putInt(n8);
                        }
                        else {
                            this.o.putShort((short)n8);
                            this.o.putInt(0);
                        }
                        this.m.B(this.o.array(), n5);
                        x.a(this.m, n5);
                        this.S += n5;
                    }
                }
            }
            else {
                final byte[] i = wog$b.i;
                if (i != null) {
                    this.j.B(i, i.length);
                }
            }
            if (wog$b.f > 0) {
                this.O |= 0x10000000;
                this.n.A(0);
                this.g.A(4);
                final gxj g2 = this.g;
                final byte[] a3 = g2.a;
                a3[0] = (byte)(n >> 24 & 0xFF);
                a3[1] = (byte)(n >> 16 & 0xFF);
                a3[2] = (byte)(n >> 8 & 0xFF);
                a3[3] = (byte)(n & 0xFF);
                x.a(g2, 4);
                this.S += 4;
            }
            this.U = true;
        }
        n += this.j.c;
        if (!"V_MPEG4/ISO/AVC".equals(wog$b.b) && !"V_MPEGH/ISO/HEVC".equals(wog$b.b)) {
            if (wog$b.T != null) {
                if (this.j.c != 0) {
                    b = false;
                }
                omi.p(b);
                wog$b.T.c(roa);
            }
            while (true) {
                final int r = this.R;
                if (r >= n) {
                    break;
                }
                final int o2 = this.o(roa, x, n - r);
                this.R += o2;
                this.S += o2;
            }
        }
        else {
            final byte[] a4 = this.f.a;
            a4[0] = 0;
            a4[2] = (a4[1] = 0);
            final int y2 = wog$b.Y;
            final int n9 = 4 - y2;
            while (this.R < n) {
                final int t = this.T;
                if (t == 0) {
                    final gxj j = this.j;
                    final int min = Math.min(y2, j.c - j.b);
                    roa.readFully(a4, n9 + min, y2 - min);
                    if (min > 0) {
                        this.j.d(a4, n9, min);
                    }
                    this.R += y2;
                    this.f.D(0);
                    this.T = this.f.w();
                    this.e.D(0);
                    x.d(this.e, 4);
                    this.S += 4;
                }
                else {
                    final int o3 = this.o(roa, x, t);
                    this.R += o3;
                    this.S += o3;
                    this.T -= o3;
                }
            }
        }
        if ("A_VORBIS".equals(wog$b.b)) {
            this.h.D(0);
            x.d(this.h, 4);
            this.S += 4;
        }
        n = this.S;
        this.k();
        return n;
    }
    
    public final void n(final roa roa, final byte[] array, final int n) throws IOException {
        final int n2 = array.length + n;
        final gxj k = this.k;
        final byte[] a = k.a;
        if (a.length < n2) {
            final byte[] copy = Arrays.copyOf(array, n2 + n);
            Objects.requireNonNull(k);
            k.B(copy, copy.length);
        }
        else {
            System.arraycopy(array, 0, a, 0, array.length);
        }
        roa.readFully(this.k.a, array.length, n);
        this.k.D(0);
        this.k.C(n2);
    }
    
    public final int o(final roa roa, final vwt vwt, int n) throws IOException {
        final gxj j = this.j;
        final int n2 = j.c - j.b;
        if (n2 > 0) {
            n = Math.min(n, n2);
            vwt.d(this.j, n);
        }
        else {
            n = vwt.c((k88)roa, n, false);
        }
        return n;
    }
    
    public final void release() {
    }
    
    public final class a implements qq9
    {
        public final wog a;
        
        public a(final wog a) {
            this.a = a;
        }
    }
}
