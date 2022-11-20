import java.util.logging.Level;
import java.io.IOException;
import com.google.android.gms.internal.measurement.zzjh;

// 
// Decompiled by Procyon v0.6.0
// 

public final class diz extends jiz
{
    public final byte[] Z0;
    public final int a1;
    public int b1;
    
    public diz(final byte[] z0, final int a1) {
        super((wd)null);
        final int length = z0.length;
        if ((length - a1 | a1) >= 0) {
            this.Z0 = z0;
            this.b1 = 0;
            this.a1 = a1;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", length, 0, a1));
    }
    
    public final void a1(final byte b) throws IOException {
        try {
            this.Z0[this.b1++] = b;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.b1, this.a1, 1), (Throwable)ex);
        }
    }
    
    public final void b1(final int n, final boolean b) throws IOException {
        this.m1(n << 3);
        this.a1((byte)(b ? 1 : 0));
    }
    
    public final void c1(final int n, final phz phz) throws IOException {
        this.m1(n << 3 | 0x2);
        this.m1(phz.i());
        phz.n((rp9)this);
    }
    
    public final void d1(final int n, final int n2) throws IOException {
        this.m1(n << 3 | 0x5);
        this.e1(n2);
    }
    
    public final void e1(final int n) throws IOException {
        try {
            final byte[] z0 = this.Z0;
            final int b1 = this.b1;
            final int b2 = b1 + 1;
            this.b1 = b2;
            z0[b1] = (byte)(n & 0xFF);
            final int b3 = b2 + 1;
            this.b1 = b3;
            z0[b2] = (byte)(n >> 8 & 0xFF);
            final int b4 = b3 + 1;
            this.b1 = b4;
            z0[b3] = (byte)(n >> 16 & 0xFF);
            this.b1 = b4 + 1;
            z0[b4] = (byte)(n >> 24 & 0xFF);
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.b1, this.a1, 1), (Throwable)ex);
        }
    }
    
    public final void f1(final int n, final long n2) throws IOException {
        this.m1(n << 3 | 0x1);
        this.g1(n2);
    }
    
    public final void g1(final long n) throws IOException {
        try {
            final byte[] z0 = this.Z0;
            final int b1 = this.b1;
            final int b2 = b1 + 1;
            this.b1 = b2;
            z0[b1] = (byte)((int)n & 0xFF);
            final int b3 = b2 + 1;
            this.b1 = b3;
            z0[b2] = (byte)((int)(n >> 8) & 0xFF);
            final int b4 = b3 + 1;
            this.b1 = b4;
            z0[b3] = (byte)((int)(n >> 16) & 0xFF);
            final int b5 = b4 + 1;
            this.b1 = b5;
            z0[b4] = (byte)((int)(n >> 24) & 0xFF);
            final int b6 = b5 + 1;
            this.b1 = b6;
            z0[b5] = (byte)((int)(n >> 32) & 0xFF);
            final int b7 = b6 + 1;
            this.b1 = b7;
            z0[b6] = (byte)((int)(n >> 40) & 0xFF);
            final int b8 = b7 + 1;
            this.b1 = b8;
            z0[b7] = (byte)((int)(n >> 48) & 0xFF);
            this.b1 = b8 + 1;
            z0[b8] = (byte)((int)(n >> 56) & 0xFF);
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.b1, this.a1, 1), (Throwable)ex);
        }
    }
    
    public final void h1(final int n, final int n2) throws IOException {
        this.m1(n << 3);
        this.i1(n2);
    }
    
    public final void i1(final int n) throws IOException {
        if (n >= 0) {
            this.m1(n);
            return;
        }
        this.o1(n);
    }
    
    public final void j1(int n, final String s) throws IOException {
        this.m1(n << 3 | 0x2);
        n = this.b1;
        byte[] array;
        try {
            final int y0 = jiz.Y0(s.length() * 3);
            final int y2 = jiz.Y0(s.length());
            if (y2 == y0) {
                final int b1 = n + y2;
                this.b1 = b1;
                final int b2 = dsz.b(s, this.Z0, b1, this.a1 - b1);
                this.m1(b2 - (this.b1 = n) - y2);
                this.b1 = b2;
                return;
            }
            this.m1(dsz.c(s));
            final byte[] z0 = this.Z0;
            final int b3 = this.b1;
            this.b1 = dsz.b(s, z0, b3, this.a1 - b3);
            return;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh((Throwable)ex);
        }
        catch (final lrz lrz) {
            this.b1 = n;
            jiz.X0.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)lrz);
            final byte[] bytes;
            array = (bytes = s.getBytes(ulz.a));
            n = bytes.length;
            final diz diz = this;
            final int n2 = n;
            diz.m1(n2);
            final diz diz2 = this;
            final byte[] array2 = array;
            final int n3 = n;
            diz2.v1(array2, n3);
        }
        try {
            final byte[] bytes = array;
            n = bytes.length;
            final diz diz = this;
            final int n2 = n;
            diz.m1(n2);
            final diz diz2 = this;
            final byte[] array2 = array;
            final int n3 = n;
            diz2.v1(array2, n3);
        }
        catch (final IndexOutOfBoundsException ex2) {
            throw new zzjh((Throwable)ex2);
        }
    }
    
    public final void k1(final int n, final int n2) throws IOException {
        this.m1(n << 3 | n2);
    }
    
    public final void l1(final int n, final int n2) throws IOException {
        this.m1(n << 3);
        this.m1(n2);
    }
    
    public final void m1(int n) throws IOException {
        while (true) {
            Label_0030: {
                if ((n & 0xFFFFFF80) != 0x0) {
                    break Label_0030;
                }
                try {
                    this.Z0[this.b1++] = (byte)n;
                    return;
                    this.Z0[this.b1++] = (byte)((n & 0x7F) | 0x80);
                    n >>>= 7;
                }
                catch (final IndexOutOfBoundsException ex) {
                    throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.b1, this.a1, 1), (Throwable)ex);
                }
            }
        }
    }
    
    public final void n1(final int n, final long n2) throws IOException {
        this.m1(n << 3);
        this.o1(n2);
    }
    
    public final void o1(long n) throws IOException {
        long n2 = n;
        if (jiz.Y0) {
            n2 = n;
            if (this.a1 - this.b1 >= 10) {
                while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                    irz.c.d((Object)this.Z0, irz.f + this.b1++, (byte)(((int)n & 0x7F) | 0x80));
                    n >>>= 7;
                }
                irz.c.d((Object)this.Z0, irz.f + this.b1++, (byte)n);
                return;
            }
        }
        while (true) {
            Label_0181: {
                if ((n2 & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                    break Label_0181;
                }
                try {
                    this.Z0[this.b1++] = (byte)n2;
                    return;
                    this.Z0[this.b1++] = (byte)(((int)n2 & 0x7F) | 0x80);
                    n2 >>>= 7;
                }
                catch (final IndexOutOfBoundsException ex) {
                    throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.b1, this.a1, 1), (Throwable)ex);
                }
            }
        }
    }
    
    public final void v1(final byte[] array, final int n) throws IOException {
        try {
            System.arraycopy(array, 0, this.Z0, this.b1, n);
            this.b1 += n;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.b1, this.a1, n), (Throwable)ex);
        }
    }
}
