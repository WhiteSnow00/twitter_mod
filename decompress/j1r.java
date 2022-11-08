import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class j1r extends fb
{
    public final mwj D0;
    public final rgx E0;
    public h9t F0;
    
    public j1r() {
        this.D0 = new mwj();
        this.E0 = new rgx();
    }
    
    public final x8h m0(final h9h h9h, final ByteBuffer byteBuffer) {
        final h9t f0 = this.F0;
        if (f0 == null || h9h.K0 != f0.d()) {
            (this.F0 = new h9t(((DecoderInputBuffer)h9h).G0)).a(((DecoderInputBuffer)h9h).G0 - h9h.K0);
        }
        final byte[] array = byteBuffer.array();
        final int limit = byteBuffer.limit();
        this.D0.B(array, limit);
        this.E0.j(array, limit);
        this.E0.m(39);
        final long n = (long)this.E0.g(1) << 32 | (long)this.E0.g(32);
        this.E0.m(20);
        int g = this.E0.g(12);
        final int g2 = this.E0.g(8);
        this.D0.E(14);
        Object o = null;
        if (g2 != 0) {
            if (g2 != 255) {
                if (g2 != 4) {
                    if (g2 != 5) {
                        if (g2 == 6) {
                            final mwj d0 = this.D0;
                            final h9t f2 = this.F0;
                            final long a = cqs.a(d0, n);
                            o = new cqs(a, f2.b(a));
                        }
                    }
                    else {
                        final mwj d2 = this.D0;
                        final h9t f3 = this.F0;
                        final long u = d2.u();
                        final boolean b = (d2.t() & 0x80) != 0x0;
                        List<k1r.b> emptyList = Collections.emptyList();
                        long a2;
                        boolean b6;
                        long n3;
                        int y;
                        int t4;
                        int t5;
                        boolean b8;
                        boolean b9;
                        boolean b10;
                        if (!b) {
                            final int t = d2.t();
                            final boolean b2 = (t & 0x80) != 0x0;
                            final boolean b3 = (t & 0x40) != 0x0;
                            final boolean b4 = (t & 0x20) != 0x0;
                            final boolean b5 = (t & 0x10) != 0x0;
                            if (b3 && !b5) {
                                a2 = cqs.a(d2, n);
                            }
                            else {
                                a2 = -9223372036854775807L;
                            }
                            if (!b3) {
                                final int t2 = d2.t();
                                emptyList = new ArrayList<k1r.b>(t2);
                                for (int i = 0; i < t2; ++i) {
                                    final int t3 = d2.t();
                                    long a3;
                                    if (!b5) {
                                        a3 = cqs.a(d2, n);
                                    }
                                    else {
                                        a3 = -9223372036854775807L;
                                    }
                                    ((ArrayList<k1r.b>)emptyList).add(new k1r.b(t3, a3, f3.b(a3), null));
                                }
                            }
                            if (b4) {
                                final long n2 = d2.t();
                                b6 = ((n2 & 0x80L) != 0x0L);
                                n3 = ((n2 & 0x1L) << 32 | d2.u()) * 1000L / 90L;
                            }
                            else {
                                b6 = false;
                                n3 = -9223372036854775807L;
                            }
                            y = d2.y();
                            t4 = d2.t();
                            t5 = d2.t();
                            final boolean b7 = b2;
                            b8 = b5;
                            b9 = b3;
                            b10 = b7;
                        }
                        else {
                            a2 = -9223372036854775807L;
                            b10 = false;
                            b9 = false;
                            b8 = false;
                            b6 = false;
                            n3 = -9223372036854775807L;
                            y = 0;
                            t4 = 0;
                            t5 = 0;
                        }
                        o = new k1r(u, b, b10, b9, b8, a2, f3.b(a2), emptyList, b6, n3, y, t4, t5);
                    }
                }
                else {
                    final mwj d3 = this.D0;
                    final int t6 = d3.t();
                    final ArrayList list = new ArrayList<m1r$c>(t6);
                    for (int j = 0; j < t6; ++j) {
                        final long u2 = d3.u();
                        final boolean b11 = (d3.t() & 0x80) != 0x0;
                        ArrayList<m1r$b> list2 = new ArrayList<m1r$b>();
                        boolean b12;
                        boolean b13;
                        boolean b15;
                        long n5;
                        long n6;
                        int n7;
                        int n8;
                        int n9;
                        if (!b11) {
                            final int t7 = d3.t();
                            b12 = ((t7 & 0x80) != 0x0);
                            b13 = ((t7 & 0x40) != 0x0);
                            final boolean b14 = (t7 & 0x20) != 0x0;
                            long u3;
                            if (b13) {
                                u3 = d3.u();
                            }
                            else {
                                u3 = -9223372036854775807L;
                            }
                            if (!b13) {
                                final int t8 = d3.t();
                                list2 = new ArrayList<m1r$b>(t8);
                                for (int k = 0; k < t8; ++k) {
                                    list2.add(new m1r$b(d3.t(), d3.u(), (m1r$a)null));
                                }
                            }
                            if (b14) {
                                final long n4 = d3.t();
                                b15 = ((n4 & 0x80L) != 0x0L);
                                n5 = ((n4 & 0x1L) << 32 | d3.u()) * 1000L / 90L;
                            }
                            else {
                                b15 = false;
                                n5 = -9223372036854775807L;
                            }
                            final int y2 = d3.y();
                            final int t9 = d3.t();
                            final int t10 = d3.t();
                            n6 = u3;
                            n7 = y2;
                            n8 = t9;
                            n9 = t10;
                        }
                        else {
                            b12 = false;
                            b13 = false;
                            n6 = -9223372036854775807L;
                            b15 = false;
                            n5 = -9223372036854775807L;
                            n7 = 0;
                            n8 = 0;
                            n9 = 0;
                        }
                        list.add(new m1r$c(u2, b11, b12, b13, (List)list2, n6, b15, n5, n7, n8, n9));
                    }
                    o = new m1r((List<m1r.m1r$c>)list);
                }
            }
            else {
                final mwj d4 = this.D0;
                final long u4 = d4.u();
                g -= 4;
                final byte[] array2 = new byte[g];
                d4.d(array2, 0, g);
                o = new e0l(u4, array2, n);
            }
        }
        else {
            o = new l1r();
        }
        x8h x8h;
        if (o == null) {
            x8h = new x8h(new x8h$b[0]);
        }
        else {
            x8h = new x8h(new x8h$b[] { (x8h$b)o });
        }
        return x8h;
    }
}
