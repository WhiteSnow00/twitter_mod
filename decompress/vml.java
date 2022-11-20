import java.io.IOException;
import android.util.Log;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class vml implements ina
{
    public final x9t a;
    public final SparseArray<vml.vml$a> b;
    public final rwj c;
    public final uml d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public sml i;
    public nna j;
    public boolean k;
    
    static {
        final z61 i0 = z61.I0;
    }
    
    public vml() {
        final x9t a = new x9t(0L);
        this.a = a;
        this.c = new rwj(4096);
        this.b = (SparseArray<vml.vml$a>)new SparseArray();
        this.d = new uml();
    }
    
    @Override
    public final int a(final jna jna, final zrk zrk) throws IOException {
        omy.m((Object)this.j);
        final long length = jna.getLength();
        final int n = 1;
        final int n2 = 0;
        final long n3 = lcmp(length, -1L);
        final boolean b = n3 != 0;
        final long n4 = -9223372036854775807L;
        if (b) {
            final uml d = this.d;
            if (!d.c) {
                if (!d.e) {
                    final long length2 = jna.getLength();
                    final int n5 = (int)Math.min(20000L, length2);
                    final long a = length2 - n5;
                    if (jna.getPosition() != a) {
                        zrk.a = a;
                        return n;
                    }
                    d.b.A(n5);
                    jna.e();
                    jna.n(d.b.a, 0, n5);
                    final rwj b2 = d.b;
                    final int b3 = b2.b;
                    int n7 = b2.c - 4;
                    long c;
                    while (true) {
                        c = n4;
                        if (n7 < b3) {
                            break;
                        }
                        if (d.b(b2.a, n7) == 442) {
                            b2.D(n7 + 4);
                            c = uml.c(b2);
                            if (c != -9223372036854775807L) {
                                break;
                            }
                        }
                        --n7;
                    }
                    d.g = c;
                    d.e = true;
                }
                else {
                    if (d.g == -9223372036854775807L) {
                        d.a(jna);
                        return n2;
                    }
                    if (!d.d) {
                        final int n8 = (int)Math.min(20000L, jna.getLength());
                        final long position = jna.getPosition();
                        final long a2 = 0;
                        if (position != a2) {
                            zrk.a = a2;
                            return n;
                        }
                        d.b.A(n8);
                        jna.e();
                        jna.n(d.b.a, 0, n8);
                        final rwj b4 = d.b;
                        int b5 = b4.b;
                        final int c2 = b4.c;
                        long c3;
                        while (true) {
                            c3 = n4;
                            if (b5 >= c2 - 3) {
                                break;
                            }
                            if (d.b(b4.a, b5) == 442) {
                                b4.D(b5 + 4);
                                c3 = uml.c(b4);
                                if (c3 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            ++b5;
                        }
                        d.f = c3;
                        d.d = true;
                    }
                    else {
                        final long f = d.f;
                        if (f == -9223372036854775807L) {
                            d.a(jna);
                            return n2;
                        }
                        final long h = d.a.b(d.g) - d.a.b(f);
                        d.h = h;
                        if (h < 0L) {
                            final StringBuilder sb = new StringBuilder(65);
                            sb.append("Invalid duration: ");
                            sb.append(h);
                            sb.append(". Using TIME_UNSET instead.");
                            Log.w("PsDurationReader", sb.toString());
                            d.h = -9223372036854775807L;
                        }
                        d.a(jna);
                        return n2;
                    }
                }
                return 0;
            }
        }
        if (!this.k) {
            this.k = true;
            final uml d2 = this.d;
            final long h2 = d2.h;
            if (h2 != -9223372036854775807L) {
                final sml i = new sml(d2.a, h2, length);
                this.i = i;
                this.j.l((vbp)((ay1)i).a);
            }
            else {
                this.j.l((vbp)new vbp.b(h2));
            }
        }
        final sml j = this.i;
        if (j != null && ((ay1)j).b()) {
            return ((ay1)this.i).a(jna, zrk);
        }
        jna.e();
        long n9;
        if (n3 != 0) {
            n9 = length - jna.h();
        }
        else {
            n9 = -1L;
        }
        if (n9 != -1L && n9 < 4L) {
            return -1;
        }
        if (!jna.c(this.c.a, 0, 4, true)) {
            return -1;
        }
        this.c.D(0);
        final int e = this.c.e();
        if (e == 441) {
            return -1;
        }
        if (e == 442) {
            jna.n(this.c.a, 0, 10);
            this.c.D(9);
            jna.k((this.c.t() & 0x7) + 14);
            return 0;
        }
        if (e == 443) {
            jna.n(this.c.a, 0, 2);
            this.c.D(0);
            jna.k(this.c.y() + 6);
            return 0;
        }
        if ((e & 0xFFFFFF00) >> 8 != 1) {
            jna.k(1);
            return 0;
        }
        final int n10 = e & 0xFF;
        vml.vml$a vml$a2;
        final vml.vml$a vml$a = vml$a2 = (vml.vml$a)this.b.get(n10);
        if (!this.e) {
            vml.vml$a vml$a3;
            if ((vml$a3 = vml$a) == null) {
                ay9 ay9 = null;
                Label_1077: {
                    Object o;
                    if (n10 == 189) {
                        o = new bf(null);
                        this.f = true;
                        this.h = jna.getPosition();
                    }
                    else if ((n10 & 0xE0) == 0xC0) {
                        o = new vrh(null);
                        this.f = true;
                        this.h = jna.getPosition();
                    }
                    else {
                        if ((n10 & 0xF0) != 0xE0) {
                            break Label_1077;
                        }
                        o = new iac((maw)null);
                        this.g = true;
                        this.h = jna.getPosition();
                    }
                    ay9 = (ay9)o;
                }
                vml$a3 = vml$a;
                if (ay9 != null) {
                    ay9.d(this.j, new uau.d(n10, 256));
                    vml$a3 = new vml.vml$a(ay9, this.a);
                    this.b.put(n10, (Object)vml$a3);
                }
            }
            long n11;
            if (this.f && this.g) {
                n11 = this.h + 8192L;
            }
            else {
                n11 = 1048576L;
            }
            vml$a2 = vml$a3;
            if (jna.getPosition() > n11) {
                this.e = true;
                this.j.m();
                vml$a2 = vml$a3;
            }
        }
        jna.n(this.c.a, 0, 2);
        this.c.D(0);
        final int n12 = this.c.y() + 6;
        if (vml$a2 == null) {
            jna.k(n12);
        }
        else {
            this.c.A(n12);
            jna.readFully(this.c.a, 0, n12);
            this.c.D(6);
            final rwj c4 = this.c;
            c4.d(vml$a2.c.b, 0, 3);
            vml$a2.c.k(0);
            vml$a2.c.m(8);
            vml$a2.d = vml$a2.c.f();
            vml$a2.e = vml$a2.c.f();
            vml$a2.c.m(6);
            c4.d(vml$a2.c.b, 0, vml$a2.c.g(8));
            vml$a2.c.k(0);
            vml$a2.g = 0L;
            if (vml$a2.d) {
                vml$a2.c.m(4);
                final long n13 = vml$a2.c.g(3);
                vml$a2.c.m(1);
                final long n14 = vml$a2.c.g(15) << 15;
                vml$a2.c.m(1);
                final long n15 = vml$a2.c.g(15);
                vml$a2.c.m(1);
                if (!vml$a2.f && vml$a2.e) {
                    vml$a2.c.m(4);
                    final long n16 = vml$a2.c.g(3);
                    vml$a2.c.m(1);
                    final long n17 = vml$a2.c.g(15) << 15;
                    vml$a2.c.m(1);
                    final long n18 = vml$a2.c.g(15);
                    vml$a2.c.m(1);
                    vml$a2.b.b(n18 | (n16 << 30 | n17));
                    vml$a2.f = true;
                }
                vml$a2.g = vml$a2.b.b(n13 << 30 | n14 | n15);
            }
            vml$a2.a.f(vml$a2.g, 4);
            vml$a2.a.a(c4);
            vml$a2.a.e();
            final rwj c5 = this.c;
            c5.C(c5.a.length);
        }
        return 0;
    }
    
    @Override
    public final boolean b(final jna jna) throws IOException {
        final byte[] array = new byte[14];
        final pg8 pg8 = (pg8)jna;
        boolean b = false;
        pg8.c(array, 0, 14, false);
        if (0x1BA != ((array[0] & 0xFF) << 24 | (array[1] & 0xFF) << 16 | (array[2] & 0xFF) << 8 | (array[3] & 0xFF))) {
            return false;
        }
        if ((array[4] & 0xC4) != 0x44) {
            return false;
        }
        if ((array[6] & 0x4) != 0x4) {
            return false;
        }
        if ((array[8] & 0x4) != 0x4) {
            return false;
        }
        if ((array[9] & 0x1) != 0x1) {
            return false;
        }
        if ((array[12] & 0x3) != 0x3) {
            return false;
        }
        final byte b2 = array[13];
        final pg8 pg9 = (pg8)jna;
        pg9.l(b2 & 0x7, false);
        pg9.c(array, 0, 3, false);
        if (0x1 == ((array[0] & 0xFF) << 16 | (array[1] & 0xFF) << 8 | (array[2] & 0xFF))) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final void c(long n, final long n2) {
        n = this.a.d();
        final int n3 = 1;
        int n4;
        if ((n4 = ((n == -9223372036854775807L) ? 1 : 0)) == 0) {
            n = this.a.c();
            int n5;
            if (n != -9223372036854775807L && n != 0L && n != n2) {
                n5 = n3;
            }
            else {
                n5 = 0;
            }
            n4 = n5;
        }
        if (n4 != 0) {
            this.a.e(n2);
        }
        final sml i = this.i;
        if (i != null) {
            ((ay1)i).e(n2);
        }
        for (int j = 0; j < this.b.size(); ++j) {
            final vml.vml$a vml$a = (vml.vml$a)this.b.valueAt(j);
            vml$a.f = false;
            vml$a.a.c();
        }
    }
    
    @Override
    public final void i(final nna j) {
        this.j = j;
    }
    
    @Override
    public final void release() {
    }
}
