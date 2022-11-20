// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.source;

import android.media.MediaCodec$CryptoInfo;
import java.util.Objects;
import java.util.Arrays;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.nio.ByteBuffer;

public final class n
{
    public final rx a;
    public final int b;
    public final rwj c;
    public a d;
    public a e;
    public a f;
    public long g;
    
    public n(final rx a) {
        this.a = a;
        final int b = ((hd8)a).b;
        this.b = b;
        this.c = new rwj(32);
        final a f = new a(0L, b);
        this.d = f;
        this.e = f;
        this.f = f;
    }
    
    public static a d(a d, long n, final ByteBuffer byteBuffer, int n2) {
        a d2;
        long n3;
        int i;
        while (true) {
            d2 = d;
            n3 = n;
            i = n2;
            if (n < d.b) {
                break;
            }
            d = d.d;
        }
        while (i > 0) {
            final int min = Math.min(i, (int)(d2.b - n3));
            byteBuffer.put(d2.c.a, d2.a(n3), min);
            n2 = i - min;
            n = (n3 += min);
            i = n2;
            if (n == d2.b) {
                d2 = d2.d;
                n3 = n;
                i = n2;
            }
        }
        return d2;
    }
    
    public static a e(a a, long n, final byte[] array, final int n2) {
        while (n >= a.b) {
            a = a.d;
        }
        int n3;
        long n4;
        for (int i = n2; i > 0; i = n3, n = n4) {
            final int min = Math.min(i, (int)(a.b - n));
            System.arraycopy(a.c.a, a.a(n), array, n2 - i, min);
            n3 = i - min;
            n4 = n + min;
            i = n3;
            n = n4;
            if (n4 == a.b) {
                a = a.d;
            }
        }
        return a;
    }
    
    public static a f(a a, final DecoderInputBuffer decoderInputBuffer, final o.a a2, final rwj rwj) {
        a a3 = a;
        if (decoderInputBuffer.u()) {
            final long b = a2.b;
            int y = 1;
            rwj.A(1);
            a = e(a, b, rwj.a, 1);
            final long n = b + 1L;
            final byte[] a4 = rwj.a;
            final int n2 = 0;
            final byte b2 = a4[0];
            final boolean b3 = (b2 & 0x80) != 0x0;
            final int n3 = b2 & 0x7F;
            final v67 e0 = decoderInputBuffer.E0;
            final byte[] a5 = e0.a;
            if (a5 == null) {
                e0.a = new byte[16];
            }
            else {
                Arrays.fill(a5, (byte)0);
            }
            final a e2 = e(a, n, e0.a, n3);
            long n5;
            final long n4 = n5 = n + n3;
            a = e2;
            if (b3) {
                rwj.A(2);
                a = e(e2, n4, rwj.a, 2);
                n5 = n4 + 2L;
                y = rwj.y();
            }
            final int[] d = e0.d;
            int[] array = null;
            Label_0215: {
                if (d != null) {
                    array = d;
                    if (d.length >= y) {
                        break Label_0215;
                    }
                }
                array = new int[y];
            }
            final int[] e3 = e0.e;
            int[] array2 = null;
            Label_0245: {
                if (e3 != null) {
                    array2 = e3;
                    if (e3.length >= y) {
                        break Label_0245;
                    }
                }
                array2 = new int[y];
            }
            if (b3) {
                final int n6 = y * 6;
                rwj.A(n6);
                final a e4 = e(a, n5, rwj.a, n6);
                final long n7 = n5 + n6;
                rwj.D(0);
                int n8 = n2;
                while (true) {
                    n5 = n7;
                    a = e4;
                    if (n8 >= y) {
                        break;
                    }
                    array[n8] = rwj.y();
                    array2[n8] = rwj.w();
                    ++n8;
                }
            }
            else {
                array2[array[0] = 0] = a2.a - (int)(n5 - a2.b);
            }
            final ewt.a c = a2.c;
            final int a6 = cnw.a;
            final byte[] b4 = c.b;
            final byte[] a7 = e0.a;
            final int a8 = c.a;
            final int c2 = c.c;
            final int d2 = c.d;
            e0.f = y;
            e0.d = array;
            e0.e = array2;
            e0.b = b4;
            e0.a = a7;
            e0.c = a8;
            e0.g = c2;
            e0.h = d2;
            final MediaCodec$CryptoInfo i = e0.i;
            i.numSubSamples = y;
            i.numBytesOfClearData = array;
            i.numBytesOfEncryptedData = array2;
            i.key = b4;
            i.iv = a7;
            i.mode = a8;
            if (cnw.a >= 24) {
                final v67$a j = e0.j;
                Objects.requireNonNull(j);
                v67$a.a(j, c2, d2);
            }
            final long b5 = a2.b;
            final int n9 = (int)(n5 - b5);
            a2.b = b5 + n9;
            a2.a -= n9;
            a3 = a;
        }
        if (((mq2)decoderInputBuffer).m()) {
            rwj.A(4);
            a = e(a3, a2.b, rwj.a, 4);
            final int w = rwj.w();
            a2.b += 4L;
            a2.a -= 4;
            decoderInputBuffer.s(w);
            final a d3 = d(a, a2.b, decoderInputBuffer.F0, w);
            a2.b += w;
            final int a9 = a2.a - w;
            a2.a = a9;
            final ByteBuffer i2 = decoderInputBuffer.I0;
            if (i2 != null && i2.capacity() >= a9) {
                decoderInputBuffer.I0.clear();
            }
            else {
                decoderInputBuffer.I0 = ByteBuffer.allocate(a9);
            }
            a = d(d3, a2.b, decoderInputBuffer.I0, a2.a);
        }
        else {
            decoderInputBuffer.s(a2.a);
            a = d(a3, a2.b, decoderInputBuffer.F0, a2.a);
        }
        return a;
    }
    
