import java.util.Arrays;
import java.io.IOException;
import java.io.EOFException;
import com.google.android.exoplayer2.n;
import com.google.android.exoplayer2.n$a;
import com.google.android.exoplayer2.ParserException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mz implements qoa
{
    public static final int[] p;
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public final byte[] a;
    public final int b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public long k;
    public voa l;
    public vwt m;
    public qcp n;
    public boolean o;
    
    static {
        p = new int[] { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
        final int[] array;
        final int[] q2 = array = new int[16];
        array[0] = 18;
        array[1] = 24;
        array[2] = 33;
        array[3] = 37;
        array[4] = 41;
        array[5] = 47;
        array[6] = 51;
        array[7] = 59;
        array[8] = 61;
        array[9] = 6;
        array[11] = (array[10] = 1);
        array[13] = (array[12] = 1);
        array[15] = (array[14] = 1);
        q = q2;
        r = rnw.C("#!AMR\n");
        s = rnw.C("#!AMR-WB\n");
        t = q2[8];
    }
    
    public mz() {
        this.b = 0;
        this.a = new byte[1];
        this.i = -1;
    }
    
    public mz(final int n) {
        this.b = 0;
        this.a = new byte[1];
        this.i = -1;
    }
    
    public final int a(roa roa, final lsk lsk) throws IOException {
        omi.r((Object)this.m);
        final int a = rnw.a;
        if (roa.getPosition() == 0L && !this.e(roa)) {
            throw ParserException.a("Could not find AMR header.", (Throwable)null);
        }
        if (!this.o) {
            this.o = true;
            final boolean c = this.c;
            String k;
            if (c) {
                k = "audio/amr-wb";
            }
            else {
                k = "audio/3gpp";
            }
            int y;
            if (c) {
                y = 16000;
            }
            else {
                y = 8000;
            }
            final vwt m = this.m;
            final n$a n$a = new n$a();
            n$a.k = k;
            n$a.l = mz.t;
            n$a.x = 1;
            n$a.y = y;
            m.e(new n(n$a));
        }
        Label_0216: {
            if (this.f != 0) {
                break Label_0216;
            }
            while (true) {
                try {
                    final int d = this.d(roa);
                    this.e = d;
                    this.f = d;
                    if (this.i == -1) {
                        this.h = roa.getPosition();
                        this.i = this.e;
                    }
                    if (this.i == this.e) {
                        ++this.j;
                    }
                    final int c2 = this.m.c((k88)roa, this.f, true);
                    int n;
                    if (c2 == -1) {
                        n = -1;
                    }
                    else {
                        if ((this.f -= c2) <= 0) {
                            this.m.b(this.k + this.d, 1, this.e, 0, (vwt$a)null);
                            this.d += 20000L;
                        }
                        n = 0;
                    }
                    final long length = roa.getLength();
                    if (!this.g) {
                        final int b = this.b;
                        if ((b & 0x1) != 0x0 && length != -1L) {
                            final int i = this.i;
                            if (i == -1 || i == this.e) {
                                if (this.j >= 20 || n == -1) {
                                    roa = (roa)new zi6(length, this.h, (int)(i * 8 * 1000000L / 20000L), i, (b & 0x2) != 0x0);
                                    this.n = (qcp)roa;
                                    this.l.l((qcp)roa);
                                    this.g = true;
                                    return n;
                                }
                                return n;
                            }
                        }
                        roa = (roa)new qcp.b(-9223372036854775807L);
                        this.n = (qcp)roa;
                        this.l.l((qcp)roa);
                        this.g = true;
                    }
                    return n;
                }
                catch (final EOFException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final boolean b(final roa roa) throws IOException {
        return this.e(roa);
    }
    
    public final void c(final long n, final long n2) {
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        if (n != 0L) {
            final qcp n3 = this.n;
            if (n3 instanceof zi6) {
                this.k = ((zi6)n3).a(n);
                return;
            }
        }
        this.k = 0L;
    }
    
    public final int d(final roa roa) throws IOException {
        roa.e();
        final byte[] a = this.a;
        final boolean b = false;
        roa.n(a, 0, 1);
        final byte b2 = this.a[0];
        if ((b2 & 0x83) > 0) {
            final StringBuilder sb = new StringBuilder(42);
            sb.append("Invalid padding bits for frame header ");
            sb.append(b2);
            throw ParserException.a(sb.toString(), (Throwable)null);
        }
        final int n = b2 >> 3 & 0xF;
        int n2 = b ? 1 : 0;
        Label_0137: {
            if (n >= 0) {
                n2 = (b ? 1 : 0);
                if (n <= 15) {
                    final boolean c = this.c;
                    if (!c || (n >= 10 && n <= 13)) {
                        final boolean b3 = !c && (n < 12 || n > 14);
                        n2 = (b ? 1 : 0);
                        if (!b3) {
                            break Label_0137;
                        }
                    }
                    n2 = 1;
                }
            }
        }
        if (n2 == 0) {
            String s;
            if (this.c) {
                s = "WB";
            }
            else {
                s = "NB";
            }
            final StringBuilder sb2 = new StringBuilder(s.length() + 35);
            sb2.append("Illegal AMR ");
            sb2.append(s);
            sb2.append(" frame type ");
            sb2.append(n);
            throw ParserException.a(sb2.toString(), (Throwable)null);
        }
        int n3;
        if (this.c) {
            n3 = mz.q[n];
        }
        else {
            n3 = mz.p[n];
        }
        return n3;
    }
    
    public final boolean e(final roa roa) throws IOException {
        final byte[] r = mz.r;
        roa.e();
        final byte[] array = new byte[r.length];
        roa.n(array, 0, r.length);
        if (Arrays.equals(array, r)) {
            this.c = false;
            roa.k(r.length);
            return true;
        }
        final byte[] s = mz.s;
        roa.e();
        final byte[] array2 = new byte[s.length];
        roa.n(array2, 0, s.length);
        if (Arrays.equals(array2, s)) {
            this.c = true;
            roa.k(s.length);
            return true;
        }
        return false;
    }
    
    public final void i(final voa l) {
        this.l = l;
        this.m = l.r(0, 1);
        l.p();
    }
    
    public final void release() {
    }
}
