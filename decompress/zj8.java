import java.io.EOFException;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class zj8 implements tgj
{
    public final sgj a;
    public final long b;
    public final long c;
    public final ekr d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    
    public zj8(final ekr d, final long b, final long c, final long n, final long f, final boolean b2) {
        omi.m(b >= 0L && c > b);
        this.d = d;
        this.b = b;
        this.c = c;
        if (n != c - b && !b2) {
            this.e = 0;
        }
        else {
            this.f = f;
            this.e = 4;
        }
        this.a = new sgj();
    }
    
    @Override
    public final long a(final roa roa) throws IOException {
        final int e = this.e;
        if (e != 0) {
            if (e != 1) {
                if (e != 2) {
                    if (e != 3) {
                        if (e == 4) {
                            return -1L;
                        }
                        throw new IllegalStateException();
                    }
                }
                else {
                    long j = 0L;
                    Label_0345: {
                        if (this.i != this.j) {
                            final long position = roa.getPosition();
                            if (!this.a.c(roa, this.j)) {
                                j = this.i;
                                if (j != position) {
                                    break Label_0345;
                                }
                                throw new IOException("No ogg page can be found.");
                            }
                            else {
                                this.a.a(roa, false);
                                roa.e();
                                final long h = this.h;
                                final sgj a = this.a;
                                final long b = a.b;
                                final long n = h - b;
                                final int n2 = a.d + a.e;
                                if (0L > n || n >= 72000L) {
                                    final long n3 = lcmp(n, 0L);
                                    if (n3 < 0) {
                                        this.j = position;
                                        this.l = b;
                                    }
                                    else {
                                        this.i = roa.getPosition() + n2;
                                        this.k = this.a.b;
                                    }
                                    final long i = this.j;
                                    j = this.i;
                                    if (i - j < 100000L) {
                                        this.j = j;
                                        break Label_0345;
                                    }
                                    final long n4 = n2;
                                    long n5;
                                    if (n3 <= 0) {
                                        n5 = 2L;
                                    }
                                    else {
                                        n5 = 1L;
                                    }
                                    final long position2 = roa.getPosition();
                                    final long k = this.j;
                                    final long l = this.i;
                                    j = rnw.j((k - l) * n / (this.l - this.k) + (position2 - n4 * n5), l, k - 1L);
                                    break Label_0345;
                                }
                            }
                        }
                        j = -1L;
                    }
                    if (j != -1L) {
                        return j;
                    }
                    this.e = 3;
                }
                while (true) {
                    this.a.c(roa, -1L);
                    this.a.a(roa, false);
                    final sgj a2 = this.a;
                    if (a2.b > this.h) {
                        break;
                    }
                    roa.k(a2.d + a2.e);
                    this.i = roa.getPosition();
                    this.k = this.a.b;
                }
                roa.e();
                this.e = 4;
                return -(this.k + 2L);
            }
        }
        else {
            final long position3 = roa.getPosition();
            this.g = position3;
            this.e = 1;
            final long n6 = this.c - 65307L;
            if (n6 > position3) {
                return n6;
            }
        }
        this.a.b();
        if (this.a.c(roa, -1L)) {
            this.a.a(roa, false);
            final sgj a3 = this.a;
            roa.k(a3.d + a3.e);
            long f = this.a.b;
            while (true) {
                final sgj a4 = this.a;
                if ((a4.a & 0x4) == 0x4 || !a4.c(roa, -1L) || roa.getPosition() >= this.c || !this.a.a(roa, true)) {
                    break;
                }
                final sgj a5 = this.a;
                final int d = a5.d;
                final int e2 = a5.e;
                boolean b2;
                try {
                    roa.k(d + e2);
                    b2 = true;
                }
                catch (final EOFException ex) {
                    b2 = false;
                }
                if (!b2) {
                    break;
                }
                f = this.a.b;
            }
            this.f = f;
            this.e = 4;
            return this.g;
        }
        throw new EOFException();
    }
    
    @Override
    public final qcp b() {
        Object o;
        if (this.f != 0L) {
            o = new a();
        }
        else {
            o = null;
        }
        return (qcp)o;
    }
    
    @Override
    public final void c(final long n) {
        this.h = rnw.j(n, 0L, this.f - 1L);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
    
    public final class a implements qcp
    {
        public final zj8 a;
        
        public a(final zj8 a) {
            this.a = a;
        }
        
        public final qcp$a d(final long n) {
            final long a = this.a.d.a(n);
            final zj8 a2 = this.a;
            final long b = a2.b;
            final long c = a2.c;
            final scp scp = new scp(n, rnw.j((c - b) * a / a2.f + b - 30000L, b, c - 1L));
            return new qcp$a(scp, scp);
        }
        
        public final boolean f() {
            return true;
        }
        
        public final long h() {
            final zj8 a = this.a;
            return a.f * 1000000L / a.d.i;
        }
    }
}
