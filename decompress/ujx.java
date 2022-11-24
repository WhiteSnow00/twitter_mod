import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.n;
import java.io.IOException;
import java.util.Objects;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.ParserException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ujx implements qoa
{
    public voa a;
    public vwt b;
    public int c;
    public long d;
    public ujx$b e;
    public int f;
    public long g;
    
    static {
        final jtx j0 = jtx.J0;
    }
    
    public ujx() {
        this.c = 0;
        this.d = -1L;
        this.f = -1;
        this.g = -1L;
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        omi.r((Object)this.b);
        final int a = rnw.a;
        final int c = this.c;
        boolean b = true;
        final int n = 0;
        int w = 4;
        if (c == 0) {
            omi.p(roa.getPosition() == 0L);
            final int f = this.f;
            if (f != -1) {
                roa.k(f);
                this.c = 4;
            }
            else {
                if (!wjx.a(roa)) {
                    throw ParserException.a("Unsupported or unrecognized wav file type.", (Throwable)null);
                }
                roa.k((int)(roa.h() - roa.getPosition()));
                this.c = 1;
            }
            return 0;
        }
        long h = -1L;
        if (c == 1) {
            final gxj gxj = new gxj(8);
            final wjx.a a2 = wjx.a.a(roa, gxj);
            if (a2.a != 1685272116) {
                roa.e();
            }
            else {
                roa.i(8);
                gxj.D(0);
                roa.n(gxj.a, 0, 8);
                h = gxj.h();
                roa.k((int)a2.b + 8);
            }
            this.d = h;
            this.c = 2;
            return 0;
        }
        if (c == 2) {
            final gxj gxj2 = new gxj(16);
            final wjx.a b2 = wjx.b(1718449184, roa, gxj2);
            omi.p(b2.b >= 16L);
            roa.n(gxj2.a, 0, 16);
            gxj2.D(0);
            final int l = gxj2.l();
            final int i = gxj2.l();
            final int k = gxj2.k();
            gxj2.k();
            final int j = gxj2.l();
            final int m = gxj2.l();
            final int n2 = (int)b2.b - 16;
            byte[] f2;
            if (n2 > 0) {
                f2 = new byte[n2];
                roa.n(f2, 0, n2);
            }
            else {
                f2 = rnw.f;
            }
            roa.k((int)(roa.h() - roa.getPosition()));
            final vjx vjx = new vjx(l, i, k, j, m, f2);
            if (l == 17) {
                this.e = (ujx$b)new a(this.a, this.b, vjx);
            }
            else if (l == 6) {
                this.e = (ujx$b)new c(this.a, this.b, vjx, "audio/g711-alaw", -1);
            }
            else if (l == 7) {
                this.e = (ujx$b)new c(this.a, this.b, vjx, "audio/g711-mlaw", -1);
            }
            else {
                Label_0692: {
                    if (l != 1) {
                        if (l != 3) {
                            if (l != 65534) {
                                w = 0;
                                break Label_0692;
                            }
                        }
                        else {
                            if (m == 32) {
                                break Label_0692;
                            }
                            w = 0;
                            break Label_0692;
                        }
                    }
                    w = rnw.w(m);
                }
                if (w == 0) {
                    final StringBuilder sb = new StringBuilder(40);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(l);
                    throw ParserException.c(sb.toString());
                }
                this.e = (ujx$b)new c(this.a, this.b, vjx, "audio/raw", w);
            }
            this.c = 3;
            return 0;
        }
        if (c == 3) {
            roa.e();
            final wjx.a b3 = wjx.b(1684108385, roa, new gxj(8));
            roa.k(8);
            final Pair create = Pair.create((Object)roa.getPosition(), (Object)b3.b);
            this.f = ((Long)create.first).intValue();
            final long longValue = (long)create.second;
            final long d = this.d;
            long n3 = longValue;
            if (d != -1L) {
                n3 = longValue;
                if (longValue == 4294967295L) {
                    n3 = d;
                }
            }
            this.g = this.f + n3;
            final long length = roa.getLength();
            if (length != -1L) {
                final long g = this.g;
                if (g > length) {
                    final StringBuilder sb2 = new StringBuilder(69);
                    sb2.append("Data exceeds input length: ");
                    sb2.append(g);
                    sb2.append(", ");
                    sb2.append(length);
                    Log.w("WavExtractor", sb2.toString());
                    this.g = length;
                }
            }
            final ujx$b e = this.e;
            Objects.requireNonNull(e);
            e.a(this.f, this.g);
            this.c = 4;
            return 0;
        }
        if (c == 4) {
            if (this.g == -1L) {
                b = false;
            }
            omi.p(b);
            final long g2 = this.g;
            final long position = roa.getPosition();
            final ujx$b e2 = this.e;
            Objects.requireNonNull(e2);
            int n4 = n;
            if (e2.c(roa, g2 - position)) {
                n4 = -1;
            }
            return n4;
        }
        throw new IllegalStateException();
    }
    
    public final boolean b(final roa roa) throws IOException {
        return wjx.a(roa);
    }
    
    public final void c(final long n, final long n2) {
        int c;
        if (n == 0L) {
            c = 0;
        }
        else {
            c = 4;
        }
        this.c = c;
        final ujx$b e = this.e;
        if (e != null) {
            e.b(n2);
        }
    }
    
    public final void i(final voa a) {
        this.a = a;
        this.b = a.r(0, 1);
        a.p();
    }
    
    public final void release() {
    }
    
    public static final class a implements ujx$b
    {
        public static final int[] m;
        public static final int[] n;
        public final voa a;
        public final vwt b;
        public final vjx c;
        public final int d;
        public final byte[] e;
        public final gxj f;
        public final int g;
        public final n h;
        public int i;
        public long j;
        public int k;
        public long l;
        
        static {
            m = new int[] { -1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8 };
            n = new int[] { 7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767 };
        }
        
        public a(final voa a, final vwt b, final vjx c) throws ParserException {
            this.a = a;
            this.b = b;
            this.c = c;
            final int max = Math.max(1, c.b / 10);
            this.g = max;
            final byte[] e = c.e;
            final int length = e.length;
            final byte b2 = e[0];
            final byte b3 = e[1];
            final int d = (e[3] & 0xFF) << 8 | (e[2] & 0xFF);
            this.d = d;
            final int a2 = c.a;
            final int c2 = c.c;
            final int n = (c2 - a2 * 4) * 8 / (c.d * a2) + 1;
            if (d == n) {
                final int a3 = rnw.a;
                final int n2 = (max + d - 1) / d;
                this.e = new byte[c2 * n2];
                this.f = new gxj(d * 2 * a2 * n2);
                final int b4 = c.b;
                final int n3 = c.c * b4 * 8 / d;
                final n$a n$a = new n$a();
                n$a.k = "audio/raw";
                n$a.f = n3;
                n$a.g = n3;
                n$a.l = max * 2 * a2;
                n$a.x = c.a;
                n$a.y = b4;
                n$a.z = 2;
                this.h = new n(n$a);
                return;
            }
            final StringBuilder sb = new StringBuilder(56);
            sb.append("Expected frames per block: ");
            sb.append(n);
            sb.append("; got: ");
            sb.append(d);
            throw ParserException.a(sb.toString(), (Throwable)null);
        }
        
        public final void a(final int n, final long n2) {
            this.a.l((qcp)new xjx(this.c, this.d, (long)n, n2));
            this.b.e(this.h);
        }
        
        public final void b(final long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }
        
        public final boolean c(final roa roa, final long n) throws IOException {
            final int g = this.g;
            final int d = this.d(this.k);
            final int d2 = this.d;
            final int a = rnw.a;
            final int n2 = (g - d + d2 - 1) / d2 * this.c.c;
            while (true) {
                Label_0117: {
                    if (n == 0L) {
                        break Label_0117;
                    }
                    final boolean b = false;
                    while (!b) {
                        final int i = this.i;
                        if (i >= n2) {
                            break;
                        }
                        final int b2 = roa.b(this.e, this.i, (int)Math.min(n2 - i, n));
                        if (b2 == -1) {
                            break Label_0117;
                        }
                        this.i += b2;
                    }
                    final int n3 = this.i / this.c.c;
                    if (n3 > 0) {
                        final byte[] e = this.e;
                        final gxj f = this.f;
                        for (int j = 0; j < n3; ++j) {
                            int n4 = 0;
                            while (true) {
                                final vjx c = this.c;
                                final int a2 = c.a;
                                if (n4 >= a2) {
                                    break;
                                }
                                final byte[] a3 = f.a;
                                final int c2 = c.c;
                                final int n5 = n4 * 4 + j * c2;
                                final int n6 = c2 / a2 - 4;
                                int k = (short)((e[n5] & 0xFF) | (e[n5 + 1] & 0xFF) << 8);
                                int n7 = Math.min(e[n5 + 2] & 0xFF, 88);
                                int n8 = ujx.a.n[n7];
                                int n9 = (this.d * j * a2 + n4) * 2;
                                a3[n9] = (byte)(k & 0xFF);
                                a3[n9 + 1] = (byte)(k >> 8);
                                for (int l = 0; l < n6 * 2; ++l) {
                                    final int n10 = e[l / 8 * a2 * 4 + (a2 * 4 + n5) + l / 2 % 4] & 0xFF;
                                    int n11;
                                    if (l % 2 == 0) {
                                        n11 = (n10 & 0xF);
                                    }
                                    else {
                                        n11 = n10 >> 4;
                                    }
                                    int n12 = ((n11 & 0x7) * 2 + 1) * n8 >> 3;
                                    if ((n11 & 0x8) != 0x0) {
                                        n12 = -n12;
                                    }
                                    k = rnw.i(k + n12, -32768, 32767);
                                    n9 += a2 * 2;
                                    a3[n9] = (byte)(k & 0xFF);
                                    a3[n9 + 1] = (byte)(k >> 8);
                                    final int n13 = ujx.a.m[n11];
                                    final int[] n14 = ujx.a.n;
                                    n7 = rnw.i(n7 + n13, 0, 88);
                                    n8 = n14[n7];
                                }
                                ++n4;
                            }
                        }
                        final int d3 = this.d;
                        final int a4 = this.c.a;
                        f.D(0);
                        f.C(d3 * n3 * 2 * a4);
                        this.i -= n3 * this.c.c;
                        final gxj f2 = this.f;
                        final int c3 = f2.c;
                        this.b.d(f2, c3);
                        final int m = this.k + c3;
                        this.k = m;
                        final int d4 = this.d(m);
                        final int g2 = this.g;
                        if (d4 >= g2) {
                            this.e(g2);
                        }
                    }
                    if (b) {
                        final int d5 = this.d(this.k);
                        if (d5 > 0) {
                            this.e(d5);
                        }
                    }
                    return b;
                }
                final boolean b = true;
                continue;
            }
        }
        
        public final int d(final int n) {
            return n / (this.c.a * 2);
        }
        
        public final void e(final int n) {
            final long j = this.j;
            final long n2 = rnw.N(this.l, 1000000L, (long)this.c.b);
            final int n3 = n * 2 * this.c.a;
            this.b.b(j + n2, 1, n3, this.k - n3, (vwt$a)null);
            this.l += n;
            this.k -= n3;
        }
    }
    
    public static final class c implements ujx$b
    {
        public final voa a;
        public final vwt b;
        public final vjx c;
        public final n d;
        public final int e;
        public long f;
        public int g;
        public long h;
        
        public c(final voa a, final vwt b, final vjx c, final String k, final int z) throws ParserException {
            this.a = a;
            this.b = b;
            this.c = c;
            final int n = c.a * c.d / 8;
            final int c2 = c.c;
            if (c2 == n) {
                final int n2 = c.b * n;
                final int n3 = n2 * 8;
                final int max = Math.max(n, n2 / 10);
                this.e = max;
                final n$a n$a = new n$a();
                n$a.k = k;
                n$a.f = n3;
                n$a.g = n3;
                n$a.l = max;
                n$a.x = c.a;
                n$a.y = c.b;
                n$a.z = z;
                this.d = new n(n$a);
                return;
            }
            final StringBuilder sb = new StringBuilder(50);
            sb.append("Expected block size: ");
            sb.append(n);
            sb.append("; got: ");
            sb.append(c2);
            throw ParserException.a(sb.toString(), (Throwable)null);
        }
        
        public final void a(final int n, final long n2) {
            this.a.l((qcp)new xjx(this.c, 1, (long)n, n2));
            this.b.e(this.d);
        }
        
        public final void b(final long f) {
            this.f = f;
            this.g = 0;
            this.h = 0L;
        }
        
        public final boolean c(final roa roa, long n) throws IOException {
            boolean b;
            long n2;
            while (true) {
                b = true;
                n2 = lcmp(n, 0L);
                if (n2 <= 0) {
                    break;
                }
                final int g = this.g;
                final int e = this.e;
                if (g >= e) {
                    break;
                }
                final int c = this.b.c((k88)roa, (int)Math.min(e - g, n), true);
                if (c == -1) {
                    n = 0L;
                }
                else {
                    this.g += c;
                    n -= c;
                }
            }
            final vjx c2 = this.c;
            final int c3 = c2.c;
            final int n3 = this.g / c3;
            if (n3 > 0) {
                final long f = this.f;
                n = rnw.N(this.h, 1000000L, (long)c2.b);
                final int n4 = n3 * c3;
                final int g2 = this.g - n4;
                this.b.b(f + n, 1, n4, g2, (vwt$a)null);
                this.h += n3;
                this.g = g2;
            }
            if (n2 > 0) {
                b = false;
            }
            return b;
        }
    }
}
