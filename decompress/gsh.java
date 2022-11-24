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

public final class gsh implements qoa, qcp
{
    public static final int y = 0;
    public final int a;
    public final gxj b;
    public final gxj c;
    public final gxj d;
    public final gxj e;
    public final ArrayDeque<jx0.a> f;
    public final gdp g;
    public final List<q9h$b> h;
    public int i;
    public int j;
    public long k;
    public int l;
    public gxj m;
    public int n;
    public int o;
    public int p;
    public int q;
    public voa r;
    public gsh.gsh$a[] s;
    public long[][] t;
    public int u;
    public long v;
    public int w;
    public wrh x;
    
    static {
        final j71 m0 = j71.M0;
    }
    
    public gsh(int n) {
        this.a = n;
        if ((n & 0x4) != 0x0) {
            n = 3;
        }
        else {
            n = 0;
        }
        this.i = n;
        this.g = new gdp();
        this.h = new ArrayList();
        this.e = new gxj(16);
        this.f = new ArrayDeque<jx0.a>();
        this.b = new gxj(z6i.a);
        this.c = new gxj(4);
        this.d = new gxj();
        this.n = -1;
    }
    
    public static long k(final wwt wwt, final long n, final long n2) {
        int n3;
        if ((n3 = wwt.a(n)) == -1) {
            n3 = wwt.b(n);
        }
        if (n3 == -1) {
            return n2;
        }
        return Math.min(wwt.c[n3], n2);
    }
    
