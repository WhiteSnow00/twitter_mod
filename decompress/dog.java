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

public final class dog implements joa
{
    public static final byte[] b0;
    public static final byte[] c0;
    public static final byte[] d0;
    public static final byte[] e0;
    public static final UUID f0;
    public static final Map<String, Integer> g0;
    public long A;
    public long B;
    public vbg C;
    public vbg D;
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
    public final gq9 a;
    public ooa a0;
    public final low b;
    public final SparseArray<dog.dog$b> c;
    public final boolean d;
    public final mwj e;
    public final mwj f;
    public final mwj g;
    public final mwj h;
    public final mwj i;
    public final mwj j;
    public final mwj k;
    public final mwj l;
    public final mwj m;
    public final mwj n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public dog.dog$b u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;
    
    static {
        b0 = new byte[] { 49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10 };
        c0 = imw.C("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        d0 = new byte[] { 68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44 };
        e0 = new byte[] { 87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10 };
        f0 = new UUID(72057594037932032L, -9223371306706625679L);
        final HashMap hashMap = new HashMap();
        q1a.i(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        g0 = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public dog() {
        final xg8 a = new xg8();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = (gq9)a;
        a.d = (fq9)new a();
        this.d = true;
        this.b = new low();
        this.c = (SparseArray<dog.dog$b>)new SparseArray();
        this.g = new mwj(4);
        this.h = new mwj(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new mwj(4);
        this.e = new mwj(e6i.a);
        this.f = new mwj(4);
        this.j = new mwj();
        this.k = new mwj();
        this.l = new mwj(8);
        this.m = new mwj();
        this.n = new mwj();
        this.L = new int[1];
    }
    
    public static byte[] h(long n, final String s, final long n2) {
        ri4.k(n != -9223372036854775807L);
        final int n3 = (int)(n / 3600000000L);
        n -= n3 * 3600 * 1000000L;
        final int n4 = (int)(n / 60000000L);
        n -= n4 * 60 * 1000000L;
        final int n5 = (int)(n / 1000000L);
        return imw.C(String.format(Locale.US, s, n3, n4, n5, (int)((n - n5 * 1000000L) / n2)));
    }
    
    @Override
    public final int a(final koa koa, final rrk rrk) throws IOException {
        this.F = false;
        koa koa2 = koa;
        int n = 1;
        while (n != 0 && !this.F) {
            final xg8 xg8 = (xg8)this.a;
            ri4.y((Object)xg8.d);
            Label_5870: {
                while (true) {
                    final xg8.a a = xg8.b.peek();
                    if (a != null && koa.getPosition() >= a.b) {
                        ((a)xg8.d).a.g(((xg8.a)xg8.b.pop()).a);
                        break;
                    }
                    final int e = xg8.e;
                    final int n2 = 4;
                    if (e == 0) {
                        long c;
                        if ((c = xg8.c.c(koa2, true, false, 4)) == -2L) {
                            koa.e();
                            int b;
                            int n3;
                            while (true) {
                                koa2.n(xg8.a, 0, 4);
                                b = low.b((int)xg8.a[0]);
                                if (b != -1 && b <= 4) {
                                    n3 = (int)low.a(xg8.a, b, false);
                                    Objects.requireNonNull(((a)xg8.d).a);
                                    if (n3 == 357149030 || n3 == 524531317 || n3 == 475249515 || n3 == 374648427) {
                                        break;
                                    }
                                }
                                koa2.k(1);
                            }
                            koa2.k(b);
                            c = n3;
                        }
                        if (c == -1L) {
                            n = 0;
                            break Label_5870;
                        }
                        xg8.f = (int)c;
                        xg8.e = 1;
                    }
                    if (xg8.e == 1) {
                        xg8.g = xg8.c.c(koa2, false, true, 8);
                        xg8.e = 2;
                    }
                    final fq9 d = xg8.d;
                    final int f = xg8.f;
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
                            final long position = koa.getPosition();
                            xg8.b.push(new xg8.a(xg8.f, xg8.g + position));
                            final fq9 d2 = xg8.d;
                            final int f2 = xg8.f;
                            final long g = xg8.g;
                            final dog a2 = ((a)d2).a;
                            ri4.y((Object)a2.a0);
                            if (f2 != 160) {
                                if (f2 != 174) {
                                    if (f2 != 187) {
                                        if (f2 != 19899) {
                                            if (f2 != 20533) {
                                                if (f2 != 21968) {
                                                    if (f2 != 408125543) {
                                                        if (f2 != 475249515) {
                                                            if (f2 == 524531317) {
                                                                if (!a2.v) {
                                                                    if (a2.d && a2.z != -1L) {
                                                                        a2.y = true;
                                                                    }
                                                                    else {
                                                                        a2.a0.n((ebp)new ebp.b(a2.t));
                                                                        a2.v = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        else {
                                                            a2.C = new vbg();
                                                            a2.D = new vbg();
                                                        }
                                                    }
                                                    else {
                                                        final long q = a2.q;
                                                        if (q != -1L && q != position) {
                                                            throw ParserException.a("Multiple Segment elements not supported", (Throwable)null);
                                                        }
                                                        a2.q = position;
                                                        a2.p = g;
                                                    }
                                                }
                                                else {
                                                    a2.e(f2);
                                                    a2.u.x = true;
                                                }
                                            }
                                            else {
                                                a2.e(f2);
                                                a2.u.h = true;
                                            }
                                        }
                                        else {
                                            a2.w = -1;
                                            a2.x = -1L;
                                        }
                                    }
                                    else {
                                        a2.E = false;
                                    }
                                }
                                else {
                                    a2.u = new dog.dog$b();
                                }
                            }
                            else {
                                a2.Q = false;
                            }
                            xg8.e = 0;
                            break;
                        }
                        if (n4 != 2) {
                            if (n4 != 3) {
                                if (n4 == 4) {
                                    final fq9 d3 = xg8.d;
                                    final int f3 = xg8.f;
                                    final int n5 = (int)xg8.g;
                                    final dog a3 = ((a)d3).a;
                                    Objects.requireNonNull(a3);
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
                                                                a3.e(f3);
                                                                koa2.readFully(a3.u.v = new byte[n5], 0, n5);
                                                            }
                                                            else {
                                                                a3.e(f3);
                                                                koa2.readFully(a3.u.k = new byte[n5], 0, n5);
                                                            }
                                                        }
                                                        else {
                                                            Arrays.fill(a3.i.a, (byte)0);
                                                            koa2.readFully(a3.i.a, 4 - n5, n5);
                                                            a3.i.D(0);
                                                            a3.w = (int)a3.i.u();
                                                        }
                                                    }
                                                    else {
                                                        final byte[] array = new byte[n5];
                                                        koa2.readFully(array, 0, n5);
                                                        a3.e(f3);
                                                        a3.u.j = new ovt$a(1, array, 0, 0);
                                                    }
                                                }
                                                else {
                                                    a3.e(f3);
                                                    koa2.readFully(a3.u.i = new byte[n5], 0, n5);
                                                }
                                            }
                                            else {
                                                a3.e(f3);
                                                final dog.dog$b u = a3.u;
                                                final int g2 = u.g;
                                                if (g2 != 1685485123 && g2 != 1685480259) {
                                                    koa2.k(n5);
                                                }
                                                else {
                                                    koa2.readFully(u.N = new byte[n5], 0, n5);
                                                }
                                            }
                                        }
                                        else if (a3.G == 2) {
                                            final dog.dog$b dog$b = (dog.dog$b)a3.c.get(a3.M);
                                            if (a3.P == 4 && "V_VP9".equals(dog$b.b)) {
                                                a3.n.A(n5);
                                                koa2.readFully(a3.n.a, 0, n5);
                                            }
                                            else {
                                                koa2.k(n5);
                                            }
                                        }
                                    }
                                    else {
                                        if (a3.G == 0) {
                                            a3.M = (int)a3.b.c(koa2, false, true, 8);
                                            a3.N = a3.b.c;
                                            a3.I = -9223372036854775807L;
                                            a3.G = 1;
                                            a3.g.A(0);
                                        }
                                        final dog.dog$b dog$b2 = (dog.dog$b)a3.c.get(a3.M);
                                        if (dog$b2 == null) {
                                            koa2.k(n5 - a3.N);
                                            a3.G = 0;
                                        }
                                        else {
                                            Objects.requireNonNull(dog$b2.X);
                                            if (a3.G == 1) {
                                                a3.j(koa2, 3);
                                                final int n6 = (a3.g.a[2] & 0x6) >> 1;
                                                if (n6 == 0) {
                                                    a3.K = 1;
                                                    int[] l = a3.L;
                                                    if (l == null) {
                                                        l = new int[] { 0 };
                                                    }
                                                    else if (l.length < 1) {
                                                        l = new int[Math.max(l.length * 2, 1)];
                                                    }
                                                    (a3.L = l)[0] = n5 - a3.N - 3;
                                                }
                                                else {
                                                    a3.j(koa2, 4);
                                                    final int k = (a3.g.a[3] & 0xFF) + 1;
                                                    a3.K = k;
                                                    int[] i = a3.L;
                                                    if (i == null) {
                                                        i = new int[k];
                                                    }
                                                    else if (i.length < k) {
                                                        i = new int[Math.max(i.length * 2, k)];
                                                    }
                                                    a3.L = i;
                                                    if (n6 == 2) {
                                                        final int n7 = a3.N;
                                                        final int j = a3.K;
                                                        Arrays.fill(i, 0, j, (n5 - n7 - 4) / j);
                                                    }
                                                    else if (n6 == 1) {
                                                        final int n8 = 0;
                                                        int n9 = 0;
                                                        int n10 = n2;
                                                        int n11 = n8;
                                                        int n12;
                                                        while (true) {
                                                            n12 = a3.K - 1;
                                                            if (n11 >= n12) {
                                                                break;
                                                            }
                                                            a3.L[n11] = 0;
                                                            int n13;
                                                            int[] m;
                                                            do {
                                                                ++n10;
                                                                a3.j(koa2, n10);
                                                                n13 = (a3.g.a[n10 - 1] & 0xFF);
                                                                m = a3.L;
                                                                m[n11] += n13;
                                                            } while (n13 == 255);
                                                            n9 += m[n11];
                                                            ++n11;
                                                        }
                                                        a3.L[n12] = n5 - a3.N - n10 - n9;
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
                                                    Label_2837:
                                                        while (true) {
                                                            final int n18 = a3.K - 1;
                                                            if (n14 >= n18) {
                                                                a3.L[n18] = n5 - a3.N - n16 - n17;
                                                                break;
                                                            }
                                                            a3.L[n14] = 0;
                                                            ++n16;
                                                            a3.j(koa2, n16);
                                                            final byte[] a4 = a3.g.a;
                                                            final int n19 = n16 - 1;
                                                            if (a4[n19] != 0) {
                                                                int n20 = 0;
                                                                while (true) {
                                                                    while (n20 < 8) {
                                                                        final int n21 = 1 << 7 - n20;
                                                                        if ((a3.g.a[n19] & n21) != 0x0) {
                                                                            final int n22 = n16 + n20;
                                                                            a3.j(koa2, n22);
                                                                            final byte[] a5 = a3.g.a;
                                                                            int n23 = n19 + 1;
                                                                            long n24 = a5[n19] & 0xFF & ~n21;
                                                                            while (n23 < n22) {
                                                                                n24 = (n24 << 8 | (long)(a3.g.a[n23] & 0xFF));
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
                                                                                final int[] l2 = a3.L;
                                                                                if (n14 != 0) {
                                                                                    n26 += l2[n14 - 1];
                                                                                }
                                                                                l2[n14] = n26;
                                                                                n17 += l2[n14];
                                                                                ++n14;
                                                                                koa2 = koa;
                                                                                continue Label_2837;
                                                                            }
                                                                            throw ParserException.a("EBML lacing sample size out of range.", (Throwable)null);
                                                                        }
                                                                        else {
                                                                            ++n20;
                                                                            koa2 = koa;
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
                                                final byte[] a6 = a3.g.a;
                                                a3.H = a3.l((a6[1] & 0xFF) | a6[0] << 8) + a3.B;
                                                int o;
                                                if (dog$b2.d != 2 && (f3 != 163 || (a3.g.a[2] & 0x80) != 0x80)) {
                                                    o = 0;
                                                }
                                                else {
                                                    o = 1;
                                                }
                                                a3.O = o;
                                                a3.G = 2;
                                                a3.J = 0;
                                            }
                                            if (f3 == 163) {
                                                while (true) {
                                                    final int j2 = a3.J;
                                                    if (j2 >= a3.K) {
                                                        break;
                                                    }
                                                    a3.f(dog$b2, a3.J * dog$b2.e / 1000 + a3.H, a3.O, a3.m(koa, dog$b2, a3.L[j2]), 0);
                                                    ++a3.J;
                                                }
                                                a3.G = 0;
                                            }
                                            else {
                                                while (true) {
                                                    final int j3 = a3.J;
                                                    if (j3 >= a3.K) {
                                                        break;
                                                    }
                                                    final int[] l3 = a3.L;
                                                    l3[j3] = a3.m(koa, dog$b2, l3[j3]);
                                                    ++a3.J;
                                                }
                                            }
                                            koa2 = koa;
                                        }
                                    }
                                    xg8.e = 0;
                                    break;
                                }
                                if (n4 != 5) {
                                    final StringBuilder sb3 = new StringBuilder(32);
                                    sb3.append("Invalid element type ");
                                    sb3.append(n4);
                                    throw ParserException.a(sb3.toString(), (Throwable)null);
                                }
                                final long g3 = xg8.g;
                                if (g3 != 4L && g3 != 8L) {
                                    final StringBuilder sb4 = new StringBuilder(40);
                                    sb4.append("Invalid float size: ");
                                    sb4.append(g3);
                                    throw ParserException.a(sb4.toString(), (Throwable)null);
                                }
                                final fq9 d4 = xg8.d;
                                final int f4 = xg8.f;
                                final int n27 = (int)g3;
                                final long a7 = xg8.a(koa2, n27);
                                double longBitsToDouble;
                                if (n27 == 4) {
                                    longBitsToDouble = Float.intBitsToFloat((int)a7);
                                }
                                else {
                                    longBitsToDouble = Double.longBitsToDouble(a7);
                                }
                                final dog a8 = ((a)d4).a;
                                Objects.requireNonNull(a8);
                                Label_1733: {
                                    if (f4 != 181) {
                                        if (f4 != 17545) {
                                            switch (f4) {
                                                default: {
                                                    switch (f4) {
                                                        default: {
                                                            break Label_1733;
                                                        }
                                                        case 30325: {
                                                            a8.e(f4);
                                                            a8.u.u = (float)longBitsToDouble;
                                                            break Label_1733;
                                                        }
                                                        case 30324: {
                                                            a8.e(f4);
                                                            a8.u.t = (float)longBitsToDouble;
                                                            break Label_1733;
                                                        }
                                                        case 30323: {
                                                            a8.e(f4);
                                                            a8.u.s = (float)longBitsToDouble;
                                                            break Label_1733;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 21978: {
                                                    a8.e(f4);
                                                    a8.u.M = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21977: {
                                                    a8.e(f4);
                                                    a8.u.L = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21976: {
                                                    a8.e(f4);
                                                    a8.u.K = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21975: {
                                                    a8.e(f4);
                                                    a8.u.J = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21974: {
                                                    a8.e(f4);
                                                    a8.u.I = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21973: {
                                                    a8.e(f4);
                                                    a8.u.H = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21972: {
                                                    a8.e(f4);
                                                    a8.u.G = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21971: {
                                                    a8.e(f4);
                                                    a8.u.F = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21970: {
                                                    a8.e(f4);
                                                    a8.u.E = (float)longBitsToDouble;
                                                    break;
                                                }
                                                case 21969: {
                                                    a8.e(f4);
                                                    a8.u.D = (float)longBitsToDouble;
                                                    break;
                                                }
                                            }
                                        }
                                        else {
                                            a8.s = (long)longBitsToDouble;
                                        }
                                    }
                                    else {
                                        a8.e(f4);
                                        a8.u.Q = (int)longBitsToDouble;
                                    }
                                }
                                xg8.e = 0;
                                break;
                            }
                            else {
                                final long g4 = xg8.g;
                                if (g4 <= 2147483647L) {
                                    final fq9 d5 = xg8.d;
                                    final int f5 = xg8.f;
                                    int n28 = (int)g4;
                                    String b2;
                                    if (n28 == 0) {
                                        b2 = "";
                                    }
                                    else {
                                        final byte[] array2 = new byte[n28];
                                        koa2.readFully(array2, 0, n28);
                                        while (n28 > 0) {
                                            final int n29 = n28 - 1;
                                            if (array2[n29] != 0) {
                                                break;
                                            }
                                            n28 = n29;
                                        }
                                        b2 = new String(array2, 0, n28);
                                    }
                                    final dog a9 = ((a)d5).a;
                                    Objects.requireNonNull(a9);
                                    if (f5 != 134) {
                                        if (f5 != 17026) {
                                            if (f5 != 21358) {
                                                if (f5 == 2274716) {
                                                    a9.e(f5);
                                                    a9.u.W = b2;
                                                }
                                            }
                                            else {
                                                a9.e(f5);
                                                a9.u.a = b2;
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
                                        a9.e(f5);
                                        a9.u.b = b2;
                                    }
                                    xg8.e = 0;
                                    break;
                                }
                                final StringBuilder sb6 = new StringBuilder(41);
                                sb6.append("String element size: ");
                                sb6.append(g4);
                                throw ParserException.a(sb6.toString(), (Throwable)null);
                            }
                        }
                        else {
                            final long g5 = xg8.g;
                            if (g5 <= 8L) {
                                final fq9 d6 = xg8.d;
                                final int f6 = xg8.f;
                                final long a10 = xg8.a(koa2, (int)g5);
                                final dog a11 = ((a)d6).a;
                                Objects.requireNonNull(a11);
                                Label_5389: {
                                    if (f6 != 20529) {
                                        if (f6 != 20530) {
                                            switch (f6) {
                                                default: {
                                                    switch (f6) {
                                                        default: {
                                                            break Label_5389;
                                                        }
                                                        case 21949: {
                                                            a11.e(f6);
                                                            a11.u.C = (int)a10;
                                                            break Label_5389;
                                                        }
                                                        case 21948: {
                                                            a11.e(f6);
                                                            a11.u.B = (int)a10;
                                                            break Label_5389;
                                                        }
                                                        case 21947: {
                                                            a11.e(f6);
                                                            a11.u.x = true;
                                                            final int a12 = tr4.a((int)a10);
                                                            if (a12 != -1) {
                                                                a11.u.y = a12;
                                                                break Label_5389;
                                                            }
                                                            break Label_5389;
                                                        }
                                                        case 21946: {
                                                            a11.e(f6);
                                                            final int b3 = tr4.b((int)a10);
                                                            if (b3 != -1) {
                                                                a11.u.z = b3;
                                                                break Label_5389;
                                                            }
                                                            break Label_5389;
                                                        }
                                                        case 21945: {
                                                            a11.e(f6);
                                                            final int n30 = (int)a10;
                                                            if (n30 == 1) {
                                                                a11.u.A = 2;
                                                                break Label_5389;
                                                            }
                                                            if (n30 != 2) {
                                                                break Label_5389;
                                                            }
                                                            a11.u.A = 1;
                                                            break Label_5389;
                                                        }
                                                    }
                                                    break;
                                                }
                                                case 2807729: {
                                                    a11.r = a10;
                                                    break;
                                                }
                                                case 2352003: {
                                                    a11.e(f6);
                                                    a11.u.e = (int)a10;
                                                    break;
                                                }
                                                case 30321: {
                                                    a11.e(f6);
                                                    final int n31 = (int)a10;
                                                    if (n31 == 0) {
                                                        a11.u.r = 0;
                                                        break;
                                                    }
                                                    if (n31 == 1) {
                                                        a11.u.r = 1;
                                                        break;
                                                    }
                                                    if (n31 == 2) {
                                                        a11.u.r = 2;
                                                        break;
                                                    }
                                                    if (n31 != 3) {
                                                        break;
                                                    }
                                                    a11.u.r = 3;
                                                    break;
                                                }
                                                case 25188: {
                                                    a11.e(f6);
                                                    a11.u.P = (int)a10;
                                                    break;
                                                }
                                                case 22203: {
                                                    a11.e(f6);
                                                    a11.u.S = a10;
                                                    break;
                                                }
                                                case 22186: {
                                                    a11.e(f6);
                                                    a11.u.R = a10;
                                                    break;
                                                }
                                                case 21998: {
                                                    a11.e(f6);
                                                    a11.u.f = (int)a10;
                                                    break;
                                                }
                                                case 21930: {
                                                    a11.e(f6);
                                                    a11.u.U = (a10 == 1L);
                                                    break;
                                                }
                                                case 21690: {
                                                    a11.e(f6);
                                                    a11.u.p = (int)a10;
                                                    break;
                                                }
                                                case 21682: {
                                                    a11.e(f6);
                                                    a11.u.q = (int)a10;
                                                    break;
                                                }
                                                case 21680: {
                                                    a11.e(f6);
                                                    a11.u.o = (int)a10;
                                                    break;
                                                }
                                                case 21432: {
                                                    final int n32 = (int)a10;
                                                    a11.e(f6);
                                                    if (n32 == 0) {
                                                        a11.u.w = 0;
                                                        break;
                                                    }
                                                    if (n32 == 1) {
                                                        a11.u.w = 2;
                                                        break;
                                                    }
                                                    if (n32 == 3) {
                                                        a11.u.w = 1;
                                                        break;
                                                    }
                                                    if (n32 != 15) {
                                                        break;
                                                    }
                                                    a11.u.w = 3;
                                                    break;
                                                }
                                                case 21420: {
                                                    a11.x = a10 + a11.q;
                                                    break;
                                                }
                                                case 18408: {
                                                    if (a10 == 1L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb7 = new StringBuilder(56);
                                                    sb7.append("AESSettingsCipherMode ");
                                                    sb7.append(a10);
                                                    sb7.append(" not supported");
                                                    throw ParserException.a(sb7.toString(), (Throwable)null);
                                                }
                                                case 18401: {
                                                    if (a10 == 5L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb8 = new StringBuilder(49);
                                                    sb8.append("ContentEncAlgo ");
                                                    sb8.append(a10);
                                                    sb8.append(" not supported");
                                                    throw ParserException.a(sb8.toString(), (Throwable)null);
                                                }
                                                case 17143: {
                                                    if (a10 == 1L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb9 = new StringBuilder(50);
                                                    sb9.append("EBMLReadVersion ");
                                                    sb9.append(a10);
                                                    sb9.append(" not supported");
                                                    throw ParserException.a(sb9.toString(), (Throwable)null);
                                                }
                                                case 17029: {
                                                    if (a10 >= 1L && a10 <= 2L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb10 = new StringBuilder(53);
                                                    sb10.append("DocTypeReadVersion ");
                                                    sb10.append(a10);
                                                    sb10.append(" not supported");
                                                    throw ParserException.a(sb10.toString(), (Throwable)null);
                                                }
                                                case 16980: {
                                                    if (a10 == 3L) {
                                                        break;
                                                    }
                                                    final StringBuilder sb11 = new StringBuilder(50);
                                                    sb11.append("ContentCompAlgo ");
                                                    sb11.append(a10);
                                                    sb11.append(" not supported");
                                                    throw ParserException.a(sb11.toString(), (Throwable)null);
                                                }
                                                case 16871: {
                                                    a11.e(f6);
                                                    a11.u.g = (int)a10;
                                                    break;
                                                }
                                                case 251: {
                                                    a11.Q = true;
                                                    break;
                                                }
                                                case 241: {
                                                    if (!a11.E) {
                                                        a11.d(f6);
                                                        a11.D.a(a10);
                                                        a11.E = true;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 238: {
                                                    a11.P = (int)a10;
                                                    break;
                                                }
                                                case 231: {
                                                    a11.B = a11.l(a10);
                                                    break;
                                                }
                                                case 215: {
                                                    a11.e(f6);
                                                    a11.u.c = (int)a10;
                                                    break;
                                                }
                                                case 186: {
                                                    a11.e(f6);
                                                    a11.u.n = (int)a10;
                                                    break;
                                                }
                                                case 179: {
                                                    a11.d(f6);
                                                    a11.C.a(a11.l(a10));
                                                    break;
                                                }
                                                case 176: {
                                                    a11.e(f6);
                                                    a11.u.m = (int)a10;
                                                    break;
                                                }
                                                case 159: {
                                                    a11.e(f6);
                                                    a11.u.O = (int)a10;
                                                    break;
                                                }
                                                case 155: {
                                                    a11.I = a11.l(a10);
                                                    break;
                                                }
                                                case 136: {
                                                    a11.e(f6);
                                                    a11.u.V = (a10 == 1L);
                                                    break;
                                                }
                                                case 131: {
                                                    a11.e(f6);
                                                    a11.u.d = (int)a10;
                                                    break;
                                                }
                                            }
                                        }
                                        else if (a10 != 1L) {
                                            final StringBuilder sb12 = new StringBuilder(55);
                                            sb12.append("ContentEncodingScope ");
                                            sb12.append(a10);
                                            sb12.append(" not supported");
                                            throw ParserException.a(sb12.toString(), (Throwable)null);
                                        }
                                    }
                                    else if (a10 != 0L) {
                                        final StringBuilder sb13 = new StringBuilder(55);
                                        sb13.append("ContentEncodingOrder ");
                                        sb13.append(a10);
                                        sb13.append(" not supported");
                                        throw ParserException.a(sb13.toString(), (Throwable)null);
                                    }
                                }
                                xg8.e = 0;
                                break;
                            }
                            final StringBuilder sb14 = new StringBuilder(42);
                            sb14.append("Invalid integer size: ");
                            sb14.append(g5);
                            throw ParserException.a(sb14.toString(), (Throwable)null);
                        }
                    }
                    else {
                        koa2.k((int)xg8.g);
                        xg8.e = 0;
                    }
                }
                n = 1;
            }
            if (n != 0) {
                final long position2 = koa.getPosition();
                boolean b4 = false;
                Label_5956: {
                    Label_5947: {
                        if (!this.y) {
                            if (this.v) {
                                final long a13 = this.A;
                                if (a13 != -1L) {
                                    rrk.a = a13;
                                    this.A = -1L;
                                    break Label_5947;
                                }
                            }
                            b4 = false;
                            break Label_5956;
                        }
                        this.A = position2;
                        rrk.a = this.z;
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
                final dog.dog$b dog$b3 = (dog.dog$b)this.c.valueAt(n33);
                dog.dog$b.a(dog$b3);
                final l3u t = dog$b3.T;
                if (t != null) {
                    t.a(dog$b3.X, dog$b3.j);
                }
            }
            return -1;
        }
        return 0;
    }
    
    @Override
    public final boolean b(final koa koa) throws IOException {
        final biq biq = new biq();
        final long c = ((gh8)koa).c;
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
        final byte[] a = biq.a.a;
        final gh8 gh8 = (gh8)koa;
        final boolean b = false;
        gh8.c(a, 0, 4, false);
        long u = biq.a.u();
        biq.b = 4;
        while (u != 440786851L) {
            if (++biq.b == n4) {
                return b;
            }
            gh8.c(biq.a.a, 0, 1, false);
            u = ((u << 8 & 0xFFFFFFFFFFFFFF00L) | (long)(biq.a.a[0] & 0xFF));
        }
        final long a2 = biq.a(koa);
        final long n5 = biq.b;
        boolean b2 = b;
        if (a2 == Long.MIN_VALUE) {
            return b2;
        }
        if (n2 != 0 && n5 + a2 >= c) {
            b2 = b;
            return b2;
        }
        while (true) {
            final long n6 = lcmp((long)biq.b, n5 + a2);
            if (n6 < 0) {
                if (biq.a(koa) == Long.MIN_VALUE) {
                    b2 = b;
                    return b2;
                }
                final long a3 = biq.a(koa);
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
                gh8.l(n8, false);
                biq.b += n8;
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
    
    @Override
    public final void c(final long n, final long n2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        final xg8 xg8 = (xg8)this.a;
        xg8.e = 0;
        xg8.b.clear();
        final low c = xg8.c;
        c.b = 0;
        c.c = 0;
        final low b = this.b;
        b.b = 0;
        b.c = 0;
        this.k();
        for (int i = 0; i < this.c.size(); ++i) {
            final l3u t = ((dog.dog$b)this.c.valueAt(i)).T;
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
    public final void f(final dog.dog$b dog$b, final long n, int n2, int n3, final int n4) {
        final l3u t = dog$b.T;
        if (t != null) {
            t.b(dog$b.X, n, n2, n3, n4, dog$b.j);
        }
        else {
            if ("S_TEXT/UTF8".equals(dog$b.b) || "S_TEXT/ASS".equals(dog$b.b) || "S_TEXT/WEBVTT".equals(dog$b.b)) {
                if (this.K > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                }
                else {
                    final long i = this.I;
                    if (i == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    }
                    else {
                        final String b = dog$b.b;
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
                            final mwj k = this.k;
                            if (b2 >= k.c) {
                                break;
                            }
                            if (k.a[b2] == 0) {
                                k.C(b2);
                                break;
                            }
                            ++b2;
                        }
                        final ovt x = dog$b.X;
                        final mwj j = this.k;
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
                    final mwj n8 = this.n;
                    final int c = n8.c;
                    dog$b.X.a(n8, c);
                    n7 = n3 + c;
                }
                n3 = n7;
            }
            dog$b.X.b(n, n2, n3, n4, dog$b.j);
        }
        this.F = true;
    }
    
    public final void g(final int p0) throws ParserException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        dog.a0:Looa;
        //     4: invokestatic    ri4.y:(Ljava/lang/Object;)Ljava/lang/Object;
        //     7: pop            
        //     8: iconst_2       
        //     9: istore_2       
        //    10: iconst_0       
        //    11: istore_3       
        //    12: iload_1        
        //    13: sipush          160
        //    16: if_icmpeq       5904
        //    19: iload_1        
        //    20: sipush          174
        //    23: if_icmpeq       717
        //    26: iload_1        
        //    27: sipush          19899
        //    30: if_icmpeq       668
        //    33: iload_1        
        //    34: sipush          25152
        //    37: if_icmpeq       587
        //    40: iload_1        
        //    41: sipush          28032
        //    44: if_icmpeq       549
        //    47: iload_1        
        //    48: ldc_w           357149030
        //    51: if_icmpeq       503
        //    54: iload_1        
        //    55: ldc_w           374648427
        //    58: if_icmpeq       473
        //    61: iload_1        
        //    62: ldc_w           475249515
        //    65: if_icmpeq       71
        //    68: goto            6059
        //    71: aload_0        
        //    72: getfield        dog.v:Z
        //    75: ifne            460
        //    78: aload_0        
        //    79: getfield        dog.a0:Looa;
        //    82: astore          4
        //    84: aload_0        
        //    85: getfield        dog.C:Lvbg;
        //    88: astore          5
        //    90: aload_0        
        //    91: getfield        dog.D:Lvbg;
        //    94: astore          6
        //    96: aload_0        
        //    97: getfield        dog.q:J
        //   100: ldc2_w          -1
        //   103: lcmp           
        //   104: ifeq            433
        //   107: aload_0        
        //   108: getfield        dog.t:J
        //   111: ldc2_w          -9223372036854775807
        //   114: lcmp           
        //   115: ifeq            433
        //   118: aload           5
        //   120: ifnull          433
        //   123: aload           5
        //   125: getfield        vbg.a:I
        //   128: istore_2       
        //   129: iload_2        
        //   130: ifeq            433
        //   133: aload           6
        //   135: ifnull          433
        //   138: aload           6
        //   140: getfield        vbg.a:I
        //   143: iload_2        
        //   144: if_icmpeq       150
        //   147: goto            433
        //   150: iload_2        
        //   151: newarray        I
        //   153: astore          7
        //   155: iload_2        
        //   156: newarray        J
        //   158: astore          8
        //   160: iload_2        
        //   161: newarray        J
        //   163: astore          9
        //   165: iload_2        
        //   166: newarray        J
        //   168: astore          10
        //   170: iconst_0       
        //   171: istore          11
        //   173: iload_3        
        //   174: istore_1       
        //   175: iload           11
        //   177: iload_2        
        //   178: if_icmpge       220
        //   181: aload           10
        //   183: iload           11
        //   185: aload           5
        //   187: iload           11
        //   189: invokevirtual   vbg.b:(I)J
        //   192: lastore        
        //   193: aload_0        
        //   194: getfield        dog.q:J
        //   197: lstore          12
        //   199: aload           8
        //   201: iload           11
        //   203: aload           6
        //   205: iload           11
        //   207: invokevirtual   vbg.b:(I)J
        //   210: lload           12
        //   212: ladd           
        //   213: lastore        
        //   214: iinc            11, 1
        //   217: goto            173
        //   220: iload_2        
        //   221: iconst_1       
        //   222: isub           
        //   223: istore          11
        //   225: iload_1        
        //   226: iload           11
        //   228: if_icmpge       271
        //   231: iload_1        
        //   232: iconst_1       
        //   233: iadd           
        //   234: istore          11
        //   236: aload           7
        //   238: iload_1        
        //   239: aload           8
        //   241: iload           11
        //   243: laload         
        //   244: aload           8
        //   246: iload_1        
        //   247: laload         
        //   248: lsub           
        //   249: l2i            
        //   250: iastore        
        //   251: aload           9
        //   253: iload_1        
        //   254: aload           10
        //   256: iload           11
        //   258: laload         
        //   259: aload           10
        //   261: iload_1        
        //   262: laload         
        //   263: lsub           
        //   264: lastore        
        //   265: iload           11
        //   267: istore_1       
        //   268: goto            220
        //   271: aload           7
        //   273: iload           11
        //   275: aload_0        
        //   276: getfield        dog.q:J
        //   279: aload_0        
        //   280: getfield        dog.p:J
        //   283: ladd           
        //   284: aload           8
        //   286: iload           11
        //   288: laload         
        //   289: lsub           
        //   290: l2i            
        //   291: iastore        
        //   292: aload           9
        //   294: iload           11
        //   296: aload_0        
        //   297: getfield        dog.t:J
        //   300: aload           10
        //   302: iload           11
        //   304: laload         
        //   305: lsub           
        //   306: lastore        
        //   307: aload           9
        //   309: iload           11
        //   311: laload         
        //   312: lstore          12
        //   314: aload           7
        //   316: astore          14
        //   318: aload           8
        //   320: astore          15
        //   322: aload           9
        //   324: astore          5
        //   326: aload           10
        //   328: astore          6
        //   330: lload           12
        //   332: lconst_0       
        //   333: lcmp           
        //   334: ifgt            413
        //   337: new             Ljava/lang/StringBuilder;
        //   340: dup            
        //   341: bipush          72
        //   343: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   346: astore          6
        //   348: aload           6
        //   350: ldc_w           "Discarding last cue point with unexpected duration: "
        //   353: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   356: pop            
        //   357: aload           6
        //   359: lload           12
        //   361: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   364: pop            
        //   365: ldc_w           "MatroskaExtractor"
        //   368: aload           6
        //   370: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   373: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   376: pop            
        //   377: aload           7
        //   379: iload           11
        //   381: invokestatic    java/util/Arrays.copyOf:([II)[I
        //   384: astore          14
        //   386: aload           8
        //   388: iload           11
        //   390: invokestatic    java/util/Arrays.copyOf:([JI)[J
        //   393: astore          15
        //   395: aload           9
        //   397: iload           11
        //   399: invokestatic    java/util/Arrays.copyOf:([JI)[J
        //   402: astore          5
        //   404: aload           10
        //   406: iload           11
        //   408: invokestatic    java/util/Arrays.copyOf:([JI)[J
        //   411: astore          6
        //   413: new             Lja4;
        //   416: dup            
        //   417: aload           14
        //   419: aload           15
        //   421: aload           5
        //   423: aload           6
        //   425: invokespecial   ja4.<init>:([I[J[J[J)V
        //   428: astore          6
        //   430: goto            446
        //   433: new             Lebp$b;
        //   436: dup            
        //   437: aload_0        
        //   438: getfield        dog.t:J
        //   441: invokespecial   ebp$b.<init>:(J)V
        //   444: astore          6
        //   446: aload           4
        //   448: aload           6
        //   450: invokeinterface ooa.n:(Lebp;)V
        //   455: aload_0        
        //   456: iconst_1       
        //   457: putfield        dog.v:Z
        //   460: aload_0        
        //   461: aconst_null    
        //   462: putfield        dog.C:Lvbg;
        //   465: aload_0        
        //   466: aconst_null    
        //   467: putfield        dog.D:Lvbg;
        //   470: goto            6059
        //   473: aload_0        
        //   474: getfield        dog.c:Landroid/util/SparseArray;
        //   477: invokevirtual   android/util/SparseArray.size:()I
        //   480: ifeq            495
        //   483: aload_0        
        //   484: getfield        dog.a0:Looa;
        //   487: invokeinterface ooa.q:()V
        //   492: goto            6059
        //   495: ldc_w           "No valid tracks were found"
        //   498: aconst_null    
        //   499: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //   502: athrow         
        //   503: aload_0        
        //   504: getfield        dog.r:J
        //   507: ldc2_w          -9223372036854775807
        //   510: lcmp           
        //   511: ifne            521
        //   514: aload_0        
        //   515: ldc2_w          1000000
        //   518: putfield        dog.r:J
        //   521: aload_0        
        //   522: getfield        dog.s:J
        //   525: lstore          12
        //   527: lload           12
        //   529: ldc2_w          -9223372036854775807
        //   532: lcmp           
        //   533: ifeq            6059
        //   536: aload_0        
        //   537: aload_0        
        //   538: lload           12
        //   540: invokevirtual   dog.l:(J)J
        //   543: putfield        dog.t:J
        //   546: goto            6059
        //   549: aload_0        
        //   550: iload_1        
        //   551: invokevirtual   dog.e:(I)V
        //   554: aload_0        
        //   555: getfield        dog.u:Ldog$b;
        //   558: astore          6
        //   560: aload           6
        //   562: getfield        dog$b.h:Z
        //   565: ifeq            6059
        //   568: aload           6
        //   570: getfield        dog$b.i:[B
        //   573: ifnonnull       579
        //   576: goto            6059
        //   579: ldc_w           "Combining encryption and compression is not supported"
        //   582: aconst_null    
        //   583: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //   586: athrow         
        //   587: aload_0        
        //   588: iload_1        
        //   589: invokevirtual   dog.e:(I)V
        //   592: aload_0        
        //   593: getfield        dog.u:Ldog$b;
        //   596: astore          6
        //   598: aload           6
        //   600: getfield        dog$b.h:Z
        //   603: ifeq            6059
        //   606: aload           6
        //   608: getfield        dog$b.j:Lovt$a;
        //   611: astore          5
        //   613: aload           5
        //   615: ifnull          660
        //   618: aload           6
        //   620: new             Lcom/google/android/exoplayer2/drm/b;
        //   623: dup            
        //   624: aconst_null    
        //   625: iconst_1       
        //   626: iconst_1       
        //   627: anewarray       Lcom/google/android/exoplayer2/drm/b$b;
        //   630: dup            
        //   631: iconst_0       
        //   632: new             Lcom/google/android/exoplayer2/drm/b$b;
        //   635: dup            
        //   636: getstatic       x63.a:Ljava/util/UUID;
        //   639: ldc_w           "video/webm"
        //   642: aload           5
        //   644: getfield        ovt$a.b:[B
        //   647: invokespecial   com/google/android/exoplayer2/drm/b$b.<init>:(Ljava/util/UUID;Ljava/lang/String;[B)V
        //   650: aastore        
        //   651: invokespecial   com/google/android/exoplayer2/drm/b.<init>:(Ljava/lang/String;Z[Lcom/google/android/exoplayer2/drm/b$b;)V
        //   654: putfield        dog$b.l:Lcom/google/android/exoplayer2/drm/b;
        //   657: goto            6059
        //   660: ldc_w           "Encrypted Track found but ContentEncKeyID was not found"
        //   663: aconst_null    
        //   664: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //   667: athrow         
        //   668: aload_0        
        //   669: getfield        dog.w:I
        //   672: istore_1       
        //   673: iload_1        
        //   674: iconst_m1      
        //   675: if_icmpeq       709
        //   678: aload_0        
        //   679: getfield        dog.x:J
        //   682: lstore          12
        //   684: lload           12
        //   686: ldc2_w          -1
        //   689: lcmp           
        //   690: ifeq            709
        //   693: iload_1        
        //   694: ldc_w           475249515
        //   697: if_icmpne       6059
        //   700: aload_0        
        //   701: lload           12
        //   703: putfield        dog.z:J
        //   706: goto            6059
        //   709: ldc_w           "Mandatory element SeekID or SeekPosition not found"
        //   712: aconst_null    
        //   713: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //   716: athrow         
        //   717: aload_0        
        //   718: getfield        dog.u:Ldog$b;
        //   721: astore          9
        //   723: aload           9
        //   725: invokestatic    ri4.y:(Ljava/lang/Object;)Ljava/lang/Object;
        //   728: pop            
        //   729: aload           9
        //   731: getfield        dog$b.b:Ljava/lang/String;
        //   734: astore          6
        //   736: aload           6
        //   738: ifnull          5896
        //   741: aload           6
        //   743: invokevirtual   java/lang/String.hashCode:()I
        //   746: lookupswitch {
        //          -2095576542: 1658
        //          -2095575984: 1639
        //          -1985379776: 1620
        //          -1784763192: 1601
        //          -1730367663: 1582
        //          -1482641358: 1563
        //          -1482641357: 1543
        //          -1373388978: 1523
        //          -933872740: 1503
        //          -538363189: 1483
        //          -538363109: 1463
        //          -425012669: 1443
        //          -356037306: 1423
        //          62923557: 1403
        //          62923603: 1383
        //          62927045: 1363
        //          82318131: 1343
        //          82338133: 1323
        //          82338134: 1303
        //          99146302: 1283
        //          444813526: 1263
        //          542569478: 1243
        //          635596514: 1223
        //          725948237: 1203
        //          725957860: 1183
        //          738597099: 1163
        //          855502857: 1143
        //          1045209816: 1123
        //          1422270023: 1103
        //          1809237540: 1083
        //          1950749482: 1063
        //          1950789798: 1043
        //          1951062397: 1023
        //          default: 1020
        //        }
        //  1020: goto            1677
        //  1023: aload           6
        //  1025: ldc_w           "A_OPUS"
        //  1028: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1031: ifne            1037
        //  1034: goto            1677
        //  1037: bipush          32
        //  1039: istore_1       
        //  1040: goto            1679
        //  1043: aload           6
        //  1045: ldc_w           "A_FLAC"
        //  1048: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1051: ifne            1057
        //  1054: goto            1677
        //  1057: bipush          31
        //  1059: istore_1       
        //  1060: goto            1679
        //  1063: aload           6
        //  1065: ldc_w           "A_EAC3"
        //  1068: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1071: ifne            1077
        //  1074: goto            1677
        //  1077: bipush          30
        //  1079: istore_1       
        //  1080: goto            1679
        //  1083: aload           6
        //  1085: ldc_w           "V_MPEG2"
        //  1088: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1091: ifne            1097
        //  1094: goto            1677
        //  1097: bipush          29
        //  1099: istore_1       
        //  1100: goto            1679
        //  1103: aload           6
        //  1105: ldc_w           "S_TEXT/UTF8"
        //  1108: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1111: ifne            1117
        //  1114: goto            1677
        //  1117: bipush          28
        //  1119: istore_1       
        //  1120: goto            1679
        //  1123: aload           6
        //  1125: ldc_w           "S_TEXT/WEBVTT"
        //  1128: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1131: ifne            1137
        //  1134: goto            1677
        //  1137: bipush          27
        //  1139: istore_1       
        //  1140: goto            1679
        //  1143: aload           6
        //  1145: ldc_w           "V_MPEGH/ISO/HEVC"
        //  1148: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1151: ifne            1157
        //  1154: goto            1677
        //  1157: bipush          26
        //  1159: istore_1       
        //  1160: goto            1679
        //  1163: aload           6
        //  1165: ldc_w           "S_TEXT/ASS"
        //  1168: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1171: ifne            1177
        //  1174: goto            1677
        //  1177: bipush          25
        //  1179: istore_1       
        //  1180: goto            1679
        //  1183: aload           6
        //  1185: ldc_w           "A_PCM/INT/LIT"
        //  1188: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1191: ifne            1197
        //  1194: goto            1677
        //  1197: bipush          24
        //  1199: istore_1       
        //  1200: goto            1679
        //  1203: aload           6
        //  1205: ldc_w           "A_PCM/INT/BIG"
        //  1208: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1211: ifne            1217
        //  1214: goto            1677
        //  1217: bipush          23
        //  1219: istore_1       
        //  1220: goto            1679
        //  1223: aload           6
        //  1225: ldc_w           "A_PCM/FLOAT/IEEE"
        //  1228: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1231: ifne            1237
        //  1234: goto            1677
        //  1237: bipush          22
        //  1239: istore_1       
        //  1240: goto            1679
        //  1243: aload           6
        //  1245: ldc_w           "A_DTS/EXPRESS"
        //  1248: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1251: ifne            1257
        //  1254: goto            1677
        //  1257: bipush          21
        //  1259: istore_1       
        //  1260: goto            1679
        //  1263: aload           6
        //  1265: ldc_w           "V_THEORA"
        //  1268: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1271: ifne            1277
        //  1274: goto            1677
        //  1277: bipush          20
        //  1279: istore_1       
        //  1280: goto            1679
        //  1283: aload           6
        //  1285: ldc_w           "S_HDMV/PGS"
        //  1288: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1291: ifne            1297
        //  1294: goto            1677
        //  1297: bipush          19
        //  1299: istore_1       
        //  1300: goto            1679
        //  1303: aload           6
        //  1305: ldc_w           "V_VP9"
        //  1308: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1311: ifne            1317
        //  1314: goto            1677
        //  1317: bipush          18
        //  1319: istore_1       
        //  1320: goto            1679
        //  1323: aload           6
        //  1325: ldc_w           "V_VP8"
        //  1328: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1331: ifne            1337
        //  1334: goto            1677
        //  1337: bipush          17
        //  1339: istore_1       
        //  1340: goto            1679
        //  1343: aload           6
        //  1345: ldc_w           "V_AV1"
        //  1348: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1351: ifne            1357
        //  1354: goto            1677
        //  1357: bipush          16
        //  1359: istore_1       
        //  1360: goto            1679
        //  1363: aload           6
        //  1365: ldc_w           "A_DTS"
        //  1368: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1371: ifne            1377
        //  1374: goto            1677
        //  1377: bipush          15
        //  1379: istore_1       
        //  1380: goto            1679
        //  1383: aload           6
        //  1385: ldc_w           "A_AC3"
        //  1388: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1391: ifne            1397
        //  1394: goto            1677
        //  1397: bipush          14
        //  1399: istore_1       
        //  1400: goto            1679
        //  1403: aload           6
        //  1405: ldc_w           "A_AAC"
        //  1408: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1411: ifne            1417
        //  1414: goto            1677
        //  1417: bipush          13
        //  1419: istore_1       
        //  1420: goto            1679
        //  1423: aload           6
        //  1425: ldc_w           "A_DTS/LOSSLESS"
        //  1428: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1431: ifne            1437
        //  1434: goto            1677
        //  1437: bipush          12
        //  1439: istore_1       
        //  1440: goto            1679
        //  1443: aload           6
        //  1445: ldc_w           "S_VOBSUB"
        //  1448: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1451: ifne            1457
        //  1454: goto            1677
        //  1457: bipush          11
        //  1459: istore_1       
        //  1460: goto            1679
        //  1463: aload           6
        //  1465: ldc_w           "V_MPEG4/ISO/AVC"
        //  1468: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1471: ifne            1477
        //  1474: goto            1677
        //  1477: bipush          10
        //  1479: istore_1       
        //  1480: goto            1679
        //  1483: aload           6
        //  1485: ldc_w           "V_MPEG4/ISO/ASP"
        //  1488: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1491: ifne            1497
        //  1494: goto            1677
        //  1497: bipush          9
        //  1499: istore_1       
        //  1500: goto            1679
        //  1503: aload           6
        //  1505: ldc_w           "S_DVBSUB"
        //  1508: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1511: ifne            1517
        //  1514: goto            1677
        //  1517: bipush          8
        //  1519: istore_1       
        //  1520: goto            1679
        //  1523: aload           6
        //  1525: ldc_w           "V_MS/VFW/FOURCC"
        //  1528: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1531: ifne            1537
        //  1534: goto            1677
        //  1537: bipush          7
        //  1539: istore_1       
        //  1540: goto            1679
        //  1543: aload           6
        //  1545: ldc_w           "A_MPEG/L3"
        //  1548: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1551: ifne            1557
        //  1554: goto            1677
        //  1557: bipush          6
        //  1559: istore_1       
        //  1560: goto            1679
        //  1563: aload           6
        //  1565: ldc_w           "A_MPEG/L2"
        //  1568: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1571: ifne            1577
        //  1574: goto            1677
        //  1577: iconst_5       
        //  1578: istore_1       
        //  1579: goto            1679
        //  1582: aload           6
        //  1584: ldc_w           "A_VORBIS"
        //  1587: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1590: ifne            1596
        //  1593: goto            1677
        //  1596: iconst_4       
        //  1597: istore_1       
        //  1598: goto            1679
        //  1601: aload           6
        //  1603: ldc_w           "A_TRUEHD"
        //  1606: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1609: ifne            1615
        //  1612: goto            1677
        //  1615: iconst_3       
        //  1616: istore_1       
        //  1617: goto            1679
        //  1620: aload           6
        //  1622: ldc_w           "A_MS/ACM"
        //  1625: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1628: ifne            1634
        //  1631: goto            1677
        //  1634: iconst_2       
        //  1635: istore_1       
        //  1636: goto            1679
        //  1639: aload           6
        //  1641: ldc_w           "V_MPEG4/ISO/SP"
        //  1644: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1647: ifne            1653
        //  1650: goto            1677
        //  1653: iconst_1       
        //  1654: istore_1       
        //  1655: goto            1679
        //  1658: aload           6
        //  1660: ldc_w           "V_MPEG4/ISO/AP"
        //  1663: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1666: ifne            1672
        //  1669: goto            1677
        //  1672: iconst_0       
        //  1673: istore_1       
        //  1674: goto            1679
        //  1677: iconst_m1      
        //  1678: istore_1       
        //  1679: iload_1        
        //  1680: tableswitch {
        //                0: 1833
        //                1: 1833
        //                2: 1833
        //                3: 1833
        //                4: 1833
        //                5: 1833
        //                6: 1833
        //                7: 1833
        //                8: 1833
        //                9: 1833
        //               10: 1833
        //               11: 1833
        //               12: 1833
        //               13: 1833
        //               14: 1833
        //               15: 1833
        //               16: 1833
        //               17: 1833
        //               18: 1833
        //               19: 1833
        //               20: 1833
        //               21: 1833
        //               22: 1833
        //               23: 1833
        //               24: 1833
        //               25: 1833
        //               26: 1833
        //               27: 1833
        //               28: 1833
        //               29: 1833
        //               30: 1833
        //               31: 1833
        //               32: 1833
        //          default: 1828
        //        }
        //  1828: iconst_0       
        //  1829: istore_1       
        //  1830: goto            1835
        //  1833: iconst_1       
        //  1834: istore_1       
        //  1835: iload_1        
        //  1836: ifeq            5888
        //  1839: aload_0        
        //  1840: getfield        dog.a0:Looa;
        //  1843: astore          8
        //  1845: aload           9
        //  1847: getfield        dog$b.c:I
        //  1850: istore          16
        //  1852: aload           9
        //  1854: getfield        dog$b.b:Ljava/lang/String;
        //  1857: astore          6
        //  1859: aload           6
        //  1861: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1864: pop            
        //  1865: aload           6
        //  1867: invokevirtual   java/lang/String.hashCode:()I
        //  1870: lookupswitch {
        //          -2095576542: 2782
        //          -2095575984: 2763
        //          -1985379776: 2744
        //          -1784763192: 2725
        //          -1730367663: 2706
        //          -1482641358: 2687
        //          -1482641357: 2667
        //          -1373388978: 2647
        //          -933872740: 2627
        //          -538363189: 2607
        //          -538363109: 2587
        //          -425012669: 2567
        //          -356037306: 2547
        //          62923557: 2527
        //          62923603: 2507
        //          62927045: 2487
        //          82318131: 2467
        //          82338133: 2447
        //          82338134: 2427
        //          99146302: 2407
        //          444813526: 2387
        //          542569478: 2367
        //          635596514: 2347
        //          725948237: 2327
        //          725957860: 2307
        //          738597099: 2287
        //          855502857: 2267
        //          1045209816: 2247
        //          1422270023: 2227
        //          1809237540: 2207
        //          1950749482: 2187
        //          1950789798: 2167
        //          1951062397: 2147
        //          default: 2144
        //        }
        //  2144: goto            2801
        //  2147: aload           6
        //  2149: ldc_w           "A_OPUS"
        //  2152: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2155: ifne            2161
        //  2158: goto            2801
        //  2161: bipush          32
        //  2163: istore_1       
        //  2164: goto            2803
        //  2167: aload           6
        //  2169: ldc_w           "A_FLAC"
        //  2172: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2175: ifne            2181
        //  2178: goto            2801
        //  2181: bipush          31
        //  2183: istore_1       
        //  2184: goto            2803
        //  2187: aload           6
        //  2189: ldc_w           "A_EAC3"
        //  2192: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2195: ifne            2201
        //  2198: goto            2801
        //  2201: bipush          30
        //  2203: istore_1       
        //  2204: goto            2803
        //  2207: aload           6
        //  2209: ldc_w           "V_MPEG2"
        //  2212: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2215: ifne            2221
        //  2218: goto            2801
        //  2221: bipush          29
        //  2223: istore_1       
        //  2224: goto            2803
        //  2227: aload           6
        //  2229: ldc_w           "S_TEXT/UTF8"
        //  2232: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2235: ifne            2241
        //  2238: goto            2801
        //  2241: bipush          28
        //  2243: istore_1       
        //  2244: goto            2803
        //  2247: aload           6
        //  2249: ldc_w           "S_TEXT/WEBVTT"
        //  2252: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2255: ifne            2261
        //  2258: goto            2801
        //  2261: bipush          27
        //  2263: istore_1       
        //  2264: goto            2803
        //  2267: aload           6
        //  2269: ldc_w           "V_MPEGH/ISO/HEVC"
        //  2272: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2275: ifne            2281
        //  2278: goto            2801
        //  2281: bipush          26
        //  2283: istore_1       
        //  2284: goto            2803
        //  2287: aload           6
        //  2289: ldc_w           "S_TEXT/ASS"
        //  2292: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2295: ifne            2301
        //  2298: goto            2801
        //  2301: bipush          25
        //  2303: istore_1       
        //  2304: goto            2803
        //  2307: aload           6
        //  2309: ldc_w           "A_PCM/INT/LIT"
        //  2312: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2315: ifne            2321
        //  2318: goto            2801
        //  2321: bipush          24
        //  2323: istore_1       
        //  2324: goto            2803
        //  2327: aload           6
        //  2329: ldc_w           "A_PCM/INT/BIG"
        //  2332: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2335: ifne            2341
        //  2338: goto            2801
        //  2341: bipush          23
        //  2343: istore_1       
        //  2344: goto            2803
        //  2347: aload           6
        //  2349: ldc_w           "A_PCM/FLOAT/IEEE"
        //  2352: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2355: ifne            2361
        //  2358: goto            2801
        //  2361: bipush          22
        //  2363: istore_1       
        //  2364: goto            2803
        //  2367: aload           6
        //  2369: ldc_w           "A_DTS/EXPRESS"
        //  2372: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2375: ifne            2381
        //  2378: goto            2801
        //  2381: bipush          21
        //  2383: istore_1       
        //  2384: goto            2803
        //  2387: aload           6
        //  2389: ldc_w           "V_THEORA"
        //  2392: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2395: ifne            2401
        //  2398: goto            2801
        //  2401: bipush          20
        //  2403: istore_1       
        //  2404: goto            2803
        //  2407: aload           6
        //  2409: ldc_w           "S_HDMV/PGS"
        //  2412: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2415: ifne            2421
        //  2418: goto            2801
        //  2421: bipush          19
        //  2423: istore_1       
        //  2424: goto            2803
        //  2427: aload           6
        //  2429: ldc_w           "V_VP9"
        //  2432: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2435: ifne            2441
        //  2438: goto            2801
        //  2441: bipush          18
        //  2443: istore_1       
        //  2444: goto            2803
        //  2447: aload           6
        //  2449: ldc_w           "V_VP8"
        //  2452: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2455: ifne            2461
        //  2458: goto            2801
        //  2461: bipush          17
        //  2463: istore_1       
        //  2464: goto            2803
        //  2467: aload           6
        //  2469: ldc_w           "V_AV1"
        //  2472: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2475: ifne            2481
        //  2478: goto            2801
        //  2481: bipush          16
        //  2483: istore_1       
        //  2484: goto            2803
        //  2487: aload           6
        //  2489: ldc_w           "A_DTS"
        //  2492: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2495: ifne            2501
        //  2498: goto            2801
        //  2501: bipush          15
        //  2503: istore_1       
        //  2504: goto            2803
        //  2507: aload           6
        //  2509: ldc_w           "A_AC3"
        //  2512: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2515: ifne            2521
        //  2518: goto            2801
        //  2521: bipush          14
        //  2523: istore_1       
        //  2524: goto            2803
        //  2527: aload           6
        //  2529: ldc_w           "A_AAC"
        //  2532: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2535: ifne            2541
        //  2538: goto            2801
        //  2541: bipush          13
        //  2543: istore_1       
        //  2544: goto            2803
        //  2547: aload           6
        //  2549: ldc_w           "A_DTS/LOSSLESS"
        //  2552: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2555: ifne            2561
        //  2558: goto            2801
        //  2561: bipush          12
        //  2563: istore_1       
        //  2564: goto            2803
        //  2567: aload           6
        //  2569: ldc_w           "S_VOBSUB"
        //  2572: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2575: ifne            2581
        //  2578: goto            2801
        //  2581: bipush          11
        //  2583: istore_1       
        //  2584: goto            2803
        //  2587: aload           6
        //  2589: ldc_w           "V_MPEG4/ISO/AVC"
        //  2592: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2595: ifne            2601
        //  2598: goto            2801
        //  2601: bipush          10
        //  2603: istore_1       
        //  2604: goto            2803
        //  2607: aload           6
        //  2609: ldc_w           "V_MPEG4/ISO/ASP"
        //  2612: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2615: ifne            2621
        //  2618: goto            2801
        //  2621: bipush          9
        //  2623: istore_1       
        //  2624: goto            2803
        //  2627: aload           6
        //  2629: ldc_w           "S_DVBSUB"
        //  2632: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2635: ifne            2641
        //  2638: goto            2801
        //  2641: bipush          8
        //  2643: istore_1       
        //  2644: goto            2803
        //  2647: aload           6
        //  2649: ldc_w           "V_MS/VFW/FOURCC"
        //  2652: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2655: ifne            2661
        //  2658: goto            2801
        //  2661: bipush          7
        //  2663: istore_1       
        //  2664: goto            2803
        //  2667: aload           6
        //  2669: ldc_w           "A_MPEG/L3"
        //  2672: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2675: ifne            2681
        //  2678: goto            2801
        //  2681: bipush          6
        //  2683: istore_1       
        //  2684: goto            2803
        //  2687: aload           6
        //  2689: ldc_w           "A_MPEG/L2"
        //  2692: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2695: ifne            2701
        //  2698: goto            2801
        //  2701: iconst_5       
        //  2702: istore_1       
        //  2703: goto            2803
        //  2706: aload           6
        //  2708: ldc_w           "A_VORBIS"
        //  2711: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2714: ifne            2720
        //  2717: goto            2801
        //  2720: iconst_4       
        //  2721: istore_1       
        //  2722: goto            2803
        //  2725: aload           6
        //  2727: ldc_w           "A_TRUEHD"
        //  2730: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2733: ifne            2739
        //  2736: goto            2801
        //  2739: iconst_3       
        //  2740: istore_1       
        //  2741: goto            2803
        //  2744: aload           6
        //  2746: ldc_w           "A_MS/ACM"
        //  2749: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2752: ifne            2758
        //  2755: goto            2801
        //  2758: iconst_2       
        //  2759: istore_1       
        //  2760: goto            2803
        //  2763: aload           6
        //  2765: ldc_w           "V_MPEG4/ISO/SP"
        //  2768: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2771: ifne            2777
        //  2774: goto            2801
        //  2777: iconst_1       
        //  2778: istore_1       
        //  2779: goto            2803
        //  2782: aload           6
        //  2784: ldc_w           "V_MPEG4/ISO/AP"
        //  2787: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  2790: ifne            2796
        //  2793: goto            2801
        //  2796: iconst_0       
        //  2797: istore_1       
        //  2798: goto            2803
        //  2801: iconst_m1      
        //  2802: istore_1       
        //  2803: ldc_w           "video/x-unknown"
        //  2806: astore          6
        //  2808: ldc_w           "audio/raw"
        //  2811: astore          15
        //  2813: ldc_w           "audio/x-unknown"
        //  2816: astore          5
        //  2818: iload_1        
        //  2819: tableswitch {
        //                0: 4658
        //                1: 4658
        //                2: 4416
        //                3: 4396
        //                4: 4097
        //                5: 4070
        //                6: 4062
        //                7: 3755
        //                8: 3705
        //                9: 4658
        //               10: 3649
        //               11: 3626
        //               12: 3615
        //               13: 3555
        //               14: 3547
        //               15: 3539
        //               16: 3531
        //               17: 3523
        //               18: 3515
        //               19: 3507
        //               20: 3620
        //               21: 3539
        //               22: 3416
        //               23: 3319
        //               24: 3231
        //               25: 3182
        //               26: 3128
        //               27: 3120
        //               28: 3112
        //               29: 3104
        //               30: 3096
        //               31: 3073
        //               32: 2972
        //          default: 2964
        //        }
        //  2964: ldc_w           "Unrecognized codec identifier."
        //  2967: aconst_null    
        //  2968: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  2971: athrow         
        //  2972: sipush          5760
        //  2975: istore_1       
        //  2976: new             Ljava/util/ArrayList;
        //  2979: dup            
        //  2980: iconst_3       
        //  2981: invokespecial   java/util/ArrayList.<init>:(I)V
        //  2984: astore          5
        //  2986: aload           5
        //  2988: aload           9
        //  2990: aload           9
        //  2992: getfield        dog$b.b:Ljava/lang/String;
        //  2995: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  2998: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  3001: pop            
        //  3002: bipush          8
        //  3004: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //  3007: astore          15
        //  3009: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //  3012: astore          6
        //  3014: aload           5
        //  3016: aload           15
        //  3018: aload           6
        //  3020: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //  3023: aload           9
        //  3025: getfield        dog$b.R:J
        //  3028: invokevirtual   java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
        //  3031: invokevirtual   java/nio/ByteBuffer.array:()[B
        //  3034: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  3037: pop            
        //  3038: aload           5
        //  3040: bipush          8
        //  3042: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //  3045: aload           6
        //  3047: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //  3050: aload           9
        //  3052: getfield        dog$b.S:J
        //  3055: invokevirtual   java/nio/ByteBuffer.putLong:(J)Ljava/nio/ByteBuffer;
        //  3058: invokevirtual   java/nio/ByteBuffer.array:()[B
        //  3061: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  3064: pop            
        //  3065: ldc_w           "audio/opus"
        //  3068: astore          6
        //  3070: goto            4336
        //  3073: aload           9
        //  3075: aload           9
        //  3077: getfield        dog$b.b:Ljava/lang/String;
        //  3080: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  3083: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  3086: astore          6
        //  3088: ldc_w           "audio/flac"
        //  3091: astore          5
        //  3093: goto            3740
        //  3096: ldc_w           "audio/eac3"
        //  3099: astore          6
        //  3101: goto            3620
        //  3104: ldc_w           "video/mpeg2"
        //  3107: astore          6
        //  3109: goto            3620
        //  3112: ldc_w           "application/x-subrip"
        //  3115: astore          6
        //  3117: goto            3620
        //  3120: ldc_w           "text/vtt"
        //  3123: astore          6
        //  3125: goto            3620
        //  3128: new             Lmwj;
        //  3131: dup            
        //  3132: aload           9
        //  3134: aload           9
        //  3136: getfield        dog$b.b:Ljava/lang/String;
        //  3139: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  3142: invokespecial   mwj.<init>:([B)V
        //  3145: invokestatic    hkc.a:(Lmwj;)Lhkc;
        //  3148: astore          6
        //  3150: aload           6
        //  3152: getfield        hkc.a:Ljava/util/List;
        //  3155: astore          15
        //  3157: aload           9
        //  3159: aload           6
        //  3161: getfield        hkc.b:I
        //  3164: putfield        dog$b.Y:I
        //  3167: aload           6
        //  3169: getfield        hkc.d:Ljava/lang/String;
        //  3172: astore          6
        //  3174: ldc_w           "video/hevc"
        //  3177: astore          5
        //  3179: goto            3700
        //  3182: getstatic       dog.c0:[B
        //  3185: astore          5
        //  3187: aload           9
        //  3189: aload           9
        //  3191: getfield        dog$b.b:Ljava/lang/String;
        //  3194: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  3197: astore          6
        //  3199: getstatic       aed.D0:Laed$b;
        //  3202: astore          15
        //  3204: iconst_2       
        //  3205: anewarray       Ljava/lang/Object;
        //  3208: dup            
        //  3209: iconst_0       
        //  3210: aload           5
        //  3212: aastore        
        //  3213: dup            
        //  3214: iconst_1       
        //  3215: aload           6
        //  3217: aastore        
        //  3218: invokestatic    aed.p:([Ljava/lang/Object;)Laed;
        //  3221: astore          6
        //  3223: ldc_w           "text/x-ssa"
        //  3226: astore          5
        //  3228: goto            3740
        //  3231: aload           9
        //  3233: getfield        dog$b.P:I
        //  3236: invokestatic    imw.w:(I)I
        //  3239: istore          11
        //  3241: iload           11
        //  3243: istore_1       
        //  3244: iload           11
        //  3246: ifne            3346
        //  3249: aload           9
        //  3251: getfield        dog$b.P:I
        //  3254: istore_1       
        //  3255: new             Ljava/lang/StringBuilder;
        //  3258: dup            
        //  3259: bipush          89
        //  3261: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3264: astore          6
        //  3266: aload           6
        //  3268: ldc_w           "Unsupported little endian PCM bit depth: "
        //  3271: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3274: pop            
        //  3275: aload           6
        //  3277: iload_1        
        //  3278: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3281: pop            
        //  3282: aload           6
        //  3284: ldc_w           ". Setting mimeType to "
        //  3287: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3290: pop            
        //  3291: aload           6
        //  3293: ldc_w           "audio/x-unknown"
        //  3296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3299: pop            
        //  3300: ldc_w           "MatroskaExtractor"
        //  3303: aload           6
        //  3305: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3308: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  3311: pop            
        //  3312: aload           5
        //  3314: astore          6
        //  3316: goto            3620
        //  3319: aload           9
        //  3321: getfield        dog$b.P:I
        //  3324: istore_1       
        //  3325: iload_1        
        //  3326: bipush          8
        //  3328: if_icmpne       3336
        //  3331: iconst_3       
        //  3332: istore_1       
        //  3333: goto            3346
        //  3336: iload_1        
        //  3337: bipush          16
        //  3339: if_icmpne       3352
        //  3342: ldc_w           268435456
        //  3345: istore_1       
        //  3346: iload_1        
        //  3347: istore          11
        //  3349: goto            3431
        //  3352: new             Ljava/lang/StringBuilder;
        //  3355: dup            
        //  3356: bipush          86
        //  3358: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3361: astore          6
        //  3363: aload           6
        //  3365: ldc_w           "Unsupported big endian PCM bit depth: "
        //  3368: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3371: pop            
        //  3372: aload           6
        //  3374: iload_1        
        //  3375: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3378: pop            
        //  3379: aload           6
        //  3381: ldc_w           ". Setting mimeType to "
        //  3384: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3387: pop            
        //  3388: aload           6
        //  3390: ldc_w           "audio/x-unknown"
        //  3393: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3396: pop            
        //  3397: ldc_w           "MatroskaExtractor"
        //  3400: aload           6
        //  3402: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3405: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  3408: pop            
        //  3409: aload           5
        //  3411: astore          6
        //  3413: goto            3620
        //  3416: aload           9
        //  3418: getfield        dog$b.P:I
        //  3421: istore_1       
        //  3422: iload_1        
        //  3423: bipush          32
        //  3425: if_icmpne       3443
        //  3428: iconst_4       
        //  3429: istore          11
        //  3431: iconst_m1      
        //  3432: istore_1       
        //  3433: aconst_null    
        //  3434: astore          6
        //  3436: aload           15
        //  3438: astore          5
        //  3440: goto            4705
        //  3443: new             Ljava/lang/StringBuilder;
        //  3446: dup            
        //  3447: bipush          90
        //  3449: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  3452: astore          6
        //  3454: aload           6
        //  3456: ldc_w           "Unsupported floating point PCM bit depth: "
        //  3459: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3462: pop            
        //  3463: aload           6
        //  3465: iload_1        
        //  3466: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  3469: pop            
        //  3470: aload           6
        //  3472: ldc_w           ". Setting mimeType to "
        //  3475: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3478: pop            
        //  3479: aload           6
        //  3481: ldc_w           "audio/x-unknown"
        //  3484: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  3487: pop            
        //  3488: ldc_w           "MatroskaExtractor"
        //  3491: aload           6
        //  3493: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  3496: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  3499: pop            
        //  3500: aload           5
        //  3502: astore          6
        //  3504: goto            3620
        //  3507: ldc_w           "application/pgs"
        //  3510: astore          6
        //  3512: goto            3620
        //  3515: ldc_w           "video/x-vnd.on2.vp9"
        //  3518: astore          6
        //  3520: goto            3620
        //  3523: ldc_w           "video/x-vnd.on2.vp8"
        //  3526: astore          6
        //  3528: goto            3620
        //  3531: ldc_w           "video/av01"
        //  3534: astore          6
        //  3536: goto            3620
        //  3539: ldc_w           "audio/vnd.dts"
        //  3542: astore          6
        //  3544: goto            3620
        //  3547: ldc_w           "audio/ac3"
        //  3550: astore          6
        //  3552: goto            3620
        //  3555: aload           9
        //  3557: aload           9
        //  3559: getfield        dog$b.b:Ljava/lang/String;
        //  3562: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  3565: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  3568: astore          15
        //  3570: aload           9
        //  3572: getfield        dog$b.k:[B
        //  3575: invokestatic    a7.c:([B)La7$a;
        //  3578: astore          6
        //  3580: aload           9
        //  3582: aload           6
        //  3584: getfield        a7$a.a:I
        //  3587: putfield        dog$b.Q:I
        //  3590: aload           9
        //  3592: aload           6
        //  3594: getfield        a7$a.b:I
        //  3597: putfield        dog$b.O:I
        //  3600: aload           6
        //  3602: getfield        a7$a.c:Ljava/lang/String;
        //  3605: astore          6
        //  3607: ldc_w           "audio/mp4a-latm"
        //  3610: astore          5
        //  3612: goto            3700
        //  3615: ldc_w           "audio/vnd.dts.hd"
        //  3618: astore          6
        //  3620: aconst_null    
        //  3621: astore          5
        //  3623: goto            4047
        //  3626: aload           9
        //  3628: aload           9
        //  3630: getfield        dog$b.b:Ljava/lang/String;
        //  3633: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  3636: invokestatic    aed.t:(Ljava/lang/Object;)Laed;
        //  3639: astore          6
        //  3641: ldc_w           "application/vobsub"
        //  3644: astore          5
        //  3646: goto            3740
        //  3649: new             Lmwj;
        //  3652: dup            
        //  3653: aload           9
        //  3655: aload           9
        //  3657: getfield        dog$b.b:Ljava/lang/String;
        //  3660: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  3663: invokespecial   mwj.<init>:([B)V
        //  3666: invokestatic    fe1.b:(Lmwj;)Lfe1;
        //  3669: astore          6
        //  3671: aload           6
        //  3673: getfield        fe1.a:Ljava/util/List;
        //  3676: astore          15
        //  3678: aload           9
        //  3680: aload           6
        //  3682: getfield        fe1.b:I
        //  3685: putfield        dog$b.Y:I
        //  3688: aload           6
        //  3690: getfield        fe1.f:Ljava/lang/String;
        //  3693: astore          6
        //  3695: ldc_w           "video/avc"
        //  3698: astore          5
        //  3700: iconst_m1      
        //  3701: istore_1       
        //  3702: goto            4616
        //  3705: iconst_4       
        //  3706: newarray        B
        //  3708: astore          6
        //  3710: aload           9
        //  3712: aload           9
        //  3714: getfield        dog$b.b:Ljava/lang/String;
        //  3717: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  3720: iconst_0       
        //  3721: aload           6
        //  3723: iconst_0       
        //  3724: iconst_4       
        //  3725: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  3728: aload           6
        //  3730: invokestatic    aed.t:(Ljava/lang/Object;)Laed;
        //  3733: astore          6
        //  3735: ldc_w           "application/dvbsubs"
        //  3738: astore          5
        //  3740: aload           5
        //  3742: astore          15
        //  3744: aload           6
        //  3746: astore          5
        //  3748: aload           15
        //  3750: astore          6
        //  3752: goto            4047
        //  3755: aload           9
        //  3757: aload           9
        //  3759: getfield        dog$b.b:Ljava/lang/String;
        //  3762: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  3765: astore          6
        //  3767: bipush          16
        //  3769: aload           6
        //  3771: arraylength    
        //  3772: if_icmpgt       3781
        //  3775: iconst_1       
        //  3776: istore          17
        //  3778: goto            3784
        //  3781: iconst_0       
        //  3782: istore          17
        //  3784: iload           17
        //  3786: invokestatic    ri4.k:(Z)V
        //  3789: aload           6
        //  3791: bipush          16
        //  3793: baload         
        //  3794: i2l            
        //  3795: lstore          12
        //  3797: aload           6
        //  3799: bipush          17
        //  3801: baload         
        //  3802: i2l            
        //  3803: ldc2_w          255
        //  3806: land           
        //  3807: bipush          8
        //  3809: lshl           
        //  3810: lload           12
        //  3812: ldc2_w          255
        //  3815: land           
        //  3816: lor            
        //  3817: aload           6
        //  3819: bipush          18
        //  3821: baload         
        //  3822: i2l            
        //  3823: ldc2_w          255
        //  3826: land           
        //  3827: bipush          16
        //  3829: lshl           
        //  3830: lor            
        //  3831: aload           6
        //  3833: bipush          19
        //  3835: baload         
        //  3836: i2l            
        //  3837: ldc2_w          255
        //  3840: land           
        //  3841: bipush          24
        //  3843: lshl           
        //  3844: lor            
        //  3845: lstore          12
        //  3847: lload           12
        //  3849: ldc2_w          1482049860
        //  3852: lcmp           
        //  3853: ifne            3872
        //  3856: new             Landroid/util/Pair;
        //  3859: dup            
        //  3860: ldc_w           "video/divx"
        //  3863: aconst_null    
        //  3864: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3867: astore          6
        //  3869: goto            4019
        //  3872: lload           12
        //  3874: ldc2_w          859189832
        //  3877: lcmp           
        //  3878: ifne            3897
        //  3881: new             Landroid/util/Pair;
        //  3884: dup            
        //  3885: ldc_w           "video/3gpp"
        //  3888: aconst_null    
        //  3889: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3892: astore          6
        //  3894: goto            4019
        //  3897: lload           12
        //  3899: ldc2_w          826496599
        //  3902: lcmp           
        //  3903: ifne            3996
        //  3906: bipush          40
        //  3908: istore_1       
        //  3909: iload_1        
        //  3910: aload           6
        //  3912: arraylength    
        //  3913: iconst_4       
        //  3914: isub           
        //  3915: if_icmpge       3988
        //  3918: aload           6
        //  3920: iload_1        
        //  3921: baload         
        //  3922: ifne            3982
        //  3925: aload           6
        //  3927: iload_1        
        //  3928: iconst_1       
        //  3929: iadd           
        //  3930: baload         
        //  3931: ifne            3982
        //  3934: aload           6
        //  3936: iload_1        
        //  3937: iconst_2       
        //  3938: iadd           
        //  3939: baload         
        //  3940: iconst_1       
        //  3941: if_icmpne       3982
        //  3944: aload           6
        //  3946: iload_1        
        //  3947: iconst_3       
        //  3948: iadd           
        //  3949: baload         
        //  3950: bipush          15
        //  3952: if_icmpne       3982
        //  3955: new             Landroid/util/Pair;
        //  3958: dup            
        //  3959: ldc_w           "video/wvc1"
        //  3962: aload           6
        //  3964: iload_1        
        //  3965: aload           6
        //  3967: arraylength    
        //  3968: invokestatic    java/util/Arrays.copyOfRange:([BII)[B
        //  3971: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  3974: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  3977: astore          6
        //  3979: goto            4019
        //  3982: iinc            1, 1
        //  3985: goto            3909
        //  3988: ldc_w           "Failed to find FourCC VC1 initialization data"
        //  3991: aconst_null    
        //  3992: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  3995: athrow         
        //  3996: ldc_w           "MatroskaExtractor"
        //  3999: ldc_w           "Unknown FourCC. Setting mimeType to video/x-unknown"
        //  4002: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  4005: pop            
        //  4006: new             Landroid/util/Pair;
        //  4009: dup            
        //  4010: ldc_w           "video/x-unknown"
        //  4013: aconst_null    
        //  4014: invokespecial   android/util/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //  4017: astore          6
        //  4019: aload           6
        //  4021: getfield        android/util/Pair.first:Ljava/lang/Object;
        //  4024: checkcast       Ljava/lang/String;
        //  4027: astore          5
        //  4029: aload           6
        //  4031: getfield        android/util/Pair.second:Ljava/lang/Object;
        //  4034: checkcast       Ljava/util/List;
        //  4037: astore          15
        //  4039: aload           5
        //  4041: astore          6
        //  4043: aload           15
        //  4045: astore          5
        //  4047: iconst_m1      
        //  4048: istore_1       
        //  4049: goto            4082
        //  4052: astore          6
        //  4054: ldc_w           "Error parsing FourCC private data"
        //  4057: aconst_null    
        //  4058: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4061: athrow         
        //  4062: ldc_w           "audio/mpeg"
        //  4065: astore          6
        //  4067: goto            4075
        //  4070: ldc_w           "audio/mpeg-L2"
        //  4073: astore          6
        //  4075: sipush          4096
        //  4078: istore_1       
        //  4079: aconst_null    
        //  4080: astore          5
        //  4082: aload           6
        //  4084: astore          15
        //  4086: aload           5
        //  4088: astore          6
        //  4090: aload           15
        //  4092: astore          5
        //  4094: goto            4702
        //  4097: sipush          8192
        //  4100: istore_3       
        //  4101: aload           9
        //  4103: aload           9
        //  4105: getfield        dog$b.b:Ljava/lang/String;
        //  4108: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  4111: astore          5
        //  4113: aload           5
        //  4115: iconst_0       
        //  4116: baload         
        //  4117: iconst_2       
        //  4118: if_icmpne       4380
        //  4121: iconst_1       
        //  4122: istore_1       
        //  4123: iconst_0       
        //  4124: istore          11
        //  4126: aload           5
        //  4128: iload_1        
        //  4129: baload         
        //  4130: sipush          255
        //  4133: iand           
        //  4134: sipush          255
        //  4137: if_icmpne       4152
        //  4140: iinc_w          11, 255
        //  4146: iinc            1, 1
        //  4149: goto            4126
        //  4152: iload_1        
        //  4153: iconst_1       
        //  4154: iadd           
        //  4155: istore          18
        //  4157: iload           11
        //  4159: aload           5
        //  4161: iload_1        
        //  4162: baload         
        //  4163: sipush          255
        //  4166: iand           
        //  4167: iadd           
        //  4168: istore          19
        //  4170: iconst_0       
        //  4171: istore_1       
        //  4172: iload           18
        //  4174: istore          11
        //  4176: aload           5
        //  4178: iload           11
        //  4180: baload         
        //  4181: sipush          255
        //  4184: iand           
        //  4185: sipush          255
        //  4188: if_icmpne       4203
        //  4191: iinc_w          1, 255
        //  4197: iinc            11, 1
        //  4200: goto            4176
        //  4203: iload           11
        //  4205: iconst_1       
        //  4206: iadd           
        //  4207: istore          18
        //  4209: aload           5
        //  4211: iload           11
        //  4213: baload         
        //  4214: istore          11
        //  4216: aload           5
        //  4218: iload           18
        //  4220: baload         
        //  4221: iconst_1       
        //  4222: if_icmpne       4367
        //  4225: iload           19
        //  4227: newarray        B
        //  4229: astore          15
        //  4231: aload           5
        //  4233: iload           18
        //  4235: aload           15
        //  4237: iconst_0       
        //  4238: iload           19
        //  4240: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  4243: iload           18
        //  4245: iload           19
        //  4247: iadd           
        //  4248: istore          18
        //  4250: aload           5
        //  4252: iload           18
        //  4254: baload         
        //  4255: iconst_3       
        //  4256: if_icmpne       4359
        //  4259: iload           18
        //  4261: iload_1        
        //  4262: iload           11
        //  4264: sipush          255
        //  4267: iand           
        //  4268: iadd           
        //  4269: iadd           
        //  4270: istore_1       
        //  4271: aload           5
        //  4273: iload_1        
        //  4274: baload         
        //  4275: iconst_5       
        //  4276: if_icmpne       4351
        //  4279: aload           5
        //  4281: arraylength    
        //  4282: iload_1        
        //  4283: isub           
        //  4284: newarray        B
        //  4286: astore          6
        //  4288: aload           5
        //  4290: iload_1        
        //  4291: aload           6
        //  4293: iconst_0       
        //  4294: aload           5
        //  4296: arraylength    
        //  4297: iload_1        
        //  4298: isub           
        //  4299: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //  4302: new             Ljava/util/ArrayList;
        //  4305: astore          5
        //  4307: aload           5
        //  4309: iconst_2       
        //  4310: invokespecial   java/util/ArrayList.<init>:(I)V
        //  4313: aload           5
        //  4315: aload           15
        //  4317: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  4320: pop            
        //  4321: aload           5
        //  4323: aload           6
        //  4325: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  4328: pop            
        //  4329: ldc_w           "audio/vorbis"
        //  4332: astore          6
        //  4334: iload_3        
        //  4335: istore_1       
        //  4336: aload           5
        //  4338: astore          15
        //  4340: aload           6
        //  4342: astore          5
        //  4344: aload           15
        //  4346: astore          6
        //  4348: goto            4702
        //  4351: ldc_w           "Error parsing vorbis codec private"
        //  4354: aconst_null    
        //  4355: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4358: athrow         
        //  4359: ldc_w           "Error parsing vorbis codec private"
        //  4362: aconst_null    
        //  4363: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4366: athrow         
        //  4367: ldc_w           "Error parsing vorbis codec private"
        //  4370: aconst_null    
        //  4371: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4374: athrow         
        //  4375: astore          6
        //  4377: goto            4388
        //  4380: ldc_w           "Error parsing vorbis codec private"
        //  4383: aconst_null    
        //  4384: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4387: athrow         
        //  4388: ldc_w           "Error parsing vorbis codec private"
        //  4391: aconst_null    
        //  4392: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4395: athrow         
        //  4396: aload           9
        //  4398: new             Ll3u;
        //  4401: dup            
        //  4402: invokespecial   l3u.<init>:()V
        //  4405: putfield        dog$b.T:Ll3u;
        //  4408: ldc_w           "audio/true-hd"
        //  4411: astore          6
        //  4413: goto            4642
        //  4416: new             Lmwj;
        //  4419: dup            
        //  4420: aload           9
        //  4422: aload           9
        //  4424: getfield        dog$b.b:Ljava/lang/String;
        //  4427: invokevirtual   dog$b.b:(Ljava/lang/String;)[B
        //  4430: invokespecial   mwj.<init>:([B)V
        //  4433: astore          14
        //  4435: aload           14
        //  4437: invokevirtual   mwj.l:()I
        //  4440: istore_1       
        //  4441: iload_1        
        //  4442: iconst_1       
        //  4443: if_icmpne       4449
        //  4446: goto            4508
        //  4449: iload_1        
        //  4450: ldc_w           65534
        //  4453: if_icmpne       4513
        //  4456: aload           14
        //  4458: bipush          24
        //  4460: invokevirtual   mwj.D:(I)V
        //  4463: aload           14
        //  4465: invokevirtual   mwj.m:()J
        //  4468: lstore          12
        //  4470: getstatic       dog.f0:Ljava/util/UUID;
        //  4473: astore          6
        //  4475: lload           12
        //  4477: aload           6
        //  4479: invokevirtual   java/util/UUID.getMostSignificantBits:()J
        //  4482: lcmp           
        //  4483: ifne            4513
        //  4486: aload           14
        //  4488: invokevirtual   mwj.m:()J
        //  4491: lstore          20
        //  4493: aload           6
        //  4495: invokevirtual   java/util/UUID.getLeastSignificantBits:()J
        //  4498: lstore          12
        //  4500: lload           20
        //  4502: lload           12
        //  4504: lcmp           
        //  4505: ifne            4513
        //  4508: iconst_1       
        //  4509: istore_1       
        //  4510: goto            4515
        //  4513: iconst_0       
        //  4514: istore_1       
        //  4515: iload_1        
        //  4516: ifeq            4622
        //  4519: aload           9
        //  4521: getfield        dog$b.P:I
        //  4524: invokestatic    imw.w:(I)I
        //  4527: istore_1       
        //  4528: iload_1        
        //  4529: ifne            4602
        //  4532: aload           9
        //  4534: getfield        dog$b.P:I
        //  4537: istore_1       
        //  4538: new             Ljava/lang/StringBuilder;
        //  4541: dup            
        //  4542: bipush          75
        //  4544: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  4547: astore          6
        //  4549: aload           6
        //  4551: ldc_w           "Unsupported PCM bit depth: "
        //  4554: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4557: pop            
        //  4558: aload           6
        //  4560: iload_1        
        //  4561: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  4564: pop            
        //  4565: aload           6
        //  4567: ldc_w           ". Setting mimeType to "
        //  4570: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4573: pop            
        //  4574: aload           6
        //  4576: ldc_w           "audio/x-unknown"
        //  4579: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  4582: pop            
        //  4583: ldc_w           "MatroskaExtractor"
        //  4586: aload           6
        //  4588: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  4591: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  4594: pop            
        //  4595: aload           5
        //  4597: astore          6
        //  4599: goto            4642
        //  4602: aconst_null    
        //  4603: astore          6
        //  4605: aconst_null    
        //  4606: astore          14
        //  4608: aload           15
        //  4610: astore          5
        //  4612: aload           14
        //  4614: astore          15
        //  4616: iconst_m1      
        //  4617: istore          11
        //  4619: goto            4724
        //  4622: ldc_w           "MatroskaExtractor"
        //  4625: ldc_w           "Non-PCM MS/ACM is unsupported. Setting mimeType to "
        //  4628: ldc_w           "audio/x-unknown"
        //  4631: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  4634: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //  4637: pop            
        //  4638: aload           5
        //  4640: astore          6
        //  4642: aconst_null    
        //  4643: astore          5
        //  4645: goto            4688
        //  4648: astore          6
        //  4650: ldc_w           "Error parsing MS/ACM codec private"
        //  4653: aconst_null    
        //  4654: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  4657: athrow         
        //  4658: aload           9
        //  4660: getfield        dog$b.k:[B
        //  4663: astore          6
        //  4665: aload           6
        //  4667: ifnonnull       4676
        //  4670: aconst_null    
        //  4671: astore          5
        //  4673: goto            4683
        //  4676: aload           6
        //  4678: invokestatic    java/util/Collections.singletonList:(Ljava/lang/Object;)Ljava/util/List;
        //  4681: astore          5
        //  4683: ldc_w           "video/mp4v-es"
        //  4686: astore          6
        //  4688: aload           5
        //  4690: astore          15
        //  4692: iconst_m1      
        //  4693: istore_1       
        //  4694: aload           6
        //  4696: astore          5
        //  4698: aload           15
        //  4700: astore          6
        //  4702: iconst_m1      
        //  4703: istore          11
        //  4705: aconst_null    
        //  4706: astore          14
        //  4708: iload           11
        //  4710: istore_3       
        //  4711: aload           6
        //  4713: astore          15
        //  4715: aload           14
        //  4717: astore          6
        //  4719: iload_1        
        //  4720: istore          11
        //  4722: iload_3        
        //  4723: istore_1       
        //  4724: aload           9
        //  4726: getfield        dog$b.N:[B
        //  4729: astore          7
        //  4731: aload           6
        //  4733: astore          10
        //  4735: aload           5
        //  4737: astore          14
        //  4739: aload           7
        //  4741: ifnull          4786
        //  4744: new             Lmwj;
        //  4747: dup            
        //  4748: aload           7
        //  4750: invokespecial   mwj.<init>:([B)V
        //  4753: invokestatic    c79.b:(Lmwj;)Lc79;
        //  4756: astore          7
        //  4758: aload           6
        //  4760: astore          10
        //  4762: aload           5
        //  4764: astore          14
        //  4766: aload           7
        //  4768: ifnull          4786
        //  4771: aload           7
        //  4773: getfield        c79.c:Ljava/lang/Object;
        //  4776: checkcast       Ljava/lang/String;
        //  4779: astore          10
        //  4781: ldc_w           "video/dolby-vision"
        //  4784: astore          14
        //  4786: aload           9
        //  4788: getfield        dog$b.V:Z
        //  4791: istore          17
        //  4793: aload           9
        //  4795: getfield        dog$b.U:Z
        //  4798: ifeq            4806
        //  4801: iconst_2       
        //  4802: istore_3       
        //  4803: goto            4808
        //  4806: iconst_0       
        //  4807: istore_3       
        //  4808: new             Lcom/google/android/exoplayer2/n$a;
        //  4811: dup            
        //  4812: invokespecial   com/google/android/exoplayer2/n$a.<init>:()V
        //  4815: astore          5
        //  4817: aload           14
        //  4819: invokestatic    zah.i:(Ljava/lang/String;)Z
        //  4822: ifeq            4856
        //  4825: aload           5
        //  4827: aload           9
        //  4829: getfield        dog$b.O:I
        //  4832: putfield        com/google/android/exoplayer2/n$a.x:I
        //  4835: aload           5
        //  4837: aload           9
        //  4839: getfield        dog$b.Q:I
        //  4842: putfield        com/google/android/exoplayer2/n$a.y:I
        //  4845: aload           5
        //  4847: iload_1        
        //  4848: putfield        com/google/android/exoplayer2/n$a.z:I
        //  4851: iconst_1       
        //  4852: istore_1       
        //  4853: goto            5734
        //  4856: aload           14
        //  4858: invokestatic    zah.k:(Ljava/lang/String;)Z
        //  4861: ifeq            5655
        //  4864: aload           9
        //  4866: getfield        dog$b.q:I
        //  4869: ifne            4931
        //  4872: aload           9
        //  4874: getfield        dog$b.o:I
        //  4877: istore          18
        //  4879: iload           18
        //  4881: istore_1       
        //  4882: iload           18
        //  4884: iconst_m1      
        //  4885: if_icmpne       4894
        //  4888: aload           9
        //  4890: getfield        dog$b.m:I
        //  4893: istore_1       
        //  4894: aload           9
        //  4896: iload_1        
        //  4897: putfield        dog$b.o:I
        //  4900: aload           9
        //  4902: getfield        dog$b.p:I
        //  4905: istore          18
        //  4907: iload           18
        //  4909: istore_1       
        //  4910: iload           18
        //  4912: iconst_m1      
        //  4913: if_icmpne       4922
        //  4916: aload           9
        //  4918: getfield        dog$b.n:I
        //  4921: istore_1       
        //  4922: aload           9
        //  4924: iload_1        
        //  4925: putfield        dog$b.p:I
        //  4928: goto            4931
        //  4931: ldc_w           -1.0
        //  4934: fstore          22
        //  4936: aload           9
        //  4938: getfield        dog$b.o:I
        //  4941: istore          18
        //  4943: fload           22
        //  4945: fstore          23
        //  4947: iload           18
        //  4949: iconst_m1      
        //  4950: if_icmpeq       4988
        //  4953: aload           9
        //  4955: getfield        dog$b.p:I
        //  4958: istore_1       
        //  4959: fload           22
        //  4961: fstore          23
        //  4963: iload_1        
        //  4964: iconst_m1      
        //  4965: if_icmpeq       4988
        //  4968: aload           9
        //  4970: getfield        dog$b.n:I
        //  4973: iload           18
        //  4975: imul           
        //  4976: i2f            
        //  4977: aload           9
        //  4979: getfield        dog$b.m:I
        //  4982: iload_1        
        //  4983: imul           
        //  4984: i2f            
        //  4985: fdiv           
        //  4986: fstore          23
        //  4988: aload           9
        //  4990: getfield        dog$b.x:Z
        //  4993: ifeq            5406
        //  4996: aload           9
        //  4998: getfield        dog$b.D:F
        //  5001: ldc_w           -1.0
        //  5004: fcmpl          
        //  5005: ifeq            5374
        //  5008: aload           9
        //  5010: getfield        dog$b.E:F
        //  5013: ldc_w           -1.0
        //  5016: fcmpl          
        //  5017: ifeq            5374
        //  5020: aload           9
        //  5022: getfield        dog$b.F:F
        //  5025: ldc_w           -1.0
        //  5028: fcmpl          
        //  5029: ifeq            5374
        //  5032: aload           9
        //  5034: getfield        dog$b.G:F
        //  5037: ldc_w           -1.0
        //  5040: fcmpl          
        //  5041: ifeq            5374
        //  5044: aload           9
        //  5046: getfield        dog$b.H:F
        //  5049: ldc_w           -1.0
        //  5052: fcmpl          
        //  5053: ifeq            5374
        //  5056: aload           9
        //  5058: getfield        dog$b.I:F
        //  5061: ldc_w           -1.0
        //  5064: fcmpl          
        //  5065: ifeq            5374
        //  5068: aload           9
        //  5070: getfield        dog$b.J:F
        //  5073: ldc_w           -1.0
        //  5076: fcmpl          
        //  5077: ifeq            5374
        //  5080: aload           9
        //  5082: getfield        dog$b.K:F
        //  5085: ldc_w           -1.0
        //  5088: fcmpl          
        //  5089: ifeq            5374
        //  5092: aload           9
        //  5094: getfield        dog$b.L:F
        //  5097: ldc_w           -1.0
        //  5100: fcmpl          
        //  5101: ifeq            5374
        //  5104: aload           9
        //  5106: getfield        dog$b.M:F
        //  5109: ldc_w           -1.0
        //  5112: fcmpl          
        //  5113: ifne            5119
        //  5116: goto            5374
        //  5119: bipush          25
        //  5121: newarray        B
        //  5123: astore          6
        //  5125: aload           6
        //  5127: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //  5130: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //  5133: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //  5136: astore          7
        //  5138: aload           7
        //  5140: iconst_0       
        //  5141: invokevirtual   java/nio/ByteBuffer.put:(B)Ljava/nio/ByteBuffer;
        //  5144: pop            
        //  5145: aload           7
        //  5147: aload           9
        //  5149: getfield        dog$b.D:F
        //  5152: ldc_w           50000.0
        //  5155: fmul           
        //  5156: ldc_w           0.5
        //  5159: fadd           
        //  5160: f2i            
        //  5161: i2s            
        //  5162: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5165: pop            
        //  5166: aload           7
        //  5168: aload           9
        //  5170: getfield        dog$b.E:F
        //  5173: ldc_w           50000.0
        //  5176: fmul           
        //  5177: ldc_w           0.5
        //  5180: fadd           
        //  5181: f2i            
        //  5182: i2s            
        //  5183: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5186: pop            
        //  5187: aload           7
        //  5189: aload           9
        //  5191: getfield        dog$b.F:F
        //  5194: ldc_w           50000.0
        //  5197: fmul           
        //  5198: ldc_w           0.5
        //  5201: fadd           
        //  5202: f2i            
        //  5203: i2s            
        //  5204: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5207: pop            
        //  5208: aload           7
        //  5210: aload           9
        //  5212: getfield        dog$b.G:F
        //  5215: ldc_w           50000.0
        //  5218: fmul           
        //  5219: ldc_w           0.5
        //  5222: fadd           
        //  5223: f2i            
        //  5224: i2s            
        //  5225: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5228: pop            
        //  5229: aload           7
        //  5231: aload           9
        //  5233: getfield        dog$b.H:F
        //  5236: ldc_w           50000.0
        //  5239: fmul           
        //  5240: ldc_w           0.5
        //  5243: fadd           
        //  5244: f2i            
        //  5245: i2s            
        //  5246: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5249: pop            
        //  5250: aload           7
        //  5252: aload           9
        //  5254: getfield        dog$b.I:F
        //  5257: ldc_w           50000.0
        //  5260: fmul           
        //  5261: ldc_w           0.5
        //  5264: fadd           
        //  5265: f2i            
        //  5266: i2s            
        //  5267: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5270: pop            
        //  5271: aload           7
        //  5273: aload           9
        //  5275: getfield        dog$b.J:F
        //  5278: ldc_w           50000.0
        //  5281: fmul           
        //  5282: ldc_w           0.5
        //  5285: fadd           
        //  5286: f2i            
        //  5287: i2s            
        //  5288: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5291: pop            
        //  5292: aload           7
        //  5294: aload           9
        //  5296: getfield        dog$b.K:F
        //  5299: ldc_w           50000.0
        //  5302: fmul           
        //  5303: ldc_w           0.5
        //  5306: fadd           
        //  5307: f2i            
        //  5308: i2s            
        //  5309: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5312: pop            
        //  5313: aload           7
        //  5315: aload           9
        //  5317: getfield        dog$b.L:F
        //  5320: ldc_w           0.5
        //  5323: fadd           
        //  5324: f2i            
        //  5325: i2s            
        //  5326: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5329: pop            
        //  5330: aload           7
        //  5332: aload           9
        //  5334: getfield        dog$b.M:F
        //  5337: ldc_w           0.5
        //  5340: fadd           
        //  5341: f2i            
        //  5342: i2s            
        //  5343: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5346: pop            
        //  5347: aload           7
        //  5349: aload           9
        //  5351: getfield        dog$b.B:I
        //  5354: i2s            
        //  5355: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5358: pop            
        //  5359: aload           7
        //  5361: aload           9
        //  5363: getfield        dog$b.C:I
        //  5366: i2s            
        //  5367: invokevirtual   java/nio/ByteBuffer.putShort:(S)Ljava/nio/ByteBuffer;
        //  5370: pop            
        //  5371: goto            5377
        //  5374: aconst_null    
        //  5375: astore          6
        //  5377: new             Ltr4;
        //  5380: dup            
        //  5381: aload           9
        //  5383: getfield        dog$b.y:I
        //  5386: aload           9
        //  5388: getfield        dog$b.A:I
        //  5391: aload           9
        //  5393: getfield        dog$b.z:I
        //  5396: aload           6
        //  5398: invokespecial   tr4.<init>:(III[B)V
        //  5401: astore          6
        //  5403: goto            5409
        //  5406: aconst_null    
        //  5407: astore          6
        //  5409: aload           9
        //  5411: getfield        dog$b.a:Ljava/lang/String;
        //  5414: astore          4
        //  5416: aload           4
        //  5418: ifnull          5460
        //  5421: getstatic       dog.g0:Ljava/util/Map;
        //  5424: astore          7
        //  5426: aload           7
        //  5428: aload           4
        //  5430: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //  5435: ifeq            5460
        //  5438: aload           7
        //  5440: aload           9
        //  5442: getfield        dog$b.a:Ljava/lang/String;
        //  5445: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  5450: checkcast       Ljava/lang/Integer;
        //  5453: invokevirtual   java/lang/Integer.intValue:()I
        //  5456: istore_1       
        //  5457: goto            5462
        //  5460: iconst_m1      
        //  5461: istore_1       
        //  5462: aload           9
        //  5464: getfield        dog$b.r:I
        //  5467: ifne            5590
        //  5470: aload           9
        //  5472: getfield        dog$b.s:F
        //  5475: fconst_0       
        //  5476: invokestatic    java/lang/Float.compare:(FF)I
        //  5479: ifne            5590
        //  5482: aload           9
        //  5484: getfield        dog$b.t:F
        //  5487: fconst_0       
        //  5488: invokestatic    java/lang/Float.compare:(FF)I
        //  5491: ifne            5590
        //  5494: aload           9
        //  5496: getfield        dog$b.u:F
        //  5499: fconst_0       
        //  5500: invokestatic    java/lang/Float.compare:(FF)I
        //  5503: ifne            5511
        //  5506: iconst_0       
        //  5507: istore_1       
        //  5508: goto            5590
        //  5511: aload           9
        //  5513: getfield        dog$b.t:F
        //  5516: ldc_w           90.0
        //  5519: invokestatic    java/lang/Float.compare:(FF)I
        //  5522: ifne            5531
        //  5525: bipush          90
        //  5527: istore_1       
        //  5528: goto            5590
        //  5531: aload           9
        //  5533: getfield        dog$b.t:F
        //  5536: ldc_w           -180.0
        //  5539: invokestatic    java/lang/Float.compare:(FF)I
        //  5542: ifeq            5583
        //  5545: aload           9
        //  5547: getfield        dog$b.t:F
        //  5550: ldc_w           180.0
        //  5553: invokestatic    java/lang/Float.compare:(FF)I
        //  5556: ifne            5562
        //  5559: goto            5583
        //  5562: aload           9
        //  5564: getfield        dog$b.t:F
        //  5567: ldc_w           -90.0
        //  5570: invokestatic    java/lang/Float.compare:(FF)I
        //  5573: ifne            5590
        //  5576: sipush          270
        //  5579: istore_1       
        //  5580: goto            5590
        //  5583: sipush          180
        //  5586: istore_1       
        //  5587: goto            5590
        //  5590: aload           5
        //  5592: aload           9
        //  5594: getfield        dog$b.m:I
        //  5597: putfield        com/google/android/exoplayer2/n$a.p:I
        //  5600: aload           5
        //  5602: aload           9
        //  5604: getfield        dog$b.n:I
        //  5607: putfield        com/google/android/exoplayer2/n$a.q:I
        //  5610: aload           5
        //  5612: fload           23
        //  5614: putfield        com/google/android/exoplayer2/n$a.t:F
        //  5617: aload           5
        //  5619: iload_1        
        //  5620: putfield        com/google/android/exoplayer2/n$a.s:I
        //  5623: aload           5
        //  5625: aload           9
        //  5627: getfield        dog$b.v:[B
        //  5630: putfield        com/google/android/exoplayer2/n$a.u:[B
        //  5633: aload           5
        //  5635: aload           9
        //  5637: getfield        dog$b.w:I
        //  5640: putfield        com/google/android/exoplayer2/n$a.v:I
        //  5643: aload           5
        //  5645: aload           6
        //  5647: putfield        com/google/android/exoplayer2/n$a.w:Ltr4;
        //  5650: iload_2        
        //  5651: istore_1       
        //  5652: goto            5734
        //  5655: ldc_w           "application/x-subrip"
        //  5658: aload           14
        //  5660: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5663: ifne            5732
        //  5666: ldc_w           "text/x-ssa"
        //  5669: aload           14
        //  5671: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5674: ifne            5732
        //  5677: ldc_w           "text/vtt"
        //  5680: aload           14
        //  5682: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5685: ifne            5732
        //  5688: ldc_w           "application/vobsub"
        //  5691: aload           14
        //  5693: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5696: ifne            5732
        //  5699: ldc_w           "application/pgs"
        //  5702: aload           14
        //  5704: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5707: ifne            5732
        //  5710: ldc_w           "application/dvbsubs"
        //  5713: aload           14
        //  5715: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  5718: ifeq            5724
        //  5721: goto            5732
        //  5724: ldc_w           "Unexpected MIME type."
        //  5727: aconst_null    
        //  5728: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  5731: athrow         
        //  5732: iconst_3       
        //  5733: istore_1       
        //  5734: aload           9
        //  5736: getfield        dog$b.a:Ljava/lang/String;
        //  5739: astore          6
        //  5741: aload           6
        //  5743: ifnull          5769
        //  5746: getstatic       dog.g0:Ljava/util/Map;
        //  5749: aload           6
        //  5751: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //  5756: ifne            5769
        //  5759: aload           5
        //  5761: aload           9
        //  5763: getfield        dog$b.a:Ljava/lang/String;
        //  5766: putfield        com/google/android/exoplayer2/n$a.b:Ljava/lang/String;
        //  5769: aload           5
        //  5771: iload           16
        //  5773: invokevirtual   com/google/android/exoplayer2/n$a.b:(I)Lcom/google/android/exoplayer2/n$a;
        //  5776: pop            
        //  5777: aload           5
        //  5779: aload           14
        //  5781: putfield        com/google/android/exoplayer2/n$a.k:Ljava/lang/String;
        //  5784: aload           5
        //  5786: iload           11
        //  5788: putfield        com/google/android/exoplayer2/n$a.l:I
        //  5791: aload           5
        //  5793: aload           9
        //  5795: getfield        dog$b.W:Ljava/lang/String;
        //  5798: putfield        com/google/android/exoplayer2/n$a.c:Ljava/lang/String;
        //  5801: aload           5
        //  5803: iload           17
        //  5805: iconst_0       
        //  5806: ior            
        //  5807: iload_3        
        //  5808: ior            
        //  5809: putfield        com/google/android/exoplayer2/n$a.d:I
        //  5812: aload           5
        //  5814: aload           15
        //  5816: putfield        com/google/android/exoplayer2/n$a.m:Ljava/util/List;
        //  5819: aload           5
        //  5821: aload           10
        //  5823: putfield        com/google/android/exoplayer2/n$a.h:Ljava/lang/String;
        //  5826: aload           5
        //  5828: aload           9
        //  5830: getfield        dog$b.l:Lcom/google/android/exoplayer2/drm/b;
        //  5833: putfield        com/google/android/exoplayer2/n$a.n:Lcom/google/android/exoplayer2/drm/b;
        //  5836: aload           5
        //  5838: invokevirtual   com/google/android/exoplayer2/n$a.a:()Lcom/google/android/exoplayer2/n;
        //  5841: astore          6
        //  5843: aload           8
        //  5845: aload           9
        //  5847: getfield        dog$b.c:I
        //  5850: iload_1        
        //  5851: invokeinterface ooa.s:(II)Lovt;
        //  5856: astore          5
        //  5858: aload           9
        //  5860: aload           5
        //  5862: putfield        dog$b.X:Lovt;
        //  5865: aload           5
        //  5867: aload           6
        //  5869: invokeinterface ovt.e:(Lcom/google/android/exoplayer2/n;)V
        //  5874: aload_0        
        //  5875: getfield        dog.c:Landroid/util/SparseArray;
        //  5878: aload           9
        //  5880: getfield        dog$b.c:I
        //  5883: aload           9
        //  5885: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //  5888: aload_0        
        //  5889: aconst_null    
        //  5890: putfield        dog.u:Ldog$b;
        //  5893: goto            6059
        //  5896: ldc_w           "CodecId is missing in TrackEntry element"
        //  5899: aconst_null    
        //  5900: invokestatic    com/google/android/exoplayer2/ParserException.a:(Ljava/lang/String;Ljava/lang/Throwable;)Lcom/google/android/exoplayer2/ParserException;
        //  5903: athrow         
        //  5904: aload_0        
        //  5905: getfield        dog.G:I
        //  5908: iconst_2       
        //  5909: if_icmpeq       5913
        //  5912: return         
        //  5913: iconst_0       
        //  5914: istore          11
        //  5916: iconst_0       
        //  5917: istore_1       
        //  5918: iload           11
        //  5920: aload_0        
        //  5921: getfield        dog.K:I
        //  5924: if_icmpge       5943
        //  5927: iload_1        
        //  5928: aload_0        
        //  5929: getfield        dog.L:[I
        //  5932: iload           11
        //  5934: iaload         
        //  5935: iadd           
        //  5936: istore_1       
        //  5937: iinc            11, 1
        //  5940: goto            5918
        //  5943: aload_0        
        //  5944: getfield        dog.c:Landroid/util/SparseArray;
        //  5947: aload_0        
        //  5948: getfield        dog.M:I
        //  5951: invokevirtual   android/util/SparseArray.get:(I)Ljava/lang/Object;
        //  5954: checkcast       Ldog$b;
        //  5957: astore          6
        //  5959: aload           6
        //  5961: invokestatic    dog$b.a:(Ldog$b;)V
        //  5964: iconst_0       
        //  5965: istore          11
        //  5967: iload           11
        //  5969: aload_0        
        //  5970: getfield        dog.K:I
        //  5973: if_icmpge       6054
        //  5976: aload_0        
        //  5977: getfield        dog.H:J
        //  5980: lstore          20
        //  5982: aload           6
        //  5984: getfield        dog$b.e:I
        //  5987: iload           11
        //  5989: imul           
        //  5990: sipush          1000
        //  5993: idiv           
        //  5994: i2l            
        //  5995: lstore          12
        //  5997: aload_0        
        //  5998: getfield        dog.O:I
        //  6001: istore_2       
        //  6002: iload_2        
        //  6003: istore_3       
        //  6004: iload           11
        //  6006: ifne            6022
        //  6009: iload_2        
        //  6010: istore_3       
        //  6011: aload_0        
        //  6012: getfield        dog.Q:Z
        //  6015: ifne            6022
        //  6018: iload_2        
        //  6019: iconst_1       
        //  6020: ior            
        //  6021: istore_3       
        //  6022: aload_0        
        //  6023: getfield        dog.L:[I
        //  6026: iload           11
        //  6028: iaload         
        //  6029: istore_2       
        //  6030: iload_1        
        //  6031: iload_2        
        //  6032: isub           
        //  6033: istore_1       
        //  6034: aload_0        
        //  6035: aload           6
        //  6037: lload           20
        //  6039: lload           12
        //  6041: ladd           
        //  6042: iload_3        
        //  6043: iload_2        
        //  6044: iload_1        
        //  6045: invokevirtual   dog.f:(Ldog$b;JIII)V
        //  6048: iinc            11, 1
        //  6051: goto            5967
        //  6054: aload_0        
        //  6055: iconst_0       
        //  6056: putfield        dog.G:I
        //  6059: return         
        //  6060: astore          6
        //  6062: goto            4388
        //    Exceptions:
        //  throws com.google.android.exoplayer2.ParserException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                      
        //  -----  -----  -----  -----  ------------------------------------------
        //  3784   3789   4052   4062   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3856   3869   4052   4062   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3881   3894   4052   4062   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3909   3918   4052   4062   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3955   3979   4052   4062   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  3988   3996   4052   4062   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4225   4243   4375   4380   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4279   4329   4375   4380   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4351   4359   6060   6065   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4359   4367   6060   6065   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4367   4375   4375   4380   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4380   4388   6060   6065   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4435   4441   4648   4658   Ljava/lang/ArrayIndexOutOfBoundsException;
        //  4456   4500   4648   4658   Ljava/lang/ArrayIndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_4351:
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
    
    @Override
    public final void i(final ooa a0) {
        this.a0 = a0;
    }
    
    public final void j(final koa koa, final int n) throws IOException {
        final mwj g = this.g;
        if (g.c >= n) {
            return;
        }
        final byte[] a = g.a;
        if (a.length < n) {
            g.a(Math.max(a.length * 2, n));
        }
        final mwj g2 = this.g;
        final byte[] a2 = g2.a;
        final int c = g2.c;
        koa.readFully(a2, c, n - c);
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
            return imw.N(n, r, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", (Throwable)null);
    }
    
    @RequiresNonNull({ "#2.output" })
    public final int m(final koa koa, final dog.dog$b dog$b, int n) throws IOException {
        if ("S_TEXT/UTF8".equals(dog$b.b)) {
            this.n(koa, dog.b0, n);
            n = this.S;
            this.k();
            return n;
        }
        if ("S_TEXT/ASS".equals(dog$b.b)) {
            this.n(koa, dog.d0, n);
            n = this.S;
            this.k();
            return n;
        }
        if ("S_TEXT/WEBVTT".equals(dog$b.b)) {
            this.n(koa, dog.e0, n);
            n = this.S;
            this.k();
            return n;
        }
        final ovt x = dog$b.X;
        final boolean u = this.U;
        boolean b = true;
        if (!u) {
            if (dog$b.h) {
                this.O &= 0xBFFFFFFF;
                final boolean v = this.V;
                int n2 = 128;
                if (!v) {
                    koa.readFully(this.g.a, 0, 1);
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
                        koa.readFully(this.l.a, 0, 8);
                        this.R += 8;
                        this.Z = true;
                        final mwj g = this.g;
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
                            koa.readFully(this.g.a, 0, 1);
                            ++this.R;
                            this.g.D(0);
                            this.X = this.g.t();
                            this.W = true;
                        }
                        final int n3 = this.X * 4;
                        this.g.A(n3);
                        koa.readFully(this.g.a, 0, n3);
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
                final byte[] i = dog$b.i;
                if (i != null) {
                    this.j.B(i, i.length);
                }
            }
            if (dog$b.f > 0) {
                this.O |= 0x10000000;
                this.n.A(0);
                this.g.A(4);
                final mwj g2 = this.g;
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
        if (!"V_MPEG4/ISO/AVC".equals(dog$b.b) && !"V_MPEGH/ISO/HEVC".equals(dog$b.b)) {
            if (dog$b.T != null) {
                if (this.j.c != 0) {
                    b = false;
                }
                ri4.t(b);
                dog$b.T.c(koa);
            }
            while (true) {
                final int r = this.R;
                if (r >= n) {
                    break;
                }
                final int o2 = this.o(koa, x, n - r);
                this.R += o2;
                this.S += o2;
            }
        }
        else {
            final byte[] a4 = this.f.a;
            a4[0] = 0;
            a4[1] = 0;
            a4[2] = 0;
            final int y2 = dog$b.Y;
            final int n9 = 4 - y2;
            while (this.R < n) {
                final int t = this.T;
                if (t == 0) {
                    final mwj j = this.j;
                    final int min = Math.min(y2, j.c - j.b);
                    koa.readFully(a4, n9 + min, y2 - min);
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
                    final int o3 = this.o(koa, x, t);
                    this.R += o3;
                    this.S += o3;
                    this.T -= o3;
                }
            }
        }
        if ("A_VORBIS".equals(dog$b.b)) {
            this.h.D(0);
            x.d(this.h, 4);
            this.S += 4;
        }
        n = this.S;
        this.k();
        return n;
    }
    
    public final void n(final koa koa, final byte[] array, final int n) throws IOException {
        final int n2 = array.length + n;
        final mwj k = this.k;
        final byte[] a = k.a;
        if (a.length < n2) {
            final byte[] copy = Arrays.copyOf(array, n2 + n);
            Objects.requireNonNull(k);
            k.B(copy, copy.length);
        }
        else {
            System.arraycopy(array, 0, a, 0, array.length);
        }
        koa.readFully(this.k.a, array.length, n);
        this.k.D(0);
        this.k.C(n2);
    }
    
    public final int o(final koa koa, final ovt ovt, int n) throws IOException {
        final mwj j = this.j;
        final int n2 = j.c - j.b;
        if (n2 > 0) {
            n = Math.min(n, n2);
            ovt.d(this.j, n);
        }
        else {
            n = ovt.c((v78)koa, n, false);
        }
        return n;
    }
    
    @Override
    public final void release() {
    }
    
    public final class a implements fq9
    {
        public final /* synthetic */ dog a;
    }
}
