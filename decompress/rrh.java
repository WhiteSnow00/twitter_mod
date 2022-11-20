import com.google.android.exoplayer2.drm.b;
import android.util.Pair;
import android.util.Log;
import java.io.IOException;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import java.util.Objects;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class rrh implements ina, vbp
{
    public static final int y = 0;
    public final int a;
    public final rwj b;
    public final rwj c;
    public final rwj d;
    public final rwj e;
    public final ArrayDeque<fx0$a> f;
    public final kcp g;
    public final List<z8h$b> h;
    public int i;
    public int j;
    public long k;
    public int l;
    public rwj m;
    public int n;
    public int o;
    public int p;
    public int q;
    public nna r;
    public rrh.rrh$a[] s;
    public long[][] t;
    public int u;
    public long v;
    public int w;
    public hrh x;
    
    static {
        final c71 k0 = c71.K0;
    }
    
    public rrh(int n) {
        this.a = n;
        if ((n & 0x4) != 0x0) {
            n = 3;
        }
        else {
            n = 0;
        }
        this.i = n;
        this.g = new kcp();
        this.h = new ArrayList();
        this.e = new rwj(16);
        this.f = new ArrayDeque<fx0$a>();
        this.b = new rwj(g6i.a);
        this.c = new rwj(4);
        this.d = new rwj();
        this.n = -1;
    }
    
    public static long k(final fwt fwt, final long n, final long n2) {
        int n3;
        if ((n3 = fwt.a(n)) == -1) {
            n3 = fwt.b(n);
        }
        if (n3 == -1) {
            return n2;
        }
        return Math.min(fwt.c[n3], n2);
    }
    
    @Override
    public final int a(final jna jna, final zrk zrk) throws IOException {
        while (true) {
            final int i = this.i;
            final boolean b = false;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        final long position = jna.getPosition();
                        if (this.n == -1) {
                            long n = Long.MAX_VALUE;
                            long n3;
                            long n2 = n3 = Long.MAX_VALUE;
                            int n4 = -1;
                            int n5 = -1;
                            int n6 = 1;
                            int n7 = 1;
                            int n8 = 0;
                            while (true) {
                                final rrh.rrh$a[] s = this.s;
                                final int a = cnw.a;
                                if (n8 >= s.length) {
                                    break;
                                }
                                final rrh.rrh$a rrh$a = s[n8];
                                final int e = rrh$a.e;
                                final fwt b2 = rrh$a.b;
                                long n9;
                                if (e == b2.b) {
                                    n9 = n;
                                }
                                else {
                                    final long n10 = b2.c[e];
                                    final long n11 = this.t[n8][e];
                                    final long n12 = n10 - position;
                                    int n13;
                                    if (n12 >= 0L && n12 < 262144L) {
                                        n13 = 0;
                                    }
                                    else {
                                        n13 = 1;
                                    }
                                    int n14 = 0;
                                    int n15 = 0;
                                    long n16 = 0L;
                                    long n17 = 0L;
                                    Label_1267: {
                                        if (n13 != 0 || n7 == 0) {
                                            n14 = n5;
                                            n15 = n7;
                                            n16 = n2;
                                            n17 = n3;
                                            if (n13 != n7) {
                                                break Label_1267;
                                            }
                                            n14 = n5;
                                            n15 = n7;
                                            n16 = n2;
                                            n17 = n3;
                                            if (n12 >= n3) {
                                                break Label_1267;
                                            }
                                        }
                                        n15 = n13;
                                        n14 = n8;
                                        n17 = n12;
                                        n16 = n11;
                                    }
                                    n5 = n14;
                                    n7 = n15;
                                    n9 = n;
                                    n2 = n16;
                                    n3 = n17;
                                    if (n11 < n) {
                                        n4 = n8;
                                        n3 = n17;
                                        n2 = n16;
                                        n9 = n11;
                                        n7 = n15;
                                        n6 = n13;
                                        n5 = n14;
                                    }
                                }
                                ++n8;
                                n = n9;
                            }
                            if (n == Long.MAX_VALUE || n6 == 0 || n2 < n + 10485760L) {
                                n4 = n5;
                            }
                            if ((this.n = n4) == -1) {
                                return -1;
                            }
                        }
                        final rrh.rrh$a[] s2 = this.s;
                        final int a2 = cnw.a;
                        final rrh.rrh$a rrh$a2 = s2[this.n];
                        final ewt c = rrh$a2.c;
                        final int e2 = rrh$a2.e;
                        final fwt b3 = rrh$a2.b;
                        final long a3 = b3.c[e2];
                        final int n19 = b3.d[e2];
                        final a4u d = rrh$a2.d;
                        final long n20 = a3 - position + this.o;
                        int n18;
                        if (n20 >= 0L && n20 < 262144L) {
                            long n21 = n20;
                            int n22 = n19;
                            if (rrh$a2.a.g == 1) {
                                n21 = n20 + 8L;
                                n22 = n19 - 8;
                            }
                            jna.k((int)n21);
                            final yvt a4 = rrh$a2.a;
                            final int j = a4.j;
                            int n24;
                            if (j != 0) {
                                final byte[] a5 = this.c.a;
                                a5[0] = 0;
                                a5[2] = (a5[1] = 0);
                                final int n23 = 4 - j;
                                while (true) {
                                    n24 = n22;
                                    if (this.p >= n22) {
                                        break;
                                    }
                                    final int q = this.q;
                                    if (q == 0) {
                                        jna.readFully(a5, n23, j);
                                        this.o += j;
                                        this.c.D(0);
                                        final int e3 = this.c.e();
                                        if (e3 < 0) {
                                            throw ParserException.a("Invalid NAL length", (Throwable)null);
                                        }
                                        this.q = e3;
                                        this.b.D(0);
                                        c.d(this.b, 4);
                                        this.p += 4;
                                        n22 += n23;
                                    }
                                    else {
                                        final int c2 = c.c((h78)jna, q, false);
                                        this.o += c2;
                                        this.p += c2;
                                        this.q -= c2;
                                    }
                                }
                            }
                            else {
                                int n25;
                                if ("audio/ac4".equals(a4.f.O0)) {
                                    if (this.p == 0) {
                                        ff.a(n22, this.d);
                                        c.d(this.d, 7);
                                        this.p += 7;
                                    }
                                    n25 = n22 + 7;
                                }
                                else {
                                    n25 = n22;
                                    if (d != null) {
                                        d.c(jna);
                                        n25 = n22;
                                    }
                                }
                                while (true) {
                                    final int p2 = this.p;
                                    if (p2 >= (n24 = n25)) {
                                        break;
                                    }
                                    final int c3 = c.c((h78)jna, n25 - p2, false);
                                    this.o += c3;
                                    this.p += c3;
                                    this.q -= c3;
                                }
                            }
                            final fwt b4 = rrh$a2.b;
                            final long n26 = b4.f[e2];
                            final int n27 = b4.g[e2];
                            if (d != null) {
                                d.b(c, n26, n27, n24, 0, (ewt.a)null);
                                if (e2 + 1 == rrh$a2.b.b) {
                                    d.a(c, (ewt.a)null);
                                }
                            }
                            else {
                                c.b(n26, n27, n24, 0, null);
                            }
                            ++rrh$a2.e;
                            this.n = -1;
                            this.o = 0;
                            this.p = 0;
                            this.q = 0;
                            n18 = 0;
                        }
                        else {
                            zrk.a = a3;
                            n18 = 1;
                        }
                        return n18;
                    }
                    if (i == 3) {
                        final kcp g = this.g;
                        final ArrayList h = this.h;
                        final int b5 = g.b;
                        if (b5 != 0) {
                            if (b5 != 1) {
                                if (b5 != 2) {
                                    if (b5 != 3) {
                                        throw new IllegalStateException();
                                    }
                                    final long position2 = jna.getPosition();
                                    final int n28 = (int)(jna.getLength() - jna.getPosition() - g.c);
                                    final rwj rwj = new rwj(n28);
                                    jna.readFully(rwj.a, 0, n28);
                                    for (int k = 0; k < g.a.size(); ++k) {
                                        final kcp$a kcp$a = g.a.get(k);
                                        rwj.D((int)(kcp$a.a - position2));
                                        rwj.E(4);
                                        final int g2 = rwj.g();
                                        final String q2 = rwj.q(g2);
                                        int n29 = 0;
                                        Label_0331: {
                                            switch (q2) {
                                                case "Super_SlowMotion_BGM": {
                                                    n29 = 4;
                                                    break Label_0331;
                                                }
                                                case "Super_SlowMotion_Deflickering_On": {
                                                    n29 = 3;
                                                    break Label_0331;
                                                }
                                                case "Super_SlowMotion_Data": {
                                                    n29 = 2;
                                                    break Label_0331;
                                                }
                                                case "Super_SlowMotion_Edit_Data": {
                                                    n29 = 1;
                                                    break Label_0331;
                                                }
                                                case "SlowMotion_Data": {
                                                    n29 = 0;
                                                    break Label_0331;
                                                }
                                                default:
                                                    break;
                                            }
                                            n29 = -1;
                                        }
                                        int n30;
                                        if (n29 != 0) {
                                            if (n29 != 1) {
                                                if (n29 != 2) {
                                                    if (n29 != 3) {
                                                        if (n29 != 4) {
                                                            throw ParserException.a("Invalid SEF name", (Throwable)null);
                                                        }
                                                        n30 = 2817;
                                                    }
                                                    else {
                                                        n30 = 2820;
                                                    }
                                                }
                                                else {
                                                    n30 = 2816;
                                                }
                                            }
                                            else {
                                                n30 = 2819;
                                            }
                                        }
                                        else {
                                            n30 = 2192;
                                        }
                                        final int b6 = kcp$a.b;
                                        if (n30 != 2192) {
                                            if (n30 != 2816 && n30 != 2817 && n30 != 2819) {
                                                if (n30 != 2820) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                        }
                                        else {
                                            final ArrayList<sfq$b> list = new ArrayList<sfq$b>();
                                            final List a6 = kcp.e.a((CharSequence)rwj.q(b6 - (g2 + 8)));
                                            int l = 0;
                                            while (l < a6.size()) {
                                                final List a7 = kcp.d.a((CharSequence)a6.get(l));
                                                if (a7.size() == 3) {
                                                    try {
                                                        list.add(new sfq$b(Long.parseLong((String)a7.get(0)), Long.parseLong((String)a7.get(1)), 1 << Integer.parseInt((String)a7.get(2)) - 1));
                                                        ++l;
                                                        continue;
                                                    }
                                                    catch (final NumberFormatException ex) {
                                                        throw ParserException.a((String)null, (Throwable)ex);
                                                    }
                                                }
                                                throw ParserException.a((String)null, (Throwable)null);
                                            }
                                            h.add(new sfq((List)list));
                                        }
                                    }
                                    zrk.a = 0L;
                                }
                                else {
                                    final long length = jna.getLength();
                                    final int n31 = g.c - 12 - 8;
                                    final rwj rwj2 = new rwj(n31);
                                    jna.readFully(rwj2.a, 0, n31);
                                    for (int n32 = 0; n32 < n31 / 12; ++n32) {
                                        rwj2.E(2);
                                        final short m = rwj2.i();
                                        if (m != 2192) {
                                            if (m != 2816 && m != 2817 && m != 2819) {
                                                if (m != 2820) {
                                                    rwj2.E(8);
                                                    continue;
                                                }
                                            }
                                        }
                                        g.a.add(new kcp$a(length - g.c - rwj2.g(), rwj2.g()));
                                    }
                                    if (g.a.isEmpty()) {
                                        zrk.a = 0L;
                                    }
                                    else {
                                        g.b = 3;
                                        zrk.a = ((kcp$a)g.a.get(0)).a;
                                    }
                                }
                            }
                            else {
                                final rwj rwj3 = new rwj(8);
                                jna.readFully(rwj3.a, 0, 8);
                                g.c = rwj3.g() + 8;
                                if (rwj3.e() != 1397048916) {
                                    zrk.a = 0L;
                                }
                                else {
                                    zrk.a = jna.getPosition() - (g.c - 12);
                                    g.b = 2;
                                }
                            }
                        }
                        else {
                            final long length2 = jna.getLength();
                            long a8;
                            if (length2 != -1L && length2 >= 8L) {
                                a8 = length2 - 8L;
                            }
                            else {
                                a8 = 0L;
                            }
                            zrk.a = a8;
                            g.b = 1;
                        }
                        if (zrk.a == 0L) {
                            this.j();
                        }
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                else {
                    final long n33 = this.k - this.l;
                    final long position3 = jna.getPosition();
                    final rwj m2 = this.m;
                    boolean b7 = false;
                    Label_2270: {
                        if (m2 != null) {
                            jna.readFully(m2.a, this.l, (int)n33);
                            if (this.j == 1718909296) {
                                m2.D(8);
                                final int e4 = m2.e();
                                int w;
                                if (e4 != 1751476579) {
                                    if (e4 != 1903435808) {
                                        w = 0;
                                    }
                                    else {
                                        w = 1;
                                    }
                                }
                                else {
                                    w = 2;
                                }
                                Label_2171: {
                                    if (w == 0) {
                                        m2.E(4);
                                        while (m2.c - m2.b > 0) {
                                            final int e5 = m2.e();
                                            if (e5 != 1751476579) {
                                                if (e5 != 1903435808) {
                                                    w = 0;
                                                }
                                                else {
                                                    w = 1;
                                                }
                                            }
                                            else {
                                                w = 2;
                                            }
                                            if (w != 0) {
                                                break Label_2171;
                                            }
                                        }
                                        w = 0;
                                    }
                                }
                                this.w = w;
                            }
                            else if (!this.f.isEmpty()) {
                                this.f.peek().c.add(new fx0$b(this.j, m2));
                            }
                        }
                        else {
                            if (n33 >= 262144L) {
                                zrk.a = jna.getPosition() + n33;
                                b7 = true;
                                break Label_2270;
                            }
                            jna.k((int)n33);
                        }
                        b7 = false;
                    }
                    this.l(position3 + n33);
                    int n34 = b ? 1 : 0;
                    if (b7) {
                        n34 = (b ? 1 : 0);
                        if (this.i != 2) {
                            n34 = 1;
                        }
                    }
                    if (n34 != 0) {
                        return 1;
                    }
                    continue;
                }
            }
            else {
                boolean b8 = false;
                Label_3214: {
                    if (this.l == 0) {
                        if (!jna.f(this.e.a, 0, 8, true)) {
                            if (this.w == 2 && (this.a & 0x2) != 0x0) {
                                final nna r = this.r;
                                Objects.requireNonNull(r);
                                final ewt n35 = r.n(0, 4);
                                final hrh x = this.x;
                                z8h i2;
                                if (x == null) {
                                    i2 = null;
                                }
                                else {
                                    i2 = new z8h(new z8h$b[] { (z8h$b)x });
                                }
                                final n$a n$a = new n$a();
                                n$a.i = i2;
                                n35.e(new n(n$a));
                                r.m();
                                r.l((vbp)new vbp.b(-9223372036854775807L));
                            }
                            b8 = false;
                            break Label_3214;
                        }
                        this.l = 8;
                        this.e.D(0);
                        this.k = this.e.u();
                        this.j = this.e.e();
                    }
                    final long k2 = this.k;
                    if (k2 == 1L) {
                        jna.readFully(this.e.a, 8, 8);
                        this.l += 8;
                        this.k = this.e.x();
                    }
                    else if (k2 == 0L) {
                        long n37;
                        final long n36 = n37 = jna.getLength();
                        if (n36 == -1L) {
                            final fx0$a fx0$a = this.f.peek();
                            n37 = n36;
                            if (fx0$a != null) {
                                n37 = fx0$a.b;
                            }
                        }
                        if (n37 != -1L) {
                            this.k = n37 - jna.getPosition() + this.l;
                        }
                    }
                    final long k3 = this.k;
                    final int l2 = this.l;
                    if (k3 < l2) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    final int j2 = this.j;
                    if (j2 == 1836019574 || j2 == 1953653099 || j2 == 1835297121 || j2 == 1835626086 || j2 == 1937007212 || j2 == 1701082227 || j2 == 1835365473) {
                        final long position4 = jna.getPosition();
                        final long k4 = this.k;
                        final long n38 = this.l;
                        final long n39 = position4 + k4 - n38;
                        if (k4 != n38 && this.j == 1835365473) {
                            this.d.A(8);
                            jna.n(this.d.a, 0, 8);
                            gx0.a(this.d);
                            jna.k(this.d.b);
                            jna.e();
                        }
                        this.f.push(new fx0$a(this.j, n39));
                        if (this.k == this.l) {
                            this.l(n39);
                        }
                        else {
                            this.j();
                        }
                    }
                    else if (j2 == 1835296868 || j2 == 1836476516 || j2 == 1751411826 || j2 == 1937011556 || j2 == 1937011827 || j2 == 1937011571 || j2 == 1668576371 || j2 == 1701606260 || j2 == 1937011555 || j2 == 1937011578 || j2 == 1937013298 || j2 == 1937007471 || j2 == 1668232756 || j2 == 1953196132 || j2 == 1718909296 || j2 == 1969517665 || j2 == 1801812339 || j2 == 1768715124) {
                        omy.k(l2 == 8);
                        omy.k(this.k <= 2147483647L);
                        final rwj m3 = new rwj((int)this.k);
                        System.arraycopy(this.e.a, 0, m3.a, 0, 8);
                        this.m = m3;
                        this.i = 1;
                    }
                    else {
                        final long position5 = jna.getPosition();
                        final long n40 = this.l;
                        final long n41 = position5 - n40;
                        if (this.j == 1836086884) {
                            this.x = new hrh(0L, n41, -9223372036854775807L, n41 + n40, this.k - n40);
                        }
                        this.m = null;
                        this.i = 1;
                    }
                    b8 = true;
                }
                if (!b8) {
                    return -1;
                }
                continue;
            }
        }
    }
    
    @Override
    public final boolean b(final jna jna) throws IOException {
        return wj1.v(jna, false, (this.a & 0x2) != 0x0);
    }
    
    @Override
    public final void c(final long n, final long n2) {
        this.f.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        if (n == 0L) {
            if (this.i != 3) {
                this.j();
            }
            else {
                final kcp g = this.g;
                g.a.clear();
                g.b = 0;
                this.h.clear();
            }
        }
        else {
            final rrh.rrh$a[] s = this.s;
            if (s != null) {
                for (final rrh.rrh$a rrh$a : s) {
                    final fwt b = rrh$a.b;
                    int e;
                    if ((e = b.a(n2)) == -1) {
                        e = b.b(n2);
                    }
                    rrh$a.e = e;
                    final a4u d = rrh$a.d;
                    if (d != null) {
                        d.b = false;
                        d.c = 0;
                    }
                }
            }
        }
    }
    
    public final vbp$a d(long n) {
        final rrh.rrh$a[] s = this.s;
        Objects.requireNonNull(s);
        if (s.length == 0) {
            final xbp c = xbp.c;
            return new vbp$a(c, c);
        }
        final int u = this.u;
        long n3;
        long n6;
        long n7;
        if (u != -1) {
            final fwt b = this.s[u].b;
            int n2;
            if ((n2 = b.a(n)) == -1) {
                n2 = b.b(n);
            }
            if (n2 == -1) {
                final xbp c2 = xbp.c;
                return new vbp$a(c2, c2);
            }
            n3 = b.f[n2];
            final long n4 = b.c[n2];
            long n5 = 0L;
            Label_0189: {
                if (n3 < n && n2 < b.b - 1) {
                    final int b2 = b.b(n);
                    if (b2 != -1 && b2 != n2) {
                        n = b.f[b2];
                        n5 = b.c[b2];
                        break Label_0189;
                    }
                }
                n5 = -1L;
                n = -9223372036854775807L;
            }
            n6 = n;
            n = n5;
            n7 = n4;
        }
        else {
            n7 = Long.MAX_VALUE;
            final long n8 = -1L;
            n6 = -9223372036854775807L;
            n3 = n;
            n = n8;
        }
        int n9 = 0;
        while (true) {
            final rrh.rrh$a[] s2 = this.s;
            if (n9 >= s2.length) {
                break;
            }
            long n10 = n;
            long k = n7;
            if (n9 != this.u) {
                final fwt b3 = s2[n9].b;
                k = k(b3, n3, n7);
                long i = n;
                if (n6 != -9223372036854775807L) {
                    i = k(b3, n6, n);
                }
                n10 = i;
            }
            ++n9;
            n = n10;
            n7 = k;
        }
        final xbp xbp = new xbp(n3, n7);
        if (n6 == -9223372036854775807L) {
            return new vbp$a(xbp, xbp);
        }
        return new vbp$a(xbp, new xbp(n6, n));
    }
    
    public final boolean f() {
        return true;
    }
    
    public final long h() {
        return this.v;
    }
    
    @Override
    public final void i(final nna r) {
        this.r = r;
    }
    
    public final void j() {
        this.i = 0;
        this.l = 0;
    }
    
    public final void l(final long n) throws ParserException {
        rrh rrh2;
        fx0$a fx0$a;
        ArrayList<rrh.rrh$a> list;
        boolean b;
        ixb ixb;
        fx0$b c;
        byte[] a;
        rwj b2;
        Object o;
        Object o2;
        int c2;
        int b3;
        int e;
        int e2;
        int b4;
        int e3;
        int n2;
        ArrayList<Throwable> list2;
        ArrayList<rrh.rrh$a> list3;
        int b5;
        int n3;
        int n4;
        int n5;
        String[] a2;
        String s = null;
        gis gis;
        int e4;
        String o3;
        int b6;
        String o4;
        int e5;
        kxd kxd;
        Object o5 = null;
        String value;
        String concat;
        Object o6 = null;
        Object o7 = null;
        Object o8 = null;
        ArrayList<rrh.rrh$a> list4;
        int b7;
        int e6;
        int t;
        float n6;
        Pair create;
        z8h z8h;
        z8h z8h3;
        z8h z8h2;
        z8h z8h4;
        ArrayList<rrh.rrh$a> list5;
        fx0$a b8;
        byte[] a3;
        fx0$b c3;
        fx0$b c4;
        fx0$b c5;
        rwj b9;
        rwj b10;
        int e7;
        String[] array;
        int e8;
        rwj b11;
        ArrayList<Object> list6;
        int n7;
        int c6;
        int b12;
        int e9;
        int n8;
        String s2;
        int b13;
        Object o9;
        int e10;
        int e11;
        int e12;
        byte[] array2;
        String[] array3;
        int n9;
        z8h z8h5 = null;
        List<fwt> f;
        nna r;
        ArrayList list7;
        int size;
        long max;
        int j;
        int size2;
        ArrayList<rrh.rrh$a> list8;
        z8h z8h6;
        z8h z8h7;
        fwt fwt;
        z8h z8h8;
        rrh rrh3;
        z8h z8h9;
        z8h z8h10;
        yvt a4;
        long n10;
        rrh.rrh$a rrh$a;
        int l;
        n$a n$a;
        int b14;
        int b15;
        int a5;
        z8h z8h11;
        z8h z8h12;
        z8h z8h13;
        z8h z8h14;
        z8h b16;
        z8h z8h15;
        rrh.rrh$a[] s3;
        long[][] t2;
        int[] array4;
        long[] array5;
        boolean[] array6;
        int n12;
        long n13;
        long n14;
        int n15;
        int n16;
        long n17;
        int n18;
        int n19;
        rrh rrh4;
        rrh rrh5;
        int n20;
        z8h$b[] d0;
        aqg aqg;
        final z8h z8h16;
        z8h z8h17;
        z8h$b z8h$b;
        String d2;
        z8h z8h18;
        Block_68_Outer:Block_67_Outer:
        while (true) {
            for (rrh rrh = rrh2 = this; !rrh2.f.isEmpty() && rrh2.f.peek().b == n; rrh2 = rrh4) {
                fx0$a = rrh2.f.pop();
                if (((fx0)fx0$a).a == 1836019574) {
                    list = new ArrayList<rrh.rrh$a>();
                    b = (rrh2.w == 1);
                    ixb = new ixb();
                    c = fx0$a.c(1969517665);
                    if (c != null) {
                        a = gx0.a;
                        b2 = c.b;
                        b2.D(8);
                        o = null;
                        o2 = null;
                        while (true) {
                            c2 = b2.c;
                            b3 = b2.b;
                            if (c2 - b3 >= 8) {
                                e = b2.e();
                                e2 = b2.e();
                                Label_1559: {
                                    if (e2 == 1835365473) {
                                        b2.D(b3);
                                        b2.E(8);
                                        gx0.a(b2);
                                        Label_1347: {
                                        Label_1344:
                                            while (true) {
                                                b4 = b2.b;
                                                if (b4 >= b3 + e) {
                                                    break;
                                                }
                                                e3 = b2.e();
                                                if (b2.e() == 1768715124) {
                                                    b2.D(b4);
                                                    n2 = b4 + e3;
                                                    b2.E(8);
                                                    list2 = new ArrayList<Throwable>();
                                                    list3 = list;
                                                    Label_0890_Outer:Block_100_Outer:Block_99_Outer:
                                                    while (true) {
                                                        b5 = b2.b;
                                                        if (b5 < n2) {
                                                            n3 = b2.e() + b5;
                                                            n4 = b2.e();
                                                            n5 = (n4 >> 24 & 0xFF);
                                                            Label_1292: {
                                                                Label_1269: {
                                                                    Label_1236: {
                                                                        Label_0952: {
                                                                            if (n5 == 169 || n5 == 253) {
                                                                                break Label_0952;
                                                                            }
                                                                            Label_0416: {
                                                                                if (n4 != 1735291493) {
                                                                                    break Label_0416;
                                                                                }
                                                                                try {
                                                                                    n4 = u9h.f(b2);
                                                                                    Label_0380: {
                                                                                        if (n4 > 0) {
                                                                                            a2 = u9h.a;
                                                                                            if (n4 <= 192) {
                                                                                                s = a2[n4 - 1];
                                                                                                break Label_0380;
                                                                                            }
                                                                                        }
                                                                                        s = null;
                                                                                    }
                                                                                    if (s != null) {
                                                                                        gis = new gis("TCON", null, s);
                                                                                        break Label_1269;
                                                                                    }
                                                                                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                                    break Label_1236;
                                                                                    while (true) {
                                                                                        Block_89:Block_92_Outer:
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                            Label_0890:
                                                                                                while (true) {
                                                                                                Block_103:
                                                                                                    while (true) {
                                                                                                    Block_98_Outer:
                                                                                                        while (true) {
                                                                                                            Block_88: {
                                                                                                                Block_97: {
                                                                                                                    Block_96: {
                                                                                                                        Block_108: {
                                                                                                                            Block_85: {
                                                                                                                            Block_104_Outer:
                                                                                                                                while (true) {
                                                                                                                                    Block_107: {
                                                                                                                                        while (true) {
                                                                                                                                        Block_90_Outer:
                                                                                                                                            while (true) {
                                                                                                                                                o3 = b2.o(e4 - 12);
                                                                                                                                                break Label_0890;
                                                                                                                                                iftrue(Label_0912:)(n5 != -1);
                                                                                                                                                break Block_107;
                                                                                                                                                Block_101: {
                                                                                                                                                    while (true) {
                                                                                                                                                        while (true) {
                                                                                                                                                            Block_86: {
                                                                                                                                                                Block_94: {
                                                                                                                                                                    while (true) {
                                                                                                                                                                        b6 = b2.b;
                                                                                                                                                                        iftrue(Label_0893:)(b6 >= n3);
                                                                                                                                                                        break Block_101;
                                                                                                                                                                        n5 = (0xFFFFFF & n4);
                                                                                                                                                                        iftrue(Label_0985:)(n5 != 6516084);
                                                                                                                                                                        break Block_108;
                                                                                                                                                                        n5 = -1;
                                                                                                                                                                        n4 = -1;
                                                                                                                                                                        o4 = null;
                                                                                                                                                                        continue Block_100_Outer;
                                                                                                                                                                        u9h.d(n4, "TSOA", b2);
                                                                                                                                                                        break Label_1269;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            u9h.d(n4, "TSOC", b2);
                                                                                                                                                                            break Label_1269;
                                                                                                                                                                            Label_0696: {
                                                                                                                                                                                iftrue(Label_0721:)(n4 != 1885823344);
                                                                                                                                                                            }
                                                                                                                                                                            break Block_97;
                                                                                                                                                                            o3 = null;
                                                                                                                                                                            iftrue(Label_0442:)(n4 != 1684632427);
                                                                                                                                                                            break Block_85;
                                                                                                                                                                            Label_0648:
                                                                                                                                                                            iftrue(Label_0671:)(n4 != 1936679791);
                                                                                                                                                                            continue Block_98_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        Label_0625: {
                                                                                                                                                                            iftrue(Label_0648:)(n4 != 1936679265);
                                                                                                                                                                        }
                                                                                                                                                                        break Block_94;
                                                                                                                                                                        continue Block_100_Outer;
                                                                                                                                                                    }
                                                                                                                                                                    Label_0442: {
                                                                                                                                                                        iftrue(Label_0465:)(n4 != 1953655662);
                                                                                                                                                                    }
                                                                                                                                                                    break Block_86;
                                                                                                                                                                    u9h.d(n4, "TVSHOWSORT", b2);
                                                                                                                                                                    break Label_1269;
                                                                                                                                                                }
                                                                                                                                                                u9h.d(n4, "TSOP", b2);
                                                                                                                                                                break Label_1269;
                                                                                                                                                                b2.E(e4 - 12);
                                                                                                                                                                continue Label_0890;
                                                                                                                                                                Label_0841: {
                                                                                                                                                                    iftrue(Label_0864:)(e5 != 1851878757);
                                                                                                                                                                }
                                                                                                                                                                break Block_103;
                                                                                                                                                            }
                                                                                                                                                            u9h.c(n4, "TRCK", b2);
                                                                                                                                                            break Label_1269;
                                                                                                                                                            Label_0671: {
                                                                                                                                                                iftrue(Label_0696:)(n4 != 1920233063);
                                                                                                                                                            }
                                                                                                                                                            break Block_96;
                                                                                                                                                            u9h.d(n4, "TPE2", b2);
                                                                                                                                                            break Label_1269;
                                                                                                                                                            n4 = e4;
                                                                                                                                                            n5 = b6;
                                                                                                                                                            continue Block_90_Outer;
                                                                                                                                                        }
                                                                                                                                                        Label_0556: {
                                                                                                                                                            iftrue(Label_0579:)(n4 != 1936682605);
                                                                                                                                                        }
                                                                                                                                                        break Block_104_Outer;
                                                                                                                                                        Label_0533:
                                                                                                                                                        iftrue(Label_0556:)(n4 != 1631670868);
                                                                                                                                                        continue Block_104_Outer;
                                                                                                                                                    }
                                                                                                                                                    while (true) {
                                                                                                                                                        u9h.e(n4, "TBPM", b2, true, false);
                                                                                                                                                        break Label_1269;
                                                                                                                                                        Label_0465: {
                                                                                                                                                            iftrue(Label_0490:)(n4 != 1953329263);
                                                                                                                                                        }
                                                                                                                                                        continue Block_92_Outer;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                e4 = b2.e();
                                                                                                                                                e5 = b2.e();
                                                                                                                                                b2.E(4);
                                                                                                                                                iftrue(Label_0841:)(e5 != 1835360622);
                                                                                                                                                continue Label_0890_Outer;
                                                                                                                                            }
                                                                                                                                            Label_0864: {
                                                                                                                                                iftrue(Label_0880:)(e5 != 1684108385);
                                                                                                                                            }
                                                                                                                                            continue Block_92_Outer;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break Label_1236;
                                                                                                                                    Label_0490: {
                                                                                                                                        iftrue(Label_0515:)(n4 != 1668311404);
                                                                                                                                    }
                                                                                                                                    break Block_88;
                                                                                                                                    Label_0721:
                                                                                                                                    iftrue(Label_0744:)(n4 != 1936683886);
                                                                                                                                    continue Block_92_Outer;
                                                                                                                                }
                                                                                                                                u9h.d(n4, "TSOT", b2);
                                                                                                                                break Label_1269;
                                                                                                                            }
                                                                                                                            u9h.c(n4, "TPOS", b2);
                                                                                                                            break Label_1269;
                                                                                                                        }
                                                                                                                        u9h.a(n4, b2);
                                                                                                                        break Label_1269;
                                                                                                                    }
                                                                                                                    u9h.e(n4, "ITUNESADVISORY", b2, false, false);
                                                                                                                    break Label_1269;
                                                                                                                }
                                                                                                                u9h.e(n4, "ITUNESGAPLESS", b2, false, true);
                                                                                                                break Label_1269;
                                                                                                                Label_0515: {
                                                                                                                    iftrue(Label_0533:)(n4 != 1668249202);
                                                                                                                }
                                                                                                                break Block_89;
                                                                                                                u9h.d(n4, "TSO2", b2);
                                                                                                                break Label_1269;
                                                                                                            }
                                                                                                            u9h.e(n4, "TCMP", b2, true, true);
                                                                                                            break Label_1269;
                                                                                                            Label_0893: {
                                                                                                                iftrue(Label_1236:)(o3 == null || o4 == null);
                                                                                                            }
                                                                                                            continue Block_100_Outer;
                                                                                                        }
                                                                                                        Label_0602: {
                                                                                                            iftrue(Label_0625:)(n4 != 1936679282);
                                                                                                        }
                                                                                                        continue Block_92_Outer;
                                                                                                    }
                                                                                                    o4 = b2.o(e4 - 12);
                                                                                                    continue Label_0890;
                                                                                                }
                                                                                                Label_0579: {
                                                                                                    iftrue(Label_0602:)(n4 != 1936679276);
                                                                                                }
                                                                                                continue Block_99_Outer;
                                                                                            }
                                                                                            u9h.d(n4, "TVSHOW", b2);
                                                                                            break Label_1269;
                                                                                            Label_0767: {
                                                                                                iftrue(Label_1184:)(n4 != 757935405);
                                                                                            }
                                                                                            continue Block_92_Outer;
                                                                                        }
                                                                                        u9h.b(b2);
                                                                                        break Label_1269;
                                                                                        Label_0744: {
                                                                                            iftrue(Label_0767:)(n4 != 1953919848);
                                                                                        }
                                                                                        continue Block_67_Outer;
                                                                                    }
                                                                                    Label_0912: {
                                                                                        b2.D(n5);
                                                                                    }
                                                                                    b2.E(16);
                                                                                    kxd = new kxd(o3, o4, b2.o(n4 - 16));
                                                                                    break Label_1269;
                                                                                }
                                                                                finally {
                                                                                    break Label_1292;
                                                                                }
                                                                            }
                                                                        }
                                                                        Label_0985: {
                                                                            if (n5 == 7233901 || n5 == 7631467) {
                                                                                o5 = u9h.d(n4, "TIT2", b2);
                                                                                break Label_1269;
                                                                            }
                                                                        }
                                                                        if (n5 == 6516589 || n5 == 7828084) {
                                                                            o5 = u9h.d(n4, "TCOM", b2);
                                                                            break Label_1269;
                                                                        }
                                                                        if (n5 == 6578553) {
                                                                            o5 = u9h.d(n4, "TDRC", b2);
                                                                            break Label_1269;
                                                                        }
                                                                        if (n5 == 4280916) {
                                                                            o5 = u9h.d(n4, "TPE1", b2);
                                                                            break Label_1269;
                                                                        }
                                                                        if (n5 == 7630703) {
                                                                            o5 = u9h.d(n4, "TSSE", b2);
                                                                            break Label_1269;
                                                                        }
                                                                        if (n5 == 6384738) {
                                                                            o5 = u9h.d(n4, "TALB", b2);
                                                                            break Label_1269;
                                                                        }
                                                                        if (n5 == 7108978) {
                                                                            o5 = u9h.d(n4, "USLT", b2);
                                                                            break Label_1269;
                                                                        }
                                                                        if (n5 == 6776174) {
                                                                            o5 = u9h.d(n4, "TCON", b2);
                                                                            break Label_1269;
                                                                        }
                                                                        if (n5 == 6779504) {
                                                                            o5 = u9h.d(n4, "TIT1", b2);
                                                                            break Label_1269;
                                                                        }
                                                                        Label_1184:
                                                                        value = String.valueOf(fx0.a(n4));
                                                                        if (value.length() != 0) {
                                                                            concat = "Skipped unknown metadata entry: ".concat(value);
                                                                        }
                                                                        else {
                                                                            concat = new String("Skipped unknown metadata entry: ");
                                                                        }
                                                                        Log.d("MetadataUtil", concat);
                                                                    }
                                                                    o5 = null;
                                                                }
                                                                b2.D(n3);
                                                                if (o5 == null) {
                                                                    continue Block_67_Outer;
                                                                }
                                                                list2.add((Throwable)o5);
                                                                continue Block_67_Outer;
                                                            }
                                                            b2.D(n3);
                                                        }
                                                        else {
                                                            list = list3;
                                                            if (list2.isEmpty()) {
                                                                break Label_1344;
                                                            }
                                                            o6 = new z8h((List)list2);
                                                            break Label_1347;
                                                        }
                                                    }
                                                }
                                                else {
                                                    b2.D(b4 + e3);
                                                }
                                            }
                                            o6 = null;
                                        }
                                        o7 = o6;
                                        o8 = o2;
                                    }
                                    else {
                                        list4 = list;
                                        o7 = o;
                                        o8 = o2;
                                        list = list4;
                                        if (e2 == 1936553057) {
                                            b2.D(b3);
                                            b2.E(12);
                                            while (true) {
                                                b7 = b2.b;
                                                if (b7 >= b3 + e) {
                                                    break;
                                                }
                                                e6 = b2.e();
                                                if (b2.e() == 1935766900) {
                                                    if (e6 < 14) {
                                                        break;
                                                    }
                                                    b2.E(5);
                                                    t = b2.t();
                                                    if (t != 12 && t != 13) {
                                                        break;
                                                    }
                                                    if (t == 12) {
                                                        n6 = 240.0f;
                                                    }
                                                    else {
                                                        n6 = 120.0f;
                                                    }
                                                    b2.E(1);
                                                    o8 = new z8h(new z8h$b[] { (z8h$b)new pgq(n6, b2.t()) });
                                                    o7 = o;
                                                    list = list4;
                                                    break Label_1559;
                                                }
                                                else {
                                                    b2.D(b7 + e6);
                                                }
                                            }
                                            o8 = null;
                                            list = list4;
                                            o7 = o;
                                        }
                                    }
                                }
                                b2.D(b3 + e);
                                o = o7;
                                o2 = o8;
                            }
                            else {
                                create = Pair.create(o, o2);
                                z8h = (z8h)create.first;
                                z8h2 = (z8h3 = (z8h)create.second);
                                z8h4 = z8h;
                                list5 = list;
                                if (z8h != null) {
                                    ixb.b(z8h);
                                    z8h3 = z8h2;
                                    z8h4 = z8h;
                                    list5 = list;
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    else {
                        z8h3 = null;
                        z8h4 = null;
                        list5 = list;
                    }
                    b8 = fx0$a.b(1835365473);
                    Label_2108: {
                        if (b8 != null) {
                            a3 = gx0.a;
                            c3 = b8.c(1751411826);
                            c4 = b8.c(1801812339);
                            c5 = b8.c(1768715124);
                            if (c3 != null && c4 != null && c5 != null) {
                                b9 = c3.b;
                                b9.D(16);
                                if (b9.e() == 1835299937) {
                                    b10 = c4.b;
                                    b10.D(12);
                                    e7 = b10.e();
                                    array = new String[e7];
                                    for (int i = 0; i < e7; ++i) {
                                        e8 = b10.e();
                                        b10.E(4);
                                        array[i] = b10.q(e8 - 8);
                                    }
                                    b11 = c5.b;
                                    b11.D(8);
                                    list6 = new ArrayList<Object>();
                                    n7 = e7;
                                    while (true) {
                                        c6 = b11.c;
                                        b12 = b11.b;
                                        if (c6 - b12 <= 8) {
                                            break;
                                        }
                                        e9 = b11.e();
                                        n8 = b11.e() - 1;
                                        if (n8 >= 0 && n8 < n7) {
                                            s2 = array[n8];
                                            while (true) {
                                                b13 = b11.b;
                                                if (b13 >= b12 + e9) {
                                                    o9 = null;
                                                    break;
                                                }
                                                e10 = b11.e();
                                                if (b11.e() == 1684108385) {
                                                    e11 = b11.e();
                                                    e12 = b11.e();
                                                    e10 -= 16;
                                                    array2 = new byte[e10];
                                                    b11.d(array2, 0, e10);
                                                    o9 = new aqg(s2, array2, e12, e11);
                                                    break;
                                                }
                                                b11.D(b13 + e10);
                                            }
                                            array3 = array;
                                            n9 = (n7 = n7);
                                            array = array3;
                                            if (o9 != null) {
                                                list6.add(o9);
                                                n7 = n9;
                                                array = array3;
                                            }
                                        }
                                        else {
                                            mw.A(52, "Skipped metadata with unknown key index: ", n8, "AtomParsers");
                                        }
                                        b11.D(b12 + e9);
                                    }
                                    if (!list6.isEmpty()) {
                                        z8h5 = new z8h((List)list6);
                                        break Label_2108;
                                    }
                                }
                            }
                        }
                        z8h5 = null;
                    }
                    f = gx0.f(fx0$a, ixb, -9223372036854775807L, null, (rrh2.a & 0x1) != 0x0, b, (btb<yvt, yvt>)hee.a);
                    r = rrh2.r;
                    Objects.requireNonNull(r);
                    list7 = (ArrayList)f;
                    size = list7.size();
                    max = -9223372036854775807L;
                    j = 0;
                    size2 = -1;
                    list8 = list5;
                    z8h6 = z8h5;
                    z8h7 = z8h4;
                    while (j < size) {
                        fwt = list7.get(j);
                        if (fwt.b == 0) {
                            z8h8 = z8h7;
                            rrh3 = rrh2;
                            z8h9 = z8h3;
                            z8h10 = z8h8;
                        }
                        else {
                            a4 = fwt.a;
                            n10 = a4.e;
                            if (n10 == -9223372036854775807L) {
                                n10 = fwt.h;
                            }
                            max = Math.max(max, n10);
                            rrh$a = new rrh.rrh$a(a4, fwt, r.n(j, a4.b));
                            if ("audio/true-hd".equals(a4.f.O0)) {
                                l = fwt.e * 16;
                            }
                            else {
                                l = fwt.e + 30;
                            }
                            n$a = new n$a(a4.f);
                            n$a.l = l;
                            b14 = a4.b;
                            if (b14 == 2 && n10 > 0L) {
                                b15 = fwt.b;
                                if (b15 > 1) {
                                    n$a.r = b15 / (n10 / 1000000.0f);
                                }
                            }
                            if (b14 == 1) {
                                a5 = ixb.a;
                                if (a5 != -1 && ixb.b != -1) {
                                    n$a.A = a5;
                                    n$a.B = ixb.b;
                                }
                            }
                            if (this.h.isEmpty()) {
                                z8h11 = null;
                            }
                            else {
                                z8h11 = new z8h((List)this.h);
                            }
                            z8h12 = new z8h(new z8h$b[0]);
                            if ((b14 != 1) ? (b14 == 2 && z8h6 != null) : (z8h7 != null)) {
                                z8h13 = z8h7;
                            }
                            else {
                                z8h13 = z8h12;
                            }
                            z8h14 = z8h7;
                            z8h9 = z8h3;
                            b16 = z8h13;
                            z8h10 = z8h14;
                            for (int k = 0; k < 2; ++k) {
                                b16 = b16.b((new z8h[] { z8h3, z8h11 })[k]);
                            }
                            if (b16.D0.length > 0) {
                                n$a.i = b16;
                            }
                            rrh$a.c.e(new n(n$a));
                            if (a4.b == 2 && size2 == -1) {
                                size2 = list8.size();
                            }
                            list8.add(rrh$a);
                            rrh3 = this;
                        }
                        ++j;
                        z8h3 = z8h9;
                        z8h15 = z8h10;
                        rrh2 = rrh3;
                        z8h7 = z8h15;
                    }
                    rrh = this;
                    rrh2.u = size2;
                    rrh2.v = max;
                    s3 = list8.toArray(new rrh.rrh$a[0]);
                    rrh2.s = s3;
                    t2 = new long[s3.length][];
                    array4 = new int[s3.length];
                    array5 = new long[s3.length];
                    array6 = new boolean[s3.length];
                    for (int n11 = 0; n11 < s3.length; ++n11) {
                        t2[n11] = new long[s3[n11].b.b];
                        array5[n11] = s3[n11].b.f[0];
                    }
                    n12 = 0;
                    n13 = 0L;
                    while (n12 < s3.length) {
                        n14 = Long.MAX_VALUE;
                        n15 = 0;
                        n16 = -1;
                        while (n15 < s3.length) {
                            n17 = n14;
                            n18 = n16;
                            if (!array6[n15]) {
                                n17 = n14;
                                n18 = n16;
                                if (array5[n15] <= n14) {
                                    n17 = array5[n15];
                                    n18 = n15;
                                }
                            }
                            ++n15;
                            n14 = n17;
                            n16 = n18;
                        }
                        n19 = array4[n16];
                        t2[n16][n19] = n13;
                        n13 += s3[n16].b.d[n19];
                        ++n19;
                        if ((array4[n16] = n19) < t2[n16].length) {
                            array5[n16] = s3[n16].b.f[n19];
                        }
                        else {
                            array6[n16] = true;
                            ++n12;
                        }
                    }
                    rrh2.t = t2;
                    r.m();
                    r.l((vbp)rrh2);
                    rrh2.f.clear();
                    rrh2.i = 2;
                    rrh4 = rrh2;
                }
                else {
                    rrh5 = rrh;
                    rrh4 = rrh2;
                    rrh = rrh5;
                    if (!rrh2.f.isEmpty()) {
                        rrh2.f.peek().d.add(fx0$a);
                        rrh = rrh5;
                        rrh4 = rrh2;
                    }
                }
            }
            if (rrh2.i != 2) {
                this.j();
            }
            return;
            Label_2663: {
                ++n20;
            }
            d0 = z8h6.D0;
            iftrue(Label_2669:)(n20 >= d0.length);
            while (true) {
                Block_66: {
                    break Block_66;
                    while (true) {
                        b16 = new z8h(new z8h$b[] { (z8h$b)aqg });
                        z8h9 = z8h16;
                        z8h10 = z8h17;
                        continue Block_68_Outer;
                        aqg = (aqg)z8h$b;
                        d2 = aqg.D0;
                        z8h17 = z8h7;
                        iftrue(Label_2663:)(!"com.android.capture.fps".equals(d2));
                        continue Block_67_Outer;
                    }
                }
                z8h$b = d0[n20];
                iftrue(Label_2663:)(!(z8h$b instanceof aqg));
                continue;
            }
            Label_2669:
            z8h18 = z8h7;
            b16 = z8h12;
            z8h9 = z8h16;
            z8h10 = z8h18;
            continue Block_67_Outer;
        }
    }
    
    @Override
    public final void release() {
    }
}
