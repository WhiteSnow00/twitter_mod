import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import java.io.IOException;
import java.util.Objects;
import com.google.android.exoplayer2.ParserException;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class qce implements qoa
{
    public final gxj a;
    public voa b;
    public int c;
    public int d;
    public int e;
    public long f;
    public wrh g;
    public roa h;
    public t8r i;
    public gsh j;
    
    public qce() {
        this.a = new gxj(6);
        this.f = -1L;
    }
    
    public final int a(final roa h, final lsk lsk) throws IOException {
        final int c = this.c;
        if (c == 0) {
            this.a.A(2);
            h.readFully(this.a.a, 0, 2);
            final int y = this.a.y();
            if ((this.d = y) == 65498) {
                if (this.f != -1L) {
                    this.c = 4;
                }
                else {
                    this.d();
                }
            }
            else if ((y < 65488 || y > 65497) && y != 65281) {
                this.c = 1;
            }
            return 0;
        }
        if (c == 1) {
            this.a.A(2);
            h.readFully(this.a.a, 0, 2);
            this.e = this.a.y() - 2;
            this.c = 2;
            return 0;
        }
        if (c == 2) {
            if (this.d == 65505) {
                final int e = this.e;
                final byte[] array = new byte[e];
                h.readFully(array, 0, e);
                if (this.g == null) {
                    final wrh wrh = null;
                    Object o;
                    int n;
                    if (e + 0 == 0) {
                        o = null;
                        n = 0;
                    }
                    else {
                        int n2;
                        for (n2 = 0; n2 < e && array[n2] != 0; ++n2) {}
                        final String o2 = rnw.o(array, 0, n2 + 0);
                        n = n2;
                        o = o2;
                        if (n2 < e) {
                            n = n2 + 1;
                            o = o2;
                        }
                    }
                    if ("http://ns.adobe.com/xap/1.0/".equals(o)) {
                        String o3;
                        if (e - n == 0) {
                            o3 = null;
                        }
                        else {
                            int n3;
                            for (n3 = n; n3 < e && array[n3] != 0; ++n3) {}
                            o3 = rnw.o(array, n, n3 - n);
                        }
                        if (o3 != null) {
                            final long length = h.getLength();
                            wrh g;
                            if (length == -1L) {
                                g = wrh;
                            }
                            else {
                                vrh a;
                                try {
                                    a = qvx.a(o3);
                                }
                                catch (final XmlPullParserException | ParserException | NumberFormatException ex) {
                                    Log.w("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                    a = null;
                                }
                                if (a == null) {
                                    g = wrh;
                                }
                                else if (a.b.size() < 2) {
                                    g = wrh;
                                }
                                else {
                                    int i = a.b.size() - 1;
                                    long n4 = -1L;
                                    long n5 = -1L;
                                    long n7;
                                    final long n6 = n7 = n5;
                                    boolean b = false;
                                    long n8 = n6;
                                    long n9 = length;
                                    while (i >= 0) {
                                        final vrh$a vrh$a = a.b.get(i);
                                        final boolean b2 = b | "video/mp4".equals(vrh$a.a);
                                        long n10;
                                        if (i == 0) {
                                            n10 = n9 - vrh$a.c;
                                            n9 = 0L;
                                        }
                                        else {
                                            final long b3 = vrh$a.b;
                                            n10 = n9;
                                            n9 -= b3;
                                        }
                                        b = b2;
                                        long n11 = n8;
                                        long n12 = n7;
                                        if (b2) {
                                            b = b2;
                                            n11 = n8;
                                            n12 = n7;
                                            if (n9 != n10) {
                                                n12 = n10 - n9;
                                                n11 = n9;
                                                b = false;
                                            }
                                        }
                                        if (i == 0) {
                                            n4 = n9;
                                            n5 = n10;
                                        }
                                        --i;
                                        n8 = n11;
                                        n7 = n12;
                                    }
                                    g = wrh;
                                    if (n8 != -1L) {
                                        g = wrh;
                                        if (n7 != -1L) {
                                            g = wrh;
                                            if (n4 != -1L) {
                                                if (n5 == -1L) {
                                                    g = wrh;
                                                }
                                                else {
                                                    g = new wrh(n4, n5, a.a, n8, n7);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if ((this.g = g) != null) {
                                this.f = g.I0;
                            }
                        }
                    }
                }
            }
            else {
                h.k(this.e);
            }
            return this.c = 0;
        }
        if (c != 4) {
            if (c == 5) {
                if (this.i == null || h != this.h) {
                    this.h = h;
                    this.i = new t8r(h, this.f);
                }
                final gsh j = this.j;
                Objects.requireNonNull(j);
                final int a2 = j.a((roa)this.i, lsk);
                if (a2 == 1) {
                    lsk.a += this.f;
                }
                return a2;
            }
            if (c == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        else {
            final long position = h.getPosition();
            final long f = this.f;
            if (position != f) {
                lsk.a = f;
                return 1;
            }
            if (!h.c(this.a.a, 0, 1, true)) {
                this.d();
            }
            else {
                h.e();
                if (this.j == null) {
                    this.j = new gsh(0);
                }
                final t8r k = new t8r(h, this.f);
                this.i = k;
                if (this.j.b((roa)k)) {
                    final gsh l = this.j;
                    final long f2 = this.f;
                    final voa b4 = this.b;
                    Objects.requireNonNull(b4);
                    l.r = (voa)new u8r(f2, b4);
                    final wrh g2 = this.g;
                    Objects.requireNonNull(g2);
                    this.e((q9h$b)g2);
                    this.c = 5;
                }
                else {
                    this.d();
                }
            }
            return 0;
        }
    }
    
    public final boolean b(final roa roa) throws IOException {
        final int f = this.f(roa);
        final boolean b = false;
        if (f != 65496) {
            return false;
        }
        if ((this.d = this.f(roa)) == 65504) {
            this.a.A(2);
            ((vh8)roa).c(this.a.a, 0, 2, false);
            ((vh8)roa).l(this.a.y() - 2, false);
            this.d = this.f(roa);
        }
        if (this.d != 65505) {
            return false;
        }
        ((vh8)roa).l(2, false);
        this.a.A(6);
        ((vh8)roa).c(this.a.a, 0, 6, false);
        boolean b2 = b;
        if (this.a.u() == 1165519206L) {
            b2 = b;
            if (this.a.y() == 0) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final void c(final long n, final long n2) {
        if (n == 0L) {
            this.c = 0;
            this.j = null;
        }
        else if (this.c == 5) {
            final gsh j = this.j;
            Objects.requireNonNull(j);
            j.c(n, n2);
        }
    }
    
    public final void d() {
        this.e(new q9h$b[0]);
        final voa b = this.b;
        Objects.requireNonNull(b);
        b.p();
        this.b.l((qcp)new qcp.b(-9223372036854775807L));
        this.c = 6;
    }
    
    public final void e(final q9h$b... array) {
        final voa b = this.b;
        Objects.requireNonNull(b);
        final vwt r = b.r(1024, 4);
        final n$a n$a = new n$a();
        n$a.j = "image/jpeg";
        n$a.i = new q9h(array);
        r.e(new n(n$a));
    }
    
    public final int f(final roa roa) throws IOException {
        this.a.A(2);
        ((vh8)roa).c(this.a.a, 0, 2, false);
        return this.a.y();
    }
    
    public final void i(final voa b) {
        this.b = b;
    }
    
    public final void release() {
        final gsh j = this.j;
        if (j != null) {
            Objects.requireNonNull(j);
        }
    }
}
