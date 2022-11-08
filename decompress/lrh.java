import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import java.util.Objects;
import android.util.Log;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrh implements joa
{
    public static final cc3 u;
    public final int a;
    public final long b;
    public final mwj c;
    public final rrh$a d;
    public final hyb e;
    public final d5d f;
    public final am9 g;
    public ooa h;
    public ovt i;
    public ovt j;
    public int k;
    public x8h l;
    public long m;
    public long n;
    public long o;
    public int p;
    public hbp q;
    public boolean r;
    public boolean s;
    public long t;
    
    static {
        u = cc3.L0;
    }
    
    public lrh() {
        this(-9223372036854775807L);
    }
    
    public lrh(final long b) {
        this.a = 0;
        this.b = b;
        this.c = new mwj(10);
        this.d = new rrh$a();
        this.e = new hyb();
        this.m = -9223372036854775807L;
        this.f = new d5d();
        final am9 am9 = new am9();
        this.g = am9;
        this.j = (ovt)am9;
    }
    
    public static long f(final x8h x8h) {
        if (x8h != null) {
            for (int length = x8h.C0.length, i = 0; i < length; ++i) {
                final x8h$b x8h$b = x8h.C0[i];
                if (x8h$b instanceof lhs) {
                    final lhs lhs = (lhs)x8h$b;
                    if (lhs.C0.equals("TLEN")) {
                        return imw.H(Long.parseLong(lhs.E0));
                    }
                }
            }
        }
        return -9223372036854775807L;
    }
    
    @Override
    public final int a(final koa koa, final rrk rrk) throws IOException {
        ri4.y((Object)this.i);
        final int a = imw.a;
        int n = 0;
        Label_2098: {
            if (this.k == 0) {
                try {
                    this.h(koa, false);
                }
                catch (final EOFException ex) {
                    n = -1;
                    break Label_2098;
                }
            }
            if (this.q == null) {
                final mwj mwj = new mwj(this.d.c);
                koa.n(mwj.a, 0, this.d.c);
                final rrh$a d = this.d;
                final int a2 = d.a;
                int n2 = 21;
                if ((a2 & 0x1) != 0x0) {
                    if (d.e != 1) {
                        n2 = 36;
                    }
                }
                else if (d.e == 1) {
                    n2 = 13;
                }
                int n3 = 0;
                Label_0211: {
                    if (mwj.c >= n2 + 4) {
                        mwj.D(n2);
                        final int e = mwj.e();
                        if ((n3 = e) == 1483304551) {
                            break Label_0211;
                        }
                        if (e == 1231971951) {
                            n3 = e;
                            break Label_0211;
                        }
                    }
                    if (mwj.c >= 40) {
                        mwj.D(36);
                        if (mwj.e() == 1447187017) {
                            n3 = 1447187017;
                            break Label_0211;
                        }
                    }
                    n3 = 0;
                }
                final long n4 = -1L;
                Object e3;
                if (n3 != 1483304551 && n3 != 1231971951) {
                    if (n3 == 1447187017) {
                        final long length = koa.getLength();
                        final long position = koa.getPosition();
                        final rrh$a d2 = this.d;
                        mwj.E(10);
                        final int e2 = mwj.e();
                        Label_0437: {
                            Label_0435: {
                                if (e2 > 0) {
                                    final int d3 = d2.d;
                                    final long n5 = e2;
                                    int n6;
                                    if (d3 >= 32000) {
                                        n6 = 1152;
                                    }
                                    else {
                                        n6 = 576;
                                    }
                                    final long n7 = imw.N(n5, n6 * 1000000L, (long)d3);
                                    final int y = mwj.y();
                                    final int y2 = mwj.y();
                                    final int y3 = mwj.y();
                                    mwj.E(2);
                                    final long n8 = d2.c;
                                    final long[] array = new long[y];
                                    final long[] array2 = new long[y];
                                    long n9 = position;
                                    for (int i = 0; i < y; ++i) {
                                        array[i] = i * n7 / y;
                                        array2[i] = Math.max(n9, n8 + position);
                                        int n10;
                                        if (y3 != 1) {
                                            if (y3 != 2) {
                                                if (y3 != 3) {
                                                    if (y3 != 4) {
                                                        break Label_0435;
                                                    }
                                                    n10 = mwj.w();
                                                }
                                                else {
                                                    n10 = mwj.v();
                                                }
                                            }
                                            else {
                                                n10 = mwj.y();
                                            }
                                        }
                                        else {
                                            n10 = mwj.t();
                                        }
                                        n9 += n10 * y2;
                                    }
                                    if (length != -1L && length != n9) {
                                        final StringBuilder sb = new StringBuilder(67);
                                        sb.append("VBRI data size mismatch: ");
                                        sb.append(length);
                                        sb.append(", ");
                                        sb.append(n9);
                                        Log.w("VbriSeeker", sb.toString());
                                    }
                                    e3 = new mow(array, array2, n7, n9);
                                    break Label_0437;
                                }
                            }
                            e3 = null;
                        }
                        koa.k(this.d.c);
                    }
                    else {
                        koa.e();
                        e3 = null;
                    }
                }
                else {
                    final long length2 = koa.getLength();
                    final long position2 = koa.getPosition();
                    final rrh$a d4 = this.d;
                    final int g = d4.g;
                    final int d5 = d4.d;
                    final int e4 = mwj.e();
                    Object o = null;
                    Label_0871: {
                        if ((e4 & 0x1) == 0x1) {
                            final int w = mwj.w();
                            if (w != 0) {
                                final long n11 = imw.N((long)w, g * 1000000L, (long)d5);
                                fux fux;
                                if ((e4 & 0x6) != 0x6) {
                                    fux = new fux(position2, d4.c, n11, -1L, (long[])null);
                                }
                                else {
                                    final long u = mwj.u();
                                    final long[] array3 = new long[100];
                                    for (int j = 0; j < 100; ++j) {
                                        array3[j] = mwj.t();
                                    }
                                    if (length2 != -1L) {
                                        final long n12 = position2 + u;
                                        if (length2 != n12) {
                                            final StringBuilder sb2 = new StringBuilder(67);
                                            sb2.append("XING data size mismatch: ");
                                            sb2.append(length2);
                                            sb2.append(", ");
                                            sb2.append(n12);
                                            Log.w("XingSeeker", sb2.toString());
                                        }
                                    }
                                    fux = new fux(position2, d4.c, n11, u, array3);
                                }
                                o = fux;
                                break Label_0871;
                            }
                        }
                        o = null;
                    }
                    if (o != null) {
                        final hyb e5 = this.e;
                        if (e5.a == -1 || e5.b == -1) {
                            koa.e();
                            koa.i(n2 + 141);
                            koa.n(this.c.a, 0, 3);
                            this.c.D(0);
                            final hyb e6 = this.e;
                            final int v = this.c.v();
                            Objects.requireNonNull(e6);
                            final int a3 = v >> 12;
                            final int b = v & 0xFFF;
                            if (a3 > 0 || b > 0) {
                                e6.a = a3;
                                e6.b = b;
                            }
                        }
                    }
                    koa.k(this.d.c);
                    if ((e3 = o) != null) {
                        e3 = o;
                        if (!((fux)o).f()) {
                            e3 = o;
                            if (n3 == 1231971951) {
                                e3 = this.e(koa, false);
                            }
                        }
                    }
                }
                final x8h l = this.l;
                long position3 = koa.getPosition();
                Object o2 = null;
                Label_1276: {
                    if (l != null) {
                        for (int length3 = l.C0.length, k = 0; k < length3; ++k) {
                            final x8h$b x8h$b = l.C0[k];
                            if (x8h$b instanceof gch) {
                                final gch gch = (gch)x8h$b;
                                final long f = f(l);
                                final int length4 = gch.G0.length;
                                final int n13 = length4 + 1;
                                final long[] array4 = new long[n13];
                                final long[] array5 = new long[n13];
                                array4[0] = position3;
                                array5[0] = 0L;
                                long n14 = 0L;
                                for (int n15 = 1; n15 <= length4; ++n15) {
                                    final int e7 = gch.E0;
                                    final int[] g2 = gch.G0;
                                    final int n16 = n15 - 1;
                                    position3 += e7 + g2[n16];
                                    n14 += gch.F0 + gch.H0[n16];
                                    array4[n15] = position3;
                                    array5[n15] = n14;
                                }
                                o2 = new hch(array4, array5, f);
                                break Label_1276;
                            }
                        }
                    }
                    o2 = null;
                }
                Object e8 = null;
                Label_1293: {
                    if (this.r) {
                        e8 = new hbp$a();
                    }
                    else {
                        if ((this.a & 0x4) != 0x0) {
                            long n17;
                            long e9;
                            if (o2 != null) {
                                n17 = ((hch)o2).c;
                                e9 = n4;
                            }
                            else if (e3 != null) {
                                n17 = ((ebp)e3).h();
                                e9 = ((hbp)e3).e();
                            }
                            else {
                                n17 = f(this.l);
                                e9 = n4;
                            }
                            e3 = new xkd(n17, koa.getPosition(), e9);
                        }
                        else if (o2 != null) {
                            e3 = o2;
                        }
                        else if (e3 == null) {
                            e3 = null;
                        }
                        if (e3 != null) {
                            e8 = e3;
                            if (((ebp)e3).f()) {
                                break Label_1293;
                            }
                            e8 = e3;
                            if ((this.a & 0x1) == 0x0) {
                                break Label_1293;
                            }
                        }
                        e8 = this.e(koa, (this.a & 0x2) != 0x0);
                    }
                }
                this.q = (hbp)e8;
                this.h.n((ebp)e8);
                final ovt m = this.j;
                final n$a n$a = new n$a();
                final rrh$a d6 = this.d;
                n$a.k = d6.b;
                n$a.l = 4096;
                n$a.x = d6.e;
                n$a.y = d6.d;
                final hyb e10 = this.e;
                n$a.A = e10.a;
                n$a.B = e10.b;
                x8h l2;
                if ((this.a & 0x8) != 0x0) {
                    l2 = null;
                }
                else {
                    l2 = this.l;
                }
                n$a.i = l2;
                m.e(new n(n$a));
                this.o = koa.getPosition();
            }
            else if (this.o != 0L) {
                final long position4 = koa.getPosition();
                final long o3 = this.o;
                if (position4 < o3) {
                    koa.k((int)(o3 - position4));
                }
            }
            Label_2096: {
                Label_2023: {
                    if (this.p == 0) {
                        koa.e();
                        if (this.g(koa)) {
                            break Label_2023;
                        }
                        this.c.D(0);
                        final int e11 = this.c.e();
                        if ((0xFFFE0C00 & e11) != ((long)this.k & 0xFFFFFFFFFFFE0C00L) || rrh.a(e11) == -1) {
                            koa.k(1);
                            this.k = 0;
                            break Label_2096;
                        }
                        this.d.a(e11);
                        if (this.m == -9223372036854775807L) {
                            this.m = this.q.g(koa.getPosition());
                            if (this.b != -9223372036854775807L) {
                                this.m += this.b - this.q.g(0L);
                            }
                        }
                        final rrh$a d7 = this.d;
                        this.p = d7.c;
                        final hbp q = this.q;
                        if (q instanceof xkd) {
                            final xkd xkd = (xkd)q;
                            final long d8 = this.d(this.n + d7.g);
                            final long position5 = koa.getPosition();
                            final long n18 = this.d.c;
                            if (!xkd.a(d8)) {
                                xkd.b.a(d8);
                                xkd.c.a(position5 + n18);
                            }
                            if (this.s && xkd.a(this.t)) {
                                this.s = false;
                                this.j = this.i;
                            }
                        }
                    }
                    final int c = this.j.c((v78)koa, this.p, true);
                    if (c != -1) {
                        if ((this.p -= c) > 0) {
                            break Label_2096;
                        }
                        this.j.b(this.d(this.n), 1, this.d.c, 0, (ovt$a)null);
                        this.n += this.d.g;
                        this.p = 0;
                        break Label_2096;
                    }
                }
                n = -1;
                break Label_2098;
            }
            n = 0;
        }
        if (n == -1 && this.q instanceof xkd) {
            final long d9 = this.d(this.n);
            if (((ebp)this.q).h() != d9) {
                final hbp q2 = this.q;
                ((xkd)q2).d = d9;
                this.h.n((ebp)q2);
            }
        }
        return n;
    }
    
    @Override
    public final boolean b(final koa koa) throws IOException {
        return this.h(koa, true);
    }
    
    @Override
    public final void c(final long n, final long t) {
        this.k = 0;
        this.m = -9223372036854775807L;
        this.n = 0L;
        this.p = 0;
        this.t = t;
        final hbp q = this.q;
        if (q instanceof xkd && !((xkd)q).a(t)) {
            this.s = true;
            this.j = (ovt)this.g;
        }
    }
    
    public final long d(final long n) {
        return n * 1000000L / this.d.d + this.m;
    }
    
    public final hbp e(final koa koa, final boolean b) throws IOException {
        koa.n(this.c.a, 0, 4);
        this.c.D(0);
        this.d.a(this.c.e());
        return (hbp)new oi6(koa.getLength(), koa.getPosition(), this.d, b);
    }
    
    public final boolean g(final koa koa) throws IOException {
        final hbp q = this.q;
        if (q != null) {
            final long e = q.e();
            if (e != -1L && koa.h() > e - 4L) {
                return true;
            }
        }
        try {
            return koa.c(this.c.a, 0, 4, true) ^ true;
        }
        catch (final EOFException ex) {
            return true;
        }
    }
    
    public final boolean h(final koa koa, final boolean b) throws IOException {
        int n;
        if (b) {
            n = 32768;
        }
        else {
            n = 131072;
        }
        koa.e();
        int n3;
        if (koa.getPosition() == 0L) {
            Object u;
            if ((this.a & 0x8) == 0x0) {
                u = null;
            }
            else {
                u = lrh.u;
            }
            final x8h a = this.f.a(koa, (b5d$a)u);
            this.l = a;
            if (a != null) {
                this.e.b(a);
            }
            final int n2 = n3 = (int)koa.h();
            if (!b) {
                koa.k(n2);
                n3 = n2;
            }
        }
        else {
            n3 = 0;
        }
        int k = 0;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            while (!this.g(koa)) {
                this.c.D(0);
                final int e = this.c.e();
                if (k == 0 || (0xFFFE0C00 & e) == ((long)k & 0xFFFFFFFFFFFE0C00L)) {
                    final int a2 = rrh.a(e);
                    if (a2 != -1) {
                        final int n6 = n4 + 1;
                        int n7;
                        if (n6 == 1) {
                            this.d.a(e);
                            n7 = e;
                        }
                        else {
                            n7 = k;
                            if (n6 == 4) {
                                if (b) {
                                    koa.k(n3 + n5);
                                }
                                else {
                                    koa.e();
                                }
                                this.k = k;
                                return true;
                            }
                        }
                        koa.i(a2 - 4);
                        k = n7;
                        n4 = n6;
                        continue;
                    }
                }
                final int n8 = n5 + 1;
                if (n5 == n) {
                    if (b) {
                        return false;
                    }
                    throw ParserException.a("Searched too many bytes.", (Throwable)null);
                }
                else {
                    if (b) {
                        koa.e();
                        koa.i(n3 + n8);
                    }
                    else {
                        koa.k(1);
                    }
                    n5 = n8;
                    k = 0;
                    n4 = 0;
                }
            }
            if (n4 > 0) {
                continue;
            }
            break;
        }
        throw new EOFException();
    }
    
    @Override
    public final void i(final ooa h) {
        this.h = h;
        final ovt s = h.s(0, 1);
        this.i = s;
        this.j = s;
        this.h.q();
    }
    
    @Override
    public final void release() {
    }
}