    public final void a(final a a) {
        if (a.c == null) {
            return;
        }
        final hd8 hd8 = (hd8)this.a;
        monitorenter(hd8);
        a a2 = a;
        while (true) {
            Label_0104: {
                if (a2 == null) {
                    break Label_0104;
                }
                try {
                    final qx[] f = hd8.f;
                    final int n = hd8.e++;
                    final qx c = a2.c;
                    Objects.requireNonNull(c);
                    f[n] = c;
                    --hd8.d;
                    final a d = a2.d;
                    if (d != null) {
                        a2 = d;
                        if (d.c != null) {
                            continue;
                        }
                    }
                    a2 = null;
                    continue;
                    hd8.notifyAll();
                    monitorexit(hd8);
                    a.c = null;
                    a.d = null;
                }
                finally {
                    monitorexit(hd8);
                }
            }
        }
    }
    
    public final void b(final long n) {
        if (n == -1L) {
            return;
        }
        a d;
        while (true) {
            d = this.d;
            if (n >= d.b) {
                final rx a = this.a;
                final qx c = d.c;
                Object d2 = a;
                synchronized (d2) {
                    ((hd8)d2).f[((hd8)d2).e++] = c;
                    --((hd8)d2).d;
                    d2.notifyAll();
                    monitorexit(d2);
                    final a d3 = this.d;
                    d3.c = null;
                    d2 = d3.d;
                    d3.d = null;
                    this.d = (a)d2;
                    continue;
                }
                break;
            }
            break;
        }
        if (this.e.a < d.a) {
            this.e = d;
        }
    }
    
    public final int c(final int n) {
        final a f = this.f;
        if (f.c == null) {
            Object d = this.a;
            synchronized (d) {
                final int d2 = ((hd8)d).d + 1;
                ((hd8)d).d = d2;
                int e = ((hd8)d).e;
                qx c;
                if (e > 0) {
                    final qx[] f2 = ((hd8)d).f;
                    --e;
                    ((hd8)d).e = e;
                    c = f2[e];
                    Objects.requireNonNull(c);
                    ((hd8)d).f[((hd8)d).e] = null;
                }
                else {
                    c = new qx(new byte[((hd8)d).b], 0);
                    final qx[] f3 = ((hd8)d).f;
                    if (d2 > f3.length) {
                        ((hd8)d).f = Arrays.copyOf(f3, f3.length * 2);
                    }
                }
                monitorexit(d);
                d = new a(this.f.b, this.b);
                f.c = c;
                f.d = (a)d;
            }
        }
        return Math.min(n, (int)(this.f.b - this.g));
    }
    
    public static final class a
    {
        public long a;
        public long b;
        public qx c;
        public a d;
        
        public a(final long a, final int n) {
            omy.k(this.c == null);
            this.a = a;
            this.b = a + n;
        }
        
        public final int a(final long n) {
            return (int)(n - this.a) + this.c.b;
        }
    }
}
