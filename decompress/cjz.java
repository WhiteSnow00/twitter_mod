import java.util.logging.Level;
import com.google.android.gms.internal.measurement.zzjh;
import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjz extends ijz
{
    public final byte[] M0;
    public final int N0;
    public int O0;
    
    public cjz(final byte[] m0, final int n0) {
        super((iuk)null);
        final int length = m0.length;
        if ((length - n0 | n0) >= 0) {
            this.M0 = m0;
            this.O0 = 0;
            this.N0 = n0;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", length, 0, n0));
    }
    
    public final void A(final int n, final oiz oiz) throws IOException {
        this.K(n << 3 | 0x2);
        this.K(oiz.i());
        oiz.n((hfe)this);
    }
    
    public final void B(final int n, final int n2) throws IOException {
        this.K(n << 3 | 0x5);
        this.C(n2);
    }
    
    public final void C(final int n) throws IOException {
        try {
            final byte[] m0 = this.M0;
            final int o0 = this.O0;
            final int o2 = o0 + 1;
            this.O0 = o2;
            m0[o0] = (byte)(n & 0xFF);
            final int o3 = o2 + 1;
            this.O0 = o3;
            m0[o2] = (byte)(n >> 8 & 0xFF);
            final int o4 = o3 + 1;
            this.O0 = o4;
            m0[o3] = (byte)(n >> 16 & 0xFF);
            this.O0 = o4 + 1;
            m0[o4] = (byte)(n >> 24 & 0xFF);
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.O0, this.N0, 1), (Throwable)ex);
        }
    }
    
    public final void D(final int n, final long n2) throws IOException {
        this.K(n << 3 | 0x1);
        this.E(n2);
    }
    
    public final void E(final long n) throws IOException {
        try {
            final byte[] m0 = this.M0;
            final int o0 = this.O0;
            final int o2 = o0 + 1;
            this.O0 = o2;
            m0[o0] = (byte)((int)n & 0xFF);
            final int o3 = o2 + 1;
            this.O0 = o3;
            m0[o2] = (byte)((int)(n >> 8) & 0xFF);
            final int o4 = o3 + 1;
            this.O0 = o4;
            m0[o3] = (byte)((int)(n >> 16) & 0xFF);
            final int o5 = o4 + 1;
            this.O0 = o5;
            m0[o4] = (byte)((int)(n >> 24) & 0xFF);
            final int o6 = o5 + 1;
            this.O0 = o6;
            m0[o5] = (byte)((int)(n >> 32) & 0xFF);
            final int o7 = o6 + 1;
            this.O0 = o7;
            m0[o6] = (byte)((int)(n >> 40) & 0xFF);
            final int o8 = o7 + 1;
            this.O0 = o8;
            m0[o7] = (byte)((int)(n >> 48) & 0xFF);
            this.O0 = o8 + 1;
            m0[o8] = (byte)((int)(n >> 56) & 0xFF);
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.O0, this.N0, 1), (Throwable)ex);
        }
    }
    
    public final void F(final int n, final int n2) throws IOException {
        this.K(n << 3);
        this.G(n2);
    }
    
    public final void G(final int n) throws IOException {
        if (n >= 0) {
            this.K(n);
            return;
        }
        this.M(n);
    }
    
    public final void H(int n, final String s) throws IOException {
        this.K(n << 3 | 0x2);
        n = this.O0;
        byte[] array;
        try {
            final int w = ijz.w(s.length() * 3);
            final int w2 = ijz.w(s.length());
            if (w2 == w) {
                final int o0 = n + w2;
                this.O0 = o0;
                final int b = ctz.b((CharSequence)s, this.M0, o0, this.N0 - o0);
                this.K(b - (this.O0 = n) - w2);
                this.O0 = b;
                return;
            }
            this.K(ctz.c((CharSequence)s));
            final byte[] m0 = this.M0;
            final int o2 = this.O0;
            this.O0 = ctz.b((CharSequence)s, m0, o2, this.N0 - o2);
            return;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh((Throwable)ex);
        }
        catch (final ksz ksz) {
            this.O0 = n;
            ijz.K0.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable)ksz);
            final byte[] bytes;
            array = (bytes = s.getBytes(tmz.a));
            n = bytes.length;
            final cjz cjz = this;
            final int n2 = n;
            cjz.K(n2);
            final cjz cjz2 = this;
            final byte[] array2 = array;
            final int n3 = n;
            cjz2.T(array2, n3);
        }
        try {
            final byte[] bytes = array;
            n = bytes.length;
            final cjz cjz = this;
            final int n2 = n;
            cjz.K(n2);
            final cjz cjz2 = this;
            final byte[] array2 = array;
            final int n3 = n;
            cjz2.T(array2, n3);
        }
        catch (final IndexOutOfBoundsException ex2) {
            throw new zzjh((Throwable)ex2);
        }
    }
    
    public final void I(final int n, final int n2) throws IOException {
        this.K(n << 3 | n2);
    }
    
    public final void J(final int n, final int n2) throws IOException {
        this.K(n << 3);
        this.K(n2);
    }
    
    public final void K(int n) throws IOException {
        while (true) {
            Label_0030: {
                if ((n & 0xFFFFFF80) != 0x0) {
                    break Label_0030;
                }
                try {
                    this.M0[this.O0++] = (byte)n;
                    return;
                    this.M0[this.O0++] = (byte)((n & 0x7F) | 0x80);
                    n >>>= 7;
                }
                catch (final IndexOutOfBoundsException ex) {
                    throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.O0, this.N0, 1), (Throwable)ex);
                }
            }
        }
    }
    
    public final void L(final int n, final long n2) throws IOException {
        this.K(n << 3);
        this.M(n2);
    }
    
    public final void M(long n) throws IOException {
        long n2 = n;
        if (ijz.L0) {
            n2 = n;
            if (this.N0 - this.O0 >= 10) {
                while ((n & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                    hsz.c.d((Object)this.M0, hsz.f + this.O0++, (byte)(((int)n & 0x7F) | 0x80));
                    n >>>= 7;
                }
                hsz.c.d((Object)this.M0, hsz.f + this.O0++, (byte)n);
                return;
            }
        }
        while (true) {
            Label_0181: {
                if ((n2 & 0xFFFFFFFFFFFFFF80L) != 0x0L) {
                    break Label_0181;
                }
                try {
                    this.M0[this.O0++] = (byte)n2;
                    return;
                    this.M0[this.O0++] = (byte)(((int)n2 & 0x7F) | 0x80);
                    n2 >>>= 7;
                }
                catch (final IndexOutOfBoundsException ex) {
                    throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.O0, this.N0, 1), (Throwable)ex);
                }
            }
        }
    }
    
    public final void T(final byte[] array, final int n) throws IOException {
        try {
            System.arraycopy(array, 0, this.M0, this.O0, n);
            this.O0 += n;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.O0, this.N0, n), (Throwable)ex);
        }
    }
    
    public final void y(final byte b) throws IOException {
        try {
            this.M0[this.O0++] = b;
        }
        catch (final IndexOutOfBoundsException ex) {
            throw new zzjh(String.format("Pos: %d, limit: %d, len: %d", this.O0, this.N0, 1), (Throwable)ex);
        }
    }
    
    public final void z(final int n, final boolean b) throws IOException {
        this.K(n << 3);
        this.y((byte)(b ? 1 : 0));
    }
}