    public final int a(final roa roa, final lsk lsk) throws IOException {
        while (true) {
            final int i = this.i;
            final boolean b = false;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        final long position = roa.getPosition();
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
                                final gsh.gsh$a[] s = this.s;
                                final int a = rnw.a;
                                if (n8 >= s.length) {
                                    break;
                                }
                                final gsh.gsh$a gsh$a = s[n8];
                                final int e = gsh$a.e;
                                final wwt b2 = gsh$a.b;
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
                        final gsh.gsh$a[] s2 = this.s;
                        final int a2 = rnw.a;
                        final gsh.gsh$a gsh$a2 = s2[this.n];
                        final vwt c = gsh$a2.c;
                        final int e2 = gsh$a2.e;
                        final wwt b3 = gsh$a2.b;
                        final long a3 = b3.c[e2];
                        final int n19 = b3.d[e2];
                        final t4u d = gsh$a2.d;
                        final long n20 = a3 - position + this.o;
                        int n18;
                        if (n20 >= 0L && n20 < 262144L) {
                            long n21 = n20;
                            int n22 = n19;
                            if (gsh$a2.a.g == 1) {
                                n21 = n20 + 8L;
                                n22 = n19 - 8;
                            }
                            roa.k((int)n21);
                            final pwt a4 = gsh$a2.a;
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
                                        roa.readFully(a5, n23, j);
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
                                        final int c2 = c.c((k88)roa, q, false);
                                        this.o += c2;
                                        this.p += c2;
                                        this.q -= c2;
                                    }
                                }
                            }
                            else {
                                int n25;
                                if ("audio/ac4".equals(a4.f.Q0)) {
                                    if (this.p == 0) {
                                        gf.a(n22, this.d);
                                        c.d(this.d, 7);
                                        this.p += 7;
                                    }
                                    n25 = n22 + 7;
                                }
                                else {
                                    n25 = n22;
                                    if (d != null) {
                                        d.c(roa);
                                        n25 = n22;
                                    }
                                }
                                while (true) {
                                    final int p2 = this.p;
                                    if (p2 >= (n24 = n25)) {
                                        break;
                                    }
                                    final int c3 = c.c((k88)roa, n25 - p2, false);
                                    this.o += c3;
                                    this.p += c3;
                                    this.q -= c3;
                                }
                            }
                            final wwt b4 = gsh$a2.b;
                            final long n26 = b4.f[e2];
                            final int n27 = b4.g[e2];
                            if (d != null) {
                                d.b(c, n26, n27, n24, 0, (vwt$a)null);
                                if (e2 + 1 == gsh$a2.b.b) {
                                    d.a(c, (vwt$a)null);
                                }
                            }
                            else {
                                c.b(n26, n27, n24, 0, (vwt$a)null);
                            }
                            ++gsh$a2.e;
                            this.n = -1;
                            this.o = 0;
                            this.p = 0;
                            this.q = 0;
                            n18 = 0;
                        }
                        else {
                            lsk.a = a3;
                            n18 = 1;
                        }
                        return n18;
                    }
                    if (i == 3) {
                        final gdp g = this.g;
                        final ArrayList h = this.h;
                        final int b5 = g.b;
                        if (b5 != 0) {
                            if (b5 != 1) {
                                if (b5 != 2) {
                                    if (b5 != 3) {
                                        throw new IllegalStateException();
                                    }
                                    final long position2 = roa.getPosition();
                                    final int n28 = (int)(roa.getLength() - roa.getPosition() - g.c);
                                    final gxj gxj = new gxj(n28);
                                    roa.readFully(gxj.a, 0, n28);
                                    for (int k = 0; k < g.a.size(); ++k) {
                                        final gdp$a gdp$a = g.a.get(k);
                                        gxj.D((int)(gdp$a.a - position2));
                                        gxj.E(4);
                                        final int g2 = gxj.g();
                                        final String q2 = gxj.q(g2);
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
                                        final int b6 = gdp$a.b;
                                        if (n30 != 2192) {
                                            if (n30 != 2816 && n30 != 2817 && n30 != 2819) {
                                                if (n30 != 2820) {
                                                    throw new IllegalStateException();
                                                }
                                            }
                                        }
                                        else {
                                            final ArrayList<pgq.b> list = new ArrayList<pgq.b>();
                                            final List a6 = gdp.e.a((CharSequence)gxj.q(b6 - (g2 + 8)));
                                            int l = 0;
                                            while (l < a6.size()) {
                                                final List a7 = gdp.d.a((CharSequence)a6.get(l));
                                                if (a7.size() == 3) {
                                                    try {
                                                        list.add(new pgq.b(Long.parseLong((String)a7.get(0)), Long.parseLong((String)a7.get(1)), 1 << Integer.parseInt((String)a7.get(2)) - 1));
                                                        ++l;
                                                        continue;
                                                    }
                                                    catch (final NumberFormatException ex) {
                                                        throw ParserException.a((String)null, (Throwable)ex);
                                                    }
                                                }
                                                throw ParserException.a((String)null, (Throwable)null);
                                            }
                                            h.add(new pgq((List)list));
                                        }
                                    }
                                    lsk.a = 0L;
                                }
                                else {
                                    final long length = roa.getLength();
                                    final int n31 = g.c - 12 - 8;
                                    final gxj gxj2 = new gxj(n31);
                                    roa.readFully(gxj2.a, 0, n31);
                                    for (int n32 = 0; n32 < n31 / 12; ++n32) {
                                        gxj2.E(2);
                                        final short m = gxj2.i();
                                        if (m != 2192) {
                                            if (m != 2816 && m != 2817 && m != 2819) {
                                                if (m != 2820) {
                                                    gxj2.E(8);
                                                    continue;
                                                }
                                            }
                                        }
                                        g.a.add(new gdp$a(length - g.c - gxj2.g(), gxj2.g()));
                                    }
                                    if (g.a.isEmpty()) {
                                        lsk.a = 0L;
                                    }
                                    else {
                                        g.b = 3;
                                        lsk.a = ((gdp$a)g.a.get(0)).a;
                                    }
                                }
                            }
                            else {
                                final gxj gxj3 = new gxj(8);
                                roa.readFully(gxj3.a, 0, 8);
                                g.c = gxj3.g() + 8;
                                if (gxj3.e() != 1397048916) {
                                    lsk.a = 0L;
                                }
                                else {
                                    lsk.a = roa.getPosition() - (g.c - 12);
                                    g.b = 2;
                                }
                            }
                        }
                        else {
                            final long length2 = roa.getLength();
                            long a8;
                            if (length2 != -1L && length2 >= 8L) {
                                a8 = length2 - 8L;
                            }
                            else {
                                a8 = 0L;
                            }
                            lsk.a = a8;
                            g.b = 1;
                        }
                        if (lsk.a == 0L) {
                            this.j();
                        }
                        return 1;
                    }
                    throw new IllegalStateException();
                }
                else {
                    final long n33 = this.k - this.l;
                    final long position3 = roa.getPosition();
                    final gxj m2 = this.m;
                    boolean b7 = false;
                    Label_2270: {
                        if (m2 != null) {
                            roa.readFully(m2.a, this.l, (int)n33);
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
                                this.f.peek().c.add(new jx0.b(this.j, m2));
                            }
                        }
                        else {
                            if (n33 >= 262144L) {
                                lsk.a = roa.getPosition() + n33;
                                b7 = true;
                                break Label_2270;
                            }
                            roa.k((int)n33);
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
                        if (!roa.f(this.e.a, 0, 8, true)) {
                            if (this.w == 2 && (this.a & 0x2) != 0x0) {
                                final voa r = this.r;
                                Objects.requireNonNull(r);
                                final vwt r2 = r.r(0, 4);
                                final wrh x = this.x;
                                q9h i2;
                                if (x == null) {
                                    i2 = null;
                                }
                                else {
                                    i2 = new q9h(new q9h$b[] { (q9h$b)x });
                                }
                                final n$a n$a = new n$a();
                                n$a.i = i2;
                                r2.e(new n(n$a));
                                r.p();
                                r.l((qcp)new qcp.b(-9223372036854775807L));
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
                        roa.readFully(this.e.a, 8, 8);
                        this.l += 8;
                        this.k = this.e.x();
                    }
                    else if (k2 == 0L) {
                        long n36;
                        final long n35 = n36 = roa.getLength();
                        if (n35 == -1L) {
                            final jx0.a a9 = this.f.peek();
                            n36 = n35;
                            if (a9 != null) {
                                n36 = a9.b;
                            }
                        }
                        if (n36 != -1L) {
                            this.k = n36 - roa.getPosition() + this.l;
                        }
                    }
                    final long k3 = this.k;
                    final int l2 = this.l;
                    if (k3 < l2) {
                        throw ParserException.c("Atom size less than header length (unsupported).");
                    }
                    final int j2 = this.j;
                    if (j2 == 1836019574 || j2 == 1953653099 || j2 == 1835297121 || j2 == 1835626086 || j2 == 1937007212 || j2 == 1701082227 || j2 == 1835365473) {
                        final long position4 = roa.getPosition();
                        final long k4 = this.k;
                        final long n37 = this.l;
                        final long n38 = position4 + k4 - n37;
                        if (k4 != n37 && this.j == 1835365473) {
                            this.d.A(8);
                            roa.n(this.d.a, 0, 8);
                            kx0.a(this.d);
                            roa.k(this.d.b);
                            roa.e();
                        }
                        this.f.push(new jx0.a(this.j, n38));
                        if (this.k == this.l) {
                            this.l(n38);
                        }
                        else {
                            this.j();
                        }
                    }
                    else if (j2 == 1835296868 || j2 == 1836476516 || j2 == 1751411826 || j2 == 1937011556 || j2 == 1937011827 || j2 == 1937011571 || j2 == 1668576371 || j2 == 1701606260 || j2 == 1937011555 || j2 == 1937011578 || j2 == 1937013298 || j2 == 1937007471 || j2 == 1668232756 || j2 == 1953196132 || j2 == 1718909296 || j2 == 1969517665 || j2 == 1801812339 || j2 == 1768715124) {
                        omi.p(l2 == 8);
                        omi.p(this.k <= 2147483647L);
                        final gxj m3 = new gxj((int)this.k);
                        System.arraycopy(this.e.a, 0, m3.a, 0, 8);
                        this.m = m3;
                        this.i = 1;
                    }
                    else {
                        final long position5 = roa.getPosition();
                        final long n39 = this.l;
                        final long n40 = position5 - n39;
                        if (this.j == 1836086884) {
                            this.x = new wrh(0L, n40, -9223372036854775807L, n40 + n39, this.k - n39);
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
    
    public final boolean b(final roa roa) throws IOException {
        return r1n.e0(roa, false, (this.a & 0x2) != 0x0);
    }
    
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
                final gdp g = this.g;
                g.a.clear();
                g.b = 0;
                this.h.clear();
            }
        }
        else {
            final gsh.gsh$a[] s = this.s;
            if (s != null) {
                for (final gsh.gsh$a gsh$a : s) {
                    final wwt b = gsh$a.b;
                    int e;
                    if ((e = b.a(n2)) == -1) {
                        e = b.b(n2);
                    }
                    gsh$a.e = e;
                    final t4u d = gsh$a.d;
                    if (d != null) {
                        d.b = false;
                        d.c = 0;
                    }
                }
            }
        }
    }
    
    public final qcp$a d(long n) {
        final gsh.gsh$a[] s = this.s;
        Objects.requireNonNull(s);
        if (s.length == 0) {
            final scp c = scp.c;
            return new qcp$a(c, c);
        }
        final int u = this.u;
        long n3;
        long n6;
        long n7;
        if (u != -1) {
            final wwt b = this.s[u].b;
            int n2;
            if ((n2 = b.a(n)) == -1) {
                n2 = b.b(n);
            }
            if (n2 == -1) {
                final scp c2 = scp.c;
                return new qcp$a(c2, c2);
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
            final gsh.gsh$a[] s2 = this.s;
            if (n9 >= s2.length) {
                break;
            }
            long n10 = n;
            long k = n7;
            if (n9 != this.u) {
                final wwt b3 = s2[n9].b;
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
        final scp scp = new scp(n3, n7);
        if (n6 == -9223372036854775807L) {
            return new qcp$a(scp, scp);
        }
        return new qcp$a(scp, new scp(n6, n));
    }
    
    public final boolean f() {
        return true;
    }
    
    public final long h() {
        return this.v;
    }
    
    public final void i(final voa r) {
        this.r = r;
    }
    
    public final void j() {
        this.i = 0;
        this.l = 0;
    }
    
    public final void l(final long n) throws ParserException {
        while (true) {
            q9h q9h6;
            q9h q9h9;
            int n20;
            while (true) {
                gsh gsh2;
                gsh gsh4;
                for (gsh gsh = gsh2 = this; !gsh2.f.isEmpty() && gsh2.f.peek().b == n; gsh2 = gsh4) {
                    final jx0.a a = gsh2.f.pop();
                    if (a.a == 1836019574) {
                        ArrayList<gsh.gsh$a> list = new ArrayList<gsh.gsh$a>();
                        final boolean b = gsh2.w == 1;
                        final iyb iyb = new iyb();
                        final jx0.b c = a.c(1969517665);
                        q9h q9h3;
                        q9h q9h4;
                        ArrayList<gsh.gsh$a> list5;
                        if (c != null) {
                            final byte[] a2 = kx0.a;
                            final gxj b2 = c.b;
                            b2.D(8);
                            Object o = null;
                            Object o2 = null;
                            while (true) {
                                final int c2 = b2.c;
                                final int b3 = b2.b;
                                if (c2 - b3 >= 8) {
                                    final int e = b2.e();
                                    final int e2 = b2.e();
                                    Object o7 = null;
                                    Object o8 = null;
                                    Label_1559: {
                                        if (e2 == 1835365473) {
                                            b2.D(b3);
                                            b2.E(8);
                                            kx0.a(b2);
                                            Object o6 = null;
                                            Label_1347: {
                                            Label_1344:
                                                while (true) {
                                                    final int b4 = b2.b;
                                                    if (b4 >= b3 + e) {
                                                        break;
                                                    }
                                                    final int e3 = b2.e();
                                                    if (b2.e() == 1768715124) {
                                                        b2.D(b4);
                                                        final int n2 = b4 + e3;
                                                        b2.E(8);
                                                        final ArrayList<Throwable> list2 = new ArrayList<Throwable>();
                                                        final ArrayList<gsh.gsh$a> list3 = list;
                                                        int b5;
                                                        int n3;
                                                        int n4;
                                                        int n5;
                                                        String[] a3;
                                                        String s = null;
                                                        yis yis;
                                                        int e4;
                                                        int b6;
                                                        String o3;
                                                        String o4;
                                                        int e5;
                                                        myd myd;
                                                        Object o5 = null;
                                                        String value;
                                                        String concat;
                                                        Label_0890_Outer:Label_0784_Outer:
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
                                                                                        n4 = lah.f(b2);
                                                                                        Label_0380: {
                                                                                            if (n4 > 0) {
                                                                                                a3 = lah.a;
                                                                                                if (n4 <= 192) {
                                                                                                    s = a3[n4 - 1];
                                                                                                    break Label_0380;
                                                                                                }
                                                                                            }
                                                                                            s = null;
                                                                                        }
                                                                                        if (s != null) {
                                                                                            yis = new yis("TCON", (String)null, s);
                                                                                            break Label_1269;
                                                                                        }
                                                                                        Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                                        break Label_1236;
                                                                                        Label_0671: {
                                                                                            iftrue(Label_0696:)(n4 != 1920233063);
                                                                                        }
                                                                                    Block_108_Outer:
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                Label_0784:Block_93_Outer:
                                                                                                while (true) {
                                                                                                    Block_100: {
                                                                                                        Block_86: {
                                                                                                        Block_89:
                                                                                                            while (true) {
                                                                                                                Block_91: {
                                                                                                                    Block_85: {
                                                                                                                        while (true) {
                                                                                                                            Block_106: {
                                                                                                                                Label_0890:Block_95_Outer:
                                                                                                                                while (true) {
                                                                                                                                    Block_102: {
                                                                                                                                        Block_96: {
                                                                                                                                            break Block_96;
                                                                                                                                            while (true) {
                                                                                                                                                while (true) {
                                                                                                                                                    Block_92: {
                                                                                                                                                        Block_101: {
                                                                                                                                                        Block_88:
                                                                                                                                                            while (true) {
                                                                                                                                                                while (true) {
                                                                                                                                                                    while (true) {
                                                                                                                                                                        b2.E(e4 - 12);
                                                                                                                                                                        break Label_0890;
                                                                                                                                                                        lah.d(n4, "TVSHOW", b2);
                                                                                                                                                                        break Label_1269;
                                                                                                                                                                        Label_0579:
                                                                                                                                                                        iftrue(Label_0602:)(n4 != 1936679276);
                                                                                                                                                                        break Block_92;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            lah.d(n4, "TPE2", b2);
                                                                                                                                                                            break Label_1269;
                                                                                                                                                                            lah.d(n4, "TSOC", b2);
                                                                                                                                                                            break Label_1269;
                                                                                                                                                                            b6 = b2.b;
                                                                                                                                                                            iftrue(Label_0893:)(b6 >= n3);
                                                                                                                                                                            break Block_101;
                                                                                                                                                                            Label_0533:
                                                                                                                                                                            iftrue(Label_0556:)(n4 != 1631670868);
                                                                                                                                                                            continue Block_95_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        o3 = b2.o(e4 - 12);
                                                                                                                                                                        break Label_0890;
                                                                                                                                                                        Label_0893:
                                                                                                                                                                        iftrue(Label_1236:)(o4 == null || o3 == null);
                                                                                                                                                                        break Block_106;
                                                                                                                                                                        Label_0442:
                                                                                                                                                                        iftrue(Label_0465:)(n4 != 1953655662);
                                                                                                                                                                        break Block_86;
                                                                                                                                                                        continue Label_0784;
                                                                                                                                                                        Label_0556:
                                                                                                                                                                        iftrue(Label_0579:)(n4 != 1936682605);
                                                                                                                                                                        break Block_91;
                                                                                                                                                                        n4 = e4;
                                                                                                                                                                        n5 = b6;
                                                                                                                                                                        continue Label_0890_Outer;
                                                                                                                                                                    }
                                                                                                                                                                    Label_0864:
                                                                                                                                                                    iftrue(Label_0880:)(e5 != 1684108385);
                                                                                                                                                                    continue Block_93_Outer;
                                                                                                                                                                }
                                                                                                                                                                Label_0465:
                                                                                                                                                                iftrue(Label_0490:)(n4 != 1953329263);
                                                                                                                                                                Block_87: {
                                                                                                                                                                    break Block_87;
                                                                                                                                                                    o4 = null;
                                                                                                                                                                    iftrue(Label_0442:)(n4 != 1684632427);
                                                                                                                                                                    break Block_85;
                                                                                                                                                                    Label_0696:
                                                                                                                                                                    iftrue(Label_0721:)(n4 != 1885823344);
                                                                                                                                                                    lah.e(n4, "ITUNESGAPLESS", b2, false, true);
                                                                                                                                                                    break Label_1269;
                                                                                                                                                                }
                                                                                                                                                                lah.e(n4, "TBPM", b2, true, false);
                                                                                                                                                                break Label_1269;
                                                                                                                                                                Label_0490:
                                                                                                                                                                iftrue(Label_0515:)(n4 != 1668311404);
                                                                                                                                                                break Block_88;
                                                                                                                                                                Label_0744:
                                                                                                                                                                iftrue(Label_0767:)(n4 != 1953919848);
                                                                                                                                                                continue Block_95_Outer;
                                                                                                                                                            }
                                                                                                                                                            lah.e(n4, "TCMP", b2, true, true);
                                                                                                                                                            break Label_1269;
                                                                                                                                                            Label_0767:
                                                                                                                                                            iftrue(Label_1184:)(n4 != 757935405);
                                                                                                                                                            break Block_100;
                                                                                                                                                            lah.d(n4, "TSOA", b2);
                                                                                                                                                            break Label_1269;
                                                                                                                                                            break Label_1236;
                                                                                                                                                            lah.d(n4, "TSOP", b2);
                                                                                                                                                            break Label_1269;
                                                                                                                                                        }
                                                                                                                                                        e4 = b2.e();
                                                                                                                                                        e5 = b2.e();
                                                                                                                                                        b2.E(4);
                                                                                                                                                        iftrue(Label_0841:)(e5 != 1835360622);
                                                                                                                                                        break Block_102;
                                                                                                                                                        Label_0721:
                                                                                                                                                        iftrue(Label_0744:)(n4 != 1936683886);
                                                                                                                                                        lah.d(n4, "TVSHOWSORT", b2);
                                                                                                                                                        break Label_1269;
                                                                                                                                                    }
                                                                                                                                                    lah.d(n4, "TSO2", b2);
                                                                                                                                                    break Label_1269;
                                                                                                                                                    Label_0625:
                                                                                                                                                    iftrue(Label_0648:)(n4 != 1936679265);
                                                                                                                                                    continue Block_108_Outer;
                                                                                                                                                }
                                                                                                                                                Label_0648:
                                                                                                                                                iftrue(Label_0671:)(n4 != 1936679791);
                                                                                                                                                continue Label_0784_Outer;
                                                                                                                                            }
                                                                                                                                            lah.a(n4, b2);
                                                                                                                                            break Label_1269;
                                                                                                                                            Label_0912:
                                                                                                                                            b2.D(n5);
                                                                                                                                            b2.E(16);
                                                                                                                                            myd = new myd(o4, o3, b2.o(n4 - 16));
                                                                                                                                            break Label_1269;
                                                                                                                                        }
                                                                                                                                        lah.e(n4, "ITUNESADVISORY", b2, false, false);
                                                                                                                                        break Label_1269;
                                                                                                                                    }
                                                                                                                                    o4 = b2.o(e4 - 12);
                                                                                                                                    continue Label_0890;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            iftrue(Label_0912:)(n5 != -1);
                                                                                                                            continue Block_108_Outer;
                                                                                                                        }
                                                                                                                        Label_0515:
                                                                                                                        iftrue(Label_0533:)(n4 != 1668249202);
                                                                                                                        break Block_89;
                                                                                                                    }
                                                                                                                    lah.c(n4, "TPOS", b2);
                                                                                                                    break Label_1269;
                                                                                                                }
                                                                                                                lah.d(n4, "TSOT", b2);
                                                                                                                break Label_1269;
                                                                                                                Label_0602:
                                                                                                                iftrue(Label_0625:)(n4 != 1936679282);
                                                                                                                continue Block_108_Outer;
                                                                                                            }
                                                                                                            lah.b(b2);
                                                                                                            break Label_1269;
                                                                                                        }
                                                                                                        lah.c(n4, "TRCK", b2);
                                                                                                        break Label_1269;
                                                                                                    }
                                                                                                    n5 = -1;
                                                                                                    n4 = -1;
                                                                                                    o3 = null;
                                                                                                    continue Label_0784;
                                                                                                }
                                                                                                n5 = (0xFFFFFF & n4);
                                                                                                iftrue(Label_0985:)(n5 != 6516084);
                                                                                                continue;
                                                                                            }
                                                                                            Label_0841:
                                                                                            iftrue(Label_0864:)(e5 != 1851878757);
                                                                                            continue Block_108_Outer;
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        break Label_1292;
                                                                                    }
                                                                                }
                                                                            }
                                                                            Label_0985: {
                                                                                if (n5 == 7233901 || n5 == 7631467) {
                                                                                    o5 = lah.d(n4, "TIT2", b2);
                                                                                    break Label_1269;
                                                                                }
                                                                            }
                                                                            if (n5 == 6516589 || n5 == 7828084) {
                                                                                o5 = lah.d(n4, "TCOM", b2);
                                                                                break Label_1269;
                                                                            }
                                                                            if (n5 == 6578553) {
                                                                                o5 = lah.d(n4, "TDRC", b2);
                                                                                break Label_1269;
                                                                            }
                                                                            if (n5 == 4280916) {
                                                                                o5 = lah.d(n4, "TPE1", b2);
                                                                                break Label_1269;
                                                                            }
                                                                            if (n5 == 7630703) {
                                                                                o5 = lah.d(n4, "TSSE", b2);
                                                                                break Label_1269;
                                                                            }
                                                                            if (n5 == 6384738) {
                                                                                o5 = lah.d(n4, "TALB", b2);
                                                                                break Label_1269;
                                                                            }
                                                                            if (n5 == 7108978) {
                                                                                o5 = lah.d(n4, "USLT", b2);
                                                                                break Label_1269;
                                                                            }
                                                                            if (n5 == 6776174) {
                                                                                o5 = lah.d(n4, "TCON", b2);
                                                                                break Label_1269;
                                                                            }
                                                                            if (n5 == 6779504) {
                                                                                o5 = lah.d(n4, "TIT1", b2);
                                                                                break Label_1269;
                                                                            }
                                                                            Label_1184:
                                                                            value = String.valueOf(jx0.a(n4));
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
                                                                        continue;
                                                                    }
                                                                    list2.add((Throwable)o5);
                                                                    continue;
                                                                }
                                                                b2.D(n3);
                                                            }
                                                            else {
                                                                list = list3;
                                                                if (list2.isEmpty()) {
                                                                    break Label_1344;
                                                                }
                                                                o6 = new q9h((List)list2);
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
                                            final ArrayList<gsh.gsh$a> list4 = list;
                                            o7 = o;
                                            o8 = o2;
                                            list = list4;
                                            if (e2 == 1936553057) {
                                                b2.D(b3);
                                                b2.E(12);
                                                while (true) {
                                                    final int b7 = b2.b;
                                                    if (b7 >= b3 + e) {
                                                        break;
                                                    }
                                                    final int e6 = b2.e();
                                                    if (b2.e() == 1935766900) {
                                                        if (e6 < 14) {
                                                            break;
                                                        }
                                                        b2.E(5);
                                                        final int t = b2.t();
                                                        if (t != 12 && t != 13) {
                                                            break;
                                                        }
                                                        float n6;
                                                        if (t == 12) {
                                                            n6 = 240.0f;
                                                        }
                                                        else {
                                                            n6 = 120.0f;
                                                        }
                                                        b2.E(1);
                                                        o8 = new q9h(new q9h$b[] { (q9h$b)new lhq(n6, b2.t()) });
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
                                    final Pair create = Pair.create(o, o2);
                                    final q9h q9h = (q9h)create.first;
                                    final q9h q9h2 = q9h3 = (q9h)create.second;
                                    q9h4 = q9h;
                                    list5 = list;
                                    if (q9h != null) {
                                        iyb.b(q9h);
                                        q9h3 = q9h2;
                                        q9h4 = q9h;
                                        list5 = list;
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                        else {
                            q9h3 = null;
                            q9h4 = null;
                            list5 = list;
                        }
                        final jx0.a b8 = a.b(1835365473);
                        q9h q9h5 = null;
                        Label_2108: {
                            if (b8 != null) {
                                final byte[] a4 = kx0.a;
                                final jx0.b c3 = b8.c(1751411826);
                                final jx0.b c4 = b8.c(1801812339);
                                final jx0.b c5 = b8.c(1768715124);
                                if (c3 != null && c4 != null && c5 != null) {
                                    final gxj b9 = c3.b;
                                    b9.D(16);
                                    if (b9.e() == 1835299937) {
                                        final gxj b10 = c4.b;
                                        b10.D(12);
                                        final int e7 = b10.e();
                                        String[] array = new String[e7];
                                        for (int i = 0; i < e7; ++i) {
                                            final int e8 = b10.e();
                                            b10.E(4);
                                            array[i] = b10.q(e8 - 8);
                                        }
                                        final gxj b11 = c5.b;
                                        b11.D(8);
                                        final ArrayList<Object> list6 = new ArrayList<Object>();
                                        int n7 = e7;
                                        while (true) {
                                            final int c6 = b11.c;
                                            final int b12 = b11.b;
                                            if (c6 - b12 <= 8) {
                                                break;
                                            }
                                            final int e9 = b11.e();
                                            final int n8 = b11.e() - 1;
                                            if (n8 >= 0 && n8 < n7) {
                                                final String s2 = array[n8];
                                                Object o9;
                                                while (true) {
                                                    final int b13 = b11.b;
                                                    if (b13 >= b12 + e9) {
                                                        o9 = null;
                                                        break;
                                                    }
                                                    int e10 = b11.e();
                                                    if (b11.e() == 1684108385) {
                                                        final int e11 = b11.e();
                                                        final int e12 = b11.e();
                                                        e10 -= 16;
                                                        final byte[] array2 = new byte[e10];
                                                        b11.d(array2, 0, e10);
                                                        o9 = new uqg(s2, array2, e12, e11);
                                                        break;
                                                    }
                                                    b11.D(b13 + e10);
                                                }
                                                final String[] array3 = array;
                                                final int n9 = n7 = n7;
                                                array = array3;
                                                if (o9 != null) {
                                                    list6.add(o9);
                                                    n7 = n9;
                                                    array = array3;
                                                }
                                            }
                                            else {
                                                d10.F(52, "Skipped metadata with unknown key index: ", n8, "AtomParsers");
                                            }
                                            b11.D(b12 + e9);
                                        }
                                        if (!list6.isEmpty()) {
                                            q9h5 = new q9h((List)list6);
                                            break Label_2108;
                                        }
                                    }
                                }
                            }
                            q9h5 = null;
                        }
                        final List f = kx0.f(a, iyb, -9223372036854775807L, (b)null, (gsh2.a & 0x1) != 0x0, b, (dub)c0e.F0);
                        final voa r = gsh2.r;
                        Objects.requireNonNull(r);
                        final ArrayList list7 = (ArrayList)f;
                        final int size = list7.size();
                        long max = -9223372036854775807L;
                        int j = 0;
                        int size2 = -1;
                        final ArrayList<gsh.gsh$a> list8 = list5;
                        q9h6 = q9h5;
                        q9h q9h7 = q9h4;
                        while (j < size) {
                            final wwt wwt = list7.get(j);
                            gsh gsh3;
                            q9h q9h10;
                            if (wwt.b == 0) {
                                final q9h q9h8 = q9h7;
                                gsh3 = gsh2;
                                q9h9 = q9h3;
                                q9h10 = q9h8;
                            }
                            else {
                                final pwt a5 = wwt.a;
                                long n10 = a5.e;
                                if (n10 == -9223372036854775807L) {
                                    n10 = wwt.h;
                                }
                                max = Math.max(max, n10);
                                final gsh.gsh$a gsh$a = new gsh.gsh$a(a5, wwt, r.r(j, a5.b));
                                int l;
                                if ("audio/true-hd".equals(a5.f.Q0)) {
                                    l = wwt.e * 16;
                                }
                                else {
                                    l = wwt.e + 30;
                                }
                                final n$a n$a = new n$a(a5.f);
                                n$a.l = l;
                                final int b14 = a5.b;
                                if (b14 == 2 && n10 > 0L) {
                                    final int b15 = wwt.b;
                                    if (b15 > 1) {
                                        n$a.r = b15 / (n10 / 1000000.0f);
                                    }
                                }
                                if (b14 == 1) {
                                    final int a6 = iyb.a;
                                    if (a6 != -1 && iyb.b != -1) {
                                        n$a.A = a6;
                                        n$a.B = iyb.b;
                                    }
                                }
                                q9h q9h11;
                                if (this.h.isEmpty()) {
                                    q9h11 = null;
                                }
                                else {
                                    q9h11 = new q9h((List)this.h);
                                }
                                final q9h q9h12 = new q9h(new q9h$b[0]);
                                q9h q9h13;
                                if ((b14 != 1) ? (b14 == 2 && q9h6 != null) : (q9h7 != null)) {
                                    q9h13 = q9h7;
                                }
                                else {
                                    q9h13 = q9h12;
                                }
                                final q9h q9h14 = q9h7;
                                q9h9 = q9h3;
                                q9h b16 = q9h13;
                                q9h10 = q9h14;
                                for (int k = 0; k < 2; ++k) {
                                    b16 = b16.b((new q9h[] { q9h3, q9h11 })[k]);
                                }
                                if (b16.F0.length > 0) {
                                    n$a.i = b16;
                                }
                                gsh$a.c.e(new n(n$a));
                                if (a5.b == 2 && size2 == -1) {
                                    size2 = list8.size();
                                }
                                list8.add(gsh$a);
                                gsh3 = this;
                            }
                            ++j;
                            q9h3 = q9h9;
                            final q9h q9h15 = q9h10;
                            gsh2 = gsh3;
                            q9h7 = q9h15;
                        }
                        gsh = this;
                        gsh2.u = size2;
                        gsh2.v = max;
                        final gsh.gsh$a[] s3 = list8.toArray(new gsh.gsh$a[0]);
                        gsh2.s = s3;
                        final long[][] t2 = new long[s3.length][];
                        final int[] array4 = new int[s3.length];
                        final long[] array5 = new long[s3.length];
                        final boolean[] array6 = new boolean[s3.length];
                        for (int n11 = 0; n11 < s3.length; ++n11) {
                            t2[n11] = new long[s3[n11].b.b];
                            array5[n11] = s3[n11].b.f[0];
                        }
                        int n12 = 0;
                        long n13 = 0L;
                        while (n12 < s3.length) {
                            long n14 = Long.MAX_VALUE;
                            int n15 = 0;
                            int n16 = -1;
                            while (n15 < s3.length) {
                                long n17 = n14;
                                int n18 = n16;
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
                            int n19 = array4[n16];
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
                        gsh2.t = t2;
                        r.p();
                        r.l((qcp)gsh2);
                        gsh2.f.clear();
                        gsh2.i = 2;
                        gsh4 = gsh2;
                    }
                    else {
                        final gsh gsh5 = gsh;
                        gsh4 = gsh2;
                        gsh = gsh5;
                        if (!gsh2.f.isEmpty()) {
                            gsh2.f.peek().d.add(a);
                            gsh = gsh5;
                            gsh4 = gsh2;
                        }
                    }
                }
                if (gsh2.i != 2) {
                    this.j();
                }
                return;
                final q9h$b[] f2;
                final q9h$b q9h$b = f2[n20];
                iftrue(Label_2659:)(!(q9h$b instanceof uqg));
                final uqg uqg = (uqg)q9h$b;
                final String f3 = uqg.F0;
                q9h q9h7 = null;
                q9h q9h10 = q9h7;
                iftrue(Label_2659:)(!"com.android.capture.fps".equals(f3));
                Block_68: {
                    break Block_68;
                    Label_2669: {
                        q9h10 = q9h7;
                    }
                    final q9h q9h12;
                    final q9h b16 = q9h12;
                    continue;
                }
                q9h b16 = new q9h(new q9h$b[] { (q9h$b)uqg });
                continue;
            }
            Label_2659: {
                ++n20;
            }
            final q9h q9h16 = q9h9;
            final q9h$b[] f2 = q9h6.F0;
            q9h9 = q9h16;
            iftrue(Label_2669:)(n20 >= f2.length);
            continue;
        }
    }
    
    public final void release() {
    }
}
